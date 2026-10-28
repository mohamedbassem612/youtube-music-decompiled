package defpackage;

import io.grpc.Status;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class avcz extends avdc implements avdu, avhs {
    public static final Logger s = Logger.getLogger(avcz.class.getName());
    private avbe a;
    private volatile boolean b;
    private final avht c;

    protected avcz(avjz avjzVar, avbe avbeVar, auyq auyqVar) {
        Boolean.TRUE.equals(auyqVar.d(avfp.k));
        this.c = new avht(this, avjzVar);
        this.a = avbeVar;
    }

    @Override // defpackage.avdc
    public /* bridge */ /* synthetic */ avdb b() {
        throw null;
    }

    protected abstract avdb e();

    protected abstract avgj f();

    @Override // defpackage.avdu
    public final void g(avfu avfuVar) {
        avfuVar.b("remote_addr", a().a(auzr.a));
    }

    @Override // defpackage.avdu
    public final void h(Status status) {
        ahno.G(!status.e(), "Should not cancel with OK status");
        this.b = true;
        Object obj = f().a;
        avfs avfsVar = ((avcw) obj).q;
        avbb avbbVar = avfs.n;
        synchronized (avfsVar.s) {
            if (avfsVar.v) {
                return;
            }
            avfsVar.v = true;
            avfsVar.x = status;
            Collection collection = avfsVar.t;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((avcv) it.next()).a.clear();
            }
            collection.clear();
            BidirectionalStream bidirectionalStream = ((avcw) obj).l;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                ((avcw) obj).j.d((avcw) obj, status);
            }
        }
    }

    @Override // defpackage.avdu
    public final void i() {
        if (e().l) {
            return;
        }
        e().l = true;
        avht avhtVarP = p();
        if (avhtVarP.g) {
            return;
        }
        avhtVarP.g = true;
        axst axstVar = avhtVarP.k;
        if (axstVar != null && axstVar.g() == 0 && avhtVarP.k != null) {
            avhtVarP.k = null;
        }
        avhtVarP.a(true, true);
    }

    @Override // defpackage.avdu
    public final void j(auzi auziVar) {
        avbe avbeVar = this.a;
        avbb avbbVar = avfp.a;
        avbeVar.c(avbbVar);
        this.a.e(avbbVar, Long.valueOf(auziVar.b(TimeUnit.NANOSECONDS)));
    }

    @Override // defpackage.avdu
    public final void k(auzl auzlVar) {
        avdb avdbVarE = e();
        ahno.P(avdbVarE.j == null, "Already called start");
        auzlVar.getClass();
        avdbVarE.k = auzlVar;
    }

    @Override // defpackage.avdu
    public final void l(int i) {
        ((avhp) e().a).b = i;
    }

    @Override // defpackage.avdu
    public final void m(int i) {
        avht avhtVar = this.c;
        ahno.P(avhtVar.a == -1, "max size already set");
        avhtVar.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[LOOP:3: B:28:0x0095->B:30:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0114 A[SYNTHETIC] */
    @Override // defpackage.avdu
    public final void n(avdw avdwVar) {
        String str;
        avbe avbeVar;
        int iA;
        byte[][] bArr;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        String str2;
        byte[] bArr2;
        byte[] bArr3;
        int length;
        int i4;
        int i5;
        byte b;
        avdb avdbVarE = e();
        ahno.P(avdbVarE.j == null, "Already called setListener");
        avdbVarE.j = avdwVar;
        avcw avcwVar = (avcw) f().a;
        avcwVar.k.run();
        axst axstVar = avcwVar.r;
        if (axstVar != null) {
            BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = ((CronetEngine) axstVar.a).newBidirectionalStreamBuilder(avcwVar.e, new avcu(avcwVar), avcwVar.h);
            if (avcwVar.m) {
                builderNewBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            Object obj = avcwVar.n;
            if (obj == null) {
                if (avcwVar.o != null) {
                }
                String str3 = avfp.i.a;
                builderNewBidirectionalStreamBuilder.addHeader(str3, avcwVar.f);
                str = avfp.g.a;
                builderNewBidirectionalStreamBuilder.addHeader(str, "application/grpc");
                builderNewBidirectionalStreamBuilder.addHeader("te", "trailers");
                avbeVar = avcwVar.i;
                Logger logger = avke.a;
                Charset charset = avac.a;
                iA = avbeVar.a();
                bArr = new byte[iA][];
                objArr = avbeVar.d;
                if (objArr instanceof byte[][]) {
                    System.arraycopy(objArr, 0, bArr, 0, avbeVar.a());
                } else {
                    for (i = 0; i < avbeVar.e; i++) {
                        int i6 = i << 1;
                        bArr[i6] = avbeVar.f(i);
                        bArr[i6 + 1] = avbeVar.g(i);
                    }
                }
                i3 = 0;
                for (i2 = 0; i2 < iA; i2 += 2) {
                    bArr2 = bArr[i2];
                    bArr3 = bArr[i2 + 1];
                    if (avke.a(bArr2, avke.b)) {
                        i5 = i3 + 2;
                        bArr[i3] = bArr2;
                        bArr[i3 + 1] = avac.b.j(bArr3).getBytes(StandardCharsets.US_ASCII);
                    } else {
                        length = bArr3.length;
                        i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i5 = i3 + 2;
                                bArr[i3] = bArr2;
                                bArr[i3 + 1] = bArr3;
                            } else {
                                b = bArr3[i4];
                                if (b >= 32 || b > 126) {
                                    String str4 = new String(bArr2, StandardCharsets.US_ASCII);
                                    avke.a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + str4 + ", value=" + Arrays.toString(bArr3) + " contains invalid ASCII characters");
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    i3 = i5;
                }
                if (i3 != iA) {
                    bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i3);
                }
                for (int i7 = 0; i7 < bArr.length; i7 += 2) {
                    str2 = new String(bArr[i7], StandardCharsets.UTF_8);
                    if (str.equalsIgnoreCase(str2) && !str3.equalsIgnoreCase(str2) && !avfp.h.a.equalsIgnoreCase(str2)) {
                        builderNewBidirectionalStreamBuilder.addHeader(str2, new String(bArr[i7 + 1], StandardCharsets.UTF_8));
                    }
                }
                avcwVar.l = builderNewBidirectionalStreamBuilder.build();
                avcwVar.l.start();
            } else {
                builderNewBidirectionalStreamBuilder.addRequestAnnotation(obj);
            }
            Collection collection = avcwVar.o;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    builderNewBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                }
            }
            String str5 = avfp.i.a;
            builderNewBidirectionalStreamBuilder.addHeader(str5, avcwVar.f);
            str = avfp.g.a;
            builderNewBidirectionalStreamBuilder.addHeader(str, "application/grpc");
            builderNewBidirectionalStreamBuilder.addHeader("te", "trailers");
            avbeVar = avcwVar.i;
            Logger logger2 = avke.a;
            Charset charset2 = avac.a;
            iA = avbeVar.a();
            bArr = new byte[iA][];
            objArr = avbeVar.d;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, avbeVar.a());
            } else {
                while (i < avbeVar.e) {
                    int i8 = i << 1;
                    bArr[i8] = avbeVar.f(i);
                    bArr[i8 + 1] = avbeVar.g(i);
                }
            }
            i3 = 0;
            while (i2 < iA) {
                bArr2 = bArr[i2];
                bArr3 = bArr[i2 + 1];
                if (avke.a(bArr2, avke.b)) {
                    i5 = i3 + 2;
                    bArr[i3] = bArr2;
                    bArr[i3 + 1] = avac.b.j(bArr3).getBytes(StandardCharsets.US_ASCII);
                } else {
                    length = bArr3.length;
                    i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i5 = i3 + 2;
                            bArr[i3] = bArr2;
                            bArr[i3 + 1] = bArr3;
                        } else {
                            b = bArr3[i4];
                            if (b >= 32) {
                            }
                            String str6 = new String(bArr2, StandardCharsets.US_ASCII);
                            avke.a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + str6 + ", value=" + Arrays.toString(bArr3) + " contains invalid ASCII characters");
                        }
                        i4++;
                    }
                }
                i3 = i5;
            }
            if (i3 != iA) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i3);
            }
            while (i7 < bArr.length) {
                str2 = new String(bArr[i7], StandardCharsets.UTF_8);
                if (str.equalsIgnoreCase(str2)) {
                }
            }
            avcwVar.l = builderNewBidirectionalStreamBuilder.build();
            avcwVar.l.start();
        }
        this.a = null;
    }

    @Override // defpackage.avdc, defpackage.avka
    public final boolean o() {
        return b().b() && !this.b;
    }

    @Override // defpackage.avdc
    protected final avht p() {
        return this.c;
    }

    @Override // defpackage.avhs
    public final void q(axst axstVar, boolean z, boolean z2) {
        Object obj;
        boolean z3 = true;
        if (axstVar == null && !z) {
            z3 = false;
        }
        ahno.G(z3, "null frame before EOS");
        Object obj2 = f().a;
        avfs avfsVar = ((avcw) obj2).q;
        avbb avbbVar = avfs.n;
        synchronized (avfsVar.s) {
            if (avfsVar.v) {
                return;
            }
            if (axstVar != null) {
                obj = axstVar.a;
                ((Buffer) obj).flip();
            } else {
                obj = avcw.a;
            }
            int iRemaining = ((ByteBuffer) obj).remaining();
            synchronized (avfsVar.b) {
                try {
                    avfsVar.e += iRemaining;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (avfsVar.u) {
                ((avcw) obj2).d((ByteBuffer) obj, z, z2);
            } else {
                avfsVar.t.add(new avcv((ByteBuffer) obj, z, z2));
            }
        }
    }
}
