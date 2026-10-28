package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qma {
    public final lle a;
    public final String b;

    public qma(lle lleVar, String str) {
        str.getClass();
        this.a = lleVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qma) {
            qma qmaVar = (qma) obj;
            if (awrc.c(this.a, qmaVar.a) && awrc.c(this.b, qmaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ')';
    }
}
