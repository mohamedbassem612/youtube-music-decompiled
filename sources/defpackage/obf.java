package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class obf implements Comparable {
    private final /* synthetic */ int $cid;
    public final long a;
    public final Object b;

    public obf(long j, byte[] bArr, int i) {
        this.$cid = i;
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.$cid != 0) {
            return Long.compare(this.a, ((obf) obj).a);
        }
        return Long.compare(this.a, ((obf) obj).a);
    }

    public obf(Runnable runnable, long j, int i) {
        this.$cid = i;
        this.b = runnable;
        this.a = j;
    }
}
