package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aevp implements bcl {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public aevp(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.bcl
    public final boolean a(View view) {
        this.b.I(this.a);
        return true;
    }
}
