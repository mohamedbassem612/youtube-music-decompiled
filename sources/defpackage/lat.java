package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lat extends laq {
    final /* synthetic */ kzv a;
    final /* synthetic */ afjp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lat(afjp afjpVar, kzv kzvVar) {
        super((lay) afjpVar.a, true);
        this.a = kzvVar;
        this.b = afjpVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = ((lay) this.b.a).e;
        if (kzjVar == null) {
            throw new NullPointerException("null reference");
        }
        kzjVar.onActivityResumedByScionActivityInfo(this.a, this.g);
    }
}
