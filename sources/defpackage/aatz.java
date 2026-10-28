package defpackage;

import android.database.DataSetObserver;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatz extends DataSetObserver {
    final /* synthetic */ NonScrollableListView a;

    protected aatz(NonScrollableListView nonScrollableListView) {
        this.a = nonScrollableListView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        NonScrollableListView nonScrollableListView = this.a;
        if (nonScrollableListView.b != null) {
            nonScrollableListView.a();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }
}
