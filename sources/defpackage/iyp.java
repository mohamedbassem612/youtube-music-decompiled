package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iyp extends adsv {
    private final admu a;
    private final anxe b;
    private final tbt c;

    public iyp(tbt tbtVar, anxe anxeVar) {
        this.c = tbtVar;
        tbtVar.f(this);
        this.a = new admu();
        this.b = anxeVar;
        b(anxeVar);
    }

    private final void b(anxe anxeVar) {
        admu admuVar = this.a;
        ahno.O(admuVar.isEmpty());
        admuVar.add(new ixn(2, 3, false));
        admuVar.add(new ixn(4, 1, false));
        admuVar.add(anxeVar);
        admuVar.add(new ixn(4, 2, false));
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.a;
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        admu admuVar = this.a;
        if (admuVar.contains(vvtVar.a)) {
            admuVar.clear();
        }
    }

    @tcc
    public void handleShowEnclosingEvent(gsj gsjVar) {
        Object objOrElse = ((Optional) gsjVar.e).orElse(null);
        anxe anxeVar = this.b;
        if (Objects.equals(anxeVar, objOrElse) && this.a.isEmpty()) {
            b(anxeVar);
        }
    }

    @Override // defpackage.adsv, defpackage.twn
    public final void i() {
        this.c.l(this);
    }
}
