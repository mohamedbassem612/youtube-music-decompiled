package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adxc implements adlz {
    private final int a;

    public adxc(int i) {
        this.a = i;
    }

    public static Optional b(adly adlyVar) {
        Object objC = adlyVar.c("roundedCornersResId");
        return objC instanceof Integer ? Optional.of((Integer) objC) : Optional.empty();
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        adlyVar.f("roundedCornersResId", Integer.valueOf(this.a));
    }
}
