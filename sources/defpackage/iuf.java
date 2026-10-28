package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iuf implements iup {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/sideloaded/store/AsyncSideloadedStore");
    public final Context b;
    public final Executor c;
    public final Executor d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final aunn j;
    public final mbc k;
    public int l = 1;
    public int m = 1;
    public final vxz n;
    public final jij o;

    public iuf(Context context, Executor executor, Executor executor2, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, jij jijVar, aunn aunnVar6, mbc mbcVar, vxz vxzVar) {
        this.b = context;
        this.c = executor;
        this.d = new ahfg(executor2);
        this.o = jijVar;
        this.g = aunnVar;
        this.e = aunnVar2;
        this.f = aunnVar3;
        this.i = aunnVar4;
        this.h = aunnVar5;
        this.j = aunnVar6;
        this.k = mbcVar;
        this.n = vxzVar;
    }

    public static boolean O(Uri uri) {
        return ish.q.match(uri) == 6;
    }

    public static final agke Q(agkz agkzVar, agkz agkzVar2) {
        return (agke) Collection.EL.stream(agkzVar).filter(new ibz(agkzVar2, 5)).collect(aghu.a);
    }

    public static final boolean R() {
        return Build.VERSION.SDK_INT <= 29;
    }

    private final ListenableFuture S(Uri uri, Map map) {
        ListenableFuture listenableFutureT = T(this.o.G(uri, ish.f, "is_music=1 AND title IS NOT NULL", null, null), map);
        ahud ahudVarAv = ahno.av(listenableFutureT);
        huo huoVar = new huo(listenableFutureT, 15);
        Executor executor = this.c;
        return afxd.f(ahudVarAv.k(huoVar, executor)).b(afky.class, new ist(20), executor);
    }

    private final ListenableFuture T(ahdm ahdmVar, Map map) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            return ahdmVar.c(afwl.f(new itx(this, i)), this.c).g();
        }
        return map == null ? afxd.f(j()).h(new iub(this, ahdmVar, i), this.c) : z(ahdmVar, map);
    }

    private final ListenableFuture U(ListenableFuture listenableFuture) {
        int i = Build.VERSION.SDK_INT;
        jij jijVar = this.o;
        if (i >= 29) {
            ahdm ahdmVarG = jijVar.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"artist_id", "_id"}, "is_music=1 AND title IS NOT NULL", null, String.format("LOWER(%s)", "title"));
            itw itwVar = new itw(4);
            Executor executor = this.c;
            final ahdm ahdmVarA = ahdmVarG.a(afky.class, itwVar, executor);
            final ahdm ahdmVar = new ahdm(listenableFuture);
            return ahdm.h(ahdmVar, ahdmVarA).p(new ahdh() { // from class: ity
                @Override // defpackage.ahdh
                public final Object a(ahdj ahdjVar) {
                    List<ankr> list = (List) ahdjVar.a(ahdmVar);
                    Cursor cursor = (Cursor) ahdjVar.a(ahdmVarA);
                    HashMap map = new HashMap();
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            String strValueOf = String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("artist_id")));
                            String strValueOf2 = String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("_id")));
                            if (!map.containsKey(strValueOf)) {
                                map.put(strValueOf, strValueOf2);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ankr ankrVar : list) {
                        iuf iufVar = this.a;
                        String lastPathSegment = Uri.parse(ankrVar.getAndroidMediaStoreContentUri()).getLastPathSegment();
                        ankp ankpVarD = ankrVar.d();
                        ankpVarD.am(ixt.w(iufVar.b, ixt.l((String) map.get(lastPathSegment)), R.drawable.cover_profile_empty_state, iufVar.n.l(263, 45828915L, false)));
                        ((hcb) iufVar.j.io()).c();
                        arrayList.add(ankpVarD.an());
                    }
                    return arrayList;
                }
            }, executor).g();
        }
        ahdm ahdmVarG2 = jijVar.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"artist_id", "album_id"}, "is_music=1 AND title IS NOT NULL", null, String.format("LOWER(%s)", "title"));
        itw itwVar2 = new itw(9);
        Executor executor2 = this.c;
        final ahdm ahdmVarA2 = ahdmVarG2.a(afky.class, itwVar2, executor2);
        final ahdm ahdmVar2 = new ahdm(listenableFuture);
        final ahdm ahdmVar3 = new ahdm(j());
        return ahdm.h(ahdmVar2, ahdmVarA2, ahdmVar3).p(new ahdh() { // from class: iuc
            @Override // defpackage.ahdh
            public final Object a(ahdj ahdjVar) {
                List<ankr> list = (List) ahdjVar.a(ahdmVar2);
                Cursor cursor = (Cursor) ahdjVar.a(ahdmVarA2);
                Map map = (Map) ahdjVar.a(ahdmVar3);
                HashMap map2 = new HashMap();
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String strValueOf = String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("artist_id")));
                        if (!map2.containsKey(strValueOf)) {
                            map2.put(strValueOf, (String) map.get(String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("album_id")))));
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (ankr ankrVar : list) {
                    iuf iufVar = this.a;
                    String lastPathSegment = Uri.parse(ankrVar.getAndroidMediaStoreContentUri()).getLastPathSegment();
                    ankp ankpVarD = ankrVar.d();
                    ankpVarD.am(ixt.x((String) map2.get(lastPathSegment), iufVar.b, R.drawable.cover_profile_empty_state));
                    ((hcb) iufVar.j.io()).c();
                    arrayList.add(ankpVarD.an());
                }
                return arrayList;
            }
        }, executor2).g();
    }

    public static long b(Uri uri) {
        return Long.parseLong(uri.getLastPathSegment());
    }

    @Override // defpackage.iup
    public final ListenableFuture A() {
        ahdm ahdmVarG = this.o.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ish.m, "is_music=1 AND title IS NOT NULL", null, null);
        ahdf ahdfVarF = afwl.f(new itx(this, 3));
        Executor executor = this.c;
        afxd afxdVarB = afxd.f(ahdmVarG.c(ahdfVarF, executor).g()).b(afky.class, new itg(this, 12), executor);
        ListenableFuture listenableFutureAs = ahno.as(G(), new isv(this, 9), executor);
        return ahno.av(afxdVarB, listenableFutureAs).k(new itc(afxdVarB, listenableFutureAs, 6), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture B(int i) {
        ahdm ahdmVarG = this.o.G(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, null, null, "date_modified DESC");
        itw itwVar = new itw(0);
        Executor executor = this.c;
        ahdm ahdmVarA = ahdmVarG.a(afky.class, itwVar, executor);
        ahdf ahdfVarF = afwl.f(new itw(2));
        Executor executor2 = this.d;
        return afxd.f(ahno.as(ahdmVarA.c(ahdfVarF, executor2).g(), new hsx(this, i + 1, 3), executor2)).b(afky.class, new ist(19), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture C(Uri uri, Uri uri2, Uri uri3) {
        ListenableFuture listenableFutureG = ((klc) this.h.io()).g();
        iaj iajVar = new iaj((Object) this, uri, uri2, uri3, 3);
        Executor executor = this.c;
        return afxd.f(ahno.as(listenableFutureG, iajVar, executor)).b(afky.class, new ist(6), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture D(Uri uri, Uri uri2) {
        ListenableFuture listenableFutureG = ((klc) this.h.io()).g();
        hlk hlkVar = new hlk((Object) this, uri, uri2, 14);
        Executor executor = this.c;
        return afxd.f(ahno.as(listenableFutureG, hlkVar, executor)).b(afky.class, new iua(8), executor);
    }

    public final ListenableFuture E(Uri uri, String[] strArr, String str, String[] strArr2, String str2, final Supplier supplier) {
        return this.o.G(uri, strArr, str, strArr2, str2).c(afwl.f(new ahdf() { // from class: itz
            @Override // defpackage.ahdf
            public final Object a(ahud ahudVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                if (cursor == null) {
                    return agpi.a;
                }
                jkm jkmVar = new jkm(cursor, (jkt) supplier.get());
                try {
                    return agke.o(jkmVar);
                } finally {
                    jku.b(jkmVar);
                }
            }
        }), this.c).g();
    }

    @Override // defpackage.iup
    public final ListenableFuture F(Uri uri, String str) {
        ahno.F(!TextUtils.isEmpty(str));
        ListenableFuture listenableFutureG = ((klc) this.h.io()).g();
        hlk hlkVar = new hlk((Object) this, uri, str, 11);
        Executor executor = this.c;
        return afxd.f(ahno.as(listenableFutureG, hlkVar, executor)).b(afky.class, new ist(15), executor);
    }

    public final ListenableFuture G() {
        return ahno.aq(new iud(this, 0), this.c);
    }

    public final anuk H(iux iuxVar, anyx anyxVar) {
        aihh aihhVarV = hmy.V(iuxVar);
        aqmh thumbnailDetails = anyxVar != null ? anyxVar.getThumbnailDetails() : aawb.N(ixt.r(this.b, R.drawable.playlist_empty_state));
        aihhVarV.copyOnWrite();
        anuu anuuVar = (anuu) aihhVarV.instance;
        anuu anuuVar2 = anuu.a;
        thumbnailDetails.getClass();
        anuuVar.h = thumbnailDetails;
        anuuVar.b |= 32;
        return anuk.e((anuu) aihhVarV.build()).aq();
    }

    public final void L(agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return;
        }
        taf.j(ahno.as(((klc) this.h.io()).f(), new gqb(this, agkeVar, 19), this.c), new ihw(18));
    }

    public final void M(Uri uri, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("date_modified", Long.valueOf(j));
        ahno.ar(this.o.J(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues, "_id=?", new String[]{uri.getLastPathSegment()}), new iua(5), this.c);
    }

    @Override // defpackage.iup
    public final boolean N() {
        boolean z = true;
        if (this.l != 2 && this.m != 2) {
            z = false;
        }
        A();
        return z;
    }

    public final ListenableFuture P(iux iuxVar, Map map) {
        iuxVar.getClass();
        agke agkeVar = iuxVar.c;
        return !agkeVar.isEmpty() ? ahno.ar(S(ixt.p(String.valueOf(((iuz) agkeVar.get(0)).c)), map), new idw(this, iuxVar, 15), this.c) : ahng.n(H(iuxVar, null));
    }

    public final long a() {
        return this.k.f().getEpochSecond();
    }

    @Override // defpackage.iup
    public final ListenableFuture c(Uri uri, Uri uri2) {
        ListenableFuture listenableFutureG = ((klc) this.h.io()).g();
        hlk hlkVar = new hlk((Object) this, uri, uri2, 13);
        Executor executor = this.c;
        return afxd.f(ahno.as(listenableFutureG, hlkVar, executor)).b(afky.class, new ist(17), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture d(Uri uri, Uri uri2) {
        ListenableFuture listenableFutureG = ((klc) this.h.io()).g();
        hlk hlkVar = new hlk((Object) this, uri, uri2, 10);
        Executor executor = this.c;
        return afxd.f(ahno.as(listenableFutureG, hlkVar, executor)).b(afky.class, new ist(9), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture e(Uri uri, Uri uri2) {
        return ahno.as(((klc) this.h.io()).g(), new hlk((Object) this, uri, uri2, 15), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture f(String str) {
        ahno.F(!TextUtils.isEmpty(str));
        return ahno.as(((klc) this.h.io()).g(), new gqb(this, str, 20), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture g(Uri uri) {
        ListenableFuture listenableFutureG = ((klc) this.h.io()).g();
        iub iubVar = new iub(this, uri, 2, null);
        Executor executor = this.c;
        return afxd.f(ahno.as(listenableFutureG, iubVar, executor)).b(afky.class, new iua(4), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture h(Uri uri) {
        return afxd.f(this.o.K(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{uri.getLastPathSegment()})).g(new idw(this, uri, 12, null), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture i(Uri uri) {
        ListenableFuture listenableFutureE = E(uri, ish.i, null, null, null, new gpa(this, 14));
        return ahno.av(listenableFutureE).k(new huo(listenableFutureE, 17), this.c);
    }

    public final ListenableFuture j() {
        return this.o.G(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, ish.j, null, null, null).c(afwl.f(new itw(10)), this.c).g();
    }

    public final ListenableFuture k(Uri uri) {
        String[] strArr = {uri.getLastPathSegment()};
        return this.o.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "is_music=1 AND title IS NOT NULL AND album_id = ?", strArr, "track").c(afwl.f(new itw(7)), this.c).g();
    }

    @Override // defpackage.iup
    public final ListenableFuture l(Uri uri) {
        ListenableFuture listenableFutureE = E(uri, ish.i, null, null, null, new gpa(this, 11));
        ahdm ahdmVarG = this.o.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ish.f, "is_music=1 AND title IS NOT NULL AND album_id = ?", new String[]{uri.getLastPathSegment()}, "track");
        itw itwVar = new itw(6);
        Executor executor = this.c;
        ListenableFuture listenableFutureT = T(ahdmVarG.a(afky.class, itwVar, executor), null);
        return afxd.f(ahno.av(listenableFutureE, listenableFutureT).k(new itc(listenableFutureE, listenableFutureT, 5), executor)).b(afky.class, new ist(16), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture m(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((Uri) it.next()));
        }
        ListenableFuture listenableFutureT = ahng.t(arrayList);
        ahud ahudVarAv = ahno.av(listenableFutureT);
        huo huoVar = new huo(listenableFutureT, 16);
        Executor executor = this.c;
        return afxd.f(ahudVarAv.k(huoVar, executor)).b(afky.class, new iua(3), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture n() {
        return E(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, ish.i, null, null, String.format("LOWER(%s)", "album"), new gpa(this, 9));
    }

    @Override // defpackage.iup
    public final ListenableFuture o() {
        return U(E(MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI, ish.l, null, null, String.format("LOWER(%s)", "artist"), new gpa(this, 16)));
    }

    @Override // defpackage.iup
    public final ListenableFuture p(boolean z) {
        return ahno.as(G(), new hoy(this, z, 6), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture q() {
        return afxd.f(T(this.o.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ish.f, "is_music=1 AND title IS NOT NULL", null, String.format("LOWER(%s)", "title")), null)).b(afky.class, new ist(14), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture r(Uri uri) {
        ListenableFuture listenableFutureE = E(uri, ish.l, null, null, null, new gpa(this, 13));
        ahdm ahdmVarG = this.o.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ish.f, "is_music=1 AND title IS NOT NULL AND artist_id = ?", new String[]{uri.getLastPathSegment()}, String.format("LOWER(%s)", "title"));
        itw itwVar = new itw(8);
        Executor executor = this.c;
        ListenableFuture listenableFutureT = T(ahdmVarG.a(afky.class, itwVar, executor), null);
        return afxd.f(ahno.av(listenableFutureE, listenableFutureT).k(new itv(this, listenableFutureE, listenableFutureT, 7), executor)).b(afky.class, new iua(6), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i = 11;
            if (!it.hasNext()) {
                iuf iufVar = this;
                ListenableFuture listenableFutureT = ahng.t(arrayList);
                ahud ahudVarAv = ahno.av(listenableFutureT);
                huo huoVar = new huo(listenableFutureT, 18);
                Executor executor = iufVar.c;
                return afxd.f(iufVar.U(ahudVarAv.k(huoVar, executor))).b(afky.class, new iua(i), executor);
            }
            iuf iufVar2 = this;
            ListenableFuture listenableFutureE = iufVar2.E((Uri) it.next(), ish.l, null, null, null, new gpa(this, 10));
            arrayList.add(ahno.av(listenableFutureE).k(new huo(listenableFutureE, i), iufVar2.c));
            this = iufVar2;
        }
    }

    public final ListenableFuture t(Uri uri) {
        ahdm ahdmVarG;
        if (Build.VERSION.SDK_INT >= 30) {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-limit", 1);
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"play_order"});
            bundle.putInt("android:query-arg-sort-direction", 1);
            jij jijVar = this.o;
            Uri uriO = ixt.o(uri);
            uriO.getClass();
            afmp afmpVar = new afmp(jijVar, uriO, new String[]{"play_order"}, bundle);
            int i = qsr.a;
            ahdmVarG = jijVar.F(new qsp(afmpVar));
        } else {
            ahdmVarG = this.o.G(ixt.o(uri), new String[]{"play_order"}, null, null, "play_order DESC LIMIT 1");
        }
        return ahdmVarG.c(afwl.f(new itw(3)), this.c).g();
    }

    @Override // defpackage.iup
    public final ListenableFuture u() {
        ListenableFuture listenableFutureE = E(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, ish.k, "owner_package_name = ?", new String[]{this.b.getPackageName()}, "date_modified DESC", new gpa(this, 17));
        isv isvVar = new isv(this, 6);
        Executor executor = this.c;
        return afxd.f(ahno.as(listenableFutureE, isvVar, executor)).b(afky.class, new ist(7), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture v(Uri uri, List list) {
        if (O(uri)) {
            ListenableFuture listenableFutureX = ((hfn) this.g.io()).X(b(uri));
            itg itgVar = new itg(list, 9);
            Executor executor = this.c;
            return afxd.f(ahno.ar(listenableFutureX, itgVar, executor)).b(afky.class, new ist(10), executor);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.o.G(ixt.o(uri), new String[]{"audio_id"}, "audio_id=?", new String[]{((Uri) it.next()).getLastPathSegment()}, null).c(afwl.f(new itw(5)), this.c).g());
        }
        ahud ahudVarAu = ahno.au(arrayList);
        huo huoVar = new huo(arrayList, 14);
        Executor executor2 = this.c;
        return afxd.f(ahudVarAu.k(huoVar, executor2)).b(afky.class, new ist(11), executor2);
    }

    @Override // defpackage.iup
    public final ListenableFuture w(Uri uri) {
        ListenableFuture listenableFutureK;
        int i = 9;
        if (O(uri)) {
            ListenableFuture listenableFutureW = ((hfn) this.g.io()).W(b(uri));
            isv isvVar = new isv(this, 13);
            Executor executor = this.c;
            return afxd.f(ahno.as(listenableFutureW, isvVar, executor)).b(afky.class, new iua(i), executor);
        }
        ListenableFuture listenableFutureE = E(uri, ish.k, null, null, null, new gpa(this, 15));
        ListenableFuture listenableFutureY = y(uri);
        int i2 = 2;
        if (Build.VERSION.SDK_INT >= 29) {
            listenableFutureK = ahno.av(listenableFutureY).k(new itc(this, listenableFutureY, 4), this.c);
        } else {
            ListenableFuture listenableFutureJ = j();
            listenableFutureK = ahno.av(listenableFutureY, listenableFutureJ).k(new itv(this, listenableFutureY, listenableFutureJ, i2), this.c);
        }
        ahud ahudVarAv = ahno.av(listenableFutureE, listenableFutureK);
        itv itvVar = new itv(this, listenableFutureE, listenableFutureK, i);
        Executor executor2 = this.c;
        return afxd.f(ahudVarAv.k(itvVar, executor2)).b(afky.class, new iua(10), executor2);
    }

    @Override // defpackage.iup
    public final ListenableFuture x(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(S((Uri) it.next(), null));
        }
        ListenableFuture listenableFutureT = ahng.t(arrayList);
        ahud ahudVarAv = ahno.av(listenableFutureT);
        itv itvVar = new itv(this, listenableFutureT, list, 6);
        Executor executor = this.c;
        return afxd.f(ahudVarAv.k(itvVar, executor)).b(afky.class, new iua(2), executor);
    }

    public final ListenableFuture y(Uri uri) {
        return afxd.f(this.o.G(ixt.o(uri), ish.g, "is_music=1 AND title IS NOT NULL", null, "play_order").g()).b(afky.class, new ist(18), this.c);
    }

    public final ListenableFuture z(ahdm ahdmVar, Map map) {
        return ahdmVar.c(afwl.f(new wdt(this, map, 1)), this.c).g();
    }
}
