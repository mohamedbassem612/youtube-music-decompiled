package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agpm extends agke {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public agpm(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ahno.W(i, this.c);
        Object obj = this.a[(i << 1) + this.b];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.agke, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
