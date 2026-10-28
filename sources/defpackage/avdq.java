package defpackage;

import io.grpc.Status;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdq extends aveh {
    final /* synthetic */ Status a;
    final /* synthetic */ avbe b;
    final /* synthetic */ avds c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avdq(avds avdsVar, Status status, avbe avbeVar) {
        super(avdsVar.b.f);
        this.a = status;
        this.b = avbeVar;
        this.c = avdsVar;
    }

    @Override // defpackage.aveh
    public final void a() {
        int i = avky.a;
        avds avdsVar = this.c;
        avdsVar.b.g.b();
        Status status = this.a;
        avbe avbeVar = this.b;
        Status status2 = avdsVar.a;
        if (status2 != null) {
            avbeVar = new avbe();
            status = status2;
        }
        try {
            try {
                avdsVar.c.q(status, avbeVar);
            } catch (RuntimeException e) {
                avdt.a.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
            }
            this.c.b.e.a(status.e());
        } catch (Throwable th) {
            this.c.b.e.a(status.e());
            throw th;
        }
    }
}
