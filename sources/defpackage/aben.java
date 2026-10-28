package defpackage;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aben extends abeo {
    final /* synthetic */ abes a;
    private final aqmg b;

    public aben(abes abesVar, aqmg aqmgVar) {
        this.a = abesVar;
        this.b = aqmgVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        abel abelVar = this.a.u;
        Bitmap bitmap = (Bitmap) obj2;
        aqmg aqmgVar = this.b;
        int i = aqmgVar.d;
        int i2 = aqmgVar.e;
        DisplayMetrics displayMetrics = abelVar.getResources().getDisplayMetrics();
        int iApplyDimension = (int) TypedValue.applyDimension(1, i, displayMetrics);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, i2, displayMetrics);
        ImageView imageView = abelVar.c;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iApplyDimension;
            layoutParams.height = iApplyDimension2;
        }
        imageView.setImageBitmap(bitmap);
    }
}
