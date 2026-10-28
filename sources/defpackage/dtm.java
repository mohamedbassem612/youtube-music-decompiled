package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dtm extends Drawable.ConstantState {
    int a;
    dtl b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public dtm(dtm dtmVar) {
        this.c = null;
        this.d = dto.a;
        if (dtmVar != null) {
            this.a = dtmVar.a;
            this.b = new dtl(dtmVar.b);
            Paint paint = dtmVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = dtmVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = dtmVar.c;
            this.d = dtmVar.d;
            this.e = dtmVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        dtl dtlVar = this.b;
        dtlVar.a(dtlVar.d, dtl.a, canvas, i, i2);
    }

    public final boolean b() {
        dtl dtlVar = this.b;
        if (dtlVar.k == null) {
            dtlVar.k = Boolean.valueOf(dtlVar.d.b());
        }
        return dtlVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new dto(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new dto(this);
    }

    public dtm() {
        this.c = null;
        this.d = dto.a;
        this.b = new dtl();
    }
}
