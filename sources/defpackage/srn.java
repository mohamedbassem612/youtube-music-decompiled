package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class srn implements adud {
    final /* synthetic */ int a;
    final /* synthetic */ srp b;

    public srn(srp srpVar, int i) {
        this.a = i;
        this.b = srpVar;
    }

    @Override // defpackage.adud
    public final /* bridge */ /* synthetic */ void a(Object obj, acjx acjxVar) {
        srp srpVar = this.b;
        srpVar.C(this.a);
        super/*advj*/.hs((wga) obj, acjxVar);
    }

    @Override // defpackage.adud
    public final void b(toe toeVar, acjx acjxVar) {
        srp srpVar = this.b;
        srpVar.C(this.a);
        super/*advj*/.ht(toeVar, acjxVar);
    }
}
