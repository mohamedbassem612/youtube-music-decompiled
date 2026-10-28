package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cft {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final brq f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;

    public cft(cfs cfsVar) {
        this.a = cfsVar.a;
        this.b = cfsVar.b;
        this.c = cfsVar.c;
        this.d = cfsVar.d;
        this.e = cfsVar.e;
        this.f = cfsVar.f;
        this.g = cfsVar.g;
        this.h = cfsVar.h;
        this.i = cfsVar.i;
        this.j = cfsVar.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cft cftVar = (cft) obj;
            if (this.a == cftVar.a && this.b == cftVar.b && this.c == cftVar.c && this.d == cftVar.d && this.e == cftVar.e && this.g == cftVar.g && this.h == cftVar.h && this.i == cftVar.i && this.j == cftVar.j && this.f.equals(cftVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.FALSE, Boolean.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.j), Boolean.valueOf(this.i));
    }
}
