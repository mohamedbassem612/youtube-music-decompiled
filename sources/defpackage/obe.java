package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obe implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final Object b;

    public obe(aupr auprVar, aupr auprVar2, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.b = auprVar2;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aupr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aupr, java.lang.Object] */
    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        omj omjVar;
        Object oeuVar;
        switch (this.$cid) {
            case 0:
                Executor executor = (Executor) this.a.io();
                return new obd(executor);
            case 1:
                Object obj = ((aupo) this.b).b;
                oaq oaqVar = (oaq) ((aupo) this.a).b;
                return new axnp((ExecutorService) obj, "Mozilla/5.0 (Linux; Android " + Build.VERSION.RELEASE + "; " + Build.MODEL + ')', oaqVar.p);
            case 2:
                omjVar = new omj((Object) ((aupt) this.a).io());
                return omjVar;
            case 3:
                oeuVar = new oeu((Context) ((aupo) this.a).b, (ExecutorService) ((aupo) this.b).b);
                return oeuVar;
            case 4:
                oeuVar = new oey((Context) ((aupo) this.b).b, (ExecutorService) ((aupo) this.a).b);
                return oeuVar;
            case 5:
                omjVar = new omj((obk) this.a.io());
                return omjVar;
            case 6:
                ((omk) this.a).io();
                return ((omn) this.b).g;
            case 7:
                aupr auprVar = this.a;
                Context contextB = ((omk) this.b).io();
                agev agevVar = (agev) auprVar.io();
                Pattern pattern = qpr.a;
                qpq qpqVar = new qpq(contextB);
                qpqVar.c("mdd_pds_config");
                qpqVar.d(qnl.bc("DestFileGroups", agevVar));
                Uri uriA = qpqVar.a();
                uriA.getClass();
                return uriA;
            case 8:
                aupr auprVar2 = this.a;
                Context contextB2 = ((omk) this.b).io();
                agev agevVar2 = (agev) auprVar2.io();
                Pattern pattern2 = qpr.a;
                qpq qpqVar2 = new qpq(contextB2);
                qpqVar2.c("mdd_pds_config");
                qpqVar2.d(qnl.bc("DiagFileGroups", agevVar2));
                Uri uriA2 = qpqVar2.a();
                uriA2.getClass();
                return uriA2;
            case 9:
                aupr auprVar3 = this.a;
                Context contextB3 = ((omk) this.b).io();
                agev agevVar3 = (agev) auprVar3.io();
                Pattern pattern3 = qpr.a;
                qpq qpqVar3 = new qpq(contextB3);
                qpqVar3.c("mdd_pds_config");
                qpqVar3.d(qnl.bc("DestSharedFiles", agevVar3));
                Uri uriA3 = qpqVar3.a();
                uriA3.getClass();
                return uriA3;
            default:
                aupr auprVar4 = this.a;
                Context contextB4 = ((omk) this.b).io();
                agev agevVar4 = (agev) auprVar4.io();
                Pattern pattern4 = qpr.a;
                qpq qpqVar4 = new qpq(contextB4);
                qpqVar4.c("mdd_pds_config");
                qpqVar4.d(qnl.bc("DiagSharedFiles", agevVar4));
                Uri uriA4 = qpqVar4.a();
                uriA4.getClass();
                return uriA4;
        }
    }

    public obe(Object obj, aupr auprVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = auprVar;
    }
}
