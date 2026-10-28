package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import defpackage.agke;
import defpackage.aguu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_SampleHolder_EmbeddedMetadataWithSegment extends SampleHolder.EmbeddedMetadataWithSegment {
    private final agke a;
    private final BufferedMediaSegment b;
    private final long c;

    public AutoValue_SampleHolder_EmbeddedMetadataWithSegment(agke agkeVar, BufferedMediaSegment bufferedMediaSegment, long j) {
        if (agkeVar == null) {
            throw new NullPointerException("Null embeddedMetadataList");
        }
        this.a = agkeVar;
        if (bufferedMediaSegment == null) {
            throw new NullPointerException("Null bufferedMediaSegment");
        }
        this.b = bufferedMediaSegment;
        this.c = j;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder.EmbeddedMetadataWithSegment
    public final long a() {
        return this.c;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder.EmbeddedMetadataWithSegment
    public final BufferedMediaSegment b() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder.EmbeddedMetadataWithSegment
    public final agke c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SampleHolder.EmbeddedMetadataWithSegment) {
            SampleHolder.EmbeddedMetadataWithSegment embeddedMetadataWithSegment = (SampleHolder.EmbeddedMetadataWithSegment) obj;
            if (aguu.v(this.a, embeddedMetadataWithSegment.c()) && this.b.equals(embeddedMetadataWithSegment.b()) && this.c == embeddedMetadataWithSegment.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        BufferedMediaSegment bufferedMediaSegment = this.b;
        return "EmbeddedMetadataWithSegment{embeddedMetadataList=" + this.a.toString() + ", bufferedMediaSegment=" + bufferedMediaSegment.toString() + ", ingestionOffsetUs=" + this.c + '}';
    }
}
