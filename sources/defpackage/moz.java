package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class moz implements nvr {
    private final aunn a;
    private final aunn b;
    private final aunn c;

    public moz(aunn aunnVar, aunn aunnVar2, aunn aunnVar3) {
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = aunnVar3;
    }

    @Override // defpackage.nvr
    public final mep a() {
        return myv.G;
    }

    public final void b(mzg mzgVar, asmq asmqVar, nsl nslVar) {
        nrt nrtVarD = nrv.d();
        aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
        aihhVar.e(asmq.b, asmqVar);
        nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
        avmn avmnVarD = ((nry) this.a.io()).a(((omj) this.c.io()).B(mzgVar, nslVar).x(), nrtVarD.a()).v((avmb) this.b.io()).D();
        avnq avnqVar = nslVar.i;
        if (avnqVar != null) {
            avnqVar.c(avmnVarD);
        }
    }

    @Override // defpackage.nvs
    public final /* bridge */ /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, final nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        final myv myvVar = (myv) obj;
        if (myvVar.k() == 2) {
            ntqVar.q(new ntn() { // from class: mox
                @Override // defpackage.ntn
                public final void a(View view, nxg nxgVar) {
                    this.a.f(view, myvVar, nslVar);
                }
            });
        } else if (myvVar.k() == 3) {
            ntqVar.m(new ntj() { // from class: moy
                @Override // defpackage.ntj
                public final boolean a(View view, nxg nxgVar) {
                    this.a.f(view, myvVar, nslVar);
                    return true;
                }
            });
        }
    }

    final void f(View view, myv myvVar, nsl nslVar) {
        RecyclerView recyclerView;
        if (view != null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    recyclerView = null;
                    break;
                } else {
                    if (parent instanceof RecyclerView) {
                        recyclerView = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
            if (recyclerView != null) {
                Object tag = recyclerView.getTag(R.id.elements_item_touch_helper);
                if (tag instanceof pv) {
                    pv pvVar = (pv) tag;
                    oh ohVarH = recyclerView.h(view);
                    if (ohVarH != null) {
                        if (myvVar.i()) {
                            ohVarH.a.setTag(R.id.elements_item_drag_started_sender_state_consumer, new hrr(this, myvVar, nslVar, 3));
                        } else {
                            ohVarH.a.setTag(R.id.elements_item_drag_started_sender_state_consumer, null);
                        }
                        if (myvVar.j()) {
                            ohVarH.a.setTag(R.id.elements_item_dropped_sender_state_consumer, new hrr(this, myvVar, nslVar, 4));
                        } else {
                            ohVarH.a.setTag(R.id.elements_item_dropped_sender_state_consumer, null);
                        }
                        pvVar.v(ohVarH);
                    }
                }
            }
        }
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
    }
}
