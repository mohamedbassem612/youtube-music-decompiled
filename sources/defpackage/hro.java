package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hro implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hro(abpd abpdVar, abri abriVar, yrr yrrVar, xir xirVar, int i) {
        this.$cid = i;
        this.d = abpdVar;
        this.b = abriVar;
        this.c = yrrVar;
        this.a = xirVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [aaqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object obj2;
        aanp aanpVarA;
        Boolean bool;
        Optional optionalOfNullable;
        int i = this.$cid;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((ailt) obj).b);
                gvy gvyVar = (gvy) this.a;
                int i3 = ((ailc) j$.util.Map.EL.getOrDefault(mapUnmodifiableMap, gvyVar.e.o(), ailc.a)).c;
                if (i3 > 0) {
                    return Boolean.FALSE;
                }
                aoia aoiaVar = (aoia) ((Optional) this.d).get();
                cf cfVar = gvyVar.d;
                aohy aohyVar = aoiaVar.d;
                if (aohyVar == null) {
                    aohyVar = aohy.a;
                }
                akdd akddVar = aohyVar.e;
                if (akddVar == null) {
                    akddVar = akdd.a;
                }
                acwl.i(cfVar, akddVar, gvyVar.b, gvyVar.a.hB(), null, true, true, new gvx(gvyVar, (aofx) this.c, aoiaVar, this.b, i3), null, null, null, gvyVar.f, false);
                return Boolean.TRUE;
            }
            if (i != 2) {
                if (i != 3) {
                    return ((abpd) this.d).d((abri) this.b, (yrr) this.c, (wjf) obj, this.a);
                }
                Stream stream = Collection.EL.stream((List) obj);
                Object obj3 = this.c;
                Object obj4 = this.a;
                agke agkeVar = (agke) stream.filter(new iab(obj4, obj3, i2)).map(new hqs(((iad) obj4).c, 14)).collect(aghu.a);
                return iac.a(aamh.b((String) this.d, agkeVar.size(), (String) this.b), agkeVar);
            }
            ?? r10 = this.d;
            Object obj5 = this.c;
            Object obj6 = this.b;
            hsj hsjVar = (hsj) this.a;
            Optional optional = (Optional) obj;
            hsg hsgVar = new hsg(hsjVar, (aaew) obj5, hsjVar.g.e(), (anyr) obj6, r10);
            if (true != optional.isPresent()) {
                optionalOfNullable = optional;
            } else {
                Object obj7 = optional.get();
                hsj hsjVar2 = hsgVar.a;
                aaew aaewVar = hsgVar.b;
                aohx aohxVar = hsgVar.c;
                anyr anyrVar = hsgVar.d;
                aaqn aaqnVar = hsgVar.e;
                aamo aamoVar = (aamo) obj7;
                if (aaewVar.M(aamoVar, aohxVar, hsjVar2.g.d(aohxVar), aamn.a(anyrVar.j), anyrVar.d.G(), aamg.ACTIVE)) {
                    Object obj8 = aamoVar.b;
                    if (obj8 != null) {
                        axfd axfdVar = aaewVar.k;
                        aaok aaokVar = (aaok) obj8;
                        if (axfdVar.v((String) aaokVar.b) == null) {
                            axfdVar.w(aaokVar);
                        } else {
                            axfdVar.x(aaokVar);
                        }
                    }
                    aaqnVar.l().p(aamoVar.d(), true);
                    bool = Boolean.TRUE;
                } else {
                    hsjVar2.e.e(new aahx(aamoVar.d(), 2));
                    bool = Boolean.FALSE;
                }
                optionalOfNullable = Optional.ofNullable(bool);
            }
            return ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue() ? optional : Optional.empty();
        }
        anvi anviVar = (anvi) obj;
        agjz agjzVar = new agjz(4);
        Iterator it = this.c.iterator();
        while (true) {
            obj2 = this.b;
            if (!it.hasNext()) {
                break;
            }
            aamt aamtVar = (aamt) it.next();
            if (aamtVar.g() && ikg.j(((hsd) this.a).i, anviVar, aamtVar)) {
                aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                aofhVar.c = 2;
                aofhVar.b |= 1;
                String strAH = kro.aH(aamtVar.b());
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                strAH.getClass();
                aofhVar2.b |= 2;
                aofhVar2.d = strAH;
                aihh aihhVar = (aihh) aofg.b.createBuilder();
                aihf aihfVarCreateBuilder2 = aofa.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aofa aofaVar = (aofa) aihfVarCreateBuilder2.instance;
                aofaVar.c = 5;
                aofaVar.b |= 1;
                aofa aofaVar2 = (aofa) aihfVarCreateBuilder2.build();
                aihhVar.copyOnWrite();
                aofg aofgVar = (aofg) aihhVar.instance;
                aofaVar2.getClass();
                aofgVar.g = aofaVar2;
                aofgVar.c |= 2;
                aihl aihlVar = anyr.b;
                aihf aihfVarCreateBuilder3 = anyr.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                anyr anyrVar2 = (anyr) aihfVarCreateBuilder3.instance;
                obj2.getClass();
                anyrVar2.c |= 32;
                anyrVar2.i = (String) obj2;
                aihhVar.e(aihlVar, (anyr) aihfVarCreateBuilder3.build());
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                aofg aofgVar2 = (aofg) aihhVar.build();
                aofgVar2.getClass();
                aofhVar3.e = aofgVar2;
                aofhVar3.b |= 4;
                agjzVar.h((aofh) aihfVarCreateBuilder.build());
            }
        }
        agke agkeVarG = agjzVar.g();
        if (agkeVarG.isEmpty()) {
            return null;
        }
        agkh agkhVar = (agkh) this.d;
        aanp aanpVar = (aanp) agkhVar.d(false).get(obj2);
        if (aanpVar != null) {
            agjz agjzVar2 = new agjz(4);
            agjzVar2.j(aanpVar.e);
            agjzVar2.j(agkeVarG);
            aano aanoVar = new aano(aanpVar);
            aanoVar.b(agjzVar2.g());
            aanpVarA = aanoVar.a();
        } else {
            aano aanoVarA = aanp.a();
            aanoVarA.c = 2;
            aanoVarA.b(agkeVarG);
            aanpVarA = aanoVarA.a();
        }
        agkhVar.e(obj2, aanpVarA);
        return null;
    }

    public /* synthetic */ hro(hsd hsdVar, String str, agke agkeVar, agkh agkhVar, int i) {
        this.$cid = i;
        this.a = hsdVar;
        this.b = str;
        this.c = agkeVar;
        this.d = agkhVar;
    }

    public /* synthetic */ hro(hsj hsjVar, aaqn aaqnVar, aaew aaewVar, anyr anyrVar, int i) {
        this.$cid = i;
        this.a = hsjVar;
        this.d = aaqnVar;
        this.c = aaewVar;
        this.b = anyrVar;
    }

    public /* synthetic */ hro(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.d = obj3;
        this.b = obj4;
    }
}
