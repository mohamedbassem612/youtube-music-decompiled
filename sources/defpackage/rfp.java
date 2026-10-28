package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfp {
    public final UUID a;
    public final awme b;

    public rfp(UUID uuid, awme awmeVar) {
        if (uuid == null) {
            throw new NullPointerException("Null referenceId");
        }
        this.a = uuid;
        this.b = awmeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfp) {
            rfp rfpVar = (rfp) obj;
            if (this.a.equals(rfpVar.a)) {
                awme awmeVar = this.b;
                if (awmeVar == null) {
                    if (rfpVar.b == null) {
                        return true;
                    }
                } else if (awmeVar.a(rfpVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        awme awmeVar = this.b;
        return (iHashCode * 1000003) ^ (awmeVar == null ? 0 : awmeVar.hashCode());
    }

    public final String toString() {
        awme awmeVar = this.b;
        return "BoundingBox{referenceId=" + this.a.toString() + ", normalizedMatrix=" + String.valueOf(awmeVar) + '}';
    }

    public rfp() {
        throw null;
    }
}
