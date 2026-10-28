package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakh implements aant {
    public final aauk a;
    public final aanb b;
    private final ahex c;
    private final ScheduledExecutorService d;
    private final tbt e;

    public aakh(aanb aanbVar, ahex ahexVar, ScheduledExecutorService scheduledExecutorService, tbt tbtVar, aauk aaukVar) {
        this.b = aanbVar;
        this.c = ahexVar;
        this.d = scheduledExecutorService;
        this.e = tbtVar;
        this.a = aaukVar;
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        return aans.c;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, aofh aofhVar) {
        String strH = wfs.h(aofhVar.d);
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i == 2) {
            return ahng.u(ahno.ap(new vtq((Object) this, zwaVar, strH, 12), this.c), 30L, TimeUnit.SECONDS, this.d);
        }
        if (i != 4) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 23;
            return ahng.n(aanoVar.a());
        }
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        return ahng.u(ahno.ap(new hlm((Object) this, zwaVar, strH, aofgVar, 17), this.c), 30L, TimeUnit.SECONDS, this.d);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        throw new UnsupportedOperationException();
    }

    public final void d(String str) {
        this.e.c(new aaid(str));
    }
}
