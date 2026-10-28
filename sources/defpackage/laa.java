package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class laa extends laq {
    final /* synthetic */ kzv a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ lay d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laa(lay layVar, kzv kzvVar, String str, String str2) {
        super(layVar, true);
        this.a = kzvVar;
        this.b = str;
        this.c = str2;
        this.d = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.d.e;
        kro.l(kzjVar);
        kzjVar.setCurrentScreenByScionActivityInfo(this.a, this.b, this.c, this.f);
    }
}
