package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ptk {
    public final int a;
    public final String b;
    public final int c;
    public final ptj d;
    public final Instant e;
    public final int f;

    public ptk(int i, String str, int i2, ptj ptjVar, Instant instant, int i3) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = ptjVar;
        this.e = instant;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ptk) {
            ptk ptkVar = (ptk) obj;
            if (this.a == ptkVar.a && awrc.c(this.b, ptkVar.b) && this.c == ptkVar.c && this.d == ptkVar.d && awrc.c(this.e, ptkVar.e) && this.f == ptkVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f;
    }

    public final String toString() {
        return "GnpExperimentEntity(databaseId=" + this.a + ", accountName=" + this.b + ", experimentId=" + this.c + ", experimentType=" + this.d + ", insertionTime=" + this.e + ", experimentSource=" + ((Object) nxo.a(this.f)) + ')';
    }
}
