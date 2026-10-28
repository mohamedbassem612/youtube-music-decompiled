package defpackage;

import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class srk extends adty {
    public srj a;
    private final ajyy b;
    private final lqa c;
    private final aeiv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Object, java.util.Map] */
    public srk(advb advbVar, tbt tbtVar, ttm ttmVar, lqa lqaVar, acyx acyxVar, vxz vxzVar, ajza ajzaVar, wnf wnfVar, xgn xgnVar, lqa lqaVar2, nsg nsgVar) {
        ajyy ajyyVar;
        super(wnfVar, tbtVar, ttmVar, xgnVar, vxzVar);
        this.c = lqaVar2;
        advbVar.b(ajza.class);
        ajyz ajyzVar = ajzaVar.i;
        if (((ajyzVar == null ? ajyz.a : ajyzVar).b & 1) != 0) {
            ajyz ajyzVar2 = ajzaVar.i;
            ajyyVar = (ajyzVar2 == null ? ajyz.a : ajyzVar2).c;
            if (ajyyVar == null) {
                ajyyVar = ajyy.a;
            }
        } else {
            ajyyVar = null;
        }
        this.b = ajyyVar;
        aeiv aeivVar = new aeiv(lqaVar, ajzaVar, lqaVar2);
        this.d = aeivVar;
        ((adty) this).f.e(new adwu(this, 1));
        ((adty) this).f.e(new jeo(aeivVar, 7));
        ajyf ajyfVar = ajzaVar.c;
        if ((ajyfVar == null ? ajyf.a : ajyfVar).b == 62285947) {
            ajyf ajyfVar2 = ajzaVar.c;
            ajyfVar2 = ajyfVar2 == null ? ajyf.a : ajyfVar2;
            E(ajyfVar2.b == 62285947 ? (ajye) ajyfVar2.c : ajye.a);
        } else {
            apji apjiVar = ajzaVar.d;
            apjiVar = apjiVar == null ? apji.a : apjiVar;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = ajzaVar.d;
                apjiVar2 = apjiVar2 == null ? apji.a : apjiVar2;
                abfv abfvVar = new abfv();
                abfvVar.d(acyxVar);
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                akrn akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                aihf aihfVarCreateBuilder = amgj.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amgj amgjVar = (amgj) aihfVarCreateBuilder.instance;
                akrnVar.getClass();
                amgjVar.dP = akrnVar;
                amgjVar.i |= SemanticState.LiveRegion;
                G(abfvVar.c(agke.q((amgj) aihfVarCreateBuilder.build())));
                tbtVar.f(this);
            }
        }
        apji apjiVar3 = ajzaVar.e;
        apjiVar3 = apjiVar3 == null ? apji.a : apjiVar3;
        aihl aihlVar = ajzc.a;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
        apjiVar3.c(aihlVarCheckIsLite3);
        if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
            apji apjiVar4 = ajzaVar.e;
            apjiVar4 = apjiVar4 == null ? apji.a : apjiVar4;
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
            apjiVar4.c(aihlVarCheckIsLite4);
            Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
            E(objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
        }
        ajyo ajyoVar = ajzaVar.g;
        if (((ajyoVar == null ? ajyo.a : ajyoVar).b & 1) != 0) {
            ajyo ajyoVar2 = ajzaVar.g;
            ajyn ajynVar = (ajyoVar2 == null ? ajyo.a : ajyoVar2).c;
            E(ajynVar == null ? ajyn.a : ajynVar);
        }
        ajyt ajytVar = ajzaVar.f;
        if (((ajytVar == null ? ajyt.a : ajytVar).b & 1) != 0) {
            ajyt ajytVar2 = ajzaVar.f;
            ajyr ajyrVar = (ajytVar2 == null ? ajyt.a : ajytVar2).c;
            h(ajyrVar == null ? ajyr.a : ajyrVar, false);
        }
        tym.W(lqaVar.a, ajzaVar, this);
    }

    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.Map] */
    private final void h(ajyr ajyrVar, boolean z) {
        if (j()) {
            adlr adlrVar = ((adty) this).f;
            int iA = adlrVar.a();
            Object objD = adlrVar.d(iA - 1);
            Object objD2 = adlrVar.a() > 1 ? adlrVar.d(iA - 2) : null;
            if (objD2 instanceof ajyy) {
                super.l(objD2);
            } else if (objD instanceof ajyy) {
                super.l(objD);
            }
        }
        ArrayList arrayList = new ArrayList(ajyrVar.e.size());
        for (ajyx ajyxVar : ajyrVar.e) {
            if ((ajyxVar.b & 1) != 0) {
                aobx aobxVar = ajyxVar.c;
                if (aobxVar == null) {
                    aobxVar = aobx.a;
                }
                arrayList.add(aawb.ae(aobxVar));
            }
        }
        aI(arrayList);
        for (ajyf ajyfVar : this.c.x(ajyrVar)) {
            if (z) {
                aeiv aeivVar = this.d;
                int i = ajyfVar.b;
                ajye ajyeVar = i == 62285947 ? i == 62285947 ? (ajye) ajyfVar.c : ajye.a : null;
                aihf aihfVarCreateBuilder = ajyf.a.createBuilder();
                if (ajyeVar != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    ajyf ajyfVar2 = (ajyf) aihfVarCreateBuilder.instance;
                    ajyfVar2.c = ajyeVar;
                    ajyfVar2.b = 62285947;
                }
                ajyt ajytVar = ((ajza) aeivVar.c).f;
                if (ajytVar == null) {
                    ajytVar = ajyt.a;
                }
                if ((ajytVar.b & 1) == 0) {
                    aihf aihfVarCreateBuilder2 = ajyt.a.createBuilder();
                    aihf aihfVarCreateBuilder3 = ajyr.a.createBuilder();
                    String string = UUID.randomUUID().toString();
                    aihfVarCreateBuilder3.copyOnWrite();
                    ajyr ajyrVar2 = (ajyr) aihfVarCreateBuilder3.instance;
                    string.getClass();
                    ajyrVar2.c |= 65536;
                    ajyrVar2.f = string;
                    ajyr ajyrVar3 = (ajyr) aihfVarCreateBuilder3.build();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ajyt ajytVar2 = (ajyt) aihfVarCreateBuilder2.instance;
                    ajyrVar3.getClass();
                    ajytVar2.c = ajyrVar3;
                    ajytVar2.b |= 1;
                    ajyt ajytVar3 = (ajyt) aihfVarCreateBuilder2.build();
                    aihf builder = ((aihn) aeivVar.c).toBuilder();
                    builder.copyOnWrite();
                    ajza ajzaVar = (ajza) builder.instance;
                    ajytVar3.getClass();
                    ajzaVar.f = ajytVar3;
                    ajzaVar.b |= 64;
                    aeivVar.w((ajza) builder.build());
                }
                ajyt ajytVar4 = ((ajza) aeivVar.c).f;
                if (ajytVar4 == null) {
                    ajytVar4 = ajyt.a;
                }
                ajyr ajyrVar4 = ajytVar4.c;
                if (ajyrVar4 == null) {
                    ajyrVar4 = ajyr.a;
                }
                agjz agjzVar = new agjz(4);
                lqa lqaVar = (lqa) aeivVar.a;
                agjzVar.j(lqaVar.x(ajyrVar4));
                agjzVar.h((ajyf) aihfVarCreateBuilder.build());
                lqaVar.y(ajyrVar4, agjzVar.g());
                ArrayList arrayList2 = new ArrayList(tym.V(((lqa) aeivVar.b).a, aeivVar.c));
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    srk srkVar = (srk) arrayList2.get(i2);
                    if (srkVar.j()) {
                        srkVar.F(ajyeVar, ((adty) srkVar).f.a() - 1);
                    } else {
                        srkVar.E(ajyeVar);
                    }
                    srkVar.e();
                }
            } else {
                int i3 = ajyfVar.b;
                E(i3 == 62285947 ? i3 == 62285947 ? (ajye) ajyfVar.c : ajye.a : null);
            }
        }
        ajyy ajyyVar = this.b;
        if (ajyyVar != null) {
            E(ajyyVar);
        }
    }

    private final boolean j() {
        adlr adlrVar = ((adty) this).f;
        int iA = adlrVar.a();
        return ((iA > 0 ? adlrVar.d(iA + (-1)) : null) instanceof ajyy) || ((iA > 1 ? adlrVar.d(iA + (-2)) : null) instanceof ajyy);
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        if (apjhVar == null) {
            return null;
        }
        aihl aihlVar = ajyr.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite);
        if (!apjhVar.j.n(aihlVarCheckIsLite.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite2);
        Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
        return (ajyr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
    }

    public final void e() {
        srj srjVar = this.a;
        if (srjVar != null) {
            vta vtaVar = (vta) srjVar;
            if (vta.ae(vtaVar.s)) {
                vtaVar.s = vta.af(vtaVar.s, true);
            }
        }
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        l(vvtVar.a);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ void hs(Object obj, acjx acjxVar) {
        ajyr ajyrVar = (ajyr) obj;
        super.hs(ajyrVar, acjxVar);
        if (ajyrVar != null) {
            if (acjxVar.a() != acjw.d) {
                h(ajyrVar, true);
                return;
            }
            aeiv aeivVar = this.d;
            ajyo ajyoVar = ((ajza) aeivVar.c).g;
            if (ajyoVar == null) {
                ajyoVar = ajyo.a;
            }
            ajyn ajynVar = ajyoVar.c;
            if (ajynVar == null) {
                ajynVar = ajyn.a;
            }
            ajys ajysVar = ajynVar.c;
            if (ajysVar == null) {
                ajysVar = ajys.a;
            }
            if (ajysVar.b == 76818770) {
                ajyo ajyoVar2 = ((ajza) aeivVar.c).g;
                if (ajyoVar2 == null) {
                    ajyoVar2 = ajyo.a;
                }
                ajyn ajynVar2 = ajyoVar2.c;
                if (ajynVar2 == null) {
                    ajynVar2 = ajyn.a;
                }
                aihf builder = ajynVar2.toBuilder();
                ajys ajysVar2 = ajynVar2.c;
                if (ajysVar2 == null) {
                    ajysVar2 = ajys.a;
                }
                aihf builder2 = ajysVar2.toBuilder();
                ajys ajysVar3 = ajynVar2.c;
                if (ajysVar3 == null) {
                    ajysVar3 = ajys.a;
                }
                aqaw aqawVar = ajysVar3.b == 76818770 ? (aqaw) ajysVar3.c : aqaw.a;
                aihf builder3 = aqawVar.toBuilder();
                builder3.copyOnWrite();
                ((aqaw) builder3.instance).c = aqaw.emptyProtobufList();
                Iterator it = aqawVar.c.iterator();
                while (it.hasNext()) {
                    aihf builder4 = ((aqav) it.next()).toBuilder();
                    builder4.copyOnWrite();
                    aqav aqavVar = (aqav) builder4.instance;
                    aqavVar.b |= 4;
                    aqavVar.f = false;
                    builder3.copyOnWrite();
                    aqaw aqawVar2 = (aqaw) builder3.instance;
                    aqav aqavVar2 = (aqav) builder4.build();
                    aqavVar2.getClass();
                    aiie aiieVar = aqawVar2.c;
                    if (!aiieVar.c()) {
                        aqawVar2.c = aihn.mutableCopy(aiieVar);
                    }
                    aqawVar2.c.add(aqavVar2);
                }
                aqaw aqawVar3 = (aqaw) builder3.build();
                builder2.copyOnWrite();
                ajys ajysVar4 = (ajys) builder2.instance;
                aqawVar3.getClass();
                ajysVar4.c = aqawVar3;
                ajysVar4.b = 76818770;
                builder.copyOnWrite();
                ajyn ajynVar3 = (ajyn) builder.instance;
                ajys ajysVar5 = (ajys) builder2.build();
                ajysVar5.getClass();
                ajynVar3.c = ajysVar5;
                ajynVar3.b |= 8;
                ajyn ajynVar4 = (ajyn) builder.build();
                aihf builder5 = ((aihn) aeivVar.c).toBuilder();
                ajyo ajyoVar3 = ((ajza) aeivVar.c).g;
                if (ajyoVar3 == null) {
                    ajyoVar3 = ajyo.a;
                }
                aihf builder6 = ajyoVar3.toBuilder();
                builder6.copyOnWrite();
                ajyo ajyoVar4 = (ajyo) builder6.instance;
                ajynVar4.getClass();
                ajyoVar4.c = ajynVar4;
                ajyoVar4.b |= 1;
                builder5.copyOnWrite();
                ajza ajzaVar = (ajza) builder5.instance;
                ajyo ajyoVar5 = (ajyo) builder6.build();
                ajyoVar5.getClass();
                ajzaVar.g = ajyoVar5;
                ajzaVar.b |= SemanticState.Focused;
                aeivVar.w((ajza) builder5.build());
            }
            ajyt ajytVar = ((ajza) aeivVar.c).f;
            if (ajytVar == null) {
                ajytVar = ajyt.a;
            }
            if ((ajytVar.b & 1) != 0) {
                ajyt ajytVar2 = ((ajza) aeivVar.c).f;
                if (ajytVar2 == null) {
                    ajytVar2 = ajyt.a;
                }
                ajyr ajyrVar2 = ajytVar2.c;
                if (ajyrVar2 == null) {
                    ajyrVar2 = ajyr.a;
                }
                lqa lqaVar = (lqa) aeivVar.a;
                for (ajyf ajyfVar : lqaVar.x(ajyrVar2)) {
                    int i = ajyfVar.b;
                    ajye ajyeVar = i == 62285947 ? i == 62285947 ? (ajye) ajyfVar.c : ajye.a : null;
                    if (ajyeVar != null) {
                        ajyt ajytVar3 = ((ajza) aeivVar.c).f;
                        if (((ajytVar3 == null ? ajyt.a : ajytVar3).b & 1) != 0) {
                            if (ajytVar3 == null) {
                                ajytVar3 = ajyt.a;
                            }
                            ajyr ajyrVar3 = ajytVar3.c;
                            if (ajyrVar3 == null) {
                                ajyrVar3 = ajyr.a;
                            }
                            List listX = lqaVar.x(ajyrVar3);
                            for (int i2 = 0; i2 < listX.size(); i2++) {
                                ajyf ajyfVar2 = (ajyf) listX.get(i2);
                                ajye ajyeVar2 = ajyfVar2.b == 62285947 ? (ajye) ajyfVar2.c : ajye.a;
                                if (ajyeVar2 != null && (ajyeVar.b & 1) != 0 && ajyeVar.d.equals(ajyeVar2.d)) {
                                    agjz agjzVar = new agjz(4);
                                    agjzVar.j(listX.subList(0, i2));
                                    if (i2 < listX.size() - 1) {
                                        agjzVar.j(listX.subList(i2 + 1, listX.size()));
                                    }
                                    lqaVar.y(ajyrVar3, agjzVar.g());
                                    ajyeVar = ajyeVar2;
                                    break;
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList(tym.V(((lqa) aeivVar.b).a, aeivVar.c));
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            srk srkVar = (srk) arrayList.get(i3);
                            srkVar.l(ajyeVar);
                            srkVar.e();
                        }
                    }
                }
            }
            h(ajyrVar, true);
        }
    }
}
