package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdr extends aveh {
    final /* synthetic */ avds a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avdr(avds avdsVar) {
        super(avdsVar.b.f);
        this.a = avdsVar;
    }

    @Override // defpackage.aveh
    public final void a() {
        int i = avky.a;
        avds avdsVar = this.a;
        if (avdsVar.a == null) {
            try {
                avdsVar.c.t();
            } catch (Throwable th) {
                this.a.b(Status.b.c(th).withDescription("Failed to call onReady."));
            }
        }
    }
}
