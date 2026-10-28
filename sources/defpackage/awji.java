package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awji implements Comparable {
    final Runnable a;
    final long b;
    final int c;
    volatile boolean d;

    public awji(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        awji awjiVar = (awji) obj;
        long j = awjiVar.b;
        long j2 = this.b;
        if (j2 < j) {
            i = -1;
        } else {
            i = j2 > j ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        int i2 = this.c;
        int i3 = awjiVar.c;
        if (i2 < i3) {
            return -1;
        }
        return i2 <= i3 ? 0 : 1;
    }
}
