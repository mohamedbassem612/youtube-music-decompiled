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
/* JADX INFO: loaded from: classes3.dex */
public final class lzn {
    static final boolean a;
    private static final Unsafe b;
    private static final Class c;
    private static final boolean d;
    private static final lzm e;
    private static final boolean f;

    static {
        Unsafe unsafeH = h();
        b = unsafeH;
        c = lwp.a;
        boolean zR = r(Long.TYPE);
        d = zR;
        boolean zR2 = r(Integer.TYPE);
        lzm lzlVar = null;
        if (unsafeH != null) {
            if (!lwp.a()) {
                lzlVar = new lzl(unsafeH);
            } else if (zR) {
                lzlVar = new lzk(unsafeH);
            } else if (zR2) {
                lzlVar = new lzj(unsafeH);
            }
        }
        e = lzlVar;
        if (lzlVar != null) {
            lzlVar.g();
        }
        f = lzlVar == null ? false : lzlVar.h();
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
        if (fieldG != null && lzlVar != null) {
            lzlVar.a.objectFieldOffset(fieldG);
        }
        a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private lzn() {
    }

    static double a(Object obj, long j) {
        return e.a(obj, j);
    }

    static float b(Object obj, long j) {
        return e.b(obj, j);
    }

    static int c(Object obj, long j) {
        return e.i(obj, j);
    }

    static long d(Object obj, long j) {
        return e.j(obj, j);
    }

    static Object e(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object f(Object obj, long j) {
        return e.a.getObject(obj, j);
    }

    public static Field g() {
        Field fieldX;
        if (lwp.a() && (fieldX = a.X(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldX;
        }
        Field fieldX2 = a.X(Buffer.class, "address");
        if (fieldX2 == null || fieldX2.getType() != Long.TYPE) {
            return null;
        }
        return fieldX2;
    }

    static Unsafe h() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new lzi());
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
            Logger.getLogger(lzn.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void i(Throwable th) {
        Logger logger = Logger.getLogger(lzn.class.getName());
        Level level = Level.WARNING;
        Objects.toString(th);
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void j(Object obj, long j, boolean z) {
        e.c(obj, j, z);
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
        e.d(obj, j, d2);
    }

    static void n(Object obj, long j, float f2) {
        e.e(obj, j, f2);
    }

    static void o(Object obj, long j, int i) {
        e.k(obj, j, i);
    }

    static void p(Object obj, long j, long j2) {
        e.l(obj, j, j2);
    }

    static void q(Object obj, long j, Object obj2) {
        e.a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean r(Class cls) {
        if (!lwp.a()) {
            return false;
        }
        try {
            Class cls2 = c;
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
        return e.f(obj, j);
    }

    public static boolean t(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean u(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    private static void v(Class cls) {
        if (f) {
            e.a.arrayIndexScale(cls);
        }
    }

    private static void w(Class cls) {
        if (f) {
            e.a.arrayBaseOffset(cls);
        }
    }
}
