package defpackage;

import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pnp {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;
    public final int e;

    public pnp(URL url, String str, Map map, byte[] bArr, int i) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = i;
    }

    public static tge a() {
        tge tgeVar = new tge((byte[]) null);
        tgeVar.a = 1;
        tgeVar.e = new HashMap();
        return tgeVar;
    }

    public final tge b() {
        tge tgeVar = new tge(this);
        tgeVar.e = new HashMap(this.c);
        return tgeVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pnp) {
            pnp pnpVar = (pnp) obj;
            if (this.a.equals(pnpVar.a) && ((str = this.b) != null ? str.equals(pnpVar.b) : pnpVar.b == null) && this.c.equals(pnpVar.c)) {
                boolean z = pnpVar instanceof pnp;
                if (Arrays.equals(this.d, pnpVar.d)) {
                    int i = this.e;
                    int i2 = pnpVar.e;
                    if (i == 0) {
                        throw null;
                    }
                    if (i == i2) {
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
        int iHashCode2 = ((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        int i = this.e;
        a.bj(i);
        return iHashCode2 ^ i;
    }

    public final String toString() {
        byte[] bArr = this.d;
        Map map = this.c;
        return "GnpHttpRequest{url=" + String.valueOf(this.a) + ", contentType=" + this.b + ", headers=" + String.valueOf(map) + ", body=" + Arrays.toString(bArr) + ", purpose=" + nxc.a(this.e) + '}';
    }

    public pnp() {
        throw null;
    }
}
