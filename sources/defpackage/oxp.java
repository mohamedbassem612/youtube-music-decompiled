package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.multiplatform.elements.uibuilder.DimensionUnitConverter;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxp extends Drawable {
    private final Rect a;
    private final int b;
    private final int c;
    private Drawable d;

    private oxp(Rect rect, int i, int i2) {
        this.a = rect;
        this.b = i;
        this.c = i2;
    }

    static oxp a(int i, int i2, int i3, int i4, int i5, int i6) {
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        int iMax3 = Math.max(i3, 0);
        int iMax4 = Math.max(i4, 0);
        int iMax5 = Math.max(i5, 0);
        int iMax6 = Math.max(i6, 0);
        Rect rect = new Rect(0, 0, iMax, iMax2);
        Rect rect2 = new Rect(0, 0, iMax + iMax3 + iMax5, iMax2 + iMax4 + iMax6);
        oxp oxpVar = new oxp(rect, iMax3, iMax4);
        oxpVar.setBounds(rect2);
        return oxpVar;
    }

    public static oxp b(Resources resources, float f, int i, int i2, atjt atjtVar) {
        int i3;
        int i4;
        if (atjtVar.g == null && (Memory.peekByte(atjtVar.c + 8) & 128) == 0) {
            return a(i, i2, 0, 0, 0, 0);
        }
        if (atjtVar.g == null && (Memory.peekByte(atjtVar.c + 8) & 128) != 0) {
            atjtVar.g = new ateu(atjtVar.cp(true != atjv.a ? 40 : 112, atet.a));
        }
        ateu ateuVar = atjtVar.g == null ? ates.a : atjtVar.g;
        if (ateuVar.j == null && (Memory.peekByte(ateuVar.c + 8) & 2) != 0) {
            ateuVar.j = new atey(ateuVar.cp(true != ateu.a ? 16 : 24, atex.a));
        }
        int iA = DimensionUnitConverter.a(f, ateuVar.j == null ? atew.a : ateuVar.j);
        int iA2 = DimensionUnitConverter.a(f, ateuVar.aY());
        if (ateuVar.l == null && (Memory.peekByte(ateuVar.c + 8) & 8) != 0) {
            ateuVar.l = new atey(ateuVar.cp(true != ateu.a ? 24 : 40, atex.a));
        }
        int iA3 = DimensionUnitConverter.a(f, ateuVar.l == null ? atew.a : ateuVar.l);
        int iA4 = DimensionUnitConverter.a(f, ateuVar.aV());
        int iA5 = DimensionUnitConverter.a(f, ateuVar.aX());
        int iA6 = DimensionUnitConverter.a(f, ateuVar.aW());
        if (iA5 >= 0 || iA6 >= 0) {
            if (qnl.bs(resources)) {
                if (iA5 >= 0) {
                    iA3 = iA5;
                }
                if (iA6 >= 0) {
                    i4 = iA6;
                    i3 = iA3;
                }
            } else {
                if (iA5 >= 0) {
                    iA = iA5;
                }
                if (iA6 >= 0) {
                    i3 = iA6;
                }
                i4 = iA;
            }
            i3 = iA3;
            i4 = iA;
        } else {
            i3 = iA3;
            i4 = iA;
        }
        return a(i, i2, i4, iA2, i3, iA4);
    }

    public final void c(Drawable drawable) {
        this.d = drawable;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.b, this.c);
            drawable.setBounds(this.a);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
