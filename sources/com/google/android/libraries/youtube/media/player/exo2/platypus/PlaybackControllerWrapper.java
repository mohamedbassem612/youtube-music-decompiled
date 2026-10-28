package com.google.android.libraries.youtube.media.player.exo2.platypus;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.SabrLiveProtos$SabrLiveMetadata;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.apps.youtube.proto.streaming.PlaybackDebugInfoOuterClass$FormatDebugInfo;
import com.google.android.apps.youtube.proto.streaming.PlaybackDebugInfoOuterClass$InternalDebugInfo;
import com.google.android.apps.youtube.proto.streaming.PlaybackDebugInfoOuterClass$PlaybackDebugInfo;
import com.google.android.apps.youtube.proto.streaming.ReloadPlayerResponseOuterClass$ReloadPlayerResponse;
import com.google.android.apps.youtube.proto.streaming.RequestIdentifierOuterClass$RequestIdentifier;
import com.google.android.apps.youtube.proto.streaming.SabrSeekOuterClass$SabrSeek;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import com.google.android.apps.youtube.proto.streaming.ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;
import com.google.android.libraries.youtube.media.interfaces.CuePointDataProviderWrapper;
import com.google.android.libraries.youtube.media.interfaces.FallbackConfig;
import com.google.android.libraries.youtube.media.interfaces.PlaybackController;
import com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeErrorDetail;
import com.google.android.libraries.youtube.media.interfaces.Time;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveSequenceEstimator;
import com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimeline;
import com.google.android.libraries.youtube.media.player.exo2.platypus.live.LiveTimelineFactory;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.StartPositionTracker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;
import defpackage.a;
import defpackage.abfv;
import defpackage.acca;
import defpackage.afvx;
import defpackage.afwl;
import defpackage.agke;
import defpackage.agkz;
import defpackage.ahno;
import defpackage.aihf;
import defpackage.aphs;
import defpackage.appa;
import defpackage.atqq;
import defpackage.axo;
import defpackage.bse;
import defpackage.bss;
import defpackage.btn;
import defpackage.jqz;
import defpackage.tab;
import defpackage.tae;
import defpackage.taf;
import defpackage.trx;
import defpackage.tym;
import defpackage.wgo;
import defpackage.wgs;
import defpackage.wiw;
import defpackage.wja;
import defpackage.xeu;
import defpackage.yhq;
import defpackage.yhu;
import defpackage.yno;
import defpackage.yod;
import defpackage.yog;
import defpackage.yop;
import defpackage.yus;
import defpackage.yvt;
import defpackage.yvu;
import defpackage.yvv;
import defpackage.ywj;
import defpackage.ywu;
import defpackage.ywx;
import defpackage.yxi;
import defpackage.yyv;
import defpackage.zbu;
import defpackage.zbv;
import defpackage.zbw;
import defpackage.zbx;
import defpackage.zcb;
import defpackage.zcc;
import defpackage.zcd;
import defpackage.zcf;
import defpackage.zch;
import defpackage.zco;
import defpackage.zcp;
import defpackage.zeh;
import defpackage.zfc;
import defpackage.zhq;
import defpackage.zhv;
import defpackage.zhz;
import defpackage.zic;
import defpackage.zik;
import defpackage.zjr;
import defpackage.zjv;
import defpackage.zkf;
import defpackage.zkj;
import defpackage.zkk;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class PlaybackControllerWrapper extends PlaybackControllerCallbacks implements MediaPushMediaSource.Client, MediaSegmentHolder.LiveEofListener, SampleHolder.EmbeddedMetadataListener, Closeable, MediaSegmentHolder.FormatInitializationMetadataListener {
    public volatile PlaybackController a;
    final MediaPushMediaSource b;
    final BufferManagerImpl c;
    final ErrorHandler d;
    public volatile zcf e;
    private boolean i;
    private final Handler n;
    private final zkk o;
    private final zeh p;
    private final Callbacks q;
    private final ScheduledExecutorService r;
    private final Executor s;
    private final boolean t;
    private final boolean u;
    private final xeu w;
    private final Object h = new Object();
    private OnesieMediaFetchIntegration j = null;
    private yhu k = null;
    private yhq l = null;
    private CuePointDataProviderWrapper m = null;
    private final EnumSet v = EnumSet.noneOf(jqz.class);
    public volatile boolean f = false;
    public volatile zjv g = zjv.a;
    private zch x = zch.a;
    private final AtomicBoolean y = new AtomicBoolean();
    private final AtomicBoolean z = new AtomicBoolean();

    /* JADX INFO: renamed from: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[zcc.values().length];
            a = iArr;
            try {
                iArr[zcc.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[zcc.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    interface Callbacks {
        ListenableFuture A(PlaybackControllerWrapper playbackControllerWrapper);

        void B(PlaybackControllerWrapper playbackControllerWrapper);

        void D(PlaybackControllerWrapper playbackControllerWrapper, long j);
    }

    public PlaybackControllerWrapper(zcf zcfVar, xeu xeuVar, MediaPushMediaSource mediaPushMediaSource, BufferManagerImpl bufferManagerImpl, ErrorHandler errorHandler, Handler handler, zkk zkkVar, zeh zehVar, Callbacks callbacks, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.e = zcfVar;
        this.w = xeuVar;
        this.b = mediaPushMediaSource;
        this.c = bufferManagerImpl;
        this.d = errorHandler;
        this.n = handler;
        this.o = zkkVar;
        this.p = zehVar;
        this.q = callbacks;
        this.r = scheduledExecutorService;
        this.s = executor;
        this.t = zcfVar.H.j.m(295, 45717361L);
        this.u = zcfVar.H.j.m(323, 45756661L);
        zhq zhqVar = zhq.ABR;
    }

    private final ArrayList C() {
        EnumSet enumSetClone = this.v.clone();
        if (this.e.H.bv()) {
            if (this.e.c().k()) {
                enumSetClone.add(jqz.TRACK_TYPE_VIDEO);
            }
            if (this.e.q()) {
                enumSetClone.add(jqz.TRACK_TYPE_TEXT);
            }
        }
        return (ArrayList) Collection.EL.stream(enumSetClone).map(new PlaybackControllerWrapper$$ExternalSyntheticLambda0()).collect(Collectors.toCollection(new PlaybackControllerWrapper$$ExternalSyntheticLambda1()));
    }

    private final void D() {
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataB;
        wgs wgsVarA;
        AtomicBoolean atomicBoolean = this.z;
        if (atomicBoolean.get()) {
            return;
        }
        if (!this.e.H.di() || this.e.t) {
            if (this.e.A.E() && !this.e.A.v.isEmpty()) {
                wgsVarA = (wgs) this.e.A.v.get(0);
                aihf aihfVarCreateBuilder = FormatInitializationMetadataOuterClass$FormatInitializationMetadata.a.createBuilder();
                FormatIdOuterClass$FormatId formatIdOuterClass$FormatIdO = wgsVarA.o();
                aihfVarCreateBuilder.copyOnWrite();
                FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.instance;
                formatIdOuterClass$FormatIdO.getClass();
                formatInitializationMetadataOuterClass$FormatInitializationMetadata.d = formatIdOuterClass$FormatIdO;
                formatInitializationMetadataOuterClass$FormatInitializationMetadata.b |= 2;
                formatInitializationMetadataOuterClass$FormatInitializationMetadataB = (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihfVarCreateBuilder.build();
            } else if (!this.e.A.E() ? this.t : this.u) {
                formatInitializationMetadataOuterClass$FormatInitializationMetadataB = this.c.b(jqz.TRACK_TYPE_VIDEO);
                if (formatInitializationMetadataOuterClass$FormatInitializationMetadataB != null) {
                    FormatIdOuterClass$FormatId defaultInstance = formatInitializationMetadataOuterClass$FormatInitializationMetadataB.d;
                    if (defaultInstance == null) {
                        defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    wgsVarA = a(defaultInstance);
                } else {
                    wgsVarA = null;
                }
            } else {
                PlaybackControllerFormatInitMetadataHelper.FormatIdsForTracks formatIdsForTracksA = PlaybackControllerFormatInitMetadataHelper.a(true, false, this.c, this.l, this.k, this.e);
                formatInitializationMetadataOuterClass$FormatInitializationMetadataB = formatIdsForTracksA.b;
                wgsVarA = formatIdsForTracksA.a;
            }
            if (formatInitializationMetadataOuterClass$FormatInitializationMetadataB != null) {
                if (wgsVarA != null) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        taf.i(this.q.A(this), MoreExecutors.directExecutor(), new tab() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda7
                            @Override // defpackage.twi
                            /* JADX INFO: renamed from: b */
                            public final void a(Throwable th) {
                                PlatypusException platypusException = new PlatypusException(PlatypusException.ErrorType.d, th);
                                PlaybackControllerWrapper playbackControllerWrapper = this.a;
                                playbackControllerWrapper.d.d(platypusException, playbackControllerWrapper.e);
                            }
                        }, new tae() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda8
                            @Override // defpackage.tae, defpackage.twi
                            public final void a(Object obj) {
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                PlaybackControllerWrapper playbackControllerWrapper = this.a;
                                if (zBooleanValue) {
                                    playbackControllerWrapper.b.K();
                                    return;
                                }
                                ErrorHandler errorHandler = playbackControllerWrapper.d;
                                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.d);
                                platypusExceptionBuilder.b("c", "surfaceNotPrepared");
                                errorHandler.d(platypusExceptionBuilder.a(), playbackControllerWrapper.e);
                            }
                        }, null);
                    }
                } else {
                    FormatIdOuterClass$FormatId defaultInstance2 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB.d;
                    if (defaultInstance2 == null) {
                        defaultInstance2 = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    q(defaultInstance2, this.e.A.t);
                }
            }
        }
    }

    private final void E() {
        AtomicBoolean atomicBoolean = this.y;
        if (atomicBoolean.get()) {
            return;
        }
        EnumSet enumSet = this.v;
        if (enumSet.contains(jqz.TRACK_TYPE_VIDEO) && this.x.c == null) {
            return;
        }
        if (!(enumSet.contains(jqz.TRACK_TYPE_AUDIO) && this.x.b == null) && atomicBoolean.compareAndSet(false, true)) {
            this.b.L();
        }
    }

    private static final String F(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            if (formatIdOuterClass$FormatId.c == wgsVar.e() && formatIdOuterClass$FormatId.e.equals(wgsVar.C()) && formatIdOuterClass$FormatId.d != wgsVar.k()) {
                return "lmt_mm_" + wgsVar.k();
            }
        }
        return (String) Collection.EL.stream(list).map(new PlaybackControllerWrapper$$ExternalSyntheticLambda13()).collect(Collectors.joining("_"));
    }

    private static final wgs[] G(jqz jqzVar, zcb zcbVar) {
        yod yodVar = zcbVar.a;
        if (jqzVar == jqz.TRACK_TYPE_AUDIO) {
            return yodVar.c;
        }
        return jqzVar == jqz.TRACK_TYPE_VIDEO ? yodVar.b : new wgs[0];
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder.LiveEofListener
    public final void A() {
        if (this.e.A.D()) {
            this.r.execute(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackControllerWrapper playbackControllerWrapper = this.a;
                    synchronized (zik.class) {
                        if (playbackControllerWrapper.a == null) {
                            return;
                        }
                        playbackControllerWrapper.a.setLiveIsEnded();
                    }
                }
            }));
        }
    }

    final void B(acca accaVar) {
        zhq zhqVar = zhq.ABR;
        String str = this.e.a;
        synchronized (zik.class) {
            PlaybackController playbackController = this.a;
            if (playbackController == null) {
                if (this.e.H.bQ()) {
                    this.e.Z.l("ctsnpc", a.ce(accaVar != null ? accaVar.n : "null", "track:"));
                }
                return;
            }
            ArrayList arrayList = new ArrayList(this.e.D);
            boolean zQ = this.e.q();
            zcf zcfVar = this.e;
            zcfVar.D = zcf.w(zcfVar.A.t, accaVar);
            ArrayList arrayList2 = this.e.D;
            boolean zQ2 = this.e.q();
            if (this.e.H.bQ()) {
                String str2 = !arrayList.isEmpty() ? (String) Collection.EL.stream(arrayList).map(new PlaybackControllerWrapper$$ExternalSyntheticLambda11()).map(new PlaybackControllerWrapper$$ExternalSyntheticLambda12()).collect(Collectors.joining(",")) : "null";
                String str3 = !arrayList2.isEmpty() ? (String) Collection.EL.stream(arrayList2).map(new PlaybackControllerWrapper$$ExternalSyntheticLambda11()).map(new PlaybackControllerWrapper$$ExternalSyntheticLambda12()).collect(Collectors.joining(",")) : "null";
                this.e.Z.l("ctscpwu", "old:" + str2 + ':' + zQ + ";new:" + str3 + ':' + zQ2);
            }
            if (!Objects.equals(arrayList2, arrayList)) {
                d(jqz.TRACK_TYPE_TEXT, "track_change");
                if (zQ != zQ2) {
                    y(this.f);
                    playbackController.setEnabledTracks(C());
                }
                playbackController.setSelectedCaptionFormats(this.e.D);
            }
        }
    }

    public final wgs a(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        return zic.c(formatIdOuterClass$FormatId, this.e.A.t);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x030b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0392  */
    /* JADX WARN: Code duplicated, block: B:15:0x008d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0090  */
    /* JADX WARN: Code duplicated, block: B:19:0x009f  */
    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d2 A[PHI: r6
      0x00d2: PHI (r6v21 zcp) = (r6v0 zcp), (r6v0 zcp), (r6v24 zcp) binds: [B:16:0x008e, B:18:0x009d, B:27:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Set] */
    public final EnumSet b() {
        zbx zbxVarA;
        zch zchVar;
        zbx zbxVarA2;
        zbx zbxVarA3;
        zbx zbxVarA4;
        wgs wgsVar;
        zjv zjvVarP;
        EnumSet enumSetNoneOf = EnumSet.noneOf(jqz.class);
        zch zchVar2 = this.x;
        zcd zcdVar = this.e.C;
        int iOrdinal = zcdVar.b().ordinal();
        zcp zcpVarG = null;
        if (iOrdinal == 0) {
            zcb zcbVarA = zcdVar.a();
            yod yodVar = zcbVarA.a;
            EnumSet enumSet = this.v;
            if (enumSet.contains(jqz.TRACK_TYPE_AUDIO)) {
                wgs[] wgsVarArr = yodVar.c;
                zkf.c(wgsVarArr.length > 0);
                wgs wgsVar2 = wgsVarArr[0];
                String strD = yodVar.d();
                abfv abfvVar = zcbVarA.c;
                boolean zH = yodVar.h();
                Object obj = abfvVar.b;
                if (obj == null || abfvVar.a.isEmpty()) {
                    zbxVarA = null;
                } else {
                    zbw zbwVar = new zbw();
                    zbwVar.c(wgsVar2);
                    zbwVar.a = (zjv) obj;
                    zbwVar.b = strD;
                    zbwVar.d(zH);
                    zbxVarA = zbwVar.a();
                }
            } else {
                zbxVarA = null;
            }
            if (enumSet.contains(jqz.TRACK_TYPE_VIDEO)) {
                wgs[] wgsVarArr2 = yodVar.b;
                zkf.c(wgsVarArr2.length > 0);
                wgs wgsVar3 = wgsVarArr2[0];
                abfv abfvVar2 = zcbVarA.b;
                Object obj2 = abfvVar2.b;
                if (obj2 != null && !abfvVar2.a.isEmpty()) {
                    zcpVarG = zcp.g(wgsVar3, (zjv) obj2, (zkj) this.o.io(), this.e.V && !this.e.y.i);
                }
            }
            zchVar = new zch(zbxVarA, zcpVarG);
        } else {
            if (iOrdinal != 1) {
                throw new AssertionError(zcdVar.b());
            }
            if (this.e.A.E()) {
                EnumSet enumSet2 = this.v;
                boolean zContains = enumSet2.contains(jqz.TRACK_TYPE_VIDEO);
                boolean zContains2 = enumSet2.contains(jqz.TRACK_TYPE_AUDIO);
                zcf zcfVar = this.e;
                zkk zkkVar = this.o;
                Consumer consumer = new Consumer() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda10
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void r(Object obj3) {
                        this.a.s((FormatIdOuterClass$FormatId) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                zcfVar.getClass();
                zkkVar.getClass();
                if (zContains2) {
                    List list = zcfVar.A.u;
                    list.getClass();
                    wgs wgsVar4 = (wgs) atqq.Z(list);
                    if (wgsVar4 != null) {
                        zjv zjvVarO = yno.O(wgsVar4);
                        if (zjvVarO == zjv.a) {
                            consumer.r(wgsVar4.o());
                            zchVar = zch.a;
                            zchVar.getClass();
                        } else {
                            zbw zbwVar2 = new zbw();
                            zbwVar2.c(wgsVar4);
                            zbwVar2.a = zjvVarO;
                            zbwVar2.b = zcfVar.c().d();
                            zbwVar2.d(zcfVar.c().h());
                            zbxVarA4 = zbwVar2.a();
                        }
                    } else {
                        zbxVarA4 = null;
                    }
                    if (zContains) {
                        List list2 = zcfVar.A.v;
                        list2.getClass();
                        wgsVar = (wgs) atqq.Z(list2);
                        if (wgsVar == null) {
                            zchVar = new zch(zbxVarA4, zcpVarG);
                        } else {
                            zjvVarP = yno.P(zcfVar.H, zcfVar.y, zcfVar.b(), wgsVar);
                            if (zjvVarP == zjv.a) {
                                consumer.r(wgsVar.o());
                                zchVar = zch.a;
                                zchVar.getClass();
                            } else {
                                zcpVarG = zcp.g(wgsVar, zjvVarP, (zkj) zkkVar.io(), (zcfVar.V || zcfVar.y.i) ? false : true);
                                zchVar = new zch(zbxVarA4, zcpVarG);
                            }
                        }
                    } else {
                        zchVar = new zch(zbxVarA4, zcpVarG);
                    }
                } else {
                    zbxVarA4 = null;
                    if (zContains) {
                        List list3 = zcfVar.A.v;
                        list3.getClass();
                        wgsVar = (wgs) atqq.Z(list3);
                        if (wgsVar == null) {
                            zchVar = new zch(zbxVarA4, zcpVarG);
                        } else {
                            zjvVarP = yno.P(zcfVar.H, zcfVar.y, zcfVar.b(), wgsVar);
                            if (zjvVarP == zjv.a) {
                                consumer.r(wgsVar.o());
                                zchVar = zch.a;
                                zchVar.getClass();
                            } else {
                                zcpVarG = zcp.g(wgsVar, zjvVarP, (zkj) zkkVar.io(), (zcfVar.V || zcfVar.y.i) ? false : true);
                                zchVar = new zch(zbxVarA4, zcpVarG);
                            }
                        }
                    } else {
                        zchVar = new zch(zbxVarA4, zcpVarG);
                    }
                }
            } else if (this.t) {
                EnumSet enumSet3 = this.v;
                boolean zContains3 = enumSet3.contains(jqz.TRACK_TYPE_VIDEO);
                boolean zContains4 = enumSet3.contains(jqz.TRACK_TYPE_AUDIO);
                BufferManagerImpl bufferManagerImpl = this.c;
                yhq yhqVar = this.l;
                yhu yhuVar = this.k;
                zcf zcfVar2 = this.e;
                zkk zkkVar2 = this.o;
                BiConsumer biConsumer = new BiConsumer() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda9
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj3, Object obj4) {
                        this.a.q((FormatIdOuterClass$FormatId) obj3, (List) obj4);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer2);
                    }
                };
                Consumer consumer2 = new Consumer() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda10
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void r(Object obj3) {
                        this.a.s((FormatIdOuterClass$FormatId) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer3) {
                        return Consumer$CC.$default$andThen(this, consumer3);
                    }
                };
                zcfVar2.getClass();
                zkkVar2.getClass();
                PlaybackControllerFormatInitMetadataHelper.FormatIdsForTracks formatIdsForTracksA = PlaybackControllerFormatInitMetadataHelper.a(zContains3, zContains4, bufferManagerImpl, yhqVar, yhuVar, zcfVar2);
                FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = formatIdsForTracksA.d;
                if (formatInitializationMetadataOuterClass$FormatInitializationMetadata != null) {
                    wgs wgsVar5 = formatIdsForTracksA.c;
                    if (wgsVar5 == null) {
                        FormatIdOuterClass$FormatId defaultInstance = formatInitializationMetadataOuterClass$FormatInitializationMetadata.d;
                        if (defaultInstance == null) {
                            defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                        }
                        biConsumer.accept(defaultInstance, zcfVar2.A.t);
                        zchVar = zch.a;
                        zchVar.getClass();
                    } else {
                        zjv zjvVarO2 = yno.O(wgsVar5);
                        if (zjvVarO2 == zjv.a) {
                            FormatIdOuterClass$FormatId defaultInstance2 = formatInitializationMetadataOuterClass$FormatInitializationMetadata.d;
                            if (defaultInstance2 == null) {
                                defaultInstance2 = FormatIdOuterClass$FormatId.getDefaultInstance();
                            }
                            consumer2.r(defaultInstance2);
                            zchVar = zch.a;
                            zchVar.getClass();
                        } else {
                            zbw zbwVar3 = new zbw();
                            zbwVar3.c(wgsVar5);
                            zbwVar3.a = zjvVarO2;
                            zbwVar3.b = zcfVar2.c().d();
                            zbwVar3.d(zcfVar2.c().h());
                            zbxVarA3 = zbwVar3.a();
                        }
                    }
                } else {
                    zbxVarA3 = null;
                }
                FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata2 = formatIdsForTracksA.b;
                if (formatInitializationMetadataOuterClass$FormatInitializationMetadata2 == null) {
                    zchVar = new zch(zbxVarA3, zcpVarG);
                } else {
                    wgs wgsVar6 = formatIdsForTracksA.a;
                    if (wgsVar6 == null) {
                        FormatIdOuterClass$FormatId defaultInstance3 = formatInitializationMetadataOuterClass$FormatInitializationMetadata2.d;
                        if (defaultInstance3 == null) {
                            defaultInstance3 = FormatIdOuterClass$FormatId.getDefaultInstance();
                        }
                        biConsumer.accept(defaultInstance3, zcfVar2.A.t);
                        zchVar = zch.a;
                        zchVar.getClass();
                    } else {
                        zjv zjvVarP2 = yno.P(zcfVar2.H, zcfVar2.y, zcfVar2.b(), wgsVar6);
                        if (zjvVarP2 == zjv.a) {
                            FormatIdOuterClass$FormatId defaultInstance4 = formatInitializationMetadataOuterClass$FormatInitializationMetadata2.d;
                            if (defaultInstance4 == null) {
                                defaultInstance4 = FormatIdOuterClass$FormatId.getDefaultInstance();
                            }
                            consumer2.r(defaultInstance4);
                            zchVar = zch.a;
                            zchVar.getClass();
                        } else {
                            zcpVarG = zcp.g(wgsVar6, zjvVarP2, (zkj) zkkVar2.io(), zcfVar2.V && !zcfVar2.y.i);
                            zchVar = new zch(zbxVarA3, zcpVarG);
                        }
                    }
                }
            } else {
                BufferManagerImpl bufferManagerImpl2 = this.c;
                jqz jqzVar = jqz.TRACK_TYPE_AUDIO;
                FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataB = bufferManagerImpl2.b(jqzVar);
                EnumSet enumSet4 = this.v;
                if (!enumSet4.contains(jqzVar) || formatInitializationMetadataOuterClass$FormatInitializationMetadataB == null) {
                    zbxVarA2 = null;
                } else {
                    FormatIdOuterClass$FormatId defaultInstance5 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB.d;
                    if (defaultInstance5 == null) {
                        defaultInstance5 = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    wgs wgsVarA = a(defaultInstance5);
                    if (wgsVarA == null) {
                        FormatIdOuterClass$FormatId defaultInstance6 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB.d;
                        if (defaultInstance6 == null) {
                            defaultInstance6 = FormatIdOuterClass$FormatId.getDefaultInstance();
                        }
                        q(defaultInstance6, this.e.A.t);
                        zchVar = zch.a;
                    } else {
                        zjv zjvVarO3 = yno.O(wgsVarA);
                        if (zjvVarO3 == zjv.a) {
                            FormatIdOuterClass$FormatId defaultInstance7 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB.d;
                            if (defaultInstance7 == null) {
                                defaultInstance7 = FormatIdOuterClass$FormatId.getDefaultInstance();
                            }
                            s(defaultInstance7);
                            zchVar = zch.a;
                        } else {
                            zbw zbwVar4 = new zbw();
                            zbwVar4.c(wgsVarA);
                            zbwVar4.a = zjvVarO3;
                            zbwVar4.b = this.e.c().d();
                            zbwVar4.d(this.e.c().h());
                            zbwVar4.c = this.e.b();
                            zbxVarA2 = zbwVar4.a();
                        }
                    }
                }
                jqz jqzVar2 = jqz.TRACK_TYPE_VIDEO;
                FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataB2 = bufferManagerImpl2.b(jqzVar2);
                if (!enumSet4.contains(jqzVar2) || formatInitializationMetadataOuterClass$FormatInitializationMetadataB2 == null) {
                    zchVar = new zch(zbxVarA2, zcpVarG);
                } else {
                    FormatIdOuterClass$FormatId defaultInstance8 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB2.d;
                    if (defaultInstance8 == null) {
                        defaultInstance8 = FormatIdOuterClass$FormatId.getDefaultInstance();
                    }
                    wgs wgsVarA2 = a(defaultInstance8);
                    if (wgsVarA2 == null) {
                        FormatIdOuterClass$FormatId defaultInstance9 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB2.d;
                        if (defaultInstance9 == null) {
                            defaultInstance9 = FormatIdOuterClass$FormatId.getDefaultInstance();
                        }
                        q(defaultInstance9, this.e.A.t);
                        zchVar = zch.a;
                    } else {
                        zjv zjvVarP3 = yno.P(this.e.H, this.e.y, this.e.b(), wgsVarA2);
                        if (zjvVarP3 == zjv.a) {
                            FormatIdOuterClass$FormatId defaultInstance10 = formatInitializationMetadataOuterClass$FormatInitializationMetadataB2.d;
                            if (defaultInstance10 == null) {
                                defaultInstance10 = FormatIdOuterClass$FormatId.getDefaultInstance();
                            }
                            s(defaultInstance10);
                            zchVar = zch.a;
                        } else {
                            zcpVarG = zcp.g(wgsVarA2, zjvVarP3, (zkj) this.o.io(), this.e.V && !this.e.y.i);
                            zchVar = new zch(zbxVarA2, zcpVarG);
                        }
                    }
                }
            }
        }
        zbx zbxVar = zchVar2.b;
        zbx zbxVar2 = zchVar.b;
        boolean zM = this.e.H.j.m(344, 45777323L);
        if (zbxVar2 != zbxVar) {
            if (zbxVar2 == null || zbxVar == null) {
                enumSetNoneOf.add(jqz.TRACK_TYPE_AUDIO);
                zbxVar = zbxVar2;
            } else {
                zbu zbuVar = (zbu) zbxVar2;
                zbu zbuVar2 = (zbu) zbxVar;
                if (zbuVar.a != zbuVar2.a || !TextUtils.equals(zbuVar.e, zbuVar2.e) || zbuVar.f != zbuVar2.f || (zM && yno.u(zbuVar.g, zbuVar2.g))) {
                    enumSetNoneOf.add(jqz.TRACK_TYPE_AUDIO);
                    zbxVar = zbxVar2;
                }
            }
        }
        zcp zcpVar = zchVar2.c;
        zcp zcpVar2 = zchVar.c;
        if (zcpVar2 != zcpVar && (zcpVar2 == null || zcpVar == null || ((zbv) zcpVar2).a != ((zbv) zcpVar).a)) {
            enumSetNoneOf.add(jqz.TRACK_TYPE_VIDEO);
            zcpVar = zcpVar2;
        }
        if (!enumSetNoneOf.isEmpty()) {
            zch zchVar3 = new zch(zbxVar, zcpVar);
            this.x = zchVar3;
            zcp zcpVar3 = zchVar3.c;
            this.g = zcpVar3 != null ? ((zbv) zcpVar3).a : zjv.a;
            this.b.N(this.x);
        }
        return enumSetNoneOf;
    }

    final void c() {
        p();
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            this.c.g((jqz) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            if (this.i) {
                return;
            }
            this.i = true;
            zhq zhqVar = zhq.ABR;
            String str = this.e.a;
            synchronized (zik.class) {
                OnesieMediaFetchIntegration onesieMediaFetchIntegration = this.j;
                if (onesieMediaFetchIntegration != null) {
                    onesieMediaFetchIntegration.d();
                }
                PlaybackController playbackController = this.a;
                if (playbackController != null) {
                    CuePointDataProviderWrapper cuePointDataProviderWrapper = this.m;
                    if (cuePointDataProviderWrapper != null) {
                        if (this.e.H.bs()) {
                            playbackController.unregisterSabrDataProvider(cuePointDataProviderWrapper);
                        } else {
                            playbackController.setCuePointDataProvider(null);
                        }
                    }
                    playbackController.dispose();
                    this.a = null;
                }
                this.m = null;
                BufferManagerImpl bufferManagerImpl = this.c;
                if (bufferManagerImpl.e.l.m(21, 45661336L)) {
                    bufferManagerImpl.f = true;
                }
                bufferManagerImpl.a.P();
                bufferManagerImpl.b.P();
                bufferManagerImpl.c.d();
                yhu yhuVar = this.k;
                if (yhuVar != null) {
                    yhuVar.g();
                }
                yhq yhqVar = this.l;
                if (yhqVar != null) {
                    yhqVar.b();
                }
            }
        }
    }

    public final void d(jqz jqzVar, String str) {
        jqz jqzVar2;
        String str2;
        if (this.e.H.dw() && (jqzVar == (jqzVar2 = jqz.TRACK_TYPE_VIDEO) || jqzVar == jqz.TRACK_TYPE_AUDIO || jqzVar == jqz.TRACK_TYPE_TEXT)) {
            if (jqzVar == jqzVar2) {
                str2 = "v";
            } else {
                str2 = jqzVar == jqz.TRACK_TYPE_AUDIO ? "a" : "t";
            }
            this.e.Z.w("rbrd", a.ca(str, str2, "buf_clear.", ";r."));
        }
        synchronized (zik.class) {
            p();
            long j = this.b.e;
            if (j == this.e.H.v()) {
                j = 0;
            }
            BufferManagerImpl bufferManagerImpl = this.c;
            if (bufferManagerImpl.f) {
                axo axoVar = bufferManagerImpl.d;
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                platypusExceptionBuilder.b("c", "setStartTimeUs with disposed BufferManager");
                axoVar.accept(platypusExceptionBuilder.a());
            } else {
                bufferManagerImpl.a.Q(j);
                bufferManagerImpl.b.Q(j);
                bufferManagerImpl.c.g(j);
            }
            bufferManagerImpl.g(jqzVar);
        }
    }

    final void e(PlaybackController playbackController, OnesieMediaFetchIntegration onesieMediaFetchIntegration, yhq yhqVar, yhu yhuVar, boolean z) {
        afvx afvxVarAd = tym.ad(trx.PLATYPUS_INIT_PLAYBACK_CONTROLLER);
        try {
            zhq zhqVar = zhq.ABR;
            String str = this.e.a;
            this.l = yhqVar;
            this.k = yhuVar;
            MediaPushMediaSource mediaPushMediaSource = this.b;
            mediaPushMediaSource.I(this.x, this);
            ahno.O(this.a == null);
            this.a = playbackController;
            if (this.e.H.bv()) {
                playbackController.setHasMediaView(this.f);
            }
            this.j = onesieMediaFetchIntegration;
            if (this.e.H.W().q) {
                if (onesieMediaFetchIntegration != null) {
                    onesieMediaFetchIntegration.e(this, playbackController);
                }
                if (this.e.A.z()) {
                    this.c.e().b(mediaPushMediaSource);
                }
            } else {
                if (this.e.A.z()) {
                    this.c.e().b(mediaPushMediaSource);
                }
                if (onesieMediaFetchIntegration != null) {
                    onesieMediaFetchIntegration.e(this, playbackController);
                }
            }
            playbackController.setEnabledTracks(C());
            if (!this.e.H.ep() || !this.e.c().f().isEmpty()) {
                playbackController.setSelectedAudioFormats(this.e.c().f());
            }
            if (!this.e.H.ep() || !this.e.c().g().isEmpty()) {
                playbackController.setSelectedVideoFormats(this.e.c().g());
            }
            if (this.e.A.D()) {
                BufferManagerImpl bufferManagerImpl = this.c;
                if (bufferManagerImpl.f) {
                    axo axoVar = bufferManagerImpl.d;
                    PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                    platypusExceptionBuilder.b("c", "setLiveEofListener with disposed BufferManager");
                    axoVar.accept(platypusExceptionBuilder.a());
                } else {
                    bufferManagerImpl.a.E(this);
                    bufferManagerImpl.b.E(this);
                    bufferManagerImpl.c.E(this);
                }
            }
            if (this.e.q()) {
                playbackController.setSelectedCaptionFormats(this.e.D);
            }
            playbackController.setPlaybackRate(this.e.p);
            yxi yxiVar = this.e.c;
            final CuePointDataProviderWrapper cuePointDataProviderWrapperA = null;
            if (yxiVar != null && this.e.y.aa()) {
                yxiVar.g().b();
                cuePointDataProviderWrapperA = yxiVar.g().a();
                if (cuePointDataProviderWrapperA != null && !this.e.y.av() && this.e.H.l.m(49, 45731777L)) {
                    cuePointDataProviderWrapperA.a.schedule(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.interfaces.CuePointDataProviderWrapper$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CuePointDataProviderWrapper cuePointDataProviderWrapper = cuePointDataProviderWrapperA;
                            synchronized (zik.class) {
                                if (cuePointDataProviderWrapper.c()) {
                                    return;
                                }
                                cuePointDataProviderWrapper.nativeSetDaiDisabledByNoConfig(cuePointDataProviderWrapper.b());
                            }
                        }
                    }));
                }
            }
            this.m = cuePointDataProviderWrapperA;
            if (cuePointDataProviderWrapperA != null) {
                if (this.e.H.bs()) {
                    playbackController.registerSabrDataProvider(cuePointDataProviderWrapperA);
                } else {
                    playbackController.setCuePointDataProvider(cuePointDataProviderWrapperA);
                }
            }
            BufferManagerImpl bufferManagerImpl2 = this.c;
            if (bufferManagerImpl2.f) {
                axo axoVar2 = bufferManagerImpl2.d;
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder2 = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                platypusExceptionBuilder2.b("c", "setEmbeddedMetadataListener with disposed BufferManager");
                axoVar2.accept(platypusExceptionBuilder2.a());
            } else {
                bufferManagerImpl2.a.U(this);
                bufferManagerImpl2.b.U(this);
            }
            if (bufferManagerImpl2.f) {
                axo axoVar3 = bufferManagerImpl2.d;
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder3 = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                platypusExceptionBuilder3.b("c", "setFormatInitializationMetadataListener with disposed BufferManager");
                axoVar3.accept(platypusExceptionBuilder3.a());
            } else {
                bufferManagerImpl2.a.x = this;
                bufferManagerImpl2.b.x = this;
                bufferManagerImpl2.c.x = this;
            }
            bufferManagerImpl2.j(new axo() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda5
                @Override // defpackage.axo
                public final void accept(Object obj) {
                    PlatypusException platypusException = (PlatypusException) obj;
                    PlatypusException.ErrorType errorType = platypusException.a;
                    PlaybackControllerWrapper playbackControllerWrapper = this.a;
                    if (errorType != PlatypusException.ErrorType.c || !playbackControllerWrapper.e.H.ax()) {
                        playbackControllerWrapper.d.d(platypusException, playbackControllerWrapper.e);
                    } else if (playbackControllerWrapper.e.H.aZ()) {
                        playbackControllerWrapper.m(playbackControllerWrapper.e.a, platypusException);
                    }
                }
            });
            if (z) {
                b();
                D();
                E();
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void f(boolean z, boolean z2) {
        y(z);
        if (z2) {
            return;
        }
        b();
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.SampleHolder.EmbeddedMetadataListener
    public final void g(jqz jqzVar, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, long j, long j2, long j3, List list) {
        wgs wgsVarC;
        zcd zcdVar = this.e.C;
        int iOrdinal = zcdVar.b().ordinal();
        if (iOrdinal == 0) {
            wgs[] wgsVarArrG = G(jqzVar, zcdVar.a());
            int length = wgsVarArrG.length;
            if (length == 0) {
                wgsVarC = null;
                break;
            }
            int i = zic.a;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    wgsVarC = null;
                    break;
                }
                wgs wgsVar = wgsVarArrG[i2];
                if (zic.f(formatIdOuterClass$FormatId, wgsVar)) {
                    wgsVarC = wgsVar;
                    break;
                }
                i2++;
            }
        } else {
            if (iOrdinal != 1) {
                throw new AssertionError(zcdVar.b());
            }
            wgsVarC = zic.c(formatIdOuterClass$FormatId, this.e.A.t);
        }
        if (wgsVarC == null) {
            if (this.e.y.h) {
                return;
            }
            zhv zhvVar = new zhv("player.exception");
            zhvVar.e(this.b.H());
            zhvVar.c = "c.NoMatchingFormatForFormatIdOnEmbeddedMetadata";
            zhvVar.c("fmt." + formatIdOuterClass$FormatId.c + '_' + formatIdOuterClass$FormatId.e + '_' + formatIdOuterClass$FormatId.d);
            zcd zcdVar2 = this.e.C;
            wgs[] wgsVarArrG2 = zcdVar2.b() == zcc.a ? G(jqzVar, zcdVar2.a()) : new wgs[0];
            if (wgsVarArrG2.length != 0) {
                zhvVar.c("a.".concat(String.valueOf(F(formatIdOuterClass$FormatId, Arrays.asList(wgsVarArrG2)))));
            }
            this.d.c(zhvVar.a(), this.e);
            return;
        }
        LiveTimelineFactory liveTimelineFactory = this.b.k;
        if (liveTimelineFactory != null && liveTimelineFactory.h) {
            liveTimelineFactory.e = j3;
            liveTimelineFactory.h = false;
            liveTimelineFactory.a();
        }
        if (this.e.y.h) {
            return;
        }
        try {
            this.e.b.f(wgsVarC, j, j2, (ywx[]) list.toArray(new ywx[0]));
        } catch (ywu e) {
            if (e.g()) {
                this.e.Z.w("block", a.cr(j, j2, "start:", ",seq:"));
                synchronized (zik.class) {
                    p();
                    BufferManagerImpl bufferManagerImpl = this.c;
                    if (bufferManagerImpl.f) {
                        axo axoVar = bufferManagerImpl.d;
                        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                        platypusExceptionBuilder.b("c", "discardFromBufferSegmentWithSeqNum with disposed BufferManager");
                        axoVar.accept(platypusExceptionBuilder.a());
                    } else {
                        bufferManagerImpl.a.z(j);
                        bufferManagerImpl.b.z(j);
                        bufferManagerImpl.c.z(j);
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState getAbrState() {
        /*
            r12 = this;
            trx r0 = defpackage.trx.PLATYPUS_GET_ABR_STATE
            afvx r1 = defpackage.tym.ad(r0)
            zcf r0 = r12.e     // Catch: java.lang.Throwable -> L49
            yoe r0 = r0.c()     // Catch: java.lang.Throwable -> L49
            yog r0 = r0.b()     // Catch: java.lang.Throwable -> L49
            zeh r2 = r12.p     // Catch: java.lang.Throwable -> L39
            zcf r3 = r12.e     // Catch: java.lang.Throwable -> L39
            wiu r3 = r3.y     // Catch: java.lang.Throwable -> L39
            int r4 = r0.c     // Catch: java.lang.Throwable -> L39
            int r5 = r0.b     // Catch: java.lang.Throwable -> L39
            zcf r0 = r12.e     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = r0.a     // Catch: java.lang.Throwable -> L39
            zcf r0 = r12.e     // Catch: java.lang.Throwable -> L39
            float r9 = r0.p     // Catch: java.lang.Throwable -> L39
            zcf r0 = r12.e     // Catch: java.lang.Throwable -> L39
            agke r10 = r0.R     // Catch: java.lang.Throwable -> L39
            zcf r0 = r12.e     // Catch: java.lang.Throwable -> L39
            com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities r11 = r0.b()     // Catch: java.lang.Throwable -> L39
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState r12 = r2.a(r3, r4, r5, r6, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L39
            r1.close()
            return r12
        L39:
            r0 = move-exception
            xeu r2 = r12.w     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "get Abr state."
            defpackage.yno.Q(r2, r0, r3)     // Catch: java.lang.Throwable -> L49
            zcf r12 = r12.e     // Catch: java.lang.Throwable -> L49
            ywn r12 = r12.Z     // Catch: java.lang.Throwable -> L49
            defpackage.yno.R(r12, r0)     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            r12 = r0
            r1.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r12.addSuppressed(r0)
        L53:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper.getAbrState():com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState");
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final Time getCurrentPlaybackPosition() {
        try {
            long j = this.b.e;
            zcf zcfVar = this.e;
            if (j == zcfVar.H.v()) {
                j = zcfVar.A.B() ? -9223372036854775807L : 0L;
            }
            if (j != -9223372036854775807L) {
                return j == Long.MAX_VALUE ? Time.b : new Time(j, 1000000L);
            }
            return null;
        } catch (Throwable th) {
            this.d.b(th, "fail to getCurrentPlaybackPosition");
            if (this.e.H.dU()) {
                return null;
            }
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final double getOnesieRequestBandwidthBytesPerSec() {
        try {
            OnesieMediaFetchIntegration onesieMediaFetchIntegration = this.j;
            if (onesieMediaFetchIntegration == null) {
                return 0.0d;
            }
            onesieMediaFetchIntegration.h();
            return 0.0d;
        } catch (Throwable th) {
            yno.Q(this.w, th, "get Onesie bandwidth.");
            yno.R(this.e.Z, th);
            if (this.e.H.dU()) {
                return 0.0d;
            }
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo getSsdaiInfo(Time time) {
        if (this.e.y.h) {
            return null;
        }
        return this.e.B.b(time.d());
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource.Client
    public final void h(jqz jqzVar, final bse bseVar, long j, final String str) {
        final yvv yvvVar;
        MediaSource$MediaSourceInfo mediaSource$MediaSourceInfoT;
        zjv zjvVarP;
        yvv yvvVar2;
        if (bseVar.a != null) {
            synchronized (zik.class) {
                BufferManagerImpl bufferManagerImpl = this.c;
                yvvVar = null;
                if (bufferManagerImpl.f) {
                    axo axoVar = bufferManagerImpl.d;
                    PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                    platypusExceptionBuilder.b("c", "getMediaSourceInfoForSegment with disposed BufferManager");
                    axoVar.accept(platypusExceptionBuilder.a());
                    mediaSource$MediaSourceInfoT = null;
                } else {
                    mediaSource$MediaSourceInfoT = bufferManagerImpl.c(jqzVar).t(j);
                }
            }
            if (mediaSource$MediaSourceInfoT != null) {
                if (jqzVar == jqz.TRACK_TYPE_VIDEO) {
                    yvvVar2 = new yvv(mediaSource$MediaSourceInfoT, null);
                } else if (jqzVar == jqz.TRACK_TYPE_AUDIO) {
                    yvvVar2 = new yvv(null, mediaSource$MediaSourceInfoT);
                }
                yvvVar = yvvVar2;
            }
            wgs wgsVar = (wgs) this.e.A.t().get(bseVar.a);
            if (this.e.H.ex() && jqzVar == jqz.TRACK_TYPE_VIDEO && wgsVar != null && (zjvVarP = yno.P(this.e.H, this.e.y, this.e.b(), wgsVar)) != this.g) {
                this.g = zjvVarP;
                this.e.l(zjvVarP);
            }
            this.n.post(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    wgs wgsVar2;
                    String str2 = str;
                    PlaybackControllerWrapper playbackControllerWrapper = this.a;
                    bse bseVar2 = bseVar;
                    yvv yvvVar3 = yvvVar;
                    try {
                        zcf zcfVar = playbackControllerWrapper.e;
                        String str3 = bseVar2.a;
                        if (str3 != null) {
                            zjr zjrVar = zcfVar.H;
                            if (zjrVar.j.m(288, 45709258L) && (wgsVar2 = (wgs) zcfVar.A.t().get(str3)) != null && wgsVar2.af()) {
                                playbackControllerWrapper.g = yno.P(zjrVar, zcfVar.y, zcfVar.b(), wgsVar2);
                            }
                            zcfVar.k(str3, playbackControllerWrapper.f, new zco(playbackControllerWrapper.e, playbackControllerWrapper.e.c(), playbackControllerWrapper.g, playbackControllerWrapper.f).a(yus.a), 3, str2, yvvVar3);
                        }
                    } catch (RuntimeException e) {
                        playbackControllerWrapper.d.c(new zhz("player.exception", playbackControllerWrapper.b.H(), e), playbackControllerWrapper.e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource.Client
    public final void j(long j, long j2) {
        String str;
        boolean z = j == Long.MAX_VALUE || Math.abs(j - j2) > 1000;
        synchronized (zik.class) {
            if (this.a == null) {
                return;
            }
            boolean z2 = false;
            for (jqz jqzVar : this.v) {
                BufferManagerImpl bufferManagerImpl = this.c;
                if (!bufferManagerImpl.f(jqzVar, j).booleanValue() && z) {
                    boolean z3 = jqzVar == jqz.TRACK_TYPE_TEXT && this.e.H.dJ();
                    if (!z2 && !z3) {
                        p();
                        z2 = true;
                    }
                    if (this.e.H.dw()) {
                        if (jqzVar != jqz.TRACK_TYPE_VIDEO) {
                            str = jqzVar == jqz.TRACK_TYPE_AUDIO ? "a" : "v";
                        }
                        this.e.Z.w("rbrd", a.bT(str, "buf_clear.", ";r.seek_fail"));
                    }
                    if (!z3 || z2) {
                        bufferManagerImpl.g(jqzVar);
                    } else if (bufferManagerImpl.f) {
                        axo axoVar = bufferManagerImpl.d;
                        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                        platypusExceptionBuilder.b("c", "discardBufferAndSkipPendingSegmentPush with disposed BufferManager for trackType");
                        axoVar.accept(platypusExceptionBuilder.a());
                    } else {
                        bufferManagerImpl.c(jqzVar).w();
                    }
                }
            }
            if (z) {
                this.q.D(this, j);
            }
        }
    }

    final void k(PlatypusException platypusException) {
        this.d.d(platypusException, this.e);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder.LiveEofListener
    public final void l(long j, long j2) {
        this.e.x.e(j, j2);
    }

    final void m(final String str, PlatypusException platypusException) {
        ArrayList arrayList = new ArrayList();
        agke agkeVar = platypusException.b;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) agkeVar.get(i);
            int iIndexOf = str2.indexOf(46);
            if (iIndexOf > 0) {
                arrayList.add(new QoeErrorDetail(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1)));
            } else {
                arrayList.add(new QoeErrorDetail("detail", str2));
            }
        }
        final QoeError qoeError = new QoeError("fmt.unparseable", arrayList);
        this.s.execute(afwl.i(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                PlaybackControllerWrapper playbackControllerWrapper = this.a;
                QoeError qoeError2 = qoeError;
                synchronized (zik.class) {
                    if (playbackControllerWrapper.a != null) {
                        playbackControllerWrapper.a.reportParseError(str3, qoeError2);
                    }
                }
            }
        }));
    }

    final void n(boolean z) {
        PlaybackController playbackController = this.a;
        if (playbackController != null) {
            playbackController.setHdHdrSupported(z);
        }
    }

    final void o(float f) {
        synchronized (zik.class) {
            if (this.a == null) {
                return;
            }
            this.a.setPlaybackRate(f);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final void onFatalError(QoeError qoeError, FallbackConfig fallbackConfig) {
        try {
            this.d.f(qoeError, fallbackConfig, this.e);
        } catch (Throwable th) {
            yno.Q(this.w, th, "onFatalError.");
            yno.R(this.e.Z, th);
            if (!this.e.H.dU()) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:3:0x0006, B:5:0x002f, B:7:0x0035, B:20:0x009d, B:22:0x00a9, B:24:0x00b7, B:26:0x00d2, B:27:0x00d4, B:30:0x00df, B:32:0x00fc, B:34:0x0102, B:35:0x0108, B:36:0x010c, B:44:0x013d, B:8:0x003e, B:10:0x004a, B:12:0x005b, B:16:0x0064, B:17:0x008d, B:13:0x005e, B:37:0x010d, B:39:0x0113, B:41:0x013a, B:40:0x012b), top: B:52:0x0006, inners: #1 }] */
    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final void onLiveMetadata(SabrLiveProtos$SabrLiveMetadata sabrLiveProtos$SabrLiveMetadata, Double d, boolean z, Long l, Long l2) {
        long j;
        long jC;
        long jMin;
        try {
            zhq zhqVar = zhq.ABR;
            String str = this.e.a;
            long j2 = sabrLiveProtos$SabrLiveMetadata.b;
            long j3 = sabrLiveProtos$SabrLiveMetadata.c;
            Time time = new Time(sabrLiveProtos$SabrLiveMetadata.f, sabrLiveProtos$SabrLiveMetadata.g);
            Time time2 = new Time(sabrLiveProtos$SabrLiveMetadata.h, sabrLiveProtos$SabrLiveMetadata.i);
            if (time.g() || time2.g()) {
                List list = this.e.A.t;
                if (list.isEmpty()) {
                    j = wja.b;
                } else {
                    double dA = ((wgs) list.get(0)).a();
                    if (dA > 0.0d) {
                        j = (long) (dA * 1000000.0d);
                    } else {
                        j = wja.b;
                    }
                }
                jC = 0;
                if (z) {
                    long jMax = Math.max(0L, TimeUnit.MILLISECONDS.toMicros(sabrLiveProtos$SabrLiveMetadata.c) - j);
                    jC = jMax;
                    jMin = Math.max(jMax, TimeUnit.MILLISECONDS.toMicros(sabrLiveProtos$SabrLiveMetadata.c - ((long) this.e.y.j())));
                } else {
                    jMin = Math.min(j, TimeUnit.MILLISECONDS.toMicros(sabrLiveProtos$SabrLiveMetadata.c));
                }
            } else {
                jC = time.c();
                jMin = time2.c();
            }
            long j4 = jMin;
            long j5 = jC;
            long jDoubleValue = d != null ? (long) (d.doubleValue() * 1000000.0d) : -9223372036854775807L;
            long micros = TimeUnit.MILLISECONDS.toMicros(sabrLiveProtos$SabrLiveMetadata.c);
            MediaPushMediaSource mediaPushMediaSource = this.b;
            LiveTimelineFactory liveTimelineFactory = mediaPushMediaSource.k;
            if (liveTimelineFactory != null) {
                boolean zH = this.e.A.H();
                bss bssVar = mediaPushMediaSource.d;
                liveTimelineFactory.a = zH;
                liveTimelineFactory.b = bssVar;
                liveTimelineFactory.c = j5;
                liveTimelineFactory.d = j4;
                if (jDoubleValue != -9223372036854775807L) {
                    liveTimelineFactory.e = jDoubleValue;
                }
                liveTimelineFactory.f = micros;
                liveTimelineFactory.g = z;
                liveTimelineFactory.a();
            }
            if (l != null && l2 != null) {
                mediaPushMediaSource.i = new LiveSequenceEstimator(j5, j4, l.longValue(), l2.longValue(), this.e.H);
            }
            zfc zfcVar = this.e.x;
            if (z) {
                zfcVar.f(sabrLiveProtos$SabrLiveMetadata.b, micros);
                return;
            }
            long j6 = sabrLiveProtos$SabrLiveMetadata.b;
            synchronized (zik.class) {
                BufferManagerImpl bufferManagerImpl = this.c;
                if (bufferManagerImpl.f) {
                    axo axoVar = bufferManagerImpl.d;
                    PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                    platypusExceptionBuilder.b("c", "setLiveEofSequenceNumber with disposed BufferManager");
                    axoVar.accept(platypusExceptionBuilder.a());
                } else {
                    bufferManagerImpl.a.F(j6);
                    bufferManagerImpl.b.F(j6);
                    bufferManagerImpl.c.F(j6);
                }
            }
        } catch (Throwable th) {
            yno.R(this.e.Z, th);
            if (!this.e.H.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final void onPlaybackDebugInfo(PlaybackDebugInfoOuterClass$PlaybackDebugInfo playbackDebugInfoOuterClass$PlaybackDebugInfo) {
        if (!this.e.H.cV() || (playbackDebugInfoOuterClass$PlaybackDebugInfo.b & 1) == 0) {
            return;
        }
        PlaybackDebugInfoOuterClass$InternalDebugInfo defaultInstance = playbackDebugInfoOuterClass$PlaybackDebugInfo.c;
        if (defaultInstance == null) {
            defaultInstance = PlaybackDebugInfoOuterClass$InternalDebugInfo.getDefaultInstance();
        }
        Iterable$EL.forEach(defaultInstance.b, new Consumer() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda6
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void r(Object obj) {
                PlaybackDebugInfoOuterClass$FormatDebugInfo playbackDebugInfoOuterClass$FormatDebugInfo = (PlaybackDebugInfoOuterClass$FormatDebugInfo) obj;
                FormatIdOuterClass$FormatId defaultInstance2 = playbackDebugInfoOuterClass$FormatDebugInfo.b;
                if (defaultInstance2 == null) {
                    defaultInstance2 = FormatIdOuterClass$FormatId.getDefaultInstance();
                }
                PlaybackControllerWrapper playbackControllerWrapper = this.a;
                wgs wgsVarA = playbackControllerWrapper.a(defaultInstance2);
                if (wgsVarA != null) {
                    zcf zcfVar = playbackControllerWrapper.e;
                    zcfVar.ac.put(wgsVarA.f, (String) Collection.EL.stream(playbackDebugInfoOuterClass$FormatDebugInfo.c).map(new PlaybackControllerWrapper$$ExternalSyntheticLambda15()).collect(Collectors.joining(" ")));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final void onReloadPlayerResponse(ReloadPlayerResponseOuterClass$ReloadPlayerResponse reloadPlayerResponseOuterClass$ReloadPlayerResponse) {
        try {
            ywj ywjVar = this.e.b;
            aphs aphsVar = reloadPlayerResponseOuterClass$ReloadPlayerResponse.b;
            if (aphsVar == null) {
                aphsVar = aphs.a;
            }
            ywjVar.t(aphsVar);
        } catch (Throwable th) {
            yno.Q(this.w, th, "onReloadPlayerResponse.");
            yno.R(this.e.Z, th);
            if (!this.e.H.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final void onRequestIdentifier(RequestIdentifierOuterClass$RequestIdentifier requestIdentifierOuterClass$RequestIdentifier) {
        synchronized (zik.class) {
            BufferManagerImpl bufferManagerImpl = this.c;
            if (bufferManagerImpl.f) {
                axo axoVar = bufferManagerImpl.d;
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                platypusExceptionBuilder.b("c", "setRequestIdentifier with disposed BufferManager");
                axoVar.accept(platypusExceptionBuilder.a());
            } else {
                bufferManagerImpl.a.j = requestIdentifierOuterClass$RequestIdentifier;
                bufferManagerImpl.b.j = requestIdentifierOuterClass$RequestIdentifier;
                bufferManagerImpl.c.j = requestIdentifierOuterClass$RequestIdentifier;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final void onSabrSeek(SabrSeekOuterClass$SabrSeek sabrSeekOuterClass$SabrSeek) {
        String str;
        try {
            long jB = zic.b(sabrSeekOuterClass$SabrSeek.b, sabrSeekOuterClass$SabrSeek.c);
            MediaPushMediaSource mediaPushMediaSource = this.b;
            btn btnVar = mediaPushMediaSource.f;
            zkf.d(btnVar);
            if (jB == this.e.H.v() && (btnVar instanceof LiveTimeline)) {
                jB = LiveTimeline.d;
            }
            zhq zhqVar = zhq.ABR;
            String str2 = this.e.a;
            appa appaVarA = appa.a(sabrSeekOuterClass$SabrSeek.d);
            if (appaVarA == null) {
                appaVarA = appa.SEEK_SOURCE_UNKNOWN;
            }
            appaVarA.name();
            if (this.e.H.l.m(36, 45679772L) && this.e.y.aD() && this.e.A.B() && !this.e.A.H() && this.e.g != this.e.H.v()) {
                String str3 = this.e.a;
                return;
            }
            zcf zcfVar = this.e;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long j = jB / 1000;
            appa appaVarA2 = appa.a(sabrSeekOuterClass$SabrSeek.d);
            if (appaVarA2 == null) {
                appaVarA2 = appa.SEEK_SOURCE_UNKNOWN;
            }
            zcfVar.m(j, appaVarA2);
            if (mediaPushMediaSource.e != jB) {
                mediaPushMediaSource.M(jB);
            }
            mediaPushMediaSource.O(jB);
            synchronized (zik.class) {
                for (jqz jqzVar : this.v) {
                    BufferManagerImpl bufferManagerImpl = this.c;
                    if (!bufferManagerImpl.f(jqzVar, jB).booleanValue()) {
                        if (this.e.H.dw()) {
                            if (jqzVar != jqz.TRACK_TYPE_VIDEO) {
                                str = jqzVar == jqz.TRACK_TYPE_AUDIO ? "a" : "v";
                            }
                            this.e.Z.w("rbrd", a.bT(str, "buf_clear.", ";r.sabr_seek_fail"));
                        }
                        bufferManagerImpl.g(jqzVar);
                    }
                }
            }
        } catch (Throwable th) {
            yno.Q(this.w, th, "onSabrSeek.");
            yno.R(this.e.Z, th);
            if (!this.e.H.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final void onSelectableFormats(SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormats) {
        zcd zcdVar = this.e.C;
        if (zcdVar.b().ordinal() == 1) {
            yop yopVarC = zcdVar.c();
            yop yopVarN = yop.n(yopVarC.a, yopVarC.b, yopVarC.c, yopVarC.d, yopVarC.e, selectableFormatsOuterClass$SelectableFormats, yopVarC.k, yopVarC.l, false, false, yopVarC.m, yopVarC.n, yopVarC.o, yopVarC.p);
            this.e.o(yopVarN);
            if (this.e.H.i.m(225, 45703767L)) {
                return;
            }
            if (Arrays.equals(yopVarC.g, yopVarN.g) && Arrays.equals(yopVarC.h, yopVarN.h)) {
                return;
            }
            this.n.post(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    wgs wgsVar;
                    zcf zcfVar = this.a.e;
                    zco zcoVar = zcfVar.E;
                    yus yusVar = zcoVar == null ? yus.a : zcoVar.d;
                    ywj ywjVar = zcfVar.b;
                    wgs wgsVar2 = zcfVar.F;
                    wgs wgsVar3 = zcfVar.q;
                    wiw[] wiwVarArrO = zcfVar.c().o();
                    wgo[] wgoVarArrM = zcfVar.c().m();
                    yog yogVarC = zcfVar.c().c();
                    yyv yyvVar = zcfVar.af;
                    yvt yvtVarA = yvt.a(yyvVar.d(), yyvVar.e(), yyvVar.q());
                    String strI = null;
                    if (zcfVar.H.cV() && (wgsVar = zcfVar.F) != null) {
                        strI = zcfVar.i(wgsVar.f);
                    }
                    ywjVar.j(new yvu(wgsVar2, wgsVar3, null, wiwVarArrO, wgoVarArrM, yogVarC, 0, yusVar.b, yusVar.c, yvtVarA, null, strI, null, zcfVar.ad));
                }
            });
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final void onStitchedSegmentsMetadataList(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) {
        if (this.e.H.i.m(330, 45752321L)) {
            Iterator it = stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList.getMetadataList().iterator();
            loop0: while (it.hasNext()) {
                Iterator it2 = ((StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata) it.next()).b.iterator();
                while (it2.hasNext()) {
                    if ((((StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion) it2.next()).b & 1) != 0) {
                        this.e.Z.l("roimd", "1");
                        break loop0;
                    }
                }
            }
            this.e.b.x(stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList);
        }
    }

    public final void p() {
        OnesieMediaFetchIntegration onesieMediaFetchIntegration = this.j;
        if (onesieMediaFetchIntegration != null) {
            onesieMediaFetchIntegration.f();
            if (this.e.H.aI()) {
                this.e.Z.l("osap", "1");
            }
        }
        if (this.a != null) {
            this.a.cancelFetches();
        }
    }

    public final void q(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, List list) {
        zhv zhvVar = new zhv("player.exception");
        zhvVar.e(this.b.H());
        zhvVar.c("c.NoMatchingFormatForFormatId");
        zhvVar.c("fmt." + formatIdOuterClass$FormatId.c + '_' + formatIdOuterClass$FormatId.e + '_' + formatIdOuterClass$FormatId.d);
        zhvVar.c("a.".concat(String.valueOf(F(formatIdOuterClass$FormatId, list))));
        zhvVar.e = true;
        this.d.c(zhvVar.a(), this.e);
    }

    final void r() {
        MediaPushMediaSource mediaPushMediaSource = this.b;
        mediaPushMediaSource.L();
        mediaPushMediaSource.K();
        this.y.set(true);
        this.z.set(true);
    }

    public final void s(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        zhv zhvVar = new zhv("player.exception");
        zhvVar.e(this.b.H());
        zhvVar.c("c.NoTrackRendererType");
        zhvVar.c("itag." + formatIdOuterClass$FormatId.c);
        zhvVar.e = true;
        this.d.c(zhvVar.a(), this.e);
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackControllerCallbacks
    public final boolean shouldBlockSabrRequestForSsdai(Time time) {
        return this.e.B.c(time.d());
    }

    final void t(agke agkeVar) {
        PlaybackController playbackController = this.a;
        if (playbackController != null) {
            playbackController.setAuthorizedFormats(new ArrayList(agkeVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    final boolean u(zcf zcfVar, Duration duration) {
        boolean z = false;
        if (!duration.isNegative()) {
            synchronized (this.h) {
                if (!this.i) {
                    Time bufferedPosition = this.c.getBufferedPosition(jqz.TRACK_TYPE_AUDIO.d);
                    if (bufferedPosition.ticks <= 0 || bufferedPosition.timescale != 0) {
                        long jMax = zcfVar.g;
                        if (jMax < 0 || jMax == zcfVar.H.v()) {
                            jMax = Math.max(0L, zcfVar.e);
                        }
                        if (bufferedPosition.d() >= jMax && bufferedPosition.d() - jMax >= duration.toMillis()) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    final boolean v(boolean z) {
        boolean z2 = !b().isEmpty();
        PlaybackController playbackController = this.a;
        if (playbackController == null) {
            return false;
        }
        if (this.e.H.aK() && this.e.y.aD()) {
            p();
            this.c.h(jqz.TRACK_TYPE_AUDIO, this.b.e + (this.e.H.w() * 1000));
        } else {
            d(jqz.TRACK_TYPE_AUDIO, "track_change");
        }
        playbackController.setSelectedAudioFormats(this.e.c().f());
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilitiesB = this.e.b();
        if (this.e.H.W().p && mediaCapabilitiesOuterClass$MediaCapabilitiesB != null) {
            playbackController.setMediaCapabilities(mediaCapabilitiesOuterClass$MediaCapabilitiesB);
        }
        if (!z) {
            return z2;
        }
        d(jqz.TRACK_TYPE_VIDEO, "audio_change");
        playbackController.setSelectedVideoFormats(this.e.c().g());
        return z2;
    }

    final boolean w(boolean z) {
        PlaybackController playbackController;
        if (this.f != z && (playbackController = this.a) != null && this.e.H.bv()) {
            playbackController.setHasMediaView(z);
        }
        if (!y(z)) {
            return false;
        }
        b();
        ArrayList arrayList = (ArrayList) Collection.EL.stream(this.v).map(new PlaybackControllerWrapper$$ExternalSyntheticLambda0()).collect(Collectors.toCollection(new PlaybackControllerWrapper$$ExternalSyntheticLambda1()));
        PlaybackController playbackController2 = this.a;
        if (playbackController2 == null) {
            return false;
        }
        if (z) {
            long j = this.b.e;
            if (j == this.e.H.v()) {
                j = 0;
            }
            BufferManagerImpl bufferManagerImpl = this.c;
            jqz jqzVar = jqz.TRACK_TYPE_VIDEO;
            if (!bufferManagerImpl.f(jqzVar, j).booleanValue()) {
                if (this.e.H.dw()) {
                    this.e.Z.w("rbrd", "buf_clear.v;r.view_seek_fail");
                }
                p();
                bufferManagerImpl.g(jqzVar);
            }
        }
        if (!this.e.H.bv()) {
            playbackController2.setEnabledTracks(arrayList);
        }
        return true;
    }

    final boolean x(boolean z) {
        boolean z2 = !b().isEmpty();
        PlaybackController playbackController = this.a;
        if (playbackController == null) {
            return false;
        }
        if (z) {
            d(jqz.TRACK_TYPE_VIDEO, "track_change");
        }
        playbackController.setSelectedVideoFormats(this.e.c().g());
        return z2;
    }

    final boolean y(boolean z) {
        this.f = z;
        EnumSet enumSet = this.v;
        EnumSet enumSetClone = enumSet.clone();
        enumSet.clear();
        if (this.e.c().i()) {
            enumSet.add(jqz.TRACK_TYPE_AUDIO);
        }
        if (z) {
            if (this.e.c().k()) {
                enumSet.add(jqz.TRACK_TYPE_VIDEO);
            }
            if (this.e.q()) {
                enumSet.add(jqz.TRACK_TYPE_TEXT);
            }
        }
        boolean zEquals = enumSet.equals(enumSetClone);
        boolean z2 = !zEquals;
        if (!zEquals) {
            StartPositionTracker startPositionTrackerE = this.c.e();
            synchronized (startPositionTrackerE) {
                startPositionTrackerE.b = agkz.n(enumSet);
            }
            startPositionTrackerE.a();
        }
        return z2;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder.FormatInitializationMetadataListener
    public final void z(jqz jqzVar) {
        if (this.e.C.b() == zcc.b) {
            synchronized (zik.class) {
                if (this.y.get()) {
                    jqz jqzVar2 = jqz.TRACK_TYPE_VIDEO;
                    if (jqzVar == jqzVar2 && this.v.contains(jqzVar2) && this.x.c == null) {
                        b();
                        D();
                        this.q.B(this);
                    }
                } else {
                    b();
                    D();
                    E();
                }
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource.Client
    public final void i() {
    }
}
