package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class adya extends qnw {
    @Override // defpackage.qnw, defpackage.bp, defpackage.cc
    public void onStart() {
        int i;
        int i2;
        super.onStart();
        Window window = this.f.getWindow();
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        int i3 = twm.i(context);
        if (!twm.u(context)) {
            if (twm.v(context)) {
                i2 = dimension << 1;
            } else {
                i = -1;
            }
            window.setLayout(i, -2);
            this.f.getWindow().setBackgroundDrawable(new ColorDrawable(tzk.i(getContext(), com.google.android.apps.youtube.music.R.attr.ytRaisedBackground)));
        }
        i2 = dimension << 2;
        i = i3 - i2;
        window.setLayout(i, -2);
        this.f.getWindow().setBackgroundDrawable(new ColorDrawable(tzk.i(getContext(), com.google.android.apps.youtube.music.R.attr.ytRaisedBackground)));
    }
}
