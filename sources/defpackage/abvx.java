package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvx {
    public final szs a;
    public final abvk b;
    public final Executor c;
    public final abmt d;
    public final isi f;
    private final abwj g;
    private final Executor h;
    private final axsp i;
    private agke k;
    private abuk l;
    private abul m;
    private boolean n;
    private agke o;
    private ListenableFuture p;
    private ListenableFuture q;
    private final Map j = new HashMap();
    public final Map e = new HashMap();

    public abvx(abvk abvkVar, abwj abwjVar, Executor executor, Executor executor2, axsp axspVar, isi isiVar, abmt abmtVar) {
        this.b = abvkVar;
        this.g = abwjVar;
        this.h = executor;
        this.c = executor2;
        this.i = axspVar;
        this.f = isiVar;
        this.d = abmtVar;
        agke agkeVar = agpi.a;
        this.k = agkeVar;
        this.l = abuk.a;
        this.m = new abul(0, null);
        this.q = aher.a;
        this.o = agkeVar;
        this.p = new aher(aazq.a);
        this.n = false;
        this.a = new szs(executor);
    }

    private final synchronized void i() {
        ListenableFuture listenableFuture = this.q;
        if (listenableFuture == null || listenableFuture.isDone()) {
            int i = 14;
            this.q = afxd.f(this.p).h(new aajs(this, 8), this.c).g(new aaoz(this, i), new cck(this, i)).c(NoSuchElementException.class, new oly(11), this.h);
        }
    }

    public final synchronized void a(abvz abvzVar, abug abugVar, wjf wjfVar) {
        Map map = this.e;
        abun abunVar = abugVar.f;
        if (map.containsKey(abunVar.e())) {
            this.j.put(abunVar.e(), new abvw(abvzVar, abugVar, wjfVar));
            i();
        }
    }

    public final void b(Runnable runnable) {
        if (this.d.u()) {
            this.a.execute(runnable);
        } else {
            this.h.execute(runnable);
        }
    }

    public final void c() {
        this.a.b();
    }

    public final synchronized void d(abvw abvwVar, abnl abnlVar) {
        abul abulVar = (abul) this.e.get(abvwVar.b.f.e());
        if (abulVar != null) {
            abvz abvzVar = abvwVar.a;
            if (abnlVar == abvzVar.a()) {
                this.i.kk(new aayx(abulVar, abvzVar));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[Catch: all -> 0x0137, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:7:0x0016, B:9:0x0022, B:11:0x002a, B:13:0x0032, B:15:0x004c, B:17:0x005a, B:19:0x005f, B:21:0x0080, B:23:0x0086, B:25:0x008e, B:27:0x0096, B:28:0x0099, B:29:0x009c, B:31:0x00a3, B:33:0x00a9, B:35:0x00ad, B:37:0x00b5, B:47:0x00d8, B:49:0x00de, B:51:0x00fb, B:52:0x010d, B:54:0x0131, B:53:0x0113, B:40:0x00bc, B:42:0x00c2, B:46:0x00d6, B:16:0x0051, B:30:0x00a1), top: B:61:0x0001 }] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (((defpackage.abvw) r10.o.get(0)).t(r0.get(0)) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e() {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abvx.e():void");
    }

    public final synchronized void f() {
        this.j.clear();
        this.o = agpi.a;
        this.p = ahng.n(aazq.a);
    }

    final synchronized void g(ListenableFuture listenableFuture) {
        this.p = listenableFuture;
    }

    public final synchronized void h(agke agkeVar, abuk abukVar, abul abulVar) {
        byte[] bArr;
        this.k = agkeVar;
        Map map = this.e;
        map.clear();
        int i = 0;
        while (true) {
            bArr = null;
            if (i >= agkeVar.size()) {
                break;
            }
            abun abunVar = (abun) agkeVar.get(i);
            map.put(abunVar.e(), new abul(i, null));
            agke agkeVarC = abunVar.c();
            int i2 = ((agpi) agkeVarC).d;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                map.put(((abun) agkeVarC.get(i3)).e(), new abul(i, Integer.valueOf(i4)));
                i3++;
                i4++;
            }
            i++;
        }
        this.l = abukVar;
        this.m = abulVar;
        if (this.g.f && this.d.e.m(337, 45773284L)) {
            Collection.EL.removeIf(this.j.entrySet(), new iab(this, abulVar, 10, bArr));
        } else {
            Collection.EL.removeIf(this.j.entrySet(), new iab(this, abulVar, 11, bArr));
        }
        this.n = false;
        ListenableFuture listenableFuture = this.q;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            this.q.cancel(false);
            this.q = null;
        }
        abun abunVarF = aasc.f(abulVar, agkeVar);
        if (abunVarF == null || !abunVarF.d().equals(abvz.class)) {
            this.p = ahng.n(aazq.a);
        }
        i();
    }
}
