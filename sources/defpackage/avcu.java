package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcu extends BidirectionalStream.Callback {
    final /* synthetic */ avcw a;
    private List b;

    public avcu(avcw avcwVar) {
        this.a = avcwVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0261 A[Catch: all -> 0x029b, PHI: r0
      0x0261: PHI (r0v36 io.grpc.Status) = (r0v16 io.grpc.Status), (r0v28 io.grpc.Status), (r0v35 io.grpc.Status), (r0v41 io.grpc.Status) binds: [B:90:0x01f2, B:107:0x025f, B:87:0x01e4, B:77:0x01c4] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:42:0x00f9, B:44:0x00fd, B:46:0x0101, B:48:0x010b, B:50:0x010f, B:109:0x0279, B:51:0x0128, B:53:0x0132, B:62:0x016d, B:64:0x0174, B:65:0x018a, B:67:0x0192, B:68:0x0199, B:54:0x013f, B:56:0x0143, B:57:0x014c, B:59:0x0156, B:61:0x0167, B:60:0x015f, B:69:0x019e, B:71:0x01a2, B:76:0x01c2, B:108:0x0261, B:86:0x01e2, B:106:0x025d, B:112:0x027c, B:114:0x0280, B:115:0x0298, B:73:0x01b4, B:75:0x01b8, B:79:0x01c8, B:81:0x01d2, B:83:0x01da, B:89:0x01e8, B:91:0x01f4, B:93:0x0207, B:94:0x0211, B:96:0x0223, B:98:0x022f, B:101:0x0235, B:102:0x024e, B:104:0x0252, B:105:0x0258), top: B:121:0x00f7, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [auzj] */
    private final void a(List list, boolean z) {
        Status status;
        ?? r5;
        Object obj;
        Status statusA;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        int size = arrayList.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(StandardCharsets.UTF_8);
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(StandardCharsets.UTF_8);
        }
        Logger logger = avke.a;
        int i3 = 0;
        loop2: while (i3 < size) {
            byte[] bArr2 = bArr[i3];
            int i4 = i3 + 1;
            byte[] bArr3 = bArr[i4];
            byte[] bArr4 = avke.b;
            if (avke.a(bArr2, bArr4)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i5 = 0; i5 < i3; i5++) {
                            arrayList2.add(bArr[i5]);
                        }
                        while (i3 < size) {
                            byte[] bArr5 = bArr[i3];
                            byte[] bArr6 = bArr[i3 + 1];
                            if (avke.a(bArr5, bArr4)) {
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i6 <= length) {
                                        if (i6 == length || bArr6[i6] == 44) {
                                            byte[] bArrK = agyg.d.k(new String(bArr6, i7, i6 - i7, StandardCharsets.US_ASCII));
                                            arrayList2.add(bArr5);
                                            arrayList2.add(bArrK);
                                            i7 = i6 + 1;
                                        }
                                        i6++;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i3 += 2;
                        }
                        bArr = (byte[][]) arrayList2.toArray(new byte[0][]);
                        break loop2;
                    }
                }
                bArr[i4] = agyg.d.k(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i3 += 2;
        }
        Charset charset = avac.a;
        avbe avbeVar = new avbe(bArr.length >> 1, bArr);
        avcw avcwVar = this.a;
        avbb avbbVar = avfs.n;
        avfs avfsVar = avcwVar.q;
        synchronized (avfsVar.s) {
            if (z) {
                Status status2 = avfsVar.o;
                if (status2 == null && !avfsVar.r) {
                    avfsVar.o = avfs.i(avbeVar);
                    status2 = avfsVar.o;
                    if (status2 != null) {
                        avfsVar.p = avbeVar;
                    }
                }
                if (status2 != null) {
                    avfsVar.o = status2.a("trailers: ".concat(avbeVar.toString()));
                    avfsVar.l(avfsVar.o, false, avfsVar.p);
                } else {
                    Status status3 = (Status) avbeVar.b(avad.b);
                    if (status3 != null) {
                        statusA = status3.withDescription((String) avbeVar.b(avad.a));
                    } else if (avfsVar.r) {
                        statusA = Status.c.withDescription("missing GRPC status in response");
                    } else {
                        Integer num = (Integer) avbeVar.b(avfs.n);
                        statusA = (num != null ? avfp.a(num.intValue()) : Status.l.withDescription("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
                    }
                    avfs.h(avbeVar);
                    if (avfsVar.m) {
                        avcz.s.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{statusA, avbeVar});
                    } else {
                        for (avjt avjtVar : avfsVar.i.b) {
                        }
                        avfsVar.e(statusA, false, avbeVar);
                    }
                }
            } else {
                Status status4 = avfsVar.o;
                if (status4 != null) {
                    avfsVar.o = status4.a("headers: ".concat(avbeVar.toString()));
                } else {
                    try {
                        if (avfsVar.r) {
                            avfsVar.o = Status.l.withDescription("Received headers twice");
                            status = avfsVar.o;
                            if (status != null) {
                                avfsVar.o = status.a("headers: ".concat(avbeVar.toString()));
                                avfsVar.p = avbeVar;
                                avfsVar.q = avfs.g(avbeVar);
                            }
                        } else {
                            Integer num2 = (Integer) avbeVar.b(avfs.n);
                            if (num2 == null || num2.intValue() < 100 || num2.intValue() >= 200) {
                                avfsVar.r = true;
                                avfsVar.o = avfs.i(avbeVar);
                                status = avfsVar.o;
                                if (status == null) {
                                    avfs.h(avbeVar);
                                    ahno.P(!avfsVar.m, "Received headers on closed stream");
                                    for (avjt avjtVar2 : avfsVar.i.b) {
                                        ((auyw) avjtVar2).a();
                                    }
                                    String str = (String) avbeVar.b(avfp.b);
                                    if (str == null) {
                                        r5 = obj;
                                        avfsVar.j.c(avbeVar);
                                    } else {
                                        auzk auzkVar = (auzk) avfsVar.k.c.get(str);
                                        if (auzkVar != null) {
                                            obj = auzkVar.b;
                                        } else {
                                            r5 = 0;
                                        }
                                        if (r5 == 0) {
                                            r5 = obj;
                                            avfsVar.k(new avcg(Status.l.withDescription(String.format("Can't find decompressor for %s", str))));
                                        } else {
                                            if (r5 != auyx.a) {
                                                r5 = obj;
                                                ((avhp) avfsVar.a).c = r5;
                                            }
                                            r5 = obj;
                                            avfsVar.j.c(avbeVar);
                                        }
                                    }
                                    status = avfsVar.o;
                                    if (status != null) {
                                        avfsVar.o = status.a("headers: ".concat(avbeVar.toString()));
                                        avfsVar.p = avbeVar;
                                        avfsVar.q = avfs.g(avbeVar);
                                    }
                                } else {
                                    avfsVar.o = status.a("headers: ".concat(avbeVar.toString()));
                                    avfsVar.p = avbeVar;
                                    avfsVar.q = avfs.g(avbeVar);
                                }
                            } else {
                                status = avfsVar.o;
                                if (status != null) {
                                    avfsVar.o = status.a("headers: ".concat(avbeVar.toString()));
                                    avfsVar.p = avbeVar;
                                    avfsVar.q = avfs.g(avbeVar);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Status status5 = avfsVar.o;
                        if (status5 != null) {
                            avfsVar.o = status5.a("headers: ".concat(avbeVar.toString()));
                            avfsVar.p = avbeVar;
                            avfsVar.q = avfs.g(avbeVar);
                        }
                        throw th;
                    }
                }
            }
        }
    }

    private static final Status b(UrlResponseInfo urlResponseInfo) {
        return avfp.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        Status statusB;
        avbb avbbVar = avfs.n;
        avfs avfsVar = this.a.q;
        synchronized (avfsVar.s) {
            statusB = avfsVar.x;
            if (statusB == null) {
                statusB = urlResponseInfo != null ? b(urlResponseInfo) : Status.b.withDescription("stream cancelled without reason");
            }
        }
        this.a.c(statusB);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.c(Status.m.c(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        avbb avbbVar = avfs.n;
        avfs avfsVar = this.a.q;
        synchronized (avfsVar.s) {
            avfsVar.y = z;
            if (byteBuffer.remaining() != 0) {
                avfsVar.w += byteBuffer.remaining();
                avil avilVar = avip.a;
                avio avioVar = new avio(byteBuffer);
                Status status = avfsVar.o;
                if (status != null) {
                    Charset charset = avfsVar.q;
                    charset.getClass();
                    int iF = avioVar.f();
                    byte[] bArr = new byte[iF];
                    avioVar.j(bArr, 0, iF);
                    avfsVar.o = status.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
                    if (avfsVar.o.getDescription().length() > 1000) {
                        avfsVar.l(avfsVar.o, false, avfsVar.p);
                    }
                } else if (avfsVar.r) {
                    avioVar.f();
                    try {
                        if (avfsVar.m) {
                            avcz.s.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                        } else {
                            try {
                                avei aveiVar = avfsVar.a;
                                try {
                                    if (!((avhp) aveiVar).b() && !((avhp) aveiVar).f) {
                                        ((avhp) aveiVar).d.h(avioVar);
                                        ((avhp) aveiVar).a();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                avfsVar.k(th2);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } else {
                    avfsVar.l(Status.l.withDescription("headers not received before payload"), false, new avbe());
                }
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(this.a.p));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.b = asList;
        avbb avbbVar = avfs.n;
        avfs avfsVar = this.a.q;
        synchronized (avfsVar.s) {
            z = avfsVar.y;
        }
        if (z) {
            a(asList, true);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        avbb avbbVar = avfs.n;
        avfs avfsVar = this.a.q;
        synchronized (avfsVar.s) {
            avfsVar.m();
            avfsVar.u = true;
            Collection<avcv> collection = avfsVar.t;
            for (avcv avcvVar : collection) {
                avfsVar.A.d(avcvVar.a, avcvVar.b, avcvVar.c);
            }
            collection.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        avbb avbbVar = avfs.n;
        avfs avfsVar = this.a.q;
        synchronized (avfsVar.s) {
            z = false;
            if (this.b != null && avfsVar.y) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else {
                if (urlResponseInfo == null) {
                    throw new AssertionError("No response header or trailer");
                }
                a(urlResponseInfo.getAllHeadersAsList(), true);
            }
        }
        this.a.c(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        avbb avbbVar = avfs.n;
        avcw avcwVar = this.a;
        avfs avfsVar = avcwVar.q;
        synchronized (avfsVar.s) {
            boolean z2 = false;
            if (!avfsVar.z) {
                avfsVar.z = true;
                for (avjt avjtVar : avcwVar.g.b) {
                }
            }
            int iPosition = byteBuffer.position();
            synchronized (avfsVar.b) {
                try {
                    ahno.P(avfsVar.f, "onStreamAllocated was not called, but it seems the stream is active");
                    int i = avfsVar.e;
                    int i2 = avfsVar.h;
                    int i3 = i - iPosition;
                    avfsVar.e = i3;
                    if (i >= i2 && i3 < i2) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                avfsVar.a();
            }
        }
    }
}
