package defpackage;

import android.os.SystemClock;
import app.rive.semantics.SemanticState;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axnp {
    public final long a;
    public final Object b;
    public final Object c;

    public axnp(axnk axnkVar, long j, long j2) {
        axng axngVar = new axng();
        this.c = axngVar;
        this.b = axnkVar;
        axngVar.a = j;
        axngVar.e = axok.q;
        axngVar.d = ImplVersion.getCronetVersion();
        this.a = j2;
    }

    public static axnp e() {
        return new axnp((Object) null, new vwo(vwn.MISSING), 0L);
    }

    public final int a() {
        return (int) (SystemClock.uptimeMillis() - this.a);
    }

    public final void b() {
        axng axngVar = (axng) this.c;
        if (axngVar.b < 0 || axngVar.c < 0) {
            return;
        }
        ((axnk) this.b).f(axngVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vwj] */
    public final vwn c() {
        return this.c.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, vwj] */
    public final boolean d() {
        ?? r2 = this.c;
        return r2.a() == vwn.AVAILABLE || r2.a() == vwn.STALE;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final /* synthetic */ void f(String str, aqi aqiVar, byte[] bArr) {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) URI.create(str).toURL().openConnection();
                try {
                    httpURLConnection2.getClass();
                    aqiVar.a(new mga(httpURLConnection2, 16), this.c);
                    httpURLConnection2.setRequestProperty("User-Agent", (String) this.b);
                    int i = (int) this.a;
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Content-Type", "application/x-protobuf");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.close();
                        InputStream inputStream = httpURLConnection2.getResponseCode() < 400 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            if (inputStream == null) {
                                byteArrayOutputStream.close();
                            } else {
                                try {
                                    byte[] bArr2 = new byte[SemanticState.Obscured];
                                    while (true) {
                                        int i2 = inputStream.read(bArr2);
                                        if (i2 == -1) {
                                            break;
                                        } else {
                                            byteArrayOutputStream.write(bArr2, 0, i2);
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th) {
                                                th.addSuppressed(th);
                                            }
                                        }
                                        throw th;
                                    }
                                    byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                            aqiVar.b(new nrk());
                            httpURLConnection2.disconnect();
                        } catch (Throwable th4) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (SocketTimeoutException e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    aqiVar.d(new TimeoutException("Timeout: " + e.getMessage()));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection = httpURLConnection2;
                    aqiVar.d(th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            } catch (Throwable th8) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th8;
            }
        } catch (SocketTimeoutException e2) {
            e = e2;
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public axnp(ExecutorService executorService, String str, long j) {
        this.c = executorService;
        this.b = str;
        this.a = j;
    }

    public axnp(Object obj, Object obj2, long j) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
