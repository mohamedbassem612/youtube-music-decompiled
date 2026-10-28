package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lah extends laq {
    final /* synthetic */ lay a;
    final /* synthetic */ kzl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lah(lay layVar, kzl kzlVar) {
        super(layVar, true);
        this.b = kzlVar;
        this.a = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.a.e;
        kro.l(kzjVar);
        kzjVar.getCachedAppInstanceId(this.b);
    }

    @Override // defpackage.laq
    protected final void b() {
        this.b.a(null);
    }
}
