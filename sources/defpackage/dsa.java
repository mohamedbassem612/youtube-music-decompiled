package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dsa implements Cloneable {
    private drx[] A;
    public ArrayList h;
    public ArrayList i;
    long p;
    drw q;
    long r;
    public wg s;
    private static final Animator[] w = new Animator[0];
    private static final int[] x = {2, 1, 3, 4};
    private static final wg E = new wg();
    private static final ThreadLocal y = new ThreadLocal();
    private final String z = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    public kwq u = new kwq((byte[]) null);
    public kwq v = new kwq((byte[]) null);
    dsi f = null;
    public final int[] g = x;
    final ArrayList j = new ArrayList();
    private Animator[] B = w;
    int k = 0;
    private boolean C = false;
    boolean l = false;
    public dsa m = null;
    dsa n = null;
    private ArrayList D = null;
    public ArrayList o = new ArrayList();
    public wg t = E;

    private static void O(kwq kwqVar, View view, dsk dskVar) {
        ((aha) kwqVar.b).put(view, dskVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) kwqVar.d;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int i = bac.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            aha ahaVar = (aha) kwqVar.c;
            if (ahaVar.containsKey(transitionName)) {
                ahaVar.put(transitionName, null);
            } else {
                ahaVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                agk agkVar = (agk) kwqVar.a;
                if (agkVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    agkVar.i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) agkVar.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    agkVar.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void f(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                dsk dskVar = new dsk(view);
                if (z) {
                    c(dskVar);
                } else {
                    b(dskVar);
                }
                dskVar.c.add(this);
                o(dskVar);
                if (z) {
                    O(this.u, view, dskVar);
                } else {
                    O(this.v, view, dskVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    private static boolean g(dsk dskVar, dsk dskVar2, String str) {
        Map map = dskVar2.a;
        Object obj = dskVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null) {
            return obj2 != null;
        }
        if (obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    static afv h() {
        ThreadLocal threadLocal = y;
        afv afvVar = (afv) threadLocal.get();
        if (afvVar != null) {
            return afvVar;
        }
        afv afvVar2 = new afv();
        threadLocal.set(afvVar2);
        return afvVar2;
    }

    public boolean A() {
        return !this.j.isEmpty();
    }

    public boolean B(dsk dskVar, dsk dskVar2) {
        if (dskVar == null || dskVar2 == null) {
            return false;
        }
        String[] strArrE = e();
        if (strArrE == null) {
            Iterator it = dskVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (g(dskVar, dskVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrE) {
            if (!g(dskVar, dskVar2, str)) {
            }
        }
        return false;
        return true;
    }

    final boolean C(View view) {
        int id = view.getId();
        ArrayList arrayList = this.d;
        return (arrayList.size() == 0 && this.e.size() == 0) || arrayList.contains(Integer.valueOf(id)) || this.e.contains(view);
    }

    public final void D(drx drxVar) {
        ArrayList arrayList = this.D;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.D = arrayList;
        }
        arrayList.add(drxVar);
    }

    public void E(View view) {
        this.e.add(view);
    }

    public final void F(drx drxVar) {
        dsa dsaVar;
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            if (!arrayList.remove(drxVar) && (dsaVar = this.m) != null) {
                dsaVar.F(drxVar);
            }
            if (this.D.size() == 0) {
                this.D = null;
            }
        }
    }

    public void G(View view) {
        this.e.remove(view);
    }

    public void H(long j) {
        this.b = j;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void K(long j) {
        this.a = j;
    }

    public void L(wg wgVar) {
        this.s = wgVar;
    }

    public void M(wg wgVar) {
        if (wgVar == null) {
            wgVar = E;
        }
        this.t = wgVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[LOOP:1: B:27:0x0074->B:29:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf A[SYNTHETIC] */
    public void N(ViewGroup viewGroup, kwq kwqVar, kwq kwqVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorA;
        Animator animator;
        View view;
        dsk dskVar;
        View view2;
        Animator animator2;
        Object obj;
        String[] strArrE;
        dsk dskVar2;
        dsk dskVar3;
        dsk dskVar4;
        int i;
        int i2;
        Object obj2;
        int i3;
        afv afvVarH = h();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        drw drwVar = j().q;
        for (int i4 = 0; i4 < size; i4++) {
            dsk dskVar5 = (dsk) arrayList.get(i4);
            dsk dskVar6 = (dsk) arrayList2.get(i4);
            if (dskVar5 != null && !dskVar5.c.contains(this)) {
                dskVar5 = null;
            }
            if (dskVar6 != null && !dskVar6.c.contains(this)) {
                dskVar6 = null;
            }
            if (dskVar5 == null) {
                if (dskVar6 != null) {
                    animatorA = a(viewGroup, dskVar5, dskVar6);
                    if (animatorA == null) {
                        if (dskVar6 != null) {
                            view = dskVar6.b;
                            strArrE = e();
                            if (strArrE != null) {
                                dskVar3 = new dsk(view);
                                dskVar4 = (dsk) ((aha) kwqVar2.b).get(view);
                                animator = animatorA;
                                if (dskVar4 != null) {
                                    i3 = 0;
                                    while (i3 < strArrE.length) {
                                        Map map = dskVar3.a;
                                        String[] strArr = strArrE;
                                        String str = strArr[i3];
                                        map.put(str, dskVar4.a.get(str));
                                        i3++;
                                        strArrE = strArr;
                                    }
                                }
                                i = afvVarH.d;
                                i2 = 0;
                                while (true) {
                                    if (i2 >= i) {
                                        dskVar2 = dskVar3;
                                        break;
                                    }
                                    gmj gmjVar = (gmj) afvVarH.get((Animator) afvVarH.d(i2));
                                    obj2 = gmjVar.e;
                                    if (obj2 == null && gmjVar.d == view) {
                                        if (((String) gmjVar.f).equals(this.z) && ((dsk) obj2).equals(dskVar3)) {
                                            dskVar2 = dskVar3;
                                            animator = null;
                                            break;
                                        }
                                    }
                                    i2++;
                                }
                            } else {
                                animator = animatorA;
                                dskVar2 = null;
                            }
                            dskVar = dskVar2;
                        } else {
                            animator = animatorA;
                            view = dskVar5.b;
                            dskVar = null;
                        }
                        view2 = view;
                        animator2 = animator;
                        if (animator2 != null) {
                            gmj gmjVar2 = new gmj(view2, this.z, this, viewGroup.getWindowId(), dskVar, animator2);
                            if (drwVar != null) {
                                obj = animator2;
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(animator2);
                                obj = animatorSet;
                            }
                            obj = animator2;
                            afvVarH.put(obj, gmjVar2);
                            this.o.add(obj);
                        }
                    }
                }
            } else if (dskVar6 == null || B(dskVar5, dskVar6)) {
                animatorA = a(viewGroup, dskVar5, dskVar6);
                if (animatorA == null) {
                    if (dskVar6 != null) {
                        view = dskVar6.b;
                        strArrE = e();
                        if (strArrE != null) {
                            dskVar3 = new dsk(view);
                            dskVar4 = (dsk) ((aha) kwqVar2.b).get(view);
                            animator = animatorA;
                            if (dskVar4 != null) {
                                i3 = 0;
                                while (i3 < strArrE.length) {
                                    Map map2 = dskVar3.a;
                                    String[] strArr2 = strArrE;
                                    String str2 = strArr2[i3];
                                    map2.put(str2, dskVar4.a.get(str2));
                                    i3++;
                                    strArrE = strArr2;
                                }
                            }
                            i = afvVarH.d;
                            i2 = 0;
                            while (true) {
                                if (i2 >= i) {
                                    dskVar2 = dskVar3;
                                    break;
                                }
                                gmj gmjVar3 = (gmj) afvVarH.get((Animator) afvVarH.d(i2));
                                obj2 = gmjVar3.e;
                                if (obj2 == null) {
                                }
                                i2++;
                            }
                        } else {
                            animator = animatorA;
                            dskVar2 = null;
                        }
                        dskVar = dskVar2;
                    } else {
                        animator = animatorA;
                        view = dskVar5.b;
                        dskVar = null;
                    }
                    view2 = view;
                    animator2 = animator;
                    if (animator2 != null) {
                        gmj gmjVar4 = new gmj(view2, this.z, this, viewGroup.getWindowId(), dskVar, animator2);
                        if (drwVar != null) {
                            obj = animator2;
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(animator2);
                            obj = animatorSet2;
                        }
                        obj = animator2;
                        afvVarH.put(obj, gmjVar4);
                        this.o.add(obj);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                gmj gmjVar5 = (gmj) afvVarH.get((Animator) this.o.get(sparseIntArray.keyAt(i5)));
                long jValueAt = sparseIntArray.valueAt(i5);
                Animator animator3 = (Animator) gmjVar5.b;
                animator3.setStartDelay((jValueAt - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    public Animator a(ViewGroup viewGroup, dsk dskVar, dsk dskVar2) {
        return null;
    }

    public abstract void b(dsk dskVar);

    public abstract void c(dsk dskVar);

    public boolean d() {
        return false;
    }

    public String[] e() {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public dsa clone() {
        try {
            dsa dsaVar = (dsa) super.clone();
            dsaVar.o = new ArrayList();
            dsaVar.u = new kwq((byte[]) null);
            dsaVar.v = new kwq((byte[]) null);
            dsaVar.h = null;
            dsaVar.i = null;
            dsaVar.q = null;
            dsaVar.m = this;
            dsaVar.D = null;
            dsaVar.n = null;
            return dsaVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final dsa j() {
        dsi dsiVar = this.f;
        return dsiVar != null ? dsiVar.j() : this;
    }

    final dsk k(View view, boolean z) {
        dsi dsiVar = this.f;
        if (dsiVar != null) {
            return dsiVar.k(view, z);
        }
        ArrayList arrayList = z ? this.h : this.i;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    dsk dskVar = (dsk) arrayList.get(i);
                    if (dskVar != null) {
                        if (dskVar.b == view) {
                            break;
                        }
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                return (dsk) (z ? this.i : this.h).get(i);
            }
        }
        return null;
    }

    public final dsk l(View view, boolean z) {
        dsi dsiVar = this.f;
        if (dsiVar != null) {
            return dsiVar.l(view, z);
        }
        return (dsk) ((aha) (z ? this.u : this.v).b).get(view);
    }

    public String m(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.b != -1) {
            sb.append("dur(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.a != -1) {
            sb.append("dly(");
            sb.append(this.a);
            sb.append(") ");
        }
        if (this.c != null) {
            sb.append("interp(");
            sb.append(this.c);
            sb.append(") ");
        }
        ArrayList arrayList = this.d;
        if (arrayList.size() > 0 || this.e.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.e;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(')');
        }
        return sb.toString();
    }

    public void n() {
        dsa dsaVar = this.n;
        if (dsaVar != null) {
            this.n = null;
            dsaVar.n();
        }
        ArrayList arrayList = this.j;
        afv afvVarH = h();
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B);
        this.B = w;
        while (true) {
            size--;
            if (size < 0) {
                this.B = animatorArr;
                s(this, drz.c, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
                afvVarH.remove(animator);
            }
        }
    }

    final void p(ViewGroup viewGroup, boolean z) {
        boolean z2;
        q(z);
        ArrayList arrayList = this.d;
        if (arrayList.size() <= 0 && this.e.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= arrayList.size()) {
                break;
            }
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                dsk dskVar = new dsk(viewFindViewById);
                if (z) {
                    c(dskVar);
                } else {
                    b(dskVar);
                    z3 = false;
                }
                dskVar.c.add(this);
                o(dskVar);
                if (z3) {
                    O(this.u, viewFindViewById, dskVar);
                } else {
                    O(this.v, viewFindViewById, dskVar);
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i2 >= arrayList2.size()) {
                return;
            }
            View view = (View) arrayList2.get(i2);
            dsk dskVar2 = new dsk(view);
            if (z) {
                c(dskVar2);
                z2 = true;
            } else {
                b(dskVar2);
                z2 = false;
            }
            dskVar2.c.add(this);
            o(dskVar2);
            if (z2) {
                O(this.u, view, dskVar2);
            } else {
                O(this.v, view, dskVar2);
            }
            i2++;
        }
    }

    final void q(boolean z) {
        if (z) {
            ((aha) this.u.b).clear();
            ((SparseArray) this.u.d).clear();
            ((agk) this.u.a).h();
        } else {
            ((aha) this.v.b).clear();
            ((SparseArray) this.v.d).clear();
            ((agk) this.v.a).h();
        }
    }

    protected final void r() {
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            s(this, drz.b, false);
            for (int i2 = 0; i2 < ((agk) this.u.a).c(); i2++) {
                View view = (View) ((agk) this.u.a).g(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((agk) this.v.a).c(); i3++) {
                View view2 = (View) ((agk) this.v.a).g(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.l = true;
        }
    }

    public final void s(dsa dsaVar, drz drzVar, boolean z) {
        dsa dsaVar2 = this.m;
        if (dsaVar2 != null) {
            dsaVar2.s(dsaVar, drzVar, z);
        }
        ArrayList arrayList = this.D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.D.size();
        drx[] drxVarArr = this.A;
        if (drxVarArr == null) {
            drxVarArr = new drx[size];
        }
        this.A = null;
        drx[] drxVarArr2 = (drx[]) this.D.toArray(drxVarArr);
        for (int i = 0; i < size; i++) {
            drzVar.a(drxVarArr2[i], dsaVar);
            drxVarArr2[i] = null;
        }
        this.A = drxVarArr2;
    }

    public void t(View view) {
        if (this.l) {
            return;
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B);
        this.B = w;
        while (true) {
            size--;
            if (size < 0) {
                this.B = animatorArr;
                s(this, drz.d, false);
                this.C = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public final String toString() {
        return m("");
    }

    public void u() {
        afv afvVarH = h();
        this.p = 0L;
        int i = 0;
        while (true) {
            int size = this.o.size();
            ArrayList arrayList = this.o;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            gmj gmjVar = (gmj) afvVarH.get(animator);
            if (animator != null && gmjVar != null) {
                long j = this.b;
                if (j >= 0) {
                    ((Animator) gmjVar.b).setDuration(j);
                }
                long j2 = this.a;
                if (j2 >= 0) {
                    Animator animator2 = (Animator) gmjVar.b;
                    animator2.setStartDelay(j2 + animator2.getStartDelay());
                }
                TimeInterpolator timeInterpolator = this.c;
                if (timeInterpolator != null) {
                    ((Animator) gmjVar.b).setInterpolator(timeInterpolator);
                }
                this.j.add(animator);
                this.p = Math.max(this.p, animator.getTotalDuration());
            }
            i++;
        }
    }

    public void v() {
        afv afvVarH = h();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B);
        this.B = w;
        while (true) {
            size--;
            if (size < 0) {
                this.B = animatorArr;
                arrayList.clear();
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                afvVarH.remove(animator);
            }
        }
    }

    public void w(View view) {
        if (this.C) {
            if (!this.l) {
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B);
                this.B = w;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.B = animatorArr;
                s(this, drz.e, false);
            }
            this.C = false;
        }
    }

    protected void x() {
        z();
        afv afvVarH = h();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (afvVarH.containsKey(animator)) {
                z();
                if (animator != null) {
                    animator.addListener(new dru(this, afvVarH));
                    long j = this.b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new drv(this));
                    animator.start();
                }
            }
        }
        this.o.clear();
        r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    public void y(long j, long j2) {
        long j3 = this.p;
        ?? r3 = (j > j2 ? 1 : (j == j2 ? 0 : -1)) >>> 31;
        int i = 0;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.l = false;
            s(this, drz.a, r3);
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B);
        this.B = w;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            long totalDuration = animator.getTotalDuration();
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), totalDuration));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.B = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.l = true;
        }
        s(this, drz.b, r3);
    }

    protected final void z() {
        if (this.k == 0) {
            s(this, drz.a, false);
            this.l = false;
        }
        this.k++;
    }

    public void J() {
    }

    public void o(dsk dskVar) {
    }
}
