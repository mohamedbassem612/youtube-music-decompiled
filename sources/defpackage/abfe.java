package defpackage;

import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$VideoRegion;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abfe {
    public static final int[] a = {3, 2, 0, 1};
    public static final List b;
    public static final List c;
    public StitchedSegmentsMetadataOuterClass$VideoRegion d;
    public StitchedSegmentsMetadataOuterClass$VideoRegion e;
    public abfd f;
    public int g;
    public int h;
    public yxd i;
    public boolean j;
    private int k;
    private int l;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        b = atqq.aL(new Float[]{fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf2, fValueOf, fValueOf, fValueOf});
        Float fValueOf3 = Float.valueOf(-1.0f);
        c = atqq.aL(new Float[]{fValueOf3, fValueOf2, fValueOf2, fValueOf2, fValueOf2, fValueOf3, fValueOf3, fValueOf3});
        atqq.aL(new Float[]{fValueOf3, fValueOf2, fValueOf2, fValueOf2, fValueOf2, fValueOf, fValueOf3, fValueOf});
        atqq.aL(new Float[]{fValueOf3, fValueOf, fValueOf2, fValueOf, fValueOf2, fValueOf3, fValueOf3, fValueOf3});
    }

    public abfe(int i, int i2, abfd abfdVar, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion, StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion2) {
        this.k = i;
        this.l = i2;
        this.d = stitchedSegmentsMetadataOuterClass$VideoRegion;
        this.e = stitchedSegmentsMetadataOuterClass$VideoRegion2;
        this.f = abfdVar;
        this.g = aavv.k(i, abfdVar, stitchedSegmentsMetadataOuterClass$VideoRegion, stitchedSegmentsMetadataOuterClass$VideoRegion2);
        this.h = aavv.i(i2, abfdVar, stitchedSegmentsMetadataOuterClass$VideoRegion, stitchedSegmentsMetadataOuterClass$VideoRegion2);
        this.i = aavv.j(i, i2, abfdVar, stitchedSegmentsMetadataOuterClass$VideoRegion, stitchedSegmentsMetadataOuterClass$VideoRegion2);
    }

    public final synchronized void a() {
        if (this.j) {
            this.g = aavv.k(this.k, this.f, this.d, this.e);
            this.h = aavv.i(this.l, this.f, this.d, this.e);
            this.i = aavv.j(this.k, this.l, this.f, this.d, this.e);
            this.j = false;
        }
    }

    public final void b(int i) {
        synchronized (this) {
            if (this.l != i) {
                this.l = i;
                this.j = true;
            }
        }
    }

    public final void c(int i) {
        synchronized (this) {
            if (this.k != i) {
                this.k = i;
                this.j = true;
            }
        }
    }

    public final void d(abfd abfdVar) {
        synchronized (this) {
            if (this.f != abfdVar) {
                this.f = abfdVar;
                this.j = true;
            }
        }
    }
}
