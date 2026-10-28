package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yot extends cah {
    private final vxz k;

    public yot(CronetEngine cronetEngine, Executor executor, agex agexVar, int i, int i2, boolean z, boolean z2, vxz vxzVar) {
        super(cronetEngine, executor, i, i2, z, agexVar, z2);
        this.k = vxzVar;
    }

    @Override // defpackage.cah
    protected final UrlRequest.Builder o(byi byiVar) throws caf {
        UrlRequest.Builder builderO = super.o(byiVar);
        Optional optionalOf = Optional.of(tok.MEDIA_CRONET_DATA_SOURCE);
        Object obj = byiVar.l;
        if (obj instanceof ypq) {
            ypq ypqVar = (ypq) obj;
            if (ypqVar.e) {
                ((ExperimentalUrlRequest.Builder) builderO).setIdempotency(1);
            }
            Optional optional = ypqVar.i;
            if (optional.isPresent()) {
                optionalOf = optional;
            }
        }
        if (this.k.m(14, 45627566L) && optionalOf.isPresent()) {
            builderO.setTrafficStatsTag(((tok) optionalOf.get()).az);
        }
        return builderO;
    }
}
