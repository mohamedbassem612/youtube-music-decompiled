package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcn implements fco {
    private final ewn a;
    private final fco b;
    private final fco c;

    public fcn(ewn ewnVar, fco fcoVar, fco fcoVar2) {
        this.a = ewnVar;
        this.b = fcoVar;
        this.c = fcoVar2;
    }

    @Override // defpackage.fco
    public final ewf a(ewf ewfVar, ety etyVar) {
        Drawable drawable = (Drawable) ewfVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(ezw.f(((BitmapDrawable) drawable).getBitmap(), this.a), etyVar);
        }
        if (drawable instanceof fce) {
            return this.c.a(ewfVar, etyVar);
        }
        return null;
    }
}
