package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgh extends jbd {
    private final View b;
    private final TextView c;
    private final admd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgh(Context context, vxe vxeVar) {
        super(context, vxeVar);
        context.getClass();
        vxeVar.getClass();
        jdw jdwVar = new jdw(context);
        this.d = jdwVar;
        View viewInflate = View.inflate(context, R.layout.search_no_results_item, null);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.search_no_results);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.d).a;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        apnq apnqVar = (apnq) obj;
        adlyVar.b.w(new xgj(apnqVar.d, (amud) null), null);
        if ((apnqVar.b & 1) != 0) {
            alayVar = apnqVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        this.c.setText(ackj.k(null, alayVar, null, false));
        this.d.e(adlyVar);
    }
}
