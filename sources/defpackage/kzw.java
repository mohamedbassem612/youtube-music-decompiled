package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzw extends laq {
    final /* synthetic */ String a = "fcm";
    final /* synthetic */ String b = "_ln";
    final /* synthetic */ Object c;
    final /* synthetic */ lay d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzw(lay layVar, Object obj) {
        super(layVar, true);
        this.c = obj;
        this.d = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.d.e;
        kro.l(kzjVar);
        kzjVar.setUserProperty(this.a, this.b, new kun(this.c), true, this.f);
    }
}
