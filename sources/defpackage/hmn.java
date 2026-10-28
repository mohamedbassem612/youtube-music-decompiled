package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hmn {
    public final cf a;
    public final hpy b;
    public final vxe c;
    public final awmd d;
    public final jin e;
    private final hlp f;
    private final aauk g;
    private final syn h;
    private final kwq i;
    private final abfv j;

    public hmn(cf cfVar, hpy hpyVar, hlp hlpVar, vxe vxeVar, jin jinVar, syn synVar, aauk aaukVar, abfv abfvVar, kwq kwqVar, awmd awmdVar) {
        this.a = cfVar;
        this.b = hpyVar;
        this.f = hlpVar;
        this.c = vxeVar;
        this.e = jinVar;
        this.h = synVar;
        this.g = aaukVar;
        this.j = abfvVar;
        this.i = kwqVar;
        this.d = awmdVar;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        syn synVar = this.h;
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("task_bundle_feedback_token_key", str);
        synVar.d("auto_offline_removal_feedback_task", 1L, 1, 1, false, bundle, aacr.b, false);
    }

    public final void b(int i) {
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(this.a.getText(i));
        this.e.d(jioVarE.b());
    }

    public final void c(String str) {
        if (!this.f.k() && !txz.g(this.a)) {
            d(str);
            return;
        }
        jin jinVar = this.e;
        cf cfVar = this.a;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(cfVar.getText(R.string.snackbar_adding_to_offline));
        jioVarE.l(cfVar.getText(R.string.action_view), new gdp(this, str, 5));
        jinVar.d(jioVarE.b());
    }

    public final void d(String str) {
        boolean zP = this.g.p();
        int i = R.string.add_to_offline_wifi_unavailable;
        if (zP && this.j.z()) {
            i = R.string.waiting_for_preferred_connection;
        }
        this.e.d(this.i.s(i, new fuc(this, str, 17), false));
    }
}
