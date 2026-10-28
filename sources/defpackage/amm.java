package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amm extends anx {
    private final acw a;
    private final yi b;

    public amm(yi yiVar, acw acwVar) {
        this.b = yiVar;
        this.a = acwVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amm)) {
            return false;
        }
        amm ammVar = (amm) obj;
        return awrc.c(ammVar.b, this.b) && awrc.c(ammVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        acw acwVar = this.a;
        return iHashCode + (acwVar != null ? acwVar.hashCode() : 0);
    }
}
