package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.litho.ComponentTree;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fqz extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public int A;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public int B;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public int C;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public mmk D;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public int E;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public fhz F;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean a;

    @fmt(a = 6)
    @fmu(a = fmv.a)
    public List b;

    @fmt(a = 10)
    @fmu(a = fmv.a)
    public fgy c;

    @fmt(a = 0)
    @fmu(a = fmv.a)
    public float d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int f;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public long g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public String r;

    @fmt(a = 0)
    @fmu(a = fmv.a)
    public float s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public String t;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Integer v;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public long w;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public fti x;

    @fmt(a = 3)
    @fmu(a = fmv.f)
    public boolean y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public int z;

    public fqz() {
        super("HorizontalScroll");
        this.f = -1;
        this.u = 1;
        this.y = true;
    }

    private static final fqy aE(fhd fhdVar) {
        return (fqy) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new frc(context);
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        fqx fqxVar = (fqx) fizVar;
        fqx fqxVar2 = (fqx) fizVar2;
        fqxVar.a = fqxVar2.a;
        fqxVar.b = fqxVar2.b;
        fqxVar.c = fqxVar2.c;
        fqxVar.d = fqxVar2.d;
        fqxVar.e = fqxVar2.e;
        fqxVar.f = fqxVar2.f;
        fqxVar.g = fqxVar2.g;
        fqxVar.h = fqxVar2.h;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        fqy fqyVarAE = aE(fhdVar);
        fgy fgyVar = this.c;
        abh abhVar = new abh(this.f);
        fhm fhmVarD = ComponentTree.d(fhdVar, fgyVar);
        fhmVarD.d = false;
        ComponentTree componentTreeA = fhmVarD.a();
        fqyVarAE.b = abhVar;
        fqyVarAE.a = componentTreeA;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0141  */
    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        int i;
        float f;
        float f2;
        int iM;
        int iM2;
        int i2;
        long j;
        fqy fqyVarAE = aE(fhdVar);
        frc frcVar = (frc) obj;
        boolean z = this.y;
        fhz fhzVar = this.F;
        mmk mmkVar = this.D;
        fti ftiVar = this.x;
        int i3 = this.u;
        boolean z2 = this.q;
        boolean z3 = this.a;
        float f3 = this.d;
        long j2 = this.g;
        float f4 = this.s;
        String str = this.r;
        String str2 = this.t;
        long j3 = this.w;
        Integer num = this.v;
        abh abhVar = fqyVarAE.b;
        fqx fqxVar = (fqx) fizVar;
        Integer num2 = fqxVar.b;
        Integer num3 = fqxVar.a;
        Integer num4 = fqxVar.h;
        fwl fwlVar = fqxVar.c;
        ComponentTree componentTree = fqxVar.g;
        frcVar.setHorizontalScrollBarEnabled(z);
        frcVar.setOverScrollMode(i3);
        int iIntValue = num2 != null ? num2.intValue() : 0;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        boolean z4 = true;
        frcVar.a.K(componentTree, true);
        frcVar.h = abhVar;
        frcVar.f = mmkVar;
        frcVar.b = iIntValue;
        frcVar.c = iIntValue2;
        if (ftiVar != null) {
            frcVar.g = new fqm();
            frcVar.g.a = ftiVar;
        }
        frcVar.getViewTreeObserver().addOnPreDrawListener(new fra(frcVar, num, abhVar, fwlVar));
        if (fhzVar != null) {
            fhzVar.o(frcVar);
        }
        int iIntValue3 = num2.intValue();
        num3.intValue();
        int iIntValue4 = num4.intValue();
        frcVar.d = !z2;
        if (z2) {
            if (z3 || iIntValue4 < iIntValue3) {
                DisplayMetrics displayMetrics = fhdVar.c().getDisplayMetrics();
                int iHashCode = str.hashCode();
                if (iHashCode == 1075628947) {
                    if (!str.equals("MARQUEE_SCROLL_DIRECTION_RIGHT_TO_LEFT")) {
                    }
                    i = iIntValue3 / 2;
                    if (f4 >= 0.0f) {
                        f = f4;
                    } else {
                        f = 0.0f;
                    }
                    f2 = f / 2.0f;
                    iM = fhz.m(displayMetrics, f2) + i;
                    if (z4) {
                        i2 = iIntValue3 - iIntValue4;
                        iM2 = (i - fhz.m(displayMetrics, f2)) - iIntValue4;
                    } else {
                        iM2 = iM;
                        i2 = 0;
                    }
                    frcVar.e = ValueAnimator.ofInt(i2, iM2);
                    if ("MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE".equals(str2)) {
                        frcVar.e.setInterpolator(new AccelerateDecelerateInterpolator());
                    } else {
                        frcVar.e.setInterpolator(new LinearInterpolator());
                    }
                    float fL = fhz.l(displayMetrics, iM) * 1000.0f;
                    if (j3 > 0) {
                        j = j3;
                    } else {
                        j = 100;
                    }
                    frcVar.e.setDuration(((long) fL) / j);
                    frcVar.e.setStartDelay((long) (1000.0f * f3));
                    if (j2 > 0) {
                        frcVar.e.setRepeatCount(((int) j2) - 1);
                    } else {
                        frcVar.e.setRepeatCount(-1);
                    }
                    frcVar.e.addListener(new frb(frcVar, f3, z4, iIntValue3));
                    frcVar.e.addUpdateListener(new pr(frcVar, 3));
                    frcVar.e.start();
                }
                if (iHashCode == 1663720443 && str.equals("MARQUEE_SCROLL_DIRECTION_LEFT_TO_RIGHT")) {
                    z4 = false;
                }
                i = iIntValue3 / 2;
                if (f4 >= 0.0f) {
                    f = f4;
                } else {
                    f = 0.0f;
                }
                f2 = f / 2.0f;
                iM = fhz.m(displayMetrics, f2) + i;
                if (z4) {
                    i2 = iIntValue3 - iIntValue4;
                    iM2 = (i - fhz.m(displayMetrics, f2)) - iIntValue4;
                } else {
                    iM2 = iM;
                    i2 = 0;
                }
                frcVar.e = ValueAnimator.ofInt(i2, iM2);
                if ("MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE".equals(str2)) {
                    frcVar.e.setInterpolator(new AccelerateDecelerateInterpolator());
                } else {
                    frcVar.e.setInterpolator(new LinearInterpolator());
                }
                float fL2 = fhz.l(displayMetrics, iM) * 1000.0f;
                if (j3 > 0) {
                    j = j3;
                } else {
                    j = 100;
                }
                frcVar.e.setDuration(((long) fL2) / j);
                frcVar.e.setStartDelay((long) (1000.0f * f3));
                if (j2 > 0) {
                    frcVar.e.setRepeatCount(((int) j2) - 1);
                } else {
                    frcVar.e.setRepeatCount(-1);
                }
                frcVar.e.addListener(new frb(frcVar, f3, z4, iIntValue3));
                frcVar.e.addUpdateListener(new pr(frcVar, 3));
                frcVar.e.start();
                if (fwlVar != fwl.RTL) {
                    z4 = false;
                }
                i = iIntValue3 / 2;
                if (f4 >= 0.0f) {
                    f = f4;
                } else {
                    f = 0.0f;
                }
                f2 = f / 2.0f;
                iM = fhz.m(displayMetrics, f2) + i;
                if (z4) {
                    i2 = iIntValue3 - iIntValue4;
                    iM2 = (i - fhz.m(displayMetrics, f2)) - iIntValue4;
                } else {
                    iM2 = iM;
                    i2 = 0;
                }
                frcVar.e = ValueAnimator.ofInt(i2, iM2);
                if ("MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE".equals(str2)) {
                    frcVar.e.setInterpolator(new AccelerateDecelerateInterpolator());
                } else {
                    frcVar.e.setInterpolator(new LinearInterpolator());
                }
                float fL3 = fhz.l(displayMetrics, iM) * 1000.0f;
                if (j3 > 0) {
                    j = j3;
                } else {
                    j = 100;
                }
                frcVar.e.setDuration(((long) fL3) / j);
                frcVar.e.setStartDelay((long) (1000.0f * f3));
                if (j2 > 0) {
                    frcVar.e.setRepeatCount(((int) j2) - 1);
                } else {
                    frcVar.e.setRepeatCount(-1);
                }
                frcVar.e.addListener(new frb(frcVar, f3, z4, iIntValue3));
                frcVar.e.addUpdateListener(new pr(frcVar, 3));
                frcVar.e.start();
            }
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        fqy fqyVar = (fqy) fkyVar;
        fqy fqyVar2 = (fqy) fkyVar2;
        fqyVar2.a = fqyVar.a;
        fqyVar2.b = fqyVar.b;
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        int i;
        ComponentTree componentTreeA;
        Integer numValueOf;
        fqy fqyVarAE = aE(fhdVar);
        fgy fgyVar = this.c;
        boolean z = this.e;
        boolean z2 = this.q;
        List list = this.b;
        int i2 = this.E;
        int i3 = this.A;
        int i4 = this.C;
        int i5 = this.B;
        int i6 = this.z;
        boolean z3 = this.a;
        float f = this.s;
        ComponentTree componentTree = fqyVarAE.a;
        fqx fqxVar = (fqx) fizVar;
        Integer num = fqxVar.f;
        Integer numValueOf2 = fqxVar.d;
        ComponentTree componentTree2 = fqxVar.e;
        int iG = (fjiVar.g() - fjiVar.d()) - fjiVar.e();
        int i7 = true != z ? 0 : iG;
        if (num == null || numValueOf2 == null || componentTree2 == null) {
            fkw fkwVar = new fkw();
            componentTree.u(fgyVar, 0, View.MeasureSpec.makeMeasureSpec(fjiVar.b(), 1073741824), fkwVar);
            int iMax = Math.max(fkwVar.a, i7);
            int i8 = fkwVar.b;
            Integer numValueOf3 = Integer.valueOf(iMax);
            numValueOf2 = Integer.valueOf(i8);
            if (!z2 || ((!z3 && iG >= fkwVar.a) || list == null || list.isEmpty())) {
                i = iG;
                componentTreeA = componentTree;
            } else {
                int i9 = fkwVar.a;
                i = iG;
                fgy fgyVarN = fhz.n(fhdVar, list, i, i9, f, i2, i3, i4, i5, i6);
                fhm fhmVarC = ComponentTree.c(fhd.e(fhdVar), fgyVarN, null);
                fhmVarC.d = false;
                componentTreeA = fhmVarC.a();
                componentTreeA.u(fgyVarN, 0, View.MeasureSpec.makeMeasureSpec(fjiVar.b(), 1073741824), fkwVar);
                numValueOf3 = Integer.valueOf(Math.max(fkwVar.a, true == z ? i : 0));
                numValueOf2 = Integer.valueOf(fkwVar.b);
            }
            numValueOf = numValueOf3;
        } else {
            numValueOf = Integer.valueOf(Math.max(num.intValue(), i7));
            i = iG;
            componentTreeA = componentTree2;
        }
        Integer numValueOf4 = Integer.valueOf(i);
        fwl fwlVarM = fjiVar.m();
        fqxVar.b = numValueOf;
        fqxVar.a = numValueOf2;
        fqxVar.h = numValueOf4;
        fqxVar.c = fwlVarM;
        fqxVar.g = componentTreeA;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        fqy fqyVarAE = aE(fhdVar);
        fgy fgyVar = this.c;
        boolean z = this.q;
        List list = this.b;
        int i3 = this.E;
        int i4 = this.A;
        int i5 = this.C;
        int i6 = this.B;
        int i7 = this.z;
        boolean z2 = this.a;
        float f = this.s;
        ComponentTree componentTree = fqyVarAE.a;
        fkw fkwVar2 = new fkw();
        componentTree.u(fgyVar, 0, i2, fkwVar2);
        if (fkwVar2.a == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            componentTree.u(fgyVar, i, i2, fkwVar2);
        }
        int i8 = fkwVar2.a;
        int i9 = fkwVar2.b;
        Integer numValueOf = Integer.valueOf(i8);
        Integer numValueOf2 = Integer.valueOf(i9);
        fkwVar.a = View.MeasureSpec.getMode(i) == 0 ? i8 : View.MeasureSpec.getSize(i);
        fkwVar.b = i9;
        int size = View.MeasureSpec.getMode(i) == 0 ? i8 : View.MeasureSpec.getSize(i);
        if (z && ((z2 || size < i8) && list != null && !list.isEmpty())) {
            fgy fgyVarN = fhz.n(fhdVar, list, size, i8, f, i3, i4, i5, i6, i7);
            fhm fhmVarC = ComponentTree.c(fhd.e(fhdVar), fgyVarN, null);
            fhmVarC.d = false;
            ComponentTree componentTreeA = fhmVarC.a();
            componentTreeA.u(fgyVarN, 0, i2, fkwVar2);
            if (fkwVar2.a == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
                componentTreeA.u(fgyVarN, i, i2, fkwVar2);
            }
            numValueOf = Integer.valueOf(fkwVar2.a);
            numValueOf2 = Integer.valueOf(fkwVar2.b);
            fkwVar.a = View.MeasureSpec.getMode(i) == 0 ? fkwVar2.a : View.MeasureSpec.getSize(i);
            fkwVar.b = fkwVar2.b;
            componentTree = componentTreeA;
        }
        fqx fqxVar = (fqx) fizVar;
        fqxVar.f = numValueOf;
        fqxVar.d = numValueOf2;
        fqxVar.e = componentTree;
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        frc frcVar = (frc) obj;
        fhz fhzVar = this.F;
        frcVar.a.K(null, false);
        frcVar.b = 0;
        frcVar.c = 0;
        frcVar.h = null;
        frcVar.f = null;
        ValueAnimator valueAnimator = frcVar.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            frcVar.e = null;
        }
        frcVar.setScrollX(0);
        fqm fqmVar = frcVar.g;
        if (fqmVar != null) {
            fqmVar.a = null;
            frcVar.g = null;
        }
        frcVar.setScrollX(0);
        frcVar.d = true;
        if (fhzVar != null) {
            fhzVar.o(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x015d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0162  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        fgy fgyVar2;
        fhz fhzVar;
        int i;
        int i2;
        String str;
        String str2;
        mmk mmkVar;
        Integer num;
        fti ftiVar;
        int i3;
        fgy fgyVar3;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            fqz fqzVar = (fqz) fgyVar;
            int i4 = this.z;
            if (i4 == 0 ? fqzVar.z == 0 : i4 == fqzVar.z) {
                int i5 = this.A;
                if (i5 == 0 ? fqzVar.A == 0 : i5 == fqzVar.A) {
                    if (this.a == fqzVar.a) {
                        List list = this.b;
                        if (list != null) {
                            if (fqzVar.b != null && list.size() == fqzVar.b.size()) {
                                Iterator it = this.b.iterator();
                                Iterator it2 = fqzVar.b.iterator();
                                while (it.hasNext() && it2.hasNext()) {
                                    fgy fgyVar4 = (fgy) it.next();
                                    fgy fgyVar5 = (fgy) it2.next();
                                    boolean z = fna.a;
                                    if (!fgyVar4.g(fgyVar5)) {
                                    }
                                }
                                fgyVar2 = this.c;
                                if (fgyVar2 != null) {
                                    fgyVar3 = fqzVar.c;
                                    boolean z2 = fna.a;
                                    if (fgyVar2.g(fgyVar3)) {
                                        if (Float.compare(this.d, fqzVar.d) == 0 && ((fhzVar = this.F) == null ? fqzVar.F == null : fhzVar.equals(fqzVar.F)) && this.e == fqzVar.e && ((i = this.E) == 0 ? fqzVar.E == 0 : i == fqzVar.E) && this.f == fqzVar.f && ((i2 = this.B) == 0 ? fqzVar.B == 0 : i2 == fqzVar.B) && this.g == fqzVar.g && this.q == fqzVar.q && ((str = this.r) == null ? fqzVar.r == null : str.equals(fqzVar.r)) && Float.compare(this.s, fqzVar.s) == 0 && ((str2 = this.t) == null ? fqzVar.t == null : str2.equals(fqzVar.t)) && ((mmkVar = this.D) == null ? fqzVar.D == null : mmkVar.equals(fqzVar.D)) && this.u == fqzVar.u && ((num = this.v) == null ? fqzVar.v == null : num.equals(fqzVar.v)) && this.w == fqzVar.w && ((ftiVar = this.x) == null ? fqzVar.x == null : ftiVar.equals(fqzVar.x)) && this.y == fqzVar.y) {
                                            i3 = this.C;
                                            if (i3 != 0) {
                                                if (i3 == fqzVar.C) {
                                                    return true;
                                                }
                                            } else if (fqzVar.C == 0) {
                                                return true;
                                            }
                                        }
                                    }
                                } else if (fqzVar.c == null) {
                                    if (Float.compare(this.d, fqzVar.d) == 0) {
                                        i3 = this.C;
                                        if (i3 != 0) {
                                            if (i3 == fqzVar.C) {
                                                return true;
                                            }
                                        } else if (fqzVar.C == 0) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else if (fqzVar.b == null) {
                            fgyVar2 = this.c;
                            if (fgyVar2 != null) {
                                fgyVar3 = fqzVar.c;
                                boolean z3 = fna.a;
                                if (fgyVar2.g(fgyVar3)) {
                                    if (Float.compare(this.d, fqzVar.d) == 0) {
                                        i3 = this.C;
                                        if (i3 != 0) {
                                            if (i3 == fqzVar.C) {
                                                return true;
                                            }
                                        } else if (fqzVar.C == 0) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (fqzVar.c == null) {
                                if (Float.compare(this.d, fqzVar.d) == 0) {
                                    i3 = this.C;
                                    if (i3 != 0) {
                                        if (i3 == fqzVar.C) {
                                            return true;
                                        }
                                    } else if (fqzVar.C == 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        fqz fqzVar = (fqz) super.l();
        fgy fgyVar = fqzVar.c;
        fqzVar.c = fgyVar != null ? fgyVar.l() : null;
        return fqzVar;
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new fqx();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new fqy();
    }
}
