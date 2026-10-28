package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sot {
    private final boolean a;

    public sot(boolean z) {
        this.a = z;
    }

    public static aaef a() {
        aaef aaefVar = new aaef();
        aaefVar.e(false);
        return aaefVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof sot) && this.a == ((sot) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "ClickableInstreamTapState{androidClickableInstreamEnabled=" + this.a + '}';
    }

    public sot() {
        throw null;
    }
}
