package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jbh implements adma {
    private final Context a;
    private final FrameLayout b;
    private adma c;
    private adma d;
    private adma e;

    public jbh(Context context) {
        context.getClass();
        this.a = context;
        this.b = new FrameLayout(context);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        adma admaVar = this.c;
        if (admaVar != null) {
            admaVar.b(admhVar);
        }
        adma admaVar2 = this.d;
        if (admaVar2 != null) {
            admaVar2.b(admhVar);
        }
    }

    protected abstract adma d();

    @Override // defpackage.adma
    public final void hU(adly adlyVar, Object obj) {
        adma admaVarD;
        FrameLayout frameLayout = this.b;
        frameLayout.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation == 2) {
            admaVarD = this.c;
            if (admaVarD == null) {
                admaVarD = d();
                this.c = admaVarD;
            }
            this.e = admaVarD;
        } else {
            admaVarD = this.d;
            if (admaVarD == null) {
                admaVarD = d();
                this.d = admaVarD;
            }
            this.e = admaVarD;
        }
        admaVarD.hU(adlyVar, obj);
        frameLayout.addView(((jev) admaVarD).a);
    }
}
