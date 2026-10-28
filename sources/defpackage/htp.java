package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class htp implements aanl {
    public static final long a;
    public final Context b;
    public final aank c;
    public final aauk d;
    public final hnq e;
    public final hpd f;
    public final hpb g;
    public final Executor h;
    public final afkb l;
    public final tfq m;
    public final vxz n;
    public final abfv o;
    private final mbc p;
    private final adhv q;
    private final hpy r;
    private final awkv u;
    private final isi w;
    public final Set i = new afx(0);
    public final Set j = new afx(0);
    private final ConcurrentHashMap s = new ConcurrentHashMap();
    public final Map k = new ConcurrentHashMap();
    private long t = 0;
    private final avmm v = new avmm();

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 300000L;
    }

    public htp(Context context, mbc mbcVar, tfq tfqVar, isi isiVar, aank aankVar, adhv adhvVar, aauk aaukVar, abfv abfvVar, hpy hpyVar, hnq hnqVar, vxz vxzVar, hpd hpdVar, hpb hpbVar, Executor executor, syn synVar, zwb zwbVar) {
        this.b = context;
        this.p = mbcVar;
        this.q = adhvVar;
        this.m = tfqVar;
        this.c = aankVar;
        this.w = isiVar;
        this.d = aaukVar;
        this.o = abfvVar;
        this.r = hpyVar;
        this.e = hnqVar;
        this.n = vxzVar;
        this.f = hpdVar;
        this.g = hpbVar;
        this.h = executor;
        afng afngVar = new afng(this, synVar, zwbVar, 1);
        long j = afwl.a;
        this.l = new afkb(new afwh(afty.c(false), afngVar, 0), executor);
        this.u = new awku().aI();
    }

    public static final Optional p(anyx anyxVar) {
        Optional optionalOfNullable = Optional.ofNullable(new abuz(anyxVar.getThumbnailDetails()).j(240));
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((wgg) optionalOfNullable.get()).a()) : optionalOfNullable;
    }

    public static final Optional s(hcg hcgVar) {
        Optional optionalOfNullable = Optional.ofNullable(new abuz(hcgVar.h).j(480));
        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(((wgg) optionalOfNullable.get()).a()) : optionalOfNullable;
    }

    private final Intent t(ajwo ajwoVar) {
        Intent intent = new Intent("com.google.android.youtube.music.action.navigate");
        Context context = this.b;
        Intent intentAddFlags = intent.setClassName(context, true != txz.g(context) ? "com.google.android.apps.youtube.music.activities.InternalMusicActivity" : "com.google.android.apps.youtube.music.wear.compose.activity.main.InternalWearMainActivityCompose").addFlags(67108864);
        zik.bd(intentAddFlags, ajwoVar, null, false);
        return intentAddFlags;
    }

    private final void u(String str) {
        ListenableFuture listenableFuture = (ListenableFuture) this.k.remove(str);
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
    }

    private final void v(String str) {
        this.s.remove(str);
        this.i.remove(str);
        u(str);
    }

    private final void w(aamw aamwVar, hto htoVar, htn htnVar) {
        htp htpVar;
        afxd afxdVarG;
        long j = aarq.a;
        aamb aambVar = aamwVar.f;
        if (aambVar.b("transfer_type", 0) == 4) {
            String strF = aambVar.f("playlist_id");
            if (TextUtils.isEmpty(strF)) {
                htpVar = this;
                strF = aarq.e(aambVar);
                afxdVarG = afxd.f(htpVar.f.g(strF)).g(new hrk(htoVar, 15), htpVar.h);
            } else if (this.k.containsKey(strF)) {
                afxdVarG = null;
                htpVar = this;
            } else {
                htpVar = this;
                afxdVarG = afxd.f(hpb.k(this.r, strF, false)).h(new hlk(htpVar, strF, htnVar, 3, null), htpVar.h);
            }
            if (afxdVarG != null) {
                ListenableFuture listenableFuture = (ListenableFuture) htpVar.k.put(strF, afxdVarG);
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                }
                afxdVarG.addListener(new gwb(htpVar, strF, afxdVarG, 7), htpVar.h);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    public final Notification a(boolean z, boolean z2) {
        String string;
        boolean z3;
        boolean z4;
        atr atrVarF;
        if (this.m.i()) {
            if (z) {
                string = (this.d.p() && this.o.z()) ? this.b.getString(R.string.waiting_for_preferred_connection) : this.b.getString(R.string.offline_waiting_for_wifi);
            } else {
                string = this.b.getString(true != z2 ? R.string.notification_smart_downloads_updating : R.string.notification_recent_music_updating);
                z3 = false;
                z4 = true;
            }
            atrVarF = f("ytm_smart_downloads");
            atrVarF.l(string);
            atrVarF.q(R.drawable.yt_fill_sparkle_white_24);
            atrVarF.p(0, 0, true);
            atrVarF.e(2, z4);
            atrVarF.e(16, z3);
            atrVarF.h = qof.b(this.b, 402159720, t(vxh.b("FEmusic_offline")), 201326592);
            if (z4) {
                atrVarF.G = a;
            }
            return atrVarF.a();
        }
        string = this.b.getString(R.string.offline_waiting_for_network);
        z4 = false;
        z3 = true;
        atrVarF = f("ytm_smart_downloads");
        atrVarF.l(string);
        atrVarF.q(R.drawable.yt_fill_sparkle_white_24);
        atrVarF.p(0, 0, true);
        atrVarF.e(2, z4);
        atrVarF.e(16, z3);
        atrVarF.h = qof.b(this.b, 402159720, t(vxh.b("FEmusic_offline")), 201326592);
        if (z4) {
            atrVarF.G = a;
        }
        return atrVarF.a();
    }

    @Override // defpackage.aanl
    public final Notification b() {
        Context context = this.b;
        atr atrVarF = f("fallback");
        atrVarF.l(context.getString(R.string.offline_fallback_notification));
        atrVarF.q(R.drawable.yt_outline_download_white_24);
        atrVarF.p(0, 0, false);
        atrVarF.e(2, false);
        atrVarF.e(16, false);
        return atrVarF.a();
    }

    public final Intent c(String str, boolean z) {
        return t(fhz.T(str, z));
    }

    public final Intent d(anyx anyxVar) {
        return t(vxh.b(true != igs.c(anyxVar.getMusicVideoType()) ? "FEmusic_offline_songs" : "FEoffline_nma_tracks"));
    }

    public final Bitmap e(Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Context context = this.b;
        float fraction = width / context.getResources().getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        float fC = twm.c(context.getResources().getDisplayMetrics(), 64);
        Matrix matrix = new Matrix();
        int i = (int) fraction;
        float f = fC / i;
        matrix.setScale(f, f, 0.0f, 0.0f);
        return Bitmap.createBitmap(bitmap, (width - i) / 2, (height - i) / 2, i, i, matrix, false);
    }

    public final atr f(String str) {
        ConcurrentHashMap concurrentHashMap = this.s;
        if (concurrentHashMap.containsKey(str)) {
            return (atr) concurrentHashMap.get(str);
        }
        isi isiVar = this.w;
        mbc mbcVar = this.p;
        atr atrVarK = isiVar.K();
        atrVarK.v(mbcVar.f().toEpochMilli());
        atrVarK.A = 1;
        atrVarK.t = "OfflineNotificationsGroup";
        vxz vxzVar = this.n;
        if (vxzVar.c(4, 45798294L, 0L) == -1) {
            return atrVarK;
        }
        if (vxzVar.c(4, 45798294L, 0L) != 0 && concurrentHashMap.mappingCount() >= vxzVar.c(4, 45798294L, 0L)) {
            return atrVarK;
        }
        concurrentHashMap.put(str, atrVarK);
        return atrVarK;
    }

    @Override // defpackage.aanl
    public final void g() {
        this.c.b();
        this.s.clear();
        Iterator it = this.k.keySet().iterator();
        while (it.hasNext()) {
            u((String) it.next());
        }
        this.v.b();
        this.i.clear();
        this.j.clear();
    }

    public final void h(String str) {
        this.c.a(str, 8);
        v(str);
        this.v.b();
    }

    public final void i(String str, Optional optional, int i, boolean z, atr atrVar) {
        htp htpVar;
        String str2;
        boolean z2;
        atr atrVar2;
        boolean z3 = optional.isPresent() && !this.i.contains(str);
        if (z3) {
            htpVar = this;
            str2 = str;
            z2 = z;
            atrVar2 = atrVar;
            this.q.k((Uri) optional.get(), new htl(htpVar, str2, atrVar2, new htk(this, str, i, z), z2));
        } else {
            htpVar = this;
            str2 = str;
            z2 = z;
            atrVar2 = atrVar;
        }
        Set set = htpVar.i;
        if (set.contains(str2) && z2) {
            set.remove(str2);
        }
        if (z3 && htpVar.n.l(60, 45825124L, false)) {
            return;
        }
        htpVar.k(str2, i, atrVar2.a(), z2);
    }

    public final void j(Notification notification) {
        avmm avmmVar = this.v;
        if (avmmVar.a() <= 0) {
            avmmVar.c(this.u.o(new hpr(6)).ak(new hib(this, 20)));
        }
        this.u.kk(notification);
    }

    public final void k(String str, int i, Notification notification, boolean z) {
        aank aankVar = this.c;
        if (!z) {
            aankVar.d(str, i, notification);
            return;
        }
        aankVar.c(str, i, notification);
        this.s.remove(str);
        this.i.remove(str);
    }

    @Override // defpackage.aanl
    public final void l(aamw aamwVar) {
        int i = 1;
        w(aamwVar, new hti(this, i), new htj(this, i));
    }

    @Override // defpackage.aanl
    public final void m(aamw aamwVar) {
        int i = 1;
        w(aamwVar, new hti(this, i), new htj(this, i));
    }

    @Override // defpackage.aanl
    public final void n(aamw aamwVar) {
        long j = aarq.a;
        aamb aambVar = aamwVar.f;
        if (aambVar.b("transfer_type", 0) == 4) {
            String strF = aambVar.f("playlist_id");
            if (!TextUtils.isEmpty(strF)) {
                h(strF);
                return;
            }
            String strE = aarq.e(aambVar);
            this.c.a(strE, 7);
            v(strE);
        }
    }

    @Override // defpackage.aanl
    public final void o(String str) {
        atr atrVar;
        ConcurrentHashMap concurrentHashMap = this.s;
        if (!concurrentHashMap.containsKey(str) || (atrVar = (atr) concurrentHashMap.get(str)) == null) {
            return;
        }
        atrVar.v(this.p.f().toEpochMilli());
    }

    @Override // defpackage.aanl
    public final void q(aamw aamwVar) {
        long epochMilli = this.p.f().toEpochMilli();
        if (epochMilli - this.t >= Math.max(250L, this.n.c(3, 45797004L, 250L))) {
            if (!this.c.a || aamwVar.b == aqpc.TRANSFER_STATE_TRANSFERRING) {
                this.t = epochMilli;
                int i = 0;
                w(aamwVar, new hti(this, i), new htj(this, i));
            }
        }
    }

    @Override // defpackage.aanl
    public final void r() {
    }
}
