package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeqq implements tdk {
    public boolean a;
    public final boolean b;
    public final int c;
    public final long d;
    public final boolean i;
    public final mbc j;
    public final int k;
    private final Choreographer.FrameCallback l = new ogt(this, 2);
    int e = 0;
    public boolean g = false;
    public int h = 0;

    public aeqq(vxz vxzVar, mbc mbcVar) {
        this.j = mbcVar;
        this.b = vxzVar.l(5, 45611695L, false);
        vxzVar.l(167, 45767283L, false);
        this.c = (int) vxzVar.c(0, 45611696L, 0L);
        this.d = Math.min(vxzVar.c(1, 45611697L, 0L), 1000L);
        this.i = vxzVar.l(180, 45782902L, false);
        this.k = vxzVar.c(63, 45782903L, 0L) != 1 ? 1 : 2;
    }

    private final void f() {
        if (this.a) {
            Choreographer.getInstance().removeFrameCallback(this.l);
            this.a = false;
        }
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        nsi.m(this);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.b;
    }

    public final void d() {
        if (this.a) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(this.l);
        this.a = true;
    }

    public final void e() {
        this.g = false;
        f();
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        nsi.n(this);
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.e++;
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        int i = this.e - 1;
        this.e = i;
        if (i <= 0) {
            this.g = false;
            f();
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
