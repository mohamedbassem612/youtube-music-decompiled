package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acft {
    public final mbc b;
    public final vyo c;
    public final acga d;
    public final int e;
    public final abnl f;
    public final tyy g;
    public final avlh h;
    public final avlh i;
    public final avlh j;
    public final avlh k;
    public final avlh l;
    public final abmt m;
    public final boolean n;
    public Boolean p;
    public long r;
    public final ahqj w;
    public avgj x;
    public final avmm o = new avmm();
    public long q = Long.MAX_VALUE;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public final Runnable a = new abyz(this, 5);

    public acft(mbc mbcVar, vyo vyoVar, avmb avmbVar, acga acgaVar, int i, abnl abnlVar, tyy tyyVar, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, avlh avlhVar4, avlh avlhVar5, abmt abmtVar) {
        this.b = mbcVar;
        this.c = vyoVar;
        this.w = new ahqj(avmbVar);
        this.d = acgaVar;
        this.e = i;
        this.f = abnlVar;
        this.g = tyyVar;
        this.h = avlhVar;
        this.i = avlhVar2;
        this.j = avlhVar3;
        this.k = avlhVar4;
        this.l = avlhVar5;
        this.m = abmtVar;
        this.n = abmtVar.bu();
    }

    public final void a() {
        this.x = null;
        this.o.b();
        c();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [avmn, java.lang.Object] */
    public final void b(boolean z) {
        this.u = false;
        if (z || !this.t) {
            this.t = true;
            this.r = this.b.b();
            ahqj ahqjVar = this.w;
            Runnable runnable = this.a;
            ahqjVar.g();
            ?? r0 = ahqjVar.b;
            if (r0 != 0) {
                r0.dispose();
            }
            ahqjVar.b = ((avmb) ahqjVar.a).e(runnable);
        }
    }

    public final void c() {
        this.u = true;
        this.t = false;
        this.v = 0;
        this.w.g();
    }
}
