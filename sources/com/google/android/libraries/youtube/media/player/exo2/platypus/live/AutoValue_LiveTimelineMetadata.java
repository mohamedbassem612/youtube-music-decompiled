package com.google.android.libraries.youtube.media.player.exo2.platypus.live;

import defpackage.bss;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LiveTimelineMetadata extends LiveTimelineMetadata {
    public final boolean a;
    public final bss b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final long h;

    public AutoValue_LiveTimelineMetadata(boolean z, bss bssVar, long j, long j2, long j3, long j4, boolean z2, long j5) {
        this.a = z;
        if (bssVar == null) {
            throw new NullPointerException("Null mediaItem");
        }
        this.b = bssVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = z2;
        this.h = j5;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineMetadata
    public final long a() {
        return this.h;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineMetadata
    public final long b() {
        return this.f;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineMetadata
    public final long c() {
        return this.d;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineMetadata
    public final long d() {
        return this.c;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineMetadata
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LiveTimelineMetadata) {
            LiveTimelineMetadata liveTimelineMetadata = (LiveTimelineMetadata) obj;
            if (this.a == liveTimelineMetadata.h() && this.b.equals(liveTimelineMetadata.f()) && this.c == liveTimelineMetadata.d() && this.d == liveTimelineMetadata.c() && this.e == liveTimelineMetadata.e() && this.f == liveTimelineMetadata.b() && this.g == liveTimelineMetadata.g() && this.h == liveTimelineMetadata.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineMetadata
    public final bss f() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineMetadata
    public final boolean g() {
        return this.g;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineMetadata
    public final boolean h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        long j4 = this.f;
        int i = ((((((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003;
        long j5 = this.h;
        return i ^ ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        return "LiveTimelineMetadata{isSeekable=" + this.a + ", mediaItem=" + this.b.toString() + ", minSeekableMediaTimeUs=" + this.c + ", maxSeekableMediaTimeUs=" + this.d + ", utcOffsetUs=" + this.e + ", headMediaTimeUs=" + this.f + ", isMaxTimeLive=" + this.g + ", defaultPositionUs=" + this.h + '}';
    }
}
