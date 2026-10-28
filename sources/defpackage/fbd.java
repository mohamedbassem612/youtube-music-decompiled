package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbd implements ewf, ewc {
    private final Resources a;
    private final ewf b;

    public fbd(Resources resources, ewf ewfVar) {
        if (resources == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.a = resources;
        this.b = ewfVar;
    }

    public static ewf f(Resources resources, ewf ewfVar) {
        if (ewfVar == null) {
            return null;
        }
        return new fbd(resources, ewfVar);
    }

    @Override // defpackage.ewf
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ewf
    public final Class b() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.ewf
    public final /* bridge */ /* synthetic */ Object c() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.c());
    }

    @Override // defpackage.ewc
    public final void d() {
        ewf ewfVar = this.b;
        if (ewfVar instanceof ewc) {
            ((ewc) ewfVar).d();
        }
    }

    @Override // defpackage.ewf
    public final void e() {
        this.b.e();
    }
}
