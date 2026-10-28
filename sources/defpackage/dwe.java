package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dwe implements InvocationHandler {
    private final awsd a;
    private final awqg b;

    public dwe(awsd awsdVar, awqg awqgVar) {
        this.a = awsdVar;
        this.b = awqgVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (awrc.c(method.getName(), "accept") && objArr != null && objArr.length == 1) {
            awsd awsdVar = this.a;
            Object obj2 = objArr[0];
            if (!awsdVar.d(obj2)) {
                throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(awsdVar.b())));
            }
            obj2.getClass();
            this.b.invoke(obj2);
            return awmy.a;
        }
        if (awrc.c(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (awrc.c(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.b.hashCode());
        }
        if (awrc.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.b.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
