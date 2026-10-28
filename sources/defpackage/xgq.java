package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgq implements ViewGroup.OnHierarchyChangeListener {
    private final xgn a;

    public xgq(xgn xgnVar) {
        this.a = xgnVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        xgn xgnVar = this.a;
        if (xgnVar.a() != null) {
            Object tag = view2.getTag(R.id.logging_directable_supplier_tag);
            if (tag instanceof xgw) {
                xgw xgwVar = (xgw) tag;
                MessageLite messageLite = xgwVar.a;
                aigj aigjVar = xgwVar.b;
                amdd amddVar = xgwVar.c;
                xgnVar.y(null, null, null);
            }
            Object tag2 = view2.getTag(R.id.visual_element_container_tag);
            if (tag2 instanceof xgi) {
                xgnVar.w(((xgi) tag2).a, null);
            }
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        xgn xgnVar = this.a;
        if (xgnVar.a() != null) {
            Object tag = view2.getTag(R.id.logging_directable_supplier_tag);
            if (tag instanceof xgw) {
                xgw xgwVar = (xgw) tag;
                MessageLite messageLite = xgwVar.a;
                amdd amddVar = xgwVar.c;
                xgnVar.p(null, null);
            }
        }
    }
}
