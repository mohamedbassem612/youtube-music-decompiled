package defpackage;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class nzh implements nrg {
    final /* synthetic */ nzi b;

    public nzh(nzi nziVar) {
        this.b = nziVar;
    }

    @Override // defpackage.nrg
    public final nri a(fhd fhdVar, int i) {
        fhd fhdVar2;
        nzk nzkVarAk;
        boolean z;
        ci ciVar;
        nzi nziVar = this.b;
        long j = nziVar.f;
        if (j > 0 && (SystemClock.elapsedRealtimeNanos() / 1000) - nziVar.g.get() > j * 60000000) {
            nziVar.f();
        }
        ntt nttVar = (ntt) fhdVar.l(ntt.class);
        boolean z2 = nttVar != null && nttVar.b.compareAndSet(true, false);
        int i2 = 6;
        if (nziVar.h && (ciVar = nziVar.l) != null) {
            nzkVarAk = ciVar.ak();
            if (nzkVarAk.a) {
                if (nzi.b.compareAndSet(true, false)) {
                    nziVar.j.n();
                }
                if (i == 6) {
                    fhdVar.r(true);
                } else {
                    i2 = i;
                }
                return new nza(i2, nziVar.e, nziVar.c, nziVar.d, fhdVar, z2, nzkVarAk);
            }
            fhdVar2 = fhdVar;
            if (i == 6) {
                if (fhdVar2.u()) {
                    i = 6;
                } else {
                    fhdVar2.r(false);
                }
            }
            return nri.a;
        }
        fhdVar2 = fhdVar;
        nzkVarAk = null;
        if (i == 6) {
            z = nza.h(6, nziVar.i) || fhdVar2.u();
            fhdVar2.r(z);
        } else {
            z = false;
        }
        if (nza.h(i, nziVar.i) || z) {
            if (nzi.b.compareAndSet(true, false)) {
                nziVar.j.n();
            }
            return new nza(i, nziVar.e, nziVar.c, nziVar.d, fhdVar2, z2, nzkVarAk);
        }
        return nri.a;
    }

    @Override // defpackage.nrg
    public final boolean b() {
        return true;
    }

    @Override // defpackage.nrg
    public final /* synthetic */ Map c(fly flyVar) {
        return qnl.bz(this, flyVar);
    }
}
