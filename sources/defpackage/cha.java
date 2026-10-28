package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cha {
    public final bse a;
    public final bse b;
    public final int c;
    public final int d;
    public final cft e;
    public final buf f;
    public final btn g;
    public final Object h;

    public cha(bse bseVar, bse bseVar2, int i, int i2, cft cftVar, buf bufVar, btn btnVar, Object obj) {
        this.a = bseVar;
        this.b = bseVar2;
        this.c = i;
        this.d = i2;
        this.e = cftVar;
        this.f = bufVar;
        this.g = btnVar;
        this.h = obj;
    }

    public final long a(long j) {
        return bwp.B(j, this.e.b);
    }

    public final cha b(cft cftVar) {
        return new cha(this.a, this.b, this.c, this.d, cftVar, this.f, this.g, this.h);
    }

    public final boolean c() {
        return Objects.equals(this.a.q, "audio/raw");
    }
}
