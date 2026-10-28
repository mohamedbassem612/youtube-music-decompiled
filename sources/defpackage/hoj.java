package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hoj extends afym {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/blocks/MusicDownloadsResponseGenerationBlockImpl");
    public final hpy b;
    public final Executor c;
    public final aunn d;
    public final Context e;
    public final wek f;
    public final Executor g;
    public final hpb h;
    public final hbf i;
    public final tfq j;
    public final vxz k;
    private final avmb l;
    private final avmb m;
    private final hlz n;

    public hoj(hpy hpyVar, Container container, avmb avmbVar, Executor executor, avmb avmbVar2, Executor executor2, Context context, hbf hbfVar, wek wekVar, tfq tfqVar, hlz hlzVar, hpb hpbVar, vxz vxzVar) {
        this.b = hpyVar;
        this.l = avmbVar;
        this.c = executor;
        this.m = avmbVar2;
        this.g = executor2;
        this.e = context;
        this.i = hbfVar;
        this.f = wekVar;
        this.j = tfqVar;
        this.n = hlzVar;
        this.h = hpbVar;
        this.k = vxzVar;
        this.d = new pwb(container, 1);
    }

    public static final aihf h(Context context) {
        aihf aihfVarCreateBuilder = ascf.a.createBuilder();
        String upperCase = context.getString(R.string.accessibility_play_all).toUpperCase(Locale.getDefault());
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar = (ascf) aihfVarCreateBuilder.instance;
        upperCase.getClass();
        ascfVar.b |= 1;
        ascfVar.d = upperCase;
        String string = context.getString(R.string.action_add_to_offline_songs);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar2 = (ascf) aihfVarCreateBuilder.instance;
        string.getClass();
        ascfVar2.b |= 2;
        ascfVar2.e = string;
        String string2 = context.getString(R.string.state_offlined);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar3 = (ascf) aihfVarCreateBuilder.instance;
        string2.getClass();
        ascfVar3.b |= 4;
        ascfVar3.f = string2;
        String string3 = context.getString(R.string.state_downloading);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar4 = (ascf) aihfVarCreateBuilder.instance;
        string3.getClass();
        ascfVar4.b |= 8;
        ascfVar4.g = string3;
        String string4 = context.getString(R.string.offline_dialog_download_failed);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar5 = (ascf) aihfVarCreateBuilder.instance;
        string4.getClass();
        ascfVar5.b |= 16;
        ascfVar5.h = string4;
        String string5 = context.getString(R.string.accessibility_share);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar6 = (ascf) aihfVarCreateBuilder.instance;
        string5.getClass();
        ascfVar6.b |= 32;
        ascfVar6.i = string5;
        String string6 = context.getString(R.string.action_menu);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar7 = (ascf) aihfVarCreateBuilder.instance;
        string6.getClass();
        ascfVar7.b |= 64;
        ascfVar7.j = string6;
        String string7 = context.getString(R.string.accessibility_manage_settings);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar8 = (ascf) aihfVarCreateBuilder.instance;
        string7.getClass();
        ascfVar8.b |= 536870912;
        ascfVar8.G = string7;
        String string8 = context.getString(R.string.sharing_unavailable);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar9 = (ascf) aihfVarCreateBuilder.instance;
        string8.getClass();
        ascfVar9.b |= SemanticState.Hidden;
        ascfVar9.l = string8;
        String string9 = context.getString(R.string.add_to_library_a11y_text);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar10 = (ascf) aihfVarCreateBuilder.instance;
        string9.getClass();
        ascfVar10.c |= 524288;
        ascfVar10.ad = string9;
        String string10 = context.getString(R.string.remove_from_library_a11y_text);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar11 = (ascf) aihfVarCreateBuilder.instance;
        string10.getClass();
        ascfVar11.c |= 1048576;
        ascfVar11.ae = string10;
        String string11 = context.getString(R.string.save_to_library_unavailable);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar12 = (ascf) aihfVarCreateBuilder.instance;
        string11.getClass();
        ascfVar12.b |= SemanticState.Focused;
        ascfVar12.k = string11;
        String string12 = context.getString(R.string.action_unavailable_toast);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar13 = (ascf) aihfVarCreateBuilder.instance;
        string12.getClass();
        ascfVar13.b |= SemanticState.LiveRegion;
        ascfVar13.m = string12;
        String string13 = context.getString(R.string.ep_label);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar14 = (ascf) aihfVarCreateBuilder.instance;
        string13.getClass();
        ascfVar14.b |= SemanticState.ReadOnly;
        ascfVar14.n = string13;
        String string14 = context.getString(R.string.queue_add);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar15 = (ascf) aihfVarCreateBuilder.instance;
        string14.getClass();
        ascfVar15.b |= 32768;
        ascfVar15.s = string14;
        String string15 = context.getString(R.string.add_to_queue_toast_song);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar16 = (ascf) aihfVarCreateBuilder.instance;
        string15.getClass();
        ascfVar16.b |= 65536;
        ascfVar16.t = string15;
        String string16 = context.getString(R.string.add_to_queue_toast_episode);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar17 = (ascf) aihfVarCreateBuilder.instance;
        string16.getClass();
        ascfVar17.b |= 131072;
        ascfVar17.u = string16;
        String string17 = context.getString(R.string.add_to_queue_toast_album);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar18 = (ascf) aihfVarCreateBuilder.instance;
        string17.getClass();
        ascfVar18.b |= 262144;
        ascfVar18.v = string17;
        String string18 = context.getString(R.string.add_to_queue_toast_playlist);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar19 = (ascf) aihfVarCreateBuilder.instance;
        string18.getClass();
        ascfVar19.b |= 524288;
        ascfVar19.w = string18;
        String string19 = context.getString(R.string.queue_play_next);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar20 = (ascf) aihfVarCreateBuilder.instance;
        string19.getClass();
        ascfVar20.b |= 1048576;
        ascfVar20.x = string19;
        String string20 = context.getString(R.string.play_next_toast_track);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar21 = (ascf) aihfVarCreateBuilder.instance;
        string20.getClass();
        ascfVar21.b |= 2097152;
        ascfVar21.y = string20;
        String string21 = context.getString(R.string.play_next_toast_episode);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar22 = (ascf) aihfVarCreateBuilder.instance;
        string21.getClass();
        ascfVar22.b |= 4194304;
        ascfVar22.z = string21;
        String string22 = context.getString(R.string.play_next_toast_album);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar23 = (ascf) aihfVarCreateBuilder.instance;
        string22.getClass();
        ascfVar23.b |= 16777216;
        ascfVar23.B = string22;
        String string23 = context.getString(R.string.play_next_toast_playlist);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar24 = (ascf) aihfVarCreateBuilder.instance;
        string23.getClass();
        ascfVar24.b |= 8388608;
        ascfVar24.A = string23;
        String string24 = context.getString(R.string.save_to_playlist);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar25 = (ascf) aihfVarCreateBuilder.instance;
        string24.getClass();
        ascfVar25.b |= 33554432;
        ascfVar25.C = string24;
        String string25 = context.getString(R.string.action_remove_from_offline_songs);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar26 = (ascf) aihfVarCreateBuilder.instance;
        string25.getClass();
        ascfVar26.b |= 67108864;
        ascfVar26.D = string25;
        String string26 = context.getString(R.string.shuffle_play_button);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar27 = (ascf) aihfVarCreateBuilder.instance;
        string26.getClass();
        ascfVar27.b |= 134217728;
        ascfVar27.E = string26;
        String string27 = context.getString(R.string.podcast_label);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar28 = (ascf) aihfVarCreateBuilder.instance;
        string27.getClass();
        ascfVar28.b |= 1073741824;
        ascfVar28.H = string27;
        String string28 = context.getString(R.string.description_truncation_text);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar29 = (ascf) aihfVarCreateBuilder.instance;
        string28.getClass();
        ascfVar29.c |= 131072;
        ascfVar29.ab = string28;
        String string29 = context.getString(R.string.description_collapse_button_label);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar30 = (ascf) aihfVarCreateBuilder.instance;
        string29.getClass();
        ascfVar30.c |= 262144;
        ascfVar30.ac = string29;
        String quantityString = context.getResources().getQuantityString(R.plurals.accessibility_duration_description_hours_label, 1);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar31 = (ascf) aihfVarCreateBuilder.instance;
        quantityString.getClass();
        ascfVar31.b |= Integer.MIN_VALUE;
        ascfVar31.I = quantityString;
        String quantityString2 = context.getResources().getQuantityString(R.plurals.accessibility_duration_description_hours_label, 10);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar32 = (ascf) aihfVarCreateBuilder.instance;
        quantityString2.getClass();
        ascfVar32.c |= 1;
        ascfVar32.J = quantityString2;
        String quantityString3 = context.getResources().getQuantityString(R.plurals.accessibility_duration_description_minutes_label, 1);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar33 = (ascf) aihfVarCreateBuilder.instance;
        quantityString3.getClass();
        ascfVar33.c |= 2;
        ascfVar33.K = quantityString3;
        String quantityString4 = context.getResources().getQuantityString(R.plurals.accessibility_duration_description_minutes_label, 10);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar34 = (ascf) aihfVarCreateBuilder.instance;
        quantityString4.getClass();
        ascfVar34.c |= 4;
        ascfVar34.L = quantityString4;
        String quantityString5 = context.getResources().getQuantityString(R.plurals.accessibility_duration_description_seconds_label, 1);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar35 = (ascf) aihfVarCreateBuilder.instance;
        quantityString5.getClass();
        ascfVar35.c |= 8;
        ascfVar35.M = quantityString5;
        String quantityString6 = context.getResources().getQuantityString(R.plurals.accessibility_duration_description_seconds_label, 10);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar36 = (ascf) aihfVarCreateBuilder.instance;
        quantityString6.getClass();
        ascfVar36.c |= 16;
        ascfVar36.N = quantityString6;
        String string30 = context.getResources().getString(R.string.action_disable_auto_download);
        aihfVarCreateBuilder.copyOnWrite();
        ascf ascfVar37 = (ascf) aihfVarCreateBuilder.instance;
        string30.getClass();
        ascfVar37.c |= 64;
        ascfVar37.Q = string30;
        return aihfVarCreateBuilder;
    }

    private final void i(avlr avlrVar, String str, mbb mbbVar, awlk awlkVar) {
        mbbVar.a(new hfo(awlkVar, avlrVar.Z(awlkVar.A()).O(this.l).ah(new gto((Object) this, (Object) mbbVar, (Object) str, 3, (byte[]) null), new hib(mbbVar, 14), new hoi(mbbVar, 0)), 9));
    }

    public final ListenableFuture a(ListenableFuture listenableFuture) {
        afxd afxdVarF = afxd.f(listenableFuture);
        hoh hohVar = new hoh(2);
        Executor executor = this.c;
        return afxdVarF.g(hohVar, executor).h(new hba(this.b, 16), executor).g(new hoh(3), executor);
    }

    public final ListenableFuture b(String str) {
        return afxd.f(this.b.a(wfs.g(318, str))).g(new hdn(20), this.c);
    }

    public final ListenableFuture c(List list) {
        return afxd.f(this.b.b(list)).g(new hdn(19), this.c);
    }

    public final almd d(anuk anukVar, List list, List list2, boolean z, Optional optional) {
        aihf aihfVarCreateBuilder = asch.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asch aschVar = (asch) aihfVarCreateBuilder.instance;
        anuu anuuVar = anukVar.c;
        anuuVar.getClass();
        aschVar.c = anuuVar;
        aschVar.b |= 1;
        int i = 9;
        Iterable iterable = (Iterable) Collection.EL.stream(list).map(new hnv(7)).collect(Collectors.toCollection(new hcd(9)));
        aihfVarCreateBuilder.copyOnWrite();
        asch aschVar2 = (asch) aihfVarCreateBuilder.instance;
        aiie aiieVar = aschVar2.d;
        if (!aiieVar.c()) {
            aschVar2.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aschVar2.d);
        ascf ascfVarE = e(anukVar, list);
        aihfVarCreateBuilder.copyOnWrite();
        asch aschVar3 = (asch) aihfVarCreateBuilder.instance;
        ascfVarE.getClass();
        aschVar3.e = ascfVarE;
        aschVar3.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        asch aschVar4 = (asch) aihfVarCreateBuilder.instance;
        aschVar4.b |= 4;
        aschVar4.f = z;
        boolean zI = this.j.i();
        aihfVarCreateBuilder.copyOnWrite();
        asch aschVar5 = (asch) aihfVarCreateBuilder.instance;
        aschVar5.b |= 8;
        aschVar5.g = zI;
        Map map = (Map) Collection.EL.stream(list2).collect(aghu.a(new hnv(8), new hnv(i)));
        aihfVarCreateBuilder.copyOnWrite();
        asch aschVar6 = (asch) aihfVarCreateBuilder.instance;
        aiip aiipVar = aschVar6.h;
        if (!aiipVar.b) {
            aschVar6.h = aiipVar.a();
        }
        aschVar6.h.putAll(map);
        aihfVarCreateBuilder.copyOnWrite();
        asch aschVar7 = (asch) aihfVarCreateBuilder.instance;
        aschVar7.i = 1;
        aschVar7.b |= 16;
        float f = this.e.getResources().getConfiguration().fontScale;
        aihfVarCreateBuilder.copyOnWrite();
        asch aschVar8 = (asch) aihfVarCreateBuilder.instance;
        aschVar8.b |= 64;
        aschVar8.k = f;
        hge hgeVar = new hge(aihfVarCreateBuilder, 5);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) hgeVar.a;
            aihfVar.copyOnWrite();
            asch aschVar9 = (asch) aihfVar.instance;
            aschVar9.j = (anqt) obj;
            aschVar9.b |= 32;
        }
        Object objIo = this.d.io();
        asch aschVar10 = (asch) aihfVarCreateBuilder.build();
        ((afzv) objIo).i();
        almd almdVar = almd.a;
        return (almd) ((BaseClient) objIo).f(-2024118434, aschVar10, aihn.getParserForClass(almd.class));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:35:0x0300  */
    public final ascf e(weh wehVar, List list) {
        int iIntValue;
        String audioPlaylistId;
        boolean z;
        String strA;
        long seconds;
        String quantityString;
        boolean z2 = wehVar instanceof anuk;
        if (z2) {
            anuk anukVar = (anuk) wehVar;
            iIntValue = anukVar.getTrackCount().intValue();
            audioPlaylistId = anukVar.getPlaylistId();
        } else {
            anjx anjxVar = (anjx) wehVar;
            iIntValue = anjxVar.getTrackCount().intValue();
            audioPlaylistId = anjxVar.getAudioPlaylistId();
        }
        int size = list.size();
        Context context = this.e;
        aihf aihfVarH = h(context);
        if (z2) {
            anuk anukVar2 = (anuk) wehVar;
            if (audioPlaylistId.equals("PPSE") || anukVar2.k()) {
                aihfVarH.cu(agke.A(context.getResources().getString(R.string.jan_month), context.getResources().getString(R.string.feb_month), context.getResources().getString(R.string.mar_month), context.getResources().getString(R.string.apr_month), context.getResources().getString(R.string.may_month), context.getResources().getString(R.string.jun_month), context.getResources().getString(R.string.jul_month), context.getResources().getString(R.string.aug_month), context.getResources().getString(R.string.sep_month), context.getResources().getString(R.string.oct_month), context.getResources().getString(R.string.nov_month), context.getResources().getString(R.string.dec_month), new String[0]));
                String string = context.getResources().getString(R.string.time_remaining_text_hour);
                aihfVarH.copyOnWrite();
                ascf ascfVar = (ascf) aihfVarH.instance;
                ascf ascfVar2 = ascf.a;
                string.getClass();
                ascfVar.c |= SemanticState.Focused;
                ascfVar.R = string;
                String string2 = context.getResources().getString(R.string.time_remaining_text_min);
                aihfVarH.copyOnWrite();
                ascf ascfVar3 = (ascf) aihfVarH.instance;
                string2.getClass();
                ascfVar3.c |= SemanticState.Hidden;
                ascfVar3.S = string2;
                String string3 = context.getResources().getString(R.string.time_remaining_text_sec);
                aihfVarH.copyOnWrite();
                ascf ascfVar4 = (ascf) aihfVarH.instance;
                string3.getClass();
                ascfVar4.c |= SemanticState.Modal;
                ascfVar4.V = string3;
                String string4 = context.getResources().getString(R.string.time_remaining_text_left);
                aihfVarH.copyOnWrite();
                ascf ascfVar5 = (ascf) aihfVarH.instance;
                string4.getClass();
                ascfVar5.c |= SemanticState.LiveRegion;
                ascfVar5.T = string4;
                String string5 = context.getResources().getString(R.string.time_remaining_text_played);
                aihfVarH.copyOnWrite();
                ascf ascfVar6 = (ascf) aihfVarH.instance;
                string5.getClass();
                ascfVar6.c |= SemanticState.ReadOnly;
                ascfVar6.U = string5;
                String string6 = context.getResources().getString(R.string.play_a11y_text);
                aihfVarH.copyOnWrite();
                ascf ascfVar7 = (ascf) aihfVarH.instance;
                string6.getClass();
                ascfVar7.c |= SemanticState.Obscured;
                ascfVar7.W = string6;
                String string7 = context.getResources().getString(R.string.pause_a11y_text);
                aihfVarH.copyOnWrite();
                ascf ascfVar8 = (ascf) aihfVarH.instance;
                string7.getClass();
                ascfVar8.c |= SemanticState.Multiline;
                ascfVar8.X = string7;
                String string8 = context.getResources().getString(R.string.resume_a11y_text);
                aihfVarH.copyOnWrite();
                ascf ascfVar9 = (ascf) aihfVarH.instance;
                string8.getClass();
                ascfVar9.c |= 16384;
                ascfVar9.Y = string8;
            }
            z = true;
        } else {
            z = false;
        }
        String string9 = context.getString(R.string.single_label);
        aihfVarH.copyOnWrite();
        ascf ascfVar10 = (ascf) aihfVarH.instance;
        ascf ascfVar11 = ascf.a;
        string9.getClass();
        ascfVar10.b |= SemanticState.Modal;
        ascfVar10.o = string9;
        String string10 = context.getString(R.string.album_label);
        aihfVarH.copyOnWrite();
        ascf ascfVar12 = (ascf) aihfVarH.instance;
        string10.getClass();
        ascfVar12.b |= SemanticState.Obscured;
        ascfVar12.p = string10;
        String string11 = context.getString(R.string.playlist_label);
        aihfVarH.copyOnWrite();
        ascf ascfVar13 = (ascf) aihfVarH.instance;
        string11.getClass();
        ascfVar13.b |= 16384;
        ascfVar13.r = string11;
        hlz hlzVar = this.n;
        if (audioPlaylistId.equals("PPSE") || TextUtils.equals(audioPlaylistId, "SE")) {
            strA = hlzVar.e.a(iIntValue);
        } else {
            strA = hlzVar.d.getResources().getQuantityString(true != audioPlaylistId.startsWith("PL") ? R.plurals.song_count : R.plurals.track_count, iIntValue, Integer.valueOf(iIntValue));
        }
        aihfVarH.copyOnWrite();
        ascf ascfVar14 = (ascf) aihfVarH.instance;
        strA.getClass();
        ascfVar14.b |= SemanticState.Multiline;
        ascfVar14.q = strA;
        Resources resources = context.getResources();
        Integer numValueOf = Integer.valueOf(size);
        String quantityString2 = resources.getQuantityString(R.plurals.smart_downloads_details_header_byline_explanation, size, numValueOf, numValueOf);
        aihfVarH.copyOnWrite();
        ascf ascfVar15 = (ascf) aihfVarH.instance;
        quantityString2.getClass();
        ascfVar15.b |= 268435456;
        ascfVar15.F = quantityString2;
        String string12 = context.getResources().getString(R.string.action_disable_auto_download);
        aihfVarH.copyOnWrite();
        ascf ascfVar16 = (ascf) aihfVarH.instance;
        string12.getClass();
        ascfVar16.c |= 64;
        ascfVar16.Q = string12;
        int size2 = list.size();
        if (z) {
            anuk anukVar3 = (anuk) wehVar;
            if (anukVar3.getPlaylistId().equals("PPSE") || anukVar3.k()) {
                quantityString = context.getResources().getQuantityString(R.plurals.podcast_episodes_count, size2, Integer.valueOf(size2));
            } else {
                seconds = Duration.ofMillis(Collection.EL.stream(list).mapToLong(new cpt(6)).sum()).toSeconds();
                if (seconds > 86400) {
                    quantityString = context.getString(R.string.track_count_duration_twenty_four_plus_hours, Integer.valueOf(size2));
                } else {
                    quantityString = context.getResources().getQuantityString(R.plurals.offline_playlist_size_and_duration, size2, Integer.valueOf(size2), nsj.b(context.getResources(), typ.i(seconds, 3)).toString());
                }
            }
        } else {
            seconds = Duration.ofMillis(Collection.EL.stream(list).mapToLong(new cpt(6)).sum()).toSeconds();
            if (seconds > 86400) {
                quantityString = context.getString(R.string.track_count_duration_twenty_four_plus_hours, Integer.valueOf(size2));
            } else {
                quantityString = context.getResources().getQuantityString(R.plurals.offline_playlist_size_and_duration, size2, Integer.valueOf(size2), nsj.b(context.getResources(), typ.i(seconds, 3)).toString());
            }
        }
        aihfVarH.copyOnWrite();
        ascf ascfVar17 = (ascf) aihfVarH.instance;
        quantityString.getClass();
        ascfVar17.c |= 32;
        ascfVar17.O = quantityString;
        return (ascf) aihfVarH.build();
    }

    @Override // defpackage.afym
    public final void f(ascb ascbVar, mbb mbbVar) {
        String str = ascbVar.c;
        awlk awlkVar = new awlk();
        int iHashCode = str.hashCode();
        if (iHashCode != -1928212878) {
            if (iHashCode != 2462802) {
                if (iHashCode == 2462819 && str.equals("PPSV")) {
                    i(gzj.av(this.b), str, mbbVar, awlkVar);
                    return;
                }
            } else if (str.equals("PPSE")) {
                i(gzj.au(this.b), str, mbbVar, awlkVar);
                return;
            }
        } else if (str.equals("PPSDST")) {
            hpy hpyVar = this.b;
            hpt hptVarA = hpu.a();
            hptVarA.f(true);
            i(gzj.as(hpyVar, hptVarA.a()), str, mbbVar, awlkVar);
            return;
        }
        hpy hpyVar2 = this.b;
        int i = 15;
        mbbVar.a(new hfo(awlkVar, avlr.i(agke.r(hpyVar2.e(kro.am(str)), hpyVar2.e(kro.ay(str))), new gnw(i)).T(new gkq(17)).Z(awlkVar.A()).O(this.l).ah(new gto((Object) this, (Object) mbbVar, (Object) str, 4, (byte[]) null), new hib(mbbVar, i), new hoi(mbbVar, 0)), 10));
    }

    @Override // defpackage.afym
    public final void g(ascc asccVar, final mbb mbbVar) {
        awlk awlkVar = new awlk();
        mbbVar.a(new hfo(awlkVar, this.b.e(kro.aH(asccVar.c)).O(this.l).X(new hbn(this, 11)).Z(awlkVar.A()).O(this.m).ah(new avni() { // from class: hof
            @Override // defpackage.avni
            public final void a(Object obj) {
                Pair pair = (Pair) obj;
                anyx anyxVar = (anyx) pair.first;
                aret aretVar = (aret) pair.second;
                hoj hojVar = this.a;
                Object objIo = hojVar.d.io();
                aihf aihfVarCreateBuilder = ascg.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ascg ascgVar = (ascg) aihfVarCreateBuilder.instance;
                anzd anzdVar = anyxVar.c;
                anzdVar.getClass();
                ascgVar.c = anzdVar;
                ascgVar.b |= 1;
                Context context = hojVar.e;
                aihf aihfVarH = hoj.h(context);
                aihfVarH.cu(agke.A(context.getResources().getString(R.string.jan_month), context.getResources().getString(R.string.feb_month), context.getResources().getString(R.string.mar_month), context.getResources().getString(R.string.apr_month), context.getResources().getString(R.string.may_month), context.getResources().getString(R.string.jun_month), context.getResources().getString(R.string.jul_month), context.getResources().getString(R.string.aug_month), context.getResources().getString(R.string.sep_month), context.getResources().getString(R.string.oct_month), context.getResources().getString(R.string.nov_month), context.getResources().getString(R.string.dec_month), new String[0]));
                String string = context.getResources().getString(R.string.time_remaining_text_hour);
                aihfVarH.copyOnWrite();
                ascf ascfVar = (ascf) aihfVarH.instance;
                ascf ascfVar2 = ascf.a;
                string.getClass();
                ascfVar.c |= SemanticState.Focused;
                ascfVar.R = string;
                String string2 = context.getResources().getString(R.string.time_remaining_text_min);
                aihfVarH.copyOnWrite();
                ascf ascfVar3 = (ascf) aihfVarH.instance;
                string2.getClass();
                ascfVar3.c |= SemanticState.Hidden;
                ascfVar3.S = string2;
                String string3 = context.getResources().getString(R.string.time_remaining_text_sec);
                aihfVarH.copyOnWrite();
                ascf ascfVar4 = (ascf) aihfVarH.instance;
                string3.getClass();
                ascfVar4.c |= SemanticState.Modal;
                ascfVar4.V = string3;
                String string4 = context.getResources().getString(R.string.time_remaining_text_left);
                aihfVarH.copyOnWrite();
                ascf ascfVar5 = (ascf) aihfVarH.instance;
                string4.getClass();
                ascfVar5.c |= SemanticState.LiveRegion;
                ascfVar5.T = string4;
                String string5 = context.getResources().getString(R.string.time_remaining_text_played);
                aihfVarH.copyOnWrite();
                ascf ascfVar6 = (ascf) aihfVarH.instance;
                string5.getClass();
                ascfVar6.c |= SemanticState.ReadOnly;
                ascfVar6.U = string5;
                String string6 = context.getResources().getString(R.string.play_a11y_text);
                aihfVarH.copyOnWrite();
                ascf ascfVar7 = (ascf) aihfVarH.instance;
                string6.getClass();
                ascfVar7.c |= SemanticState.Obscured;
                ascfVar7.W = string6;
                String string7 = context.getResources().getString(R.string.pause_a11y_text);
                aihfVarH.copyOnWrite();
                ascf ascfVar8 = (ascf) aihfVarH.instance;
                string7.getClass();
                ascfVar8.c |= SemanticState.Multiline;
                ascfVar8.X = string7;
                String string8 = context.getResources().getString(R.string.resume_a11y_text);
                aihfVarH.copyOnWrite();
                ascf ascfVar9 = (ascf) aihfVarH.instance;
                string8.getClass();
                ascfVar9.c |= 16384;
                ascfVar9.Y = string8;
                String string9 = context.getResources().getString(R.string.add_to_episodes_for_later_a11y_text);
                aihfVarH.copyOnWrite();
                ascf ascfVar10 = (ascf) aihfVarH.instance;
                string9.getClass();
                ascfVar10.c |= 32768;
                ascfVar10.Z = string9;
                String string10 = context.getResources().getString(R.string.remove_from_episodes_for_later_a11y_text);
                aihfVarH.copyOnWrite();
                ascf ascfVar11 = (ascf) aihfVarH.instance;
                string10.getClass();
                ascfVar11.c |= 65536;
                ascfVar11.aa = string10;
                ascf ascfVar12 = (ascf) aihfVarH.build();
                aihfVarCreateBuilder.copyOnWrite();
                mbb mbbVar2 = mbbVar;
                ascg ascgVar2 = (ascg) aihfVarCreateBuilder.instance;
                ascfVar12.getClass();
                ascgVar2.d = ascfVar12;
                ascgVar2.b |= 2;
                areu areuVar = aretVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                ascg ascgVar3 = (ascg) aihfVarCreateBuilder.instance;
                areuVar.getClass();
                ascgVar3.e = areuVar;
                ascgVar3.b |= 4;
                aihfVarCreateBuilder.copyOnWrite();
                ascg ascgVar4 = (ascg) aihfVarCreateBuilder.instance;
                ascgVar4.f = 1;
                ascgVar4.b |= 8;
                ascg ascgVar5 = (ascg) aihfVarCreateBuilder.build();
                ((afzv) objIo).i();
                almd almdVar = almd.a;
                mbbVar2.d((almd) ((BaseClient) objIo).f(328843208, ascgVar5, aihn.getParserForClass(almd.class)));
            }
        }, new hib(mbbVar, 13), new hoi(mbbVar, 0)), 8));
    }
}
