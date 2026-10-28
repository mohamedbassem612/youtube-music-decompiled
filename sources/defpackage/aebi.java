package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aebi implements advz {
    private final xgn a;
    private final ntx b;
    private final aebh c;
    private final ntu d;
    private final awmd e;
    private final awmd f;
    private aecs g;
    private final mlo h;
    private final afip i;

    public aebi(mlo mloVar, vxz vxzVar, xgm xgmVar, ntu ntuVar, afip afipVar, awmd awmdVar, awmd awmdVar2) {
        ntw ntwVarA = ntx.a(mloVar.a);
        ntwVarA.c(false);
        ntx ntxVarA = ntwVarA.a();
        this.h = mloVar;
        this.a = xgmVar.hB();
        this.b = ntxVarA;
        this.c = new aebh(ntxVarA, vxzVar);
        this.d = ntuVar;
        this.i = afipVar;
        this.e = awmdVar;
        this.f = awmdVar2;
    }

    @Override // defpackage.advz
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aebp a(RecyclerView recyclerView, admo admoVar, adwq adwqVar) {
        return new aebp(this.c, recyclerView, admoVar, this.h, this.a, this.b, this.d, this.i, this.e, this.f, this.g, adwqVar);
    }

    public aebi(mlo mloVar, xgn xgnVar, adbv adbvVar, vxz vxzVar, adcd adcdVar, ntu ntuVar, afip afipVar, awmd awmdVar, awmd awmdVar2) {
        this.h = mloVar;
        this.a = xgnVar;
        this.b = null;
        this.c = new aebh(vxzVar, adbvVar, adcdVar);
        this.d = ntuVar;
        this.i = afipVar;
        this.e = awmdVar;
        this.f = awmdVar2;
    }

    public aebi(mlo mloVar, ntx ntxVar, vxz vxzVar, xgn xgnVar, ntu ntuVar, afip afipVar, awmd awmdVar, awmd awmdVar2, aecs aecsVar) {
        this.h = mloVar;
        this.a = xgnVar;
        this.b = ntxVar;
        this.c = new aebh(ntxVar, vxzVar);
        this.d = ntuVar;
        this.i = afipVar;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.g = aecsVar;
    }
}
