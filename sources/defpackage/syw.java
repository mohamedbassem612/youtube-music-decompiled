package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class syw {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/cache/TtlDiskCache");
    public File b;
    public final long c;
    public final mbc d;
    public final awmd e;

    public syw(Context context, int i, String str, long j, mbc mbcVar, awmd awmdVar) {
        File filesDir;
        if (i == 1) {
            filesDir = context.getFilesDir();
        } else if (i != 2) {
            filesDir = context.getCacheDir();
        } else {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            filesDir = (externalFilesDirs == null || externalFilesDirs.length <= 0) ? null : externalFilesDirs[0];
        }
        if (filesDir != null) {
            File file = new File(filesDir, str);
            try {
                this.b = (file.mkdirs() || file.exists()) ? file : null;
            } catch (SecurityException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/cache/TtlDiskCache", "<init>", 'h', "TtlDiskCache.java")).t("Error creating cache dir");
            }
        }
        this.c = TimeUnit.SECONDS.toMillis(j);
        this.d = mbcVar;
        this.e = awmdVar;
    }

    public static void b(File file, List list) {
        if (file != null) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isDirectory()) {
                            b(file2, list);
                        } else {
                            list.add(file2);
                        }
                    }
                }
            } catch (SecurityException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/cache/TtlDiskCache", "getAvailableAssets", (char) 190, "TtlDiskCache.java")).t("Exception in listing directory files");
            }
        }
    }

    public final boolean a(String str, byte[] bArr) {
        return c(str, new qcb(bArr, null));
    }

    public final boolean c(String str, qcb qcbVar) {
        taq.c();
        File file = this.b;
        if (file == null) {
            return false;
        }
        File file2 = new File(file, str);
        try {
            File parentFile = file2.getParentFile();
            if (parentFile == null) {
                return false;
            }
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (!file2.createNewFile()) {
                return false;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream.write((byte[]) qcbVar.a);
                    fileOutputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException | SecurityException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/cache/TtlDiskCache", "put", (char) 284, "TtlDiskCache.java")).t("Error saving file");
                return false;
            }
        } catch (IOException | SecurityException e2) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e2)).k("com/google/android/libraries/youtube/common/cache/TtlDiskCache", "put", (char) 277, "TtlDiskCache.java")).t("Error saving file");
            return false;
        }
    }
}
