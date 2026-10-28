package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class law extends laq {
    final /* synthetic */ kzv a;
    final /* synthetic */ kzl b;
    final /* synthetic */ afjp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public law(afjp afjpVar, kzv kzvVar, kzl kzlVar) {
        super((lay) afjpVar.a, true);
        this.a = kzvVar;
        this.b = kzlVar;
        this.c = afjpVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = ((lay) this.c.a).e;
        kro.l(kzjVar);
        kzjVar.onActivitySaveInstanceStateByScionActivityInfo(this.a, this.b, this.g);
    }
}
