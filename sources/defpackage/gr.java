package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class gr extends qg implements fy {
    private ga a;
    private final ayl b;

    public gr(Context context, int i) {
        super(context, a(context, i));
        this.b = new ayl() { // from class: gq
            @Override // defpackage.ayl
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.a.d(keyEvent);
            }
        };
        ga gaVarC = c();
        ((gp) gaVarC).C = a(context, i);
        gaVarC.z();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.qg, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        c().i(view, layoutParams);
    }

    public final ga c() {
        if (this.a == null) {
            int i = ga.b;
            this.a = new gp(getContext(), getWindow(), this, this);
        }
        return this.a;
    }

    final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        c().l();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return aym.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        c().y(1);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return c().h(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().k();
    }

    @Override // defpackage.qg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        c().j();
        super.onCreate(bundle);
        c().z();
    }

    @Override // defpackage.qg, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        c().o();
    }

    @Override // defpackage.fy
    public final hv onWindowStartingSupportActionMode(hu huVar) {
        return null;
    }

    @Override // defpackage.qg, android.app.Dialog
    public void setContentView(int i) {
        f();
        c().q(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        c().w(getContext().getString(i));
    }

    @Override // defpackage.qg, android.app.Dialog
    public void setContentView(View view) {
        f();
        c().r(view);
    }

    @Override // defpackage.qg, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        c().s(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().w(charSequence);
    }

    @Override // defpackage.fy
    public final void onSupportActionModeFinished(hv hvVar) {
    }

    @Override // defpackage.fy
    public final void onSupportActionModeStarted(hv hvVar) {
    }
}
