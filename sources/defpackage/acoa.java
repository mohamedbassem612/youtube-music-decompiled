package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acoa implements acrm {
    final /* synthetic */ ajwo a;
    final /* synthetic */ acoi b;

    public acoa(acoi acoiVar, ajwo ajwoVar) {
        this.a = ajwoVar;
        this.b = acoiVar;
    }

    @Override // defpackage.acrm
    public final void a() {
        acoi acoiVar = this.b;
        if (acoiVar.ck.aJ()) {
            acoiVar.as.b();
        }
        ajwo ajwoVar = this.a;
        acnk acnkVar = acoiVar.k;
        if (aecm.as(ajwoVar)) {
            acnkVar.k();
        }
    }

    @Override // defpackage.acrm
    public final void b() {
        acoi acoiVar = this.b;
        ListenableFuture listenableFutureA = acoiVar.ck.aJ() ? acoiVar.as.a() : null;
        ajwo ajwoVar = this.a;
        if (listenableFutureA != null) {
            listenableFutureA.addListener(afwl.i(new acnp(this, ajwoVar, 3)), acoiVar.ar);
        } else {
            acoiVar.W(ajwoVar);
        }
    }
}
