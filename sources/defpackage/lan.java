package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lan extends laq {
    final /* synthetic */ String a;
    final /* synthetic */ lay b;
    final /* synthetic */ kzl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lan(lay layVar, String str, kzl kzlVar) {
        super(layVar, true);
        this.a = str;
        this.c = kzlVar;
        this.b = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.b.e;
        kro.l(kzjVar);
        kzjVar.getMaxUserProperties(this.a, this.c);
    }

    @Override // defpackage.laq
    protected final void b() {
        this.c.a(null);
    }
}
