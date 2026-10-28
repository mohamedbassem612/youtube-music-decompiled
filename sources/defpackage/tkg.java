package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tkg extends tkk {
    private final boolean b;
    private final boolean c;
    private int d;
    private final awnm e;
    private int f;
    private int g;
    private int h;
    private int i;
    private CronetException j;

    public tkg(tiz tizVar, boolean z, boolean z2) {
        super(tizVar);
        this.b = z;
        this.c = z2;
        this.e = new awnm((byte[]) null);
    }

    private final tke a(aigm aigmVar, int i, int i2) throws IOException {
        int i3 = i & 7;
        if (i3 != 2) {
            throw new IOException(a.bR(i3, "Wrong wiretype: "));
        }
        int iK = aigmVar.k();
        int iD = i2 - aigmVar.d();
        if (aigmVar.d() >= iK) {
            return new tke(iK, iD);
        }
        this.h = iK + iD;
        return null;
    }

    private final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = (ByteBuffer) this.e.d();
        if (byteBuffer2 != null) {
            if (byteBuffer == byteBuffer2) {
                byteBuffer.flip();
            } else {
                byteBuffer2.position(0);
                byteBuffer2.limit(this.g);
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        this.e.clear();
        CronetException cronetException = this.j;
        vwt vwtVar = this.a;
        if (cronetException != null) {
            vwtVar.m(urlRequest, urlResponseInfo, cronetException);
        } else {
            vwtVar.l(urlRequest, urlResponseInfo);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        urlRequest.getClass();
        cronetException.getClass();
        this.e.clear();
        this.a.m(urlRequest, urlResponseInfo, cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocateDirect;
        urlRequest.getClass();
        urlResponseInfo.getClass();
        byteBuffer.getClass();
        this.a.p(urlRequest, urlResponseInfo);
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i = iPosition - this.i;
        this.i = iPosition;
        int i2 = this.g + i;
        this.g = i2;
        int i3 = this.f;
        if (i2 < i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i2 - i3 >= this.h) {
            boolean z = this.c;
            if (z) {
                b(byteBuffer);
            } else {
                byteBuffer.flip().getClass();
            }
            int i4 = this.g;
            int i5 = this.f;
            if (i4 < i5) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i4 - i5 < this.h) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            awnm awnmVar = this.e;
            aigm aigmVarI = z ? nsi.i(awnmVar) : aigm.T(awnmVar);
            try {
                aigmVarI.f(this.g);
                aigmVarI.C(this.f);
                while (!aigmVarI.D()) {
                    try {
                        int iD = aigmVarI.d();
                        int iN = aigmVarI.n();
                        int i6 = iN >>> 3;
                        if (i6 == 1) {
                            tke tkeVarA = a(aigmVarI, iN, iD);
                            if (tkeVarA == null) {
                                break;
                            }
                            int i7 = this.f + tkeVarA.b;
                            boolean z2 = this.c;
                            vwt vwtVar = this.a;
                            if (z2) {
                                awnm awnmVar2 = this.e;
                                int i8 = tkeVarA.a;
                                vwtVar.n(urlRequest, urlResponseInfo, nsi.j(awnmVar2, i7, i8));
                                aigmVarI.C(i8);
                            } else {
                                byte[] bArrH = aigmVarI.H(tkeVarA.a);
                                bArrH.getClass();
                                vwtVar.o(urlRequest, urlResponseInfo, bArrH);
                            }
                            this.h = 0;
                            this.f += iD - aigmVarI.d();
                        } else if (this.b && i6 == 2) {
                            tke tkeVarA2 = a(aigmVarI, iN, iD);
                            if (tkeVarA2 == null) {
                                break;
                            }
                            byte[] bArrH2 = aigmVarI.H(tkeVarA2.a);
                            atxp atxpVar = (atxp) aihn.parseFrom(atxp.a, bArrH2);
                            atxpVar.getClass();
                            int i9 = atxpVar.b;
                            if (i9 != 0) {
                                bArrH2.getClass();
                                this.j = new tkf("RPC status: " + i9 + " - " + atxpVar.c, i9 != 4 ? i9 != 14 ? 11 : 7 : 4, atxpVar.b, bArrH2);
                                urlRequest.cancel();
                                break;
                            }
                            this.h = 0;
                            this.f += iD - aigmVarI.d();
                        } else {
                            aigmVarI.F(iN);
                            this.f += iD - aigmVarI.d();
                        }
                    } catch (IOException e) {
                        if (!(e instanceof aiik)) {
                            this.j = new tkj("Error while scanning StreamBody", e);
                            urlRequest.cancel();
                        } else if (this.g - this.f > 10240) {
                            this.j = new tkj("Too much unparsed data", e);
                            urlRequest.cancel();
                        } else {
                            this.h = 0;
                        }
                    }
                }
                if (this.c) {
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.e.d();
                    if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
                        byteBuffer2.limit(byteBuffer2.capacity());
                    }
                } else {
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit).getClass();
                }
                while (true) {
                    awnm awnmVar3 = this.e;
                    if (awnmVar3.isEmpty()) {
                        break;
                    }
                    if (awnmVar3.isEmpty()) {
                        throw new NoSuchElementException("ArrayDeque is empty.");
                    }
                    int iLimit2 = ((ByteBuffer) awnmVar3.b[awnmVar3.a]).limit();
                    if (this.f < iLimit2) {
                        break;
                    }
                    awnmVar3.removeFirst();
                    this.f -= iLimit2;
                    this.g -= iLimit2;
                }
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
        if (this.j == null) {
            if (byteBuffer.hasRemaining()) {
                urlRequest.read(byteBuffer);
                return;
            }
            boolean z3 = this.c;
            int iMin = SemanticState.Multiline;
            if (!z3) {
                byteBuffer.flip();
                int i10 = this.h;
                if (i10 != 0) {
                    iMin = Math.min(393216, i10 - (this.g - this.f));
                }
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iMin);
                byteBufferAllocateDirect2.getClass();
                this.i = 0;
                this.e.addLast(byteBufferAllocateDirect2);
                urlRequest.read(byteBufferAllocateDirect2);
                return;
            }
            b(byteBuffer);
            int i11 = this.g - this.f;
            int i12 = this.h;
            if (i12 <= 0 || i12 >= 393217 || i11 <= 0 || i11 >= 8193) {
                if (i12 != 0) {
                    iMin = Math.min(393216, i12 - i11);
                }
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(iMin);
                byteBufferAllocateDirect.getClass();
                this.i = 0;
                this.e.addLast(byteBufferAllocateDirect);
            } else {
                ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i12);
                byteBufferAllocateDirect3.getClass();
                int i13 = this.f;
                awnm<ByteBuffer> awnmVar4 = this.e;
                int i14 = i11;
                for (ByteBuffer byteBuffer3 : awnmVar4) {
                    int iLimit3 = byteBuffer3.limit();
                    if (iLimit3 > i13) {
                        int iMin2 = Math.min(iLimit3 - i13, i14);
                        if (byteBuffer3.hasArray() && byteBufferAllocateDirect3.hasArray()) {
                            System.arraycopy(byteBuffer3.array(), byteBuffer3.arrayOffset() + i13, byteBufferAllocateDirect3.array(), byteBufferAllocateDirect3.arrayOffset() + byteBufferAllocateDirect3.position(), iMin2);
                            byteBufferAllocateDirect3.position(byteBufferAllocateDirect3.position() + iMin2);
                        } else {
                            ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
                            byteBufferDuplicate.getClass();
                            byteBufferDuplicate.position(i13);
                            byteBufferDuplicate.limit(i13 + iMin2);
                            byteBufferAllocateDirect3.put(byteBufferDuplicate);
                        }
                        i14 -= iMin2;
                        if (i14 == 0) {
                            break;
                        } else {
                            i13 = 0;
                        }
                    } else {
                        i13 -= iLimit3;
                    }
                }
                if (i14 != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                byteBufferAllocateDirect = byteBufferAllocateDirect3.slice();
                byteBufferAllocateDirect.getClass();
                byteBufferAllocateDirect3.position(0);
                byteBufferAllocateDirect3.limit(i11);
                awnmVar4.clear();
                awnmVar4.addLast(byteBufferAllocateDirect3);
                this.f = 0;
                this.g = i11;
                this.i = 0;
            }
            urlRequest.read(byteBufferAllocateDirect);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        str.getClass();
        this.a.q(urlRequest, urlResponseInfo, str);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        int i = this.d;
        this.d = i + 1;
        if (i != 0) {
            throw new IllegalArgumentException("StreamScanner instances cannot be reused");
        }
        this.a.r(urlRequest, urlResponseInfo);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(SemanticState.Multiline);
        byteBufferAllocateDirect.getClass();
        this.e.addLast(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        this.e.clear();
        int i = this.g - this.f;
        vwt vwtVar = this.a;
        if (i != 0) {
            vwtVar.m(urlRequest, urlResponseInfo, new tkj(a.bP(i, "leftover ", " bytes"), new IllegalStateException()));
        } else {
            vwtVar.s(urlRequest, urlResponseInfo);
        }
    }
}
