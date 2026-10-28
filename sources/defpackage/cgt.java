package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cgt implements cgc {
    final /* synthetic */ cgu a;

    public cgt(cgu cguVar) {
        this.a = cguVar;
    }

    @Override // defpackage.cgc
    public final void a() {
        this.a.I();
    }

    @Override // defpackage.cgc
    public final void b(int i) {
        this.a.q.d(i);
    }

    @Override // defpackage.cgc
    public final void c(Exception exc) {
        bvx.d("DecoderAudioRenderer", "Audio sink error", exc);
        this.a.q.e(exc);
    }

    @Override // defpackage.cgc
    public final void f(long j) {
        cgu cguVar = this.a;
        cguVar.p = true;
        cguVar.q.k(j);
    }

    @Override // defpackage.cgc
    public final void g() {
        this.a.n = true;
    }

    @Override // defpackage.cgc
    public final void h() {
        this.a.o = true;
    }

    @Override // defpackage.cgc
    public final void i(boolean z) {
        this.a.q.l(z);
    }

    @Override // defpackage.cgc
    public final void j(int i, long j, long j2) {
        this.a.q.m(i, j, j2);
    }

    @Override // defpackage.cgc
    public final void k(cri criVar) {
        this.a.q.q(criVar);
    }

    @Override // defpackage.cgc
    public final void l(cri criVar) {
        this.a.q.r(criVar);
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cgc
    public final /* synthetic */ void e() {
    }
}
