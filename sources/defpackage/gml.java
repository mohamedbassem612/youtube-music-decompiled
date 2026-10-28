package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.bluetooth.BluetoothA2dpService;
import com.google.android.apps.youtube.music.deeplink.MusicServiceDeepLinkActivity;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gml implements zza {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public gml(Object obj, Uri uri, int i) {
        this.$cid = i;
        this.a = uri;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, zza] */
    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        int i = 3;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                ajwo ajwoVar = ((alsv) obj).d;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                ((Executor) ((BluetoothA2dpService) this.b).h.io()).execute(afwl.i(new fuc(this, ajwoVar, i)));
                break;
            case 1:
                alsv alsvVar = (alsv) obj;
                ajwo ajwoVar2 = alsvVar.d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                ajwp ajwpVar = ajwoVar2.e;
                if (ajwpVar == null) {
                    ajwpVar = ajwp.a;
                }
                aihl aihlVar = apkn.a;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                ajwpVar.c(aihlVarCheckIsLite);
                if (ajwpVar.j.n(aihlVarCheckIsLite.d)) {
                    ajwp ajwpVar2 = ajwoVar2.e;
                    if (ajwpVar2 == null) {
                        ajwpVar2 = ajwp.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    ajwpVar2.c(aihlVarCheckIsLite2);
                    Object objK = ajwpVar2.j.k(aihlVarCheckIsLite2.d);
                    String str = ((apkm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b;
                    ajwp ajwpVar3 = ajwoVar2.e;
                    if (ajwpVar3 == null) {
                        ajwpVar3 = ajwp.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                    ajwpVar3.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwpVar3.j.k(aihlVarCheckIsLite3.d);
                    byte[] bArrDecode = Base64.decode(((apkm) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).c, 8);
                    aihh aihhVar = (aihh) ajwoVar2.toBuilder();
                    aigj aigjVarV = aigj.v(bArrDecode);
                    aihhVar.copyOnWrite();
                    ajwo ajwoVar3 = (ajwo) aihhVar.instance;
                    aigjVarV.getClass();
                    ajwoVar3.b |= 1;
                    ajwoVar3.c = aigjVarV;
                    ajwoVar2 = (ajwo) aihhVar.build();
                    aihf builder = alsvVar.toBuilder();
                    builder.copyOnWrite();
                    alsv alsvVar2 = (alsv) builder.instance;
                    ajwoVar2.getClass();
                    alsvVar2.d = ajwoVar2;
                    alsvVar2.b |= 2;
                    alsvVar = (alsv) builder.build();
                    ((abea) ((get) this.b).ac.io()).n(new abec(str, null));
                }
                agrf agrfVar = get.a;
                Object obj2 = this.a;
                if (kro.ak(ajwoVar2)) {
                    kro.aj(ajwoVar2);
                }
                if ((alsvVar.b & 2) != 0) {
                    boolean zA = fhz.A(ajwoVar2);
                    Object obj3 = this.b;
                    if (zA) {
                        fhz.z(ajwoVar2);
                        afwl.m(((get) obj3).bh, sxy.a(Uri.parse(fhz.y(ajwoVar2))));
                    } else {
                        ((vxe) ((get) obj3).bM.io()).c(ajwoVar2, null);
                    }
                } else {
                    afwl.m(((get) this.b).bh, sxy.a((Uri) obj2));
                }
                if ((alsvVar.b & 4) != 0) {
                    vxe vxeVar = (vxe) ((get) this.b).bM.io();
                    ajwo ajwoVar4 = alsvVar.e;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    vxeVar.a(ajwoVar4);
                }
                break;
            case 2:
                gtj gtjVar = (gtj) this.a;
                alwi alwiVar = (alwi) obj;
                if (!gtjVar.a.isFinishing()) {
                    gtjVar.c.c(new gsc());
                    if (gtjVar.f.m(202, 45730721L)) {
                        for (ajwo ajwoVar5 : alwiVar.c) {
                            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajmj.a);
                            ajwoVar5.c(aihlVarCheckIsLite4);
                            if (ajwoVar5.j.n(aihlVarCheckIsLite4.d)) {
                                aihh aihhVar2 = (aihh) ajwoVar5.toBuilder();
                                Object obj4 = this.b;
                                aihl aihlVar2 = aoaq.b;
                                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar2);
                                aihi aihiVar = (aihi) obj4;
                                aihiVar.c(aihlVarCheckIsLite5);
                                Object objK3 = aihiVar.j.k(aihlVarCheckIsLite5.d);
                                aihhVar2.e(aihlVar2, (aoar) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3)));
                                aigj aigjVar = ((ajwo) obj4).c;
                                aihhVar2.copyOnWrite();
                                ajwo ajwoVar6 = (ajwo) aihhVar2.instance;
                                aigjVar.getClass();
                                ajwoVar6.b |= 1;
                                ajwoVar6.c = aigjVar;
                                ajwoVar5 = (ajwo) aihhVar2.build();
                            }
                            gtjVar.d.a(ajwoVar5);
                        }
                    } else {
                        gtjVar.d.b(alwiVar.c);
                    }
                    gtjVar.g.l(true);
                }
                break;
            case 3:
                alsv alsvVar3 = (alsv) obj;
                hax haxVar = (hax) this.b;
                Runnable runnable = haxVar.g;
                if (runnable != null) {
                    haxVar.e.removeCallbacks(runnable);
                }
                haxVar.f.h(3);
                ajwo ajwoVar7 = alsvVar3.d;
                if (ajwoVar7 == null) {
                    ajwoVar7 = ajwo.a;
                }
                if ((alsvVar3.b & 2) != 0) {
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(araw.a);
                    ajwoVar7.c(aihlVarCheckIsLite6);
                    if (ajwoVar7.j.n(aihlVarCheckIsLite6.d)) {
                        MusicServiceDeepLinkActivity musicServiceDeepLinkActivity = haxVar.a;
                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(araw.a);
                        ajwoVar7.c(aihlVarCheckIsLite7);
                        Object objK4 = ajwoVar7.j.k(aihlVarCheckIsLite7.d);
                        afwl.m(musicServiceDeepLinkActivity, sxy.a(Uri.parse(((arav) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4))).c)));
                    } else {
                        HashMap map = new HashMap();
                        map.put("com.google.android.libraries.youtube.logging.interaction_logger", haxVar.b);
                        haxVar.c.c(ajwoVar7, map);
                    }
                } else {
                    afwl.m(haxVar.a, sxy.a((Uri) this.a));
                }
                break;
            case 4:
                alsv alsvVar4 = (alsv) obj;
                abi abiVar = (abi) this.b;
                Object obj5 = abiVar.d;
                if (obj5 != null && ((Uri) this.a).equals(obj5)) {
                    ?? r8 = abiVar.a;
                    if (r8 != 0) {
                        r8.a(alsvVar4);
                        abiVar.a = null;
                        abiVar.a();
                    } else {
                        abiVar.e = alsvVar4;
                    }
                    break;
                }
                break;
            case 5:
                Object obj6 = this.a;
                Object obj7 = ((adtv) obj6).ae;
                acjy acjyVar = (acjy) obj;
                if (obj7 != null) {
                    tbt tbtVar = ((ikf) obj6).a;
                    Object obj8 = this.b;
                    boolean z2 = acjyVar.b() != null;
                    if (obj8 != acjw.b && obj8 != acjw.h) {
                        z = false;
                    }
                    tbtVar.d(obj7, new adtk((acjw) obj8, z2, z), false);
                }
                break;
            case 6:
                abvc abvcVar = (abvc) ((WatchFragment) this.a).Q.io();
                abnk abnkVar = new abnk();
                abnkVar.a = ((wgi) obj).d;
                abvcVar.h(abnkVar.a(), (abnp) this.b);
                break;
            case 7:
                for (wnq wnqVar : ((ovo) obj).i()) {
                    if (wnqVar.k()) {
                        String strI = wnqVar.i();
                        Object obj9 = this.b;
                        if (strI.equals(obj9)) {
                            this.a.b(obj9, wnqVar);
                            break;
                        }
                    }
                }
                break;
            case 8:
                wra wraVar = new wra((alnp) obj, 1);
                ((wne) this.a).b(wraVar);
                this.b.a(wraVar);
                break;
            case 9:
                acrx acrxVar = (acrx) obj;
                ((acur) this.a).b.A((ajwo) this.b, (alqc) acrxVar.b, acrxVar.a);
                break;
            default:
                ((aelk) this.a).d(this.b, (almv) obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) BluetoothA2dpService.a.c()).j(toeVar)).k("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService$1", "onErrorResponse", 300, "BluetoothA2dpService.java")).w("Failed to resolve URI: %s", this.a);
                break;
            case 1:
                if (!(toeVar.getCause() instanceof CancellationException)) {
                    tuk.n(((get) this.b).bh, R.string.url_resolver_failed, 1);
                }
                break;
            case 2:
                gtj gtjVar = (gtj) this.a;
                if (!gtjVar.a.isFinishing()) {
                    jin jinVar = gtjVar.e;
                    ttm ttmVar = gtjVar.b;
                    jio jioVarE = jin.e();
                    ((jik) jioVarE).k(ttmVar.b(toeVar));
                    jinVar.d(jioVarE.b());
                }
                break;
            case 3:
                hax haxVar = (hax) this.b;
                Runnable runnable = haxVar.g;
                if (runnable != null) {
                    haxVar.e.removeCallbacks(runnable);
                }
                if (!(toeVar.getCause() instanceof CancellationException)) {
                    tuk.n(haxVar.a, R.string.music_error_generic, 0);
                }
                haxVar.a.finish();
                break;
            case 4:
                abi abiVar = (abi) this.b;
                Object obj = abiVar.d;
                if (obj != null && ((Uri) this.a).equals(obj)) {
                    ?? r4 = abiVar.a;
                    if (r4 == 0) {
                        abiVar.c = toeVar;
                    } else {
                        r4.jj(toeVar);
                        abiVar.a = null;
                        abiVar.a();
                    }
                    break;
                }
                break;
            case 5:
            case 7:
                break;
            case 6:
                ((WatchFragment) this.a).q.e(toeVar);
                break;
            case 8:
                this.b.jj(toeVar);
                break;
            case 9:
                ((acur) this.a).b.D("", toeVar, (ajwo) this.b);
                break;
            default:
                ((aelk) this.a).a.e(toeVar);
                aelj aeljVar = (aelj) tym.U(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag", aelj.class);
                if (aeljVar != null) {
                    aeljVar.e();
                }
                break;
        }
    }

    public gml(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }

    public gml(String str, sxu sxuVar, int i) {
        this.$cid = i;
        this.b = str;
        this.a = sxuVar;
    }

    public gml(wne wneVar, zza zzaVar, int i) {
        this.$cid = i;
        this.a = wneVar;
        this.b = zzaVar;
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
