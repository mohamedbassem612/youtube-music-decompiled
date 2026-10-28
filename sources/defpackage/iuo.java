package defpackage;

import android.content.ContentResolver;
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
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iuo implements iup {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/sideloaded/store/DefaultSideloadedStore");
    public final Context b;
    public final Executor c;
    public final Executor d;
    public final ContentResolver e;
    public final awmd f;
    public int g = 1;
    public int h = 1;
    public final vxz i;
    public final klc j;
    public final hfn k;
    public final hfn l;
    public final hfn m;
    public final jij n;
    public final hfn o;

    public iuo(Context context, Executor executor, Executor executor2, awmd awmdVar, hfn hfnVar, hfn hfnVar2, hfn hfnVar3, hfn hfnVar4, klc klcVar, jij jijVar, vxz vxzVar) {
        this.b = context;
        this.c = executor;
        this.d = new ahfg(executor2);
        this.e = context.getContentResolver();
        this.n = jijVar;
        this.f = awmdVar;
        this.k = hfnVar;
        this.m = hfnVar2;
        this.o = hfnVar3;
        this.l = hfnVar4;
        this.j = klcVar;
        this.i = vxzVar;
    }

    public static boolean P(Uri uri) {
        return ish.q.match(uri) == 6;
    }

    public static final agke R(agkz agkzVar, agkz agkzVar2) {
        return (agke) Collection.EL.stream(agkzVar).filter(new ibz(agkzVar2, 7)).collect(aghu.a);
    }

    public static final boolean S() {
        return Build.VERSION.SDK_INT <= 29;
    }

    private final ListenableFuture T(Uri uri, Map map) {
        ListenableFuture listenableFutureU = U(ahno.ap(new itc(this, (Object) uri, 11), this.d), map);
        return ahno.av(listenableFutureU).k(new iug(listenableFutureU, 0), this.c);
    }

    private final ListenableFuture U(ListenableFuture listenableFuture, Map map) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ahno.av(listenableFuture).k(new itc((Object) this, (Object) listenableFuture, 10), this.c);
        }
        return map == null ? ahno.as(k(), new iub(this, listenableFuture, 7), this.c) : E(listenableFuture, map);
    }

    private final ListenableFuture V(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ahno.av(listenableFuture, listenableFuture2).k(new itv(this, listenableFuture, listenableFuture2, 11), this.c);
        }
        ListenableFuture listenableFutureK = k();
        return ahno.av(listenableFuture, listenableFuture2, listenableFutureK).k(new hlm(this, listenableFuture, listenableFuture2, listenableFutureK, 6), this.c);
    }

    public static long b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return System.currentTimeMillis() / 1000;
    }

    public static long j(Uri uri) {
        return Long.parseLong(uri.getLastPathSegment());
    }

    @Override // defpackage.iup
    public final ListenableFuture A() {
        ebs ebsVar = new ebs(this, 6);
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), ebsVar, 1));
        this.d.execute(ahfoVar);
        gqq gqqVar = new gqq(this, 12);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        afwi afwiVar = new afwi(afty.c(false), gqqVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(ahfoVar, afwiVar);
        ahfoVar.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        ListenableFuture listenableFutureH = H();
        ahcq ahcqVar = new ahcq(listenableFutureH, new ahdb(afty.c(false), new hqm(this, 2), 1));
        Executor executor = this.c;
        listenableFutureH.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return new ahud(new ahek(false, agke.p(new ListenableFuture[]{ahcrVar, ahcqVar})), (byte[]) null).k(new fzs(ahcrVar, ahcqVar, 3), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture B(int i) {
        iug iugVar = new iug(this, 5);
        Executor executor = this.d;
        return ahno.as(ahno.ar(ahno.ap(iugVar, executor), new iua(14), executor), new hsx(this, i + 1, 5), executor);
    }

    @Override // defpackage.iup
    public final ListenableFuture C(Uri uri, Uri uri2, Uri uri3) {
        return ahno.as(this.j.g(), new iaj((Object) this, uri, uri2, uri3, 5), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture D(Uri uri, Uri uri2) {
        return ahno.as(this.j.g(), new hlk((Object) this, uri, uri2, 19), this.c);
    }

    public final ListenableFuture E(ListenableFuture listenableFuture, Map map) {
        return ahno.av(listenableFuture).k(new itv(this, listenableFuture, map, 15), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture F(Uri uri, String str) {
        ahno.F(!TextUtils.isEmpty(str));
        return ahno.as(this.j.g(), new hlk((Object) this, uri, str, 16), this.c);
    }

    public final ListenableFuture G(Uri uri, String[] strArr, String str, String[] strArr2, String str2, jkt jktVar) {
        return ahno.ap(new iuh(new qcb(this), uri, strArr, str, strArr2, str2, jktVar, 0), this.d);
    }

    public final ListenableFuture H() {
        return this.j.f();
    }

    public final anuk I(iux iuxVar, anyx anyxVar) {
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

    public final void M(agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return;
        }
        taf.j(ahno.as(this.j.f(), new iub(this, agkeVar, 5), this.c), new iul(1));
    }

    @Override // defpackage.iup
    public final boolean N() {
        A();
        return this.g == 2 || this.h == 2;
    }

    public final void O(Uri uri, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("date_modified", Long.valueOf(j));
        ahno.ao(new gwb(this, contentValues, uri, 9), this.d);
    }

    public final ListenableFuture Q(iux iuxVar, Map map) {
        iuxVar.getClass();
        agke agkeVar = iuxVar.c;
        return !agkeVar.isEmpty() ? ahno.ar(T(ixt.p(String.valueOf(((iuz) agkeVar.get(0)).c)), map), new idw(this, iuxVar, 19), this.c) : ahng.n(I(iuxVar, null));
    }

    public final int a(Uri uri) {
        Cursor cursorQuery;
        if (Build.VERSION.SDK_INT >= 30) {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-limit", 1);
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"play_order"});
            bundle.putInt("android:query-arg-sort-direction", 1);
            cursorQuery = this.e.query(ixt.o(uri), new String[]{"play_order"}, bundle, null);
        } else {
            cursorQuery = this.e.query(ixt.o(uri), new String[]{"play_order"}, null, null, "play_order DESC LIMIT 1");
        }
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            jku.b(cursorQuery);
        }
    }

    @Override // defpackage.iup
    public final ListenableFuture c(Uri uri, Uri uri2) {
        return ahno.as(this.j.g(), new hlk((Object) this, uri, uri2, 20), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture d(Uri uri, Uri uri2) {
        return ahno.as(this.j.g(), new hlk((Object) this, uri, uri2, 17), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture e(Uri uri, Uri uri2) {
        return ahno.as(this.j.g(), new hlk((Object) this, uri, uri2, 18), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture f(String str) {
        ahno.F(!TextUtils.isEmpty(str));
        return ahno.as(this.j.g(), new iub(this, str, 10), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture g(Uri uri) {
        return ahno.as(this.j.g(), new iub(this, uri, 8, null), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture h(Uri uri) {
        return afxd.f(ahno.ap(new itc(this, (Object) uri, 9), this.d)).g(new idw(this, uri, 17, null), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture i(Uri uri) {
        String[] strArr = ish.i;
        ((wbz) this.f.io()).c();
        ListenableFuture listenableFutureG = G(uri, strArr, null, null, null, new isj(this.b, this.i.l(263, 45828915L, false)));
        return ahno.av(listenableFutureG).k(new iug(listenableFutureG, 3), this.c);
    }

    public final ListenableFuture k() {
        return afxd.f(ahno.ap(new iug(this, 1), this.d)).g(new iua(16), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture l(Uri uri) {
        String[] strArr = ish.i;
        ((wbz) this.f.io()).c();
        ListenableFuture listenableFutureG = G(uri, strArr, null, null, null, new isj(this.b, this.i.l(263, 45828915L, false)));
        ListenableFuture listenableFutureU = U(ahno.ap(new itc(this, (Object) uri, 7), this.d), null);
        return ahno.av(listenableFutureG, listenableFutureU).k(new itc(listenableFutureG, listenableFutureU, 8), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture m(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((Uri) it.next()));
        }
        ListenableFuture listenableFutureT = ahng.t(arrayList);
        return ahno.av(listenableFutureT).k(new iug(listenableFutureT, 6), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture n() {
        Uri uri = MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI;
        String[] strArr = ish.i;
        String str = String.format("LOWER(%s)", "album");
        ((wbz) this.f.io()).c();
        return G(uri, strArr, null, null, str, new isj(this.b, this.i.l(263, 45828915L, false)));
    }

    @Override // defpackage.iup
    public final ListenableFuture o() {
        Uri uri = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI;
        String[] strArr = ish.l;
        String str = String.format("LOWER(%s)", "artist");
        ((wbz) this.f.io()).c();
        return V(G(uri, strArr, null, null, str, new isk(this.b)), y());
    }

    @Override // defpackage.iup
    public final ListenableFuture p(boolean z) {
        return ahno.as(H(), new hoy(this, z, 7), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture q() {
        return U(ahno.ap(new iug(this, 2), this.d), null);
    }

    @Override // defpackage.iup
    public final ListenableFuture r(Uri uri) {
        String[] strArr = ish.l;
        ((wbz) this.f.io()).c();
        ListenableFuture listenableFutureG = G(uri, strArr, null, null, null, new isk(this.b));
        ListenableFuture listenableFutureU = U(ahno.ap(new itc(this, (Object) uri, 19), this.d), null);
        return ahno.av(listenableFutureG, listenableFutureU).k(new itv(this, listenableFutureG, listenableFutureU, 10), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            Context context = this.b;
            awmd awmdVar = this.f;
            String[] strArr = ish.l;
            ((wbz) awmdVar.io()).c();
            iuo iuoVar = this;
            ListenableFuture listenableFutureG = iuoVar.G(uri, strArr, null, null, null, new isk(context));
            arrayList.add(ahno.av(listenableFutureG).k(new huo(listenableFutureG, 20), iuoVar.c));
            this = iuoVar;
        }
        iuo iuoVar2 = this;
        ListenableFuture listenableFutureT = ahng.t(arrayList);
        return iuoVar2.V(ahno.av(listenableFutureT).k(new iug(listenableFutureT, 9), iuoVar2.c), iuoVar2.y());
    }

    public final ListenableFuture t(Uri uri) {
        return ahno.ar(ahno.ap(new itc(this, (Object) uri, 13), this.d), new iua(18), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture u() {
        Uri uri = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
        String[] strArr = ish.k;
        Context context = this.b;
        return ahno.ar(G(uri, strArr, "owner_package_name = ?", new String[]{context.getPackageName()}, "date_modified DESC", new isl(context, ((wbz) this.f.io()).c())), new iun(this, 0), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture v(Uri uri, List list) {
        if (P(uri)) {
            return ahno.ar(this.k.X(j(uri)), new itg(list, 16), this.c);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            itv itvVar = new itv(this, uri, ((Uri) it.next()).getLastPathSegment(), 13);
            Executor executor = this.d;
            arrayList.add(afxd.f(ahno.ap(itvVar, executor)).g(new iua(17), executor));
        }
        return ahno.au(arrayList).k(new iug(arrayList, 7), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture w(Uri uri) {
        ListenableFuture listenableFutureK;
        if (P(uri)) {
            return ahno.as(this.k.W(j(uri)), new isv(this, 15), this.c);
        }
        ListenableFuture listenableFutureG = G(uri, ish.k, null, null, null, new isl(this.b, ((wbz) this.f.io()).c()));
        ListenableFuture listenableFutureZ = z(uri);
        int i = 2;
        if (Build.VERSION.SDK_INT >= 29) {
            listenableFutureK = ahno.av(listenableFutureZ).k(new itc((Object) this, (Object) listenableFutureZ, 18), this.c);
        } else {
            ListenableFuture listenableFutureK2 = k();
            listenableFutureK = ahno.av(listenableFutureZ, listenableFutureK2).k(new ium((Object) this, (Object) listenableFutureZ, (Object) listenableFutureK2, i), this.c);
        }
        return ahno.av(listenableFutureG, listenableFutureK).k(new itv(this, listenableFutureG, listenableFutureK, 12), this.c);
    }

    @Override // defpackage.iup
    public final ListenableFuture x(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(T((Uri) it.next(), null));
        }
        ListenableFuture listenableFutureT = ahng.t(arrayList);
        return ahno.av(listenableFutureT).k(new itv(this, listenableFutureT, list, 18), this.c);
    }

    public final ListenableFuture y() {
        return ahno.ap(new iug(this, 4), this.d);
    }

    public final ListenableFuture z(Uri uri) {
        return ahno.ap(new itc(this, (Object) uri, 14), this.d);
    }
}
