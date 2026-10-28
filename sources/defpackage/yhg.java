package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.MediaHeaderOuterClass$MediaHeader;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeErrorDetail;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yhg {
    private final zjr a;
    private final int b;
    private final boolean c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final PlaybackControllerWrapper e;
    private final abxv f;

    public yhg(zjr zjrVar, abxv abxvVar, PlaybackControllerWrapper playbackControllerWrapper, boolean z) {
        this.a = zjrVar;
        this.b = zjrVar.e();
        this.f = abxvVar;
        this.e = playbackControllerWrapper;
        this.c = z;
    }

    static final void c(MediaPushReceiver mediaPushReceiver, ywn ywnVar, QoeError qoeError) {
        if (qoeError != null) {
            ywnVar.k(zhz.d(qoeError, false));
        }
        mediaPushReceiver.donePushing(qoeError, false);
    }

    public static final void d(MediaPushReceiver mediaPushReceiver, ywn ywnVar) {
        synchronized (zik.class) {
            c(mediaPushReceiver, ywnVar, new QoeError("cache.exception", new ArrayList(Arrays.asList(new QoeErrorDetail("c", "nullds")))));
        }
    }

    private final void e() {
        if (this.d.get()) {
            throw new yhe();
        }
    }

    private final void f(Set set, bye byeVar, String str, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, String str2, MediaPushReceiver mediaPushReceiver, elq elqVar, int i) throws yhc {
        long jQ;
        long j;
        e();
        boolean z = true;
        if (i == 0) {
            jQ = elqVar.s(1);
            j = 0;
        } else {
            long jS = elqVar.s(i);
            jQ = elqVar.q(i);
            j = jS;
        }
        zhq zhqVar = zhq.ABR;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((jsk) it.next()).o(str2, j, jQ)) {
                aihf aihfVarCreateBuilder = MediaHeaderOuterClass$MediaHeader.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader = (MediaHeaderOuterClass$MediaHeader) aihfVarCreateBuilder.instance;
                str.getClass();
                mediaHeaderOuterClass$MediaHeader.b |= 2;
                mediaHeaderOuterClass$MediaHeader.c = str;
                aihfVarCreateBuilder.copyOnWrite();
                MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader2 = (MediaHeaderOuterClass$MediaHeader) aihfVarCreateBuilder.instance;
                formatIdOuterClass$FormatId.getClass();
                mediaHeaderOuterClass$MediaHeader2.h = formatIdOuterClass$FormatId;
                mediaHeaderOuterClass$MediaHeader2.b |= 16384;
                aihfVarCreateBuilder.copyOnWrite();
                MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader3 = (MediaHeaderOuterClass$MediaHeader) aihfVarCreateBuilder.instance;
                mediaHeaderOuterClass$MediaHeader3.b |= SemanticState.ReadOnly;
                mediaHeaderOuterClass$MediaHeader3.g = i;
                aihfVarCreateBuilder.copyOnWrite();
                MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader4 = (MediaHeaderOuterClass$MediaHeader) aihfVarCreateBuilder.instance;
                mediaHeaderOuterClass$MediaHeader4.b |= 64;
                mediaHeaderOuterClass$MediaHeader4.e = jQ;
                aihfVarCreateBuilder.copyOnWrite();
                MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader5 = (MediaHeaderOuterClass$MediaHeader) aihfVarCreateBuilder.instance;
                mediaHeaderOuterClass$MediaHeader5.b |= 32;
                mediaHeaderOuterClass$MediaHeader5.d = j;
                if (i > 0) {
                    long jT = elqVar.t(i);
                    long jR = elqVar.r(i);
                    aihf aihfVarCreateBuilder2 = TimeRangeOuterClass$TimeRange.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder2.instance;
                    timeRangeOuterClass$TimeRange.b |= 1;
                    timeRangeOuterClass$TimeRange.c = jT;
                    aihfVarCreateBuilder2.copyOnWrite();
                    TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder2.instance;
                    timeRangeOuterClass$TimeRange2.b |= 2;
                    timeRangeOuterClass$TimeRange2.d = jR;
                    aihfVarCreateBuilder2.copyOnWrite();
                    TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder2.instance;
                    timeRangeOuterClass$TimeRange3.b |= 4;
                    timeRangeOuterClass$TimeRange3.e = 1000000;
                    TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange4 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader6 = (MediaHeaderOuterClass$MediaHeader) aihfVarCreateBuilder.instance;
                    timeRangeOuterClass$TimeRange4.getClass();
                    mediaHeaderOuterClass$MediaHeader6.i = timeRangeOuterClass$TimeRange4;
                    mediaHeaderOuterClass$MediaHeader6.b |= 32768;
                } else {
                    aihfVarCreateBuilder.copyOnWrite();
                    MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader7 = (MediaHeaderOuterClass$MediaHeader) aihfVarCreateBuilder.instance;
                    mediaHeaderOuterClass$MediaHeader7.b |= SemanticState.LiveRegion;
                    mediaHeaderOuterClass$MediaHeader7.f = z;
                }
                MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader8 = (MediaHeaderOuterClass$MediaHeader) aihfVarCreateBuilder.build();
                int i2 = this.b;
                byte[] bArr = new byte[i2];
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
                byh byhVar = new byh();
                byhVar.g = j;
                byhVar.h = jQ;
                byhVar.a = Uri.EMPTY;
                byhVar.i = str2;
                byi byiVarA = byhVar.a();
                try {
                    synchronized (zik.class) {
                        mediaPushReceiver.startPushSegment(mediaHeaderOuterClass$MediaHeader8);
                        if (jQ <= 0) {
                            mediaPushReceiver.pushSegmentCompleted();
                        } else {
                            byeVar.b(byiVarA);
                            long j2 = jQ;
                            while (j2 > 0) {
                                e();
                                int iA = byeVar.a(bArr, 0, (int) Math.min(j2, i2));
                                long j3 = j;
                                if (iA == -1) {
                                    throw new IOException(String.format("Could not read %d bytes from %d for stream %s", Long.valueOf(jQ), Long.valueOf(j3), str2));
                                }
                                j2 -= (long) iA;
                                byteBufferAllocateDirect.clear();
                                byteBufferAllocateDirect.put(bArr, 0, iA);
                                byteBufferAllocateDirect.flip();
                                synchronized (zik.class) {
                                    try {
                                        mediaPushReceiver.pushSegmentData(byteBufferAllocateDirect);
                                        if (j2 <= 0) {
                                            mediaPushReceiver.pushSegmentCompleted();
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                j = j3;
                            }
                        }
                    }
                    byeVar.f();
                    return;
                } catch (Throwable th2) {
                    byeVar.f();
                    throw th2;
                }
            }
            z = z;
        }
        throw new yhc(i);
    }

    public final void a() {
        boolean z = this.c;
        zjr zjrVar = this.a;
        boolean z2 = z ? zjrVar.W().x : zjrVar.W().k;
        zhq zhqVar = zhq.ABR;
        if (z2) {
            this.d.set(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[Catch: Exception -> 0x0150, yhe -> 0x01d8, all -> 0x01dd, TryCatch #0 {Exception -> 0x0150, blocks: (B:3:0x0011, B:7:0x0037, B:8:0x003e, B:9:0x003f, B:11:0x0056, B:14:0x0061, B:16:0x0065, B:18:0x006b, B:20:0x0073, B:21:0x007a, B:33:0x009c, B:67:0x012f, B:22:0x007b, B:24:0x0081, B:26:0x008b, B:27:0x0092, B:28:0x0093, B:29:0x0095, B:39:0x00a7, B:43:0x00ac, B:58:0x010c, B:59:0x0111, B:77:0x013c, B:78:0x0143, B:81:0x0148, B:82:0x014f), top: B:109:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008b A[Catch: Exception -> 0x0150, yhe -> 0x01d8, all -> 0x01dd, TryCatch #0 {Exception -> 0x0150, blocks: (B:3:0x0011, B:7:0x0037, B:8:0x003e, B:9:0x003f, B:11:0x0056, B:14:0x0061, B:16:0x0065, B:18:0x006b, B:20:0x0073, B:21:0x007a, B:33:0x009c, B:67:0x012f, B:22:0x007b, B:24:0x0081, B:26:0x008b, B:27:0x0092, B:28:0x0093, B:29:0x0095, B:39:0x00a7, B:43:0x00ac, B:58:0x010c, B:59:0x0111, B:77:0x013c, B:78:0x0143, B:81:0x0148, B:82:0x014f), top: B:109:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[Catch: Exception -> 0x0150, yhe -> 0x01d8, all -> 0x01dd, TryCatch #0 {Exception -> 0x0150, blocks: (B:3:0x0011, B:7:0x0037, B:8:0x003e, B:9:0x003f, B:11:0x0056, B:14:0x0061, B:16:0x0065, B:18:0x006b, B:20:0x0073, B:21:0x007a, B:33:0x009c, B:67:0x012f, B:22:0x007b, B:24:0x0081, B:26:0x008b, B:27:0x0092, B:28:0x0093, B:29:0x0095, B:39:0x00a7, B:43:0x00ac, B:58:0x010c, B:59:0x0111, B:77:0x013c, B:78:0x0143, B:81:0x0148, B:82:0x014f), top: B:109:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0132  */
    final void b(Set set, bye byeVar, String str, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange, MediaPushReceiver mediaPushReceiver, ywn ywnVar, boolean z, boolean z2) throws Throwable {
        int i;
        PlaybackControllerWrapper playbackControllerWrapper;
        yhg yhgVar = this;
        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = formatIdOuterClass$FormatId;
        MediaPushReceiver mediaPushReceiver2 = mediaPushReceiver;
        try {
            try {
                try {
                    yhgVar.e();
                    zhq zhqVar = zhq.ABR;
                    int i2 = formatIdOuterClass$FormatId2.c;
                    zic.b(timeRangeOuterClass$TimeRange.c, timeRangeOuterClass$TimeRange.e);
                    zic.b(timeRangeOuterClass$TimeRange.c + timeRangeOuterClass$TimeRange.d, timeRangeOuterClass$TimeRange.e);
                    if (timeRangeOuterClass$TimeRange.d <= 0 && !z2 && !z) {
                        throw new yhd("Non-positive duration.");
                    }
                    String strBu = zik.bu(str, formatIdOuterClass$FormatId2.c, formatIdOuterClass$FormatId2.e, formatIdOuterClass$FormatId2.d);
                    elq elqVarG = elq.G(yhgVar.f.A(set, strBu, false));
                    if (z) {
                        yhgVar.e();
                        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataBr = zik.br(set, str, formatIdOuterClass$FormatId2);
                        if (formatInitializationMetadataOuterClass$FormatInitializationMetadataBr == null && elqVarG != null && (playbackControllerWrapper = yhgVar.e) != null) {
                            wgs wgsVarA = playbackControllerWrapper.a(formatIdOuterClass$FormatId2);
                            if (wgsVarA != null) {
                                formatInitializationMetadataOuterClass$FormatInitializationMetadataBr = zik.cs(str, formatIdOuterClass$FormatId2, wgsVarA, elqVarG);
                                if (formatInitializationMetadataOuterClass$FormatInitializationMetadataBr == null) {
                                    int i3 = formatIdOuterClass$FormatId2.c;
                                    if (yhgVar.a.dG()) {
                                        throw new yhb("Cannot create FormatInitializationMetadata, missing format stream provider");
                                    }
                                } else {
                                    int i4 = formatIdOuterClass$FormatId2.c;
                                    synchronized (zik.class) {
                                        mediaPushReceiver2.pushFormatInitializationMetadata(formatInitializationMetadataOuterClass$FormatInitializationMetadataBr);
                                    }
                                }
                            } else if (yhgVar.a.dG()) {
                                throw new yhb("Cannot create FormatInitializationMetadata, missing format stream model");
                            }
                        } else if (formatInitializationMetadataOuterClass$FormatInitializationMetadataBr == null) {
                            int i5 = formatIdOuterClass$FormatId2.c;
                            if (yhgVar.a.dG()) {
                                throw new yhb("Cannot create FormatInitializationMetadata, missing format stream provider");
                            }
                        } else {
                            int i6 = formatIdOuterClass$FormatId2.c;
                            synchronized (zik.class) {
                                try {
                                    mediaPushReceiver2.pushFormatInitializationMetadata(formatInitializationMetadataOuterClass$FormatInitializationMetadataBr);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (timeRangeOuterClass$TimeRange.d > 0 || z2) {
                        }
                        int i7 = formatIdOuterClass$FormatId2.c;
                        synchronized (zik.class) {
                            c(mediaPushReceiver2, ywnVar, null);
                        }
                    }
                    if (elqVarG == null) {
                        throw new yhd("Missing segment map");
                    }
                    try {
                        long jB = zic.b(timeRangeOuterClass$TimeRange.c, timeRangeOuterClass$TimeRange.e);
                        long jB2 = zic.b(timeRangeOuterClass$TimeRange.c + timeRangeOuterClass$TimeRange.d, timeRangeOuterClass$TimeRange.e);
                        int iO = elqVarG.o(jB);
                        int iO2 = elqVarG.o(jB2);
                        if (z2) {
                            try {
                                f(set, byeVar, str, formatIdOuterClass$FormatId2, strBu, mediaPushReceiver2, elqVarG, 0);
                                i = 1;
                            } catch (yhe unused) {
                                formatIdOuterClass$FormatId2 = formatIdOuterClass$FormatId;
                                zhq zhqVar2 = zhq.ABR;
                                int i8 = formatIdOuterClass$FormatId2.c;
                                return;
                            } catch (Exception e) {
                                e = e;
                                yhgVar = this;
                                formatIdOuterClass$FormatId2 = formatIdOuterClass$FormatId;
                                mediaPushReceiver2 = mediaPushReceiver;
                                zhr.c(zhq.CACHE, e, "readTimeRange: error for videoId=%s, itag=%d", str, Integer.valueOf(formatIdOuterClass$FormatId2.c));
                                double dA = zic.a(timeRangeOuterClass$TimeRange.c, timeRangeOuterClass$TimeRange.e);
                                double dA2 = zic.a(timeRangeOuterClass$TimeRange.d, timeRangeOuterClass$TimeRange.e);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new QoeErrorDetail("m", ahno.Z(e.getMessage())));
                                arrayList.add(new QoeErrorDetail("info", String.format(Locale.US, "itag.%d_st.%.3f_dur.%.3f_off.%s", Integer.valueOf(formatIdOuterClass$FormatId2.c), Double.valueOf(dA), Double.valueOf(dA2), true != yhgVar.c ? "0" : "1")));
                                QoeError qoeError = new QoeError("cache.exception", arrayList);
                                synchronized (zik.class) {
                                    c(mediaPushReceiver2, ywnVar, qoeError);
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                mediaPushReceiver2 = mediaPushReceiver;
                                synchronized (zik.class) {
                                    c(mediaPushReceiver2, ywnVar, null);
                                    throw th;
                                }
                            }
                        } else {
                            i = 0;
                        }
                        int i9 = i;
                        for (int i10 = iO; i10 <= iO2; i10++) {
                            long jT = elqVarG.t(i10);
                            if (elqVarG.r(i10) + jT > jB + 100 && jT < jB2 - 100) {
                                f(set, byeVar, str, formatIdOuterClass$FormatId, strBu, mediaPushReceiver, elqVarG, i10);
                                i9++;
                            }
                        }
                        formatIdOuterClass$FormatId2 = formatIdOuterClass$FormatId;
                        mediaPushReceiver2 = mediaPushReceiver;
                        if (i9 == 0) {
                            throw new yhd("No segments read");
                        }
                        int i11 = formatIdOuterClass$FormatId2.c;
                        synchronized (zik.class) {
                            c(mediaPushReceiver2, ywnVar, null);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        yhgVar = this;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (yhe unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
