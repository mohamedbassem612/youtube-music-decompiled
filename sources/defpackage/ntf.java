package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ntf {
    public final boolean a;
    public final String b;

    public ntf(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ntf) {
            ntf ntfVar = (ntf) obj;
            if (this.a == ntfVar.a) {
                String str = this.b;
                if (str == null) {
                    if (ntfVar.b == null) {
                        return true;
                    }
                } else if (str.equals(ntfVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((true != this.a ? 1237 : 1231) ^ 375623332) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AccessibilityParameters{checkable=true, checked=" + this.a + ", stateDescription=" + this.b + '}';
    }

    public ntf() {
        throw null;
    }
}
