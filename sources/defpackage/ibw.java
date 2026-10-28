package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibw implements xzf {
    final /* synthetic */ aesp a;
    private ibv b = ibv.LOOP_OFF;

    public ibw(aesp aespVar) {
        this.a = aespVar;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        aesp aespVar = this.a;
        aespVar.v();
        xzcVar.az((zik) aespVar.h);
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        aesp aespVar = this.a;
        this.b = (ibv) ((heg) aespVar.i).a;
        aespVar.v();
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        aesp aespVar = this.a;
        aespVar.v();
        if (aespVar.w()) {
            xzcVar.ay((zik) aespVar.h);
            aespVar.t(this.b, true);
            this.b = ibv.LOOP_OFF;
        }
    }
}
