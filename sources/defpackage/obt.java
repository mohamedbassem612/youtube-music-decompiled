package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class obt implements ahcy {
    final /* synthetic */ obu a;

    public obt(obu obuVar) {
        this.a = obuVar;
    }

    @Override // defpackage.ahcy
    public final /* bridge */ /* synthetic */ ListenableFuture a(Object obj) {
        obq obqVar = (obq) obj;
        if (obqVar != null) {
            return ahng.n(obqVar);
        }
        obu obuVar = this.a;
        obuVar.f.j(51);
        return obuVar.a(obuVar.e);
    }
}
