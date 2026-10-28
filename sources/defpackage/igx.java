package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class igx implements igy {
    private final Context a;
    private final jin b;

    public igx(Context context, jin jinVar) {
        this.a = context;
        this.b = jinVar;
    }

    @Override // defpackage.igy
    public final void i(abnl abnlVar, hxb hxbVar) {
        zvp.a(zvn.b, zvm.n, "NoOpWatchController called.");
        Context context = this.a;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(context.getText(R.string.navigation_unavailable));
        this.b.d(jioVarE.b());
    }

    @Override // defpackage.igy
    public final void s(ajwo ajwoVar, hxb hxbVar) {
        zvp.a(zvn.b, zvm.n, "NoOpWatchController called.");
        Context context = this.a;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(context.getText(R.string.navigation_unavailable));
        this.b.d(jioVarE.b());
    }
}
