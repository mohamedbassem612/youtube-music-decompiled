package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abeu {
    private final CharSequence a;
    private final aliz b;

    public abeu(CharSequence charSequence, aliz alizVar) {
        this.a = charSequence;
        this.b = alizVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abeu) {
            abeu abeuVar = (abeu) obj;
            if (this.a.equals(abeuVar.a) && this.b.equals(abeuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aliz alizVar = this.b;
        return "DefaultMarkerDecoration{label=" + String.valueOf(this.a) + ", icon=" + String.valueOf(alizVar) + '}';
    }

    public abeu() {
        throw null;
    }
}
