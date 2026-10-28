package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wev implements avmn {
    private final avmn a;
    private final wex b;

    public wev(avmn avmnVar, wex wexVar) {
        this.a = avmnVar;
        this.b = wexVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.a.dispose();
        wex wexVar = this.b;
        if (wexVar.a.f()) {
            return;
        }
        wexVar.kn();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.a.f();
    }
}
