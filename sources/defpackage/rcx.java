package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rcx implements cgc {
    private final rcy a;

    public rcx(rcy rcyVar) {
        this.a = rcyVar;
    }

    @Override // defpackage.cgc
    public final void c(Exception exc) {
        rbc rbcVar = new rbc(rcz.m, rbd.c);
        rbcVar.a = exc;
        rbcVar.c();
        rbcVar.a("onAudioSinkError", new Object[0]);
    }

    @Override // defpackage.cgc
    public final void f(long j) {
        new rbc(rcz.m, rbd.a).a("onPositionAdvancing   playoutStartSystemTimeMs=%d  elapsedPlayoutStartMs=%d", Long.valueOf(j), Long.valueOf(System.currentTimeMillis() - j));
    }

    @Override // defpackage.cgc
    public final void g() {
        rbc rbcVar = new rbc(rcz.m, rbd.c);
        rbcVar.c();
        rbcVar.a("onPositionDiscontinuity", new Object[0]);
    }

    @Override // defpackage.cgc
    public final void j(int i, long j, long j2) {
        rbc rbcVar = new rbc(rcz.m, rbd.c);
        rbcVar.c();
        rbcVar.a("onUnderrun   bufferSize=%d  bufferSizeMs=%d  elapsedSinceLastFeedMs=%d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2));
        rcy rcyVar = this.a;
        Duration durationOfMillis = Duration.ofMillis(j2);
        rdr rdrVar = (rdr) rcyVar;
        if (rdrVar.q.a.O) {
            rdrVar.C(new plj(rcyVar, durationOfMillis, 15));
        }
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.cgc
    public final void i(boolean z) {
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void k(cri criVar) {
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void l(cri criVar) {
    }
}
