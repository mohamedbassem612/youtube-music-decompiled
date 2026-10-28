package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aazt {
    public static final aazt a = new aazt(null, false);
    public final zdk b;
    public final boolean c;

    public aazt(zdk zdkVar, boolean z) {
        this.b = zdkVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aazt) {
            aazt aaztVar = (aazt) obj;
            zdk zdkVar = this.b;
            if (zdkVar != null ? zdkVar.equals(aaztVar.b) : aaztVar.b == null) {
                if (this.c == aaztVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        zdk zdkVar = this.b;
        return (((zdkVar == null ? 0 : zdkVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "AutoCropData{autocropFrameWrapper=" + String.valueOf(this.b) + ", isCounterfactual=" + this.c + '}';
    }

    public aazt() {
        throw null;
    }
}
