package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ftn extends fkx {

    @fmt(a = 0)
    @fmu(a = fmv.a)
    float a;

    private ftn() {
        super("SolidColor");
        this.a = -1.0f;
    }

    public static ftm aE(fhd fhdVar) {
        return new ftm(fhdVar, new ftn());
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        float f = this.a;
        int iF = f >= 0.0f ? avv.f(0, (int) (Math.min(1.0f, f) * 255.0f)) : 0;
        frd frdVar = new frd(fhdVar, new fre());
        fre freVar = frdVar.a;
        freVar.b = ImageView.ScaleType.FIT_XY;
        freVar.a = new ColorDrawable(iF);
        frdVar.d.set(0);
        return frdVar.a();
    }
}
