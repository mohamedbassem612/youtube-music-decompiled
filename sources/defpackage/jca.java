package defpackage;

import android.text.TextUtils;
import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jca implements adma {
    protected final hpy a;
    protected String b;
    private final avmb c;
    private final avmm d = new avmm();

    public jca(hpy hpyVar, avmb avmbVar) {
        this.a = hpyVar;
        this.c = avmbVar;
    }

    @Override // defpackage.adma
    public final View a() {
        throw new UnsupportedOperationException("OfflineVideoSnapshotPresenter.getView() should not be called.");
    }

    @Override // defpackage.adma
    public void b(admh admhVar) {
        f();
        this.b = null;
        this.d.b();
    }

    public abstract Optional d(Object obj);

    public abstract void e(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5);

    public abstract void f();

    @Override // defpackage.adma
    public void hU(adly adlyVar, Object obj) {
        avmm avmmVar = this.d;
        avmmVar.b();
        Optional optionalD = d(obj);
        if (optionalD.isEmpty() || TextUtils.isEmpty((CharSequence) optionalD.get())) {
            f();
            return;
        }
        this.b = (String) optionalD.get();
        hpy hpyVar = this.a;
        avmmVar.c(avlr.i(agke.u(hpyVar.e(kro.aq()), hpyVar.e(kro.aI(this.b)), hpyVar.e(kro.aJ(this.b)), hpyVar.e(kro.av(this.b)), hpyVar.e(kro.aw(this.b))), new hpr(16)).O(this.c).af(new iwb(this, 10)));
    }
}
