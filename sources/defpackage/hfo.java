package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hfo implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hfo(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:123:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:125:0x05bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.view.Menu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i;
        ajwo ajwoVar;
        agke agkeVar;
        String audioPlaylistId;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemL;
        boolean z;
        ListenableFuture listenableFutureG;
        ListenableFuture listenableFutureG2;
        int i2 = 10;
        switch (this.$cid) {
            case 0:
                weh wehVar = (weh) obj;
                List list = (List) this.a.get(wfs.h(wehVar.b()));
                if (wehVar instanceof amld) {
                    amld amldVar = (amld) wehVar;
                    if (list == null || !list.contains(amldVar.getLikeStatus())) {
                        return;
                    }
                    this.b.l(amldVar);
                    return;
                }
                return;
            case 1:
                anrv anrvVar = (anrv) obj;
                gpl gplVar = (gpl) this.b;
                hcb hcbVar = gplVar.av;
                anon anonVarE = anop.e(anrvVar.f);
                alay alayVar = anrvVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                alay alayVar2 = ((anxn) this.a).c;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                anonVarE.am(Boolean.valueOf(alayVar.equals(alayVar2)));
                gplVar.av.c();
                hcbVar.e(anonVarE.an());
                return;
            case 2:
                xir xirVar = (xir) obj;
                xirVar.h(hgm.g(xirVar.q(), (zot) this.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CALLBACK_ARGUMENT, (zne) this.b, null, null));
                return;
            case 3:
                zne zneVar = (zne) obj;
                if (((hir) this.b).g.contains(zneVar)) {
                    return;
                }
                ((agkx) this.a).c(zneVar);
                return;
            case 4:
                String str = (String) obj;
                Duration duration = hiv.a;
                ((hev) this.a).b.put(str, String.valueOf(((Bundle) this.b).get(str)));
                return;
            case 5:
                hkq hkqVar = (hkq) this.a;
                vxz vxzVar = hkqVar.f;
                ajnf ajnfVar = (ajnf) obj;
                ?? r1 = this.b;
                if (!vxzVar.m(257, 45823344L)) {
                    hkqVar.a(r1, ajnfVar, Optional.empty(), 0, 0);
                    return;
                }
                if (vxzVar.m(257, 45823344L)) {
                    if (ajnfVar != null) {
                        if ((ajnfVar.b & SemanticState.Obscured) != 0) {
                            ajwo ajwoVar2 = ajnfVar.r;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfd.a);
                            ajwoVar2.c(aihlVarCheckIsLite);
                            if (!ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                                if ((ajnfVar.b & SemanticState.Multiline) != 0) {
                                    ajwoVar = ajnfVar.s;
                                    if (ajwoVar == null) {
                                        ajwoVar = ajwo.a;
                                    }
                                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfd.a);
                                    ajwoVar.c(aihlVarCheckIsLite2);
                                    if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                                    }
                                }
                            }
                        } else if ((ajnfVar.b & SemanticState.Multiline) != 0) {
                            ajwoVar = ajnfVar.s;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajfd.a);
                            ajwoVar.c(aihlVarCheckIsLite3);
                            i = ajwoVar.j.n(aihlVarCheckIsLite3.d) ? R.id.offline_settings_server_menu_item : 0;
                        }
                    }
                    hkqVar.a(r1, ajnfVar, Optional.empty(), R.id.browse_toolbar_server_buttons_group, i);
                    return;
                }
                return;
            case 6:
                avnr.b((AtomicReference) ((hmt) this.b).c.a((String) this.a, (String) obj).ae());
                return;
            case 7:
                String strH = wfs.h((String) obj);
                if (this.a.contains(strH)) {
                    return;
                }
                hnz hnzVar = (hnz) ((hhi) this.b).a;
                hnzVar.f.j(strH, aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE, hnzVar.k.intValue());
                return;
            case 8:
                ((awlk) this.a).kn();
                avnr.b((AtomicReference) this.b);
                return;
            case 9:
                ((awlk) this.a).kn();
                avnr.b((AtomicReference) this.b);
                return;
            case 10:
                ((awlk) this.a).kn();
                avnr.b((AtomicReference) this.b);
                return;
            case 11:
                this.a.add(tzk.d(this.b.g(wfs.g(452, (String) obj)).g(ansx.class)));
                return;
            case 12:
                String str2 = (String) obj;
                if (this.a.contains(str2)) {
                    return;
                }
                ((hsn) ((hhi) this.b).a).n.j(wfs.h(str2), aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE, 24);
                return;
            case 13:
                String str3 = (String) obj;
                if (this.a.contains(str3)) {
                    return;
                }
                ((hsn) ((hhi) this.b).a).n.j(wfs.h(str3), aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE, 24);
                return;
            case 14:
                hcg hcgVar = (hcg) obj;
                Object obj2 = hcgVar.a.get();
                boolean z2 = obj2 instanceof anuk;
                if (!z2 && !(obj2 instanceof anjx)) {
                    throw new IllegalStateException("Unexpected container Entity: ".concat(obj2.toString()));
                }
                Object obj3 = this.b;
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                if (z2) {
                    anuk anukVar = (anuk) obj2;
                    agkeVar = hcgVar.c;
                    int iP = a.p(anukVar.getTrackCount().longValue());
                    audioPlaylistId = anukVar.getPlaylistId();
                    sb.append(anukVar.getOwnerDisplayName());
                    sb.append('\n');
                    jgc jgcVar = (jgc) obj3;
                    sb.append(((Context) jgcVar.e).getResources().getQuantityString(R.plurals.song_count, iP, Integer.valueOf(iP)));
                    sb.append('\n');
                    sb.append(jgcVar.h(agkeVar));
                    mediaBrowserCompat$MediaItemL = jgcVar.l(anukVar.getPlaylistId(), anukVar.getTitle(), anukVar.getOwnerDisplayName(), new abuz(anukVar.getThumbnailDetails()), jgcVar.h, "", true, anukVar.k() || anukVar.getPlaylistId().equals("SE"));
                    z = false;
                } else {
                    anjx anjxVar = (anjx) obj2;
                    agkeVar = hcgVar.c;
                    int iP2 = a.p(anjxVar.getTrackCount().longValue());
                    audioPlaylistId = anjxVar.getAudioPlaylistId();
                    sb.append(anjxVar.getArtistDisplayName());
                    sb.append('\n');
                    jgc jgcVar2 = (jgc) obj3;
                    sb.append(((Context) jgcVar2.e).getResources().getQuantityString(R.plurals.song_count, iP2, Integer.valueOf(iP2)));
                    sb.append('\n');
                    sb.append(jgcVar2.h(agkeVar));
                    mediaBrowserCompat$MediaItemL = jgcVar2.l(anjxVar.getAudioPlaylistId(), anjxVar.getTitle(), anjxVar.getArtistDisplayName(), new abuz(anjxVar.getThumbnailDetails()), jgcVar2.j, "", true, false);
                    z = true;
                }
                String str4 = audioPlaylistId;
                int size = agkeVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    anyx anyxVar = (anyx) agkeVar.get(i3);
                    jgc jgcVar3 = (jgc) obj3;
                    arrayList.add(jgcVar3.d(anyxVar.getVideoId(), anyxVar.getTitle(), z ? nsj.c(anyxVar.getLengthMs().longValue() / 1000) : anyxVar.getArtistNames(), anyxVar.getThumbnailDetails(), jgcVar3.h, "", str4, anyxVar.getEligibleForResumption().booleanValue(), z));
                }
                if (txz.g((Context) ((jgc) obj3).e)) {
                    String string = sb.toString();
                    typ.f(string);
                    aihf aihfVarCreateBuilder = anfb.a.createBuilder();
                    amzw amzwVar = amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DETAILS_FOOTER;
                    aihfVarCreateBuilder.copyOnWrite();
                    anfb anfbVar = (anfb) aihfVarCreateBuilder.instance;
                    anfbVar.d = Integer.valueOf(amzwVar.p);
                    anfbVar.c = 2;
                    long jHashCode = string.hashCode();
                    aihfVarCreateBuilder.copyOnWrite();
                    anfb anfbVar2 = (anfb) aihfVarCreateBuilder.instance;
                    anfbVar2.b |= 8;
                    anfbVar2.h = jHashCode;
                    arrayList.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(zls.b((anfb) aihfVarCreateBuilder.build()), string, null, null, null, null, null, null), 0));
                }
                this.a.add(new Pair(mediaBrowserCompat$MediaItemL, arrayList));
                return;
            case 15:
                avnr.b((AtomicReference) ((hue) this.b).c.c.a(wfs.h((String) obj), (String) this.a).ae());
                return;
            case 16:
                hcg hcgVar2 = (hcg) obj;
                agkh agkhVar = new agkh(4);
                agkhVar.i(hur.b);
                Object obj4 = this.b;
                agkj agkjVar = hur.c;
                hur hurVar = (hur) obj4;
                if (agkjVar.containsKey(hurVar.i)) {
                    imi imiVarB = (imi) agkjVar.get(hurVar.i);
                    if (imiVarB != null) {
                        acb acbVar = new acb(imiVarB);
                        acbVar.e(hcgVar2.d.size());
                        imiVarB = acbVar.b();
                    }
                    agkhVar.e("container_context", imiVarB);
                }
                String str5 = hcgVar2.f;
                if (str5.equals("PPSE")) {
                    kwq kwqVar = hurVar.p;
                    agke agkeVar2 = hcgVar2.c;
                    listenableFutureG = ahng.n(kwqVar.q(((hbf) kwqVar.a).b(), ((Context) kwqVar.d).getResources().getQuantityString(R.plurals.auto_playlist_with_episode_count_item_subtitle, agkeVar2.size(), Integer.valueOf(agkeVar2.size())), "PPSE"));
                } else if (str5.equals("PPSV")) {
                    int size2 = hcgVar2.c.size();
                    kwq kwqVar2 = hurVar.p;
                    Context context = hurVar.d;
                    listenableFutureG = ahng.n(kwqVar2.q(context.getString(R.string.offline_songs_detail_page_title), context.getResources().getQuantityString(R.plurals.auto_playlist_with_size_item_subtitle, size2, Integer.valueOf(size2)), "PPSV"));
                } else if (str5.equals("PPSDST")) {
                    int size3 = hcgVar2.c.size();
                    kwq kwqVar3 = hurVar.p;
                    Context context2 = hurVar.d;
                    listenableFutureG = ahng.n(kwqVar3.q(context2.getString(R.string.recent_music_playlist_title), context2.getResources().getQuantityString(R.plurals.auto_playlist_with_size_item_subtitle, size3, Integer.valueOf(size3)), "PPSDST"));
                } else {
                    listenableFutureG = hurVar.g(hcgVar2, agkhVar);
                }
                this.a.add(afxd.f(listenableFutureG).g(new hqt(i2), hurVar.f));
                return;
            case 17:
                hcg hcgVar3 = (hcg) obj;
                agkh agkhVar2 = new agkh(4);
                agkhVar2.i(hur.b);
                Object obj5 = this.b;
                agkj agkjVar2 = hur.c;
                hur hurVar2 = (hur) obj5;
                if (agkjVar2.containsKey(hurVar2.i)) {
                    imi imiVarB2 = (imi) agkjVar2.get(hurVar2.i);
                    if (imiVarB2 != null) {
                        acb acbVar2 = new acb(imiVarB2);
                        acbVar2.e(hcgVar3.d.size());
                        imiVarB2 = acbVar2.b();
                    }
                    agkhVar2.e("container_context", imiVarB2);
                }
                String str6 = hcgVar3.f;
                if (str6.equals("PPSE")) {
                    kwq kwqVar4 = hurVar2.p;
                    agke agkeVar3 = hcgVar3.c;
                    listenableFutureG2 = ahng.n(kwqVar4.r(((hbf) kwqVar4.a).b(), ((Context) kwqVar4.d).getResources().getQuantityString(R.plurals.auto_playlist_with_episode_count_item_subtitle, agkeVar3.size(), Integer.valueOf(agkeVar3.size())), "PPSE"));
                } else if (str6.equals("PPSV")) {
                    int size4 = hcgVar3.c.size();
                    kwq kwqVar5 = hurVar2.p;
                    Context context3 = hurVar2.d;
                    listenableFutureG2 = ahng.n(kwqVar5.r(context3.getString(R.string.offline_songs_detail_page_title), context3.getResources().getQuantityString(R.plurals.auto_playlist_with_size_item_subtitle, size4, Integer.valueOf(size4)), "PPSV"));
                } else if (str6.equals("PPSDST")) {
                    int size5 = hcgVar3.c.size();
                    kwq kwqVar6 = hurVar2.p;
                    Context context4 = hurVar2.d;
                    listenableFutureG2 = ahng.n(kwqVar6.r(context4.getString(R.string.recent_music_playlist_title), context4.getResources().getQuantityString(R.plurals.auto_playlist_with_size_item_subtitle, size5, Integer.valueOf(size5)), "PPSDST"));
                } else {
                    listenableFutureG2 = hurVar2.g(hcgVar3, agkhVar2);
                }
                this.a.add(afxd.f(listenableFutureG2).g(new hqt(11), hurVar2.f));
                return;
            case 18:
                int i4 = qzf.f;
                tge tgeVarA = quk.a();
                tgeVarA.b = this.a;
                tgeVarA.c = new que((UUID) obj);
                ((rdr) this.b).D(tgeVarA.e());
                return;
            case 19:
                qum qumVar = (qum) obj;
                rdr rdrVar = (rdr) this.b;
                if (rdrVar.f.c()) {
                    Duration duration2 = (Duration) rdrVar.j.get();
                    if (duration2 != null) {
                        qumVar.d(duration2);
                        return;
                    } else {
                        rbc rbcVar = new rbc(rdr.I, rbd.c);
                        rbcVar.c();
                        rbcVar.a("Pending seek time is unset while there is a pending seek, falling back to the current frame time.", new Object[0]);
                    }
                }
                qumVar.d((Duration) this.a);
                return;
            default:
                UUID uuid = (UUID) obj;
                Object obj6 = this.b;
                rek rekVar = (rek) obj6;
                qup qupVarF = rekVar.n.f((qvs) ((agkj) this.a).get(uuid));
                rdx rdxVar = (rdx) rdy.a.get(((quu) qupVarF.b).getClass());
                if (rdxVar == null) {
                    throw new IllegalArgumentException(String.format("No creation function bound for segment type: %s", qupVarF.getClass()));
                }
                Object objApply = rdxVar.apply(qupVarF, ((rdy) rekVar.g).b);
                rcu rcuVar = new rcu(obj6, i2);
                res resVar = (res) objApply;
                resVar.f = rcuVar;
                rei reiVar = resVar.g;
                if (reiVar != null) {
                    reiVar.e(rcuVar);
                }
                tld tldVar = rekVar.o;
                agwm agwmVar = (agwm) tldVar.b;
                agwmVar.g(objApply);
                agwmVar.i(objApply, tldVar.a);
                rekVar.d.put(uuid, objApply);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ hfo(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
