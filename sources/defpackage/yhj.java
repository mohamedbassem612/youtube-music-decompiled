package defpackage;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.MediaHeaderOuterClass$MediaHeader;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yhj extends MediaPushReceiver {
    public final Map a;
    public final ywn b;
    public final ydm d;
    private final jsk e;
    private final Key f;
    private final zjr g;
    private final String h;
    private final xeu i;
    private final Executor j;
    private final yhl k;
    private final yhk l;
    private final abxv r;
    MediaHeaderOuterClass$MediaHeader c = null;
    private long m = 0;
    private long n = 0;
    private boolean o = false;
    private boolean p = false;
    private final Optional q = Optional.empty();

    public yhj(ScheduledExecutorService scheduledExecutorService, jsk jskVar, Key key, zjr zjrVar, abxv abxvVar, String str, ywn ywnVar, xeu xeuVar, yhl yhlVar, ydm ydmVar) {
        Optional.empty();
        this.j = new ahfg(scheduledExecutorService);
        this.e = jskVar;
        this.f = key;
        this.g = zjrVar;
        this.r = abxvVar;
        this.h = str;
        this.a = new ConcurrentHashMap();
        this.b = ywnVar;
        this.i = xeuVar;
        this.k = yhlVar;
        this.d = ydmVar;
        int iD = (int) zjrVar.l.d(4, 45825740L);
        this.l = iD > 0 ? new yhk(iD, zjrVar.l.m(73, 45836714L)) : null;
        yhlVar.b();
    }

    private final ygs a(byte[] bArr, int i, boolean z, boolean z2, AtomicBoolean atomicBoolean) {
        ygp yhyVar;
        FormatIdOuterClass$FormatId defaultInstance = this.c.h;
        if (defaultInstance == null) {
            defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
        }
        yfh yfhVar = new yfh(this.h, defaultInstance, (int) this.c.g);
        if (atomicBoolean != null) {
            yhyVar = new yhy(bArr, i, atomicBoolean, 0);
        } else {
            yhyVar = z2 ? new yhy(bArr, i, this.k, 1) : new ygo(bArr);
        }
        ygs ygsVar = new ygs(this.e, this.f, this.g, yfhVar, yhyVar, this.m, this.o, z, this.r, this.a, this.b);
        if (z && this.d != null) {
            TimeRangeOuterClass$TimeRange defaultInstance2 = this.c.i;
            if (defaultInstance2 == null) {
                defaultInstance2 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
            }
            ygsVar.f = new yhi(this, defaultInstance2);
        }
        return ygsVar;
    }

    private final void b(ygs ygsVar) {
        this.j.execute(ygsVar);
    }

    private final void c() {
        zhv zhvVar = new zhv("cache");
        zhvVar.c = "c.nullmediaheader;op.write";
        this.b.k(zhvVar.a());
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
    public final void donePushing(QoeError qoeError, boolean z) {
        try {
            this.j.execute(afwl.i(new csd(this, z || qoeError != null, 11)));
        } catch (Throwable th) {
            yno.Q(this.i, th, "donePushing.");
            yno.R(this.b, th);
            this.p = true;
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
    public final void pushFormatInitializationMetadata(FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata) {
        jsk jskVar = this.e;
        if (jskVar == null) {
            ywn ywnVar = this.b;
            zhv zhvVar = new zhv("cache");
            zhvVar.c = "c.nullcache.fim;op.write";
            ywnVar.k(zhvVar.a());
            return;
        }
        if (jskVar instanceof ygu) {
            ((ygu) jskVar).y(formatInitializationMetadataOuterClass$FormatInitializationMetadata, this.b);
            return;
        }
        ywn ywnVar2 = this.b;
        zhv zhvVar2 = new zhv("cache");
        zhvVar2.c = "c.unsupportedoperation;op.write";
        ywnVar2.k(zhvVar2.a());
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
    public final void pushSegmentCompleted() {
        yhj yhjVar;
        try {
            if (this.c == null) {
                c();
                return;
            }
            try {
                if (this.p) {
                    yhjVar = this;
                } else if (this.o || this.n != this.m) {
                    yhjVar = this;
                    ywn ywnVar = yhjVar.b;
                    zhv zhvVar = new zhv("cache");
                    zhvVar.c = "c.unexpected.end;op.write;ee." + yhjVar.n + ";ae." + yhjVar.m;
                    ywnVar.k(zhvVar.a());
                } else {
                    yhjVar = this;
                    yhjVar.b(yhjVar.a(new byte[0], 0, true, false, null));
                }
                yhjVar.c = null;
                yhjVar.o = false;
            } catch (Throwable th) {
                th = th;
                yno.Q(yhjVar.i, th, "CacheWriteMediaPushReceiver.pushSegmentCompleted.");
                yno.R(yhjVar.b, th);
                yhjVar.p = true;
            }
        } catch (Throwable th2) {
            th = th2;
            yhjVar = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc A[DONT_GENERATE, DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00de A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
    public final void pushSegmentData(ByteBuffer byteBuffer) {
        xpl xplVar;
        Object objC;
        yhj yhjVar;
        Throwable th;
        Throwable th2;
        boolean z;
        AtomicBoolean atomicBoolean;
        vxz vxzVar = this.g.l;
        int iRemaining = byteBuffer.remaining();
        boolean zM = vxzVar.m(70, 45795044L);
        yhk yhkVar = this.l;
        Object obj = null;
        if (yhkVar != null && iRemaining <= 32768) {
            AtomicInteger atomicInteger = (AtomicInteger) yhkVar.e;
            int i = atomicInteger.get();
            int i2 = 0;
            while (true) {
                int i3 = yhkVar.a;
                if (i2 >= i3) {
                    xplVar = null;
                    break;
                }
                int i4 = (i + i2) % i3;
                AtomicBoolean[] atomicBooleanArr = (AtomicBoolean[]) yhkVar.d;
                if (atomicBooleanArr[i4].compareAndSet(false, true)) {
                    byte[][] bArr = (byte[][]) yhkVar.c;
                    if (bArr[i4].length < iRemaining) {
                        bArr[i4] = new byte[iRemaining];
                    }
                    atomicInteger.set((i4 + 1) % i3);
                    xplVar = new xpl(bArr[i4], atomicBooleanArr[i4]);
                    break;
                }
                i2++;
            }
        } else {
            xplVar = null;
            break;
        }
        if (xplVar != null) {
            Object obj2 = xplVar.a;
            obj = xplVar.b;
            objC = obj2;
        } else if (zM) {
            objC = this.k.c(iRemaining);
        } else {
            byte[] bArr2 = new byte[iRemaining];
            byteBuffer.get(bArr2);
            objC = bArr2;
        }
        Object obj3 = objC;
        Object obj4 = obj;
        if (xplVar != null || zM) {
            try {
                byteBuffer.get((byte[]) obj3, 0, iRemaining);
            } catch (Throwable th3) {
                th = th3;
                yhjVar = this;
                th = th;
                th2 = th;
                z = false;
                try {
                    yno.Q(yhjVar.i, th2, "CacheWriteMediaPushReceiver.pushSegmentData");
                    yno.R(yhjVar.b, th2);
                    yhjVar.p = true;
                    if (!z) {
                        return;
                    }
                    if (obj4 != null) {
                        if (zM) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        atomicBoolean = (AtomicBoolean) obj4;
                        atomicBoolean.set(false);
                    }
                } finally {
                    if (!z) {
                        if (obj4 != null) {
                            ((AtomicBoolean) obj4).set(false);
                        }
                        if (zM) {
                            yhjVar.k.a((byte[]) obj3);
                        }
                    }
                }
            }
        }
        if (this.c == null) {
            try {
                c();
            } catch (Throwable th4) {
                th = th4;
                yhjVar = this;
                th2 = th;
                z = false;
                yno.Q(yhjVar.i, th2, "CacheWriteMediaPushReceiver.pushSegmentData");
                yno.R(yhjVar.b, th2);
                yhjVar.p = true;
                if (!z) {
                    return;
                }
                if (obj4 != null) {
                    if (zM) {
                        return;
                    } else {
                        return;
                    }
                }
                atomicBoolean = (AtomicBoolean) obj4;
            }
        } else if (!this.p) {
            yhjVar = this;
            try {
                ygs ygsVarA = yhjVar.a((byte[]) obj3, iRemaining, false, zM, (AtomicBoolean) obj4);
                yhjVar.q.isPresent();
                yhjVar.b(ygsVarA);
                try {
                    yhjVar.m += (long) iRemaining;
                    yhjVar.o = false;
                    return;
                } catch (Throwable th5) {
                    th2 = th5;
                    z = true;
                    yno.Q(yhjVar.i, th2, "CacheWriteMediaPushReceiver.pushSegmentData");
                    yno.R(yhjVar.b, th2);
                    yhjVar.p = true;
                    if (!z) {
                        if (obj4 != null) {
                            if (zM) {
                                return;
                            } else {
                                return;
                            }
                        } else {
                            atomicBoolean = (AtomicBoolean) obj4;
                            atomicBoolean.set(false);
                        }
                    }
                    return;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
                th2 = th;
                z = false;
                yno.Q(yhjVar.i, th2, "CacheWriteMediaPushReceiver.pushSegmentData");
                yno.R(yhjVar.b, th2);
                yhjVar.p = true;
                if (!z) {
                    if (obj4 != null) {
                        if (zM) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        atomicBoolean = (AtomicBoolean) obj4;
                        atomicBoolean.set(false);
                    }
                }
                return;
            }
        }
        if (obj4 != null) {
            atomicBoolean = (AtomicBoolean) obj4;
            atomicBoolean.set(false);
        } else if (zM) {
            this.k.a((byte[]) obj3);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
    public final void startPushSegment(MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader) {
        int iM;
        try {
            zjr zjrVar = this.g;
            MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfigW = zjrVar.W();
            if (mediaFetchHotConfigOuterClass$MediaFetchHotConfigW != null && (mediaFetchHotConfigOuterClass$MediaFetchHotConfigW.b & 67108864) != 0 && (iM = atqp.M(mediaFetchHotConfigOuterClass$MediaFetchHotConfigW.e)) != 0 && iM == 7) {
                throw new agfz("Force crash during CacheWriteMediaPushReceiver start push segment");
            }
            this.c = mediaHeaderOuterClass$MediaHeader;
            this.o = true;
            long j = mediaHeaderOuterClass$MediaHeader.e;
            if (zjrVar.bF()) {
                long j2 = mediaHeaderOuterClass$MediaHeader.d;
                long j3 = mediaHeaderOuterClass$MediaHeader.k;
                long j4 = j2 + j3;
                this.m = j4;
                this.n = (j4 + j) - j3;
            } else {
                long j5 = mediaHeaderOuterClass$MediaHeader.d;
                this.m = j5;
                this.n = j5 + j;
            }
            this.p = false;
            if (this.e == null) {
                this.p = true;
                ywn ywnVar = this.b;
                zhv zhvVar = new zhv("cache");
                zhvVar.c = "c.nullcache.push;op.write";
                ywnVar.k(zhvVar.a());
                return;
            }
            if (zjrVar.bF() || mediaHeaderOuterClass$MediaHeader.k <= 0) {
                return;
            }
            this.p = true;
            ywn ywnVar2 = this.b;
            zhv zhvVar2 = new zhv("cache");
            zhvVar2.c = "c.unexpectedoffset;op.write";
            ywnVar2.k(zhvVar2.a());
        } catch (Throwable th) {
            yno.Q(this.i, th, "CacheWriteMediaPushReceiver.startPushSegment");
            yno.R(this.b, th);
            this.p = true;
        }
    }
}
