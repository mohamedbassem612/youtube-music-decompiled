package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rdf implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rdf(int i) {
        this.$cid = i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            rbc rbcVar = new rbc(rdi.k, rbd.e);
            rbcVar.a = th;
            rbcVar.c();
            rbcVar.a("Uncaught exception on the frame renderer thread.", new Object[0]);
            return;
        }
        if (i == 1) {
            rbc rbcVar2 = new rbc(qxp.f, rbd.e);
            rbcVar2.a = th;
            rbcVar2.c();
            rbcVar2.a("Uncaught exception on the audio renderer internal thread.", new Object[0]);
            return;
        }
        if (i == 2) {
            rbc rbcVar3 = new rbc(rfz.c, rbd.e);
            rbcVar3.a = th;
            rbcVar3.c();
            rbcVar3.a("Uncaught exception on the surface texture source adapter.", new Object[0]);
            return;
        }
        if (i == 3) {
            rbc rbcVar4 = new rbc(rja.d, rbd.e);
            rbcVar4.a = th;
            rbcVar4.c();
            rbcVar4.a("Uncaught exception on the engine thread.", new Object[0]);
            return;
        }
        if (i != 4) {
            throw new avcg(Status.b(th).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown."));
        }
        rbc rbcVar5 = new rbc(rjs.a, rbd.e);
        rbcVar5.a = th;
        rbcVar5.c();
        rbcVar5.a("Uncaught exception in thread %s", thread.getName());
    }
}
