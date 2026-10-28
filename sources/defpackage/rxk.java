package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY_LIGHTWEIGHT, b = aixo.SLOT_TYPE_IN_PLAYER, d = {sjz.class})
public final class rxk implements rxj {
    public final ListenableFuture a;
    private final Executor b;
    private final smr c;
    private final sko d;
    private final sol e;
    private boolean f;
    private aiuv g;
    private final rsk h;
    private final ruf i;

    public rxk(rsk rskVar, Executor executor, ruf rufVar, smr smrVar, sko skoVar) {
        rskVar.getClass();
        this.h = rskVar;
        executor.getClass();
        this.b = executor;
        this.i = rufVar;
        this.c = smrVar;
        skoVar.getClass();
        this.d = skoVar;
        this.a = (ListenableFuture) smrVar.d(sjz.class);
        this.e = som.a();
    }

    private final void g() {
        sol solVar = this.e;
        solVar.m();
        this.i.e(solVar.a());
    }

    @Override // defpackage.rxj
    public final void M() {
        aaef aaefVar = new aaef();
        aaefVar.c(false);
        aaefVar.c(true);
        sox soxVarB = aaefVar.b();
        sol solVar = this.e;
        solVar.b = soxVarB;
        solVar.h(true);
        this.i.e(solVar.a());
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture.isDone()) {
            f(listenableFuture);
        } else {
            listenableFuture.addListener(new rno(this, 17), this.b);
        }
        this.h.b(this.c, this.d);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        this.f = true;
        g();
        this.h.d(this.c, this.d, i);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rxj
    public final void b() {
        g();
    }

    public final void f(ListenableFuture listenableFuture) {
        aiuv aiuvVar;
        if (this.f) {
            return;
        }
        try {
            wgi wgiVar = (wgi) listenableFuture.get();
            if (wgiVar != null) {
                amae amaeVar = wgiVar.a;
                alzo alzoVar = amaeVar.h;
                if (alzoVar == null) {
                    alzoVar = alzo.a;
                }
                if (alzoVar.b == 62960614) {
                    alzo alzoVar2 = amaeVar.h;
                    if (alzoVar2 == null) {
                        alzoVar2 = alzo.a;
                    }
                    aiuvVar = alzoVar2.b == 62960614 ? (aiuv) alzoVar2.c : aiuv.a;
                } else {
                    aiuvVar = null;
                }
                this.g = aiuvVar;
                if (aiuvVar != null) {
                    sol solVar = this.e;
                    boolean z = (aiuvVar.b & 16384) != 0;
                    son sonVarA = solVar.b().a();
                    sonVarA.c(z);
                    solVar.c = sonVarA.a();
                    this.i.e(solVar.a());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.rxj
    public final void S() {
    }
}
