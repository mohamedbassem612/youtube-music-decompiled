package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class tyn implements agfr, awmd {
    private Object a;

    protected abstract Object b();

    @Override // defpackage.agfr
    public final synchronized Object io() {
        Object objB;
        objB = this.a;
        if (objB == null) {
            objB = b();
            this.a = objB;
        }
        return objB;
    }
}
