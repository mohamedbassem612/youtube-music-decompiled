package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ezw implements ewf, ewc {
    private final Bitmap a;
    private final ewn b;

    public ezw(Bitmap bitmap, ewn ewnVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.a = bitmap;
        if (ewnVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.b = ewnVar;
    }

    public static ezw f(Bitmap bitmap, ewn ewnVar) {
        if (bitmap == null) {
            return null;
        }
        return new ezw(bitmap, ewnVar);
    }

    @Override // defpackage.ewf
    public final int a() {
        return ffs.a(this.a);
    }

    @Override // defpackage.ewf
    public final Class b() {
        return Bitmap.class;
    }

    @Override // defpackage.ewf
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.ewc
    public final void d() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.ewf
    public final void e() {
        this.b.d(this.a);
    }
}
