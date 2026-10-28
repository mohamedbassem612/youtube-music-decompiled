package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hrk implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hrk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [hto, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, rmw] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object mediaBrowserCompat$MediaItem;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                return Long.valueOf(((aaex) this.a).ag((String) obj));
            case 1:
                agev agevVar = (agev) obj;
                if (agevVar.g()) {
                    jan janVar = (jan) this.a;
                    if (((hlz) janVar.g).k(((aamj) agevVar.c()).a)) {
                        return Optional.of(((hef) janVar.c).g((aamj) agevVar.c()));
                    }
                }
                return Optional.empty();
            case 2:
                return ((hrw) aguu.aw(((hsd) this.a).j, hrw.class, (affd) obj)).f();
            case 3:
                return ((hsm) aguu.aw(((hsn) this.a).c, hsm.class, (affd) obj)).f();
            case 4:
                List list = (List) obj;
                agkh agkhVar = new agkh(4);
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = this.a;
                    Optional optional = (Optional) list.get(i);
                    aaab aaabVar = new aaab((Object) agkhVar, obj2, i, (int) (z ? 1 : 0));
                    if (true == optional.isPresent()) {
                        ((agkh) aaabVar.c).e((String) aaabVar.b.get(aaabVar.a), (ansx) ((weh) optional.get()));
                    }
                }
                return agkhVar.d(false);
            case 5:
                return Objects.equals((Boolean) obj, Boolean.TRUE) ? Optional.of(this.a) : Optional.empty();
            case 6:
                return ((hsy) aguu.aw(((hsz) this.a).a, hsy.class, (affd) obj)).f();
            case 7:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return null;
                }
                annv annvVar = (annv) optional2.get();
                if (annvVar.h().isEmpty() && annvVar.k().isEmpty() && annvVar.e().isEmpty() && annvVar.g().isEmpty() && annvVar.i().isEmpty() && annvVar.j().isEmpty()) {
                    return null;
                }
                jgc jgcVar = (jgc) this.a;
                Context context = (Context) jgcVar.e;
                String string = context.getString(R.string.shuffle_all);
                String string2 = context.getResources().getString(R.string.default_media_item_desc);
                String strG = jgc.g("PPAD");
                Uri uriR = ixt.r(context, jgcVar.a());
                Bundle bundle = new Bundle();
                bundle.putLong("android.media.extra.DOWNLOAD_STATUS", 2L);
                mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strG, string, null, string2, null, uriR, bundle, null), 2);
                break;
                break;
            case 8:
                List<anyx> list2 = (List) obj;
                if (!list2.isEmpty()) {
                    jgc jgcVar2 = (jgc) this.a;
                    MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemB = jgcVar2.b(false, list2);
                    ArrayList arrayList = new ArrayList(list2.size());
                    Context context2 = (Context) jgcVar2.e;
                    String string3 = context2.getString(R.string.offline_songs_detail_page_title);
                    String string4 = context2.getString(R.string.shuffle_all);
                    String string5 = context2.getResources().getString(R.string.default_media_item_desc);
                    String strG2 = jgc.g("PPSV");
                    Uri uriR2 = ixt.r(context2, jgcVar2.a());
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", 2L);
                    if (!TextUtils.isEmpty(string3)) {
                        bundle2.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", string3);
                    }
                    arrayList.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strG2, string4, null, string5, null, uriR2, bundle2, null), 2));
                    for (anyx anyxVar : list2) {
                        String str = string3;
                        arrayList.add(jgcVar2.d(anyxVar.getVideoId(), anyxVar.getTitle(), anyxVar.getArtistNames(), anyxVar.getThumbnailDetails(), jgcVar2.j, str, "PPSV", anyxVar.getEligibleForResumption().booleanValue(), false));
                        string3 = str;
                    }
                    return new kyr((Object) mediaBrowserCompat$MediaItemB, (Object) arrayList, (byte[]) null);
                }
                mediaBrowserCompat$MediaItem = new kyr((Object) null, (Object) agpi.a, (byte[]) null);
                break;
                break;
            case 9:
                List list3 = (List) obj;
                if (list3.isEmpty()) {
                    return agpi.a;
                }
                Object obj3 = this.a;
                ArrayList arrayList2 = new ArrayList(list3);
                jgc jgcVar3 = (jgc) obj3;
                Collections.sort(arrayList2, jgcVar3.a);
                return jgcVar3.i(arrayList2, new ArrayList());
            case 10:
                List<anyx> list4 = (List) obj;
                if (list4.isEmpty()) {
                    mediaBrowserCompat$MediaItem = new kyr((Object) null, (Object) agpi.a, (byte[]) null);
                } else {
                    jgc jgcVar4 = (jgc) this.a;
                    hbf hbfVar = (hbf) jgcVar4.l;
                    String strB = hbfVar.b();
                    int size = list4.size();
                    rmv rmvVarC = jgcVar4.g.c();
                    Spanned spanned = rmvVarC != null ? rmvVarC.d : null;
                    MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemC = jgcVar4.c(false, list4, strB, spanned != null ? spanned.toString() : hbfVar.a(size), "PPSE", "offline_PPSE", true);
                    ArrayList arrayList3 = new ArrayList(list4.size());
                    arrayList3.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat("__DETAILS_HEADER_ID__", null, null, null, null, null, null, null), 0));
                    jgc jgcVar5 = jgcVar4;
                    for (anyx anyxVar2 : list4) {
                        jgc jgcVar6 = jgcVar5;
                        arrayList3.add(jgcVar6.d(anyxVar2.getVideoId(), anyxVar2.getTitle(), anyxVar2.getArtistNames(), anyxVar2.getThumbnailDetails(), jgcVar5.j, "", "PPSE", anyxVar2.getEligibleForResumption().booleanValue(), false));
                        jgcVar5 = jgcVar6;
                    }
                    mediaBrowserCompat$MediaItem = new kyr((Object) mediaBrowserCompat$MediaItemC, (Object) arrayList3, (byte[]) null);
                }
                break;
            case 11:
                List<anyx> list5 = (List) obj;
                if (list5.isEmpty()) {
                    mediaBrowserCompat$MediaItem = new kyr((Object) null, (Object) agpi.a, (byte[]) null);
                } else {
                    jgc jgcVar7 = (jgc) this.a;
                    hbf hbfVar2 = (hbf) jgcVar7.l;
                    MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemC2 = jgcVar7.c(false, list5, hbfVar2.b(), hbfVar2.a(list5.size()), "PPSE", "offline_PPSE", true);
                    ArrayList arrayList4 = new ArrayList(list5.size());
                    String strB2 = hbfVar2.b();
                    jgc jgcVar8 = jgcVar7;
                    for (anyx anyxVar3 : list5) {
                        jgc jgcVar9 = jgcVar8;
                        arrayList4.add(jgcVar9.d(anyxVar3.getVideoId(), anyxVar3.getTitle(), anyxVar3.getArtistNames(), anyxVar3.getThumbnailDetails(), jgcVar8.j, strB2, "PPSE", anyxVar3.getEligibleForResumption().booleanValue(), false));
                        jgcVar8 = jgcVar9;
                    }
                    mediaBrowserCompat$MediaItem = new kyr((Object) mediaBrowserCompat$MediaItemC2, (Object) arrayList4, (byte[]) null);
                }
                break;
            case 12:
                List list6 = (List) obj;
                if (list6.isEmpty()) {
                    return null;
                }
                return ((jgc) this.a).b(true, list6);
            case 13:
                Stream stream = Collection.EL.stream((List) obj);
                Object obj4 = this.a;
                return (List) stream.sorted(((jgc) obj4).a).map(new hqs(obj4, 11)).collect(Collectors.toList());
            case 14:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && !((htp) this.a).e.g());
            case 15:
                long j = htp.a;
                this.a.a((hth) obj);
                return null;
            case 16:
                gny gnyVar = ((hur) this.a).n;
                if (gnyVar != null) {
                    gnyVar.e = gnyVar.a.g().af(new gks(gnyVar, 7));
                }
                return Boolean.FALSE;
            case 17:
                Boolean bool = (Boolean) obj;
                hur hurVar = (hur) this.a;
                gny gnyVar2 = hurVar.n;
                if (gnyVar2 == null) {
                    return bool;
                }
                Object obj5 = gnyVar2.e;
                if (obj5 != null) {
                    avnr.b((AtomicReference) obj5);
                }
                hurVar.m();
                return bool;
            case 18:
                ((agrc) ((agrc) ((agrc) hur.a.b().i(agso.a, "OfflineBrowsePageGenSvc")).j((ExecutionException) obj)).k("com/google/android/apps/youtube/music/offline/service/OfflineBrowsePageGenerationService", "addChips", 953, "OfflineBrowsePageGenerationService.java")).t("Failed to get music library chip bar element.");
                return this.a;
            case 19:
                abnl abnlVarN = ((acip) obj).n();
                String strW = abnlVarN != null ? abnlVarN.w() : "";
                hzp hzpVar = (hzp) this.a;
                return hzpVar.d.e(hzpVar.c.e()).k(wfs.g(62, strW)).g(avla.e);
            default:
                return new wgi((amae) ((aihf) this.a).build());
        }
        return mediaBrowserCompat$MediaItem;
    }
}
