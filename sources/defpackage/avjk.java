package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avjk extends atxy {
    final /* synthetic */ avjl b;
    private final atxy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjk(avjl avjlVar, atxy atxyVar) {
        super(null);
        this.b = avjlVar;
        this.c = atxyVar;
    }

    @Override // defpackage.atxy
    public final Status m(avbr avbrVar) {
        Status statusM = this.c.m(avbrVar);
        boolean zE = statusM.e();
        avjl avjlVar = this.b;
        if (zE) {
            avjlVar.c.a();
        } else {
            avgv avgvVar = new avgv(avjlVar, 16);
            avdh avdhVar = (avdh) avjlVar.c;
            avcj avcjVar = avdhVar.c;
            avcjVar.c();
            if (avdhVar.d == null) {
                avdhVar.d = new avfa();
            }
            axoz axozVar = avdhVar.e;
            if (axozVar == null || !axozVar.b()) {
                long jA = avdhVar.d.a();
                avdhVar.e = avcjVar.d(avgvVar, jA, TimeUnit.NANOSECONDS, avdhVar.b);
                avdh.a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
            }
        }
        return statusM;
    }
}
