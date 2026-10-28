package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmp {
    public final flq a;
    public final fmh b;

    public fmp(flq flqVar, fmh fmhVar) {
        this.a = flqVar;
        this.b = fmhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fmp fmpVar = (fmp) obj;
            if (this.a.equals(fmpVar.a) && this.b.equals(fmpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.d * 31) + this.b.hashCode();
    }

    public final String toString() {
        fmh fmhVar = this.b;
        return "PropertyHandle{ mTransitionId='" + String.valueOf(this.a) + "', mProperty=" + String.valueOf(fmhVar) + '}';
    }
}
