package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class kr extends SeekBar {
    private final ks a;

    public kr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ox.d(this, getContext());
        ks ksVar = new ks(this);
        this.a = ksVar;
        ksVar.b(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ks ksVar = this.a;
        Drawable drawable = ksVar.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = ksVar.b;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ks ksVar = this.a;
        if (ksVar.c != null) {
            SeekBar seekBar = ksVar.b;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = ksVar.c.getIntrinsicWidth();
                int intrinsicHeight = ksVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                ksVar.c.setBounds(-i, -i2, i, i2);
                int width = (seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight();
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    ksVar.c.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public kr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public kr(Context context) {
        this(context, null);
    }
}
