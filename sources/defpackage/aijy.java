package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aijy {
    public static final aijx a;
    static final boolean b;
    private static final Unsafe c;
    private static final Class d;
    private static final boolean e;
    private static final boolean f;

    static {
        boolean z;
        aijx aijxVar;
        Unsafe unsafeG = g();
        c = unsafeG;
        d = Memory.class;
        boolean zK = k(Long.TYPE);
        e = zK;
        boolean zK2 = k(Integer.TYPE);
        aijx aijvVar = null;
        if (unsafeG != null) {
            if (zK) {
                aijvVar = new aijw(unsafeG);
            } else if (zK2) {
                aijvVar = new aijv(unsafeG);
            }
        }
        a = aijvVar;
        if (aijvVar != null) {
            try {
                Class<?> cls = aijvVar.a.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                f();
            } catch (Throwable th) {
                h(th);
            }
        }
        aijx aijxVar2 = a;
        if (aijxVar2 != null) {
            try {
                Class<?> cls2 = aijxVar2.a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                cls2.getMethod("getInt", Object.class, Long.TYPE);
                cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls2.getMethod("getLong", Object.class, Long.TYPE);
                Class<?> cls3 = Long.TYPE;
                cls2.getMethod("putLong", Object.class, cls3, cls3);
                cls2.getMethod("getObject", Object.class, Long.TYPE);
                cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z = true;
            } catch (Throwable th2) {
                h(th2);
                z = false;
            }
        } else {
            z = false;
        }
        f = z;
        n(byte[].class);
        n(boolean[].class);
        m(boolean[].class);
        n(int[].class);
        m(int[].class);
        n(long[].class);
        m(long[].class);
        n(float[].class);
        m(float[].class);
        n(double[].class);
        m(double[].class);
        n(Object[].class);
        m(Object[].class);
        Field fieldF = f();
        if (fieldF != null && (aijxVar = a) != null) {
            aijxVar.a.objectFieldOffset(fieldF);
        }
        b = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private aijy() {
    }

    public static byte a(Object obj, long j) {
        return (byte) ((a.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    static double b(Object obj, long j) {
        return a.a(obj, j);
    }

    static int c(Object obj, long j) {
        return a.g(obj, j);
    }

    static Object d(Class cls) {
        try {
            return c.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object e(Object obj, long j) {
        return a.i(obj, j);
    }

    public static Field f() {
        Field declaredField;
        Field declaredField2;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    static Unsafe g() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new aiju(0));
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
            Logger.getLogger(aijy.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void h(Throwable th) {
        Logger.getLogger(aijy.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void i(Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        a.j(obj, j2, (c(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    public static void j(Object obj, long j, byte b2) {
        aijx aijxVar = a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        aijxVar.j(obj, j2, (aijxVar.g(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean k(Class cls) {
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

    public static boolean l(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    private static void m(Class cls) {
        if (f) {
            a.a.arrayIndexScale(cls);
        }
    }

    private static void n(Class cls) {
        if (f) {
            a.a.arrayBaseOffset(cls);
        }
    }
}
