package defpackage;

import android.os.Parcel;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class acq {
    public static final long a(int i) {
        return ((long) i) << 32;
    }

    public static final IOException b(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return d(file, iOException);
        }
        if (!parentFile.exists()) {
            return d(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? d(file, iOException) : d(file, iOException);
            }
            return parentFile.canWrite() ? d(file, iOException) : d(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? d(file, iOException) : d(file, iOException);
        }
        return parentFile.canWrite() ? d(file, iOException) : d(file, iOException);
    }

    public static final Exception c(String str, Exception exc) {
        int i;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                i = 0;
            }
            Object objInvoke = method.invoke(null, a.bP(i, "sys.user.", ".ce_available"), "false");
            objInvoke.getClass();
            if (!awrc.c((String) objInvoke, "true")) {
                if (str != null) {
                    File file = new File(str, "siblingTestFile.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    try {
                        try {
                            file.createNewFile();
                        } catch (IOException unused2) {
                            exc = new bfr(exc);
                        }
                    } finally {
                        file.delete();
                    }
                }
            }
        } catch (Throwable th) {
            avkz.d(exc, th);
        }
        return exc;
    }

    private static final IOException d(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }
}
