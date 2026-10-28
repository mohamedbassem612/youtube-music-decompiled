package defpackage;

import android.content.Context;
import android.widget.ListAdapter;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gxw implements sxu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public gxw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        if (this.$cid == 0) {
            gxx gxxVar = (gxx) ((dkh) this.a).a;
            gxxVar.e.setText((CharSequence) null);
            gxxVar.c.c(new gsc());
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                gxxVar.d.c((ajwo) it.next(), agpn.b);
            }
            return;
        }
        ArrayList arrayList = new ArrayList((List) obj2);
        gtb gtbVar = (gtb) this.a;
        hyf hyfVar = gtbVar.b;
        hyfVar.l = arrayList;
        ListAdapter listAdapter = hyfVar.r;
        if (listAdapter != null) {
            ((adyd) listAdapter).notifyDataSetChanged();
        }
        cf cfVar = (cf) gtbVar.a;
        if (hyfVar.isAdded() || hyfVar.isVisible()) {
            return;
        }
        hyfVar.gT(cfVar.getSupportFragmentManager(), "SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        if (this.$cid != 0) {
            Context context = ((gtb) this.a).a;
            tuk.o(context, context.getString(R.string.music_error_generic), 1);
            return;
        }
        Object obj2 = this.a;
        jio jioVarE = jin.e();
        gxx gxxVar = (gxx) ((dkh) obj2).a;
        ((jik) jioVarE).k(gxxVar.b.b(exc));
        gxxVar.g.d(jioVarE.b());
    }
}
