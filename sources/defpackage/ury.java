package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ury {
    public final aufd a;
    public final qvc b;

    public ury(aufd aufdVar, qvc qvcVar) {
        if (aufdVar == null) {
            throw new NullPointerException("Null effectProto");
        }
        this.a = aufdVar;
        this.b = qvcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ury) {
            ury uryVar = (ury) obj;
            if (this.a.equals(uryVar.a)) {
                qvc qvcVar = this.b;
                if (qvcVar == null) {
                    if (uryVar.b == null) {
                        return true;
                    }
                } else if (qvcVar.equals(uryVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        qvc qvcVar = this.b;
        return (iHashCode * 1000003) ^ (qvcVar == null ? 0 : qvcVar.hashCode());
    }

    public final String toString() {
        qvc qvcVar = this.b;
        return "EffectPair{effectProto=" + this.a.toString() + ", mediaEngineEffect=" + String.valueOf(qvcVar) + '}';
    }

    public ury() {
        throw null;
    }
}
