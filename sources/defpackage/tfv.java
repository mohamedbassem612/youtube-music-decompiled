package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tfv {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Integer h;
    public final String i;
    public final Integer j;
    public final Collection k;
    public final Integer l;
    public final int m;
    public final int n;
    private final Exception o;
    private final String p;

    public tfv(String str, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Integer num, String str3, int i, int i2, Integer num2, Collection collection, Exception exc, String str4, Integer num3) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = l5;
        this.h = num;
        this.i = str3;
        this.m = i;
        this.n = i2;
        this.j = num2;
        this.k = collection;
        this.o = exc;
        this.p = str4;
        this.l = num3;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Integer num;
        String str2;
        int i;
        Integer num2;
        Collection collection;
        Exception exc;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfv) {
            tfv tfvVar = (tfv) obj;
            if (this.a.equals(tfvVar.a) && ((str = this.b) != null ? str.equals(tfvVar.b) : tfvVar.b == null) && ((l = this.c) != null ? l.equals(tfvVar.c) : tfvVar.c == null) && ((l2 = this.d) != null ? l2.equals(tfvVar.d) : tfvVar.d == null) && ((l3 = this.e) != null ? l3.equals(tfvVar.e) : tfvVar.e == null) && ((l4 = this.f) != null ? l4.equals(tfvVar.f) : tfvVar.f == null) && ((l5 = this.g) != null ? l5.equals(tfvVar.g) : tfvVar.g == null) && ((num = this.h) != null ? num.equals(tfvVar.h) : tfvVar.h == null) && ((str2 = this.i) != null ? str2.equals(tfvVar.i) : tfvVar.i == null)) {
                int i2 = this.m;
                int i3 = tfvVar.m;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == i3 && ((i = this.n) != 0 ? i == tfvVar.n : tfvVar.n == 0) && ((num2 = this.j) != null ? num2.equals(tfvVar.j) : tfvVar.j == null) && ((collection = this.k) != null ? collection.equals(tfvVar.k) : tfvVar.k == null) && ((exc = this.o) != null ? exc.equals(tfvVar.o) : tfvVar.o == null) && ((str3 = this.p) != null ? str3.equals(tfvVar.p) : tfvVar.p == null)) {
                    Integer num3 = this.l;
                    if (num3 == null) {
                        if (tfvVar.l == null) {
                            return true;
                        }
                    } else if (num3.equals(tfvVar.l)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003;
        Long l5 = this.g;
        int iHashCode7 = (iHashCode6 ^ (l5 == null ? 0 : l5.hashCode())) * 1000003;
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str2 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str2 == null ? 0 : str2.hashCode())) * (-721379959);
        int i = this.m;
        a.by(i);
        int i2 = (iHashCode9 ^ i) * 1000003;
        int i3 = this.n;
        if (i3 == 0) {
            i3 = 0;
        }
        int i4 = (i2 ^ i3) * 1000003;
        Integer num2 = this.j;
        int iHashCode10 = (i4 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Collection collection = this.k;
        int iHashCode11 = (iHashCode10 ^ (collection == null ? 0 : collection.hashCode())) * 1000003;
        Exception exc = this.o;
        int iHashCode12 = (iHashCode11 ^ (exc == null ? 0 : exc.hashCode())) * 1000003;
        String str3 = this.p;
        int iHashCode13 = (iHashCode12 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num3 = this.l;
        return iHashCode13 ^ (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.m;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.n;
        String string2 = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        Collection collection = this.k;
        Exception exc = this.o;
        return "ExecutedHttpRequestInfo{url=" + this.a + ", responseContentType=" + this.b + ", numberBytesDownloaded=" + this.c + ", numberBytesUploaded=" + this.d + ", requestStartTimeMillis=" + this.e + ", timeToResponseHeadersMillis=" + this.f + ", timeToResponseCompletedMillis=" + this.g + ", statusCode=" + this.h + ", negotiatedProtocol=" + this.i + ", IOException=null, requestStatus=" + string + ", requestFailedReason=" + string2 + ", quicDetailedErrorCode=" + this.j + ", annotations=" + String.valueOf(collection) + ", exception=" + String.valueOf(exc) + ", requestDebugId=" + this.p + ", cronetNetworkInternalErrorCode=" + this.l + '}';
    }

    public tfv() {
        throw null;
    }
}
