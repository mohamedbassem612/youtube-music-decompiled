package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyv extends gut {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/WatchEndpointCommandResolver");
    public final igy b;
    public final awmd c;
    public final awmd d;
    public final jij e;
    public final grj f;
    public final xsc g;
    private final igr h;
    private final Executor i;
    private final xit k;

    public gyv(igy igyVar, igr igrVar, grj grjVar, jij jijVar, xsc xscVar, awmd awmdVar, awmd awmdVar2, Executor executor, xit xitVar) {
        this.b = igyVar;
        this.h = igrVar;
        this.f = grjVar;
        this.e = jijVar;
        this.g = xscVar;
        this.c = awmdVar;
        this.d = awmdVar2;
        this.i = executor;
        this.k = xitVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ListenableFuture listenableFutureAm;
        xir xirVarP = this.k.p(4);
        igr igrVar = this.h;
        if (igrVar.c()) {
            listenableFutureAm = ahng.n(Boolean.TRUE);
        } else {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            if (arijVar.d.isEmpty()) {
                listenableFutureAm = ahng.n(Boolean.TRUE);
            } else {
                ListenableFuture listenableFutureAf = igrVar.i.af(arijVar.d, gzj.T(ajwoVar), igs.c(gzj.P(ajwoVar)));
                long seconds = igr.b.toSeconds();
                ScheduledExecutorService scheduledExecutorService = igrVar.g;
                listenableFutureAm = ahno.am(ahng.u(listenableFutureAf, seconds, TimeUnit.SECONDS, scheduledExecutorService), Throwable.class, new iam(14), scheduledExecutorService);
            }
        }
        ahno.at(listenableFutureAm, new gyu(this, xirVarP, ajwoVar, map), this.i);
    }
}
