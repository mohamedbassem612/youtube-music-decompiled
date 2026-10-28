package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adtl {
    public final boolean a;

    public adtl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof adtl) && this.a == ((adtl) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "ContinuationContext{wasScheduled=" + this.a + '}';
    }

    public adtl() {
        throw null;
    }
}
