package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abkz implements abla {
    private final wjf a;
    private final xhz b;

    public abkz(wjf wjfVar, xhz xhzVar) {
        if (wjfVar == null) {
            throw new NullPointerException("Null model");
        }
        this.a = wjfVar;
        if (xhzVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.b = xhzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abkz) {
            abkz abkzVar = (abkz) obj;
            if (this.a.equals(abkzVar.a) && this.b.equals(abkzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        xhz xhzVar = this.b;
        return "LoggedPlayerResponse{model=" + this.a.toString() + ", logger=" + xhzVar.toString() + '}';
    }

    public abkz() {
        throw null;
    }
}
