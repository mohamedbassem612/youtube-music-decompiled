package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjl implements acio {
    private final /* synthetic */ int $cid;
    private final ght a;
    private String b;
    private abnl c;
    private abnp d;
    private Integer e;
    private acic f;
    private acjb g;
    private Boolean h;
    private xir i;
    private zfp j;
    private acij k;
    private final Object l;
    private ahhp m;

    public gjl(ght ghtVar, Object obj, int i) {
        this.$cid = i;
        this.a = ghtVar;
        this.l = obj;
    }

    @Override // defpackage.acio
    public final acip a() {
        int i = this.$cid;
        String str = this.b;
        if (i != 0) {
            atqq.b(str, String.class);
            atqq.b(this.e, Integer.class);
            atqq.b(this.f, acic.class);
            atqq.b(this.g, acjb.class);
            atqq.b(this.h, Boolean.class);
            atqq.b(this.k, acij.class);
            return new gjk(this.a, (gir) this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m);
        }
        atqq.b(str, String.class);
        atqq.b(this.e, Integer.class);
        atqq.b(this.f, acic.class);
        atqq.b(this.g, acjb.class);
        atqq.b(this.h, Boolean.class);
        atqq.b(this.k, acij.class);
        return new gjn(this.a, (gil) this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m);
    }

    @Override // defpackage.acio
    public final /* synthetic */ void d(String str) {
        if (this.$cid != 0) {
            str.getClass();
            this.b = str;
        } else {
            str.getClass();
            this.b = str;
        }
    }

    @Override // defpackage.acio
    public final /* synthetic */ void e(acic acicVar) {
        int i = this.$cid;
        this.f = acicVar;
    }

    @Override // defpackage.acio
    public final /* synthetic */ void f(boolean z) {
        if (this.$cid != 0) {
            this.h = Boolean.valueOf(z);
        } else {
            this.h = Boolean.valueOf(z);
        }
    }

    @Override // defpackage.acio
    public final /* synthetic */ void g(xir xirVar) {
        int i = this.$cid;
        this.i = xirVar;
    }

    @Override // defpackage.acio
    public final /* synthetic */ void h(acij acijVar) {
        int i = this.$cid;
        this.k = acijVar;
    }

    @Override // defpackage.acio
    public final /* synthetic */ void i(abnl abnlVar) {
        int i = this.$cid;
        this.c = abnlVar;
    }

    @Override // defpackage.acio
    public final /* synthetic */ void j(abnp abnpVar) {
        int i = this.$cid;
        this.d = abnpVar;
    }

    @Override // defpackage.acio
    public final /* synthetic */ void k(acjb acjbVar) {
        if (this.$cid != 0) {
            acjbVar.getClass();
            this.g = acjbVar;
        } else {
            acjbVar.getClass();
            this.g = acjbVar;
        }
    }

    @Override // defpackage.acio
    public final /* synthetic */ void l(zfp zfpVar) {
        int i = this.$cid;
        this.j = zfpVar;
    }

    @Override // defpackage.acio
    public final /* synthetic */ void m(int i) {
        if (this.$cid != 0) {
            this.e = Integer.valueOf(i);
        } else {
            this.e = Integer.valueOf(i);
        }
    }

    @Override // defpackage.acio
    public final /* synthetic */ void n(ahhp ahhpVar) {
        int i = this.$cid;
        this.m = ahhpVar;
    }
}
