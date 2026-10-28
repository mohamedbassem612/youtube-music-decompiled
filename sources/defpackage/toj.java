package defpackage;

import j$.time.Instant;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class toj extends NetworkQualityRttListener {
    public final awku a;
    public final agfr b;
    public final avlh c;
    public final vxz d;
    private final awmd e;
    private final awkx f;
    private final agfr g;

    public toj(Executor executor, awmd awmdVar, vxz vxzVar) {
        vxz vxzVar2;
        super(executor);
        this.a = new awku(aobj.EFFECTIVE_CONNECTION_TYPE_UNKNOWN);
        awkx awkxVar = new awkx();
        this.f = awkxVar;
        this.e = awmdVar;
        this.b = aguu.al(new qhs(this, 19));
        if (vxzVar.l(0, 45371409L, false)) {
            vxzVar2 = vxzVar;
            this.c = awkxVar.p().P().l(vxzVar2.c(3, 45371834L, 0L) > 0 ? (int) vxzVar2.c(3, 45371834L, 0L) : 250, TimeUnit.MILLISECONDS).E();
        } else {
            vxzVar2 = vxzVar;
            this.c = awkxVar;
        }
        this.d = vxzVar2;
        this.g = aguu.al(new qhs(this, 20));
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i, long j, int i2) {
        aobj aobjVar;
        aobk aobkVar;
        int effectiveConnectionType = ((ExperimentalCronetEngine) this.e.io()).getEffectiveConnectionType();
        if (effectiveConnectionType == 1) {
            aobjVar = aobj.EFFECTIVE_CONNECTION_TYPE_OFFLINE;
        } else if (effectiveConnectionType == 2) {
            aobjVar = aobj.EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
        } else if (effectiveConnectionType == 3) {
            aobjVar = aobj.EFFECTIVE_CONNECTION_TYPE_2G;
        } else if (effectiveConnectionType != 4) {
            aobjVar = effectiveConnectionType != 5 ? aobj.EFFECTIVE_CONNECTION_TYPE_UNKNOWN : aobj.EFFECTIVE_CONNECTION_TYPE_4G;
        } else {
            aobjVar = aobj.EFFECTIVE_CONNECTION_TYPE_3G;
        }
        this.a.kk(aobjVar);
        vxz vxzVar = this.d;
        if (vxzVar.l(0, 45371409L, false)) {
            switch (i2) {
                case 0:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_HTTP;
                    break;
                case 1:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_TCP;
                    break;
                case 2:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_QUIC;
                    break;
                case 3:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_HTTP_CACHED_ESTIMATE;
                    break;
                case 4:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_DEFAULT_HTTP_FROM_PLATFORM;
                    break;
                case 5:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_DEPRECATED_HTTP_EXTERNAL_ESTIMATE;
                    break;
                case 6:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_TRANSPORT_CACHED_ESTIMATE;
                    break;
                case 7:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_DEFAULT_TRANSPORT_FROM_PLATFORM;
                    break;
                case 8:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_H2_PINGS;
                    break;
                default:
                    aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_UNKNOWN;
                    break;
            }
            if (((HashSet) this.g.io()).contains(aobkVar)) {
                awkx awkxVar = this.f;
                if (vxzVar.l(4, 45406146L, false)) {
                    j = Instant.now().toEpochMilli();
                }
                awkxVar.kk(new toi(i, j, aobkVar));
            }
        }
    }
}
