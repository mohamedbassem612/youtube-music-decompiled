package defpackage;

import android.util.LruCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import internal.org.jni_zero.JniZero;
import j$.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abps extends wnn {
    public static final /* synthetic */ int e = 0;
    private static final Duration f = Duration.ofSeconds(10);
    public final awmd c;
    public final isi d;
    private final abpq g;
    private final abrg h;
    private final mbc i;
    private final yrx j;
    private final abmt k;
    private final xsc l;

    public abps(abxv abxvVar, abrg abrgVar, xsc xscVar, isi isiVar, awmd awmdVar, mbc mbcVar, yrx yrxVar, awmd awmdVar2, abmt abmtVar) {
        super(abxvVar, (tgg) awmdVar.io());
        this.h = abrgVar;
        this.l = xscVar;
        this.d = isiVar;
        mbcVar.getClass();
        this.i = mbcVar;
        this.j = yrxVar;
        this.c = awmdVar2;
        this.k = abmtVar;
        this.g = new abpq();
    }

    static /* synthetic */ avlu g(wlo wloVar, zyz zyzVar, alvt alvtVar) {
        wloVar.ad(alvtVar);
        if (zyzVar.isCancelled()) {
            return avlr.z();
        }
        try {
            return avlr.J((wjf) zyzVar.get());
        } catch (CancellationException unused) {
            return avlr.z();
        }
    }

    public final wjf a(abri abriVar) {
        taq.c();
        zyz zyzVar = new zyz();
        b(abriVar, zyzVar, null, null, false, null);
        try {
            return (wjf) zyzVar.get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new wno(e2);
        }
    }

    public final abok b(abri abriVar, zza zzaVar, String str, yrr yrrVar, boolean z, xir xirVar) {
        yrx yrxVar;
        abmw abmwVar = abmw.MEDIASESSION;
        String str2 = abriVar.a;
        wlo wloVarA = this.h.a(abriVar, this.l.t(zzaVar, this.i.b()));
        abmt abmtVar = this.k;
        if (abmtVar.bi()) {
            wloVarA.U();
        }
        if (abmtVar.G()) {
            wloVarA.T();
        }
        if (z) {
            wloVarA.V();
        }
        if (yrrVar != null && (yrxVar = this.j) != null) {
            return new abpp(wloVarA, yrxVar.a(wloVarA, yrrVar, e(), xirVar, z));
        }
        e().b(wloVarA);
        return new abpl(wloVarA, 0);
    }

    public final ListenableFuture c(abri abriVar, String str, yrr yrrVar, xir xirVar) {
        abpr abprVar;
        abmw abmwVar = abmw.MEDIASESSION;
        String str2 = abriVar.a;
        if (this.k.ci()) {
            return d(abriVar, str, yrrVar, xirVar);
        }
        abpq abpqVar = this.g;
        synchronized (((LruCache) abpqVar.io())) {
            abpr abprVar2 = null;
            if (!ahno.aa(str) && (abprVar = (abpr) ((LruCache) abpqVar.io()).get(str)) != null && this.i.b() < abprVar.b) {
                abprVar2 = abprVar;
            }
            if (abprVar2 == null) {
                ListenableFuture listenableFutureD = d(abriVar, str, yrrVar, xirVar);
                if (str != null) {
                    ((LruCache) abpqVar.io()).put(str, new abpr(listenableFutureD, this.i.b() + f.toMillis(), abriVar.h));
                }
                return listenableFutureD;
            }
            if (!abprVar2.c || abriVar.h) {
                return abprVar2.a;
            }
            afxd afxdVarC = afxd.f(abprVar2.a).c(Exception.class, new qmw(this, str, abriVar, xirVar, 13), MoreExecutors.directExecutor());
            if (str != null) {
                ((LruCache) abpqVar.io()).put(str, new abpr(afxdVarC, this.i.b() + f.toMillis(), abriVar.h));
            }
            return afxdVarC;
        }
    }

    public final ListenableFuture d(abri abriVar, String str, yrr yrrVar, xir xirVar) {
        abrg abrgVar = this.h;
        agev agevVarF = abrg.f(abrgVar.b);
        ypp yppVarE = abrgVar.a.e();
        yppVarE.h = abriVar;
        yppVarE.l(alvt.a);
        yppVarE.c = ainp.a;
        yppVarE.g = new ablq(5);
        yppVarE.f = new wvb(15);
        if (agevVarF.g()) {
            yppVarE.i = agevVarF.c();
        }
        wlo wloVarK = yppVarE.k();
        long jB = this.i.b();
        return afxd.f(e().c(new abqn(yrrVar, wloVarK, xirVar))).h(new abpm(this, str, abriVar, wloVarK, jB, 0), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final avlr h(abri abriVar, final zyz zyzVar, yrr yrrVar, boolean z, xir xirVar) {
        yrx yrxVar = this.j;
        if (yrxVar == null) {
            return avlr.A(new IllegalArgumentException("Unexpected null OnesieLoader."));
        }
        final wlo wloVarA = this.h.a(abriVar, this.l.t(zyzVar, this.i.b()));
        abmt abmtVar = this.k;
        if (abmtVar.bi()) {
            wloVarA.U();
        }
        if (abmtVar.G()) {
            wloVarA.T();
        }
        if (z) {
            wloVarA.V();
        }
        avlr avlrVarB = yrxVar.a(wloVarA, yrrVar, e(), xirVar, z).b();
        if (!abmtVar.aE() && !abmtVar.ax()) {
            return avlrVarB.K(new avnn() { // from class: abpo
                @Override // defpackage.avnn
                public final Object a(Object obj) {
                    int i = abps.e;
                    wloVarA.ad((alvt) obj);
                    return (wjf) zyzVar.get();
                }
            });
        }
        avnn avnnVar = new avnn() { // from class: abpn
            @Override // defpackage.avnn
            public final Object a(Object obj) {
                return abps.g(wloVarA, zyzVar, (alvt) obj);
            }
        };
        if (avlrVarB instanceof avor) {
            Object objCall = ((avor) avlrVarB).call();
            return objCall == null ? avlr.z() : JniZero.b(objCall, avnnVar);
        }
        awbg awbgVar = new awbg(avlrVarB, avnnVar, 2, 1);
        avnn avnnVar2 = atqp.l;
        return awbgVar;
    }
}
