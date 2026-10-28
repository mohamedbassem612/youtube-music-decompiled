package defpackage;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahcm extends ahci {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    public static final /* synthetic */ int g = 0;

    static {
        Unsafe unsafeJ;
        try {
            try {
                unsafeJ = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    unsafeJ = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new ahcl());
                } catch (Exception unused2) {
                    unsafeJ = a.j();
                }
            }
            try {
                c = unsafeJ.objectFieldOffset(ahco.class.getDeclaredField("waitersField"));
                b = unsafeJ.objectFieldOffset(ahco.class.getDeclaredField("listenersField"));
                d = unsafeJ.objectFieldOffset(ahco.class.getDeclaredField("valueField"));
                e = unsafeJ.objectFieldOffset(ahcn.class.getDeclaredField("thread"));
                f = unsafeJ.objectFieldOffset(ahcn.class.getDeclaredField("next"));
                a = unsafeJ;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3);
        }
    }

    @Override // defpackage.ahci
    public final ahce a(ahco ahcoVar, ahce ahceVar) {
        ahce ahceVar2;
        do {
            ahceVar2 = ahcoVar.listenersField;
            if (ahceVar == ahceVar2) {
                break;
            }
        } while (!e(ahcoVar, ahceVar2, ahceVar));
        return ahceVar2;
    }

    @Override // defpackage.ahci
    public final ahcn b(ahco ahcoVar, ahcn ahcnVar) {
        ahcn ahcnVar2;
        do {
            ahcnVar2 = ahcoVar.waitersField;
            if (ahcnVar == ahcnVar2) {
                break;
            }
        } while (!g(ahcoVar, ahcnVar2, ahcnVar));
        return ahcnVar2;
    }

    @Override // defpackage.ahci
    public final void c(ahcn ahcnVar, ahcn ahcnVar2) {
        a.putObject(ahcnVar, f, ahcnVar2);
    }

    @Override // defpackage.ahci
    public final void d(ahcn ahcnVar, Thread thread) {
        a.putObject(ahcnVar, e, thread);
    }

    @Override // defpackage.ahci
    public final boolean e(ahco ahcoVar, ahce ahceVar, ahce ahceVar2) {
        return ahck.a(a, ahcoVar, b, ahceVar, ahceVar2);
    }

    @Override // defpackage.ahci
    public final boolean f(ahco ahcoVar, Object obj, Object obj2) {
        return ahck.a(a, ahcoVar, d, obj, obj2);
    }

    @Override // defpackage.ahci
    public final boolean g(ahco ahcoVar, ahcn ahcnVar, ahcn ahcnVar2) {
        return ahck.a(a, ahcoVar, c, ahcnVar, ahcnVar2);
    }
}
