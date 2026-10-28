package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gez implements gfp, gfq, rpq {
    public final gmz a;
    final gmy b;
    public final hke c;
    private final gey d;
    private final dd e;
    private final tbt f;
    private final gnz g;
    private final jjb h;
    private final jjn i;
    private final ivu j;
    private final ttm k;
    private final awku l;
    private String m;
    private Optional n = Optional.empty();
    private int o = 0;
    private final hkl p;
    private final rqa q;
    private final vxz r;
    private final hkk s;
    private final tfm t;

    public gez(gey geyVar, dd ddVar, tbt tbtVar, hke hkeVar, hkl hklVar, gmy gmyVar, gnz gnzVar, jjb jjbVar, gex gexVar, jjn jjnVar, ivu ivuVar, rqa rqaVar, ttm ttmVar, hkk hkkVar, awku awkuVar, tfm tfmVar, vxz vxzVar) {
        this.d = geyVar;
        this.e = ddVar;
        this.f = tbtVar;
        this.c = hkeVar;
        this.p = hklVar;
        this.b = gmyVar;
        this.g = gnzVar;
        this.h = jjbVar;
        this.a = gexVar;
        this.i = jjnVar;
        this.j = ivuVar;
        this.q = rqaVar;
        this.k = ttmVar;
        this.s = hkkVar;
        this.l = awkuVar;
        this.t = tfmVar;
        this.r = vxzVar;
    }

    private final void q(String str, aigj aigjVar, Map map) {
        aihf aihfVarCreateBuilder = ajmf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajmf ajmfVar = (ajmf) aihfVarCreateBuilder.instance;
        str.getClass();
        ajmfVar.b |= 1;
        ajmfVar.c = str;
        ajmf ajmfVar2 = (ajmf) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(ajmj.a, ajmfVar2);
        if (aigjVar != null) {
            aihhVar.copyOnWrite();
            ajwo ajwoVar = (ajwo) aihhVar.instance;
            ajwoVar.b |= 1;
            ajwoVar.c = aigjVar;
        }
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("playlist_edit_mode", Boolean.TRUE);
        e((ajwo) aihhVar.build(), map2, gnl.a);
    }

    private final boolean r(String str) {
        if (hdu.h.contains(str)) {
            return hdu.g.contains(str) || "FEmusic_library_landing".equals(this.c.c);
        }
        return false;
    }

    @Override // defpackage.gfq
    public final Optional a() {
        return this.n;
    }

    @Override // defpackage.gfq
    public final String b() {
        return this.m;
    }

    @Override // defpackage.gfp
    public final void c() {
        jmg jmgVarB = this.g.b();
        if (jmgVarB != null) {
            jmgVarB.dismiss();
        }
    }

    @Override // defpackage.gfp
    public final void d(ajwo ajwoVar) {
        e(ajwoVar, null, gnl.a);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0365  */
    /* JADX WARN: Code duplicated, block: B:173:0x0415  */
    /* JADX WARN: Code duplicated, block: B:178:0x0423  */
    /* JADX WARN: Code duplicated, block: B:180:0x0427  */
    /* JADX WARN: Code duplicated, block: B:191:0x0470  */
    /* JADX WARN: Code duplicated, block: B:194:0x0479 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x047b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0480  */
    /* JADX WARN: Code duplicated, block: B:200:0x048e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0494  */
    /* JADX WARN: Code duplicated, block: B:204:0x049e  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:224:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:226:0x050d  */
    /* JADX WARN: Code duplicated, block: B:229:0x051c  */
    /* JADX WARN: Code duplicated, block: B:231:0x0526  */
    /* JADX WARN: Code duplicated, block: B:233:0x052d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0535  */
    /* JADX WARN: Code duplicated, block: B:238:0x053c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x0549  */
    /* JADX WARN: Code duplicated, block: B:245:0x0555  */
    /* JADX WARN: Code duplicated, block: B:252:0x04f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x04ef A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.gfp
    public final void e(ajwo ajwoVar, Map map, gnl gnlVar) {
        String str;
        Object obj;
        boolean z;
        boolean z2;
        int iBc;
        ijl ijlVar;
        int iMatch;
        ivj ivjVar;
        dd ddVar;
        int iB;
        String str2;
        ijl ijlVar2;
        hej hejVar;
        String strAn;
        ajwo ajwoVar2;
        String strAn2;
        ajwo ajwoVar3;
        ajwo ajwoVarA = ajwoVar;
        gey geyVar = this.d;
        if (geyVar.B()) {
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVarA.c(aihlVarCheckIsLite);
        Object objK = ajwoVarA.j.k(aihlVarCheckIsLite.d);
        String str3 = ((ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if (str3.equals("FEmusic_liked")) {
            ajwoVarA = vxh.a("FEmusic_library_landing");
            str3 = "FEmusic_library_landing";
        }
        this.m = str3;
        this.n = gnlVar.b;
        if (!geyVar.A() || !"FEmusic_home".equals(str3)) {
            if (this.r.l(17, 45680971L, false)) {
                this.l.kk(gnk.c);
            } else {
                tbt tbtVar = this.f;
                tbtVar.c(new haj());
                tbtVar.c(new hai(str3));
            }
        }
        kro.aj(ajwoVarA);
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
        ajwoVarA.c(aihlVarCheckIsLite2);
        if (ajwoVarA.j.n(aihlVarCheckIsLite2.d)) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
            ajwoVarA.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVarA.j.k(aihlVarCheckIsLite3.d);
            String str4 = ((ajmf) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).c;
        }
        if ("avatar_menu_activate_switch_account".equals(str3)) {
            gdr gdrVar = new gdr();
            gdrVar.n = this;
            ajwoVarA.getClass();
            gdrVar.p = ajwoVarA;
            gdrVar.q = R.layout.account_switcher_fragment;
            gdrVar.r = R.style.AccountSwitcherYtMusic;
            dd ddVar2 = this.e;
            ddVar2.ah();
            av avVar = new av(ddVar2);
            avVar.g(0, gdrVar, null, 1);
            avVar.e();
            return;
        }
        heh hehVar = new heh();
        hehVar.m = map != null ? map : agpn.b;
        hehVar.j(ajwoVarA);
        hehVar.c(gnlVar);
        if (str3.equals("FEmusic_moods_and_genres_category")) {
            int i = this.o;
            this.o = i + 1;
            str = str3 + i;
        } else {
            str = r(str3) ? "FEmusic_library_landing" : str3;
        }
        hehVar.k = str;
        hke hkeVar = this.c;
        if (hkeVar.d(hehVar.f())) {
            hehVar.o();
            hkeVar.c = hehVar.f();
        }
        this.p.b(true != r(str3) ? true != str3.equals("FEmusic_immersive_preview") ? str3 : "" : "FEmusic_library_landing");
        if (map != null && (map.get("force_refresh") instanceof Boolean) && ((Boolean) map.get("force_refresh")).booleanValue()) {
            hehVar.h(2);
            gmy gmyVar = this.b;
            ajwo ajwoVar4 = hehVar.f;
            gqh gqhVar = gmyVar.e;
            gqhVar.e.f(gzj.a(gqhVar.j.x(ajwoVar4)));
        }
        hkk hkkVar = this.s;
        if (((Optional) hkkVar.b).isPresent()) {
            obj = hkkVar.b;
            hkkVar.b = Optional.empty();
        } else {
            obj = hkkVar.b;
        }
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            hehVar.b = (String) optional.get();
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajmj.a);
        ajwoVarA.c(aihlVarCheckIsLite4);
        Object objK3 = ajwoVarA.j.k(aihlVarCheckIsLite4.d);
        ajmf ajmfVar = (ajmf) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
        String str5 = ajmfVar.c;
        if (!ajmfVar.f || (!str5.startsWith("VL") && !str5.startsWith("MPED") && !str5.equals("FEoffline_songs") && !str5.equals("FEoffline_nma_tracks") && !str5.equals("FEoffline_mixtape"))) {
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajmj.a);
            ajwoVarA.c(aihlVarCheckIsLite5);
            Object objK4 = ajwoVarA.j.k(aihlVarCheckIsLite5.d);
            String str6 = ((ajmf) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4))).c;
            if (str6.startsWith("UC") || str6.equals("FEmusic_listening_review") || str6.equals("FEmusic_community_page") || str6.startsWith("MP")) {
                geyVar.D().D();
                this.g.d(hehVar);
            } else {
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajmj.a);
                ajwoVarA.c(aihlVarCheckIsLite6);
                int i2 = -1;
                if (ajwoVarA.j.n(aihlVarCheckIsLite6.d)) {
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(ajmj.a);
                    ajwoVarA.c(aihlVarCheckIsLite7);
                    Object objK5 = ajwoVarA.j.k(aihlVarCheckIsLite7.d);
                    ajmf ajmfVar2 = (ajmf) (objK5 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK5));
                    String str7 = ajmfVar2.c;
                    if (str7.startsWith("VL") || "FEoffline_songs".equals(str7) || "FEoffline_nma_tracks".equals(str7) || "FEoffline_mixtape".equals(str7) || hef.q(ajmfVar2) || str7.startsWith("FEmusic_library_privately_owned_release_detail") || str7.startsWith("FEmusic_library_privately_owned_artist_detail")) {
                        geyVar.D().D();
                        gnz gnzVar = this.g;
                        ajwo ajwoVar5 = hehVar.f;
                        boolean zBooleanValue = ((Boolean) tym.T(hehVar.m, "playlist_edit_mode", Boolean.FALSE)).booleanValue();
                        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(ajmj.a);
                        ajwoVar5.c(aihlVarCheckIsLite8);
                        Object objK6 = ajwoVar5.j.k(aihlVarCheckIsLite8.d);
                        ajmf ajmfVar3 = (ajmf) (objK6 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK6));
                        String strAn3 = fhz.an(ajmfVar3);
                        jki jkiVar = gnzVar.c;
                        cc ccVarB = jkiVar.b();
                        if (ccVarB instanceof ivj) {
                            ivj ivjVar2 = (ivj) ccVarB;
                            hej hejVar2 = ivjVar2.H;
                            if (hejVar2 == null || (ajwoVar3 = ((heh) hejVar2).f) == null) {
                                strAn2 = null;
                            } else {
                                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(ajmj.a);
                                ajwoVar3.c(aihlVarCheckIsLite9);
                                if (ajwoVar3.j.n(aihlVarCheckIsLite9.d)) {
                                    ajwo ajwoVar6 = ((heh) ivjVar2.H).f;
                                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(ajmj.a);
                                    ajwoVar6.c(aihlVarCheckIsLite10);
                                    Object objK7 = ajwoVar6.j.k(aihlVarCheckIsLite10.d);
                                    strAn2 = fhz.an((ajmf) (objK7 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK7)));
                                } else {
                                    strAn2 = null;
                                }
                            }
                            if (!Objects.equals(strAn2, strAn3)) {
                                z2 = ccVarB instanceof ijl;
                                if (z2) {
                                    ijlVar2 = (ijl) ccVarB;
                                    hejVar = ijlVar2.H;
                                    if (hejVar != null) {
                                        strAn = null;
                                    } else {
                                        strAn = null;
                                    }
                                    if (Objects.equals(strAn, strAn3)) {
                                        if (zBooleanValue) {
                                            ijlVar2.S();
                                        }
                                    }
                                } else {
                                    i2 = -1;
                                }
                                if (ccVarB != null) {
                                    if (gnz.i(ccVarB)) {
                                        ddVar = gnzVar.b;
                                        iB = ddVar.b() - 1;
                                        while (true) {
                                            if (iB >= 0) {
                                                str2 = ddVar.ag(iB).m;
                                                if (TextUtils.equals(goa.SEARCH.j, str2)) {
                                                }
                                                iB--;
                                                i2 = i2;
                                            }
                                            if (hef.q(ajmfVar3)) {
                                                hehVar.k = strAn3;
                                                iMatch = ish.q.match(Uri.parse(ajmfVar3.c));
                                                if (iMatch != 3) {
                                                    ivjVar = new ivj();
                                                    ivjVar.u(hehVar);
                                                    if (zBooleanValue) {
                                                        ivjVar.ah = true;
                                                    }
                                                    gnzVar.c(ivjVar, strAn3);
                                                } else {
                                                    ivjVar = new ivj();
                                                    ivjVar.u(hehVar);
                                                    if (zBooleanValue) {
                                                        ivjVar.ah = true;
                                                    }
                                                    gnzVar.c(ivjVar, strAn3);
                                                }
                                            } else {
                                                iBc = a.bc(ajmfVar3.i);
                                                if (iBc == 0) {
                                                    iBc = 1;
                                                }
                                                if (gnz.k(iBc, ccVarB)) {
                                                    hehVar.k = strAn3;
                                                    ijlVar = new ijl();
                                                    ijlVar.u(hehVar);
                                                    if (zBooleanValue) {
                                                        ijlVar.aA.set(true);
                                                    }
                                                    gnzVar.c(ijlVar, strAn3);
                                                } else {
                                                    hehVar.k = strAn3;
                                                    ijlVar = new ijl();
                                                    ijlVar.u(hehVar);
                                                    if (zBooleanValue) {
                                                        ijlVar.aA.set(true);
                                                    }
                                                    gnzVar.c(ijlVar, strAn3);
                                                }
                                            }
                                        }
                                    } else if (hef.q(ajmfVar3)) {
                                        hehVar.k = strAn3;
                                        iMatch = ish.q.match(Uri.parse(ajmfVar3.c));
                                        if (iMatch != 3) {
                                            ivjVar = new ivj();
                                            ivjVar.u(hehVar);
                                            if (zBooleanValue) {
                                                ivjVar.ah = true;
                                            }
                                            gnzVar.c(ivjVar, strAn3);
                                        } else {
                                            ivjVar = new ivj();
                                            ivjVar.u(hehVar);
                                            if (zBooleanValue) {
                                                ivjVar.ah = true;
                                            }
                                            gnzVar.c(ivjVar, strAn3);
                                        }
                                    } else {
                                        iBc = a.bc(ajmfVar3.i);
                                        if (iBc == 0) {
                                            iBc = 1;
                                        }
                                        if (gnz.k(iBc, ccVarB)) {
                                            hehVar.k = strAn3;
                                            ijlVar = new ijl();
                                            ijlVar.u(hehVar);
                                            if (zBooleanValue) {
                                                ijlVar.aA.set(true);
                                            }
                                            gnzVar.c(ijlVar, strAn3);
                                        } else {
                                            hehVar.k = strAn3;
                                            ijlVar = new ijl();
                                            ijlVar.u(hehVar);
                                            if (zBooleanValue) {
                                                ijlVar.aA.set(true);
                                            }
                                            gnzVar.c(ijlVar, strAn3);
                                        }
                                    }
                                } else if (gnz.i(ccVarB)) {
                                    ddVar = gnzVar.b;
                                    iB = ddVar.b() - 1;
                                    while (true) {
                                        if (iB >= 0) {
                                            str2 = ddVar.ag(iB).m;
                                            if (TextUtils.equals(goa.SEARCH.j, str2)) {
                                            }
                                            iB--;
                                            i2 = i2;
                                        }
                                        if (hef.q(ajmfVar3)) {
                                            hehVar.k = strAn3;
                                            iMatch = ish.q.match(Uri.parse(ajmfVar3.c));
                                            if (iMatch != 3) {
                                                ivjVar = new ivj();
                                                ivjVar.u(hehVar);
                                                if (zBooleanValue) {
                                                    ivjVar.ah = true;
                                                }
                                                gnzVar.c(ivjVar, strAn3);
                                            } else {
                                                ivjVar = new ivj();
                                                ivjVar.u(hehVar);
                                                if (zBooleanValue) {
                                                    ivjVar.ah = true;
                                                }
                                                gnzVar.c(ivjVar, strAn3);
                                            }
                                        } else {
                                            iBc = a.bc(ajmfVar3.i);
                                            if (iBc == 0) {
                                                iBc = 1;
                                            }
                                            if (gnz.k(iBc, ccVarB)) {
                                                hehVar.k = strAn3;
                                                ijlVar = new ijl();
                                                ijlVar.u(hehVar);
                                                if (zBooleanValue) {
                                                    ijlVar.aA.set(true);
                                                }
                                                gnzVar.c(ijlVar, strAn3);
                                            } else {
                                                hehVar.k = strAn3;
                                                ijlVar = new ijl();
                                                ijlVar.u(hehVar);
                                                if (zBooleanValue) {
                                                    ijlVar.aA.set(true);
                                                }
                                                gnzVar.c(ijlVar, strAn3);
                                            }
                                        }
                                    }
                                } else if (hef.q(ajmfVar3)) {
                                    hehVar.k = strAn3;
                                    iMatch = ish.q.match(Uri.parse(ajmfVar3.c));
                                    if (iMatch != 3) {
                                        ivjVar = new ivj();
                                        ivjVar.u(hehVar);
                                        if (zBooleanValue) {
                                            ivjVar.ah = true;
                                        }
                                        gnzVar.c(ivjVar, strAn3);
                                    } else {
                                        ivjVar = new ivj();
                                        ivjVar.u(hehVar);
                                        if (zBooleanValue) {
                                            ivjVar.ah = true;
                                        }
                                        gnzVar.c(ivjVar, strAn3);
                                    }
                                } else {
                                    iBc = a.bc(ajmfVar3.i);
                                    if (iBc == 0) {
                                        iBc = 1;
                                    }
                                    if (gnz.k(iBc, ccVarB)) {
                                        hehVar.k = strAn3;
                                        ijlVar = new ijl();
                                        ijlVar.u(hehVar);
                                        if (zBooleanValue) {
                                            ijlVar.aA.set(true);
                                        }
                                        gnzVar.c(ijlVar, strAn3);
                                    } else {
                                        hehVar.k = strAn3;
                                        ijlVar = new ijl();
                                        ijlVar.u(hehVar);
                                        if (zBooleanValue) {
                                            ijlVar.aA.set(true);
                                        }
                                        gnzVar.c(ijlVar, strAn3);
                                    }
                                }
                            } else if (zBooleanValue) {
                                ivjVar2.S();
                            }
                        } else {
                            z2 = ccVarB instanceof ijl;
                            if (z2) {
                                ijlVar2 = (ijl) ccVarB;
                                hejVar = ijlVar2.H;
                                if (hejVar != null || (ajwoVar2 = ((heh) hejVar).f) == null) {
                                    strAn = null;
                                } else {
                                    aihl aihlVarCheckIsLite11 = aihn.checkIsLite(ajmj.a);
                                    ajwoVar2.c(aihlVarCheckIsLite11);
                                    if (ajwoVar2.j.n(aihlVarCheckIsLite11.d)) {
                                        ajwo ajwoVar7 = ((heh) ijlVar2.H).f;
                                        aihl aihlVarCheckIsLite12 = aihn.checkIsLite(ajmj.a);
                                        ajwoVar7.c(aihlVarCheckIsLite12);
                                        Object objK8 = ajwoVar7.j.k(aihlVarCheckIsLite12.d);
                                        strAn = fhz.an((ajmf) (objK8 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK8)));
                                    } else {
                                        strAn = null;
                                    }
                                }
                                if (Objects.equals(strAn, strAn3)) {
                                    if (zBooleanValue) {
                                        ijlVar2.S();
                                    }
                                }
                            } else {
                                i2 = -1;
                            }
                            if (ccVarB != null || !strAn3.equals(ccVarB.getTag())) {
                                if (gnz.i(ccVarB)) {
                                    ddVar = gnzVar.b;
                                    iB = ddVar.b() - 1;
                                    while (true) {
                                        if (iB >= 0) {
                                            str2 = ddVar.ag(iB).m;
                                            if (!TextUtils.equals(goa.SEARCH.j, str2) || TextUtils.equals(goa.SEARCH_PRIMARY_RESULT.j, str2) || TextUtils.equals(goa.SEARCH_LANDING_PAGE.j, str2)) {
                                                iB--;
                                                i2 = i2;
                                            } else if (TextUtils.equals(str2, strAn3)) {
                                                for (int iB2 = ddVar.b() - 1; iB2 > iB; iB2--) {
                                                    ddVar.ae(null, i2, 0);
                                                }
                                                if (zBooleanValue) {
                                                    bpp bppVarB = jkiVar.b();
                                                    if (!(bppVarB instanceof ijo)) {
                                                        throw new IllegalStateException();
                                                    }
                                                    ((ijo) bppVarB).S();
                                                }
                                            }
                                        }
                                        if (hef.q(ajmfVar3)) {
                                            hehVar.k = strAn3;
                                            iMatch = ish.q.match(Uri.parse(ajmfVar3.c));
                                            if (iMatch != 3 || iMatch == 6) {
                                                ivjVar = new ivj();
                                                ivjVar.u(hehVar);
                                                if (zBooleanValue) {
                                                    ivjVar.ah = true;
                                                }
                                                gnzVar.c(ivjVar, strAn3);
                                            } else {
                                                ivc ivcVar = new ivc();
                                                ivcVar.u(hehVar);
                                                gnzVar.c(ivcVar, strAn3);
                                            }
                                        } else {
                                            iBc = a.bc(ajmfVar3.i);
                                            if (iBc == 0) {
                                                iBc = 1;
                                            }
                                            if (gnz.k(iBc, ccVarB) || !z2) {
                                                hehVar.k = strAn3;
                                                ijlVar = new ijl();
                                                ijlVar.u(hehVar);
                                                if (zBooleanValue) {
                                                    ijlVar.aA.set(true);
                                                }
                                                gnzVar.c(ijlVar, strAn3);
                                            } else {
                                                ijl ijlVar3 = (ijl) ccVarB;
                                                if (zBooleanValue) {
                                                    ijlVar3.S();
                                                }
                                                ijlVar3.hF(hehVar);
                                            }
                                        }
                                    }
                                } else if (hef.q(ajmfVar3)) {
                                    hehVar.k = strAn3;
                                    iMatch = ish.q.match(Uri.parse(ajmfVar3.c));
                                    if (iMatch != 3) {
                                        ivjVar = new ivj();
                                        ivjVar.u(hehVar);
                                        if (zBooleanValue) {
                                            ivjVar.ah = true;
                                        }
                                        gnzVar.c(ivjVar, strAn3);
                                    } else {
                                        ivjVar = new ivj();
                                        ivjVar.u(hehVar);
                                        if (zBooleanValue) {
                                            ivjVar.ah = true;
                                        }
                                        gnzVar.c(ivjVar, strAn3);
                                    }
                                } else {
                                    iBc = a.bc(ajmfVar3.i);
                                    if (iBc == 0) {
                                        iBc = 1;
                                    }
                                    if (gnz.k(iBc, ccVarB)) {
                                        hehVar.k = strAn3;
                                        ijlVar = new ijl();
                                        ijlVar.u(hehVar);
                                        if (zBooleanValue) {
                                            ijlVar.aA.set(true);
                                        }
                                        gnzVar.c(ijlVar, strAn3);
                                    } else {
                                        hehVar.k = strAn3;
                                        ijlVar = new ijl();
                                        ijlVar.u(hehVar);
                                        if (zBooleanValue) {
                                            ijlVar.aA.set(true);
                                        }
                                        gnzVar.c(ijlVar, strAn3);
                                    }
                                }
                            }
                        }
                    }
                }
                if ("FEmusic_language_selection".equals(str3) || "FEmusic_genre_selection".equals(str3)) {
                    this.h.d(hehVar);
                    this.b.d(hehVar, 8);
                } else if ("FEmusic_tastebuilder".equals(str3)) {
                    this.i.d(hehVar);
                } else if ("FEmusic_playlist_import".equals(str3)) {
                    this.g.d(hehVar);
                } else {
                    if (hehVar.l) {
                        gnz gnzVar2 = this.g;
                        dd ddVar3 = gnzVar2.b;
                        if (jku.e(ddVar3)) {
                            while (gnzVar2.h() && ddVar3.ae(null, -1, 0)) {
                            }
                        } else {
                            ((agrc) ((agrc) gnz.a.c()).k("com/google/android/apps/youtube/music/browse/EntitiesFragmentPresenter", "clear", 481, "EntitiesFragmentPresenter.java")).t("Fragment transaction not allowed, skipping clear().");
                        }
                    }
                    tfm tfmVar = this.t;
                    Object obj2 = tfmVar.d;
                    if (obj2 != null) {
                        heh hehVar2 = (heh) obj2;
                        if (str3.equals(hehVar2.b())) {
                            this.a.a(hehVar2);
                        } else {
                            this.b.d(hehVar, 8);
                        }
                    } else {
                        this.b.d(hehVar, 8);
                    }
                    jjn jjnVar = this.i;
                    if (((jjm) jjnVar.a.g("FEmusic_tastebuilder")) != null) {
                        jjnVar.e();
                    }
                    tfmVar.d = null;
                }
            }
            z = true;
            geyVar.j(z);
            c();
        }
        geyVar.D().D();
        gnz gnzVar3 = this.g;
        ajwo ajwoVar8 = hehVar.f;
        aihl aihlVarCheckIsLite13 = aihn.checkIsLite(ajmj.a);
        ajwoVar8.c(aihlVarCheckIsLite13);
        if (ajwoVar8.j.n(aihlVarCheckIsLite13.d)) {
            aihl aihlVarCheckIsLite14 = aihn.checkIsLite(ajmj.a);
            ajwoVar8.c(aihlVarCheckIsLite14);
            Object objK9 = ajwoVar8.j.k(aihlVarCheckIsLite14.d);
            String strJ = gnz.j((ajmf) (objK9 == null ? aihlVarCheckIsLite14.b : aihlVarCheckIsLite14.c(objK9)));
            cc ccVarB2 = gnzVar3.c.b();
            if (ccVarB2 == null || !strJ.equals(ccVarB2.getTag())) {
                hehVar.k = strJ;
                hot hotVar = new hot();
                hotVar.u(hehVar);
                gnzVar3.c(hotVar, strJ);
            }
        }
        z = true;
        geyVar.j(z);
        c();
    }

    @Override // defpackage.gfp
    public final void f(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoth.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        if (((aoth) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d) {
            ijr ijrVar = new ijr();
            ijrVar.e = new ijs(ajwoVar);
            dd ddVar = this.e;
            av avVar = new av(ddVar);
            avVar.q(R.id.fragment_container, ijrVar, null);
            avVar.o(goa.PLAYLIST_SETTINGS_EDITOR.j);
            avVar.a(false, true);
            ddVar.ah();
            return;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aoth.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite2.d));
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aoth.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        aoth aothVar = (aoth) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
        typ.f(aothVar.c);
        q(String.format("VL%s", aothVar.c), (ajwoVar.b & 1) != 0 ? ajwoVar.c : null, map);
    }

    @Override // defpackage.gfp
    public final void g(ajwo ajwoVar) {
        this.j.d();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aldp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aldp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        gnz gnzVar = this.g;
        aldp aldpVar = (aldp) objC;
        hdj hdjVar = new hdj();
        hdjVar.w = aldpVar.e;
        hdjVar.x = aldpVar.d;
        Bundle bundle = new Bundle();
        bundle.putByteArray("invoking_navigation", ajwoVar.toByteArray());
        hdjVar.setArguments(bundle);
        dd ddVar = gnzVar.b;
        av avVar = new av(ddVar);
        avVar.o("GeneratedThumbnailsSelectorFragment");
        if (jku.e(ddVar)) {
            hdjVar.h = false;
            hdjVar.i = true;
            avVar.g(0, hdjVar, "GeneratedThumbnailsSelectorFragment", 1);
            hdjVar.g = false;
            hdjVar.e = avVar.a(false, true);
            ddVar.ah();
        }
        this.d.j(false);
    }

    @Override // defpackage.gfp
    public final void h(ajwo ajwoVar, affd affdVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aotp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aotp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        String str = ((aotp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("playlist_id", str);
        ilc ilcVar = new ilc();
        ilcVar.setArguments(bundle);
        afpu.e(ilcVar, affdVar);
        dd ddVar = this.e;
        av avVar = new av(ddVar);
        avVar.s(R.anim.fragment_fade_in, R.anim.fragment_fade_out, 0);
        cc ccVarF = ddVar.f(R.id.fragment_container);
        if (ccVarF != null) {
            avVar.k(ccVarF);
        }
        String str2 = goa.PLAYLIST_FILTER_SEARCH_INPUT.j;
        avVar.g(R.id.fragment_container, ilcVar, str2, 1);
        avVar.o(str2);
        avVar.a(false, true);
        ddVar.ah();
    }

    @Override // defpackage.rpq
    public final void i(wnq wnqVar) {
        apzh apzhVar = wnqVar.c;
        ajwo ajwoVar = null;
        if (apzhVar == null || (apzhVar.b & SemanticState.Hidden) == 0) {
            this.q.h(wnqVar, null, new rqb(this.k));
            return;
        }
        rqa rqaVar = this.q;
        ajue ajueVar = apzhVar.g;
        if (ajueVar == null) {
            ajueVar = ajue.b;
        }
        arbj arbjVar = apzhVar.h;
        if (arbjVar == null) {
            arbjVar = arbj.a;
        }
        if ((apzhVar.b & 2) != 0 && (ajwoVar = apzhVar.c) == null) {
            ajwoVar = ajwo.a;
        }
        rqaVar.i(ajueVar, arbjVar, ajwoVar, new rqb(this.k));
    }

    @Override // defpackage.gfp
    public final void j(ajwo ajwoVar, Map map) {
        alxr alxrVar = alxr.SEARCH_PAGE_TYPE_LANDING;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        alxr alxrVarA = alxr.a(((apng) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d);
        if (alxrVarA == null) {
            alxrVarA = alxr.SEARCH_PAGE_TYPE_UNKNOWN;
        }
        if (alxrVar == alxrVarA) {
            this.c.c = "FEsearch";
        }
        this.j.d();
        gnz gnzVar = this.g;
        ahno.F(fhz.aj(ajwoVar));
        if (map == null) {
            map = agpn.b;
        }
        if (fhz.af(ajwoVar).isEmpty()) {
            gnzVar.g(ajwoVar, map);
        } else {
            hel helVar = new hel(ajwoVar);
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apni.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apng apngVar = (apng) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            aihl aihlVar = apnd.b;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            apngVar.c(aihlVarCheckIsLite3);
            if (apngVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                apngVar.c(aihlVarCheckIsLite4);
                Object objK3 = apngVar.j.k(aihlVarCheckIsLite4.d);
                helVar.a = ((alxu) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).toByteArray();
            } else if (map.containsKey("searchbox_stats_bytes")) {
                Object obj = map.get("searchbox_stats_bytes");
                if (obj instanceof byte[]) {
                    helVar.a = (byte[]) obj;
                }
            }
            helVar.m = map;
            gnzVar.e(helVar);
        }
        this.d.j(false);
    }

    @Override // defpackage.gfp
    public final void k(hel helVar) {
        this.j.d();
        this.g.e(helVar);
        this.d.j(false);
    }

    @Override // defpackage.gfp
    public final void l(String str, Map map) {
        q(str, null, map);
    }

    @Override // defpackage.gfp
    public final void m(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apzq.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        int iQ = aext.q(((apzq) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
        if (iQ == 0 || iQ != 24) {
            return;
        }
        dd ddVar = this.e;
        ddVar.ah();
        new iwj().gT(ddVar, null);
    }

    @Override // defpackage.gfp
    public final void n(ajwo ajwoVar) {
        this.j.d();
        this.g.f(ajwoVar);
    }

    @Override // defpackage.gfp
    public final void o(byte[] bArr, String str, int i) {
        this.j.d();
        gnz gnzVar = this.g;
        if (gnzVar.b() == null) {
            jmg.m(bArr, str, i).h(gnzVar.b, goa.VOICE_SEARCH.j);
        }
        this.d.j(false);
    }

    @Override // defpackage.gfp
    public final void p(ins insVar) {
        this.j.d();
        agkj agkjVarK = agkj.k("hide_search_back_action", Boolean.valueOf(insVar.b), "default_search_tab_id", insVar.c);
        String str = goa.SEARCH.j;
        gnz gnzVar = this.g;
        dd ddVar = gnzVar.b;
        ddVar.ae(str, -1, 1);
        if (gnzVar.d.l(0, 45712947L, false)) {
            ddVar.ae(goa.SEARCH_LANDING_PAGE.j, -1, 1);
        }
        gnzVar.g(insVar.a, agkjVarK);
        this.d.j(false);
    }
}
