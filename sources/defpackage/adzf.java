package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzf extends FrameLayout {
    public final LinearLayout a;
    public View b;
    public adzp c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public awqg i;
    private adzp j;
    private final int k;
    private final int l;
    private adzn m;

    public adzf(Context context) {
        super(context, null, 0);
        this.a = new LinearLayout(context);
        this.c = adzp.b;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.mainstage_menu_margin);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_between_anchor_margin);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_max_width);
    }

    private final int f() {
        return this.f + this.h;
    }

    private final int g() {
        return this.e + this.g;
    }

    private final Size h(adzp adzpVar, adzo adzoVar, int i, int i2, int i3, int i4, Map map) {
        Size sizeG = aecm.g(adzpVar, adzoVar, i4);
        int iF = awro.f(awro.g(awro.g(i, sizeG.getWidth()), i3), a());
        int iG = g() + iF;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iG, 1073741824);
        if (i2 > b() && iF < i) {
            Integer numValueOf = Integer.valueOf(iF);
            Object objValueOf = map.get(numValueOf);
            if (objValueOf == null) {
                super.onMeasure(iMakeMeasureSpec, 0);
                objValueOf = Integer.valueOf(awro.f(getMeasuredHeight() - f(), b()));
                map.put(numValueOf, objValueOf);
            }
            i2 = ((Number) objValueOf).intValue();
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(awro.f(awro.f(awro.g(i2, sizeG.getHeight()), 0) + f(), 0), Integer.MIN_VALUE));
        return new Size(iG, getMeasuredHeight());
    }

    private static final void i(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public final int a() {
        return this.a.getMinimumWidth();
    }

    public final int b() {
        LinearLayout linearLayout = this.a;
        return linearLayout.getPaddingTop() + linearLayout.getPaddingBottom();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x025b A[SYNTHETIC] */
    public final adzn c() {
        adzp adzpVar;
        List listF;
        adzn adznVar;
        adzp adzpVar2;
        int i;
        LinkedHashMap linkedHashMap;
        int iCenterX;
        int i2;
        int i3;
        int i4;
        int iCenterY;
        int i5;
        int iCenterX2;
        int i6;
        int i7;
        int i8;
        double dHypot;
        adzf adzfVar = this;
        LinearLayout linearLayout = adzfVar.a;
        int paddingLeft = linearLayout.getPaddingLeft() + linearLayout.getPaddingRight();
        View view = adzfVar.b;
        if (view == null) {
            awrc.b("anchorView");
            view = null;
        }
        int i9 = adzfVar.l + paddingLeft;
        adzo adzoVarF = aecm.f(view, adzfVar.d);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(adzfVar.g() + i9, Integer.MIN_VALUE), 0);
        int iF = awro.f(adzfVar.getMeasuredWidth() - adzfVar.g(), adzfVar.a());
        int iF2 = awro.f(adzfVar.getMeasuredHeight() - adzfVar.f(), adzfVar.b());
        adzp adzpVar3 = adzfVar.j;
        if (adzpVar3 != null) {
            listF = atqq.H(adzpVar3);
        } else {
            View view2 = adzfVar.b;
            if (view2 == null) {
                awrc.b("anchorView");
                view2 = null;
            }
            if (view2.getWindowToken() == null) {
                listF = atqq.H(adzp.i);
            } else {
                adzp adzpVar4 = adzfVar.c;
                adzpVar4.getClass();
                adzp adzpVarH = aecm.h(adzoVarF);
                adzp adzpVar5 = adzp.i;
                if (adzpVarH == adzpVar5) {
                    listF = atqq.H(adzpVar5);
                } else {
                    awoa awoaVar = new awoa(4);
                    if (adzpVar4 != adzpVar5) {
                        awoaVar.add(adzpVar4);
                    }
                    if (!awoaVar.contains(adzpVarH)) {
                        awoaVar.add(adzpVarH);
                    }
                    switch (adzpVarH.ordinal()) {
                        case 0:
                            adzpVar5 = adzp.d;
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        case 1:
                            adzpVar5 = adzp.e;
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        case 2:
                            adzpVar5 = adzp.f;
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        case 3:
                            adzpVar5 = adzp.a;
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        case 4:
                            adzpVar5 = adzp.b;
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        case 5:
                            adzpVar5 = adzp.c;
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        case 6:
                            adzpVar5 = adzp.h;
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        case 7:
                            adzpVar5 = adzp.g;
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        case 8:
                            if (!awoaVar.contains(adzpVar5)) {
                                awoaVar.add(adzpVar5);
                            }
                            if (adzoVarF.b.centerX() < adzoVarF.a.centerX()) {
                                adzpVar = adzp.g;
                            } else {
                                adzpVar = adzp.h;
                            }
                            if (!awoaVar.contains(adzpVar)) {
                                awoaVar.add(adzpVar);
                            }
                            listF = awoaVar.f();
                            break;
                        default:
                            throw new awmj();
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = listF.iterator();
        int i10 = 0;
        int width = 0;
        int i11 = 0;
        double d = Double.MAX_VALUE;
        adzp adzpVar6 = null;
        adzp adzpVar7 = null;
        int i12 = 0;
        while (it.hasNext()) {
            adzp adzpVar8 = (adzp) it.next();
            int i13 = i12;
            iF2 = iF2;
            int i14 = adzfVar.k;
            Size sizeG = aecm.g(adzpVar8, adzoVarF, i14);
            int i15 = iF;
            int iF3 = awro.f(awro.g(awro.g(iF, sizeG.getWidth()), i9), a());
            if (iF3 <= sizeG.getWidth()) {
                Iterator it2 = it;
                i = i13;
                double d2 = d;
                adzfVar = this;
                Size sizeH = adzfVar.h(adzpVar8, adzoVarF, i15, iF2, i9, i14, linkedHashMap2);
                int height = sizeH.getHeight();
                int i16 = i9;
                int iF4 = height - adzfVar.f();
                if (iF4 < adzfVar.b()) {
                    adzoVarF = adzoVarF;
                    linkedHashMap = linkedHashMap2;
                } else {
                    adzpVar8.getClass();
                    Rect rect = adzoVarF.b;
                    linkedHashMap = linkedHashMap2;
                    Rect rect2 = adzoVarF.a;
                    switch (adzpVar8.ordinal()) {
                        case 0:
                            iCenterX = rect.left;
                            i2 = rect.bottom;
                            i3 = i2 + i14;
                            int i17 = i3;
                            iCenterX2 = iCenterX;
                            i6 = i17;
                            Point point = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point.x - adzfVar.e;
                            i8 = point.y - adzfVar.f;
                            if (iF3 < i15 && iF4 >= iF2) {
                                adznVar = new adzn(adzpVar8, new Size(adzfVar.g() + iF3, height), new Point(i7, i8));
                                adzp adzpVar9 = adznVar.a;
                                adzfVar.c = adzpVar9;
                                adzfVar.j = adzpVar9;
                                adzfVar.m = adznVar;
                                return adznVar;
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                            break;
                        case 1:
                            iCenterX = rect.centerX() - (iF3 / 2);
                            i2 = rect.bottom;
                            i3 = i2 + i14;
                            int i18 = i3;
                            iCenterX2 = iCenterX;
                            i6 = i18;
                            Point point2 = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point2.x - adzfVar.e;
                            i8 = point2.y - adzfVar.f;
                            if (iF3 < i15) {
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                        case 2:
                            iCenterX = rect.right - iF3;
                            i2 = rect.bottom;
                            i3 = i2 + i14;
                            int i19 = i3;
                            iCenterX2 = iCenterX;
                            i6 = i19;
                            Point point3 = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point3.x - adzfVar.e;
                            i8 = point3.y - adzfVar.f;
                            if (iF3 < i15) {
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                        case 3:
                            iCenterX = rect.left;
                            i4 = rect.top;
                            i3 = (i4 - i14) - iF4;
                            int i110 = i3;
                            iCenterX2 = iCenterX;
                            i6 = i110;
                            Point point4 = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point4.x - adzfVar.e;
                            i8 = point4.y - adzfVar.f;
                            if (iF3 < i15) {
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                        case 4:
                            iCenterX = rect.centerX() - (iF3 / 2);
                            i4 = rect.top;
                            i3 = (i4 - i14) - iF4;
                            int i111 = i3;
                            iCenterX2 = iCenterX;
                            i6 = i111;
                            Point point5 = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point5.x - adzfVar.e;
                            i8 = point5.y - adzfVar.f;
                            if (iF3 < i15) {
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                        case 5:
                            iCenterX = rect.right - iF3;
                            i4 = rect.top;
                            i3 = (i4 - i14) - iF4;
                            int i112 = i3;
                            iCenterX2 = iCenterX;
                            i6 = i112;
                            Point point6 = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point6.x - adzfVar.e;
                            i8 = point6.y - adzfVar.f;
                            if (iF3 < i15) {
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                        case 6:
                            iCenterX = rect.right + i14;
                            iCenterY = rect.centerY();
                            i5 = iF4 / 2;
                            i3 = iCenterY - i5;
                            int i113 = i3;
                            iCenterX2 = iCenterX;
                            i6 = i113;
                            Point point7 = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point7.x - adzfVar.e;
                            i8 = point7.y - adzfVar.f;
                            if (iF3 < i15) {
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                        case 7:
                            iCenterX = (rect.left - i14) - iF3;
                            iCenterY = rect.centerY();
                            i5 = iF4 / 2;
                            i3 = iCenterY - i5;
                            int i114 = i3;
                            iCenterX2 = iCenterX;
                            i6 = i114;
                            Point point8 = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point8.x - adzfVar.e;
                            i8 = point8.y - adzfVar.f;
                            if (iF3 < i15) {
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                        case 8:
                            iCenterX2 = rect2.centerX() - (iF3 / 2);
                            adzoVarF = adzoVarF;
                            i6 = rect2.bottom - iF4;
                            Point point9 = new Point(awro.h(iCenterX2, rect2.left, Math.max(rect2.left, rect2.right - iF3)), awro.h(i6, rect2.top, Math.max(rect2.top, rect2.bottom - iF4)));
                            i7 = point9.x - adzfVar.e;
                            i8 = point9.y - adzfVar.f;
                            if (iF3 < i15) {
                            }
                            dHypot = Math.hypot(awro.f(i15 - iF3, 0), awro.f(iF2 - iF4, 0));
                            if (dHypot < d2) {
                                width = sizeH.getWidth();
                                iF2 = iF2;
                                i12 = i8;
                                adzpVar6 = adzpVar8;
                                adzpVar7 = adzpVar6;
                                iF = i15;
                                i11 = height;
                                it = it2;
                                i9 = i16;
                                i10 = i7;
                                d = dHypot;
                                linkedHashMap2 = linkedHashMap;
                                adzoVarF = adzoVarF;
                            }
                            break;
                        default:
                            throw new awmj();
                    }
                }
                adzpVar7 = adzpVar8;
                iF = i15;
                it = it2;
                d = d2;
                i9 = i16;
                linkedHashMap2 = linkedHashMap;
                adzoVarF = adzoVarF;
            } else {
                i = i13;
                adzfVar = this;
                iF = i15;
            }
            i10 = i10;
            i12 = i;
        }
        adzo adzoVar = adzoVarF;
        int i20 = i10;
        int i21 = i12;
        int i22 = i9;
        int i23 = iF2;
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        int i24 = iF;
        if (adzpVar6 != null) {
            if (adzpVar7 != adzpVar6) {
                adzpVar2 = adzpVar6;
                adzfVar.h(adzpVar2, adzoVar, i24, i23, i22, adzfVar.k, linkedHashMap3);
            } else {
                adzpVar2 = adzpVar6;
            }
            adznVar = new adzn(adzpVar2, new Size(width, i11), new Point(i20, i21));
        } else {
            adznVar = new adzn(adzp.b, new Size(awro.g(i24, i22) + adzfVar.g(), 0), new Point(0, 0));
        }
        adzp adzpVar10 = adznVar.a;
        adzfVar.c = adzpVar10;
        adzfVar.j = adzpVar10;
        adzfVar.m = adznVar;
        return adznVar;
    }

    public final void d() {
        View view = null;
        this.j = null;
        this.m = null;
        View view2 = this.b;
        if (view2 == null || view2.getWindowToken() == null) {
            return;
        }
        View view3 = this.b;
        if (view3 == null) {
            awrc.b("anchorView");
        } else {
            view = view3;
        }
        this.c = aecm.i(view);
    }

    public final void e(View view, View view2, View view3, boolean z) {
        this.m = null;
        LinearLayout linearLayout = this.a;
        linearLayout.removeAllViews();
        if (z) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.contextual_sheet_spinner_view_height);
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            ProgressBar progressBar = new ProgressBar(relativeLayout.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            relativeLayout.addView(progressBar, layoutParams);
            linearLayout.addView(relativeLayout, new LinearLayout.LayoutParams(-1, dimensionPixelSize));
            return;
        }
        if (view != null) {
            i(view);
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, -2));
        }
        if (view2 != null) {
            i(view2);
            linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        }
        if (view3 != null) {
            i(view3);
            linearLayout.addView(view3, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        requestLayout();
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        windowInsetsOnApplyWindowInsets.getClass();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        awqg awqgVar;
        super.onLayout(z, i, i2, i3, i4);
        adzn adznVar = this.m;
        if (adznVar == null || (awqgVar = this.i) == null) {
            return;
        }
        awqgVar.invoke(adznVar);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.b == null) {
            super.onMeasure(i, i2);
        } else {
            Size size = c().b;
            setMeasuredDimension(size.getWidth(), size.getHeight());
        }
    }
}
