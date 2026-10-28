package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaty implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ ListAdapter b;
    final /* synthetic */ NonScrollableListView c;

    public aaty(NonScrollableListView nonScrollableListView, int i, ListAdapter listAdapter) {
        this.a = i;
        this.b = listAdapter;
        this.c = nonScrollableListView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AdapterView.OnItemClickListener onItemClickListener = this.c.c;
        if (onItemClickListener != null) {
            int i = this.a;
            onItemClickListener.onItemClick(null, view, i, this.b.getItemId(i));
        }
    }
}
