package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itv implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ itv(ListenableFuture listenableFuture, agke agkeVar, sxu sxuVar, int i) {
        this.$cid = i;
        this.b = listenableFuture;
        this.a = agkeVar;
        this.c = sxuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v69, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        annx annxVar;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                if (((Integer) ahng.v(this.b)).intValue() > 0) {
                    Object obj = this.c;
                    iuf iufVar = (iuf) this.a;
                    iufVar.M((Uri) obj, iufVar.a());
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                try {
                    annxVar = (annx) ahng.v(this.b);
                    break;
                } catch (ExecutionException unused) {
                    annxVar = null;
                }
                agke agkeVarN = agke.n(this.a);
                if (annxVar == null) {
                    annxVar = null;
                }
                if (agkeVarN == null) {
                    throw new IllegalStateException("Missing required properties: commandList");
                }
                this.c.b(null, new hck(agkeVarN, annxVar));
                return null;
            case 2:
                Cursor cursor = (Cursor) ahng.v(this.a);
                Map map = (Map) ahng.v(this.b);
                iuf iufVar2 = (iuf) this.c;
                ((hcb) iufVar2.j.io()).c();
                jkm jkmVar = new jkm(cursor, new ism(iufVar2.b, map, iufVar2.n.l(263, 45828915L, false)));
                try {
                    return agke.o(jkmVar);
                } finally {
                    jku.b(jkmVar);
                }
            case 3:
                if (((Uri) ahng.v(this.b)) == null) {
                    return Boolean.FALSE;
                }
                Object obj2 = this.c;
                iuf iufVar3 = (iuf) this.a;
                iufVar3.M((Uri) obj2, iufVar3.a());
                return Boolean.TRUE;
            case 4:
                int iIntValue = ((Integer) ahng.v(this.b)).intValue();
                iuf iufVar4 = (iuf) this.a;
                iufVar4.M((Uri) this.c, iufVar4.a());
                if (iIntValue > 1) {
                    ((agrc) ((agrc) iuf.a.b().i(agso.a, "SideloadedStore")).k("com/google/android/apps/youtube/music/sideloaded/store/AsyncSideloadedStore", "removePlaylistMemberFromPlaylistFromMediaStore", 1884, "AsyncSideloadedStore.java")).u("removePlaylistMemberFromPlaylist removed %d rows", iIntValue);
                }
                return Boolean.valueOf(iIntValue > 0);
            case 5:
                List<hch> list = (List) ahng.v(this.a);
                Map map2 = (Map) ahng.v(this.b);
                ArrayList arrayList = new ArrayList(list.size());
                for (hch hchVar : list) {
                    Object obj3 = this.c;
                    anui anuiVarD = hchVar.a.d();
                    iuf iufVar5 = (iuf) obj3;
                    anuiVarD.an(ixt.x((String) map2.get(hchVar.b), iufVar5.b, R.drawable.playlist_empty_state));
                    ((hcb) iufVar5.j.io()).c();
                    arrayList.add(anuiVarD.aq());
                }
                return arrayList;
            case 6:
                agke agkeVar = (agke) Collection.EL.stream((List) ahng.v(this.a)).filter(new hud(17)).collect(aghu.a);
                int size = agkeVar.size();
                ?? r1 = this.b;
                if (size == r1.size()) {
                    return agkeVar;
                }
                Object obj4 = this.c;
                Stream streamDistinct = Collection.EL.stream(agkeVar).map(new itm(5)).distinct();
                Collector collector = aghu.b;
                ((iuf) obj4).L(iuf.Q((agkz) Collection.EL.stream(r1).map(new itm(6)).distinct().collect(collector), (agkz) streamDistinct.collect(collector)));
                return agkeVar;
            case 7:
                List list2 = (List) ahng.v(this.a);
                List list3 = (List) ahng.v(this.b);
                if (list2.isEmpty() || list3.isEmpty()) {
                    return null;
                }
                Object obj5 = this.c;
                ankr ankrVar = (ankr) list2.get(0);
                agke agkeVarN2 = agke.n(list3);
                ankp ankpVarD = ankrVar.d();
                aqmh thumbnailDetails = ((anyx) agkeVarN2.get(0)).getThumbnailDetails();
                if (Uri.parse(((aqmg) thumbnailDetails.c.get(0)).c).getScheme().equals("android.resource")) {
                    thumbnailDetails = aawb.N(ixt.r(((iuf) obj5).b, R.drawable.cover_profile_empty_state));
                }
                ankpVarD.am(thumbnailDetails);
                ((hcb) ((iuf) obj5).j.io()).c();
                return hcg.d(ankpVarD.an(), agkeVarN2);
            case 8:
                if (((Integer) ahng.v(this.b)).intValue() > 0) {
                    Object obj6 = this.c;
                    iuf iufVar6 = (iuf) this.a;
                    iufVar6.M((Uri) obj6, iufVar6.a());
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                List list4 = (List) ahng.v(this.a);
                if (list4.isEmpty()) {
                    return null;
                }
                ?? r2 = this.b;
                anuk anukVar = (anuk) list4.get(0);
                List list5 = (List) ahng.v(r2);
                agke agkeVar2 = (agke) Collection.EL.stream(list5).map(new itm(4)).collect(aghu.a);
                anui anuiVarD2 = anukVar.d();
                anuiVarD2.ap(Long.valueOf(agkeVar2.size()));
                if (!agkeVar2.isEmpty()) {
                    anuiVarD2.an(((anyx) agkeVar2.get(0)).getThumbnailDetails());
                }
                ((hcb) ((iuf) this.c).j.io()).c();
                return hcg.e(anuiVarD2.aq(), hef.p(anukVar), list5);
            case 10:
                ankr ankrVar2 = (ankr) ((List) ahng.v(this.a)).get(0);
                agke agkeVarN3 = agke.n((java.util.Collection) ahng.v(this.b));
                ankp ankpVarD2 = ankrVar2.d();
                aqmh thumbnailDetails2 = ((anyx) agkeVarN3.get(0)).getThumbnailDetails();
                boolean zEquals = Uri.parse(((aqmg) thumbnailDetails2.c.get(0)).c).getScheme().equals("android.resource");
                Object obj7 = this.c;
                if (zEquals) {
                    thumbnailDetails2 = aawb.N(ixt.r(((iuo) obj7).b, R.drawable.cover_profile_empty_state));
                }
                ankpVarD2.am(thumbnailDetails2);
                ((wbz) ((iuo) obj7).f.io()).c();
                return hcg.d(ankpVarD2.an(), agkeVarN3);
            case 11:
                List<ankr> list6 = (List) this.a.get();
                Cursor cursor2 = (Cursor) this.b.get();
                HashMap map3 = new HashMap();
                while (cursor2.moveToNext()) {
                    try {
                        String strValueOf = String.valueOf(cursor2.getInt(cursor2.getColumnIndex("artist_id")));
                        String strValueOf2 = String.valueOf(cursor2.getInt(cursor2.getColumnIndex("_id")));
                        if (!map3.containsKey(strValueOf)) {
                            map3.put(strValueOf, strValueOf2);
                        }
                    } catch (Throwable th) {
                        jku.b(cursor2);
                        throw th;
                    }
                }
                jku.b(cursor2);
                ArrayList arrayList2 = new ArrayList();
                for (ankr ankrVar3 : list6) {
                    Object obj8 = this.c;
                    String lastPathSegment = Uri.parse(ankrVar3.getAndroidMediaStoreContentUri()).getLastPathSegment();
                    ankp ankpVarD3 = ankrVar3.d();
                    iuo iuoVar = (iuo) obj8;
                    ankpVarD3.am(ixt.w(iuoVar.b, ixt.l((String) map3.get(lastPathSegment)), R.drawable.cover_profile_empty_state, iuoVar.i.l(263, 45828915L, false)));
                    ((wbz) iuoVar.f.io()).c();
                    arrayList2.add(ankpVarD3.an());
                }
                return arrayList2;
            case 12:
                anuk anukVar2 = (anuk) ((List) ahng.v(this.a)).get(0);
                List list7 = (List) ahng.v(this.b);
                agke agkeVar3 = (agke) Collection.EL.stream(list7).map(new itm(13)).collect(aghu.a);
                anui anuiVarD3 = anukVar2.d();
                anuiVarD3.ap(Long.valueOf(agkeVar3.size()));
                if (!agkeVar3.isEmpty()) {
                    anuiVarD3.an(((anyx) agkeVar3.get(0)).getThumbnailDetails());
                }
                ((wbz) ((iuo) this.c).f.io()).c();
                return hcg.e(anuiVarD3.aq(), hef.p(anukVar2), list7);
            case 13:
                return ((iuo) this.a).e.query(ixt.o((Uri) this.c), null, "audio_id=?", new String[]{(String) this.b}, null);
            case 14:
                if (((Integer) ahng.v(this.b)).intValue() > 0) {
                    ((iuo) this.a).O((Uri) this.c, iuo.b());
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                Cursor cursor3 = (Cursor) ahng.v(this.a);
                if (cursor3 == null) {
                    return agpi.a;
                }
                ?? r3 = this.b;
                iuo iuoVar2 = (iuo) this.c;
                ((wbz) iuoVar2.f.io()).c();
                jkm jkmVar2 = new jkm(cursor3, new isn(iuoVar2.b, (Map) r3, iuoVar2.i.l(263, 45828915L, false)));
                try {
                    return agke.o(jkmVar2);
                } finally {
                    jku.b(jkmVar2);
                }
            case 16:
                if (((Uri) ahng.v(this.b)) == null) {
                    return Boolean.FALSE;
                }
                ((iuo) this.a).O((Uri) this.c, iuo.b());
                return Boolean.TRUE;
            case 17:
                Uri uri = (Uri) ahng.v(this.a);
                if (uri == null) {
                    return null;
                }
                Object obj9 = this.c;
                if (iuo.S()) {
                    Object obj10 = this.b;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("name", (String) obj10);
                    ((iuo) obj9).e.update(uri, contentValues, null, null);
                }
                return uri;
            case 18:
                agke agkeVar4 = (agke) Collection.EL.stream((List) ahng.v(this.a)).filter(new iui(2)).collect(aghu.a);
                int size2 = agkeVar4.size();
                ?? r4 = this.b;
                if (size2 == r4.size()) {
                    return agkeVar4;
                }
                Object obj11 = this.c;
                Stream streamDistinct2 = Collection.EL.stream(agkeVar4).map(new itm(14)).distinct();
                Collector collector2 = aghu.b;
                ((iuo) obj11).M(iuo.R((agkz) Collection.EL.stream(r4).map(new itm(12)).distinct().collect(collector2), (agkz) streamDistinct2.collect(collector2)));
                return agkeVar4;
            case 19:
                return Integer.valueOf(((iuo) this.b).e.delete(ixt.o((Uri) this.c), "_id=?", new String[]{((Uri) this.a).getLastPathSegment()}));
            default:
                List<hch> list8 = (List) ahng.v(this.a);
                Map map4 = (Map) ahng.v(this.b);
                ArrayList arrayList3 = new ArrayList(list8.size());
                for (hch hchVar2 : list8) {
                    Object obj12 = this.c;
                    anui anuiVarD4 = hchVar2.a.d();
                    iuo iuoVar3 = (iuo) obj12;
                    anuiVarD4.an(ixt.x((String) map4.get(hchVar2.b), iuoVar3.b, R.drawable.playlist_empty_state));
                    ((wbz) iuoVar3.f.io()).c();
                    arrayList3.add(anuiVarD4.aq());
                }
                return arrayList3;
        }
    }

    public /* synthetic */ itv(iuo iuoVar, Uri uri, Uri uri2, int i) {
        this.$cid = i;
        this.b = iuoVar;
        this.c = uri;
        this.a = uri2;
    }

    public /* synthetic */ itv(iuo iuoVar, Uri uri, String str, int i) {
        this.$cid = i;
        this.a = iuoVar;
        this.c = uri;
        this.b = str;
    }

    public /* synthetic */ itv(Object obj, ListenableFuture listenableFuture, Uri uri, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = listenableFuture;
        this.c = uri;
    }

    public /* synthetic */ itv(Object obj, ListenableFuture listenableFuture, Object obj2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = listenableFuture;
        this.b = obj2;
    }
}
