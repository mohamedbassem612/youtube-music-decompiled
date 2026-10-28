package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eci extends bou {
    public final int a;

    public eci(int i) {
        super(null);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof eci) && this.a == ((eci) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
