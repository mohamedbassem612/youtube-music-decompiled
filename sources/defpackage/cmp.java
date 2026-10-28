package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cmp extends cpa {
    private final boolean a;
    private final ArrayList c;
    private final btm d;
    private bsk e;
    private cmn f;
    private cmo g;
    private long h;
    private long i;

    public cmp(cmm cmmVar) {
        super(cmmVar.a);
        this.e = new bsk(cmmVar.b);
        this.a = cmmVar.c;
        this.c = new ArrayList();
        this.d = new btm();
    }

    private final boolean I() {
        if (this.c.isEmpty() || this.f == null) {
            return false;
        }
        boolean z = this.e.c;
        return true;
    }

    private final void n(btn btnVar) {
        long j;
        long j2;
        btm btmVar = this.d;
        int i = 0;
        btnVar.e(0, btmVar, 0L);
        long j3 = btmVar.q;
        if (I()) {
            j = this.h - j3;
            long j4 = this.i;
            j2 = j4 != Long.MIN_VALUE ? j4 - j3 : Long.MIN_VALUE;
        } else {
            bsk bskVar = this.e;
            j = bskVar.a;
            j2 = bskVar.b;
            boolean z = bskVar.d;
            this.h = j3 + j;
            this.i = j2 != Long.MIN_VALUE ? j3 + j2 : Long.MIN_VALUE;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((cml) arrayList.get(i2)).k(this.h, this.i);
            }
        }
        try {
            cmn cmnVar = new cmn(btnVar, j, j2, this.e.f);
            this.f = cmnVar;
            z(cmnVar);
        } catch (cmo e) {
            this.g = e;
            while (true) {
                ArrayList arrayList2 = this.c;
                if (i >= arrayList2.size()) {
                    return;
                }
                ((cml) arrayList2.get(i)).e = this.g;
                i++;
            }
        }
    }

    @Override // defpackage.cpa
    protected final void b(btn btnVar) {
        if (this.g == null) {
            n(btnVar);
        }
    }

    @Override // defpackage.cpa, defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        cnk cnkVarC = this.b.c(cnmVar, craVar, j);
        boolean z = this.e.e;
        cml cmlVar = new cml(cnkVarC, true, this.h, this.i, this.a);
        this.c.add(cmlVar);
        return cmlVar;
    }

    @Override // defpackage.cms, defpackage.cno
    public final void jG() throws cmo {
        cmo cmoVar = this.g;
        if (cmoVar != null) {
            throw cmoVar;
        }
        super.jG();
    }

    @Override // defpackage.cms, defpackage.cmi
    protected final void jI() {
        super.jI();
        this.g = null;
        this.f = null;
    }

    @Override // defpackage.cpa, defpackage.cmi, defpackage.cno
    public final void jJ(bss bssVar) {
        cmn cmnVar;
        boolean z = this.a;
        if (z) {
            bsk bskVar = this.e;
            this.e = bssVar.f;
            if (this.f != null && I()) {
                long j = this.f.b.e(0, this.d, 0L).m;
                boolean z2 = bskVar.d;
                bsk bskVar2 = this.e;
                boolean z3 = bskVar2.d;
                long j2 = this.h;
                long j3 = bskVar2.a;
                long j4 = j2 + (j3 - bskVar.a);
                this.h = j4;
                long j5 = bskVar2.b;
                this.i = j5 != Long.MIN_VALUE ? (j4 + j5) - j3 : Long.MIN_VALUE;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((cml) arrayList.get(i)).k(this.h, this.i);
                }
            }
        }
        cmn cmnVar2 = this.f;
        super.jJ(bssVar);
        if (z && (cmnVar = this.f) != null && cmnVar == cmnVar2) {
            n(cmnVar.b);
        }
    }

    @Override // defpackage.cpa, defpackage.cno
    public final void k(cnk cnkVar) {
        ArrayList arrayList = this.c;
        ahno.O(arrayList.remove(cnkVar));
        this.b.k(((cml) cnkVar).a);
        if (arrayList.isEmpty()) {
            boolean z = this.e.c;
            cmn cmnVar = this.f;
            cmnVar.getClass();
            n(cmnVar.b);
        }
    }
}
