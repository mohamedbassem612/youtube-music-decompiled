package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_AD_INFO_OVERLAY, b = aixo.SLOT_TYPE_IN_PLAYER, d = {sjz.class})
public final class rxb implements rxj, sog {
    public final ListenableFuture a;
    private final Executor b;
    private final smr c;
    private final sko d;
    private final slb e;
    private final sol f;
    private aiuv g;
    private boolean h;
    private final rsk i;
    private final ruf j;
    private final ruk k;

    public rxb(rsk rskVar, ruf rufVar, ruk rukVar, Executor executor, smr smrVar, sko skoVar) {
        this.i = rskVar;
        this.j = rufVar;
        this.k = rukVar;
        this.b = executor;
        this.c = smrVar;
        this.d = skoVar;
        this.e = smrVar.e(sjm.class) ? (slb) smrVar.d(sjm.class) : (slb) smrVar.d(sjb.class);
        this.a = (ListenableFuture) smrVar.d(sjz.class);
        this.f = som.a();
    }

    private final void g() {
        sol solVar = this.f;
        nrd.g(solVar);
        nrk.f(solVar);
        solVar.h(true);
        this.j.e(solVar.a());
    }

    @Override // defpackage.rxj
    public final void M() {
        try {
            this.j.b(this);
            if (this.e.F() != null) {
                g();
            } else {
                ListenableFuture listenableFuture = this.a;
                if (listenableFuture.isDone()) {
                    f(listenableFuture);
                } else {
                    listenableFuture.addListener(new rno(this, 11), this.b);
                }
            }
            this.i.b(this.c, this.d);
        } catch (rso e) {
            this.i.u(this.c, this.d, new sas(e.getMessage(), e.a), 10);
        }
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        this.h = true;
        sol solVar = this.f;
        solVar.m();
        ruf rufVar = this.j;
        rufVar.e(solVar.a());
        rufVar.d(this);
        this.i.d(this.c, this.d, i);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    public final void f(ListenableFuture listenableFuture) {
        if (this.h) {
            return;
        }
        try {
            wgi wgiVar = (wgi) ahng.v(listenableFuture);
            if (wgiVar == null) {
                this.i.u(this.c, this.d, new sas("WatchNext response is null", 36), 10);
                return;
            }
            alzo alzoVar = wgiVar.a.h;
            if (alzoVar == null) {
                alzoVar = alzo.a;
            }
            int i = alzoVar.b;
            if (i == 62960614) {
                aiuv aiuvVar = i == 62960614 ? (aiuv) alzoVar.c : aiuv.a;
                this.g = aiuvVar;
                if ((aiuvVar.b & 16384) != 0) {
                    g();
                }
            }
        } catch (ExecutionException e) {
            rmp.m(this.c, this.d, e.toString());
        }
    }

    @Override // defpackage.sog
    public final void v() {
        aiuv aiuvVar;
        abfx abfxVarF = this.j.f();
        if (abfxVarF != null) {
            ajwo ajwoVarF = this.e.F();
            if (ajwoVarF == null && (aiuvVar = this.g) != null && (ajwoVarF = aiuvVar.h) == null) {
                ajwoVarF = ajwo.a;
            }
            if (ajwoVarF != null) {
                afv afvVar = new afv(2);
                afvVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", abfxVarF);
                this.k.b(ajwoVarF, afvVar);
            }
        }
    }

    @Override // defpackage.rxj
    public final void S() {
    }

    @Override // defpackage.rxj
    public final void b() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void u(int i, int i2) {
    }
}
