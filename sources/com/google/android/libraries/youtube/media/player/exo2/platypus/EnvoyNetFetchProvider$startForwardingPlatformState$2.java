package com.google.android.libraries.youtube.media.player.exo2.platypus;

import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awql;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class EnvoyNetFetchProvider$startForwardingPlatformState$2 extends awpk implements awql {
    /* synthetic */ Object a;
    final /* synthetic */ EnvoyNetFetchProvider b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnvoyNetFetchProvider$startForwardingPlatformState$2(EnvoyNetFetchProvider envoyNetFetchProvider, awoq awoqVar) {
        super(3, awoqVar);
        this.b = envoyNetFetchProvider;
    }

    @Override // defpackage.awql
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        EnvoyNetFetchProvider$startForwardingPlatformState$2 envoyNetFetchProvider$startForwardingPlatformState$2 = new EnvoyNetFetchProvider$startForwardingPlatformState$2(this.b, (awoq) obj3);
        envoyNetFetchProvider$startForwardingPlatformState$2.a = (Throwable) obj2;
        return envoyNetFetchProvider$startForwardingPlatformState$2.invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        this.b.c((Throwable) this.a, "Envoy NetFetch connectivity forwarding failed");
        return awmy.a;
    }
}
