package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kdg implements kcs {
    final /* synthetic */ aepb a;

    public kdg(aepb aepbVar) {
        this.a = aepbVar;
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void a(kcq kcqVar, int i) {
        kef kefVar = new kef(9);
        kefVar.a = Integer.valueOf(i);
        aepb aepbVar = this.a;
        kefVar.b = Boolean.valueOf(((kdl) aepbVar.a).f());
        aepbVar.c(new keg(kefVar));
        aepbVar.b();
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void b(kcq kcqVar) {
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void c(kcq kcqVar, int i) {
        kef kefVar = new kef(8);
        kefVar.a = Integer.valueOf(i);
        keg kegVar = new keg(kefVar);
        aepb aepbVar = this.a;
        aepbVar.c(kegVar);
        aepbVar.b();
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void d(kcq kcqVar, boolean z) {
        keg kegVar = new keg(new kef(4));
        aepb aepbVar = this.a;
        aepbVar.c(kegVar);
        Object obj = aepbVar.d;
        kro.l(obj);
        ((kdi) obj).a((kbu) kcqVar);
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void e(kcq kcqVar, String str) {
        keg kegVar = new keg(new kef(7));
        aepb aepbVar = this.a;
        aepbVar.c(kegVar);
        Object obj = aepbVar.d;
        kro.l(obj);
        ((kdi) obj).a((kbu) kcqVar);
        Object obj2 = aepbVar.d;
        kro.l(obj2);
        ((kdi) obj2).b(str);
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void f(kcq kcqVar, int i) {
        kef kefVar = new kef(5);
        kefVar.a = Integer.valueOf(i);
        keg kegVar = new keg(kefVar);
        aepb aepbVar = this.a;
        aepbVar.c(kegVar);
        aepbVar.b();
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void g(kcq kcqVar, String str) {
        keg kegVar = new keg(new kef(4));
        aepb aepbVar = this.a;
        aepbVar.c(kegVar);
        Object obj = aepbVar.d;
        kro.l(obj);
        ((kdi) obj).a((kbu) kcqVar);
        Object obj2 = aepbVar.d;
        kro.l(obj2);
        ((kdi) obj2).b(str);
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void h(kcq kcqVar) {
        kbu kbuVar = (kbu) kcqVar;
        kef kefVar = new kef(2);
        aepb aepbVar = this.a;
        kefVar.b = Boolean.valueOf(((kdl) aepbVar.a).f());
        aepbVar.c(new keg(kefVar));
        Object obj = aepbVar.d;
        kro.l(obj);
        ((kdi) obj).a(kbuVar);
        kbuVar.e = (qcb) aepbVar.c;
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void i(kcq kcqVar, int i) {
        kef kefVar = new kef(6);
        kefVar.a = Integer.valueOf(i);
        keg kegVar = new keg(kefVar);
        aepb aepbVar = this.a;
        aepbVar.c(kegVar);
        Object obj = aepbVar.d;
        kro.l(obj);
        ((kdi) obj).a((kbu) kcqVar);
    }
}
