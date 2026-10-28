package defpackage;

import android.content.Context;
import android.util.Size;
import j$.time.Duration;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ree extends res {
    private static final Duration i = Duration.ofMillis(250);
    public final rjc a;

    public ree(qup qupVar, req reqVar) {
        super(qupVar, reqVar, 2);
        this.a = reqVar.t();
    }

    @Override // defpackage.res
    protected final Duration e() {
        return i;
    }

    @Override // defpackage.res
    protected final /* synthetic */ rei f() {
        req reqVar = this.c;
        Context contextM = reqVar.m();
        UUID uuid = this.b.a;
        Size sizeN = reqVar.n();
        qup qupVar = this.b;
        quv quvVar = (quv) qupVar.b;
        rhx rhxVar = new rhx(contextM, uuid, sizeN, quvVar.k, qupVar.d, quvVar.j, h(), reqVar.t(), reqVar.s(), reqVar.p().a, reqVar);
        rhxVar.s(reqVar.q());
        rgu rguVarI = rgw.i();
        rguVarI.a = reqVar.t();
        rguVarI.b = reqVar.h();
        rguVarI.c = reqVar.u();
        rguVarI.d = reqVar.i();
        rguVarI.f = reqVar.j();
        rguVarI.g = reqVar;
        rguVarI.h = this.b.a;
        rguVarI.j = reqVar.p().a;
        rguVarI.k = reqVar.r();
        rguVarI.l = reqVar.s();
        if (reqVar.p().a.R) {
            rguVarI.e = reqVar.n();
        }
        rgw rgwVar = new rgw(rguVarI);
        rgwVar.j(this.b.is());
        return new red(this, rhxVar, rgwVar);
    }

    public final Optional h() {
        return ((quv) this.b.b).p(this.c.p().n) ? Optional.of(((quv) this.b.b).i) : Optional.empty();
    }

    @Override // defpackage.res
    protected final boolean i(rjg rjgVar) {
        return rjgVar.b(rjf.m);
    }
}
