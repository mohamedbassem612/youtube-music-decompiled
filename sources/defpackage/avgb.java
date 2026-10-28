package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avgb {
    public int a;
    public int b;
    public Object c;

    public avgb() {
        this.c = "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final auyo a() {
        return ((auzm) this.c.get(this.a)).f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final SocketAddress b() {
        return (SocketAddress) ((auzm) this.c.get(this.a)).e.get(this.b);
    }

    public final void c() {
        this.a = 0;
        this.b = 0;
    }

    public avgb(List list) {
        this.c = list;
    }
}
