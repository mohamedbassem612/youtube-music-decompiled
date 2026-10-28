package app.rive.semantics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidVirtualNodeIdAllocator {
    public static final int $stable = 8;
    private long nextVirtualId;

    public final int allocate() {
        long j = this.nextVirtualId;
        if (j > 2147483647L) {
            throw new IllegalStateException("Android virtual accessibility node ID space exhausted");
        }
        this.nextVirtualId = 1 + j;
        return (int) j;
    }
}
