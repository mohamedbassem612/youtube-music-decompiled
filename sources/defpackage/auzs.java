package defpackage;

import j$.util.Objects;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzs extends avbz {
    private static final long serialVersionUID = 0;
    public final InetSocketAddress a;
    private final SocketAddress b;
    private final Map c;
    private final String d;
    private final String e;

    public auzs(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, Map map, String str, String str2) {
        ahno.R(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.b = socketAddress;
        this.a = inetSocketAddress;
        this.c = map;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof auzs)) {
            return false;
        }
        auzs auzsVar = (auzs) obj;
        return Objects.equals(this.b, auzsVar.b) && Objects.equals(this.a, auzsVar.a) && Objects.equals(this.c, auzsVar.c) && Objects.equals(this.d, auzsVar.d) && Objects.equals(this.e, auzsVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.d, this.e, this.c);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("proxyAddr", this.b);
        ageuVarAc.b("targetAddr", this.a);
        ageuVarAc.b("headers", this.c);
        ageuVarAc.b(rmp.USERNAME, this.d);
        ageuVarAc.g("hasPassword", this.e != null);
        return ageuVarAc.toString();
    }
}
