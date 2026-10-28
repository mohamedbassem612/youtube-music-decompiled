package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addt implements nwg {
    private final Context a;

    public addt(Context context) {
        this.a = context;
    }

    private final void f(int i) {
        Context context = this.a;
        Toast.makeText(context, context.getString(i), 1).show();
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return asra.b;
    }

    @Override // defpackage.nrx
    public final /* synthetic */ aslz b() {
        return null;
    }

    @Override // defpackage.nwg
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        return avlb.n(new hmg(this, (asra) obj, 16));
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        return nrb.a(this, mewVar, nwfVar);
    }

    public final /* synthetic */ void e(asra asraVar) {
        String str = asraVar.d;
        if (TextUtils.isEmpty(str)) {
            f(R.string.error_link_cannot_be_opened);
            return;
        }
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", tyu.d(str)).setFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            f(R.string.error_browser_not_found);
        }
    }
}
