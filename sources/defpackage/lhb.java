package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lhb implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ lhc c;

    public lhb(lhc lhcVar, long j, long j2) {
        this.c = lhcVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.aU().j(new lei(this, 11));
    }
}
