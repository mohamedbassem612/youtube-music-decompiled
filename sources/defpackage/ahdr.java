package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahdr extends ahcv {
    public ahdq c;

    public ahdr(agjw agjwVar, boolean z, Executor executor, ahcx ahcxVar) {
        super(agjwVar, z, false);
        this.c = new ahdo(this, ahcxVar, executor);
        p();
    }

    @Override // defpackage.ahcv
    public final void f() {
        ahdq ahdqVar = this.c;
        if (ahdqVar != null) {
            ahdqVar.f();
        }
    }

    @Override // defpackage.ahch
    protected final void k() {
        ahdq ahdqVar = this.c;
        if (ahdqVar != null) {
            ahdqVar.h();
        }
    }

    @Override // defpackage.ahcv
    public final void r(int i) {
        super.r(i);
        if (i == 1) {
            this.c = null;
        }
    }

    public ahdr(agjw agjwVar, boolean z, Executor executor, Callable callable) {
        super(agjwVar, z, false);
        this.c = new ahdp(this, callable, executor);
        p();
    }

    @Override // defpackage.ahcv
    public final void d(int i, Object obj) {
    }
}
