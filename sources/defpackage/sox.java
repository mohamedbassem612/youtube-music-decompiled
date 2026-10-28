package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sox {
    private final boolean a;

    public sox(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof sox) && this.a == ((sox) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "MdxAdOverlayState{remotePlayback=" + this.a + '}';
    }

    public sox() {
        throw null;
    }
}
