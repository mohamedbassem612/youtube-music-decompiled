package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwr extends gut {
    private final icj a;

    public gwr(icj icjVar) {
        this.a = icjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        int I;
        int I2;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcg.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apcg.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apcf apcfVar = (apcf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        agrx agrxVar = agso.a;
        int i = apcfVar.g;
        int i2 = apcfVar.c;
        if (i2 == 2) {
            ajwo ajwoVar2 = (ajwo) apcfVar.d;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
            ajwoVar2.c(aihlVarCheckIsLite3);
            if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
                ajwo ajwoVar3 = apcfVar.c == 2 ? (ajwo) apcfVar.d : ajwo.a;
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
                ajwoVar3.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite4.d);
                arij arijVar = (arij) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                String str = arijVar.d;
                String str2 = arijVar.e;
            }
        } else if (i2 == 3) {
            apji apjiVar = (apji) apcfVar.d;
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aouq.a);
            apjiVar.c(aihlVarCheckIsLite5);
            if (apjiVar.j.n(aihlVarCheckIsLite5.d)) {
                apji apjiVar2 = apcfVar.c == 3 ? (apji) apcfVar.d : apji.a;
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aouq.a);
                apjiVar2.c(aihlVarCheckIsLite6);
                Object objK3 = apjiVar2.j.k(aihlVarCheckIsLite6.d);
                ((aouj) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).g.size();
            }
        }
        int i3 = apcfVar.c;
        boolean z = false;
        if (i3 == 2) {
            int iAS = a.aS(apcfVar.e);
            if (iAS == 0) {
                iAS = 1;
            }
            int i4 = iAS - 1;
            if (i4 != 1) {
                if (i4 == 2) {
                    if ((apcfVar.b & 4) == 0 || (I2 = atqp.I(apcfVar.g)) == 0 || I2 == 1) {
                        this.a.v((ajwo) apcfVar.d, false);
                    } else {
                        icj icjVar = this.a;
                        ajwo ajwoVar4 = (ajwo) apcfVar.d;
                        int I3 = atqp.I(apcfVar.g);
                        if (I3 != 0 && I3 == 2) {
                            z = true;
                        }
                        icjVar.v(ajwoVar4, z);
                    }
                }
            } else if ((apcfVar.b & 4) == 0 || (I = atqp.I(apcfVar.g)) == 0 || I == 1) {
                this.a.I((ajwo) apcfVar.d, true != apcfVar.f ? 1 : 2);
            } else {
                icj icjVar2 = this.a;
                ajwo ajwoVar5 = (ajwo) apcfVar.d;
                int I4 = atqp.I(apcfVar.g);
                icjVar2.I(ajwoVar5, I4 != 0 ? I4 : 1);
            }
            xgn xgnVar = (xgn) tym.U(map, "com.google.android.libraries.youtube.logging.interaction_logger", xgn.class);
            if (xgnVar != null) {
                xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajwoVar.c, (amud) null), null);
                return;
            }
            return;
        }
        if (i3 == 3) {
            apji apjiVar3 = (apji) apcfVar.d;
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aouq.a);
            apjiVar3.c(aihlVarCheckIsLite7);
            if (apjiVar3.j.n(aihlVarCheckIsLite7.d)) {
                int iAS2 = a.aS(apcfVar.e);
                if (iAS2 == 0) {
                    iAS2 = 1;
                }
                int i5 = iAS2 - 1;
                icj icjVar3 = this.a;
                if (i5 == 2) {
                    apji apjiVar4 = apcfVar.c == 3 ? (apji) apcfVar.d : apji.a;
                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aouq.a);
                    apjiVar4.c(aihlVarCheckIsLite8);
                    Object objK4 = apjiVar4.j.k(aihlVarCheckIsLite8.d);
                    aouj aoujVar = (aouj) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
                    int I5 = atqp.I(apcfVar.g);
                    if (I5 == 0) {
                        I5 = 1;
                    }
                    if (aoujVar.g.size() != 0) {
                        icjVar3.n = true;
                        aae aaeVarJ = icjVar3.J(aoujVar);
                        icjVar3.hi(1, 0, icjVar3.hc(1));
                        icjVar3.p = I5 == 2;
                        icjVar3.r(1, 0, aaeVarJ.c);
                        icjVar3.A(aoujVar, acjw.h);
                        return;
                    }
                    return;
                }
                apji apjiVar5 = apcfVar.c == 3 ? (apji) apcfVar.d : apji.a;
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aouq.a);
                apjiVar5.c(aihlVarCheckIsLite9);
                Object objK5 = apjiVar5.j.k(aihlVarCheckIsLite9.d);
                aouj aoujVar2 = (aouj) (objK5 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK5));
                int I6 = atqp.I(apcfVar.g);
                if (I6 == 0) {
                    I6 = 1;
                }
                if (I6 == 3) {
                    icjVar3.q.kk(new idf(ide.b));
                }
                icjVar3.c.d(aoujVar2.o.G());
                if (I6 == 3) {
                    icjVar3.K(aoujVar2, icjVar3.J(aoujVar2), null);
                    icjVar3.q.kk(new idf(ide.c));
                } else {
                    icjVar3.p = I6 == 2;
                    icjVar3.L(aoujVar2, icjVar3.J(aoujVar2));
                }
            }
        }
    }
}
