package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rrr {
    public final aobj a;
    private final int b;

    public rrr(int i, aobj aobjVar) {
        this.b = i;
        if (aobjVar == null) {
            throw new NullPointerException("Null effectiveConnectionType");
        }
        this.a = aobjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rrr) {
            rrr rrrVar = (rrr) obj;
            if (this.b == rrrVar.b && this.a.equals(rrrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ConnectionTypePair{connectionType=" + this.b + ", effectiveConnectionType=" + this.a.toString() + '}';
    }

    public rrr() {
        throw null;
    }
}
