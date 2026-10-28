package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afdh extends DataSetObserver {
    final /* synthetic */ TabLayout a;

    public afdh(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.i();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.i();
    }
}
