package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.NetFetch;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class EnvoyNetFetchProvider$startForwardingPlatformState$1 extends awpk implements awqk {
    /* synthetic */ int a;
    final /* synthetic */ EnvoyNetFetchProvider b;
    final /* synthetic */ NetFetch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnvoyNetFetchProvider$startForwardingPlatformState$1(EnvoyNetFetchProvider envoyNetFetchProvider, NetFetch netFetch, awoq awoqVar) {
        super(2, awoqVar);
        this.b = envoyNetFetchProvider;
        this.c = netFetch;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        EnvoyNetFetchProvider$startForwardingPlatformState$1 envoyNetFetchProvider$startForwardingPlatformState$1 = new EnvoyNetFetchProvider$startForwardingPlatformState$1(this.b, this.c, awoqVar);
        envoyNetFetchProvider$startForwardingPlatformState$1.a = ((Number) obj).intValue();
        return envoyNetFetchProvider$startForwardingPlatformState$1;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EnvoyNetFetchProvider$startForwardingPlatformState$1) create(Integer.valueOf(((Number) obj).intValue()), (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        final int i = this.a;
        final EnvoyNetFetchProvider envoyNetFetchProvider = this.b;
        final NetFetch netFetch = this.c;
        envoyNetFetchProvider.a.schedule(new Runnable() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.EnvoyNetFetchProvider$startForwardingPlatformState$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NetFetch netFetch2 = netFetch;
                int i2 = i;
                EnvoyNetFetchProvider envoyNetFetchProvider2 = envoyNetFetchProvider;
                if (i2 == 2) {
                    envoyNetFetchProvider2.g = false;
                    netFetch2.onDefaultNetworkUnavailable();
                } else {
                    if (!envoyNetFetchProvider2.g) {
                        netFetch2.onDefaultNetworkAvailable();
                    }
                    netFetch2.onDefaultNetworkChange(i2);
                    envoyNetFetchProvider2.g = true;
                }
            }
        });
        return awmy.a;
    }
}
