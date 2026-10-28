package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aezy extends aezu {
    public final aezw a;
    public final aezx b;
    public Drawable c;

    public aezy(Context context, aezc aezcVar, aezw aezwVar, aezx aezxVar) {
        super(context, aezcVar);
        this.a = aezwVar;
        this.b = aezxVar;
        aezxVar.j = this;
    }

    private final boolean a() {
        return this.p != null && aext.a(this.i.getContentResolver()) == 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        List list;
        Drawable drawable;
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(this.o)) {
            return;
        }
        int i2 = 0;
        if (a() && (drawable = this.c) != null) {
            drawable.setBounds(getBounds());
            this.c.setTint(this.j.e[0]);
            this.c.draw(canvas);
            return;
        }
        canvas.save();
        aezw aezwVar = this.a;
        aezwVar.h(canvas, getBounds(), f(), k(), j());
        aezc aezcVar = this.j;
        int i3 = aezcVar.i;
        int i4 = this.n;
        boolean z2 = (aezcVar instanceof afah) || ((aezcVar instanceof aezo) && ((aezo) aezcVar).u);
        if (!z2 || i3 != 0) {
            z = false;
        } else if (aezcVar.c(false)) {
            i3 = 0;
            z = false;
        } else {
            i3 = 0;
            z = true;
        }
        if (z) {
            aezwVar.f(canvas, this.m, 0.0f, 1.0f, aezcVar.f, i4, 0);
        } else {
            if (z2) {
                List list2 = this.b.k;
                aezv aezvVar = (aezv) list2.get(0);
                aezv aezvVar2 = (aezv) list2.get(list2.size() - 1);
                if (aezwVar instanceof aezz) {
                    Paint paint = this.m;
                    i = i3;
                    aezwVar.f(canvas, paint, 0.0f, aezvVar.a, aezcVar.f, i4, i);
                    aezwVar.f(canvas, paint, aezvVar2.b, 1.0f, aezcVar.f, i4, i);
                } else {
                    i = i3;
                    canvas.save();
                    canvas.rotate(aezvVar2.g);
                    aezwVar.f(canvas, this.m, aezvVar2.b, 1.0f + aezvVar.a, aezcVar.f, i4, i);
                    canvas.restore();
                }
            }
            while (true) {
                list = this.b.k;
                if (i2 < list.size()) {
                    canvas.restore();
                    return;
                }
                aezv aezvVar3 = (aezv) list.get(i2);
                aezvVar3.f = g();
                Paint paint2 = this.m;
                aezwVar.e(canvas, paint2, aezvVar3, this.n);
                if (i2 <= 0 && !z && z2) {
                    aezwVar.f(canvas, paint2, ((aezv) list.get(i2 - 1)).b, aezvVar3.a, aezcVar.f, i4, i);
                }
                i2++;
            }
        }
        i = i3;
        while (true) {
            list = this.b.k;
            if (i2 < list.size()) {
                canvas.restore();
                return;
            }
            aezv aezvVar4 = (aezv) list.get(i2);
            aezvVar4.f = g();
            Paint paint3 = this.m;
            aezwVar.e(canvas, paint3, aezvVar4, this.n);
            if (i2 <= 0) {
            }
            i2++;
        }
    }

    @Override // defpackage.aezu
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean zE = super.e(z, z2, z3);
        if (a() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (!z || !z3) {
            return zE;
        }
        this.b.f();
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.aezu, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
