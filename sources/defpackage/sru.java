package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sru {
    public final Context a;
    public aevy b;
    public asmv c;
    public xgn d;
    public alhq e;
    public String f;
    public boolean g;
    public boolean h;
    public final vxz i;

    public sru(Context context, vxz vxzVar) {
        this.a = context;
        this.i = vxzVar;
    }

    public static final boolean c(aevy aevyVar) {
        Dialog dialog;
        if (aevyVar == null || (dialog = aevyVar.f) == null || dialog.getWindow() == null || !aevyVar.isAdded() || aevyVar.isRemoving()) {
            return false;
        }
        aevyVar.getParentFragmentManager();
        return (aevyVar.getParentFragmentManager().ad() || !aevyVar.getLifecycle().a().a(bob.c) || aevyVar.getLifecycle().a() == bob.a) ? false : true;
    }

    public final void a() {
        aevy aevyVar = this.b;
        if (aevyVar != null) {
            this.b = null;
            if (tuk.p(this.a) && c(aevyVar)) {
                aevyVar.iN();
            }
        }
    }

    public final void b(asmv asmvVar, xgn xgnVar, alhq alhqVar, String str, boolean z, boolean z2) {
        this.c = asmvVar;
        this.d = xgnVar;
        this.e = alhqVar;
        this.f = str;
        this.g = z;
        this.h = z2;
        dd supportFragmentManager = ((cf) this.a).getSupportFragmentManager();
        cc ccVarG = supportFragmentManager.g("composer_fragment");
        if (ccVarG != null) {
            ((aevy) ccVarG).dismiss();
        }
        asmvVar.getClass();
        ste steVar = new ste();
        Bundle bundle = new Bundle();
        ahng.aG(bundle, "element", asmvVar);
        if (alhqVar != null) {
            ahng.aG(bundle, "hintRenderer", alhqVar);
        }
        if (str != null) {
            bundle.putString("hintLabel", str);
        }
        bundle.putBoolean("enableTransparentBackground", z);
        bundle.putBoolean("animateWithKeyboard", z2);
        steVar.setArguments(bundle);
        steVar.n = xgnVar;
        this.b = steVar;
        if (steVar.isAdded() || this.b.isStateSaved()) {
            return;
        }
        this.b.h(supportFragmentManager, "composer_fragment");
    }
}
