package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rry implements rrh {
    public final Context a;
    public volatile agev b;
    private final boolean c;
    private final boolean d;
    private final ListenableFuture e;
    private final ListenableFuture f;
    private final agfr g;
    private final ScheduledExecutorService h;

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    public rry(vxu vxuVar, tre treVar, avlb avlbVar, Context context, ScheduledExecutorService scheduledExecutorService, avmb avmbVar, rmp rmpVar, tqj tqjVar, agev agevVar) {
        boolean z;
        ListenableFuture listenableFutureU;
        tqj tqjVar2;
        ListenableFuture listenableFutureU2;
        agdf agdfVar = agdf.a;
        this.b = agdfVar;
        this.a = context;
        this.h = scheduledExecutorService;
        anim animVar = vxuVar.c().n;
        boolean z2 = (animVar == null ? anim.a : animVar).m;
        this.c = z2;
        if (z2) {
            anim animVar2 = vxuVar.c().n;
            if ((animVar2 == null ? anim.a : animVar2).p) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.d = z;
        if (z2) {
            rru rruVar = new rru(context, 0);
            long j = afwl.a;
            ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), rruVar, 1));
            scheduledExecutorService.execute(ahfoVar);
            listenableFutureU = ahng.u(ahfoVar, 10L, TimeUnit.SECONDS, scheduledExecutorService);
        } else {
            listenableFutureU = new aher(agdfVar);
        }
        this.e = listenableFutureU;
        if (z2) {
            rru rruVar2 = new rru(treVar, 1);
            long j2 = afwl.a;
            ahfo ahfoVar2 = new ahfo(new ahcz(afty.c(false), rruVar2, 1));
            scheduledExecutorService.execute(ahfoVar2);
            ahng.u(ahfoVar2, 10L, TimeUnit.SECONDS, scheduledExecutorService);
        } else {
            ListenableFuture listenableFuture = aher.a;
        }
        if (z2) {
            avlb avlbVarV = avlbVar.v(avmbVar);
            int i = tqr.a;
            tqjVar2 = tqjVar;
            listenableFutureU2 = ahng.u(ape.f(new tzc(tqjVar2.l(1074355139, 2) ? avlbVarV.r(avmbVar) : avlbVarV, 1)), 30L, TimeUnit.SECONDS, scheduledExecutorService);
        } else {
            agke agkeVar = agpi.a;
            listenableFutureU2 = agkeVar == null ? aher.a : new aher(agkeVar);
            tqjVar2 = tqjVar;
        }
        this.f = listenableFutureU2;
        this.g = aguu.al(new rrv(tqjVar2, agevVar, z2, scheduledExecutorService, 0));
    }

    @Override // defpackage.rrh
    public final ListenableFuture a() {
        return this.f;
    }

    @Override // defpackage.rrh
    public final ListenableFuture b() {
        return (ListenableFuture) this.g.io();
    }

    @Override // defpackage.rrh
    public final ListenableFuture c() {
        return this.e;
    }

    @Override // defpackage.rrh
    public final void d() {
        if (this.d) {
            ahno.ao(new rno(this, 6), this.h);
        } else {
            ListenableFuture listenableFuture = aher.a;
        }
    }

    @Override // defpackage.rrh
    public final int e() {
        ListenableFuture listenableFuture = this.e;
        agev agevVar = listenableFuture.isDone() ? (agev) taf.f(listenableFuture, agdf.a) : agdf.a;
        if (!agevVar.g()) {
            return 1;
        }
        long jLongValue = ((Long) agevVar.c()).longValue();
        int i = 4;
        if (jLongValue < rpi.T(4)) {
            i = 5;
            if (jLongValue < rpi.T(5)) {
                i = 3;
                if (jLongValue < rpi.T(3)) {
                    i = 2;
                    if (jLongValue < rpi.T(2)) {
                        return 1;
                    }
                }
            }
        }
        return i;
    }
}
