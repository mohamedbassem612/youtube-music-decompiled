package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.apps.youtube.music.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avn {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:75:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x0134  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f;
        float f2;
        int iAlpha;
        int i;
        int[] iArr;
        double d;
        float f3;
        float f4;
        int i2;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = asz.a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i3, i3);
                int resourceId = ObtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = b;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    if (typedValue.type < 28 || typedValue.type > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i3, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i3, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i3, -65281);
                }
                float f5 = 1.0f;
                if (ObtainAttributes.hasValue(r4)) {
                    f = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                float f6 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                ?? r16 = r4;
                int i5 = i3;
                int i6 = i5;
                while (true) {
                    f2 = f5;
                    if (i6 >= attributeCount) {
                        break;
                    }
                    int attributeNameResource = attributeSet.getAttributeNameResource(i6);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i7 = i5 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i6, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i5] = attributeNameResource;
                        i5 = i7;
                    }
                    i6++;
                    f5 = f2;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i5);
                boolean z = (f6 < 0.0f || f6 > 100.0f) ? false : r16 == true ? 1 : 0;
                boolean z2 = z;
                if (f != f2) {
                    iAlpha = (int) ((Color.alpha(color) * f) + 0.5f);
                    if (iAlpha < 0) {
                        i = 0;
                    } else {
                        i = 255;
                        if (iAlpha <= 255) {
                            i = iAlpha;
                        }
                    }
                    if (z2) {
                        avl avlVarB = avl.b(color);
                        float f7 = avlVarB.a;
                        float f8 = avlVarB.b;
                        iArr = iArr2;
                        d = f8;
                        avu avuVar = avu.a;
                        if (d >= 1.0d) {
                            f3 = f6;
                            if (Math.round(f6) <= 0.0d && Math.round(f3) < 100.0d) {
                                float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
                                float f9 = f8;
                                boolean z3 = r16 == true ? 1 : 0;
                                float f10 = 0.0f;
                                avl avlVar = null;
                                while (true) {
                                    if (Math.abs(f10 - f8) < 0.4f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        if (avlVar != null) {
                                            color = avlVar.a(avuVar);
                                            break;
                                        }
                                        color = avm.b(f3);
                                        break;
                                    }
                                    float f11 = 1000.0f;
                                    float f12 = 0.0f;
                                    float f13 = 100.0f;
                                    float f14 = 1000.0f;
                                    avl avlVar2 = null;
                                    while (true) {
                                        if (Math.abs(f12 - f13) <= 0.01f) {
                                            iArrTrimStateSet = iArrTrimStateSet;
                                            depth2 = depth2;
                                            fMin = fMin;
                                            break;
                                        }
                                        float f15 = f12 + ((f13 - f12) / 2.0f);
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        int iA = avl.c(f15, f9, fMin).a(avuVar);
                                        int i8 = avm.e;
                                        float fA = avm.a(Color.red(iA));
                                        float fA2 = avm.a(Color.green(iA));
                                        float fA3 = avm.a(Color.blue(iA));
                                        float[] fArr = avm.d[r16 == true ? 1 : 0];
                                        float f16 = (((fA * fArr[0]) + (fA2 * fArr[r16 == true ? 1 : 0])) + (fA3 * fArr[2])) / 100.0f;
                                        float fCbrt = f16 <= 0.008856452f ? f16 * 903.2963f : (((float) Math.cbrt(f16)) * 116.0f) - 16.0f;
                                        float fAbs = Math.abs(f3 - fCbrt);
                                        if (fAbs < 0.2f) {
                                            f4 = fCbrt;
                                            avl avlVarB2 = avl.b(iA);
                                            avl avlVarC = avl.c(avlVarB2.c, avlVarB2.b, fMin);
                                            float f17 = avlVarB2.d;
                                            float f18 = avlVarC.d;
                                            float f19 = avlVarB2.e;
                                            float f20 = avlVarC.e;
                                            float f21 = avlVarB2.f - avlVarC.f;
                                            float f22 = f19 - f20;
                                            float f23 = f17 - f18;
                                            double dSqrt = Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21));
                                            depth2 = depth2;
                                            fMin = fMin;
                                            float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                            if (fPow <= f2) {
                                                avlVar2 = avlVarB2;
                                                f14 = fPow;
                                                f11 = fAbs;
                                            }
                                        } else {
                                            f4 = fCbrt;
                                            depth2 = depth2;
                                            fMin = fMin;
                                        }
                                        if (f11 == 0.0f && f14 == 0.0f) {
                                            break;
                                        }
                                        if (f4 >= f3) {
                                            f13 = f15;
                                        }
                                        if (f4 < f3) {
                                            f12 = f15;
                                        }
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        fMin = fMin;
                                    }
                                    avl avlVar3 = avlVar2;
                                    if (!z3) {
                                        if (avlVar3 != null) {
                                            avlVar = avlVar3;
                                            f10 = f9;
                                        } else {
                                            f8 = f9;
                                        }
                                        f9 = f10 + ((f8 - f10) / 2.0f);
                                    } else {
                                        if (avlVar3 != null) {
                                            color = avlVar3.a(avuVar);
                                            break;
                                        }
                                        f9 = f10 + ((f8 - f10) / 2.0f);
                                        z3 = false;
                                    }
                                }
                            }
                        } else {
                            f3 = f6;
                        }
                        color = avm.b(f3);
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                        iArr = iArr2;
                    }
                    color = (color & 16777215) | (i << 24);
                } else if (z) {
                    z2 = r16 == true ? 1 : 0;
                    iAlpha = (int) ((Color.alpha(color) * f) + 0.5f);
                    if (iAlpha < 0) {
                        i = 0;
                    } else {
                        i = 255;
                        if (iAlpha <= 255) {
                            i = iAlpha;
                        }
                    }
                    if (z2) {
                        avl avlVarB3 = avl.b(color);
                        float f24 = avlVarB3.a;
                        float f25 = avlVarB3.b;
                        iArr = iArr2;
                        d = f25;
                        avu avuVar2 = avu.a;
                        if (d >= 1.0d) {
                            f3 = f6;
                            if (Math.round(f6) <= 0.0d) {
                            }
                        } else {
                            f3 = f6;
                        }
                        color = avm.b(f3);
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                        iArr = iArr2;
                    }
                    color = (color & 16777215) | (i << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                    iArr = iArr2;
                }
                int i9 = i4 + 1;
                if (i9 > iArr.length) {
                    int[] iArr5 = new int[ast.e(i4)];
                    i2 = 0;
                    System.arraycopy(iArr, 0, iArr5, 0, i4);
                    iArr2 = iArr5;
                } else {
                    i2 = 0;
                    iArr2 = iArr;
                }
                iArr2[i4] = color;
                if (i9 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), ast.e(i4));
                    System.arraycopy(objArr, i2, objArr2, i2, i4);
                    objArr = objArr2;
                }
                objArr[i4] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i4 = i9;
                r4 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i3 = 0;
            } else {
                iArr2 = iArr2;
                r4 = r4 == true ? 1 : 0;
                depth2 = depth2;
                i3 = 0;
            }
        }
        int[] iArr6 = new int[i4];
        int[][] iArr7 = new int[i4][];
        System.arraycopy(iArr2, 0, iArr6, 0, i4);
        System.arraycopy(objArr, 0, iArr7, 0, i4);
        return new ColorStateList(iArr7, iArr6);
    }
}
