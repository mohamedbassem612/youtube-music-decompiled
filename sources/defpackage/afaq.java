package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afaq {
    public final ColorStateList a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public ColorStateList k;
    public final float l;
    public Typeface n;
    private final int o;
    public boolean m = false;
    private boolean p = false;

    public afaq(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, he.w);
        this.l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.k = afba.f(context, typedArrayObtainStyledAttributes, 3);
        afba.f(context, typedArrayObtainStyledAttributes, 4);
        afba.f(context, typedArrayObtainStyledAttributes, 5);
        this.d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = true != typedArrayObtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.o = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = afba.f(context, typedArrayObtainStyledAttributes, 6);
        this.f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, afan.a);
        this.i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.c = typedArrayObtainStyledAttributes2.getString(true != typedArrayObtainStyledAttributes2.hasValue(3) ? 1 : 3);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void f() {
        Typeface typeface;
        String str;
        Typeface typefaceCreate = this.n;
        if (typefaceCreate == null && (str = this.b) != null) {
            typefaceCreate = Typeface.create(str, this.d);
            this.n = typefaceCreate;
        }
        if (typefaceCreate == null) {
            int i = this.e;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        typeface = Typeface.DEFAULT;
                        this.n = typeface;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                    this.n = Typeface.create(typeface, this.d);
                }
                typeface = Typeface.SERIF;
            }
            this.n = typeface;
            this.n = Typeface.create(typeface, this.d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r3 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean g(android.content.Context r7) {
        /*
            r6 = this;
            boolean r0 = r6.m
            r1 = 1
            if (r0 != 0) goto L79
            int r0 = r6.o
            r2 = 0
            if (r0 == 0) goto L73
            android.graphics.Typeface r3 = defpackage.avt.b(r7, r0)
            if (r3 != 0) goto L75
            boolean r3 = r6.p
            r4 = 0
            if (r3 != 0) goto L68
            r6.p = r1
            android.content.res.Resources r7 = r7.getResources()
            if (r0 == 0) goto L5d
            java.lang.String r3 = r7.getResourceTypeName(r0)
            java.lang.String r5 = "font"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L5d
            android.content.res.XmlResourceParser r0 = r7.getXml(r0)     // Catch: java.lang.Throwable -> L5d
        L2d:
            int r3 = r0.getEventType()     // Catch: java.lang.Throwable -> L5d
            if (r3 == r1) goto L5d
            int r3 = r0.getEventType()     // Catch: java.lang.Throwable -> L5d
            r5 = 2
            if (r3 != r5) goto L59
            java.lang.String r3 = r0.getName()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "font-family"
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L59
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r0)     // Catch: java.lang.Throwable -> L5d
            int[] r3 = defpackage.asz.b     // Catch: java.lang.Throwable -> L5d
            android.content.res.TypedArray r7 = r7.obtainAttributes(r0, r3)     // Catch: java.lang.Throwable -> L5d
            r0 = 7
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L5d
            r7.recycle()     // Catch: java.lang.Throwable -> L5d
            goto L5e
        L59:
            r0.next()     // Catch: java.lang.Throwable -> L5d
            goto L2d
        L5d:
            r0 = r4
        L5e:
            if (r0 == 0) goto L68
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r0, r2)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            if (r7 != r0) goto L6a
        L68:
            r3 = r4
            goto L71
        L6a:
            int r0 = r6.d
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r0)
            r3 = r7
        L71:
            if (r3 != 0) goto L75
        L73:
            r1 = r2
            goto L79
        L75:
            r6.n = r3
            r6.m = r1
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afaq.g(android.content.Context):boolean");
    }

    public final Typeface a() {
        f();
        return this.n;
    }

    public final void b(Context context, afar afarVar) {
        if (!g(context)) {
            f();
        }
        int i = this.o;
        if (i == 0) {
            this.m = true;
            i = 0;
        }
        if (this.m) {
            afarVar.b(this.n, true);
            return;
        }
        try {
            avt.d(context, i, new afao(this, afarVar));
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            afarVar.a(1);
        } catch (Exception unused2) {
            this.m = true;
            afarVar.a(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, afar afarVar) {
        d(context, textPaint, afarVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.k.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(Context context, TextPaint textPaint, afar afarVar) {
        Typeface typeface;
        if (g(context) && this.m && (typeface = this.n) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new afap(this, context, textPaint, afarVar));
        }
    }

    public final void e(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceD = afba.d(context.getResources().getConfiguration(), typeface);
        if (typefaceD != null) {
            typeface = typefaceD;
        }
        textPaint.setTypeface(typeface);
        int i = this.d & (~typeface.getStyle());
        textPaint.setFakeBoldText(1 == (i & 1));
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
