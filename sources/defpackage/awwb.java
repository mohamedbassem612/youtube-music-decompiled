package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awwb extends awwg {
    private final awqg a;
    private final awto b = new awto(false, awts.a);

    public awwb(awqg awqgVar) {
        this.a = awqgVar;
    }

    @Override // defpackage.awwg
    public final void a(Throwable th) {
        if (this.b.b()) {
            this.a.invoke(th);
        }
    }

    @Override // defpackage.awwg
    public final boolean b() {
        return true;
    }
}
