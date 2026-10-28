package defpackage;

import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class grt implements admb {
    public final Object a;
    private Optional b = Optional.empty();

    public grt(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.admb
    public final void a(adma admaVar, Object obj) {
        if (obj == this.a) {
            this.b = Optional.of(admaVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [adma, java.lang.Object] */
    public final View b() {
        View viewA;
        if (!this.b.isPresent() || (viewA = this.b.get().a()) == null) {
            return null;
        }
        return viewA;
    }
}
