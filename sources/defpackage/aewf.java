package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aewf {
    public final MaterialButton a;
    public afbj b;
    public blg c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public boolean p;
    public RippleDrawable r;
    public int s;
    public avgj t;
    public boolean o = false;
    public boolean q = true;

    public aewf(MaterialButton materialButton, afbj afbjVar) {
        this.a = materialButton;
        this.b = afbjVar;
    }

    public final afbe a(boolean z) {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (afbe) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b() {
        this.o = true;
        MaterialButton materialButton = this.a;
        materialButton.e(this.k);
        materialButton.f(this.j);
    }

    public final void c(afbj afbjVar) {
        this.b = afbjVar;
        d();
    }

    public final void d() {
        afbe afbeVarA = a(false);
        if (afbeVarA != null) {
            afbeVarA.s(this.b);
            blg blgVar = this.c;
            if (blgVar != null) {
                afbeVarA.o(blgVar);
            }
        }
        afbe afbeVarA2 = a(true);
        if (afbeVarA2 != null) {
            afbeVarA2.s(this.b);
            blg blgVar2 = this.c;
            if (blgVar2 != null) {
                afbeVarA2.o(blgVar2);
            }
        }
        RippleDrawable rippleDrawable = this.r;
        afbv afbvVar = null;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            if (objFindDrawableByLayerId instanceof afbv) {
                afbvVar = (afbv) objFindDrawableByLayerId;
            }
        }
        if (afbvVar != null) {
            if (!(afbvVar instanceof afbe)) {
                afbvVar.d(this.b.a());
                return;
            }
            afbe afbeVar = (afbe) afbvVar;
            afbeVar.s(this.b);
            blg blgVar3 = this.c;
            if (blgVar3 != null) {
                afbeVar.o(blgVar3);
            }
        }
    }

    public final void e(avgj avgjVar) {
        this.t = avgjVar;
        afbe afbeVarA = a(false);
        if (afbeVarA != null) {
            afbeVarA.k = avgjVar;
        }
    }
}
