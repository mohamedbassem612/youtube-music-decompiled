package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.google.android.libraries.youtube.composition.api.EmbedResult;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hhi implements aheh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public hhi(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [eug, java.lang.Object] */
    @Override // defpackage.aheh
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) hhj.a.b()).j(th)).k("com/google/android/apps/youtube/music/mediabrowser/consent/ConsentDialogFragmentPeer$2$1", "onFailure", (char) 138, "ConsentDialogFragmentPeer.java")).t("Failed to update user consent status.");
                new Intent().putExtra("get_consent_status", "error");
                Activity activity = (Activity) this.a;
                activity.setResult(0);
                ((hhj) ((ivx) this.b).a).b.dismiss();
                activity.finish();
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) gmy.a.c()).j(th)).k("com/google/android/apps/youtube/music/browse/BrowseController$2", "onFailure", (char) 253, "BrowseController.java")).t("Failed to load ghost response");
                Object obj = this.b;
                if (((hej) obj).g == hei.b) {
                    ((gmy) this.a).c((heh) obj);
                }
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) hnz.a.b().i(agso.a, "DefaultMusicAutoOffline")).j(th)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController$2", "onFailure", (char) 568, "DefaultMusicAutoOfflineController.java")).t("Failure to get MusicDownloadsLibraryEntity.");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) hnz.a.b().i(agso.a, "DefaultMusicAutoOffline")).j(th)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController$4", "onFailure", (char) 832, "DefaultMusicAutoOfflineController.java")).t("Failure to remove outdated smart downloaded single tracks.");
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) hsn.a.b().i(agso.a, "MusicSDTriggerEntityC")).j(th)).k("com/google/android/apps/youtube/music/offline/entitycontroller/MusicSmartDownloadTriggerEntityController$2", "onFailure", (char) 664, "MusicSmartDownloadTriggerEntityController.java")).t("Failure to remove outdated smart downloaded single tracks.");
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) hsn.a.b().i(agso.a, "MusicSDTriggerEntityC")).j(th)).k("com/google/android/apps/youtube/music/offline/entitycontroller/MusicSmartDownloadTriggerEntityController$3", "onFailure", (char) 812, "MusicSmartDownloadTriggerEntityController.java")).t("Failed to delete unrecommended smart download containers");
                break;
            case 6:
                if (!((oad) this.b).f) {
                    etx etxVar = oae.a;
                    this.a.e(new RuntimeException(th));
                }
                break;
            case 7:
                int i = onb.a;
                try {
                    Object obj2 = this.b;
                    Object obj3 = ((xgg) obj2).f;
                    Object obj4 = ((xgg) obj2).b;
                    agev agevVar = (agev) obj4;
                    Context context = (Context) obj3;
                    nsp.l(context, agevVar, (oip) this.a, (ayq) ((xgg) obj2).j);
                } catch (IOException unused) {
                    return;
                }
                break;
            case 8:
                th.getClass();
                ((uhf) this.a).a((CompositionProto$Composition) this.b, th);
                break;
            case 9:
                ((uld) this.b).t(ajtv.ERROR_LEVEL_ERROR, "Download fonts future failed.", th);
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) vll.a.b().i(agso.a, "DP.InfoProvider")).j(th)).k("com/google/android/libraries/youtube/dataplan/DefaultMobileDataPlanInfoProvider$1", "onFailure", (char) 175, "DefaultMobileDataPlanInfoProvider.java")).t("Failed to fetch CPID");
                ((vll) this.b).b.set(null);
                ((vlh) this.a).a();
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) vlk.a.b().i(agso.a, "DP.InfoProvider")).j(th)).k("com/google/android/libraries/youtube/dataplan/DefaultMobileDataPlanInfoProvider2$1", "onFailure", (char) 181, "DefaultMobileDataPlanInfoProvider2.java")).t("Failed to fetch CPID");
                ((vlk) this.b).d.set(null);
                ((vlh) this.a).a();
                break;
            default:
                WebView webView = ((aehd) this.a).i;
                if (webView != null) {
                    webView.loadUrl((String) this.b);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [eug, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, qxg] */
    /* JADX WARN: Type inference failed for: r1v13, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v21, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        eyl eylVar;
        agke agkeVarG;
        int i = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                Intent intent = new Intent();
                intent.putExtra("get_consent_status", "granted");
                Activity activity = (Activity) this.a;
                activity.setResult(-1, intent);
                ((hhj) ((ivx) this.b).a).b.dismiss();
                activity.finish();
                return;
            case 1:
                gnq gnqVar = (gnq) obj;
                Object obj2 = this.b;
                if (((hej) obj2).g == hei.b) {
                    heh hehVar = (heh) obj2;
                    hehVar.a = gnqVar.b;
                    hehVar.d = gnqVar.a;
                    ((gmy) this.a).c(hehVar);
                    return;
                }
                return;
            case 2:
                Optional optional = (Optional) obj;
                gtr gtrVar = new gtr(this, this.b, 10);
                if (true == optional.isPresent()) {
                    annv annvVar = (annv) ((weh) optional.get());
                    Stream.CC.concat(Collection.EL.stream(annvVar.j()), Collection.EL.stream(annvVar.i())).forEach(new hfo(gtrVar.a, gtrVar.b, 7, null));
                    return;
                }
                return;
            case 3:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return;
                }
                Set set = (Set) Collection.EL.stream(((annv) optional2.get()).k()).map(new hnv(i)).collect(Collectors.toCollection(new hcd(8)));
                HashSet hashSet = new HashSet();
                aihf aihfVarCreateBuilder = aofu.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aofu aofuVar = (aofu) aihfVarCreateBuilder.instance;
                aofuVar.b |= 1;
                aofuVar.c = "PPSDST";
                Collection.EL.stream(this.b).forEach(new hnw(this, (Object) set, (Object) hashSet, aihfVarCreateBuilder, 0));
                Object obj3 = this.a;
                try {
                    avnr.b((AtomicReference) ((hnz) obj3).h.a(hna.f((aofu) aihfVarCreateBuilder.build(), ((hnz) obj3).d.e())).ae());
                    break;
                } catch (aaob e) {
                    ((agrc) ((agrc) ((agrc) hnz.a.b().i(agso.a, "DefaultMusicAutoOffline")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController", "addNewSingleTracks", (char) 849, "DefaultMusicAutoOfflineController.java")).t("Failure saving smart downloaded single tracks");
                }
                set.removeAll(hashSet);
                Object obj4 = this.a;
                if (set.isEmpty()) {
                    return;
                }
                Collection.EL.stream(set).forEach(new gmk(obj4, 18));
                return;
            case 4:
                Optional optional3 = (Optional) obj;
                if (optional3.isEmpty()) {
                    return;
                }
                List list = (List) Collection.EL.stream(((annv) optional3.get()).k()).map(new hrn(11)).collect(Collectors.toCollection(new hcd(15)));
                ArrayList arrayList = new ArrayList();
                aihf aihfVarCreateBuilder2 = aofu.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aofu aofuVar2 = (aofu) aihfVarCreateBuilder2.instance;
                aofuVar2.b |= 1;
                aofuVar2.c = "PPSDST";
                Collection.EL.stream(this.b).forEach(new hnw(this, (Object) list, (Object) arrayList, aihfVarCreateBuilder2, 3));
                Object obj5 = this.a;
                try {
                    avnr.b((AtomicReference) ((hsn) obj5).o.a(hna.f((aofu) aihfVarCreateBuilder2.build(), ((hsn) obj5).f.e())).ae());
                    break;
                } catch (aaob e2) {
                    ((agrc) ((agrc) ((agrc) hsn.a.b().i(agso.a, "MusicSDTriggerEntityC")).j(e2)).k("com/google/android/apps/youtube/music/offline/entitycontroller/MusicSmartDownloadTriggerEntityController", "addNewSingleTracks", (char) 681, "MusicSmartDownloadTriggerEntityController.java")).t("Failure saving smart downloaded single tracks");
                }
                list.removeAll(arrayList);
                Object obj6 = this.a;
                if (list.isEmpty()) {
                    return;
                }
                Collection.EL.stream(list).forEach(new hsk(obj6, 5));
                return;
            case 5:
                Optional optional4 = (Optional) obj;
                if (optional4.isPresent()) {
                    annv annvVar2 = (annv) optional4.get();
                    Stream stream = Collection.EL.stream(annvVar2.j());
                    Object obj7 = this.b;
                    stream.forEach(new hfo(this, obj7, 12, null));
                    Collection.EL.stream(annvVar2.i()).forEach(new hfo(this, obj7, 13, null));
                    return;
                }
                return;
            case 6:
                ?? r0 = this.b;
                eym eymVar = (eym) obj;
                oad oadVar = (oad) r0;
                if (oadVar.f) {
                    return;
                }
                oae oaeVar = oadVar.h;
                oab oabVar = oadVar.d;
                int i3 = oadVar.a;
                int i4 = oadVar.b;
                if (eymVar != null || (eylVar = (eyl) oaeVar.e.Y(oabVar, i3, i4)) == null) {
                    throw null;
                }
                eyv eyvVar = oaeVar.b;
                hed hedVarB = eyvVar.b(eylVar, i3, i4, oadVar.c);
                if (hedVarB != null) {
                    ?? r1 = hedVarB.a;
                    oadVar.g = r1;
                    r1.f(oadVar.e, r0);
                    if (oadVar.f) {
                        oadVar.gI();
                        return;
                    }
                    return;
                }
                oadVar.e(new RuntimeException(String.valueOf(eyvVar) + " returned null LoadData for " + eylVar.b()));
                return;
            case 7:
                return;
            case 8:
                ((EmbedResult) obj).getClass();
                uhe uheVar = new uhe(new uhd(1), 1);
                uhf uhfVar = (uhf) this.a;
                uhg uhgVar = uhfVar.c;
                Optional optional5 = uhgVar.b;
                optional5.isPresent();
                uheVar.a.invoke(optional5.get());
                uhgVar.a.b();
                File file = new File(uhfVar.a);
                if (file.exists()) {
                    file.length();
                }
                CompositionProto$Composition compositionProto$Composition = (CompositionProto$Composition) this.b;
                uhg.d(compositionProto$Composition);
                uhg.c(compositionProto$Composition);
                return;
            case 9:
                ?? r2 = this.a;
                Object obj8 = this.b;
                agkz agkzVarB = r2.b();
                uld uldVar = (uld) obj8;
                vko vkoVar = uldVar.h;
                File file2 = vkoVar.c;
                if (file2.exists()) {
                    File[] fileArrListFiles = file2.listFiles();
                    if (fileArrListFiles == null || (fileArrListFiles.length) == 0) {
                        vkoVar.a(new FileNotFoundException("Font cache dir doesn't contain any file"));
                        agkeVarG = agpi.a;
                    } else {
                        agkz agkzVar = (agkz) Collection.EL.stream(agkzVarB).map(new vmw(i2)).collect(aghu.b);
                        agjz agjzVar = new agjz(4);
                        for (File file3 : fileArrListFiles) {
                            String name = file3.getName();
                            name.getClass();
                            String name2 = new File(name).getName();
                            int iLastIndexOf = name2.lastIndexOf(46);
                            if (iLastIndexOf != -1) {
                                name2 = name2.substring(0, iLastIndexOf);
                            }
                            if (file3.isFile()) {
                                String name3 = file3.getName();
                                name3.getClass();
                                String name4 = new File(name3).getName();
                                int iLastIndexOf2 = name4.lastIndexOf(46);
                                if ((iLastIndexOf2 == -1 ? "" : name4.substring(iLastIndexOf2 + 1)).equals("font") && !agkzVar.contains(name2.toLowerCase(Locale.ROOT))) {
                                    agjzVar.h(new axq(name2, file3));
                                }
                            }
                        }
                        agkeVarG = agjzVar.g();
                    }
                } else {
                    vkoVar.a(new FileNotFoundException("Font cache dir doesn't exist"));
                    agkeVarG = agpi.a;
                }
                while (i < ((agpi) agkeVarG).d) {
                    axq axqVar = (axq) agkeVarG.get(i);
                    if (!r2.d()) {
                        uldVar.t(ajtv.ERROR_LEVEL_ERROR, "Font manager failed to load font.", null);
                    }
                    i++;
                }
                return;
            case 10:
                vli vliVar = (vli) obj;
                agrx agrxVar = agso.a;
                ((vll) this.b).b.set(vliVar);
                ((vlh) this.a).b(vliVar.a);
                return;
            case 11:
                vli vliVar2 = (vli) obj;
                agrx agrxVar2 = agso.a;
                ((vlk) this.b).d.set(vliVar2);
                ((vlh) this.a).b(vliVar2.a);
                return;
            default:
                ((aehd) this.a).f((String) this.b);
                return;
        }
    }

    public hhi(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    public hhi(uhf uhfVar, CompositionProto$Composition compositionProto$Composition, int i) {
        this.$cid = i;
        this.a = uhfVar;
        this.b = compositionProto$Composition;
    }
}
