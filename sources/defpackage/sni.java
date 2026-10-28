package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sni implements Comparable {
    public final int a;
    public final snk b;
    public final smr c;
    public final sko d;
    public final shh e;

    public sni(sni sniVar, shh shhVar) {
        this.a = sniVar.a;
        this.b = sniVar.b;
        this.c = sniVar.c;
        this.d = sniVar.d;
        this.e = shhVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        sni sniVar = (sni) obj;
        int i = sniVar.a;
        int i2 = this.a;
        return i2 == i ? this.b.b().compareTo(sniVar.b.b()) : i2 - i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sni)) {
            return false;
        }
        sni sniVar = (sni) obj;
        return this.a == sniVar.a && Objects.equals(this.b, sniVar.b) && Objects.equals(this.c, sniVar.c) && Objects.equals(this.d, sniVar.d) && Objects.equals(this.e, sniVar.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, this.e);
    }

    public sni(int i, snk snkVar, smr smrVar, sko skoVar) {
        this.a = i;
        this.b = snkVar;
        this.c = smrVar;
        this.d = skoVar;
        this.e = shh.b(new sht[0]);
    }
}
