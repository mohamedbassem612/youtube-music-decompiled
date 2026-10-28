package defpackage;

import android.util.Pair;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acnt implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acnt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [aclq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v63, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.avni
    public final void a(Object obj) {
        avgb avgbVar;
        int i;
        abvk abvkVar;
        int i2 = 2;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                acoi acoiVar = (acoi) this.a;
                acoiVar.bM = zBooleanValue;
                acoiVar.Z(!bool.booleanValue());
                return;
            case 1:
                acoi acoiVar2 = ((acoh) this.a).b;
                aaxg aaxgVar = (aaxg) obj;
                acme acmeVar = acoiVar2.ak;
                String strC = aaxgVar.c();
                if (acmeVar.b && (avgbVar = (avgb) acmeVar.a.get(strC)) != null) {
                    avgbVar.a++;
                }
                acqz acqzVar = acoiVar2.t;
                String strC2 = aaxgVar.c();
                int iA = aaxgVar.a();
                Optional optional = acqzVar.E;
                aaab aaabVar = new aaab(acqzVar, strC2, iA, i2);
                if (true == optional.isPresent()) {
                    Object obj2 = optional.get();
                    Object obj3 = aaabVar.c;
                    Object obj4 = aaabVar.b;
                    int i3 = aaabVar.a;
                    ?? r6 = ((aciz) obj2).a;
                    apfp apfpVarAa = aecm.aa(((acqk) r6).a);
                    if (apfpVarAa != null) {
                        if (!((String) obj4).equals(apfpVarAa.o)) {
                            return;
                        }
                    }
                    ((acqz) obj3).a.h(r6, i3);
                    return;
                }
                return;
            case 2:
                Pair pair = (Pair) obj;
                String str = acoi.g;
                acoh acohVar = (acoh) this.a;
                acoi acoiVar3 = acohVar.b;
                acrn acrnVar = acoiVar3.t.b;
                if (acrnVar != null) {
                    acrnVar.q.set(true);
                    acrnVar.e();
                }
                acip acipVar = (acip) pair.first;
                ((Long) pair.second).longValue();
                wjf wjfVarF = acipVar.f();
                if ((acoiVar3.t.N() && acoiVar3.ck.bc()) || !acoiVar3.ck.ad()) {
                    String strG = wjfVarF != null ? wjfVarF.G() : "";
                    if (acoiVar3.ac(strG)) {
                        acohVar.b(strG);
                        if (acoiVar3.ck.ag()) {
                            acoiVar3.aW.kk(Boolean.TRUE);
                        }
                    }
                }
                acra acraVar = (acra) acoiVar3.t.i().orElse(null);
                if (acraVar != null) {
                    alqc alqcVar = acraVar.h;
                    if (aecm.az(acraVar.f) && ((alqcVar == null || (alqcVar.b & 2) == 0) && (abvkVar = acoiVar3.F) != null && abvkVar.X())) {
                        acoiVar3.w.g(acoiVar3.bs, 33, "Ad video started playback without a valid overlay response.");
                    }
                }
                abnl abnlVarN = acipVar.n();
                if (abnlVarN != null) {
                    ajwo ajwoVar = abnlVarN.b;
                    if (acoiVar3.ck.l() && ajwoVar != null) {
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                        ajwoVar.c(aihlVarCheckIsLite);
                        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                            ajwoVar.c(aihlVarCheckIsLite2);
                            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                            apdo apdoVar = ((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).Z;
                            if (apdoVar == null) {
                                apdoVar = apdo.a;
                            }
                            if ((apdoVar.b & 2) != 0 && (i = apdoVar.d) > 0) {
                                ((acpv) acoiVar3.aI.io()).b(((long) i) * 1000);
                            }
                        }
                    }
                }
                if (acoiVar3.bN) {
                    synchronized (acoiVar3.aV) {
                        if (!acoiVar3.bH) {
                            acoiVar3.bH = true;
                            acoiVar3.ae();
                        }
                        break;
                    }
                    return;
                }
                return;
            case 3:
                acoi acoiVar4 = ((acoh) this.a).b;
                aayt aaytVar = (aayt) obj;
                synchronized (acoiVar4.aV) {
                    z = aaytVar.a.ordinal() >= abnv.b.ordinal();
                    acoiVar4.bF = z;
                    if (z) {
                        acoiVar4.cL = false;
                    }
                    acoiVar4.ad();
                    break;
                }
                return;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    acoi acoiVar5 = (acoi) this.a;
                    acoiVar5.t.s(acoiVar5.bu);
                    if (acoiVar5.ck.ah()) {
                        awli awliVar = acoiVar5.aX;
                        Boolean bool2 = Boolean.FALSE;
                        awliVar.kk(bool2);
                        acoiVar5.aW.kk(bool2);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((acoi) this.a).T(((Boolean) obj).booleanValue());
                return;
            case 6:
                acof acofVar = (acof) obj;
                boolean z2 = acofVar.c;
                acoi acoiVar6 = (acoi) this.a;
                acni acniVar = acoiVar6.n;
                tvz tvzVar = z2 ? tvz.d : tvz.a;
                acnh acnhVar = acniVar.a;
                if (acnhVar != null && !acniVar.d) {
                    acnhVar.m(tvzVar);
                }
                Optional optional2 = acofVar.a;
                if (optional2.isPresent()) {
                    ((acpp) optional2.get()).k();
                }
                Optional optional3 = acofVar.b;
                if (optional3.isPresent()) {
                }
                acor acorVar = acoiVar6.X;
                if (acorVar.n != z2) {
                    acorVar.n = z2;
                    acorVar.d(acorVar.m, true);
                    return;
                }
                return;
            case 7:
                ((acoh) this.a).b.ap();
                return;
            case 8:
                ((acoh) this.a).a((aazn) obj);
                return;
            case 9:
                ((acoh) this.a).b.Q(true);
                return;
            case 10:
                this.a.invoke(obj);
                return;
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                acor acorVar2 = (acor) this.a;
                acorVar2.setPadding(acorVar2.e, acorVar2.f + iIntValue, acorVar2.g, 0);
                return;
            case 12:
                acor acorVar3 = (acor) this.a;
                acorVar3.setPadding(acorVar3.h, acorVar3.i, acorVar3.j, Math.max(0, acorVar3.getHeight() - ((Integer) obj).intValue()));
                return;
            case 13:
                int iOrdinal = ((acvn) obj).ordinal();
                Object obj5 = this.a;
                if (iOrdinal == 1) {
                    ((acox) obj5).b = true;
                } else if (iOrdinal == 2) {
                    ((acox) obj5).b = false;
                }
                ((acox) obj5).d();
                return;
            case 14:
                boolean zAg = aecm.ag(aecm.Z(((aazq) obj).b.n()));
                acox acoxVar = (acox) this.a;
                acoxVar.c = zAg;
                acoxVar.d();
                return;
            case 15:
                int i4 = ((aazn) obj).a;
                Object obj6 = this.a;
                if (i4 == 2) {
                    acpe acpeVar = (acpe) obj6;
                    acpeVar.q = true;
                    if (acpeVar.r == 2 && acpeVar.p.isDone()) {
                        acpeVar.p = acpeVar.a();
                        return;
                    }
                    return;
                }
                acpe acpeVar2 = (acpe) obj6;
                acpeVar2.b();
                if (i4 == 7) {
                    boolean zO = acpeVar2.e.O();
                    if (acpeVar2.m && acpeVar2.s.aZ()) {
                        z = true;
                    }
                    if (zO || z) {
                        return;
                    }
                    acpeVar2.f(3);
                    return;
                }
                return;
            case 16:
                ((acpe) this.a).b();
                return;
            case 17:
                acip acipVar2 = (acip) obj;
                acph acphVar = (acph) this.a;
                if (!(acphVar.d.N() && acphVar.m.bc()) && acphVar.m.ad()) {
                    return;
                }
                wjf wjfVarF2 = acipVar2.f();
                if (acphVar.i(wjfVarF2 != null ? wjfVarF2.G() : "")) {
                    acphVar.l.f();
                    return;
                }
                return;
            case 18:
                if (((aboe) obj).g()) {
                    ((acph) this.a).l.f();
                    return;
                }
                return;
            case 19:
                aclv aclvVar = (aclv) obj;
                boolean zEquals = aclvVar.equals(aclv.ON_RESUME);
                Object obj7 = this.a;
                if (zEquals) {
                    ((acph) obj7).c();
                    return;
                } else {
                    if (aclvVar.equals(aclv.ON_PAUSE)) {
                        ((acph) obj7).h();
                        return;
                    }
                    return;
                }
            default:
                ((acph) this.a).l.b(((Integer) obj).intValue());
                return;
        }
    }
}
