package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahsh {
    private static final Pattern a = Pattern.compile("[0-9]+s");
    private static final Charset b = Charset.forName("UTF-8");
    private final Context c;
    private final ahrs d;
    private final ahsj e = new ahsj();

    public ahsh(Context context, ahrs ahrsVar) {
        this.c = context;
        this.d = ahrsVar;
    }

    static long a(String str) {
        kro.d(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private final HttpURLConnection d(URL url, String str) throws ahrx {
        MessageDigest messageDigestA;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.c.getPackageName());
            ahrc ahrcVar = (ahrc) this.d.a();
            if (ahrcVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) mda.n(ahrcVar.a()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            String string = null;
            try {
                Context context = this.c;
                String packageName = context.getPackageName();
                int i = ksq.a;
                PackageInfo packageInfoG = kte.b(context).g(packageName, 64);
                byte[] bArrDigest = (packageInfoG.signatures == null || packageInfoG.signatures.length != 1 || (messageDigestA = ksq.a("SHA1")) == null) ? null : messageDigestA.digest(packageInfoG.signatures[0].toByteArray());
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    char[] cArr = ksv.a;
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length << 1);
                    for (int i2 = 0; i2 < length; i2++) {
                        char[] cArr2 = ksv.a;
                        sb.append(cArr2[(bArrDigest[i2] & 240) >>> 4]);
                        sb.append(cArr2[bArrDigest[i2] & 15]);
                    }
                    string = sb.toString();
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("ContentValues", "No such package: ".concat(String.valueOf(this.c.getPackageName())), e3);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new ahrx("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    private static void e(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, b));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, TextUtils.isEmpty(str) ? "" : ", ".concat(String.valueOf(str))));
    }

    private static void f(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static boolean g(int i) {
        return i >= 200 && i < 300;
    }

    private static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static final URL i(String str) throws ahrx {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new ahrx(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final ahsi b(String str, String str2, String str3, String str4, String str5) throws ahrx {
        ahsi ahsiVar;
        InputStream inputStream;
        ahsh ahshVar = this;
        if (!ahshVar.e.b()) {
            throw new ahrx("Firebase Installations Service is unavailable. Please try again later.");
        }
        ?? r8 = 1;
        int i = 0;
        URL urlI = i(String.format("projects/%s/installations", str3));
        while (i <= r8) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionD = ahshVar.d(urlI, str);
            try {
                try {
                    httpURLConnectionD.setRequestMethod("POST");
                    httpURLConnectionD.setDoOutput(r8);
                    if (str5 != null) {
                        httpURLConnectionD.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("fid", str2);
                        jSONObject.put("appId", str4);
                        jSONObject.put("authVersion", "FIS_v2");
                        jSONObject.put("sdkVersion", "a:19.1.1_1p");
                        f(httpURLConnectionD, h(jSONObject));
                        int responseCode = httpURLConnectionD.getResponseCode();
                        ahshVar.e.a(responseCode);
                        if (g(responseCode)) {
                            InputStream inputStream2 = httpURLConnectionD.getInputStream();
                            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream2, b));
                            ahsk ahskVarA = ahsl.a();
                            jsonReader.beginObject();
                            String strNextString = null;
                            String strNextString2 = null;
                            String strNextString3 = null;
                            ahsl ahslVarA = null;
                            while (jsonReader.hasNext()) {
                                String strNextName = jsonReader.nextName();
                                if (strNextName.equals("name")) {
                                    strNextString = jsonReader.nextString();
                                } else if (strNextName.equals("fid")) {
                                    strNextString2 = jsonReader.nextString();
                                } else if (strNextName.equals("refreshToken")) {
                                    strNextString3 = jsonReader.nextString();
                                } else {
                                    if (strNextName.equals("authToken")) {
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            String strNextName2 = jsonReader.nextName();
                                            if (strNextName2.equals("token")) {
                                                ahskVarA.b = jsonReader.nextString();
                                            } else {
                                                if (strNextName2.equals("expiresIn")) {
                                                    ahskVarA.b(a(jsonReader.nextString()));
                                                } else {
                                                    jsonReader.skipValue();
                                                }
                                                inputStream2 = inputStream2;
                                            }
                                        }
                                        inputStream = inputStream2;
                                        ahslVarA = ahskVarA.a();
                                        jsonReader.endObject();
                                    } else {
                                        inputStream = inputStream2;
                                        jsonReader.skipValue();
                                    }
                                    inputStream2 = inputStream;
                                }
                            }
                            jsonReader.endObject();
                            jsonReader.close();
                            inputStream2.close();
                            ahsiVar = new ahsi(strNextString, strNextString2, strNextString3, ahslVarA, 1);
                        } else {
                            e(httpURLConnectionD, str4, str, str3);
                            if (responseCode == 429) {
                                throw new ahrx("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                ahsiVar = new ahsi(null, null, null, null, 2);
                            } else {
                                httpURLConnectionD.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i++;
                                r8 = 1;
                                ahshVar = this;
                            }
                        }
                        httpURLConnectionD.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return ahsiVar;
                    } catch (JSONException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionD.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new ahrx("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final ahsl c(String str, String str2, String str3, String str4) throws ahrx {
        ahsl ahslVarA;
        if (!this.e.b()) {
            throw new ahrx("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlI = i(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionD = d(urlI, str);
            try {
                try {
                    httpURLConnectionD.setRequestMethod("POST");
                    httpURLConnectionD.addRequestProperty("Authorization", a.ce(str4, "FIS_v2 "));
                    httpURLConnectionD.setDoOutput(true);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sdkVersion", "a:19.1.1_1p");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("installation", jSONObject);
                        f(httpURLConnectionD, h(jSONObject2));
                        int responseCode = httpURLConnectionD.getResponseCode();
                        this.e.a(responseCode);
                        if (g(responseCode)) {
                            InputStream inputStream = httpURLConnectionD.getInputStream();
                            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                            ahsk ahskVarA = ahsl.a();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName = jsonReader.nextName();
                                if (strNextName.equals("token")) {
                                    ahskVarA.b = jsonReader.nextString();
                                } else if (strNextName.equals("expiresIn")) {
                                    ahskVarA.b(a(jsonReader.nextString()));
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            jsonReader.close();
                            inputStream.close();
                            ahskVarA.a = 1;
                            ahslVarA = ahskVarA.a();
                        } else {
                            e(httpURLConnectionD, null, str, str3);
                            if (responseCode == 401 || responseCode == 404) {
                                ahsk ahskVarA2 = ahsl.a();
                                ahskVarA2.a = 3;
                                ahslVarA = ahskVarA2.a();
                            } else {
                                if (responseCode == 429) {
                                    throw new ahrx("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                }
                                if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    ahsk ahskVarA3 = ahsl.a();
                                    ahskVarA3.a = 2;
                                    ahslVarA = ahskVarA3.a();
                                } else {
                                    httpURLConnectionD.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                }
                            }
                        }
                        httpURLConnectionD.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return ahslVarA;
                    } catch (JSONException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionD.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new ahrx("Firebase Installations Service is unavailable. Please try again later.");
    }
}
