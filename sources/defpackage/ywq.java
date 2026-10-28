package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ywq extends ywd {
    private boolean a;

    @Override // defpackage.ywd, defpackage.ywj
    public final void A(long j, long j2, ywk ywkVar, boolean z, long j3, zgs zgsVar) {
        this.a = true;
        super.A(j, j2, ywkVar, z, j3, zgsVar);
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void e() {
        this.a = false;
        super.e();
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void g() {
        if (this.a) {
            h(new zhz("player.exception", 0L, "c.extraneousEndedEvent;".concat(String.valueOf(zhf.g(new Throwable())))));
        } else {
            this.a = true;
            super.g();
        }
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void m() {
        this.a = false;
        super.m();
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void n() {
        this.a = false;
        super.n();
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void o(long j, appa appaVar) {
        this.a = false;
        super.o(j, appaVar);
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void q() {
        this.a = false;
        super.q();
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void v(long j, appa appaVar) {
        this.a = false;
        super.v(j, appaVar);
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void w(long j, appa appaVar) {
        this.a = false;
        super.w(j, appaVar);
    }

    @Override // defpackage.ywd, defpackage.yxg
    public final void y() {
        this.a = false;
        super.y();
    }
}
