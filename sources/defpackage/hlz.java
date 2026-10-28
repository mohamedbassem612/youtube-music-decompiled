package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlz {
    public static final agke a = agke.u(Integer.valueOf(R.drawable.recent_played_songs_96), Integer.valueOf(R.drawable.recent_played_songs_192), Integer.valueOf(R.drawable.recent_played_songs_288), Integer.valueOf(R.drawable.recent_played_songs_384), Integer.valueOf(R.drawable.recent_played_songs_576));
    public static final agke b = agke.u(Integer.valueOf(R.drawable.downloaded_songs_96), Integer.valueOf(R.drawable.downloaded_songs_192), Integer.valueOf(R.drawable.downloaded_songs_288), Integer.valueOf(R.drawable.downloaded_songs_384), Integer.valueOf(R.drawable.downloaded_songs_576));
    public static final agke c = agke.u(Integer.valueOf(R.drawable.downloaded_episodes_96), Integer.valueOf(R.drawable.downloaded_episodes_192), Integer.valueOf(R.drawable.downloaded_episodes_288), Integer.valueOf(R.drawable.downloaded_episodes_384), Integer.valueOf(R.drawable.downloaded_episodes_576));
    public final Context d;
    public final hbf e;
    public final abxv f;
    private final vxz g;

    public hlz(Context context, abxv abxvVar, hbf hbfVar, vxz vxzVar) {
        this.d = context;
        this.f = abxvVar;
        this.e = hbfVar;
        this.g = vxzVar;
    }

    @Deprecated
    public static aofc c(aamh aamhVar) {
        aofu aofuVar;
        if (aamhVar == null || (aofuVar = aamhVar.h) == null) {
            return null;
        }
        return d(aofuVar);
    }

    public static aofc d(aofu aofuVar) {
        if (aofuVar.j.size() != 0) {
            for (aoft aoftVar : aofuVar.j) {
                if ((aoftVar.b & 1) != 0) {
                    aofc aofcVar = aoftVar.c;
                    return aofcVar == null ? aofc.a : aofcVar;
                }
            }
        }
        return null;
    }

    public static boolean m(aamh aamhVar) {
        Optional optionalEmpty;
        aofu aofuVar = aamhVar.h;
        if (aofuVar == null) {
            optionalEmpty = Optional.empty();
            break;
        }
        Iterator it = aofuVar.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                optionalEmpty = Optional.empty();
                break;
            }
            aoft aoftVar = (aoft) it.next();
            if ((aoftVar.b & 1) != 0) {
                aofc aofcVar = aoftVar.c;
                if (aofcVar == null) {
                    aofcVar = aofc.a;
                }
                optionalEmpty = Optional.of(aofcVar);
                break;
            }
        }
        return optionalEmpty.isPresent() && ((aofc) optionalEmpty.get()).l;
    }

    public static boolean n(anuk anukVar) {
        return (anukVar.getPodcastShowAdditionalMetadata().b & 1) != 0;
    }

    private static ajwo r(String str, apcc apccVar) {
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = apcb.b;
        aihf aihfVarCreateBuilder = apcb.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apcb apcbVar = (apcb) aihfVarCreateBuilder.instance;
        apcbVar.f = apccVar.e;
        apcbVar.c |= 4;
        aihf aihfVarCreateBuilder2 = apcd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apcd apcdVar = (apcd) aihfVarCreateBuilder2.instance;
        apcdVar.b |= 4;
        apcdVar.e = true;
        aihfVarCreateBuilder2.copyOnWrite();
        apcd apcdVar2 = (apcd) aihfVarCreateBuilder2.instance;
        str.getClass();
        apcdVar2.b |= 2;
        apcdVar2.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        apcb apcbVar2 = (apcb) aihfVarCreateBuilder.instance;
        apcd apcdVar3 = (apcd) aihfVarCreateBuilder2.build();
        apcdVar3.getClass();
        apcbVar2.d = apcdVar3;
        apcbVar2.c |= 1;
        aihhVar.e(aihlVar, (apcb) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    private static anfv s(String str) {
        aofx aofxVar;
        if (str == null) {
            aofxVar = aofx.a;
        } else {
            aihf aihfVarCreateBuilder = aofx.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aofx aofxVar2 = (aofx) aihfVarCreateBuilder.instance;
            aofxVar2.c |= 1;
            aofxVar2.d = str;
            aofxVar = (aofx) aihfVarCreateBuilder.build();
        }
        aihf aihfVarCreateBuilder2 = anfv.a.createBuilder();
        aihf aihfVarCreateBuilder3 = anga.a.createBuilder();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(aofx.b, aofxVar);
        aihfVarCreateBuilder3.copyOnWrite();
        anga angaVar = (anga) aihfVarCreateBuilder3.instance;
        ajwo ajwoVar = (ajwo) aihhVar.build();
        ajwoVar.getClass();
        angaVar.e = ajwoVar;
        angaVar.b |= 64;
        alja aljaVar = alja.a;
        aihfVarCreateBuilder3.copyOnWrite();
        anga angaVar2 = (anga) aihfVarCreateBuilder3.instance;
        aljaVar.getClass();
        angaVar2.d = aljaVar;
        angaVar2.b |= 8;
        aihfVarCreateBuilder2.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder2.instance;
        anga angaVar3 = (anga) aihfVarCreateBuilder3.build();
        angaVar3.getClass();
        anfvVar.c = angaVar3;
        anfvVar.b = 66441155;
        return (anfv) aihfVarCreateBuilder2.build();
    }

    private final anfv t(String str) {
        aihf aihfVarCreateBuilder = anfv.a.createBuilder();
        aihf aihfVarCreateBuilder2 = anga.a.createBuilder();
        alay alayVarD = ackj.d(this.d.getString(R.string.queue_add));
        aihfVarCreateBuilder2.copyOnWrite();
        anga angaVar = (anga) aihfVarCreateBuilder2.instance;
        alayVarD.getClass();
        angaVar.c = alayVarD;
        angaVar.b |= 1;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.QUEUE_MUSIC;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        anga angaVar2 = (anga) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        angaVar2.d = aljaVar2;
        angaVar2.b |= 8;
        ajwo ajwoVarR = r(str, apcc.INSERT_AT_END);
        aihfVarCreateBuilder2.copyOnWrite();
        anga angaVar3 = (anga) aihfVarCreateBuilder2.instance;
        ajwoVarR.getClass();
        angaVar3.e = ajwoVarR;
        angaVar3.b |= 64;
        aihfVarCreateBuilder.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder.instance;
        anga angaVar4 = (anga) aihfVarCreateBuilder2.build();
        angaVar4.getClass();
        anfvVar.c = angaVar4;
        anfvVar.b = 66441155;
        return (anfv) aihfVarCreateBuilder.build();
    }

    private final anfv u(String str) {
        aihf aihfVarCreateBuilder = anfv.a.createBuilder();
        aihf aihfVarCreateBuilder2 = anga.a.createBuilder();
        alay alayVarD = ackj.d(this.d.getString(R.string.queue_play_next));
        aihfVarCreateBuilder2.copyOnWrite();
        anga angaVar = (anga) aihfVarCreateBuilder2.instance;
        alayVarD.getClass();
        angaVar.c = alayVarD;
        angaVar.b |= 1;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.QUEUE_PLAY_NEXT;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        anga angaVar2 = (anga) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        angaVar2.d = aljaVar2;
        angaVar2.b |= 8;
        ajwo ajwoVarR = r(str, apcc.INSERT_AFTER_CURRENT_VIDEO);
        aihfVarCreateBuilder2.copyOnWrite();
        anga angaVar3 = (anga) aihfVarCreateBuilder2.instance;
        ajwoVarR.getClass();
        angaVar3.e = ajwoVarR;
        angaVar3.b |= 64;
        aihfVarCreateBuilder.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder.instance;
        anga angaVar4 = (anga) aihfVarCreateBuilder2.build();
        angaVar4.getClass();
        anfvVar.c = angaVar4;
        anfvVar.b = 66441155;
        return (anfv) aihfVarCreateBuilder.build();
    }

    private final anfv v(String str) {
        aihf aihfVarCreateBuilder = anfw.a.createBuilder();
        alay alayVarD = ackj.d(this.d.getString(R.string.shuffle_play_button));
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar = (anfw) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anfwVar.c = alayVarD;
        anfwVar.b |= 1;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.SHUFFLE;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar2 = (anfw) aihfVarCreateBuilder.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        anfwVar2.d = aljaVar2;
        anfwVar2.b |= 2;
        ias iasVarG = hna.g();
        iasVarG.b = str;
        iasVarG.k(true);
        ajwo ajwoVarB = iasVarG.b();
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar3 = (anfw) aihfVarCreateBuilder.instance;
        ajwoVarB.getClass();
        anfwVar3.f = ajwoVarB;
        anfwVar3.b |= 32;
        anfw anfwVar4 = (anfw) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = anfv.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder2.instance;
        anfwVar4.getClass();
        anfvVar.c = anfwVar4;
        anfvVar.b = 66441108;
        return (anfv) aihfVarCreateBuilder2.build();
    }

    private final String w(int i, String str) {
        return this.d.getResources().getQuantityString(R.plurals.podcast_with_entity_type_and_creator_and_episode_count_item_subtitle, i, str, Integer.valueOf(i));
    }

    private static boolean x(String str) {
        return TextUtils.equals(str, "LM") || TextUtils.equals(str, "PPOM") || TextUtils.equals(str, "SS") || TextUtils.equals(str, "SE") || TextUtils.equals(str, "PPSDST");
    }

    private static final angf y(String str) {
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = aofx.b;
        aihf aihfVarCreateBuilder = aofx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofx aofxVar = (aofx) aihfVarCreateBuilder.instance;
        str.getClass();
        aofxVar.c |= 1;
        aofxVar.d = str;
        aihhVar2.e(aihlVar, (aofx) aihfVarCreateBuilder.build());
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        ajwo ajwoVar = (ajwo) aihhVar2.build();
        ajwoVar.getClass();
        ajnfVar.q = ajwoVar;
        ajnfVar.b |= SemanticState.Modal;
        ajnf ajnfVar2 = (ajnf) aihhVar.build();
        aihf aihfVarCreateBuilder2 = angf.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        angf angfVar = (angf) aihfVarCreateBuilder2.instance;
        ajnfVar2.getClass();
        angfVar.c = ajnfVar2;
        angfVar.b |= 1;
        return (angf) aihfVarCreateBuilder2.build();
    }

    public final anfv a(anfv anfvVar) {
        aihf builder = anfvVar.toBuilder();
        yno.dY(builder, ackj.c(this.d.getResources().getString(R.string.action_remove_playlist_from_offline)));
        anfv anfvVar2 = (anfv) builder.instance;
        aihf builder2 = (anfvVar2.b == 66441155 ? (anga) anfvVar2.c : anga.a).toBuilder();
        ajwo ajwoVarDT = yno.dT((anfv) builder.build());
        aliz alizVar = aliz.REMOVE_FROM_LIBRARY;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        builder2.copyOnWrite();
        anga angaVar = (anga) builder2.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        angaVar.d = aljaVar2;
        angaVar.b |= 8;
        builder.copyOnWrite();
        anfv anfvVar3 = (anfv) builder.instance;
        anga angaVar2 = (anga) builder2.build();
        angaVar2.getClass();
        anfvVar3.c = angaVar2;
        anfvVar3.b = 66441155;
        if (ajwoVarDT != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aofx.b);
            ajwoVarDT.c(aihlVarCheckIsLite);
            if (ajwoVarDT.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aofx.b);
                ajwoVarDT.c(aihlVarCheckIsLite2);
                Object objK = ajwoVarDT.j.k(aihlVarCheckIsLite2.d);
                aihf builder3 = ((aofx) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
                builder3.copyOnWrite();
                aofx aofxVar = (aofx) builder3.instance;
                aofxVar.e = 2;
                aofxVar.c |= 2;
                aofx aofxVar2 = (aofx) builder3.build();
                aihh aihhVar2 = (aihh) ajwoVarDT.toBuilder();
                aihhVar2.e(aofx.b, aofxVar2);
                yno.dX(builder, (ajwo) aihhVar2.build());
            }
        }
        return (anfv) builder.build();
    }

    public final anfy b(String str, String str2, Uri uri, anrp anrpVar) {
        aihf aihfVarCreateBuilder = anfy.a.createBuilder();
        aihfVarCreateBuilder.bJ(y(str));
        ArrayList arrayList = new ArrayList();
        if (!x(str) && !TextUtils.equals(str, "SE") && uri != null && !TextUtils.isEmpty(uri.toString())) {
            aihf aihfVarCreateBuilder2 = anga.a.createBuilder();
            alay alayVarD = ackj.d(this.d.getString(R.string.menu_share));
            aihfVarCreateBuilder2.copyOnWrite();
            anga angaVar = (anga) aihfVarCreateBuilder2.instance;
            alayVarD.getClass();
            angaVar.c = alayVarD;
            angaVar.b |= 1;
            aihh aihhVar = (aihh) alja.a.createBuilder();
            aliz alizVar = aliz.SHARE;
            aihhVar.copyOnWrite();
            alja aljaVar = (alja) aihhVar.instance;
            aljaVar.c = alizVar.yN;
            aljaVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            anga angaVar2 = (anga) aihfVarCreateBuilder2.instance;
            alja aljaVar2 = (alja) aihhVar.build();
            aljaVar2.getClass();
            angaVar2.d = aljaVar2;
            angaVar2.b |= 8;
            aihf aihfVarCreateBuilder3 = apth.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            apth apthVar = (apth) aihfVarCreateBuilder3.instance;
            str2.getClass();
            apthVar.c |= 4;
            apthVar.e = str2;
            String string = uri.toString();
            aihfVarCreateBuilder3.copyOnWrite();
            apth apthVar2 = (apth) aihfVarCreateBuilder3.instance;
            string.getClass();
            apthVar2.c |= 2;
            apthVar2.d = string;
            apth apthVar3 = (apth) aihfVarCreateBuilder3.build();
            aihf aihfVarCreateBuilder4 = anfv.a.createBuilder();
            aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
            aihhVar2.e(apth.b, apthVar3);
            aihfVarCreateBuilder2.copyOnWrite();
            anga angaVar3 = (anga) aihfVarCreateBuilder2.instance;
            ajwo ajwoVar = (ajwo) aihhVar2.build();
            ajwoVar.getClass();
            angaVar3.e = ajwoVar;
            angaVar3.b |= 64;
            aihfVarCreateBuilder4.copyOnWrite();
            anfv anfvVar = (anfv) aihfVarCreateBuilder4.instance;
            anga angaVar4 = (anga) aihfVarCreateBuilder2.build();
            angaVar4.getClass();
            anfvVar.c = angaVar4;
            anfvVar.b = 66441155;
            arrayList.add((anfv) aihfVarCreateBuilder4.build());
        }
        arrayList.add(u(str));
        arrayList.add(t(str));
        arrayList.add(v(str));
        if (this.g.l(172, 45648925L, false)) {
            arrayList.add(a(s(str)));
        } else {
            arrayList.add(s(str));
        }
        aihfVarCreateBuilder.bH(arrayList);
        aihf aihfVarCreateBuilder5 = ange.a.createBuilder();
        aihfVarCreateBuilder5.copyOnWrite();
        ange angeVar = (ange) aihfVarCreateBuilder5.instance;
        anrpVar.getClass();
        angeVar.c = anrpVar;
        angeVar.b = 72399185;
        aihfVarCreateBuilder.copyOnWrite();
        anfy anfyVar = (anfy) aihfVarCreateBuilder.instance;
        ange angeVar2 = (ange) aihfVarCreateBuilder5.build();
        angeVar2.getClass();
        anfyVar.f = angeVar2;
        anfyVar.b |= 4;
        return (anfy) aihfVarCreateBuilder.build();
    }

    public final apji e(aqmh aqmhVar) {
        aihf aihfVarCreateBuilder = anyi.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anyi anyiVar = (anyi) aihfVarCreateBuilder.instance;
        aqmhVar.getClass();
        anyiVar.c = aqmhVar;
        anyiVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anyi anyiVar2 = (anyi) aihfVarCreateBuilder.instance;
        anyiVar2.e = 1;
        anyiVar2.b |= 4;
        anyi anyiVar3 = (anyi) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(anyj.a, anyiVar3);
        return (apji) aihhVar.build();
    }

    final aqmh f() {
        aihh aihhVar = (aihh) aqmh.a.createBuilder();
        int color = this.d.getColor(R.color.ytm_color_grey_09);
        aihhVar.copyOnWrite();
        aqmh aqmhVar = (aqmh) aihhVar.instance;
        aqmhVar.b |= 2;
        aqmhVar.d = color;
        return (aqmh) aihhVar.build();
    }

    public final String g(anjx anjxVar) {
        String artistDisplayName = anjxVar.getArtistDisplayName();
        if (TextUtils.isEmpty(artistDisplayName)) {
            artistDisplayName = this.d.getString(R.string.downloaded_album_default_artist);
        }
        boolean zF = anjxVar.f();
        Context context = this.d;
        return zF ? context.getString(R.string.your_downloads_album_item_subtitle_with_artist_and_year, h(anjxVar.getReleaseType()), artistDisplayName, Integer.toString(anjxVar.getReleaseDate().c)) : context.getString(R.string.your_downloads_album_item_subtitle_with_artist, h(anjxVar.getReleaseType()), artistDisplayName);
    }

    public final String h(ankf ankfVar) {
        int iOrdinal = ankfVar.ordinal();
        if (iOrdinal == 1) {
            return this.d.getResources().getString(R.string.single_label);
        }
        Context context = this.d;
        return iOrdinal != 2 ? context.getResources().getString(R.string.album_label) : context.getResources().getString(R.string.ep_label);
    }

    public final String i(anuk anukVar) {
        return j(anukVar, Optional.empty());
    }

    public final String j(anuk anukVar, Optional optional) {
        String ownerDisplayName = anukVar.getOwnerDisplayName();
        int i = 0;
        Optional optionalOfNullable = true != optional.isPresent() ? optional : Optional.ofNullable((Integer) ((imi) optional.get()).b.orElse(Integer.valueOf(((anuk) new hlx(anukVar, i).a).getTrackCount().intValue())));
        Integer num = (Integer) (true != optionalOfNullable.isPresent() ? Integer.valueOf(((anuk) new hly(anukVar, i).a).getTrackCount().intValue()) : optionalOfNullable.get());
        int iIntValue = num.intValue();
        if (optional.isPresent() && ((imi) optional.get()).d == 5) {
            if (TextUtils.equals(anukVar.getPlaylistId(), "SE")) {
                return this.d.getResources().getQuantityString(R.plurals.auto_playlist_with_episode_count_item_subtitle, iIntValue, num);
            }
            if (x(anukVar.getPlaylistId())) {
                return this.d.getResources().getQuantityString(R.plurals.auto_playlist_with_size_item_subtitle, iIntValue, num);
            }
            if (anukVar.getPlaylistId().startsWith("PL")) {
                return n(anukVar) ? w(iIntValue, ownerDisplayName) : this.d.getResources().getQuantityString(R.plurals.playlist_with_entity_type_and_creator_and_track_count_item_subtitle, iIntValue, ownerDisplayName, num);
            }
            return this.d.getResources().getQuantityString(R.plurals.playlist_with_entity_type_and_creator_and_size_item_subtitle, iIntValue, ownerDisplayName, num);
        }
        if (x(anukVar.getPlaylistId())) {
            boolean zIsEmpty = TextUtils.isEmpty(ownerDisplayName);
            Context context = this.d;
            return !zIsEmpty ? context.getString(R.string.auto_playlist_with_owner_item_subtitle, ownerDisplayName) : context.getString(R.string.auto_playlist_item_subtitle);
        }
        if (anukVar.getPlaylistId().startsWith("PL")) {
            return n(anukVar) ? w(iIntValue, ownerDisplayName) : this.d.getResources().getQuantityString(R.plurals.playlist_with_creator_and_track_count_item_subtitle, iIntValue, ownerDisplayName, num);
        }
        return this.d.getResources().getQuantityString(R.plurals.playlist_with_creator_and_size_item_subtitle, iIntValue, ownerDisplayName, num);
    }

    @Deprecated
    public final boolean k(aamh aamhVar) {
        aofc aofcVarC = c(aamhVar);
        return aofcVarC != null && aofcVarC.c;
    }

    public final boolean l(aofu aofuVar) {
        aofc aofcVarD = d(aofuVar);
        return aofcVarD != null && aofcVarD.c;
    }

    public final apji o(String str) {
        boolean z = true;
        if (!str.equals("PPSE") && !str.equals("PPSDST") && !str.equals("PPSV")) {
            z = false;
        }
        ahno.F(z);
        if (str.equals("PPSE")) {
            aqmh aqmhVarY = ixt.y(this.d, c);
            if (aqmhVarY == null) {
                aqmhVarY = f();
            }
            return e(aqmhVarY);
        }
        boolean zEquals = str.equals("PPSDST");
        Context context = this.d;
        if (zEquals) {
            aqmh aqmhVarY2 = ixt.y(context, a);
            if (aqmhVarY2 == null) {
                aqmhVarY2 = f();
            }
            return e(aqmhVarY2);
        }
        aqmh aqmhVarY3 = ixt.y(context, b);
        if (aqmhVarY3 == null) {
            aqmhVarY3 = f();
        }
        return e(aqmhVarY3);
    }

    public final Optional p(int i) {
        if (i != 2) {
            return Optional.empty();
        }
        aihf aihfVarCreateBuilder = anpv.b.createBuilder();
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.MUSIC_EXPLICIT_BADGE;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anpv anpvVar = (anpv) aihfVarCreateBuilder.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        anpvVar.d = aljaVar2;
        anpvVar.c |= 4;
        aihf aihfVarCreateBuilder2 = aiqe.a.createBuilder();
        aihf aihfVarCreateBuilder3 = aiqd.a.createBuilder();
        String string = this.d.getString(R.string.explicit_badge_content_desc);
        aihfVarCreateBuilder3.copyOnWrite();
        aiqd aiqdVar = (aiqd) aihfVarCreateBuilder3.instance;
        string.getClass();
        aiqdVar.b |= 2;
        aiqdVar.c = string;
        aihfVarCreateBuilder2.copyOnWrite();
        aiqe aiqeVar = (aiqe) aihfVarCreateBuilder2.instance;
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder3.build();
        aiqdVar2.getClass();
        aiqeVar.c = aiqdVar2;
        aiqeVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anpv anpvVar2 = (anpv) aihfVarCreateBuilder.instance;
        aiqe aiqeVar2 = (aiqe) aihfVarCreateBuilder2.build();
        aiqeVar2.getClass();
        anpvVar2.e = aiqeVar2;
        anpvVar2.c |= 8;
        return Optional.of((anpv) aihfVarCreateBuilder.build());
    }

    public final anfy q(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(u(str3));
        arrayList.add(t(str3));
        arrayList.add(v(str3));
        if (this.g.l(172, 45648925L, false)) {
            arrayList.add(a(s(str3)));
        } else {
            arrayList.add(s(str3));
        }
        aihf aihfVarCreateBuilder = anrp.a.createBuilder();
        alay alayVarD = ackj.d(str);
        aihfVarCreateBuilder.copyOnWrite();
        anrp anrpVar = (anrp) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anrpVar.c = alayVarD;
        anrpVar.b |= 1;
        alay alayVarD2 = ackj.d(str2);
        aihfVarCreateBuilder.copyOnWrite();
        anrp anrpVar2 = (anrp) aihfVarCreateBuilder.instance;
        alayVarD2.getClass();
        anrpVar2.d = alayVarD2;
        anrpVar2.b |= 2;
        apji apjiVarO = o(str3);
        aihfVarCreateBuilder.copyOnWrite();
        anrp anrpVar3 = (anrp) aihfVarCreateBuilder.instance;
        apjiVarO.getClass();
        anrpVar3.e = apjiVarO;
        anrpVar3.b |= 4;
        aihf aihfVarCreateBuilder2 = anfy.a.createBuilder();
        aihfVarCreateBuilder2.bJ(y(str3));
        aihfVarCreateBuilder2.bH(arrayList);
        aihf aihfVarCreateBuilder3 = ange.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ange angeVar = (ange) aihfVarCreateBuilder3.instance;
        anrp anrpVar4 = (anrp) aihfVarCreateBuilder.build();
        anrpVar4.getClass();
        angeVar.c = anrpVar4;
        angeVar.b = 72399185;
        aihfVarCreateBuilder2.copyOnWrite();
        anfy anfyVar = (anfy) aihfVarCreateBuilder2.instance;
        ange angeVar2 = (ange) aihfVarCreateBuilder3.build();
        angeVar2.getClass();
        anfyVar.f = angeVar2;
        anfyVar.b |= 4;
        return (anfy) aihfVarCreateBuilder2.build();
    }
}
