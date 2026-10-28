package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.browser.BrowserActivity;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gry extends grz {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/browser/BrowserActivityPeer");
    public final BrowserActivity b;
    public final inu c;
    public final Executor d;
    public final Executor e;
    public final zwb f;
    public adur g;
    public LoadingFrameLayout h;
    public String i;
    public boolean j;
    public final omj k;

    public gry(BrowserActivity browserActivity, inu inuVar, Executor executor, Executor executor2, omj omjVar, zwb zwbVar) {
        this.b = browserActivity;
        this.c = inuVar;
        this.d = executor;
        this.e = executor2;
        this.k = omjVar;
        this.f = zwbVar;
    }

    public static Intent a(Context context, int i) {
        return new Intent(context, (Class<?>) BrowserActivity.class).putExtra("destination", i);
    }

    public final void b() {
        this.j = false;
        LoadingFrameLayout loadingFrameLayout = this.h;
        if (loadingFrameLayout == null || this.g == null || this.i == null) {
            return;
        }
        loadingFrameLayout.h(2);
        Uri.Builder builderBuildUpon = Uri.parse(this.i).buildUpon();
        builderBuildUpon.appendQueryParameter("ent", "e");
        Locale locale = Locale.getDefault();
        builderBuildUpon.appendQueryParameter("hl", locale.getLanguage() + '-' + locale.getCountry());
        String strL = this.f.e().l();
        if (!TextUtils.isEmpty(strL)) {
            builderBuildUpon.appendQueryParameter("pageId", strL);
        }
        this.g.loadUrl(builderBuildUpon.toString());
    }
}
