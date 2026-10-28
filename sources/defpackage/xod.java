package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xod {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public xod(String str, String str2, String str3) {
        this.d = 3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static xod a(String str, String str2, String str3) {
        return new xod(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xod) {
            xod xodVar = (xod) obj;
            if (this.d == xodVar.d && ((str = this.a) != null ? str.equals(xodVar.a) : xodVar.a == null) && ((str2 = this.b) != null ? str2.equals(xodVar.b) : xodVar.b == null)) {
                String str3 = this.c;
                if (str3 == null) {
                    if (xodVar.c == null) {
                        return true;
                    }
                } else if (str3.equals(xodVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.d;
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = ((i ^ 1000003) * 1000003) ^ iHashCode;
        String str3 = this.c;
        return (((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "MdxDeviceInfo{connectionType=" + Integer.toString(this.d - 1) + ", manufacturer=" + this.a + ", modelName=" + this.b + ", deviceVersion=" + this.c + '}';
    }

    public xod() {
        throw null;
    }
}
