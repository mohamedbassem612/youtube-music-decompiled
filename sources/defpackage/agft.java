package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agft implements agfr {
    private final agga a = new agga();
    private volatile agfr b;
    private Object c;

    public agft(agfr agfrVar) {
        agfrVar.getClass();
        this.b = agfrVar;
    }

    @Override // defpackage.agfr
    public final Object io() {
        if (this.b != null) {
            synchronized (this.a) {
                if (this.b != null) {
                    Object objIo = this.b.io();
                    this.c = objIo;
                    this.b = null;
                    return objIo;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            obj = "<supplier that returned " + String.valueOf(this.c) + '>';
        }
        return a.cn((byte) 41, obj, "Suppliers.memoize(");
    }
}
