package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzd extends bbl {
    public final dyp a;

    public dzd(dyp dypVar) {
        super(null);
        this.a = dypVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dzd) obj).a);
    }

    public final int hashCode() {
        return 3099442 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public dzd() {
        this(dyp.a);
    }
}
