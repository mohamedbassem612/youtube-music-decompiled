package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axnx implements axoi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ axnx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.axoi
    public final void a() throws IOException {
        List list;
        int i = this.$cid;
        if (i == 0) {
            axoa axoaVar = (axoa) this.a;
            if (axoaVar.i == null) {
                axoh axohVar = axoaVar.k;
                axohVar.l = 10;
                HttpURLConnection httpURLConnection = axoaVar.h;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                axohVar.l = 12;
                axoaVar.j = httpURLConnection.getOutputStream();
                axoaVar.i = Channels.newChannel(axoaVar.j);
            }
            axoaVar.a.set(0);
            axoaVar.b();
            return;
        }
        if (i == 1) {
            Object obj = this.a;
            axoa axoaVar2 = (axoa) obj;
            axoaVar2.c.read((UploadDataSink) obj, axoaVar2.d);
            axoaVar2.b.execute(new axms(obj, 11));
            return;
        }
        Network network = null;
        if (i != 2) {
            if (i == 3) {
                ((UploadDataProvider) this.a).close();
                return;
            }
            Object obj2 = this.a;
            if (i != 4) {
                axof axofVar = (axof) obj2;
                axoh axohVar2 = axofVar.d;
                if (axohVar2.g.compareAndSet(1, 4)) {
                    axofVar.a.onResponseStarted(axohVar2, axohVar2.o);
                    return;
                }
                return;
            }
            axoh axohVar3 = (axoh) obj2;
            if (axohVar3.q != null) {
                ArrayList arrayList = new ArrayList();
                String headerField = "http/1.1";
                int i2 = 0;
                while (true) {
                    String headerFieldKey = axohVar3.q.getHeaderFieldKey(i2);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = axohVar3.q.getHeaderField(i2);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, axohVar3.q.getHeaderField(i2)));
                    }
                    i2++;
                }
                int responseCode = axohVar3.q.getResponseCode();
                axor axorVar = new axor(new ArrayList(axohVar3.f), responseCode, axohVar3.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), false, headerField, "", 0L, false);
                if (responseCode >= 300 && responseCode < 400 && (list = (List) axorVar.getAllHeaders().get("location")) != null) {
                    axohVar3.j(1, 2, new atvv(obj2, (String) list.get(0), axorVar, 9, (char[]) null));
                    return;
                }
                axohVar3.o = axorVar;
                axohVar3.e();
                if (responseCode < 400) {
                    axohVar3.n = axns.a(axohVar3.q.getInputStream());
                    axohVar3.b.d();
                    return;
                } else {
                    InputStream errorStream = axohVar3.q.getErrorStream();
                    axohVar3.n = errorStream != null ? axns.a(errorStream) : null;
                    axohVar3.b.d();
                    return;
                }
            }
            return;
        }
        axoh axohVar4 = (axoh) this.a;
        if (axohVar4.g.get() != 8) {
            URL url = new URL(axohVar4.m);
            HttpURLConnection httpURLConnection2 = axohVar4.q;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                axohVar4.q = null;
            }
            long j = axohVar4.u;
            if (j == -1) {
                axohVar4.q = (HttpURLConnection) url.openConnection();
            } else {
                for (Network network2 : ((ConnectivityManager) axohVar4.r.d.getSystemService("connectivity")).getAllNetworks()) {
                    if (network2.getNetworkHandle() == j) {
                        network = network2;
                        break;
                    }
                }
                if (network == null) {
                    throw new axol("Network bound to request not found", 9, -4);
                }
                axohVar4.q = (HttpURLConnection) network.openConnection(url);
            }
            axohVar4.q.setInstanceFollowRedirects(false);
            Map map = axohVar4.e;
            if (!map.containsKey("User-Agent")) {
                map.put("User-Agent", axohVar4.d);
            }
            for (Map.Entry entry : map.entrySet()) {
                axohVar4.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            axohVar4.q.setRequestMethod(axohVar4.i);
            axox axoxVar = axohVar4.j;
            if (axoxVar != null) {
                axohVar4.y = new axoa(axohVar4, axohVar4.k, axohVar4.c, axohVar4.q, axoxVar);
                axoa axoaVar3 = axohVar4.y;
                axoaVar3.a(new axny(axoaVar3, axohVar4.f.size() == 1, 1), "start");
            } else {
                axohVar4.l = 10;
                axohVar4.q.connect();
                axohVar4.g();
            }
        }
    }
}
