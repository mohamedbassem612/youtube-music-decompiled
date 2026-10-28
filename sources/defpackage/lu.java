package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lu extends on {
    private static TimeInterpolator l;
    public ArrayList a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    ArrayList f;
    public ArrayList g;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;

    public lu() {
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    private final void v(List list, oh ohVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            lt ltVar = (lt) list.get(size);
            if (y(ltVar, ohVar) && ltVar.a == null && ltVar.b == null) {
                list.remove(ltVar);
            }
        }
    }

    private final void w(lt ltVar) {
        oh ohVar = ltVar.a;
        if (ohVar != null) {
            y(ltVar, ohVar);
        }
        oh ohVar2 = ltVar.b;
        if (ohVar2 != null) {
            y(ltVar, ohVar2);
        }
    }

    private final void x(oh ohVar) {
        if (l == null) {
            l = new ValueAnimator().getInterpolator();
        }
        ohVar.a.animate().setInterpolator(l);
        b(ohVar);
    }

    private final boolean y(lt ltVar, oh ohVar) {
        if (ltVar.b == ohVar) {
            ltVar.b = null;
        } else {
            if (ltVar.a != ohVar) {
                return false;
            }
            ltVar.a = null;
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
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((jhf) this.o.get(size)).e == ohVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                k(ohVar);
                this.o.remove(size);
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
        int size2 = this.c.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            v(arrayList, ohVar);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        int size3 = this.b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((jhf) arrayList2.get(size4)).e == ohVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    k(ohVar);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.b.remove(size3);
                    break;
                }
            }
        }
        int size5 = this.a.size();
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
            ArrayList arrayList3 = (ArrayList) this.a.get(size5);
            if (arrayList3.remove(ohVar)) {
                view.setAlpha(1.0f);
                k(ohVar);
                if (arrayList3.isEmpty()) {
                    this.a.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.nl
    public final void c() {
        ArrayList arrayList;
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            oh ohVar = (oh) ((jhf) this.o.get(size)).e;
            View view = ohVar.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            k(ohVar);
            this.o.remove(size);
        }
        int size2 = this.m.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            k((oh) this.m.get(size2));
            this.m.remove(size2);
        }
        int size3 = this.n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            oh ohVar2 = (oh) this.n.get(size3);
            ohVar2.a.setAlpha(1.0f);
            k(ohVar2);
            this.n.remove(size3);
        }
        int size4 = this.p.size();
        while (true) {
            size4--;
            arrayList = this.p;
            if (size4 < 0) {
                break;
            } else {
                w((lt) arrayList.get(size4));
            }
        }
        arrayList.clear();
        if (!j()) {
            return;
        }
        int size5 = this.b.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.b.get(size5);
            int size6 = arrayList2.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    oh ohVar3 = (oh) ((jhf) arrayList2.get(size6)).e;
                    View view2 = ohVar3.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    k(ohVar3);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(arrayList2);
                    }
                }
            }
        }
        int size7 = this.a.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) this.a.get(size7);
            int size8 = arrayList3.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    oh ohVar4 = (oh) arrayList3.get(size8);
                    ohVar4.a.setAlpha(1.0f);
                    k(ohVar4);
                    arrayList3.remove(size8);
                    if (arrayList3.isEmpty()) {
                        this.a.remove(arrayList3);
                    }
                }
            }
        }
        int size9 = this.c.size();
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
            ArrayList arrayList4 = (ArrayList) this.c.get(size9);
            int size10 = arrayList4.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    w((lt) arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.c.remove(arrayList4);
                    }
                }
            }
        }
    }

    @Override // defpackage.nl
    public final void d() {
        boolean zIsEmpty = this.m.isEmpty();
        boolean zIsEmpty2 = this.o.isEmpty();
        boolean zIsEmpty3 = this.p.isEmpty();
        boolean z = !zIsEmpty3;
        boolean zIsEmpty4 = this.n.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4) {
            if (zIsEmpty3) {
                return;
            } else {
                z = true;
            }
        }
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oh ohVar = (oh) arrayList.get(i);
            View view = ohVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f.add(ohVar);
            viewPropertyAnimatorAnimate.setDuration(this.i).alpha(0.0f).setListener(new lo(this, ohVar, viewPropertyAnimatorAnimate, view)).start();
        }
        this.m.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.o);
            this.b.add(arrayList2);
            this.o.clear();
            bg bgVar = new bg(this, arrayList2, 8, (char[]) null);
            if (zIsEmpty) {
                bgVar.run();
            } else {
                View view2 = ((oh) ((jhf) arrayList2.get(0)).e).a;
                long j = this.i;
                int i2 = bac.a;
                view2.postOnAnimationDelayed(bgVar, j);
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.p);
            this.c.add(arrayList3);
            this.p.clear();
            bg bgVar2 = new bg(this, arrayList3, 9, (char[]) null);
            if (zIsEmpty) {
                bgVar2.run();
            } else {
                View view3 = ((lt) arrayList3.get(0)).a.a;
                long j2 = this.i;
                int i3 = bac.a;
                view3.postOnAnimationDelayed(bgVar2, j2);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.n);
        this.a.add(arrayList4);
        this.n.clear();
        bg bgVar3 = new bg(this, arrayList4, 10, (char[]) null);
        if (zIsEmpty && zIsEmpty2 && !z) {
            bgVar3.run();
            return;
        }
        long jMax = (!zIsEmpty ? this.i : 0L) + Math.max(!zIsEmpty2 ? 250L : 0L, z ? 250L : 0L);
        View view4 = ((oh) arrayList4.get(0)).a;
        int i4 = bac.a;
        view4.postOnAnimationDelayed(bgVar3, jMax);
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
        this.p.add(new lt(ohVar, ohVar2, i, i2, i3, i4));
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

    public lu(byte[] bArr) {
        this();
        u();
    }

    public lu(char[] cArr) {
        this();
        u();
    }
}
