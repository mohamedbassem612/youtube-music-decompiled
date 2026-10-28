package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzb extends bbl {
    public final dyp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzb() {
        super(null);
        dyp dypVar = dyp.a;
        this.a = dypVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dzb) obj).a);
    }

    public final int hashCode() {
        return 3099380 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
