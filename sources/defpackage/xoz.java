package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xoz implements xzf {
    final /* synthetic */ xvr a;
    final /* synthetic */ xzc b;
    final /* synthetic */ avmm c;
    final /* synthetic */ avpr d;

    public xoz(xvr xvrVar, xzc xzcVar, avpr avprVar, avmm avmmVar) {
        this.a = xvrVar;
        this.b = xzcVar;
        this.d = avprVar;
        this.c = avmmVar;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        if (xpc.f(xzcVar, this.a, this.b)) {
            amyu amyuVarR = xzcVar.r();
            amyu amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
            avpr avprVar = this.d;
            if (amyuVarR == amyuVar) {
                avprVar.a();
            } else {
                avprVar.d(new xpb());
            }
        }
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        if (xpc.f(xzcVar, this.a, this.b)) {
            if (!ahno.aa(xzcVar.D())) {
                this.d.a();
                return;
            }
            avmm avmmVar = this.c;
            avmc avmcVarN = avmc.n(new wko(xzcVar, 7));
            avpr avprVar = this.d;
            avmmVar.c(avmcVarN.D(new xbo(avprVar, 11), new xbo(avprVar, 12)));
        }
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void h(xzc xzcVar) {
    }
}
