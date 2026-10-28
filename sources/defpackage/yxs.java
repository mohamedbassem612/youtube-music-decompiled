package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yxs extends yxu {
    private final zjd b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private final int g;

    public yxs(zjd zjdVar, int i) {
        this.b = zjdVar;
        this.g = i;
    }

    @Override // defpackage.yxu
    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        int i = this.g;
        zjd zjdVar = this.b;
        if (i == 2) {
            zjdVar.aB();
        } else {
            zjdVar.h();
        }
    }

    @Override // defpackage.yxu
    public final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        int i = this.g;
        zjd zjdVar = this.b;
        if (i == 2) {
            zjdVar.au();
        } else {
            zjdVar.a();
        }
    }

    @Override // defpackage.yxu
    public final void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        int i = this.g;
        zjd zjdVar = this.b;
        if (i == 2) {
            zjdVar.aC();
        } else {
            zjdVar.i();
        }
    }

    @Override // defpackage.yxu
    public final void d() {
        if (this.f) {
            return;
        }
        this.f = true;
        int i = this.g;
        zjd zjdVar = this.b;
        if (i == 2) {
            zjdVar.aD();
        } else {
            zjdVar.j();
        }
    }
}
