package defpackage;

import com.google.protobuf.MessageLite;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qas implements per {
    private static final agsn a = agsn.h("GnpSdk");
    private final pve b;
    private final ppe c;
    private final mbc d;
    private final pgi e;
    private final pav f;
    private final omm g;

    public qas(pve pveVar, ppe ppeVar, mbc mbcVar, pgi pgiVar, omm ommVar, pav pavVar) {
        pveVar.getClass();
        ppeVar.getClass();
        mbcVar.getClass();
        pgiVar.getClass();
        ommVar.getClass();
        pavVar.getClass();
        this.b = pveVar;
        this.c = ppeVar;
        this.d = mbcVar;
        this.e = pgiVar;
        this.g = ommVar;
        this.f = pavVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x016f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x018c  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.per
    public final Object a(plx plxVar, MessageLite messageLite, MessageLite messageLite2, awoq awoqVar) throws Throwable {
        qar qarVar;
        aibg aibgVar;
        aibh aibhVar;
        plx plxVar2;
        plw plwVar;
        aibg aibgVar2;
        aiby aibyVar;
        plx plxVarA;
        Object objE;
        aibg aibgVar3;
        aibh aibhVar2;
        pky pkyVar;
        pky pkyVar2;
        omm ommVar;
        String str;
        plx plxVar3;
        aier aierVarA;
        pgi pgiVar;
        aidy aidyVar;
        if (awoqVar instanceof qar) {
            qarVar = (qar) awoqVar;
            int i = qarVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qarVar.e = i - Integer.MIN_VALUE;
            } else {
                qarVar = new qar(this, awoqVar);
            }
        } else {
            qarVar = new qar(this, awoqVar);
        }
        Object obj = qarVar.c;
        awox awoxVar = awox.a;
        int i2 = qarVar.e;
        if (i2 == 0) {
            atqp.j(obj);
            messageLite.getClass();
            aibgVar = (aibg) messageLite;
            messageLite2.getClass();
            aibhVar = (aibh) messageLite2;
            if (plxVar != null) {
                plw plwVar2 = new plw(plxVar);
                aihf builder = aibgVar.toBuilder();
                builder.copyOnWrite();
                aibg aibgVar4 = (aibg) builder.instance;
                aibgVar4.i = null;
                aibgVar4.b &= -33;
                builder.copyOnWrite();
                aibg aibgVar5 = (aibg) builder.instance;
                aibgVar5.b &= -2;
                aibgVar5.c = 0;
                builder.copyOnWrite();
                aibg aibgVar6 = (aibg) builder.instance;
                aibgVar6.b &= -65;
                aibgVar6.j = aibg.a.j;
                if ((aibgVar.b & 4) != 0) {
                    aiby aibyVar2 = aibgVar.e;
                    if (aibyVar2 == null) {
                        aibyVar2 = aiby.a;
                    }
                    aihf builder2 = aibyVar2.toBuilder();
                    builder2.copyOnWrite();
                    aiby aibyVar3 = (aiby) builder2.instance;
                    aibyVar3.b &= -5;
                    aibyVar3.e = aiby.a.e;
                    builder.copyOnWrite();
                    aibg aibgVar7 = (aibg) builder.instance;
                    aiby aibyVar4 = (aiby) builder2.build();
                    aibyVar4.getClass();
                    aibgVar7.e = aibyVar4;
                    aibgVar7.b |= 4;
                }
                plwVar2.g(((aibg) builder.build()).hashCode());
                plwVar2.i(1);
                plwVar2.h(this.d.f().toEpochMilli());
                long j = aibhVar.e;
                if (j != 0 && plxVar.l == 0 && plxVar.m == 0) {
                    plwVar2.d(j);
                }
                if ((aibhVar.b & 4) != 0) {
                    plwVar2.a = aibhVar.d;
                } else {
                    String str2 = plxVar.c;
                    if (str2 == null || str2.length() == 0) {
                        ppe ppeVar = this.c;
                        String str3 = plxVar.b;
                        str3.getClass();
                        qarVar.g = plxVar;
                        qarVar.f = aibgVar;
                        qarVar.a = aibhVar;
                        qarVar.b = plwVar2;
                        qarVar.e = 1;
                        Object objA = ppeVar.a(str3, qarVar);
                        if (objA == awoxVar) {
                            return awoxVar;
                        }
                        plxVar2 = plxVar;
                        plwVar = plwVar2;
                        aibgVar2 = aibgVar;
                        obj = objA;
                        pkyVar = (pky) obj;
                        if (pkyVar instanceof pla) {
                            plwVar.a = (String) ((pla) pkyVar).a;
                        } else {
                            ((agsj) ((agsj) a.b()).j(pkyVar.f())).t("Failed to get the obfuscated account ID");
                        }
                        aibgVar = aibgVar2;
                    }
                    aibyVar = aibhVar.c;
                    if (aibyVar == null) {
                        aibyVar = aiby.a;
                    }
                    plwVar.f = aibyVar.e;
                    plxVarA = plwVar.a();
                    pve pveVar = this.b;
                    List listH = atqq.H(plxVarA);
                    qarVar.g = plxVar2;
                    qarVar.f = aibgVar;
                    qarVar.a = aibhVar;
                    qarVar.b = plxVarA;
                    qarVar.e = 2;
                    objE = pveVar.e(listH, qarVar);
                    if (objE == awoxVar) {
                        return awoxVar;
                    }
                    aibh aibhVar3 = aibhVar;
                    aibgVar3 = aibgVar;
                    obj = objE;
                    aibhVar2 = aibhVar3;
                    pkyVar2 = (pky) obj;
                    if (pkyVar2 instanceof pku) {
                        ((agsj) ((agsj) a.c()).j(((pku) pkyVar2).b())).t("Failed updating accounts in storage");
                    }
                    ommVar = this.g;
                    str = aibhVar2.f;
                    str.getClass();
                    qarVar.g = plxVar2;
                    qarVar.f = aibgVar3;
                    qarVar.a = plxVarA;
                    qarVar.b = null;
                    qarVar.e = 3;
                    if (ommVar.n(str, qarVar) != awoxVar) {
                        return awoxVar;
                    }
                    plxVar3 = plxVar2;
                    paw pawVarB = this.f.b(ahzv.TARGET_REGISTERED);
                    pawVarB.f(plxVar3);
                    pawVarB.a();
                    aierVarA = aier.a(aibgVar3.c);
                    if (aierVarA == null) {
                        aierVarA = aier.REGISTRATION_REASON_UNSPECIFIED;
                    }
                    if (aierVarA == aier.LOCALE_CHANGED) {
                        pgiVar = this.e;
                        plxVarA.getClass();
                        aidyVar = aidy.LOCALE_CHANGED;
                        qarVar.g = null;
                        qarVar.f = null;
                        qarVar.a = null;
                        qarVar.e = 4;
                        if (pgiVar.b(plxVarA, aidyVar, qarVar) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                plxVar2 = plxVar;
                plwVar = plwVar2;
                aibyVar = aibhVar.c;
                if (aibyVar == null) {
                    aibyVar = aiby.a;
                }
                plwVar.f = aibyVar.e;
                plxVarA = plwVar.a();
                pve pveVar2 = this.b;
                List listH2 = atqq.H(plxVarA);
                qarVar.g = plxVar2;
                qarVar.f = aibgVar;
                qarVar.a = aibhVar;
                qarVar.b = plxVarA;
                qarVar.e = 2;
                objE = pveVar2.e(listH2, qarVar);
                if (objE == awoxVar) {
                    return awoxVar;
                }
                aibh aibhVar4 = aibhVar;
                aibgVar3 = aibgVar;
                obj = objE;
                aibhVar2 = aibhVar4;
                pkyVar2 = (pky) obj;
                if (pkyVar2 instanceof pku) {
                    ((agsj) ((agsj) a.c()).j(((pku) pkyVar2).b())).t("Failed updating accounts in storage");
                }
                ommVar = this.g;
                str = aibhVar2.f;
                str.getClass();
                qarVar.g = plxVar2;
                qarVar.f = aibgVar3;
                qarVar.a = plxVarA;
                qarVar.b = null;
                qarVar.e = 3;
                if (ommVar.n(str, qarVar) != awoxVar) {
                    return awoxVar;
                }
                plxVar3 = plxVar2;
                paw pawVarB2 = this.f.b(ahzv.TARGET_REGISTERED);
                pawVarB2.f(plxVar3);
                pawVarB2.a();
                aierVarA = aier.a(aibgVar3.c);
                if (aierVarA == null) {
                    aierVarA = aier.REGISTRATION_REASON_UNSPECIFIED;
                }
                if (aierVarA == aier.LOCALE_CHANGED) {
                    pgiVar = this.e;
                    plxVarA.getClass();
                    aidyVar = aidy.LOCALE_CHANGED;
                    qarVar.g = null;
                    qarVar.f = null;
                    qarVar.a = null;
                    qarVar.e = 4;
                    if (pgiVar.b(plxVarA, aidyVar, qarVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
        } else if (i2 == 1) {
            plwVar = (plw) qarVar.b;
            aibhVar = (aibh) qarVar.a;
            aibgVar2 = qarVar.f;
            plxVar2 = qarVar.g;
            atqp.j(obj);
            pkyVar = (pky) obj;
            if (pkyVar instanceof pla) {
                plwVar.a = (String) ((pla) pkyVar).a;
            } else {
                ((agsj) ((agsj) a.b()).j(pkyVar.f())).t("Failed to get the obfuscated account ID");
            }
            aibgVar = aibgVar2;
            aibyVar = aibhVar.c;
            if (aibyVar == null) {
                aibyVar = aiby.a;
            }
            plwVar.f = aibyVar.e;
            plxVarA = plwVar.a();
            pve pveVar3 = this.b;
            List listH3 = atqq.H(plxVarA);
            qarVar.g = plxVar2;
            qarVar.f = aibgVar;
            qarVar.a = aibhVar;
            qarVar.b = plxVarA;
            qarVar.e = 2;
            objE = pveVar3.e(listH3, qarVar);
            if (objE == awoxVar) {
                return awoxVar;
            }
            aibh aibhVar5 = aibhVar;
            aibgVar3 = aibgVar;
            obj = objE;
            aibhVar2 = aibhVar5;
            pkyVar2 = (pky) obj;
            if (pkyVar2 instanceof pku) {
                ((agsj) ((agsj) a.c()).j(((pku) pkyVar2).b())).t("Failed updating accounts in storage");
            }
            ommVar = this.g;
            str = aibhVar2.f;
            str.getClass();
            qarVar.g = plxVar2;
            qarVar.f = aibgVar3;
            qarVar.a = plxVarA;
            qarVar.b = null;
            qarVar.e = 3;
            if (ommVar.n(str, qarVar) != awoxVar) {
                return awoxVar;
            }
            plxVar3 = plxVar2;
            paw pawVarB3 = this.f.b(ahzv.TARGET_REGISTERED);
            pawVarB3.f(plxVar3);
            pawVarB3.a();
            aierVarA = aier.a(aibgVar3.c);
            if (aierVarA == null) {
                aierVarA = aier.REGISTRATION_REASON_UNSPECIFIED;
            }
            if (aierVarA == aier.LOCALE_CHANGED) {
                pgiVar = this.e;
                plxVarA.getClass();
                aidyVar = aidy.LOCALE_CHANGED;
                qarVar.g = null;
                qarVar.f = null;
                qarVar.a = null;
                qarVar.e = 4;
                if (pgiVar.b(plxVarA, aidyVar, qarVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else if (i2 == 2) {
            plxVarA = (plx) qarVar.b;
            aibh aibhVar6 = (aibh) qarVar.a;
            aibg aibgVar8 = qarVar.f;
            plx plxVar4 = qarVar.g;
            atqp.j(obj);
            aibhVar2 = aibhVar6;
            aibgVar3 = aibgVar8;
            plxVar2 = plxVar4;
            pkyVar2 = (pky) obj;
            if (pkyVar2 instanceof pku) {
                ((agsj) ((agsj) a.c()).j(((pku) pkyVar2).b())).t("Failed updating accounts in storage");
            }
            ommVar = this.g;
            str = aibhVar2.f;
            str.getClass();
            qarVar.g = plxVar2;
            qarVar.f = aibgVar3;
            qarVar.a = plxVarA;
            qarVar.b = null;
            qarVar.e = 3;
            if (ommVar.n(str, qarVar) != awoxVar) {
                return awoxVar;
            }
            plxVar3 = plxVar2;
            paw pawVarB4 = this.f.b(ahzv.TARGET_REGISTERED);
            pawVarB4.f(plxVar3);
            pawVarB4.a();
            aierVarA = aier.a(aibgVar3.c);
            if (aierVarA == null) {
                aierVarA = aier.REGISTRATION_REASON_UNSPECIFIED;
            }
            if (aierVarA == aier.LOCALE_CHANGED) {
                pgiVar = this.e;
                plxVarA.getClass();
                aidyVar = aidy.LOCALE_CHANGED;
                qarVar.g = null;
                qarVar.f = null;
                qarVar.a = null;
                qarVar.e = 4;
                if (pgiVar.b(plxVarA, aidyVar, qarVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else if (i2 == 3) {
            plxVarA = (plx) qarVar.a;
            aibgVar3 = qarVar.f;
            plxVar3 = qarVar.g;
            atqp.j(obj);
            paw pawVarB5 = this.f.b(ahzv.TARGET_REGISTERED);
            pawVarB5.f(plxVar3);
            pawVarB5.a();
            aierVarA = aier.a(aibgVar3.c);
            if (aierVarA == null) {
                aierVarA = aier.REGISTRATION_REASON_UNSPECIFIED;
            }
            if (aierVarA == aier.LOCALE_CHANGED) {
                pgiVar = this.e;
                plxVarA.getClass();
                aidyVar = aidy.LOCALE_CHANGED;
                qarVar.g = null;
                qarVar.f = null;
                qarVar.a = null;
                qarVar.e = 4;
                if (pgiVar.b(plxVarA, aidyVar, qarVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.per
    public final Object b(plx plxVar, MessageLite messageLite, awoq awoqVar) throws Throwable {
        qaq qaqVar;
        if (awoqVar instanceof qaq) {
            qaqVar = (qaq) awoqVar;
            int i = qaqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qaqVar.c = i - Integer.MIN_VALUE;
            } else {
                qaqVar = new qaq(this, awoqVar);
            }
        } else {
            qaqVar = new qaq(this, awoqVar);
        }
        Object objE = qaqVar.a;
        awox awoxVar = awox.a;
        int i2 = qaqVar.c;
        if (i2 == 0) {
            atqp.j(objE);
            if (plxVar != null) {
                nxp.a(plxVar.b);
                plw plwVar = new plw(plxVar);
                plwVar.i(3);
                plx plxVarA = plwVar.a();
                pve pveVar = this.b;
                List listH = atqq.H(plxVarA);
                qaqVar.c = 1;
                objE = pveVar.e(listH, qaqVar);
                if (objE == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(objE);
        pky pkyVar = (pky) objE;
        if (pkyVar instanceof pku) {
            ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed updating accounts in storage");
        }
        return awmy.a;
    }
}
