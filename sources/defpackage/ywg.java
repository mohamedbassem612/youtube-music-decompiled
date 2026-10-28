package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ywg implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ywg(Object obj, long j, long j2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ((ywh) this.c).b.k(this.a, this.b);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                tau tauVar = tau.PROOF_OF_ORIGIN_REINITIALIZED_TOKEN_MINT_STARTED;
                long j = this.a;
                xir xirVar = ((zfo) this.c).d;
                xirVar.g(tauVar, j);
                xirVar.g(tau.PROOF_OF_ORIGIN_REINITIALIZED_TOKEN_MINT_FINISHED, this.b);
                return;
            }
            tau tauVar2 = tau.PROOF_OF_ORIGIN_UNINITIALIZED_TOKEN_MINT_STARTED;
            long j2 = this.a;
            xir xirVar2 = ((zfj) this.c).e;
            xirVar2.g(tauVar2, j2);
            xirVar2.g(tau.PROOF_OF_ORIGIN_UNINITIALIZED_TOKEN_MINT_FINISHED, this.b);
            return;
        }
        final yay yayVar = (yay) this.c;
        AtomicBoolean atomicBoolean = yayVar.m;
        final xvn xvnVar = yayVar.k;
        if (atomicBoolean.get() || yayVar.o <= 0) {
            if (atomicBoolean.get() || yayVar.o > 0) {
                return;
            }
            xyq xyqVar = xyq.LAUNCH_FAIL_TIMEOUT;
            ((agrc) ((agrc) yay.a.b().i(agso.a, "MDX.Dial")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSession", "scheduleWakeupStatusCheck", 461, "DialSession.java")).B("Could not wake up DIAL device  %s %s", xvnVar, xyqVar);
            yayVar.F.w(16, "d_lwf");
            yayVar.aD(xyqVar, amyu.MDX_SESSION_DISCONNECT_REASON_DIAL_WAKE_ON_LAN_FAILED, Optional.empty());
            return;
        }
        long j3 = this.b;
        long j4 = this.a;
        yayVar.f.c(new xnu() { // from class: yav
            @Override // defpackage.xnu
            public final void a(xvn xvnVar2) {
                xwc xwcVar = xvnVar2.n;
                xvn xvnVar3 = xvnVar;
                if (xwcVar.equals(xvnVar3.n)) {
                    yay yayVar2 = yayVar;
                    if (yayVar2.m.getAndSet(true)) {
                        return;
                    }
                    agrx agrxVar = agso.a;
                    String str = xvnVar2.c;
                    xog xogVar = yayVar2.l;
                    if (xogVar != null) {
                        xogVar.b();
                        yayVar2.l = null;
                    }
                    xvm xvmVar = new xvm(xvnVar2);
                    xvmVar.d(xvnVar3.k);
                    yayVar2.k = xvmVar.a();
                    yayVar2.F.w(16, "d_lws");
                    yayVar2.E.l(16);
                    yayVar2.aH();
                }
            }

            @Override // defpackage.xnu
            public final /* synthetic */ void b() {
            }
        }, false);
        long jB = yayVar.g.b() - j4;
        long j5 = yayVar.o;
        if (jB > 0) {
            j3 = jB;
        }
        yayVar.o = j5 - j3;
        yayVar.aI(yayVar.n);
    }
}
