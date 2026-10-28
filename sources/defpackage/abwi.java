package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abwi {
    public short a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;

    public final abwj a() {
        if (this.a == 8191) {
            return new abwj(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" enableSequencerV2");
        }
        if ((this.a & 2) == 0) {
            sb.append(" enableSabrPrefetch");
        }
        if ((this.a & 4) == 0) {
            sb.append(" playbackTransience");
        }
        if ((this.a & 8) == 0) {
            sb.append(" keepLastFrame");
        }
        if ((this.a & 16) == 0) {
            sb.append(" emitSequencerNavigationRequestEvents");
        }
        if ((this.a & 32) == 0) {
            sb.append(" useGetPlayerWhenOnlyPrefetching");
        }
        if ((this.a & 64) == 0) {
            sb.append(" enableMultipleVideoQueuing");
        }
        if ((this.a & 128) == 0) {
            sb.append(" propagateWatchNextExceptionsForQueuedVideos");
        }
        if ((this.a & 256) == 0) {
            sb.append(" useQueueVideosForQueueNextVideoInternally");
        }
        if ((this.a & 512) == 0) {
            sb.append(" androidSabrDontCancelFuturePrefetch");
        }
        if ((this.a & 1024) == 0) {
            sb.append(" enableGetPlayerUnifiedControllerMigration");
        }
        if ((this.a & 2048) == 0) {
            sb.append(" enableAsyncClientPrefetch");
        }
        if ((this.a & 4096) == 0) {
            sb.append(" enableBeforeQueuedVideoTransitionCallback");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.i = z;
        this.a = (short) (this.a | 512);
    }

    public final void c(boolean z) {
        this.d = z;
        this.a = (short) (this.a | 16);
    }

    public final void d(boolean z) {
        this.k = z;
        this.a = (short) (this.a | 2048);
    }

    public final void e(boolean z) {
        this.l = z;
        this.a = (short) (this.a | 4096);
    }

    public final void f(boolean z) {
        this.j = z;
        this.a = (short) (this.a | 1024);
    }

    public final void g(boolean z) {
        this.f = z;
        this.a = (short) (this.a | 64);
    }

    public final void h(boolean z) {
        this.c = z;
        this.a = (short) (this.a | 2);
    }

    public final void i(boolean z) {
        this.b = z;
        this.a = (short) (this.a | 1);
    }

    public final void j(boolean z) {
        this.g = z;
        this.a = (short) (this.a | 128);
    }

    public final void k(boolean z) {
        this.e = z;
        this.a = (short) (this.a | 32);
    }

    public final void l(boolean z) {
        this.h = z;
        this.a = (short) (this.a | 256);
    }
}
