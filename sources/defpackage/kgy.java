package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class kgy {
    private khr a;
    public final khn c;
    public final String d;
    public final List e;

    public kgy(String str, String str2) {
        khe.f(str);
        this.d = str;
        this.c = new khn(str2, (String) null);
        this.e = DesugarCollections.synchronizedList(new ArrayList());
    }

    public void a() {
        throw null;
    }

    public final long b() {
        khr khrVar = this.a;
        if (khrVar != null) {
            return khrVar.a();
        }
        this.c.b("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }

    public final void c(khr khrVar) {
        this.a = khrVar;
        if (khrVar == null) {
            a();
        }
    }

    public final void d(String str, long j) {
        khn.e();
        khr khrVar = this.a;
        if (khrVar == null) {
            this.c.b("Attempt to send text message without a sink", new Object[0]);
        } else {
            khrVar.b(this.d, str, j);
        }
    }

    protected final void e() {
        List list = this.e;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((kht) it.next()).d(2002);
            }
        }
    }

    protected final void f(kht khtVar) {
        this.e.add(khtVar);
    }
}
