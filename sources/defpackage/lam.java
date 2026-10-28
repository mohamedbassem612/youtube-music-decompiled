package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lam extends laq {
    final /* synthetic */ String a = "Error with data collection. Data lost.";
    final /* synthetic */ Object b;
    final /* synthetic */ lay c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lam(lay layVar, Object obj) {
        super(layVar, false);
        this.b = obj;
        this.c = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.c.e;
        kro.l(kzjVar);
        kzjVar.logHealthData(5, this.a, new kun(this.b), new kun(null), new kun(null));
    }
}
