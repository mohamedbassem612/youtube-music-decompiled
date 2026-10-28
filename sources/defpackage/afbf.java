package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afbf extends afba {
    private final afba a;
    private final float b;

    public afbf(afba afbaVar, float f) {
        this.a = afbaVar;
        this.b = f;
    }

    @Override // defpackage.afba
    public final void b(float f, float f2, float f3, afbu afbuVar) {
        this.a.b(f, f2 - this.b, f3, afbuVar);
    }

    @Override // defpackage.afba
    public final boolean c() {
        return true;
    }
}
