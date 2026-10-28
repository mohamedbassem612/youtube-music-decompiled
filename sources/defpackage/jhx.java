package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jhx extends dts {
    public final List a = new ArrayList();

    @Override // defpackage.dts
    public final boolean d(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.dts
    public final int g() {
        return this.a.size();
    }

    @Override // defpackage.dts
    public final int h(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return -2;
            }
            if (((jhq) list.get(i)).c == obj) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.dts
    public final CharSequence i(int i) {
        if (i >= 0) {
            List list = this.a;
            if (i < list.size()) {
                return ((aqjj) ((jhq) list.get(i)).d.b).e;
            }
        }
        return null;
    }

    @Override // defpackage.dts
    public final Object j(ViewGroup viewGroup, int i) {
        View view = ((jhq) this.a.get(i)).c;
        viewGroup.addView(view);
        return view;
    }

    @Override // defpackage.dts
    public final void k(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
