package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axsm implements InvocationHandler {
    private final Object a;

    public axsm(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof axsm ? this.a.equals(((axsm) obj).a) : this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            Objects.toString(method);
            throw new RuntimeException("Reflection failed for method ".concat(String.valueOf(method)), e2);
        }
    }
}
