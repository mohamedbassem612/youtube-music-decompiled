package defpackage;

import android.accounts.AccountManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ydf {
    public final cc a;
    public final rmw b;
    public final adhv c;
    public final zwb d;
    public final xgn e;
    public boolean f = true;
    public View g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public View l;
    public rmv m;
    public final xyk n;

    public ydf(cc ccVar, rmw rmwVar, adhv adhvVar, zwb zwbVar, xyk xykVar, xgn xgnVar) {
        this.a = ccVar;
        this.b = rmwVar;
        this.c = adhvVar;
        this.d = zwbVar;
        this.n = xykVar;
        this.e = xgnVar;
        xgnVar.b(xhb.a(36382), null, null);
    }

    public final void a() {
        this.a.startActivityForResult(AccountManager.newChooseAccountIntent(null, null, new String[]{"com.google"}, null, null, null, null), 1);
    }

    public final void b(String str) {
        this.f = false;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail", str);
        yno.di((TvSignInActivity) this.a.getActivity(), TvSignInActivity.class, 1, bundle);
    }
}
