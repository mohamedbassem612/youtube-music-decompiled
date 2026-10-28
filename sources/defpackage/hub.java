package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hub implements aanl {
    public static final /* synthetic */ int h = 0;
    private static final Duration i = ahng.B(250);
    private static final Duration j = ahng.D(5);
    public final aank a;
    public final hpy b;
    public final hpd c;
    public final hpb d;
    public final Set e;
    public final ConcurrentHashMap f;
    public final vxz g;
    private final Context k;
    private final mbc l;
    private final adhv m;
    private final aauk n;
    private final hnq o;
    private final awut p;
    private final zwb q;
    private final Set r;
    private final ConcurrentHashMap s;
    private Instant t;
    private final awkv u;
    private final avmm v;
    private final tfq w;
    private final syn x;
    private final abfv y;
    private final isi z;

    public hub(Context context, mbc mbcVar, tfq tfqVar, isi isiVar, aank aankVar, adhv adhvVar, aauk aaukVar, abfv abfvVar, hpy hpyVar, hnq hnqVar, vxz vxzVar, hpd hpdVar, hpb hpbVar, awut awutVar, syn synVar, zwb zwbVar) {
        context.getClass();
        mbcVar.getClass();
        tfqVar.getClass();
        isiVar.getClass();
        aankVar.getClass();
        adhvVar.getClass();
        aaukVar.getClass();
        abfvVar.getClass();
        hpyVar.getClass();
        hnqVar.getClass();
        vxzVar.getClass();
        hpdVar.getClass();
        hpbVar.getClass();
        awutVar.getClass();
        synVar.getClass();
        zwbVar.getClass();
        this.k = context;
        this.l = mbcVar;
        this.w = tfqVar;
        this.z = isiVar;
        this.a = aankVar;
        this.m = adhvVar;
        this.n = aaukVar;
        this.y = abfvVar;
        this.b = hpyVar;
        this.o = hnqVar;
        this.g = vxzVar;
        this.c = hpdVar;
        this.d = hpbVar;
        this.p = awutVar;
        this.x = synVar;
        this.q = zwbVar;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.getClass();
        this.e = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet2.getClass();
        this.r = keySetViewNewKeySet2;
        this.s = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.t = instant;
        this.u = new awku().aI();
        this.v = new avmm();
    }

    private static final Uri A(hcg hcgVar) {
        wgg wggVarJ = new abuz(hcgVar.h).j(480);
        if (wggVarJ != null) {
            return wggVarJ.a();
        }
        return null;
    }

    private static final Uri B(anyx anyxVar) {
        wgg wggVarJ = new abuz(anyxVar.getThumbnailDetails()).j(240);
        if (wggVarJ != null) {
            return wggVarJ.a();
        }
        return null;
    }

    private final void C(aamw aamwVar, htt httVar, htr htrVar) {
        hub hubVar;
        awml awmlVar;
        awwd awwdVarT;
        long j2 = aarq.a;
        aamb aambVar = aamwVar.f;
        if (aambVar.b("transfer_type", 0) == 4) {
            String strF = aambVar.f("playlist_id");
            if (strF == null || strF.length() == 0) {
                hubVar = this;
                String strE = aarq.e(aambVar);
                awmlVar = new awml(strE, awro.t(hubVar.p, null, 0, new gme(hubVar, strE, httVar, (awoq) null, 3), 3));
            } else {
                if (this.f.keySet().contains(strF)) {
                    hubVar = this;
                    awwdVarT = null;
                } else {
                    hubVar = this;
                    awwdVarT = awro.t(this.p, null, 0, new qbq(hubVar, strF, htrVar, (awoq) null, 1), 3);
                }
                awmlVar = new awml(strF, awwdVarT);
            }
            Object obj = awmlVar.b;
            String str = (String) awmlVar.a;
            awwd awwdVar = (awwd) obj;
            if (awwdVar != null) {
                awwd awwdVar2 = (awwd) hubVar.f.put(str, awwdVar);
                if (awwdVar2 != null) {
                    awwdVar2.p(null);
                }
                awwdVar.kJ(new hgo(hubVar, str, awwdVar, 5));
            }
        }
    }

    private final Notification k(boolean z, boolean z2) {
        hts htsVar;
        if (!this.w.i()) {
            String string = this.k.getString(R.string.offline_waiting_for_network);
            string.getClass();
            htsVar = new hts(string, false, true);
        } else if (z) {
            htsVar = new hts(u(), false, true);
        } else {
            String string2 = this.k.getString(true != z2 ? R.string.notification_smart_downloads_updating : R.string.notification_recent_music_updating);
            string2.getClass();
            htsVar = new hts(string2, true, false);
        }
        atr atrVarC = c("ytm_smart_downloads");
        atrVarC.l(htsVar.a);
        atrVarC.q(R.drawable.yt_fill_sparkle_white_24);
        atrVarC.p(0, 0, true);
        boolean z3 = htsVar.b;
        atrVarC.e(2, z3);
        atrVarC.e(16, htsVar.c);
        Context context = this.k;
        ajwo ajwoVarB = vxh.b("FEmusic_offline");
        ajwoVarB.getClass();
        atrVarC.h = qof.b(context, 402159720, p(ajwoVarB), 201326592);
        if (z3) {
            atrVarC.G = j.toMillis();
        }
        Notification notificationA = atrVarC.a();
        notificationA.getClass();
        return notificationA;
    }

    private final Intent p(ajwo ajwoVar) {
        Intent intent = new Intent("com.google.android.youtube.music.action.navigate");
        Context context = this.k;
        Intent intentAddFlags = intent.setClassName(context, true != txz.g(context) ? "com.google.android.apps.youtube.music.activities.InternalMusicActivity" : "com.google.android.apps.youtube.music.wear.compose.activity.main.InternalWearMainActivityCompose").addFlags(67108864);
        zik.be(intentAddFlags, ajwoVar, null);
        intentAddFlags.getClass();
        return intentAddFlags;
    }

    private final Intent s(String str, boolean z) {
        ajwo ajwoVarT = fhz.T(str, z);
        ajwoVarT.getClass();
        return p(ajwoVarT);
    }

    private final Intent t(anyx anyxVar) {
        ajwo ajwoVarB = vxh.b(true != igs.c(anyxVar.getMusicVideoType()) ? "FEmusic_offline_songs" : "FEoffline_nma_tracks");
        ajwoVarB.getClass();
        return p(ajwoVarB);
    }

    private final String u() {
        if (this.n.p() && this.y.z()) {
            String string = this.k.getString(R.string.waiting_for_preferred_connection);
            string.getClass();
            return string;
        }
        String string2 = this.k.getString(R.string.offline_waiting_for_wifi);
        string2.getClass();
        return string2;
    }

    private final void v(String str) {
        this.a.a(str, 8);
        x(str);
        this.v.b();
    }

    private final void w(String str) {
        awwd awwdVar = (awwd) this.f.remove(str);
        if (awwdVar != null) {
            awwdVar.p(null);
        }
    }

    private final void x(String str) {
        this.s.remove(str);
        this.e.remove(str);
        w(str);
    }

    private final void y(Notification notification) {
        avmm avmmVar = this.v;
        if (avmmVar.a() <= 0) {
            avmmVar.c(this.u.o(new hbn(new hhn(7), 20)).ak(new hva(new hol(this, 4), 1)));
        }
        this.u.kk(notification);
    }

    private final void z(String str, int i2, Notification notification, boolean z) {
        aank aankVar = this.a;
        if (!z) {
            aankVar.d(str, i2, notification);
            return;
        }
        aankVar.c(str, i2, notification);
        this.s.remove(str);
        this.e.remove(str);
    }

    public final Bitmap a(Bitmap bitmap) {
        Context context = this.k;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        float fraction = context.getResources().getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        int iMax = Math.max(1, Math.min(height, Math.min(width, fraction > 0.0f ? (int) (width / fraction) : width)));
        Matrix matrix = new Matrix();
        float fC = twm.c(context.getResources().getDisplayMetrics(), 64) / iMax;
        matrix.setScale(fC, fC, 0.0f, 0.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, Math.max(0, (width - iMax) / 2), Math.max(0, (height - iMax) / 2), iMax, iMax, matrix, false);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    @Override // defpackage.aanl
    public final Notification b() {
        Context context = this.k;
        atr atrVarC = c("fallback");
        atrVarC.l(context.getString(R.string.offline_fallback_notification));
        atrVarC.q(R.drawable.yt_outline_download_white_24);
        atrVarC.p(0, 0, false);
        atrVarC.e(2, false);
        atrVarC.e(16, false);
        Notification notificationA = atrVarC.a();
        notificationA.getClass();
        return notificationA;
    }

    public final atr c(String str) {
        ConcurrentHashMap concurrentHashMap = this.s;
        atr atrVarK = (atr) concurrentHashMap.get(str);
        if (atrVarK == null) {
            isi isiVar = this.z;
            mbc mbcVar = this.l;
            atrVarK = isiVar.K();
            atrVarK.v(mbcVar.f().toEpochMilli());
            atrVarK.A = 1;
            atrVarK.t = "OfflineNotificationsGroup";
            vxz vxzVar = this.g;
            if (vxzVar.c(4, 45798294L, 0L) != -1 && (vxzVar.c(4, 45798294L, 0L) == 0 || concurrentHashMap.mappingCount() < vxzVar.c(4, 45798294L, 0L))) {
                concurrentHashMap.put(str, atrVarK);
            }
        }
        return atrVarK;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(awoq awoqVar) throws Throwable {
        htu htuVar;
        if (awoqVar instanceof htu) {
            htuVar = (htu) awoqVar;
            int i2 = htuVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                htuVar.c = i2 - Integer.MIN_VALUE;
            } else {
                htuVar = new htu(this, awoqVar);
            }
        } else {
            htuVar = new htu(this, awoqVar);
        }
        Object objAd = htuVar.a;
        awox awoxVar = awox.a;
        int i3 = htuVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                atqp.j(objAd);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objAd);
            }
            objAd.getClass();
            return Boolean.valueOf((((Boolean) objAd).booleanValue() || this.o.g()) ? false : true);
        }
        atqp.j(objAd);
        ListenableFuture listenableFutureN = this.x.n(this.q.e());
        htuVar.c = 1;
        objAd = awrc.ad(listenableFutureN, htuVar);
        if (objAd == awoxVar) {
            return awoxVar;
        }
        objAd.getClass();
        ListenableFuture listenableFutureA = ((htq) aguu.aw(this.k, htq.class, (affd) objAd)).f().a();
        htuVar.c = 2;
        objAd = awrc.ad(listenableFutureA, htuVar);
        if (objAd == awoxVar) {
            return awoxVar;
        }
        objAd.getClass();
        return Boolean.valueOf((((Boolean) objAd).booleanValue() || this.o.g()) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, Uri uri, int i2, boolean z, atr atrVar, awoq awoqVar) throws Throwable {
        htv htvVar;
        int i3;
        Object objJ;
        Set set;
        if (awoqVar instanceof htv) {
            htvVar = (htv) awoqVar;
            int i4 = htvVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                htvVar.f = i4 - Integer.MIN_VALUE;
            } else {
                htvVar = new htv(this, awoqVar);
            }
        } else {
            htvVar = new htv(this, awoqVar);
        }
        Object obj = htvVar.d;
        awox awoxVar = awox.a;
        int i5 = htvVar.f;
        if (i5 == 0) {
            atqp.j(obj);
            i3 = (uri == null || this.e.contains(str)) ? 0 : 1;
            if (i3 != 0) {
                htvVar.g = str;
                htvVar.h = atrVar;
                htvVar.a = i2;
                htvVar.c = z;
                htvVar.b = 1;
                htvVar.f = 1;
                awud awudVar = new awud(JniZero.q(htvVar), 1);
                awudVar.w();
                this.m.k(uri, new hua(this, str, atrVar, awudVar));
                objJ = awudVar.j();
                if (objJ == awoxVar) {
                    return awoxVar;
                }
            }
            set = this.e;
            if (set.contains(str) && z) {
                set.remove(str);
            }
            if (i3 != 0 || !this.g.l(60, 45825124L, false)) {
                Notification notificationA = atrVar.a();
                notificationA.getClass();
                z(str, i2, notificationA, z);
            }
            return awmy.a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i6 = htvVar.b;
        boolean z2 = htvVar.c;
        i2 = htvVar.a;
        atrVar = htvVar.h;
        String str2 = htvVar.g;
        atqp.j(obj);
        i3 = i6;
        str = str2;
        z = z2;
        objJ = obj;
        Notification notification = (Notification) objJ;
        if (notification != null) {
            z(str, i2, notification, z);
        }
        set = this.e;
        if (set.contains(str)) {
            set.remove(str);
        }
        if (i3 != 0) {
            Notification notificationA2 = atrVar.a();
            notificationA2.getClass();
            z(str, i2, notificationA2, z);
        } else {
            Notification notificationA3 = atrVar.a();
            notificationA3.getClass();
            z(str, i2, notificationA3, z);
        }
        return awmy.a;
    }

    public final Object f(hcg hcgVar, hte hteVar, awoq awoqVar) {
        if (hcgVar != null && hteVar.a) {
            Optional optional = hcgVar.a;
            optional.getClass();
            weh wehVar = (weh) awrc.f(optional);
            if (wehVar != null) {
                Optional optional2 = hcgVar.b;
                optional2.getClass();
                weh wehVar2 = (weh) awrc.f(optional2);
                if (wehVar2 != null) {
                    String strH = wfs.h(wehVar.b());
                    if (this.o.g() && hpb.q(wehVar2).isPresent()) {
                        Set set = this.r;
                        if (set.remove(strH) && set.isEmpty()) {
                            v("ytm_smart_downloads");
                        }
                    } else {
                        boolean z = hteVar.b;
                        String str = hcgVar.g;
                        int i2 = typ.a;
                        Intent intentS = s(strH, wehVar instanceof anjx);
                        int i3 = z ? R.drawable.ic_notification_error_small : R.drawable.yt_fill_downloaded_white_24;
                        String strC = typ.c(str);
                        Context context = this.k;
                        String string = context.getString(true != z ? R.string.notification_offline_playlist_all_tracks_downloaded : R.string.state_offline_playlist_tracks_not_downloaded_error);
                        string.getClass();
                        atr atrVarC = c(strH);
                        atrVarC.l(strC);
                        atrVarC.k(string);
                        atrVarC.j(null);
                        atrVarC.q(i3);
                        atrVarC.p(0, 0, false);
                        atrVarC.e(2, false);
                        atrVarC.e(16, true);
                        atrVarC.h = qof.b(context, strH.hashCode(), intentS, 1140850688);
                        Object objE = e(strH, A(hcgVar), 8, true, atrVarC, awoqVar);
                        if (objE == awox.a) {
                            return objE;
                        }
                    }
                }
            }
        }
        return awmy.a;
    }

    @Override // defpackage.aanl
    public final void g() {
        this.a.b();
        this.s.clear();
        for (Object obj : this.f.keySet()) {
            obj.getClass();
            w((String) obj);
        }
        this.v.b();
        this.e.clear();
        this.r.clear();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, weh] */
    public final Object h(hcg hcgVar, hte hteVar, awoq awoqVar) {
        htw htwVar;
        hts htsVar;
        String str;
        if (awoqVar instanceof htw) {
            htwVar = (htw) awoqVar;
            int i2 = htwVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                htwVar.c = i2 - Integer.MIN_VALUE;
            } else {
                htwVar = new htw(this, awoqVar);
            }
        } else {
            htwVar = new htw(this, awoqVar);
        }
        htw htwVar2 = htwVar;
        Object objD = htwVar2.a;
        Object obj = awox.a;
        int i3 = htwVar2.c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objD);
                return awmy.a;
            }
            str = htwVar2.d;
            hteVar = htwVar2.e;
            atqp.j(objD);
            boolean zBooleanValue = ((Boolean) objD).booleanValue();
            Set set = this.r;
            str.getClass();
            set.add(str);
            y(k(hteVar.c, zBooleanValue));
            return awmy.a;
        }
        atqp.j(objD);
        if (hcgVar != null && hteVar != null && !hteVar.a) {
            Optional optional = hcgVar.a;
            if (optional.isPresent()) {
                Optional optional2 = hcgVar.b;
                if (optional2.isPresent()) {
                    ?? r15 = optional.get();
                    weh wehVar = (weh) optional2.get();
                    String strH = wfs.h(r15.b());
                    if (this.o.g() && hpb.q(wehVar).isPresent()) {
                        htwVar2.e = hteVar;
                        htwVar2.d = strH;
                        htwVar2.c = 1;
                        objD = d(htwVar2);
                        if (objD == obj) {
                            return obj;
                        }
                        str = strH;
                        boolean zBooleanValue2 = ((Boolean) objD).booleanValue();
                        Set set2 = this.r;
                        str.getClass();
                        set2.add(str);
                        y(k(hteVar.c, zBooleanValue2));
                        return awmy.a;
                    }
                    int i4 = hteVar.e;
                    int i5 = hteVar.d;
                    int i6 = hteVar.f;
                    String str2 = hcgVar.g;
                    int i7 = typ.a;
                    Intent intentS = s(strH, r15 instanceof anjx);
                    boolean z = hteVar.c;
                    if (!this.w.i()) {
                        String string = this.k.getString(R.string.offline_waiting_for_network);
                        string.getClass();
                        htsVar = new hts(string, false, true);
                    } else if (z) {
                        htsVar = new hts(u(), false, true);
                    } else {
                        String quantityString = this.k.getResources().getQuantityString(R.plurals.notification_offline_playlist_progress_track_count, i4, Integer.valueOf(i5), Integer.valueOf(i4));
                        quantityString.getClass();
                        htsVar = new hts(quantityString, true, false);
                    }
                    CharSequence charSequenceC = typ.c(str2);
                    atr atrVarC = c(strH);
                    atrVarC.l(charSequenceC);
                    Context context = this.k;
                    atrVarC.j(context.getString(R.string.percent, Integer.valueOf(i6)));
                    atrVarC.k(htsVar.a);
                    atrVarC.q(R.drawable.yt_outline_download_white_24);
                    atrVarC.p(100, i6, false);
                    boolean z2 = htsVar.b;
                    atrVarC.e(2, z2);
                    atrVarC.e(16, htsVar.c);
                    atrVarC.h = qof.b(context, strH.hashCode(), intentS, 201326592);
                    if (z2) {
                        atrVarC.G = j.toMillis();
                    }
                    Uri uriA = A(hcgVar);
                    htwVar2.c = 2;
                    if (e(strH, uriA, 8, false, atrVarC, htwVar2) == obj) {
                        return obj;
                    }
                }
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public final Object i(hth hthVar, awoq awoqVar) {
        int i2;
        String string;
        Object objF;
        anyx anyxVar;
        Object objE;
        if (!hthVar.a().isEmpty()) {
            Object objF2 = awrc.f(hthVar.b());
            anyo anyoVar = objF2 instanceof anyo ? (anyo) objF2 : null;
            if (anyoVar == null || !anyoVar.e()) {
                hpd hpdVar = this.c;
                boolean zQ = hpdVar.q(hthVar);
                if (hpdVar.s(hthVar)) {
                    if (true != zQ) {
                        i2 = R.drawable.yt_fill_downloaded_white_24;
                    } else {
                        i2 = R.drawable.ic_notification_error_small;
                    }
                    if (zQ) {
                        string = hpdVar.n(hthVar);
                    } else {
                        string = this.k.getString(R.string.notification_offline_video_completed);
                    }
                    string.getClass();
                    objF = awrc.f(hthVar.a());
                    if (objF instanceof anyx) {
                        anyxVar = (anyx) objF;
                    } else {
                        anyxVar = null;
                    }
                    if (anyxVar != null) {
                        String strH = wfs.h(anyxVar.b());
                        atr atrVarC = c(strH);
                        atrVarC.k(string);
                        atrVarC.l(anyxVar.getTitle());
                        atrVarC.j(null);
                        atrVarC.q(i2);
                        atrVarC.p(0, 0, false);
                        atrVarC.e(2, false);
                        atrVarC.e(16, true);
                        atrVarC.h = qof.b(this.k, strH.hashCode(), t(anyxVar), 1140850688);
                        objE = e(strH, B(anyxVar), 7, true, atrVarC, awoqVar);
                        if (objE == awox.a) {
                            return objE;
                        }
                    }
                } else if (zQ) {
                    zQ = true;
                    if (true != zQ) {
                        i2 = R.drawable.yt_fill_downloaded_white_24;
                    } else {
                        i2 = R.drawable.ic_notification_error_small;
                    }
                    if (zQ) {
                        string = hpdVar.n(hthVar);
                    } else {
                        string = this.k.getString(R.string.notification_offline_video_completed);
                    }
                    string.getClass();
                    objF = awrc.f(hthVar.a());
                    if (objF instanceof anyx) {
                        anyxVar = (anyx) objF;
                    } else {
                        anyxVar = null;
                    }
                    if (anyxVar != null) {
                        String strH2 = wfs.h(anyxVar.b());
                        atr atrVarC2 = c(strH2);
                        atrVarC2.k(string);
                        atrVarC2.l(anyxVar.getTitle());
                        atrVarC2.j(null);
                        atrVarC2.q(i2);
                        atrVarC2.p(0, 0, false);
                        atrVarC2.e(2, false);
                        atrVarC2.e(16, true);
                        atrVarC2.h = qof.b(this.k, strH2.hashCode(), t(anyxVar), 1140850688);
                        objE = e(strH2, B(anyxVar), 7, true, atrVarC2, awoqVar);
                        if (objE == awox.a) {
                            return objE;
                        }
                    }
                }
            } else {
                Set set = this.r;
                if (set.remove(wfs.h(anyoVar.b())) && set.isEmpty()) {
                    v("ytm_smart_downloads");
                }
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final Object j(hth hthVar, awoq awoqVar) {
        htx htxVar;
        hts htsVar;
        Object obj;
        hth hthVar2 = hthVar;
        if (awoqVar instanceof htx) {
            htxVar = (htx) awoqVar;
            int i2 = htxVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                htxVar.d = i2 - Integer.MIN_VALUE;
            } else {
                htxVar = new htx(this, awoqVar);
            }
        } else {
            htxVar = new htx(this, awoqVar);
        }
        htx htxVar2 = htxVar;
        Object objD = htxVar2.b;
        Object obj2 = awox.a;
        int i3 = htxVar2.d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objD);
                return awmy.a;
            }
            Object obj3 = htxVar2.a;
            atqp.j(objD);
            obj = obj3;
            obj = hthVar2;
            y(k(this.c.c((hth) obj) == aamp.TRANSFER_PENDING_WIFI, ((Boolean) objD).booleanValue()));
            return awmy.a;
        }
        atqp.j(objD);
        Object objF = awrc.f(hthVar2.a());
        anyx anyxVar = objF instanceof anyx ? (anyx) objF : null;
        if (anyxVar != null) {
            Object objF2 = awrc.f(hthVar2.b());
            anyo anyoVar = objF2 instanceof anyo ? (anyo) objF2 : null;
            if (anyoVar != null) {
                String strH = wfs.h(anyxVar.b());
                if (anyoVar.e()) {
                    this.r.add(strH);
                    htxVar2.a = hthVar2;
                    htxVar2.d = 1;
                    objD = d(htxVar2);
                    if (objD == obj2) {
                        obj = hthVar2;
                        return obj2;
                    }
                    obj = hthVar2;
                    y(k(this.c.c((hth) obj) == aamp.TRANSFER_PENDING_WIFI, ((Boolean) objD).booleanValue()));
                    return awmy.a;
                }
                aohq aohqVar = (aohq) awrc.f(hthVar2.d());
                if (!this.w.i()) {
                    String string = this.k.getString(R.string.offline_waiting_for_network);
                    string.getClass();
                    htsVar = new hts(string, false, true);
                } else if (this.c.c(hthVar2) == aamp.TRANSFER_PENDING_WIFI) {
                    htsVar = new hts(u(), false, true);
                } else if (aohqVar != null) {
                    List streamsProgressModels = aohqVar.getStreamsProgressModels();
                    streamsProgressModels.getClass();
                    agke agkeVar = (agke) streamsProgressModels;
                    agqs agqsVarListIterator = agkeVar.listIterator(0);
                    long jLongValue = 0;
                    long jLongValue2 = 0;
                    while (agqsVarListIterator.hasNext()) {
                        jLongValue2 += ((aqdo) agqsVarListIterator.next()).b().longValue();
                    }
                    agqs agqsVarListIterator2 = agkeVar.listIterator(0);
                    while (agqsVarListIterator2.hasNext()) {
                        jLongValue += ((aqdo) agqsVarListIterator2.next()).a().longValue();
                    }
                    Context context = this.k;
                    htsVar = new hts(typ.g(context.getResources(), jLongValue) + " / " + typ.g(context.getResources(), jLongValue2), true, false);
                }
                int iA = hpd.a(hthVar2.d());
                atr atrVarC = c(strH);
                atrVarC.l(anyxVar.getTitle());
                Context context2 = this.k;
                atrVarC.j(context2.getString(R.string.percent, new Integer(iA)));
                atrVarC.k(htsVar.a);
                atrVarC.q(R.drawable.yt_outline_download_white_24);
                atrVarC.p(100, iA, false);
                boolean z = htsVar.b;
                atrVarC.e(2, z);
                atrVarC.e(16, htsVar.c);
                atrVarC.h = qof.b(context2, strH.hashCode(), t(anyxVar), 201326592);
                if (z) {
                    atrVarC.G = j.toMillis();
                }
                Uri uriB = B(anyxVar);
                htxVar2.d = 2;
                if (e(strH, uriB, 7, false, atrVarC, htxVar2) == obj2) {
                    return obj2;
                }
            }
        }
        return awmy.a;
    }

    @Override // defpackage.aanl
    public final void l(aamw aamwVar) {
        C(aamwVar, new hty(this, 1), new htz(this, 1));
    }

    @Override // defpackage.aanl
    public final void m(aamw aamwVar) {
        C(aamwVar, new hty(this, 0), new htz(this, 0));
    }

    @Override // defpackage.aanl
    public final void n(aamw aamwVar) {
        long j2 = aarq.a;
        aamb aambVar = aamwVar.f;
        if (aambVar.b("transfer_type", 0) == 4) {
            String strF = aambVar.f("playlist_id");
            if (strF != null && strF.length() != 0) {
                v(strF);
                return;
            }
            String strE = aarq.e(aambVar);
            this.a.a(strE, 7);
            x(strE);
        }
    }

    @Override // defpackage.aanl
    public final void o(String str) {
        atr atrVar = (atr) this.s.get(str);
        if (atrVar != null) {
            atrVar.v(this.l.f().toEpochMilli());
        }
    }

    @Override // defpackage.aanl
    public final void q(aamw aamwVar) {
        vxz vxzVar = this.g;
        Instant instantF = this.l.f();
        if (Duration.between(this.t, instantF).compareTo((Duration) atqq.g(i, ahng.C(vxzVar.c(3, 45797004L, 250L)))) >= 0) {
            if (!this.a.a || aamwVar.b == aqpc.TRANSFER_STATE_TRANSFERRING) {
                instantF.getClass();
                this.t = instantF;
                C(aamwVar, new hty(this, 2), new htz(this, 2));
            }
        }
    }

    @Override // defpackage.aanl
    public final void r() {
    }
}
