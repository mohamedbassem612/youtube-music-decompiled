package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cnf extends cna {
    public static final Object c = new Object();
    public final Object d;
    private final Object e;

    public cnf(btn btnVar, Object obj, Object obj2) {
        super(btnVar);
        this.e = obj;
        this.d = obj2;
    }

    public static cnf q(bss bssVar) {
        return new cnf(new cng(bssVar), btm.a, c);
    }

    @Override // defpackage.cna, defpackage.btn
    public final int a(Object obj) {
        Object obj2;
        if (c.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.a(obj);
    }

    @Override // defpackage.cna, defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        this.b.d(i, btlVar, z);
        if (Objects.equals(btlVar.b, this.d) && z) {
            btlVar.b = c;
        }
        return btlVar;
    }

    @Override // defpackage.cna, defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        this.b.e(i, btmVar, j);
        if (Objects.equals(btmVar.b, this.e)) {
            btmVar.b = btm.a;
        }
        return btmVar;
    }

    @Override // defpackage.cna, defpackage.btn
    public final Object f(int i) {
        Object objF = this.b.f(i);
        return Objects.equals(objF, this.d) ? c : objF;
    }

    public final cnf p(btn btnVar) {
        return new cnf(btnVar, this.e, this.d);
    }
}
