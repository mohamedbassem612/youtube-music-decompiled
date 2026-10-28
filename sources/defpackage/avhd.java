package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhd extends avbu {
    final SocketAddress a;
    final String b;
    final Collection c;

    public avhd(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.avbq
    public final avbt b(URI uri, avbo avboVar) {
        return new avhc(this);
    }

    @Override // defpackage.avbq
    public final String c() {
        return "directaddress";
    }

    @Override // defpackage.avbu
    protected final int d() {
        return 5;
    }

    @Override // defpackage.avbu
    public final Collection e() {
        return this.c;
    }

    @Override // defpackage.avbu
    protected final void f() {
    }
}
