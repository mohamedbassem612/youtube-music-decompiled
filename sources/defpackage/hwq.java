package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hwq implements sxu {
    final /* synthetic */ hwc a;
    final /* synthetic */ hwr b;

    public hwq(hwr hwrVar, hwc hwcVar) {
        this.a = hwcVar;
        this.b = hwrVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        hwr hwrVar = this.b;
        if (Objects.equals((Uri) obj, hwrVar.i)) {
            hwrVar.k = true;
            hwc hwcVar = this.a;
            hwcVar.x(bitmap);
            if (hwrVar.c()) {
                hwcVar.f();
            } else {
                hwcVar.B();
            }
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
    }
}
