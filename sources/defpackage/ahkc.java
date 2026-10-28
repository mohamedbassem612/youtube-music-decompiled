package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahkc extends afyd {
    public final ahkb a;

    public ahkc(ahkb ahkbVar) {
        this.a = ahkbVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ahkc) && ((ahkc) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(ahkc.class, this.a);
    }

    public final String toString() {
        return "Ed25519 Parameters (variant: " + this.a.e + ')';
    }
}
