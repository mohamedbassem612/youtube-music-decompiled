package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avds implements avdw {
    public Status a;
    final /* synthetic */ avdt b;
    public final atxy c;

    public avds(avdt avdtVar, atxy atxyVar) {
        this.b = avdtVar;
        this.c = atxyVar;
    }

    @Override // defpackage.avdw
    public final void a(Status status, avdv avdvVar, avbe avbeVar) {
        int i = avky.a;
        avdt avdtVar = this.b;
        auzi auziVarF = avdtVar.f();
        if (status.getCode() == Status.Code.CANCELLED && auziVarF != null) {
            if (auziVarF.b) {
                status = avdtVar.g.a();
                avbeVar = new avbe();
            } else if (auziVarF.a - System.nanoTime() <= 0) {
                auziVarF.b = true;
                status = avdtVar.g.a();
                avbeVar = new avbe();
            }
        }
        avdtVar.d.execute(new avdq(this, status, avbeVar));
    }

    public final void b(Status status) {
        this.a = status;
        this.b.i.h(status);
    }

    @Override // defpackage.avdw
    public final void c(avbe avbeVar) {
        int i = avky.a;
        this.b.d.execute(new avdo(this, avbeVar));
    }

    @Override // defpackage.avkb
    public final void d() {
        avbg avbgVar = avbg.a;
        avdt avdtVar = this.b;
        avbg avbgVar2 = avdtVar.c.a;
        if (avbgVar2 == avbgVar || avbgVar2 == avbg.c) {
            return;
        }
        int i = avky.a;
        avdtVar.d.execute(new avdr(this));
    }

    @Override // defpackage.avkb
    public final void e(auym auymVar) {
        int i = avky.a;
        this.b.d.execute(new avdp(this, auymVar));
    }
}
