package defpackage;

import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzf implements atzb {
    private final String a;
    private final atzb b;
    private atzj c;
    private atzj d;
    private atzj e;
    private final long g;
    private final MessageDigest h;
    private boolean i;
    private int j = 1;
    private long f = 0;

    public atzf(String str, String str2, atzc atzcVar, atzb atzbVar, MessageDigest messageDigest) {
        this.a = str;
        this.b = atzbVar;
        this.h = messageDigest;
        this.c = new atzj("--" + str + "\r\nContent-Type: text/plain\r\n\r\n" + str2 + "\r\n");
        StringBuilder sb = new StringBuilder("--");
        sb.append(str);
        sb.append("\r\n");
        for (String str3 : atzcVar.c()) {
            sb.append(str3);
            sb.append(": ");
            sb.append(atzcVar.a(str3));
            sb.append("\r\n");
        }
        if (this.b.e() >= 0 && atzcVar.b("content-length").isEmpty()) {
            sb.append("Content-Length: ");
            sb.append(this.b.e());
            sb.append("\r\n");
        }
        sb.append("\r\n");
        this.d = new atzj(sb.toString());
        if (atzbVar.e() == -1 || messageDigest != null) {
            this.g = -1L;
        } else {
            this.e = j();
            this.g = this.c.e() + this.d.e() + atzbVar.e() + this.e.e();
        }
    }

    private final atzj j() {
        StringBuilder sb = new StringBuilder("\r\n--");
        String str = this.a;
        sb.append(str);
        agev agevVarE = atqo.e(this.h);
        if (agevVarE.g()) {
            sb.append("\r\n\r\nX-Goog-Hash: ");
            sb.append((String) agevVarE.c());
            sb.append("\r\n--");
            sb.append(str);
        }
        sb.append("--");
        return new atzj(sb.toString());
    }

    @Override // defpackage.atzb
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (this.i) {
            throw new IOException("Trying to read from an already-closed stream.");
        }
        ahno.G(65536 - i >= i2, "Buffer length must be greater than or equal to desired number of bytes.");
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        while (true) {
            long j2 = this.f;
            if (j2 != j) {
                return (int) (j2 - j);
            }
            int i3 = this.j;
            int i4 = i3 - 1;
            atzb atzbVar = null;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                atzbVar = this.c;
                i3 = 2;
            } else if (i4 == 1) {
                atzbVar = this.d;
                i3 = 3;
            } else if (i4 == 2) {
                atzbVar = this.b;
                i3 = 4;
            } else if (i4 == 3) {
                atzj atzjVarJ = this.e;
                if (atzjVarJ == null) {
                    atzjVarJ = j();
                    this.e = atzjVarJ;
                }
                atzbVar = atzjVarJ;
                i3 = 5;
            } else if (i4 == 4) {
                return 0;
            }
            this.f += (long) atzbVar.a(bArr, i, i2);
            if (atzbVar.c() < Long.MAX_VALUE) {
                atzbVar.g();
            }
            if (!atzbVar.i()) {
                this.j = i3;
            }
        }
    }

    @Override // defpackage.atzb
    public final long b() {
        throw null;
    }

    @Override // defpackage.atzb
    public final long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.atzb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
        this.b.close();
    }

    @Override // defpackage.atzb
    public final long d() {
        return this.f;
    }

    @Override // defpackage.atzb
    public final long e() {
        return this.g;
    }

    @Override // defpackage.atzb
    public final long f(long j) {
        throw null;
    }

    @Override // defpackage.atzb
    public final void h() {
        throw null;
    }

    @Override // defpackage.atzb
    public final boolean i() {
        return this.j != 5;
    }

    @Override // defpackage.atzb
    public final void g() {
    }
}
