package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jhg extends on {
    private TimeInterpolator l;
    private final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();
    private final ArrayList p = new ArrayList();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    private final void v(List list, oh ohVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            jhe jheVar = (jhe) list.get(size);
            if (y(jheVar, ohVar) && jheVar.a == null && jheVar.b == null) {
                list.remove(jheVar);
            }
        }
    }

    private final void w(jhe jheVar) {
        oh ohVar = jheVar.a;
        if (ohVar != null) {
            y(jheVar, ohVar);
        }
        oh ohVar2 = jheVar.b;
        if (ohVar2 != null) {
            y(jheVar, ohVar2);
        }
    }

    private final void x(oh ohVar) {
        if (this.l == null) {
            this.l = new ValueAnimator().getInterpolator();
        }
        ohVar.a.animate().setInterpolator(this.l);
        b(ohVar);
    }

    private final boolean y(jhe jheVar, oh ohVar) {
        if (jheVar.b == ohVar) {
            jheVar.b = null;
        } else {
            if (jheVar.a != ohVar) {
                return false;
            }
            jheVar.a = null;
        }
        View view = ohVar.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k(ohVar);
        return true;
    }

    final void a() {
        if (j()) {
            return;
        }
        l();
    }

    @Override // defpackage.nl
    public final void b(oh ohVar) {
        View view = ohVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((jhf) arrayList.get(size)).e == ohVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                k(ohVar);
                arrayList.remove(size);
            }
        }
        v(this.p, ohVar);
        if (this.m.remove(ohVar)) {
            view.setAlpha(1.0f);
            k(ohVar);
        }
        if (this.n.remove(ohVar)) {
            view.setAlpha(1.0f);
            k(ohVar);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            v(arrayList3, ohVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.b;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((jhf) arrayList5.get(size4)).e == ohVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    k(ohVar);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.a;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f.remove(ohVar);
                this.d.remove(ohVar);
                this.g.remove(ohVar);
                this.e.remove(ohVar);
                a();
                return;
            }
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(ohVar)) {
                view.setAlpha(1.0f);
                k(ohVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.nl
    public final void c() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            oh ohVar = (oh) ((jhf) arrayList.get(size)).e;
            View view = ohVar.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            k(ohVar);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.m;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            k((oh) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.n;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            oh ohVar2 = (oh) arrayList3.get(size3);
            ohVar2.a.setAlpha(1.0f);
            k(ohVar2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.p;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                w((jhe) arrayList4.get(size4));
            }
        }
        arrayList4.clear();
        if (!j()) {
            return;
        }
        ArrayList arrayList5 = this.b;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    oh ohVar3 = (oh) ((jhf) arrayList6.get(size6)).e;
                    View view2 = ohVar3.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    k(ohVar3);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.a;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    oh ohVar4 = (oh) arrayList8.get(size8);
                    ohVar4.a.setAlpha(1.0f);
                    k(ohVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.c;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                rpi.N(this.f);
                rpi.N(this.e);
                rpi.N(this.d);
                rpi.N(this.g);
                l();
                return;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    w((jhe) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // defpackage.nl
    public final void d() {
        ArrayList arrayList = this.m;
        boolean zIsEmpty = arrayList.isEmpty();
        boolean z = !zIsEmpty;
        ArrayList arrayList2 = this.o;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.p;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        boolean z2 = !zIsEmpty3;
        ArrayList arrayList4 = this.n;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        int i = 19;
        if (!zIsEmpty4 && !zIsEmpty) {
            Collection.EL.stream(agke.n(arrayList)).forEach(new hsk(this, i));
            arrayList.clear();
            z = false;
        }
        if (!z && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z2 = true;
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oh ohVar = (oh) arrayList.get(i2);
            View view = ohVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f.add(ohVar);
            viewPropertyAnimatorAnimate.setDuration(this.i).alpha(0.0f).setListener(new jgz(this, ohVar, viewPropertyAnimatorAnimate, view)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.b.add(arrayList5);
            arrayList2.clear();
            hqa hqaVar = new hqa(this, arrayList5, 17);
            if (z) {
                View view2 = ((oh) ((jhf) arrayList5.get(0)).e).a;
                long j = this.i;
                int i3 = bac.a;
                view2.postOnAnimationDelayed(hqaVar, j);
            } else {
                hqaVar.run();
            }
        }
        if (z2) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.c.add(arrayList6);
            arrayList3.clear();
            hqa hqaVar2 = new hqa(this, arrayList6, 18);
            if (z) {
                oh ohVar2 = ((jhe) arrayList6.get(0)).a;
                if (ohVar2 != null) {
                    long j2 = this.i;
                    int i4 = bac.a;
                    ohVar2.a.postOnAnimationDelayed(hqaVar2, j2);
                }
            } else {
                hqaVar2.run();
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.a.add(arrayList7);
        arrayList4.clear();
        hqa hqaVar3 = new hqa(this, arrayList7, 19);
        if (!z && zIsEmpty2 && !z2) {
            hqaVar3.run();
            return;
        }
        long jMax = (z ? this.i : 0L) + Math.max(!zIsEmpty2 ? 250L : 0L, z2 ? 250L : 0L);
        View view3 = ((oh) arrayList7.get(0)).a;
        int i5 = bac.a;
        view3.postOnAnimationDelayed(hqaVar3, jMax);
    }

    @Override // defpackage.on
    public final boolean e(oh ohVar) {
        x(ohVar);
        ohVar.a.setAlpha(0.0f);
        this.n.add(ohVar);
        return true;
    }

    @Override // defpackage.on
    public final boolean f(oh ohVar, oh ohVar2, int i, int i2, int i3, int i4) {
        if (ohVar == ohVar2) {
            return g(ohVar, i, i2, i3, i4);
        }
        View view = ohVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        x(ohVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        if (ohVar2 != null) {
            x(ohVar2);
            View view2 = ohVar2.a;
            view2.setTranslationX(-((int) f));
            view2.setTranslationY(-((int) f2));
            view2.setAlpha(0.0f);
        }
        this.p.add(new jhe(ohVar, ohVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.on
    public final boolean g(oh ohVar, int i, int i2, int i3, int i4) {
        View view = ohVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        x(ohVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                k(ohVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.o.add(new jhf(ohVar, i5, i7, i3, i4));
        return true;
    }

    @Override // defpackage.on
    public final boolean h(oh ohVar) {
        x(ohVar);
        this.m.add(ohVar);
        return true;
    }

    @Override // defpackage.nl
    public final boolean i(oh ohVar, List list) {
        return !list.isEmpty() || n(ohVar);
    }

    @Override // defpackage.nl
    public final boolean j() {
        return (this.n.isEmpty() && this.p.isEmpty() && this.o.isEmpty() && this.m.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }
}
