package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wvp extends wvn {
    private final awmd a;
    private final Executor b;
    private final AtomicBoolean c;
    private final vwt d;

    public wvp(ci ciVar, awmd awmdVar, awmd awmdVar2, vwt vwtVar, Executor executor) {
        super(ciVar, awmdVar2);
        this.c = new AtomicBoolean(false);
        this.a = awmdVar;
        this.d = vwtVar;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [avmf, java.lang.Object] */
    @Override // defpackage.wvn
    protected final synchronized void c(zwa zwaVar) {
        if (this.c.compareAndSet(false, true)) {
            aend aendVar = (aend) this.a.io();
            wqj wqjVarB = aendVar.b();
            wqjVarB.o(vzh.b);
            awhi awhiVar = new awhi(this.d.a);
            avnn avnnVar = atqp.o;
            Boolean bool = Boolean.FALSE;
            avlr avlrVarK = awhiVar.x(bool).k();
            Executor executor = this.b;
            ListenableFuture listenableFutureC = aendVar.c(wqjVarB, executor);
            int i = avlh.a;
            avua avuaVar = new avua(listenableFutureC);
            avnn avnnVar2 = atqp.j;
            avxs avxsVar = new avxs(avuaVar, 1);
            avnn avnnVar3 = atqp.o;
            avlr avlrVarK2 = avxsVar.u(new uxe(20)).w(new ugm(this, 14)).k();
            agdf agdfVar = agdf.a;
            avlr avlrVarAd = avlrVarK.ad(avlrVarK2.V(agdfVar), new jnx(13));
            avmb avmbVar = awlg.a;
            avlrVarAd.O(new awir(executor)).x(new mnt(this, zwaVar, 12)).an(Pair.create(bool, agdfVar)).H();
        }
    }
}
