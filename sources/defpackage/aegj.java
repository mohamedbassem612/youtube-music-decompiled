package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aegj implements aegh {
    private final Context a;
    private final syn b;

    public aegj(Context context, syn synVar) {
        this.a = context;
        this.b = synVar;
    }

    @Override // defpackage.aegh
    public final /* synthetic */ aegg a() {
        return null;
    }

    @Override // defpackage.aegh
    public final aegg b(zwa zwaVar) {
        return q(zwaVar).a();
    }

    @Override // defpackage.aegh
    public final /* synthetic */ ListenableFuture c(agkz agkzVar, xir xirVar) {
        return ahng.m(new UnsupportedOperationException());
    }

    @Override // defpackage.aegh
    public final ListenableFuture d(agkz agkzVar, zwa zwaVar, xir xirVar) {
        return q(zwaVar).c(agkzVar, xirVar);
    }

    @Override // defpackage.aegh
    public final /* synthetic */ ListenableFuture e(aegg aeggVar) {
        return ahng.m(new UnsupportedOperationException());
    }

    @Override // defpackage.aegh
    public final ListenableFuture f(aegg aeggVar, zwa zwaVar) {
        return q(zwaVar).e(aeggVar);
    }

    @Override // defpackage.aegh
    public final /* synthetic */ void g() {
        throw new IllegalArgumentException("Non account scoped callsite should pass Identity.");
    }

    @Override // defpackage.aegh
    public final void h(zwa zwaVar) {
        q(zwaVar).g();
    }

    @Override // defpackage.aegh
    public final /* synthetic */ void i(String str, arkf arkfVar, xir xirVar, xgn xgnVar, arkm arkmVar, twi twiVar) {
        throw new IllegalArgumentException("Non account scoped callsite should pass Identity.");
    }

    @Override // defpackage.aegh
    public final void j(String str, zwa zwaVar, arkf arkfVar, xir xirVar, xgn xgnVar, arkm arkmVar, twi twiVar) {
        q(zwaVar).i(str, arkfVar, xirVar, xgnVar, arkmVar, twiVar);
    }

    @Override // defpackage.aegh
    public final void l(aegg aeggVar, zwa zwaVar) {
        q(zwaVar).k(aeggVar);
    }

    @Override // defpackage.aegh
    public final /* synthetic */ ListenableFuture m(agkz agkzVar, dvo dvoVar, xir xirVar) {
        return ahng.m(new IllegalArgumentException());
    }

    @Override // defpackage.aegh
    public final ListenableFuture n(agkz agkzVar, zwa zwaVar, dvo dvoVar, xir xirVar) {
        return q(zwaVar).m(agkzVar, dvoVar, xirVar);
    }

    @Override // defpackage.aegh
    public final void p(aegg aeggVar, zwa zwaVar, dvo dvoVar) {
        q(zwaVar).o(aeggVar, dvoVar);
    }

    public final aegh q(zwa zwaVar) {
        return ((aegi) aguu.aw(this.a, aegi.class, this.b.m(zwaVar))).m();
    }

    @Override // defpackage.aegh
    public final /* synthetic */ void k(aegg aeggVar) {
    }

    @Override // defpackage.aegh
    public final /* synthetic */ void o(aegg aeggVar, dvo dvoVar) {
    }
}
