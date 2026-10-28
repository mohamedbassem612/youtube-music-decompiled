package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujh {
    public String a;
    public aljj b;
    private long c;
    private Uri d;
    private String e;
    private long f;
    private long g;
    private long h;
    private int i;
    private int j;
    private int k;
    private int l;
    private byte m = -1;

    public ujh(uji ujiVar) {
        this.c = ujiVar.a;
        this.d = ujiVar.b;
        this.e = ujiVar.c;
        this.a = ujiVar.d;
        this.f = ujiVar.e;
        this.g = ujiVar.f;
        this.b = ujiVar.g;
        this.h = ujiVar.h;
        this.i = ujiVar.i;
        this.j = ujiVar.j;
        this.k = ujiVar.k;
        this.l = ujiVar.l;
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    public final uji a() {
        Uri uri;
        String str;
        if (this.m == -1 && (uri = this.d) != null && (str = this.e) != null) {
            uji ujiVar = new uji(this.c, uri, str, this.a, this.f, this.g, this.b, this.h, this.i, this.j, this.k, this.l);
            ahno.P(ujiVar.a != Long.MIN_VALUE || ujiVar.i == 2, "encountered non-IMAGE_FROM_FILE file without unique ID specified");
            long j = ujiVar.e;
            Uri uri2 = ujiVar.b;
            ahno.T(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31, "encountered file (%s) with negative size (%s)", uri2, j);
            long j2 = ujiVar.h;
            ahno.T(((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) ^ (-1)) >>> 31, "encountered file (%s) with negative lastModifiedTime (%s)", uri2, j2);
            return ujiVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" id");
        }
        if (this.d == null) {
            sb.append(" uri");
        }
        if (this.e == null) {
            sb.append(" displayName");
        }
        if ((this.m & 2) == 0) {
            sb.append(" size");
        }
        if ((this.m & 4) == 0) {
            sb.append(" duration");
        }
        if ((this.m & 8) == 0) {
            sb.append(" lastModifiedTime");
        }
        if ((this.m & 16) == 0) {
            sb.append(" fileType");
        }
        if ((this.m & 32) == 0) {
            sb.append(" width");
        }
        if ((this.m & 64) == 0) {
            sb.append(" height");
        }
        if ((this.m & 128) == 0) {
            sb.append(" rotation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.e = str;
    }

    public final void c(long j) {
        this.g = j;
        this.m = (byte) (this.m | 4);
    }

    public final void d(int i) {
        this.i = i;
        this.m = (byte) (this.m | 16);
    }

    public final void e(int i) {
        this.k = i;
        this.m = (byte) (this.m | 64);
    }

    public final void f(long j) {
        this.c = j;
        this.m = (byte) (this.m | 1);
    }

    public final void g(long j) {
        this.h = j;
        this.m = (byte) (this.m | 8);
    }

    public final void h(int i) {
        this.l = i;
        this.m = (byte) (this.m | (-128));
    }

    public final void i(long j) {
        this.f = j;
        this.m = (byte) (this.m | 2);
    }

    public final void j(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.d = uri;
    }

    public final void k(int i) {
        this.j = i;
        this.m = (byte) (this.m | 32);
    }
}
