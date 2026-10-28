package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.car.app.model.Alert;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.libraries.youtube.media.player.exo2.platypus.ExecutorImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackNetFetchFactory;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yza {
    public final ahey a;
    public final ahey b;
    public final avmb c;
    public final ScheduledExecutorService d;
    public final yup e;
    public final yho f;
    public final PlaybackNetFetchFactory g;
    public final zfs h;
    public final Context i;
    public final xeu j;
    public final mbc k;
    public final yoq l;
    public final cgw m;
    public final ExecutorImpl n;
    public final zht o;
    public final aunn p;
    public final yha q;
    public final wjr r;

    public yza(ahey aheyVar, ahey aheyVar2, avmb avmbVar, ScheduledExecutorService scheduledExecutorService, yup yupVar, yha yhaVar, yho yhoVar, PlaybackNetFetchFactory playbackNetFetchFactory, Context context, xeu xeuVar, wjr wjrVar, zht zhtVar, zfs zfsVar, mbc mbcVar, yoq yoqVar, aunn aunnVar, ExecutorImpl executorImpl) {
        this.a = aheyVar;
        this.b = aheyVar2;
        this.c = avmbVar;
        this.d = scheduledExecutorService;
        this.e = yupVar;
        this.q = yhaVar;
        this.f = yhoVar;
        this.g = playbackNetFetchFactory;
        this.i = context;
        this.j = xeuVar;
        this.r = wjrVar;
        this.o = zhtVar;
        this.h = zfsVar;
        this.k = mbcVar;
        this.l = yoqVar;
        this.p = aunnVar;
        this.n = executorImpl;
        this.m = new cgv(context);
    }

    public static final chl f(zjr zjrVar) {
        vxz vxzVar = zjrVar.i;
        return vxzVar.m(231, 45707011L) ? new chl(vxzVar.d(28, 45707004L), (float) vxzVar.b(1, 45707005L), vxzVar.d(29, 45707006L), (int) vxzVar.d(30, 45707007L), (short) vxzVar.d(31, 45707008L)) : new chl(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    final ExoPlayer a(yyv yyvVar, ccw ccwVar, int i) {
        zjr zjrVar = yyvVar.h.d;
        if (zjrVar.bH()) {
            bsc.b(1);
        }
        if (zjrVar.by()) {
            bsc.b(7);
        }
        Context context = this.i;
        yzz yzzVar = yyvVar.r;
        cbt cbtVar = new cbt(context, yyvVar, cnl.b, yzzVar, ccwVar, crg.i(context), yyvVar.R);
        cbtVar.d(Looper.getMainLooper());
        cbtVar.g(zjrVar.B());
        boolean z = cbtVar.z;
        if (z) {
            throw new IllegalStateException();
        }
        if (z) {
            throw new IllegalStateException();
        }
        cbtVar.k = 0;
        vxz vxzVar = zjrVar.i;
        long jD = vxzVar.d(34, 45732540L);
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        int i3 = jD > 0 ? (int) jD : Integer.MAX_VALUE;
        if (cbtVar.z) {
            throw new IllegalStateException();
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException();
        }
        cbtVar.u = i3;
        long jD2 = vxzVar.d(35, 45732541L);
        cbtVar.i(jD2 > 0 ? (int) jD2 : Integer.MAX_VALUE);
        long jD3 = vxzVar.d(36, 45732542L);
        cbtVar.j(jD3 > 0 ? (int) jD3 : Integer.MAX_VALUE);
        long jD4 = vxzVar.d(37, 45732543L);
        if (jD4 > 0) {
            i2 = (int) jD4;
        }
        if (cbtVar.z) {
            throw new IllegalStateException();
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException();
        }
        cbtVar.x = i2;
        if (zjrVar.cX()) {
            cbtVar.b(-9223372036854775807L);
        } else if (zjrVar.cY()) {
            cbtVar.b(zjrVar.C());
        }
        if (zjrVar.y) {
            if (cbtVar.z) {
                throw new IllegalStateException();
            }
            cbtVar.A = true;
        }
        vxz vxzVar2 = zjrVar.j;
        if (vxzVar2.m(181, 45617901L)) {
            cbtVar.k(2);
        } else if (vxzVar2.m(180, 45617900L)) {
            cbtVar.k(1);
        }
        if (zjrVar.ei() && i != 0) {
            brq brqVar = new brq(2, i);
            if (cbtVar.z) {
                throw new IllegalStateException();
            }
            cbtVar.l = brqVar;
        }
        if (vxzVar2.m(298, 45722325L)) {
            yzzVar.i();
        }
        return cbtVar.a();
    }

    final yoc b(zcf zcfVar) {
        return this.l.d(true, zcfVar.y, zcfVar.a, null);
    }

    final zdd c(yyv yyvVar, zcf zcfVar) {
        zin zinVar = yyvVar.e;
        wiu wiuVar = zcfVar.y;
        yyx yyxVar = new yyx(this, zinVar, zcfVar.y, zcfVar);
        aoqd aoqdVar = wiuVar.d;
        akwm akwmVar = aoqdVar.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i = akwmVar.q;
        if (i == 0) {
            i = 2;
        }
        int i2 = i;
        akwm akwmVar2 = aoqdVar.f;
        if (akwmVar2 == null) {
            akwmVar2 = akwm.b;
        }
        yye yyeVar = yyvVar.h;
        int i3 = akwmVar2.p;
        return new zdd(yyxVar, yyeVar.d, i2, i3 == 0 ? 1 : i3, new xxj[]{new xxj(yyvVar.g)}, yyeVar.s, zcfVar.Z);
    }

    final zfc d(yyv yyvVar, wiu wiuVar, wja wjaVar, ywn ywnVar, boolean z) {
        if (!wjaVar.B()) {
            return zfc.a;
        }
        yye yyeVar = yyvVar.h;
        return new zfc(wiuVar, yyeVar.d, wjaVar, ywnVar, z, new tar(this.k, 16));
    }

    final yop e(yyv yyvVar, ywk ywkVar) {
        yye yyeVar = yyvVar.h;
        zjr zjrVar = yyeVar.d;
        wiu wiuVar = ywkVar.i;
        wja wjaVar = ywkVar.d;
        boolean z = !zjrVar.ew() || yyeVar.b.g();
        yoc yocVarD = this.l.d(true, wiuVar, ywkVar.h, null);
        Integer num = ywkVar.r;
        if (zjrVar.bJ() && num != null) {
            yocVarD = yocVarD.a(num.intValue());
        }
        yoc yocVar = yocVarD;
        if (zjrVar.eJ()) {
            StringBuilder sb = new StringBuilder();
            sb.append("f;");
            sb.append(ywkVar.h);
            zjo.b(wjaVar, zjrVar, wiuVar, sb);
            if (yyeVar.m != null) {
                yyeVar.m.Z.w("sac", sb.toString());
            }
        }
        if (zjrVar.eu()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fsw;");
            sb2.append(ywkVar.h);
            zjo.c(wjaVar, zjrVar, wiuVar, sb2);
            if (yyeVar.m != null) {
                yyeVar.m.Z.w("sac", sb2.toString());
            }
        }
        nph nphVar = new nph(yyvVar, ywkVar, 2);
        List list = wjaVar.t;
        List list2 = wjaVar.w;
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesA = zjo.a(wiuVar, zjrVar, yno.ct(wjaVar), z, zjb.c, zjb.a, zjb.b);
        vxz vxzVar = zjrVar.l;
        vxz vxzVar2 = zjrVar.i;
        vxz vxzVar3 = zjrVar.j;
        return yop.n(yocVar, wiuVar, nphVar, list, list2, null, mediaCapabilitiesOuterClass$MediaCapabilitiesA, vxzVar.m(32, 45673827L), false, false, vxzVar2.m(346, 45757343L), vxzVar3.m(376, 45823374L), vxzVar3.m(393, 45849131L), vxzVar3.m(392, 45846823L));
    }

    final zah g(ahey aheyVar, aaqc aaqcVar, zjr zjrVar) {
        HashMap map = new HashMap();
        if (!zjrVar.az()) {
            map.put("aid", tym.I(this.i));
        }
        return new zah(aaqcVar, map, this.i, aheyVar, this.j, zjrVar);
    }
}
