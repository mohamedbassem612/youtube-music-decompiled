package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amj extends anx {
    private final awqg a = null;
    private final awqg b;

    public amj(awqg awqgVar) {
        this.b = awqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amj) {
            amj amjVar = (amj) obj;
            awqg awqgVar = amjVar.a;
            if (this.b == amjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
