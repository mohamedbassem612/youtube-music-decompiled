package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyg extends wzy {
    @Override // defpackage.wzy
    protected final int d() {
        return R.layout.live_chat_overlay_paid_message;
    }

    @Override // defpackage.wzy
    protected final int e() {
        return R.drawable.live_chat_overlay_paid_message_full_background;
    }

    @Override // defpackage.wzy
    protected final int f() {
        return R.drawable.live_chat_overlay_paid_message_top_background;
    }

    @Override // defpackage.wzy
    protected final ViewGroup.MarginLayoutParams g() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // defpackage.wzy
    /* JADX INFO: renamed from: h */
    public final void hU(adly adlyVar, ampq ampqVar) {
        super.hU(adlyVar, ampqVar);
        Resources resources = this.c.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_paid_message_avatar_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_paid_message_bottom_bar_horizontal_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_avatar_margin);
        if (this.i.getVisibility() == 0) {
            TextView textView = this.j;
            textView.setPaddingRelative(0, 0, textView.getPaddingEnd(), 0);
            TextView textView2 = this.l;
            textView2.setPaddingRelative(dimensionPixelSize + dimensionPixelOffset + dimensionPixelOffset2, 0, textView2.getPaddingEnd(), 0);
            return;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_amount_vertical_padding_when_moderated);
        TextView textView3 = this.j;
        int i = dimensionPixelSize / 2;
        textView3.setPaddingRelative(i, dimensionPixelOffset3, textView3.getPaddingEnd(), dimensionPixelOffset3);
        TextView textView4 = this.l;
        textView4.setPaddingRelative(i - dimensionPixelOffset, 0, textView4.getPaddingEnd(), 0);
    }

    @Override // defpackage.wzy, defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        hU(adlyVar, (ampq) obj);
    }
}
