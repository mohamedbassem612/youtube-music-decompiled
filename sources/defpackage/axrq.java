package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axrq {
    public static final axrp a;
    static final boolean b;
    private static final Unsafe c;
    private static final Class d;
    private static final boolean e;
    private static final boolean f;

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    static {
        axrp axrnVar;
        boolean z;
        Field declaredField;
        axrp axrpVar;
        Field declaredField2;
        Unsafe unsafeH = h();
        c = unsafeH;
        d = axpi.a;
        boolean zQ = q(Long.TYPE);
        e = zQ;
        boolean zQ2 = q(Integer.TYPE);
        Field field = null;
        if (unsafeH == null) {
            axrnVar = null;
        } else if (zQ) {
            axrnVar = new axro(unsafeH);
        } else if (zQ2) {
            axrnVar = new axrn(unsafeH);
        } else {
            axrnVar = null;
        }
        a = axrnVar;
        if (axrnVar != null) {
            try {
                Class<?> cls = axrnVar.a.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                cls.getMethod("getInt", Object.class, Long.TYPE);
                cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, Long.TYPE);
                cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z = true;
            } catch (Throwable th) {
                Logger logger = Logger.getLogger(axrq.class.getName());
                th.toString();
                logger.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                z = false;
            }
        } else {
            z = false;
        }
        f = z;
        u(byte[].class);
        u(boolean[].class);
        t(boolean[].class);
        u(int[].class);
        t(int[].class);
        u(long[].class);
        t(long[].class);
        u(float[].class);
        t(float[].class);
        u(double[].class);
        t(double[].class);
        u(Object[].class);
        t(Object[].class);
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                declaredField2 = null;
            }
            if (declaredField2 != null && declaredField2.getType() == Long.TYPE) {
                field = declaredField2;
            }
        } else {
            field = declaredField;
        }
        if (field != null && (axrpVar = a) != null) {
            axrpVar.a.objectFieldOffset(field);
        }
        b = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private axrq() {
    }

    public static byte a(Object obj, long j) {
        return (byte) ((a.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    static double b(Object obj, long j) {
        return a.a(obj, j);
    }

    static float c(Object obj, long j) {
        return a.b(obj, j);
    }

    static int d(Object obj, long j) {
        return a.g(obj, j);
    }

    static long e(Object obj, long j) {
        return a.h(obj, j);
    }

    static Object f(Class cls) {
        try {
            return c.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object g(Object obj, long j) {
        return a.i(obj, j);
    }

    static Unsafe h() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new aiju(2));
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
            Logger.getLogger(axrq.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    static void i(Object obj, long j, boolean z) {
        a.c(obj, j, z);
    }

    public static void j(Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        n(obj, j2, (d(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    public static void k(Object obj, long j, byte b2) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        n(obj, j2, (d(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    static void l(Object obj, long j, double d2) {
        a.d(obj, j, d2);
    }

    static void m(Object obj, long j, float f2) {
        a.e(obj, j, f2);
    }

    static void n(Object obj, long j, int i) {
        a.j(obj, j, i);
    }

    static void o(Object obj, long j, long j2) {
        a.k(obj, j, j2);
    }

    static void p(Object obj, long j, Object obj2) {
        a.l(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean q(Class cls) {
        Class cls2 = axpi.a;
        try {
            Class cls3 = d;
            cls3.getMethod("peekLong", cls, Boolean.TYPE);
            cls3.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls3.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls3.getMethod("peekInt", cls, Boolean.TYPE);
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            Class cls4 = Integer.TYPE;
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            Class cls5 = Integer.TYPE;
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean r(Object obj, long j) {
        return a.f(obj, j);
    }

    public static boolean s(Object obj, long j) {
        return ((byte) ((d(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    private static void t(Class cls) {
        if (f) {
            a.a.arrayIndexScale(cls);
        }
    }

    private static void u(Class cls) {
        if (f) {
            a.a.arrayBaseOffset(cls);
        }
    }
}
