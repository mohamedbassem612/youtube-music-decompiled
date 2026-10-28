package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhi implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ long a;
    final /* synthetic */ lbb b;

    public lhi(lbb lbbVar, long j, int i) {
        this.$cid = i;
        this.a = j;
        this.b = lbbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            ((lba) this.b).f(this.a);
            return;
        }
        lbb lbbVar = this.b;
        lbbVar.o();
        lhj lhjVar = (lhj) lbbVar;
        lhjVar.t();
        lcx lcxVar = lbbVar.aT().k;
        long j = this.a;
        lcxVar.b("Activity resumed, time", Long.valueOf(j));
        if (lbbVar.G().p() || lhjVar.a) {
            lhe lheVar = lhjVar.b;
            lheVar.o();
            lheVar.c.a();
            lheVar.a = j;
            lheVar.b = j;
        }
        lhc lhcVar = lhjVar.c;
        lhcVar.o();
        if (lhcVar.a != null) {
            lhcVar.m().s().removeCallbacks(lhcVar.a);
        }
        lhcVar.m().u(false);
        if (((Boolean) lcl.bg.b(null)).booleanValue()) {
            ler lerVarI = lhcVar.i();
            lerVarI.o();
            lerVarI.a();
            lff lffVarJ = lerVarI.j();
            lffVarJ.o();
            lffVarJ.a();
            if (!lffVarJ.T() || lffVarJ.L().k() >= 262300) {
                lff lffVarJ2 = lerVarI.j();
                lffVarJ2.o();
                lffVarJ2.a();
                lffVarJ2.B(new lfa(lffVarJ2, lffVarJ2.s(true), 0));
            }
        }
        lbb lbbVar2 = lhjVar.d;
        lbbVar2.o();
        if (lbbVar2.t.w()) {
            lbbVar2.r(System.currentTimeMillis(), SystemClock.elapsedRealtime());
        }
    }
}
