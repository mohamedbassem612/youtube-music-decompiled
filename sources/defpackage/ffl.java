package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffl implements ffm {
    final /* synthetic */ ffm a;
    private volatile Object b;

    public ffl(ffm ffmVar) {
        this.a = ffmVar;
    }

    @Override // defpackage.ffm
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object objA = this.a.a();
                    if (objA == null) {
                        throw new NullPointerException("Argument must not be null");
                    }
                    this.b = objA;
                }
            }
        }
        return this.b;
    }
}
