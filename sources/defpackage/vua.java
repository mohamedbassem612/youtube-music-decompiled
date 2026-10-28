package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vua {
    public static final tut a = new vtw();
    public final Context b;
    public final vul c;
    public final vuu d;
    public final int e;
    public int f;
    public int g;
    public final axfd h;
    private final awku i;
    private final vwt j;

    public vua(Context context, vul vulVar, vwt vwtVar, vuu vuuVar, axfd axfdVar) {
        this.b = context;
        this.e = context.getResources().getInteger(R.integer.config_shortAnimTime);
        this.c = vulVar;
        this.j = vwtVar;
        this.d = vuuVar;
        this.h = axfdVar;
        awku awkuVar = new awku(Boolean.FALSE);
        this.i = awkuVar;
        awkuVar.E().p().S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [axso, java.lang.Object] */
    public final avlh a(int i, int i2, long j, avlh avlhVar, tut tutVar) {
        if (i == i2) {
            return avlh.w().s(new vtu(tutVar, 0)).as();
        }
        awku awkuVar = new awku();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(aedd.a);
        valueAnimatorOfInt.addUpdateListener(new pr(awkuVar, 19, null));
        valueAnimatorOfInt.addListener(new vtx(awkuVar, tutVar));
        vwt vwtVar = this.j;
        return awkuVar.ae(avlhVar, vwtVar.a, new acnc(this, 1)).v(new vpi(valueAnimatorOfInt, 13));
    }

    public final avlh b() {
        vul vulVar = this.c;
        final int iA = vulVar.a();
        return vulVar.h().H(new avnn() { // from class: vtv
            @Override // defpackage.avnn
            public final Object a(Object obj) {
                return Integer.valueOf(((Integer) obj).intValue() - iA);
            }
        });
    }
}
