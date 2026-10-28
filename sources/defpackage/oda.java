package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oda implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final aupr b;
    private final Object c;

    public oda(aupr auprVar, aupr auprVar2, aupr auprVar3, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.c = auprVar2;
        this.b = auprVar3;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        Object oczVar;
        int i = this.$cid;
        if (i == 0) {
            oczVar = new ocz((fxg) ((aupo) this.a).b, (ocu) this.c.io(), (omj) this.b.io());
        } else {
            if (i == 1) {
                obc obcVar = ((oaq) ((aupo) this.c).b).x ? (obc) aupm.b(this.b).io() : (obc) aupm.b(this.a).io();
                obcVar.getClass();
                return obcVar;
            }
            if (i == 2) {
                oczVar = new ode((fxg) ((aupo) this.a).b, (ocu) this.c.io(), (omj) this.b.io());
            } else {
                if (i == 3) {
                    Object obj = ((aupo) this.a).b;
                    return new ofa((Context) obj, (ExecutorService) ((aupo) this.b).b);
                }
                if (i != 4) {
                    aupr auprVar = this.b;
                    Context contextB = ((omk) this.a).io();
                    agev agevVar = (agev) auprVar.io();
                    Pattern pattern = qpr.a;
                    qpq qpqVar = new qpq(contextB);
                    qpqVar.c("mdd_pds_config");
                    qpqVar.d(qnl.bc("LoggingState", agevVar));
                    Uri uriA = qpqVar.a();
                    qrl qrlVarA = qrm.a();
                    qrlVarA.f(uriA);
                    qrlVarA.e(oiy.a);
                    qrlVarA.g(false);
                    Context applicationContext = contextB.getApplicationContext();
                    omr omrVar = (omr) this.c;
                    qrn qrnVar = new qrn(applicationContext, omrVar.a);
                    qrnVar.c = qnl.aO("gms_icing_mdd_network_usage_monitor", agevVar);
                    qrnVar.c();
                    qrnVar.e(new onh());
                    qrlVarA.b(qrnVar.a());
                    qrx qrxVarC = ((rrq) omrVar.b).c(qrlVarA.a());
                    qrxVarC.getClass();
                    return qrxVarC;
                }
                oczVar = new oni((qrx) this.c.io(), (omj) this.b.io(), (Executor) this.a.io(), agfe.a);
            }
        }
        return oczVar;
    }

    public oda(aupr auprVar, aupr auprVar2, aupr auprVar3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = auprVar;
        this.a = auprVar2;
        this.c = auprVar3;
    }

    public oda(aupr auprVar, aupr auprVar2, aupr auprVar3, int i, int[] iArr) {
        this.$cid = i;
        this.c = auprVar;
        this.b = auprVar2;
        this.a = auprVar3;
    }

    public oda(omr omrVar, aupr auprVar, aupr auprVar2, int i) {
        this.$cid = i;
        this.c = omrVar;
        this.a = auprVar;
        this.b = auprVar2;
    }
}
