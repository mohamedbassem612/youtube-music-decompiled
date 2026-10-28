package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ygk {
    public final int a;
    public final String b;
    public final long c;

    public ygk(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    public static ygk a(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        return b(formatIdOuterClass$FormatId.c, formatIdOuterClass$FormatId.e, formatIdOuterClass$FormatId.d);
    }

    public static ygk b(int i, String str, long j) {
        if (str == null) {
            str = "";
        }
        return new ygk(i, str, j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ygk) {
            ygk ygkVar = (ygk) obj;
            if (this.a == ygkVar.a && this.b.equals(ygkVar.b) && this.c == ygkVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "VideoFormatKey{itag=" + this.a + ", xtags=" + this.b + ", lmt=" + this.c + '}';
    }

    public ygk() {
        throw null;
    }
}
