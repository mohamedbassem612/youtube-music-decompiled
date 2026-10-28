package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qad {
    private final int a;

    public qad(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof qad) && this.a == ((qad) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TrayLimit(limit=" + this.a + ')';
    }
}
