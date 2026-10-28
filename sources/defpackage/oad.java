package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oad implements euh, eug {
    public final int a;
    public final int b;
    public final ety c;
    public final oab d;
    public volatile esf e;
    public volatile boolean f;
    public volatile euh g;
    public final /* synthetic */ oae h;
    private volatile eug i;
    private volatile boolean j;
    private volatile ListenableFuture k;

    public oad(oae oaeVar, oab oabVar, int i, int i2, ety etyVar) {
        this.h = oaeVar;
        this.a = i;
        this.b = i2;
        this.c = etyVar;
        this.d = oabVar;
    }

    @Override // defpackage.euh
    public final Class a() {
        return this.h.c;
    }

    @Override // defpackage.eug
    public final void b(Object obj) {
        if (this.f) {
            return;
        }
        this.i.b(obj);
    }

    @Override // defpackage.euh
    public final void d() {
        euh euhVar = this.g;
        if (euhVar != null) {
            euhVar.d();
        }
    }

    @Override // defpackage.eug
    public final void e(Exception exc) {
        if (!this.f && !this.j) {
            etx etxVar = oae.a;
            if ((exc instanceof eti) && ((eti) exc).a == 403) {
                this.j = true;
                this.h.d.R();
                f(this.e, this.i);
                return;
            }
        }
        this.i.e(exc);
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        this.e = esfVar;
        this.i = eugVar;
        if (this.f) {
            return;
        }
        ListenableFuture listenableFutureN = ahng.n(this.h.d.Q());
        this.k = listenableFutureN;
        ahng.x(listenableFutureN, new hhi(this, eugVar, 6, null), MoreExecutors.directExecutor());
        if (this.f) {
            gI();
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 2;
    }

    @Override // defpackage.euh
    public final void gI() {
        this.f = true;
        ListenableFuture listenableFuture = this.k;
        euh euhVar = this.g;
        if (euhVar != null) {
            euhVar.gI();
        }
    }
}
