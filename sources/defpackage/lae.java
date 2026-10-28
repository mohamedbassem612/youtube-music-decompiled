package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lae extends laq {
    final /* synthetic */ String a;
    final /* synthetic */ lay b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lae(lay layVar, String str) {
        super(layVar, true);
        this.a = str;
        this.b = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.b.e;
        kro.l(kzjVar);
        kzjVar.endAdUnitExposure(this.a, this.g);
    }
}
