package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsr extends vrk {
    private final Context d;
    private TabLayout e;
    private duc f;
    private LinearLayout g;

    public vsr(Context context) {
        this.d = context;
    }

    @Override // defpackage.vro
    public final View k() {
        Context context = this.d;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.e = (TabLayout) layoutInflaterFrom.inflate(R.layout.tab_layout_modern, (ViewGroup) null);
        this.f = (duc) layoutInflaterFrom.inflate(R.layout.engagement_panel_view_pager, (ViewGroup) null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.g = linearLayout;
        linearLayout.setOrientation(1);
        this.g.addView(this.e);
        this.g.addView(this.f);
        return this.g;
    }

    @Override // defpackage.vro
    public final agev l() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public final agev m() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public final boolean s() {
        return false;
    }

    @Override // defpackage.vro
    public final boolean t() {
        return false;
    }

    @Override // defpackage.adwm
    public final boolean v(String str, int i, Runnable runnable) {
        return false;
    }

    public vsr() {
        throw null;
    }

    @Override // defpackage.vox
    public final void b() {
    }

    @Override // defpackage.vox
    public final void c() {
    }

    @Override // defpackage.vox
    public final void d() {
    }

    @Override // defpackage.vox
    public final void f() {
    }

    @Override // defpackage.vro
    public final void hP() {
    }

    @Override // defpackage.vro
    public final void o() {
    }

    @Override // defpackage.vro
    public final void q() {
    }

    @Override // defpackage.vro
    public final void r() {
    }

    @Override // defpackage.vro
    public final void n(acjx acjxVar) {
    }
}
