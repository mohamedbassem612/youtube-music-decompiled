package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ojm {
    public final agev a;
    public final agev b;

    public ojm(agev agevVar, agev agevVar2) {
        this.a = agevVar;
        this.b = agevVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ojm) {
            ojm ojmVar = (ojm) obj;
            if (this.a.equals(ojmVar.a) && this.b.equals(ojmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 78315041;
    }

    public final String toString() {
        agev agevVar = this.b;
        return "SchedulingParams{constraintOverridesMapOptional=" + String.valueOf(this.a) + ", flexInterval=" + String.valueOf(agevVar) + '}';
    }

    public ojm() {
        throw null;
    }
}
