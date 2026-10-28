package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cah extends bxw implements byw {
    public final boolean b;
    public final boolean c;
    public UrlRequest d;
    cag e;
    public byi f;
    public UrlResponseInfo g;
    public IOException h;
    public boolean i;
    public final zhk j;
    private final CronetEngine k;
    private final Executor l;
    private final int m;
    private final int n;
    private final agex o;
    private boolean p;
    private long q;
    private ByteBuffer r;
    private volatile long s;
    private final cso t;

    static {
        bst.b("media3.datasource.cronet");
    }

    protected cah(CronetEngine cronetEngine, Executor executor, int i, int i2, boolean z, agex agexVar, boolean z2) {
        super(true);
        this.k = cronetEngine;
        executor.getClass();
        this.l = executor;
        this.m = i;
        this.n = i2;
        this.b = z;
        this.o = agexVar;
        this.c = z2;
        this.t = new cso((char[]) null);
        this.j = new zhk(null, null);
    }

    private static int s(UrlRequest urlRequest) {
        zhk zhkVar = new zhk(null, null);
        int[] iArr = new int[1];
        urlRequest.getStatus(new cae(iArr, zhkVar));
        zhkVar.b();
        return iArr[0];
    }

    private static String t(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    private final ByteBuffer u() {
        if (this.r == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.r = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.r;
    }

    private final void v(ByteBuffer byteBuffer, byi byiVar) throws byt {
        UrlRequest urlRequest = this.d;
        int i = bwp.a;
        urlRequest.read(byteBuffer);
        try {
            if (!this.j.d(this.n)) {
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException unused) {
            if (byteBuffer == this.r) {
                this.r = null;
            }
            Thread.currentThread().interrupt();
            this.h = new InterruptedIOException();
        } catch (SocketTimeoutException e) {
            if (byteBuffer == this.r) {
                this.r = null;
            }
            this.h = new byt(e, byiVar, 2002, 2);
        }
        IOException iOException = this.h;
        if (iOException != null) {
            if (!(iOException instanceof byt)) {
                throw byt.jD(iOException, byiVar, 2);
            }
            throw ((byt) iOException);
        }
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws byt {
        ahno.O(this.p);
        if (i2 == 0) {
            return 0;
        }
        if (this.q != 0) {
            ByteBuffer byteBufferU = u();
            if (!byteBufferU.hasRemaining()) {
                this.j.f();
                byteBufferU.clear();
                byi byiVar = this.f;
                int i3 = bwp.a;
                v(byteBufferU, byiVar);
                if (this.i) {
                    this.q = 0L;
                } else {
                    byteBufferU.flip();
                    ahno.O(byteBufferU.hasRemaining());
                }
            }
            long j = this.q;
            if (j == -1) {
                j = Long.MAX_VALUE;
            }
            int iH = (int) ahng.H(j, byteBufferU.remaining(), i2);
            byteBufferU.get(bArr, i, iH);
            long j2 = this.q;
            if (j2 != -1) {
                this.q = j2 - ((long) iH);
            }
            g(iH);
            return iH;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126 A[Catch: IOException -> 0x0155, TryCatch #0 {IOException -> 0x0155, blocks: (B:58:0x0111, B:60:0x0126, B:62:0x012a, B:63:0x0149, B:64:0x014e, B:65:0x014f, B:66:0x0154), top: B:111:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x012a A[Catch: IOException -> 0x0155, LOOP:2: B:56:0x010d->B:62:0x012a, LOOP_END, TryCatch #0 {IOException -> 0x0155, blocks: (B:58:0x0111, B:60:0x0126, B:62:0x012a, B:63:0x0149, B:64:0x014e, B:65:0x014f, B:66:0x0154), top: B:111:0x0111 }] */
    @Override // defpackage.bye
    public final long b(byi byiVar) throws byt {
        long j;
        ByteBuffer byteBufferU;
        byiVar.getClass();
        ahno.O(!this.p);
        this.j.f();
        r();
        this.f = byiVar;
        boolean zD = false;
        try {
            q(byiVar);
            UrlRequest urlRequest = this.d;
            urlRequest.start();
            i(byiVar);
            try {
                for (long jElapsedRealtime = SystemClock.elapsedRealtime(); !zD && jElapsedRealtime < this.s; jElapsedRealtime = SystemClock.elapsedRealtime()) {
                    zD = this.j.d((this.s - jElapsedRealtime) + 5);
                }
                IOException iOException = this.h;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !ahno.ae(message).contains("err_cleartext_not_permitted")) {
                        throw new caf(iOException, byiVar, 2001, s(urlRequest));
                    }
                    throw new bys(iOException, byiVar);
                }
                if (!zD) {
                    throw new caf(new SocketTimeoutException(), byiVar, 2002, s(urlRequest));
                }
                UrlResponseInfo urlResponseInfo = this.g;
                urlResponseInfo.getClass();
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map allHeaders = urlResponseInfo.getAllHeaders();
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (byiVar.h == byx.b(t(allHeaders, "Content-Range"))) {
                            this.p = true;
                            j(byiVar);
                            long j2 = byiVar.i;
                            if (j2 != -1) {
                                return j2;
                            }
                            return 0L;
                        }
                    }
                    try {
                        byte[] bArrCopyOf = bwp.e;
                        ByteBuffer byteBufferU2 = u();
                        while (!this.i) {
                            this.j.f();
                            byteBufferU2.clear();
                            v(byteBufferU2, this.f);
                            byteBufferU2.flip();
                            if (byteBufferU2.remaining() > 0) {
                                int length = bArrCopyOf.length;
                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, byteBufferU2.remaining() + length);
                                byteBufferU2.get(bArrCopyOf, length, byteBufferU2.remaining());
                            }
                        }
                    } catch (IOException unused) {
                        int i = bwp.a;
                    }
                    byf byfVar = httpStatusCode == 416 ? new byf(2008) : null;
                    urlResponseInfo.getHttpStatusText();
                    throw new byv(httpStatusCode, byfVar, allHeaders, byiVar);
                }
                agex agexVar = this.o;
                String strT = t(allHeaders, "Content-Type");
                if (strT != null && !agexVar.a(strT)) {
                    throw new byu(strT, byiVar);
                }
                if (httpStatusCode != 206) {
                    j = byiVar.h;
                    if (j == 0) {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                Iterator it = urlResponseInfo.getAllHeadersAsList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                            if (!((String) entry.getValue()).equalsIgnoreCase("identity")) {
                                this.q = byiVar.i;
                            }
                            this.p = true;
                            j(byiVar);
                            if (j != 0) {
                                byteBufferU = u();
                                while (j > 0) {
                                    try {
                                        this.j.f();
                                        byteBufferU.clear();
                                        v(byteBufferU, byiVar);
                                        if (!Thread.currentThread().isInterrupted()) {
                                            throw new InterruptedIOException();
                                        }
                                        if (!this.i) {
                                            throw new caf(byiVar);
                                        }
                                        byteBufferU.flip();
                                        ahno.O(byteBufferU.hasRemaining());
                                        int iMin = (int) Math.min(byteBufferU.remaining(), j);
                                        byteBufferU.position(byteBufferU.position() + iMin);
                                        j -= (long) iMin;
                                    } catch (IOException e) {
                                        if (e instanceof byt) {
                                            throw ((byt) e);
                                        }
                                        throw new caf(e, byiVar, true != (e instanceof SocketTimeoutException) ? 2001 : 2002, 14);
                                    }
                                }
                            }
                            return this.q;
                        }
                    }
                    long j3 = byiVar.i;
                    if (j3 != -1) {
                        this.q = j3;
                    } else {
                        long jA = byx.a(t(allHeaders, "Content-Length"), t(allHeaders, "Content-Range"));
                        this.q = jA != -1 ? jA - j : -1L;
                    }
                    this.p = true;
                    j(byiVar);
                    if (j != 0) {
                        byteBufferU = u();
                        while (j > 0) {
                            this.j.f();
                            byteBufferU.clear();
                            v(byteBufferU, byiVar);
                            if (!Thread.currentThread().isInterrupted()) {
                                throw new InterruptedIOException();
                            }
                            if (!this.i) {
                                throw new caf(byiVar);
                            }
                            byteBufferU.flip();
                            ahno.O(byteBufferU.hasRemaining());
                            int iMin2 = (int) Math.min(byteBufferU.remaining(), j);
                            byteBufferU.position(byteBufferU.position() + iMin2);
                            j -= (long) iMin2;
                        }
                    }
                    return this.q;
                }
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new caf(new InterruptedIOException(), byiVar, 1004, -1);
            }
        } catch (IOException e2) {
            if (e2 instanceof byt) {
                throw ((byt) e2);
            }
            throw new caf(e2, byiVar, 2000, 0);
        }
    }

    @Override // defpackage.bye
    public final Uri c() {
        UrlResponseInfo urlResponseInfo = this.g;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        byi byiVar = this.f;
        if (byiVar != null) {
            return byiVar.a;
        }
        return null;
    }

    @Override // defpackage.bxw, defpackage.bye
    public final Map d() {
        UrlResponseInfo urlResponseInfo = this.g;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getAllHeaders();
    }

    @Override // defpackage.bye
    public final synchronized void f() {
        p();
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer != null) {
            byteBuffer.limit(0);
        }
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        if (this.p) {
            this.p = false;
            h();
        }
    }

    @Override // defpackage.byw
    public final int k() {
        UrlResponseInfo urlResponseInfo = this.g;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.g.getHttpStatusCode();
    }

    @Override // defpackage.byw
    public final void l() {
        this.t.f();
    }

    @Override // defpackage.byw
    public final void m(String str, String str2) {
        this.t.g(str, str2);
    }

    public final int n(ByteBuffer byteBuffer) throws byt {
        ahno.O(this.p);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
        }
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.q != 0) {
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.r;
            if (byteBuffer2 != null) {
                int iMin = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
                int iLimit = byteBuffer2.limit();
                byteBuffer2.limit(byteBuffer2.position() + iMin);
                byteBuffer.put(byteBuffer2);
                byteBuffer2.limit(iLimit);
                if (iMin != 0) {
                    long j = this.q;
                    if (j != -1) {
                        this.q = j - ((long) iMin);
                    }
                    g(iMin);
                    return iMin;
                }
            }
            this.j.f();
            byi byiVar = this.f;
            int i = bwp.a;
            v(byteBuffer, byiVar);
            if (!this.i) {
                ahno.O(iRemaining > byteBuffer.remaining());
                int iRemaining2 = iRemaining - byteBuffer.remaining();
                long j2 = this.q;
                if (j2 != -1) {
                    this.q = j2 - ((long) iRemaining2);
                }
                g(iRemaining2);
                return iRemaining2;
            }
            this.q = 0L;
        }
        return -1;
    }

    protected UrlRequest.Builder o(byi byiVar) throws caf {
        Uri uri = byiVar.a;
        CronetEngine cronetEngine = this.k;
        String string = uri.toString();
        cag cagVar = this.e;
        Executor executor = this.l;
        UrlRequest.Builder builderAllowDirectExecutor = cronetEngine.newUrlRequestBuilder(string, cagVar, executor).setPriority(3).allowDirectExecutor();
        HashMap map = new HashMap();
        map.putAll(this.t.e());
        map.putAll(byiVar.f);
        for (Map.Entry entry : map.entrySet()) {
            builderAllowDirectExecutor.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        byte[] bArr = byiVar.e;
        if (bArr != null && !map.containsKey("Content-Type")) {
            throw new caf(byiVar, (char[]) null);
        }
        String strC = byx.c(byiVar.h, byiVar.i);
        if (strC != null) {
            builderAllowDirectExecutor.addHeader("Range", strC);
        }
        builderAllowDirectExecutor.setHttpMethod(byiVar.d());
        if (bArr != null) {
            builderAllowDirectExecutor.setUploadDataProvider(new cad(bArr), executor);
        }
        return builderAllowDirectExecutor;
    }

    public final void p() {
        UrlRequest urlRequest = this.d;
        if (urlRequest != null) {
            urlRequest.cancel();
            this.d = null;
        }
        cag cagVar = this.e;
        if (cagVar != null) {
            cagVar.a = true;
            this.e = null;
        }
    }

    public final void q(byi byiVar) {
        this.e = new cag(this);
        this.d = o(byiVar).build();
    }

    public final void r() {
        this.s = SystemClock.elapsedRealtime() + ((long) this.m);
    }
}
