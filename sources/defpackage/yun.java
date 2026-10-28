package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yun {
    public final long a;
    public final appa b;
    public final int c;

    public yun(long j, int i, appa appaVar) {
        this.a = j;
        this.c = i;
        this.b = appaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yun) {
            yun yunVar = (yun) obj;
            if (this.a == yunVar.a) {
                int i = this.c;
                int i2 = yunVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(yunVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bj(i);
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 1) {
            str = "DEFAULT";
        } else if (i == 2) {
            str = "SEEK_CLOSEST";
        } else if (i == 3) {
            str = "SEEK_CLOSEST_SYNC";
        } else if (i != 4) {
            str = i != 5 ? "null" : "SEEK_PREVIOUS_SYNC";
        } else {
            str = "SEEK_NEXT_SYNC";
        }
        return "SeekParams{positionMs=" + this.a + ", seekMode=" + str + ", seekSource=" + String.valueOf(this.b) + '}';
    }

    public yun() {
        throw null;
    }
}
