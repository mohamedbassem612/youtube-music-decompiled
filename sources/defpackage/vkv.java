package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkv implements View.OnLayoutChangeListener {
    public final int a;
    public boolean b = true;
    public EditText c;
    public View d;
    public View e;
    public View f;

    public vkv(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_continue_button_height) + ((context.getResources().getDimensionPixelSize(R.dimen.reel_edit_continue_button_margin_bottom) - context.getResources().getDimensionPixelSize(R.dimen.text_color_picker_height)) << 1);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 == i6 && i4 == i8) {
            return;
        }
        this.d.post(new vlj(this, 1));
    }
}
