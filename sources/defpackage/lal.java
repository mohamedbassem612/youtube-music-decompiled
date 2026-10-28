package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lal extends laq {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ lay d;
    final /* synthetic */ kzl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lal(lay layVar, String str, String str2, boolean z, kzl kzlVar) {
        super(layVar, true);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.e = kzlVar;
        this.d = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        kzj kzjVar = this.d.e;
        kro.l(kzjVar);
        kzjVar.getUserProperties(this.a, this.b, this.c, this.e);
    }

    @Override // defpackage.laq
    protected final void b() {
        this.e.a(null);
    }
}
