package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ezx implements euc {
    @Override // defpackage.euc
    public final ewf b(Context context, ewf ewfVar, int i, int i2) {
        if (!ffs.i(i, i2)) {
            throw new IllegalArgumentException(a.cj(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        ewn ewnVar = erj.b(context).a;
        Bitmap bitmap = (Bitmap) ewfVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(ewnVar, bitmap, i, i2);
        return !bitmap.equals(bitmapC) ? ezw.f(bitmapC, ewnVar) : ewfVar;
    }

    protected abstract Bitmap c(ewn ewnVar, Bitmap bitmap, int i, int i2);
}
