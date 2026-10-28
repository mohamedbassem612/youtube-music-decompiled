package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aedm extends Drawable {
    private final Paint a;
    private final aedl b;
    private final boolean c;
    private final agkj d;
    private final agkj e;
    private final int f;

    public aedm(Context context, aedl aedlVar) {
        Paint paint = new Paint();
        this.a = paint;
        aedl aedlVar2 = aedl.a;
        aedl aedlVar3 = aedl.b;
        aedl aedlVar4 = aedl.c;
        this.e = agkj.l(aedlVar2, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, aedlVar3, new float[]{0.0f, 0.2f, 1.0f}, aedlVar4, new float[]{0.0f, 1.0f});
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.b = aedlVar;
        this.f = 2;
        this.c = true;
        this.d = agkj.l(aedlVar2, new int[]{context.getColor(R.color.yt_teal70), context.getColor(R.color.yt_magenta70), context.getColor(R.color.yt_magenta60), context.getColor(R.color.yt_red40)}, aedlVar3, new int[]{context.getColor(R.color.yt_magenta70), context.getColor(R.color.yt_magenta60), context.getColor(R.color.yt_red40)}, aedlVar4, new int[]{context.getColor(R.color.yt_teal70), context.getColor(R.color.yt_red40)});
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c) {
            canvas.drawRoundRect(new RectF(getBounds()), 2.131166E9f, 2.131166E9f, this.a);
        } else {
            canvas.drawRect(getBounds(), this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Setting Alpha is not supported.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        LinearGradient linearGradient;
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f;
        if (i5 == 0) {
            throw null;
        }
        float f = i3;
        float f2 = i4;
        float f3 = i;
        int i6 = i5 - 1;
        agkj agkjVar = this.d;
        if (i6 != 0) {
            aedl aedlVar = this.b;
            linearGradient = new LinearGradient(f3, f2, f, f2, (int[]) agkjVar.get(aedlVar), (float[]) this.e.get(aedlVar), Shader.TileMode.CLAMP);
        } else {
            float f4 = i2;
            aedl aedlVar2 = this.b;
            linearGradient = new LinearGradient(f3, f2, f, f4, (int[]) agkjVar.get(aedlVar2), (float[]) this.e.get(aedlVar2), Shader.TileMode.CLAMP);
        }
        this.a.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Setting Color Filter is not supported.");
    }
}
