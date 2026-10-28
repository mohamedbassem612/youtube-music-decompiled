package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aks extends anx {
    private final awqg a;

    public aks(awqg awqgVar) {
        this.a = awqgVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof aks) && this.a == ((aks) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
