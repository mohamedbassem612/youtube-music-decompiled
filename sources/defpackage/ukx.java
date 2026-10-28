package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ukx {
    public final usd a;
    public final auhs b;
    public final boolean c;

    public ukx(usd usdVar, auhs auhsVar, boolean z) {
        if (usdVar == null) {
            throw new NullPointerException("Null mediaCompositionManager");
        }
        this.a = usdVar;
        this.b = auhsVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ukx) {
            ukx ukxVar = (ukx) obj;
            if (this.a.equals(ukxVar.a) && this.b.equals(ukxVar.b) && this.c == ukxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        auhs auhsVar = this.b;
        return "InitMediaEngineResult{mediaCompositionManager=" + this.a.toString() + ", loadedMediaComposition=" + auhsVar.toString() + ", hasTextMigrated=" + this.c + '}';
    }

    public ukx() {
        throw null;
    }
}
