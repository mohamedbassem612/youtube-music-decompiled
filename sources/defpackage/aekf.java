package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class aekf {
    public final Context d;
    public final vxe e;
    public final xgn f;

    public aekf(Context context, vxe vxeVar, xgn xgnVar, ijt ijtVar, aciz acizVar, zwb zwbVar, ackf ackfVar, aduv aduvVar) {
        context.getClass();
        this.d = context;
        vxeVar.getClass();
        this.e = vxeVar;
        xgnVar.getClass();
        this.f = xgnVar;
        ijtVar.getClass();
        acizVar.getClass();
        zwbVar.getClass();
        ackfVar.getClass();
        aduvVar.getClass();
    }

    public static List c(apre apreVar) {
        return aguu.u(aguu.r(aguu.I(apreVar.f, new wix(18))), new aeni(1));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    public static int d(Object obj) {
        apqd apqdVar;
        apre apreVar;
        apra apraVar;
        apqz apqzVar;
        ajwo ajwoVar;
        aihl aihlVarCheckIsLite;
        Object objK;
        Object objC;
        aprd aprdVar;
        ajwo ajwoVar2;
        aihl aihlVarCheckIsLite2;
        ajwo ajwoVar3;
        aihl aihlVarCheckIsLite3;
        Object objK2;
        Object objC2;
        if (obj instanceof apqs) {
            apqs apqsVar = (apqs) obj;
            ajwo ajwoVar4 = apqsVar.h;
            if (ajwoVar4 == null) {
                ajwoVar4 = ajwo.a;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apqd.b);
            ajwoVar4.c(aihlVarCheckIsLite4);
            if (ajwoVar4.j.n(aihlVarCheckIsLite4.d)) {
                ajwo ajwoVar5 = apqsVar.h;
                if (ajwoVar5 == null) {
                    ajwoVar5 = ajwo.a;
                }
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apqd.b);
                ajwoVar5.c(aihlVarCheckIsLite5);
                Object objK3 = ajwoVar5.j.k(aihlVarCheckIsLite5.d);
                apqdVar = (apqd) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
            } else if (!(obj instanceof aprd)) {
                aprdVar = (aprd) obj;
                ajwoVar2 = aprdVar.g;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                aihlVarCheckIsLite2 = aihn.checkIsLite(apqd.b);
                ajwoVar2.c(aihlVarCheckIsLite2);
                if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                    ajwoVar3 = aprdVar.g;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    aihlVarCheckIsLite3 = aihn.checkIsLite(apqd.b);
                    ajwoVar3.c(aihlVarCheckIsLite3);
                    objK2 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
                    if (objK2 == null) {
                        objC2 = aihlVarCheckIsLite3.b;
                    } else {
                        objC2 = aihlVarCheckIsLite3.c(objK2);
                    }
                    apqdVar = (apqd) objC2;
                } else if (obj instanceof apre) {
                    apreVar = (apre) obj;
                    if (apreVar.f.size() > 0) {
                        apraVar = (apra) apreVar.f.get(0);
                        if (apraVar.b == 64166933) {
                            apqzVar = (apqz) apraVar.c;
                        } else {
                            apqzVar = apqz.a;
                        }
                        ajwoVar = apqzVar.f;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        aihlVarCheckIsLite = aihn.checkIsLite(apqd.b);
                        ajwoVar.c(aihlVarCheckIsLite);
                        objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite.b;
                        } else {
                            objC = aihlVarCheckIsLite.c(objK);
                        }
                        apqdVar = (apqd) objC;
                    } else {
                        apqdVar = null;
                    }
                } else {
                    apqdVar = null;
                }
            } else if (obj instanceof apre) {
                apreVar = (apre) obj;
                if (apreVar.f.size() > 0) {
                    apraVar = (apra) apreVar.f.get(0);
                    if (apraVar.b == 64166933) {
                        apqzVar = (apqz) apraVar.c;
                    } else {
                        apqzVar = apqz.a;
                    }
                    ajwoVar = apqzVar.f;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    aihlVarCheckIsLite = aihn.checkIsLite(apqd.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite.b;
                    } else {
                        objC = aihlVarCheckIsLite.c(objK);
                    }
                    apqdVar = (apqd) objC;
                } else {
                    apqdVar = null;
                }
            } else {
                apqdVar = null;
            }
        } else if (!(obj instanceof aprd)) {
            aprdVar = (aprd) obj;
            ajwoVar2 = aprdVar.g;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            aihlVarCheckIsLite2 = aihn.checkIsLite(apqd.b);
            ajwoVar2.c(aihlVarCheckIsLite2);
            if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                ajwoVar3 = aprdVar.g;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                aihlVarCheckIsLite3 = aihn.checkIsLite(apqd.b);
                ajwoVar3.c(aihlVarCheckIsLite3);
                objK2 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
                if (objK2 == null) {
                    objC2 = aihlVarCheckIsLite3.b;
                } else {
                    objC2 = aihlVarCheckIsLite3.c(objK2);
                }
                apqdVar = (apqd) objC2;
            } else if (obj instanceof apre) {
                apreVar = (apre) obj;
                if (apreVar.f.size() > 0) {
                    apraVar = (apra) apreVar.f.get(0);
                    if (apraVar.b == 64166933) {
                        apqzVar = (apqz) apraVar.c;
                    } else {
                        apqzVar = apqz.a;
                    }
                    ajwoVar = apqzVar.f;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    aihlVarCheckIsLite = aihn.checkIsLite(apqd.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite.b;
                    } else {
                        objC = aihlVarCheckIsLite.c(objK);
                    }
                    apqdVar = (apqd) objC;
                } else {
                    apqdVar = null;
                }
            } else {
                apqdVar = null;
            }
        } else if (obj instanceof apre) {
            apreVar = (apre) obj;
            if (apreVar.f.size() > 0) {
                apraVar = (apra) apreVar.f.get(0);
                if (apraVar.b == 64166933) {
                    apqzVar = (apqz) apraVar.c;
                } else {
                    apqzVar = apqz.a;
                }
                ajwoVar = apqzVar.f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aihlVarCheckIsLite = aihn.checkIsLite(apqd.b);
                ajwoVar.c(aihlVarCheckIsLite);
                objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                if (objK == null) {
                    objC = aihlVarCheckIsLite.b;
                } else {
                    objC = aihlVarCheckIsLite.c(objK);
                }
                apqdVar = (apqd) objC;
            } else {
                apqdVar = null;
            }
        } else {
            apqdVar = null;
        }
        if (apqdVar != null && apqdVar.c.size() > 0) {
            apru apruVar = ((apqc) apqdVar.c.get(0)).e;
            if (apruVar == null) {
                apruVar = apru.a;
            }
            int iAX = acfz.aX(apruVar.c);
            if (iAX != 0) {
                return iAX;
            }
        }
        return 1;
    }
}
