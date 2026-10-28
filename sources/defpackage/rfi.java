package defpackage;

import android.content.Context;
import android.util.Size;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rfi extends res {
    private static final rbm i = new rbm("rfi");
    private int a;

    protected rfi(qup qupVar, req reqVar) {
        super(qupVar, reqVar, 5);
        this.a = 0;
    }

    public static void h(rhe rheVar, qup qupVar) {
        rheVar.i(nrb.f(qupVar.c));
    }

    protected agke a() {
        return agke.q(this.b);
    }

    protected Duration b(Duration duration) {
        return this.b.b();
    }

    @Override // defpackage.res
    protected final Duration e() {
        return Duration.ofMillis(250L);
    }

    @Override // defpackage.res
    protected final /* synthetic */ rei f() {
        rhe rheVar = new rhe();
        h(rheVar, this.b);
        req reqVar = this.c;
        reqVar.K();
        rih rihVar = new rih(reqVar.p().b, this.b.b(), 2);
        rgu rguVarI = rgw.i();
        rguVarI.a = reqVar.t();
        rguVarI.b = reqVar.h();
        rguVarI.c = reqVar.u();
        rguVarI.d = reqVar.i();
        rguVarI.f = reqVar.j();
        rguVarI.g = reqVar;
        rguVarI.h = this.b.a;
        rguVarI.i = reqVar.M();
        rguVarI.j = reqVar.p().a;
        rguVarI.k = reqVar.r();
        rguVarI.e = reqVar.n();
        rguVarI.l = reqVar.s();
        rgw rgwVar = new rgw(rguVarI);
        rihVar.b = rgwVar;
        reqVar.K();
        rgx rgxVar = new rgx(rheVar, rihVar);
        int i2 = rgm.c;
        rgk rgkVar = new rgk();
        rgkVar.c = reqVar.p().a.c;
        rgkVar.b = j(reqVar.w());
        rgkVar.d = reqVar.p().a;
        rgkVar.e = new rgl() { // from class: rfg
            @Override // defpackage.rgl
            public final Duration a(Duration duration) {
                return this.a.b(duration);
            }
        };
        reqVar.L();
        int i3 = this.e;
        rgkVar.a = i3;
        if (i3 > 2 && rihVar.h()) {
            rgkVar.b(rgxVar);
        }
        rgkVar.b(rgwVar);
        rgkVar.b(rheVar);
        rgm rgmVarA = rgkVar.a();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Context contextM = reqVar.m();
        agke agkeVarA = a();
        Size sizeN = reqVar.n();
        qys qysVar = reqVar.p().h;
        rfl rflVarA = reqVar.q().a();
        Optional optionalZ = reqVar.z();
        Optional optionalX = reqVar.x();
        rjb rjbVarS = reqVar.s();
        qua quaVar = reqVar.p().a;
        boolean z = this.a >= 2;
        reqVar.getClass();
        riv rivVar = new riv(contextM, agkeVarA, sizeN, rihVar, qysVar, rflVarA, optionalZ, optionalX, rjbVarS, reqVar, quaVar, atomicBoolean, z, new gqd(19));
        rivVar.v = new rcu(rgxVar, 14);
        qup qupVar = this.b;
        rgmVarA.l(qupVar.c, qupVar.b());
        rgmVarA.i(rivVar);
        rfn rfnVarQ = reqVar.q();
        Context context = rivVar.d;
        Semaphore semaphore = rivVar.c;
        rivVar.r = new rfz(context, rfnVarQ, semaphore, rivVar.u, rivVar.g, rivVar.q);
        rivVar.s = new Surface(rivVar.r.a.j);
        rft rftVar = rivVar.t;
        if (rftVar != null) {
            rivVar.r.a(rftVar);
        }
        rivVar.D(new rhl(rivVar, 11));
        rgwVar.j(this.b.is());
        semaphore.release();
        ExoPlayer exoPlayer = rivVar.f;
        exoPlayer.getClass();
        rivVar.D(new rhl(exoPlayer, 7));
        return new rfh(this, rivVar, rgmVarA, rgwVar, rheVar, rihVar, atomicBoolean);
    }

    @Override // defpackage.res
    protected final void m(Duration duration) {
        this.a++;
        rbc rbcVar = new rbc(i, rbd.c);
        rbcVar.c();
        rbcVar.a("Recreating live renderer due to decoder timeout at %s, safe mode: %s", duration, Boolean.valueOf(this.a >= 2));
        super.m(duration);
    }

    @Override // defpackage.res
    protected final boolean o() {
        rei reiVar;
        return this.c.p().a.z && (reiVar = this.g) != null && ((rfh) reiVar).d.get() && this.a < 2;
    }

    protected rfi(qup qupVar, req reqVar, int i2) {
        super(qupVar, reqVar, i2);
        this.a = 0;
    }
}
