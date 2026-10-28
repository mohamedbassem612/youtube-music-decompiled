package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aees implements aeem {
    final /* synthetic */ aeem a;
    final /* synthetic */ alhq b;
    final /* synthetic */ xgn c;

    public aees(aeem aeemVar, alhq alhqVar, xgn xgnVar) {
        this.a = aeemVar;
        this.b = alhqVar;
        this.c = xgnVar;
    }

    @Override // defpackage.aeem
    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        aeem aeemVar = this.a;
        aefl aeflVar = (aefl) obj;
        if (aeemVar != null) {
            aeemVar.a(aeflVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    @Override // defpackage.aeem
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        byte[] bArrG;
        aeem aeemVar = this.a;
        aefl aeflVar = (aefl) obj;
        if (aeemVar != null) {
            aeemVar.b(aeflVar);
        }
        alhq alhqVar = this.b;
        xgn xgnVar = this.c;
        if ((alhqVar.b & 2) == 0) {
            bArrG = null;
        } else {
            alhn alhnVar = alhqVar.d;
            if (alhnVar == null) {
                alhnVar = alhn.a;
            }
            if (alhnVar.b == 106514900) {
                alhn alhnVar2 = alhqVar.d;
                if (alhnVar2 == null) {
                    alhnVar2 = alhn.a;
                }
                bArrG = (alhnVar2.b == 106514900 ? (alhj) alhnVar2.c : alhj.a).h.G();
            } else {
                bArrG = null;
            }
        }
        if (xgnVar == null || bArrG == null) {
            return;
        }
        xgnVar.w(new xgj(bArrG), null);
    }
}
