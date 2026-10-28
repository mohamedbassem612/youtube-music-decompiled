package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abuf {
    public abun a;
    public abun b;
    private abul c;
    private abul d;
    private boolean e;
    private abnt f;
    private abue g;
    private boolean h;
    private byte i;
    private aasc j;

    public final abug a() {
        if (this.i == 7 && this.c != null && this.a != null && this.d != null && this.b != null && this.f != null && this.j != null && this.g != null) {
            return new abug(this.c, this.a, this.d, this.b, this.e, this.f, this.j, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" currentIndex");
        }
        if (this.a == null) {
            sb.append(" currentSequenceItem");
        }
        if (this.d == null) {
            sb.append(" indexOfItemToPrefetch");
        }
        if (this.b == null) {
            sb.append(" originalSequenceItemToPrefetch");
        }
        if ((this.i & 1) == 0) {
            sb.append(" isNext");
        }
        if (this.f == null) {
            sb.append(" prefetchPrebufferParameters");
        }
        if (this.j == null) {
            sb.append(" prefetchCallbacks");
        }
        if (this.g == null) {
            sb.append(" beforeQueuedVideoTransitionCallback");
        }
        if ((this.i & 2) == 0) {
            sb.append(" isImmediatePrefetch");
        }
        if ((this.i & 4) == 0) {
            sb.append(" fetchMedia");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(abue abueVar) {
        if (abueVar == null) {
            throw new NullPointerException("Null beforeQueuedVideoTransitionCallback");
        }
        this.g = abueVar;
    }

    public final void c(abul abulVar) {
        if (abulVar == null) {
            throw new NullPointerException("Null currentIndex");
        }
        this.c = abulVar;
    }

    public final void d(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 4);
    }

    public final void e(abul abulVar) {
        if (abulVar == null) {
            throw new NullPointerException("Null indexOfItemToPrefetch");
        }
        this.d = abulVar;
    }

    public final void f(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 1);
    }

    public final void g(abnt abntVar) {
        if (abntVar == null) {
            throw new NullPointerException("Null prefetchPrebufferParameters");
        }
        this.f = abntVar;
    }

    public final void h() {
        this.i = (byte) (this.i | 2);
    }

    public final void i(aasc aascVar) {
        if (aascVar == null) {
            throw new NullPointerException("Null prefetchCallbacks");
        }
        this.j = aascVar;
    }
}
