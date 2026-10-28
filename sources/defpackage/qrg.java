package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qrg implements qry {
    public final String a;
    public final ListenableFuture b;
    public final Executor c;
    public final afud d;
    public final qsc f;
    public final ayq h;
    private final agev i;
    public final qrc e = new qrs(this, 1);
    public final auor g = new auor();

    public qrg(String str, ListenableFuture listenableFuture, qsc qscVar, Executor executor, ayq ayqVar, agev agevVar, afud afudVar) {
        this.a = str;
        this.b = ahng.o(listenableFuture);
        this.f = qscVar;
        this.c = executor;
        this.h = ayqVar;
        this.i = agevVar;
        this.d = afudVar;
    }

    public static ListenableFuture b(ListenableFuture listenableFuture, Closeable closeable) {
        return ahng.h(listenableFuture).a(new jkb(closeable, listenableFuture, 12, null), MoreExecutors.directExecutor());
    }

    public static boolean g(IOException iOException) {
        return (iOException instanceof qpx) || (iOException.getCause() instanceof qpx);
    }

    @Override // defpackage.qry
    public final ahcx a() {
        return new iud(this, 8);
    }

    public final ListenableFuture c(Uri uri, qrf qrfVar) {
        try {
            return ahng.n(e(uri));
        } catch (IOException e) {
            agev agevVar = this.i;
            if (agevVar.g()) {
                return g(e) ? ahng.m(e) : ahcs.f(qrfVar.a(e, (qrb) agevVar.c()), afwl.d(new ols(this, uri, 16)), this.c);
            }
            return ahng.m(e);
        }
    }

    public final ListenableFuture d(ListenableFuture listenableFuture) {
        return ahcs.f(listenableFuture, afwl.d(new qmu(this, 4)), this.c);
    }

    public final MessageLite e(Uri uri) throws IOException {
        try {
            try {
                afuu afuuVarB = this.d.b("Read " + this.a);
                try {
                    InputStream inputStream = (InputStream) this.h.X(uri, new qqs());
                    try {
                        MessageLite messageLiteA = this.f.a(inputStream);
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
            } catch (FileNotFoundException unused) {
                ayq ayqVar = this.h;
                if (!ayqVar.ac(uri)) {
                    return this.f.a;
                }
                InputStream inputStream2 = (InputStream) ayqVar.X(uri, new qqs());
                try {
                    MessageLite messageLiteA2 = this.f.a(inputStream2);
                    if (inputStream2 == null) {
                        return messageLiteA2;
                    }
                    inputStream2.close();
                    return messageLiteA2;
                } catch (Throwable th5) {
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            }
        } catch (IOException e) {
            throw nqw.f(this.h, uri, e, this.a);
        }
    }

    @Override // defpackage.qry
    public final String f() {
        return this.a;
    }

    @Override // defpackage.qry
    public final ListenableFuture h() {
        return ahng.o(ahng.s(afwl.c(new iud(this, 9)), this.c));
    }

    @Override // defpackage.qry
    public final ListenableFuture i(ahcy ahcyVar, Executor executor) {
        return this.g.d(afwl.c(new gmf(this, ahcyVar, executor, 9)), this.c);
    }
}
