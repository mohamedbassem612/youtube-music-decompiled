package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qtz {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean a;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    private boolean aI;
    private boolean aJ;
    private boolean aK;
    private boolean aL;
    private boolean aM;
    private boolean aN;
    private int aO;
    private int aP;
    private int aQ;
    private boolean aa;
    private boolean ab;
    private int ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private Duration ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private Duration an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private long as;
    private boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private long ax;
    private boolean ay;
    private boolean az;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    public final void A(boolean z) {
        this.L = z;
        this.aP |= 32;
    }

    public final void B(boolean z) {
        this.aE = z;
        this.aQ |= 65536;
    }

    public final void C(boolean z) {
        this.aC = z;
        this.aQ |= 16384;
    }

    public final void D(boolean z) {
        this.A = z;
        this.aO |= 67108864;
    }

    public final void E(boolean z) {
        this.aj = z;
        this.aP |= 268435456;
    }

    public final void F(boolean z) {
        this.aK = z;
        this.aQ |= 16777216;
    }

    public final void G(boolean z) {
        this.S = z;
        this.aP |= SemanticState.Obscured;
    }

    public final void H(boolean z) {
        this.C = z;
        this.aO |= 268435456;
    }

    public final void I(boolean z) {
        this.Q = z;
        this.aP |= SemanticState.ReadOnly;
    }

    public final void J(boolean z) {
        this.U = z;
        this.aP |= 16384;
    }

    public final void K(boolean z) {
        this.h = z;
        this.aO |= SemanticState.Focused;
    }

    public final void L(boolean z) {
        this.aL = z;
        this.aQ |= 33554432;
    }

    public final void M(boolean z) {
        this.D = z;
        this.aO |= 536870912;
    }

    public final void N(boolean z) {
        this.aG = z;
        this.aQ |= 524288;
    }

    public final void O(boolean z) {
        this.j = z;
        this.aO |= SemanticState.LiveRegion;
    }

    public final void P(boolean z) {
        this.c = z;
        this.aO |= 4;
    }

    public final void Q(boolean z) {
        this.Y = z;
        this.aP |= 262144;
    }

    public final void R(boolean z) {
        this.i = z;
        this.aO |= SemanticState.Hidden;
    }

    public final void S(boolean z) {
        this.Z = z;
        this.aP |= 524288;
    }

    public final void T(boolean z) {
        this.z = z;
        this.aO |= 33554432;
    }

    public final void U(boolean z) {
        this.J = z;
        this.aP |= 8;
    }

    public final void V(boolean z) {
        this.O = z;
        this.aP |= SemanticState.Hidden;
    }

    public final void W(boolean z) {
        this.aA = z;
        this.aQ |= SemanticState.Obscured;
    }

    public final void X() {
        this.aQ |= 8388608;
    }

    public final void Y(boolean z) {
        this.aq = z;
        this.aQ |= 4;
    }

    public final void Z(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null exoPlayerTextureSourceTaskTimeoutOffsetFromFiveSeconds");
        }
        this.an = duration;
    }

    public final qua a() {
        Duration duration;
        Duration duration2;
        if (this.aO == -1 && this.aP == -1 && this.aQ == 268435455 && (duration = this.ag) != null && (duration2 = this.an) != null) {
            return new qua(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, duration, this.ah, this.ai, this.aj, this.ak, this.al, this.am, duration2, this.ao, this.ap, this.aq, this.ar, this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aA, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG, this.aH, this.aI, this.aJ, this.aK, this.aL, this.aM, this.aN);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.aO & 1) == 0) {
            sb.append(" useDenoise24khzModel");
        }
        if ((this.aO & 2) == 0) {
            sb.append(" useBestEffortDecoder");
        }
        if ((this.aO & 4) == 0) {
            sb.append(" enableOverrideTimestampForFirstFrameAfterSeek");
        }
        if ((this.aO & 8) == 0) {
            sb.append(" useReadingPositionBasedMediaClockInDecoder");
        }
        if ((this.aO & 16) == 0) {
            sb.append(" usePostMixAudioLimiter");
        }
        if ((this.aO & 32) == 0) {
            sb.append(" disableFrameDroppingInMediaCodec");
        }
        if ((this.aO & 64) == 0) {
            sb.append(" increaseMaxFramesPerRendererInExport");
        }
        if ((this.aO & SemanticState.Focused) == 0) {
            sb.append(" enableKeyOperatingRateInMediaCodecForSpeedAdjustedVideos");
        }
        if ((this.aO & SemanticState.Hidden) == 0) {
            sb.append(" enableSeekToRelativePositionWhenAudioIsLooped");
        }
        if ((this.aO & SemanticState.LiveRegion) == 0) {
            sb.append(" enableMultiEffectProcessor");
        }
        if ((this.aO & SemanticState.ReadOnly) == 0) {
            sb.append(" useSharedCacheForRemoteSources");
        }
        if ((this.aO & SemanticState.Modal) == 0) {
            sb.append(" shareStandaloneDatabaseProvider");
        }
        if ((this.aO & SemanticState.Obscured) == 0) {
            sb.append(" useTexturePoolInXeno");
        }
        if ((this.aO & SemanticState.Multiline) == 0) {
            sb.append(" maxFramesInTransformerEncoder");
        }
        if ((this.aO & 16384) == 0) {
            sb.append(" useAudioTransmuxing");
        }
        if ((this.aO & 32768) == 0) {
            sb.append(" useVideoTransmuxing");
        }
        if ((this.aO & 65536) == 0) {
            sb.append(" skiaLayerSuggestedForPlayer");
        }
        if ((this.aO & 131072) == 0) {
            sb.append(" disableSharingWithCurrentGlContext");
        }
        if ((this.aO & 262144) == 0) {
            sb.append(" scopeMediaEngineExecutorToService");
        }
        if ((this.aO & 524288) == 0) {
            sb.append(" fixBlockingUpdatesForInitialLoad");
        }
        if ((this.aO & 1048576) == 0) {
            sb.append(" accelerateStartingMultipleLiveRenderers");
        }
        if ((this.aO & 2097152) == 0) {
            sb.append(" useExplicitStorageValidationForExport");
        }
        if ((this.aO & 4194304) == 0) {
            sb.append(" transformerEncoderFactoryOperatingRateMode");
        }
        if ((this.aO & 8388608) == 0) {
            sb.append(" clampStartTimeToSourceDuration");
        }
        if ((this.aO & 16777216) == 0) {
            sb.append(" allowUnseekableMedia");
        }
        if ((this.aO & 33554432) == 0) {
            sb.append(" enableSkiaLayersInPlayerOnLowMemorySignal");
        }
        if ((this.aO & 67108864) == 0) {
            sb.append(" enableConstantPowerMixing");
        }
        if ((this.aO & 134217728) == 0) {
            sb.append(" centralizeGlContextManagementInPlayer");
        }
        if ((this.aO & 268435456) == 0) {
            sb.append(" enableFontManagerWithPreBundledFonts");
        }
        if ((this.aO & 536870912) == 0) {
            sb.append(" enableLazyMetadataLoadInMcr");
        }
        if ((this.aO & 1073741824) == 0) {
            sb.append(" useEngineThreadForFlattening");
        }
        if ((this.aO & Integer.MIN_VALUE) == 0) {
            sb.append(" fixMediaEngineExecutorStop");
        }
        if ((this.aP & 1) == 0) {
            sb.append(" useExoPlayerMediaExtractor");
        }
        if ((this.aP & 2) == 0) {
            sb.append(" disableBackwardBufferingInSkiaLayers");
        }
        if ((this.aP & 4) == 0) {
            sb.append(" fixSegmentEndLookaheadExtension");
        }
        if ((this.aP & 8) == 0) {
            sb.append(" enableSoftwareEncoderFallbackForExport");
        }
        if ((this.aP & 16) == 0) {
            sb.append(" disableTransformerEncoderFallback");
        }
        if ((this.aP & 32) == 0) {
            sb.append(" enableAudioSegmentLookaheadDuringPlayback");
        }
        if ((this.aP & 64) == 0) {
            sb.append(" cleanUnreleasedDecodersOnClose");
        }
        if ((this.aP & SemanticState.Focused) == 0) {
            sb.append(" waitOnCpuBeforeReusingPoolTextureFrame");
        }
        if ((this.aP & SemanticState.Hidden) == 0) {
            sb.append(" enableVideoRendererRestartWhenDecoderTimedOut");
        }
        if ((this.aP & SemanticState.LiveRegion) == 0) {
            sb.append(" reportIfMultipleServicesActiveAtTheSameTime");
        }
        if ((this.aP & SemanticState.ReadOnly) == 0) {
            sb.append(" enableFrameDroppingBeforeDecodingSurface");
        }
        if ((this.aP & SemanticState.Modal) == 0) {
            sb.append(" usingFrameFitOnFittingCanvasSize");
        }
        if ((this.aP & SemanticState.Obscured) == 0) {
            sb.append(" enableExoPlayerDecodingEosHandlingFix");
        }
        if ((this.aP & SemanticState.Multiline) == 0) {
            sb.append(" passVideoDurationToMuxer");
        }
        if ((this.aP & 16384) == 0) {
            sb.append(" enableInlineSkiaLayers");
        }
        if ((this.aP & 32768) == 0) {
            sb.append(" applyTransformsUsingSkiaForTransitions");
        }
        if ((this.aP & 65536) == 0) {
            sb.append(" treatSurfaceSemaphoreTimeoutsAsUnrecoverable");
        }
        if ((this.aP & 131072) == 0) {
            sb.append(" logPlaybackIntervalMetricsInQosMonitor");
        }
        if ((this.aP & 262144) == 0) {
            sb.append(" enablePlayerMetricsV1");
        }
        if ((this.aP & 524288) == 0) {
            sb.append(" enableSeekToStartTimeOnMediaCompositionRendererBuilder");
        }
        if ((this.aP & 1048576) == 0) {
            sb.append(" sleepBeforeStartingExportTask");
        }
        if ((this.aP & 2097152) == 0) {
            sb.append(" allowUnseekableMediaInExoPlayerTextureSource");
        }
        if ((this.aP & 4194304) == 0) {
            sb.append(" extraMaxQueuedTexturesInVideoLayers");
        }
        if ((this.aP & 8388608) == 0) {
            sb.append(" useFrameOriginalTimestampForStreamInXenoEffectTextureProcessor");
        }
        if ((this.aP & 16777216) == 0) {
            sb.append(" disableZeroSizedSkiaCacheInPlayer");
        }
        if ((this.aP & 33554432) == 0) {
            sb.append(" logInitialCompositionOnPlayerLoad");
        }
        if (this.ag == null) {
            sb.append(" audioPlayerLookaheadDuration");
        }
        if ((this.aP & 67108864) == 0) {
            sb.append(" enableAudioPlaybackUnderrunLogging");
        }
        if ((this.aP & 134217728) == 0) {
            sb.append(" doNotPassColorInfoToEncoderFactory");
        }
        if ((this.aP & 268435456) == 0) {
            sb.append(" enableCropOptimizationForDownsampledFrame");
        }
        if ((this.aP & 536870912) == 0) {
            sb.append(" fixBlockingMcrUpdateWhenNoSegmentsArePresent");
        }
        if ((this.aP & 1073741824) == 0) {
            sb.append(" handleTransitionsInContentDrivenFrameClock");
        }
        if ((this.aP & Integer.MIN_VALUE) == 0) {
            sb.append(" enableAndroidCalculateFrameSizeForSegmentRenderers");
        }
        if (this.an == null) {
            sb.append(" exoPlayerTextureSourceTaskTimeoutOffsetFromFiveSeconds");
        }
        if ((this.aQ & 1) == 0) {
            sb.append(" forceSoftwareDecoderOnDecoderRetry");
        }
        if ((this.aQ & 2) == 0) {
            sb.append(" enableAndroidCompositionRuntimeExporter");
        }
        if ((this.aQ & 4) == 0) {
            sb.append(" exoPlayerLoadSelectedTracksOnly");
        }
        if ((this.aQ & 8) == 0) {
            sb.append(" postErrorsOnMainThreadWhenFailingDuringExportStart");
        }
        if ((this.aQ & 16) == 0) {
            sb.append(" exporterTimeoutLimitSeconds");
        }
        if ((this.aQ & 32) == 0) {
            sb.append(" disableTransformerMuxerWatchdogTimeout");
        }
        if ((this.aQ & 64) == 0) {
            sb.append(" gracefullyHandleOutOfOrderFramesInQtpc");
        }
        if ((this.aQ & SemanticState.Focused) == 0) {
            sb.append(" doNotTimeoutIfEngineIsStillProcessing");
        }
        if ((this.aQ & SemanticState.Hidden) == 0) {
            sb.append(" passCompositionTimeTimestampsToXeno");
        }
        if ((this.aQ & SemanticState.LiveRegion) == 0) {
            sb.append(" timestampOffsetForXenoWhenFrameTimestampsAreNotIncreasingUs");
        }
        if ((this.aQ & SemanticState.ReadOnly) == 0) {
            sb.append(" measureEffectProcessingTimeFromOutput");
        }
        if ((this.aQ & SemanticState.Modal) == 0) {
            sb.append(" enableAndroidExporterCompositionProto");
        }
        if ((this.aQ & SemanticState.Obscured) == 0) {
            sb.append(" enableXenoProcessorStopProcessingStatusCallbackOverride");
        }
        if ((this.aQ & SemanticState.Multiline) == 0) {
            sb.append(" releaseScrLockBeforeClosingRenderers");
        }
        if ((this.aQ & 16384) == 0) {
            sb.append(" enableComponentRendererStartupFutureFix");
        }
        if ((this.aQ & 32768) == 0) {
            sb.append(" logStreamCompositorFrameProcessingLatency");
        }
        if ((this.aQ & 65536) == 0) {
            sb.append(" enableC2paManifestEmbedding");
        }
        if ((this.aQ & 131072) == 0) {
            sb.append(" useYoutubeVidInfraTonemappingAlgorithm");
        }
        if ((this.aQ & 262144) == 0) {
            sb.append(" bypassTextureFrameFlattening");
        }
        if ((this.aQ & 524288) == 0) {
            sb.append(" enableMediaEngineCacheDownloader");
        }
        if ((this.aQ & 1048576) == 0) {
            sb.append(" doNotReportFrameDropsAsErrorsInXenoEffectTextureProcessor");
        }
        if ((this.aQ & 2097152) == 0) {
            sb.append(" enableAsyncEffectAssetsResolving");
        }
        if ((this.aQ & 4194304) == 0) {
            sb.append(" releaseOnGlThread");
        }
        if ((this.aQ & 8388608) == 0) {
            sb.append(" enforceCompositionRuntimeExporter");
        }
        if ((this.aQ & 16777216) == 0) {
            sb.append(" enableDynamicTextSegments");
        }
        if ((this.aQ & 33554432) == 0) {
            sb.append(" enableKeyframes");
        }
        if ((this.aQ & 67108864) == 0) {
            sb.append(" enableAndroidCompositionRuntimePlayer");
        }
        if ((this.aQ & 134217728) == 0) {
            sb.append(" deduplicateMdtaMetadataTagsInExport");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void aA(int i) {
        this.w = i;
        this.aO |= 4194304;
    }

    public final void aB(boolean z) {
        this.W = z;
        this.aP |= 65536;
    }

    public final void aC(boolean z) {
        this.o = z;
        this.aO |= 16384;
    }

    public final void aD(boolean z) {
        this.b = z;
        this.aO |= 2;
    }

    public final void aE(boolean z) {
        this.a = z;
        this.aO |= 1;
    }

    public final void aF(boolean z) {
        this.E = z;
        this.aO |= 1073741824;
    }

    public final void aG(boolean z) {
        this.G = z;
        this.aP |= 1;
    }

    public final void aH(boolean z) {
        this.v = z;
        this.aO |= 2097152;
    }

    public final void aI(boolean z) {
        this.ad = z;
        this.aP |= 8388608;
    }

    public final void aJ(boolean z) {
        this.e = z;
        this.aO |= 16;
    }

    public final void aK(boolean z) {
        this.d = z;
        this.aO |= 8;
    }

    public final void aL(boolean z) {
        this.k = z;
        this.aO |= SemanticState.ReadOnly;
    }

    public final void aM(boolean z) {
        this.m = z;
        this.aO |= SemanticState.Obscured;
    }

    public final void aN(boolean z) {
        this.p = z;
        this.aO |= 32768;
    }

    public final void aO(boolean z) {
        this.aF = z;
        this.aQ |= 131072;
    }

    public final void aP(boolean z) {
        this.R = z;
        this.aP |= SemanticState.Modal;
    }

    public final void aQ(boolean z) {
        this.N = z;
        this.aP |= SemanticState.Focused;
    }

    public final void aa(long j) {
        this.as = j;
        this.aQ |= 16;
    }

    public final void ab(int i) {
        this.ac = i;
        this.aP |= 4194304;
    }

    public final void ac(boolean z) {
        this.ak = z;
        this.aP |= 536870912;
    }

    public final void ad(boolean z) {
        this.t = z;
        this.aO |= 524288;
    }

    public final void ae(boolean z) {
        this.F = z;
        this.aO |= Integer.MIN_VALUE;
    }

    public final void af(boolean z) {
        this.I = z;
        this.aP |= 4;
    }

    public final void ag(boolean z) {
        this.ao = z;
        this.aQ |= 1;
    }

    public final void ah(boolean z) {
        this.au = z;
        this.aQ |= 64;
    }

    public final void ai(boolean z) {
        this.al = z;
        this.aP |= 1073741824;
    }

    public final void aj(boolean z) {
        this.g = z;
        this.aO |= 64;
    }

    public final void ak(boolean z) {
        this.af = z;
        this.aP |= 33554432;
    }

    public final void al(boolean z) {
        this.X = z;
        this.aP |= 131072;
    }

    public final void am(boolean z) {
        this.aD = z;
        this.aQ |= 32768;
    }

    public final void an(int i) {
        this.n = i;
        this.aO |= SemanticState.Multiline;
    }

    public final void ao(boolean z) {
        this.ay = z;
        this.aQ |= SemanticState.ReadOnly;
    }

    public final void ap(boolean z) {
        this.aw = z;
        this.aQ |= SemanticState.Hidden;
    }

    public final void aq(boolean z) {
        this.T = z;
        this.aP |= SemanticState.Multiline;
    }

    public final void ar(boolean z) {
        this.ar = z;
        this.aQ |= 8;
    }

    public final void as(boolean z) {
        this.aJ = z;
        this.aQ |= 4194304;
    }

    public final void at(boolean z) {
        this.aB = z;
        this.aQ |= SemanticState.Multiline;
    }

    public final void au(boolean z) {
        this.P = z;
        this.aP |= SemanticState.LiveRegion;
    }

    public final void av(boolean z) {
        this.s = z;
        this.aO |= 262144;
    }

    public final void aw(boolean z) {
        this.l = z;
        this.aO |= SemanticState.Modal;
    }

    public final void ax(boolean z) {
        this.q = z;
        this.aO |= 65536;
    }

    public final void ay(boolean z) {
        this.aa = z;
        this.aP |= 1048576;
    }

    public final void az(long j) {
        this.ax = j;
        this.aQ |= SemanticState.LiveRegion;
    }

    public final void b(boolean z) {
        this.u = z;
        this.aO |= 1048576;
    }

    public final void c(boolean z) {
        this.y = z;
        this.aO |= 16777216;
    }

    public final void d(boolean z) {
        this.ab = z;
        this.aP |= 2097152;
    }

    public final void e(boolean z) {
        this.V = z;
        this.aP |= 32768;
    }

    public final void f(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null audioPlayerLookaheadDuration");
        }
        this.ag = duration;
    }

    public final void g() {
        this.aQ |= 262144;
    }

    public final void h(boolean z) {
        this.B = z;
        this.aO |= 134217728;
    }

    public final void i(boolean z) {
        this.x = z;
        this.aO |= 8388608;
    }

    public final void j(boolean z) {
        this.M = z;
        this.aP |= 64;
    }

    public final void k(boolean z) {
        this.aN = z;
        this.aQ |= 134217728;
    }

    public final void l(boolean z) {
        this.H = z;
        this.aP |= 2;
    }

    public final void m(boolean z) {
        this.f = z;
        this.aO |= 32;
    }

    public final void n(boolean z) {
        this.r = z;
        this.aO |= 131072;
    }

    public final void o(boolean z) {
        this.K = z;
        this.aP |= 16;
    }

    public final void p(boolean z) {
        this.at = z;
        this.aQ |= 32;
    }

    public final void q(boolean z) {
        this.ae = z;
        this.aP |= 16777216;
    }

    public final void r(boolean z) {
        this.ai = z;
        this.aP |= 134217728;
    }

    public final void s(boolean z) {
        this.aH = z;
        this.aQ |= 1048576;
    }

    public final void t(boolean z) {
        this.av = z;
        this.aQ |= SemanticState.Focused;
    }

    public final void u(boolean z) {
        this.am = z;
        this.aP |= Integer.MIN_VALUE;
    }

    public final void v(boolean z) {
        this.ap = z;
        this.aQ |= 2;
    }

    public final void w(boolean z) {
        this.aM = z;
        this.aQ |= 67108864;
    }

    public final void x(boolean z) {
        this.az = z;
        this.aQ |= SemanticState.Modal;
    }

    public final void y(boolean z) {
        this.aI = z;
        this.aQ |= 2097152;
    }

    public final void z(boolean z) {
        this.ah = z;
        this.aP |= 67108864;
    }
}
