package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xid {
    public String a;
    public Optional b;
    public ajij c;
    public Optional d;
    private long e;
    private long f;
    private boolean g;
    private boolean h;
    private byte i;

    public xid(xie xieVar) {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = xieVar.a;
        this.f = xieVar.b;
        this.a = xieVar.c;
        this.b = xieVar.d;
        this.c = xieVar.e;
        this.g = xieVar.f;
        this.d = xieVar.g;
        this.h = xieVar.h;
        this.i = (byte) 15;
    }

    public final xie a() {
        String str;
        ajij ajijVar;
        if (this.i == 15 && (str = this.a) != null && (ajijVar = this.c) != null) {
            return new xie(this.e, this.f, str, this.b, ajijVar, this.g, this.d, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" timestamp");
        }
        if ((this.i & 2) == 0) {
            sb.append(" lastActivityMs");
        }
        if (this.a == null) {
            sb.append(" identityId");
        }
        if (this.c == null) {
            sb.append(" automatedLogEventSource");
        }
        if ((this.i & 4) == 0) {
            sb.append(" isPageSystem");
        }
        if ((this.i & 8) == 0) {
            sb.append(" isIncognito");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | 8);
    }

    public final void c(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 4);
    }

    public final void d(long j) {
        this.f = j;
        this.i = (byte) (this.i | 2);
    }

    public final void e(long j) {
        this.e = j;
        this.i = (byte) (this.i | 1);
    }

    public xid(byte[] bArr) {
        this.b = Optional.empty();
        this.d = Optional.empty();
    }

    public xid() {
        throw null;
    }
}
