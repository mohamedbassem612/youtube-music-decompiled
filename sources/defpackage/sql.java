package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sql extends sqo {
    private static final agrf r = agrf.h("com/google/android/libraries/youtube/ads/ui/aboutthisad/AboutThisAdWebViewDialogFragment");
    public xgn k;
    public WebView l;
    public Executor m;
    public Executor n;
    public zwb o;
    public sqn p;
    public omj q;
    private aipt s;

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(0, R.style.AboutThisAdWebViewDialog_FullScreen);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        try {
            this.s = (aipt) aihn.parseFrom(aipt.a, getArguments().getByteArray("about_this_ad_renderer"), ExtensionRegistryLite.getGeneratedRegistry());
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.about_this_ad_webview_layout, viewGroup, false);
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewGroup2.findViewById(R.id.web_view_loading_layout);
            this.l = (WebView) viewGroup2.findViewById(R.id.webview);
            loadingFrameLayout.g(0);
            loadingFrameLayout.c();
            this.l.setWebViewClient(new sqi(this.s, this.k, loadingFrameLayout));
            this.l.setScrollBarStyle(33554432);
            this.l.setScrollbarFadingEnabled(false);
            this.l.getSettings().setJavaScriptEnabled(true);
            this.l.getSettings().setAllowFileAccess(false);
            this.l.getSettings().setAllowContentAccess(false);
            this.l.addJavascriptInterface(this, "aboutthisad");
            agya agyaVar = this.s.b;
            if (agyaVar == null) {
                agyaVar = agya.a;
            }
            String str = agvp.f(agyaVar).a;
            avmc.s(new qoh(this, 17)).x(agdf.a).h(new sqj(0)).r(new rtq(10)).r(new ibj(str, 18)).o(new ibj(this, 19)).B(str).C(new sqk(this, 0));
            return viewGroup2;
        } catch (aiik e) {
            ((agrc) ((agrc) ((agrc) r.b()).j(e)).k("com/google/android/libraries/youtube/ads/ui/aboutthisad/AboutThisAdWebViewDialogFragment", "onCreateView", (char) 194, "AboutThisAdWebViewDialogFragment.java")).t("Failed to deserialize the ATA Renderer.");
            return null;
        }
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        sqn sqnVar = this.p;
        if (sqnVar == null) {
            zvp.a(zvn.b, zvm.a, "ATA listener is null for AboutThisAdWebViewDialogFragment.");
        } else {
            aihf aihfVarCreateBuilder = aipp.b.createBuilder();
            aipq aipqVar = aipq.CLOSE;
            aihfVarCreateBuilder.copyOnWrite();
            aipp aippVar = (aipp) aihfVarCreateBuilder.instance;
            aihv aihvVar = aippVar.c;
            if (!aihvVar.c()) {
                aippVar.c = aihn.mutableCopy(aihvVar);
            }
            aippVar.c.h(aipqVar.e);
            sqnVar.a((aipp) aihfVarCreateBuilder.build());
        }
        super.onDismiss(dialogInterface);
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        if (str == null) {
            ((agrc) ((agrc) r.c()).k("com/google/android/libraries/youtube/ads/ui/aboutthisad/AboutThisAdWebViewDialogFragment", "postMessage", 267, "AboutThisAdWebViewDialogFragment.java")).t("Received no postMessage data from the ATA page.");
            return;
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        try {
            aipp aippVar = (aipp) aihn.parseFrom(aipp.b, bArrDecode, ExtensionRegistryLite.getGeneratedRegistry());
            sqn sqnVar = this.p;
            if (sqnVar == null) {
                zvp.a(zvn.b, zvm.a, "ATA listener is null for AboutThisAdWebViewDialogFragment.");
            } else {
                sqnVar.a(aippVar);
            }
            if (new aihx(aippVar.c, aipp.a).contains(aipq.CLOSE)) {
                xgn xgnVar = this.k;
                if (xgnVar != null) {
                    xgnVar.p(new xgj(this.s.c, (amud) null), null);
                } else {
                    zvp.a(zvn.b, zvm.a, "Interaction logger is null for AboutThisAdWebViewDialogFragment.");
                }
                super.iQ(false, false, false);
            }
        } catch (aiik e) {
            ((agrc) ((agrc) r.b()).k("com/google/android/libraries/youtube/ads/ui/aboutthisad/AboutThisAdWebViewDialogFragment", "postMessage", 297, "AboutThisAdWebViewDialogFragment.java")).B("Unable to parse protocol buffer: %s\nMessage: %s", e, str);
        }
    }
}
