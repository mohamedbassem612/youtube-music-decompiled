package defpackage;

import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.av1.Dav1dDecoder;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jug implements jva {
    public volatile boolean a;
    private final cso b;
    private cay c;
    private bse d;
    private Surface e;
    private VideoDecoderOutputBuffer f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private String l;
    private long m;
    private long n;
    private final yyg o;
    private juw p;

    public jug(yyg yygVar) {
        this.n = -9223372036854775807L;
        this.o = yygVar;
        this.k = 4;
        this.l = "libdav1d(AV1-SW,threads=4)";
        cso csoVar = null;
        if (yygVar != null && yygVar.D()) {
            csoVar = new cso();
        }
        this.b = csoVar;
    }

    private final void t() {
        juw juwVar = this.p;
        if (juwVar == null || this.j) {
            return;
        }
        try {
            DecoderInputBuffer decoderInputBufferDequeueInputBuffer = juwVar.dequeueInputBuffer();
            if (decoderInputBufferDequeueInputBuffer != null) {
                yyg yygVar = this.o;
                if (yygVar == null || yygVar.q()) {
                    decoderInputBufferDequeueInputBuffer.clear();
                    decoderInputBufferDequeueInputBuffer.addFlag(4);
                } else {
                    decoderInputBufferDequeueInputBuffer.setFlags(4);
                }
                this.p.queueInputBuffer(decoderInputBufferDequeueInputBuffer);
                this.j = true;
            }
        } catch (can e) {
            bvx.f("Dav1dDecoderEngine", "Failed to signal EOS to Dav1d", e);
        }
    }

    @Override // defpackage.jva
    public final int a(bse bseVar, Surface surface, cju cjuVar, cay cayVar) {
        yyg yygVar;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.f = null;
        }
        int iAa = 2;
        if (this.a && (yygVar = this.o) != null && yygVar.F()) {
            return 2;
        }
        this.d = bseVar;
        this.e = surface;
        this.c = cayVar;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
        if (cayVar != null) {
            cayVar.a++;
        }
        try {
            juw juwVar = this.p;
            if (juwVar != null) {
                juwVar.release();
                this.p = null;
            }
            yyg yygVar2 = this.o;
            if (yygVar2 != null && yygVar2.d() > 0) {
                iAa = yygVar2.d();
            }
            if (yygVar2 != null && yygVar2.o()) {
                iAa = hna.aa(iAa, this.k, 4, 4);
            }
            juw juwVar2 = new juw(new Dav1dDecoder(4, 4, 1048576, this.k, iAa, false, yygVar2 != null ? yygVar2.e() : -99));
            this.p = juwVar2;
            juwVar2.e(1);
            return 0;
        } catch (can | RuntimeException e) {
            bvx.d("Dav1dDecoderEngine", "Decoder initialization failed", e);
            return 1;
        }
    }

    @Override // defpackage.jva
    public final bse b() {
        return this.d;
    }

    @Override // defpackage.jva
    public final String c() {
        return this.l;
    }

    @Override // defpackage.jva
    public final void d() {
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.f = null;
        }
        juw juwVar = this.p;
        if (juwVar != null) {
            juwVar.flush();
        }
        cso csoVar = this.b;
        if (csoVar != null) {
            csoVar.c();
        }
    }

    @Override // defpackage.jva
    public final void e() {
        this.h = false;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.f = null;
        }
        juw juwVar = this.p;
        if (juwVar != null) {
            juwVar.release();
            this.p = null;
        }
        cso csoVar = this.b;
        if (csoVar != null) {
            csoVar.c();
        }
        this.e = null;
        this.d = null;
        cay cayVar = this.c;
        if (cayVar != null) {
            cayVar.b++;
        }
    }

    @Override // defpackage.jva
    public final void g(long j) {
        this.n = j;
        if (this.p != null) {
            yyg yygVar = this.o;
            if (yygVar == null || yygVar.C()) {
                this.p.setOutputStartTimeUs(j);
            }
        }
    }

    @Override // defpackage.jva
    public final void h(Surface surface) {
        this.e = surface;
        juw juwVar = this.p;
        if (juwVar != null) {
            juwVar.e(1);
        }
    }

    @Override // defpackage.jva
    public final void k(long j) {
        this.m = j;
    }

    @Override // defpackage.jva
    public final void l() {
        if (this.p == null || this.h) {
            this.h = true;
        } else {
            this.i = true;
            t();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[Catch: can -> 0x00a6, TRY_LEAVE, TryCatch #1 {can -> 0x00a6, blocks: (B:18:0x0023, B:20:0x0027, B:22:0x0031, B:23:0x003a, B:25:0x0041, B:26:0x004b, B:28:0x0056, B:30:0x005d, B:32:0x0067, B:37:0x0075, B:38:0x0084, B:42:0x009c, B:45:0x00a2, B:46:0x00a5, B:39:0x0088, B:41:0x009a), top: B:53:0x0023, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:39:0x0088, B:41:0x009a), top: B:51:0x0088, outer: #1 }] */
    @Override // defpackage.jva
    public final boolean m(long j, long j2) {
        Surface surface;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer;
        if (this.h || (surface = this.e) == null || !surface.isValid() || this.c == null || this.p == null) {
            return false;
        }
        if (this.i && !this.j) {
            t();
        }
        try {
            VideoDecoderOutputBuffer videoDecoderOutputBufferDequeueOutputBuffer = this.f;
            if (videoDecoderOutputBufferDequeueOutputBuffer == null) {
                videoDecoderOutputBufferDequeueOutputBuffer = this.p.dequeueOutputBuffer();
                this.f = videoDecoderOutputBufferDequeueOutputBuffer;
                if (videoDecoderOutputBufferDequeueOutputBuffer == null) {
                    return false;
                }
                this.c.f += videoDecoderOutputBufferDequeueOutputBuffer.skippedOutputBufferCount;
            }
            if (videoDecoderOutputBufferDequeueOutputBuffer.isEndOfStream()) {
                this.h = true;
                this.f.release();
                this.f = null;
                return false;
            }
            long j3 = this.f.timeUs - this.m;
            if (this.g) {
                long j4 = j3 - j;
                yyg yygVar = this.o;
                long jH = 30000;
                if (yygVar != null && yygVar.h() > 0) {
                    jH = yygVar.h();
                }
                if (j4 >= jH) {
                    return false;
                }
                if (j4 < -30000) {
                    this.c.g++;
                    this.f.release();
                    this.f = null;
                } else {
                    videoDecoderOutputBuffer = this.f;
                    this.f = null;
                    try {
                        this.p.d(videoDecoderOutputBuffer, this.e);
                        this.c.e++;
                        if (!this.g) {
                            this.g = true;
                        }
                    } finally {
                        videoDecoderOutputBuffer.release();
                    }
                }
            } else {
                videoDecoderOutputBuffer = this.f;
                this.f = null;
                this.p.d(videoDecoderOutputBuffer, this.e);
                this.c.e++;
                if (!this.g) {
                    this.g = true;
                }
            }
            return true;
        } catch (can unused) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.f;
            if (videoDecoderOutputBuffer2 == null) {
                return false;
            }
            videoDecoderOutputBuffer2.release();
            this.f = null;
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    @Override // defpackage.jva
    public final boolean n(DecoderInputBuffer decoderInputBuffer) {
        boolean z;
        ByteBuffer byteBuffer;
        if (this.d != null && this.c != null) {
            if (this.g) {
                z = false;
            } else {
                long j = this.n;
                if (j == -9223372036854775807L || (j > 0 && decoderInputBuffer.timeUs >= j)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            yyg yygVar = this.o;
            if (yygVar != null && yygVar.D() && z && !decoderInputBuffer.isEndOfStream() && !decoderInputBuffer.hasSupplementalData() && !decoderInputBuffer.isEncrypted()) {
                if (decoderInputBuffer.notDependedOn()) {
                    this.c.d++;
                } else {
                    cso csoVar = this.b;
                    if (csoVar != null && (byteBuffer = decoderInputBuffer.data) != null) {
                        if (decoderInputBuffer.isKeyFrame()) {
                            csoVar.b(byteBuffer.duplicate());
                        }
                        int iA = csoVar.a(decoderInputBuffer.data.duplicate(), true);
                        if (iA == decoderInputBuffer.data.position()) {
                            this.c.d++;
                        } else if (iA != decoderInputBuffer.data.limit() && iA < decoderInputBuffer.data.capacity()) {
                            decoderInputBuffer.data.limit(iA);
                        }
                    }
                }
                return true;
            }
            juw juwVar = this.p;
            if (juwVar != null) {
                try {
                    DecoderInputBuffer decoderInputBufferDequeueInputBuffer = juwVar.dequeueInputBuffer();
                    if (decoderInputBufferDequeueInputBuffer != null) {
                        decoderInputBufferDequeueInputBuffer.clear();
                        if (decoderInputBuffer.isEndOfStream()) {
                            decoderInputBufferDequeueInputBuffer.setFlags(4);
                            this.i = true;
                            this.j = true;
                        } else {
                            ByteBuffer byteBuffer2 = decoderInputBuffer.data;
                            if (byteBuffer2 != null) {
                                int iPosition = byteBuffer2.position();
                                decoderInputBufferDequeueInputBuffer.ensureSpaceForWrite(byteBuffer2.remaining());
                                decoderInputBufferDequeueInputBuffer.data.put(byteBuffer2);
                                byteBuffer2.position(iPosition);
                                decoderInputBufferDequeueInputBuffer.flip();
                            }
                        }
                        decoderInputBufferDequeueInputBuffer.timeUs = decoderInputBuffer.timeUs;
                        this.p.queueInputBuffer(decoderInputBufferDequeueInputBuffer);
                        this.c.c++;
                        return true;
                    }
                } catch (can unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.jva
    public final boolean o() {
        return this.f != null;
    }

    @Override // defpackage.jva
    public final boolean p() {
        return this.h;
    }

    @Override // defpackage.jva
    public final boolean q() {
        return this.g;
    }

    @Override // defpackage.jva
    public final boolean r(bse bseVar) {
        this.d = bseVar;
        return true;
    }

    @Override // defpackage.jva
    public final void f(cju cjuVar) {
    }

    @Override // defpackage.jva
    public final /* synthetic */ void i(int i) {
    }

    @Override // defpackage.jva
    public final /* synthetic */ void j(bse[] bseVarArr) {
    }

    @Override // defpackage.jva
    public final /* synthetic */ void s(float f) {
    }

    public jug() {
        this(null);
    }
}
