package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uke implements ugk {
    public final ufs a;

    public uke(ufs ufsVar) {
        this.a = ufsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uke) {
            return this.a.equals(((uke) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CreationEditorPluginConfig{creationFlow=" + String.valueOf(this.a) + '}';
    }

    public uke() {
        throw null;
    }
}
