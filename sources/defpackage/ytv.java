package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.car.app.model.Alert;
import com.google.android.libraries.youtube.media.interfaces.RestartPrefetchEvaluationSource;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ytv implements yob {
    public static final ytt b = new ytt(0);
    public final zew c;
    public final zei d;
    public final zjr e;
    public final ConcurrentMap f;
    public volatile zia g;
    public final yoq h;
    public boolean i;
    public ywn j;
    private final Handler k;
    private int l;
    private final zgm m;
    private final yha n;
    private final spa o;

    public ytv(zew zewVar, zei zeiVar, zjr zjrVar, yha yhaVar, yoq yoqVar, zgm zgmVar) {
        spa spaVar = new spa();
        this.o = spaVar;
        this.k = new Handler(Looper.getMainLooper());
        this.f = new ConcurrentHashMap();
        this.j = ywn.b;
        zkf.d(zewVar);
        this.c = zewVar;
        zkf.d(zeiVar);
        this.d = zeiVar;
        this.n = yhaVar;
        this.e = zjrVar;
        this.h = yoqVar;
        this.m = zgmVar;
        spaVar.a = zjrVar.R().h;
        zkf.a = !zjrVar.dt();
        wgs.a = zjrVar.cP();
        this.g = zia.a;
    }

    private final void K() {
        boolean zBR = this.e.bR();
        zew zewVar = this.c;
        if (zBR) {
            zewVar.w(true);
        } else {
            zewVar.w(false);
        }
    }

    private final void L(ywk ywkVar) {
        ywn ywnVar = ywkVar.a;
        int i = this.l;
        this.l = i + 1;
        ywnVar.l("vc", "i." + i);
        ywnVar.l("flags", Integer.toString(ywkVar.n));
        wja wjaVar = ywkVar.d;
        alvw alvwVar = wjaVar.e;
        if ((alvwVar.f || alvwVar.g) && wjaVar.v.isEmpty()) {
            StringBuilder sb = new StringBuilder(true != alvwVar.f ? "post" : "live");
            for (wgs wgsVar : wjaVar.r) {
                sb.append('.');
                sb.append(wgsVar.e());
            }
            ywnVar.l("af", sb.toString());
        }
    }

    public final void A(int i, arfb arfbVar, agkz agkzVar, String str) {
        if (D("setVideoQuality", new cdf(this, i, arfbVar, agkzVar, str, 7))) {
            this.e.u.j(str, arfbVar);
            yoq yoqVar = this.h;
            wgs wgsVarF = f();
            int iCompare = -2;
            if (wgsVarF != null && !wgs.K(i)) {
                iCompare = Integer.compare(i, wgsVarF.f());
            }
            yoqVar.b.i(i, iCompare, yoqVar.c.f().toEpochMilli(), str, agkzVar);
            yoqVar.i.a(Integer.valueOf(i));
            this.c.E();
        }
    }

    public final void B(arfb arfbVar, String str) {
        A(-2, arfbVar, agpr.a, str);
    }

    public final void C(float f) {
        float fZ = tym.z(f, 0.0f, 1.0f);
        if (D("setVolume", new ywe(this, fZ, 1))) {
            this.c.O(fZ);
        }
    }

    public final boolean D(String str, Runnable runnable) {
        taq.d();
        if (((AtomicInteger) this.o.b).get() <= 0) {
            return true;
        }
        zhr.b(zhq.MLPLAYER, "MedialibPlayer.%s() called from event callback, delaying.", str);
        this.k.post(runnable);
        return false;
    }

    public final boolean E() {
        taq.d();
        return this.c.W();
    }

    @Deprecated
    public final void F(yrr yrrVar) {
        if (this.e.aC()) {
            return;
        }
        Optional optionalOfNullable = Optional.ofNullable(yrrVar.j);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Long.valueOf(((Duration) optionalOfNullable.get()).toMillis()));
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((Long) optionalOfNullable.get()).toString());
        }
        String str = (String) optionalOfNullable.orElse("null");
        zhr.b(zhq.MLPLAYER, "MedialibPlayer.loadOnesieVideo(cpn=%s positionMs=%s audioOnly=%s)", yrrVar.b, str, Boolean.valueOf(yrrVar.k));
    }

    public final void G(int i) {
        if (D("blockingStopVideo", new rir(this, i, 10))) {
            zhr.b(zhq.MLPLAYER, "MedialibPlayer.blockingStopVideo(),  %s", acfz.aR(i));
            this.c.ab(i);
            this.i = false;
            this.e.E.b();
        }
    }

    public final void H(int i) {
        if (D("pauseVideo", new rir(this, i, 8))) {
            zhr.b(zhq.MLPLAYER, "MedialibPlayer.pauseVideo(), %s", acfz.aR(i));
            this.c.Z(i);
        }
    }

    public final void I(int i) {
        if (D("stopVideo", new rir(this, i, 9))) {
            zhr.b(zhq.MLPLAYER, "MedialibPlayer.stopVideo(), %s", acfz.aR(i));
            this.c.aa(true, i);
            this.i = false;
            this.e.E.b();
        }
    }

    public final void J(acca accaVar) {
        String str = accaVar != null ? accaVar.n : "null";
        if (!D("selectedCaptionTrackDidChange", new xoy(this, accaVar, 19))) {
            this.j.w("ctscd", "track:".concat(String.valueOf(str)));
        } else {
            this.c.ac(accaVar);
            this.j.w("ctscrbm", "track:".concat(String.valueOf(str)));
        }
    }

    @Override // defpackage.yob
    public final yod a(wja wjaVar, wiu wiuVar, yoc yocVar) {
        zkf.d(wjaVar);
        zkf.d(wiuVar);
        return this.c.m(wjaVar, wiuVar, yocVar.c(32), yocVar, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.yob
    public final yod b(wja wjaVar, wiu wiuVar, boolean z, yoc yocVar, int i) {
        zkf.d(wjaVar);
        zkf.d(wiuVar);
        return this.c.m(wjaVar, wiuVar, z, yocVar, i);
    }

    public final float c() {
        taq.d();
        return this.c.a();
    }

    public final long d(wgs wgsVar, wgs wgsVar2, long j, boolean z) {
        yfq yfqVarA = wgsVar != null ? this.n.a(wgsVar, TimeUnit.MILLISECONDS.toMicros(j)) : null;
        if (!z) {
            yfq yfqVarA2 = wgsVar2 != null ? this.n.a(wgsVar2, TimeUnit.MILLISECONDS.toMicros(j)) : null;
            if (wgsVar2 != null && wgsVar2.aa()) {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                return yfqVarA2.c / 1000;
            }
            if (yfqVarA != null && yfqVarA2 != null) {
                long jMin = Math.min(yfqVarA.c, yfqVarA2.c);
                if (jMin > 0) {
                    TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                    return jMin / 1000;
                }
            }
        } else if (yfqVarA != null) {
            TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
            return yfqVarA.c / 1000;
        }
        return -1L;
    }

    public final wgs e() {
        taq.d();
        return this.c.k();
    }

    public final wgs f() {
        taq.d();
        return this.c.l();
    }

    public final ytt g(wja wjaVar, wiu wiuVar) {
        zkf.d(wjaVar);
        zkf.d(wiuVar);
        return new ytt(this.c.b(wjaVar, wiuVar));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r1.h == (-1)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zia h(java.lang.String r15) {
        /*
            r14 = this;
            defpackage.taq.d()
            if (r15 == 0) goto L64
            zjr r0 = r14.e
            boolean r0 = r0.aV()
            if (r0 == 0) goto L64
            zew r0 = r14.c
            zia r1 = r0.p(r15)
            zia r2 = defpackage.zia.a
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L62
            long r3 = r1.b
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L50
            long r3 = r1.c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L50
            long r3 = r1.d
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L35
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L50
        L35:
            long r3 = r1.e
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L3f
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L50
        L3f:
            int r3 = r1.f
            r4 = -1
            if (r3 != r4) goto L50
            long r3 = r1.g
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L50
            long r3 = r1.h
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L62
        L50:
            java.util.concurrent.ConcurrentMap r2 = r14.f
            r2.put(r15, r1)
            java.lang.String r0 = r0.r()
            boolean r15 = j$.util.Objects.equals(r15, r0)
            if (r15 == 0) goto Lae
            r14.g = r1
            goto Lae
        L62:
            r1 = r2
            goto Lae
        L64:
            defpackage.taq.d()
            zew r15 = r14.c
            long r0 = r15.e()
            long r2 = r15.f()
            long r4 = r15.g()
            long r6 = r15.d()
            int r8 = r15.c()
            long r9 = r15.i()
            long r11 = r15.h()
            java.lang.String r13 = r15.r()
            zia r15 = defpackage.zia.a(r0, r2, r4, r6, r8, r9, r11, r13)
            r14.g = r15
            zjr r15 = r14.e
            boolean r15 = r15.aV()
            if (r15 == 0) goto Lac
            zia r15 = r14.g
            java.lang.String r15 = r15.i
            boolean r15 = defpackage.ahno.aa(r15)
            if (r15 != 0) goto Lac
            java.util.concurrent.ConcurrentMap r15 = r14.f
            zia r0 = r14.g
            java.lang.String r0 = r0.i
            zia r1 = r14.g
            r15.put(r0, r1)
        Lac:
            zia r1 = r14.g
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytv.h(java.lang.String):zia");
    }

    public final String i() {
        taq.d();
        if (this.i) {
            return this.c.r();
        }
        return null;
    }

    public final void j() {
        if (D("clearQueue", new ygz(this, 7))) {
            zhr.a(zhq.MLPLAYER, "MedialibPlayer.clearQueue()");
            this.j.w("api", "clearQ");
            this.c.u();
        }
    }

    public final void k() {
        if (D("clearVideoFrame", new ygz(this, 10))) {
            zhr.a(zhq.MLPLAYER, "MedialibPlayer.clearVideoFrame()");
            this.c.v();
        }
    }

    public final void l(ywz ywzVar) {
        zjr zjrVar = this.e;
        int i = 1;
        zkf.a = !zjrVar.dt();
        if (D("loadVideo", new yts(this, ywzVar, 2)) && ywzVar.u(zjrVar.v())) {
            ywy ywyVar = (ywy) ywzVar;
            ywyVar.o.D();
            ytu ytuVar = new ytu(this, this.o, ywyVar.j, this.d, ywyVar.o);
            this.j = ywl.B(this.k, this.m.c(ywyVar.h), ytuVar, zjrVar);
            if (zjrVar.i.m(182, 45679416L)) {
                this.j.w("lvst", zhf.d());
            }
            ywn ywnVar = this.j;
            ytuVar.a = ywnVar;
            ywnVar.y(ywnVar.d());
            zjr.fJ();
            zhq zhqVar = zhq.MLPLAYER;
            String str = ywyVar.h;
            Boolean boolValueOf = Boolean.valueOf(ywzVar.s(2));
            Long lValueOf = Long.valueOf(ywyVar.e.a);
            zaf zafVar = new zaf(ytuVar, i);
            Map map = zhr.a;
            zhr.b(zhqVar, "MedialibPlayer.loadVideo(cpn=%s playWhenReady=%b positionMs=%s playerEvents=[%d] videoId=%s volume=%s pauseOnLastFrame=%b)", str, boolValueOf, lValueOf, zafVar, "scrubbed", Float.valueOf(ywzVar.c()), Boolean.valueOf(ywzVar.s(4)));
            ywk ywkVar = new ywk(ywzVar);
            ywkVar.b = ytuVar;
            float fC = ywzVar.c();
            if (Float.isNaN(fC)) {
                ywyVar.j.h(new zhz("invalid.parameter", this.c.e(), String.format(Locale.US, "Volume: %f", Float.valueOf(fC))));
            }
            float fZ = 1.0f;
            ywkVar.A(Float.valueOf(tym.z(fC, 0.0f, 1.0f)));
            ywkVar.a = this.j;
            float fB = ywzVar.b();
            if (Float.isNaN(fB)) {
                ywyVar.j.h(new zhz("invalid.parameter", this.c.e(), String.format(Locale.US, "Playback rate: %f", Float.valueOf(fB))));
            } else {
                float fFloatValue = 0.25f;
                float fFloatValue2 = 4.0f;
                if (zjrVar.bj()) {
                    fFloatValue = ((Float) ywyVar.i.O().orElse(Float.valueOf(0.25f))).floatValue();
                    fFloatValue2 = ((Float) ywyVar.i.M().orElse(Float.valueOf(4.0f))).floatValue();
                }
                fZ = tym.z(fB, fFloatValue, fFloatValue2);
            }
            ywkVar.z(Float.valueOf(fZ));
            wja wjaVarM = ywyVar.d;
            ArrayList arrayList = new ArrayList();
            String str2 = zjrVar.R().C;
            if (!ahno.aa(str2)) {
                try {
                    Iterator it = agfm.b('.').f(str2).iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf((String) it.next()));
                    }
                } catch (NumberFormatException unused) {
                    arrayList.clear();
                }
            }
            if (!arrayList.isEmpty()) {
                agex hsbVar = new hsb(arrayList, 8);
                wja wjaVarH = wjaVarM.h(hsbVar);
                StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = wjaVarH.d;
                aihf builder = streamingDataOuterClass$StreamingData.toBuilder();
                builder.copyOnWrite();
                ((StreamingDataOuterClass$StreamingData) builder.instance).e = StreamingDataOuterClass$StreamingData.emptyProtobufList();
                for (alaw alawVar : streamingDataOuterClass$StreamingData.e) {
                    if (hsbVar.a(alawVar)) {
                        builder.cq(alawVar);
                    }
                }
                wjaVarM = wjaVarH.m((StreamingDataOuterClass$StreamingData) builder.build(), wjaVarH.K, wjaVarH.L);
            }
            ywkVar.d = wjaVarM;
            this.c.Y(ywkVar);
            this.i = true;
            L(ywkVar);
            ywyVar.o.C();
        }
    }

    public final void m() {
        if (D("playNextInQueue", new ygz(this, 8))) {
            zhr.a(zhq.MLPLAYER, "MedialibPlayer.playNextInQueue()");
            this.c.z();
        }
    }

    public final void n() {
        if (D("playVideo", new ygz(this, 11))) {
            zhr.a(zhq.MLPLAYER, "MedialibPlayer.playVideo()");
            this.c.A();
        }
    }

    public final void o(yxk yxkVar) {
        if (D("queueVideo", new xoy(this, yxkVar, 18))) {
            ywz ywzVar = yxkVar.a;
            zjr zjrVar = this.e;
            if (ywzVar.u(zjrVar.v())) {
                long j = yxkVar.b;
                ywy ywyVar = (ywy) ywzVar;
                yxh yxhVar = ywyVar.j;
                if (j <= 0 && j != -1) {
                    zhz zhzVar = new zhz("invalid.parameter", 0L, a.bS(j, "transitionMs."));
                    zhzVar.o();
                    yxhVar.h(zhzVar);
                    return;
                }
                ytu ytuVar = new ytu(this, this.o, yxhVar, this.d, ywyVar.o);
                ywn ywnVarB = ywl.B(this.k, this.m.c(ywyVar.h), ytuVar, zjrVar);
                ytuVar.a = ywnVarB;
                ywk ywkVar = new ywk(ywzVar);
                ywkVar.b = ytuVar;
                ywkVar.a = ywnVarB;
                zev zevVar = new zev(ywkVar, j);
                zjr.fJ();
                zhq zhqVar = zhq.MLPLAYER;
                String str = ywyVar.h;
                Long lValueOf = Long.valueOf(j);
                yvw yvwVar = ywyVar.e;
                ywk ywkVar2 = zevVar.b;
                zhr.b(zhqVar, "MedialibPlayer.queueVideo(cpn=%s transitionPositionMs=%d position=%s playerEvents=[%d] videoId=%s pauseOnLastFrame=%b)", str, lValueOf, yvwVar, Integer.valueOf(System.identityHashCode(ywkVar2.b) % 100), "scrubbed", Boolean.valueOf(ywzVar.s(4)));
                L(ywkVar2);
                this.c.X(zevVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void p(yuf yufVar) throws Throwable {
        yty ytyVarA;
        int i = 1;
        if (!D("queueVideos", new yts(this, yufVar, i))) {
            return;
        }
        zew zewVar = this.c;
        agjz agjzVar = new agjz(4);
        zdx zdxVar = (zdx) zewVar;
        agjzVar.j(zdxVar.b);
        agjzVar.j(zdxVar.c);
        agke agkeVarG = agjzVar.g();
        try {
            ytyVarA = yufVar.a(agkeVarG);
            try {
                boolean z = ytyVarA.a;
                boolean z2 = z || !ytyVarA.b.isEmpty();
                zjr zjrVar = this.e;
                if (zjrVar.bI() && z2) {
                    try {
                        if (zjrVar.bR()) {
                            zewVar.P(true);
                        } else {
                            zewVar.P(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (i != 0) {
                            K();
                        }
                        if (this.e.dz()) {
                            yufVar.c(this.j, agkeVarG, ytyVarA);
                        }
                        throw th;
                    }
                } else {
                    i = 0;
                }
                if (z) {
                    zewVar.u();
                }
                agqs agqsVarListIterator = ytyVarA.b.listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    o((yxk) agqsVarListIterator.next());
                }
                if (i != 0) {
                    K();
                }
                if (this.e.dz()) {
                    yufVar.c(this.j, agkeVarG, ytyVarA);
                }
            } catch (Throwable th2) {
                th = th2;
                i = 0;
                if (i != 0) {
                    K();
                }
                if (this.e.dz()) {
                    yufVar.c(this.j, agkeVarG, ytyVarA);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            ytyVarA = null;
        }
    }

    public final void q() {
        zhr.a(zhq.MLPLAYER, "MedialibPlayer.restartPrefetchEvaluation");
        if (this.e.bR()) {
            this.c.H(RestartPrefetchEvaluationSource.PREFETCH_SEQUENCE_CHANGED, true);
            return;
        }
        ygz ygzVar = new ygz(this, 9);
        if (a.x()) {
            ygzVar.run();
        } else {
            this.k.post(ygzVar);
        }
    }

    public final void r(long j, appa appaVar) {
        if (D("seekTo", new laz(this, j, appaVar, 7))) {
            zhr.b(zhq.MLPLAYER, "MedialibPlayer.seekTo(positionMillis=%d)", Long.valueOf(j));
            this.c.I(j, appaVar);
        }
    }

    public final void s(boolean z) {
        if (D("setAudioDrc", new csd(this, z, 12))) {
            zhq zhqVar = zhq.MLPLAYER;
            int i = zic.a;
            zhr.b(zhqVar, "setAudioDrc(enabled=%s)", true != z ? "0" : "1");
            this.j.w("api", "drc.".concat(true == z ? "1" : "0"));
            yoq yoqVar = this.h;
            yoqVar.h = true;
            if (yoqVar.g.isEmpty() || ((Boolean) yoqVar.g.get()).booleanValue() != z) {
                yoqVar.g = Optional.of(Boolean.valueOf(z));
                this.c.E();
            }
        }
    }

    public final void t(String str) {
        if (D("setAudioTrackId", new yts(this, str, 0))) {
            zhr.b(zhq.MLPLAYER, "setAudioTrackId(audioTrackId=%s)", str);
            this.j.w("api", "alang.".concat(String.valueOf(str)));
            this.j.x(str);
            yoq yoqVar = this.h;
            typ.f(str);
            yoqVar.f = str;
            this.c.E();
        }
    }

    public final void u(boolean z) {
        if (D("setDefaultLoudnessTargetPreferenceState", new frz(this, z, 3))) {
            zhr.a(zhq.MLPLAYER, "setDefaultLoudnessTargetPreferenceState");
            this.e.z = z;
            this.c.B();
        }
    }

    public final void v(boolean z) {
        if (D("setForegroundMode", new frz(this, z, 4))) {
            zhr.b(zhq.MLPLAYER, "MedialibPlayer.setForegroundMode(%b)", Boolean.valueOf(z));
            this.c.J(z, ajvs.CODEC_INIT_REASON_BACKGROUND);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(zki zkiVar) {
        if (D("setMediaView", new xoy(this, zkiVar, 20))) {
            zkf.a(true);
            zhr.a(zhq.MLPLAYER, "MedialibPlayer.setMediaView(" + String.valueOf(zkiVar) + ')');
            this.c.K(zkiVar);
        }
    }

    public final void x(int i, int i2) {
        if (D("setMediaViewSize", new yuj(this, i, i2, 1))) {
            this.c.L(i, i2);
        }
    }

    public final void y(float f, wiu wiuVar) {
        if (D("setPlaybackRate", new vkd(this, f, wiuVar, 2))) {
            float fFloatValue = 0.25f;
            float fFloatValue2 = 4.0f;
            if (this.e.bj()) {
                fFloatValue = ((Float) wiuVar.O().orElse(Float.valueOf(0.25f))).floatValue();
                fFloatValue2 = ((Float) wiuVar.M().orElse(Float.valueOf(4.0f))).floatValue();
            }
            this.c.M(Float.isNaN(f) ? 1.0f : tym.z(f, fFloatValue, fFloatValue2));
        }
    }

    public final void z(boolean z) {
        this.c.N(z);
    }
}
