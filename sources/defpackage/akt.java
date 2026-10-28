package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akt {
    public final int a = 7;

    public final boolean equals(Object obj) {
        if (!(obj instanceof akt)) {
            return false;
        }
        int i = ((akt) obj).a;
        return true;
    }

    public final int hashCode() {
        return 7;
    }

    public final String toString() {
        return "Enter";
    }
}
