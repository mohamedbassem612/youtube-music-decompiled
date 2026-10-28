package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukw {
    public final auhs a;
    public final boolean b;

    public ukw(auhs auhsVar, boolean z) {
        if (auhsVar == null) {
            throw new NullPointerException("Null mediaComposition");
        }
        this.a = auhsVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ukw) {
            ukw ukwVar = (ukw) obj;
            if (this.a.equals(ukwVar.a) && this.b == ukwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "InitCompositionResult{mediaComposition=" + this.a.toString() + ", hasTextMigrated=" + this.b + '}';
    }

    public ukw() {
        throw null;
    }
}
