package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agud extends agtu {
    private static final boolean a = aguc.a();
    private static final boolean b;
    private static final agtt c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new agub();
    }

    static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return aguc.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.agtu
    protected agsw e(String str) {
        char cCharAt;
        AtomicReference atomicReference = agug.d;
        if (atomicReference.get() != null) {
            return ((agtz) atomicReference.get()).a(str);
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
            cCharAt = str.charAt(length);
            if (cCharAt == '$') {
                str = str.replace('$', '.');
                break;
            }
        } while (cCharAt != '.');
        agug agugVar = new agug(str);
        aguf.a.offer(agugVar);
        if (atomicReference.get() != null) {
            agug.e();
        }
        return agugVar;
    }

    @Override // defpackage.agtu
    protected agtt h() {
        return c;
    }

    @Override // defpackage.agtu
    protected aguu j() {
        return aguh.a;
    }

    @Override // defpackage.agtu
    protected String m() {
        return "platform: Android";
    }
}
