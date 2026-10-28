package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibn {
    public final awmd a;
    public final jkp b;
    public final abjp c;
    public final hzi d;
    public final avmb e;
    public final ire f;
    public boolean g;
    public final jnj h;
    public final hwz i;
    public final jnm j;
    private final gzh k;
    private final xeu l;
    private final avmm m;
    private final hwf n;

    public ibn(abjp abjpVar, awmd awmdVar, hwz hwzVar, jkp jkpVar, jnm jnmVar, xeu xeuVar, jnj jnjVar, hzi hziVar, avmb avmbVar, ire ireVar) {
        this.a = awmdVar;
        this.i = hwzVar;
        this.b = jkpVar;
        this.l = xeuVar;
        this.c = abjpVar;
        this.h = jnjVar;
        this.d = hziVar;
        this.e = avmbVar;
        this.f = ireVar;
        ibk ibkVar = new ibk(this);
        this.k = ibkVar;
        this.j = jnmVar;
        jnmVar.y(ibkVar);
        abjpVar.p(new ibi(this, 0));
        this.n = new hwf(this);
        this.m = new avmm();
    }

    public final void a() {
        if (this.j.C()) {
            return;
        }
        jko jkoVarEdit = this.b.edit();
        jkoVarEdit.a(gzj.DONT_PLAY_VIDEO_SETTING, false);
        jkoVarEdit.apply();
    }

    public final void b() {
        abvn abvnVar = (abvn) this.a.io();
        avlh avlhVarQ = abvnVar.Q();
        final hwf hwfVar = this.n;
        Object obj = hwfVar.a;
        int i = 4;
        awak awakVar = new awak(avlhVarQ, new hby(obj, i));
        avnn avnnVar = atqp.j;
        int i2 = 5;
        awakVar.L(((ibn) obj).e).al(new avni() { // from class: ibl
            /* JADX WARN: Code duplicated, block: B:35:0x009c  */
            /* JADX WARN: Code duplicated, block: B:37:0x00af  */
            /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
            /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
            /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
            /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
            /* JADX WARN: Code duplicated, block: B:54:0x0102  */
            @Override // defpackage.avni
            public final void a(Object obj2) {
                aihl aihlVarCheckIsLite;
                Optional optionalEmpty;
                aihl aihlVarCheckIsLite2;
                Object objK;
                Object objC;
                aihl aihlVarCheckIsLite3;
                Object objK2;
                Object objC2;
                ariv arivVar;
                antz antzVarA;
                ibh ibhVar;
                ibh ibhVar2;
                ibm ibmVar = (ibm) obj2;
                aayw aaywVar = ibmVar.a;
                boolean z = ibmVar.b;
                abnw abnwVar = aaywVar.b;
                hwf hwfVar2 = hwfVar;
                abnw abnwVar2 = abnw.a;
                ibn ibnVar = (ibn) hwfVar2.a;
                if (abnwVar == abnwVar2) {
                    ibnVar.g = true;
                    return;
                }
                if (ibnVar.g && abnwVar.b(abnw.d)) {
                    boolean z2 = false;
                    ibnVar.g = false;
                    ajwo ajwoVar = aaywVar.e;
                    if (ajwoVar == null) {
                        optionalEmpty = Optional.empty();
                    } else {
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
                        ajwoVar.c(aihlVarCheckIsLite4);
                        if (ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(arik.a);
                            ajwoVar.c(aihlVarCheckIsLite5);
                            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                            if ((((arij) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).b & 8388608) != 0) {
                                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(arik.a);
                                ajwoVar.c(aihlVarCheckIsLite6);
                                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                                arii ariiVar = ((arij) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4))).s;
                                if (ariiVar == null) {
                                    ariiVar = arii.a;
                                }
                                arih arihVar = ariiVar.c;
                                if (arihVar == null) {
                                    arihVar = arih.a;
                                }
                                antz antzVarA2 = antz.a(arihVar.e);
                                if (antzVarA2 == null) {
                                    antzVarA2 = antz.MUSIC_PLAYLIST_CONTENT_TYPE_UNKNOWN;
                                }
                                optionalEmpty = Optional.of(antzVarA2);
                            } else {
                                aihlVarCheckIsLite = aihn.checkIsLite(arix.a);
                                ajwoVar.c(aihlVarCheckIsLite);
                                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                    aihlVarCheckIsLite2 = aihn.checkIsLite(arix.a);
                                    ajwoVar.c(aihlVarCheckIsLite2);
                                    objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                                    if (objK == null) {
                                        objC = aihlVarCheckIsLite2.b;
                                    } else {
                                        objC = aihlVarCheckIsLite2.c(objK);
                                    }
                                    if ((((ariw) objC).b & SemanticState.Hidden) != 0) {
                                        aihlVarCheckIsLite3 = aihn.checkIsLite(arix.a);
                                        ajwoVar.c(aihlVarCheckIsLite3);
                                        objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                                        if (objK2 == null) {
                                            objC2 = aihlVarCheckIsLite3.b;
                                        } else {
                                            objC2 = aihlVarCheckIsLite3.c(objK2);
                                        }
                                        arivVar = ((ariw) objC2).h;
                                        if (arivVar == null) {
                                            arivVar = ariv.a;
                                        }
                                        antzVarA = antz.a(arivVar.b);
                                        if (antzVarA == null) {
                                            antzVarA = antz.MUSIC_PLAYLIST_CONTENT_TYPE_UNKNOWN;
                                        }
                                        optionalEmpty = Optional.of(antzVarA);
                                    } else {
                                        optionalEmpty = Optional.empty();
                                    }
                                } else {
                                    optionalEmpty = Optional.empty();
                                }
                            }
                        } else {
                            aihlVarCheckIsLite = aihn.checkIsLite(arix.a);
                            ajwoVar.c(aihlVarCheckIsLite);
                            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                aihlVarCheckIsLite2 = aihn.checkIsLite(arix.a);
                                ajwoVar.c(aihlVarCheckIsLite2);
                                objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                                if (objK == null) {
                                    objC = aihlVarCheckIsLite2.b;
                                } else {
                                    objC = aihlVarCheckIsLite2.c(objK);
                                }
                                if ((((ariw) objC).b & SemanticState.Hidden) != 0) {
                                    aihlVarCheckIsLite3 = aihn.checkIsLite(arix.a);
                                    ajwoVar.c(aihlVarCheckIsLite3);
                                    objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                                    if (objK2 == null) {
                                        objC2 = aihlVarCheckIsLite3.b;
                                    } else {
                                        objC2 = aihlVarCheckIsLite3.c(objK2);
                                    }
                                    arivVar = ((ariw) objC2).h;
                                    if (arivVar == null) {
                                        arivVar = ariv.a;
                                    }
                                    antzVarA = antz.a(arivVar.b);
                                    if (antzVarA == null) {
                                        antzVarA = antz.MUSIC_PLAYLIST_CONTENT_TYPE_UNKNOWN;
                                    }
                                    optionalEmpty = Optional.of(antzVarA);
                                } else {
                                    optionalEmpty = Optional.empty();
                                }
                            } else {
                                optionalEmpty = Optional.empty();
                            }
                        }
                    }
                    if (optionalEmpty.isPresent() && optionalEmpty.get() != antz.MUSIC_PLAYLIST_CONTENT_TYPE_UNKNOWN) {
                        if (optionalEmpty.get() == antz.MUSIC_PLAYLIST_CONTENT_TYPE_OMV_PREFERRED) {
                            ibhVar2 = ibnVar.b.getBoolean(gzj.DONT_PLAY_VIDEO_SETTING, false) ? ibh.DONT_PLAY_VIDEO_OVERRIDE : ibh.OMV_PREFERRED;
                        } else {
                            ibhVar2 = ibh.ATV_PREFERRED;
                        }
                        ibnVar.i.j(ibhVar2);
                        return;
                    }
                    if (gzj.ab(ajwoVar) && ibnVar.j.C()) {
                        ibnVar.i.j(ibh.ATV_PREFERRED);
                        return;
                    }
                    anzw anzwVarP = gzj.P(ajwoVar);
                    if (ibnVar.b.getBoolean(gzj.DONT_PLAY_VIDEO_SETTING, false) && ibnVar.j.C()) {
                        z2 = true;
                    }
                    if (true != igs.c(anzwVarP)) {
                        z = z2;
                    }
                    wjf wjfVar = aaywVar.c;
                    if (hna.x(wjfVar)) {
                        ibhVar = ibh.ATV_PREFERRED;
                    } else {
                        ibhVar = (!z || hna.w(wjfVar)) ? ibh.OMV_PREFERRED : ibh.DONT_PLAY_VIDEO_OVERRIDE;
                    }
                    ibnVar.i.j(ibhVar);
                }
            }
        }, new hyx(i2));
        int i3 = 1;
        ((avlh) abvnVar.r().a).i(new abwr(i3)).al(new hxi(hwfVar, 10), new hyx(i2));
        this.m.e(this.i.h().i(new abwr(i3)).al(new hxi(this, 9), new hyx(i)));
    }

    public final void c(ibh ibhVar) {
        boolean z = true;
        int i = true != hwz.k(ibhVar) ? 3 : 2;
        aihf aihfVarCreateBuilder = ants.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ants antsVar = (ants) aihfVarCreateBuilder.instance;
        antsVar.c = i - 1;
        antsVar.b |= 1;
        ibh ibhVarF = this.i.f();
        if (ibhVarF != ibh.ATV_PREFERRED_USER_TRIGGERED && ibhVarF != ibh.OMV_PREFERRED_USER_TRIGGERED) {
            z = false;
        }
        aihfVarCreateBuilder.copyOnWrite();
        ants antsVar2 = (ants) aihfVarCreateBuilder.instance;
        antsVar2.b |= 2;
        antsVar2.d = z;
        xeu xeuVar = this.l;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_PLAYBACK_CONTENT_MODE_CHANGE_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        ants antsVar3 = (ants) aihfVarCreateBuilder.build();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        antsVar3.getClass();
        alouVar.d = antsVar3;
        alouVar.c = 231;
        xeuVar.b((alou) alosVar.build());
    }

    public final void d(ibh ibhVar) {
        if (this.i.f() != ibhVar) {
            c(ibhVar);
        }
    }
}
