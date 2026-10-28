package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class chi implements cgc {
    final /* synthetic */ chj a;

    public chi(chj chjVar) {
        this.a = chjVar;
    }

    @Override // defpackage.cgc
    public final void a() {
        this.a.I();
    }

    @Override // defpackage.cgc
    public final void b(int i) {
        mgk mgkVar;
        if (Build.VERSION.SDK_INT >= 35 && (mgkVar = this.a.q) != null) {
            mgkVar.g(i);
        }
        this.a.p.d(i);
    }

    @Override // defpackage.cgc
    public final void c(Exception exc) {
        bvx.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.a.p.e(exc);
    }

    @Override // defpackage.cgc
    public final void d() {
        qcb qcbVar = this.a.G;
        if (qcbVar != null) {
            qcbVar.K();
        }
    }

    @Override // defpackage.cgc
    public final void e() {
        qcb qcbVar = this.a.G;
        if (qcbVar != null) {
            ((ccs) qcbVar.a).n = true;
        }
    }

    @Override // defpackage.cgc
    public final void f(long j) {
        chj chjVar = this.a;
        chjVar.o = true;
        chjVar.p.k(j);
    }

    @Override // defpackage.cgc
    public final void g() {
        this.a.m = true;
    }

    @Override // defpackage.cgc
    public final void h() {
        this.a.n = true;
    }

    @Override // defpackage.cgc
    public final void i(boolean z) {
        this.a.p.l(z);
    }

    @Override // defpackage.cgc
    public final void j(int i, long j, long j2) {
        this.a.p.m(i, j, j2);
    }

    @Override // defpackage.cgc
    public final void k(cri criVar) {
        this.a.p.q(criVar);
    }

    @Override // defpackage.cgc
    public final void l(cri criVar) {
        this.a.p.r(criVar);
    }
}
