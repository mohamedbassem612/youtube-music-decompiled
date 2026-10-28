package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avgn extends aveh {
    final /* synthetic */ Status a;
    final /* synthetic */ atxy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avgn(avgo avgoVar, atxy atxyVar, Status status) {
        super(avgoVar.a);
        this.b = atxyVar;
        this.a = status;
    }

    @Override // defpackage.aveh
    public final void a() {
        this.b.q(this.a, new avbe());
    }
}
