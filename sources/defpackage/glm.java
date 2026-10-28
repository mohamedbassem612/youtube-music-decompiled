package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class glm implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ glm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, sxt] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, ttm] */
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
    @Override // defpackage.twi
    public final void a(Object obj) {
        gpl gplVar;
        agke agkeVarG;
        LoadingFrameLayout loadingFrameLayout;
        int i = 4;
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                gls glsVar = (gls) obj2;
                aunn aunnVar = glsVar.c;
                ListenableFuture listenableFutureAr = ahno.ar(((kyr) aunnVar.io()).E(7), new gmv(obj2, i5), glsVar.f);
                glo gloVar = new glo(i3);
                gln glnVar = new gln(obj2, i5);
                ahey aheyVar = glsVar.e;
                taf.i(listenableFutureAr, aheyVar, gloVar, glnVar, null);
                taf.i(((kyr) aunnVar.io()).E(2), aheyVar, new glo(i5), new gln(obj2, i4), null);
                int dimension = (int) glsVar.b.getResources().getDimension(R.dimen.audio_preview_album_art_width_height);
                kyr kyrVar = (kyr) aunnVar.io();
                taf.i(ahno.ar(((afkb) kyrVar.a).a(), new zzw(dimension, dimension, 1), kyrVar.b), aheyVar, new glo(i4), new gln(obj2, i3), null);
                return;
            case 1:
                Throwable th = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) gls.a.b().i(agso.a, "AudioPreview")).j(th)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "init", 275, "AudioPreviewPlayerActivityPeer.java")).B("Failed to set data source using MediaMetadataRetriever: %s with exception: %s", ((gls) this.a).j, th);
                return;
            case 2:
                boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
                Object obj3 = this.a;
                if (zEquals) {
                    gny gnyVar = (gny) obj3;
                    ajnf ajnfVarJ = gnyVar.b.j();
                    if (ajnfVarJ != null && (gplVar = gnyVar.j) != null && gplVar.ao == gpm.c && gplVar.w.isPresent()) {
                        ((jav) gplVar.w.get()).l(ajnfVarJ);
                    }
                }
                ((gny) obj3).b.m();
                return;
            case 3:
                Optional optional = (Optional) obj;
                if (optional == null || !optional.isPresent()) {
                    return;
                }
                Object obj4 = this.a;
                annv annvVar = (annv) optional.get();
                if (annvVar.h().isEmpty()) {
                    gny gnyVar2 = (gny) obj4;
                    Map map = gnyVar2.h;
                    if (map.containsKey("PPSV")) {
                        gnyVar2.c.c(new vvt(map.get("PPSV")));
                    }
                }
                if (annvVar.f().isEmpty()) {
                    gny gnyVar3 = (gny) obj4;
                    Map map2 = gnyVar3.h;
                    if (map2.containsKey("PPSE")) {
                        gnyVar3.c.c(new vvt(map2.get("PPSE")));
                    }
                }
                if (annvVar.h().isEmpty() && annvVar.k().isEmpty() && annvVar.f().isEmpty() && annvVar.g().isEmpty() && annvVar.e().isEmpty() && annvVar.j().isEmpty()) {
                    annw annwVar = annvVar.d;
                    if (annwVar.h.size() == 0) {
                        agkeVarG = agpi.a;
                    } else {
                        agjz agjzVar = new agjz(4);
                        Iterator it = annwVar.h.iterator();
                        while (it.hasNext()) {
                            weh wehVarD = annvVar.c.d((String) it.next());
                            if (wehVarD != null) {
                                if (!(wehVarD instanceof anjx)) {
                                    throw new IllegalArgumentException(a.cs(wehVarD, "Entity ", " is not a MusicAlbumReleaseEntityModel"));
                                }
                                agjzVar.h((anjx) wehVarD);
                            }
                        }
                        agkeVarG = agjzVar.g();
                    }
                    if (agkeVarG.isEmpty()) {
                        ((gny) obj4).j.R(true, 1);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        int iAS = a.aS(((aqcm) it2.next()).c);
                        if (iAS == 0) {
                            iAS = 1;
                        }
                        if (iAS == 3) {
                            ((gox) this.a).am = true;
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                Object obj5 = this.a;
                gpl gplVar2 = (gpl) obj5;
                if (gplVar2.isHidden() || !gplVar2.ae()) {
                    return;
                }
                jio jioVarE = jin.e();
                jik jikVar = (jik) jioVarE;
                jikVar.i(-2);
                cc ccVar = (cc) obj5;
                jikVar.k(ccVar.getContext().getText(R.string.downloads_call_to_action_for_slow_network));
                jioVarE.l(ccVar.getContext().getText(R.string.action_view), new jn(obj5, 12, null));
                gplVar2.au.d(jioVarE.b());
                gplVar2.e.l(new xgj(xhb.b(269407)));
                return;
            case 6:
                String str = (String) obj;
                if (str != null) {
                    ?? r14 = this.a;
                    Intent intent = (Intent) new aeiv((byte[]) null, (byte[]) null).A().b;
                    intent.setData(Uri.parse(str));
                    ((gsq) r14).a.b(intent, 2300, r14);
                    return;
                }
                return;
            case 7:
                wkf wkfVar = (wkf) obj;
                if (wkfVar instanceof woo) {
                    ((woo) wkfVar).K(new gmk(this.a, i2));
                    return;
                }
                return;
            case 8:
                ((gwl) this.a).e((Throwable) obj);
                return;
            case 9:
                ((gyw) this.a).d((String) obj);
                return;
            case 10:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    Object obj6 = this.a;
                    toe toeVarZ = taq.z(th2);
                    jio jioVarE2 = jin.e();
                    gyy gyyVar = (gyy) obj6;
                    ((jik) jioVarE2).k(gyyVar.c.b(toeVarZ));
                    gyyVar.g.d(jioVarE2.b());
                    if (gyyVar.d(gyyVar.d)) {
                        gyyVar.d.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                gyz gyzVar = (gyz) this.a;
                tuk.o(gyzVar.b, gyzVar.c.b((Throwable) obj), 1);
                return;
            case 12:
                amax amaxVar = (amax) obj;
                gyz gyzVar2 = (gyz) this.a;
                if (gyzVar2.b.isFinishing()) {
                    return;
                }
                ajwo ajwoVarE = nsg.e(amaxVar);
                vxe vxeVar = gyzVar2.a;
                if (ajwoVarE == null) {
                    ajwoVarE = vxh.a("FEmusic_home");
                }
                vxeVar.c(ajwoVarE, null);
                return;
            case 13:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((hdj) this.a).t(th3, Optional.empty());
                    return;
                }
                return;
            case 14:
                alwg alwgVar = (alwg) obj;
                Object obj7 = this.a;
                if (alwgVar == null || !hdj.E(alwgVar)) {
                    ((hdj) obj7).t(new Throwable(), Optional.empty());
                    return;
                }
                hdj hdjVar = (hdj) obj7;
                hdjVar.A(alwgVar);
                ajwo ajwoVarM = hdjVar.m();
                if (ajwoVarM != null) {
                    hdjVar.z.D(xhb.a(189660), xgu.a, ajwoVarM);
                }
                hdjVar.q(alwgVar);
                alcw alcwVar = hdjVar.s;
                if ((alcwVar.b & 1) != 0) {
                    YouTubeTextView youTubeTextView = hdjVar.m;
                    if (youTubeTextView != null) {
                        alay alayVar = alcwVar.c;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        youTubeTextView.setText(ackj.k(null, alayVar, null, false));
                    }
                    ViewGroup viewGroup = hdjVar.l;
                    if (viewGroup != null) {
                        viewGroup.setOnClickListener(new hdf(obj7, i3));
                        hdjVar.l.setVisibility(0);
                        bac.n(hdjVar.l, bby.a, hdjVar.getString(R.string.accessibility_go_back), null);
                    }
                }
                jbm jbmVar = hdjVar.r;
                if (jbmVar != null && hdjVar.q != null) {
                    adly adlyVar = new adly();
                    aihh aihhVar = (aihh) ajnf.a.createBuilder();
                    aihh aihhVar2 = (aihh) alja.a.createBuilder();
                    aliz alizVar = aliz.HELP;
                    aihhVar2.copyOnWrite();
                    alja aljaVar = (alja) aihhVar2.instance;
                    aljaVar.c = alizVar.yN;
                    aljaVar.b |= 1;
                    aihhVar.copyOnWrite();
                    ajnf ajnfVar = (ajnf) aihhVar.instance;
                    alja aljaVar2 = (alja) aihhVar2.build();
                    aljaVar2.getClass();
                    ajnfVar.f = aljaVar2;
                    ajnfVar.e = 8;
                    jbmVar.hU(adlyVar, (ajnf) aihhVar.build());
                    hdjVar.q.setContentDescription(((cc) obj7).getContext().getString(R.string.pref_send_feedback));
                }
                hdjVar.x();
                hdjVar.y();
                hdjVar.v();
                hdjVar.w();
                hdjVar.u();
                ggd ggdVar = hdjVar.u;
                if (ggdVar != null) {
                    ggdVar.b();
                }
                ggd ggdVar2 = hdjVar.v;
                if (ggdVar2 != null) {
                    ggdVar2.b();
                    return;
                }
                return;
            case 15:
                Optional optional2 = (Optional) obj;
                if (optional2 != null) {
                    Object obj8 = this.a;
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    gtr gtrVar = new gtr(obj8, atomicBoolean, i2);
                    if (true == optional2.isPresent()) {
                        Object obj9 = optional2.get();
                        Object obj10 = gtrVar.a;
                        Object obj11 = gtrVar.b;
                        Optional optionalQ = hpb.q((weh) obj9);
                        gtr gtrVar2 = new gtr(obj10, obj11, i);
                        if (true == optionalQ.isPresent()) {
                            Object obj12 = optionalQ.get();
                            Object obj13 = gtrVar2.a;
                            Object obj14 = gtrVar2.b;
                            anxf anxfVar = (anxf) obj12;
                            String str2 = anxfVar.c;
                            hmn hmnVar = ((hmk) obj13).b.j;
                            hmnVar.a(str2);
                            String str3 = anxfVar.d;
                            if (!TextUtils.isEmpty(str3)) {
                                jin jinVar = hmnVar.e;
                                cf cfVar = hmnVar.a;
                                jio jioVarE3 = jin.e();
                                ((jik) jioVarE3).k(cfVar.getText(R.string.remove_smart_download_container_message));
                                jioVarE3.l(cfVar.getText(R.string.undo), new gdp(hmnVar, str3, 6));
                                jinVar.d(jioVarE3.b());
                                ((AtomicBoolean) obj14).set(true);
                            }
                        }
                    }
                    if (atomicBoolean.get()) {
                        return;
                    }
                    ((hmk) obj8).b.b();
                    return;
                }
                return;
            case 16:
                Throwable th4 = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) hot.ae.b().i(agso.a, "OfflinePlDetailFragment")).j(th4)).k("com/google/android/apps/youtube/music/offline/browse/OfflinePlaylistDetailPageFragment", "load", (char) 151, "OfflinePlaylistDetailPageFragment.java")).t("Error during MusicDownloadsResponseGenerationBlock response processing");
                if (th4 != null) {
                    ((hot) this.a).I(th4);
                    return;
                }
                return;
            case 17:
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                hwg hwgVar = (hwg) this.a;
                if (hwgVar.i()) {
                    hwgVar.n.d(new igt(14));
                    i3 = true == hwgVar.w.l(95, 45762151L, false) ? 1 : 2;
                    cf cfVar2 = hwgVar.h;
                    aefk aefkVarB = aefl.b();
                    aefkVarB.c = cfVar2.getString(R.string.tooltip_double_tap_like);
                    aefkVarB.o(1);
                    aefkVarB.a = hwgVar.c();
                    aefkVarB.l(i3);
                    hwgVar.q = aefkVarB.c();
                    hwgVar.d.c(hwgVar.q);
                    return;
                }
                return;
            case 18:
                ((ijl) this.a).X((alxg) obj);
                return;
            case 19:
                Throwable th5 = (Throwable) obj;
                Object obj15 = this.a;
                jio jioVarE4 = jin.e();
                aczl aczlVar = (aczl) obj15;
                ?? r1 = aczlVar.e;
                ((jik) jioVarE4).k(r1.b(th5));
                ((jin) aczlVar.d).d(jioVarE4.b());
                ((tbt) aczlVar.a).c(new haz(false, r1.b(th5)));
                return;
            default:
                ioc iocVar = (ioc) this.a;
                iocVar.k();
                ((agrc) ((agrc) ((agrc) ioc.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/search/ui/SearchInputFragment", "performSearchSuggestionQuery", (char) 765, "SearchInputFragment.java")).t("Error fetching search suggestions");
                if (!iocVar.F.l(0, 45712947L, false) || (loadingFrameLayout = iocVar.v) == null || iocVar.getActivity() == null) {
                    return;
                }
                loadingFrameLayout.f(iocVar.getActivity().getResources().getString(R.string.entity_failed), true, false, false);
                return;
        }
    }
}
