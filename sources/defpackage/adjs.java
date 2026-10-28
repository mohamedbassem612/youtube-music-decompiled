package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adjs implements Runnable, Comparable {
    private final Runnable a;
    private final Runnable b;

    public adjs(Runnable runnable) {
        this.b = runnable;
        this.a = afwl.i(runnable);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) this.b).compareTo(((adjs) obj).b);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof adjs)) {
            return false;
        }
        return this.b.equals(((adjs) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
