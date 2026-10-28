package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bok {
    public static final bok a = new bok();
    private static final Map c = new HashMap();
    public static final Map b = new HashMap();

    public static final bnx b(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            objNewInstance.getClass();
            return (bnx) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static final boolean c(Class cls) {
        return cls != null && bof.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1 A[PHI: r0
      0x00f1: PHI (r0v6 java.util.ArrayList) = (r0v5 java.util.ArrayList), (r0v12 java.util.ArrayList) binds: [B:42:0x00d6, B:45:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int a(Class cls) {
        Constructor declaredConstructor;
        Class superclass;
        Class<?>[] interfaces;
        Integer num = (Integer) c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                    canonicalName.getClass();
                }
                canonicalName.getClass();
                String strConcat = awrc.C(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                Class<?> cls2 = Class.forName(strConcat);
                cls2.getClass();
                declaredConstructor = cls2.getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (declaredConstructor != null) {
                Map map = b;
                List listSingletonList = Collections.singletonList(declaredConstructor);
                listSingletonList.getClass();
                map.put(cls, listSingletonList);
            } else {
                bnt bntVar = bnt.a;
                Map map2 = bntVar.b;
                Boolean bool = (Boolean) map2.get(cls);
                if (bool == null) {
                    Method[] methodArrC = bntVar.c(cls);
                    for (Method method : methodArrC) {
                        if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                            bntVar.a(cls, methodArrC);
                        }
                    }
                    map2.put(cls, Boolean.FALSE);
                    superclass = cls.getSuperclass();
                    if (c(superclass)) {
                        superclass.getClass();
                        if (a(superclass) != 1) {
                            Object obj = b.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            for (Class<?> cls3 : interfaces) {
                                if (c(cls3)) {
                                    cls3.getClass();
                                    if (a(cls3) != 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = b.get(cls3);
                                        obj2.getClass();
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                b.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        while (i < interfaces.length) {
                            if (c(cls3)) {
                                cls3.getClass();
                                if (a(cls3) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = b.get(cls3);
                                    obj3.getClass();
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        }
                    }
                } else if (!bool.booleanValue()) {
                    superclass = cls.getSuperclass();
                    if (c(superclass)) {
                        superclass.getClass();
                        if (a(superclass) != 1) {
                            Object obj4 = b.get(superclass);
                            obj4.getClass();
                            arrayList = new ArrayList((Collection) obj4);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            while (i < interfaces.length) {
                                if (c(cls3)) {
                                    cls3.getClass();
                                    if (a(cls3) != 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj5 = b.get(cls3);
                                        obj5.getClass();
                                        arrayList.addAll((Collection) obj5);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                b.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        while (i < interfaces.length) {
                            if (c(cls3)) {
                                cls3.getClass();
                                if (a(cls3) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj6 = b.get(cls3);
                                    obj6.getClass();
                                    arrayList.addAll((Collection) obj6);
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        c.put(cls, Integer.valueOf(i));
        return i;
    }
}
