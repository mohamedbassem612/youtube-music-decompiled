package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agyo {
    public static final agwu a = new agym();

    public static void a(File file, File file2) throws Throwable {
        ahno.M(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        agkz agkzVarO = agkz.o(new agyl[0]);
        agyk agykVar = new agyk();
        try {
            FileInputStream fileInputStreamA = agyn.a(file);
            agykVar.b(fileInputStreamA);
            FileOutputStream fileOutputStreamE = agvp.e(file2, agkzVarO);
            agykVar.b(fileOutputStreamE);
            agyi.a(fileInputStreamA, fileOutputStreamE);
            agykVar.close();
        } catch (Throwable th) {
            try {
                throw agykVar.a(th);
            } catch (Throwable th2) {
                agykVar.close();
                throw th2;
            }
        }
    }

    public static void b(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of ".concat(file.toString()));
            }
        }
    }

    public static void c(File file, File file2) throws Throwable {
        file.getClass();
        ahno.M(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        a(file, file2);
        if (file.delete()) {
            return;
        }
        if (!file2.delete()) {
            throw new IOException("Unable to delete ".concat(file2.toString()));
        }
        throw new IOException("Unable to delete ".concat(file.toString()));
    }

    public static void d(byte[] bArr, File file) {
        file.getClass();
        agvp.d(bArr, file, agkz.o(new agyl[0]));
    }

    public static byte[] e(File file) {
        return agyn.b(file, new ahng());
    }
}
