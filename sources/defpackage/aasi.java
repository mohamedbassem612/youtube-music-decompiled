package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aasi {
    public agev a;
    public agev b;
    public agev c;
    public aamb d;
    public int e;
    private agev f;
    private long g;
    private long h;
    private double i;
    private boolean j;
    private agev k;
    private agev l;
    private int m;
    private byte n;

    public aasi() {
        agdf agdfVar = agdf.a;
        this.a = agdfVar;
        this.f = agdfVar;
        this.k = agdfVar;
        this.l = agdfVar;
        this.b = agdfVar;
        this.c = agdfVar;
    }

    public final aasj a() {
        int i;
        if (this.n == 31 && (i = this.e) != 0) {
            return new aasj(i, this.a, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" type");
        }
        if ((this.n & 1) == 0) {
            sb.append(" transferSize");
        }
        if ((this.n & 2) == 0) {
            sb.append(" bytesTransferred");
        }
        if ((this.n & 4) == 0) {
            sb.append(" transferSpeedBytesPerSecond");
        }
        if ((this.n & 8) == 0) {
            sb.append(" usingDataToDownloadStreams");
        }
        if ((this.n & 16) == 0) {
            sb.append(" statusReason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.h = j;
        this.n = (byte) (this.n | 2);
    }

    public final void c(aogv aogvVar) {
        this.l = agev.i(aogvVar);
    }

    public final void d(aamg aamgVar) {
        this.k = agev.i(aamgVar);
    }

    public final void e(int i) {
        this.m = i;
        this.n = (byte) (this.n | 16);
    }

    public final void f(String str) {
        this.f = agev.i(str);
    }

    public final void g(long j) {
        this.g = j;
        this.n = (byte) (this.n | 1);
    }

    public final void h(double d) {
        this.i = d;
        this.n = (byte) (this.n | 4);
    }

    public final void i(boolean z) {
        this.j = z;
        this.n = (byte) (this.n | 8);
    }
}
