package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acou extends acdf {
    public static final agkj e;
    public final List f;
    public acos g;
    public acot h;
    private final hno i;

    static {
        acos acosVar = acos.a;
        acot acotVar = acot.a;
        acos acosVar2 = acos.b;
        acot acotVar2 = acot.b;
        acos acosVar3 = acos.c;
        acot acotVar3 = acot.c;
        e = agkj.p(acosVar, acotVar, acosVar2, acotVar2, acosVar3, acotVar3, acos.d, acot.d, acos.e, acotVar2, acos.f, acotVar2, acos.g, acotVar3);
    }

    public acou(Context context, hno hnoVar) {
        super(context);
        this.f = new ArrayList();
        this.g = acos.a;
        this.h = acot.a;
        this.i = hnoVar;
        if (n()) {
            l(new accp(aawb.g(), aawb.j(), aawb.h(), aawb.f(), aawb.i(), accx.values()[3].i));
        }
    }

    private final boolean n() {
        return ((vxz) this.i.i).l(268, 45810529L, false);
    }

    @Override // defpackage.acdf, defpackage.acdg
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // defpackage.acdf
    protected final accs e(Object obj, acci acciVar) {
        accs accsVarE = super.e(obj, acciVar);
        if (n()) {
            if (!accsVarE.i) {
                accsVarE.i = true;
                Iterator it = accsVarE.a.iterator();
                while (it.hasNext()) {
                    ((acct) it.next()).d = true;
                }
                accsVarE.invalidate();
            }
            if (!accsVarE.j) {
                accsVarE.j = true;
                accsVarE.b.e = true;
                Iterator it2 = accsVarE.a.iterator();
                while (it2.hasNext()) {
                    ((acct) it2.next()).e = true;
                }
                accsVarE.invalidate();
            }
        }
        return accsVarE;
    }

    @Override // defpackage.acdf
    public final void f() {
        super.f();
        this.f.clear();
    }

    @Override // defpackage.acdf
    public final void l(accp accpVar) {
        if (n()) {
            super.l(new accp(tzk.i(getContext(), R.attr.ytOverlayBackgroundMedium), accpVar.b, accpVar.c, accpVar.d, accpVar.e, 3));
        } else {
            super.l(accpVar);
        }
    }

    @Override // defpackage.acdf
    public final void m(List list) {
        int i;
        boolean z;
        int i2;
        acci acciVar;
        List list2 = this.f;
        if (list2 != list) {
            list2.clear();
            list2.addAll(list);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            acci acciVar2 = (acci) it.next();
            boolean zN = n();
            acot acotVar = this.h;
            if (zN) {
                accf accfVar = acciVar2.c;
                acby acbyVar = new acby(1, null, null);
                int i3 = accfVar.b & (-7);
                int i4 = accfVar.d;
                boolean z2 = accfVar.f;
                int iOrdinal = acotVar.ordinal();
                int i5 = 0;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i = 33;
                        z = z2;
                        i2 = 0;
                    } else if (iOrdinal != 3) {
                        z = z2;
                        i2 = 0;
                        i5 = i4;
                        i = i3 | 1;
                    } else {
                        i2 = 50;
                        i = 34;
                        z = false;
                    }
                    i5 = 100;
                } else {
                    i = 9;
                    z = z2;
                    i2 = 0;
                }
                arrayList.add(new acci(acciVar2.a, acciVar2.b, acciVar2.d, acciVar2.e, new accf(i, i2, i5, accfVar.e, z, acbyVar)));
            } else {
                int iOrdinal2 = acotVar.ordinal();
                if (iOrdinal2 == 1) {
                    accf accfVar2 = acciVar2.c;
                    acciVar = new acci(acciVar2.a, acciVar2.b, acciVar2.d, acciVar2.e, new accf(9, 0, 0, accfVar2.e, accfVar2.f, null));
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        acciVar = new acci(acciVar2.a, acciVar2.b, acciVar2.d, acciVar2.e, new accf(34, 50, 100, acciVar2.c.e, false, null));
                    }
                    arrayList.add(acciVar2);
                } else {
                    accf accfVar3 = acciVar2.c;
                    acciVar = new acci(acciVar2.a, acciVar2.b, acciVar2.d, acciVar2.e, new accf(33, 0, 100, accfVar3.e, accfVar3.f, null));
                }
                acciVar2 = acciVar;
                arrayList.add(acciVar2);
            }
        }
        super.m(arrayList);
    }
}
