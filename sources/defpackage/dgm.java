package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dgm extends brj {
    public final /* synthetic */ dgn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgm(dgn dgnVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.b = dgnVar;
    }

    @Override // defpackage.brj
    public final void b(int i) {
        this.b.c.b.post(new awu(this, i, 5));
    }

    @Override // defpackage.brj
    public final void c(int i) {
        this.b.c.b.post(new awu(this, i, 4));
    }
}
