package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfl {
    public static final rbm c = new rbm("rfl");
    public final boolean a;
    public final int b;

    public rfl(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfl) {
            rfl rflVar = (rfl) obj;
            if (this.a == rflVar.a && this.b == rflVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "GlCapabilities{isYuvTargetExtensionSupported=" + this.a + ", glVersionMajor=" + this.b + '}';
    }

    public rfl() {
        throw null;
    }
}
