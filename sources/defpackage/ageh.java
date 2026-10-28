package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ageh implements ageg {
    final Method a;

    public ageh(Method method) {
        this.a = method;
    }

    @Override // defpackage.ageg
    public final void a(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) throws IllegalAccessException, InvocationTargetException {
        this.a.invoke(null, cls, referenceQueue, phantomReference);
    }
}
