package com.google.cardboard.sdk.qrcode;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import com.google.cardboard.sdk.deviceparams.CardboardV1DeviceParams;
import defpackage.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CardboardParamsUtils {
    private static final String CARDBOARD_CONFIG_FOLDER = "Cardboard";
    private static final String CARDBOARD_DEVICE_PARAMS_FILE = "current_device_params";
    private static final int CARDBOARD_DEVICE_PARAMS_STREAM_SENTINEL = 894990891;
    private static final String HTTPS_SCHEME_PREFIX = "https://";
    private static final int HTTPS_TIMEOUT_MS = 5000;
    private static final String HTTP_SCHEME = "http";
    private static final String HTTP_SCHEME_PREFIX = "http://";
    private static final int MAX_REDIRECTS = 5;
    private static final String TAG = "CardboardParamsUtils";
    private static final int URI_CODING_PARAMS = 11;
    private static final String URI_HOST_GOOGLE = "google.com";
    private static final String URI_KEY_PARAMS = "p";
    private static final String URI_PATH_CARDBOARD_CONFIG = "cardboard/cfg";
    private static final String HTTPS_SCHEME = "https";
    private static final String URI_HOST_GOOGLE_SHORT = "g.co";
    private static final String URI_PATH_CARDBOARD_HOME = "cardboard";
    private static final Uri URI_ORIGINAL_CARDBOARD_QR_CODE = new Uri.Builder().scheme(HTTPS_SCHEME).authority(URI_HOST_GOOGLE_SHORT).appendEncodedPath(URI_PATH_CARDBOARD_HOME).build();

    /* JADX INFO: compiled from: PG */
    enum StorageSource {
        SCOPED_STORAGE,
        EXTERNAL_STORAGE
    }

    /* JADX INFO: compiled from: PG */
    public class UriToParamsStatus {
        public static final int STATUS_CONNECTION_ERROR = 2;
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_FORMAT = 1;
        public final byte[] params;
        public final int statusCode;

        private UriToParamsStatus(int i, byte[] bArr) {
            this.statusCode = i;
            this.params = bArr;
        }

        public static UriToParamsStatus error(int i) {
            return new UriToParamsStatus(i, null);
        }

        public static UriToParamsStatus success(byte[] bArr) {
            return new UriToParamsStatus(0, bArr);
        }
    }

    private static byte[] createFromUri(Uri uri) {
        if (uri != null) {
            if (isOriginalCardboardDeviceUri(uri)) {
                return CardboardV1DeviceParams.build().toByteArray();
            }
            if (isCardboardDeviceUri(uri)) {
                return readDeviceParamsFromUri(uri);
            }
            Log.w(TAG, String.format("URI \"%s\" not recognized as Cardboard viewer.", uri));
        }
        return null;
    }

    private static Uri followCardboardParamRedirect(Uri uri, int i, UrlFactory urlFactory) throws IOException {
        int i2 = 0;
        while (uri != null && !isCardboardUri(uri)) {
            if (i2 >= i) {
                return null;
            }
            uri = resolveHttpsRedirect(uri, urlFactory);
            i2++;
        }
        return uri;
    }

    private static File getDeviceParamsFile(StorageSource storageSource, Context context) {
        File file = new File(storageSource == StorageSource.SCOPED_STORAGE ? context.getFilesDir() : Environment.getExternalStorageDirectory(), CARDBOARD_CONFIG_FOLDER);
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            throw new IllegalStateException(file.toString().concat(" already exists as a file, but is expected to be a directory."));
        }
        return new File(file, CARDBOARD_DEVICE_PARAMS_FILE);
    }

    public static UriToParamsStatus getParamsFromUriString(String str, UrlFactory urlFactory) {
        Uri uri = Uri.parse(str);
        if (uri == null) {
            Log.e(TAG, "Error when parsing URI: null");
            return UriToParamsStatus.error(1);
        }
        if (uri.getScheme() == null) {
            uri = Uri.parse(HTTPS_SCHEME_PREFIX.concat(uri.toString()));
        } else if (uri.getScheme().equals(HTTP_SCHEME)) {
            uri = Uri.parse(uri.toString().replaceFirst(HTTP_SCHEME_PREFIX, HTTPS_SCHEME_PREFIX));
        }
        try {
            String.valueOf(uri);
            Uri uriFollowCardboardParamRedirect = followCardboardParamRedirect(uri, 5, urlFactory);
            if (uriFollowCardboardParamRedirect == null) {
                Log.e(TAG, "Error when following URI redirects");
                return UriToParamsStatus.error(1);
            }
            byte[] bArrCreateFromUri = createFromUri(uriFollowCardboardParamRedirect);
            if (bArrCreateFromUri != null) {
                return UriToParamsStatus.success(bArrCreateFromUri);
            }
            Log.e(TAG, "Error when parsing device parameters from URI query string: ".concat(uriFollowCardboardParamRedirect.toString()));
            return UriToParamsStatus.error(1);
        } catch (IOException e) {
            Log.w(TAG, "Error while following URL redirect ".concat(e.toString()));
            return UriToParamsStatus.error(2);
        }
    }

    private static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    private static boolean isCardboardDeviceUri(Uri uri) {
        return HTTPS_SCHEME.equals(uri.getScheme()) && URI_HOST_GOOGLE.equals(uri.getAuthority()) && "/cardboard/cfg".equals(uri.getPath());
    }

    private static boolean isCardboardUri(Uri uri) {
        return isOriginalCardboardDeviceUri(uri) || isCardboardDeviceUri(uri);
    }

    private static boolean isOriginalCardboardDeviceUri(Uri uri) {
        return URI_ORIGINAL_CARDBOARD_QR_CODE.equals(uri);
    }

    public static byte[] readDeviceParams(Context context) throws Throwable {
        if (!isAtLeastQ()) {
            return readDeviceParamsFromStorage(StorageSource.EXTERNAL_STORAGE, context);
        }
        byte[] deviceParamsFromStorage = readDeviceParamsFromStorage(StorageSource.EXTERNAL_STORAGE, context);
        byte[] deviceParamsFromStorage2 = readDeviceParamsFromStorage(StorageSource.SCOPED_STORAGE, context);
        if (deviceParamsFromStorage == null || deviceParamsFromStorage2 != null) {
            return deviceParamsFromStorage2;
        }
        if (!writeDeviceParamsToStorage(deviceParamsFromStorage, StorageSource.SCOPED_STORAGE, context)) {
            Log.e(TAG, "Error writing device parameters to scoped storage.");
        }
        return deviceParamsFromStorage;
    }

    private static byte[] readDeviceParamsFromInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                if (inputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length) == -1) {
                    Log.e(TAG, "Error parsing param record: end of stream.");
                } else {
                    int i = byteBufferAllocate.getInt();
                    int i2 = byteBufferAllocate.getInt();
                    if (i != CARDBOARD_DEVICE_PARAMS_STREAM_SENTINEL) {
                        Log.e(TAG, "Error parsing param record: incorrect sentinel.");
                    } else {
                        byte[] bArr = new byte[i2];
                        if (inputStream.read(bArr, 0, i2) != -1) {
                            return bArr;
                        }
                        Log.e(TAG, "Error parsing param record: end of stream.");
                    }
                }
            } catch (IOException e) {
                Log.w(TAG, "Error reading parameters: ".concat(e.toString()));
            }
        }
        return null;
    }

    private static byte[] readDeviceParamsFromStorage(StorageSource storageSource, Context context) throws Throwable {
        Throwable th;
        InputStream inputStream;
        byte[] deviceParamsFromInputStream = null;
        try {
            try {
                inputStream = InputStreamProvider.get(getDeviceParamsFile(storageSource, context));
                try {
                    deviceParamsFromInputStream = readDeviceParamsFromInputStream(inputStream);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (FileNotFoundException e) {
            e.toString();
        } catch (IllegalStateException e2) {
            Log.w(TAG, "Error reading parameters: ".concat(e2.toString()));
        }
        return deviceParamsFromInputStream;
    }

    private static byte[] readDeviceParamsFromUri(Uri uri) {
        String queryParameter = uri.getQueryParameter(URI_KEY_PARAMS);
        if (queryParameter == null) {
            Log.w(TAG, "No Cardboard parameters in URI.");
        } else {
            try {
                return Base64.decode(queryParameter, 11);
            } catch (Exception e) {
                Log.w(TAG, "Parsing Cardboard parameters from URI failed: ".concat(e.toString()));
            }
        }
        return null;
    }

    private static Uri resolveHttpsRedirect(Uri uri, UrlFactory urlFactory) throws IOException {
        String headerField;
        Uri uri2;
        HttpURLConnection httpURLConnectionOpenHttpsConnection = urlFactory.openHttpsConnection(uri);
        Uri uri3 = null;
        if (httpURLConnectionOpenHttpsConnection != null) {
            httpURLConnectionOpenHttpsConnection.setInstanceFollowRedirects(false);
            httpURLConnectionOpenHttpsConnection.setDoInput(false);
            httpURLConnectionOpenHttpsConnection.setConnectTimeout(HTTPS_TIMEOUT_MS);
            httpURLConnectionOpenHttpsConnection.setReadTimeout(HTTPS_TIMEOUT_MS);
            httpURLConnectionOpenHttpsConnection.setRequestProperty("Accept-Encoding", "");
            try {
                httpURLConnectionOpenHttpsConnection.setRequestMethod("HEAD");
                try {
                    httpURLConnectionOpenHttpsConnection.connect();
                    int responseCode = httpURLConnectionOpenHttpsConnection.getResponseCode();
                    if ((responseCode == 301 || responseCode == 302) && (headerField = httpURLConnectionOpenHttpsConnection.getHeaderField("Location")) != null && (uri2 = Uri.parse(headerField.replaceFirst(HTTP_SCHEME_PREFIX, HTTPS_SCHEME_PREFIX))) != null && uri2.compareTo(uri) != 0) {
                        uri2.toString();
                        uri3 = uri2;
                    }
                } finally {
                    httpURLConnectionOpenHttpsConnection.disconnect();
                }
            } catch (ProtocolException e) {
                Log.w(TAG, e.toString());
            }
        }
        return uri3;
    }

    public static void saveCardboardV1DeviceParams(Context context) {
        writeDeviceParams(CardboardV1DeviceParams.build().toByteArray(), context);
    }

    public static void saveParamsFromUri(byte[] bArr, Context context) {
        String str = new String(bArr);
        UriToParamsStatus paramsFromUriString = getParamsFromUriString(str, new UrlFactory());
        if (paramsFromUriString.statusCode == 0) {
            writeDeviceParams(paramsFromUriString.params, context);
        } else {
            Log.e(TAG, "Error when trying to get the Cardboard device params from URI: ".concat(str));
        }
    }

    public static boolean writeDeviceParams(byte[] bArr, Context context) {
        return writeDeviceParamsToStorage(bArr, isAtLeastQ() ? StorageSource.SCOPED_STORAGE : StorageSource.EXTERNAL_STORAGE, context);
    }

    private static boolean writeDeviceParamsToOutputStream(byte[] bArr, OutputStream outputStream) {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(CARDBOARD_DEVICE_PARAMS_STREAM_SENTINEL);
            byteBufferAllocate.putInt(bArr.length);
            outputStream.write(byteBufferAllocate.array());
            outputStream.write(bArr);
            return true;
        } catch (IOException e) {
            Log.w(TAG, "Error writing parameters: ".concat(e.toString()));
            return false;
        }
    }

    private static boolean writeDeviceParamsToStorage(byte[] bArr, StorageSource storageSource, Context context) {
        boolean zWriteDeviceParamsToOutputStream = false;
        OutputStream outputStream = null;
        try {
            try {
                outputStream = OutputStreamProvider.get(getDeviceParamsFile(storageSource, context));
                zWriteDeviceParamsToOutputStream = writeDeviceParamsToOutputStream(bArr, outputStream);
            } catch (FileNotFoundException e) {
                Log.e(TAG, a.co(e, "Parameters file not found for writing: "));
            } catch (IllegalStateException e2) {
                Log.w(TAG, a.co(e2, "Error writing parameters: "));
            }
            return zWriteDeviceParamsToOutputStream;
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
