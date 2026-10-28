package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avem extends aveh {
    final Status a;
    final atxy b;

    public avem(aveo aveoVar, atxy atxyVar, Status status) {
        super(aveoVar.c);
        this.b = atxyVar;
        this.a = status;
    }

    @Override // defpackage.aveh
    public final void a() {
        this.b.q(this.a, new avbe());
    }
}
