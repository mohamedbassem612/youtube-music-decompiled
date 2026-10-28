package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ageb {
    protected ageb() {
    }

    public abstract int a(Object obj);

    protected abstract boolean b(Object obj, Object obj2);

    public final boolean c(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return b(obj, obj2);
    }
}
