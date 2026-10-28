package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhj extends auzx {
    final avhk b;

    public avhj(avhk avhkVar) {
        this.b = avhkVar;
    }

    @Override // defpackage.auzx
    public final axoz a() {
        return new axoz(Status.OK, (Object) this.b);
    }
}
