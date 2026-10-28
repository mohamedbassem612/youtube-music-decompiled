package defpackage;

import android.animation.IntEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hxk implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        IntEvaluator intEvaluator = new IntEvaluator();
        return new Rect(intEvaluator.evaluate(f, Integer.valueOf(rect.left), Integer.valueOf(rect2.left)).intValue(), intEvaluator.evaluate(f, Integer.valueOf(rect.top), Integer.valueOf(rect2.top)).intValue(), intEvaluator.evaluate(f, Integer.valueOf(rect.right), Integer.valueOf(rect2.right)).intValue(), intEvaluator.evaluate(f, Integer.valueOf(rect.bottom), Integer.valueOf(rect2.bottom)).intValue());
    }
}
