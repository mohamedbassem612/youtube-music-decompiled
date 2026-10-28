package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xvl {
    public final xva a;

    public xvl(xva xvaVar) {
        if (xvaVar == null) {
            throw new NullPointerException("Null appStatus");
        }
        this.a = xvaVar;
    }

    public final boolean equals(Object obj) {
        return obj instanceof xvl;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "AppStatusWrapper{appStatus=" + String.valueOf(this.a) + '}';
    }

    public xvl() {
        throw null;
    }
}
