package defpackage;

import android.text.Spanned;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wnq {
    public final airb a;
    public wnx b;
    public apzh c;
    public alkk d;
    public aqch e;
    public ajmf f;
    public abuz g;
    private abuz h;

    public wnq(airb airbVar) {
        this.a = airbVar;
        if (airbVar == null || (airbVar.b & SemanticState.Modal) == 0) {
            return;
        }
        ajwo ajwoVar = airbVar.k;
        ajwoVar = ajwoVar == null ? ajwo.a : ajwoVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(appe.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            ajwo ajwoVar2 = airbVar.k;
            ajwoVar2 = ajwoVar2 == null ? ajwo.a : ajwoVar2;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(appe.b);
            ajwoVar2.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
            this.b = new wnx((appe) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
        } else {
            ajwo ajwoVar3 = airbVar.k;
            ajwoVar3 = ajwoVar3 == null ? ajwo.a : ajwoVar3;
            aihl aihlVar = appf.b;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            ajwoVar3.c(aihlVarCheckIsLite3);
            if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                ajwo ajwoVar4 = airbVar.k;
                ajwoVar4 = ajwoVar4 == null ? ajwo.a : ajwoVar4;
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                ajwoVar4.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar4.j.k(aihlVarCheckIsLite4.d);
                this.b = new wnx();
            } else {
                ajwo ajwoVar5 = airbVar.k;
                ajwoVar5 = ajwoVar5 == null ? ajwo.a : ajwoVar5;
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apzi.a);
                ajwoVar5.c(aihlVarCheckIsLite5);
                if (ajwoVar5.j.n(aihlVarCheckIsLite5.d)) {
                    ajwo ajwoVar6 = airbVar.k;
                    ajwoVar6 = ajwoVar6 == null ? ajwo.a : ajwoVar6;
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apzi.a);
                    ajwoVar6.c(aihlVarCheckIsLite6);
                    Object objK3 = ajwoVar6.j.k(aihlVarCheckIsLite6.d);
                    this.c = (apzh) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                    ajue ajueVar = this.c.g;
                    this.b = new wnx(ajueVar == null ? ajue.b : ajueVar);
                } else {
                    ajwo ajwoVar7 = airbVar.k;
                    ajwoVar7 = ajwoVar7 == null ? ajwo.a : ajwoVar7;
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(alkk.b);
                    ajwoVar7.c(aihlVarCheckIsLite7);
                    if (ajwoVar7.j.n(aihlVarCheckIsLite7.d)) {
                        ajwo ajwoVar8 = airbVar.k;
                        ajwoVar8 = ajwoVar8 == null ? ajwo.a : ajwoVar8;
                        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(alkk.b);
                        ajwoVar8.c(aihlVarCheckIsLite8);
                        Object objK4 = ajwoVar8.j.k(aihlVarCheckIsLite8.d);
                        alkk alkkVar = (alkk) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4));
                        this.d = alkkVar;
                        ajwo ajwoVar9 = alkkVar.d;
                        ajwoVar9 = ajwoVar9 == null ? ajwo.a : ajwoVar9;
                        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(apzi.a);
                        ajwoVar9.c(aihlVarCheckIsLite9);
                        if (ajwoVar9.j.n(aihlVarCheckIsLite9.d)) {
                            ajwo ajwoVar10 = this.d.d;
                            ajwoVar10 = ajwoVar10 == null ? ajwo.a : ajwoVar10;
                            aihl aihlVarCheckIsLite10 = aihn.checkIsLite(apzi.a);
                            ajwoVar10.c(aihlVarCheckIsLite10);
                            Object objK5 = ajwoVar10.j.k(aihlVarCheckIsLite10.d);
                            ajue ajueVar2 = ((apzh) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5))).g;
                            this.b = new wnx(ajueVar2 == null ? ajue.b : ajueVar2);
                        }
                    } else {
                        ajwo ajwoVar11 = airbVar.k;
                        ajwoVar11 = ajwoVar11 == null ? ajwo.a : ajwoVar11;
                        aihl aihlVarCheckIsLite11 = aihn.checkIsLite(aqch.b);
                        ajwoVar11.c(aihlVarCheckIsLite11);
                        if (ajwoVar11.j.n(aihlVarCheckIsLite11.d)) {
                            ajwo ajwoVar12 = airbVar.k;
                            ajwoVar12 = ajwoVar12 == null ? ajwo.a : ajwoVar12;
                            aihl aihlVarCheckIsLite12 = aihn.checkIsLite(aqch.b);
                            ajwoVar12.c(aihlVarCheckIsLite12);
                            Object objK6 = ajwoVar12.j.k(aihlVarCheckIsLite12.d);
                            aqch aqchVar = (aqch) (objK6 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK6));
                            this.e = aqchVar;
                            ajwo ajwoVar13 = aqchVar.g;
                            ajwoVar13 = ajwoVar13 == null ? ajwo.a : ajwoVar13;
                            aihl aihlVarCheckIsLite13 = aihn.checkIsLite(appe.b);
                            ajwoVar13.c(aihlVarCheckIsLite13);
                            if (ajwoVar13.j.n(aihlVarCheckIsLite13.d)) {
                                ajwo ajwoVar14 = this.e.g;
                                ajwoVar14 = ajwoVar14 == null ? ajwo.a : ajwoVar14;
                                aihl aihlVarCheckIsLite14 = aihn.checkIsLite(appe.b);
                                ajwoVar14.c(aihlVarCheckIsLite14);
                                Object objK7 = ajwoVar14.j.k(aihlVarCheckIsLite14.d);
                                this.b = new wnx((appe) (objK7 == null ? aihlVarCheckIsLite14.b : aihlVarCheckIsLite14.c(objK7)));
                            }
                            ajwo ajwoVar15 = this.e.g;
                            ajwoVar15 = ajwoVar15 == null ? ajwo.a : ajwoVar15;
                            aihl aihlVarCheckIsLite15 = aihn.checkIsLite(apzi.a);
                            ajwoVar15.c(aihlVarCheckIsLite15);
                            if (ajwoVar15.j.n(aihlVarCheckIsLite15.d)) {
                                ajwo ajwoVar16 = this.e.g;
                                ajwoVar16 = ajwoVar16 == null ? ajwo.a : ajwoVar16;
                                aihl aihlVarCheckIsLite16 = aihn.checkIsLite(apzi.a);
                                ajwoVar16.c(aihlVarCheckIsLite16);
                                Object objK8 = ajwoVar16.j.k(aihlVarCheckIsLite16.d);
                                ajue ajueVar3 = ((apzh) (objK8 == null ? aihlVarCheckIsLite16.b : aihlVarCheckIsLite16.c(objK8))).g;
                                this.b = new wnx(ajueVar3 == null ? ajue.b : ajueVar3);
                            }
                        } else {
                            ajwo ajwoVar17 = airbVar.k;
                            ajwoVar17 = ajwoVar17 == null ? ajwo.a : ajwoVar17;
                            aihl aihlVarCheckIsLite17 = aihn.checkIsLite(ajmj.a);
                            ajwoVar17.c(aihlVarCheckIsLite17);
                            if (ajwoVar17.j.n(aihlVarCheckIsLite17.d)) {
                                ajwo ajwoVar18 = airbVar.k;
                                ajwoVar18 = ajwoVar18 == null ? ajwo.a : ajwoVar18;
                                aihl aihlVarCheckIsLite18 = aihn.checkIsLite(ajmj.a);
                                ajwoVar18.c(aihlVarCheckIsLite18);
                                Object objK9 = ajwoVar18.j.k(aihlVarCheckIsLite18.d);
                                if (((ajmf) (objK9 == null ? aihlVarCheckIsLite18.b : aihlVarCheckIsLite18.c(objK9))).c.equals("FLyouth_child_onboarding_flow")) {
                                    ajwo ajwoVar19 = airbVar.k;
                                    ajwoVar19 = ajwoVar19 == null ? ajwo.a : ajwoVar19;
                                    aihl aihlVarCheckIsLite19 = aihn.checkIsLite(ajmj.a);
                                    ajwoVar19.c(aihlVarCheckIsLite19);
                                    Object objK10 = ajwoVar19.j.k(aihlVarCheckIsLite19.d);
                                    this.f = (ajmf) (objK10 == null ? aihlVarCheckIsLite19.b : aihlVarCheckIsLite19.c(objK10));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.b != null || (airbVar.b & 524288) == 0) {
            return;
        }
        ajue ajueVar4 = airbVar.m;
        this.b = new wnx(ajueVar4 == null ? ajue.b : ajueVar4);
    }

    public final Spanned a() {
        alay alayVar;
        airb airbVar = this.a;
        if ((airbVar.b & 4) != 0) {
            alayVar = airbVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public final Spanned b() {
        alay alayVar;
        airb airbVar = this.a;
        if ((airbVar.b & 32) != 0) {
            alayVar = airbVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public final Spanned c() {
        alay alayVar;
        airb airbVar = this.a;
        if ((airbVar.b & 16) != 0) {
            alayVar = airbVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public final ajwo d() {
        ajwo ajwoVar = this.a.k;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    public final aliz e() {
        airb airbVar = this.a;
        if ((airbVar.b & 16384) == 0) {
            return null;
        }
        aliz alizVarA = aliz.a(airbVar.l);
        return alizVarA == null ? aliz.UNKNOWN : alizVarA;
    }

    public final apji f() {
        airb airbVar = this.a;
        if ((airbVar.b & SemanticState.Hidden) == 0) {
            return null;
        }
        apji apjiVar = airbVar.h;
        return apjiVar == null ? apji.a : apjiVar;
    }

    public final String g() {
        wnx wnxVar = this.b;
        if (wnxVar.a == null) {
            wnxVar.b();
        }
        return wnxVar.a;
    }

    public final String h() {
        wnx wnxVar = this.b;
        if (wnxVar.c == null) {
            wnxVar.b();
        }
        return wnxVar.c;
    }

    public final String i() {
        return this.b.a();
    }

    public final String j() {
        wnx wnxVar = this.b;
        if (wnxVar.b == null) {
            wnxVar.b();
        }
        return wnxVar.b;
    }

    public final boolean k() {
        return this.b != null;
    }

    public final boolean l() {
        airb airbVar = this.a;
        return (airbVar.b & SemanticState.ReadOnly) != 0 && airbVar.j;
    }

    public final boolean m() {
        wnx wnxVar = this.b;
        if (wnxVar.g == null) {
            wnxVar.b();
        }
        Boolean bool = wnxVar.g;
        if (bool == null) {
            return false;
        }
        bool.booleanValue();
        return true;
    }

    public final boolean n() {
        return this.a.i;
    }

    public final boolean o() {
        wnx wnxVar = this.b;
        if (wnxVar.f == null) {
            wnxVar.b();
        }
        Boolean bool = wnxVar.f;
        if (bool == null) {
            return false;
        }
        bool.booleanValue();
        return true;
    }

    public final int p() {
        airb airbVar = this.a;
        if ((airbVar.b & 134217728) == 0) {
            return 0;
        }
        int iBe = a.be(airbVar.o);
        if (iBe == 0) {
            return 1;
        }
        return iBe;
    }

    public final abuz q() {
        abuz abuzVar = this.h;
        if (abuzVar != null) {
            return abuzVar;
        }
        aqmh aqmhVar = this.a.g;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        abuz abuzVar2 = new abuz(aqmhVar);
        this.h = abuzVar2;
        return abuzVar2;
    }
}
