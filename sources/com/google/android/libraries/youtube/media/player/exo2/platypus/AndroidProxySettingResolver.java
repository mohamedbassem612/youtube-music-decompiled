package com.google.android.libraries.youtube.media.player.exo2.platypus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.youtube.media.interfaces.Executor;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import defpackage.ajtv;
import defpackage.ajtx;
import defpackage.alos;
import defpackage.alot;
import defpackage.alou;
import defpackage.avg;
import defpackage.xeu;
import defpackage.xff;
import defpackage.yno;
import defpackage.ztf;
import j$.util.Objects;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class AndroidProxySettingResolver extends BroadcastReceiver {
    private final Listener a;
    private final Executor b;
    private final ConnectivityManager c;
    private final xeu d;
    private final boolean e;

    /* JADX INFO: compiled from: PG */
    @FunctionalInterface
    interface Listener {
        void a(String str, int i);
    }

    public AndroidProxySettingResolver(Context context, Listener listener, Executor executor, xeu xeuVar, boolean z) {
        this.a = listener;
        this.b = executor;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = connectivityManager;
        this.d = xeuVar;
        this.e = z;
        try {
            a(null, listener, executor, connectivityManager, z);
        } catch (Exception e) {
            ajtx ajtxVarCx = yno.cx(e, 16, ajtv.ERROR_LEVEL_ERROR, "Platypus Proxy Setting Resolution error");
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(ajtxVarCx, alot.CLIENT_ERROR);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVarCx.build();
                clientErrorOuterClass$ClientError.getClass();
                alouVar.d = clientErrorOuterClass$ClientError;
                alouVar.c = 163;
                xeuVar.b((alou) alosVar.build());
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        avg.f(context, this, intentFilter, null, 2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f A[EDGE_INSN: B:21:0x005f->B:24:0x006b BREAK  A[LOOP:0: B:5:0x0016->B:39:?]] */
    private static void a(Intent intent, final Listener listener, Executor executor, ConnectivityManager connectivityManager, boolean z) {
        ProxyInfo proxyInfoBuildDirectProxy;
        Bundle extras;
        final int port;
        if (z) {
            Iterator<Proxy> it = ProxySelector.getDefault().select(new URI("https://foo.googlevideo.com")).iterator();
            while (true) {
                if (it.hasNext()) {
                    Proxy next = it.next();
                    if (next.type() == Proxy.Type.HTTP) {
                        SocketAddress socketAddressAddress = next.address();
                        if (socketAddressAddress instanceof InetSocketAddress) {
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                            proxyInfoBuildDirectProxy = ProxyInfo.buildDirectProxy(inetSocketAddress.getHostString(), inetSocketAddress.getPort());
                            break;
                        }
                    }
                }
                proxyInfoBuildDirectProxy = null;
                break;
            }
        }
        ProxyInfo defaultProxy = connectivityManager != null ? connectivityManager.getDefaultProxy() : null;
        if (defaultProxy == null) {
            proxyInfoBuildDirectProxy = null;
            break;
        } else if (defaultProxy.getPacFileUrl().equals(Uri.EMPTY)) {
            proxyInfoBuildDirectProxy = defaultProxy;
        } else {
            if (intent == null || (extras = intent.getExtras()) == null) {
                proxyInfoBuildDirectProxy = null;
                break;
            }
            proxyInfoBuildDirectProxy = (ProxyInfo) extras.get("android.intent.extra.PROXY_INFO");
        }
        final String host = proxyInfoBuildDirectProxy != null ? proxyInfoBuildDirectProxy.getHost() : null;
        if (proxyInfoBuildDirectProxy == null || host == null || host.isEmpty()) {
            port = 0;
            host = "";
        } else {
            port = proxyInfoBuildDirectProxy.getPort();
        }
        if (executor.isOnExecutor()) {
            listener.a(host, port);
        } else {
            executor.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.AndroidProxySettingResolver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    listener.a(host, port);
                }
            });
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.PROXY_CHANGE")) {
            try {
                a(intent, this.a, this.b, this.c, this.e);
            } catch (Exception e) {
                ajtx ajtxVarCx = yno.cx(e, 16, ajtv.ERROR_LEVEL_ERROR, "Platypus Proxy Setting OnReceive error");
                xeu xeuVar = this.d;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(ajtxVarCx, alot.CLIENT_ERROR);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                    return;
                }
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVarCx.build();
                clientErrorOuterClass$ClientError.getClass();
                alouVar.d = clientErrorOuterClass$ClientError;
                alouVar.c = 163;
                xeuVar.b((alou) alosVar.build());
            }
        }
    }
}
