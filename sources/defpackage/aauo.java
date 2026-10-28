package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aauo {
    public final String a;
    public final aofb b;
    public final byte[] c;
    public final String d;
    public final String e;
    public final Boolean f;
    private final byte[] g;

    public aauo(String str, aofb aofbVar, byte[] bArr, String str2, String str3, Boolean bool) {
        this.a = str;
        this.g = null;
        this.b = aofbVar;
        this.c = bArr;
        this.d = str2;
        this.e = str3;
        this.f = bool;
    }

    public static aaun a(String str, aofb aofbVar) {
        aaun aaunVar = new aaun();
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        aaunVar.a = str;
        aaunVar.b = aofbVar;
        aaunVar.c = null;
        aaunVar.d = null;
        aaunVar.e = null;
        aaunVar.f = null;
        return aaunVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aauo) {
            aauo aauoVar = (aauo) obj;
            if (this.a.equals(aauoVar.a)) {
                boolean z = aauoVar instanceof aauo;
                if (z) {
                    byte[] bArr = aauoVar.g;
                }
                if (this.b.equals(aauoVar.b)) {
                    if (Arrays.equals(this.c, z ? aauoVar.c : aauoVar.c) && ((str = this.d) != null ? str.equals(aauoVar.d) : aauoVar.d == null) && ((str2 = this.e) != null ? str2.equals(aauoVar.e) : aauoVar.e == null)) {
                        Boolean bool = this.f;
                        if (bool == null) {
                            if (aauoVar.f == null) {
                                return true;
                            }
                        } else if (bool.equals(aauoVar.f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode((byte[]) null)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Arrays.hashCode(this.c);
        String str = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.f;
        return iHashCode3 ^ (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        byte[] bArr = this.c;
        aofb aofbVar = this.b;
        return "GetOfflinePlayerResponseArgs{videoId=" + this.a + ", wrappedKey=" + Arrays.toString((byte[]) null) + ", offlineModeType=" + String.valueOf(aofbVar) + ", clickTrackingParams=" + Arrays.toString(bArr) + ", playerParams=" + this.d + ", offlinePlayerToken=" + this.e + ", allowControversialContent=" + this.f + '}';
    }

    public aauo() {
        throw null;
    }
}
