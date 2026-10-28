package defpackage;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tye implements tyh {
    private final Iterable a;

    public tye(tyh... tyhVarArr) {
        this(Arrays.asList(tyhVarArr));
    }

    @Override // defpackage.tyh
    public final boolean a(ViewGroup.LayoutParams layoutParams) {
        Iterator it = this.a.iterator();
        boolean zA = false;
        while (it.hasNext()) {
            zA |= ((tyh) it.next()).a(layoutParams);
        }
        return zA;
    }

    public tye(Iterable iterable) {
        this.a = iterable;
    }
}
