package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class joy extends xrw {
    final /* synthetic */ dii a;
    final /* synthetic */ joz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joy(joz jozVar, dii diiVar, xre xreVar, Boolean bool, dov dovVar, xrd xrdVar, tbt tbtVar, dii diiVar2) {
        super(diiVar, xreVar, bool, dovVar, xrdVar, tbtVar);
        this.a = diiVar2;
        this.b = jozVar;
    }

    @Override // defpackage.xrw
    public final void a() {
        joz jozVar = this.b;
        dii diiVar = this.a;
        jozVar.m(diiVar, jozVar.U);
        ((xru) jozVar.i.io()).a(diiVar);
        jozVar.y.setVisibility(8);
    }
}
