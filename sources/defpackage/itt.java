package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.api.innertube.InnertubeGetAssetService$GetAssetResponse;
import j$.util.Collection;
import j$.util.Optional;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class itt implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ itt(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r9v100, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object, rmw] */
    /* JADX WARN: Type inference failed for: r9v52, types: [java.lang.Object, zza] */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        String str;
        awmd awmdVar;
        int i = 4;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                this.b.b(null, agke.q(zBooleanValue ? fhz.P(((itu) obj2).b.getString(R.string.playlist_deleted_msg)) : fhz.P(((itu) obj2).b.getString(R.string.sideloaded_playlist_delete_error))));
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    ((ijl) this.a).au.b((String) this.b);
                }
                break;
            case 2:
                iwl iwlVar = (iwl) obj;
                wer werVarE = ((iwo) this.a).a.c().e();
                anme anmeVarE = anmg.e(((anmi) this.b).c);
                anmeVarE.am(a.bw(iwlVar.f));
                anmeVarE.an(a.bw(iwlVar.e));
                werVarE.m(anmeVarE);
                werVarE.b().s().D();
                break;
            case 3:
                allk allkVar = (allk) obj;
                ?? r0 = this.b;
                if (allkVar == null) {
                    r0.jj(new toe(new NullPointerException("Voice Search Continuation Response is null")));
                } else {
                    Object obj3 = this.a;
                    r0.a(new jlv(allkVar));
                    ((jlw) obj3).a.a(allkVar);
                }
                break;
            case 4:
                almo almoVar = (almo) obj;
                almoVar.getClass();
                int i3 = almoVar.b & 8;
                Object obj4 = this.a;
                if (i3 == 0) {
                    aisc aiscVar = almoVar.e;
                    if (aiscVar == null) {
                        aiscVar = aisc.b;
                    }
                    if (aiscVar.c) {
                        abzi abziVar = (abzi) obj4;
                        tuk.n((Context) abziVar.a, rlh.c((ajqf) this.b, (vxz) abziVar.h), 1);
                    }
                    if ((almoVar.b & 2) != 0) {
                        ?? r9 = ((abzi) obj4).f;
                        ajwo ajwoVar = almoVar.d;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        r9.a(ajwoVar);
                    }
                } else {
                    almn almnVar = almoVar.f;
                    if (almnVar == null) {
                        almnVar = almn.a;
                    }
                    alay alayVar = almnVar.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    abzi abziVar2 = (abzi) obj4;
                    abziVar2.d.d(ackj.k(null, alayVar, null, false).toString());
                    if (almoVar.g.size() > 0) {
                        abziVar2.f.b(almoVar.g);
                    }
                }
                break;
            case 5:
                affd affdVar = (affd) obj;
                if (affdVar != null) {
                    Object obj5 = this.b;
                    Optional optionalJ = ((rky) this.a).e.J(affdVar);
                    rbj rbjVar = new rbj(obj5, 13);
                    optionalJ.isPresent();
                    Object obj6 = optionalJ.get();
                    aiqi aiqiVar = ((apzh) rbjVar.a).i;
                    if (aiqiVar == null) {
                        aiqiVar = aiqi.a;
                    }
                    ((aesp) obj6).e(aiqiVar);
                }
                break;
            case 6:
                tld tldVar = (tld) obj;
                ((rlw) this.a).c((WeakReference) this.b, new xsc(tldVar.b, tldVar.a, agpn.b, (boolean[]) null));
                break;
            case 7:
                wnq wnqVar = (wnq) this.b;
                ((rrq) ((vgi) this.a).a).b.r(new rmv(wnqVar.g(), wnqVar));
                break;
            case 8:
                Long l = (Long) obj;
                Object obj7 = this.a;
                if (l != null && ((akza) this.b).e == l.longValue()) {
                    roe roeVar = (roe) obj7;
                    roeVar.b.j(1);
                    roeVar.o(true);
                } else {
                    ((roe) obj7).h.setVisibility(0);
                }
                break;
            case 9:
                Object obj8 = this.b;
                Object obj9 = this.a;
                ((rop) obj9).d.post(new rmx(obj9, obj8, (rlt) obj, 4, null));
                break;
            case 10:
                sve sveVar = (sve) this.a;
                alnj alnjVar = (alnj) obj;
                if (((vxz) sveVar.e).l(16, 45766495L, false)) {
                    Object obj10 = sveVar.f;
                    alnjVar.getClass();
                    ((awly) ((lqa) obj10).a).kk(alnjVar);
                }
                this.b.a(alnjVar);
                break;
            case 11:
                alof alofVar = (alof) obj;
                xte xteVar = (xte) this.a;
                Object obj11 = xteVar.f;
                if (((cc) obj11).isAdded()) {
                    ((sud) obj11).i();
                }
                if ((alofVar.b & 2) != 0) {
                    ?? r1 = xteVar.e;
                    ajwo ajwoVar2 = alofVar.d;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    r1.a(ajwoVar2);
                }
                if ((alofVar.b & 8) != 0) {
                    xteVar.b.hB().d(new xgj(alofVar.e, (amud) null));
                }
                yhi yhiVar = (yhi) this.b;
                akal akalVar = ((aldt) yhiVar.b).c;
                if (akalVar == null) {
                    akalVar = akal.a;
                }
                ajwn ajwnVar = akalVar.d;
                if (ajwnVar == null) {
                    ajwnVar = ajwn.a;
                }
                nsh.h(((stz) yhiVar.a).c.a, ajwnVar);
                break;
            case 12:
                alof alofVar2 = (alof) obj;
                sxc sxcVar = (sxc) this.a;
                sud sudVar = sxcVar.a;
                if (sudVar.isAdded()) {
                    sudVar.i();
                }
                if ((alofVar2.b & 2) != 0) {
                    ?? r2 = sxcVar.b;
                    ajwo ajwoVar3 = alofVar2.d;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    r2.a(ajwoVar3);
                }
                if ((alofVar2.b & 8) != 0) {
                    sxcVar.e.hB().d(new xgj(alofVar2.e, (amud) null));
                }
                akaj akajVar = (akaj) this.b;
                if ((akajVar.c & 8) != 0) {
                    ?? r10 = sxcVar.b;
                    ajwo ajwoVar4 = akajVar.h;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    r10.a(ajwoVar4);
                }
                break;
            case 13:
                tnx tnxVar = (tnx) obj;
                ?? r3 = this.b;
                if (tnxVar != null) {
                    if (!tnxVar.h()) {
                        if (!r3.D()) {
                            r3.y(tnxVar.a().a);
                        }
                    } else if (!((tir) this.a).a.I() || !r3.D()) {
                        r3.ad(tnxVar.c().a);
                    }
                } else if (!r3.D()) {
                    r3.y(new toe("Null response"));
                }
                break;
            case 14:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj12 = this.b;
                if (!zBooleanValue2) {
                    ((agrc) ((agrc) uql.a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "deleteSticker", 933, "MediaEngineEffectsController.java")).w("Failed to delete asset %s", ((File) obj12).getAbsolutePath());
                } else {
                    ((uql) this.a).h.execute(afwl.i(new tpo(i)));
                    ((File) obj12).getAbsolutePath();
                }
                break;
            case 15:
                Object obj13 = this.a;
                InnertubeGetAssetService$GetAssetResponse innertubeGetAssetService$GetAssetResponse = (InnertubeGetAssetService$GetAssetResponse) obj;
                yhi yhiVar2 = (yhi) obj13;
                vae vaeVar = (vae) yhiVar2.b;
                if (vaeVar.c == null) {
                    zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]GetAssetResponse received but xenoEffectsLoader is null.");
                } else {
                    Object obj14 = this.b;
                    Optional optionalFindFirst = Collection.EL.stream(innertubeGetAssetService$GetAssetResponse.d).filter(new uso(obj14, 11)).findFirst();
                    if (!optionalFindFirst.isPresent()) {
                        if (vaeVar.n != null) {
                            Object obj15 = yhiVar2.a;
                        }
                        uys uysVar = vaeVar.c;
                        agkj agkjVar = agpn.b;
                        Object obj16 = yhiVar2.a;
                        String str2 = (String) obj14;
                        uysVar.c(str2, innertubeGetAssetService$GetAssetResponse, agkjVar, new usf(obj13, 10));
                        vaeVar.v(str2);
                    } else {
                        int iBt = a.bt(((ajhu) optionalFindFirst.get()).c);
                        if (iBt == 0) {
                            iBt = 1;
                        }
                        int i4 = iBt - 1;
                        if (i4 == 0) {
                            str = "Unknown error";
                        } else if (i4 == 1) {
                            str = "Invalid asset ID";
                        } else if (i4 == 2) {
                            str = "Asset not found";
                        } else if (i4 != 3) {
                            str = i4 != 4 ? "Invalid argument" : "Invalid source ID";
                        } else {
                            str = "Server failure";
                        }
                        yhiVar2.d(new RuntimeException(str));
                    }
                }
                break;
            case 16:
                allm allmVar = (allm) obj;
                byte[] bArr = ((wkf) this.b).g;
                Object obj17 = this.a;
                if (allmVar == null || (allmVar.b & 2) == 0) {
                    zvp.a(zvn.b, zvm.m, "Received an empty response without a challenge.");
                    yno.eW(2, ((vwb) obj17).g);
                } else {
                    String str3 = allmVar.d;
                    if (!yno.eM(str3)) {
                        ((vwb) obj17).a(str3, null, bArr);
                    } else {
                        vwb vwbVar = (vwb) obj17;
                        vwbVar.f.f(yno.eK(str3), agkj.j("atr_challenge", str3), new abzl(vwbVar, str3, bArr, i2));
                    }
                }
                break;
            case 17:
                altm altmVar = (altm) obj;
                if (altmVar.c && altmVar.d.size() > 0 && (awmdVar = ((wrk) this.a).a) != null) {
                    ((vxe) awmdVar.io()).e(altmVar.d, this.b);
                    break;
                }
                break;
            case 18:
                alww alwwVar = (alww) obj;
                ?? r4 = this.a;
                if (r4 instanceof srz) {
                    srz srzVar = (srz) r4;
                    aigj aigjVarA = vxg.a((ajwo) this.b);
                    if ((alwwVar.b & 8) != 0) {
                        srzVar.a.m(new xgj(alwwVar.e, (amud) null), new xgj(aigjVarA, (amud) null));
                    }
                }
                r4.a(alwwVar);
                break;
            case 19:
                ((wvw) this.a).e.remove(this.b);
                break;
            default:
                acjy acjyVar = (acjy) obj;
                Object obj18 = this.a;
                wxr wxrVar = ((wxa) obj18).e.e;
                if (wxrVar != null) {
                    wxrVar.m();
                }
                ?? r11 = this.b;
                if (r11 != 0) {
                    r11.run();
                }
                amqm amqmVar = (amqm) acjyVar.b();
                if (amqmVar != null) {
                    ((wxe) obj18).v(amqmVar);
                }
                break;
        }
    }

    public /* synthetic */ itt(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
