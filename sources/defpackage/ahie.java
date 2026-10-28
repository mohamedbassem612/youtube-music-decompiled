package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahie {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static Integer a() {
        if (b()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
