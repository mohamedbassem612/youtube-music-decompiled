package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rrv implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rrv(tqj tqjVar, agev agevVar, boolean z, ScheduledExecutorService scheduledExecutorService, int i) {
        this.$cid = i;
        this.b = tqjVar;
        this.c = agevVar;
        this.a = z;
        this.d = scheduledExecutorService;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    @Override // defpackage.agfr
    public final Object io() {
        if (this.$cid == 0) {
            int i = tqr.a;
            if (!this.b.k(1073840072)) {
                return aher.a;
            }
            if (!this.a) {
                return aher.a;
            }
            ?? r0 = this.d;
            rru rruVar = new rru(this.c, 2);
            long j = afwl.a;
            ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), rruVar, 1));
            r0.execute(ahfoVar);
            return ahng.u(ahfoVar, 10L, TimeUnit.SECONDS, r0);
        }
        Object obj = this.b;
        Context contextA = this.a ? mef.a(((qkh) obj).c) : ((qkh) obj).c;
        Object obj2 = this.c;
        return String.valueOf(qke.b(contextA)) + File.separator + "phenotype" + File.separator + "shared" + File.separator + (((String) obj2).isEmpty() ? "" : String.valueOf(obj2).concat(String.valueOf(File.separator))) + ((String) this.d) + ".pb";
    }

    public /* synthetic */ rrv(boolean z, qkh qkhVar, String str, String str2, int i) {
        this.$cid = i;
        this.a = z;
        this.b = qkhVar;
        this.c = str;
        this.d = str2;
    }
}
