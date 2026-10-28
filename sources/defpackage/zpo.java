package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zpo extends tud {
    final /* synthetic */ zpr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpo(zpr zprVar, String str) {
        super(str);
        this.a = zprVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        zpr zprVar = this.a;
        zprVar.j = zpr.b(zprVar.c);
        BottomSheetBehavior bottomSheetBehavior = zprVar.e;
        if (bottomSheetBehavior == null || bottomSheetBehavior.F != 4) {
            return;
        }
        zpt zptVar = zprVar.n;
        if (zptVar.e() == 2 || (zprVar.g && zptVar.e() != 1)) {
            zprVar.h();
        } else {
            zprVar.i();
        }
    }
}
