package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ybs {
    public final String a;
    public final alpn b;

    public ybs(String str, alpn alpnVar) {
        alpnVar.getClass();
        this.a = str;
        this.b = alpnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ybs) {
            ybs ybsVar = (ybs) obj;
            if (awrc.c(this.a, ybsVar.a) && awrc.c(this.b, ybsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GADResponse(continuation=" + this.a + ", getActiveDevicesResponse=" + this.b + ')';
    }
}
