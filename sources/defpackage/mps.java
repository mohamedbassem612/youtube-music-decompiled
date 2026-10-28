package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mps implements avmn {
    final /* synthetic */ mpt a;
    private boolean b = false;

    public mps(mpt mptVar) {
        this.a = mptVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.a.b();
        this.b = true;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b;
    }
}
