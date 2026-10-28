package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asc {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public asc(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        return View.MeasureSpec.getMode(i2) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i3 == View.MeasureSpec.getSize(i2);
    }

    public final void a(ard ardVar, arl arlVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        int i3;
        if (ardVar != null) {
            if (ardVar.ah == 8) {
                arlVar.c = 0;
                arlVar.d = 0;
                arlVar.e = 0;
                return;
            }
            if (ardVar.U != null) {
                int i4 = arlVar.i;
                int i5 = arlVar.j;
                int i6 = arlVar.a;
                int i7 = arlVar.b;
                int i8 = this.b + this.c;
                int i9 = this.d;
                Object obj = ardVar.ag;
                int i10 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i10 == 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else if (i10 == 1) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9, -2);
                } else if (i10 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9, -2);
                    int i11 = ardVar.s;
                    int i12 = arlVar.h;
                    if (i12 == 1 || i12 == 2) {
                        int measuredHeight = ((View) obj).getMeasuredHeight();
                        int iH = ardVar.h();
                        if (arlVar.h == 2 || i11 != 1 || measuredHeight == iH || (obj instanceof asn) || ardVar.e()) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(ardVar.j(), 1073741824);
                        }
                    }
                } else if (i10 != 3) {
                    iMakeMeasureSpec = 0;
                } else {
                    int i13 = this.f;
                    arc arcVar = ardVar.J;
                    int i14 = arcVar != null ? arcVar.f : 0;
                    arc arcVar2 = ardVar.L;
                    if (arcVar2 != null) {
                        i14 += arcVar2.f;
                    }
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i9 + i14, -1);
                }
                int i15 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                if (i15 == 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else if (i15 == 1) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                } else if (i15 == 2) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                    int i16 = ardVar.t;
                    int i17 = arlVar.h;
                    if (i17 == 1 || i17 == 2) {
                        int measuredWidth = ((View) obj).getMeasuredWidth();
                        int iJ = ardVar.j();
                        if (arlVar.h == 2 || i16 != 1 || measuredWidth == iJ || (obj instanceof asn) || ardVar.f()) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(ardVar.h(), 1073741824);
                        }
                    }
                } else if (i15 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i18 = this.g;
                    int i19 = ardVar.J != null ? ardVar.K.f : 0;
                    if (ardVar.L != null) {
                        i19 += ardVar.M.f;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i8 + i19, -1);
                }
                ard ardVar2 = ardVar.U;
                if (ardVar2 != null && ari.b(this.h.f, SemanticState.Hidden)) {
                    View view = (View) obj;
                    if (view.getMeasuredWidth() == ardVar.j() && view.getMeasuredWidth() < ardVar2.j() && view.getMeasuredHeight() == ardVar.h() && view.getMeasuredHeight() < ardVar2.h() && view.getBaseline() == ardVar.ab && !ardVar.J() && b(ardVar.H, iMakeMeasureSpec, ardVar.j()) && b(ardVar.I, iMakeMeasureSpec2, ardVar.h())) {
                        arlVar.c = ardVar.j();
                        arlVar.d = ardVar.h();
                        arlVar.e = ardVar.ab;
                        return;
                    }
                }
                boolean z = i4 == 3;
                boolean z2 = i5 == 3;
                boolean z3 = i5 == 4 || i5 == 1;
                boolean z4 = i4 == 4 || i4 == 1;
                boolean z5 = z && ardVar.X > 0.0f;
                boolean z6 = z2 && ardVar.X > 0.0f;
                if (obj != null) {
                    View view2 = (View) obj;
                    asb asbVar = (asb) view2.getLayoutParams();
                    boolean z7 = z4;
                    int i20 = arlVar.h;
                    if (i20 != 1 && i20 != 2 && z && ardVar.s == 0 && z2 && ardVar.t == 0) {
                        i = -1;
                        baseline = 0;
                        iMax = 0;
                        iMax2 = 0;
                    } else {
                        if ((obj instanceof asq) && (ardVar instanceof arj)) {
                            throw null;
                        }
                        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        ardVar.z(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth2 = view2.getMeasuredWidth();
                        int measuredHeight2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                        int i21 = ardVar.v;
                        iMax = i21 > 0 ? Math.max(i21, measuredWidth2) : measuredWidth2;
                        int i22 = ardVar.w;
                        if (i22 > 0) {
                            iMax = Math.min(i22, iMax);
                        }
                        int i23 = ardVar.y;
                        iMax2 = i23 > 0 ? Math.max(i23, measuredHeight2) : measuredHeight2;
                        int i24 = ardVar.z;
                        if (i24 > 0) {
                            iMax2 = Math.min(i24, iMax2);
                        }
                        if (!ari.b(this.h.f, 1)) {
                            if (z5 && z3) {
                                iMax = (int) ((iMax2 * ardVar.X) + 0.5f);
                            } else if (z6 && z7) {
                                iMax2 = (int) ((iMax / ardVar.X) + 0.5f);
                            }
                        }
                        if (measuredWidth2 == iMax) {
                            i2 = measuredHeight2 != iMax2 ? 1073741824 : 1073741824;
                            i = -1;
                        } else {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight2 != iMax2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i2);
                        }
                        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        ardVar.z(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view2.getMeasuredWidth();
                        iMax2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                        i = -1;
                    }
                    boolean z8 = baseline != i;
                    arlVar.g = (iMax == arlVar.a && iMax2 == arlVar.b) ? false : true;
                    boolean z9 = asbVar.ag | z8;
                    if (!z9) {
                        i3 = baseline;
                    } else if (baseline != -1) {
                        if (ardVar.ab != baseline) {
                            arlVar.g = true;
                        }
                        i3 = baseline;
                    } else {
                        i3 = -1;
                    }
                    arlVar.c = iMax;
                    arlVar.d = iMax2;
                    arlVar.f = z9;
                    arlVar.e = i3;
                }
            }
        }
    }
}
