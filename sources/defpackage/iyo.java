package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iyo extends adsv {
    private final admu a;
    private final tbt b;

    public iyo(tbt tbtVar, anss anssVar) {
        admu admuVar = new admu();
        this.a = admuVar;
        this.b = tbtVar;
        tbtVar.f(this);
        admuVar.add(anssVar);
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.a;
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        this.a.remove(vvtVar.a);
    }

    @Override // defpackage.adsv, defpackage.twn
    public final void i() {
        this.b.l(this);
    }
}
