package defpackage;

import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ief {
    private static final agrf s = agrf.h("com/google/android/apps/youtube/music/player/queue/persistence/data/MusicPlaybackQueueState$Builder");
    private agke A;
    private aimm B;
    private long C;
    private byte D;
    public Optional a;
    public String b;
    public String c;
    public aobx d;
    public aoyh e;
    public aobz f;
    public agjz g;
    public agke h;
    public aigj i;
    public ajwo j;
    public anvl k;
    public Optional l;
    public Optional m;
    public Optional n;
    public Optional o;
    public Optional p;
    public Optional q;
    public Optional r;
    private agke t;
    private agke u;
    private long v;
    private int w;
    private boolean x;
    private boolean y;
    private agke z;

    public ief(ieg iegVar) {
        this.a = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
        this.t = iegVar.a;
        this.u = iegVar.b;
        this.v = iegVar.c;
        this.w = iegVar.d;
        this.x = iegVar.e;
        this.y = iegVar.f;
        this.a = iegVar.g;
        this.b = iegVar.h;
        this.c = iegVar.i;
        this.d = iegVar.j;
        this.e = iegVar.k;
        this.f = iegVar.l;
        this.h = iegVar.m;
        this.z = iegVar.n;
        this.i = iegVar.o;
        this.A = iegVar.p;
        this.j = iegVar.q;
        this.k = iegVar.r;
        this.l = iegVar.s;
        this.m = iegVar.t;
        this.n = iegVar.u;
        this.o = iegVar.v;
        this.p = iegVar.w;
        this.q = iegVar.x;
        this.B = iegVar.y;
        this.r = iegVar.z;
        this.C = iegVar.A;
        this.D = (byte) 31;
    }

    public final ieg a() {
        if (e().isEmpty()) {
            return d();
        }
        int iB = b();
        int size = e().size();
        if (iB < 0 || iB >= size) {
            ((agrc) ((agrc) s.c().i(agso.a, "MusicPlaybackQueueState")).k("com/google/android/apps/youtube/music/player/queue/persistence/data/MusicPlaybackQueueState$Builder", "build", 219, "MusicPlaybackQueueState.java")).x("PlaybackPosition exceeds bounds, resetting to zero. PlaybackPosition: %d, size: %d ", b(), e().size());
            i(0);
            m(0L);
        }
        if (c() < 0) {
            ((agrc) ((agrc) s.c().i(agso.a, "MusicPlaybackQueueState")).k("com/google/android/apps/youtube/music/player/queue/persistence/data/MusicPlaybackQueueState$Builder", "build", 226, "MusicPlaybackQueueState.java")).v("Timestamp is negative, resetting to zero. Timestamp: %d", c());
            m(0L);
        }
        if ((this.D & 8) == 0) {
            throw new IllegalStateException("Property \"hasExpandedAutomix\" has not been set");
        }
        if (!this.y) {
            agke agkeVar = this.u;
            if (agkeVar == null) {
                throw new IllegalStateException("Property \"autonav\" has not been set");
            }
            if (!agkeVar.isEmpty()) {
                ((agrc) ((agrc) s.c().i(agso.a, "MusicPlaybackQueueState")).k("com/google/android/apps/youtube/music/player/queue/persistence/data/MusicPlaybackQueueState$Builder", "build", 231, "MusicPlaybackQueueState.java")).t("hasExpandedAutomix is false but the autonav is not empty; overriding flag.");
                g(true);
            }
        }
        return d();
    }

    public final int b() {
        if ((this.D & 2) != 0) {
            return this.w;
        }
        throw new IllegalStateException("Property \"playbackPosition\" has not been set");
    }

    public final long c() {
        if ((this.D & 1) != 0) {
            return this.v;
        }
        throw new IllegalStateException("Property \"timestamp\" has not been set");
    }

    public final ieg d() {
        agke agkeVar;
        agke agkeVar2;
        aimm aimmVar;
        agjz agjzVar = this.g;
        if (agjzVar != null) {
            this.h = agjzVar.g();
        } else if (this.h == null) {
            this.h = agpi.a;
        }
        if (this.z == null) {
            this.z = agpi.a;
        }
        if (this.A == null) {
            this.A = agpi.a;
        }
        if (this.D == 31 && (agkeVar = this.t) != null && (agkeVar2 = this.u) != null && (aimmVar = this.B) != null) {
            return new ieg(agkeVar, agkeVar2, this.v, this.w, this.x, this.y, this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.z, this.i, this.A, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, aimmVar, this.r, this.C);
        }
        StringBuilder sb = new StringBuilder();
        if (this.t == null) {
            sb.append(" queue");
        }
        if (this.u == null) {
            sb.append(" autonav");
        }
        if ((this.D & 1) == 0) {
            sb.append(" timestamp");
        }
        if ((this.D & 2) == 0) {
            sb.append(" playbackPosition");
        }
        if ((this.D & 4) == 0) {
            sb.append(" isInfinite");
        }
        if ((this.D & 8) == 0) {
            sb.append(" hasExpandedAutomix");
        }
        if (this.B == null) {
            sb.append(" syncStatus");
        }
        if ((this.D & 16) == 0) {
            sb.append(" queueSavedTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final agke e() {
        agke agkeVar = this.t;
        if (agkeVar != null) {
            return agkeVar;
        }
        throw new IllegalStateException("Property \"queue\" has not been set");
    }

    public final void f(List list) {
        this.u = agke.n(list);
    }

    public final void g(boolean z) {
        this.y = z;
        this.D = (byte) (this.D | 8);
    }

    public final void h(boolean z) {
        this.x = z;
        this.D = (byte) (this.D | 4);
    }

    public final void i(int i) {
        this.w = i;
        this.D = (byte) (this.D | 2);
    }

    public final void j(List list) {
        this.t = agke.n(list);
    }

    public final void k(long j) {
        this.C = j;
        this.D = (byte) (this.D | 16);
    }

    public final void l(aimm aimmVar) {
        if (aimmVar == null) {
            throw new NullPointerException("Null syncStatus");
        }
        this.B = aimmVar;
    }

    public final void m(long j) {
        this.v = j;
        this.D = (byte) (this.D | 1);
    }

    public ief() {
        this.a = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.r = Optional.empty();
    }
}
