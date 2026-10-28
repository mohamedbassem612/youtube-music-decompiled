package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ile extends hmy {
    private final Exception a;

    public ile(Exception exc) {
        super(null, null, null);
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ile) && awrc.c(this.a, ((ile) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.a + ')';
    }
}
