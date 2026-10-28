package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdo extends aveh {
    final /* synthetic */ avbe a;
    final /* synthetic */ avds b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avdo(avds avdsVar, avbe avbeVar) {
        super(avdsVar.b.f);
        this.a = avbeVar;
        this.b = avdsVar;
    }

    @Override // defpackage.aveh
    public final void a() {
        int i = avky.a;
        avds avdsVar = this.b;
        if (avdsVar.a == null) {
            try {
                avdsVar.c.r(this.a);
            } catch (Throwable th) {
                this.b.b(Status.b.c(th).withDescription("Failed to read headers"));
            }
        }
    }
}
