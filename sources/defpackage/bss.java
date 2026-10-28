package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bss {
    public static final bss a = new bsi().a();
    public final String b;
    public final bsp c;
    public final bso d;
    public final bsv e;
    public final bsk f;
    public final bsq g;

    static {
        int i = bwp.a;
    }

    public bss(String str, bsl bslVar, bsp bspVar, bso bsoVar, bsv bsvVar, bsq bsqVar) {
        this.b = str;
        this.c = bspVar;
        this.d = bsoVar;
        this.e = bsvVar;
        this.f = bslVar;
        this.g = bsqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bss) {
            bss bssVar = (bss) obj;
            if (Objects.equals(this.b, bssVar.b) && this.f.equals(bssVar.f) && Objects.equals(this.c, bssVar.c) && Objects.equals(this.d, bssVar.d) && Objects.equals(this.e, bssVar.e) && Objects.equals(this.g, bssVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        bsp bspVar = this.c;
        return (((((((iHashCode + (bspVar != null ? bspVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31;
    }
}
