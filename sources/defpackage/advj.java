package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class advj extends adty implements adwk, adtb, advp {
    private boolean a;
    private final adlr b;
    private final List c;
    private final boolean d;
    private final abfv e;
    public String i;
    public String j;
    protected amgg k;
    public final abfv l;

    public advj(wnf wnfVar, advb advbVar, tbt tbtVar, ttm ttmVar, xgn xgnVar, adxd adxdVar, vxz vxzVar) {
        admu admuVar = new admu();
        super(wnfVar, tbtVar, ttmVar, xgnVar, adxdVar != null ? adxdVar.o : null, admuVar, vxzVar);
        this.c = new ArrayList();
        advbVar.b(wga.class);
        this.b = admuVar;
        if (adxdVar instanceof advh) {
            advh advhVar = (advh) adxdVar;
            this.a = advhVar.a;
            this.j = advhVar.b;
            this.i = advhVar.c;
            this.d = advhVar.d;
        } else {
            h();
            this.d = true;
        }
        tbtVar.f(this);
        admuVar.e(new adwu(this, 1));
        admuVar.e(new adwu(this, 2));
        this.l = new abfv();
        this.e = new abfv();
        Q(new advg());
    }

    private final void h() {
        amgg amggVar = this.k;
        if (amggVar != null) {
            aqjn aqjnVar = amggVar.h;
            if (aqjnVar == null) {
                aqjnVar = aqjn.a;
            }
            if (aqjnVar.d.size() > 0) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adtv
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void hs(wga wgaVar, acjx acjxVar) {
        super.hs(wgaVar, acjxVar);
        if (wgaVar != null) {
            D(wgaVar, acjxVar.a());
        }
    }

    protected void D(wga wgaVar, acjw acjwVar) {
        int iOrdinal = acjwVar.ordinal();
        if (iOrdinal == 2) {
            w(wgaVar);
        } else if (iOrdinal != 3) {
            v(wgaVar);
        } else {
            e(wgaVar);
        }
    }

    @Override // defpackage.adtb
    public final void N(apho aphoVar, ajwo ajwoVar) {
        x();
        aF(aawb.ae(aphoVar), ajwoVar);
    }

    @Override // defpackage.adtb
    public final /* synthetic */ void O(apho aphoVar, twi twiVar, adud adudVar, ajwo ajwoVar) {
        aphoVar.getClass();
        j(aphoVar, ajwoVar);
    }

    public final void P(List list, int i) {
        I(this.l.c(list), i);
    }

    protected final void Q(adwp adwpVar) {
        this.l.d(adwpVar);
    }

    public final void R(int i, int i2) {
        ((adty) this).f.j(i, i2);
        super.L(this.g);
    }

    @Override // defpackage.adtb
    public final void ap(acjx acjxVar, twi twiVar) {
        throw null;
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        wga wgaVar = null;
        if (apjhVar != null) {
            aihl aihlVar = amgg.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjhVar.c(aihlVarCheckIsLite);
            if (apjhVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjhVar.c(aihlVarCheckIsLite2);
                Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
                wgaVar = new wga((amgg) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
        return wgaVar;
    }

    public void e(wga wgaVar) {
        amge amgeVar;
        x();
        amgg amggVar = wgaVar.a;
        this.k = amggVar;
        if (amggVar == null || (amggVar.c & 524288) == 0) {
            K(this.b);
        } else {
            akkc akkcVar = amggVar.k;
            if (akkcVar == null) {
                akkcVar = akkc.a;
            }
            aihl aihlVar = aqaz.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            akkcVar.c(aihlVarCheckIsLite);
            if (akkcVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                akkcVar.c(aihlVarCheckIsLite2);
                Object objK = akkcVar.j.k(aihlVarCheckIsLite2.d);
                aqaz aqazVar = (aqaz) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                int iAU = a.aU(aqazVar.c);
                if (iAU == 0) {
                    iAU = 1;
                }
                int iAS = a.aS(aqazVar.d);
                if (iAS == 0) {
                    iAS = 1;
                }
                K(new admy(iAU, iAS));
            } else {
                K(this.b);
            }
        }
        amgg amggVar2 = this.k;
        Object obj = null;
        if (amggVar2 != null) {
            amgeVar = amggVar2.d;
            if (amgeVar == null) {
                amgeVar = amge.a;
            }
        } else {
            amgeVar = null;
        }
        this.a = false;
        if (amgeVar != null) {
            int i = amgeVar.b;
            int i2 = i & 1;
            if (i2 != 0) {
                amgd amgdVar = amgeVar.c;
                if (amgdVar == null) {
                    amgdVar = amgd.a;
                }
                alay alayVar = amgdVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                if (!TextUtils.isEmpty(ackj.k(null, alayVar, null, false))) {
                    amgd amgdVar2 = amgeVar.c;
                    if (amgdVar2 == null) {
                        amgdVar2 = amgd.a;
                    }
                    E(amgdVar2);
                    this.a = true;
                } else if ((amgeVar.b & 64) != 0) {
                    akrn akrnVar = amgeVar.i;
                    if (akrnVar == null) {
                        akrnVar = akrn.a;
                    }
                    E(akrnVar);
                }
            } else {
                int i3 = i & 2;
                if (i3 != 0) {
                    amgf amgfVar = amgeVar.d;
                    if (amgfVar == null) {
                        amgfVar = amgf.a;
                    }
                    amgh amghVar = amgfVar.b;
                    if (amghVar == null) {
                        amghVar = amgh.a;
                    }
                    if ((amghVar.b & 1) != 0) {
                        amgf amgfVar2 = amgeVar.d;
                        if (amgfVar2 == null) {
                            amgfVar2 = amgf.a;
                        }
                        E(amgfVar2);
                        this.a = true;
                    }
                } else {
                    if (i2 != 0) {
                        obj = amgeVar.c;
                        if (obj == null) {
                            obj = amgd.a;
                        }
                    } else if (i3 != 0) {
                        obj = amgeVar.d;
                        if (obj == null) {
                            obj = amgf.a;
                        }
                    } else if ((i & 4) != 0) {
                        obj = amgeVar.e;
                        if (obj == null) {
                            obj = ajzb.a;
                        }
                    } else if ((i & 8) != 0) {
                        obj = amgeVar.f;
                        if (obj == null) {
                            obj = amgl.a;
                        }
                    } else if ((i & 16) != 0) {
                        obj = amgeVar.g;
                        if (obj == null) {
                            obj = amgk.a;
                        }
                    } else if ((i & 32) != 0) {
                        obj = amgeVar.h;
                        if (obj == null) {
                            obj = aqau.a;
                        }
                    } else if ((i & 64) != 0) {
                        obj = amgeVar.i;
                        if (obj == null) {
                            obj = akrn.a;
                        }
                    } else if ((i & SemanticState.Focused) != 0) {
                        obj = amgeVar.j;
                        if (obj == null) {
                            obj = aphm.a;
                        }
                    } else if ((i & SemanticState.Hidden) != 0) {
                        obj = amgeVar.k;
                        if (obj == null) {
                            obj = ajta.a;
                        }
                    } else if ((i & SemanticState.LiveRegion) != 0) {
                        obj = amgeVar.l;
                        if (obj == null) {
                            obj = akyi.a;
                        }
                    } else if ((i & SemanticState.ReadOnly) != 0) {
                        obj = amgeVar.m;
                        if (obj == null) {
                            obj = akws.a;
                        }
                    } else if ((i & SemanticState.Modal) != 0) {
                        obj = amgeVar.n;
                        if (obj == null) {
                            obj = aqnd.a;
                        }
                    } else if ((i & SemanticState.Obscured) != 0) {
                        obj = amgeVar.o;
                        if (obj == null) {
                            obj = amuz.a;
                        }
                    } else if ((i & SemanticState.Multiline) != 0) {
                        obj = amgeVar.p;
                        if (obj == null) {
                            obj = aqyy.a;
                        }
                    } else if ((i & 16384) != 0) {
                        obj = amgeVar.q;
                        if (obj == null) {
                            obj = amtp.a;
                        }
                    } else if ((32768 & i) != 0) {
                        obj = amgeVar.r;
                        if (obj == null) {
                            obj = ajsw.a;
                        }
                    } else if ((65536 & i) != 0) {
                        obj = amgeVar.s;
                        if (obj == null) {
                            obj = aoku.a;
                        }
                    } else if ((131072 & i) != 0) {
                        obj = amgeVar.t;
                        if (obj == null) {
                            obj = apoc.a;
                        }
                    } else if ((262144 & i) != 0) {
                        obj = amgeVar.u;
                        if (obj == null) {
                            obj = amlk.a;
                        }
                    } else if ((524288 & i) != 0) {
                        obj = amgeVar.v;
                        if (obj == null) {
                            obj = aked.a;
                        }
                    } else if ((i & 1048576) != 0 && (obj = amgeVar.w) == null) {
                        obj = aoxw.a;
                    }
                    if (obj != null) {
                        if (obj instanceof akrn) {
                            abfv abfvVar = this.e;
                            amge amgeVar2 = this.k.d;
                            if (amgeVar2 == null) {
                                amgeVar2 = amge.a;
                            }
                            Object[] objArr = {amgeVar2};
                            aguu.j(objArr, 1);
                            G(abfvVar.c(new agpi(objArr, 1)));
                        } else {
                            E(obj);
                        }
                        this.a = true;
                    }
                }
            }
        }
        amgg amggVar3 = this.k;
        this.j = amggVar3.i;
        this.i = amggVar3.g;
        h();
        if (this.d) {
            v(wgaVar);
        }
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        super.l(vvtVar.a);
    }

    @tcc
    public void handleItemDismissedEvent(adve adveVar) {
        throw null;
    }

    @tcc
    public void handleRemoveItemEvent(vvu vvuVar) {
        throw null;
    }

    @tcc
    public void handleServiceResponseRemoveEvent(wpx wpxVar) {
        throw null;
    }

    @Override // defpackage.adty, defpackage.adtv, defpackage.advw
    public adxd hq() {
        return new advh(super.hq(), this.a, this.j, this.i, this.d);
    }

    @Override // defpackage.adty, defpackage.adtv, defpackage.twn
    public void i() {
        adkz adkzVarA = a();
        if (adkzVarA != null) {
            for (int i = 0; i < adkzVarA.a(); i++) {
                acxm.c(adkzVarA.d(i));
            }
        }
        super.i();
        List list = this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((advi) it.next()).a();
        }
        list.clear();
    }

    @Override // defpackage.adtb
    public void j(apho aphoVar, ajwo ajwoVar) {
        acjx acjxVarAe = aawb.ae(aphoVar);
        adsl adslVar = new adsl(2);
        x();
        aD(adslVar, null, acjxVarAe, ajwoVar);
    }

    @Override // defpackage.adty, defpackage.adwk
    public final void l(Object obj) {
        super.l(obj);
    }

    public String p() {
        return this.j;
    }

    @Override // defpackage.advp
    public String q() {
        return this.i;
    }

    public void u(Object obj, int i) {
        if (this.a) {
            F(obj, i + 1);
        } else {
            F(obj, i);
        }
    }

    protected void v(wga wgaVar) {
        if (wgaVar != null) {
            aI(wgaVar.a());
            G(this.l.c(wgaVar.a.e));
        }
    }

    protected void w(wga wgaVar) {
        aI(wgaVar.a());
        I(this.l.c(wgaVar.a.e), this.a ? 1 : 0);
    }
}
