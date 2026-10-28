package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdy {
    public final long a;
    public final btn b;
    public final int c;
    public final cnm d;
    public final long e;
    public final btn f;
    public final int g;
    public final cnm h;
    public final long i;
    public final long j;

    public cdy(long j, btn btnVar, int i, cnm cnmVar, long j2, btn btnVar2, int i2, cnm cnmVar2, long j3, long j4) {
        this.a = j;
        this.b = btnVar;
        this.c = i;
        this.d = cnmVar;
        this.e = j2;
        this.f = btnVar2;
        this.g = i2;
        this.h = cnmVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cdy cdyVar = (cdy) obj;
            if (this.a == cdyVar.a && this.c == cdyVar.c && this.e == cdyVar.e && this.g == cdyVar.g && this.i == cdyVar.i && this.j == cdyVar.j && Objects.equals(this.b, cdyVar.b) && Objects.equals(this.d, cdyVar.d) && Objects.equals(this.f, cdyVar.f) && Objects.equals(this.h, cdyVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
