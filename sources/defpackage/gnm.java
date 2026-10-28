package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnm {
    private long a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private byte g;

    public final gnn a() {
        if (this.g == 63) {
            return new gnn(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" responseTimeMs");
        }
        if ((this.g & 2) == 0) {
            sb.append(" wasLoadedFromDiskCache");
        }
        if ((this.g & 4) == 0) {
            sb.append(" wasSavedToDiskCache");
        }
        if ((this.g & 8) == 0) {
            sb.append(" wasClientGenerated");
        }
        if ((this.g & 16) == 0) {
            sb.append(" wasStaleOnRead");
        }
        if ((this.g & 32) == 0) {
            sb.append(" isGhostLoadingState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 32);
    }

    public final void c(long j) {
        this.a = j;
        this.g = (byte) (this.g | 1);
    }

    public final void d(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 8);
    }

    public final void e(boolean z) {
        this.b = z;
        this.g = (byte) (this.g | 2);
    }

    public final void f(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 4);
    }

    public final void g(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 16);
    }
}
