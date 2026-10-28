package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qcf extends qbv {
    public String a;
    final Runnable b = new qca(this, 2);
    public String c;
    public boolean d;
    public boolean e;
    ahey f;
    public WebView g;
    public View h;
    public View i;
    public View j;
    public jya k;
    private Future l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private boolean t;
    private Future u;
    private qce v;

    public final void c(String str) {
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.j.setVisibility(0);
        this.g.setVisibility(true == this.e ? 4 : 8);
        ParentToolsActivity parentToolsActivity = (ParentToolsActivity) getActivity();
        if (parentToolsActivity != null) {
            if (TextUtils.isEmpty(str)) {
                parentToolsActivity.c(5, "");
            } else {
                parentToolsActivity.c(4, str);
            }
        }
    }

    public final void d() {
        Future future = this.l;
        if (future != null) {
            future.cancel(false);
            this.l = null;
        }
        this.h.setVisibility(8);
        if (this.t) {
            this.g.getSettings().setTextZoom(100);
        }
        this.g.setVisibility(0);
        ParentToolsActivity parentToolsActivity = (ParentToolsActivity) getActivity();
        if (parentToolsActivity == null || !parentToolsActivity.d) {
            return;
        }
        qbx qbxVar = parentToolsActivity.e;
        int i = parentToolsActivity.h;
        String strC = nrc.c(i);
        if (i == 0) {
            throw null;
        }
        ((qtf) qbxVar.c.io()).b(1L, strC, parentToolsActivity.f, parentToolsActivity.g.name());
    }

    public final void e() {
        if (this.e) {
            Future future = this.l;
            int i = 0;
            if (future != null) {
                future.cancel(false);
            }
            this.l = this.f.schedule(new qca(this, i), 5L, TimeUnit.SECONDS);
        }
        Uri uri = Uri.parse(this.m);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (!queryParameterNames.contains("host_name")) {
            builderBuildUpon.appendQueryParameter("host_name", this.n);
        }
        if (!queryParameterNames.contains("host_version")) {
            builderBuildUpon.appendQueryParameter("host_version", this.o);
        }
        if (!queryParameterNames.contains("theme") && !TextUtils.isEmpty(this.q)) {
            builderBuildUpon.appendQueryParameter("theme", this.q);
        }
        if (!queryParameterNames.contains("profile_id") && !TextUtils.isEmpty(this.p)) {
            builderBuildUpon.appendQueryParameter("profile_id", this.p);
        }
        if (!queryParameterNames.contains("feature")) {
            builderBuildUpon.appendQueryParameter("feature", "parent_tools");
        }
        builderBuildUpon.appendQueryParameter("return_url", this.c);
        builderBuildUpon.appendQueryParameter("hl", Locale.getDefault().toLanguageTag());
        builderBuildUpon.appendQueryParameter("override_hl", "");
        this.u = this.f.submit(new plj(this, builderBuildUpon.build().toString(), 5));
    }

    final void f(qcg qcgVar, int i) {
        ParentToolsActivity parentToolsActivity = (ParentToolsActivity) getActivity();
        if (parentToolsActivity != null) {
            aai aaiVar = new aai(qcgVar);
            aaiVar.c = parentToolsActivity.c;
            qcg qcgVarA = aaiVar.a();
            if (parentToolsActivity.b) {
                int i2 = qcgVarA.c;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 != 3 && i2 != 4) {
                    parentToolsActivity.d(nrc.b(qcgVar.c), i);
                    parentToolsActivity.finishAffinity();
                    return;
                }
            }
            Intent intent = new Intent();
            intent.putExtra("parent_tools_result", qcgVarA);
            parentToolsActivity.setResult(-1, intent);
            parentToolsActivity.d(nrc.b(qcgVar.c), i);
            parentToolsActivity.finish();
            parentToolsActivity.overridePendingTransition(R.anim.pt_slide_in_left, R.anim.pt_slide_out_right);
        }
    }

    final void g() {
        aai aaiVarA = qcg.a();
        aaiVarA.b(2);
        f(aaiVarA.a(), 3);
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        if (!(getActivity() instanceof ParentToolsActivity)) {
            Log.wtf("ParentToolsFragment", "host activity must implement ParentToolsFragmentListener");
            return;
        }
        if (arguments == null) {
            Log.e("ParentToolsFragment", "getArguments() returned null! Arguments are required.");
            ((ParentToolsActivity) getActivity()).c(1, "");
            g();
            return;
        }
        ahfi ahfiVar = new ahfi();
        ahfiVar.c("ParentToolsFragment #%d");
        this.f = MoreExecutors.b(Executors.newSingleThreadScheduledExecutor(ahfi.a(ahfiVar)));
        this.m = arguments.getString("parent_tools_url", "https://families.youtube.com");
        this.q = arguments.getString("theme", "");
        this.a = arguments.getString("parent_account_name", "");
        this.n = arguments.getString("client_name", "");
        this.o = arguments.getString("client_version", "");
        this.p = arguments.getString("child_obfuscated_gaia_id", "");
        this.c = arguments.getString("end_url", "https://www.youtube.com/closeParentTools");
        this.r = arguments.getString("tool_bar_title", "");
        this.s = arguments.getBoolean("is_blocking_modular_onboarding_flow", false);
        this.d = arguments.getBoolean("is_enhanced_web_view_loading_enabled", false);
        this.t = arguments.getBoolean("disable_webview_text_zoom", false);
        this.e = arguments.getBoolean("is_family_center_theme_support_enabled", false);
        if (TextUtils.isEmpty(this.n) || TextUtils.isEmpty(this.o)) {
            Log.e("ParentToolsFragment", "Close parent tools because either client name or client version is not set");
            ((ParentToolsActivity) getActivity()).c(1, "");
            g();
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.parent_tools_fragment, viewGroup, false);
        this.h = viewInflate.findViewById(R.id.control_container);
        this.i = viewInflate.findViewById(R.id.loading_spinner_container);
        this.j = viewInflate.findViewById(R.id.error_page_container);
        this.g = (WebView) viewInflate.findViewById(R.id.web_view);
        if (Objects.equals(this.q, "dark")) {
            this.g.setBackgroundColor(viewInflate.getContext().getColor(R.color.parent_tools_static_dark_background));
        } else if (this.e) {
            this.g.setBackgroundColor(0);
        }
        qce qceVar = new qce(this);
        this.v = qceVar;
        this.g.setWebViewClient(qceVar);
        this.g.setWebChromeClient(new qcd(this));
        if (this.e) {
            this.g.addJavascriptInterface(new qcb(this), "ParentToolsBridge");
        }
        WebSettings settings = this.g.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        ehd.e(getContext().getResources().openRawResource(R.raw.loading_spinner_grey), "2131951704").d(new opx((ImageView) viewInflate.findViewById(R.id.loading_spinner_lottie_holder), 2));
        viewInflate.findViewById(R.id.error_button).setOnClickListener(new jjc(this, 16));
        Toolbar toolbar = (Toolbar) viewInflate.findViewById(R.id.toolbar);
        toolbar.requestFocus();
        if (TextUtils.isEmpty(this.r)) {
            toolbar.setVisibility(8);
        } else {
            toolbar.v(this.r);
            toolbar.setContentDescription(this.r);
            if (this.s) {
                toolbar.r(null);
            } else {
                toolbar.q(R.drawable.quantum_gm_ic_arrow_back_gm_grey_24);
                toolbar.p(getString(R.string.accessibility_parent_tools_toolbar_back));
                toolbar.s(new jjc(this, 17));
            }
        }
        e();
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        Future future = this.l;
        if (future != null) {
            future.cancel(false);
            this.l = null;
        }
        Future future2 = this.u;
        if (future2 != null) {
            future2.cancel(false);
            this.u = null;
        }
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        bcs bcsVar = new bcs(view, 7);
        int i = bac.a;
        azs.c(view, bcsVar);
    }
}
