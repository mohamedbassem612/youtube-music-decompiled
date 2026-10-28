package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpi extends agke {
    public static final agke a;
    static final agqs b;
    final transient Object[] c;
    public final transient int d;

    static {
        agpi agpiVar = new agpi(new Object[0], 0);
        a = agpiVar;
        b = new agka(agpiVar, 0);
    }

    public agpi(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.agke, defpackage.agjw
    public final int b(Object[] objArr, int i) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.agjw
    public final int d() {
        return this.d;
    }

    @Override // defpackage.agjw
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ahno.W(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return false;
    }

    @Override // defpackage.agjw
    public final Object[] m() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.agke, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
