package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class drt extends dv {
    private static boolean A(dsa dsaVar) {
        return (x(dsaVar.d) && x(null) && x(null)) ? false : true;
    }

    @Override // defpackage.dv
    public final Object a(Object obj) {
        if (obj != null) {
            return ((dsa) obj).clone();
        }
        return null;
    }

    @Override // defpackage.dv
    public final Object b(Object obj, Object obj2, Object obj3) {
        dsa dsaVar = (dsa) obj;
        dsa dsaVar2 = (dsa) obj2;
        dsa dsaVar3 = (dsa) obj3;
        dsa dsaVar4 = dsaVar;
        if (dsaVar == null) {
            dsaVar4 = dsaVar2 != null ? dsaVar2 : null;
        } else if (dsaVar2 != null) {
            dsi dsiVar = new dsi();
            dsiVar.O(dsaVar);
            dsiVar.O(dsaVar2);
            dsiVar.P(1);
            dsaVar4 = dsiVar;
        }
        if (dsaVar3 == null) {
            return dsaVar4;
        }
        dsi dsiVar2 = new dsi();
        if (dsaVar4 != null) {
            dsiVar2.O(dsaVar4);
        }
        dsiVar2.O(dsaVar3);
        return dsiVar2;
    }

    @Override // defpackage.dv
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        dsi dsiVar = new dsi();
        dsiVar.O((dsa) obj);
        return dsiVar;
    }

    @Override // defpackage.dv
    public final void d(Object obj, View view) {
        ((dsa) obj).E(view);
    }

    @Override // defpackage.dv
    public final void e(Object obj, ArrayList arrayList) {
        dsa dsaVar = (dsa) obj;
        if (dsaVar != null) {
            int i = 0;
            if (dsaVar instanceof dsi) {
                dsi dsiVar = (dsi) dsaVar;
                int iF = dsiVar.f();
                while (i < iF) {
                    e(dsiVar.g(i), arrayList);
                    i++;
                }
                return;
            }
            if (A(dsaVar) || !x(dsaVar.e)) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                dsaVar.E((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.dv
    public final void f(ViewGroup viewGroup, Object obj) {
        dse.b(viewGroup, (dsa) obj);
    }

    public final void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        dsa dsaVar = (dsa) obj;
        int i = 0;
        if (dsaVar instanceof dsi) {
            dsi dsiVar = (dsi) dsaVar;
            int iF = dsiVar.f();
            while (i < iF) {
                g(dsiVar.g(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(dsaVar)) {
            return;
        }
        ArrayList arrayList3 = dsaVar.e;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            dsaVar.E((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                dsaVar.G((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.dv
    public final void h(Object obj, View view, ArrayList arrayList) {
        ((dsa) obj).D(new drq(view, arrayList));
    }

    @Override // defpackage.dv
    public final void i(Object obj, Rect rect) {
        ((dsa) obj).L(new wg());
    }

    @Override // defpackage.dv
    public final void j(Object obj, View view) {
        if (view != null) {
            y(view, new Rect());
            ((dsa) obj).L(new wg());
        }
    }

    @Override // defpackage.dv
    public final void k(Object obj, View view, ArrayList arrayList) {
        dsi dsiVar = (dsi) obj;
        ArrayList arrayList2 = dsiVar.e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        e(dsiVar, arrayList);
    }

    @Override // defpackage.dv
    public final void l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        dsi dsiVar = (dsi) obj;
        if (dsiVar != null) {
            ArrayList arrayList3 = dsiVar.e;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            g(dsiVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.dv
    public final boolean m(Object obj) {
        return obj instanceof dsa;
    }

    @Override // defpackage.dv
    public final boolean n() {
        return true;
    }

    @Override // defpackage.dv
    public final boolean o(Object obj) {
        boolean zD = ((dsa) obj).d();
        if (!zD) {
            Objects.toString(obj);
        }
        return zD;
    }

    @Override // defpackage.dv
    public final Object p(Object obj, Object obj2) {
        dsi dsiVar = new dsi();
        if (obj != null) {
            dsiVar.O((dsa) obj);
        }
        dsiVar.O((dsa) obj2);
        return dsiVar;
    }

    @Override // defpackage.dv
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((dsa) obj).D(new drr(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.dv
    public final void r(Object obj, awl awlVar, Runnable runnable) {
        z(obj, awlVar, null, runnable);
    }

    @Override // defpackage.dv
    public final Object s(ViewGroup viewGroup, Object obj) {
        dsa dsaVar = (dsa) obj;
        ArrayList arrayList = dse.a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!dsaVar.d()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        dsa dsaVarClone = dsaVar.clone();
        dsi dsiVar = new dsi();
        dsiVar.O(dsaVarClone);
        dsaVar.n = dsiVar;
        dse.d(viewGroup, dsiVar);
        viewGroup.setTag(R.id.transition_current_scene, null);
        dse.c(viewGroup, dsiVar);
        viewGroup.invalidate();
        dsiVar.q = new drw(dsiVar);
        dsiVar.D(dsiVar.q);
        return dsiVar.q;
    }

    @Override // defpackage.dv
    public final void t(Object obj) {
        ((drw) obj).i();
    }

    @Override // defpackage.dv
    public final void u(Object obj, Runnable runnable) {
        ((drw) obj).j(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    @Override // defpackage.dv
    public final void w(Object obj, float f) {
        drw drwVar = (drw) obj;
        if (drwVar.b) {
            long jH = (long) (f * drwVar.h());
            long j = 0;
            if (jH == 0) {
                jH = 1;
            }
            long j2 = -1;
            if (jH == drwVar.h()) {
                jH = drwVar.h() - 1;
            }
            if (drwVar.e != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j3 = drwVar.a;
            if (jH != j3) {
                if (!drwVar.c) {
                    if (jH == 0) {
                        if (j3 <= 0) {
                        }
                        if (j2 != j3) {
                            drwVar.g.y(j2, j3);
                            drwVar.a = j2;
                        }
                        jH = j2;
                    } else {
                        j = jH;
                    }
                    long jH2 = drwVar.h();
                    j2 = (j != jH2 || j3 >= jH2) ? j : jH2 + 1;
                    if (j2 != j3) {
                        drwVar.g.y(j2, j3);
                        drwVar.a = j2;
                    }
                    jH = j2;
                }
                drwVar.h.c(AnimationUtils.currentAnimationTimeMillis(), jH);
            }
        }
    }

    @Override // defpackage.dv
    public final void z(Object obj, awl awlVar, Runnable runnable, Runnable runnable2) {
        dsa dsaVar = (dsa) obj;
        adbm adbmVar = new adbm(runnable, dsaVar, runnable2);
        synchronized (awlVar) {
            while (awlVar.c) {
                try {
                    awlVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (awlVar.d != adbmVar) {
                awlVar.d = adbmVar;
                if (awlVar.a) {
                    adbmVar.b();
                }
            }
        }
        dsaVar.D(new drs(runnable2));
    }
}
