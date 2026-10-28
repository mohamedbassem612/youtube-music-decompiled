package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfn {
    public final Object a;

    public hfn(int[] iArr) {
        bbn bbnVarA = (Build.VERSION.SDK_INT >= 36 ? new bba() : Build.VERSION.SDK_INT >= 35 ? new baz() : Build.VERSION.SDK_INT >= 34 ? new bay() : Build.VERSION.SDK_INT >= 31 ? new bax() : Build.VERSION.SDK_INT >= 30 ? new baw() : Build.VERSION.SDK_INT >= 29 ? new bav() : new bau()).a();
        int i = awku.k;
        bbnVarA.getClass();
        this.a = new awku(bbnVarA);
    }

    public static boolean D(Activity activity) {
        return twm.m(activity.getResources().getDisplayMetrics(), twm.e(activity.getWindowManager())) >= 600;
    }

    public static boolean F(Context context) {
        return context.getResources().getBoolean(R.bool.is_tablet);
    }

    @Deprecated
    public static boolean G(Context context) {
        return F(context) && yno.H(context);
    }

    public static iux O(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        iuw iuwVar = new iuw();
        iuwVar.b(j);
        iuwVar.c(ahno.Z(string));
        iuwVar.d(agpi.a);
        return iuwVar.a();
    }

    public static iuz P(Cursor cursor) {
        return new iuz(cursor.getLong(cursor.getColumnIndexOrThrow("playlist_track_pair_id")), cursor.getLong(cursor.getColumnIndexOrThrow("playlist_id")), cursor.getLong(cursor.getColumnIndexOrThrow("audio_media_id")), cursor.getInt(cursor.getColumnIndexOrThrow("position")));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    private final iml aA(Class cls, Class cls2) {
        imh imhVar = new imh(cls, cls2);
        ?? r5 = this.a;
        if (!r5.containsKey(imhVar)) {
            throw new IllegalStateException("Expected generator binding missing from the map for key: ".concat(imhVar.toString()));
        }
        iml imlVar = (iml) r5.get(imhVar);
        if (cls.equals(imlVar.b()) && cls2.equals(imlVar.c())) {
            return imlVar;
        }
        throw new IllegalStateException(String.format("Type mismatch for %s. Expected=(%s, %s), Actual=(%s, %s)", imlVar.getClass(), cls, cls2, imlVar.b(), imlVar.c()));
    }

    public static final long ar(omr omrVar, String str) {
        ahno.F(!TextUtils.isEmpty(str.trim()));
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        return omrVar.d("music_sideloaded_playlist", contentValues, 5);
    }

    public static final int as(omr omrVar, long j) {
        omr omrVar2 = new omr();
        omrVar2.i("SELECT MAX(position) FROM ");
        omrVar2.i("music_sideloaded_playlist_track");
        omrVar2.i(" WHERE ");
        omrVar2.i("playlist_id");
        omrVar2.i(" = ?");
        omrVar2.j(Long.valueOf(j));
        Cursor cursorN = omrVar.n(omrVar2.p());
        try {
            int i = cursorN.moveToFirst() ? cursorN.getInt(0) : -1;
            if (cursorN != null) {
                cursorN.close();
            }
            return i;
        } catch (Throwable th) {
            if (cursorN != null) {
                try {
                    cursorN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final int at(omr omrVar, long j) {
        omr omrVar2 = new omr();
        omrVar2.i("SELECT ");
        omrVar2.i("position");
        omrVar2.i(" FROM ");
        omrVar2.i("music_sideloaded_playlist_track");
        omrVar2.i(" WHERE ");
        omrVar2.i("playlist_track_pair_id");
        omrVar2.i(" = ?");
        omrVar2.j(Long.valueOf(j));
        Cursor cursorN = omrVar.n(omrVar2.p());
        try {
            int i = cursorN.moveToFirst() ? cursorN.getInt(0) : -1;
            if (cursorN != null) {
                cursorN.close();
            }
            return i;
        } catch (Throwable th) {
            if (cursorN != null) {
                try {
                    cursorN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final long au(omr omrVar, long j, long j2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("audio_media_id", Long.valueOf(j2));
        contentValues.put("playlist_id", Long.valueOf(j));
        contentValues.put("position", Integer.valueOf(i));
        return omrVar.d("music_sideloaded_playlist_track", contentValues, 4);
    }

    public static final boolean av(omr omrVar, long j, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("position", Integer.valueOf(i));
        return omrVar.c("music_sideloaded_playlist_track", contentValues, "playlist_track_pair_id = ?", String.valueOf(j)) > 0;
    }

    public static final void aw(omr omrVar, long j, long j2, boolean z) {
        omr omrVar2 = new omr();
        omrVar2.i("UPDATE ");
        omrVar2.i("music_sideloaded_playlist_track");
        omrVar2.i(" SET ");
        omrVar2.i("position");
        omrVar2.i(" = position");
        omrVar2.i(true != z ? "-" : "+");
        omrVar2.i(" 1");
        omrVar2.i(" WHERE ");
        omrVar2.i("position");
        omrVar2.i(" BETWEEN ? AND ?");
        omrVar2.j(Long.valueOf(j));
        omrVar2.j(Long.valueOf(j2));
        omrVar.o(omrVar2.p());
    }

    public static final int ax(omr omrVar, long j, agke agkeVar) {
        int iAs = as(omrVar, j);
        int size = agkeVar.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3 = iAs + 1;
            omr omrVar2 = omrVar;
            long j2 = j;
            if (au(omrVar2, j2, ((Long) agkeVar.get(i)).longValue(), i3) > 0) {
                i2++;
            }
            i++;
            omrVar = omrVar2;
            j = j2;
            iAs = i3;
        }
        return i2;
    }

    private static final boolean ay(anfv anfvVar) {
        ajwo ajwoVar;
        int iBd;
        if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & 64) != 0) {
            ajwoVar = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            if (((anfvVar.b == 78861357 ? (angh) anfvVar.c : angh.a).b & 16) != 0) {
                ajwoVar = (anfvVar.b == 78861357 ? (angh) anfvVar.c : angh.a).g;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
            } else {
                ajwoVar = null;
            }
        }
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akkw.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akkw.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            akkw akkwVar = (akkw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if ((akkwVar.c & 2) == 0 || (iBd = a.bd(akkwVar.e)) == 0 || iBd != 5) {
                return false;
            }
        } else {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akkw.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (!ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                return false;
            }
        }
        return true;
    }

    private static final int az(boolean z) {
        return z ? 2 : 3;
    }

    public static anfv f(Context context, anfv anfvVar) {
        aihf builder = anfvVar.toBuilder();
        yno.dY(builder, ackj.c(context.getResources().getString(R.string.action_remove_from_offline_songs)));
        anfv anfvVar2 = (anfv) builder.instance;
        aihf builder2 = (anfvVar2.b == 66441155 ? (anga) anfvVar2.c : anga.a).toBuilder();
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.REMOVE_FROM_LIBRARY;
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
        anga angaVar2 = (anga) builder2.build();
        builder.copyOnWrite();
        anfv anfvVar3 = (anfv) builder.instance;
        angaVar2.getClass();
        anfvVar3.c = angaVar2;
        anfvVar3.b = 66441155;
        ajwo ajwoVarDT = yno.dT((anfv) builder.build());
        if (ajwoVarDT != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohd.b);
            ajwoVarDT.c(aihlVarCheckIsLite);
            if (ajwoVarDT.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohd.b);
                ajwoVarDT.c(aihlVarCheckIsLite2);
                Object objK = ajwoVarDT.j.k(aihlVarCheckIsLite2.d);
                aihf builder3 = ((aohd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
                builder3.copyOnWrite();
                aohd aohdVar = (aohd) builder3.instance;
                aohdVar.f = 2;
                aohdVar.c |= 2;
                aohd aohdVar2 = (aohd) builder3.build();
                aihh aihhVar2 = (aihh) ajwoVarDT.toBuilder();
                aihhVar2.e(aohd.b, aohdVar2);
                yno.dX(builder, (ajwo) aihhVar2.build());
            }
        }
        return (anfv) builder.build();
    }

    @Deprecated
    public static aofe h(aamo aamoVar) {
        if (aamoVar != null) {
            aohb aohbVar = (aohb) aamoVar.e;
            if (aohbVar.p.size() != 0) {
                aiie aiieVar = aohbVar.p;
                for (int i = 0; i < aiieVar.size(); i++) {
                    if ((((aoha) aiieVar.get(i)).b & 1) != 0) {
                        aofe aofeVar = ((aoha) aiieVar.get(i)).c;
                        return aofeVar == null ? aofe.a : aofeVar;
                    }
                }
            }
        }
        return null;
    }

    @Deprecated
    public static String j(aamo aamoVar) {
        aofe aofeVarH = h(aamoVar);
        if (aofeVarH == null) {
            return null;
        }
        return aofeVarH.m;
    }

    public static boolean m(aamg aamgVar) {
        return aamgVar == aamg.DELETED || aamgVar == aamg.STREAM_DOWNLOAD_PENDING || aamgVar == aamg.METADATA_ONLY;
    }

    public static boolean n(aaew aaewVar, String str) {
        if (aaewVar == null || aaewVar.as(str)) {
            return false;
        }
        aamt aamtVarF = aaewVar.f(str);
        return aamtVarF == null || aamtVarF.t() || aamtVarF.j();
    }

    public static boolean w(anfy anfyVar) {
        for (anfv anfvVar : anfyVar.c) {
            ajwo ajwoVar = (anfvVar.b == 66441108 ? (anfw) anfvVar.c : anfw.a).f;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arfa.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tqj] */
    public final boolean A() {
        int i = tqr.a;
        return this.a.k(1073830361);
    }

    public final ListenableFuture B(ailg ailgVar) {
        return ((qrx) this.a).a(new gqq(ailgVar, 4), MoreExecutors.directExecutor());
    }

    public final hzg C(aouu aouuVar, hwz hwzVar) {
        return new hzg(t().longValue(), aouuVar, hwzVar);
    }

    public final boolean E() {
        return Settings.Global.getInt((ContentResolver) this.a, "device_demo_mode", 0) == 1;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final jkn H() {
        Handler handler = (Handler) this.a.io();
        handler.getClass();
        return new jkn(handler, 700L);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final iyo I(anss anssVar) {
        tbt tbtVar = (tbt) this.a.io();
        tbtVar.getClass();
        anssVar.getClass();
        return new iyo(tbtVar, anssVar);
    }

    public final int J() {
        return L().f(519).e;
    }

    public final int K() {
        return L().f(519).c;
    }

    public final bbn L() {
        bbb bavVar;
        bbn bbnVar = (bbn) ((awku) this.a).aD();
        if (bbnVar != null) {
            return bbnVar;
        }
        if (Build.VERSION.SDK_INT >= 36) {
            bavVar = new bba();
        } else if (Build.VERSION.SDK_INT >= 35) {
            bavVar = new baz();
        } else if (Build.VERSION.SDK_INT >= 34) {
            bavVar = new bay();
        } else if (Build.VERSION.SDK_INT >= 31) {
            bavVar = new bax();
        } else if (Build.VERSION.SDK_INT >= 30) {
            bavVar = new baw();
        } else {
            bavVar = Build.VERSION.SDK_INT >= 29 ? new bav() : new bau();
        }
        return bavVar.a();
    }

    public final avlh M() {
        return ((avlh) this.a).P();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final agcg N() {
        jah jahVar = (jah) this.a.io();
        jahVar.getClass();
        return new agcg(jahVar);
    }

    public final ListenableFuture Q(final long j, final long j2) {
        return ((omj) this.a).S(new qsx() { // from class: iuv
            @Override // defpackage.qsx
            public final Object a(omr omrVar) {
                long j3 = j;
                int iAs = hfn.as(omrVar, j3);
                boolean z = false;
                if (iAs != -1 && hfn.au(omrVar, j3, j2, iAs + 1) > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final ListenableFuture R(long j, agke agkeVar) {
        return ((omj) this.a).S(new iur(j, agkeVar, 0));
    }

    public final ListenableFuture S(String str) {
        return ((omj) this.a).S(new iut(str, 2));
    }

    public final ListenableFuture T(long j) {
        return ((omj) this.a).S(new iuu(j, 0));
    }

    public final ListenableFuture U() {
        ius iusVar = new ius(1);
        omj omjVar = (omj) this.a;
        ListenableFuture listenableFutureS = omjVar.S(iusVar);
        ListenableFuture listenableFutureS2 = omjVar.S(new ius(3));
        return ahno.av(listenableFutureS, listenableFutureS2).k(new itc(listenableFutureS, listenableFutureS2, 20), MoreExecutors.directExecutor());
    }

    public final ListenableFuture V() {
        return ((omj) this.a).S(new ius(2));
    }

    public final ListenableFuture W(long j) {
        ListenableFuture listenableFutureS = ((omj) this.a).S(new iuu(j, 3));
        ListenableFuture listenableFutureX = X(j);
        return ahno.av(listenableFutureS, listenableFutureX).k(new jkb(listenableFutureS, listenableFutureX, 1), MoreExecutors.directExecutor());
    }

    public final ListenableFuture X(long j) {
        return ((omj) this.a).S(new iuu(j, 1));
    }

    public final ListenableFuture Y() {
        return ((omj) this.a).S(new ius(0));
    }

    public final ListenableFuture Z(agke agkeVar) {
        return ((omj) this.a).S(new iut(agkeVar, 1));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final void a() {
        WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a.io();
        if (watchWhileLayout.ac()) {
            return;
        }
        if (watchWhileLayout.ab()) {
            watchWhileLayout.P(false);
        }
        watchWhileLayout.L(false);
    }

    public final ListenableFuture aa(final long j, final long j2, final long j3) {
        return ((omj) this.a).S(new qsx() { // from class: iuq
            @Override // defpackage.qsx
            public final Object a(omr omrVar) {
                int i;
                long j4 = j3;
                long j5 = j2;
                if (j4 == -1) {
                    return Boolean.valueOf(hfn.av(omrVar, j5, hfn.as(omrVar, j) + 1));
                }
                int iAt = hfn.at(omrVar, j5);
                int iAt2 = hfn.at(omrVar, j4);
                if (iAt <= 0 || iAt2 <= 0) {
                    return Boolean.FALSE;
                }
                if (iAt == iAt2 || iAt == (i = iAt2 - 1)) {
                    return Boolean.TRUE;
                }
                if (iAt < iAt2) {
                    hfn.aw(omrVar, iAt + 1, i, false);
                    return Boolean.valueOf(hfn.av(omrVar, j5, i));
                }
                hfn.aw(omrVar, iAt2, iAt - 1, true);
                return Boolean.valueOf(hfn.av(omrVar, j5, iAt2));
            }
        });
    }

    public final ListenableFuture ab(long j) {
        return ((omj) this.a).S(new iuu(j, 2));
    }

    public final ListenableFuture ac(agke agkeVar) {
        return ((omj) this.a).S(new iut(agkeVar, 0));
    }

    public final ListenableFuture ad(long j, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(j));
        contentValues.put("title", str);
        return ((omj) this.a).S(new iur(contentValues, j, 1));
    }

    public final void ae(int i) {
        aihf aihfVarCreateBuilder = anxd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anxd anxdVar = (anxd) aihfVarCreateBuilder.instance;
        anxdVar.c = i - 1;
        anxdVar.b |= 1;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_SIDELOADED_PLAYLIST_SERVICE_CALLED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        anxd anxdVar2 = (anxd) aihfVarCreateBuilder.build();
        anxdVar2.getClass();
        alouVar.d = anxdVar2;
        alouVar.c = 246;
        xeuVar.b((alou) alosVar.build());
    }

    public final void af(int i, int i2) {
        aihf aihfVarCreateBuilder = anxd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anxd anxdVar = (anxd) aihfVarCreateBuilder.instance;
        anxdVar.c = 8;
        anxdVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anxd anxdVar2 = (anxd) aihfVarCreateBuilder.instance;
        anxdVar2.d = 1;
        anxdVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        anxd anxdVar3 = (anxd) aihfVarCreateBuilder.instance;
        anxdVar3.b |= 4;
        anxdVar3.e = i;
        aihfVarCreateBuilder.copyOnWrite();
        anxd anxdVar4 = (anxd) aihfVarCreateBuilder.instance;
        anxdVar4.b |= 8;
        anxdVar4.f = i2;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_SIDELOADED_PLAYLIST_SERVICE_CALLED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        anxd anxdVar5 = (anxd) aihfVarCreateBuilder.build();
        anxdVar5.getClass();
        alouVar.d = anxdVar5;
        alouVar.c = 246;
        xeuVar.b((alou) alosVar.build());
    }

    public final void ag() {
        aihf aihfVarCreateBuilder = anxd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anxd anxdVar = (anxd) aihfVarCreateBuilder.instance;
        anxdVar.c = 8;
        anxdVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anxd anxdVar2 = (anxd) aihfVarCreateBuilder.instance;
        anxdVar2.d = 2;
        anxdVar2.b |= 2;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_SIDELOADED_PLAYLIST_SERVICE_CALLED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        anxd anxdVar3 = (anxd) aihfVarCreateBuilder.build();
        anxdVar3.getClass();
        alouVar.d = anxdVar3;
        alouVar.c = 246;
        xeuVar.b((alou) alosVar.build());
    }

    public final void ah(int i) {
        aihf aihfVarCreateBuilder = anxb.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anxb anxbVar = (anxb) aihfVarCreateBuilder.instance;
        anxbVar.c = i - 1;
        anxbVar.b |= 1;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_SIDELOADED_PLAYLIST_EXPORT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        anxb anxbVar2 = (anxb) aihfVarCreateBuilder.build();
        anxbVar2.getClass();
        alouVar.d = anxbVar2;
        alouVar.c = 347;
        xeuVar.b((alou) alosVar.build());
    }

    public final void ai(int i, int i2) {
        aihf aihfVarCreateBuilder = anxb.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anxb anxbVar = (anxb) aihfVarCreateBuilder.instance;
        anxbVar.c = i - 1;
        anxbVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anxb anxbVar2 = (anxb) aihfVarCreateBuilder.instance;
        anxbVar2.d = i2 - 1;
        anxbVar2.b |= 2;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_SIDELOADED_PLAYLIST_EXPORT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        anxb anxbVar3 = (anxb) aihfVarCreateBuilder.build();
        anxbVar3.getClass();
        alouVar.d = anxbVar3;
        alouVar.c = 347;
        xeuVar.b((alou) alosVar.build());
    }

    public final void aj(int i, int i2, int i3) {
        aihf aihfVarCreateBuilder = anxb.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anxb anxbVar = (anxb) aihfVarCreateBuilder.instance;
        anxbVar.c = i - 1;
        anxbVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anxb anxbVar2 = (anxb) aihfVarCreateBuilder.instance;
        anxbVar2.d = i2 - 1;
        anxbVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        anxb anxbVar3 = (anxb) aihfVarCreateBuilder.instance;
        anxbVar3.b |= 4;
        anxbVar3.e = i3;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_SIDELOADED_PLAYLIST_EXPORT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        anxb anxbVar4 = (anxb) aihfVarCreateBuilder.build();
        anxbVar4.getClass();
        alouVar.d = anxbVar4;
        alouVar.c = 347;
        xeuVar.b((alou) alosVar.build());
    }

    public final void ak(int i, boolean z, int i2, int i3) {
        an(5, az(z), i, i2, i3);
    }

    public final void al(int i, boolean z, int i2, int i3) {
        an(4, az(z), i, i2, i3);
    }

    public final void am(int i, boolean z) {
        an(6, az(z), i, 0, 0);
    }

    public final void an(int i, int i2, int i3, int i4, int i5) {
        aihf aihfVarCreateBuilder = anxc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anxc anxcVar = (anxc) aihfVarCreateBuilder.instance;
        anxcVar.c = i - 1;
        anxcVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anxc anxcVar2 = (anxc) aihfVarCreateBuilder.instance;
        anxcVar2.d = i2 - 1;
        anxcVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        anxc anxcVar3 = (anxc) aihfVarCreateBuilder.instance;
        anxcVar3.b |= 4;
        anxcVar3.e = i3;
        aihfVarCreateBuilder.copyOnWrite();
        anxc anxcVar4 = (anxc) aihfVarCreateBuilder.instance;
        anxcVar4.b |= 8;
        anxcVar4.f = i4;
        aihfVarCreateBuilder.copyOnWrite();
        anxc anxcVar5 = (anxc) aihfVarCreateBuilder.instance;
        anxcVar5.b |= 16;
        anxcVar5.g = i5;
        aihfVarCreateBuilder.copyOnWrite();
        anxc anxcVar6 = (anxc) aihfVarCreateBuilder.instance;
        anxcVar6.b |= 32;
        anxcVar6.h = 1;
        xeu xeuVar = (xeu) this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_SIDELOADED_PLAYLIST_MIGRATION_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        anxc anxcVar7 = (anxc) aihfVarCreateBuilder.build();
        anxcVar7.getClass();
        alouVar.d = anxcVar7;
        alouVar.c = 499;
        xeuVar.b((alou) alosVar.build());
    }

    public final ListenableFuture ao(Class cls, Class cls2, Object obj, agkj agkjVar) {
        obj.getClass();
        iml imlVarAA = aA(cls, cls2);
        if (agkjVar == null) {
            agkjVar = agpn.b;
        }
        return imlVarAA.a(obj, agkjVar);
    }

    public final MessageLite ap(Class cls, Class cls2, Object obj, agkj agkjVar) {
        obj.getClass();
        iml imlVarAA = aA(cls, cls2);
        if (agkjVar == null) {
            agkjVar = agpn.b;
        }
        return imlVarAA.d(obj, agkjVar);
    }

    public final awku aq() {
        return (awku) this.a;
    }

    public final void b(boolean z) {
        Object obj = this.a;
        if (obj == null) {
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        Context context = (Context) obj;
        erj.b(context).c.a(context).s((fec) new fec().I(z));
    }

    public final ListenableFuture c(String str) {
        hmy hmyVar = new hmy();
        hpk hpkVar = (hpk) this.a;
        ListenableFuture listenableFutureB = hpkVar.b();
        ListenableFuture listenableFutureC = hpkVar.c();
        ListenableFuture listenableFutureA = hpkVar.a();
        return ahno.av(listenableFutureB, listenableFutureC, listenableFutureA).k(new hni(listenableFutureB, listenableFutureC, listenableFutureA, str, hmyVar, 7), MoreExecutors.directExecutor());
    }

    public final void d(int i) {
        ((awku) this.a).kk(new huc(i, 1));
    }

    public final void e(int i, int i2) {
        ((awku) this.a).kk(new huc(i, i2));
    }

    @Deprecated
    public final anzw g(aamo aamoVar) {
        if (aamoVar == null) {
            return anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
        }
        aofe aofeVarH = h(aamoVar);
        if (aofeVarH == null) {
            ((aerv) this.a).g();
        } else {
            anzw anzwVarA = anzw.a(aofeVarH.i);
            if (anzwVarA != null) {
                return anzwVarA;
            }
        }
        return anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aunn, java.lang.Object] */
    @tcc
    public final void handleLikeVideoActionEvent(gsg gsgVar) {
        gsgVar.getClass();
        if (gsgVar.b == amlg.LIKE) {
            xsc xscVar = (xsc) this.a.io();
            jkp jkpVar = (jkp) xscVar.c;
            if (jkpVar.getBoolean("like_intro_dialog_shown", false)) {
                return;
            }
            Context context = (Context) xscVar.b;
            View viewInflate = View.inflate(context, R.layout.like_intro_dialog, null);
            ((TextView) viewInflate.findViewById(R.id.like_intro_message)).setText(R.string.save_library_like_song_introducer_message);
            ((abfv) xscVar.a).g(context).setView(viewInflate).setPositiveButton(R.string.dialog_got_it_text, new xyo(1)).create().show();
            jko jkoVarEdit = jkpVar.edit();
            jkoVarEdit.a("like_intro_dialog_shown", true);
            jkoVarEdit.apply();
        }
    }

    @Deprecated
    public final aogf i(aamo aamoVar) {
        if (aamoVar == null) {
            return aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
        }
        aofe aofeVarH = h(aamoVar);
        if (aofeVarH == null) {
            ((aerv) this.a).g();
        } else {
            aogf aogfVarA = aogf.a(aofeVarH.k);
            if (aogfVarA != null) {
                return aogfVarA;
            }
        }
        return aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
    }

    @Deprecated
    public final String k(aamo aamoVar) {
        aofe aofeVarH = h(aamoVar);
        if (aofeVarH != null) {
            return aofeVarH.h;
        }
        ((aerv) this.a).g();
        return "";
    }

    @Deprecated
    public final String l(aamo aamoVar) {
        aofe aofeVarH = h(aamoVar);
        if (aofeVarH != null) {
            return aofeVarH.f;
        }
        ((aerv) this.a).g();
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void o(ibu ibuVar) {
        this.a.add(ibuVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void p(ibu ibuVar) {
        this.a.remove(ibuVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean q() {
        return !this.a.isEmpty();
    }

    public final int r() {
        return ((AtomicInteger) this.a).getAndIncrement();
    }

    public final hzf s(aoun aounVar) {
        return new hzf(t().longValue(), aounVar, true);
    }

    public final Long t() {
        return Long.valueOf(((AtomicLong) this.a).incrementAndGet());
    }

    public final anfy u(hyw hywVar) {
        boolean zJ;
        anfy anfyVarC;
        ajwo ajwoVar;
        if (hywVar != null) {
            anfyVarC = hywVar.c();
            zJ = hywVar.j();
        } else {
            zJ = false;
            anfyVarC = null;
        }
        aihf aihfVarCreateBuilder = anfy.a.createBuilder();
        ArrayList arrayList = new ArrayList();
        if (anfyVarC != null) {
            if ((anfyVarC.b & 4) != 0) {
                ange angeVar = anfyVarC.f;
                if (angeVar == null) {
                    angeVar = ange.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                anfy anfyVar = (anfy) aihfVarCreateBuilder.instance;
                angeVar.getClass();
                anfyVar.f = angeVar;
                anfyVar.b |= 4;
            }
            aigj aigjVar = anfyVarC.e;
            aihfVarCreateBuilder.copyOnWrite();
            anfy anfyVar2 = (anfy) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            anfyVar2.b |= 2;
            anfyVar2.e = aigjVar;
            for (anfv anfvVar : anfyVarC.c) {
                if (((anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).b & 64) != 0) {
                    ajwoVar = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                } else if (((anfvVar.b == 78861357 ? (angh) anfvVar.c : angh.a).b & 16) != 0) {
                    ajwoVar = (anfvVar.b == 78861357 ? (angh) anfvVar.c : angh.a).g;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                } else {
                    ajwoVar = null;
                }
                if (ajwoVar != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    }
                }
                if (!ay(anfvVar)) {
                    arrayList.add(anfvVar);
                }
            }
        }
        arrayList.addAll(v(Optional.ofNullable(anfyVarC), zJ));
        aihfVarCreateBuilder.bH(arrayList);
        return (anfy) aihfVarCreateBuilder.build();
    }

    public final List v(Optional optional, boolean z) {
        Optional optionalEmpty;
        Object objA;
        agjz agjzVar = new agjz(4);
        if (!optional.isEmpty()) {
            Iterator it = ((anfy) optional.get()).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    optionalEmpty = Optional.empty();
                    break;
                }
                anfv anfvVar = (anfv) it.next();
                if (ay(anfvVar)) {
                    optionalEmpty = Optional.of(anfvVar);
                    break;
                }
            }
        } else {
            optionalEmpty = Optional.empty();
        }
        agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            hyi hyiVar = (hyi) agqsVarListIterator.next();
            if (!(hyiVar instanceof hyp) || !z) {
                if ((hyiVar instanceof hyj) && optionalEmpty.isPresent()) {
                    agrx agrxVar = agso.a;
                    objA = optionalEmpty.get();
                } else {
                    objA = hyiVar.a();
                }
                if (objA != null) {
                    agjzVar.h(objA);
                }
            }
        }
        return agjzVar.g();
    }

    public final hww x() {
        hww hwwVar = (hww) ((awku) this.a).aD();
        return hwwVar == null ? hww.a : hwwVar;
    }

    public final avlh y() {
        return ((avlh) this.a).N();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, tqj] */
    public final void z(String str) {
        tqh tqhVarD = this.a.d(1);
        int i = tqr.a;
        tqhVarD.b(1071578, hmy.o(str));
        tqhVarD.a();
    }

    public hfn(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public hfn(aunn aunnVar) {
        aunnVar.getClass();
        this.a = aunnVar;
    }

    public hfn(tqj tqjVar) {
        tqjVar.getClass();
        this.a = tqjVar;
    }

    public hfn(byte[] bArr) {
        this.a = new awku(new huc(1, 1));
    }

    public hfn() {
        this.a = new awku();
    }

    public hfn(awmd awmdVar, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public hfn(short[] sArr) {
        this.a = new awku(hww.a);
    }

    public hfn(hyp hypVar, hyt hytVar, hyr hyrVar, hyh hyhVar, hym hymVar, hyq hyqVar, hyj hyjVar, hyk hykVar) {
        this.a = agke.x(hyjVar, hykVar, hypVar, hytVar, hyrVar, hyhVar, hymVar, hyqVar);
    }

    public hfn(char[] cArr, byte[] bArr) {
        this.a = new AtomicLong(0L);
    }

    public hfn(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicInteger();
    }

    public hfn(char[] cArr) {
        this.a = new HashSet();
    }

    public hfn(byte[] bArr, char[] cArr) {
        this.a = new awku();
    }

    public hfn(awmd awmdVar, short[] sArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public hfn(ayq ayqVar) {
        this.a = ayqVar.ag("music_sideloaded_playlist_database", iuy.a);
    }

    public hfn(Object obj) {
        this.a = obj;
    }

    public hfn(awmd awmdVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public hfn(awmd awmdVar, byte[] bArr, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public hfn(awmd awmdVar, char[] cArr, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public hfn(awmd awmdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public hfn(awmd awmdVar, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public hfn(Context context, byte[] bArr) {
        this.a = context.getContentResolver();
    }
}
