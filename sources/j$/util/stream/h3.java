package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class h3 extends w2 {
    public long b;
    public long c;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            ((g3) this.a).accept(obj);
        }
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void p(long j) {
        ((g3) this.a).p(j >= 0 ? Math.max(-1L, Math.min(j, this.c)) : -1L);
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final boolean s() {
        return this.c == 0 || ((g3) this.a).s();
    }
}
