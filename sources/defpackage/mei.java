package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mei extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    avmm a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nth b;

    @fmt(a = 10)
    @fmu(a = fmv.a)
    fgy c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    ntr d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mlf e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nwy f;

    public mei() {
        super("ElementsRootFlat");
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        return this.c;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        mei meiVar = (mei) super.l();
        fgy fgyVar = meiVar.c;
        meiVar.c = fgyVar != null ? fgyVar.l() : null;
        return meiVar;
    }

    @Override // defpackage.fgy
    public final fly v(fhd fhdVar, fly flyVar) {
        fly flyVarA = fly.a(flyVar);
        flyVarA.d(ntr.class, this.d);
        flyVarA.d(nth.class, this.b);
        flyVarA.d(avmm.class, this.a);
        flyVarA.d(nwy.class, this.f);
        mlf mlfVar = this.e;
        if (mlfVar == null) {
            mlfVar = (mlf) fhdVar.l(mlf.class);
        }
        flyVarA.d(mlf.class, mlfVar);
        return flyVarA;
    }
}
