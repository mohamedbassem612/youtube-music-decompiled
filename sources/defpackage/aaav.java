package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaav {
    private final int a;
    private final String b;

    public aaav(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaav) {
            aaav aaavVar = (aaav) obj;
            if (this.a == aaavVar.a && this.b.equals(aaavVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "NotificationCommandData{id=" + this.a + ", tag=" + this.b + '}';
    }

    public aaav() {
        throw null;
    }
}
