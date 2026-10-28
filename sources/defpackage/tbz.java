package defpackage;

import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tbz implements tbu {
    public final Method a;
    private final WeakReference b;
    private final int c;

    public tbz(Object obj, Method method) {
        this.b = new WeakReference(obj);
        method.getClass();
        this.a = method;
        method.setAccessible(true);
        this.c = Objects.hash(obj, method);
    }

    @Override // defpackage.tbu
    public final void a(Object obj) {
        Object obj2 = this.b.get();
        if (obj2 != null) {
            try {
                this.a.invoke(obj2, obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // defpackage.tbu
    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tbz) {
            tbz tbzVar = (tbz) obj;
            if (tbzVar.b.get() == this.b.get() && this.a.equals(tbzVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
