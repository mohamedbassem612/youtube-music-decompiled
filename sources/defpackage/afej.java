package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afej implements AdapterView.OnItemClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public afej(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        if (this.$cid != 0) {
            Object obj = this.a;
            kw kwVar = (kw) obj;
            AppCompatSpinner appCompatSpinner = kwVar.d;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(view, i, kwVar.b.getItemId(i));
            }
            ((mx) obj).k();
            return;
        }
        Object obj2 = this.a;
        if (i < 0) {
            mx mxVar = ((afel) obj2).a;
            item = !mxVar.u() ? null : mxVar.e.getSelectedItem();
        } else {
            item = ((afel) obj2).getAdapter().getItem(i);
        }
        afel afelVar = (afel) this.a;
        afelVar.setText(afelVar.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = afelVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                mx mxVar2 = afelVar.a;
                view = !mxVar2.u() ? null : mxVar2.e.getSelectedView();
                i = mxVar2.o();
                j = !mxVar2.u() ? Long.MIN_VALUE : mxVar2.e.getSelectedItemId();
            }
            onItemClickListener.onItemClick(afelVar.a.e, view, i, j);
        }
        afelVar.a.k();
    }
}
