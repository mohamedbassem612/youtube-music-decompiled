package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahls extends afyd {
    public final ahlp a;
    public final ahlq b;
    public final ahlr c;

    public ahls(ahlp ahlpVar, ahlq ahlqVar, ahlr ahlrVar) {
        this.a = ahlpVar;
        this.b = ahlqVar;
        this.c = ahlrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahls)) {
            return false;
        }
        ahls ahlsVar = (ahls) obj;
        return ahlsVar.a == this.a && ahlsVar.b == this.b && ahlsVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(ahls.class, this.a, 64, this.b, this.c);
    }

    public final String toString() {
        return "SLH-DSA-" + this.a.c + "-128" + this.b.c + " instance, variant: " + this.c.c;
    }
}
