package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwg implements cvk {
    public final long a;
    private final cvk b;

    public cwg(long j, cvk cvkVar) {
        this.a = j;
        this.b = cvkVar;
    }

    @Override // defpackage.cvk
    public final cwj s(int i, int i2) {
        return this.b.s(i, i2);
    }

    @Override // defpackage.cvk
    public final void t() {
        this.b.t();
    }

    @Override // defpackage.cvk
    public final void z(cvz cvzVar) {
        this.b.z(new cwf(this, cvzVar, cvzVar));
    }
}
