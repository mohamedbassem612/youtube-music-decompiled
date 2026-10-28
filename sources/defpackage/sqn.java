package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sqn {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/ads/ui/aboutthisad/AboutThisAdWebViewListenerImpl");
    public sgs a;
    private boolean c = false;
    private final aipr d;
    private final tbt e;
    private final Executor f;
    private final abvk g;
    private final Optional h;
    private final boolean i;

    public sqn(sqm sqmVar, sgs sgsVar, tbt tbtVar, Executor executor, abvk abvkVar) {
        this.a = sgsVar;
        this.d = sqmVar.a;
        this.e = tbtVar;
        this.f = executor;
        this.h = sqmVar.c;
        this.g = abvkVar;
        this.i = sqmVar.b;
    }

    public final void a(aipp aippVar) {
        for (aipq aipqVar : new aihx(aippVar.c, aipp.a)) {
            int iOrdinal = aipqVar.ordinal();
            if (iOrdinal == 0) {
                ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/ads/ui/aboutthisad/AboutThisAdWebViewListenerImpl", "handleMessageFromWeb", 92, "AboutThisAdWebViewListenerImpl.java")).w("Unknown callback value received from ATA %s", aipqVar.name());
            } else {
                if (iOrdinal == 1) {
                    if (this.c) {
                        int i = this.d.c;
                        int iAV = a.aV(i);
                        if (iAV == 0 || iAV != 3) {
                            int iAV2 = a.aV(i);
                            if (iAV2 != 0 && iAV2 == 2) {
                                if (this.a == null) {
                                    zvp.a(zvn.a, zvm.a, "Tried to skip ad, but ad skip callback is NULL for AboutThisAd");
                                    return;
                                } else {
                                    this.f.execute(afwl.i(new rxn(this, 10)));
                                    this.c = false;
                                }
                            }
                        } else {
                            Optional optional = this.h;
                            if (optional.isEmpty()) {
                                zvp.a(zvn.a, zvm.a, "Tried to hide ad, but enclosing event is NULL for AboutThisAd");
                                return;
                            }
                            this.e.c(optional.get());
                        }
                    }
                    if (this.i) {
                        return;
                    }
                    Executor executor = this.f;
                    abvk abvkVar = this.g;
                    abvkVar.getClass();
                    executor.execute(new rxn(abvkVar, 11));
                    return;
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.c = true;
                }
            }
        }
    }
}
