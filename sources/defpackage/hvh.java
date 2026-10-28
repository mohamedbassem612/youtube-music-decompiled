package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hvh {
    public static final long a;
    public static final long b;
    public final mbc c;
    public final awmd d;
    public final awmd e;
    public final Context f;
    public final zwb g;
    public final Executor h;
    public final vxz i;
    private final tfq j;
    private final syn k;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 2592000L;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        b = 86400L;
    }

    public hvh(tfq tfqVar, mbc mbcVar, awmd awmdVar, awmd awmdVar2, zwb zwbVar, Context context, syn synVar, Executor executor, vxz vxzVar) {
        this.j = tfqVar;
        this.c = mbcVar;
        this.d = awmdVar;
        this.e = awmdVar2;
        this.f = context;
        this.k = synVar;
        this.g = zwbVar;
        this.h = executor;
        this.i = vxzVar;
    }

    public final ListenableFuture a(zwa zwaVar) {
        return afxd.f(this.k.n(zwaVar)).g(new gqq(this, 2), this.h);
    }

    public final ListenableFuture b(zwa zwaVar, final long j) {
        return afxd.f(a(zwaVar)).h(new hqn(2), this.h).g(new agek() { // from class: hvc
            /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                return Boolean.valueOf((boolean) (((this.a.c.f().toEpochMilli() - ((Long) obj).longValue()) > TimeUnit.SECONDS.toMillis(j) ? 1 : ((this.a.c.f().toEpochMilli() - ((Long) obj).longValue()) == TimeUnit.SECONDS.toMillis(j) ? 0 : -1)) >>> 31));
            }
        }, MoreExecutors.directExecutor());
    }

    public final void c() {
        long jC = this.i.c(5, 45388252L, 0L);
        if (jC > 0) {
            d(this.g.e(), jC);
        }
    }

    public final void d(zwa zwaVar, long j) {
        if (this.j.i() && ((aanb) this.d.io()).g()) {
            ListenableFuture listenableFutureB = b(zwaVar, j);
            Executor executor = this.h;
            hmb hmbVar = new hmb(2);
            hve hveVar = new hve(this, zwaVar, 0);
            Executor executor2 = taf.a;
            taa taaVar = new taa(hveVar, null, hmbVar);
            long j2 = afwl.a;
            listenableFutureB.addListener(new ahei(listenableFutureB, new afwj(afty.c(false), taaVar, 0)), executor);
        }
    }
}
