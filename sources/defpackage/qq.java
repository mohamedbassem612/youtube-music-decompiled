package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qq extends djm {
    public boolean a;
    private final qr g;

    public qq(qr qrVar, djo djoVar) {
        super(djoVar, qrVar.b);
        this.g = qrVar;
        this.a = true;
    }

    @Override // defpackage.djm
    protected final void a() {
        this.g.a();
    }

    @Override // defpackage.djm
    protected final void b() {
        this.g.b();
    }

    @Override // defpackage.djm
    protected final void c(djk djkVar) {
        this.g.c(new pw(djkVar.c, djkVar.d, djkVar.b, djkVar.a, djkVar.e));
    }

    public final void d(boolean z) {
        this.a = z;
        boolean z2 = false;
        if (z && this.g.b) {
            z2 = true;
        }
        g(z2);
    }

    @Override // defpackage.djm
    protected final void e() {
        this.g.d();
    }
}
