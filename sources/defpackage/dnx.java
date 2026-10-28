package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnx implements AutoCloseable {
    public final String a;
    public final awqk b;
    public final awmi c = new awmp(new py(this, 14));
    public final dov d;

    public dnx(dov dovVar, String str, awqk awqkVar) {
        this.d = dovVar;
        this.a = str;
        this.b = awqkVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        awmi awmiVar = this.c;
        if (awmiVar.b()) {
            ((dpt) awmiVar.a()).close();
        }
    }
}
