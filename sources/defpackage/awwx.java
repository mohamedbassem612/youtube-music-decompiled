package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awwx extends awwg {
    private final awoq a;

    public awwx(awoq awoqVar) {
        this.a = awoqVar;
    }

    @Override // defpackage.awwg
    public final void a(Throwable th) {
        this.a.resumeWith(awmy.a);
    }

    @Override // defpackage.awwg
    public final boolean b() {
        return false;
    }
}
