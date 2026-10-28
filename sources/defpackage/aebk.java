package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aebk implements nxw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aebk(aebl aeblVar, ntw ntwVar, int i, acxm acxmVar, avmm avmmVar, int i2) {
        this.$cid = i2;
        this.b = aeblVar;
        this.c = ntwVar;
        this.a = i;
        this.d = acxmVar;
        this.e = avmmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, nay] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nth] */
    @Override // defpackage.nxw
    public final fgy a(fhd fhdVar, nsl nslVar) {
        if (this.$cid != 0) {
            ArrayList arrayList = new ArrayList();
            Object obj = this.d;
            int i = this.a;
            ?? r4 = this.e;
            fgy fgyVarD = ((meo) this.c).d(fhdVar, nslVar, this.b, r4, arrayList, i, (kjc) obj, false);
            meo.c(agke.n(arrayList), nslVar);
            return fgyVarD;
        }
        nsk nskVar = new nsk(nslVar);
        int i2 = this.a;
        ntx ntxVarA = ((ntw) this.c).a();
        aebl aeblVar = (aebl) this.b;
        aeblVar.p(nskVar, ntxVarA, i2, aeblVar.e, aeblVar.f);
        nsl nslVarA = nskVar.a();
        aeblVar.g.b();
        adat adatVar = new adat(aeblVar.b);
        Object obj2 = this.d;
        return aeblVar.k.b(fhdVar, nslVarA, (acxm) obj2, adatVar, (avmm) this.e);
    }

    public /* synthetic */ aebk(meo meoVar, nay nayVar, nth nthVar, int i, kjc kjcVar, int i2) {
        this.$cid = i2;
        this.c = meoVar;
        this.b = nayVar;
        this.e = nthVar;
        this.a = i;
        this.d = kjcVar;
    }
}
