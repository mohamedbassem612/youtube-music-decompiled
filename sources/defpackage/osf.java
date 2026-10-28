package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osf {
    static final osd a = new ose();

    public static osd a(Activity activity, Executor executor, agfr agfrVar) {
        if (activity == null) {
            return a;
        }
        osj osjVar = agfrVar != null ? new osj(activity, ((opq) agfrVar.io()).a()) : new osj(activity);
        osjVar.c = executor == null ? null : new ahfg(executor);
        View viewFindViewById = activity.findViewById(R.id.content);
        if (viewFindViewById != null && (viewFindViewById instanceof ViewGroup)) {
            ((ViewGroup) viewFindViewById).addView(osjVar);
        }
        osjVar.setVisibility(8);
        return osjVar;
    }
}
