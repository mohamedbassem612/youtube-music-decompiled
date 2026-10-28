package defpackage;

import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aayz {
    public final StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList a;

    public aayz(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) {
        stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.getClass();
        this.a = stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof aayz) && awrc.c(this.a, ((aayz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StitchedSegmentsMetadataListEvent(stitchedSegmentsMetadataList=" + this.a + ')';
    }
}
