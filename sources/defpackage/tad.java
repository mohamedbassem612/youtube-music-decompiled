package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tad implements bnu, agek {
    public ListenableFuture a;
    private final bob b;
    private boolean c;
    private boc d;
    private agek e;
    private boolean f;

    public tad(bob bobVar, boc bocVar, agek agekVar) {
        this.b = bobVar;
        this.e = agekVar;
        bocVar.getClass();
        this.d = bocVar;
    }

    private final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        ListenableFuture listenableFuture = this.a;
        this.a = null;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        boc bocVar = this.d;
        bocVar.getClass();
        bocVar.c(this);
        this.d = null;
        this.e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r0.a().a(r2.b) != false) goto L8;
     */
    @Override // defpackage.agek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r2.f
            if (r0 != 0) goto L23
            boolean r0 = r2.c
            if (r0 == 0) goto L19
            boc r0 = r2.d
            r0.getClass()
            bob r1 = r2.b
            bob r0 = r0.a()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L23
        L19:
            agek r2 = r2.e
            r2.getClass()
            java.lang.Object r2 = r2.apply(r3)
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tad.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        if (bogVar.getLifecycle().a().a(this.b)) {
            return;
        }
        a();
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        if (bogVar.getLifecycle().a().a(this.b)) {
            return;
        }
        a();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        if (bob.e.a(this.b)) {
            this.c = true;
        }
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        if (bob.d.a(this.b)) {
            this.c = true;
        }
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        if (bogVar.getLifecycle().a().a(this.b)) {
            return;
        }
        a();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }
}
