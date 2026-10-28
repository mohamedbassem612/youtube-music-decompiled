package com.google.android.apps.youtube.music.voice.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import defpackage.jlp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class BitmapSoundLevelsView extends View {
    public int a;
    private final Paint b;
    private final int c;
    private int d;
    private Bitmap e;
    private Bitmap f;
    private final Rect g;
    private final Matrix h;
    private jlp i;

    public BitmapSoundLevelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.b = paint;
        this.h = new Matrix();
        this.i = new jlp(this);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.voice_input_sound_level_circle);
        this.e = bitmapDecodeResource;
        this.c = bitmapDecodeResource == null ? 0 : bitmapDecodeResource.getWidth();
        this.g = new Rect();
        paint.setFilterBitmap(true);
        paint.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.ytm_color_white), PorterDuff.Mode.SRC_IN));
        setEnabled(false);
    }

    private final synchronized void a() {
        jlp jlpVar = this.i;
        jlpVar.a = true;
        jlpVar.sendEmptyMessage(0);
    }

    private final synchronized void b() {
        jlp jlpVar = this.i;
        jlpVar.a = false;
        jlpVar.removeMessages(0);
    }

    private final void c() {
        if (isEnabled()) {
            a();
        } else {
            b();
        }
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isEnabled()) {
            int i = this.a;
            int i2 = this.d;
            if (i > i2) {
                this.d = i2 + ((i - i2) / 4);
            } else {
                this.d = (int) (i2 * 0.95f);
            }
            if (this.e != null) {
                int width = getWidth();
                int i3 = this.c;
                int i4 = (((width - i3) * this.d) / 100) + i3;
                int width2 = getWidth() - i4;
                Bitmap bitmap = this.e;
                Bitmap bitmap2 = this.f;
                int i5 = width2 / 2;
                if (i5 == 0) {
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, this.h, null);
                        return;
                    }
                    i5 = 0;
                }
                Rect rect = this.g;
                int i6 = i4 + i5;
                rect.set(i5, i5, i6, i6);
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.b);
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        Bitmap bitmap;
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0 || (bitmap = this.e) == null) {
            return;
        }
        this.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            c();
        } else {
            b();
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (z != isEnabled()) {
            super.setEnabled(z);
            c();
        }
    }

    public BitmapSoundLevelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BitmapSoundLevelsView(Context context) {
        this(context, null);
    }
}
