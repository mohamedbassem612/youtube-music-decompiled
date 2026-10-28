package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnp implements adhe {
    private final jki a;
    private final ivu b;
    private final swh c;
    private final aaug d;
    private final jnj e;
    private final vxe f;
    private final god g;
    private final god h;
    private gno i;
    private adhf j;
    private final xgn k;
    private final aeba l;
    private final aeod m;

    public gnp(jki jkiVar, ivu ivuVar, swh swhVar, god godVar, god godVar2, aaug aaugVar, jnj jnjVar, aeod aeodVar, vxe vxeVar, xgn xgnVar, aeba aebaVar) {
        this.a = jkiVar;
        this.b = ivuVar;
        this.c = swhVar;
        this.g = godVar;
        this.h = godVar2;
        this.d = aaugVar;
        this.e = jnjVar;
        this.m = aeodVar;
        this.f = vxeVar;
        this.k = xgnVar;
        this.l = aebaVar;
    }

    private final void f(ajws ajwsVar) {
        if ((ajwsVar.b & 1) != 0) {
            vxe vxeVar = this.f;
            ajwo ajwoVar = ajwsVar.c;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
        if ((ajwsVar.b & 2) != 0) {
            vxe vxeVar2 = this.f;
            ajwo ajwoVar2 = ajwsVar.d;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar2.a(ajwoVar2);
        }
    }

    private final void g(anrz anrzVar, Optional optional) {
        jjt jjtVar = new jjt(anrzVar);
        jjtVar.b = optional;
        this.h.d(jjtVar);
    }

    private final void h(aqjx aqjxVar, Optional optional) {
        jjw jjwVar = new jjw(aqjxVar);
        jjwVar.b = optional;
        this.g.d(jjwVar);
    }

    private final void i() {
        gno gnoVar = this.i;
        if (gnoVar != null) {
            gnoVar.b();
        }
    }

    @Override // defpackage.adhe
    public final void a(alae alaeVar) {
        Optional optionalEmpty;
        apji apjiVar = alaeVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(antd.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        antc antcVar = (antc) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int i = antcVar.c;
        if (i != 1) {
            if (i == 2) {
                this.f.a((ajwo) antcVar.d);
                i();
                return;
            }
            return;
        }
        if ((antcVar.b & 1) != 0) {
            ajwo ajwoVar = antcVar.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            optionalEmpty = Optional.of(ajwoVar);
        } else {
            optionalEmpty = Optional.empty();
        }
        apji apjiVar2 = antcVar.c == 1 ? (apji) antcVar.d : apji.a;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqjy.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        if (apjiVar2.j.n(aihlVarCheckIsLite2.d)) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aqjy.a);
            apjiVar2.c(aihlVarCheckIsLite3);
            Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite3.d);
            h((aqjx) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2)), optionalEmpty);
            i();
            return;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ansa.a);
        apjiVar2.c(aihlVarCheckIsLite4);
        if (apjiVar2.j.n(aihlVarCheckIsLite4.d)) {
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ansa.a);
            apjiVar2.c(aihlVarCheckIsLite5);
            Object objK3 = apjiVar2.j.k(aihlVarCheckIsLite5.d);
            g((anrz) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3)), optionalEmpty);
            i();
            return;
        }
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajwt.a);
        apjiVar2.c(aihlVarCheckIsLite6);
        if (apjiVar2.j.n(aihlVarCheckIsLite6.d)) {
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ajwt.a);
            apjiVar2.c(aihlVarCheckIsLite7);
            Object objK4 = apjiVar2.j.k(aihlVarCheckIsLite7.d);
            f((ajws) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4)));
            i();
        }
    }

    @Override // defpackage.adhe
    public final void b() {
        i();
    }

    @Override // defpackage.adhe
    public final void c() {
        gno gnoVar = this.i;
        if (gnoVar != null) {
            gnoVar.a();
        }
    }

    @Override // defpackage.adhe
    public final void d(ajwo ajwoVar) {
        gno gnoVar = this.i;
        if (gnoVar != null) {
            gnoVar.a();
        }
        this.k.D(xhb.a(119505), xgu.a, ajwoVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x011b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x013e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final boolean e(almd almdVar, gnf gnfVar, gno gnoVar) {
        int i;
        int i2;
        Context context;
        aeba aebaVar;
        akdd akddVar;
        akdd akddVar2;
        akdd akddVar3;
        jnj jnjVar;
        amzh amzhVar;
        adhf adhfVar;
        akzv akzvVar;
        if ((almdVar.b & SemanticState.Hidden) != 0) {
            alma almaVar = almdVar.h;
            if (almaVar == null) {
                almaVar = alma.a;
            }
            xgn xgnVarHB = gnfVar.hB();
            int i3 = almaVar.b;
            if (i3 == 86135402) {
                aeba aebaVar2 = this.l;
                if (aebaVar2.c((i3 == 86135402 ? (amfe) almaVar.c : amfe.a).q)) {
                    this.c.d(almaVar.b == 86135402 ? (amfe) almaVar.c : amfe.a);
                    aebaVar2.a((almaVar.b == 86135402 ? (amfe) almaVar.c : amfe.a).q);
                } else {
                    i = almaVar.b;
                    if (i == 153515154) {
                        this.c.d((akrn) almaVar.c);
                    } else if (i == 182224395) {
                        f((ajws) almaVar.c);
                    } else if (i == 121288100) {
                        h((aqjx) almaVar.c, Optional.empty());
                    } else if (i == 209621365) {
                        g((anrz) almaVar.c, Optional.empty());
                    } else {
                        if (i == 371777145) {
                            this.i = gnoVar;
                            adhfVar = this.j;
                            if (adhfVar != null) {
                                this.m.g(adhfVar);
                            }
                            aeod aeodVar = this.m;
                            if (almaVar.b == 371777145) {
                                akzvVar = (akzv) almaVar.c;
                            } else {
                                akzvVar = akzv.a;
                            }
                            adhf adhfVarE = aeodVar.e(akzvVar, this);
                            this.j = adhfVarE;
                            adhfVarE.c();
                            return true;
                        }
                        if (this.a.i(gnfVar)) {
                            i2 = almaVar.b;
                            if (i2 == 88122887) {
                                this.d.b((arat) almaVar.c, xgnVarHB, null);
                            } else if (i2 == 96907215) {
                                jnjVar = this.e;
                                if (!jnjVar.c()) {
                                    if (almaVar.b == 96907215) {
                                        amzhVar = (amzh) almaVar.c;
                                    } else {
                                        amzhVar = amzh.a;
                                    }
                                    jnjVar.d(amzhVar);
                                } else if (almaVar.b == 64099105) {
                                    context = gnfVar.getContext();
                                    aebaVar = this.l;
                                    if (almaVar.b == 64099105) {
                                        akddVar = (akdd) almaVar.c;
                                    } else {
                                        akddVar = akdd.a;
                                    }
                                    if (aebaVar.c(akddVar.o) && context != null) {
                                        if (almaVar.b == 64099105) {
                                            akddVar2 = (akdd) almaVar.c;
                                        } else {
                                            akddVar2 = akdd.a;
                                        }
                                        acwl.i(context, akddVar2, this.f, xgnVarHB, null, true, true, null, null, null, null, null, false);
                                        if (almaVar.b == 64099105) {
                                            akddVar3 = (akdd) almaVar.c;
                                        } else {
                                            akddVar3 = akdd.a;
                                        }
                                        aebaVar.a(akddVar3.o);
                                    }
                                }
                            } else if (almaVar.b == 64099105) {
                                context = gnfVar.getContext();
                                aebaVar = this.l;
                                if (almaVar.b == 64099105) {
                                    akddVar = (akdd) almaVar.c;
                                } else {
                                    akddVar = akdd.a;
                                }
                                if (aebaVar.c(akddVar.o)) {
                                    if (almaVar.b == 64099105) {
                                        akddVar2 = (akdd) almaVar.c;
                                    } else {
                                        akddVar2 = akdd.a;
                                    }
                                    acwl.i(context, akddVar2, this.f, xgnVarHB, null, true, true, null, null, null, null, null, false);
                                    if (almaVar.b == 64099105) {
                                        akddVar3 = (akdd) almaVar.c;
                                    } else {
                                        akddVar3 = akdd.a;
                                    }
                                    aebaVar.a(akddVar3.o);
                                }
                            }
                        }
                    }
                }
            } else {
                i = almaVar.b;
                if (i == 153515154) {
                    this.c.d((akrn) almaVar.c);
                } else if (i == 182224395) {
                    f((ajws) almaVar.c);
                } else if (i == 121288100) {
                    h((aqjx) almaVar.c, Optional.empty());
                } else if (i == 209621365) {
                    g((anrz) almaVar.c, Optional.empty());
                } else {
                    if (i == 371777145) {
                        this.i = gnoVar;
                        adhfVar = this.j;
                        if (adhfVar != null) {
                            this.m.g(adhfVar);
                        }
                        aeod aeodVar2 = this.m;
                        if (almaVar.b == 371777145) {
                            akzvVar = (akzv) almaVar.c;
                        } else {
                            akzvVar = akzv.a;
                        }
                        adhf adhfVarE2 = aeodVar2.e(akzvVar, this);
                        this.j = adhfVarE2;
                        adhfVarE2.c();
                        return true;
                    }
                    if (this.a.i(gnfVar)) {
                        i2 = almaVar.b;
                        if (i2 == 88122887) {
                            this.d.b((arat) almaVar.c, xgnVarHB, null);
                        } else if (i2 == 96907215) {
                            jnjVar = this.e;
                            if (!jnjVar.c()) {
                                if (almaVar.b == 96907215) {
                                    amzhVar = (amzh) almaVar.c;
                                } else {
                                    amzhVar = amzh.a;
                                }
                                jnjVar.d(amzhVar);
                            } else if (almaVar.b == 64099105) {
                                context = gnfVar.getContext();
                                aebaVar = this.l;
                                if (almaVar.b == 64099105) {
                                    akddVar = (akdd) almaVar.c;
                                } else {
                                    akddVar = akdd.a;
                                }
                                if (aebaVar.c(akddVar.o)) {
                                    if (almaVar.b == 64099105) {
                                        akddVar2 = (akdd) almaVar.c;
                                    } else {
                                        akddVar2 = akdd.a;
                                    }
                                    acwl.i(context, akddVar2, this.f, xgnVarHB, null, true, true, null, null, null, null, null, false);
                                    if (almaVar.b == 64099105) {
                                        akddVar3 = (akdd) almaVar.c;
                                    } else {
                                        akddVar3 = akdd.a;
                                    }
                                    aebaVar.a(akddVar3.o);
                                }
                            }
                        } else if (almaVar.b == 64099105) {
                            context = gnfVar.getContext();
                            aebaVar = this.l;
                            if (almaVar.b == 64099105) {
                                akddVar = (akdd) almaVar.c;
                            } else {
                                akddVar = akdd.a;
                            }
                            if (aebaVar.c(akddVar.o)) {
                                if (almaVar.b == 64099105) {
                                    akddVar2 = (akdd) almaVar.c;
                                } else {
                                    akddVar2 = akdd.a;
                                }
                                acwl.i(context, akddVar2, this.f, xgnVarHB, null, true, true, null, null, null, null, null, false);
                                if (almaVar.b == 64099105) {
                                    akddVar3 = (akdd) almaVar.c;
                                } else {
                                    akddVar3 = akdd.a;
                                }
                                aebaVar.a(akddVar3.o);
                            }
                        }
                    }
                }
            }
        } else if (this.a.i(gnfVar)) {
            almf almfVar = almdVar.g;
            if (almfVar == null) {
                almfVar = almf.a;
            }
            if (((almfVar.b == 84469052 ? (aqgy) almfVar.c : aqgy.a).b & 16) != 0) {
                aeba aebaVar3 = this.l;
                almf almfVar2 = almdVar.g;
                if (almfVar2 == null) {
                    almfVar2 = almf.a;
                }
                if (aebaVar3.c((almfVar2.b == 84469052 ? (aqgy) almfVar2.c : aqgy.a).d)) {
                    ivu ivuVar = this.b;
                    almf almfVar3 = almdVar.g;
                    if (almfVar3 == null) {
                        almfVar3 = almf.a;
                    }
                    aqgx aqgxVar = (almfVar3.b == 84469052 ? (aqgy) almfVar3.c : aqgy.a).c;
                    if (aqgxVar == null) {
                        aqgxVar = aqgx.a;
                    }
                    ivuVar.e(aqgxVar, 1);
                    almf almfVar4 = almdVar.g;
                    if (almfVar4 == null) {
                        almfVar4 = almf.a;
                    }
                    aebaVar3.a((almfVar4.b == 84469052 ? (aqgy) almfVar4.c : aqgy.a).d);
                }
            }
        }
        return false;
    }
}
