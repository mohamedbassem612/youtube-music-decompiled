package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import defpackage.agpr;
import defpackage.ahno;
import defpackage.brv;
import defpackage.bsd;
import defpackage.bse;
import defpackage.bsz;
import defpackage.bwb;
import defpackage.cuz;
import defpackage.cvk;
import defpackage.cvz;
import defpackage.cwi;
import defpackage.cwj;
import defpackage.jtn;
import defpackage.juc;
import defpackage.txo;
import defpackage.xur;
import defpackage.ywx;
import defpackage.zaw;
import defpackage.zax;
import defpackage.zic;
import defpackage.zik;
import defpackage.zjr;
import defpackage.zkf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MediaParser {

    /* JADX INFO: compiled from: PG */
    public interface Factory {
    }

    /* JADX INFO: compiled from: PG */
    public interface MediaParserInterface {
        cuz h();

        FormatIdOuterClass$FormatId i();

        BufferedMediaSegment l();

        void m();

        void n();

        void o(BufferedMediaSegment bufferedMediaSegment);

        void p();

        boolean q(ByteBuffer byteBuffer, long j);
    }

    private MediaParser() {
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public class MediaParsersImplementation implements MediaParserInterface, cvk, cwj, zaw {
        final FormatIdOuterClass$FormatId a;
        private final jtn b;
        private cvz c;
        private final MediaSegmentHolder e;
        private final zjr f;
        private bse g;
        private BufferedMediaSegment i;
        private boolean j;
        private IOException k;
        private long h = -1;
        private final MediaByteBufferDataReader d = new MediaByteBufferDataReader();

        public MediaParsersImplementation(MediaSegmentHolder mediaSegmentHolder, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, String str, zjr zjrVar) throws PlatypusException {
            jtn jtnVar;
            this.e = mediaSegmentHolder;
            this.a = formatIdOuterClass$FormatId;
            this.f = zjrVar;
            int i = zic.a;
            agpr agprVar = agpr.a;
            if (txo.d(str)) {
                MatroskaTagExtractor matroskaTagExtractor = new MatroskaTagExtractor(new xur(agprVar, this));
                matroskaTagExtractor.D = this;
                jtnVar = matroskaTagExtractor;
            } else {
                if (!txo.b(str).endsWith("mp4")) {
                    PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.a);
                    platypusExceptionBuilder.b("m", "UnknownContainer");
                    throw platypusExceptionBuilder.a();
                }
                juc jucVar = new juc(true != zjrVar.l.m(39, 45687180L) ? 0 : SemanticState.ReadOnly, new ArrayList(), new zax(agprVar, this), zjrVar.dZ());
                jucVar.a = this;
                jtnVar = jucVar;
            }
            jtnVar.b(this);
            this.b = jtnVar;
        }

        private static String u(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
            return formatIdOuterClass$FormatId.c + '_' + formatIdOuterClass$FormatId.e + '_' + formatIdOuterClass$FormatId.d;
        }

        @Override // defpackage.cwj
        public final /* synthetic */ int a(brv brvVar, int i, boolean z) {
            return g(brvVar, i, z);
        }

        @Override // defpackage.cwj
        public final void b(bse bseVar) {
            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = this.a;
            String strCo = zik.co(formatIdOuterClass$FormatId.c, formatIdOuterClass$FormatId.e);
            bsd bsdVar = new bsd(bseVar);
            bsdVar.a = strCo;
            bse bseVar2 = new bse(bsdVar);
            this.g = bseVar2;
            this.e.h(bseVar2);
        }

        @Override // defpackage.cwj
        public final /* synthetic */ void c(bwb bwbVar, int i) {
            d(bwbVar, i, 0);
        }

        @Override // defpackage.cwj
        public final void d(bwb bwbVar, int i, int i2) {
            this.e.e(bwbVar, i, i2);
        }

        @Override // defpackage.cwj
        public final void e(long j, int i, int i2, int i3, cwi cwiVar) {
            this.e.f(j, i, i2, i3, cwiVar);
        }

        @Override // defpackage.cwj
        public final int g(brv brvVar, int i, boolean z) {
            return this.e.l(brvVar, i, z);
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParserInterface
        public final cuz h() {
            cvz cvzVar = this.c;
            if (cvzVar instanceof cuz) {
                return (cuz) cvzVar;
            }
            return null;
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParserInterface
        public final FormatIdOuterClass$FormatId i() {
            return this.a;
        }

        @Override // defpackage.zaw
        public final void j(ywx ywxVar) {
            BufferedMediaSegment bufferedMediaSegment = this.i;
            if (bufferedMediaSegment != null) {
                this.e.C(ywxVar, bufferedMediaSegment);
            }
        }

        @Override // defpackage.zaw
        public final void k(IOException iOException) {
            this.k = iOException;
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParserInterface
        public final BufferedMediaSegment l() {
            return this.i;
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParserInterface
        public final void m() {
            this.d.e = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
        
            if (r2 == null) goto L30;
         */
        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParserInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void n() throws com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException {
            /*
                Method dump skipped, instruction units count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParsersImplementation.n():void");
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParserInterface
        public final void o(BufferedMediaSegment bufferedMediaSegment) throws PlatypusException {
            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = this.a;
            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = bufferedMediaSegment.a;
            if (!zic.g(formatIdOuterClass$FormatId, formatIdOuterClass$FormatId2)) {
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.c);
                platypusExceptionBuilder.b("m", "invalidFormat");
                platypusExceptionBuilder.b("c", "prepSegPush");
                platypusExceptionBuilder.b("id", u(formatIdOuterClass$FormatId2));
                platypusExceptionBuilder.b("pId", u(formatIdOuterClass$FormatId));
                throw platypusExceptionBuilder.a();
            }
            this.d.e = false;
            this.i = bufferedMediaSegment;
            this.j = false;
            MediaSegmentHolder mediaSegmentHolder = this.e;
            mediaSegmentHolder.i(bufferedMediaSegment.b);
            bse bseVar = this.g;
            if (bseVar != null) {
                mediaSegmentHolder.h(bseVar);
            }
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParserInterface
        public final void p() {
            if (this.f.dJ()) {
                this.d.e = false;
            }
            this.j = true;
            this.i = null;
        }

        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser.MediaParserInterface
        public final boolean q(ByteBuffer byteBuffer, long j) throws PlatypusException {
            ByteBuffer byteBuffer2;
            long j2;
            boolean z = this.j;
            BufferedMediaSegment bufferedMediaSegment = this.i;
            if (!z ? bufferedMediaSegment != null : bufferedMediaSegment == null) {
                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.c);
                platypusExceptionBuilder.b("m", "illegalState");
                platypusExceptionBuilder.b("c", "pushSegData");
                platypusExceptionBuilder.c("vodInit", true != this.j ? 0L : 1L);
                BufferedMediaSegment bufferedMediaSegment2 = this.i;
                platypusExceptionBuilder.c("sq", bufferedMediaSegment2 != null ? bufferedMediaSegment2.b : -1L);
                BufferedMediaSegment bufferedMediaSegment3 = this.i;
                platypusExceptionBuilder.b("id", bufferedMediaSegment3 != null ? u(bufferedMediaSegment3.a) : "-1");
                throw platypusExceptionBuilder.a();
            }
            long j3 = this.h;
            if (j3 == -1 || j != j3 + 1) {
                this.b.d(0L, 0L);
                this.d.g();
            }
            int iPosition = byteBuffer.position();
            try {
                try {
                    MediaByteBufferDataReader mediaByteBufferDataReader = this.d;
                    byteBuffer2 = byteBuffer;
                    try {
                        mediaByteBufferDataReader.f(byteBuffer2, j);
                        j2 = 0;
                        try {
                            try {
                                this.b.h(mediaByteBufferDataReader);
                                zjr zjrVar = this.f;
                                if (zjrVar.dH()) {
                                    this.d.e();
                                }
                                if (!zjrVar.dH()) {
                                    this.d.e();
                                }
                                e = null;
                            } catch (bsz e) {
                                e = e;
                            }
                            if (e == null) {
                                e = this.k;
                            }
                            if (e != null) {
                                this.k = null;
                                PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder2 = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.c);
                                platypusExceptionBuilder2.b("m", "ParserError");
                                platypusExceptionBuilder2.a = e;
                                platypusExceptionBuilder2.b("id", u(this.a));
                                BufferedMediaSegment bufferedMediaSegment4 = this.i;
                                platypusExceptionBuilder2.b("sq", bufferedMediaSegment4 == null ? "init" : String.valueOf(bufferedMediaSegment4.b));
                                throw platypusExceptionBuilder2.a();
                            }
                            int iPosition2 = byteBuffer2.position() - iPosition;
                            boolean z2 = false;
                            if (iPosition2 > 0) {
                                this.h = (j + ((long) iPosition2)) - 1;
                                BufferedMediaSegment bufferedMediaSegment5 = this.i;
                                if (bufferedMediaSegment5 != null) {
                                    ahno.O(!bufferedMediaSegment5.j);
                                    AtomicInteger atomicInteger = bufferedMediaSegment5.i;
                                    atomicInteger.addAndGet(iPosition2);
                                    long j4 = bufferedMediaSegment5.d;
                                    if (j4 > j2 && atomicInteger.get() == j4) {
                                        z2 = true;
                                    }
                                }
                            }
                            if (!this.d.e) {
                                zkf.c(!byteBuffer2.hasRemaining());
                            }
                            return z2;
                        } catch (Throwable th) {
                            if (this.f.dH()) {
                                this.d.e();
                            }
                            throw th;
                        }
                    } catch (bsz e2) {
                        e = e2;
                        j2 = 0;
                    }
                } catch (IllegalStateException e3) {
                    if (!this.f.i.m(318, 45744992L)) {
                        throw e3;
                    }
                    PlatypusException.PlatypusExceptionBuilder platypusExceptionBuilder3 = new PlatypusException.PlatypusExceptionBuilder(PlatypusException.ErrorType.c);
                    platypusExceptionBuilder3.b("m", "IllegalStateException");
                    platypusExceptionBuilder3.b("c", "pushSegData");
                    platypusExceptionBuilder3.a = e3;
                    BufferedMediaSegment bufferedMediaSegment6 = this.i;
                    platypusExceptionBuilder3.c("sq", bufferedMediaSegment6 != null ? bufferedMediaSegment6.b : -1L);
                    BufferedMediaSegment bufferedMediaSegment7 = this.i;
                    platypusExceptionBuilder3.b("id", bufferedMediaSegment7 != null ? u(bufferedMediaSegment7.a) : "-1");
                    platypusExceptionBuilder3.b("off", String.valueOf(j));
                    throw platypusExceptionBuilder3.a();
                }
            } catch (bsz e4) {
                e = e4;
                byteBuffer2 = byteBuffer;
            }
        }

        public final void r(long j, long j2) {
            this.e.b(this.i, j, j2);
        }

        @Override // defpackage.cvk
        public final void z(cvz cvzVar) {
            this.c = cvzVar;
        }

        @Override // defpackage.cwj
        public final /* synthetic */ void f() {
        }

        @Override // defpackage.cvk
        public final void t() {
        }

        @Override // defpackage.cvk
        public final cwj s(int i, int i2) {
            return this;
        }
    }
}
