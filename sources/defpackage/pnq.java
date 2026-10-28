package defpackage;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pnq {
    public final Integer a;
    public final byte[] b;
    private final Map c;
    private final byte[] d;
    private final Exception e;

    public pnq(Integer num, Map map, byte[] bArr, byte[] bArr2, Exception exc) {
        this.a = num;
        this.c = map;
        this.d = bArr;
        this.b = bArr2;
        this.e = exc;
    }

    public static aak d() {
        aak aakVar = new aak();
        aakVar.f = new HashMap();
        return aakVar;
    }

    public final Throwable a() {
        Integer num;
        Exception exc = this.e;
        return (exc != null || (num = this.a) == null || num.intValue() == 200) ? exc : new pnr(num.intValue());
    }

    public final boolean b() {
        return a() != null;
    }

    public final boolean c(boolean z) {
        Throwable thA = a();
        if (thA == null) {
            return false;
        }
        if (!(thA instanceof SocketException) && !(thA instanceof UnknownHostException) && !(thA instanceof SSLException)) {
            if (!(thA instanceof pnr)) {
                return false;
            }
            int i = ((pnr) thA).a;
            if (i != 401) {
                if (!z) {
                    return false;
                }
                if (i != 429 && i != 500 && i != 502 && i != 503 && i != 504) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pnq) {
            pnq pnqVar = (pnq) obj;
            Integer num = this.a;
            if (num != null ? num.equals(pnqVar.a) : pnqVar.a == null) {
                if (this.c.equals(pnqVar.c)) {
                    boolean z = pnqVar instanceof pnq;
                    if (Arrays.equals(this.d, z ? pnqVar.d : pnqVar.d)) {
                        if (Arrays.equals(this.b, z ? pnqVar.b : pnqVar.b)) {
                            Exception exc = this.e;
                            if (exc == null) {
                                if (pnqVar.e == null) {
                                    return true;
                                }
                            } else if (exc.equals(pnqVar.e)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (((((((num == null ? 0 : num.hashCode()) ^ 1000003) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003) ^ Arrays.hashCode(this.b);
        Exception exc = this.e;
        return (iHashCode * 1000003) ^ (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        Exception exc = this.e;
        byte[] bArr = this.b;
        byte[] bArr2 = this.d;
        return "GnpHttpResponse{statusCode=" + this.a + ", statusMessage=null, headers=" + String.valueOf(this.c) + ", rawBody=" + Arrays.toString(bArr2) + ", body=" + Arrays.toString(bArr) + ", exception=" + String.valueOf(exc) + '}';
    }

    public pnq() {
        throw null;
    }
}
