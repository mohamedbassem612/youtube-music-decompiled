package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bke {
    public static final bkd a;
    static final boolean b;
    private static final Unsafe c;
    private static final Class d;
    private static final boolean e;
    private static final boolean f;

    static {
        Unsafe unsafeH = h();
        c = unsafeH;
        d = bhp.a;
        boolean zR = r(Long.TYPE);
        e = zR;
        boolean zR2 = r(Integer.TYPE);
        bkd bkcVar = null;
        if (unsafeH != null) {
            if (!bhp.a()) {
                bkcVar = new bkc(unsafeH);
            } else if (zR) {
                bkcVar = new bkb(unsafeH);
            } else if (zR2) {
                bkcVar = new bka(unsafeH);
            }
        }
        a = bkcVar;
        if (bkcVar != null) {
            bkcVar.g();
        }
        f = bkcVar == null ? false : bkcVar.h();
        w(byte[].class);
        w(boolean[].class);
        v(boolean[].class);
        w(int[].class);
        v(int[].class);
        w(long[].class);
        v(long[].class);
        w(float[].class);
        v(float[].class);
        w(double[].class);
        v(double[].class);
        w(Object[].class);
        v(Object[].class);
        Field fieldG = g();
        if (fieldG != null && bkcVar != null) {
            bkcVar.a.objectFieldOffset(fieldG);
        }
        b = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private bke() {
    }

    static double a(Object obj, long j) {
        return a.a(obj, j);
    }

    static float b(Object obj, long j) {
        return a.b(obj, j);
    }

    static int c(Object obj, long j) {
        return a.i(obj, j);
    }

    static long d(Object obj, long j) {
        return a.j(obj, j);
    }

    static Object e(Class cls) {
        try {
            return c.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object f(Object obj, long j) {
        return a.k(obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public static Field g() {
        Field declaredField;
        if (!bhp.a()) {
            declaredField = Buffer.class.getDeclaredField("address");
            return declaredField != null ? null : null;
        }
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField == null) {
            try {
                declaredField = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                declaredField = null;
            }
            if (declaredField != null || declaredField.getType() != Long.TYPE) {
            }
        }
        return declaredField;
    }

    static Unsafe h() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new aiju(1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(bke.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void i(Throwable th) {
        Logger logger = Logger.getLogger(bke.class.getName());
        Level level = Level.WARNING;
        Objects.toString(th);
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void j(Object obj, long j, boolean z) {
        a.c(obj, j, z);
    }

    public static void k(Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        o(obj, j2, (c(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    public static void l(Object obj, long j, byte b2) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        o(obj, j2, (c(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    static void m(Object obj, long j, double d2) {
        a.d(obj, j, d2);
    }

    static void n(Object obj, long j, float f2) {
        a.e(obj, j, f2);
    }

    static void o(Object obj, long j, int i) {
        a.l(obj, j, i);
    }

    static void p(Object obj, long j, long j2) {
        a.m(obj, j, j2);
    }

    public static void q(Object obj, long j, Object obj2) {
        a.n(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean r(Class cls) {
        if (!bhp.a()) {
            return false;
        }
        try {
            Class cls2 = d;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            Class cls3 = Integer.TYPE;
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls3, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean s(Object obj, long j) {
        return a.f(obj, j);
    }

    public static boolean t(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean u(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    private static void v(Class cls) {
        if (f) {
            a.a.arrayIndexScale(cls);
        }
    }

    private static void w(Class cls) {
        if (f) {
            a.a.arrayBaseOffset(cls);
        }
    }
}
