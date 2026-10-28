package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pih {
    private final String a;
    private final Integer b;
    private final Integer c;

    public pih(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pih) {
            pih pihVar = (pih) obj;
            if (awrc.c(this.a, pihVar.a) && awrc.c(this.b, pihVar.b) && awrc.c(this.c, pihVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ImageTaskKey(url=" + this.a + ", width=" + this.b + ", height=" + this.c + ')';
    }
}
