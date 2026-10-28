package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class afdx extends afbe {
    public static final /* synthetic */ int n = 0;
    public afdv m;

    public afdx(afdv afdvVar) {
        super(afdvVar);
        this.m = afdvVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f == this.m.w.left && f2 == this.m.w.top && f3 == this.m.w.right && f4 == this.m.w.bottom) {
            return;
        }
        this.m.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.afbe, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.m = new afdv(this.m);
        return this;
    }
}
