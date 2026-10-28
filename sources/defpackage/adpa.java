package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class adpa extends Drawable {
    public final adrf b;
    public boc c;
    public String d;
    public final Runnable e = new acqu(this, 10);

    public adpa(adrf adrfVar) {
        this.b = adrfVar;
    }

    public static final awmy a(adpa adpaVar) {
        super.invalidateSelf();
        return awmy.a;
    }

    public final void b(Function0 function0) {
        this.b.k(function0);
    }

    public final void c() {
        acoo acooVar = new acoo(this, 5);
        adrf adrfVar = this.b;
        adrfVar.k(acooVar);
        adrfVar.q = false;
        adrfVar.l();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        adqc adqcVarB = this.b.b();
        if (adqcVarB != null) {
            adqcVarB.d.draw(canvas);
        }
    }

    public final void f(Runnable runnable) {
        this.b.n = runnable != null ? new acsc(runnable, 7) : null;
    }

    public final void g(Runnable runnable) {
        adoz adozVar = runnable != null ? new adoz(runnable) : null;
        adrf adrfVar = this.b;
        adrfVar.o = adozVar;
        adqc adqcVarB = adrfVar.b();
        if (adqcVarB != null) {
            adqcVarB.g = adrfVar.e();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.b.k(new acoo(this, 6));
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        adrf adrfVar = this.b;
        adrfVar.l.set(rect);
        adqc adqcVarB = adrfVar.b();
        if (adqcVarB != null) {
            adqcVarB.c(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
