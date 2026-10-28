package defpackage;

import android.os.AsyncTask;
import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uyz extends AsyncTask {
    final /* synthetic */ File a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ AssetDownloader.DownloadCallback c;

    public uyz(File file, byte[] bArr, AssetDownloader.DownloadCallback downloadCallback) {
        this.a = file;
        this.b = bArr;
        this.c = downloadCallback;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) throws Throwable {
        Exception e;
        File fileCreateTempFile;
        FileOutputStream fileOutputStream;
        File file = this.a;
        byte[] bArr = this.b;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileCreateTempFile = File.createTempFile("XenoAssetDownloaderTempFile", null, file);
                try {
                    fileCreateTempFile.deleteOnExit();
                    fileOutputStream = new FileOutputStream(fileCreateTempFile.getPath());
                    try {
                        fileOutputStream.write(bArr);
                        try {
                            fileOutputStream.close();
                            e = null;
                            e = null;
                        } catch (Exception e2) {
                            e = e2;
                            e = null;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e4) {
                                e = e4;
                            }
                        }
                        e = null;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    fileOutputStream = null;
                }
            } catch (Exception e6) {
                e = e6;
                fileCreateTempFile = null;
                fileOutputStream = null;
            }
            AssetDownloader.DownloadCallback downloadCallback = this.c;
            if (e == null && e == null) {
                downloadCallback.onCompletion(fileCreateTempFile != null ? fileCreateTempFile.getPath() : null, null);
            } else {
                if (fileCreateTempFile != null) {
                    fileCreateTempFile.delete();
                }
                downloadCallback.onCompletion(null, e != null ? e.getMessage() : e.getMessage());
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
