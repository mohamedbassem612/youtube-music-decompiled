package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afsi implements aflf {
    public final afsc a;
    public final ScheduledExecutorService b;
    public final ahrn c;
    public final omr d;
    private final afrm e;
    private final boolean f;
    private final afsq g;

    public afsi(afrm afrmVar, ahrn ahrnVar, afsc afscVar, ScheduledExecutorService scheduledExecutorService, omr omrVar, afsq afsqVar, boolean z) {
        this.e = afrmVar;
        this.c = ahrnVar;
        this.a = afscVar;
        this.b = scheduledExecutorService;
        this.d = omrVar;
        this.g = afsqVar;
        Boolean.FALSE.booleanValue();
        this.f = z;
    }

    public static String e(agev agevVar) {
        return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker";
    }

    @Override // defpackage.aflf, defpackage.afln
    public final ListenableFuture a(WorkerParameters workerParameters) {
        if (!this.f) {
            Set set = workerParameters.c;
            return aguu.aD(ahno.as(this.c.d((String) aguu.A(set.iterator(), new wix(19))), new aaoq(this, workerParameters, 11), this.b), new afsh(0), MoreExecutors.directExecutor());
        }
        ListenableFuture listenableFutureAs = ahno.as(this.e.b(), new aaoq(this, workerParameters, 12), this.b);
        afsq afsqVar = this.g;
        ListenableFuture listenableFutureE = ahcs.e(listenableFutureAs, new aeni(14), MoreExecutors.directExecutor());
        aekb aekbVar = new aekb(workerParameters, 16);
        Set set2 = (Set) afsqVar.c.io();
        agkx agkxVarI = agkz.i(set2.size());
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            agkxVarI.c(new afsp(aekbVar, (ahub) it.next(), 2));
        }
        return ahno.am(afsqVar.d.h(new afgi(listenableFutureE, 10), agkxVarI.g()), Throwable.class, new aeni(15), MoreExecutors.directExecutor());
    }

    @Override // defpackage.afln
    public final /* synthetic */ ListenableFuture b(WorkerParameters workerParameters) {
        return ahng.m(new UnsupportedOperationException("A NoAccountWorker or AccountWorker used by a TikTokWorkSpec with setExpedited() must override getForegroundInfoAsync() in order to support API levels < 31."));
    }

    @Override // defpackage.afln
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.afln
    public final /* synthetic */ void c(Supplier supplier) {
    }
}
