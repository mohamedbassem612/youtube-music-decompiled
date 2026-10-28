package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjo extends afyd {
    public final ahjm a;
    public final ahjl b;
    public final ahjn c;

    public ahjo(ahjm ahjmVar, ahjl ahjlVar, ahjn ahjnVar) {
        this.a = ahjmVar;
        this.b = ahjlVar;
        this.c = ahjnVar;
    }

    public final boolean S() {
        return this.c != ahjn.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahjo)) {
            return false;
        }
        ahjo ahjoVar = (ahjo) obj;
        return ahjoVar.a == this.a && ahjoVar.b == this.b && ahjoVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(ahjo.class, this.a, this.b, this.c);
    }

    public final String toString() {
        return "Composite ML-DSA Parameters (ML-DSA instance: " + this.a.d + ", classical algorithm: " + this.b.k + ", variant: " + this.c.c + ')';
    }
}
