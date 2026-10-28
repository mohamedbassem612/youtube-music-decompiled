package org.chromium.net;

import defpackage.axoz;
import defpackage.axpa;
import defpackage.axpb;
import defpackage.axqd;
import defpackage.axqi;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class VersionSafeProxyOptions {
    private static final int SET_PROXY_OPTIONS_API_LEVEL = 49;
    private final ProxyOptions mBackend;

    public VersionSafeProxyOptions(ProxyOptions proxyOptions) {
        if (!apiContainsProxyOptionsClass()) {
            throw new AssertionError(String.format("This should have not been created: the Cronet API being used has an ApiLevel of %s, but setProxyOptions was added in ApiLevel %s", Integer.valueOf(AndroidInfo.h()), 49));
        }
        proxyOptions.getClass();
        this.mBackend = proxyOptions;
        if (proxyOptions.getProxyList().isEmpty()) {
            throw new AssertionError("The list of proxies should never be empty, this is checked in the API layer");
        }
    }

    private static boolean apiContainsProxyOptionsClass() {
        return AndroidInfo.h() >= 49;
    }

    public List createProxyCallbackList() {
        ArrayList arrayList = new ArrayList();
        for (Proxy proxy : this.mBackend.getProxyList()) {
            arrayList.add(proxy == null ? null : new axoz(proxy.getExecutor(), proxy.getCallback()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public axpb createProxyOptionsProto() {
        axqd axqdVarI = axpb.DEFAULT_INSTANCE.i();
        for (Proxy proxy : this.mBackend.getProxyList()) {
            axqd axqdVarI2 = axpa.DEFAULT_INSTANCE.i();
            if (proxy == null) {
                axqdVarI2.g(1);
            } else {
                String host = proxy.getHost();
                axqdVarI2.f();
                axpa axpaVar = (axpa) axqdVarI2.b;
                host.getClass();
                axpaVar.bitField0_ |= 2;
                axpaVar.host_ = host;
                int port = proxy.getPort();
                axqdVarI2.f();
                axpa axpaVar2 = (axpa) axqdVarI2.b;
                axpaVar2.bitField0_ |= 4;
                axpaVar2.port_ = port;
                int scheme = proxy.getScheme();
                if (scheme == 0) {
                    axqdVarI2.g(2);
                } else {
                    if (scheme != 1) {
                        throw new AssertionError(String.format("Unknown Proxy.Scheme: %s. This should have been caught by the API layer", Integer.valueOf(scheme)));
                    }
                    axqdVarI2.g(3);
                }
            }
            axpa axpaVar3 = (axpa) axqdVarI2.c();
            axqdVarI.f();
            axpb axpbVar = (axpb) axqdVarI.b;
            axpaVar3.getClass();
            axqi axqiVar = axpbVar.proxies_;
            if (!axqiVar.c()) {
                axpbVar.proxies_ = axqiVar.d(axqiVar.size() << 1);
            }
            axpbVar.proxies_.add(axpaVar3);
        }
        return (axpb) axqdVarI.c();
    }
}
