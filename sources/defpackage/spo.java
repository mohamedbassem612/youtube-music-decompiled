package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class spo {
    public final String a;
    public final Map b;
    public final Map c;
    public final Map d;
    public volatile long e;
    private final mbc f;

    public spo(String str, mbc mbcVar) {
        typ.f(str);
        this.a = str;
        this.f = mbcVar;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = mbcVar.f().toEpochMilli();
    }

    public final void a(String str) {
        b();
        ListenableFuture listenableFuture = (ListenableFuture) this.c.remove(str);
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
    }

    public final void b() {
        this.e = this.f.f().toEpochMilli();
    }

    public final void c(String str) {
        b();
        Integer num = (Integer) this.b.remove(str);
        if (num != null) {
            num.intValue();
        }
    }

    public final shg d(String str) {
        b();
        return (shg) this.d.remove(str);
    }

    public final void e(String str, int i) {
        b();
        Integer num = (Integer) this.b.put(str, Integer.valueOf(i));
        if (num != null) {
            num.intValue();
            num.intValue();
        }
    }
}
