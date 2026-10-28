package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eeq {
    public final String a;
    public final dzr b;

    public eeq(String str, dzr dzrVar) {
        this.a = str;
        this.b = dzrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eeq) {
            eeq eeqVar = (eeq) obj;
            if (awrc.c(this.a, eeqVar.a) && this.b == eeqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
