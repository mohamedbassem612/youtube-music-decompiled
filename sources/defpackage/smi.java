package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smi {
    private final apfp a;

    public smi(apfp apfpVar, alqc alqcVar) {
        this.a = apfpVar;
        aigj aigjVar = alqcVar.g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof smi) {
            return Objects.equals(this.a, ((smi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "ReelOrganicAdMetadata[" + this.a.o + ']';
    }
}
