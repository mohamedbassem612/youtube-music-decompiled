package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeit extends aeir {
    private ScheduledFuture k;

    public aeit(aeis aeisVar) {
        super(aeisVar, aipb.MINI_APP_STATE_USER_ACTIVE, aeisVar.f);
    }

    @Override // defpackage.aeir
    public final void j() {
        this.h = new aehz(this, 6);
        this.i = new aehz(this, 7);
        g(aipa.MINI_APP_EVENT_USER_INTERACTION, null, null, new aeio(this, 2));
        g(aipa.MINI_APP_EVENT_USER_IDLE, this.j.i, new aeil(this, 3), null);
    }

    public final void k() {
        ScheduledFuture scheduledFuture = this.k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.k = null;
        }
    }

    public final void l() {
        if (d()) {
            m();
        }
    }

    public final void m() {
        k();
        aeis aeisVar = this.j;
        if (aeisVar.a() && aeisVar.k) {
            ScheduledExecutorService scheduledExecutorService = aeisVar.a;
            aehz aehzVar = new aehz(this, 8);
            long j = aeisVar.n;
            if (j <= 0) {
                j = 30000;
            }
            this.k = scheduledExecutorService.schedule(aehzVar, j, TimeUnit.MILLISECONDS);
        }
    }
}
