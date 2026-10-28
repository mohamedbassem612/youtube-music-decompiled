package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xzj implements xzf {
    public final tun a;
    private final ScheduledExecutorService b;
    private final xla c;
    private ScheduledFuture d;

    public xzj(tun tunVar, ScheduledExecutorService scheduledExecutorService, xla xlaVar) {
        tunVar.getClass();
        this.a = tunVar;
        scheduledExecutorService.getClass();
        this.b = scheduledExecutorService;
        xlaVar.getClass();
        this.c = xlaVar;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.d = null;
        }
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        xla xlaVar = this.c;
        boolean zAt = xzcVar.at("opf");
        long J = xlaVar.J() * 1000;
        if (!zAt || J <= 0) {
            J = 300000;
        }
        this.d = this.b.scheduleAtFixedRate(new xzi(this, xzcVar, J), J, J, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void jv(xzc xzcVar) {
    }
}
