package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class il extends BaseAdapter {
    final /* synthetic */ im a;
    private int b = -1;

    public il(im imVar) {
        this.a = imVar;
        b();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final is getItem(int i) {
        ArrayList arrayListE = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (is) arrayListE.get(i);
    }

    final void b() {
        iq iqVar = this.a.c;
        is isVar = iqVar.i;
        if (isVar != null) {
            ArrayList arrayListE = iqVar.e();
            int size = arrayListE.size();
            for (int i = 0; i < size; i++) {
                if (((is) arrayListE.get(i)) == isVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        return this.b >= 0 ? size - 1 : size;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((jc) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
