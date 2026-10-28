package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cok {
    public long a;
    public long b;
    public cok c;
    public aami d;

    public cok(long j, int i) {
        c(j, i);
    }

    public final int a(long j) {
        long j2 = j - this.a;
        int i = this.d.a;
        return (int) j2;
    }

    public final cok b() {
        this.d = null;
        cok cokVar = this.c;
        this.c = null;
        return cokVar;
    }

    public final void c(long j, int i) {
        ahno.O(this.d == null);
        this.a = j;
        this.b = j + ((long) i);
    }

    public final cok d() {
        cok cokVar = this.c;
        if (cokVar == null || cokVar.d == null) {
            return null;
        }
        return cokVar;
    }

    public final aami e() {
        aami aamiVar = this.d;
        aamiVar.getClass();
        return aamiVar;
    }
}
