package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hws {
    public final /* synthetic */ Object a;

    public hws(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wek] */
    public final weh a(tzk tzkVar) {
        return tzkVar.I(this.a);
    }

    @tcc
    public void handlePlaybackServiceException(aboe aboeVar) {
        if (aboeVar.j == 10) {
            hwt hwtVar = (hwt) this.a;
            if (!hwtVar.f || hwtVar.g >= hwtVar.c.e) {
                return;
            }
            Handler handler = hwtVar.b;
            Runnable runnable = hwtVar.e;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 3000L);
        }
    }

    @tcc
    public void handleSequencerStageEvent(aayw aaywVar) {
        wjf wjfVar = aaywVar.c;
        if (wjfVar == null || aaywVar.b != abnw.d) {
            return;
        }
        ((hwt) this.a).f = wjfVar.R();
    }

    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        if (aazjVar.a.d()) {
            hwt hwtVar = (hwt) this.a;
            hwtVar.b.removeCallbacks(hwtVar.e);
            hwtVar.g = 0;
        }
    }
}
