package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class viy extends View implements vjb {
    public final viv a;
    private final Paint b;
    private final viu c;
    private final int d;
    private final Optional e;

    public viy(Context context, viu viuVar, vix vixVar) {
        super(context);
        this.b = new Paint();
        this.c = viuVar;
        Resources resources = context.getResources();
        int color = resources.getColor(vixVar.d);
        int color2 = resources.getColor(vixVar.a);
        int color3 = resources.getColor(vixVar.b);
        int color4 = resources.getColor(vixVar.c);
        int color5 = resources.getColor(vixVar.e);
        Optional optionalOfNullable = vixVar.h;
        resources.getClass();
        int i = 19;
        sla slaVar = new sla(resources, i);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            optionalOfNullable = Optional.ofNullable(Integer.valueOf(((Resources) slaVar.a).getColor(((Integer) obj).intValue())));
        }
        int iIntValue = ((Integer) optionalOfNullable.orElse(0)).intValue();
        Optional optionalOfNullable2 = vixVar.i;
        sla slaVar2 = new sla(resources, i);
        if (true == optionalOfNullable2.isPresent()) {
            Object obj2 = optionalOfNullable2.get();
            optionalOfNullable2 = Optional.ofNullable(Integer.valueOf(((Resources) slaVar2.a).getColor(((Integer) obj2).intValue())));
        }
        Integer numValueOf = Integer.valueOf(color);
        int iIntValue2 = ((Integer) optionalOfNullable2.orElse(numValueOf)).intValue();
        Optional optionalOfNullable3 = vixVar.j;
        sla slaVar3 = new sla(resources, i);
        if (true == optionalOfNullable3.isPresent()) {
            Object obj3 = optionalOfNullable3.get();
            optionalOfNullable3 = Optional.ofNullable(Integer.valueOf(((Resources) slaVar3.a).getColor(((Integer) obj3).intValue())));
        }
        this.a = new viv(color2, color3, color4, color, color5, iIntValue, iIntValue2, ((Integer) optionalOfNullable3.orElse(numValueOf)).intValue());
        this.d = context.getResources().getColor(vixVar.l);
        Optional optional = vixVar.f;
        context.getResources().getClass();
        optional.isPresent();
        this.e = optional;
        optional.isPresent();
        Optional optional2 = vixVar.g;
        context.getResources().getClass();
        optional2.isPresent();
        setContentDescription(getResources().getText(vixVar.k));
        setPadding(viuVar.c, getPaddingTop(), viuVar.c, getPaddingBottom());
    }

    @Override // defpackage.vjb
    public final float a() {
        return this.c.b;
    }

    @Override // defpackage.vjb
    public final int b() {
        return this.d;
    }

    @Override // defpackage.vjb
    public final int c() {
        return this.c.a;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (canvas != null) {
            int iMin = (Math.min(getHeight(), getWidth()) - getPaddingLeft()) - getPaddingRight();
            int height = getHeight() / 2;
            int width = getWidth() / 2;
            Paint paint = this.b;
            viu viuVar = this.c;
            paint.setColor(viuVar.a);
            float f = width;
            float f2 = height;
            float f3 = iMin / 2;
            canvas.drawCircle(f, f2, f3, paint);
            paint.setColor(this.d);
            canvas.drawCircle(f, f2, f3 - viuVar.b, paint);
            this.e.isPresent();
        }
    }
}
