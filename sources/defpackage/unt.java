package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class unt implements ugk {
    private final upz a;

    public unt(upz upzVar) {
        this.a = upzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof unt) {
            return this.a.equals(((unt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MultiImageEditorFragmentFeatureControllerConfig{imageEditorInput=" + String.valueOf(this.a) + '}';
    }

    public unt() {
        throw null;
    }
}
