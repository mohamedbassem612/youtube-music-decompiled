package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tez implements tgs {
    private final tbt a;
    private final tas b;
    private final tas c;
    private final tas d;
    private final tas e;

    public tez(tbt tbtVar, tas tasVar, tas tasVar2, tas tasVar3, tas tasVar4) {
        this.a = tbtVar;
        this.b = tasVar;
        this.c = tasVar2;
        this.d = tasVar3;
        this.e = tasVar4;
    }

    @Override // defpackage.tgs
    public final void a() {
        this.a.c(this.b);
    }

    @Override // defpackage.tgs
    public final void b() {
        tas tasVar = this.e;
        if (tasVar != null) {
            this.a.c(tasVar);
        }
    }

    @Override // defpackage.tgs
    public final void c() {
        tas tasVar = this.d;
        if (tasVar != null) {
            this.a.c(tasVar);
        }
    }

    @Override // defpackage.tgs
    public final void d() {
        this.a.c(this.c);
    }

    @Override // defpackage.tgs
    public final /* synthetic */ void e() {
        d();
    }
}
