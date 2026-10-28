package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aamk {
    public byte[] a;
    public byte[] b;
    public atxq c;
    public String d;
    public String e;
    public Uri f;
    private wgs g;
    private boolean h;
    private long i;
    private int j;
    private long k;
    private int l;
    private boolean m;
    private boolean n;
    private byte o;
    private int p;

    public final aaml a() {
        if (this.o == 127 && this.g != null && this.p != 0) {
            return new aaml(this.g, this.h, this.i, this.j, this.k, this.p, this.a, this.b, this.c, this.d, this.l, this.e, this.m, this.n, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" formatStream");
        }
        if ((this.o & 1) == 0) {
            sb.append(" audioOnly");
        }
        if ((this.o & 2) == 0) {
            sb.append(" bytesTransferred");
        }
        if ((this.o & 4) == 0) {
            sb.append(" streamStatus");
        }
        if ((this.o & 8) == 0) {
            sb.append(" streamStatusTimestamp");
        }
        if (this.p == 0) {
            sb.append(" offlineStorageFormat");
        }
        if ((this.o & 16) == 0) {
            sb.append(" streamEncryptionKeyType");
        }
        if ((this.o & 32) == 0) {
            sb.append(" streamExpired");
        }
        if ((this.o & 64) == 0) {
            sb.append(" entityBased");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.h = z;
        this.o = (byte) (this.o | 1);
    }

    public final void c(long j) {
        this.i = j;
        this.o = (byte) (this.o | 2);
    }

    public final void d(boolean z) {
        this.n = z;
        this.o = (byte) (this.o | 64);
    }

    public final void e(wgs wgsVar) {
        if (wgsVar == null) {
            throw new NullPointerException("Null formatStream");
        }
        this.g = wgsVar;
    }

    public final void f(int i) {
        this.l = i;
        this.o = (byte) (this.o | 16);
    }

    public final void g(boolean z) {
        this.m = z;
        this.o = (byte) (this.o | 32);
    }

    public final void h(int i) {
        this.j = i;
        this.o = (byte) (this.o | 4);
    }

    public final void i(long j) {
        this.k = j;
        this.o = (byte) (this.o | 8);
    }

    public final void j(int i) {
        if (i == 0) {
            throw new NullPointerException("Null offlineStorageFormat");
        }
        this.p = i;
    }
}
