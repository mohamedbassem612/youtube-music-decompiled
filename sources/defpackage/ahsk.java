package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahsk {
    public int a;
    public Object b;
    private long c;
    private byte d;

    public final ahsl a() {
        if (this.d != 1) {
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }
        return new ahsl((String) this.b, this.c, this.a);
    }

    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public final abnt c() {
        Object obj;
        int i;
        if (this.d == 1 && (obj = this.b) != null && (i = this.a) != 0) {
            return new abnt(this.c, (abns) obj, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" mediaDurationMs");
        }
        if (this.b == null) {
            sb.append(" prefetchPlaybackContextWrapper");
        }
        if (this.a == 0) {
            sb.append(" fetchMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(int i) {
        if (i == 0) {
            throw new NullPointerException("Null fetchMode");
        }
        this.a = i;
    }

    public final void e(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public final void f(abns abnsVar) {
        if (abnsVar == null) {
            throw new NullPointerException("Null prefetchPlaybackContextWrapper");
        }
        this.b = abnsVar;
    }

    public final pfj g() {
        Object obj;
        if (this.d == 3 && (obj = this.b) != null) {
            return new pfj(this.c, this.a, (byte[]) obj);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" id");
        }
        if ((this.d & 2) == 0) {
            sb.append(" jobType");
        }
        if (this.b == null) {
            sb.append(" payload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(long j) {
        this.c = j;
        this.d = (byte) (this.d | 1);
    }

    public final void i(int i) {
        this.a = i;
        this.d = (byte) (this.d | 2);
    }

    public final void j(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = bArr;
    }
}
