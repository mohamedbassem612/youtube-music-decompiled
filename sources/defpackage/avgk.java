package defpackage;

import io.grpc.Status;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avgk implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public avgk(avhb avhbVar, int i) {
        this.$cid = i;
        this.a = avhbVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.$cid != 0) {
            rbc rbcVar = new rbc(rix.d, rbd.e);
            rbcVar.a = th;
            rbcVar.c();
            rbcVar.a("Uncaught exception on the dedicated gl thread: %s.", this.a);
            return;
        }
        Object obj = this.a;
        avaa avaaVar = ((avhb) obj).i;
        avhb.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(avaaVar) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        try {
            if (((avhb) obj).w) {
                return;
            }
            ((avhb) obj).w = true;
            try {
                ((avhb) obj).g(true);
                ((avhb) obj).l(false);
            } finally {
                ((avhb) obj).m(new avak(avan.a(Status.l.withDescription("Panic! This is a bug!").c(th))));
                ((avhb) obj).K.d(null);
                ((avhb) obj).I.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                ((avhb) obj).q.a(auzd.c);
            }
        } catch (Throwable th2) {
            avaa avaaVar2 = ((avhb) this.a).i;
            avhb.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(avaaVar2) + "] Uncaught exception while panicking", th2);
        }
    }

    public /* synthetic */ avgk(String str, int i) {
        this.$cid = i;
        this.a = str;
    }
}
