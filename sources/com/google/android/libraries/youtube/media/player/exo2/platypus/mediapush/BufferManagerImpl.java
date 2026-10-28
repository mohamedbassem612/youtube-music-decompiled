package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.streaming.EndOfTrackOuterClass$EndOfTrack;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.libraries.youtube.media.interfaces.BufferManager;
import com.google.android.libraries.youtube.media.interfaces.BufferState;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.Time;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder.MediaPushReceiverImpl;
import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;
import com.youtube.android.libraries.elements.StatusOr;
import defpackage.aae;
import defpackage.abxv;
import defpackage.axo;
import defpackage.cjz;
import defpackage.cra;
import defpackage.crf;
import defpackage.jqz;
import defpackage.xeu;
import defpackage.yno;
import defpackage.yxl;
import defpackage.zhq;
import defpackage.zjr;
import defpackage.zkf;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class BufferManagerImpl extends BufferManager {
    public final SampleHolder a;
    public final SampleHolder b;
    public final CaptionMediaSegmentHolder c;
    public volatile axo d;
    public final zjr e;
    public volatile boolean f;
    private final StartPositionTracker g;
    private final axo h;
    private final xeu i;
    private final String j;
    private volatile String k;

    /* JADX INFO: renamed from: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jqz.values().length];
            a = iArr;
            try {
                iArr[jqz.TRACK_TYPE_AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[jqz.TRACK_TYPE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[jqz.TRACK_TYPE_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BufferManagerImpl(cjz cjzVar, aae aaeVar, axo axoVar, MediaParser.Factory factory, long j, long j2, axo axoVar2, String str, String str2, xeu xeuVar, zjr zjrVar, abxv abxvVar, ScheduledExecutorService scheduledExecutorService, yxl yxlVar, Long l, boolean z) {
        StartPositionTracker startPositionTracker = new StartPositionTracker();
        this.g = startPositionTracker;
        crf crfVar = new crf(false, 51200);
        this.h = axoVar;
        this.d = axoVar2;
        this.k = str2;
        this.i = xeuVar;
        this.e = zjrVar;
        this.j = str;
        if (j < 0) {
            Utils.QoeErrorBuilder qoeErrorBuilder = new Utils.QoeErrorBuilder("invalid.parameter");
            qoeErrorBuilder.b("c.bufferManagerSt", Long.valueOf(j));
            qoeErrorBuilder.a(axoVar);
        }
        this.a = l(jqz.TRACK_TYPE_AUDIO, crfVar, cjzVar, aaeVar, axoVar, factory, j, j2, str, abxvVar, zjrVar, new Supplier() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.d;
            }
        }, scheduledExecutorService, startPositionTracker, l, z);
        this.b = l(jqz.TRACK_TYPE_VIDEO, crfVar, cjzVar, aaeVar, axoVar, factory, j, j2, str, abxvVar, zjrVar, new Supplier() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.d;
            }
        }, scheduledExecutorService, startPositionTracker, l, z);
        CaptionMediaSegmentHolder captionMediaSegmentHolder = new CaptionMediaSegmentHolder(axoVar, j, j2, str, abxvVar, zjrVar, startPositionTracker, l);
        this.c = captionMediaSegmentHolder;
        if (yxlVar != null) {
            captionMediaSegmentHolder.a = yxlVar;
        }
    }

    private static SampleHolder l(jqz jqzVar, cra craVar, cjz cjzVar, aae aaeVar, axo axoVar, MediaParser.Factory factory, long j, long j2, String str, abxv abxvVar, zjr zjrVar, Supplier supplier, ScheduledExecutorService scheduledExecutorService, StartPositionTracker startPositionTracker, Long l, boolean z) {
        return zjrVar.W().y ? new ReadWriteLockSampleHolder(jqzVar, craVar, cjzVar, aaeVar, axoVar, factory, j, j2, str, abxvVar, zjrVar, supplier, scheduledExecutorService, startPositionTracker, l, z) : new SampleHolder(jqzVar, craVar, cjzVar, aaeVar, axoVar, j, j2, str, abxvVar, zjrVar, supplier, scheduledExecutorService, startPositionTracker, l, z);
    }

    final long a() {
        return Math.max(this.a.K(), this.b.K());
    }

    public final FormatInitializationMetadataOuterClass$FormatInitializationMetadata b(jqz jqzVar) {
        return c(jqzVar).l;
    }

    public final MediaSegmentHolder c(jqz jqzVar) {
        int iOrdinal = jqzVar.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        throw new RuntimeException(null, null);
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final void clearPartialSegments(ArrayList arrayList) {
        if (this.f) {
            axo axoVar = this.d;
            PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
            platypusExceptionBuilder.b("c", "clearPartialSegments with disposed BufferManager");
            axoVar.accept(platypusExceptionBuilder.a());
        }
    }

    final SampleHolder d(jqz jqzVar) {
        return jqzVar == jqz.TRACK_TYPE_AUDIO ? this.a : this.b;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final void discardBuffer() {
        try {
            if (this.f) {
                axo axoVar = this.d;
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                platypusExceptionBuilder.b("c", "discardBuffer with disposed BufferManager");
                axoVar.accept(platypusExceptionBuilder.a());
            } else {
                zhq zhqVar = zhq.ABR;
                String str = this.k;
                this.a.a();
                this.b.a();
                this.c.a();
            }
        } catch (RuntimeException e) {
            yno.Q(this.i, e, "Fail to discardBuffer");
            axo axoVar2 = this.d;
            PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder2 = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.d);
            platypusExceptionBuilder2.a = e;
            axoVar2.accept(platypusExceptionBuilder2.a());
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final void discardBufferForTrack(int i) {
        try {
            jqz jqzVarA = jqz.a(i);
            if (jqzVarA == null) {
                Utils.QoeErrorBuilder qoeErrorBuilder = new Utils.QoeErrorBuilder("invalid.parameter");
                qoeErrorBuilder.b("c", "bufferManagerDiscardBufferForTrack");
                qoeErrorBuilder.b("tracktype", Integer.valueOf(i));
                qoeErrorBuilder.a(this.h);
            } else {
                g(jqzVarA);
            }
        } catch (Throwable th) {
            yno.Q(this.i, th, "Fail to discardBufferForTrack");
            if (!this.e.dU()) {
                throw th;
            }
        }
    }

    public final StartPositionTracker e() {
        if (this.f) {
            axo axoVar = this.d;
            PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
            platypusExceptionBuilder.b("c", "getStartPositionTracker with disposed BufferManager");
            axoVar.accept(platypusExceptionBuilder.a());
        }
        return this.g;
    }

    public final Boolean f(jqz jqzVar, long j) {
        if (!this.f) {
            return Boolean.valueOf(c(jqzVar).k(j));
        }
        axo axoVar = this.d;
        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
        platypusExceptionBuilder.b("c", "seek with disposed BufferManager");
        axoVar.accept(platypusExceptionBuilder.a());
        return Boolean.FALSE;
    }

    public final void g(jqz jqzVar) {
        if (!this.f) {
            c(jqzVar).a();
            return;
        }
        axo axoVar = this.d;
        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
        platypusExceptionBuilder.b("c", "discardBuffer with disposed BufferManager for trackType");
        axoVar.accept(platypusExceptionBuilder.a());
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final BufferState getBufferState(int i) {
        try {
            jqz jqzVarA = jqz.a(i);
            zkf.d(jqzVarA);
            if (this.f) {
                axo axoVar = this.d;
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                platypusExceptionBuilder.b("c", "getBufferState with disposed BufferManager");
                axoVar.accept(platypusExceptionBuilder.a());
            }
            return c(jqzVarA).q();
        } catch (Throwable th) {
            yno.Q(this.i, th, "Fail to getBufferState");
            throw th;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final Time getBufferedPosition(int i) {
        if (!this.f) {
            jqz jqzVarA = jqz.a(i);
            zkf.d(jqzVarA);
            MediaSegmentHolder mediaSegmentHolderC = c(jqzVarA);
            return mediaSegmentHolderC.n ? Time.b : new Time(mediaSegmentHolderC.p, 1000000L);
        }
        axo axoVar = this.d;
        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
        platypusExceptionBuilder.b("c", "getBufferedPosition with disposed BufferManager");
        axoVar.accept(platypusExceptionBuilder.a());
        return Time.b;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final FormatInitializationMetadataOuterClass$FormatInitializationMetadata getFormatInitializationMetadata(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataP = null;
        if (this.f) {
            axo axoVar = this.d;
            PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
            platypusExceptionBuilder.b("c", "getFormatInitializationMetadata with disposed BufferManager");
            axoVar.accept(platypusExceptionBuilder.a());
        } else {
            try {
                SampleHolder sampleHolder = this.b;
                if (sampleHolder.p(formatIdOuterClass$FormatId) != null) {
                    formatInitializationMetadataOuterClass$FormatInitializationMetadataP = sampleHolder.p(formatIdOuterClass$FormatId);
                } else {
                    SampleHolder sampleHolder2 = this.a;
                    if (sampleHolder2.p(formatIdOuterClass$FormatId) != null) {
                        formatInitializationMetadataOuterClass$FormatInitializationMetadataP = sampleHolder2.p(formatIdOuterClass$FormatId);
                    } else {
                        CaptionMediaSegmentHolder captionMediaSegmentHolder = this.c;
                        if (captionMediaSegmentHolder.p(formatIdOuterClass$FormatId) != null) {
                            formatInitializationMetadataOuterClass$FormatInitializationMetadataP = captionMediaSegmentHolder.p(formatIdOuterClass$FormatId);
                        }
                    }
                }
            } catch (Throwable th) {
                yno.Q(this.i, th, "Fail to getFormatInitializationMetadata");
                if (!this.e.dU()) {
                    throw th;
                }
            }
        }
        return formatInitializationMetadataOuterClass$FormatInitializationMetadataP;
    }

    public final void h(jqz jqzVar, long j) {
        if (!this.f) {
            c(jqzVar).v(j);
            return;
        }
        axo axoVar = this.d;
        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
        platypusExceptionBuilder.b("c", "discardBufferAfterCurrentSegment with disposed BufferManager");
        axoVar.accept(platypusExceptionBuilder.a());
    }

    public final void i() {
        if (!this.f) {
            this.a.O();
            this.b.O();
        } else {
            axo axoVar = this.d;
            PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
            platypusExceptionBuilder.b("c", "preRelease with disposed BufferManager");
            axoVar.accept(platypusExceptionBuilder.a());
        }
    }

    public final void j(axo axoVar) {
        if (!this.f) {
            this.d = axoVar;
            return;
        }
        PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
        platypusExceptionBuilder.b("c", "setErrorHandler with disposed BufferManager");
        axoVar.accept(platypusExceptionBuilder.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if ((r20 - r11) > 10000000) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.String r19, long r20, long r22, defpackage.cjz r24, defpackage.yxl r25, boolean r26, java.lang.Long r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl.k(java.lang.String, long, long, cjz, yxl, boolean, java.lang.Long, boolean):boolean");
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final void onEndOfTrack(EndOfTrackOuterClass$EndOfTrack endOfTrackOuterClass$EndOfTrack) {
        if (this.f) {
            axo axoVar = this.d;
            PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
            platypusExceptionBuilder.b("c", "onEndOfTrack with disposed BufferManager");
            axoVar.accept(platypusExceptionBuilder.a());
            return;
        }
        try {
            if (this.e.j.m(143, 45429167L)) {
                jqz jqzVarA = jqz.a(endOfTrackOuterClass$EndOfTrack.b);
                if (jqzVarA == null) {
                    jqzVarA = jqz.TRACK_TYPE_AUDIO;
                }
                SampleHolder sampleHolderD = d(jqzVarA);
                if (sampleHolderD.n) {
                    return;
                }
                sampleHolderD.D();
                Utils.QoeErrorBuilder qoeErrorBuilder = new Utils.QoeErrorBuilder("sabr.endoftrack");
                qoeErrorBuilder.b("tracktype", sampleHolderD.b);
                qoeErrorBuilder.a(sampleHolderD.c);
            }
        } catch (Throwable th) {
            yno.Q(this.i, th, "Fail to onEndOfTrack");
            if (!this.e.dU()) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final StatusOr startPush(int i, String str, MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo) {
        try {
            jqz jqzVarA = jqz.a(i);
            zkf.d(jqzVarA);
            if (this.f) {
                axo axoVar = this.d;
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.e);
                platypusExceptionBuilder.b("c", "startPush with disposed BufferManager");
                axoVar.accept(platypusExceptionBuilder.a());
            }
            MediaSegmentHolder mediaSegmentHolderC = c(jqzVarA);
            mediaSegmentHolderC.G = mediaSegmentHolderC.new MediaPushReceiverImpl(str, new Supplier() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl$$ExternalSyntheticLambda2
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.a.d;
                }
            }, this.i, mediaSegmentHolderC.h, mediaSource$MediaSourceInfo);
            return StatusOr.fromValue(mediaSegmentHolderC.G);
        } catch (Throwable th) {
            yno.Q(this.i, th, "Fail to startPush");
            Utils.QoeErrorBuilder qoeErrorBuilder = new Utils.QoeErrorBuilder("invalid.parameter");
            qoeErrorBuilder.b("c", "bufferManagerStartPush");
            qoeErrorBuilder.a(this.h);
            return StatusOr.fromStatus(Status.l);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.BufferManager
    public final void donePushing(QoeError qoeError) {
    }
}
