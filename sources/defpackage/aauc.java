package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Checkable;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aauc extends aauh implements AdapterView.OnItemClickListener {
    public int a;
    private final NonScrollableListView b;

    public aauc(Context context, NonScrollableListView nonScrollableListView) {
        super(context);
        this.a = -1;
        nonScrollableListView.getClass();
        this.b = nonScrollableListView;
    }

    public final void a(int i) {
        this.a = i;
        int i2 = 0;
        while (true) {
            NonScrollableListView nonScrollableListView = this.b;
            if (i2 >= nonScrollableListView.getChildCount()) {
                return;
            }
            KeyEvent.Callback childAt = nonScrollableListView.getChildAt(i2);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(i2 == i);
            }
            i2++;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.a != i) {
            a(i);
        }
    }
}
