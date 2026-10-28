package defpackage;

import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.reel.internal.pager.ReelLinearLayoutManager;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acpf implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acpf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [acnj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v22, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v24, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38, types: [awqg, java.lang.Object] */
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
        String str;
        Object obj2;
        apji apjiVar;
        akrn akrnVar;
        int i = 20;
        int i2 = 18;
        int i3 = 2;
        int i4 = 1;
        switch (this.$cid) {
            case 0:
                ((acph) this.a).l((acsu) obj);
                return;
            case 1:
                Object obj3 = this.a;
                Optional optional = ((acph) obj3).i;
                abyy abyyVar = new abyy(obj3, i2);
                if (true == optional.isPresent()) {
                    Object obj4 = optional.get();
                    acph acphVar = (acph) abyyVar.a;
                    acphVar.l.d();
                    acphVar.d((apfp) obj4);
                    return;
                }
                return;
            case 2:
                acpn acpnVar = (acpn) this.a;
                String str2 = acpnVar.e;
                if (ahno.aa(str2)) {
                    return;
                }
                acpm acpmVar = acpnVar.c;
                acpmVar.a.add(str2);
                acpmVar.b.kk(str2);
                acpnVar.a();
                return;
            case 3:
                Object obj5 = this.a;
                acpn acpnVar2 = (acpn) obj5;
                alqc alqcVar = (alqc) obj;
                ViewGroup viewGroup = acpnVar2.d.r.a;
                if (viewGroup == null || viewGroup.getVisibility() != 0) {
                    apji apjiVar2 = alqcVar.u;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVar = aoqn.a;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    apjiVar2.c(aihlVarCheckIsLite);
                    if (apjiVar2.j.n(aihlVarCheckIsLite.d)) {
                        apji apjiVar3 = alqcVar.u;
                        if (apjiVar3 == null) {
                            apjiVar3 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                        apjiVar3.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar3.j.k(aihlVarCheckIsLite2.d);
                        acpnVar2.f = (aoqm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                        ViewGroup viewGroup2 = acpnVar2.g;
                        if (viewGroup2 == null || (str = acpnVar2.e) == null) {
                            return;
                        }
                        aetd aetdVar = acpnVar2.b;
                        aoqm aoqmVar = acpnVar2.f;
                        aetdVar.g = aoqmVar;
                        aetdVar.h = viewGroup2;
                        aetn aetnVar = aetdVar.f;
                        aqpt aqptVar = aoqmVar.c;
                        if (aqptVar == null) {
                            aqptVar = aqpt.b;
                        }
                        aetnVar.b = str;
                        aetnVar.c = aetdVar;
                        if (aqptVar.c.size() > 0 && (obj2 = aetnVar.b) != null) {
                            Object obj6 = aetnVar.a;
                            aihx aihxVar = new aihx(aqptVar.c, aqpt.a);
                            aeth aethVar = (aeth) obj6;
                            aethVar.c = (String) obj2;
                            aethVar.d = aihxVar;
                            aethVar.f = aetnVar;
                            abvn abvnVar = aethVar.b;
                            aethVar.a.e(abvnVar.Q().ak(new acym(obj6, i2)), ((avlh) abvnVar.r().f).ak(new aawl(new acym(obj6, 19), "LPSTC", 0)));
                        }
                        String str3 = acpnVar2.e;
                        if (ahno.aa(str3) || !acpnVar2.c.b(str3)) {
                            acpnVar2.a.c(aetdVar.a.x(new yqz(i)).ak(new acpf(obj5, i3)));
                            return;
                        } else {
                            aetdVar.b();
                            acpnVar2.a();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                ((acpn) this.a).g();
                return;
            case 5:
                acvm acvmVar = (acvm) obj;
                acvmVar.getClass();
                int iE = a.E(acvmVar);
                ?? r12 = this.a;
                int i5 = 4;
                int i6 = 3;
                if (iE == 0) {
                    acra acraVar = ((acvh) acvmVar).c;
                    acrp acrpVar = acraVar.i;
                    if (acrpVar != null) {
                        acpn acpnVar3 = (acpn) r12;
                        acpnVar3.e = acraVar.c().o;
                        acpnVar3.g = (ViewGroup) ((ViewGroup) acrpVar.a).findViewById(R.id.reel_player_page_endscreen);
                        avmm avmmVar = acpnVar3.a;
                        avmmVar.c(acraVar.d().af(new acpf(r12, i6)));
                        if (acpnVar3.h.ac()) {
                            avmmVar.c(acpnVar3.d.b().B(new adhb(i4)).ag(new acpf(r12, i5), new abxq(i)));
                        }
                    }
                } else if (iE == 1) {
                    ((acpn) r12).b();
                } else if (iE == 2) {
                } else if (iE == 3) {
                } else {
                    if (iE != 4) {
                        throw new RuntimeException(null, null);
                    }
                }
                acpn acpnVar4 = (acpn) r12;
                if (acpnVar4.h.ac()) {
                    return;
                }
                acpnVar4.d.c(r12);
                return;
            case 6:
                alqc alqcVar2 = (alqc) obj;
                Object obj7 = this.a;
                if (alqcVar2 == null || (alqcVar2.b & 2) == 0) {
                    avju avjuVar = (avju) obj7;
                    if (avjuVar.b == 0) {
                        avjuVar.b = ((actw) avjuVar.a).d();
                    }
                }
                if (alqcVar2 == null || (alqcVar2.b & 2) == 0) {
                    return;
                }
                avju avjuVar2 = (avju) obj7;
                ((actw) avjuVar2.a).e(avjuVar2.b);
                avjuVar2.b = 0;
                return;
            case 7:
                this.a.invoke(obj);
                return;
            case 8:
                this.a.invoke(obj);
                return;
            case 9:
                this.a.invoke(obj);
                return;
            case 10:
                this.a.invoke(obj);
                return;
            case 11:
                this.a.invoke(obj);
                return;
            case 12:
                this.a.invoke(obj);
                return;
            case 13:
                this.a.invoke(obj);
                return;
            case 14:
                this.a.invoke(obj);
                return;
            case 15:
                int iOrdinal = ((acvn) obj).ordinal();
                Object obj8 = this.a;
                if (iOrdinal == 1) {
                    acqz acqzVar = (acqz) obj8;
                    acqzVar.am = true;
                    if (acqzVar.at.m()) {
                        acqzVar.J(true);
                    }
                } else if (iOrdinal == 2) {
                    acqz acqzVar2 = (acqz) obj8;
                    acqzVar2.am = false;
                    if (acqzVar2.at.m()) {
                        acqzVar2.J(false);
                    }
                }
                acqz acqzVar3 = (acqz) obj8;
                ReelLinearLayoutManager reelLinearLayoutManager = acqzVar3.z;
                if (reelLinearLayoutManager != null) {
                    reelLinearLayoutManager.c = acqzVar3.am;
                    return;
                }
                return;
            case 16:
                Optional optional2 = (Optional) obj;
                if (optional2.isPresent()) {
                    acqz acqzVar4 = (acqz) this.a;
                    if (acqzVar4.B != null) {
                        acpp acppVar = (acpp) optional2.get();
                        acqzVar4.B.k();
                        acppVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Boolean bool = (Boolean) obj;
                acqz acqzVar5 = (acqz) this.a;
                if (acqzVar5.B != null && bool.booleanValue() && acqzVar5.aj) {
                    acvq acvqVar = acqzVar5.B;
                    acvs acvsVar = acvs.b;
                    acvt acvtVarA = acvu.a();
                    acvtVarA.b = avlh.G(acvsVar);
                    acvqVar.i(acvtVarA.a());
                    return;
                }
                return;
            case 18:
                acrs acrsVar = (acrs) this.a;
                alqc alqcVar3 = (alqc) obj;
                if (acrsVar.z.az()) {
                    acvg acvgVar = acrsVar.y;
                    alqcVar3.getClass();
                    if ((alqcVar3.b & SemanticState.Multiline) != 0) {
                        apjiVar = alqcVar3.m;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                    } else {
                        apjiVar = null;
                    }
                    if (apjiVar != null) {
                        aihl aihlVar2 = akrs.a;
                        aihlVar2.getClass();
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                        apjiVar.c(aihlVarCheckIsLite3);
                        if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                            aihl aihlVar3 = akrs.a;
                            aihlVar3.getClass();
                            akrnVar = (akrn) aext.x(apjiVar, aihlVar3);
                        } else {
                            akrnVar = null;
                        }
                    } else {
                        akrnVar = null;
                    }
                    acvgVar.f = akrnVar;
                    akrn akrnVar2 = acvgVar.f;
                    if (akrnVar2 != null) {
                        acvx acvxVarIo = acvgVar.e;
                        if (acvxVarIo == null) {
                            acvxVarIo = acvgVar.b.io();
                            acvgVar.e = acvxVarIo;
                        }
                        Object objIo = acvgVar.c.io();
                        objIo.getClass();
                        mav mavVar = (mav) awrc.f((Optional) objIo);
                        if (mavVar != null) {
                            zaz zazVar = new zaz(mavVar, i2);
                            acvxVarIo.c = zazVar;
                            acvxVarIo.a.e(zazVar);
                        }
                        acvxVarIo.d(acvgVar.d, akrnVar2, null, false);
                    }
                }
                acrsVar.s.h(alqcVar3);
                return;
            case 19:
                this.a.invoke(obj);
                return;
            default:
                this.a.invoke(obj);
                return;
        }
    }
}
