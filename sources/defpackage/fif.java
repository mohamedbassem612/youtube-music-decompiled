package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fif {
    public final Object a;
    public Object b;

    public fif(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final String toString() {
        return "Diff{mPrevious=" + String.valueOf(this.a) + ", mNext=" + String.valueOf(this.b) + '}';
    }
}
