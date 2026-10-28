package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rqi implements rpv {
    final /* synthetic */ sdo a;

    public rqi(sdo sdoVar) {
        this.a = sdoVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.rpv
    public final void b(wnq wnqVar) {
        sdo sdoVar = this.a;
        ?? r0 = sdoVar.b;
        if (r0 == 0 || !rmp.e(r0.e())) {
            airb airbVar = wnqVar.a;
            if (airbVar == null || (airbVar.b & 536870912) == 0 || !airbVar.p) {
                ((rqa) sdoVar.d).h(wnqVar, (ajwo) sdoVar.c, null);
            }
        }
    }

    @Override // defpackage.rpv
    public final void a() {
    }

    @Override // defpackage.rpv
    public final void c() {
    }
}
