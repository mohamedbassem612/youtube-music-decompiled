package org.chromium.net.impl;

import android.util.Pair;
import internal.J.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.Proxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ProxyCallbackRequestImpl extends Proxy.HttpConnectCallback.Request {
    private final long a;
    private boolean b;

    ProxyCallbackRequestImpl(long j) {
        this.a = j;
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        N.MLpcvWs2(this.a);
        this.b = true;
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request
    public final void proceed(List list) {
        if (this.b) {
            throw new IllegalStateException("This request has already been consumed: either proceed or close has already been called");
        }
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add((String) pair.first);
            arrayList.add((String) pair.second);
        }
        if (!N.ML1ZNMN3(this.a, (String[]) arrayList.toArray(new String[arrayList.size()]))) {
            throw new IllegalArgumentException("One of the headers is invalid");
        }
        this.b = true;
    }
}
