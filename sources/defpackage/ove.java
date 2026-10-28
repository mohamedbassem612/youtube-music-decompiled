package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ove extends ViewGroup {
    public final List a;
    public final List b;
    public final Map c;
    public final Map d;
    public int e;

    public ove(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.c = new WeakHashMap();
        this.d = new HashMap();
        this.e = 0;
        setClipChildren(false);
        ovh ovhVar = new ovh(context);
        addView(ovhVar);
        arrayList.add(ovhVar);
        arrayList2.add(ovhVar);
        this.e = 1;
    }

    public final void a(Object obj) {
        Map map = this.c;
        ovh ovhVar = (ovh) map.get(obj);
        if (ovhVar != null) {
            ovhVar.a();
            map.remove(obj);
            this.d.remove(ovhVar);
            this.b.add(ovhVar);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
