package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uxr extends AsyncTask {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ uxs d;

    public uxr(uxs uxsVar, String str, String str2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = uxsVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        uxt uxtVar = this.d.n;
        Object obj = uxtVar.f;
        synchronized (obj) {
            String str = this.a;
            String str2 = this.b;
            byte[] bArr = this.c;
            taq.c();
            uxtVar.b();
            try {
                File file = new File(uxtVar.b, str);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                synchronized (obj) {
                    uxtVar.g.add(str);
                    uxtVar.h.c(str2);
                }
            } catch (IOException | SecurityException e) {
                ((agrc) ((agrc) ((agrc) uxt.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/effects/deprecated/model/VideoEffectsFileManager", "handleDownloadedAssetData", (char) 331, "VideoEffectsFileManager.java")).w("Error writing asset to file: %s", str);
            }
        }
        return null;
    }
}
