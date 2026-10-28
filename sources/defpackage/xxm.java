package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xxm implements abtj {
    private final xxe a;
    private final xxn b;
    private final awmd c;
    private final abnc d;
    private final vxz e;
    private final acue f;

    public xxm(acue acueVar, xxe xxeVar, xxn xxnVar, awmd awmdVar, abnc abncVar, vxz vxzVar) {
        this.f = acueVar;
        this.a = xxeVar;
        this.b = xxnVar;
        this.c = awmdVar;
        this.d = abncVar;
        this.e = vxzVar;
    }

    private final boolean e() {
        yco ycoVar = ((ycp) this.c.io()).e;
        this.e.l(235, 45813668L, false);
        return ycoVar != null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [abyj, java.lang.Object] */
    @Override // defpackage.abtj
    public final abyj a() {
        return e() ? this.b : this.f.a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [acew, java.lang.Object] */
    @Override // defpackage.abtj
    public final acew b() {
        return e() ? this.a : this.f.b;
    }

    public final void c() {
        abnc abncVar = this.d;
        boolean zE = e();
        if (zE != abncVar.k) {
            abncVar.k = zE;
            abncVar.f();
        }
    }

    @Override // defpackage.abtj
    public final boolean d() {
        return !e();
    }
}
