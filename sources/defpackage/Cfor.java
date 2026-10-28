package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: for, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Cfor extends fip {
    private final WeakReference a;

    public Cfor(foq foqVar) {
        super(null, -1, null);
        this.a = new WeakReference(foqVar);
    }

    @Override // defpackage.fip
    public final /* bridge */ /* synthetic */ void gK(Object obj) {
        atwg atwgVar = (atwg) obj;
        foq foqVar = (foq) this.a.get();
        if (foqVar != null) {
            int i = atwgVar.b;
            afwv afwvVar = foqVar.l;
            if (afwvVar != null) {
                boolean z = atwgVar.a;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    afwvVar.i(fpk.b);
                } else if (i2 == 2 || i2 == 3) {
                    afwvVar.i(fpk.b);
                    ((ftc) afwvVar.a).b();
                }
            }
            if (gzj.aT()) {
                foqVar.h(i);
                return;
            }
            ((fvt) foqVar.b).post(new fok(foqVar, i));
        }
    }
}
