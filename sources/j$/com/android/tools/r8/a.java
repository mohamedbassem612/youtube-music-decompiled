package j$.com.android.tools.r8;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ Unsafe c;
    public final /* synthetic */ Class a;
    public final /* synthetic */ long b;

    static {
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    declaredField = null;
                    break;
                }
                Field field = declaredFields[i];
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                    break;
                }
                i++;
            }
            if (declaredField != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        declaredField.setAccessible(true);
        try {
            c = (Unsafe) declaredField.get(null);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public /* synthetic */ a(Class cls, String str, Class cls2) {
        this.a = cls.getDeclaredField(str).getType();
        if (!cls2.isPrimitive() || cls2 == Integer.TYPE || cls2 == Long.TYPE) {
            this.b = c.objectFieldOffset(cls.getDeclaredField(str));
            return;
        }
        throw new UnsupportedOperationException("Using a VarHandle for a field of type '" + cls2.getName() + "' requires native VarHandle support available from Android 13. VarHandle desugaring only supports primitive types int and long and reference types.");
    }

    public static /* synthetic */ int d(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public static /* synthetic */ long e(Object obj) {
        return obj instanceof Long ? ((Long) obj).longValue() : d(obj);
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2, Object obj3) {
        Class cls = Integer.TYPE;
        Class cls2 = this.a;
        if (cls2 == cls) {
            return c.compareAndSwapInt(obj, this.b, d(obj2), d(obj3));
        }
        Class cls3 = Long.TYPE;
        Unsafe unsafe = c;
        long j = this.b;
        if (cls2 == cls3) {
            return unsafe.compareAndSwapLong(obj, j, e(obj2), e(obj3));
        }
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void b(Object obj, Object obj2) {
        Class cls = Long.TYPE;
        long j = this.b;
        Class cls2 = this.a;
        Class cls3 = Integer.TYPE;
        if (cls2 == cls3) {
            int iD = d(obj2);
            if (cls2 == cls3) {
                c.putInt(obj, j, iD);
                return;
            } else if (cls2 != cls) {
                b(obj, Integer.valueOf(iD));
                return;
            } else {
                c.putLong(obj, this.b, iD);
                return;
            }
        }
        Unsafe unsafe = c;
        if (cls2 != cls) {
            unsafe.putObject(obj, j, obj2);
            return;
        }
        long jE = e(obj2);
        if (cls2 == cls) {
            unsafe.putLong(obj, this.b, jE);
        } else {
            if (cls2 == cls3) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            unsafe.putObject(obj, j, Long.valueOf(jE));
        }
    }

    public final /* synthetic */ void c(Object obj, Object obj2) {
        Class cls = Long.TYPE;
        long j = this.b;
        Class cls2 = this.a;
        Class cls3 = Integer.TYPE;
        if (cls2 == cls3) {
            int iD = d(obj2);
            if (cls2 == cls3) {
                c.putOrderedInt(obj, j, iD);
                return;
            } else if (cls2 != cls) {
                c(obj, Integer.valueOf(iD));
                return;
            } else {
                c.putOrderedLong(obj, this.b, iD);
                return;
            }
        }
        Unsafe unsafe = c;
        if (cls2 != cls) {
            unsafe.putOrderedObject(obj, j, obj2);
            return;
        }
        long jE = e(obj2);
        if (cls2 == cls) {
            unsafe.putOrderedLong(obj, this.b, jE);
        } else {
            if (cls2 == cls3) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            unsafe.putOrderedObject(obj, j, Long.valueOf(jE));
        }
    }

    public final /* synthetic */ boolean f(ConcurrentLinkedQueue concurrentLinkedQueue, Object obj, Object obj2) {
        Class cls = Integer.TYPE;
        Class cls2 = this.a;
        if (cls2 == cls) {
            return c.compareAndSwapInt(concurrentLinkedQueue, this.b, d(obj), d(obj2));
        }
        Class cls3 = Long.TYPE;
        Unsafe unsafe = c;
        long j = this.b;
        if (cls2 == cls3) {
            return unsafe.compareAndSwapLong(concurrentLinkedQueue, j, e(obj), e(obj2));
        }
        while (!unsafe.compareAndSwapObject(concurrentLinkedQueue, j, obj, obj2)) {
            if (unsafe.getObject(concurrentLinkedQueue, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
