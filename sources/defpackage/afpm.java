package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afpm extends auot {
    public afpm(Object obj, aunr aunrVar) {
        super(obj, aunrVar);
    }

    @Override // defpackage.auot
    protected final gkd a() {
        afuu afuuVarD = afwt.d(145, "Scr#Comp", afux.a, true);
        try {
            gkd gkdVarA = super.a();
            afuuVarD.close();
            return gkdVarA;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
