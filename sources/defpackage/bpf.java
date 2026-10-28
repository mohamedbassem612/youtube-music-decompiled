package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bpf {
    public static final List a = atqq.aL(new Class[]{Application.class, boy.class});
    public static final List b = atqq.H(boy.class);

    public static final bpi a(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (bpi) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Failed to access ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(a.bV(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            Objects.toString(cls);
            throw new RuntimeException("An exception happened in constructor of ".concat(cls.toString()), e3.getCause());
        }
    }

    public static final Constructor b(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listAR = atqq.aR(parameterTypes);
            if (awrc.c(list, listAR)) {
                constructor.getClass();
                return constructor;
            }
            if (list.size() == listAR.size() && listAR.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
