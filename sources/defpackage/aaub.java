package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aaub {
    public final boolean a;
    public final int b;

    public aaub(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaub) {
            aaub aaubVar = (aaub) obj;
            if (this.a == aaubVar.a && this.b == aaubVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "OfflineActionDialogConfig{shouldShow=" + this.a + ", removeActionType=" + this.b + '}';
    }

    public aaub() {
        throw null;
    }
}
