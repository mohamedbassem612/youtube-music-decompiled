package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjv extends afyd {
    public final ahjt a;
    public final ahjr b;
    public final ahjs c;
    public final ahju d;

    public ahjv(ahjt ahjtVar, ahjr ahjrVar, ahjs ahjsVar, ahju ahjuVar) {
        this.a = ahjtVar;
        this.b = ahjrVar;
        this.c = ahjsVar;
        this.d = ahjuVar;
    }

    public final boolean S() {
        return this.d != ahju.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahjv)) {
            return false;
        }
        ahjv ahjvVar = (ahjv) obj;
        return ahjvVar.a == this.a && ahjvVar.b == this.b && ahjvVar.c == this.c && ahjvVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(ahjv.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        return "ECDSA Parameters (variant: " + this.d.e + ", hashType: " + this.c.d + ", encoding: " + this.a.c + ", curve: " + this.b.d + ')';
    }
}
