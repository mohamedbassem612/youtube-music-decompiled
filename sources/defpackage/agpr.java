package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpr extends agkz {
    public static final agpr a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        a = new agpr(objArr, 0, objArr, 0, 0);
    }

    public agpr(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.agjw
    public final int b(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.e;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.agkz
    public final boolean c() {
        return true;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.d;
        if (objArr.length == 0) {
            return false;
        }
        int iX = aguu.X(obj);
        while (true) {
            int i = iX & this.g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iX = i + 1;
        }
    }

    @Override // defpackage.agjw
    public final int d() {
        return this.e;
    }

    @Override // defpackage.agjw
    public final int e() {
        return 0;
    }

    @Override // defpackage.agkz
    public final agke h() {
        return agke.i(this.b, this.e);
    }

    @Override // defpackage.agkz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return false;
    }

    @Override // defpackage.agjw
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
