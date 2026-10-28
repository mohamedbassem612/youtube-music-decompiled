package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ala extends anx {
    private final akz a;

    public ala(akz akzVar) {
        this.a = akzVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ala) && awrc.c(this.a, ((ala) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
