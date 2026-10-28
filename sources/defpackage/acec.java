package defpackage;

import android.graphics.Bitmap;
import android.text.Spanned;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acec implements acdy {
    public final acdw a;
    private final acdo b;
    private final abmt c;
    private final abwg d;
    private final avlh e;
    private final avlh f;
    private final avlh g;
    private final acdq h;
    private final awmd i;
    private boolean j;
    private aayv k;
    private aceh l;
    private acee m;
    private int n;
    private boolean o;
    private boolean p;
    private final adws q;
    private final abxv r;

    public acec(acdo acdoVar, adws adwsVar, acdw acdwVar, abwg abwgVar, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, abmt abmtVar, acdq acdqVar, abxv abxvVar, awmd awmdVar) {
        this.b = acdoVar;
        this.q = adwsVar;
        this.a = acdwVar;
        this.c = abmtVar;
        this.h = acdqVar;
        this.r = abxvVar;
        this.e = avlhVar2;
        this.f = avlhVar3;
        this.g = avlhVar;
        this.d = abwgVar;
        this.i = awmdVar;
    }

    private final void A(int i) {
        if (i != 0) {
            abxv abxvVar = this.r;
            if ((524288 & i) != 0) {
                ((acdv) abxvVar.a).d(0);
                ((acdv) abxvVar.d).c();
                i &= -524289;
            }
            acdv acdvVar = (acdv) abxvVar.d;
            int iG = acdvVar.g(i);
            acdv acdvVar2 = (acdv) abxvVar.a;
            if (acdvVar2.f()) {
                abxvVar.Q(i & (~acdvVar2.a.a));
            } else {
                acdvVar.h(iG);
            }
        }
    }

    private final void B(int i) {
        if (i != 0) {
            this.r.Q(i);
        }
    }

    private final int x(boolean z) {
        return this.h.d(z) | y();
    }

    private final int y() {
        boolean z = this.o;
        boolean z2 = this.n > 0 && this.h.A();
        this.o = z2;
        if (z2 != z) {
            return z();
        }
        return 0;
    }

    private final int z() {
        aayv aayvVar;
        boolean z = true;
        boolean z2 = this.o || ((aayvVar = this.k) != null && aayvVar.a);
        acdq acdqVar = this.h;
        aceh acehVar = this.l;
        if (acehVar != null) {
            z2 = ((xxb) acehVar).a;
        }
        acee aceeVar = this.m;
        if (aceeVar != null) {
            z = ((xxc) aceeVar).a;
        } else {
            aayv aayvVar2 = this.k;
            if (aayvVar2 == null || !aayvVar2.b) {
                z = false;
            }
        }
        return acdqVar.f(z2, z);
    }

    @Override // defpackage.acdy
    public final void b(aawn aawnVar) {
        if (this.h.E(aawnVar.a)) {
            A(SemanticState.Obscured);
        }
    }

    @Override // defpackage.acdy
    public final void c(yvu yvuVar) {
        wgs wgsVar = yvuVar.c;
        if (wgsVar != null) {
            A(this.h.m(wgsVar.d(), wgsVar.i()));
        }
    }

    @Override // defpackage.acdy
    public final void d(aaxh aaxhVar) {
        A(this.h.g(aaxhVar.c));
    }

    @Override // defpackage.acdy
    public final void e(aayv aayvVar) {
        this.k = aayvVar;
        A(z());
    }

    @Override // defpackage.acdy
    public final void f(aayw aaywVar) {
        wgi wgiVar;
        amto amtoVar;
        alay alayVar;
        CharSequence charSequenceK;
        alay alayVar2;
        Spanned spannedK;
        wjf wjfVar;
        if (aaywVar.b != abnw.e || (wgiVar = aaywVar.d) == null || TextUtils.isEmpty(wgiVar.b)) {
            return;
        }
        amae amaeVar = wgiVar.a;
        Spanned spanned = null;
        if ((amaeVar.b & 16384) != 0) {
            amaa amaaVar = amaeVar.q;
            if (amaaVar == null) {
                amaaVar = amaa.a;
            }
            amtoVar = amaaVar.b == 61479009 ? (amto) amaaVar.c : amto.a;
        } else {
            amaf amafVar = amaeVar.e;
            if (amafVar == null) {
                amafVar = amaf.a;
            }
            alzv alzvVar = amafVar.b == 51779735 ? (alzv) amafVar.c : alzv.a;
            if ((alzvVar.b & 8) != 0) {
                alzs alzsVar = alzvVar.f;
                if (alzsVar == null) {
                    alzsVar = alzs.a;
                }
                amtoVar = alzsVar.b == 61479009 ? (amto) alzsVar.c : amto.a;
            } else {
                amtoVar = null;
            }
        }
        if (amtoVar == null) {
            charSequenceK = null;
        } else {
            if ((amtoVar.b & 4) != 0) {
                alayVar = amtoVar.d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            charSequenceK = ackj.k(null, alayVar, null, false);
        }
        if (amtoVar == null) {
            spannedK = null;
        } else {
            if ((amtoVar.b & 16) != 0) {
                alayVar2 = amtoVar.f;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            spannedK = ackj.k(null, alayVar2, null, false);
        }
        if (!TextUtils.isEmpty(charSequenceK) || (wjfVar = aaywVar.c) == null) {
            spanned = spannedK;
        } else {
            charSequenceK = wjfVar.F();
        }
        acdq acdqVar = this.h;
        A(acdqVar.l(charSequenceK) | acdqVar.b.g(spanned));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, wjf] */
    @Override // defpackage.acdy
    public final void g(aazj aazjVar) {
        abob abobVar = aazjVar.a;
        this.j = abobVar.c(abob.c);
        boolean z = aazjVar.i;
        this.p = z;
        int iOrdinal = abobVar.ordinal();
        if (iOrdinal == 0) {
            abxv abxvVar = this.r;
            int iC = this.h.c();
            ((acdv) abxvVar.d).d(iC);
            ((acdv) abxvVar.a).d(iC);
            acdo acdoVar = this.b;
            acdoVar.a = null;
            acdoVar.b = null;
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 5) {
                wjf wjfVar = aazjVar.c;
                A(x(false) | this.h.e((wjfVar == null ? Duration.ZERO : Duration.ofSeconds(wjfVar.a())).toMillis()));
                return;
            } else if (iOrdinal == 6) {
                this.c.P();
                return;
            } else if (iOrdinal != 7) {
                return;
            }
        }
        wjf wjfVar2 = aazjVar.b;
        if (wjfVar2 != null) {
            xpl xplVarT = xpl.t(wjfVar2.t(), 0L, null);
            acdq acdqVar = this.h;
            int iC2 = acdqVar.b.c() | (xplVarT != null ? acdqVar.e(Duration.ofSeconds(xplVarT.b.a()).toMillis()) : acdqVar.e(Duration.ofSeconds(wjfVar2.a()).toMillis())) | x(!z || wjfVar2.W()) | acdqVar.l(wjfVar2.F()) | acdqVar.K(wjfVar2.af());
            abxv abxvVar2 = this.r;
            abwl abwlVar = new abwl(this, wjfVar2, 9);
            acdv acdvVar = (acdv) abxvVar2.d;
            acdvVar.b = true;
            acdv acdvVar2 = (acdv) abxvVar2.a;
            acdvVar2.b = true;
            abwlVar.run();
            acdvVar.b = false;
            acdvVar2.b = false;
            A(iC2);
        }
    }

    @Override // defpackage.acdy
    public final void h(aazk aazkVar) {
        abmt abmtVar = this.c;
        if (abmtVar.p.l(183, 45784960L, false) && ((abnc) this.i.io()).t()) {
            return;
        }
        acdq acdqVar = this.h;
        int i = acdqVar.i(aazkVar.a);
        if (abmtVar.bZ() && this.p) {
            i |= acdqVar.e(aazkVar.d);
        }
        A(i);
    }

    @Override // defpackage.acdy
    public final void i(aazn aaznVar) {
        if (this.j) {
            A(this.h.h(aaznVar.a));
        }
    }

    @Override // defpackage.acdy
    public final void j(tbt tbtVar, acea aceaVar) {
        if (this.c.bN()) {
            abwg abwgVar = this.d;
            ((avlh) abwgVar.p).P().ak(new acaa(aceaVar, 17));
            this.e.ak(new acaa(aceaVar, 18));
            this.f.ak(new acaa(aceaVar, 19));
            ((avlh) abwgVar.i).P().ak(new aawl(new acaa(aceaVar, 20), "PCUTAI", 2));
            ((avlh) abwgVar.h).P().ak(new aceb(aceaVar, 1));
            this.g.ak(new aceb(aceaVar, 0));
            ((avlh) abwgVar.n).P().ak(new aceb(aceaVar, 2));
            ((avlh) abwgVar.e).P().ak(new aawl(new aceb(aceaVar, 3), "PCUTAI", 1));
        } else {
            tbtVar.f(aceaVar);
        }
        adws adwsVar = this.q;
        ((avlh) adwsVar.a).ak(new aceb(aceaVar, 4));
    }

    @Override // defpackage.acdy
    public final void k(boolean z) {
        A(x(z));
    }

    @Override // defpackage.acdy
    public final void l(acee aceeVar) {
        this.m = aceeVar;
        this.b.b = aceeVar;
        A(z());
    }

    @Override // defpackage.acdy
    public final void m(aceh acehVar) {
        this.l = acehVar;
        this.b.a = acehVar;
        A(z());
    }

    @Override // defpackage.acdy
    public final void n(boolean z, boolean z2) {
        A(this.h.j(z, z2));
    }

    @Override // defpackage.acdy
    public final void o(int i) {
        this.n = i;
        A(y());
    }

    @Override // defpackage.acdy
    public final void p(Bitmap bitmap, Bitmap bitmap2) {
        A(this.h.k(bitmap, bitmap2));
    }

    @Override // defpackage.acdy
    public final void q(CharSequence charSequence) {
        B(this.h.b.r(charSequence));
    }

    @Override // defpackage.acdy
    public final void r(Bitmap bitmap, Bitmap bitmap2) {
        B(this.h.b.s(bitmap, bitmap2));
    }

    @Override // defpackage.acdy
    public final void s(CharSequence charSequence) {
        B(this.h.b.t(charSequence));
    }

    @Override // defpackage.acdy
    public final void u() {
        A(this.h.h(8));
    }

    @Override // defpackage.acdy
    public final void w(abuz abuzVar) {
        B(this.h.b.Y(abuzVar));
    }

    @Override // defpackage.acdy
    public final void a() {
    }

    @Override // defpackage.acdy
    public final void t() {
    }

    @Override // defpackage.acdy
    public final void v(Optional optional) {
    }
}
