package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import defpackage.aad;
import defpackage.aqu;
import defpackage.ara;
import defpackage.ard;
import defpackage.are;
import defpackage.arg;
import defpackage.arh;
import defpackage.ari;
import defpackage.arj;
import defpackage.ark;
import defpackage.arm;
import defpackage.aro;
import defpackage.ars;
import defpackage.aru;
import defpackage.arv;
import defpackage.arx;
import defpackage.arz;
import defpackage.asb;
import defpackage.asc;
import defpackage.asl;
import defpackage.asm;
import defpackage.asn;
import defpackage.asp;
import defpackage.xsc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final are c;
    public int d;
    protected boolean e;
    public int f;
    public asl g;
    final asc h;
    private int i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new are();
        this.d = 0;
        this.i = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new asc(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) {
        are areVar = this.c;
        areVar.ag = this;
        asc ascVar = this.h;
        areVar.aG = ascVar;
        areVar.a.g = ascVar;
        this.a.put(getId(), this);
        this.g = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, asp.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.d);
                } else if (index == 17) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.i);
                } else if (index == 14) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.f = typedArrayObtainStyledAttributes.getInt(113, this.f);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            aad.e(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        asl aslVar = new asl();
                        this.g = aslVar;
                        aslVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.g = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.U(this.f);
    }

    private final void f() {
        this.e = true;
    }

    /* JADX WARN: Code duplicated, block: B:256:0x0495  */
    private final void g() throws Throwable {
        boolean z;
        boolean z2;
        ard ardVar;
        ard ardVar2;
        ard ardVar3;
        ard ardVar4;
        ard ardVar5;
        asb asbVar;
        ard ardVar6;
        int i;
        int i2;
        float fAbs;
        Throwable th;
        int i3;
        Throwable th2;
        arh arhVar;
        ard ardVarB;
        ard ardVar7;
        ConstraintLayout constraintLayout = this;
        boolean zIsInEditMode = constraintLayout.isInEditMode();
        int childCount = constraintLayout.getChildCount();
        boolean z3 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            ard ardVarB2 = constraintLayout.b(constraintLayout.getChildAt(i4));
            if (ardVarB2 != null) {
                ardVarB2.s();
            }
        }
        Throwable th3 = null;
        if (zIsInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = constraintLayout.getChildAt(i5);
                try {
                    String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    Integer numValueOf = Integer.valueOf(id);
                    if (resourceName instanceof String) {
                        if (constraintLayout.m == null) {
                            constraintLayout.m = new HashMap();
                        }
                        int iIndexOf = resourceName.indexOf("/");
                        String strSubstring = iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName;
                        numValueOf.getClass();
                        constraintLayout.m.put(strSubstring, Integer.valueOf(id));
                    }
                    int iIndexOf2 = resourceName.indexOf(47);
                    if (iIndexOf2 != -1) {
                        resourceName = resourceName.substring(iIndexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        ardVar7 = constraintLayout.c;
                    } else {
                        View viewFindViewById = (View) constraintLayout.a.get(id2);
                        if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(viewFindViewById);
                        }
                        ardVar7 = viewFindViewById == constraintLayout ? constraintLayout.c : viewFindViewById == null ? null : ((asb) viewFindViewById.getLayoutParams()).av;
                    }
                    ardVar7.ai = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout.l != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = constraintLayout.getChildAt(i6);
                if (childAt2.getId() == constraintLayout.l && (childAt2 instanceof asm)) {
                    throw null;
                }
            }
        }
        asl aslVar = constraintLayout.g;
        if (aslVar != null) {
            aslVar.i(constraintLayout);
        }
        are areVar = constraintLayout.c;
        areVar.aI.clear();
        ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        int i7 = 1;
        if (size > 0) {
            int i8 = 0;
            while (i8 < size) {
                arz arzVar = (arz) arrayList.get(i8);
                if (arzVar.isInEditMode()) {
                    arzVar.e(arzVar.f);
                }
                arh arhVar2 = arzVar.i;
                if (arhVar2 == null) {
                    th = th3;
                    i3 = i7;
                } else {
                    arhVar2.as = 0;
                    Arrays.fill(arhVar2.ar, th3);
                    int i9 = 0;
                    while (i9 < arzVar.d) {
                        int i10 = arzVar.c[i9];
                        View viewA = constraintLayout.a(i10);
                        if (viewA == null) {
                            HashMap map = arzVar.h;
                            String str = (String) map.get(Integer.valueOf(i10));
                            th2 = th3;
                            int iD = arzVar.d(constraintLayout, str);
                            if (iD != 0) {
                                arzVar.c[i9] = iD;
                                map.put(Integer.valueOf(iD), str);
                                viewA = constraintLayout.a(iD);
                            }
                        } else {
                            th2 = th3;
                        }
                        if (viewA != null && (ardVarB = constraintLayout.b(viewA)) != (arhVar = arzVar.i) && ardVarB != null) {
                            int i11 = arhVar.as + i7;
                            ard[] ardVarArr = arhVar.ar;
                            int length = ardVarArr.length;
                            if (i11 > length) {
                                arhVar.ar = (ard[]) Arrays.copyOf(ardVarArr, length << 1);
                            }
                            ard[] ardVarArr2 = arhVar.ar;
                            int i12 = arhVar.as;
                            ardVarArr2[i12] = ardVarB;
                            arhVar.as = i12 + 1;
                        }
                        i9++;
                        th3 = th2;
                        i7 = i7;
                    }
                    th = th3;
                    i3 = i7;
                    arh arhVar3 = arzVar.i;
                }
                i8++;
                th3 = th;
                i7 = i3;
            }
        }
        Throwable th4 = th3;
        int i13 = i7;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = constraintLayout.getChildAt(i14);
            if (childAt3 instanceof asn) {
                throw th4;
            }
        }
        SparseArray sparseArray = constraintLayout.n;
        sparseArray.clear();
        sparseArray.put(0, areVar);
        sparseArray.put(constraintLayout.getId(), areVar);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = constraintLayout.getChildAt(i15);
            sparseArray.put(childAt4.getId(), constraintLayout.b(childAt4));
        }
        int i16 = 0;
        while (i16 < childCount) {
            View childAt5 = constraintLayout.getChildAt(i16);
            ard ardVarB3 = constraintLayout.b(childAt5);
            if (ardVarB3 != null) {
                asb asbVar2 = (asb) childAt5.getLayoutParams();
                areVar.aI.add(ardVarB3);
                ard ardVar8 = ardVarB3.U;
                if (ardVar8 != null) {
                    ((ark) ardVar8).Y(ardVarB3);
                }
                ardVarB3.U = areVar;
                asbVar2.a();
                asbVar2.aw = z3;
                ardVarB3.ah = childAt5.getVisibility();
                boolean z4 = asbVar2.aj;
                ardVarB3.ag = childAt5;
                if (childAt5 instanceof arz) {
                    ((arz) childAt5).b(ardVarB3, areVar.c);
                }
                if (asbVar2.ah) {
                    arg argVar = (arg) ardVarB3;
                    int i17 = asbVar2.as;
                    int i18 = asbVar2.at;
                    float f = asbVar2.au;
                    if (f != -1.0f) {
                        if (f > -1.0f) {
                            argVar.a = f;
                            argVar.b = -1;
                            argVar.c = -1;
                        }
                    } else if (i17 != -1) {
                        if (i17 >= 0) {
                            argVar.a = -1.0f;
                            argVar.b = i17;
                            argVar.c = -1;
                        }
                    } else if (i18 != -1 && i18 >= 0) {
                        argVar.a = -1.0f;
                        argVar.b = -1;
                        argVar.c = i18;
                    }
                    z = zIsInEditMode;
                    z2 = z3;
                } else {
                    int i19 = asbVar2.al;
                    int i20 = asbVar2.am;
                    int i21 = asbVar2.an;
                    int i22 = asbVar2.ao;
                    int i23 = asbVar2.ap;
                    int i24 = asbVar2.aq;
                    float f2 = asbVar2.ar;
                    int i25 = asbVar2.p;
                    z = zIsInEditMode;
                    if (i25 != -1) {
                        ard ardVar9 = (ard) sparseArray.get(i25);
                        if (ardVar9 != null) {
                            float f3 = asbVar2.r;
                            ardVarB3.O(7, ardVar9, 7, asbVar2.q, 0);
                            ardVarB3.E = f3;
                        }
                        ardVar6 = ardVarB3;
                        asbVar = asbVar2;
                    } else {
                        if (i19 != -1) {
                            ard ardVar10 = (ard) sparseArray.get(i19);
                            if (ardVar10 != null) {
                                ardVar = ardVarB3;
                                ardVar.O(2, ardVar10, 2, asbVar2.leftMargin, i23);
                            } else {
                                ardVar = ardVarB3;
                            }
                        } else {
                            ardVar = ardVarB3;
                            if (i20 != -1 && (ardVar2 = (ard) sparseArray.get(i20)) != null) {
                                ardVar.O(2, ardVar2, 4, asbVar2.leftMargin, i23);
                            }
                        }
                        if (i21 != -1) {
                            ard ardVar11 = (ard) sparseArray.get(i21);
                            if (ardVar11 != null) {
                                ardVar.O(4, ardVar11, 2, asbVar2.rightMargin, i24);
                            }
                        } else if (i22 != -1 && (ardVar3 = (ard) sparseArray.get(i22)) != null) {
                            ardVar.O(4, ardVar3, 4, asbVar2.rightMargin, i24);
                        }
                        int i26 = asbVar2.i;
                        if (i26 != -1) {
                            ard ardVar12 = (ard) sparseArray.get(i26);
                            if (ardVar12 != null) {
                                ardVar.O(3, ardVar12, 3, asbVar2.topMargin, asbVar2.x);
                            }
                        } else {
                            int i27 = asbVar2.j;
                            if (i27 != -1 && (ardVar4 = (ard) sparseArray.get(i27)) != null) {
                                ardVar.O(3, ardVar4, 5, asbVar2.topMargin, asbVar2.x);
                            }
                        }
                        int i28 = asbVar2.k;
                        if (i28 != -1) {
                            ard ardVar13 = (ard) sparseArray.get(i28);
                            if (ardVar13 != null) {
                                ardVar.O(5, ardVar13, 3, asbVar2.bottomMargin, asbVar2.z);
                            }
                        } else {
                            int i29 = asbVar2.l;
                            if (i29 != -1 && (ardVar5 = (ard) sparseArray.get(i29)) != null) {
                                ardVar.O(5, ardVar5, 5, asbVar2.bottomMargin, asbVar2.z);
                            }
                        }
                        asbVar = asbVar2;
                        int i30 = asbVar.m;
                        if (i30 != -1) {
                            ardVar6 = ardVar;
                            h(ardVar6, asbVar, sparseArray, i30, 6);
                        } else {
                            int i31 = asbVar.n;
                            if (i31 != -1) {
                                ardVar6 = ardVar;
                                h(ardVar6, asbVar, sparseArray, i31, 3);
                            } else {
                                int i32 = asbVar.o;
                                if (i32 != -1) {
                                    ardVar6 = ardVar;
                                    h(ardVar6, asbVar, sparseArray, i32, 5);
                                } else {
                                    ardVar6 = ardVar;
                                }
                            }
                        }
                        if (f2 >= 0.0f) {
                            ardVar6.ae = f2;
                        }
                        float f4 = asbVar.H;
                        if (f4 >= 0.0f) {
                            ardVar6.af = f4;
                        }
                    }
                    if (z) {
                        int i33 = asbVar.X;
                        if (i33 != -1) {
                            int i34 = asbVar.Y;
                            ardVar6.Z = i33;
                            ardVar6.aa = i34;
                        } else if (asbVar.Y != -1) {
                            i33 = -1;
                            int i35 = asbVar.Y;
                            ardVar6.Z = i33;
                            ardVar6.aa = i35;
                        }
                    }
                    if (asbVar.ae) {
                        ardVar6.P(i13);
                        ardVar6.C(asbVar.width);
                        if (asbVar.width == -2) {
                            ardVar6.P(2);
                        }
                    } else if (asbVar.width == -1) {
                        if (asbVar.aa) {
                            ardVar6.P(3);
                        } else {
                            ardVar6.P(4);
                        }
                        ardVar6.K(2).f = asbVar.leftMargin;
                        ardVar6.K(4).f = asbVar.rightMargin;
                    } else {
                        ardVar6.P(3);
                        ardVar6.C(0);
                    }
                    if (asbVar.af) {
                        ardVar6.Q(1);
                        ardVar6.x(asbVar.height);
                        if (asbVar.height == -2) {
                            ardVar6.Q(2);
                        }
                    } else if (asbVar.height == -1) {
                        if (asbVar.ab) {
                            ardVar6.Q(3);
                        } else {
                            ardVar6.Q(4);
                        }
                        ardVar6.K(3).f = asbVar.topMargin;
                        ardVar6.K(5).f = asbVar.bottomMargin;
                    } else {
                        ardVar6.Q(3);
                        ardVar6.x(0);
                    }
                    String str2 = asbVar.I;
                    if (str2 == null || str2.length() == 0) {
                        ardVar6.X = 0.0f;
                    } else {
                        int length2 = str2.length();
                        int iIndexOf3 = str2.indexOf(44);
                        if (iIndexOf3 <= 0 || iIndexOf3 >= length2 - 1) {
                            i = -1;
                            i2 = 0;
                        } else {
                            String strSubstring2 = str2.substring(0, iIndexOf3);
                            i = strSubstring2.equalsIgnoreCase("W") ? 0 : strSubstring2.equalsIgnoreCase("H") ? 1 : -1;
                            i2 = iIndexOf3 + 1;
                        }
                        int iIndexOf4 = str2.indexOf(58);
                        if (iIndexOf4 < 0 || iIndexOf4 >= length2 - 1) {
                            String strSubstring3 = str2.substring(i2);
                            if (strSubstring3.length() > 0) {
                                fAbs = Float.parseFloat(strSubstring3);
                            } else {
                                fAbs = 0.0f;
                            }
                        } else {
                            String strSubstring4 = str2.substring(i2, iIndexOf4);
                            String strSubstring5 = str2.substring(iIndexOf4 + 1);
                            if (strSubstring4.length() <= 0 || strSubstring5.length() <= 0) {
                                fAbs = 0.0f;
                            } else {
                                try {
                                    float f5 = Float.parseFloat(strSubstring4);
                                    float f6 = Float.parseFloat(strSubstring5);
                                    if (f5 <= 0.0f || f6 <= 0.0f) {
                                        fAbs = 0.0f;
                                    } else {
                                        fAbs = i == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                    }
                                } catch (NumberFormatException unused2) {
                                }
                            }
                        }
                        if (fAbs > 0.0f) {
                            ardVar6.X = fAbs;
                            ardVar6.Y = i;
                        }
                    }
                    float f7 = asbVar.L;
                    float[] fArr = ardVar6.al;
                    z2 = false;
                    fArr[0] = f7;
                    i13 = 1;
                    fArr[1] = asbVar.M;
                    ardVar6.aj = asbVar.N;
                    ardVar6.ak = asbVar.O;
                    int i36 = asbVar.ad;
                    if (i36 >= 0 && i36 <= 3) {
                        ardVar6.r = i36;
                    }
                    int i37 = asbVar.P;
                    int i38 = asbVar.R;
                    int i39 = asbVar.T;
                    float f8 = asbVar.V;
                    ardVar6.s = i37;
                    ardVar6.v = i38;
                    if (i39 == Integer.MAX_VALUE) {
                        i39 = 0;
                    }
                    ardVar6.w = i39;
                    ardVar6.x = f8;
                    if (f8 > 0.0f && f8 < 1.0f && i37 == 0) {
                        ardVar6.s = 2;
                    }
                    int i40 = asbVar.Q;
                    int i41 = asbVar.S;
                    int i42 = asbVar.U;
                    float f9 = asbVar.W;
                    ardVar6.t = i40;
                    ardVar6.y = i41;
                    if (i42 == Integer.MAX_VALUE) {
                        i42 = 0;
                    }
                    ardVar6.z = i42;
                    ardVar6.A = f9;
                    if (f9 > 0.0f && f9 < 1.0f && i40 == 0) {
                        ardVar6.t = 2;
                    }
                }
            } else {
                z = zIsInEditMode;
                z2 = z3;
            }
            i16++;
            constraintLayout = this;
            z3 = z2;
            zIsInEditMode = z;
        }
    }

    private final void h(ard ardVar, asb asbVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        ard ardVar2 = (ard) sparseArray.get(i);
        if (ardVar2 == null || view == null || !(view.getLayoutParams() instanceof asb)) {
            return;
        }
        asbVar.ag = true;
        if (i2 == 6) {
            asb asbVar2 = (asb) view.getLayoutParams();
            asbVar2.ag = true;
            asbVar2.av.F = true;
        }
        ardVar.K(6).j(ardVar2.K(i2), asbVar.D, asbVar.C);
        ardVar.F = true;
        ardVar.K(3).d();
        ardVar.K(5).d();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final ard b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof asb) {
                return ((asb) view.getLayoutParams()).av;
            }
            view.setLayoutParams(new asb(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof asb) {
                return ((asb) view.getLayoutParams()).av;
            }
        }
        return null;
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof asb;
    }

    public final Object d(Object obj) {
        HashMap map;
        if ((obj instanceof String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        float f = (Integer.parseInt(strArrSplit[3]) / 1920.0f) * height;
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f2 = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f3 = i7;
                        float f4 = i6;
                        canvas.drawLine(f3, f4, f2, f4, paint);
                        float f5 = i6 + ((int) f);
                        canvas.drawLine(f2, f4, f2, f5, paint);
                        canvas.drawLine(f2, f5, f3, f5, paint);
                        canvas.drawLine(f3, f5, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f2, f5, paint);
                        canvas.drawLine(f3, f5, f2, f4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new asb();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new asb(getContext(), attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            asb asbVar = (asb) childAt.getLayoutParams();
            ard ardVar = asbVar.av;
            if (childAt.getVisibility() != 8 || asbVar.ah || asbVar.ai) {
                boolean z2 = asbVar.aj;
                int iK = ardVar.k();
                int iL = ardVar.l();
                childAt.layout(iK, iL, ardVar.j() + iK, ardVar.h() + iL);
                if (!(childAt instanceof asn)) {
                    throw null;
                }
            } else {
                boolean z3 = asbVar.ak;
                if (zIsInEditMode) {
                    boolean z4 = asbVar.aj;
                    int iK2 = ardVar.k();
                    int iL2 = ardVar.l();
                    childAt.layout(iK2, iL2, ardVar.j() + iK2, ardVar.h() + iL2);
                    if (!(childAt instanceof asn)) {
                        throw null;
                    }
                } else {
                    continue;
                }
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0230 A[DONT_INVERT, PHI: r7
      0x0230: PHI (r7v1 int) = (r7v0 int), (r7v29 int) binds: [B:96:0x0223, B:98:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:101:0x0232  */
    /* JADX WARN: Code duplicated, block: B:102:0x0234  */
    /* JADX WARN: Code duplicated, block: B:105:0x0239  */
    /* JADX WARN: Code duplicated, block: B:107:0x024d  */
    /* JADX WARN: Code duplicated, block: B:108:0x024f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0260  */
    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:121:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0275  */
    /* JADX WARN: Code duplicated, block: B:127:0x0283  */
    /* JADX WARN: Code duplicated, block: B:129:0x028e A[LOOP:12: B:128:0x028c->B:129:0x028e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:138:0x0301  */
    /* JADX WARN: Code duplicated, block: B:139:0x0304  */
    /* JADX WARN: Code duplicated, block: B:141:0x0307  */
    /* JADX WARN: Code duplicated, block: B:142:0x030a  */
    /* JADX WARN: Code duplicated, block: B:144:0x030e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0319  */
    /* JADX WARN: Code duplicated, block: B:151:0x032c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0345 A[EDGE_INSN: B:153:0x0345->B:155:0x035d BREAK  A[LOOP:3: B:145:0x0317->B:389:?]] */
    /* JADX WARN: Code duplicated, block: B:154:0x035b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0367  */
    /* JADX WARN: Code duplicated, block: B:161:0x036c  */
    /* JADX WARN: Code duplicated, block: B:163:0x038a  */
    /* JADX WARN: Code duplicated, block: B:165:0x038d  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x03be  */
    /* JADX WARN: Code duplicated, block: B:177:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:181:0x03db  */
    /* JADX WARN: Code duplicated, block: B:197:0x040b  */
    /* JADX WARN: Code duplicated, block: B:198:0x040d A[PHI: r7
      0x040d: PHI (r7v16 int) = (r7v2 int), (r7v22 int) binds: [B:120:0x0271, B:197:0x040b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:200:0x0415  */
    /* JADX WARN: Code duplicated, block: B:202:0x0420 A[LOOP:13: B:201:0x041e->B:202:0x0420, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0477  */
    /* JADX WARN: Code duplicated, block: B:207:0x0497  */
    /* JADX WARN: Code duplicated, block: B:208:0x049e  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:214:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:219:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:223:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:225:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:250:0x0526  */
    /* JADX WARN: Code duplicated, block: B:277:0x0560  */
    /* JADX WARN: Code duplicated, block: B:279:0x0567  */
    /* JADX WARN: Code duplicated, block: B:284:0x057c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0584 A[LOOP:7: B:283:0x057a->B:286:0x0584, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:291:0x0593  */
    /* JADX WARN: Code duplicated, block: B:293:0x0596 A[LOOP:8: B:292:0x0594->B:293:0x0596, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:296:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:298:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:300:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:302:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:304:0x0604  */
    /* JADX WARN: Code duplicated, block: B:306:0x060a  */
    /* JADX WARN: Code duplicated, block: B:311:0x0627  */
    /* JADX WARN: Code duplicated, block: B:313:0x062d  */
    /* JADX WARN: Code duplicated, block: B:318:0x064b  */
    /* JADX WARN: Code duplicated, block: B:322:0x065e  */
    /* JADX WARN: Code duplicated, block: B:324:0x0661  */
    /* JADX WARN: Code duplicated, block: B:326:0x066b  */
    /* JADX WARN: Code duplicated, block: B:328:0x066f  */
    /* JADX WARN: Code duplicated, block: B:341:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:344:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:346:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:351:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:353:0x06de  */
    /* JADX WARN: Code duplicated, block: B:359:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:366:0x071a A[LOOP:10: B:321:0x065c->B:366:0x071a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:368:0x072b  */
    /* JADX WARN: Code duplicated, block: B:372:0x0769  */
    /* JADX WARN: Code duplicated, block: B:374:0x076c  */
    /* JADX WARN: Code duplicated, block: B:381:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0587 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0728 A[EDGE_INSN: B:413:0x0728->B:367:0x0728 BREAK  A[LOOP:10: B:321:0x065c->B:366:0x071a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x070b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x01be  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5 A[PHI: r6
      0x01f5: PHI (r6v72 boolean) = (r6v71 boolean), (r6v76 boolean) binds: [B:81:0x01f0, B:83:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x021b A[PHI: r2 r6 r11
      0x021b: PHI (r2v5 int[]) = (r2v4 int[]), (r2v37 int[]) binds: [B:70:0x01c1, B:381:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r6v6 boolean) = (r6v5 boolean), (r6v68 boolean) binds: [B:70:0x01c1, B:381:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r11v4 int) = (r11v3 int), (r11v48 int) binds: [B:70:0x01c1, B:381:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0227  */
    /* JADX WARN: Code duplicated, block: B:99:0x022a  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) throws Throwable {
        int i3;
        int iMax;
        int iMax2;
        int i4;
        boolean z;
        int[] iArr;
        xsc xscVar;
        asc ascVar;
        int size;
        boolean zB;
        int iJ;
        int iH;
        boolean z2;
        int[] iArr2;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        int i7;
        boolean zV;
        int i8;
        ArrayList arrayList;
        int size2;
        asc ascVar2;
        int i9;
        int iM;
        int iN;
        int iMax3;
        int iMax4;
        int i10;
        boolean zAI;
        int i11;
        int i12;
        int i13;
        asc ascVar3;
        ArrayList arrayList2;
        ard ardVar;
        int iJ2;
        int iH2;
        int i14;
        ArrayList arrayList3;
        asc ascVar4;
        int iJ3;
        int iH3;
        ard ardVar2;
        int iJ4;
        int iH4;
        int iJ5;
        int iH5;
        int size3;
        boolean zW;
        int i15;
        ConstraintLayout constraintLayout;
        int childCount;
        int i16;
        ArrayList arrayList4;
        int size4;
        int i17;
        View childAt;
        ard ardVar3;
        int i18;
        boolean z6;
        int i19;
        int i20;
        boolean z7;
        aru aruVar;
        arv arvVar;
        boolean z8;
        boolean z9;
        int iMin;
        int iMin2;
        int iMin3;
        int iMin4;
        boolean z10;
        boolean z11;
        boolean z12;
        aro aroVar;
        boolean z13;
        int i21;
        ArrayList arrayList5;
        int size5;
        int i22;
        aro aroVar2;
        ArrayList arrayList6;
        int size6;
        int i23;
        int i24;
        are areVar;
        int iL;
        int iL2;
        int iK;
        int iL3;
        boolean z14;
        int i25;
        boolean z15;
        int i26;
        int[] iArr3;
        int i27;
        int i28;
        boolean z16;
        ArrayList arrayList7;
        int size7;
        int i29;
        boolean z17;
        int size8;
        int i30;
        arx arxVar;
        ArrayList arrayList8;
        int size9;
        int i31;
        boolean zE;
        int i32;
        ard ardVar4;
        boolean z18;
        int iM2;
        int i33;
        boolean z19;
        if (!this.e) {
            int childCount2 = getChildCount();
            for (int i34 = 0; i34 < childCount2; i34++) {
                if (getChildAt(i34).isLayoutRequested()) {
                    this.e = true;
                    break;
                }
            }
        }
        are areVar2 = this.c;
        areVar2.c = c();
        if (this.e) {
            this.e = false;
            int childCount3 = getChildCount();
            for (int i35 = 0; i35 < childCount3; i35++) {
                if (getChildAt(i35).isLayoutRequested()) {
                    g();
                    areVar2.aH.aH(areVar2);
                    break;
                }
            }
        }
        aqu aquVar = areVar2.d;
        int i36 = this.f;
        int mode = View.MeasureSpec.getMode(i);
        int size10 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size11 = View.MeasureSpec.getSize(i2);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i37 = iMax5 + iMax6;
        int iMax7 = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax8 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (iMax8 > 0) {
            iMax7 = iMax8;
        }
        asc ascVar5 = this.h;
        ascVar5.b = iMax5;
        ascVar5.c = iMax6;
        ascVar5.d = iMax7;
        ascVar5.e = i37;
        ascVar5.f = i;
        ascVar5.g = i2;
        int iMax9 = Math.max(0, getPaddingStart());
        int iMax10 = Math.max(0, getPaddingEnd());
        if (iMax9 <= 0 && iMax10 <= 0) {
            iMax9 = Math.max(0, getPaddingLeft());
        } else if (c()) {
            iMax9 = iMax10;
        }
        int i38 = size10 - iMax7;
        int i39 = size11 - i37;
        int i40 = ascVar5.e;
        int i41 = ascVar5.d;
        int childCount4 = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (childCount4 == 0) {
                    childCount4 = 0;
                    iMax = Math.max(0, this.d);
                } else {
                    iMax = 0;
                }
                i3 = 2;
            } else if (mode != 1073741824) {
                i41 = i41;
                i3 = 1;
                iMax = 0;
            } else {
                i41 = i41;
                iMax = Math.min(this.j - i41, i38);
                i3 = 1;
            }
        } else if (childCount4 == 0) {
            i41 = i41;
            iMax = Math.max(0, this.d);
            i3 = 2;
            childCount4 = 0;
        } else {
            i41 = i41;
            i3 = 2;
            iMax = i38;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                iMax2 = childCount4 == 0 ? Math.max(0, this.i) : 0;
            } else if (mode2 != 1073741824) {
                i4 = 1;
                iMax2 = 0;
            } else {
                iMax2 = Math.min(this.k - i40, i39);
                i4 = 1;
            }
            if (iMax == areVar2.j() || iMax2 != areVar2.h()) {
                z = true;
                areVar2.a.c = true;
            } else {
                z = true;
            }
            areVar2.Z = 0;
            areVar2.aa = 0;
            boolean z20 = z;
            int i42 = this.j - i41;
            iArr = areVar2.D;
            iArr[0] = i42;
            iArr[z20 ? 1 : 0] = this.k - i40;
            areVar2.B(0);
            areVar2.A(0);
            areVar2.P(i3);
            areVar2.C(iMax);
            areVar2.Q(i4);
            areVar2.x(iMax2);
            areVar2.B(this.d - i41);
            areVar2.A(this.i - i40);
            areVar2.ar = iMax9;
            areVar2.as = iMax5;
            xscVar = areVar2.aH;
            ascVar = areVar2.aG;
            size = areVar2.aI.size();
            zB = ari.b(i36, SemanticState.Focused);
            iJ = areVar2.j();
            iH = areVar2.h();
            if (!zB || ari.b(i36, 64)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i32 = 0;
                while (true) {
                    if (i32 < size) {
                        iArr2 = iArr;
                        ardVar4 = (ard) areVar2.aI.get(i32);
                        z18 = z2;
                        iM2 = ardVar4.M();
                        i5 = size;
                        int iN2 = ardVar4.N();
                        i33 = i32;
                        if (iM2 == 3 || iN2 != 3 || ardVar4.X <= 0.0f) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        if (ardVar4.H()) {
                            if (!z19) {
                                z19 = false;
                                if (ardVar4.I()) {
                                    i32 = i33 + 1;
                                    iArr = iArr2;
                                    z2 = z18;
                                    size = i5;
                                } else {
                                    i32 = i33 + 1;
                                    iArr = iArr2;
                                    z2 = z18;
                                    size = i5;
                                }
                            }
                        } else if ((ardVar4.I() || !z19) && !(ardVar4 instanceof arj) && !ardVar4.H() && !ardVar4.I()) {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z2 = z18;
                            size = i5;
                        }
                        i6 = 1073741824;
                        z3 = false;
                    } else {
                        iArr2 = iArr;
                        z3 = z2;
                        i5 = size;
                        i6 = 1073741824;
                    }
                }
            } else {
                iArr2 = iArr;
                z3 = z2;
                i5 = size;
                i6 = 1073741824;
            }
            if (mode != i6) {
                if (zB) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (mode2 != i6) {
                mode = 1073741824;
                if (zB) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = true;
                mode = 1073741824;
                mode2 = 1073741824;
            }
            z5 = z3 & z4;
            if (z5) {
                iMin3 = Math.min(iArr2[0], i38);
                iMin4 = Math.min(iArr2[1], i39);
                if (mode == 1073741824) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (mode == 1073741824 && areVar2.j() != iMin3) {
                    areVar2.C(iMin3);
                    areVar2.c();
                }
                if (mode2 == 1073741824) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (mode2 == 1073741824 && areVar2.h() != iMin4) {
                    areVar2.x(iMin4);
                    areVar2.c();
                }
                if (mode != 1073741824) {
                    z12 = z11;
                    aroVar = areVar2.a;
                    if (aroVar.b) {
                        are areVar3 = aroVar.a;
                        arrayList5 = areVar3.aI;
                        size5 = arrayList5.size();
                        i22 = 0;
                        while (i22 < size5) {
                            ArrayList arrayList9 = arrayList5;
                            ard ardVar5 = (ard) arrayList5.get(i22);
                            ardVar5.r();
                            ardVar5.e = false;
                            boolean z21 = z10;
                            aru aruVar2 = ardVar5.h;
                            aruVar2.e.i = false;
                            aruVar2.g = false;
                            aruVar2.g();
                            arv arvVar2 = ardVar5.i;
                            arvVar2.e.i = false;
                            arvVar2.g = false;
                            arvVar2.g();
                            i22++;
                            size5 = size5;
                            arrayList5 = arrayList9;
                            z10 = z21;
                        }
                        z13 = z10;
                        i21 = 0;
                        areVar3.r();
                        areVar3.e = false;
                        aru aruVar3 = areVar3.h;
                        aruVar3.e.i = false;
                        aruVar3.g = false;
                        aruVar3.g();
                        arv arvVar3 = areVar3.i;
                        arvVar3.e.i = false;
                        arvVar3.g = false;
                        arvVar3.g();
                        aroVar.b();
                    } else {
                        z13 = z10;
                        i21 = 0;
                    }
                    aroVar.d(aroVar.d);
                    are areVar4 = aroVar.a;
                    areVar4.Z = i21;
                    areVar4.aa = i21;
                    areVar4.h.h.c(i21);
                    areVar4.i.h.c(i21);
                    if (mode == 1073741824) {
                        zV = areVar2.V(zB, i21);
                        i7 = 1;
                    } else {
                        i7 = 0;
                        zV = true;
                    }
                    if (mode2 == 1073741824) {
                        zV &= areVar2.V(zB, 1);
                        i7++;
                    }
                } else if (mode2 == 1073741824) {
                    aroVar2 = areVar2.a;
                    if (!aroVar2.b || aroVar2.c) {
                        are areVar5 = aroVar2.a;
                        arrayList6 = areVar5.aI;
                        size6 = arrayList6.size();
                        i23 = 0;
                        while (i23 < size6) {
                            ard ardVar6 = (ard) arrayList6.get(i23);
                            ardVar6.r();
                            ardVar6.e = false;
                            ardVar6.h.g();
                            ardVar6.i.g();
                            i23++;
                            z11 = z11;
                        }
                        z12 = z11;
                        areVar5.r();
                        i24 = 0;
                        areVar5.e = false;
                        areVar5.h.g();
                        areVar5.i.g();
                        aroVar2.c = false;
                    } else {
                        z12 = z11;
                        i24 = 0;
                    }
                    aroVar2.d(aroVar2.d);
                    areVar = aroVar2.a;
                    areVar.Z = i24;
                    areVar.aa = i24;
                    iL = areVar.L(i24);
                    iL2 = areVar.L(1);
                    if (aroVar2.b) {
                        aroVar2.b();
                    }
                    iK = areVar.k();
                    iL3 = areVar.l();
                    areVar.h.h.c(iK);
                    areVar.i.h.c(iL3);
                    aroVar2.c();
                    if (iL != 2) {
                        if (iL2 == 2) {
                            z14 = true;
                            z15 = !zB;
                            i25 = 2;
                        } else {
                            i26 = iK;
                        }
                        iArr3 = areVar.aq;
                        i27 = iArr3[0];
                        if (i27 != 1 || i27 == 4) {
                            int iJ6 = i26 + areVar.j();
                            areVar.h.i.c(iJ6);
                            areVar.h.e.c(iJ6 - i26);
                            aroVar2.c();
                            i28 = iArr3[1];
                            if (i28 != 1 || i28 == 4) {
                                int iH6 = areVar.h() + iL3;
                                areVar.i.i.c(iH6);
                                areVar.i.e.c(iH6 - iL3);
                            }
                            aroVar2.c();
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        arrayList7 = aroVar2.e;
                        size7 = arrayList7.size();
                        i29 = 0;
                        while (i29 < size7) {
                            arxVar = (arx) arrayList7.get(i29);
                            boolean z22 = z16;
                            if (arxVar.d == areVar || arxVar.g) {
                                arxVar.c();
                            }
                            i29++;
                            z16 = z22;
                        }
                        z17 = z16;
                        size8 = arrayList7.size();
                        i30 = 0;
                        while (true) {
                            if (i30 < size8) {
                                zV = true;
                                break;
                            }
                            arx arxVar2 = (arx) arrayList7.get(i30);
                            if ((!z17 || arxVar2.d != areVar) && (!arxVar2.h.i || ((!arxVar2.i.i && !(arxVar2 instanceof ars)) || (!arxVar2.e.i && !(arxVar2 instanceof arm) && !(arxVar2 instanceof ars))))) {
                                zV = false;
                                break;
                            }
                            i30++;
                        }
                        areVar.P(iL);
                        areVar.Q(iL2);
                        z13 = z10;
                        i7 = 2;
                    } else {
                        z14 = true;
                        if (zB) {
                            i25 = iL2;
                            z15 = false;
                        } else {
                            i25 = iL2;
                            z15 = true;
                        }
                    }
                    if (z14 != z15) {
                        arrayList8 = aroVar2.e;
                        size9 = arrayList8.size();
                        i26 = iK;
                        i31 = 0;
                        do {
                            if (i31 < size9) {
                                if (iL == 2) {
                                    areVar.P(1);
                                    areVar.C(aroVar2.a(areVar, 0));
                                    areVar.h.e.c(areVar.j());
                                    iL = 2;
                                }
                                if (i25 == 2) {
                                    break;
                                }
                                areVar.Q(1);
                                areVar.x(aroVar2.a(areVar, 1));
                                areVar.i.e.c(areVar.h());
                                break;
                            }
                            zE = ((arx) arrayList8.get(i31)).e();
                            i31++;
                        } while (zE);
                    } else {
                        i26 = iK;
                    }
                    iL2 = i25;
                    iArr3 = areVar.aq;
                    i27 = iArr3[0];
                    if (i27 != 1) {
                        int iJ7 = i26 + areVar.j();
                        areVar.h.i.c(iJ7);
                        areVar.h.e.c(iJ7 - i26);
                        aroVar2.c();
                        i28 = iArr3[1];
                        if (i28 != 1) {
                            int iH7 = areVar.h() + iL3;
                            areVar.i.i.c(iH7);
                            areVar.i.e.c(iH7 - iL3);
                        } else {
                            int iH8 = areVar.h() + iL3;
                            areVar.i.i.c(iH8);
                            areVar.i.e.c(iH8 - iL3);
                        }
                        aroVar2.c();
                        z16 = true;
                    } else {
                        int iJ8 = i26 + areVar.j();
                        areVar.h.i.c(iJ8);
                        areVar.h.e.c(iJ8 - i26);
                        aroVar2.c();
                        i28 = iArr3[1];
                        if (i28 != 1) {
                            int iH9 = areVar.h() + iL3;
                            areVar.i.i.c(iH9);
                            areVar.i.e.c(iH9 - iL3);
                        } else {
                            int iH10 = areVar.h() + iL3;
                            areVar.i.i.c(iH10);
                            areVar.i.e.c(iH10 - iL3);
                        }
                        aroVar2.c();
                        z16 = true;
                    }
                    arrayList7 = aroVar2.e;
                    size7 = arrayList7.size();
                    i29 = 0;
                    while (i29 < size7) {
                        arxVar = (arx) arrayList7.get(i29);
                        boolean z23 = z16;
                        if (arxVar.d == areVar) {
                            arxVar.c();
                        } else {
                            arxVar.c();
                        }
                        i29++;
                        z16 = z23;
                    }
                    z17 = z16;
                    size8 = arrayList7.size();
                    i30 = 0;
                    while (true) {
                        if (i30 < size8) {
                            zV = true;
                            break;
                        }
                        arx arxVar3 = (arx) arrayList7.get(i30);
                        if (!z17) {
                            zV = false;
                            break;
                        } else {
                            zV = false;
                            break;
                        }
                        i30++;
                    }
                    areVar.P(iL);
                    areVar.Q(iL2);
                    z13 = z10;
                    i7 = 2;
                } else {
                    mode = 1073741824;
                    z12 = z11;
                    aroVar = areVar2.a;
                    if (aroVar.b) {
                        are areVar6 = aroVar.a;
                        arrayList5 = areVar6.aI;
                        size5 = arrayList5.size();
                        i22 = 0;
                        while (i22 < size5) {
                            ArrayList arrayList10 = arrayList5;
                            ard ardVar7 = (ard) arrayList5.get(i22);
                            ardVar7.r();
                            ardVar7.e = false;
                            boolean z24 = z10;
                            aru aruVar4 = ardVar7.h;
                            aruVar4.e.i = false;
                            aruVar4.g = false;
                            aruVar4.g();
                            arv arvVar4 = ardVar7.i;
                            arvVar4.e.i = false;
                            arvVar4.g = false;
                            arvVar4.g();
                            i22++;
                            size5 = size5;
                            arrayList5 = arrayList10;
                            z10 = z24;
                        }
                        z13 = z10;
                        i21 = 0;
                        areVar6.r();
                        areVar6.e = false;
                        aru aruVar5 = areVar6.h;
                        aruVar5.e.i = false;
                        aruVar5.g = false;
                        aruVar5.g();
                        arv arvVar5 = areVar6.i;
                        arvVar5.e.i = false;
                        arvVar5.g = false;
                        arvVar5.g();
                        aroVar.b();
                    } else {
                        z13 = z10;
                        i21 = 0;
                    }
                    aroVar.d(aroVar.d);
                    are areVar7 = aroVar.a;
                    areVar7.Z = i21;
                    areVar7.aa = i21;
                    areVar7.h.h.c(i21);
                    areVar7.i.h.c(i21);
                    if (mode == 1073741824) {
                        zV = areVar2.V(zB, i21);
                        i7 = 1;
                    } else {
                        i7 = 0;
                        zV = true;
                    }
                    if (mode2 == 1073741824) {
                        zV &= areVar2.V(zB, 1);
                        i7++;
                    }
                }
                if (zV) {
                    areVar2.D(!z13, !z12);
                }
            } else {
                i7 = 0;
                zV = false;
            }
            if (zV || i7 != 2) {
                i8 = areVar2.ax;
                if (i5 > 0) {
                    size3 = areVar2.aI.size();
                    zW = areVar2.W(64);
                    asc ascVar6 = areVar2.aG;
                    i15 = 0;
                    while (i15 < size3) {
                        ardVar3 = (ard) areVar2.aI.get(i15);
                        if (!(ardVar3 instanceof arg) || (ardVar3 instanceof ara)) {
                            i18 = size3;
                            z6 = zW;
                        } else {
                            boolean z25 = ardVar3.G;
                            if (zW && (aruVar = ardVar3.h) != null && (arvVar = ardVar3.i) != null && aruVar.e.i && arvVar.e.i) {
                                i18 = size3;
                            } else {
                                int iL4 = ardVar3.L(0);
                                int iL5 = ardVar3.L(1);
                                if (iL4 == 3) {
                                    i18 = size3;
                                    i19 = 1;
                                    if (ardVar3.s != 1 && iL5 == 3) {
                                        if (ardVar3.t != 1) {
                                            z7 = true;
                                            iL5 = 3;
                                            i20 = 3;
                                        } else {
                                            iL5 = 3;
                                        }
                                        if (!z7) {
                                            if (areVar2.W(i19) || (ardVar3 instanceof arj)) {
                                                z6 = zW;
                                            } else {
                                                boolean z26 = i20 == 3 && ardVar3.s == 0 && iL5 != 3 && !ardVar3.H();
                                                z6 = zW;
                                                if (iL5 == 3 && ardVar3.t == 0 && i20 != 3 && !ardVar3.H()) {
                                                    z26 = true;
                                                }
                                                if (((i20 == 3 || iL5 == 3) && ardVar3.X > 0.0f) || z26) {
                                                }
                                            }
                                            xscVar.aI(ascVar6, ardVar3, 0);
                                        }
                                    }
                                    i20 = 3;
                                } else {
                                    i18 = size3;
                                    i19 = 1;
                                    i20 = iL4;
                                }
                                z7 = false;
                                if (!z7) {
                                    if (areVar2.W(i19)) {
                                        z6 = zW;
                                        xscVar.aI(ascVar6, ardVar3, 0);
                                    } else {
                                        z6 = zW;
                                        xscVar.aI(ascVar6, ardVar3, 0);
                                    }
                                }
                            }
                            z6 = zW;
                        }
                        i15++;
                        size3 = i18;
                        zW = z6;
                    }
                    constraintLayout = ascVar6.a;
                    childCount = constraintLayout.getChildCount();
                    for (i16 = 0; i16 < childCount; i16++) {
                        childAt = constraintLayout.getChildAt(i16);
                        if (childAt instanceof asn) {
                            throw null;
                        }
                    }
                    arrayList4 = constraintLayout.b;
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        for (i17 = 0; i17 < size4; i17++) {
                        }
                    }
                }
                xscVar.aH(areVar2);
                arrayList = (ArrayList) xscVar.a;
                size2 = arrayList.size();
                if (i5 > 0) {
                    xscVar.aJ(areVar2, 0, iJ, iH);
                }
                if (size2 > 0) {
                    iM = areVar2.M();
                    iN = areVar2.N();
                    int iJ9 = areVar2.j();
                    ard ardVar8 = (ard) xscVar.c;
                    iMax3 = Math.max(iJ9, ardVar8.ac);
                    iMax4 = Math.max(areVar2.h(), ardVar8.ad);
                    i10 = 0;
                    zAI = false;
                    while (i10 < size2) {
                        ardVar2 = (ard) arrayList.get(i10);
                        int i43 = i10;
                        if (ardVar2 instanceof arj) {
                            iJ4 = ardVar2.j();
                            iH4 = ardVar2.h();
                            zAI |= xscVar.aI(ascVar, ardVar2, 1);
                            iJ5 = ardVar2.j();
                            iH5 = ardVar2.h();
                            if (iJ5 != iJ4) {
                                ardVar2.C(iJ5);
                                if (iM == 2 && ardVar2.i() > iMax3) {
                                    iMax3 = Math.max(iMax3, ardVar2.i() + ardVar2.K(4).b());
                                }
                                zAI = true;
                            }
                            if (iH5 != iH4) {
                                ardVar2.x(iH5);
                                if (iN == 2 && ardVar2.g() > iMax4) {
                                    iMax4 = Math.max(iMax4, ardVar2.g() + ardVar2.K(5).b());
                                }
                                zAI = true;
                            }
                        }
                        i10 = i43 + 1;
                        ascVar5 = ascVar5;
                        i8 = i8;
                    }
                    int i44 = i8;
                    ascVar2 = ascVar5;
                    i11 = 2;
                    i12 = 0;
                    while (i12 < i11) {
                        i13 = 0;
                        while (i13 < size2) {
                            ardVar = (ard) arrayList.get(i13);
                            if (!((ardVar instanceof arh) || (ardVar instanceof arj)) || (ardVar instanceof arg) || ardVar.ah == 8 || ((z5 && ardVar.h.e.i && ardVar.i.e.i) || (ardVar instanceof arj))) {
                                i14 = i13;
                                ascVar4 = ascVar;
                                arrayList3 = arrayList;
                            } else {
                                iJ2 = ardVar.j();
                                iH2 = ardVar.h();
                                i14 = i13;
                                int i45 = ardVar.ab;
                                arrayList3 = arrayList;
                                boolean zAI2 = zAI | xscVar.aI(ascVar, ardVar, i12 == 1 ? 2 : 1);
                                ascVar4 = ascVar;
                                iJ3 = ardVar.j();
                                zAI = zAI2;
                                iH3 = ardVar.h();
                                if (iJ3 != iJ2) {
                                    ardVar.C(iJ3);
                                    if (iM == 2 && ardVar.i() > iMax3) {
                                        iMax3 = Math.max(iMax3, ardVar.i() + ardVar.K(4).b());
                                    }
                                    zAI = true;
                                }
                                if (iH3 != iH2) {
                                    ardVar.x(iH3);
                                    if (iN == 2 && ardVar.g() > iMax4) {
                                        iMax4 = Math.max(iMax4, ardVar.g() + ardVar.K(5).b());
                                    }
                                    zAI = true;
                                }
                                if (!ardVar.F && i45 != ardVar.ab) {
                                    zAI = true;
                                }
                            }
                            i13 = i14 + 1;
                            arrayList = arrayList3;
                            ascVar = ascVar4;
                        }
                        ascVar3 = ascVar;
                        arrayList2 = arrayList;
                        if (!zAI) {
                            break;
                        }
                        i12++;
                        xscVar.aJ(areVar2, i12, iJ, iH);
                        i11 = 2;
                        arrayList = arrayList2;
                        ascVar = ascVar3;
                        zAI = false;
                    }
                    i9 = i44;
                } else {
                    ascVar2 = ascVar5;
                    i9 = i8;
                }
                areVar2.U(i9);
            } else {
                ascVar2 = ascVar5;
            }
            int iJ10 = areVar2.j();
            int iH11 = areVar2.h();
            z8 = areVar2.ay;
            z9 = areVar2.az;
            asc ascVar7 = ascVar2;
            int i46 = ascVar7.e;
            int iResolveSizeAndState = resolveSizeAndState(iJ10 + ascVar7.d, i, 0);
            int iResolveSizeAndState2 = resolveSizeAndState(iH11 + i46, i2, 0) & 16777215;
            iMin = Math.min(this.j, iResolveSizeAndState & 16777215);
            iMin2 = Math.min(this.k, iResolveSizeAndState2);
            if (z8) {
                iMin |= 16777216;
            }
            if (z9) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
        }
        iMax2 = childCount4 == 0 ? Math.max(0, this.i) : i39;
        i4 = 2;
        if (iMax == areVar2.j()) {
            z = true;
            areVar2.a.c = true;
        } else {
            z = true;
            areVar2.a.c = true;
        }
        areVar2.Z = 0;
        areVar2.aa = 0;
        boolean z27 = z;
        int i47 = this.j - i41;
        iArr = areVar2.D;
        iArr[0] = i47;
        iArr[z27 ? 1 : 0] = this.k - i40;
        areVar2.B(0);
        areVar2.A(0);
        areVar2.P(i3);
        areVar2.C(iMax);
        areVar2.Q(i4);
        areVar2.x(iMax2);
        areVar2.B(this.d - i41);
        areVar2.A(this.i - i40);
        areVar2.ar = iMax9;
        areVar2.as = iMax5;
        xscVar = areVar2.aH;
        ascVar = areVar2.aG;
        size = areVar2.aI.size();
        zB = ari.b(i36, SemanticState.Focused);
        iJ = areVar2.j();
        iH = areVar2.h();
        if (zB) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (z2) {
            i32 = 0;
            while (true) {
                if (i32 < size) {
                    iArr2 = iArr;
                    ardVar4 = (ard) areVar2.aI.get(i32);
                    z18 = z2;
                    iM2 = ardVar4.M();
                    i5 = size;
                    int iN3 = ardVar4.N();
                    i33 = i32;
                    if (iM2 == 3) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (ardVar4.H()) {
                        if (ardVar4.I()) {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z2 = z18;
                            size = i5;
                        } else {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z2 = z18;
                            size = i5;
                        }
                    } else if (!z19) {
                        z19 = false;
                        if (ardVar4.I()) {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z2 = z18;
                            size = i5;
                        } else {
                            i32 = i33 + 1;
                            iArr = iArr2;
                            z2 = z18;
                            size = i5;
                        }
                    }
                    i6 = 1073741824;
                    z3 = false;
                } else {
                    iArr2 = iArr;
                    z3 = z2;
                    i5 = size;
                    i6 = 1073741824;
                }
            }
        } else {
            iArr2 = iArr;
            z3 = z2;
            i5 = size;
            i6 = 1073741824;
        }
        if (mode != i6) {
            if (zB) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else if (mode2 != i6) {
            mode = 1073741824;
            if (zB) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = true;
            mode = 1073741824;
            mode2 = 1073741824;
        }
        z5 = z3 & z4;
        if (z5) {
            iMin3 = Math.min(iArr2[0], i38);
            iMin4 = Math.min(iArr2[1], i39);
            if (mode == 1073741824) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (mode == 1073741824) {
                areVar2.C(iMin3);
                areVar2.c();
            }
            if (mode2 == 1073741824) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (mode2 == 1073741824) {
                areVar2.x(iMin4);
                areVar2.c();
            }
            if (mode != 1073741824) {
                z12 = z11;
                aroVar = areVar2.a;
                if (aroVar.b) {
                    are areVar8 = aroVar.a;
                    arrayList5 = areVar8.aI;
                    size5 = arrayList5.size();
                    i22 = 0;
                    while (i22 < size5) {
                        ArrayList arrayList11 = arrayList5;
                        ard ardVar9 = (ard) arrayList5.get(i22);
                        ardVar9.r();
                        ardVar9.e = false;
                        boolean z28 = z10;
                        aru aruVar6 = ardVar9.h;
                        aruVar6.e.i = false;
                        aruVar6.g = false;
                        aruVar6.g();
                        arv arvVar6 = ardVar9.i;
                        arvVar6.e.i = false;
                        arvVar6.g = false;
                        arvVar6.g();
                        i22++;
                        size5 = size5;
                        arrayList5 = arrayList11;
                        z10 = z28;
                    }
                    z13 = z10;
                    i21 = 0;
                    areVar8.r();
                    areVar8.e = false;
                    aru aruVar7 = areVar8.h;
                    aruVar7.e.i = false;
                    aruVar7.g = false;
                    aruVar7.g();
                    arv arvVar7 = areVar8.i;
                    arvVar7.e.i = false;
                    arvVar7.g = false;
                    arvVar7.g();
                    aroVar.b();
                } else {
                    z13 = z10;
                    i21 = 0;
                }
                aroVar.d(aroVar.d);
                are areVar9 = aroVar.a;
                areVar9.Z = i21;
                areVar9.aa = i21;
                areVar9.h.h.c(i21);
                areVar9.i.h.c(i21);
                if (mode == 1073741824) {
                    zV = areVar2.V(zB, i21);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zV = true;
                }
                if (mode2 == 1073741824) {
                    zV &= areVar2.V(zB, 1);
                    i7++;
                }
            } else if (mode2 == 1073741824) {
                aroVar2 = areVar2.a;
                if (aroVar2.b) {
                    are areVar10 = aroVar2.a;
                    arrayList6 = areVar10.aI;
                    size6 = arrayList6.size();
                    i23 = 0;
                    while (i23 < size6) {
                        ard ardVar10 = (ard) arrayList6.get(i23);
                        ardVar10.r();
                        ardVar10.e = false;
                        ardVar10.h.g();
                        ardVar10.i.g();
                        i23++;
                        z11 = z11;
                    }
                    z12 = z11;
                    areVar10.r();
                    i24 = 0;
                    areVar10.e = false;
                    areVar10.h.g();
                    areVar10.i.g();
                    aroVar2.c = false;
                } else {
                    are areVar11 = aroVar2.a;
                    arrayList6 = areVar11.aI;
                    size6 = arrayList6.size();
                    i23 = 0;
                    while (i23 < size6) {
                        ard ardVar11 = (ard) arrayList6.get(i23);
                        ardVar11.r();
                        ardVar11.e = false;
                        ardVar11.h.g();
                        ardVar11.i.g();
                        i23++;
                        z11 = z11;
                    }
                    z12 = z11;
                    areVar11.r();
                    i24 = 0;
                    areVar11.e = false;
                    areVar11.h.g();
                    areVar11.i.g();
                    aroVar2.c = false;
                }
                aroVar2.d(aroVar2.d);
                areVar = aroVar2.a;
                areVar.Z = i24;
                areVar.aa = i24;
                iL = areVar.L(i24);
                iL2 = areVar.L(1);
                if (aroVar2.b) {
                    aroVar2.b();
                }
                iK = areVar.k();
                iL3 = areVar.l();
                areVar.h.h.c(iK);
                areVar.i.h.c(iL3);
                aroVar2.c();
                if (iL != 2) {
                    if (iL2 == 2) {
                        z14 = true;
                        z15 = !zB;
                        i25 = 2;
                    } else {
                        i26 = iK;
                    }
                    iArr3 = areVar.aq;
                    i27 = iArr3[0];
                    if (i27 != 1) {
                        int iJ11 = i26 + areVar.j();
                        areVar.h.i.c(iJ11);
                        areVar.h.e.c(iJ11 - i26);
                        aroVar2.c();
                        i28 = iArr3[1];
                        if (i28 != 1) {
                            int iH12 = areVar.h() + iL3;
                            areVar.i.i.c(iH12);
                            areVar.i.e.c(iH12 - iL3);
                        } else {
                            int iH13 = areVar.h() + iL3;
                            areVar.i.i.c(iH13);
                            areVar.i.e.c(iH13 - iL3);
                        }
                        aroVar2.c();
                        z16 = true;
                    } else {
                        int iJ12 = i26 + areVar.j();
                        areVar.h.i.c(iJ12);
                        areVar.h.e.c(iJ12 - i26);
                        aroVar2.c();
                        i28 = iArr3[1];
                        if (i28 != 1) {
                            int iH14 = areVar.h() + iL3;
                            areVar.i.i.c(iH14);
                            areVar.i.e.c(iH14 - iL3);
                        } else {
                            int iH15 = areVar.h() + iL3;
                            areVar.i.i.c(iH15);
                            areVar.i.e.c(iH15 - iL3);
                        }
                        aroVar2.c();
                        z16 = true;
                    }
                    arrayList7 = aroVar2.e;
                    size7 = arrayList7.size();
                    i29 = 0;
                    while (i29 < size7) {
                        arxVar = (arx) arrayList7.get(i29);
                        boolean z29 = z16;
                        if (arxVar.d == areVar) {
                            arxVar.c();
                        } else {
                            arxVar.c();
                        }
                        i29++;
                        z16 = z29;
                    }
                    z17 = z16;
                    size8 = arrayList7.size();
                    i30 = 0;
                    while (true) {
                        if (i30 < size8) {
                            zV = true;
                            break;
                        }
                        arx arxVar4 = (arx) arrayList7.get(i30);
                        if (!z17) {
                            zV = false;
                            break;
                        } else {
                            zV = false;
                            break;
                        }
                        i30++;
                    }
                    areVar.P(iL);
                    areVar.Q(iL2);
                    z13 = z10;
                    i7 = 2;
                } else {
                    z14 = true;
                    if (zB) {
                        i25 = iL2;
                        z15 = false;
                    } else {
                        i25 = iL2;
                        z15 = true;
                    }
                }
                if (z14 != z15) {
                    arrayList8 = aroVar2.e;
                    size9 = arrayList8.size();
                    i26 = iK;
                    i31 = 0;
                    do {
                        if (i31 < size9) {
                            if (iL == 2) {
                                areVar.P(1);
                                areVar.C(aroVar2.a(areVar, 0));
                                areVar.h.e.c(areVar.j());
                                iL = 2;
                            }
                            if (i25 == 2) {
                                break;
                            }
                            areVar.Q(1);
                            areVar.x(aroVar2.a(areVar, 1));
                            areVar.i.e.c(areVar.h());
                            break;
                        }
                        zE = ((arx) arrayList8.get(i31)).e();
                        i31++;
                    } while (zE);
                } else {
                    i26 = iK;
                }
                iL2 = i25;
                iArr3 = areVar.aq;
                i27 = iArr3[0];
                if (i27 != 1) {
                    int iJ13 = i26 + areVar.j();
                    areVar.h.i.c(iJ13);
                    areVar.h.e.c(iJ13 - i26);
                    aroVar2.c();
                    i28 = iArr3[1];
                    if (i28 != 1) {
                        int iH16 = areVar.h() + iL3;
                        areVar.i.i.c(iH16);
                        areVar.i.e.c(iH16 - iL3);
                    } else {
                        int iH17 = areVar.h() + iL3;
                        areVar.i.i.c(iH17);
                        areVar.i.e.c(iH17 - iL3);
                    }
                    aroVar2.c();
                    z16 = true;
                } else {
                    int iJ14 = i26 + areVar.j();
                    areVar.h.i.c(iJ14);
                    areVar.h.e.c(iJ14 - i26);
                    aroVar2.c();
                    i28 = iArr3[1];
                    if (i28 != 1) {
                        int iH18 = areVar.h() + iL3;
                        areVar.i.i.c(iH18);
                        areVar.i.e.c(iH18 - iL3);
                    } else {
                        int iH19 = areVar.h() + iL3;
                        areVar.i.i.c(iH19);
                        areVar.i.e.c(iH19 - iL3);
                    }
                    aroVar2.c();
                    z16 = true;
                }
                arrayList7 = aroVar2.e;
                size7 = arrayList7.size();
                i29 = 0;
                while (i29 < size7) {
                    arxVar = (arx) arrayList7.get(i29);
                    boolean z210 = z16;
                    if (arxVar.d == areVar) {
                        arxVar.c();
                    } else {
                        arxVar.c();
                    }
                    i29++;
                    z16 = z210;
                }
                z17 = z16;
                size8 = arrayList7.size();
                i30 = 0;
                while (true) {
                    if (i30 < size8) {
                        zV = true;
                        break;
                    }
                    arx arxVar5 = (arx) arrayList7.get(i30);
                    if (!z17) {
                        zV = false;
                        break;
                    } else {
                        zV = false;
                        break;
                    }
                    i30++;
                }
                areVar.P(iL);
                areVar.Q(iL2);
                z13 = z10;
                i7 = 2;
            } else {
                mode = 1073741824;
                z12 = z11;
                aroVar = areVar2.a;
                if (aroVar.b) {
                    are areVar12 = aroVar.a;
                    arrayList5 = areVar12.aI;
                    size5 = arrayList5.size();
                    i22 = 0;
                    while (i22 < size5) {
                        ArrayList arrayList12 = arrayList5;
                        ard ardVar12 = (ard) arrayList5.get(i22);
                        ardVar12.r();
                        ardVar12.e = false;
                        boolean z211 = z10;
                        aru aruVar8 = ardVar12.h;
                        aruVar8.e.i = false;
                        aruVar8.g = false;
                        aruVar8.g();
                        arv arvVar8 = ardVar12.i;
                        arvVar8.e.i = false;
                        arvVar8.g = false;
                        arvVar8.g();
                        i22++;
                        size5 = size5;
                        arrayList5 = arrayList12;
                        z10 = z211;
                    }
                    z13 = z10;
                    i21 = 0;
                    areVar12.r();
                    areVar12.e = false;
                    aru aruVar9 = areVar12.h;
                    aruVar9.e.i = false;
                    aruVar9.g = false;
                    aruVar9.g();
                    arv arvVar9 = areVar12.i;
                    arvVar9.e.i = false;
                    arvVar9.g = false;
                    arvVar9.g();
                    aroVar.b();
                } else {
                    z13 = z10;
                    i21 = 0;
                }
                aroVar.d(aroVar.d);
                are areVar13 = aroVar.a;
                areVar13.Z = i21;
                areVar13.aa = i21;
                areVar13.h.h.c(i21);
                areVar13.i.h.c(i21);
                if (mode == 1073741824) {
                    zV = areVar2.V(zB, i21);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zV = true;
                }
                if (mode2 == 1073741824) {
                    zV &= areVar2.V(zB, 1);
                    i7++;
                }
            }
            if (zV) {
                areVar2.D(!z13, !z12);
            }
        } else {
            i7 = 0;
            zV = false;
        }
        if (zV) {
            i8 = areVar2.ax;
            if (i5 > 0) {
                size3 = areVar2.aI.size();
                zW = areVar2.W(64);
                asc ascVar8 = areVar2.aG;
                i15 = 0;
                while (i15 < size3) {
                    ardVar3 = (ard) areVar2.aI.get(i15);
                    if (ardVar3 instanceof arg) {
                        i18 = size3;
                        z6 = zW;
                    } else {
                        i18 = size3;
                        z6 = zW;
                    }
                    i15++;
                    size3 = i18;
                    zW = z6;
                }
                constraintLayout = ascVar8.a;
                childCount = constraintLayout.getChildCount();
                while (i16 < childCount) {
                    childAt = constraintLayout.getChildAt(i16);
                    if (childAt instanceof asn) {
                        throw null;
                    }
                }
                arrayList4 = constraintLayout.b;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i17 < size4) {
                    }
                }
            }
            xscVar.aH(areVar2);
            arrayList = (ArrayList) xscVar.a;
            size2 = arrayList.size();
            if (i5 > 0) {
                xscVar.aJ(areVar2, 0, iJ, iH);
            }
            if (size2 > 0) {
                iM = areVar2.M();
                iN = areVar2.N();
                int iJ15 = areVar2.j();
                ard ardVar13 = (ard) xscVar.c;
                iMax3 = Math.max(iJ15, ardVar13.ac);
                iMax4 = Math.max(areVar2.h(), ardVar13.ad);
                i10 = 0;
                zAI = false;
                while (i10 < size2) {
                    ardVar2 = (ard) arrayList.get(i10);
                    int i48 = i10;
                    if (ardVar2 instanceof arj) {
                        iJ4 = ardVar2.j();
                        iH4 = ardVar2.h();
                        zAI |= xscVar.aI(ascVar, ardVar2, 1);
                        iJ5 = ardVar2.j();
                        iH5 = ardVar2.h();
                        if (iJ5 != iJ4) {
                            ardVar2.C(iJ5);
                            if (iM == 2) {
                                iMax3 = Math.max(iMax3, ardVar2.i() + ardVar2.K(4).b());
                            }
                            zAI = true;
                        }
                        if (iH5 != iH4) {
                            ardVar2.x(iH5);
                            if (iN == 2) {
                                iMax4 = Math.max(iMax4, ardVar2.g() + ardVar2.K(5).b());
                            }
                            zAI = true;
                        }
                    }
                    i10 = i48 + 1;
                    ascVar5 = ascVar5;
                    i8 = i8;
                }
                int i49 = i8;
                ascVar2 = ascVar5;
                i11 = 2;
                i12 = 0;
                while (i12 < i11) {
                    i13 = 0;
                    while (i13 < size2) {
                        ardVar = (ard) arrayList.get(i13);
                        if (ardVar instanceof arh) {
                            iJ2 = ardVar.j();
                            iH2 = ardVar.h();
                            i14 = i13;
                            int i410 = ardVar.ab;
                            arrayList3 = arrayList;
                            boolean zAI3 = zAI | xscVar.aI(ascVar, ardVar, i12 == 1 ? 2 : 1);
                            ascVar4 = ascVar;
                            iJ3 = ardVar.j();
                            zAI = zAI3;
                            iH3 = ardVar.h();
                            if (iJ3 != iJ2) {
                                ardVar.C(iJ3);
                                if (iM == 2) {
                                    iMax3 = Math.max(iMax3, ardVar.i() + ardVar.K(4).b());
                                }
                                zAI = true;
                            }
                            if (iH3 != iH2) {
                                ardVar.x(iH3);
                                if (iN == 2) {
                                    iMax4 = Math.max(iMax4, ardVar.g() + ardVar.K(5).b());
                                }
                                zAI = true;
                            }
                            if (!ardVar.F) {
                            }
                        } else {
                            iJ2 = ardVar.j();
                            iH2 = ardVar.h();
                            i14 = i13;
                            int i411 = ardVar.ab;
                            arrayList3 = arrayList;
                            boolean zAI4 = zAI | xscVar.aI(ascVar, ardVar, i12 == 1 ? 2 : 1);
                            ascVar4 = ascVar;
                            iJ3 = ardVar.j();
                            zAI = zAI4;
                            iH3 = ardVar.h();
                            if (iJ3 != iJ2) {
                                ardVar.C(iJ3);
                                if (iM == 2) {
                                    iMax3 = Math.max(iMax3, ardVar.i() + ardVar.K(4).b());
                                }
                                zAI = true;
                            }
                            if (iH3 != iH2) {
                                ardVar.x(iH3);
                                if (iN == 2) {
                                    iMax4 = Math.max(iMax4, ardVar.g() + ardVar.K(5).b());
                                }
                                zAI = true;
                            }
                            if (!ardVar.F) {
                            }
                        }
                        i13 = i14 + 1;
                        arrayList = arrayList3;
                        ascVar = ascVar4;
                    }
                    ascVar3 = ascVar;
                    arrayList2 = arrayList;
                    if (!zAI) {
                        break;
                        break;
                    }
                    i12++;
                    xscVar.aJ(areVar2, i12, iJ, iH);
                    i11 = 2;
                    arrayList = arrayList2;
                    ascVar = ascVar3;
                    zAI = false;
                }
                i9 = i49;
            } else {
                ascVar2 = ascVar5;
                i9 = i8;
            }
            areVar2.U(i9);
        } else {
            i8 = areVar2.ax;
            if (i5 > 0) {
                size3 = areVar2.aI.size();
                zW = areVar2.W(64);
                asc ascVar9 = areVar2.aG;
                i15 = 0;
                while (i15 < size3) {
                    ardVar3 = (ard) areVar2.aI.get(i15);
                    if (ardVar3 instanceof arg) {
                        i18 = size3;
                        z6 = zW;
                    } else {
                        i18 = size3;
                        z6 = zW;
                    }
                    i15++;
                    size3 = i18;
                    zW = z6;
                }
                constraintLayout = ascVar9.a;
                childCount = constraintLayout.getChildCount();
                while (i16 < childCount) {
                    childAt = constraintLayout.getChildAt(i16);
                    if (childAt instanceof asn) {
                        throw null;
                    }
                }
                arrayList4 = constraintLayout.b;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i17 < size4) {
                    }
                }
            }
            xscVar.aH(areVar2);
            arrayList = (ArrayList) xscVar.a;
            size2 = arrayList.size();
            if (i5 > 0) {
                xscVar.aJ(areVar2, 0, iJ, iH);
            }
            if (size2 > 0) {
                iM = areVar2.M();
                iN = areVar2.N();
                int iJ16 = areVar2.j();
                ard ardVar14 = (ard) xscVar.c;
                iMax3 = Math.max(iJ16, ardVar14.ac);
                iMax4 = Math.max(areVar2.h(), ardVar14.ad);
                i10 = 0;
                zAI = false;
                while (i10 < size2) {
                    ardVar2 = (ard) arrayList.get(i10);
                    int i412 = i10;
                    if (ardVar2 instanceof arj) {
                        iJ4 = ardVar2.j();
                        iH4 = ardVar2.h();
                        zAI |= xscVar.aI(ascVar, ardVar2, 1);
                        iJ5 = ardVar2.j();
                        iH5 = ardVar2.h();
                        if (iJ5 != iJ4) {
                            ardVar2.C(iJ5);
                            if (iM == 2) {
                                iMax3 = Math.max(iMax3, ardVar2.i() + ardVar2.K(4).b());
                            }
                            zAI = true;
                        }
                        if (iH5 != iH4) {
                            ardVar2.x(iH5);
                            if (iN == 2) {
                                iMax4 = Math.max(iMax4, ardVar2.g() + ardVar2.K(5).b());
                            }
                            zAI = true;
                        }
                    }
                    i10 = i412 + 1;
                    ascVar5 = ascVar5;
                    i8 = i8;
                }
                int i413 = i8;
                ascVar2 = ascVar5;
                i11 = 2;
                i12 = 0;
                while (i12 < i11) {
                    i13 = 0;
                    while (i13 < size2) {
                        ardVar = (ard) arrayList.get(i13);
                        if (ardVar instanceof arh) {
                            iJ2 = ardVar.j();
                            iH2 = ardVar.h();
                            i14 = i13;
                            int i414 = ardVar.ab;
                            arrayList3 = arrayList;
                            boolean zAI5 = zAI | xscVar.aI(ascVar, ardVar, i12 == 1 ? 2 : 1);
                            ascVar4 = ascVar;
                            iJ3 = ardVar.j();
                            zAI = zAI5;
                            iH3 = ardVar.h();
                            if (iJ3 != iJ2) {
                                ardVar.C(iJ3);
                                if (iM == 2) {
                                    iMax3 = Math.max(iMax3, ardVar.i() + ardVar.K(4).b());
                                }
                                zAI = true;
                            }
                            if (iH3 != iH2) {
                                ardVar.x(iH3);
                                if (iN == 2) {
                                    iMax4 = Math.max(iMax4, ardVar.g() + ardVar.K(5).b());
                                }
                                zAI = true;
                            }
                            if (!ardVar.F) {
                            }
                        } else {
                            iJ2 = ardVar.j();
                            iH2 = ardVar.h();
                            i14 = i13;
                            int i415 = ardVar.ab;
                            arrayList3 = arrayList;
                            boolean zAI6 = zAI | xscVar.aI(ascVar, ardVar, i12 == 1 ? 2 : 1);
                            ascVar4 = ascVar;
                            iJ3 = ardVar.j();
                            zAI = zAI6;
                            iH3 = ardVar.h();
                            if (iJ3 != iJ2) {
                                ardVar.C(iJ3);
                                if (iM == 2) {
                                    iMax3 = Math.max(iMax3, ardVar.i() + ardVar.K(4).b());
                                }
                                zAI = true;
                            }
                            if (iH3 != iH2) {
                                ardVar.x(iH3);
                                if (iN == 2) {
                                    iMax4 = Math.max(iMax4, ardVar.g() + ardVar.K(5).b());
                                }
                                zAI = true;
                            }
                            if (!ardVar.F) {
                            }
                        }
                        i13 = i14 + 1;
                        arrayList = arrayList3;
                        ascVar = ascVar4;
                    }
                    ascVar3 = ascVar;
                    arrayList2 = arrayList;
                    if (!zAI) {
                        break;
                        break;
                    }
                    i12++;
                    xscVar.aJ(areVar2, i12, iJ, iH);
                    i11 = 2;
                    arrayList = arrayList2;
                    ascVar = ascVar3;
                    zAI = false;
                }
                i9 = i413;
            } else {
                ascVar2 = ascVar5;
                i9 = i8;
            }
            areVar2.U(i9);
        }
        int iJ17 = areVar2.j();
        int iH110 = areVar2.h();
        z8 = areVar2.ay;
        z9 = areVar2.az;
        asc ascVar10 = ascVar2;
        int i416 = ascVar10.e;
        int iResolveSizeAndState3 = resolveSizeAndState(iJ17 + ascVar10.d, i, 0);
        int iResolveSizeAndState4 = resolveSizeAndState(iH110 + i416, i2, 0) & 16777215;
        iMin = Math.min(this.j, iResolveSizeAndState3 & 16777215);
        iMin2 = Math.min(this.k, iResolveSizeAndState4);
        if (z8) {
            iMin |= 16777216;
        }
        if (z9) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        ard ardVarB = b(view);
        if (z && !(ardVarB instanceof arg)) {
            asb asbVar = (asb) view.getLayoutParams();
            asbVar.av = new arg();
            asbVar.ah = true;
            ((arg) asbVar.av).c(asbVar.Z);
        }
        if (view instanceof arz) {
            arz arzVar = (arz) view;
            arzVar.h();
            ((asb) view.getLayoutParams()).ai = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(arzVar)) {
                arrayList.add(arzVar);
            }
        }
        this.a.put(view.getId(), view);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(b(view));
        this.b.remove(view);
        this.e = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new asb(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new are();
        this.d = 0;
        this.i = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new asc(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new are();
        this.d = 0;
        this.i = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new asc(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new are();
        this.d = 0;
        this.i = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new asc(this, this);
        e(attributeSet, i, i2);
    }
}
