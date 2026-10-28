package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zer implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ zsf a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zlo c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ zer(zek zekVar, zsf zsfVar, zen zenVar, int i, zlo zloVar, Object obj, Long l, int i2) {
        this.$cid = i2;
        this.g = zekVar;
        this.a = zsfVar;
        this.f = zenVar;
        this.b = i;
        this.c = zloVar;
        this.d = obj;
        this.e = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            zen zenVar = zen.q;
            zsf zsfVar = this.a;
            zek zekVar = (zek) this.g;
            zekVar.s(zenVar, zsfVar);
            Long l = this.e;
            Object obj = this.d;
            zlo zloVar = this.c;
            zekVar.t((zen) this.f, zsfVar, this.b, zloVar, obj, l);
            return;
        }
        zen zenVar2 = zen.q;
        zsf zsfVar2 = this.a;
        zet zetVar = (zet) this.f;
        zetVar.s(zenVar2, zsfVar2);
        Long l2 = this.e;
        Object obj2 = this.d;
        zlo zloVar2 = this.c;
        zetVar.t((zen) this.g, zsfVar2, this.b, zloVar2, obj2, l2);
    }

    public /* synthetic */ zer(zet zetVar, zsf zsfVar, zen zenVar, int i, zlo zloVar, Object obj, Long l, int i2) {
        this.$cid = i2;
        this.f = zetVar;
        this.a = zsfVar;
        this.g = zenVar;
        this.b = i;
        this.c = zloVar;
        this.d = obj;
        this.e = l;
    }
}
