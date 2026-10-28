package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrt implements qry, qru {
    public final ListenableFuture a;
    public final Executor b;
    public final agev c;
    public final ayq f;
    private final String g;
    private final afud h;
    private final qsc i;
    public final Object d = new Object();
    private final auor j = new auor();
    public ListenableFuture e = null;

    public qrt(String str, ListenableFuture listenableFuture, qsc qscVar, Executor executor, ayq ayqVar, agev agevVar, afud afudVar) {
        this.g = str;
        this.a = ahng.o(listenableFuture);
        this.i = qscVar;
        this.b = new ahfg(executor);
        this.f = ayqVar;
        this.c = agevVar;
        this.h = afudVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x001d, B:12:0x001f, B:14:0x0023, B:15:0x0044), top: B:21:0x0003, inners: #1 }] */
    private final ListenableFuture g() {
        ListenableFuture listenableFutureO;
        synchronized (this.d) {
            ListenableFuture listenableFuture = this.e;
            if (listenableFuture == null || !listenableFuture.isDone()) {
                listenableFutureO = this.e;
                if (listenableFutureO == null) {
                    auor auorVar = this.j;
                    ojf ojfVar = new ojf(this, 10);
                    long j = afwl.a;
                    listenableFutureO = ahng.o(auorVar.d(new afwh(afty.c(false), ojfVar, 0), this.b));
                    this.e = listenableFutureO;
                }
            } else {
                try {
                    ListenableFuture listenableFuture2 = this.e;
                    ahno.R(listenableFuture2.isDone(), "Future was expected to be done: %s", listenableFuture2);
                    a.i(listenableFuture2);
                } catch (ExecutionException unused) {
                    this.e = null;
                }
                listenableFutureO = this.e;
                if (listenableFutureO == null) {
                    auor auorVar2 = this.j;
                    ojf ojfVar2 = new ojf(this, 10);
                    long j2 = afwl.a;
                    listenableFutureO = ahng.o(auorVar2.d(new afwh(afty.c(false), ojfVar2, 0), this.b));
                    this.e = listenableFutureO;
                }
            }
            throw th;
        }
        return listenableFutureO;
    }

    @Override // defpackage.qry
    public final ahcx a() {
        return new ojf(this, 9);
    }

    @Override // defpackage.qru
    public final ListenableFuture b() {
        return aher.a;
    }

    @Override // defpackage.qru
    public final Object c() {
        Object objI;
        try {
            synchronized (this.d) {
                ListenableFuture listenableFuture = this.e;
                ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                objI = a.i(listenableFuture);
            }
            return objI;
        } catch (NullPointerException | ExecutionException e) {
            throw new IllegalStateException("Do not call getDataSync() before a successful call to getData()", e);
        }
    }

    public final Object d(Uri uri) {
        try {
            try {
                afuu afuuVarB = this.h.b("Read " + this.g);
                try {
                    InputStream inputStream = (InputStream) this.f.X(uri, new qqs());
                    try {
                        MessageLite messageLiteA = this.i.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        afuuVarB.close();
                        return messageLiteA;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        afuuVarB.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e) {
                throw nqw.f(this.f, uri, e, this.g);
            }
        } catch (FileNotFoundException e2) {
            if (this.f.ac(uri)) {
                throw e2;
            }
            return this.i.a;
        }
    }

    public final void e(Uri uri, Object obj) {
        Uri uriA = rmp.A(uri, ".tmp");
        try {
            afuu afuuVarB = this.h.b("Write " + this.g);
            try {
                qpu qpuVar = new qpu();
                try {
                    ayq ayqVar = this.f;
                    qqu qquVar = new qqu();
                    qquVar.a = new qpu[]{qpuVar};
                    OutputStream outputStream = (OutputStream) ayqVar.X(uriA, qquVar);
                    try {
                        ((MessageLite) obj).writeTo(outputStream);
                        qpuVar.a();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        afuuVarB.close();
                        this.f.ab(uriA, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw nqw.f(this.f, uri, e, this.g);
                }
            } catch (Throwable th3) {
                try {
                    afuuVarB.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            ayq ayqVar2 = this.f;
            if (ayqVar2.ac(uriA)) {
                try {
                    ayqVar2.aa(uriA);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.qry
    public final String f() {
        return this.g;
    }

    @Override // defpackage.qry
    public final ListenableFuture h() {
        return g();
    }

    @Override // defpackage.qry
    public final ListenableFuture i(ahcy ahcyVar, Executor executor) {
        qrv qrvVar = new qrv(this, g(), ahcyVar, executor, 1);
        long j = afwl.a;
        return this.j.d(new afwh(afty.c(false), qrvVar, 0), MoreExecutors.directExecutor());
    }
}
