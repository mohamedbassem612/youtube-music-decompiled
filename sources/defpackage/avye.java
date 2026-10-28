package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avye extends avlm {
    final avlo a;

    public avye(avlo avloVar) {
        this.a = avloVar;
    }

    @Override // defpackage.avlm
    protected final void G(avln avlnVar) {
        avyd avydVar = new avyd(avlnVar);
        avlnVar.d(avydVar);
        try {
            this.a.a(avydVar);
        } catch (Throwable th) {
            avkz.a(th);
            avydVar.b(th);
        }
    }
}
