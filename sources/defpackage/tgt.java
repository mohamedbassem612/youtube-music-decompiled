package defpackage;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tgt {
    private final NetworkInterface a;

    public tgt(NetworkInterface networkInterface) {
        this.a = networkInterface;
    }

    public final String a() {
        return this.a.getDisplayName();
    }

    public final String b() {
        String name = this.a.getName();
        name.getClass();
        return name;
    }

    public final NetworkInterface c() {
        return this.a;
    }

    public final Enumeration d() {
        Enumeration<InetAddress> inetAddresses = this.a.getInetAddresses();
        inetAddresses.getClass();
        return inetAddresses;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof tgt) && awrc.c(this.a, ((tgt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Delegating(networkInterface=" + this.a + ')';
    }
}
