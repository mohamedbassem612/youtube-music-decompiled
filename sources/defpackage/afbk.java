package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afbk implements afbj {
    public static final afay a = new afbh(0.5f);
    public final afay b;
    public final afay c;
    public final afay d;
    public final afay e;
    public final afba f;
    public final afba g;
    public final afba h;
    public final afba i;
    public final afba j;
    public final afba k;
    public final afba l;
    public final afba m;

    public afbk() {
        this.j = new afbi();
        this.k = new afbi();
        this.l = new afbi();
        this.m = new afbi();
        this.b = new afav(0.0f);
        this.c = new afav(0.0f);
        this.d = new afav(0.0f);
        this.e = new afav(0.0f);
        this.f = new afba();
        this.g = new afba();
        this.h = new afba();
        this.i = new afba();
    }

    public static afay e(TypedArray typedArray, int i, afay afayVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return afayVar;
        }
        if (typedValuePeekValue.type == 5) {
            return new afav(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return typedValuePeekValue.type == 6 ? new afbh(typedValuePeekValue.getFraction(1.0f, 1.0f)) : afayVar;
    }

    public static afli g(Resources.Theme theme, int i) {
        return k(theme.obtainStyledAttributes(i, afbg.b), new afav(0.0f));
    }

    public static afli h(Context context, int i, int i2, afay afayVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return k(contextThemeWrapper.obtainStyledAttributes(afbg.b), afayVar);
    }

    public static afli i(Context context, AttributeSet attributeSet, int i, int i2, afay afayVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afbg.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return h(context, resourceId, resourceId2, afayVar);
    }

    public static afli j(Context context, AttributeSet attributeSet, int i, int i2) {
        return i(context, attributeSet, i, i2, new afav(0.0f));
    }

    private static afli k(TypedArray typedArray, afay afayVar) {
        try {
            int[] iArr = afbg.a;
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            afay afayVarE = e(typedArray, 5, afayVar);
            afay afayVarE2 = e(typedArray, 8, afayVarE);
            afay afayVarE3 = e(typedArray, 9, afayVarE);
            afay afayVarE4 = e(typedArray, 7, afayVarE);
            afay afayVarE5 = e(typedArray, 6, afayVarE);
            afli afliVar = new afli((byte[]) null);
            afliVar.l(afba.q(i2));
            afliVar.d = afayVarE2;
            afliVar.m(afba.q(i3));
            afliVar.k = afayVarE3;
            afliVar.k(afba.q(i4));
            afliVar.f = afayVarE4;
            afliVar.j(afba.q(i5));
            afliVar.b = afayVarE5;
            return afliVar;
        } finally {
            typedArray.recycle();
        }
    }

    @Override // defpackage.afbj
    public final afbk c(float f) {
        afli afliVar = new afli(this);
        afliVar.h(f);
        return new afbk(afliVar);
    }

    @Override // defpackage.afbj
    public final boolean d() {
        return false;
    }

    public final boolean f(RectF rectF) {
        boolean z = this.i.getClass().equals(afba.class) && this.g.getClass().equals(afba.class) && this.f.getClass().equals(afba.class) && this.h.getClass().equals(afba.class);
        float fA = this.b.a(rectF);
        return z && ((this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0 && (this.e.a(rectF) > fA ? 1 : (this.e.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0) && (this.k instanceof afbi) && (this.j instanceof afbi) && (this.l instanceof afbi) && (this.m instanceof afbi);
    }

    public final String toString() {
        afay afayVar = this.e;
        afay afayVar2 = this.d;
        afay afayVar3 = this.c;
        return "[" + String.valueOf(this.b) + ", " + String.valueOf(afayVar3) + ", " + String.valueOf(afayVar2) + ", " + String.valueOf(afayVar) + ']';
    }

    @Override // defpackage.afbj
    public final afbk a() {
        return this;
    }

    @Override // defpackage.afbj
    public final afbk b(int[] iArr) {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [afay, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [afay, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [afay, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [afay, java.lang.Object] */
    public afbk(afli afliVar) {
        this.j = (afba) afliVar.e;
        this.k = (afba) afliVar.g;
        this.l = (afba) afliVar.c;
        this.m = (afba) afliVar.j;
        this.b = afliVar.d;
        this.c = afliVar.k;
        this.d = afliVar.f;
        this.e = afliVar.b;
        this.f = (afba) afliVar.a;
        this.g = (afba) afliVar.i;
        this.h = (afba) afliVar.l;
        this.i = (afba) afliVar.h;
    }
}
