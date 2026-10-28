package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hpt {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private byte g;

    public final hpu a() {
        if (this.g == 63) {
            return new hpu(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" includeManualDownloadedEpisodes");
        }
        if ((this.g & 2) == 0) {
            sb.append(" includeManualDownloadedSingleMusicTracks");
        }
        if ((this.g & 4) == 0) {
            sb.append(" includeSmartDownloadedSingleTracks");
        }
        if ((this.g & 8) == 0) {
            sb.append(" includeMusicTracksInManualDownloadedContainers");
        }
        if ((this.g & 16) == 0) {
            sb.append(" includePodcastEpisodesInManualDownloadedContainers");
        }
        if ((this.g & 32) == 0) {
            sb.append(" includeTracksInSmartDownloadedContainers");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.g = (byte) (this.g | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.g = (byte) (this.g | 2);
    }

    public final void d(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 8);
    }

    public final void e(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 16);
    }

    public final void f(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 4);
    }

    public final void g(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 32);
    }
}
