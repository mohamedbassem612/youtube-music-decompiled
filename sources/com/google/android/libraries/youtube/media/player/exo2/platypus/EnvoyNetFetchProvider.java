package com.google.android.libraries.youtube.media.player.exo2.platypus;

import android.content.Context;
import com.google.android.libraries.youtube.media.interfaces.Executor;
import com.google.android.libraries.youtube.media.interfaces.NetFetch;
import com.google.android.libraries.youtube.media.interfaces.NetFetchFactory;
import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig;
import defpackage.avlh;
import defpackage.awmi;
import defpackage.awmp;
import defpackage.awoq;
import defpackage.awov;
import defpackage.awro;
import defpackage.awut;
import defpackage.awzc;
import defpackage.awzf;
import defpackage.awzj;
import defpackage.awzl;
import defpackage.axeh;
import defpackage.axen;
import defpackage.axeo;
import defpackage.bej;
import defpackage.xeu;
import defpackage.yno;
import defpackage.zhq;
import defpackage.zjr;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class EnvoyNetFetchProvider {
    public final ExecutorImpl a;
    public final zjr b;
    public final Context c;
    public final xeu d;
    public final awut e;
    public final awzc f;
    public boolean g;
    private final String h;
    private final awmi i;

    /* JADX INFO: compiled from: PG */
    public interface EnvoyNetFetchFactory {
    }

    public EnvoyNetFetchProvider(ExecutorImpl executorImpl, zjr zjrVar, String str, Context context, xeu xeuVar, avlh avlhVar, awut awutVar) {
        executorImpl.getClass();
        zjrVar.getClass();
        str.getClass();
        context.getClass();
        xeuVar.getClass();
        avlhVar.getClass();
        awutVar.getClass();
        this.a = executorImpl;
        this.b = zjrVar;
        this.h = str;
        this.c = context;
        this.d = xeuVar;
        this.e = awutVar;
        axeh[] axehVarArr = axeo.a;
        this.f = awzf.a(new axen(avlhVar, awov.a, -2, 1));
        this.g = true;
        this.i = new awmp(new Function0() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.EnvoyNetFetchProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EnvoyNetFetchProvider envoyNetFetchProvider = this.a;
                ExecutorImpl executorImpl2 = envoyNetFetchProvider.a;
                final NetFetch netFetchB = envoyNetFetchProvider.b(executorImpl2);
                if (netFetchB == null) {
                    zhq zhqVar = zhq.ABR;
                } else {
                    new AndroidProxySettingResolver(envoyNetFetchProvider.c, new AndroidProxySettingResolver.Listener() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.EnvoyNetFetchProvider$$ExternalSyntheticLambda0
                        @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.AndroidProxySettingResolver.Listener
                        public final void a(String str2, int i) {
                            netFetchB.onProxySettingsChange(str2, i);
                        }
                    }, executorImpl2, envoyNetFetchProvider.d, envoyNetFetchProvider.b.j.l(271, 45689850L, false));
                    awro.t(envoyNetFetchProvider.e, null, 0, new bej(new awzl(new awzj(envoyNetFetchProvider.f, new EnvoyNetFetchProvider$startForwardingPlatformState$1(envoyNetFetchProvider, netFetchB, null), 3), new EnvoyNetFetchProvider$startForwardingPlatformState$2(envoyNetFetchProvider, null), 0), (awoq) null, 16), 3);
                    zhq zhqVar2 = zhq.ABR;
                }
                return netFetchB;
            }
        });
    }

    public final NetFetch a(Executor executor) {
        if (this.b.R().H || ((NetFetch) this.i.a()) == null) {
            return null;
        }
        return b(executor);
    }

    public final NetFetch b(Executor executor) {
        try {
            String str = this.h;
            MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig defaultInstance = this.b.V().d;
            if (defaultInstance == null) {
                defaultInstance = MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig.getDefaultInstance();
            }
            defaultInstance.getClass();
            PlatypusNativeLoader.a();
            return NetFetchFactory.createEnvoyNetFetch(executor, str, defaultInstance);
        } catch (LinkageError e) {
            c(e, "Envoy NetFetch creation failed");
            return null;
        } catch (RuntimeException e2) {
            c(e2, "Envoy NetFetch creation failed");
            return null;
        }
    }

    public final void c(Throwable th, String str) {
        yno.Q(this.d, th, str);
    }
}
