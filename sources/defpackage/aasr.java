package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aasr {
    public final avlh a;
    public final avlh b;
    public avmn c = null;
    public avmn d = null;
    private final aauk e;
    private volatile boolean f;
    private volatile boolean g;
    private volatile boolean h;
    private volatile boolean i;
    private final tfq j;

    public aasr(tfq tfqVar, avlh avlhVar, avlh avlhVar2, aauk aaukVar) {
        this.j = tfqVar;
        this.a = avlhVar;
        this.b = avlhVar2;
        this.e = aaukVar;
    }

    public final void a(aasp aaspVar) {
        if (b()) {
            ((aask) aaspVar).h();
        }
    }

    public final boolean b() {
        tfq tfqVar = this.j;
        boolean zH = tfqVar.h();
        boolean z = tfqVar.h() && tfqVar.j(0);
        boolean z2 = tfqVar.h() && tfqVar.j(1) && !tfqVar.g();
        boolean zK = this.e.p() ? tfqVar.k() : false;
        if (this.f == zH && this.h == z2 && this.g == z && this.i == zK) {
            return false;
        }
        this.f = zH;
        this.h = z2;
        this.g = z;
        this.i = zK;
        return true;
    }
}
