package com.google.android.libraries.youtube.media.player.exo2.platypus;

import android.os.Handler;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks;
import com.google.android.libraries.youtube.media.interfaces.MediaFetchController;
import com.google.android.libraries.youtube.media.interfaces.MediaFetchPlayerConfig;
import com.google.android.libraries.youtube.media.interfaces.NetFetch;
import com.google.android.libraries.youtube.media.interfaces.OnesieResponseParams;
import com.google.android.libraries.youtube.media.interfaces.PlaybackAgnosticUserPreferences;
import com.google.android.libraries.youtube.media.interfaces.PlaybackController;
import com.google.android.libraries.youtube.media.interfaces.PlaybackControllerOrError;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.RestartPrefetchEvaluationSource;
import com.google.android.libraries.youtube.media.interfaces.Time;
import com.google.android.libraries.youtube.media.interfaces.VideoClip;
import com.google.android.libraries.youtube.media.interfaces.VideoClipOrError;
import com.google.android.libraries.youtube.media.interfaces.ViewportSize;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import defpackage.abxv;
import defpackage.acca;
import defpackage.acom;
import defpackage.afvx;
import defpackage.agfr;
import defpackage.ahey;
import defpackage.ahno;
import defpackage.ajhj;
import defpackage.aunn;
import defpackage.auym;
import defpackage.avlh;
import defpackage.avmb;
import defpackage.avni;
import defpackage.cno;
import defpackage.jqz;
import defpackage.tgq;
import defpackage.tgr;
import defpackage.trx;
import defpackage.tym;
import defpackage.xeu;
import defpackage.yho;
import defpackage.yhq;
import defpackage.yhu;
import defpackage.yno;
import defpackage.yoe;
import defpackage.yoq;
import defpackage.ytk;
import defpackage.ytl;
import defpackage.ytp;
import defpackage.ytw;
import defpackage.ywj;
import defpackage.ywn;
import defpackage.zcc;
import defpackage.zcf;
import defpackage.zcj;
import defpackage.zcl;
import defpackage.zeh;
import defpackage.zfp;
import defpackage.zfs;
import defpackage.zgi;
import defpackage.zhq;
import defpackage.zhv;
import defpackage.zhz;
import defpackage.zic;
import defpackage.zik;
import defpackage.zjr;
import defpackage.zkj;
import defpackage.zkk;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultMediaFetchControllerWrapper implements PlaybackControllerWrapper.Callbacks, Observer, ytp, tgq {
    public final MediaFetchController a;
    public final ErrorHandler b;
    public final ClipQueue c;
    public final agfr d;
    final yho e;
    public final NetworkPriorityManager f;
    public final ahey g;
    public final ExecutorImpl h;
    public final zjr i;
    final MediaFetchCallbacks j;
    public final zcj k;
    public final tgr l;
    private final Factories m;
    private final PlaybackNetFetchFactory n;
    private final zkk o;
    private final xeu p;
    private final zfs q;
    private boolean r;
    private final acom s;
    private final auym t;

    /* JADX INFO: compiled from: PG */
    class ErrorHandlerCallbacksImpl implements ErrorHandler.Callbacks {
        public ErrorHandlerCallbacksImpl() {
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final long a() {
            return DefaultMediaFetchControllerWrapper.this.c.a();
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final long b(zcf zcfVar) {
            DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = DefaultMediaFetchControllerWrapper.this;
            if (true != defaultMediaFetchControllerWrapper.i.bD()) {
                zcfVar = null;
            }
            return defaultMediaFetchControllerWrapper.k.s(zcfVar);
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final void c(zcf zcfVar, ywj ywjVar, zhz zhzVar) {
            DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = DefaultMediaFetchControllerWrapper.this;
            if (true != defaultMediaFetchControllerWrapper.i.bD()) {
                zcfVar = null;
            }
            defaultMediaFetchControllerWrapper.k.ai(zcfVar, ywjVar, zhzVar);
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final void d(String str, PlatypusException platypusException) {
            PlaybackControllerWrapper playbackControllerWrapperF = DefaultMediaFetchControllerWrapper.this.c.f(str);
            if (playbackControllerWrapperF != null) {
                playbackControllerWrapperF.m(str, platypusException);
            }
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final void e(zcf zcfVar) {
            DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = DefaultMediaFetchControllerWrapper.this;
            ClipQueue clipQueue = defaultMediaFetchControllerWrapper.c;
            ClipWrapper clipWrapperC = clipQueue.c();
            if (!defaultMediaFetchControllerWrapper.i.bH() || clipWrapperC == null || clipWrapperC.a.equals(zcfVar)) {
                defaultMediaFetchControllerWrapper.f.a(false);
                defaultMediaFetchControllerWrapper.C();
            } else if (clipQueue.d(zcfVar) != null) {
                defaultMediaFetchControllerWrapper.e();
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    class MediaFetchCallbacksImpl extends MediaFetchCallbacks {
        public MediaFetchCallbacksImpl() {
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final void acquireNetworkPriority(boolean z) {
            try {
                DefaultMediaFetchControllerWrapper.this.f.a(z);
            } catch (Throwable th) {
                DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = DefaultMediaFetchControllerWrapper.this;
                defaultMediaFetchControllerWrapper.b.b(th, "fail to acquireNetworkPriority");
                if (!defaultMediaFetchControllerWrapper.i.dU()) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final InnertubeContext$ClientInfo getClientInfo() {
            try {
                return (InnertubeContext$ClientInfo) DefaultMediaFetchControllerWrapper.this.d.io();
            } catch (Throwable th) {
                DefaultMediaFetchControllerWrapper.this.b.b(th, "fail to getClientInfo");
                throw th;
            }
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final Time getCurrentPlaybackPosition() {
            Time time = null;
            try {
                Long lI = DefaultMediaFetchControllerWrapper.this.c.i();
                if (lI != null) {
                    time = lI.longValue() == Long.MAX_VALUE ? Time.b : new Time(lI.longValue(), 1000000L);
                }
            } catch (Throwable th) {
                DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = DefaultMediaFetchControllerWrapper.this;
                defaultMediaFetchControllerWrapper.b.b(th, "fail to getCurrentPlaybackPosition");
                if (!defaultMediaFetchControllerWrapper.i.dU()) {
                    throw th;
                }
            }
            return time;
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final boolean isNetworkActive() {
            return DefaultMediaFetchControllerWrapper.this.l.c();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final void prefetch(boolean z) {
            DefaultMediaFetchControllerWrapper.this.k.as(z);
        }
    }

    public DefaultMediaFetchControllerWrapper(zcj zcjVar, Handler handler, xeu xeuVar, zeh zehVar, PlaybackNetFetchFactory playbackNetFetchFactory, ahey aheyVar, ahey aheyVar2, avmb avmbVar, tgr tgrVar, zkk zkkVar, zjr zjrVar, agfr agfrVar, yho yhoVar, avlh avlhVar, zfs zfsVar, abxv abxvVar, tgr tgrVar2, MetadataStoreImpl metadataStoreImpl, aunn aunnVar, String str, ExecutorImpl executorImpl) {
        auym auymVar = new auym();
        this.t = auymVar;
        acom acomVar = new acom();
        this.s = acomVar;
        this.r = true;
        this.k = zcjVar;
        this.g = aheyVar;
        this.h = executorImpl;
        zjrVar.ac().O(avmbVar).af(new avni() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda3
            @Override // defpackage.avni
            public final void a(Object obj) {
                DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = this.a;
                MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig = (MediaFetchHotConfigOuterClass$MediaFetchHotConfig) obj;
                synchronized (zik.class) {
                    MediaFetchController mediaFetchController = defaultMediaFetchControllerWrapper.a;
                    if (mediaFetchController != null) {
                        mediaFetchController.onHotConfig(mediaFetchHotConfigOuterClass$MediaFetchHotConfig);
                    }
                }
            }
        });
        avlhVar.p().ak(new avni() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda4
            @Override // defpackage.avni
            public final void a(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = this.a;
                synchronized (zik.class) {
                    MediaFetchController mediaFetchController = defaultMediaFetchControllerWrapper.a;
                    if (mediaFetchController != null) {
                        mediaFetchController.onNetworkStatusChange(iIntValue != 2, iIntValue);
                    }
                }
            }
        });
        MediaFetchCallbacksImpl mediaFetchCallbacksImpl = new MediaFetchCallbacksImpl();
        this.j = mediaFetchCallbacksImpl;
        PlatypusNativeLoader.a();
        zhq zhqVar = zhq.ABR;
        if (zjrVar.bW()) {
            ((SharedBandwidthSampleTrackerWrapper) aunnVar.io()).a();
        }
        MediaFetchController mediaFetchControllerCreate = MediaFetchController.create(mediaFetchCallbacksImpl, executorImpl, new TimerImpl.Factory(xeuVar, zjrVar), null, zjrVar.V(), zjrVar.W(), G(zkkVar), metadataStoreImpl, str, zjrVar.bW() ? ((SharedBandwidthSampleTrackerWrapper) aunnVar.io()).a : null);
        this.a = mediaFetchControllerCreate;
        if (zjrVar.dE()) {
            auymVar.h(mediaFetchControllerCreate);
            zehVar.j = auymVar;
        }
        if (zjrVar.dD()) {
            acomVar.d(mediaFetchControllerCreate);
            zehVar.i = acomVar;
        }
        this.c = new ClipQueue();
        this.f = new NetworkPriorityManager(tgrVar);
        this.d = agfrVar;
        this.e = yhoVar;
        ErrorHandler errorHandler = new ErrorHandler(new ErrorHandlerCallbacksImpl(), zjrVar, handler, xeuVar);
        this.b = errorHandler;
        this.n = playbackNetFetchFactory;
        this.m = new Factories(zjrVar, xeuVar, aheyVar, aheyVar2, handler, zkkVar, errorHandler, zehVar, abxvVar);
        this.p = xeuVar;
        this.i = zjrVar;
        this.q = zfsVar;
        this.o = zkkVar;
        this.l = tgrVar2;
        int i = zic.a;
        zkkVar.addObserver(this);
        tgrVar2.a(this);
    }

    private final int E() {
        zjr zjrVar = this.i;
        if (zjrVar.eb() || zjrVar.cE()) {
            return zjrVar.eO();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    private final cno F(final zcf zcfVar, boolean z, Handler handler, OnesieMediaFetchIntegration onesieMediaFetchIntegration) {
        boolean z2;
        boolean z3;
        BufferManagerImpl bufferManagerImplC;
        String str;
        int i;
        byte[] bArr;
        PlaybackControllerOrError playbackControllerOrErrorCreatePlaybackController;
        boolean z4;
        PlaybackControllerWrapper playbackControllerWrapper;
        PlaybackController playbackController;
        VideoClipOrError videoClipOrErrorQueueVideoClip;
        ywn ywnVar = zcfVar.Z;
        ywnVar.l("cat", "sabr");
        ClipQueue clipQueue = this.c;
        String str2 = zcfVar.a;
        PlaybackControllerWrapper playbackControllerWrapperF = clipQueue.f(str2);
        String strJ = zcfVar.j();
        if (onesieMediaFetchIntegration == null) {
            z2 = playbackControllerWrapperF == null;
        } else {
            if (onesieMediaFetchIntegration instanceof LegacyOnesieMediaFetchIntegration) {
                throw null;
            }
            z2 = playbackControllerWrapperF == null;
            onesieMediaFetchIntegration.i(zcfVar);
        }
        zjr zjrVar = this.i;
        if (zjrVar.aI()) {
            ywnVar.l("rpcw", true != z2 ? "1" : "0");
            if (onesieMediaFetchIntegration != null) {
                BufferManagerImpl bufferManagerImplC2 = onesieMediaFetchIntegration.c();
                if (bufferManagerImplC2 != null) {
                    ywnVar.l("oheb", "1;v." + bufferManagerImplC2.getBufferedPosition(jqz.TRACK_TYPE_VIDEO.d).a() + ";a." + bufferManagerImplC2.getBufferedPosition(jqz.TRACK_TYPE_AUDIO.d).a());
                } else {
                    ywnVar.l("oheb", "0");
                }
                z3 = true;
            } else {
                z3 = true;
            }
        } else {
            z3 = true;
        }
        if (z3 != z2 || onesieMediaFetchIntegration == null || (bufferManagerImplC = onesieMediaFetchIntegration.c()) == null) {
            bufferManagerImplC = this.m.c(zcfVar);
        }
        BufferManagerImpl bufferManagerImpl = bufferManagerImplC;
        Factories factories = this.m;
        MediaPushMediaSource mediaPushMediaSourceF = Factories.f(zcfVar, bufferManagerImpl, handler);
        mediaPushMediaSourceF.m = clipQueue.p();
        zfp zfpVar = zcfVar.S;
        PlatypusProofOfOriginTokenManager platypusProofOfOriginTokenManager = new PlatypusProofOfOriginTokenManager(this.q, ywnVar, zcfVar.j(), zjrVar);
        byte[] bArr2 = zcfVar.T;
        PlaybackControllerWrapper playbackControllerWrapperB = factories.b(zcfVar, mediaPushMediaSourceF, bufferManagerImpl, this);
        yhq yhqVarA = yno.j(zcfVar) ? this.e.a(strJ, ywnVar, playbackControllerWrapperB) : null;
        yhu yhuVarB = (yno.j(zcfVar) && zcfVar.H.W().g) ? this.e.b(strJ, ywnVar, playbackControllerWrapperB) : null;
        synchronized (zik.class) {
            OnesieResponseParams onesieResponseParamsB = onesieMediaFetchIntegration != null ? onesieMediaFetchIntegration.b() : null;
            if (onesieResponseParamsB == null) {
                str = "n";
            } else {
                str = onesieResponseParamsB.getIsActive() ? "1" : "0";
            }
            ywnVar.l("poa", str);
            MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesB = zcfVar.b();
            if (mediaCapabilitiesOuterClass$MediaCapabilitiesB != null) {
                this.a.setMediaCapabilities(mediaCapabilitiesOuterClass$MediaCapabilitiesB);
            }
            MediaFetchController mediaFetchController = this.a;
            byte[] bArr3 = bArr2;
            MediaFetchPlayerConfig mediaFetchPlayerConfigE = Factories.e(zcfVar);
            StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = zcfVar.A.d;
            ytl ytlVar = new ytl(ywnVar, this.p, zjrVar);
            ytk ytkVarA = factories.a(zcfVar);
            NetFetch netFetchA = this.n.a(zcfVar, this.h);
            if (zfpVar != null) {
                bArr = zfpVar.b;
                i = 0;
            } else {
                i = 0;
                bArr = new byte[0];
            }
            if (bArr3 == null) {
                bArr3 = new byte[i];
            }
            playbackControllerOrErrorCreatePlaybackController = mediaFetchController.createPlaybackController(playbackControllerWrapperB, mediaFetchPlayerConfigE, streamingDataOuterClass$StreamingData, strJ, bufferManagerImpl, ytlVar, ytkVarA, netFetchA, str2, bArr, platypusProofOfOriginTokenManager, bArr3, Factories.d(zcfVar), onesieResponseParamsB, null, yhqVarA, yhuVarB, zcfVar.A.E(), zcfVar.s(), mediaCapabilitiesOuterClass$MediaCapabilitiesB);
        }
        PlaybackController playback = playbackControllerOrErrorCreatePlaybackController.getPlayback();
        if (playback == null) {
            QoeError error = playbackControllerOrErrorCreatePlaybackController.getError();
            ErrorHandler errorHandler = this.b;
            if (error != null) {
                errorHandler.e(error, zcfVar);
            } else {
                zhv zhvVar = new zhv("invalid.parameter");
                zhvVar.c = "c.createPlayback.0";
                zhvVar.e = true;
                errorHandler.c(zhvVar.a(), zcfVar);
            }
            z4 = true;
            playbackControllerWrapper = null;
        } else {
            if (onesieMediaFetchIntegration instanceof LegacyOnesieMediaFetchIntegration) {
            }
            boolean z5 = zcfVar.C.b() == zcc.b;
            synchronized (zik.class) {
                playbackControllerWrapperB.f(z, z5);
            }
            if (!z5) {
                playbackControllerWrapperB.r();
            }
            synchronized (zik.class) {
                z4 = true;
                playbackControllerWrapperB.e(playback, onesieMediaFetchIntegration, yhqVarA, yhuVarB, z5);
                playbackControllerWrapper = playbackControllerWrapperB;
            }
            if (zcfVar.R != null) {
                synchronized (zik.class) {
                    playbackControllerWrapper.t(zcfVar.R);
                }
            }
        }
        zhq zhqVar = zhq.ABR;
        long j = zcfVar.g;
        if (playbackControllerWrapper == null) {
            return null;
        }
        long j2 = zcfVar.g;
        zjr zjrVar2 = zcfVar.H;
        Time time = (j2 == zjrVar2.v() || (zcfVar.A.B() && !zjrVar2.W().w)) ? null : new Time(j2, 1000L);
        long j3 = zcfVar.e;
        Time time2 = j3 != -1 ? new Time(j3, 1000L) : null;
        long j4 = zcfVar.f;
        Time time3 = j4 != -1 ? new Time(j4, 1000L) : null;
        synchronized (zik.class) {
            playbackController = playbackControllerWrapper.a;
        }
        if (playbackController == null) {
            zcfVar.Z.k(new zhz("player.exception", zcfVar.g, new IllegalStateException("PlaybackController.null")));
            return null;
        }
        synchronized (zik.class) {
            videoClipOrErrorQueueVideoClip = this.a.queueVideoClip(playbackController, time, time2, time3);
        }
        VideoClip videoClip = videoClipOrErrorQueueVideoClip.getVideoClip();
        if (videoClip != null) {
            this.c.l(new ClipWrapper(zcfVar, playbackControllerWrapper, videoClip));
            zcfVar.d.j = new zcl() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda6
                @Override // defpackage.zcl
                public final void a(final zgi zgiVar) {
                    final DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = this.a;
                    ClipWrapper clipWrapperC = defaultMediaFetchControllerWrapper.c.c();
                    if (clipWrapperC != null) {
                        zcf zcfVar2 = zcfVar;
                        if (clipWrapperC.a.equals(zcfVar2)) {
                            zjr zjrVar3 = zcfVar2.H;
                            if (zjrVar3.dP()) {
                                defaultMediaFetchControllerWrapper.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda13
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2 = zgiVar.l;
                                        int i3 = i2 - 1;
                                        if (i2 == 0) {
                                            throw null;
                                        }
                                        defaultMediaFetchControllerWrapper.a.onPlayerState(i3);
                                    }
                                });
                            } else if (zjrVar3.dQ()) {
                                yno.S(defaultMediaFetchControllerWrapper.g, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda14
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        defaultMediaFetchControllerWrapper.z(zgiVar);
                                    }
                                }, 0L, zcfVar2.Z, null, "Failed to notifyPlayerStateChange");
                            } else {
                                defaultMediaFetchControllerWrapper.z(zgiVar);
                            }
                        }
                    }
                }
            };
            return playbackControllerWrapper.b;
        }
        QoeError error2 = videoClipOrErrorQueueVideoClip.getError();
        ErrorHandler errorHandler2 = this.b;
        if (error2 != null) {
            errorHandler2.e(error2, zcfVar);
            return null;
        }
        zhv zhvVar2 = new zhv("invalid.parameter");
        zhvVar2.c = "c.queueClip.0";
        zhvVar2.e = z4;
        errorHandler2.c(zhvVar2.a(), zcfVar);
        return null;
    }

    private static ViewportSize G(zkk zkkVar) {
        zkj zkjVar = (zkj) zkkVar.io();
        return new ViewportSize(zkjVar.c, zkjVar.d);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper.Callbacks
    public final ListenableFuture A(PlaybackControllerWrapper playbackControllerWrapper) {
        return this.k.F(playbackControllerWrapper.e);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper.Callbacks
    public final void B(PlaybackControllerWrapper playbackControllerWrapper) {
        ClipWrapper clipWrapperC = this.c.c();
        if (clipWrapperC == null || clipWrapperC.b != playbackControllerWrapper) {
            return;
        }
        zcf zcfVar = playbackControllerWrapper.e;
        zcj zcjVar = this.k;
        if (true != this.i.bD()) {
            zcfVar = null;
        }
        zcjVar.ae(zcfVar);
    }

    public final void C() {
        zhq zhqVar = zhq.ABR;
        zjr zjrVar = this.i;
        boolean zBR = zjrVar.bR();
        synchronized (zik.class) {
            MediaFetchController mediaFetchController = this.a;
            mediaFetchController.truncateQueue(0);
            if (!zBR && zjrVar.bI()) {
                mediaFetchController.restartPrefetchEvaluation(RestartPrefetchEvaluationSource.TRUNCATE_QUEUE);
            }
        }
        if (zBR && this.i.bI()) {
            this.a.restartPrefetchEvaluationThreadsafe(RestartPrefetchEvaluationSource.TRUNCATE_QUEUE);
        }
        this.c.m();
        this.r = true;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper.Callbacks
    public final void D(PlaybackControllerWrapper playbackControllerWrapper, long j) {
        zcf zcfVar = playbackControllerWrapper.e;
        zhq zhqVar = zhq.ABR;
        ClipWrapper clipWrapperC = this.c.c();
        if (clipWrapperC == null || clipWrapperC.b != playbackControllerWrapper) {
            return;
        }
        final Time time = j == Long.MAX_VALUE ? Time.b : new Time(j, 1000000L);
        if (this.i.dP()) {
            this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onSeek(time);
                }
            });
        } else {
            synchronized (zik.class) {
                this.a.onSeek(time);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ytp
    public final cno a(zcf zcfVar, boolean z, Handler handler, ytw ytwVar) {
        afvx afvxVarAd = tym.ad(trx.MEDIA_FETCH_LOAD_VIDEO);
        try {
            C();
            cno cnoVarF = F(zcfVar, z, handler, ytwVar);
            afvxVarAd.close();
            return cnoVarF;
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ytp
    public final cno b(long j, zcf zcfVar, boolean z, Handler handler, ytw ytwVar) {
        afvx afvxVarAd = tym.ad(trx.MEDIA_FETCH_QUEUE_VIDEO);
        try {
            ClipWrapper clipWrapperE = this.c.e();
            if (clipWrapperE != null) {
                synchronized (zik.class) {
                    try {
                        clipWrapperE.a(j);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            cno cnoVarF = F(zcfVar, z, handler, ytwVar);
            afvxVarAd.close();
            return cnoVarF;
        } catch (Throwable th2) {
            try {
                afvxVarAd.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.ytp
    public final zcf c(String str, long j, long j2) {
        return this.c.g(str, j, j2);
    }

    @Override // defpackage.ytp
    public final void d(zcf zcfVar) {
        PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF != null) {
            synchronized (zik.class) {
                playbackControllerWrapperF.c();
            }
        }
    }

    @Override // defpackage.ytp
    public final void e() {
        synchronized (zik.class) {
            this.a.truncateQueue(1);
        }
        this.r = true;
        this.c.r();
    }

    @Override // defpackage.ytp
    public final void f(boolean z) {
        if (z) {
            this.a.onQueuingCompletedThreadsafe();
        } else if (this.i.dP()) {
            this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onQueuingCompleted();
                }
            });
        } else {
            synchronized (zik.class) {
                this.a.onQueuingCompleted();
            }
        }
    }

    @Override // defpackage.ytp
    public final void g(zeh zehVar) {
        yoq yoqVar = zehVar.e;
        PlaybackAgnosticUserPreferences playbackAgnosticUserPreferencesB = yno.B(yoqVar.c(), yoqVar.b(), this.i.u.a(null), yoqVar.a(), E());
        synchronized (zik.class) {
            this.a.setPlaybackAgnosticUserPreferences(playbackAgnosticUserPreferencesB);
        }
    }

    @Override // defpackage.ytp
    public final void h() {
        if (this.i.dP()) {
            this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onAppEnterBackground();
                }
            });
        } else {
            yno.S(this.g, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = this.a;
                    synchronized (zik.class) {
                        defaultMediaFetchControllerWrapper.a.onAppEnterBackground();
                    }
                }
            }, 0L, null, this.p, "Failed to notify onAppEnterBackground");
        }
    }

    @Override // defpackage.ytp
    public final void i(zcf zcfVar, boolean z) {
        boolean zV;
        ClipQueue clipQueue = this.c;
        String str = zcfVar.a;
        PlaybackControllerWrapper playbackControllerWrapperF = clipQueue.f(str);
        if (playbackControllerWrapperF != null) {
            zjr zjrVar = this.i;
            ajhj ajhjVarA = zjrVar.u.a(str);
            int iE = E();
            yoe yoeVarC = zcfVar.c();
            final PlaybackAgnosticUserPreferences playbackAgnosticUserPreferencesB = yno.B(yoeVarC.h(), ahno.Z(yoeVarC.d()), ajhjVarA, yoeVarC.b(), iE);
            if (zjrVar.dP()) {
                this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda17
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.setPlaybackAgnosticUserPreferences(playbackAgnosticUserPreferencesB);
                    }
                });
            } else {
                synchronized (zik.class) {
                    this.a.setPlaybackAgnosticUserPreferences(playbackAgnosticUserPreferencesB);
                }
            }
            synchronized (zik.class) {
                zV = playbackControllerWrapperF.v(z);
            }
            if (zV) {
                zcj zcjVar = this.k;
                if (true != this.i.bD()) {
                    zcfVar = null;
                }
                zcjVar.ae(zcfVar);
            }
        }
    }

    @Override // defpackage.ytp
    public final void j() {
        if (this.i.dP()) {
            this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onStuckPlayback();
                }
            });
        } else {
            synchronized (zik.class) {
                this.a.onStuckPlayback();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.zan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean jx(com.google.android.libraries.youtube.media.interfaces.Time r10) {
        /*
            r9 = this;
            java.lang.Class<zik> r0 = defpackage.zik.class
            monitor-enter(r0)
            com.google.android.libraries.youtube.media.interfaces.MediaFetchController r1 = r9.a     // Catch: java.lang.Throwable -> L58
            r2 = 0
            if (r1 == 0) goto L54
            com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks r9 = r9.j     // Catch: java.lang.Throwable -> L58
            r3 = 0
            r4 = r9
            com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$MediaFetchCallbacksImpl r4 = (com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper.MediaFetchCallbacksImpl) r4     // Catch: java.lang.Throwable -> L36
            com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper r4 = com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper.this     // Catch: java.lang.Throwable -> L36
            com.google.android.libraries.youtube.media.player.exo2.platypus.ClipQueue r4 = r4.c     // Catch: java.lang.Throwable -> L36
            java.lang.Long r4 = r4.i()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L4a
            long r5 = r4.longValue()     // Catch: java.lang.Throwable -> L36
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L28
            com.google.android.libraries.youtube.media.interfaces.Time r9 = com.google.android.libraries.youtube.media.interfaces.Time.b     // Catch: java.lang.Throwable -> L36
            goto L4b
        L28:
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L36
            com.google.android.libraries.youtube.media.interfaces.Time r6 = new com.google.android.libraries.youtube.media.interfaces.Time     // Catch: java.lang.Throwable -> L36
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r6.<init>(r4, r7)     // Catch: java.lang.Throwable -> L36
            r9 = r6
            goto L4b
        L36:
            r4 = move-exception
            com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$MediaFetchCallbacksImpl r9 = (com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper.MediaFetchCallbacksImpl) r9     // Catch: java.lang.Throwable -> L58
            com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper r9 = com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper.this     // Catch: java.lang.Throwable -> L58
            com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler r5 = r9.b     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = "fail to getCurrentPlaybackPosition"
            r5.b(r4, r6)     // Catch: java.lang.Throwable -> L58
            zjr r9 = r9.i     // Catch: java.lang.Throwable -> L58
            boolean r9 = r9.dU()     // Catch: java.lang.Throwable -> L58
            if (r9 == 0) goto L53
        L4a:
            r9 = r3
        L4b:
            boolean r9 = r1.isReadyToStartPlayback(r10, r9, r3)     // Catch: java.lang.Throwable -> L58
            if (r9 == 0) goto L54
            r2 = 1
            goto L54
        L53:
            throw r4     // Catch: java.lang.Throwable -> L58
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            return r2
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            throw r9
        L58:
            r9 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper.jx(com.google.android.libraries.youtube.media.interfaces.Time):boolean");
    }

    @Override // defpackage.ytp
    public final void k(zcf zcfVar, boolean z) {
        boolean zX;
        PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF != null) {
            synchronized (zik.class) {
                zX = playbackControllerWrapperF.x(z);
            }
            if (zX) {
                zcj zcjVar = this.k;
                if (true != this.i.bD()) {
                    zcfVar = null;
                }
                zcjVar.ae(zcfVar);
            }
        }
    }

    @Override // defpackage.ytp
    public final void l() {
        this.c.o();
    }

    @Override // defpackage.ytp
    public final void m(final RestartPrefetchEvaluationSource restartPrefetchEvaluationSource, boolean z) {
        if (z) {
            this.a.restartPrefetchEvaluationThreadsafe(restartPrefetchEvaluationSource);
        } else if (this.i.dP()) {
            this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.restartPrefetchEvaluation(restartPrefetchEvaluationSource);
                }
            });
        } else {
            yno.S(this.g, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultMediaFetchControllerWrapper defaultMediaFetchControllerWrapper = this.a;
                    RestartPrefetchEvaluationSource restartPrefetchEvaluationSource2 = restartPrefetchEvaluationSource;
                    synchronized (zik.class) {
                        defaultMediaFetchControllerWrapper.a.restartPrefetchEvaluation(restartPrefetchEvaluationSource2);
                    }
                }
            }, 0L, null, this.p, "Failed to restart prefetch evaluation");
        }
    }

    @Override // defpackage.ytp
    public final void n(zcf zcfVar, final boolean z) {
        final PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF != null) {
            if (this.i.dP()) {
                this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        playbackControllerWrapperF.n(z);
                    }
                });
            } else {
                synchronized (zik.class) {
                    playbackControllerWrapperF.n(z);
                }
            }
        }
    }

    @Override // defpackage.ytp
    public final void o(zcf zcfVar) {
        PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF != null) {
            playbackControllerWrapperF.o(zcfVar.p);
        }
    }

    @Override // defpackage.ytp
    public final void p(boolean z) {
        if (z) {
            this.a.onQueuingStarted();
        } else if (this.i.dP()) {
            this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onQueuingStarted();
                }
            });
        } else {
            synchronized (zik.class) {
                this.a.onQueuingStarted();
            }
        }
    }

    @Override // defpackage.ytp
    public final void q(ywn ywnVar, zcj zcjVar) {
        if (this.c.p()) {
            return;
        }
        C();
    }

    @Override // defpackage.ytp
    public final void r(zcf zcfVar, boolean z) {
        x(zcfVar, false);
    }

    @Override // defpackage.ytp
    public final void s(zcf zcfVar) {
        PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF != null) {
            synchronized (zik.class) {
                playbackControllerWrapperF.t(zcfVar.R);
            }
        }
    }

    @Override // defpackage.ytp
    public final boolean t() {
        return this.r;
    }

    @Override // defpackage.ytp
    public final boolean u(zcf zcfVar, Duration duration) {
        if (duration.isNegative()) {
            return false;
        }
        if (!this.i.bD()) {
            return jx(new Time(duration.toMillis(), 1000L));
        }
        PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        return playbackControllerWrapperF != null && playbackControllerWrapperF.u(zcfVar, duration);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        zkk zkkVar = this.o;
        if (observable == zkkVar) {
            zjr zjrVar = this.i;
            final ViewportSize viewportSizeG = G(zkkVar);
            if (zjrVar.dP()) {
                this.h.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.onViewportSizeChange(viewportSizeG);
                    }
                });
            } else {
                synchronized (zik.class) {
                    this.a.onViewportSizeChange(viewportSizeG);
                }
            }
        }
    }

    @Override // defpackage.ytp
    public final boolean v(final boolean z, Runnable runnable, boolean z2) {
        boolean zW;
        ClipWrapper clipWrapperC = this.c.c();
        if (clipWrapperC == null) {
            return false;
        }
        synchronized (zik.class) {
            zW = clipWrapperC.b.w(z);
        }
        if (clipWrapperC.a.H.di() && z) {
            clipWrapperC.b.b.K();
        }
        this.c.n(new Consumer() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper$$ExternalSyntheticLambda12
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                PlaybackControllerWrapper playbackControllerWrapper = (PlaybackControllerWrapper) obj;
                boolean z3 = z;
                synchronized (zik.class) {
                    playbackControllerWrapper.w(z3);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return zW;
    }

    @Override // defpackage.ytp
    public final void w() {
        this.r = false;
    }

    @Override // defpackage.ytp
    public final void x(zcf zcfVar, boolean z) {
        boolean z2 = false;
        if (z && this.i.bD()) {
            z2 = true;
        }
        zhq zhqVar = zhq.ABR;
        ClipWrapper clipWrapperD = this.c.d(zcfVar);
        if (clipWrapperD == null) {
            zcfVar.Z.k(new zhz("invalid.parameter", zcfVar.g, "Playback not in queue"));
            return;
        }
        clipWrapperD.b.b.J();
        VideoClip videoClip = clipWrapperD.c;
        if (videoClip == null) {
            zcfVar.Z.k(new zhz("player.exception", zcfVar.g, new IllegalStateException("VideoClip.null")));
            return;
        }
        zjr zjrVar = this.i;
        boolean zBR = zjrVar.bR();
        synchronized (zik.class) {
            MediaFetchController mediaFetchController = this.a;
            if (!mediaFetchController.transitionToQueuedClip(videoClip)) {
                ywn ywnVar = zcfVar.Z;
                zhz zhzVar = new zhz("player.exception", zcfVar.g, new IllegalStateException("VideoClip.transitionToQueuedClip failed"));
                zhzVar.o();
                ywnVar.k(zhzVar);
                return;
            }
            if (!zBR && zjrVar.bI()) {
                mediaFetchController.restartPrefetchEvaluation(RestartPrefetchEvaluationSource.TRANSITION_TO_QUEUED_CLIP);
            }
            if (zBR && this.i.bI()) {
                this.a.restartPrefetchEvaluationThreadsafe(RestartPrefetchEvaluationSource.TRANSITION_TO_QUEUED_CLIP);
            }
            if (this.c.q(clipWrapperD, z2)) {
                return;
            }
            ywn ywnVar2 = zcfVar.Z;
            zhz zhzVar2 = new zhz("player.exception", zcfVar.g, new IllegalStateException("ClipQueue.transitionToClip failed"));
            zhzVar2.o();
            ywnVar2.k(zhzVar2);
        }
    }

    @Override // defpackage.ytp
    public final void y(acca accaVar, zcf zcfVar) {
        PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF == null) {
            zcfVar.Z.w("ctsnpcw", "track:".concat(String.valueOf(accaVar != null ? accaVar.n : "null")));
        } else {
            playbackControllerWrapperF.B(accaVar);
        }
    }

    public final void z(zgi zgiVar) {
        synchronized (zik.class) {
            MediaFetchController mediaFetchController = this.a;
            int i = zgiVar.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            mediaFetchController.onPlayerState(i2);
        }
    }
}
