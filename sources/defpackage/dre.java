package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dre implements AutoCloseable {
    public final drc c;

    /* JADX WARN: Illegal instructions before constructor call */
    public dre(dre dreVar) {
        drc drcVar = dreVar.c;
        dqr.a.incrementAndGet();
        this(drcVar);
        boolean z = this.c.e;
    }

    public dre(drc drcVar) {
        this.c = drcVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
