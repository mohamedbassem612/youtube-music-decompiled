package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class srv implements wpl, srw {
    private final Activity a;
    private final sry b;
    private final acyx c;
    private final stb d;
    private final String e;
    private final Long f;
    private final twi g;
    private final acxn h;
    private final roq i;
    private final xsc j;

    public srv(Activity activity, xsc xscVar, sry sryVar, roq roqVar, acyx acyxVar, acxn acxnVar, stb stbVar, String str, Long l, twi twiVar) {
        this.a = activity;
        this.j = xscVar;
        this.b = sryVar;
        this.i = roqVar;
        this.c = acyxVar;
        this.d = stbVar;
        this.e = str;
        this.f = l;
        this.g = twiVar;
        this.h = acxnVar;
    }

    private final xgn h() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof xgm) {
            return ((xgm) componentCallbacks2).hB();
        }
        return null;
    }

    private final advc i() {
        return (advc) aguu.J(this.i.c(), null);
    }

    private static agkj j(advc advcVar) {
        if (advcVar != null) {
            return agkj.j("sectionController", advcVar);
        }
        return null;
    }

    @Override // defpackage.wpl
    public final Long a() {
        return this.f;
    }

    @Override // defpackage.wpl, defpackage.srw
    public final String b() {
        return this.e;
    }

    @Override // defpackage.wpl
    public final void c() {
        this.d.dismiss();
    }

    @Override // defpackage.wpl
    public final void d(Throwable th) {
        this.g.a(th);
    }

    @Override // defpackage.wpl
    public final void e(alnu alnuVar) {
        agev agevVarI;
        alna alnaVar;
        this.d.dismiss();
        alnv alnvVar = alnuVar.d;
        if (alnvVar == null) {
            alnvVar = alnv.a;
        }
        int i = alnvVar.b;
        if (i == 153515154) {
            agevVarI = agev.i(new tld((akrn) alnvVar.c));
        } else {
            ajyf ajyfVar = (i == 62285833 ? (ajza) alnvVar.c : ajza.a).c;
            if (ajyfVar == null) {
                ajyfVar = ajyf.a;
            }
            agevVarI = ajyfVar.b == 62285947 ? agev.i(new tld(alnvVar.b == 62285833 ? (ajza) alnvVar.c : ajza.a)) : agdf.a;
        }
        if (!agevVarI.g()) {
            if (h() != null) {
                alna alnaVar2 = alnuVar.f;
                if (alnaVar2 == null) {
                    alnaVar2 = alna.a;
                }
                if ((alnaVar2.b & SemanticState.Multiline) != 0) {
                    alna alnaVar3 = alnuVar.f;
                    if (alnaVar3 == null) {
                        alnaVar3 = alna.a;
                    }
                    if (alnaVar3.g) {
                        h().l(new xgj(xhb.b(103918)));
                        h().l(new xgj(xhb.b(104381)));
                        h().l(new xgj(xhb.b(104380)));
                        h().l(new xgj(xhb.b(104382)));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        xsc xscVar = this.j;
        if ((alnuVar.b & 4) != 0) {
            alnaVar = alnuVar.f;
            if (alnaVar == null) {
                alnaVar = alna.a;
            }
        } else {
            alnaVar = null;
        }
        xscVar.W(alnaVar, j(i()), R.string.comment_added);
        Object obj = ((tld) agevVarI.c()).b;
        if (obj != null && h() != null) {
            h().d(new xgj(((aigj) obj).G()));
        }
        Object obj2 = ((tld) agevVarI.c()).a;
        for (advc advcVar : this.i.c()) {
            adkz adkzVarA = advcVar != null ? advcVar.a() : null;
            advj advjVar = advcVar instanceof advj ? (advj) advcVar : null;
            adwk adwkVar = advcVar instanceof adwk ? (adwk) advcVar : null;
            if (!(obj2 instanceof akrn) || this.c == null) {
                nsf.d(obj2, adkzVarA, adwkVar, advjVar);
            } else {
                nsf.d(this.h.a((akrn) obj2), adkzVarA, adwkVar, advjVar);
            }
        }
    }

    @Override // defpackage.srw
    public final void f(toe toeVar) {
        this.g.a(toeVar);
    }

    @Override // defpackage.srw
    public final void g(alnr alnrVar) {
        alna alnaVar;
        this.d.dismiss();
        if ((alnrVar.b & 2) == 0 && alnrVar.e.size() > 0) {
            if (h() != null) {
                alna alnaVar2 = alnrVar.f;
                if (alnaVar2 == null) {
                    alnaVar2 = alna.a;
                }
                if ((alnaVar2.b & SemanticState.Multiline) != 0) {
                    alna alnaVar3 = alnrVar.f;
                    if (alnaVar3 == null) {
                        alnaVar3 = alna.a;
                    }
                    if (alnaVar3.g) {
                        h().l(new xgj(xhb.b(103918)));
                        h().l(new xgj(xhb.b(104381)));
                        h().l(new xgj(xhb.b(104380)));
                        h().l(new xgj(xhb.b(104382)));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        alns alnsVar = alnrVar.d;
        if (alnsVar == null) {
            alnsVar = alns.a;
        }
        if (alnsVar.b == 153515154) {
            this.b.b(alnrVar);
            return;
        }
        xsc xscVar = this.j;
        if ((alnrVar.b & 16) != 0) {
            alnaVar = alnrVar.f;
            if (alnaVar == null) {
                alnaVar = alna.a;
            }
        } else {
            alnaVar = null;
        }
        xscVar.W(alnaVar, j(i()), R.string.reply_added);
        alns alnsVar2 = alnrVar.d;
        if (alnsVar2 == null) {
            alnsVar2 = alns.a;
        }
        int i = alnsVar2.b;
        alna alnaVar4 = alnrVar.f;
        if (alnaVar4 == null) {
            alnaVar4 = alna.a;
        }
        int iAs = afxw.as(alnaVar4.f);
        if (iAs != 0 && iAs != 1) {
            throw null;
        }
    }
}
