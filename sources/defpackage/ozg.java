package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozg {
    public final String a;
    public final String b;

    public ozg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozg) {
            ozg ozgVar = (ozg) obj;
            if (this.a.equals(ozgVar.a)) {
                String str = this.b;
                if (str == null) {
                    if (ozgVar.b == null) {
                        return true;
                    }
                } else if (str.equals(ozgVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PreferenceKey{key=" + this.a + ", dynamicKey=" + this.b + '}';
    }

    public ozg() {
        throw null;
    }
}
