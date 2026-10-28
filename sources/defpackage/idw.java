package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.Spanned;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class idw implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ idw(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01d9  */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Spanned spannedK;
        long count;
        String string = "";
        long count2 = 0;
        switch (this.$cid) {
            case 0:
                aihf builder = ((aime) obj).toBuilder();
                kjc kjcVar = ((idx) this.a).e;
                Object obj2 = this.b;
                String strO = kjcVar.o();
                aimd aimdVar = (aimd) ((aihf) obj2).build();
                aimdVar.getClass();
                builder.copyOnWrite();
                aime aimeVar = (aime) builder.instance;
                aiip aiipVar = aimeVar.b;
                if (!aiipVar.b) {
                    aimeVar.b = aiipVar.a();
                }
                aimeVar.b.put(strO, aimdVar);
                return (aime) builder.build();
            case 1:
                aihf builder2 = ((aimg) obj).toBuilder();
                builder2.ax(((idx) this.a).e.o(), (aily) this.b);
                return (aimg) builder2.build();
            case 2:
                hcg hcgVar = (hcg) obj;
                Object obj3 = this.a;
                if (hcgVar != null) {
                    agke agkeVar = hcgVar.c;
                    if (!agkeVar.isEmpty()) {
                        int iA = ige.a(agkeVar, (apzf) this.b);
                        if (iA == -1) {
                            ige igeVar = (ige) obj3;
                            return igeVar.b.b(igeVar.a, R.string.sideloaded_error_unplayable);
                        }
                        ige igeVar2 = (ige) obj3;
                        igf igfVar = igeVar2.b;
                        wjf wjfVarA = igfVar.a((anyx) agkeVar.get(iA));
                        wja wjaVar = ((wji) wjfVarA).c;
                        return (wjaVar == null || wjaVar.h <= 0) ? igfVar.b(igeVar2.a, R.string.track_unplayable_reason_unknown) : wjfVarA;
                    }
                }
                ige igeVar3 = (ige) obj3;
                return igeVar3.b.b(igeVar3.a, R.string.sideloaded_error_unplayable);
            case 3:
                List<anyx> list = (List) obj;
                if (list == null) {
                    return null;
                }
                for (anyx anyxVar : list) {
                    if (anyxVar.h()) {
                        if (anyxVar.getAndroidMediaStoreContentUri().equals(((apzf) this.b).d)) {
                            String string2 = ((Context) ((jij) this.a).b).getString(R.string.offline_songs_title);
                            hcf hcfVarA = hcg.a();
                            hcfVarA.d(anyxVar);
                            hcfVarA.f(agke.q(anyxVar));
                            hcfVarA.e(agpi.a);
                            hcfVarA.b = string2;
                            hcfVarA.b("");
                            hcfVarA.c = anyxVar.getThumbnailDetails();
                            return hcfVarA.a();
                        }
                    }
                }
                return null;
            case 4:
                List list2 = (List) obj;
                if (list2 != null) {
                    return hcg.g(agke.n(list2), ((Context) ((jij) this.b).b).getString(R.string.offline_songs_title), ((Uri) this.a).toString());
                }
                return null;
            case 5:
                List list3 = (List) obj;
                if (list3 != null) {
                    return hcg.g(agke.n(list3), ((Context) ((jij) this.b).b).getString(R.string.offline_songs_title), ((Uri) this.a).toString());
                }
                return null;
            case 6:
                aihf builder3 = ((aimi) obj).toBuilder();
                String strT = ((hef) this.a).t();
                Object obj4 = this.b;
                obj4.getClass();
                builder3.copyOnWrite();
                aimi aimiVar = (aimi) builder3.instance;
                aiip aiipVar2 = aimiVar.b;
                if (!aiipVar2.b) {
                    aimiVar.b = aiipVar2.a();
                }
                aimiVar.b.put(strT, obj4);
                return (aimi) builder3.build();
            case 7:
                if (((ilo) obj) == ilo.b) {
                    return null;
                }
                aldm aldmVar = (aldm) this.b;
                if ((aldmVar.b & 2) == 0) {
                    ((agrc) ((agrc) ilp.a.c()).k("com/google/android/apps/youtube/music/radiostar/RadioStarCommentaryControllerImpl", "initiateCommentaryRequest", 241, "RadioStarCommentaryControllerImpl.java")).t("No on_response_received_command in commentary response.");
                    return null;
                }
                Object obj5 = this.a;
                ajwo ajwoVar = aldmVar.d;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                ((ilp) obj5).d.c(ajwoVar);
                return null;
            case 8:
                agrf agrfVar = ilp.a;
                ((agrc) ((agrc) ((agrc) agrfVar.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/radiostar/RadioStarCommentaryControllerImpl", "initiateCommentaryRequest", (char) 250, "RadioStarCommentaryControllerImpl.java")).t("Failed to check snooze status.");
                aldm aldmVar2 = (aldm) this.b;
                if ((aldmVar2.b & 2) == 0) {
                    ((agrc) ((agrc) agrfVar.c()).k("com/google/android/apps/youtube/music/radiostar/RadioStarCommentaryControllerImpl", "initiateCommentaryRequest", 257, "RadioStarCommentaryControllerImpl.java")).t("No on_response_received_command in commentary response.");
                    return null;
                }
                Object obj6 = this.a;
                ajwo ajwoVar2 = aldmVar2.d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                ((ilp) obj6).d.c(ajwoVar2);
                return null;
            case 9:
                ilp ilpVar = (ilp) this.a;
                if (ilpVar.l != this.b) {
                    return null;
                }
                ilpVar.l = null;
                return null;
            case 10:
                ias iasVar = (ias) this.a;
                iasVar.f(true);
                iasVar.m(((Long) obj).longValue());
                ajwo ajwoVarB = iasVar.b();
                Object obj7 = this.b;
                aihf aihfVar = (aihf) obj7;
                aihfVar.copyOnWrite();
                aoun aounVar = (aoun) ((aihh) obj7).instance;
                aoun aounVar2 = aoun.a;
                ajwoVarB.getClass();
                aounVar.l = ajwoVarB;
                aounVar.b |= SemanticState.Hidden;
                return (aoun) aihfVar.build();
            case 11:
                Boolean bool = (Boolean) obj;
                apqs apqsVar = (apqs) this.b;
                if (apqsVar.g && (apqsVar.b & 32768) != 0) {
                    alay alayVar = apqsVar.k;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    spannedK = ackj.k(null, alayVar, null, false);
                } else if (bool.booleanValue() || (apqsVar.b & 16384) == 0) {
                    alay alayVar2 = apqsVar.e;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                    spannedK = ackj.k(null, alayVar2, null, false);
                } else {
                    alay alayVar3 = apqsVar.j;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                    spannedK = ackj.k(null, alayVar3, null, false);
                }
                Object obj8 = this.a;
                Preference preference = (Preference) obj8;
                preference.n(spannedK);
                ((TwoStatePreference) obj8).k(bool.booleanValue());
                preference.y = bool;
                return obj8;
            case 12:
                Integer num = (Integer) obj;
                if (num.intValue() > 1) {
                    ((agrc) ((agrc) iuf.a.b().i(agso.a, "SideloadedStore")).k("com/google/android/apps/youtube/music/sideloaded/store/AsyncSideloadedStore", "deleteTrack", 192, "AsyncSideloadedStore.java")).w("deleteTrack affected %d rows", num);
                }
                boolean z = num.intValue() > 0;
                if (z) {
                    ((iuf) this.b).L(agke.q(Long.valueOf(iuf.b((Uri) this.a))));
                }
                return Boolean.valueOf(z);
            case 13:
                Cursor cursor = (Cursor) obj;
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            string = cursor.getString(cursor.getColumnIndexOrThrow("audio_id"));
                            count2 = cursor.getCount();
                        }
                    } catch (Throwable th) {
                        jku.b(cursor);
                        throw th;
                    }
                }
                Object obj9 = this.b;
                Object obj10 = this.a;
                jku.b(cursor);
                anui anuiVarD = ((anuk) obj9).d();
                anuiVarD.ap(Long.valueOf(count2));
                iuf iufVar = (iuf) obj10;
                anuiVarD.an(ixt.w(iufVar.b, ixt.l(string), R.drawable.playlist_empty_state, iufVar.n.l(263, 45828915L, false)));
                ((hcb) iufVar.j.io()).c();
                return anuiVarD.aq();
            case 14:
                Cursor cursor2 = (Cursor) obj;
                if (cursor2 != null) {
                    try {
                        if (cursor2.moveToFirst()) {
                            string = cursor2.getString(cursor2.getColumnIndexOrThrow("album_id"));
                            count = cursor2.getCount();
                        } else {
                            count = 0;
                        }
                    } catch (Throwable th2) {
                        jku.b(cursor2);
                        throw th2;
                    }
                } else {
                    count = 0;
                }
                Object obj11 = this.b;
                Object obj12 = this.a;
                jku.b(cursor2);
                anui anuiVarD2 = ((anuk) obj11).d();
                anuiVarD2.ap(Long.valueOf(count));
                ((hcb) ((iuf) obj12).j.io()).c();
                return new hch(anuiVarD2.aq(), string);
            case 15:
                return ((iuf) this.a).H((iux) this.b, (anyx) obj);
            case 16:
                List list4 = (List) obj;
                list4.getClass();
                agke agkeVarN = agke.n(list4);
                Stream map = Collection.EL.stream(agkeVarN).map(new itm(8));
                Collector collector = aghu.a;
                agke agkeVar2 = (agke) map.collect(collector);
                iux iuxVar = (iux) this.b;
                aihh aihhVarV = hmy.V(iuxVar);
                aqmh thumbnailDetails = !agkeVarN.isEmpty() ? ((anyx) agkeVarN.get(0)).getThumbnailDetails() : aawb.N(ixt.r(((iuf) this.a).b, R.drawable.playlist_empty_state));
                aihhVarV.copyOnWrite();
                anuu anuuVar = (anuu) aihhVarV.instance;
                anuu anuuVar2 = anuu.a;
                thumbnailDetails.getClass();
                anuuVar.h = thumbnailDetails;
                anuuVar.b |= 32;
                long size = agkeVarN.size();
                aihhVarV.copyOnWrite();
                anuu anuuVar3 = (anuu) aihhVarV.instance;
                anuuVar3.b |= SemanticState.Focused;
                anuuVar3.k = size;
                anuk anukVarAq = anuk.e((anuu) aihhVarV.build()).aq();
                return hcg.f(anukVarAq, hef.p(anukVarAq), (agke) Collection.EL.stream(iuxVar.c).filter(new ibz(agkeVar2, 6)).map(new itm(9)).collect(collector), agkeVarN);
            case 17:
                Integer num2 = (Integer) obj;
                if (num2.intValue() > 1) {
                    ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "deleteTrack", 196, "DefaultSideloadedStore.java")).w("deleteTrack affected %d rows", num2);
                }
                boolean z2 = num2.intValue() > 0;
                if (z2) {
                    ((iuo) this.b).M(agke.q(Long.valueOf(iuo.j((Uri) this.a))));
                }
                return Boolean.valueOf(z2);
            case 18:
                agke agkeVar3 = (agke) obj;
                Object obj13 = this.a;
                iuo iuoVar = (iuo) this.b;
                Uri uri = (Uri) obj13;
                int iA2 = iuoVar.a(uri);
                ContentValues[] contentValuesArr = new ContentValues[agkeVar3.size()];
                for (int i = 0; i < agkeVar3.size(); i++) {
                    ContentValues contentValues = new ContentValues();
                    contentValuesArr[i] = contentValues;
                    contentValues.put("audio_id", (Long) agkeVar3.get(i));
                    iA2++;
                    contentValuesArr[i].put("play_order", Integer.valueOf(iA2));
                }
                return Integer.valueOf(iuoVar.e.bulkInsert(ixt.o(uri), contentValuesArr));
            case 19:
                return ((iuo) this.a).I((iux) this.b, (anyx) obj);
            default:
                Integer num3 = (Integer) obj;
                ((iuo) this.b).O((Uri) this.a, iuo.b());
                if (num3.intValue() > 1) {
                    ((agrc) ((agrc) iuo.a.b().i(agso.a, "SideloadedStore")).k("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore", "removePlaylistMemberFromPlaylistFromMediaStore", 1747, "DefaultSideloadedStore.java")).w("removePlaylistMemberFromPlaylist removed %d rows", num3);
                }
                return Boolean.valueOf(num3.intValue() > 0);
        }
    }

    public /* synthetic */ idw(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
