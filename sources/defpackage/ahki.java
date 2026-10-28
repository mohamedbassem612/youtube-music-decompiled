package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahki extends afyd {
    public final ahkg a;
    public final ahkh b;

    public ahki(ahkg ahkgVar, ahkh ahkhVar) {
        this.a = ahkgVar;
        this.b = ahkhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahki)) {
            return false;
        }
        ahki ahkiVar = (ahki) obj;
        return ahkiVar.a == this.a && ahkiVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(ahki.class, this.a, this.b);
    }

    public final String toString() {
        return "ML-DSA Parameters (ML-DSA instance: " + this.a.d + ", variant: " + this.b.c + ')';
    }
}
