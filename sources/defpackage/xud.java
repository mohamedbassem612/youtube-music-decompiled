package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xud extends xrw {
    final /* synthetic */ dii a;
    final /* synthetic */ xue b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xud(xue xueVar, dii diiVar, xre xreVar, Boolean bool, dov dovVar, xrd xrdVar, tbt tbtVar, dii diiVar2) {
        super(diiVar, xreVar, bool, dovVar, xrdVar, tbtVar);
        this.a = diiVar2;
        this.b = xueVar;
    }

    @Override // defpackage.xrw
    public final void a() {
        xue xueVar = this.b;
        dii diiVar = this.a;
        xueVar.z(diiVar, xueVar.g);
        xueVar.i.f(amyv.MDX_SESSION_SOURCE_SUGGESTED_DEVICE);
        xueVar.f.a(diiVar);
    }
}
