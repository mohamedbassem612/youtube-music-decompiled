package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pmo {
    public final aicw a;
    public final pnb b;

    public pmo(aicw aicwVar, pnb pnbVar) {
        this.a = aicwVar;
        this.b = pnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pmo) {
            pmo pmoVar = (pmo) obj;
            if (awrc.c(this.a, pmoVar.a) && this.b == pmoVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExtractedPayloadData(androidPayload=" + this.a + ", pushPayloadType=" + this.b + ')';
    }
}
