package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hzb {
    public final String a;
    public final String b;
    public final String c;

    public hzb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzb) {
            hzb hzbVar = (hzb) obj;
            String str = this.a;
            if (str != null ? str.equals(hzbVar.a) : hzbVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(hzbVar.b) : hzbVar.b == null) {
                    String str3 = this.c;
                    if (str3 == null) {
                        if (hzbVar.c == null) {
                            return true;
                        }
                    } else if (str3.equals(hzbVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        String str3 = this.c;
        return (((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "PlaybackIdMatcherModel{videoId=" + this.a + ", playlistId=" + this.b + ", playlistSetVideoId=" + this.c + '}';
    }

    public hzb() {
        throw null;
    }
}
