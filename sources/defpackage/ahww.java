package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahww {
    public final String a;

    public ahww(ahud ahudVar) {
        this.a = (String) ahudVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahww) {
            return Objects.equals(this.a, ((ahww) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "CapabilityAlias{alias='" + this.a + "'}";
    }
}
