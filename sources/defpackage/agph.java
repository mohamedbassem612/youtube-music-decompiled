package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agph extends agjt {
    static final agph b = new agph();
    final transient Object[] c;
    public final transient agph d;
    private final transient Object e;
    private final transient int f;
    private final transient int g;

    public agph(Object[] objArr, int i) {
        this.c = objArr;
        this.g = i;
        this.f = 0;
        int iF = i >= 2 ? agkz.f(i) : 0;
        this.e = agpn.b(objArr, i, iF, 0);
        this.d = new agph(agpn.b(objArr, i, iF, 1), objArr, i, this);
    }

    @Override // defpackage.agjt
    public final agjt c() {
        return this.d;
    }

    @Override // defpackage.agkj, java.util.Map
    public final Object get(Object obj) {
        Object objC = agpn.c(this.e, this.c, this.g, this.f, obj);
        if (objC == null) {
            return null;
        }
        return objC;
    }

    @Override // defpackage.agkj, java.util.Map
    /* JADX INFO: renamed from: s */
    public final agkz entrySet() {
        return new agpk(this, this.c, this.f, this.g);
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.agkj, java.util.Map
    /* JADX INFO: renamed from: t */
    public final agkz keySet() {
        return new agpl(this, new agpm(this.c, this.f, this.g));
    }

    @Override // defpackage.agkj
    public final boolean u() {
        return false;
    }

    @Override // defpackage.agjt, defpackage.agkj
    public Object writeReplace() {
        return super.writeReplace();
    }

    private agph(Object obj, Object[] objArr, int i, agph agphVar) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = agphVar;
    }

    private agph() {
        this.e = null;
        this.c = new Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }
}
