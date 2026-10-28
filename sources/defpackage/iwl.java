package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwl {
    public static final iwl a = new iwl(iwm.a, iwm.b);
    public static final iwl b;
    public static final iwl c;
    public static final iwl d;
    public final auiu e;
    public final auiu f;

    static {
        auiu auiuVar = iwm.c;
        b = new iwl(auiuVar, auiuVar);
        auiu auiuVar2 = iwm.d;
        c = new iwl(auiuVar2, iwm.e);
        d = new iwl(auiuVar2, iwm.f);
    }

    public iwl(auiu auiuVar, auiu auiuVar2) {
        this.e = auiuVar;
        this.f = auiuVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iwl) {
            iwl iwlVar = (iwl) obj;
            if (this.e.equals(iwlVar.e) && this.f.equals(iwlVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        auiu auiuVar = this.f;
        return "ColorScheme{vibrant=" + this.e.toString() + ", dark=" + auiuVar.toString() + '}';
    }

    public iwl() {
        throw null;
    }
}
