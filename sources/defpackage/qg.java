package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class qg extends Dialog implements bog, qw, dow {
    private final awmi c;
    private final awmi d;
    private boh yX;
    private final dov yY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(Context context, int i) {
        super(context, i);
        context.getClass();
        this.yY = api.h(this);
        this.c = new awmp(new qf(this, 1));
        this.d = new awmp(new qf(this, 0));
    }

    public static final void g(qg qgVar) {
        super.onBackPressed();
    }

    private final boh jp() {
        boh bohVar = this.yX;
        if (bohVar != null) {
            return bohVar;
        }
        boh bohVar2 = new boh(this);
        this.yX = bohVar2;
        return bohVar2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.addContentView(view, layoutParams);
    }

    public final void f() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        bou.d(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        api.g(decorView3, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        return jp();
    }

    @Override // defpackage.qw
    public final qv getOnBackPressedDispatcher() {
        return (qv) this.d.a();
    }

    @Override // defpackage.dow
    public final dou getSavedStateRegistry() {
        return this.yY.a();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((djj) this.c.a()).b();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            qv onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.e(onBackInvokedDispatcher);
        }
        this.yY.c(bundle);
        jp().e(boa.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.yY.d(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        jp().e(boa.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        jp().e(boa.ON_DESTROY);
        this.yX = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.setContentView(view, layoutParams);
    }
}
