package com.facebook.litho;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import defpackage.ahb;
import defpackage.ahc;
import defpackage.bac;
import defpackage.fgn;
import defpackage.fgy;
import defpackage.fha;
import defpackage.fhe;
import defpackage.fhf;
import defpackage.fhg;
import defpackage.fhi;
import defpackage.fhk;
import defpackage.fhl;
import defpackage.fhz;
import defpackage.fih;
import defpackage.fip;
import defpackage.fit;
import defpackage.fiw;
import defpackage.fja;
import defpackage.fjn;
import defpackage.fjp;
import defpackage.fjr;
import defpackage.fjw;
import defpackage.fkl;
import defpackage.flg;
import defpackage.flh;
import defpackage.fli;
import defpackage.flz;
import defpackage.fna;
import defpackage.fvf;
import defpackage.fvi;
import defpackage.gzj;
import defpackage.heg;
import defpackage.isw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ComponentHost extends fvf implements fit {
    private static boolean t = false;
    private heg A;
    public ahb a;
    public ahb b;
    public ahb c;
    public ahb d;
    public ahb e;
    public ahb f;
    public ArrayList g;
    public SparseArray h;
    public boolean i;
    public fhk j;
    public fhe k;
    public fhi l;
    public fhf m;
    public fhl n;
    public fip o;
    public flh p;
    public boolean q;
    public int r;
    public boolean s;
    private CharSequence u;
    private final fhg v;
    private int[] w;
    private boolean x;
    private fha y;
    private boolean z;

    public ComponentHost(Context context) {
        super(context);
        this.v = new fhg(this);
        this.w = new int[0];
        this.z = false;
        this.r = 0;
        this.s = false;
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        n(fgn.b(context));
        this.a = new ahb(10);
        this.c = new ahb(10);
        this.e = new ahb(10);
        this.g = new ArrayList();
    }

    private final void A() {
        if (this.b == null) {
            this.b = new ahb(4);
        }
    }

    private final boolean B(MotionEvent motionEvent, int i) {
        int action = motionEvent.getAction();
        motionEvent.setAction(i);
        try {
            return super.onHoverEvent(motionEvent);
        } finally {
            motionEvent.setAction(action);
        }
    }

    private static final void C(View view, fkl fklVar) {
        boolean zIsFocusable = view.isFocusable();
        int i = bac.a;
        bac.p(view, new fha(view, fklVar, zIsFocusable, view.getImportantForAccessibility()));
    }

    private static String z(int i) {
        if (i == 0) {
            return "none";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "hw";
        }
        return "sw";
    }

    @Override // defpackage.fvf
    public final int a() {
        ahb ahbVar = this.a;
        if (ahbVar == null) {
            return 0;
        }
        return ahbVar.c();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // defpackage.fvf
    public final fvi b(int i) {
        return (fvi) this.a.d(i);
    }

    public final List c() {
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        ahb ahbVar = this.e;
        int iC = ahbVar == null ? 0 : ahbVar.c();
        for (int i = 0; i < iC; i++) {
            fkl fklVar = fja.a((fvi) this.e.d(i)).a;
            if (fklVar != null && (charSequence = fklVar.a) != null) {
                arrayList.add(charSequence);
            }
        }
        CharSequence charSequence2 = this.u;
        if (charSequence2 != null) {
            arrayList.add(charSequence2);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    protected Map d(int i, int i2) {
        HashMap map = new HashMap();
        map.put("uptimeMs", Long.valueOf(SystemClock.uptimeMillis()));
        map.put("identity", Integer.toHexString(System.identityHashCode(this)));
        map.put("width", Integer.valueOf(i));
        map.put("height", Integer.valueOf(i2));
        map.put("layerType", z(getLayerType()));
        Map[] mapArr = new Map[a()];
        for (int i3 = 0; i3 < a(); i3++) {
            fvi fviVarB = b(i3);
            Object obj = fviVarB.a;
            Rect rect = fviVarB.d.d;
            HashMap map2 = new HashMap();
            map2.put("class", obj.getClass().getName());
            map2.put("identity", Integer.toHexString(System.identityHashCode(obj)));
            if (obj instanceof View) {
                map2.put("layerType", z(((View) obj).getLayerType()));
            }
            map2.put("left", Integer.valueOf(rect.left));
            map2.put("right", Integer.valueOf(rect.right));
            map2.put("top", Integer.valueOf(rect.top));
            map2.put("bottom", Integer.valueOf(rect.bottom));
            mapArr[i3] = map2;
        }
        map.put("mountItems", mapArr);
        StringBuilder sb = new StringBuilder();
        for (?? parent = this; parent != 0; parent = parent.getParent()) {
            sb.append(parent.getClass().getName());
            sb.append(',');
            if ((parent instanceof fjw) && !map.containsKey("lithoViewDimens")) {
                fjw fjwVar = (fjw) parent;
                map.put("lithoViewDimens", "(" + fjwVar.getWidth() + ", " + fjwVar.getHeight() + ')');
            }
        }
        map.put("ancestors", sb.toString());
        return map;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Rect rectA;
        fhg fhgVar = this.v;
        fhgVar.a = canvas;
        int i = 0;
        fhgVar.b = 0;
        ahb ahbVar = fhgVar.d.a;
        fhgVar.c = ahbVar == null ? 0 : ahbVar.c();
        try {
            super.dispatchDraw(canvas);
            fhg fhgVar2 = this.v;
            if (fhgVar2.b()) {
                fhgVar2.a();
            }
            fhgVar2.a = null;
            ArrayList arrayList = this.g;
            int size = arrayList == null ? 0 : arrayList.size();
            while (i < size) {
                Object obj = ((fvi) this.g.get(i)).a;
                if (obj instanceof Drawable) {
                    ((Drawable) obj).draw(canvas);
                }
                i++;
            }
            if (fna.b) {
                if (gzj.f == null) {
                    gzj.f = new Paint();
                    gzj.f.setColor(1724029951);
                }
                if (gzj.g == null) {
                    gzj.g = new Paint();
                    gzj.g.setColor(1154744270);
                }
                if (gzj.bp(this)) {
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), gzj.f);
                } else {
                    canvas2 = canvas;
                }
                int iA = a();
                while (true) {
                    iA--;
                    if (iA < 0) {
                        break;
                    }
                    fvi fviVarB = b(iA);
                    fgy fgyVar = ((fjr) fviVarB.d.b).b.c;
                    if (fgyVar != null && fgyVar.af() == 3 && !(fgyVar instanceof fiw)) {
                        View view = (View) fviVarB.a;
                        if (gzj.bp(view)) {
                            canvas2.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), gzj.g);
                        }
                    }
                }
                flh flhVar = this.p;
                if (flhVar != null) {
                    ahb ahbVar2 = flhVar.c;
                    Paint paint = gzj.g;
                    int iC = ahbVar2.c();
                    while (true) {
                        iC--;
                        if (iC < 0) {
                            break;
                        }
                        flg flgVar = (flg) ahbVar2.d(iC);
                        if (flgVar != null && (rectA = flgVar.a()) != null) {
                            canvas2.drawRect(rectA, paint);
                        }
                    }
                }
            } else {
                canvas2 = canvas;
            }
            if (!fna.c) {
                return;
            }
            Resources resources = getResources();
            if (gzj.h == null) {
                gzj.h = new Rect();
            }
            if (gzj.i == null) {
                gzj.i = new Paint();
                gzj.i.setStyle(Paint.Style.STROKE);
                gzj.i.setStrokeWidth(gzj.bn(resources, 1));
            }
            if (gzj.j == null) {
                gzj.j = new Paint();
                gzj.j.setStyle(Paint.Style.FILL);
                gzj.j.setStrokeWidth(gzj.bn(resources, 2));
            }
            int iA2 = a();
            while (true) {
                iA2--;
                if (iA2 < 0) {
                    return;
                }
                fvi fviVarB2 = b(iA2);
                fja fjaVar = ((fjr) fviVarB2.d.b).b;
                Object obj2 = fviVarB2.a;
                fgy fgyVar2 = fjaVar.c;
                if (!(fgyVar2 instanceof fih)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        gzj.h.left = view2.getLeft();
                        gzj.h.top = view2.getTop();
                        gzj.h.right = view2.getRight();
                        gzj.h.bottom = view2.getBottom();
                    } else if (obj2 instanceof Drawable) {
                        gzj.h.set(((Drawable) obj2).getBounds());
                    }
                    Paint paint2 = gzj.i;
                    Map map = fgy.h;
                    boolean z = fgyVar2 instanceof fiw;
                    paint2.setColor(true != z ? -1711341568 : -1711341313);
                    Paint paint3 = gzj.i;
                    Rect rect = gzj.h;
                    int strokeWidth = ((int) paint3.getStrokeWidth()) / 2;
                    canvas2.drawRect(rect.left + strokeWidth, rect.top + strokeWidth, rect.right - strokeWidth, rect.bottom - strokeWidth, paint3);
                    gzj.j.setColor(true != z ? -16776961 : -16711681);
                    Paint paint4 = gzj.j;
                    Rect rect2 = gzj.h;
                    int strokeWidth2 = (int) paint4.getStrokeWidth();
                    int iMin = Math.min(Math.min(gzj.h.width(), gzj.h.height()) / 3, gzj.bn(resources, 12));
                    gzj.bo(canvas2, paint4, rect2.left, rect2.top, strokeWidth2, strokeWidth2, iMin);
                    int i2 = -strokeWidth2;
                    gzj.bo(canvas2, paint4, rect2.left, rect2.bottom, strokeWidth2, i2, iMin);
                    gzj.bo(canvas2, paint4, rect2.right, rect2.top, i2, strokeWidth2, iMin);
                    gzj.bo(canvas2, paint4, rect2.right, rect2.bottom, i2, i2, iMin);
                }
            }
        } catch (fjn e) {
            int iA3 = a();
            StringBuilder sb = new StringBuilder("[");
            while (i < iA3) {
                fvi fviVar = (fvi) ahc.a(this.a, i);
                sb.append(fviVar != null ? ((fjr) fviVar.d.b).b.c.c() : "null");
                if (i < iA3 - 1) {
                    sb.append(", ");
                } else {
                    sb.append(']');
                }
                i++;
            }
            e.c.put("component_names_from_mount_items", sb.toString());
            throw e;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        fha fhaVar = this.y;
        return (fhaVar != null && this.s && fhaVar.dispatchHoverEvent(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        heg hegVar = this.A;
        if (hegVar != null) {
            hegVar.h(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ahb ahbVar = this.e;
        int iC = ahbVar == null ? 0 : ahbVar.c();
        for (int i = 0; i < iC; i++) {
            fvi fviVar = (fvi) this.e.d(i);
            fja fjaVar = ((fjr) fviVar.d.b).b;
            gzj.bC(this, (Drawable) fviVar.a, fjaVar.d, fjaVar.a);
        }
    }

    public final void e() {
        if (this.g == null) {
            this.g = new ArrayList();
        }
    }

    public final void f() {
        if (this.e == null) {
            this.e = new ahb(10);
        }
    }

    public final void g() {
        if (this.a == null) {
            this.a = new ahb(10);
        }
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (this.i) {
            int childCount = getChildCount();
            if (this.w.length < childCount) {
                this.w = new int[childCount + 5];
            }
            ahb ahbVar = this.c;
            int iC = ahbVar == null ? 0 : ahbVar.c();
            int i3 = 0;
            int i4 = 0;
            while (i3 < iC) {
                this.w[i4] = indexOfChild((View) ((fvi) this.c.d(i3)).a);
                i3++;
                i4++;
            }
            ArrayList arrayList = this.g;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = ((fvi) this.g.get(i5)).a;
                if (obj instanceof View) {
                    this.w[i4] = indexOfChild((View) obj);
                    i4++;
                }
            }
            this.i = false;
        }
        fhg fhgVar = this.v;
        if (fhgVar.b()) {
            fhgVar.a();
        }
        return this.w[i2];
    }

    @Override // android.view.View
    public final CharSequence getContentDescription() {
        return this.u;
    }

    @Override // android.view.View
    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.h;
        return (sparseArray == null || (obj = sparseArray.get(i)) == null) ? super.getTag(i) : obj;
    }

    public TextContent getTextContent() {
        List listSingletonList;
        g();
        ahb ahbVar = this.a;
        int iC = ahbVar.c();
        if (iC == 1) {
            listSingletonList = Collections.singletonList(((fvi) ahbVar.d(0)).a);
        } else {
            ArrayList arrayList = new ArrayList(iC);
            for (int i = 0; i < iC; i++) {
                arrayList.add(((fvi) ahbVar.d(i)).a);
            }
            listSingletonList = arrayList;
        }
        return gzj.bB(listSingletonList);
    }

    public final void h() {
        if (this.c == null) {
            this.c = new ahb(10);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (getWidth() > 0 && getHeight() > 0) {
            int width = getWidth();
            int i = fna.m;
            if (width <= i && getHeight() <= i) {
                return super.hasOverlappingRendering();
            }
        }
        return false;
    }

    public final void i() {
        fha fhaVar;
        if (this.z && this.s && (fhaVar = this.y) != null) {
            fhaVar.invalidateRoot();
        }
    }

    public final void j(int i, fvi fviVar) {
        flg flgVar;
        if (this.p == null || equals(fviVar.a)) {
            return;
        }
        flh flhVar = this.p;
        flhVar.e = null;
        ahb ahbVar = flhVar.d;
        if (ahbVar != null && (flgVar = (flg) ahc.a(ahbVar, i)) != null) {
            if (flgVar.a == flhVar.f) {
                flhVar.f = null;
            }
            ahc.b(flhVar.d, i);
        } else {
            ahb ahbVar2 = flhVar.c;
            flg flgVar2 = (flg) ahc.a(ahbVar2, i);
            if (flgVar2 != null) {
                if (flgVar2.a == flhVar.f) {
                    flhVar.f = null;
                }
            }
            ahc.b(ahbVar2, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        ahb ahbVar = this.e;
        int iC = ahbVar == null ? 0 : ahbVar.c();
        for (int i = 0; i < iC; i++) {
            ((Drawable) ((fvi) this.e.d(i)).a).jumpToCurrentState();
        }
    }

    @Override // defpackage.fvf
    public final void k(int i, fvi fviVar) {
        l(i, fviVar, fviVar.d.d);
    }

    public final void l(int i, fvi fviVar, Rect rect) {
        fja fjaVar = ((fjr) fviVar.d.b).b;
        Object obj = fviVar.a;
        if (obj instanceof Drawable) {
            gzj.aS();
            f();
            this.e.f(i, fviVar);
            Drawable drawable = (Drawable) obj;
            fja fjaVar2 = ((fjr) fviVar.d.b).b;
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setCallback(this);
            if (fviVar.e instanceof fjp) {
                gzj.bC(this, drawable, fjaVar2.d, fjaVar2.a);
            }
            invalidate(rect);
        } else if (obj instanceof View) {
            h();
            this.c.f(i, fviVar);
            View view = (View) obj;
            if ((fjaVar.d & 1) == 1) {
                view.setDuplicateParentStateEnabled(true);
            }
            boolean z = view instanceof ComponentHost;
            this.i = true;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(generateDefaultLayoutParams());
            }
            if (this.x) {
                super.addViewInLayout(view, -1, view.getLayoutParams(), true);
            } else {
                super.addView(view, -1, view.getLayoutParams());
            }
            flz flzVar = ((fjr) fviVar.d.b).b.b;
            if (flzVar != null && flzVar.a() != null && !equals(obj)) {
                if (this.p == null) {
                    flh flhVar = new flh(this);
                    this.p = flhVar;
                    setTouchDelegate(flhVar);
                }
                flh flhVar2 = this.p;
                flhVar2.e = null;
                flhVar2.c.f(i, new flg(view, fviVar));
            }
            if (fna.C && !z) {
                fkl fklVar = (fkl) view.getTag(R.id.component_node_info);
                if (this.z && fklVar != null) {
                    C(view, fklVar);
                }
            }
        }
        g();
        this.a.f(i, fviVar);
        u(fjaVar);
    }

    @Override // defpackage.fvf
    public final void m(fvi fviVar, int i, int i2) {
        ahb ahbVar;
        flh flhVar;
        ahb ahbVar2 = this.a;
        if ((ahbVar2 == null || fviVar != ahc.a(ahbVar2, i)) && ((ahbVar = this.b) == null || fviVar != ahc.a(ahbVar, i))) {
            String strC = fviVar.d.c();
            fvi fviVar2 = (fvi) ahc.a(this.a, i);
            throw new IllegalStateException("Attempting to move MountItem from index: " + i + " to index: " + i2 + ", but given MountItem does not exist at provided old index.\nGiven MountItem: " + strC + "\nExisting MountItem at old index: " + (fviVar2 != null ? fviVar2.d.c() : "null"));
        }
        flz flzVar = fja.a(fviVar).b;
        if (flzVar != null && flzVar.a() != null && (flhVar = this.p) != null) {
            flhVar.e = null;
            ahb ahbVar3 = flhVar.c;
            if (ahc.a(ahbVar3, i2) != null) {
                if (flhVar.d == null) {
                    flhVar.d = new ahb(4);
                }
                gzj.bF(i2, ahbVar3, flhVar.d);
            }
            gzj.bD(i, i2, ahbVar3, flhVar.d);
            ahb ahbVar4 = flhVar.d;
            if (ahbVar4 != null && ahbVar4.c() == 0) {
                flhVar.d = null;
            }
        }
        Object obj = fviVar.a;
        h();
        if (obj instanceof Drawable) {
            gzj.aS();
            f();
            if (ahc.a(this.e, i2) != null) {
                ahb ahbVar5 = this.f;
                if (ahbVar5 == null) {
                    ahbVar5 = new ahb(4);
                    this.f = ahbVar5;
                }
                gzj.bF(i2, this.e, ahbVar5);
            }
            gzj.bD(i, i2, this.e, this.f);
            invalidate();
            o();
        } else if (obj instanceof View) {
            this.i = true;
            if (ahc.a(this.c, i2) != null) {
                ahb ahbVar6 = this.d;
                if (ahbVar6 == null) {
                    ahbVar6 = new ahb(4);
                    this.d = ahbVar6;
                }
                gzj.bF(i2, this.c, ahbVar6);
            }
            gzj.bD(i, i2, this.c, this.d);
        }
        g();
        if (ahc.a(this.a, i2) != null) {
            A();
            gzj.bF(i2, this.a, this.b);
        }
        gzj.bD(i, i2, this.a, this.b);
        o();
    }

    protected final void n(boolean z) {
        if (z != this.z) {
            if (z && this.y == null) {
                boolean zIsFocusable = isFocusable();
                int i = bac.a;
                this.y = new fha(this, null, zIsFocusable, getImportantForAccessibility());
            }
            bac.p(this, z ? this.y : null);
            this.z = z;
            if (z) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof ComponentHost) {
                        ((ComponentHost) childAt).n(true);
                    } else {
                        fkl fklVar = (fkl) childAt.getTag(R.id.component_node_info);
                        if (fklVar != null) {
                            C(childAt, fklVar);
                        }
                    }
                }
            }
        }
    }

    public final void o() {
        ahb ahbVar = this.b;
        if (ahbVar != null && ahbVar.c() == 0) {
            this.b = null;
        }
        ahb ahbVar2 = this.d;
        if (ahbVar2 == null || ahbVar2.c() != 0) {
            return;
        }
        this.d = null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009b A[EDGE_INSN: B:46:0x009b->B:47:0x009c BREAK  A[LOOP:0: B:37:0x0082->B:78:0x0082]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        View childAt;
        flg flgVar;
        View view;
        View view2;
        boolean z;
        TouchDelegate touchDelegate;
        Rect rectA;
        if (fna.M && Build.VERSION.SDK_INT >= 29 && this.p != null && fgn.b(getContext())) {
            flh flhVar = this.p;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 10) {
                actionMasked = 10;
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                ComponentHost componentHost = flhVar.b;
                int childCount = componentHost.getChildCount();
                while (true) {
                    childCount--;
                    if (childCount >= 0) {
                        childAt = componentHost.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && (childAt.isHovered() || ((childAt instanceof ComponentHost) && ((ComponentHost) childAt).s))) {
                            if (x >= childAt.getLeft() && x < childAt.getRight() && y >= childAt.getTop() && y < childAt.getBottom()) {
                                break;
                            }
                        }
                    }
                }
                if (actionMasked == 10 || childAt != null) {
                    flgVar = null;
                    break;
                }
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                ahb ahbVar = flhVar.c;
                int iC = ahbVar.c();
                while (true) {
                    iC--;
                    if (iC < 0) {
                        flgVar = null;
                        break;
                    }
                    flgVar = (flg) ahbVar.d(iC);
                    if (flgVar != null && (rectA = flgVar.a()) != null && rectA.contains(x2, y2)) {
                        break;
                    }
                }
                view = flhVar.f;
                flhVar.f = flgVar != null ? flgVar.a : null;
                if (view != null && view != flhVar.f && view != childAt) {
                    flh.a(new TouchDelegate(flh.a, view), motionEvent, 10);
                }
                if (flgVar != null) {
                    touchDelegate = new TouchDelegate(flgVar.a(), flhVar.f);
                    if (view != flhVar.f && actionMasked == 7) {
                        flh.a(touchDelegate, motionEvent, 9);
                    }
                    flh.a(touchDelegate, motionEvent, actionMasked);
                }
                view2 = this.p.f;
                z = this.q;
                if (view2 != null) {
                    if (!z) {
                        return true;
                    }
                    this.q = true;
                    B(motionEvent, 10);
                    return true;
                }
                if (z) {
                    this.q = false;
                    if (motionEvent.getActionMasked() == 7) {
                        return B(motionEvent, 9);
                    }
                }
            }
            childAt = null;
            if (actionMasked == 10) {
                flgVar = null;
                break;
            }
            flgVar = null;
            break;
            view = flhVar.f;
            flhVar.f = flgVar != null ? flgVar.a : null;
            if (view != null) {
                flh.a(new TouchDelegate(flh.a, view), motionEvent, 10);
            }
            if (flgVar != null) {
                touchDelegate = new TouchDelegate(flgVar.a(), flhVar.f);
                if (view != flhVar.f) {
                    flh.a(touchDelegate, motionEvent, 9);
                }
                flh.a(touchDelegate, motionEvent, actionMasked);
            }
            view2 = this.p.f;
            z = this.q;
            if (view2 != null) {
                if (!z) {
                    return true;
                }
                this.q = true;
                B(motionEvent, 10);
                return true;
            }
            if (z) {
                this.q = false;
                if (motionEvent.getActionMasked() == 7) {
                    return B(motionEvent, 9);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fip fipVar = this.o;
        if (fipVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        gzj.aS();
        if (fhz.i == null) {
            fhz.i = new isw();
        }
        isw iswVar = fhz.i;
        iswVar.a = motionEvent;
        iswVar.b = this;
        Object objZ = fipVar.b.n().z(fipVar, fhz.i);
        isw iswVar2 = fhz.i;
        iswVar2.a = null;
        iswVar2.b = null;
        return objZ != null && ((Boolean) objZ).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.x = true;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        String str = null;
        if (i6 <= 0 || i5 <= 0) {
            boolean z2 = fna.a;
        } else {
            int i7 = fna.l;
            if (i6 >= i7 || i5 >= i7) {
                str = "TextureTooBig";
            }
        }
        if (str != null) {
            gzj.bs(2, "abnormally sized litho layout (" + i5 + ", " + i6 + ')', d(i5, i6));
        }
        w(i, i2, i3, i4);
        this.x = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gzj.aS();
        if (isEnabled()) {
            ahb ahbVar = this.e;
            int iC = ahbVar == null ? 0 : ahbVar.c();
            while (true) {
                iC--;
                if (iC < 0) {
                    break;
                }
                fvi fviVar = (fvi) this.e.d(iC);
                Object obj = fviVar.a;
                if ((obj instanceof fli) && (fja.a(fviVar).d & 2) != 2) {
                    fli fliVar = (fli) obj;
                    if (fliVar.e(motionEvent) && fliVar.d(motionEvent, this)) {
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(fhi fhiVar) {
        this.l = fhiVar;
        setOnHoverListener(fhiVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        CharSequence charSequenceJoin;
        if (i == 512) {
            if (!TextUtils.isEmpty(this.u)) {
                charSequenceJoin = this.u;
            } else if (!c().isEmpty()) {
                charSequenceJoin = TextUtils.join(", ", c());
            } else if (getTextContent().getTextItems().isEmpty()) {
                charSequenceJoin = null;
            } else {
                charSequenceJoin = TextUtils.join(", ", getTextContent().getTextItems());
            }
            if (charSequenceJoin == null) {
                return false;
            }
            this.u = charSequenceJoin;
            super.setContentDescription(charSequenceJoin);
        } else if (i == 256) {
            i = 256;
            if (!TextUtils.isEmpty(this.u)) {
                charSequenceJoin = this.u;
            } else if (!c().isEmpty()) {
                charSequenceJoin = TextUtils.join(", ", c());
            } else if (getTextContent().getTextItems().isEmpty()) {
                charSequenceJoin = TextUtils.join(", ", getTextContent().getTextItems());
            } else {
                charSequenceJoin = null;
            }
            if (charSequenceJoin == null) {
                return false;
            }
            this.u = charSequenceJoin;
            super.setContentDescription(charSequenceJoin);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // defpackage.fvf
    public final void q(fvi fviVar) {
        int iB;
        g();
        int iA = this.a.a(fviVar);
        if (iA == -1) {
            A();
            iB = this.b.b(this.b.a(fviVar));
        } else {
            iB = this.a.b(iA);
        }
        r(iB, fviVar);
    }

    public final void r(int i, fvi fviVar) {
        Object obj = fviVar.a;
        if (obj instanceof Drawable) {
            f();
            s((Drawable) obj);
            gzj.bE(i, this.e, this.f);
        } else if (obj instanceof View) {
            t((View) obj);
            h();
            gzj.bE(i, this.c, this.d);
            this.i = true;
            j(i, fviVar);
        }
        g();
        gzj.bE(i, this.a, this.b);
        o();
        u(fja.a(fviVar));
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    @Deprecated
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        for (ViewParent parent = this; parent instanceof ComponentHost; parent = parent.getParent()) {
            if (!((ComponentHost) parent).v()) {
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(Drawable drawable) {
        gzj.aS();
        drawable.setCallback(null);
        invalidate(drawable.getBounds());
        o();
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.z = false;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (f != 0.0f && f != 1.0f) {
            int width = getWidth();
            int i = fna.n;
            if (width >= i || getHeight() >= i) {
                if (t) {
                    return;
                }
                t = true;
                gzj.br(2, "Partial alpha (" + f + ") with large view (" + getWidth() + ", " + getHeight() + ')');
            }
        }
        super.setAlpha(f);
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (!TextUtils.isEmpty(charSequence)) {
            int i = bac.a;
            if (getImportantForAccessibility() == 0) {
                setImportantForAccessibility(1);
            }
        }
        i();
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (i != R.id.component_node_info || obj == null) {
            return;
        }
        n(fgn.b(getContext()));
        fha fhaVar = this.y;
        if (fhaVar != null) {
            fhaVar.a = (fkl) obj;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        gzj.aS();
        super.setVisibility(i);
        ahb ahbVar = this.e;
        int iC = ahbVar == null ? 0 : ahbVar.c();
        for (int i2 = 0; i2 < iC; i2++) {
            ((Drawable) ((fvi) this.e.d(i2)).a).setVisible(i == 0, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(View view) {
        this.i = true;
        if (this.x) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
        view.setDuplicateParentStateEnabled(false);
        if (view instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) view;
            if (componentHost.addStatesFromChildren()) {
                componentHost.setAddStatesFromChildren(false);
            }
        }
    }

    public final void u(fja fjaVar) {
        if (fjaVar.c() && fjaVar.c.U()) {
            this.s = true;
        }
        i();
        if (a() == 0) {
            this.s = false;
        }
    }

    protected boolean v() {
        return !this.x;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    @Override // defpackage.fit
    public final heg x() {
        return this.A;
    }

    @Override // defpackage.fit
    public final void y(heg hegVar) {
        this.A = hegVar;
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    public void w(int i, int i2, int i3, int i4) {
    }
}
