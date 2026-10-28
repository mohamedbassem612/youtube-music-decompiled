package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdc {
    private boolean a;
    private long b;
    private int c;
    private int d;
    private byte e;

    public final rdd a() {
        if (this.e == 15) {
            return new rdd(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" canDropFrames");
        }
        if ((this.e & 2) == 0) {
            sb.append(" minFramesToProcess");
        }
        if ((this.e & 4) == 0) {
            sb.append(" maxDropFrames");
        }
        if ((this.e & 8) == 0) {
            sb.append(" dropFramesTolerance");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.e = (byte) (this.e | 1);
    }

    public final void c(int i) {
        this.d = i;
        this.e = (byte) (this.e | 8);
    }

    public final void d(int i) {
        this.c = i;
        this.e = (byte) (this.e | 4);
    }

    public final void e(long j) {
        this.b = j;
        this.e = (byte) (this.e | 2);
    }
}
