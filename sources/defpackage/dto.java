package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dto extends dtg {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public dtm b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public dto(dtm dtmVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = dtmVar;
        this.d = c(dtmVar.c, dtmVar.d);
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static dto b(Resources resources, int i, Resources.Theme theme) {
        dto dtoVar = new dto();
        int i2 = avt.a;
        dtoVar.e = resources.getDrawable(i, theme);
        return dtoVar;
    }

    final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        float fWidth = rect.width();
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(SemanticState.Modal, (int) (fWidth * fAbs));
        int iMin2 = Math.min(SemanticState.Modal, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        dtm dtmVar = this.b;
        Bitmap bitmap = dtmVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != dtmVar.f.getHeight()) {
            dtmVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            dtmVar.k = true;
        }
        boolean z = this.c;
        dtm dtmVar2 = this.b;
        if (!z) {
            dtmVar2.a(iMin, iMin2);
        } else if (dtmVar2.k || dtmVar2.g != dtmVar2.c || dtmVar2.h != dtmVar2.d || dtmVar2.j != dtmVar2.e || dtmVar2.i != dtmVar2.b.getRootAlpha()) {
            this.b.a(iMin, iMin2);
            dtm dtmVar3 = this.b;
            dtmVar3.g = dtmVar3.c;
            dtmVar3.h = dtmVar3.d;
            dtmVar3.i = dtmVar3.b.getRootAlpha();
            dtmVar3.j = dtmVar3.e;
            dtmVar3.k = false;
        }
        dtm dtmVar4 = this.b;
        if (dtmVar4.b.getRootAlpha() < 255 || colorFilter != null) {
            if (dtmVar4.l == null) {
                dtmVar4.l = new Paint();
                dtmVar4.l.setFilterBitmap(true);
            }
            dtmVar4.l.setAlpha(dtmVar4.b.getRootAlpha());
            dtmVar4.l.setColorFilter(colorFilter);
            paint = dtmVar4.l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(dtmVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new dtn(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListA;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        dtm dtmVar = this.b;
        dtmVar.b = new dtl();
        TypedArray typedArrayF = aun.f(resources, theme, attributeSet, dsy.a);
        dtm dtmVar2 = this.b;
        dtl dtlVar = dtmVar2.b;
        dtmVar2.d = a.l(aun.d(typedArrayF, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        int i = 2;
        if (aun.j(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayF.getValue(1, typedValue);
            if (typedValue.type == 2) {
                typedValue.toString();
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
            }
            if (typedValue.type < 28 || typedValue.type > 31) {
                Resources resources2 = typedArrayF.getResources();
                int resourceId = typedArrayF.getResourceId(1, 0);
                int i2 = avn.a;
                try {
                    colorStateListA = avn.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    colorStateListA = null;
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListA = null;
        }
        if (colorStateListA != null) {
            dtmVar2.c = colorStateListA;
        }
        boolean z = dtmVar2.e;
        if (aun.j(xmlPullParser, "autoMirrored")) {
            z = typedArrayF.getBoolean(5, z);
        }
        dtmVar2.e = z;
        dtlVar.g = aun.b(typedArrayF, xmlPullParser, "viewportWidth", 7, dtlVar.g);
        float fB = aun.b(typedArrayF, xmlPullParser, "viewportHeight", 8, dtlVar.h);
        dtlVar.h = fB;
        if (dtlVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayF.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fB <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayF.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
        }
        int i3 = 3;
        dtlVar.e = typedArrayF.getDimension(3, dtlVar.e);
        float dimension = typedArrayF.getDimension(2, dtlVar.f);
        dtlVar.f = dimension;
        if (dtlVar.e <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayF.getPositionDescription()).concat("<vector> tag requires width > 0"));
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayF.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        dtlVar.setAlpha(aun.b(typedArrayF, xmlPullParser, "alpha", 4, dtlVar.getAlpha()));
        String string = typedArrayF.getString(0);
        if (string != null) {
            dtlVar.j = string;
            dtlVar.l.put(string, dtlVar);
        }
        typedArrayF.recycle();
        dtmVar.a = getChangingConfigurations();
        dtmVar.k = true;
        dtm dtmVar3 = this.b;
        dtl dtlVar2 = dtmVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dtlVar2.d);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        for (int i4 = 1; eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i3); i4 = 1) {
            if (eventType == i) {
                String name = xmlPullParser.getName();
                dtj dtjVar = (dtj) arrayDeque.peek();
                if (dtjVar == null) {
                    depth = depth;
                } else if ("path".equals(name)) {
                    dti dtiVar = new dti();
                    TypedArray typedArrayF2 = aun.f(resources, theme, attributeSet, dsy.c);
                    dtiVar.a = null;
                    if (aun.j(xmlPullParser, "pathData")) {
                        String string2 = typedArrayF2.getString(0);
                        if (string2 != null) {
                            dtiVar.n = string2;
                        }
                        String string3 = typedArrayF2.getString(2);
                        if (string3 != null) {
                            dtiVar.m = avd.b(string3);
                        }
                        dtiVar.l = aun.p(typedArrayF2, xmlPullParser, theme, "fillColor", 1);
                        dtiVar.d = aun.b(typedArrayF2, xmlPullParser, "fillAlpha", 12, dtiVar.d);
                        int iD = aun.d(typedArrayF2, xmlPullParser, "strokeLineCap", 8, -1);
                        Paint.Cap cap = dtiVar.h;
                        if (iD == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (iD == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (iD == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        dtiVar.h = cap;
                        int iD2 = aun.d(typedArrayF2, xmlPullParser, "strokeLineJoin", 9, -1);
                        Paint.Join join = dtiVar.i;
                        if (iD2 == 0) {
                            join = Paint.Join.MITER;
                        } else if (iD2 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (iD2 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        dtiVar.i = join;
                        dtiVar.j = aun.b(typedArrayF2, xmlPullParser, "strokeMiterLimit", 10, dtiVar.j);
                        dtiVar.k = aun.p(typedArrayF2, xmlPullParser, theme, "strokeColor", 3);
                        dtiVar.c = aun.b(typedArrayF2, xmlPullParser, "strokeAlpha", 11, dtiVar.c);
                        dtiVar.b = aun.b(typedArrayF2, xmlPullParser, "strokeWidth", 4, dtiVar.b);
                        dtiVar.f = aun.b(typedArrayF2, xmlPullParser, "trimPathEnd", 6, dtiVar.f);
                        dtiVar.g = aun.b(typedArrayF2, xmlPullParser, "trimPathOffset", 7, dtiVar.g);
                        dtiVar.e = aun.b(typedArrayF2, xmlPullParser, "trimPathStart", 5, dtiVar.e);
                        dtiVar.o = aun.d(typedArrayF2, xmlPullParser, "fillType", 13, dtiVar.o);
                    }
                    typedArrayF2.recycle();
                    dtjVar.b.add(dtiVar);
                    if (dtiVar.getPathName() != null) {
                        dtlVar2.l.put(dtiVar.getPathName(), dtiVar);
                    }
                    int i5 = dtmVar3.a;
                    i3 = 3;
                    z2 = false;
                } else {
                    depth = depth;
                    if ("clip-path".equals(name)) {
                        dth dthVar = new dth();
                        if (aun.j(xmlPullParser, "pathData")) {
                            TypedArray typedArrayF3 = aun.f(resources, theme, attributeSet, dsy.d);
                            String string4 = typedArrayF3.getString(0);
                            if (string4 != null) {
                                dthVar.n = string4;
                            }
                            String string5 = typedArrayF3.getString(1);
                            if (string5 != null) {
                                dthVar.m = avd.b(string5);
                            }
                            dthVar.o = aun.d(typedArrayF3, xmlPullParser, "fillType", 2, 0);
                            typedArrayF3.recycle();
                        }
                        dtjVar.b.add(dthVar);
                        if (dthVar.getPathName() != null) {
                            dtlVar2.l.put(dthVar.getPathName(), dthVar);
                        }
                        int i6 = dtmVar3.a;
                    } else if ("group".equals(name)) {
                        dtj dtjVar2 = new dtj();
                        TypedArray typedArrayF4 = aun.f(resources, theme, attributeSet, dsy.b);
                        dtjVar2.l = null;
                        dtjVar2.c = aun.b(typedArrayF4, xmlPullParser, "rotation", 5, dtjVar2.c);
                        dtjVar2.d = typedArrayF4.getFloat(1, dtjVar2.d);
                        dtjVar2.e = typedArrayF4.getFloat(2, dtjVar2.e);
                        dtjVar2.f = aun.b(typedArrayF4, xmlPullParser, "scaleX", 3, dtjVar2.f);
                        dtjVar2.g = aun.b(typedArrayF4, xmlPullParser, "scaleY", 4, dtjVar2.g);
                        dtjVar2.h = aun.b(typedArrayF4, xmlPullParser, "translateX", 6, dtjVar2.h);
                        dtjVar2.i = aun.b(typedArrayF4, xmlPullParser, "translateY", 7, dtjVar2.i);
                        String string6 = typedArrayF4.getString(0);
                        if (string6 != null) {
                            dtjVar2.m = string6;
                        }
                        dtjVar2.a();
                        typedArrayF4.recycle();
                        dtjVar.b.add(dtjVar2);
                        arrayDeque.push(dtjVar2);
                        if (dtjVar2.getGroupName() != null) {
                            dtlVar2.l.put(dtjVar2.getGroupName(), dtjVar2);
                        }
                        int i7 = dtmVar3.a;
                    }
                }
                i3 = 3;
            } else {
                depth = depth;
                if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            depth = depth;
            i = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.d = c(dtmVar.c, dtmVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        dtm dtmVar;
        ColorStateList colorStateList;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((dtmVar = this.b) != null && (dtmVar.b() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.g && super.mutate() == this) {
            this.b = new dtm(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.dtg, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        dtm dtmVar = this.b;
        ColorStateList colorStateList = dtmVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = dtmVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (dtmVar.b()) {
            boolean zC = dtmVar.b.d.c(iArr);
            dtmVar.k |= zC;
            if (zC) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        dtm dtmVar = this.b;
        if (dtmVar.c != colorStateList) {
            dtmVar.c = colorStateList;
            this.d = c(colorStateList, dtmVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        dtm dtmVar = this.b;
        if (dtmVar.d != mode) {
            dtmVar.d = mode;
            this.d = c(dtmVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public dto() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new dtm();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
