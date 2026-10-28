package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ju extends AppCompatImageView implements jy {
    final /* synthetic */ jx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(jx jxVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = jxVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new jt(this, this));
    }

    @Override // defpackage.jy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.jy
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.m();
        }
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = getPaddingLeft() - getPaddingRight();
            int i5 = (width + paddingLeft) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(i5 - iMax, paddingTop - iMax, i5 + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
