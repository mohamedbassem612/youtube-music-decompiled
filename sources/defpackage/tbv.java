package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tbv {
    public final Class a;
    public final tbu b;
    public final int c;
    private final WeakReference d;
    private final int e;

    public tbv(Object obj, Class cls, Object obj2, tbu tbuVar) {
        this.d = new WeakReference(obj);
        cls.getClass();
        this.a = cls;
        this.b = tbuVar;
        this.e = Objects.hash(obj, cls, obj2, tbuVar);
        this.c = obj2.hashCode();
    }

    final Object a() {
        return this.d.get();
    }

    public final boolean equals(Object obj) {
        tbu tbuVar;
        tbu tbuVar2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof tbv) {
            tbv tbvVar = (tbv) obj;
            WeakReference weakReference = this.d;
            Object obj2 = weakReference.get();
            WeakReference weakReference2 = tbvVar.d;
            if (obj2 == weakReference2.get() && this.a.equals(tbvVar.a) && this.c == tbvVar.c && (tbuVar = this.b) != (tbuVar2 = tbvVar.b) && tbuVar.equals(tbuVar2)) {
                Object obj3 = weakReference.get();
                if ((tbuVar instanceof tbz) && obj3 != null) {
                    Log.w("EventBus", "Potential duplicate subscribers at " + obj3.getClass().getSimpleName() + '#' + ((tbz) tbuVar).a.getName() + ", did you forget to unregister properly?");
                }
            } else if (weakReference.get() == weakReference2.get() && this.a.equals(tbvVar.a) && this.c == tbvVar.c && this.b == tbvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
