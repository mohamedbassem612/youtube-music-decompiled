package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abtr {
    public final aawa a;
    public final Handler b;
    public final aunn c;
    public final awmd d;
    public final awmd e;
    public final Runnable f;
    public final Runnable g;
    public boolean h;
    public int i;
    public boolean j;
    public final adet k;
    private final avlh l;
    private final avlh m;
    private final avlh n;
    private final abwg o;

    public abtr(adet adetVar, aawa aawaVar, Handler handler, aunn aunnVar, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, abwg abwgVar, awmd awmdVar, awmd awmdVar2) {
        this.k = adetVar;
        aawaVar.getClass();
        this.a = aawaVar;
        this.b = handler;
        this.c = aunnVar;
        this.l = avlhVar;
        this.m = avlhVar2;
        this.n = avlhVar3;
        this.o = abwgVar;
        this.d = awmdVar;
        this.e = awmdVar2;
        this.f = new yas(this, 19, null);
        this.g = new yas(this, 20, null);
    }

    public final void a() {
        this.i = 0;
        this.h = false;
    }

    public final void b() {
        aawl aawlVar = new aawl(new abmm(this, 20), "VESC", 1);
        abeq abeqVar = new abeq(17);
        abwg abwgVar = this.o;
        ((avlh) abwgVar.a).al(aawlVar, abeqVar);
        ((avlh) abwgVar.k).al(new abtq(this, 1), new abeq(17));
        this.l.al(new abtq(this, 0), new abeq(17));
        this.n.al(new abtq(this, 2), new abeq(17));
        this.m.al(new abtq(this, 3), new abeq(17));
    }
}
