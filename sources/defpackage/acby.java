package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acby {
    public final Integer a;
    public final Integer b;
    public final int c;

    public acby(int i, Integer num, Integer num2) {
        this.c = i;
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acby) {
            acby acbyVar = (acby) obj;
            if (this.c == acbyVar.c && awrc.c(this.a, acbyVar.a) && awrc.c(this.b, acbyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c == 0 ? 0 : 1;
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i2 = i * 31;
        Integer num2 = this.b;
        return ((i2 + iHashCode) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleTextSettings(alignment=");
        sb.append((Object) (this.c != 1 ? "null" : "LEFT"));
        sb.append(", backgroundColor=");
        sb.append(this.a);
        sb.append(", backgroundOpacity=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
