package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adzz implements View.OnLayoutChangeListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ Optional b;

    public adzz(boolean z, Optional optional) {
        this.a = z;
        this.b = optional;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i9 == i8 - i6 || i9 <= 0) {
            return;
        }
        if (this.a) {
            Optional optional = this.b;
            adzy adzyVar = new adzy(i9, 0);
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                int i10 = adzyVar.a;
                GradientDrawable gradientDrawable = (GradientDrawable) obj;
                gradientDrawable.mutate();
                gradientDrawable.setCornerRadius(i10 / 2.0f);
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
