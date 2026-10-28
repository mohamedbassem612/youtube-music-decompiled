package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzz extends laq {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ lay c;
    final /* synthetic */ kzl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzz(lay layVar, String str, String str2, kzl kzlVar) {
        super(layVar, true);
        this.a = str;
        this.b = str2;
        this.d = kzlVar;
        this.c = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.c.e;
        kro.l(kzjVar);
        kzjVar.getConditionalUserProperties(this.a, this.b, this.d);
    }

    @Override // defpackage.laq
    protected final void b() {
        this.d.a(null);
    }
}
