package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xua implements AdapterView.OnItemClickListener {
    final /* synthetic */ xub a;

    public xua(xub xubVar) {
        this.a = xubVar;
    }

    public final void a(AdapterView adapterView, View view, int i, long j) {
        xub xubVar = this.a;
        if (xubVar.A != null) {
            dii diiVar = (dii) adapterView.getItemAtPosition(i);
            Map map = xubVar.G;
            if (map.containsKey(xrx.a(diiVar))) {
                xubVar.F.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, (xgz) map.get(xrx.a(diiVar)), xubVar.x(diiVar));
            } else {
                agrx agrxVar = agso.a;
            }
            xubVar.K.f(amyv.MDX_SESSION_SOURCE_ROUTE_BUTTON);
            xubVar.A.onItemClick(adapterView, view, i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(final AdapterView adapterView, final View view, final int i, final long j) {
        dii diiVar = (dii) adapterView.getItemAtPosition(i);
        boolean zM = xrx.m(diiVar);
        xrc xrcVar = new xrc() { // from class: xtz
            @Override // defpackage.xrc
            public final void a() {
                this.a.a(adapterView, view, i, j);
            }
        };
        String str = diiVar.e;
        xub xubVar = this.a;
        if (xubVar.D.a(zM, xrcVar)) {
            xubVar.dismiss();
        } else if (!xrx.m(diiVar) || ((Boolean) xubVar.C.io()).booleanValue()) {
            a(adapterView, view, i, j);
        } else {
            xubVar.B.c(new xqp(diiVar));
            xubVar.dismiss();
        }
    }
}
