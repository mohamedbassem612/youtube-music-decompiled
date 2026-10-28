package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abek implements abea {
    public final aenu a;
    public final abed b;
    public ajwo c;
    public String d;
    public aenr e;
    public abec f;
    public abdj g;
    private final abvn h;
    private final ConcurrentHashMap.KeySetView i;
    private final avmm j;
    private abdy k;

    public abek(aenu aenuVar, abed abedVar, abvn abvnVar) {
        aenuVar.getClass();
        abvnVar.getClass();
        this.a = aenuVar;
        this.b = abedVar;
        this.h = abvnVar;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.getClass();
        this.i = keySetViewNewKeySet;
        this.j = new avmm();
        this.k = abdy.a;
        abdj abdjVar = abdi.g;
        abdjVar.getClass();
        this.g = abdjVar;
    }

    public static final avlh h(avlh avlhVar, awqg awqgVar) {
        int i = 12;
        avtt avttVar = new avtt(avlhVar, new yrb(new yrc(awqgVar, i), i));
        avnn avnnVar = atqp.j;
        return avttVar;
    }

    private final void l() {
        this.j.b();
    }

    @Override // defpackage.abea
    public final xgn a() {
        return this.b;
    }

    public final void b() {
        aenr aenrVar = this.e;
        if (aenrVar != null) {
            aenu aenuVar = this.a;
            aenuVar.h(new aens(aenrVar.c, aent.HIDDEN), aenrVar);
            aenuVar.g(aenrVar.a);
            this.e = null;
            this.d = null;
            this.b.a = xgn.l;
        }
    }

    public final void c(boolean z) {
        if (!z) {
            b();
            this.c = null;
            g(abdy.a);
        } else {
            abdy abdyVar = this.k;
            abdy abdyVar2 = abdy.b;
            if (abdyVar.a(abdyVar2)) {
                g(abdyVar2);
            }
        }
    }

    @Override // defpackage.abea
    public final abdy d() {
        return this.k;
    }

    @Override // defpackage.abea
    public final void e(abdz abdzVar) {
        this.i.add(abdzVar);
    }

    @Override // defpackage.abea
    public final void f() {
        l();
        abvn abvnVar = this.h;
        avlh avlhVarW = abvnVar.I().W(new yrb(new yta(5), 13));
        avlhVarW.getClass();
        avlh avlhVarI = avlhVarW.i(aawb.y(abvnVar.X(), 512L)).i(new abwr(1));
        avlhVarI.getClass();
        this.j.c(avlhVarI.al(new abae(new hho(this, 12, (float[][]) null), 4), new abae(abej.a, 3)));
    }

    public final void g(abdy abdyVar) {
        if (this.k != abdyVar) {
            this.k = abdyVar;
            Iterator it = this.i.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                ((abdz) next).hn(abdyVar);
            }
        }
    }

    @Override // defpackage.abea
    public final void i() {
        l();
        c(false);
        this.i.clear();
        this.f = null;
    }

    @Override // defpackage.abea
    public final void j(abdz abdzVar) {
        this.i.remove(abdzVar);
    }

    @Override // defpackage.abea
    public final void k(ajwo ajwoVar) {
        ajwo ajwoVar2 = this.c;
        boolean zC = false;
        if (ajwoVar2 != null && ajwoVar != null) {
            String strG = abnn.g(ajwoVar2);
            strG.getClass();
            if (strG.length() <= 0) {
                strG = null;
            }
            if (strG != null) {
                zC = awrc.c(strG, abnn.g(ajwoVar));
            }
        }
        c(zC);
        if (ajwoVar != null) {
            this.c = ajwoVar;
        }
    }

    @Override // defpackage.abea
    public final void n(abec abecVar) {
        this.f = abecVar;
    }

    @Override // defpackage.abea
    public final void q(abdj abdjVar) {
        abdjVar.getClass();
        this.g = abdjVar;
    }
}
