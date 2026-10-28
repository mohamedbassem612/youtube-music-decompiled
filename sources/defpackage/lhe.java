package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhe extends lbb {
    public long a;
    public long b;
    public final lbw c;

    public lhe(ldr ldrVar) {
        super(ldrVar);
        this.c = new lhd(this, this.t);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime;
        this.b = jElapsedRealtime;
    }

    final long a(long j) {
        long j2 = j - this.b;
        this.b = j;
        return j2;
    }

    public final boolean c(boolean z, boolean z2, long j) {
        o();
        if (this.t.w()) {
            J().k.b(System.currentTimeMillis());
        }
        long jA = j - this.a;
        if (!z && jA < 1000) {
            aT().k.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jA));
            return false;
        }
        if (!z2) {
            jA = a(j);
        }
        aT().k.b("Recording user engagement, ms", Long.valueOf(jA));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jA);
        lga.N(l().t(!G().p()), bundle, true);
        if (!z2) {
            i().N("auto", "_e", bundle);
        }
        this.a = j;
        lbw lbwVar = this.c;
        lbwVar.a();
        lbwVar.c(((Long) lcl.aw.b(null)).longValue());
        return true;
    }

    public final void d() {
        this.c.a();
    }
}
