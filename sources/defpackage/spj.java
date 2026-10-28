package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class spj extends spf {
    public boolean e;
    private final xgn f;
    private final sgv g;
    private final vyo h;

    public spj(xgn xgnVar, sgv sgvVar, vyo vyoVar) {
        super(soz.b().a());
        this.f = xgnVar;
        this.g = sgvVar;
        this.h = vyoVar;
    }

    private static final aiuz e(soz sozVar) {
        apzz apzzVar = sozVar.a;
        if (apzzVar != null) {
            apji apjiVar = apzzVar.c;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = aiva.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = apzzVar.c;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (aiuz) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    private static final xgz f(aqaa aqaaVar, soz sozVar) {
        if (aqaaVar == null) {
            return null;
        }
        if ((aqaaVar.b & 8) != 0) {
            return new xgj(aqaaVar.c, (amud) null);
        }
        if (sozVar == null) {
            return null;
        }
        amud amudVar = sozVar.n;
        if ((amudVar.c & 1) != 0) {
            return new xgj(amudVar);
        }
        return null;
    }

    private static final aqaa g(soz sozVar) {
        apzz apzzVar = sozVar.a;
        if (apzzVar != null) {
            apji apjiVar = apzzVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = aqab.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = apzzVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (aqaa) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    @Override // defpackage.spf
    public final /* synthetic */ void a(Object obj, boolean z) {
        xgz xgzVarF;
        soz sozVar = (soz) obj;
        slm slmVar = sozVar.h;
        soz sozVar2 = (soz) this.a;
        if (slmVar != sozVar2.h) {
        }
        sgn sgnVar = sozVar.c;
        if (!sgnVar.equals(sozVar2.c)) {
        }
        if (!sgnVar.equals(((soz) this.a).c)) {
        }
        soz sozVar3 = (soz) this.a;
        int i = sozVar3.d;
        int i2 = sozVar.d;
        if (i != i2 || sozVar3.e != sozVar.e) {
            ((syn) this.b).h(i2, this.e || sozVar.e);
        }
        boolean z2 = sozVar.r;
        soz sozVar4 = (soz) this.a;
        if (z2 != sozVar4.r) {
        }
        int i3 = sozVar.f;
        if (i3 != sozVar4.f && i3 != -1 && i2 == 0) {
            syn synVar = (syn) this.b;
            Context context = (Context) synVar.b;
            Resources resources = context.getResources();
            int i4 = (i3 + 999) / 1000;
            Integer numValueOf = Integer.valueOf(i4);
            String string = resources.getString(R.string.skip_ad_in, numValueOf);
            TextView textView = (TextView) synVar.a;
            textView.setText(string);
            textView.setContentDescription(context.getResources().getQuantityString(R.plurals.accessibility_skip_ad_in, i4, numValueOf));
        }
        int i5 = sozVar.g;
        if (i5 != ((soz) this.a).g && i5 != -1) {
        }
        aqaa aqaaVarG = g(sozVar);
        if (Objects.equals(g((soz) this.a), aqaaVarG)) {
            xgz xgzVarF2 = f(aqaaVarG, sozVar);
            if (afxw.e(this.h).ai) {
                if (z) {
                    if (i2 == 1 && ((soz) this.a).d != 1 && xgzVarF2 != null) {
                        this.f.w(xgzVarF2, null);
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else if (z) {
                if (!this.c && xgzVarF2 != null) {
                    this.f.w(xgzVarF2, null);
                }
                z = true;
            } else {
                z = false;
            }
        } else {
            if (aqaaVarG != null && (xgzVarF = f(aqaaVarG, sozVar)) != null) {
                if ((aqaaVarG.b & 8) == 0) {
                    xgn xgnVar = this.f;
                    xgnVar.d(xgzVarF);
                    if (afxw.e(this.h).ai) {
                        if (z) {
                            xgnVar.w(xgzVarF, null);
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
                if (!afxw.e(this.h).ai && z) {
                    this.f.w(xgzVarF, null);
                }
            }
        }
        aiuz aiuzVarE = e(sozVar);
        if (!Objects.equals(e((soz) this.a), aiuzVarE)) {
            if (aiuzVarE != null) {
                this.f.d(new xgj(aiuzVarE.b, (amud) null));
            }
        }
        spb spbVar = sozVar.b;
        if (!spbVar.equals(((soz) this.a).b) && !spbVar.equals(spb.a)) {
            int i6 = this.g.e;
            if (sozVar.k) {
                float f = sozVar.l;
                int i7 = sozVar.m;
            }
        }
        if (this.c != z && z) {
        }
        if (sozVar.j != ((soz) this.a).j) {
        } else if (afxw.e(this.h).bL && sozVar.i != ((soz) this.a).i) {
        }
        vyo vyoVar = this.h;
        if (afxw.e(vyoVar).bm || afxw.e(vyoVar).bn) {
            boolean z3 = sozVar.o;
            boolean z4 = sozVar.p;
            Duration duration = sozVar.q;
        }
    }

    @Override // defpackage.spf
    public final void c() {
    }
}
