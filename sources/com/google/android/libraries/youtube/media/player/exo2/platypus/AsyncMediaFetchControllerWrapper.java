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
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import defpackage.abxv;
import defpackage.acca;
import defpackage.acom;
import defpackage.afvx;
import defpackage.afwl;
import defpackage.agfr;
import defpackage.agke;
import defpackage.agpi;
import defpackage.ahey;
import defpackage.ahno;
import defpackage.ajhj;
import defpackage.aunn;
import defpackage.auym;
import defpackage.avlh;
import defpackage.avlr;
import defpackage.avmb;
import defpackage.awir;
import defpackage.awlg;
import defpackage.cno;
import defpackage.ept;
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
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class AsyncMediaFetchControllerWrapper implements PlaybackControllerWrapper.Callbacks, Observer, ytp, tgq {
    public final MediaFetchController a;
    public final ErrorHandler b;
    public final ClipQueue c;
    public final agfr d;
    final yho e;
    public final NetworkPriorityManager f;
    public final zjr g;
    final MediaFetchCallbacks h;
    public final zcj i;
    public final tgr j;
    private final Factories k;
    private final PlaybackNetFetchFactory l;
    private final zkk m;
    private final ahey n;
    private final ExecutorImpl o;
    private final xeu p;
    private final zfs q;
    private boolean r;
    private final avlh s;
    private final acom t;
    private final auym u;

    /* JADX INFO: compiled from: PG */
    class ErrorHandlerCallbacksImpl implements ErrorHandler.Callbacks {
        public ErrorHandlerCallbacksImpl() {
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final long a() {
            return AsyncMediaFetchControllerWrapper.this.c.a();
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final long b(zcf zcfVar) {
            AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = AsyncMediaFetchControllerWrapper.this;
            if (true != asyncMediaFetchControllerWrapper.g.bD()) {
                zcfVar = null;
            }
            return asyncMediaFetchControllerWrapper.i.s(zcfVar);
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final void c(zcf zcfVar, ywj ywjVar, zhz zhzVar) {
            AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = AsyncMediaFetchControllerWrapper.this;
            if (true != asyncMediaFetchControllerWrapper.g.bD()) {
                zcfVar = null;
            }
            asyncMediaFetchControllerWrapper.i.ai(zcfVar, ywjVar, zhzVar);
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final void d(String str, PlatypusException platypusException) {
            PlaybackControllerWrapper playbackControllerWrapperF = AsyncMediaFetchControllerWrapper.this.c.f(str);
            if (playbackControllerWrapperF != null) {
                playbackControllerWrapperF.m(str, platypusException);
            }
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler.Callbacks
        public final void e(zcf zcfVar) {
            AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = AsyncMediaFetchControllerWrapper.this;
            ClipQueue clipQueue = asyncMediaFetchControllerWrapper.c;
            ClipWrapper clipWrapperC = clipQueue.c();
            if (!asyncMediaFetchControllerWrapper.g.bH() || clipWrapperC == null || clipWrapperC.a.equals(zcfVar)) {
                asyncMediaFetchControllerWrapper.f.a(false);
                asyncMediaFetchControllerWrapper.F();
            } else if (clipQueue.d(zcfVar) != null) {
                asyncMediaFetchControllerWrapper.e();
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
                AsyncMediaFetchControllerWrapper.this.f.a(z);
            } catch (Throwable th) {
                AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = AsyncMediaFetchControllerWrapper.this;
                asyncMediaFetchControllerWrapper.b.b(th, "fail to acquireNetworkPriority");
                if (!asyncMediaFetchControllerWrapper.g.dU()) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final InnertubeContext$ClientInfo getClientInfo() {
            try {
                return (InnertubeContext$ClientInfo) AsyncMediaFetchControllerWrapper.this.d.io();
            } catch (Throwable th) {
                AsyncMediaFetchControllerWrapper.this.b.b(th, "fail to getClientInfo");
                throw th;
            }
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final Time getCurrentPlaybackPosition() {
            Time time = null;
            try {
                Long lI = AsyncMediaFetchControllerWrapper.this.c.i();
                if (lI != null) {
                    time = lI.longValue() == Long.MAX_VALUE ? Time.b : new Time(lI.longValue(), 1000000L);
                }
            } catch (Throwable th) {
                AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = AsyncMediaFetchControllerWrapper.this;
                asyncMediaFetchControllerWrapper.b.b(th, "fail to getCurrentPlaybackPosition");
                if (!asyncMediaFetchControllerWrapper.g.dU()) {
                    throw th;
                }
            }
            return time;
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final boolean isNetworkActive() {
            return AsyncMediaFetchControllerWrapper.this.j.c();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks
        public final void prefetch(boolean z) {
            AsyncMediaFetchControllerWrapper.this.i.as(z);
        }
    }

    /* JADX INFO: compiled from: PG */
    final class PlaybackControllerWrapperHolder extends ept {
        public final PlaybackControllerWrapper a;
        public final yhq b;
        public final yhu c;
        public final BufferManagerImpl d;
        public final String e;
        public final zfp f;
        public final PlatypusProofOfOriginTokenManager g;
        public final byte[] h;

        public PlaybackControllerWrapperHolder(PlaybackControllerWrapper playbackControllerWrapper, yhq yhqVar, yhu yhuVar, BufferManagerImpl bufferManagerImpl, String str, zfp zfpVar, PlatypusProofOfOriginTokenManager platypusProofOfOriginTokenManager, byte[] bArr) {
            this.a = playbackControllerWrapper;
            this.b = yhqVar;
            this.c = yhuVar;
            this.d = bufferManagerImpl;
            this.e = str;
            this.f = zfpVar;
            this.g = platypusProofOfOriginTokenManager;
            this.h = bArr;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PlaybackControllerWrapperHolder)) {
                return false;
            }
            PlaybackControllerWrapperHolder playbackControllerWrapperHolder = (PlaybackControllerWrapperHolder) obj;
            return Objects.equals(this.a, playbackControllerWrapperHolder.a) && Objects.equals(this.b, playbackControllerWrapperHolder.b) && Objects.equals(this.c, playbackControllerWrapperHolder.c) && Objects.equals(this.d, playbackControllerWrapperHolder.d) && Objects.equals(this.e, playbackControllerWrapperHolder.e) && Objects.equals(this.f, playbackControllerWrapperHolder.f) && Objects.equals(this.g, playbackControllerWrapperHolder.g) && Objects.equals(this.h, playbackControllerWrapperHolder.h);
        }

        public final int hashCode() {
            return (((((((((((((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e)) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.h);
        }

        public final String toString() {
            int i = 0;
            Object[] objArr = {this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h};
            String[] strArrSplit = "wrapper;platypusOnlineCache;platypusOfflineCache;bufferManager;videoId;poToken;tokenManager;watchEndpointUstreamerConfig".split(";");
            StringBuilder sb = new StringBuilder();
            sb.append(PlaybackControllerWrapperHolder.class.getSimpleName());
            sb.append('[');
            while (true) {
                int length = strArrSplit.length;
                if (i >= length) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(strArrSplit[i]);
                sb.append('=');
                sb.append(objArr[i]);
                if (i != length - 1) {
                    sb.append(", ");
                }
                i++;
            }
        }
    }

    public AsyncMediaFetchControllerWrapper(zcj zcjVar, Handler handler, xeu xeuVar, zeh zehVar, PlaybackNetFetchFactory playbackNetFetchFactory, ahey aheyVar, ahey aheyVar2, avmb avmbVar, tgr tgrVar, zkk zkkVar, zjr zjrVar, agfr agfrVar, yho yhoVar, avlh avlhVar, zfs zfsVar, abxv abxvVar, tgr tgrVar2, MetadataStoreImpl metadataStoreImpl, aunn aunnVar, String str, ExecutorImpl executorImpl) {
        auym auymVar = new auym();
        this.u = auymVar;
        acom acomVar = new acom();
        this.t = acomVar;
        this.r = true;
        this.i = zcjVar;
        this.n = aheyVar;
        this.o = executorImpl;
        if (!zjrVar.dM()) {
            zjrVar.ac().O(avmbVar).af(new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda0(this));
            avlhVar.p().ak(new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda1(this));
        }
        this.s = avlhVar;
        MediaFetchCallbacksImpl mediaFetchCallbacksImpl = new MediaFetchCallbacksImpl();
        this.h = mediaFetchCallbacksImpl;
        PlatypusNativeLoader.a();
        zhq zhqVar = zhq.ABR;
        if (zjrVar.bW()) {
            ((SharedBandwidthSampleTrackerWrapper) aunnVar.io()).a();
        }
        MediaFetchController mediaFetchControllerCreate = MediaFetchController.create(mediaFetchCallbacksImpl, executorImpl, new TimerImpl.Factory(xeuVar, zjrVar), null, zjrVar.V(), zjrVar.W(), J(zkkVar), metadataStoreImpl, str, zjrVar.bW() ? ((SharedBandwidthSampleTrackerWrapper) aunnVar.io()).a : null);
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
        this.l = playbackNetFetchFactory;
        this.k = new Factories(zjrVar, xeuVar, aheyVar, aheyVar2, handler, zkkVar, errorHandler, zehVar, abxvVar);
        this.p = xeuVar;
        this.g = zjrVar;
        this.q = zfsVar;
        this.m = zkkVar;
        this.j = tgrVar2;
        int i = zic.a;
        zkkVar.addObserver(this);
        tgrVar2.a(this);
    }

    private final int G() {
        zjr zjrVar = this.g;
        if (zjrVar.eb() || zjrVar.cE()) {
            return zjrVar.eO();
        }
        return 0;
    }

    private final cno H(final long j, final zcf zcfVar, final boolean z, Handler handler, final OnesieMediaFetchIntegration onesieMediaFetchIntegration) {
        PlaybackController playbackController;
        VideoClipOrError videoClipOrErrorQueueVideoClip;
        zcfVar.Z.l("cat", "sabr");
        boolean zDL = this.g.dL();
        zhq zhqVar = zhq.ABR;
        if (zDL) {
            if (onesieMediaFetchIntegration != null) {
                onesieMediaFetchIntegration.i(zcfVar);
            } else {
                onesieMediaFetchIntegration = null;
            }
            final PlaybackControllerWrapperHolder playbackControllerWrapperHolderK = K(zcfVar, handler, onesieMediaFetchIntegration);
            PlaybackControllerWrapper playbackControllerWrapper = playbackControllerWrapperHolderK.a;
            final ClipWrapper clipWrapper = new ClipWrapper(zcfVar, playbackControllerWrapper, null);
            ClipQueue clipQueue = this.c;
            final ClipWrapper clipWrapperE = clipQueue.e();
            if (clipWrapperE != null && j != -1) {
                this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda37
                    @Override // java.lang.Runnable
                    public final void run() {
                        clipWrapperE.a(j);
                    }
                }));
            }
            MediaPushMediaSource mediaPushMediaSource = playbackControllerWrapper.b;
            clipQueue.l(clipWrapper);
            zcfVar.d.j = new zcl() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda38
                @Override // defpackage.zcl
                public final void a(zgi zgiVar) {
                    this.a.E(zcfVar, zgiVar);
                }
            };
            this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    afvx afvxVarAd = tym.ad(trx.MEDIA_FETCH_INIT_AND_QUEUE_CLIP);
                    AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
                    zcf zcfVar2 = zcfVar;
                    AsyncMediaFetchControllerWrapper.PlaybackControllerWrapperHolder playbackControllerWrapperHolder = playbackControllerWrapperHolderK;
                    boolean z2 = z;
                    OnesieMediaFetchIntegration onesieMediaFetchIntegration2 = onesieMediaFetchIntegration;
                    ClipWrapper clipWrapper2 = clipWrapper;
                    if (onesieMediaFetchIntegration2 != null) {
                        try {
                            if (onesieMediaFetchIntegration2 instanceof LegacyOnesieMediaFetchIntegration) {
                                throw null;
                            }
                        } catch (Throwable th) {
                            try {
                                afvxVarAd.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    PlaybackControllerWrapper playbackControllerWrapperZ = asyncMediaFetchControllerWrapper.z(zcfVar2, playbackControllerWrapperHolder, z2, onesieMediaFetchIntegration2);
                    if (playbackControllerWrapperZ != null) {
                        PlaybackController playbackController2 = playbackControllerWrapperZ.a;
                        if (playbackController2 == null) {
                            zcfVar2.Z.k(new zhz("player.exception", zcfVar2.g, new IllegalStateException("PlaybackController.null")));
                        } else {
                            long j2 = zcfVar2.g;
                            Time time = (zcfVar2.A.B() || j2 == zcfVar2.H.v()) ? null : new Time(j2, 1000L);
                            long j3 = zcfVar2.e;
                            Time time2 = j3 != -1 ? new Time(j3, 1000L) : null;
                            long j4 = zcfVar2.f;
                            VideoClipOrError videoClipOrErrorQueueVideoClip2 = asyncMediaFetchControllerWrapper.a.queueVideoClip(playbackController2, time, time2, j4 != -1 ? new Time(j4, 1000L) : null);
                            VideoClip videoClip = videoClipOrErrorQueueVideoClip2.getVideoClip();
                            if (videoClip != null) {
                                clipWrapper2.c = videoClip;
                            } else {
                                QoeError error = videoClipOrErrorQueueVideoClip2.getError();
                                if (error != null) {
                                    asyncMediaFetchControllerWrapper.b.e(error, zcfVar2);
                                } else {
                                    ErrorHandler errorHandler = asyncMediaFetchControllerWrapper.b;
                                    zhv zhvVar = new zhv("invalid.parameter");
                                    zhvVar.c = "c.queueClip.0";
                                    zhvVar.e = true;
                                    errorHandler.c(zhvVar.a(), zcfVar2);
                                }
                            }
                        }
                    }
                    afvxVarAd.close();
                }
            }));
            return mediaPushMediaSource;
        }
        ClipWrapper clipWrapperE2 = this.c.e();
        if (clipWrapperE2 != null) {
            synchronized (zik.class) {
                clipWrapperE2.a(j);
            }
        }
        if (onesieMediaFetchIntegration != null) {
            onesieMediaFetchIntegration.i(zcfVar);
            if (onesieMediaFetchIntegration instanceof LegacyOnesieMediaFetchIntegration) {
                synchronized (zik.class) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } else {
            onesieMediaFetchIntegration = null;
        }
        PlaybackControllerWrapper playbackControllerWrapperZ = z(zcfVar, K(zcfVar, handler, onesieMediaFetchIntegration), z, onesieMediaFetchIntegration);
        if (playbackControllerWrapperZ == null) {
            return null;
        }
        long j2 = zcfVar.g;
        Time time = (zcfVar.A.B() || j2 == zcfVar.H.v()) ? null : new Time(j2, 1000L);
        long j3 = zcfVar.e;
        Time time2 = j3 != -1 ? new Time(j3, 1000L) : null;
        long j4 = zcfVar.f;
        Time time3 = j4 != -1 ? new Time(j4, 1000L) : null;
        synchronized (zik.class) {
            playbackController = playbackControllerWrapperZ.a;
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
            this.c.l(new ClipWrapper(zcfVar, playbackControllerWrapperZ, videoClip));
            zcfVar.d.j = new zcl() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda21
                @Override // defpackage.zcl
                public final void a(zgi zgiVar) {
                    this.a.E(zcfVar, zgiVar);
                }
            };
            return playbackControllerWrapperZ.b;
        }
        QoeError error = videoClipOrErrorQueueVideoClip.getError();
        ErrorHandler errorHandler = this.b;
        if (error != null) {
            errorHandler.e(error, zcfVar);
            return null;
        }
        zhv zhvVar = new zhv("invalid.parameter");
        zhvVar.c = "c.queueClip.0";
        zhvVar.e = true;
        errorHandler.c(zhvVar.a(), zcfVar);
        return null;
    }

    private static PlaybackAgnosticUserPreferences I(zcf zcfVar, ajhj ajhjVar, int i) {
        yoe yoeVarC = zcfVar.c();
        return yno.B(yoeVarC.h(), ahno.Z(yoeVarC.d()), ajhjVar, yoeVarC.b(), i);
    }

    private static ViewportSize J(zkk zkkVar) {
        zkj zkjVar = (zkj) zkkVar.io();
        return new ViewportSize(zkjVar.c, zkjVar.d);
    }

    private final PlaybackControllerWrapperHolder K(zcf zcfVar, Handler handler, OnesieMediaFetchIntegration onesieMediaFetchIntegration) {
        BufferManagerImpl bufferManagerImplC;
        ClipQueue clipQueue = this.c;
        PlaybackControllerWrapper playbackControllerWrapperF = clipQueue.f(zcfVar.a);
        String strJ = zcfVar.j();
        zjr zjrVar = this.g;
        if (zjrVar.aI()) {
            ywn ywnVar = zcfVar.Z;
            ywnVar.l("rpcw", playbackControllerWrapperF != null ? "1" : "0");
            if (onesieMediaFetchIntegration != null) {
                BufferManagerImpl bufferManagerImplC2 = onesieMediaFetchIntegration.c();
                if (bufferManagerImplC2 != null) {
                    ywnVar.l("oheb", "1;v." + bufferManagerImplC2.getBufferedPosition(jqz.TRACK_TYPE_VIDEO.d).a() + ";a." + bufferManagerImplC2.getBufferedPosition(jqz.TRACK_TYPE_AUDIO.d).a());
                } else {
                    ywnVar.l("oheb", "0");
                }
            }
        }
        if (playbackControllerWrapperF != null || onesieMediaFetchIntegration == null || (bufferManagerImplC = onesieMediaFetchIntegration.c()) == null) {
            bufferManagerImplC = this.k.c(zcfVar);
        }
        BufferManagerImpl bufferManagerImpl = bufferManagerImplC;
        Factories factories = this.k;
        MediaPushMediaSource mediaPushMediaSourceF = Factories.f(zcfVar, bufferManagerImpl, handler);
        mediaPushMediaSourceF.m = clipQueue.p();
        zfp zfpVar = zcfVar.S;
        zfs zfsVar = this.q;
        ywn ywnVar2 = zcfVar.Z;
        PlatypusProofOfOriginTokenManager platypusProofOfOriginTokenManager = new PlatypusProofOfOriginTokenManager(zfsVar, ywnVar2, zcfVar.j(), zjrVar);
        byte[] bArr = zcfVar.T != null ? zcfVar.T : new byte[0];
        PlaybackControllerWrapper playbackControllerWrapperB = factories.b(zcfVar, mediaPushMediaSourceF, bufferManagerImpl, this);
        yhu yhuVarB = null;
        yhq yhqVarA = yno.j(zcfVar) ? this.e.a(strJ, ywnVar2, playbackControllerWrapperB) : null;
        if (yno.j(zcfVar) && zcfVar.H.W().g) {
            yhuVarB = this.e.b(strJ, ywnVar2, playbackControllerWrapperB);
        }
        return new PlaybackControllerWrapperHolder(playbackControllerWrapperB, yhqVarA, yhuVarB, bufferManagerImpl, strJ, zfpVar, platypusProofOfOriginTokenManager, bArr);
    }

    private final void L(boolean z, Runnable runnable) {
        if (z) {
            this.o.schedule(afwl.i(runnable));
        } else {
            synchronized (zik.class) {
                runnable.run();
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper.Callbacks
    public final ListenableFuture A(PlaybackControllerWrapper playbackControllerWrapper) {
        return this.i.F(playbackControllerWrapper.e);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper.Callbacks
    public final void B(PlaybackControllerWrapper playbackControllerWrapper) {
        ClipWrapper clipWrapperC = this.c.c();
        if (clipWrapperC == null || clipWrapperC.b != playbackControllerWrapper) {
            return;
        }
        zcf zcfVar = playbackControllerWrapper.e;
        zcj zcjVar = this.i;
        if (true != this.g.bD()) {
            zcfVar = null;
        }
        zcjVar.ae(zcfVar);
    }

    public final void C(zgi zgiVar) {
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

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper.Callbacks
    public final void D(PlaybackControllerWrapper playbackControllerWrapper, long j) {
        zcf zcfVar = playbackControllerWrapper.e;
        zhq zhqVar = zhq.ABR;
        ClipWrapper clipWrapperC = this.c.c();
        if (clipWrapperC == null || clipWrapperC.b != playbackControllerWrapper) {
            return;
        }
        final Time time = j == Long.MAX_VALUE ? Time.b : new Time(j, 1000000L);
        L(this.g.dP(), new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.onSeek(time);
            }
        });
    }

    public final void E(final zcf zcfVar, final zgi zgiVar) {
        zjr zjrVar = zcfVar.H;
        if (zjrVar.dL()) {
            this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
                    ClipWrapper clipWrapperC = asyncMediaFetchControllerWrapper.c.c();
                    if (clipWrapperC != null) {
                        if (clipWrapperC.a.equals(zcfVar)) {
                            zgi zgiVar2 = zgiVar;
                            MediaFetchController mediaFetchController = asyncMediaFetchControllerWrapper.a;
                            int i = zgiVar2.l;
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            mediaFetchController.onPlayerState(i2);
                        }
                    }
                }
            }));
            return;
        }
        ClipWrapper clipWrapperC = this.c.c();
        if (clipWrapperC == null || !clipWrapperC.a.equals(zcfVar)) {
            return;
        }
        if (zjrVar.dP()) {
            this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zgiVar.l;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    this.a.a.onPlayerState(i2);
                }
            }));
        } else if (zjrVar.dQ()) {
            yno.S(this.n, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.C(zgiVar);
                }
            }, 0L, zcfVar.Z, null, "Failed to notifyPlayerStateChange");
        } else {
            C(zgiVar);
        }
    }

    public final void F() {
        zhq zhqVar = zhq.ABR;
        zjr zjrVar = this.g;
        final boolean zBR = zjrVar.bR();
        if (zjrVar.dL()) {
            ClipQueue clipQueue = this.c;
            List list = clipQueue.a;
            final agke agkeVarP = agke.p((ClipWrapper[]) list.toArray(new ClipWrapper[0]));
            list.clear();
            final Set setK = clipQueue.k(agkeVarP);
            ExecutorImpl executorImpl = this.o;
            final Set setJ = clipQueue.j();
            executorImpl.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
                    MediaFetchController mediaFetchController = asyncMediaFetchControllerWrapper.a;
                    mediaFetchController.truncateQueue(0);
                    if (asyncMediaFetchControllerWrapper.g.bI()) {
                        if (zBR) {
                            mediaFetchController.restartPrefetchEvaluationThreadsafe(RestartPrefetchEvaluationSource.TRUNCATE_QUEUE);
                        } else {
                            mediaFetchController.restartPrefetchEvaluation(RestartPrefetchEvaluationSource.TRUNCATE_QUEUE);
                        }
                    }
                    Set set = setJ;
                    Set set2 = setK;
                    Iterable$EL.forEach(agkeVarP, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda4());
                    Iterable$EL.forEach(set2, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda5());
                    Iterable$EL.forEach(set, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda5());
                }
            }));
            this.r = true;
            return;
        }
        synchronized (zik.class) {
            MediaFetchController mediaFetchController = this.a;
            mediaFetchController.truncateQueue(0);
            if (!zBR && zjrVar.bI()) {
                mediaFetchController.restartPrefetchEvaluation(RestartPrefetchEvaluationSource.TRUNCATE_QUEUE);
            }
        }
        if (zBR && this.g.bI()) {
            this.a.restartPrefetchEvaluationThreadsafe(RestartPrefetchEvaluationSource.TRUNCATE_QUEUE);
        }
        this.c.m();
        this.r = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ytp
    public final cno a(zcf zcfVar, boolean z, Handler handler, ytw ytwVar) {
        afvx afvxVarAd = tym.ad(trx.MEDIA_FETCH_LOAD_VIDEO);
        try {
            F();
            cno cnoVarH = H(-1L, zcfVar, z, handler, ytwVar);
            afvxVarAd.close();
            return cnoVarH;
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ytp
    public final cno b(long j, zcf zcfVar, boolean z, Handler handler, ytw ytwVar) {
        afvx afvxVarAd = tym.ad(trx.MEDIA_FETCH_QUEUE_VIDEO);
        try {
            cno cnoVarH = H(j, zcfVar, z, handler, ytwVar);
            afvxVarAd.close();
            return cnoVarH;
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ytp
    public final zcf c(String str, long j, long j2) {
        return this.c.g(str, j, j2);
    }

    @Override // defpackage.ytp
    public final void d(zcf zcfVar) {
        final PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF != null) {
            L(this.g.l.m(61, 45779725L), new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda33
                @Override // java.lang.Runnable
                public final void run() {
                    playbackControllerWrapperF.c();
                }
            });
        }
    }

    @Override // defpackage.ytp
    public final void e() {
        final agke agkeVar;
        if (!this.g.dL()) {
            synchronized (zik.class) {
                this.a.truncateQueue(1);
            }
            this.r = true;
            this.c.r();
            return;
        }
        ClipQueue clipQueue = this.c;
        List list = clipQueue.a;
        if (list.size() <= 1) {
            agkeVar = agpi.a;
        } else {
            List listSubList = list.subList(1, list.size());
            agke agkeVarN = agke.n(listSubList);
            listSubList.clear();
            agkeVar = agkeVarN;
        }
        ExecutorImpl executorImpl = this.o;
        final Set setK = clipQueue.k(agkeVar);
        executorImpl.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.truncateQueue(1);
                Iterable$EL.forEach(agkeVar, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda4());
                Iterable$EL.forEach(setK, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda5());
            }
        }));
        this.r = true;
    }

    @Override // defpackage.ytp
    public final void f(boolean z) {
        if (z) {
            this.a.onQueuingCompletedThreadsafe();
            return;
        }
        zjr zjrVar = this.g;
        boolean z2 = true;
        if (!zjrVar.dP() && !zjrVar.dO()) {
            z2 = false;
        }
        final MediaFetchController mediaFetchController = this.a;
        mediaFetchController.getClass();
        L(z2, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                mediaFetchController.onQueuingCompleted();
            }
        });
    }

    @Override // defpackage.ytp
    public final void g(zeh zehVar) {
        zjr zjrVar = this.g;
        if (zjrVar.dM()) {
            avlr avlrVarAc = zjrVar.ac();
            ExecutorImpl executorImpl = this.o;
            avmb avmbVar = awlg.a;
            avlrVarAc.O(new awir(executorImpl)).ag(new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda0(this), new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda24());
            this.s.p().L(new awir(executorImpl)).al(new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda1(this), new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda24());
        }
        yoq yoqVar = zehVar.e;
        PlaybackAgnosticUserPreferences playbackAgnosticUserPreferencesB = yno.B(yoqVar.c(), yoqVar.b(), zjrVar.u.a(null), yoqVar.a(), G());
        synchronized (zik.class) {
            this.a.setPlaybackAgnosticUserPreferences(playbackAgnosticUserPreferencesB);
        }
    }

    @Override // defpackage.ytp
    public final void h() {
        if (!this.g.dP()) {
            yno.S(this.n, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
                    synchronized (zik.class) {
                        asyncMediaFetchControllerWrapper.a.onAppEnterBackground();
                    }
                }
            }, 0L, null, this.p, "Failed to notify onAppEnterBackground");
            return;
        }
        ExecutorImpl executorImpl = this.o;
        final MediaFetchController mediaFetchController = this.a;
        mediaFetchController.getClass();
        executorImpl.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                mediaFetchController.onAppEnterBackground();
            }
        }));
    }

    @Override // defpackage.ytp
    public final void i(final zcf zcfVar, final boolean z) {
        boolean zV;
        zjr zjrVar = this.g;
        boolean zM = zjrVar.l.m(59, 45779717L);
        ClipQueue clipQueue = this.c;
        if (zM) {
            String str = zcfVar.a;
            final PlaybackControllerWrapper playbackControllerWrapperF = clipQueue.f(str);
            if (playbackControllerWrapperF != null) {
                final PlaybackAgnosticUserPreferences playbackAgnosticUserPreferencesI = I(zcfVar, zjrVar.u.a(str), G());
                this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda27
                    @Override // java.lang.Runnable
                    public final void run() {
                        final AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
                        asyncMediaFetchControllerWrapper.a.setPlaybackAgnosticUserPreferences(playbackAgnosticUserPreferencesI);
                        final zcf zcfVar2 = zcfVar;
                        Runnable runnableI = afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda19
                            @Override // java.lang.Runnable
                            public final void run() {
                                AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper2 = asyncMediaFetchControllerWrapper;
                                asyncMediaFetchControllerWrapper2.i.ae(true != asyncMediaFetchControllerWrapper2.g.bD() ? null : zcfVar2);
                            }
                        });
                        PlaybackControllerWrapper playbackControllerWrapper = playbackControllerWrapperF;
                        boolean zIsEmpty = playbackControllerWrapper.b().isEmpty();
                        PlaybackController playbackController = playbackControllerWrapper.a;
                        if (playbackController != null) {
                            if (playbackControllerWrapper.e.H.aK() && playbackControllerWrapper.e.y.aD()) {
                                playbackControllerWrapper.p();
                                playbackControllerWrapper.c.h(jqz.TRACK_TYPE_AUDIO, playbackControllerWrapper.b.e + (playbackControllerWrapper.e.H.w() * 1000));
                            } else {
                                playbackControllerWrapper.d(jqz.TRACK_TYPE_AUDIO, "track_change");
                            }
                            boolean z2 = z;
                            playbackController.setSelectedAudioFormats(playbackControllerWrapper.e.c().f());
                            if (z2) {
                                playbackControllerWrapper.d(jqz.TRACK_TYPE_VIDEO, "audio_change");
                                playbackController.setSelectedVideoFormats(playbackControllerWrapper.e.c().g());
                            }
                            if (zIsEmpty) {
                                return;
                            }
                            runnableI.run();
                        }
                    }
                }));
                return;
            }
            return;
        }
        String str2 = zcfVar.a;
        PlaybackControllerWrapper playbackControllerWrapperF2 = clipQueue.f(str2);
        if (playbackControllerWrapperF2 != null) {
            final PlaybackAgnosticUserPreferences playbackAgnosticUserPreferencesI2 = I(zcfVar, zjrVar.u.a(str2), G());
            L(zjrVar.dP(), new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.setPlaybackAgnosticUserPreferences(playbackAgnosticUserPreferencesI2);
                }
            });
            synchronized (zik.class) {
                zV = playbackControllerWrapperF2.v(z);
            }
            if (zV) {
                this.i.ae(true != this.g.bD() ? null : zcfVar);
            }
        }
    }

    @Override // defpackage.ytp
    public final void j() {
        final MediaFetchController mediaFetchController = this.a;
        boolean zDP = this.g.dP();
        mediaFetchController.getClass();
        L(zDP, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                mediaFetchController.onStuckPlayback();
            }
        });
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
            com.google.android.libraries.youtube.media.interfaces.MediaFetchCallbacks r9 = r9.h     // Catch: java.lang.Throwable -> L58
            r3 = 0
            r4 = r9
            com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$MediaFetchCallbacksImpl r4 = (com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper.MediaFetchCallbacksImpl) r4     // Catch: java.lang.Throwable -> L36
            com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper r4 = com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper.this     // Catch: java.lang.Throwable -> L36
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
            com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$MediaFetchCallbacksImpl r9 = (com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper.MediaFetchCallbacksImpl) r9     // Catch: java.lang.Throwable -> L58
            com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper r9 = com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper.this     // Catch: java.lang.Throwable -> L58
            com.google.android.libraries.youtube.media.player.exo2.platypus.ErrorHandler r5 = r9.b     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = "fail to getCurrentPlaybackPosition"
            r5.b(r4, r6)     // Catch: java.lang.Throwable -> L58
            zjr r9 = r9.g     // Catch: java.lang.Throwable -> L58
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper.jx(com.google.android.libraries.youtube.media.interfaces.Time):boolean");
    }

    @Override // defpackage.ytp
    public final void k(final zcf zcfVar, final boolean z) {
        boolean zX;
        boolean zM = this.g.l.m(58, 45779716L);
        ClipQueue clipQueue = this.c;
        if (zM) {
            final PlaybackControllerWrapper playbackControllerWrapperF = clipQueue.f(zcfVar.a);
            if (playbackControllerWrapperF != null) {
                this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda34
                    @Override // java.lang.Runnable
                    public final void run() {
                        final AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
                        final zcf zcfVar2 = zcfVar;
                        Runnable runnableI = afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda29
                            @Override // java.lang.Runnable
                            public final void run() {
                                AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper2 = asyncMediaFetchControllerWrapper;
                                asyncMediaFetchControllerWrapper2.i.ae(true != asyncMediaFetchControllerWrapper2.g.bD() ? null : zcfVar2);
                            }
                        });
                        PlaybackControllerWrapper playbackControllerWrapper = playbackControllerWrapperF;
                        boolean zIsEmpty = playbackControllerWrapper.b().isEmpty();
                        PlaybackController playbackController = playbackControllerWrapper.a;
                        if (playbackController != null) {
                            if (z) {
                                playbackControllerWrapper.d(jqz.TRACK_TYPE_VIDEO, "track_change");
                            }
                            playbackController.setSelectedVideoFormats(playbackControllerWrapper.e.c().g());
                            if (zIsEmpty) {
                                return;
                            }
                            runnableI.run();
                        }
                    }
                }));
                return;
            }
            return;
        }
        PlaybackControllerWrapper playbackControllerWrapperF2 = clipQueue.f(zcfVar.a);
        if (playbackControllerWrapperF2 != null) {
            synchronized (zik.class) {
                zX = playbackControllerWrapperF2.x(z);
            }
            if (zX) {
                zcj zcjVar = this.i;
                if (true != this.g.bD()) {
                    zcfVar = null;
                }
                zcjVar.ae(zcfVar);
            }
        }
    }

    @Override // defpackage.ytp
    public final void l() {
        final Set setJ = this.c.j();
        if (setJ.isEmpty()) {
            return;
        }
        if (this.g.dL()) {
            this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    Iterable$EL.forEach(setJ, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda5());
                }
            }));
        } else {
            Iterable$EL.forEach(setJ, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda5());
        }
    }

    @Override // defpackage.ytp
    public final void m(final RestartPrefetchEvaluationSource restartPrefetchEvaluationSource, boolean z) {
        if (z) {
            this.a.restartPrefetchEvaluationThreadsafe(restartPrefetchEvaluationSource);
            return;
        }
        zjr zjrVar = this.g;
        if (zjrVar.dO() || zjrVar.dP()) {
            this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.restartPrefetchEvaluation(restartPrefetchEvaluationSource);
                }
            }));
        } else {
            yno.S(this.n, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
                    RestartPrefetchEvaluationSource restartPrefetchEvaluationSource2 = restartPrefetchEvaluationSource;
                    synchronized (zik.class) {
                        asyncMediaFetchControllerWrapper.a.restartPrefetchEvaluation(restartPrefetchEvaluationSource2);
                    }
                }
            }, 0L, null, this.p, "Failed to restart prefetch evaluation");
        }
    }

    @Override // defpackage.ytp
    public final void n(zcf zcfVar, final boolean z) {
        final PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF != null) {
            zjr zjrVar = this.g;
            if (zjrVar.dP() || zjrVar.l.m(64, 45779728L)) {
                this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        playbackControllerWrapperF.n(z);
                    }
                }));
            } else {
                synchronized (zik.class) {
                    playbackControllerWrapperF.n(z);
                }
            }
        }
    }

    @Override // defpackage.ytp
    public final void o(final zcf zcfVar) {
        final PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF != null) {
            if (this.g.l.m(62, 45779726L)) {
                this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        playbackControllerWrapperF.o(zcfVar.p);
                    }
                }));
            } else {
                playbackControllerWrapperF.o(zcfVar.p);
            }
        }
    }

    @Override // defpackage.ytp
    public final void p(boolean z) {
        if (z) {
            this.a.onQueuingStarted();
            return;
        }
        zjr zjrVar = this.g;
        boolean z2 = true;
        if (!zjrVar.dP() && !zjrVar.dO()) {
            z2 = false;
        }
        final MediaFetchController mediaFetchController = this.a;
        mediaFetchController.getClass();
        L(z2, new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                mediaFetchController.onQueuingStarted();
            }
        });
    }

    @Override // defpackage.ytp
    public final void q(ywn ywnVar, zcj zcjVar) {
        if (this.c.p()) {
            return;
        }
        F();
    }

    @Override // defpackage.ytp
    public final void r(zcf zcfVar, boolean z) {
        x(zcfVar, false);
    }

    @Override // defpackage.ytp
    public final void s(final zcf zcfVar) {
        if (this.g.l.m(63, 45779727L)) {
            this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda30
                @Override // java.lang.Runnable
                public final void run() {
                    ClipQueue clipQueue = this.a.c;
                    zcf zcfVar2 = zcfVar;
                    PlaybackControllerWrapper playbackControllerWrapperF = clipQueue.f(zcfVar2.a);
                    if (playbackControllerWrapperF != null) {
                        playbackControllerWrapperF.t(zcfVar2.R);
                    }
                }
            }));
            return;
        }
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
        if (!this.g.bD()) {
            return jx(new Time(duration.toMillis(), 1000L));
        }
        PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        return playbackControllerWrapperF != null && playbackControllerWrapperF.u(zcfVar, duration);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        zkk zkkVar = this.m;
        if (observable == zkkVar) {
            zjr zjrVar = this.g;
            final ViewportSize viewportSizeJ = J(zkkVar);
            L(zjrVar.dP(), new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onViewportSizeChange(viewportSizeJ);
                }
            });
        }
    }

    @Override // defpackage.ytp
    public final boolean v(final boolean z, final Runnable runnable, final boolean z2) {
        zjr zjrVar = this.g;
        if (zjrVar.bv()) {
            this.c.n(new Consumer() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda25
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void r(Object obj) {
                    PlaybackControllerWrapper playbackControllerWrapper = (PlaybackControllerWrapper) obj;
                    boolean z3 = playbackControllerWrapper.f;
                    boolean z4 = z;
                    if (z3 != z4) {
                        playbackControllerWrapper.f = z4;
                        PlaybackController playbackController = playbackControllerWrapper.a;
                        if (playbackController == null || !playbackControllerWrapper.e.H.bv()) {
                            return;
                        }
                        playbackController.setHasMediaView(z4);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        boolean zW = false;
        if (zjrVar.dL()) {
            this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    agke agkeVarH = this.a.c.h();
                    ClipWrapper clipWrapper = agkeVarH.isEmpty() ? null : (ClipWrapper) agkeVarH.get(0);
                    Runnable runnable2 = runnable;
                    boolean z3 = z2;
                    if (clipWrapper == null) {
                        if (z3) {
                            runnable2.run();
                            return;
                        }
                        return;
                    }
                    final boolean z4 = z;
                    PlaybackControllerWrapper playbackControllerWrapper = clipWrapper.b;
                    zjr zjrVar2 = clipWrapper.a.H;
                    boolean zW2 = playbackControllerWrapper.w(z4);
                    if (zjrVar2.di() && z4) {
                        playbackControllerWrapper.b.K();
                    }
                    HashSet hashSet = new HashSet();
                    int i = ((agpi) agkeVarH).d;
                    for (int i2 = 0; i2 < i; i2++) {
                        hashSet.add(((ClipWrapper) agkeVarH.get(i2)).b);
                    }
                    Iterable$EL.forEach(hashSet, new Consumer() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda8
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void r(Object obj) {
                            ((PlaybackControllerWrapper) obj).w(z4);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (zW2 || z3) {
                        runnable2.run();
                    }
                }
            }));
        } else {
            boolean zDN = zjrVar.dN();
            ClipQueue clipQueue = this.c;
            if (zDN) {
                final agke agkeVarH = clipQueue.h();
                if (!agkeVarH.isEmpty()) {
                    this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda32
                        @Override // java.lang.Runnable
                        public final void run() {
                            agke agkeVar;
                            boolean z3;
                            int i = 0;
                            boolean zW2 = false;
                            while (true) {
                                agkeVar = agkeVarH;
                                z3 = z;
                                if (i >= ((agpi) agkeVar).d) {
                                    break;
                                }
                                zW2 |= ((ClipWrapper) agkeVar.get(i)).b.w(z3);
                                i++;
                            }
                            ClipWrapper clipWrapper = (ClipWrapper) agkeVar.get(0);
                            if (clipWrapper.a.H.di() && z3) {
                                clipWrapper.b.b.K();
                            }
                            if (zW2 || z2) {
                                runnable.run();
                            }
                        }
                    }));
                } else if (z2) {
                    runnable.run();
                }
            } else {
                ClipWrapper clipWrapperC = clipQueue.c();
                if (clipWrapperC != null) {
                    synchronized (zik.class) {
                        zW = clipWrapperC.b.w(z);
                    }
                    if (clipWrapperC.a.H.di() && z) {
                        clipWrapperC.b.b.K();
                    }
                    this.c.n(new Consumer() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda23
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
                }
            }
        }
        return zW;
    }

    @Override // defpackage.ytp
    public final void w() {
        this.r = false;
    }

    @Override // defpackage.ytp
    public final void x(final zcf zcfVar, boolean z) {
        zjr zjrVar = this.g;
        final boolean zBR = zjrVar.bR();
        boolean zDL = zjrVar.dL();
        boolean z2 = false;
        if (z && zjrVar.bD()) {
            z2 = true;
        }
        final boolean z3 = z2;
        zhq zhqVar = zhq.ABR;
        final ClipWrapper clipWrapperD = this.c.d(zcfVar);
        if (clipWrapperD == null) {
            zcfVar.Z.k(new zhz("invalid.parameter", zcfVar.g, "Playback not in queue"));
            return;
        }
        clipWrapperD.b.b.J();
        if (zDL) {
            final ClipQueue.TransitionResult transitionResultB = this.c.b(clipWrapperD, z3);
            if (transitionResultB != null) {
                this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda22
                    @Override // java.lang.Runnable
                    public final void run() {
                        zcf zcfVar2 = zcfVar;
                        VideoClip videoClip = clipWrapperD.c;
                        if (videoClip == null) {
                            zcfVar2.Z.k(new zhz("player.exception", zcfVar2.g, new IllegalStateException("VideoClip.null")));
                            return;
                        }
                        AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
                        MediaFetchController mediaFetchController = asyncMediaFetchControllerWrapper.a;
                        if (!mediaFetchController.transitionToQueuedClip(videoClip)) {
                            ywn ywnVar = zcfVar2.Z;
                            zhz zhzVar = new zhz("player.exception", zcfVar2.g, new IllegalStateException("VideoClip.transitionToQueuedClip failed"));
                            zhzVar.o();
                            ywnVar.k(zhzVar);
                            return;
                        }
                        if (asyncMediaFetchControllerWrapper.g.bI()) {
                            if (zBR) {
                                mediaFetchController.restartPrefetchEvaluationThreadsafe(RestartPrefetchEvaluationSource.TRANSITION_TO_QUEUED_CLIP);
                            } else {
                                mediaFetchController.restartPrefetchEvaluation(RestartPrefetchEvaluationSource.TRANSITION_TO_QUEUED_CLIP);
                            }
                        }
                        boolean z4 = z3;
                        ClipQueue.TransitionResult transitionResult = transitionResultB;
                        Iterable$EL.forEach(transitionResult.a, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda4());
                        if (z4) {
                            return;
                        }
                        Iterable$EL.forEach(transitionResult.b, new AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda5());
                    }
                }));
                return;
            }
            ywn ywnVar = zcfVar.Z;
            zhz zhzVar = new zhz("player.exception", zcfVar.g, new IllegalStateException("ClipQueue.transitionClips failed"));
            zhzVar.o();
            ywnVar.k(zhzVar);
            return;
        }
        VideoClip videoClip = clipWrapperD.c;
        if (videoClip == null) {
            zcfVar.Z.k(new zhz("player.exception", zcfVar.g, new IllegalStateException("VideoClip.null")));
            return;
        }
        synchronized (zik.class) {
            MediaFetchController mediaFetchController = this.a;
            if (!mediaFetchController.transitionToQueuedClip(videoClip)) {
                ywn ywnVar2 = zcfVar.Z;
                zhz zhzVar2 = new zhz("player.exception", zcfVar.g, new IllegalStateException("VideoClip.transitionToQueuedClip failed"));
                zhzVar2.o();
                ywnVar2.k(zhzVar2);
                return;
            }
            if (!zBR && zjrVar.bI()) {
                mediaFetchController.restartPrefetchEvaluation(RestartPrefetchEvaluationSource.TRANSITION_TO_QUEUED_CLIP);
            }
            if (zBR && this.g.bI()) {
                this.a.restartPrefetchEvaluationThreadsafe(RestartPrefetchEvaluationSource.TRANSITION_TO_QUEUED_CLIP);
            }
            if (this.c.q(clipWrapperD, z3)) {
                return;
            }
            ywn ywnVar3 = zcfVar.Z;
            zhz zhzVar3 = new zhz("player.exception", zcfVar.g, new IllegalStateException("ClipQueue.transitionToClip failed"));
            zhzVar3.o();
            ywnVar3.k(zhzVar3);
        }
    }

    @Override // defpackage.ytp
    public final void y(final acca accaVar, zcf zcfVar) {
        final PlaybackControllerWrapper playbackControllerWrapperF = this.c.f(zcfVar.a);
        if (playbackControllerWrapperF == null) {
            zcfVar.Z.w("ctsnpcw", "track:".concat(String.valueOf(accaVar != null ? accaVar.n : "null")));
        } else if (this.g.l.m(60, 45779724L)) {
            this.o.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    playbackControllerWrapperF.B(accaVar);
                }
            }));
        } else {
            playbackControllerWrapperF.B(accaVar);
        }
    }

    public final PlaybackControllerWrapper z(zcf zcfVar, PlaybackControllerWrapperHolder playbackControllerWrapperHolder, boolean z, OnesieMediaFetchIntegration onesieMediaFetchIntegration) {
        String str;
        PlaybackControllerOrError playbackControllerOrErrorCreatePlaybackController;
        zhq zhqVar = zhq.ABR;
        String str2 = playbackControllerWrapperHolder.e;
        String str3 = zcfVar.a;
        yhq yhqVar = playbackControllerWrapperHolder.b;
        yhu yhuVar = playbackControllerWrapperHolder.c;
        PlatypusProofOfOriginTokenManager platypusProofOfOriginTokenManager = playbackControllerWrapperHolder.g;
        byte[] bArr = playbackControllerWrapperHolder.h;
        BufferManagerImpl bufferManagerImpl = playbackControllerWrapperHolder.d;
        PlaybackControllerWrapper playbackControllerWrapper = playbackControllerWrapperHolder.a;
        synchronized (zik.class) {
            OnesieResponseParams onesieResponseParamsB = onesieMediaFetchIntegration != null ? onesieMediaFetchIntegration.b() : null;
            if (onesieResponseParamsB == null) {
                str = "n";
            } else {
                str = onesieResponseParamsB.getIsActive() ? "1" : "0";
            }
            ywn ywnVar = zcfVar.Z;
            ywnVar.l("poa", str);
            MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesB = zcfVar.b();
            if (mediaCapabilitiesOuterClass$MediaCapabilitiesB != null) {
                this.a.setMediaCapabilities(mediaCapabilitiesOuterClass$MediaCapabilitiesB);
            }
            MediaFetchController mediaFetchController = this.a;
            Factories factories = this.k;
            MediaFetchPlayerConfig mediaFetchPlayerConfigE = Factories.e(zcfVar);
            StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = zcfVar.A.d;
            ytl ytlVar = new ytl(ywnVar, this.p, this.g);
            ytk ytkVarA = factories.a(zcfVar);
            NetFetch netFetchA = this.l.a(zcfVar, this.o);
            zfp zfpVar = playbackControllerWrapperHolder.f;
            playbackControllerOrErrorCreatePlaybackController = mediaFetchController.createPlaybackController(playbackControllerWrapper, mediaFetchPlayerConfigE, streamingDataOuterClass$StreamingData, str2, bufferManagerImpl, ytlVar, ytkVarA, netFetchA, str3, zfpVar != null ? zfpVar.b : new byte[0], platypusProofOfOriginTokenManager, bArr, Factories.d(zcfVar), onesieResponseParamsB, null, yhqVar, yhuVar, zcfVar.A.E(), zcfVar.s(), mediaCapabilitiesOuterClass$MediaCapabilitiesB);
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
            return null;
        }
        if (onesieMediaFetchIntegration instanceof LegacyOnesieMediaFetchIntegration) {
        }
        synchronized (zik.class) {
            zcc zccVarB = playbackControllerWrapper.e.C.b();
            zcc zccVar = zcc.b;
            playbackControllerWrapper.f(z, zccVarB == zccVar);
            if (playbackControllerWrapper.e.C.b() != zccVar) {
                playbackControllerWrapper.r();
            }
            playbackControllerWrapper.e(playback, onesieMediaFetchIntegration, yhqVar, yhuVar, playbackControllerWrapper.e.C.b() == zccVar);
        }
        if (zcfVar.R == null) {
            return playbackControllerWrapper;
        }
        synchronized (zik.class) {
            playbackControllerWrapper.t(zcfVar.R);
        }
        return playbackControllerWrapper;
    }
}
