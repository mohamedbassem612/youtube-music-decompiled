package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class phd {
    public final pzp a;

    public phd(pzp pzpVar) {
        this.a = pzpVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof phd) && awrc.c(this.a, ((phd) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        pzp pzpVar = this.a;
        if (pzpVar == null) {
            return 0;
        }
        return pzpVar.hashCode();
    }

    public final String toString() {
        return "ShowNotificationResult(imageLoadingOutcome=" + this.a + ')';
    }
}
