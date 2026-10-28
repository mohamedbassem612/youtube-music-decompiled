package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adne extends on {
    public final Handler a;
    public final boolean b;
    public final afvq c;
    public final afvq d;
    public final afvq e;
    public final afvq f;
    public final afvq g;
    private final List l;
    private final boolean m;
    private final abxv n;

    public adne(abxv abxvVar, boolean z, boolean z2) {
        this.a = new Handler(Looper.getMainLooper(), new bwd(this, 4));
        afvq afvqVar = new afvq(1);
        this.c = afvqVar;
        afvq afvqVar2 = new afvq(2);
        this.d = afvqVar2;
        afvq afvqVar3 = new afvq(3);
        this.e = afvqVar3;
        afvq afvqVar4 = new afvq(4);
        this.f = afvqVar4;
        afvq afvqVar5 = new afvq(5);
        this.g = afvqVar5;
        this.l = Arrays.asList(afvqVar, afvqVar2, afvqVar3, afvqVar4, afvqVar5);
        abxvVar.getClass();
        this.n = abxvVar;
        this.m = z;
        this.b = z2;
    }

    private static adma x(oh ohVar) {
        return ohVar instanceof admf ? ((admf) ohVar).s : adul.d(ohVar.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    private static final void y(afvq afvqVar) {
        ?? r1 = afvqVar.c;
        ArrayList arrayList = new ArrayList((Collection) r1);
        afvqVar.d.addAll(r1);
        r1.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            adnc adncVar = (adnc) arrayList.get(i);
            if (adncVar instanceof adna) {
                ((adna) adncVar).a();
            }
            adncVar.c();
        }
    }

    public final void a() {
        if (j()) {
            return;
        }
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [adnc, java.lang.Object] */
    @Override // defpackage.nl
    public final void b(oh ohVar) {
        for (afvq afvqVar : this.l) {
            ?? r2 = afvqVar.b;
            adz adzVar = (adz) r2.get(ohVar);
            if (adzVar != null) {
                ?? r4 = afvqVar.c;
                ?? r5 = adzVar.b;
                r4.remove(r5);
                afvqVar.d.remove(r5);
                int i = 0;
                while (true) {
                    oh[] ohVarArr = (oh[]) adzVar.c;
                    if (i >= ohVarArr.length) {
                        break;
                    }
                    r2.remove(ohVarArr[i]);
                    i++;
                }
                this.a.removeMessages(afvqVar.a, r5);
                if (!adzVar.a) {
                    adzVar.a = true;
                    r5.b();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.nl
    public final void c() {
        for (afvq afvqVar : this.l) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ?? r3 = afvqVar.c;
            arrayDeque.addAll(r3);
            ?? r4 = afvqVar.d;
            arrayDeque.addAll(r4);
            r3.clear();
            r4.clear();
            afvqVar.b.clear();
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((adnc) it.next()).b();
            }
            this.a.removeMessages(afvqVar.a);
        }
    }

    @Override // defpackage.nl
    public final void d() {
        afvq afvqVar = this.d;
        y(afvqVar);
        afvq afvqVar2 = this.f;
        y(afvqVar2);
        if (w(afvqVar) || w(afvqVar2)) {
            return;
        }
        afvq afvqVar3 = this.e;
        y(afvqVar3);
        if (w(afvqVar3)) {
            return;
        }
        y(this.c);
        y(this.g);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.on
    public final boolean e(oh ohVar) {
        adma admaVarX;
        adnl adnlVar = (adnl) abxv.U((ahto) this.n.d, ohVar);
        if (adnlVar == null || (admaVarX = x(ohVar)) == null) {
            k(ohVar);
            return false;
        }
        adnlVar.a = new adnb(admaVarX, this.h, new abmn(13), new adab(this, adnlVar, ohVar, 6));
        adnlVar.a.a.a().setAlpha(0.0f);
        b(ohVar);
        afvq afvqVar = this.c;
        afvqVar.c.add(adnlVar);
        afvqVar.b.put(ohVar, new adz(adnlVar, ohVar));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.on
    public final boolean f(oh ohVar, oh ohVar2, int i, int i2, int i3, int i4) {
        if (ohVar == ohVar2) {
            k(ohVar);
            return false;
        }
        abxv abxvVar = this.n;
        Class clsM = abxv.M(ohVar);
        Class clsM2 = abxv.M(ohVar2);
        byte[] bArr = null;
        adnn adnnVar = (clsM == null || clsM2 == null) ? null : (adnn) ((ahto) abxvVar.a).f(new axq(clsM, clsM2));
        if (adnnVar != null) {
            adma admaVarX = x(ohVar);
            adma admaVarX2 = x(ohVar2);
            if (admaVarX != null && admaVarX2 != null) {
                View view = ohVar.a;
                int width = view.getWidth();
                View view2 = ohVar2.a;
                afvq afvqVar = (width > view2.getWidth() || view.getHeight() > view2.getHeight()) ? this.g : this.f;
                adnd adndVar = new adnd(this, ohVar, ohVar2, adnnVar, afvqVar);
                adnnVar.a = new adnj(admaVarX, admaVarX2, new abmn(10), new acnp(adndVar, ohVar, 15, bArr), new abmn(12), new acnp(adndVar, ohVar2, 16, bArr), i, i2, i3, i4);
                adnj adnjVar = adnnVar.a;
                adnnVar.b = adnjVar.j - adnjVar.h;
                adnnVar.c = adnjVar.k - adnjVar.i;
                View viewA = adnjVar.a.a();
                float translationX = adnnVar.b - viewA.getTranslationX();
                float translationY = adnnVar.c - viewA.getTranslationY();
                View viewA2 = adnjVar.b.a();
                viewA2.setAlpha(0.0f);
                viewA2.setTranslationX(-translationX);
                viewA2.setTranslationY(-translationY);
                b(ohVar);
                b(ohVar2);
                afvqVar.c.add(adnnVar);
                adz adzVar = new adz(adnnVar, ohVar, ohVar2);
                ?? r1 = afvqVar.b;
                r1.put(ohVar, adzVar);
                r1.put(ohVar2, adzVar);
                return true;
            }
        }
        k(ohVar);
        k(ohVar2);
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.on
    public final boolean g(oh ohVar, int i, int i2, int i3, int i4) {
        afvq afvqVar = this.e;
        ?? r1 = afvqVar.b;
        adz adzVar = (adz) r1.get(ohVar);
        if (adzVar != null) {
            adnm adnmVar = (adnm) adzVar.b;
            adnf adnfVar = new adnf(i, i2, i3, i4);
            if (adnm.e(((adnh) adnmVar.b).a(adnfVar))) {
                ViewPropertyAnimator viewPropertyAnimator = adnmVar.a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.setListener(null).cancel();
                    adnmVar.a = null;
                }
                adnmVar.b = ((adnh) adnmVar.b).a(adnfVar);
                k(ohVar);
                ?? r9 = afvqVar.c;
                if (!r9.contains(adnmVar)) {
                    r9.add(adnmVar);
                }
                afvqVar.d.remove(adnmVar);
                return true;
            }
        }
        adnm adnmVar2 = (adnm) abxv.U((ahto) this.n.b, ohVar);
        if (adnmVar2 != null) {
            adma admaVarX = x(ohVar);
            adng adngVar = new adng();
            adngVar.b(250L);
            adngVar.f(new abmn(14));
            adngVar.e(new adab(this, adnmVar2, ohVar, 7));
            adngVar.c(i);
            adngVar.d(i2);
            adngVar.g(i3);
            adngVar.h(i4);
            if (admaVarX != null) {
                adngVar.a = admaVarX;
            } else if (ohVar != null) {
                adngVar.b = ohVar.a;
            }
            adnmVar2.b = adngVar.a();
            if (adnm.e((adnh) adnmVar2.b)) {
                b(ohVar);
                afvqVar.c.add(adnmVar2);
                r1.put(ohVar, new adz(adnmVar2, ohVar));
                return true;
            }
        }
        k(ohVar);
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.on
    public final boolean h(oh ohVar) {
        adma admaVarX;
        adnm adnmVar = (adnm) abxv.U((ahto) this.n.c, ohVar);
        if (adnmVar == null || (admaVarX = x(ohVar)) == null) {
            k(ohVar);
            return false;
        }
        adnmVar.b = new adni(admaVarX, this.i, new abmn(11), new adab(this, adnmVar, ohVar, 5));
        b(ohVar);
        afvq afvqVar = this.d;
        afvqVar.c.add(adnmVar);
        afvqVar.b.put(ohVar, new adz(adnmVar, ohVar));
        return true;
    }

    @Override // defpackage.nl
    public final boolean j() {
        return aguu.Q(this.l, new wix(16));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.nl
    public final void m(oh ohVar) {
        for (afvq afvqVar : this.l) {
            adz adzVar = (adz) afvqVar.b.get(ohVar);
            if (adzVar != null) {
                Handler handler = this.a;
                int i = afvqVar.a;
                Object obj = adzVar.b;
                if (handler.hasMessages(i, obj)) {
                    handler.removeMessages(i, obj);
                    if (!w(afvqVar)) {
                        handler.post(new acqu(this, 9));
                    }
                }
            }
        }
    }

    public final boolean v(oh ohVar) {
        return (this.m && !this.b && ohVar.a.getParent() == null) ? false : true;
    }

    public final boolean w(afvq afvqVar) {
        return this.a.hasMessages(afvqVar.a);
    }

    public adne() {
        this(new abxv(), false, false);
    }
}
