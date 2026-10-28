package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.Executor;
import com.google.android.libraries.youtube.media.interfaces.NetFetch;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaCommonConfig;
import defpackage.hhb;
import defpackage.wiu;
import defpackage.xeu;
import defpackage.ypb;
import defpackage.ypf;
import defpackage.zcf;
import defpackage.zjr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class PlaybackNetFetchFactory {
    private final zjr a;
    private final xeu b;
    private final EnvoyNetFetchProvider c;
    private final hhb d;

    public PlaybackNetFetchFactory(zjr zjrVar, xeu xeuVar, hhb hhbVar, EnvoyNetFetchProvider envoyNetFetchProvider) {
        zjrVar.getClass();
        xeuVar.getClass();
        hhbVar.getClass();
        envoyNetFetchProvider.getClass();
        this.a = zjrVar;
        this.b = xeuVar;
        this.d = hhbVar;
        this.c = envoyNetFetchProvider;
    }

    private final NetFetch b(zcf zcfVar) {
        wiu wiuVar = zcfVar.y;
        return new ypf(zcfVar.a, new ypb(wiuVar.m(), wiuVar.n(), false), this.b, zcfVar.Z, this.d);
    }

    public final NetFetch a(zcf zcfVar, Executor executor) {
        NetFetch netFetchA;
        executor.getClass();
        zjr zjrVar = this.a;
        if (zjrVar.dS()) {
            EnvoyNetFetchProvider envoyNetFetchProvider = true == zjrVar.Q().e ? this.c : null;
            return (envoyNetFetchProvider == null || (netFetchA = envoyNetFetchProvider.a(executor)) == null) ? b(zcfVar) : netFetchA;
        }
        MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance = zcfVar.y.d.e;
        if (defaultInstance == null) {
            defaultInstance = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
        }
        if (defaultInstance.m) {
            return null;
        }
        return b(zcfVar);
    }
}
