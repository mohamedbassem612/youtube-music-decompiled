package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akx extends anx {
    private final aky a;

    public akx(aky akyVar) {
        this.a = akyVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof akx) && awrc.c(this.a, ((akx) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ')';
    }
}
