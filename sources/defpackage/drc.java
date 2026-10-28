package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class drc implements AutoCloseable {
    public final dqq d;
    public final boolean e = false;
    public final Object f = new Object();
    public volatile boolean g;

    public drc(dqq dqqVar) {
        this.d = dqqVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
