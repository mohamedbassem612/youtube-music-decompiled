package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryi extends ryj {
    public final saq a;
    public aisu b;
    public final sac c;
    private final Executor g;
    private ListenableFuture h;
    private final rtl i;

    public ryi(smr smrVar, sko skoVar, rsk rskVar, rtl rtlVar, sac sacVar, saq saqVar, Executor executor) {
        super(smrVar, skoVar, rskVar);
        this.i = rtlVar;
        this.c = sacVar;
        this.a = saqVar;
        this.g = executor;
    }

    @Override // defpackage.ryj
    public final void V(int i) {
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            rmp.k(this.d, a.bR(i, "Cancelling AdBreakResponseFuture for Shorts Ads. layoutExitReason: "));
            this.h.cancel(false);
        }
        this.f.d(this.d, this.e, i);
    }

    @Override // defpackage.ryj
    public final void a() {
        Optional optionalJ = this.e.p.j();
        if (true == optionalJ.isPresent()) {
            apji apjiVar = (apji) optionalJ.get();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aisw.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (true != apjiVar.j.n(aihlVarCheckIsLite.d)) {
                optionalJ = Optional.empty();
            }
        }
        optionalJ.ifPresentOrElse(new rme(this, 16), new rxn(this, 5));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.ryj
    public final void b() {
        aisu aisuVar = this.b;
        if (aisuVar == null) {
            rmp.j(this.d, "AdBreakRenderer is null onLayoutEnterRequested.");
            return;
        }
        rtl rtlVar = this.i;
        String str = aisuVar.g;
        str.getClass();
        aaqf aaqfVar = rtlVar.a;
        wob wobVar = new wob(aaqfVar.b, aaqfVar.d.e());
        wobVar.a = str;
        wobVar.o(vzh.b);
        ListenableFuture listenableFutureG = aaqfVar.g(wobVar, MoreExecutors.directExecutor());
        this.h = listenableFutureG;
        ahng.x(listenableFutureG, new ryh(this, 0), this.g);
        this.f.b(this.d, this.e);
    }
}
