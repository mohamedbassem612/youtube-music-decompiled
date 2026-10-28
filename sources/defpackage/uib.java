package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class uib implements uih, acwn {
    private final uii a;
    private final dd b;
    private final Optional c;

    public uib(Context context, dd ddVar, boolean z, boolean z2) {
        Optional optionalEmpty = Optional.empty();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ReelsBottomSheetDialogRoundCorners", z);
        bundle.putBoolean("ReelsBottomSheetDialogTopViewKey", false);
        bundle.putBoolean("ReelsBottomSheetDialoginitExpandedKey", false);
        bundle.putBoolean("ReelsBottomSheetDialogDraggableKey", true);
        bundle.putBoolean("ReelsBottomSheetDialogFitToScreenKey", false);
        uii uijVar = z2 ? new uij() : new uii();
        this.a = uijVar;
        uijVar.setArguments(bundle);
        uijVar.s = context;
        uijVar.r = this;
        this.b = ddVar;
        this.c = optionalEmpty;
    }

    @Override // defpackage.acwn
    public final void a() {
        if (this.a.isVisible()) {
            d();
        }
    }

    protected abstract View b();

    protected abstract String c();

    public void d() {
        this.a.dismiss();
    }

    public void e() {
        uii uiiVar = this.a;
        if (uiiVar.isAdded()) {
            return;
        }
        uiiVar.t = c();
        if (uiiVar.q) {
            uiiVar.m();
        }
        uiiVar.u = b();
        if (uiiVar.q) {
            uiiVar.i();
        }
        boolean zG = g();
        uiiVar.v = Boolean.valueOf(zG);
        if (uiiVar.q) {
            uiiVar.k(zG);
        }
        dd ddVar = this.b;
        StringBuilder sb = new StringBuilder("ReelsBottomSheetDialog_");
        CharSequence charSequence = uiiVar.t;
        if (charSequence != null) {
            sb.append(charSequence.toString().replace(" ", ""));
        } else {
            sb.append("NoTitleSet");
        }
        uiiVar.h(ddVar, "ReelsBottomSheetDialog_".concat(sb.toString()));
        afxw.C(uiiVar);
        if (uiiVar.f != null) {
            uiiVar.iR(true);
            uiiVar.w = f();
            uiiVar.f.setCanceledOnTouchOutside(true);
        }
        Dialog dialog = uiiVar.f;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        uiiVar.f.getWindow().clearFlags(8);
    }

    protected boolean f() {
        return true;
    }

    protected boolean g() {
        return true;
    }

    @Override // defpackage.uih
    public final void h() {
        this.c.isPresent();
    }

    @Override // defpackage.uih
    public final void j() {
        this.c.isPresent();
    }

    @Override // defpackage.uih
    public boolean k() {
        return false;
    }

    @Override // defpackage.uih
    public final void i() {
    }
}
