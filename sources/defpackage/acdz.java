package defpackage;

import android.graphics.Bitmap;
import android.text.Spanned;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class acdz implements acdy {
    private final acdo a;
    private final awmd b;
    private final acdw c;
    private final ahey d;
    private final abmt e;
    private final avlh f;
    private final avlh g;
    private final avlh h;
    private final acdq i;
    private aayv j;
    private aceh k;
    private acee l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private ScheduledFuture r;
    private final abwg s;
    private final adws t;

    public acdz(acdo acdoVar, adws adwsVar, awmd awmdVar, acdw acdwVar, ahey aheyVar, abwg abwgVar, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, abmt abmtVar, acdq acdqVar) {
        this.a = acdoVar;
        this.t = adwsVar;
        this.b = awmdVar;
        this.c = acdwVar;
        this.d = aheyVar;
        this.e = abmtVar;
        this.i = acdqVar;
        this.f = avlhVar2;
        this.g = avlhVar3;
        this.h = avlhVar;
        this.s = abwgVar;
    }

    private final void x() {
        boolean z = this.o;
        boolean z2 = false;
        if (this.n > 0 && this.i.A()) {
            z2 = true;
        }
        this.o = z2;
        if (z2 != z) {
            y();
        }
    }

    private final void y() {
        aayv aayvVar;
        boolean z = true;
        boolean z2 = this.o || ((aayvVar = this.j) != null && aayvVar.a);
        acdq acdqVar = this.i;
        aceh acehVar = this.k;
        if (acehVar != null) {
            z2 = ((xxb) acehVar).a;
        }
        acee aceeVar = this.l;
        if (aceeVar != null) {
            z = ((xxc) aceeVar).a;
        } else {
            aayv aayvVar2 = this.j;
            if (aayvVar2 == null || !aayvVar2.b) {
                z = false;
            }
        }
        acdqVar.f(z2, z);
    }

    @Override // defpackage.acdy
    public final void a() {
        this.i.v();
    }

    @Override // defpackage.acdy
    public final void b(aawn aawnVar) {
        this.i.E(aawnVar.a);
    }

    @Override // defpackage.acdy
    public final void c(yvu yvuVar) {
        wgs wgsVar = yvuVar.c;
        if (wgsVar != null) {
            this.i.m(wgsVar.d(), wgsVar.i());
        }
    }

    @Override // defpackage.acdy
    public final void d(aaxh aaxhVar) {
        this.i.g(aaxhVar.c);
    }

    @Override // defpackage.acdy
    public final void e(aayv aayvVar) {
        this.j = aayvVar;
        y();
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
        this.i.I(charSequenceK, spanned);
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, wjf] */
    @Override // defpackage.acdy
    public final void g(aazj aazjVar) {
        afvn afvnVarB = aawb.b(aazjVar, "PCU");
        try {
            abob abobVar = aazjVar.a;
            abob abobVar2 = abob.c;
            this.m = abobVar.c(abobVar2);
            boolean z = aazjVar.i;
            this.q = z;
            wjf wjfVar = aazjVar.b;
            if (abobVar == abob.a) {
                this.i.c();
                acdo acdoVar = this.a;
                acdoVar.a = null;
                acdoVar.b = null;
            } else if (abobVar == abobVar2 && wjfVar != null) {
                acdq acdqVar = this.i;
                acdqVar.x();
                xpl xplVarT = xpl.t(wjfVar.t(), 0L, null);
                if (xplVarT != null) {
                    acdqVar.e(Duration.ofSeconds(xplVarT.b.a()).toMillis());
                } else {
                    acdqVar.e(Duration.ofSeconds(wjfVar.a()).toMillis());
                }
                acdqVar.d(!z || wjfVar.W());
                acdqVar.I(wjfVar.F(), null);
                acdqVar.K(wjfVar.af());
                this.c.d(wjfVar.af(), Optional.of(Boolean.valueOf(aaje.o(wjfVar.t()))));
                acdqVar.v();
            }
            if (this.e.P()) {
                if (abobVar == abob.f) {
                    this.p = true;
                    acdq acdqVar2 = this.i;
                    acdqVar2.x();
                    acdqVar2.d(false);
                    acdqVar2.v();
                } else if (abobVar == abob.g && wjfVar != null && this.p) {
                    this.p = false;
                    acdq acdqVar3 = this.i;
                    acdqVar3.x();
                    acdqVar3.d(!z || wjfVar.W());
                    acdqVar3.v();
                }
            }
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acdy
    public final void h(aazk aazkVar) {
        acdq acdqVar = this.i;
        acdqVar.i(aazkVar.a);
        if (this.e.bZ() && this.q) {
            acdqVar.e(aazkVar.d);
        }
    }

    @Override // defpackage.acdy
    public final void i(aazn aaznVar) {
        if (this.m) {
            this.i.h(aaznVar.a);
        }
    }

    @Override // defpackage.acdy
    public final void j(tbt tbtVar, acea aceaVar) {
        if (this.e.bN()) {
            abwg abwgVar = this.s;
            ((avlh) abwgVar.p).P().ak(new acaa(aceaVar, 9));
            this.f.ak(new acaa(aceaVar, 10));
            this.g.ak(new acaa(aceaVar, 11));
            ((avlh) abwgVar.i).P().ak(new aawl(new acaa(aceaVar, 12), "PCUDLI", 2));
            ((avlh) abwgVar.h).P().ak(new acaa(aceaVar, 13));
            this.h.ak(new acaa(aceaVar, 14));
            ((avlh) abwgVar.n).P().ak(new acaa(aceaVar, 15));
            ((avlh) abwgVar.e).P().ak(new acaa(aceaVar, 16));
        } else {
            tbtVar.f(aceaVar);
        }
        adws adwsVar = this.t;
        ((avlh) adwsVar.a).ak(new acae(aceaVar, 5));
    }

    @Override // defpackage.acdy
    public final void k(boolean z) {
        this.i.d(z);
        x();
    }

    @Override // defpackage.acdy
    public final void l(acee aceeVar) {
        this.l = aceeVar;
        this.a.b = aceeVar;
        y();
    }

    @Override // defpackage.acdy
    public final void m(aceh acehVar) {
        this.k = acehVar;
        this.a.a = acehVar;
        y();
    }

    @Override // defpackage.acdy
    public final void n(boolean z, boolean z2) {
        this.i.j(z, z2);
    }

    @Override // defpackage.acdy
    public final void o(int i) {
        this.n = i;
        x();
    }

    @Override // defpackage.acdy
    public final void p(Bitmap bitmap, Bitmap bitmap2) {
        this.i.k(bitmap, bitmap2);
    }

    @Override // defpackage.acdy
    public final void t() {
        this.i.x();
    }

    @Override // defpackage.acdy
    public final void u() {
        this.i.h(8);
    }

    @Override // defpackage.acdy
    public final void v(Optional optional) {
        aceu aceuVar = (aceu) this.b.io();
        if (aceuVar != null) {
            aceuVar.e(true);
            ScheduledFuture scheduledFuture = this.r;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.r.cancel(false);
                this.r = null;
            }
            this.r = this.d.schedule((Runnable) optional.orElse(new abyz(aceuVar, 3)), 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.acdy
    public final /* synthetic */ void q(CharSequence charSequence) {
    }

    @Override // defpackage.acdy
    public final /* synthetic */ void s(CharSequence charSequence) {
    }

    @Override // defpackage.acdy
    public final /* synthetic */ void w(abuz abuzVar) {
    }

    @Override // defpackage.acdy
    public final /* synthetic */ void r(Bitmap bitmap, Bitmap bitmap2) {
    }
}
