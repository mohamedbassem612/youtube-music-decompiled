package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzd implements atzk {
    public final HttpURLConnection a;
    public final atzb b;
    public final byte[] c;
    public long d;
    public int e = -1;
    private int f;

    public atzd(HttpURLConnection httpURLConnection, String str, atzc atzcVar, atzb atzbVar) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.b = atzbVar;
            httpURLConnection.setDoOutput(true);
            if (atzbVar.e() >= 0) {
                long jE = atzbVar.e() - atzbVar.d();
                if (jE < 2147483647L) {
                    httpURLConnection.setFixedLengthStreamingMode((int) jE);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode(jE);
                }
            } else {
                httpURLConnection.setChunkedStreamingMode(0);
            }
            for (String str2 : atzcVar.c()) {
                Iterator it = atzcVar.b(str2).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str2, (String) it.next());
                }
            }
            this.f = 1;
            this.c = new byte[65536];
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    @Override // defpackage.atzk
    public final ListenableFuture a() {
        ahev ahevVar = new ahev(new aegt(this, 12));
        ahfi ahfiVar = new ahfi();
        ahfiVar.c("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(ahfi.a(ahfiVar));
        executorServiceNewSingleThreadExecutor.execute(ahevVar);
        executorServiceNewSingleThreadExecutor.shutdown();
        return ahevVar;
    }

    @Override // defpackage.atzk
    public final void b() {
        synchronized (this) {
            this.f = 3;
            notifyAll();
        }
    }

    public final synchronized void c() {
        int i;
        while (true) {
            i = this.f;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new atzm(atzl.CANCELED, "", null);
        }
        aguu.ah(i == 1);
    }

    public final boolean d() throws atzm {
        try {
            return this.b.i();
        } catch (IOException e) {
            throw new atzm(atzl.REQUEST_BODY_READ_ERROR, null, e);
        }
    }

    public final twp e() throws atzm {
        InputStream errorStream;
        atzc atzcVar;
        c();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                errorStream = this.a.getInputStream();
            } catch (IOException unused) {
                errorStream = this.a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                atzcVar = new atzc();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        for (String str2 : headerFields.get(str)) {
                            ahno.F(!str.isEmpty());
                            str2.getClass();
                            String lowerCase = str.toLowerCase(Locale.US);
                            Map map = atzcVar.a;
                            if (!map.containsKey(lowerCase)) {
                                map.put(lowerCase, new ArrayList());
                            }
                            ((List) map.get(lowerCase)).add(str2);
                        }
                    }
                }
            } else {
                atzcVar = null;
            }
            return new twp(responseCode, atzcVar, errorStream);
        } catch (IOException e) {
            throw new atzm(atzl.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }
}
