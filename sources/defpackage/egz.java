package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class egz implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ egz(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x060a A[Catch: all -> 0x06d2, TryCatch #0 {, blocks: (B:138:0x05c9, B:139:0x05e2, B:141:0x05e8, B:143:0x05fa, B:148:0x060a, B:150:0x0618, B:153:0x0634, B:152:0x062b), top: B:208:0x05c9 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0618 A[Catch: all -> 0x06d2, TryCatch #0 {, blocks: (B:138:0x05c9, B:139:0x05e2, B:141:0x05e8, B:143:0x05fa, B:148:0x060a, B:150:0x0618, B:153:0x0634, B:152:0x062b), top: B:208:0x05c9 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0629 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x062b A[Catch: all -> 0x06d2, TryCatch #0 {, blocks: (B:138:0x05c9, B:139:0x05e2, B:141:0x05e8, B:143:0x05fa, B:148:0x060a, B:150:0x0618, B:153:0x0634, B:152:0x062b), top: B:208:0x05c9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v51, types: [htn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v87, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Future] */
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
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem;
        anfb anfbVarC;
        Object obj;
        Object obj2;
        int i;
        int i2 = 18;
        int i3 = 4;
        int i4 = 0;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                return ehd.a((Context) this.a, (String) this.b, (String) this.c);
            case 1:
                eob eobVar = new eob(null, null);
                ?? r11 = this.b;
                ug ugVar = (ug) this.a;
                tv tvVar = ugVar.a;
                String str = ugVar.d;
                String str2 = ugVar.b;
                tw twVar = ugVar.c;
                tvVar.r(str, str2, r11, eobVar, true, twVar, luv.UNKNOWN);
                tvVar.r(str, str2, this.c, eobVar, true, twVar, luv.LITE);
                ugVar.f = true;
                ugVar.f();
                rv rvVarC = eobVar.c();
                eob eobVar2 = new eob(null, null);
                Iterator it = rvVarC.a.entrySet().iterator();
                while (it.hasNext()) {
                    eobVar2.f(((Map.Entry) it.next()).getKey(), null);
                }
                for (Map.Entry entry : rvVarC.b.entrySet()) {
                    eobVar2.d(entry.getKey(), ((ry) entry.getValue()).a, ((ry) entry.getValue()).c);
                }
                return eobVar2.c();
            case 2:
                return ((enu) this.a).b((String) this.b, (String) this.c);
            case 3:
                return ((eoa) this.b).v((Activity) this.a, (eob) this.c);
            case 4:
                long jLongValue = ((Long) ahng.v(this.b)).longValue();
                long jLongValue2 = ((Long) ahng.v(this.c)).longValue();
                String string = Long.toString(jLongValue);
                Bundle bundle = (Bundle) this.a;
                bundle.putString("offline_smart_downloads_last_sync_time_ms", string);
                bundle.putString("offline_smart_downloads_next_sync_time_ms", Long.toString(jLongValue2));
                return Boolean.TRUE;
            case 5:
                try {
                    ((kwq) this.b).t((hev) this.a, (amzv) ahng.v(this.c));
                    return null;
                } catch (ExecutionException unused) {
                    return null;
                }
            case 6:
                hia hiaVar = (hia) this.a;
                ListenableFuture listenableFuture = hiaVar.x;
                listenableFuture.getClass();
                return Boolean.valueOf(hiaVar.p((zne) this.b, listenableFuture, this.c));
            case 7:
                Object obj3 = this.b;
                hia hiaVar2 = (hia) obj3;
                ListenableFuture listenableFuture2 = hiaVar2.x;
                listenableFuture2.getClass();
                Object obj4 = this.c;
                synchronized (obj3) {
                    boolean zBooleanValue = ((Boolean) ahng.v(listenableFuture2)).booleanValue();
                    AtomicReference atomicReference = ((hia) obj3).v;
                    Iterator it2 = ((List) atomicReference.get()).iterator();
                    do {
                        if (it2.hasNext()) {
                            mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it2.next();
                            if (!TextUtils.equals(mediaBrowserCompat$MediaItem.a(), gzl.a)) {
                            }
                        } else {
                            mediaBrowserCompat$MediaItem = null;
                        }
                        if (zBooleanValue) {
                            ((hia) obj3).l("MBS: offline tree updated for client: %s", obj4);
                            if (mediaBrowserCompat$MediaItem == null) {
                                ((List) atomicReference.get()).addAll(0, ((hia) obj3).d());
                            }
                        } else if (mediaBrowserCompat$MediaItem != null) {
                            ((List) atomicReference.get()).remove(mediaBrowserCompat$MediaItem);
                        }
                        break;
                    } while (!TextUtils.equals(mediaBrowserCompat$MediaItem.a(), gzl.b));
                    if (zBooleanValue) {
                        ((hia) obj3).l("MBS: offline tree updated for client: %s", obj4);
                        if (mediaBrowserCompat$MediaItem == null) {
                            ((List) atomicReference.get()).addAll(0, ((hia) obj3).d());
                        }
                    } else if (mediaBrowserCompat$MediaItem != null) {
                        ((List) atomicReference.get()).remove(mediaBrowserCompat$MediaItem);
                    }
                    break;
                }
                Object obj5 = this.a;
                Object obj6 = ((yu) hiaVar2.k.io()).a;
                znf znfVar = znf.a;
                znf znfVarAi = yno.ai((String) obj6);
                if (obj5 == hhz.c) {
                    String str3 = znfVarAi.l;
                    String str4 = gzl.a;
                    if (TextUtils.equals(str3, str4)) {
                        ((isw) hiaVar2.i.io()).h(yno.ai(str4));
                        return null;
                    }
                }
                if (obj5 == hhz.b) {
                    String str5 = znfVarAi.l;
                    if (TextUtils.equals(str5, "offline_PPSV") || TextUtils.equals(str5, "offline_PPSE")) {
                        ((isw) hiaVar2.i.io()).h(znfVarAi);
                        return null;
                    }
                }
                aunn aunnVar = hiaVar2.i;
                ((isw) aunnVar.io()).h(((zne) obj4).a());
                if (!txz.g(hiaVar2.c) || (anfbVarC = znfVarAi.c()) == null || (anfbVarC.b & 1) == 0) {
                    return null;
                }
                ajwo ajwoVar = anfbVarC.e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
                ajwoVar.c(aihlVarCheckIsLite);
                if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    return null;
                }
                ((isw) aunnVar.io()).h(znfVarAi);
                return null;
            case 8:
                ArrayList arrayList = new ArrayList();
                agke agkeVar = (agke) ahng.v(this.a);
                int size = agkeVar.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(aaka.b(((anyx) agkeVar.get(i6)).getVideoId()));
                }
                agke agkeVar2 = (agke) ahng.v(this.b);
                int size2 = agkeVar2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    arrayList.add(aaka.a(((anuk) agkeVar2.get(i7)).getPlaylistId()));
                }
                agke agkeVar3 = (agke) ahng.v(this.c);
                int size3 = agkeVar3.size();
                while (i4 < size3) {
                    arrayList.add(aaka.a(((anjx) agkeVar3.get(i4)).getAudioPlaylistId()));
                    i4++;
                }
                return agke.n(arrayList);
            case 9:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll((Collection) ahng.v(this.a));
                arrayList2.addAll((Collection) ahng.v(this.b));
                arrayList2.addAll((Collection) ahng.v(this.c));
                return agke.n(arrayList2);
            case 10:
                List list = (List) ahng.v(this.b);
                adt adtVar = (adt) this.a;
                adtVar.a(list);
                adtVar.a = Optional.of((agke) ahng.v(this.c));
                Object obj7 = adtVar.c;
                if (obj7 != null && (obj = adtVar.e) != null && (obj2 = adtVar.d) != null) {
                    return new htd((agke) obj7, (Optional) adtVar.a, (Optional) adtVar.b, (agke) obj, (agke) obj2);
                }
                StringBuilder sb = new StringBuilder();
                if (adtVar.c == null) {
                    sb.append(" singleTrackContainers");
                }
                if (adtVar.e == null) {
                    sb.append(" albums");
                }
                if (adtVar.d == null) {
                    sb.append(" playlists");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            case 11:
                HashMap map = new HashMap();
                ahgb.ag((List) ahng.v(this.a), map);
                for (Optional optionalOfNullable : (List) ahng.v(this.b)) {
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable((anrj) ((weh) optionalOfNullable.get()));
                    }
                    if (optionalOfNullable.isPresent()) {
                        aihf aihfVar = (aihf) j$.util.Map.EL.computeIfAbsent(map, wfs.h(((anrj) optionalOfNullable.get()).b()), new hrn(i2));
                        aihf aihfVarCreateBuilder = aoee.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        aoee aoeeVar = (aoee) aihfVarCreateBuilder.instance;
                        aoeeVar.b |= 1;
                        aoeeVar.c = true;
                        aihfVar.copyOnWrite();
                        aoeb aoebVar = (aoeb) aihfVar.instance;
                        aoee aoeeVar2 = (aoee) aihfVarCreateBuilder.build();
                        aoeb aoebVar2 = aoeb.a;
                        aoeeVar2.getClass();
                        aoebVar.d = aoeeVar2;
                        aoebVar.b |= 2;
                    }
                }
                for (Optional optionalOfNullable2 : (List) ahng.v(this.c)) {
                    if (true == optionalOfNullable2.isPresent()) {
                        optionalOfNullable2 = Optional.ofNullable((amld) ((weh) optionalOfNullable2.get()));
                    }
                    if (optionalOfNullable2.isPresent()) {
                        aihf aihfVar2 = (aihf) j$.util.Map.EL.computeIfAbsent(map, wfs.h(((amld) optionalOfNullable2.get()).b()), new hsw(i5));
                        aihf aihfVarCreateBuilder2 = aoed.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoed aoedVar = (aoed) aihfVarCreateBuilder2.instance;
                        aoedVar.b |= 1;
                        aoedVar.c = true;
                        aihfVar2.copyOnWrite();
                        aoeb aoebVar3 = (aoeb) aihfVar2.instance;
                        aoed aoedVar2 = (aoed) aihfVarCreateBuilder2.build();
                        aoeb aoebVar4 = aoeb.a;
                        aoedVar2.getClass();
                        aoebVar3.e = aoedVar2;
                        aoebVar3.b |= 4;
                    }
                }
                return ahgb.af(map);
            case 12:
                ?? r1 = this.b;
                ArrayList arrayList3 = new ArrayList(r1.size());
                ArrayList arrayList4 = new ArrayList();
                while (i4 < r1.size()) {
                    ?? r4 = this.c;
                    arrayList3.add((hcg) r1.get(i4));
                    Optional optional = (Optional) ahng.v((Future) r4.get(i4));
                    if (optional.isPresent() && !((hte) optional.get()).a) {
                        arrayList4.add(((hcg) r1.get(i4)).f);
                    }
                    i4++;
                }
                jgc jgcVar = (jgc) this.a;
                Collections.sort(arrayList3, jgcVar.a);
                return jgcVar.i(arrayList3, arrayList4);
            case 13:
                ?? r2 = this.c;
                ?? r3 = this.b;
                long j = htp.a;
                this.a.a((Optional) ahng.v(r3), (hte) ahng.v(r2));
                return null;
            case 14:
                Optional optional2 = (Optional) ahng.v(this.b);
                aihf aihfVar3 = (aihf) ahng.v(this.c);
                aihf aihfVarCreateBuilder3 = anwt.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                anwt anwtVar = (anwt) aihfVarCreateBuilder3.instance;
                anwtVar.c |= 131072;
                anwtVar.t = true;
                hge hgeVar = new hge(aihfVarCreateBuilder3, i2);
                if (true == optional2.isPresent()) {
                    Object obj8 = optional2.get();
                    Object obj9 = hgeVar.a;
                    aihf aihfVarCreateBuilder4 = anwv.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    anwv anwvVar = (anwv) aihfVarCreateBuilder4.instance;
                    anwvVar.f = (ankz) obj8;
                    anwvVar.b |= 2097152;
                    ((aihf) obj9).bR(aihfVarCreateBuilder4);
                }
                Object obj10 = this.a;
                aihf aihfVarCreateBuilder5 = anwv.a.createBuilder();
                hur hurVar = (hur) obj10;
                switch (hurVar.i.ordinal()) {
                    case 1:
                        i = R.string.offline_downloads_tracks_and_episodes_empty_state_text;
                        break;
                    case 2:
                    case 6:
                        i = R.string.offline_downloads_tracks_empty_state_text;
                        break;
                    case 3:
                    case 7:
                        i = R.string.offline_downloads_playlists_empty_state_text;
                        break;
                    case 4:
                    case 8:
                        i = R.string.offline_downloads_albums_empty_state_text;
                        break;
                    case 5:
                    case 9:
                        i = R.string.offline_downloads_podcasts_empty_state_text;
                        break;
                    default:
                        throw new IllegalStateException("No empty state for reload continuation ".concat(String.valueOf(String.valueOf(hurVar.i))));
                }
                tfq tfqVar = hurVar.m;
                Optional optionalEmpty = Optional.empty();
                if (tfqVar.i()) {
                    String string2 = hurVar.d.getString(1 != ((hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS) || hurVar.i.equals(akmy.CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS_DOWNLOADED_SUBCHIP)) ? 1 : 0) ? R.string.offline_downloads_empty_state_button_text : R.string.offline_downloads_podcasts_empty_state_button_text);
                    aihh aihhVar = (aihh) ajwo.a.createBuilder();
                    aihhVar.e(apni.a, apng.a);
                    optionalEmpty = Optional.of(fhz.N(string2, (ajwo) aihhVar.build()));
                }
                angn angnVarH = jij.h(aliz.OFFLINE_PIN, hurVar.d.getString(i), optionalEmpty);
                aihfVarCreateBuilder5.copyOnWrite();
                anwv anwvVar2 = (anwv) aihfVarCreateBuilder5.instance;
                angnVarH.getClass();
                anwvVar2.e = angnVarH;
                anwvVar2.b |= 1048576;
                aihfVarCreateBuilder3.bP((anwv) aihfVarCreateBuilder5.build());
                aihf aihfVarCreateBuilder6 = apox.a.createBuilder();
                aihfVarCreateBuilder6.copyOnWrite();
                apox apoxVar = (apox) aihfVarCreateBuilder6.instance;
                anwt anwtVar2 = (anwt) aihfVarCreateBuilder3.build();
                anwtVar2.getClass();
                apoxVar.aq = anwtVar2;
                apoxVar.c |= 536870912;
                aihfVar3.ck(aihfVarCreateBuilder6);
                return new iti((apoq) aihfVar3.build(), 1, (byte[]) null);
            case 15:
                Optional optional3 = (Optional) ahng.v(this.a);
                Optional optional4 = (Optional) ahng.v(this.b);
                boolean zIsEmpty = optional3.isEmpty();
                Object obj11 = this.c;
                if (zIsEmpty) {
                    ((agrc) ((agrc) huy.a.b().i(agso.a, "DefaultPlaylistSyncChk")).k("com/google/android/apps/youtube/music/offline/sync/implementation/DefaultPlaylistSyncCheckController", "transformPlaylistAndVideosToSyncCheckRequest", 130, "DefaultPlaylistSyncCheckController.java")).w("No container metadata entity found for %s", obj11);
                    return Optional.empty();
                }
                if (optional4.isEmpty()) {
                    ((agrc) ((agrc) huy.a.b().i(agso.a, "DefaultPlaylistSyncChk")).k("com/google/android/apps/youtube/music/offline/sync/implementation/DefaultPlaylistSyncCheckController", "transformPlaylistAndVideosToSyncCheckRequest", 135, "DefaultPlaylistSyncCheckController.java")).w("No container download metadata entity found for %s", obj11);
                    return Optional.empty();
                }
                weh wehVar = (weh) optional3.get();
                int i8 = 20;
                if (wehVar instanceof anjx) {
                    anjq anjqVar = (anjq) optional4.get();
                    long jLongValue3 = anjqVar.getLastModifiedTimestampMillis().longValue();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    String[] strArr = (String[]) j$.util.Collection.EL.stream(((anjx) wehVar).e()).map(new hsw(i8)).toArray(new hhv(i3));
                    long jLongValue4 = anjqVar.getAddedTimestampMillis().longValue();
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    return Optional.of(new aapt((String) obj11, jLongValue3 / 1000, strArr, jLongValue4 / 1000, anjqVar.getClientLastInvalidationTimestampMillis().longValue()));
                }
                if (!(wehVar instanceof anuk)) {
                    return Optional.empty();
                }
                anuc anucVar = (anuc) optional4.get();
                long jLongValue5 = anucVar.getLastModifiedTimestampMillis().longValue();
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                long j2 = jLongValue5 / 1000;
                String[] strArr2 = (String[]) j$.util.Collection.EL.stream(((anuk) wehVar).j()).map(new hsw(i8)).toArray(new hhv(5));
                long jLongValue6 = anucVar.getAddedTimestampMillis().longValue();
                TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
                return Optional.of(new aapt((String) obj11, j2, strArr2, jLongValue6 / 1000, anucVar.getClientLastInvalidationTimestampMillis().longValue()));
            case 16:
                agke agkeVar4 = (agke) ahng.v(this.b);
                int size4 = agkeVar4.size();
                weh wehVar2 = (weh) ((Optional) ahng.v(this.a)).orElse(null);
                return iac.a(aamh.b((String) this.c, size4, wehVar2 instanceof anjx ? ((anjx) wehVar2).getTitle() : wehVar2 instanceof anuk ? ((anuk) wehVar2).getTitle() : ""), agkeVar4);
            case 17:
                return avlr.i(agke.r(this.c, ((hfn) this.b).M().ag()), new hpr(13)).ag(new ifo(this.a, 6), new ido(i3));
            case 18:
                Object obj12 = this.b;
                ((ind) this.a).e((anyx) this.c, (aihh) obj12);
                return (anzi) ((aihf) obj12).build();
            case 19:
                File file = (File) this.b;
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    while (true) {
                        int length = fileArrListFiles.length;
                        if (i4 < length) {
                            Object obj13 = this.c;
                            File file2 = fileArrListFiles[i4];
                            agyo.c(file2, new File((File) obj13, file2.getName()));
                            i4++;
                        } else {
                            ((itd) this.a).f.aj(10, 2, length);
                        }
                    }
                }
                file.delete();
                return null;
            default:
                List list2 = (List) ahng.v(this.b);
                ((itq) this.a).d.put(this.c, list2);
                return list2;
        }
    }

    public /* synthetic */ egz(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ egz(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ egz(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
