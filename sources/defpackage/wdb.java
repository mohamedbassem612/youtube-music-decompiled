package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wdb implements wfa {
    private final wey c;
    private final web d;
    private final mbc e;
    private final agkj f;
    private final wjr h;
    private final xqy i;
    private final hws j;
    private final hws k;
    private final List b = DesugarCollections.synchronizedList(new ArrayList());
    public aijp a = wez.a;
    private final AtomicBoolean g = new AtomicBoolean(false);

    public wdb(mbc mbcVar, Map map, wey weyVar, web webVar, hws hwsVar, hws hwsVar2, xqy xqyVar, wjr wjrVar) {
        this.d = webVar;
        this.k = hwsVar;
        this.j = hwsVar2;
        this.i = xqyVar;
        this.h = wjrVar;
        this.e = mbcVar;
        this.f = agkj.h(map);
        this.c = weyVar;
    }

    private final weh o(weh wehVar) {
        return this.j.a(wehVar.d());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [agfr, java.lang.Object] */
    private final avlb p(final boolean z) {
        if (this.g.getAndSet(true)) {
            throw new IllegalStateException("Cannot commit a set of pending edits more than once.");
        }
        final List list = this.b;
        if (list.isEmpty()) {
            avlb avlbVar = avpy.a;
            avnn avnnVar = atqp.p;
            return avlbVar;
        }
        final web webVar = this.d;
        afxd afxdVarC = afxd.f(((omj) webVar.f.io()).S(new qsx() { // from class: wdp
            /* JADX WARN: Type inference failed for: r2v2, types: [agfr, java.lang.Object] */
            @Override // defpackage.qsx
            public final Object a(omr omrVar) {
                agjz agjzVar = !z ? new agjz(4) : null;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((wcz) it.next()).b((wdl) webVar.g.io(), omrVar, agjzVar);
                }
                return agjzVar != null ? agjzVar.g() : agpi.a;
            }
        })).c(Throwable.class, new hqn(13), MoreExecutors.directExecutor());
        if (!z) {
            wdf wdfVar = (wdf) this.k.a;
            wde wdeVar = new wde(wdfVar);
            long j = afwl.a;
            afxdVarC.addListener(new ahei(afxdVarC, new afwj(afty.c(false), wdeVar, 0)), wdfVar.d);
        }
        avps avpsVar = new avps(new tzb(afxdVarC));
        avnn avnnVar2 = atqp.p;
        awlk awlkVar = new awlk();
        avpsVar.kp(awlkVar);
        return awlkVar.p().k(new vub(this.i, 12));
    }

    @Override // defpackage.wer
    public final wer a(String str) {
        this.b.add(new wdm(this.d, str, this.a));
        return this;
    }

    @Override // defpackage.wer
    public final avlb b() {
        return p(false);
    }

    @Override // defpackage.wer
    public final /* synthetic */ avlb c(wem wemVar) {
        return yno.ew();
    }

    @Override // defpackage.wer
    public final avlb d() {
        return p(true);
    }

    @Override // defpackage.wer
    public final void e(weh wehVar) {
        weh wehVarO = o(wehVar);
        this.b.add(new wcw(this.d, this.f, wehVarO, null, this.a, this.e, wehVarO.b()));
    }

    @Override // defpackage.wer
    public final void f(weh wehVar, wej wejVar) {
        this.b.add(wcw.a(this.d, this.f, o(wehVar), wejVar, this.a, this.c, this.e));
    }

    @Override // defpackage.wfa
    public final void g(String str, byte[] bArr) {
        e(this.h.a(str, bArr));
    }

    @Override // defpackage.wer
    public final /* synthetic */ void h(Iterable iterable) {
        yno.ex(this, iterable);
    }

    @Override // defpackage.wer
    public final void i(String str, wej wejVar) {
        this.b.add(new wcw(this.d, this.f, null, wejVar, this.a, this.e, str));
    }

    @Override // defpackage.wer
    public final void j(String str) {
        this.b.add(new wdn(this.d, str, this.a));
    }

    @Override // defpackage.wer
    public final void k(String str, akvd akvdVar, byte[] bArr) {
        this.b.add(new wec(this.d, this.h, str, akvdVar, bArr, this.e, this.a));
    }

    @Override // defpackage.wer
    public final /* synthetic */ void l(weh wehVar) {
        yno.ey(this, wehVar);
    }

    @Override // defpackage.wer
    public final void m(tzk tzkVar) {
        weh wehVarA = this.j.a(tzkVar);
        aijp aijpVar = this.a;
        String strB = wehVarA.b();
        this.b.add(new wcw(this.d, this.f, wehVarA, null, aijpVar, this.e, strB));
    }

    @Override // defpackage.wer
    public final void n(tzk tzkVar, wej wejVar) {
        this.b.add(wcw.a(this.d, this.f, this.j.a(tzkVar), wejVar, this.a, this.c, this.e));
    }
}
