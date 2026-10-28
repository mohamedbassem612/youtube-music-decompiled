package defpackage;

import internal.org.jni_zero.JniZero;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axdi {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(Throwable.class, -1);
    private static final axcy c;

    static {
        axcy axcyVar;
        try {
            axcyVar = axdj.a ? axeg.a : axcs.a;
        } catch (Throwable unused) {
            axcyVar = axeg.a;
        }
        c = axcyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object objI;
        if (!(th instanceof awuo)) {
            return (Throwable) c.a(th.getClass()).invoke(th);
        }
        try {
            objI = ((awuo) th).a();
        } catch (Throwable th2) {
            objI = atqp.i(th2);
        }
        if (true == (objI instanceof awmm)) {
            objI = null;
        }
        return (Throwable) objI;
    }

    public static final awqg b(Class cls) {
        awqg awqgVar;
        awml awmlVar;
        awml awmlVar2;
        actf actfVar = new actf(15);
        Object next = null;
        try {
            final Method method = cls.getMethod("copyForStackTraceRecovery", null);
            return new awqg() { // from class: axdd
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    Object objI;
                    Throwable th = (Throwable) obj;
                    int i = axdi.a;
                    try {
                        objI = (Throwable) method.invoke(th, null);
                    } catch (Throwable th2) {
                        objI = atqp.i(th2);
                    }
                    return (Throwable) (true != (objI instanceof awmm) ? objI : null);
                }
            };
        } catch (NoClassDefFoundError | NoSuchMethodException | SecurityException unused) {
            if (b != c(cls, 0)) {
                return actfVar;
            }
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            for (final Constructor<?> constructor : constructors) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                int i = 4;
                if (length != 0) {
                    if (length == 1) {
                        Class<?> cls2 = parameterTypes[0];
                        if (awrc.c(cls2, String.class)) {
                            awmlVar = new awml(new awnf(new awqg() { // from class: axdf
                                @Override // defpackage.awqg
                                public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                    Throwable th = (Throwable) obj;
                                    int i2 = axdi.a;
                                    Object objNewInstance = constructor.newInstance(th.getMessage());
                                    objNewInstance.getClass();
                                    Throwable th2 = (Throwable) objNewInstance;
                                    th2.initCause(th);
                                    return th2;
                                }
                            }, i), 2);
                        } else if (awrc.c(cls2, Throwable.class)) {
                            awmlVar = new awml(new awnf(new awqg() { // from class: axdg
                                @Override // defpackage.awqg
                                public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                    int i2 = axdi.a;
                                    Object objNewInstance = constructor.newInstance((Throwable) obj);
                                    objNewInstance.getClass();
                                    return (Throwable) objNewInstance;
                                }
                            }, i), 1);
                        } else {
                            awmlVar2 = new awml(null, -1);
                        }
                    } else if (length != 2) {
                        awmlVar2 = new awml(null, -1);
                    } else if (awrc.c(parameterTypes[0], String.class) && awrc.c(parameterTypes[1], Throwable.class)) {
                        awmlVar = new awml(new awnf(new awqg() { // from class: axde
                            @Override // defpackage.awqg
                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                Throwable th = (Throwable) obj;
                                int i2 = axdi.a;
                                Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                                objNewInstance.getClass();
                                return (Throwable) objNewInstance;
                            }
                        }, i), 3);
                    } else {
                        awmlVar2 = new awml(null, -1);
                    }
                    arrayList.add(awmlVar2);
                } else {
                    awmlVar = new awml(new awnf(new awqg() { // from class: axdh
                        @Override // defpackage.awqg
                        public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                            int i2 = axdi.a;
                            Object objNewInstance = constructor.newInstance(null);
                            objNewInstance.getClass();
                            Throwable th = (Throwable) objNewInstance;
                            th.initCause((Throwable) obj);
                            return th;
                        }
                    }, i), 0);
                }
                awmlVar2 = awmlVar;
                arrayList.add(awmlVar2);
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((awml) next).b).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((awml) next2).b).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            awml awmlVar3 = (awml) next;
            return (awmlVar3 == null || (awqgVar = (awqg) awmlVar3.a) == null) ? actfVar : awqgVar;
        }
    }

    private static final int c(Class cls, int i) {
        Object objI;
        JniZero.i(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objI = atqp.i(th);
            }
        } while (cls != null);
        objI = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objI instanceof awmm)) {
            objI = objValueOf;
        }
        return ((Number) objI).intValue();
    }
}
