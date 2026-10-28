package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ulw {
    public static final ulw a = new ulw(null);
    private final String b;

    public ulw(byte[] bArr) {
        this.b = "";
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof ulw) && this.b.equals(((ulw) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 385623362;
    }

    public final String toString() {
        return "SwipeConfig{enabled=false, swipeAffordanceText=" + this.b + '}';
    }

    public ulw() {
        throw null;
    }
}
