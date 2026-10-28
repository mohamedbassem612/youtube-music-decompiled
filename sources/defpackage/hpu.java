package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hpu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public hpu(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public static hpt a() {
        hpt hptVar = new hpt();
        hptVar.b(false);
        hptVar.c(false);
        hptVar.f(false);
        hptVar.d(false);
        hptVar.g(false);
        hptVar.e(false);
        return hptVar;
    }

    public static hpu b() {
        hpt hptVar = new hpt();
        hptVar.b(true);
        hptVar.e(true);
        hptVar.c(true);
        hptVar.f(true);
        hptVar.d(true);
        hptVar.g(true);
        return hptVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hpu) {
            hpu hpuVar = (hpu) obj;
            if (this.a == hpuVar.a && this.b == hpuVar.b && this.c == hpuVar.c && this.d == hpuVar.d && this.e == hpuVar.e && this.f == hpuVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "TrackKeyAttributes{includeManualDownloadedEpisodes=" + this.a + ", includeManualDownloadedSingleMusicTracks=" + this.b + ", includeSmartDownloadedSingleTracks=" + this.c + ", includeMusicTracksInManualDownloadedContainers=" + this.d + ", includePodcastEpisodesInManualDownloadedContainers=" + this.e + ", includeTracksInSmartDownloadedContainers=" + this.f + '}';
    }

    public hpu() {
        throw null;
    }
}
