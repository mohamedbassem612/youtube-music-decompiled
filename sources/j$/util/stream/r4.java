package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class r4 {
    public final long a;
    public final long b;
    public Spliterator c;
    public long d;
    public long e;

    public r4(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.c = spliterator;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    public Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new m4((j$.util.c0) spliterator, j, j2, j3, j4);
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m844trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.d;
            long jMin = Math.min(jEstimateSize, this.b);
            long j2 = this.a;
            if (j2 >= jMin) {
                this.d = jMin;
            } else {
                long j3 = this.b;
                if (jMin < j3) {
                    long j4 = this.d;
                    if (j4 < j2 || jEstimateSize > j3) {
                        this.d = jMin;
                        return a(spliteratorTrySplit, j2, j3, j4, jMin);
                    }
                    this.d = jMin;
                    return spliteratorTrySplit;
                }
                this.c = spliteratorTrySplit;
                this.e = jMin;
            }
        }
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ j$.util.j0 m846trySplit() {
        return (j$.util.j0) m844trySplit();
    }

    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m844trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Spliterator.OfLong m843trySplit() {
        return (Spliterator.OfLong) m844trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ j$.util.c0 m845trySplit() {
        return (j$.util.c0) m844trySplit();
    }
}
