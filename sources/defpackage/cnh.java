package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cnh extends cpa {
    public cnf a;
    private final boolean c;
    private final btm d;
    private final btl e;
    private cne f;
    private boolean g;
    private boolean h;
    private boolean i;

    public cnh(cno cnoVar, boolean z) {
        boolean z2;
        super(cnoVar);
        if (z) {
            cnoVar.E();
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        this.d = new btm();
        this.e = new btl();
        cnoVar.D();
        this.a = cnf.q(cnoVar.jF());
    }

    private final Object I(Object obj) {
        cnf cnfVar = this.a;
        Object obj2 = cnf.c;
        return (cnfVar.d == null || !obj.equals(cnf.c)) ? obj : this.a.d;
    }

    private final boolean J(long j) {
        cne cneVar = this.f;
        int iA = this.a.a(cneVar.a.a);
        if (iA == -1) {
            return false;
        }
        cnf cnfVar = this.a;
        btl btlVar = this.e;
        cnfVar.d(iA, btlVar, false);
        long j2 = btlVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        cneVar.e = j;
        return true;
    }

    @Override // defpackage.cpa
    protected final void b(btn btnVar) {
        cnm cnmVarA = null;
        if (this.h) {
            this.a = this.a.p(btnVar);
            cne cneVar = this.f;
            if (cneVar != null) {
                J(cneVar.e);
            }
        } else if (btnVar.n()) {
            this.a = this.i ? this.a.p(btnVar) : new cnf(btnVar, btm.a, cnf.c);
        } else {
            btm btmVar = this.d;
            btnVar.e(0, btmVar, 0L);
            long j = btmVar.m;
            Object obj = btmVar.b;
            cne cneVar2 = this.f;
            if (cneVar2 != null) {
                cnf cnfVar = this.a;
                btl btlVar = this.e;
                cnfVar.m(cneVar2.a.a, btlVar);
                long j2 = btlVar.f + cneVar2.b;
                this.a.e(0, btmVar, 0L);
                if (j2 != btmVar.m) {
                    j = j2;
                }
            }
            Pair pairK = btnVar.k(btmVar, this.e, 0, j);
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            this.a = this.i ? this.a.p(btnVar) : new cnf(btnVar, obj, obj2);
            cne cneVar3 = this.f;
            if (cneVar3 != null && J(jLongValue)) {
                cnm cnmVar = cneVar3.a;
                cnmVarA = cnmVar.a(I(cnmVar.a));
            }
        }
        this.i = true;
        this.h = true;
        z(this.a);
        if (cnmVarA != null) {
            cne cneVar4 = this.f;
            cneVar4.getClass();
            cneVar4.k(cnmVarA);
        }
    }

    @Override // defpackage.cms, defpackage.cmi
    public final void jI() {
        this.h = false;
        this.g = false;
        super.jI();
    }

    @Override // defpackage.cpa, defpackage.cmi, defpackage.cno
    public final void jJ(bss bssVar) {
        if (this.i) {
            cnf cnfVar = this.a;
            btn btnVar = cnfVar.b;
            this.a = cnfVar.p(btnVar instanceof cox ? new cox(((cox) btnVar).b, bssVar) : new cox(btnVar, bssVar));
        } else {
            this.a = cnf.q(bssVar);
        }
        this.b.jJ(bssVar);
    }

    @Override // defpackage.cpa, defpackage.cno
    public final void k(cnk cnkVar) {
        cne cneVar = (cne) cnkVar;
        cnk cnkVar2 = cneVar.d;
        if (cnkVar2 != null) {
            cno cnoVar = cneVar.c;
            cnoVar.getClass();
            cnoVar.k(cnkVar2);
        }
        if (cnkVar == this.f) {
            this.f = null;
        }
    }

    @Override // defpackage.cpa, defpackage.cno
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final cne c(cnm cnmVar, cra craVar, long j) {
        cne cneVar = new cne(cnmVar, craVar, j);
        ahno.O(cneVar.c == null);
        cneVar.c = this.b;
        if (this.h) {
            cneVar.k(cnmVar.a(I(cnmVar.a)));
        } else {
            this.f = cneVar;
            if (!this.g) {
                this.g = true;
                H();
            }
        }
        return cneVar;
    }

    @Override // defpackage.cpa
    protected final cnm o(cnm cnmVar) {
        cnf cnfVar = this.a;
        Object obj = cnf.c;
        Object obj2 = cnfVar.d;
        Object obj3 = cnmVar.a;
        if (obj2 != null && this.a.d.equals(obj3)) {
            obj3 = cnf.c;
        }
        return cnmVar.a(obj3);
    }

    @Override // defpackage.cpa
    public final void q() {
        if (this.c) {
            return;
        }
        this.g = true;
        H();
    }
}
