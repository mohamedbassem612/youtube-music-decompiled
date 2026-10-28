package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class it extends axy implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int b = 0;
    public final ActionProvider a;
    private hhb e;

    public it(Context context, ActionProvider actionProvider) {
        super(context);
        this.a = actionProvider;
    }

    @Override // defpackage.axy
    public final View a() {
        return this.a.onCreateActionView();
    }

    @Override // defpackage.axy
    public final View b(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.axy
    public final void c(SubMenu subMenu) {
        this.a.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.axy
    public final boolean d() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.axy
    public final boolean e() {
        return this.a.isVisible();
    }

    @Override // defpackage.axy
    public final boolean f() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.axy
    public final boolean g() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.axy
    public final void h(hhb hhbVar) {
        this.e = hhbVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        hhb hhbVar = this.e;
        if (hhbVar != null) {
            hhbVar.G();
        }
    }
}
