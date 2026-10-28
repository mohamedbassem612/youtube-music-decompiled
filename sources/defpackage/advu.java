package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class advu extends adty {
    private final adlq a;
    private final admu b;
    private final admu c;
    private final vxz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public advu(wnf wnfVar, advb advbVar, tbt tbtVar, ttm ttmVar, xgn xgnVar, vxz vxzVar, vxz vxzVar2) {
        super(wnfVar, tbtVar, ttmVar, xgnVar, vxzVar2);
        advbVar.b(aovx.class);
        tbtVar.f(this);
        this.d = vxzVar;
        adlq adlqVar = new adlq(false);
        this.a = adlqVar;
        admu admuVar = new admu();
        this.b = admuVar;
        admu admuVar2 = new admu();
        this.c = admuVar2;
        adlqVar.m(-1, admuVar, true);
        adlqVar.m(-1, ((adty) this).f, true);
        adlqVar.m(-1, admuVar2, true);
    }

    private static agke j(aovx aovxVar) {
        if (aovxVar.d.size() == 0) {
            return agpi.a;
        }
        ArrayList arrayList = new ArrayList(aovxVar.d.size());
        for (aovy aovyVar : aovxVar.d) {
            int i = aovyVar.b;
            if ((i & 1) != 0) {
                aobx aobxVar = aovyVar.c;
                if (aobxVar == null) {
                    aobxVar = aobx.a;
                }
                arrayList.add(aawb.ae(aobxVar));
            } else if ((i & 2) != 0) {
                aoyh aoyhVar = aovyVar.d;
                if (aoyhVar == null) {
                    aoyhVar = aoyh.a;
                }
                arrayList.add(aawb.ae(aoyhVar));
            }
        }
        return agke.n(arrayList);
    }

    private final agke q(aovx aovxVar) {
        if (aovxVar.c.size() == 0) {
            return agpi.a;
        }
        ArrayList arrayList = new ArrayList(aovxVar.c.size());
        Iterator it = aovxVar.c.iterator();
        while (it.hasNext()) {
            aihf builder = ((aovz) it.next()).toBuilder();
            aovz aovzVar = (aovz) builder.instance;
            int i = aovzVar.b;
            if ((i & 1) != 0) {
                aowc aowcVar = aovzVar.c;
                if (aowcVar == null) {
                    aowcVar = aowc.a;
                }
                aihh aihhVar = (aihh) aowcVar.toBuilder();
                aihhVar.e(aowa.b, aovxVar.e);
                builder.copyOnWrite();
                aovz aovzVar2 = (aovz) builder.instance;
                aowc aowcVar2 = (aowc) aihhVar.build();
                aowcVar2.getClass();
                aovzVar2.c = aowcVar2;
                aovzVar2.b |= 1;
                if (this.d.l(111, 45623844L, false)) {
                    aowc aowcVar3 = ((aovz) builder.instance).c;
                    if (aowcVar3 == null) {
                        aowcVar3 = aowc.a;
                    }
                    arrayList.add(new advv(aowcVar3));
                } else {
                    aowc aowcVar4 = ((aovz) builder.instance).c;
                    if (aowcVar4 == null) {
                        aowcVar4 = aowc.a;
                    }
                    arrayList.add(aowcVar4);
                }
            } else if ((i & 8) != 0) {
                akfy akfyVar = aovzVar.d;
                if (akfyVar == null) {
                    akfyVar = akfy.a;
                }
                arrayList.add(akfyVar);
            }
        }
        return agke.n(arrayList);
    }

    @Override // defpackage.adty
    protected final void F(Object obj, int i) {
        this.b.add(i, obj);
    }

    @Override // defpackage.adty, defpackage.advc
    public final adkz a() {
        return this.a;
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        if (apjhVar == null) {
            return null;
        }
        aihl aihlVar = aovx.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite);
        if (!apjhVar.j.n(aihlVarCheckIsLite.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite2);
        Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
        return (aovx) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
    }

    public final void h(aovx aovxVar) {
        if (aovxVar == null) {
            super.x();
            this.b.clear();
            this.c.clear();
            return;
        }
        aI(j(aovxVar));
        agke agkeVarQ = q(aovxVar);
        admu admuVar = this.b;
        int size = admuVar.size();
        int i = 0;
        for (Object obj : agkeVarQ) {
            if (i < size) {
                admuVar.hM(i, obj);
            } else {
                admuVar.add(i, obj);
            }
            i++;
        }
        if (i < size) {
            admuVar.hL(i, size - i);
        }
    }

    @tcc
    protected void handleVideoRemovedFromPlaylistEvent(wsv wsvVar) {
        boolean zL = this.d.l(111, 45623844L, false);
        admu admuVar = this.b;
        if (zL) {
            admuVar.o(new hsb(wsvVar, 14));
        } else {
            admuVar.o(new hsb(wsvVar, 15));
        }
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ void hs(Object obj, acjx acjxVar) {
        aovx aovxVar = (aovx) obj;
        super.hs(aovxVar, acjxVar);
        if (aovxVar != null) {
            if (acjxVar.a() == acjw.d) {
                h(aovxVar);
                return;
            }
            admu admuVar = this.b;
            int size = admuVar.size() - 1;
            if (size >= 0) {
                admuVar.hM(size, admuVar.get(size));
            }
            aI(j(aovxVar));
            admuVar.addAll(q(aovxVar));
        }
    }
}
