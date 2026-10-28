package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import app.rive.semantics.SemanticState;
import defpackage.abxv;
import defpackage.aigi;
import defpackage.aigj;
import defpackage.axo;
import defpackage.brv;
import defpackage.bse;
import defpackage.bwb;
import defpackage.cwi;
import defpackage.jqz;
import defpackage.yxl;
import defpackage.yxm;
import defpackage.zhv;
import defpackage.zic;
import defpackage.zjr;
import j$.time.Duration;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class CaptionMediaSegmentHolder extends MediaSegmentHolder {
    private final aigi K;
    public volatile yxl a;

    public CaptionMediaSegmentHolder(axo axoVar, long j, long j2, String str, abxv abxvVar, zjr zjrVar, StartPositionTracker startPositionTracker, Long l) {
        super(jqz.TRACK_TYPE_TEXT, axoVar, j2, str, abxvVar, zjrVar, startPositionTracker, l);
        aigj aigjVar = aigj.d;
        this.K = new aigi(SemanticState.Focused);
        int i = zic.a;
        g(j);
    }

    private final void K(BufferedMediaSegment bufferedMediaSegment, long j, long j2) {
        String str;
        aigi aigiVar = this.K;
        int iA = aigiVar.a();
        bwb bwbVar = iA > 0 ? new bwb(aigiVar.b().G()) : null;
        Duration durationOfNanos = Duration.ofNanos(1000 * j);
        yxl yxlVar = this.a;
        if (yxlVar != null && j2 > 0) {
            try {
                int i = bufferedMediaSegment.a.c;
                yxlVar.bv(bwbVar, durationOfNanos, iA);
            } catch (yxm e) {
                StringBuilder sb = new StringBuilder("c.");
                int i2 = e.a;
                if (i2 == 0) {
                    throw null;
                }
                int i3 = i2 - 1;
                if (i3 == 0) {
                    str = "MdatParseError";
                } else if (i3 == 1) {
                    str = "OffsetZeroError";
                } else if (i3 == 2) {
                    str = "CaptionDataNull";
                } else if (i3 == 3) {
                    str = "CueRangeFailure";
                } else if (i3 == 4) {
                    str = "ProcessorNullError";
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(null, null);
                    }
                    str = "WebvttUnsupported";
                }
                sb.append(str);
                sb.append(";rcv.");
                sb.append(bufferedMediaSegment.b);
                zhv zhvVar = new zhv("captions.unparseable");
                zhvVar.e(durationOfNanos.toMillis());
                zhvVar.c = sb.toString();
                zhvVar.d = e;
                zhvVar.e = false;
                this.c.accept(zhvVar.a());
            }
        }
        this.K.c();
        super.b(bufferedMediaSegment, j, j2);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final synchronized void a() {
        super.a();
        yxl yxlVar = this.a;
        if (yxlVar != null) {
            yxlVar.bk();
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void b(BufferedMediaSegment bufferedMediaSegment, long j, long j2) {
        if (!this.d.dJ()) {
            K(bufferedMediaSegment, j, j2);
            return;
        }
        synchronized (this) {
            MediaSegmentHolder.MediaPushReceiverImpl mediaPushReceiverImpl = this.G;
            if (mediaPushReceiverImpl == null || !mediaPushReceiverImpl.d) {
                K(bufferedMediaSegment, j, j2);
            } else {
                this.K.c();
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void c() {
        this.K.c();
    }

    public final synchronized void d() {
        this.z.clear();
        this.n = false;
        this.p = 0L;
        J();
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void e(bwb bwbVar, int i, int i2) {
        byte[] bArrArray = ByteBuffer.allocate(i).array();
        bwbVar.K(bArrArray, 0, i);
        this.K.write(bArrArray, 0, i);
    }

    public final synchronized void g(long j) {
        if (this.i > 0 && j >= this.i - 10000) {
            this.n = true;
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final synchronized boolean j(BufferedMediaSegment bufferedMediaSegment, int i, boolean z) {
        super.j(bufferedMediaSegment, i, z);
        yxl yxlVar = this.a;
        if (yxlVar != null) {
            yxlVar.bm(Duration.ofMillis(bufferedMediaSegment.e() / 1000));
        }
        return true;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final synchronized boolean k(long j) {
        if (j == Long.MAX_VALUE) {
            return false;
        }
        g(j);
        return n(j) >= 0;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final int l(brv brvVar, int i, boolean z) throws EOFException {
        byte[] bArrArray = ByteBuffer.allocate(i).array();
        int iA = brvVar.a(bArrArray, 0, i);
        this.K.write(bArrArray, 0, iA);
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void h(bse bseVar) {
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void i(long j) {
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaSegmentHolder
    public final void f(long j, int i, int i2, int i3, cwi cwiVar) {
    }
}
