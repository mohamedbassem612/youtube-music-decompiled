package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asl {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private final HashMap e = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        int[] iArr = asp.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int iIndexOf;
        int dimensionPixelSize;
        asf asfVar;
        ash ashVar;
        asb asbVar;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof asb) {
                    asbVar = (asb) obj;
                    if (i2 == 0) {
                        asbVar.width = i4;
                        asbVar.aa = z;
                        return;
                    } else {
                        asbVar.height = i4;
                        asbVar.ab = z;
                        return;
                    }
                }
                if (obj instanceof ash) {
                    ashVar = (ash) obj;
                    if (i2 == 0) {
                        ashVar.d = i4;
                        ashVar.an = z;
                        return;
                    } else {
                        ashVar.e = i4;
                        ashVar.ao = z;
                        return;
                    }
                }
                if (obj instanceof asf) {
                    asfVar = (asf) obj;
                    if (i2 == 0) {
                        asfVar.b(23, i4);
                        asfVar.d(80, z);
                        return;
                    } else {
                        asfVar.b(21, i4);
                        asfVar.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof asb) {
                asbVar = (asb) obj;
                if (i2 == 0) {
                    asbVar.width = i4;
                    asbVar.aa = z;
                    return;
                } else {
                    asbVar.height = i4;
                    asbVar.ab = z;
                    return;
                }
            }
            if (obj instanceof ash) {
                ashVar = (ash) obj;
                if (i2 == 0) {
                    ashVar.d = i4;
                    ashVar.an = z;
                    return;
                } else {
                    ashVar.e = i4;
                    ashVar.ao = z;
                    return;
                }
            }
            if (obj instanceof asf) {
                asfVar = (asf) obj;
                if (i2 == 0) {
                    asfVar.b(23, i4);
                    asfVar.d(80, z);
                    return;
                } else {
                    asfVar.b(21, i4);
                    asfVar.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null || (iIndexOf = string.indexOf(61)) <= 0 || iIndexOf >= string.length() - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof asb) {
                    asb asbVar2 = (asb) obj;
                    if (i2 == 0) {
                        asbVar2.width = 0;
                    } else {
                        asbVar2.height = 0;
                    }
                    h(asbVar2, strTrim2);
                    return;
                }
                if (obj instanceof ash) {
                    ((ash) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof asf) {
                        ((asf) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof asb) {
                        asb asbVar3 = (asb) obj;
                        if (i2 == 0) {
                            asbVar3.width = 0;
                            asbVar3.L = f;
                            return;
                        } else {
                            asbVar3.height = 0;
                            asbVar3.M = f;
                            return;
                        }
                    }
                    if (obj instanceof ash) {
                        ash ashVar2 = (ash) obj;
                        if (i2 == 0) {
                            ashVar2.d = 0;
                            ashVar2.W = f;
                            return;
                        } else {
                            ashVar2.e = 0;
                            ashVar2.V = f;
                            return;
                        }
                    }
                    if (obj instanceof asf) {
                        asf asfVar2 = (asf) obj;
                        if (i2 == 0) {
                            asfVar2.b(23, 0);
                            asfVar2.a(39, f);
                            return;
                        } else {
                            asfVar2.b(21, 0);
                            asfVar2.a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof asb) {
                        asb asbVar4 = (asb) obj;
                        if (i2 == 0) {
                            asbVar4.width = 0;
                            asbVar4.V = fMax;
                            asbVar4.P = 2;
                            return;
                        } else {
                            asbVar4.height = 0;
                            asbVar4.W = fMax;
                            asbVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof ash) {
                        ash ashVar3 = (ash) obj;
                        if (i2 == 0) {
                            ashVar3.d = 0;
                            ashVar3.af = fMax;
                            ashVar3.Z = 2;
                            return;
                        } else {
                            ashVar3.e = 0;
                            ashVar3.ag = fMax;
                            ashVar3.aa = 2;
                            return;
                        }
                    }
                    if (obj instanceof asf) {
                        asf asfVar3 = (asf) obj;
                        if (i2 == 0) {
                            asfVar3.b(23, 0);
                            asfVar3.b(54, 2);
                        } else {
                            asfVar3.b(21, 0);
                            asfVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void h(asb asbVar, String str) {
        int i;
        int i2 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            int i3 = 0;
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i3 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i4 = i3;
                i3 = iIndexOf + 1;
                i = i4;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i3);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i3, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            fAbs = i == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            i2 = i;
        }
        asbVar.I = str;
        asbVar.J = fAbs;
        asbVar.K = i2;
    }

    private static final int[] k(View view, String str) {
        int length;
        int iIntValue;
        Object objD;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = aso.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objD = ((ConstraintLayout) view.getParent()).d(strTrim)) != null && (objD instanceof Integer)) ? ((Integer) objD).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private static final asg l(Context context, AttributeSet attributeSet, boolean z) {
        asg asgVar = new asg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? asp.c : asp.a);
        String str = "unused attribute 0x";
        int i = 0;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            asf asfVar = new asf();
            asgVar.g = asfVar;
            asi asiVar = asgVar.c;
            asiVar.b = false;
            ash ashVar = asgVar.d;
            ashVar.c = false;
            asj asjVar = asgVar.b;
            asjVar.a = false;
            ask askVar = asgVar.e;
            askVar.b = false;
            while (i < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = i;
                String str2 = str;
                int i3 = indexCount;
                switch (d.get(index)) {
                    case 2:
                        asfVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.K));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 5:
                        asfVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 6:
                        asfVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ashVar.E));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 7:
                        asfVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ashVar.F));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 8:
                        asfVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.L));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 11:
                        asfVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.R));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 12:
                        asfVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.S));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 13:
                        asfVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.O));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 14:
                        asfVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.Q));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 15:
                        asfVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.T));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 16:
                        asfVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.P));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 17:
                        asfVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ashVar.f));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 18:
                        asfVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ashVar.g));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 19:
                        asfVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, ashVar.h));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 20:
                        asfVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, ashVar.y));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 21:
                        asfVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, ashVar.e));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 22:
                        asfVar.b(22, a[typedArrayObtainStyledAttributes.getInt(index, asjVar.b)]);
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 23:
                        asfVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, ashVar.d));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 24:
                        asfVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.H));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 27:
                        asfVar.b(27, typedArrayObtainStyledAttributes.getInt(index, ashVar.G));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 28:
                        asfVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.I));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 31:
                        asfVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.M));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 34:
                        asfVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.J));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 37:
                        asfVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, ashVar.z));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 38:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, asgVar.a);
                        asgVar.a = resourceId;
                        asfVar.b(38, resourceId);
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 39:
                        asfVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, ashVar.W));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 40:
                        asfVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, ashVar.V));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 41:
                        asfVar.b(41, typedArrayObtainStyledAttributes.getInt(index, ashVar.X));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 42:
                        asfVar.b(42, typedArrayObtainStyledAttributes.getInt(index, ashVar.Y));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 43:
                        asfVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, asjVar.d));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 44:
                        asfVar.d(44, true);
                        asfVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, askVar.o));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 45:
                        asfVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, askVar.d));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 46:
                        asfVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, askVar.e));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 47:
                        asfVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, askVar.f));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 48:
                        asfVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, askVar.g));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 49:
                        asfVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, askVar.h));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 50:
                        asfVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, askVar.i));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 51:
                        asfVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, askVar.k));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 52:
                        asfVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, askVar.l));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 53:
                        asfVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, askVar.m));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 54:
                        asfVar.b(54, typedArrayObtainStyledAttributes.getInt(index, ashVar.Z));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 55:
                        asfVar.b(55, typedArrayObtainStyledAttributes.getInt(index, ashVar.aa));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 56:
                        asfVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.ab));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 57:
                        asfVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.ac));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 58:
                        asfVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.ad));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 59:
                        asfVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.ae));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 60:
                        asfVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, askVar.c));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 62:
                        asfVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.C));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 63:
                        asfVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, ashVar.D));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 64:
                        asfVar.b(64, a(typedArrayObtainStyledAttributes, index, asiVar.c));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            asfVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            continue;
                        } else {
                            asfVar.c(65, aqz.a[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 66:
                        asfVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 67:
                        asfVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, asiVar.j));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 68:
                        asfVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, asjVar.e));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 69:
                        asfVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 70:
                        asfVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 72:
                        asfVar.b(72, typedArrayObtainStyledAttributes.getInt(index, ashVar.ah));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 73:
                        asfVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.ai));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 74:
                        asfVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 75:
                        asfVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, ashVar.ap));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 76:
                        asfVar.b(76, typedArrayObtainStyledAttributes.getInt(index, asiVar.f));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 77:
                        asfVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 78:
                        asfVar.b(78, typedArrayObtainStyledAttributes.getInt(index, asjVar.c));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 79:
                        asfVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, asiVar.h));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 80:
                        asfVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, ashVar.an));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 81:
                        asfVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, ashVar.ao));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 82:
                        asfVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, asiVar.d));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 83:
                        asfVar.b(83, a(typedArrayObtainStyledAttributes, index, askVar.j));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 84:
                        asfVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, asiVar.l));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 85:
                        asfVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, asiVar.k));
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 86:
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        str2 = str;
                        if (typedValuePeekValue.type == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            asiVar.n = resourceId2;
                            asfVar.b(89, resourceId2);
                            if (asiVar.n != -1) {
                                asfVar.b(88, -2);
                            } else {
                                continue;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            asiVar.m = typedArrayObtainStyledAttributes.getString(index);
                            asfVar.c(90, asiVar.m);
                            if (asiVar.m.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                asiVar.n = resourceId3;
                                asfVar.b(89, resourceId3);
                                asfVar.b(88, -2);
                            } else {
                                asfVar.b(88, -1);
                            }
                        } else {
                            asfVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, asiVar.n));
                        }
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                    case 87:
                        Log.w("ConstraintSet", str + Integer.toHexString(index) + "   " + c.get(index));
                        break;
                    case 93:
                        asfVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.N));
                        break;
                    case 94:
                        asfVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ashVar.U));
                        break;
                    case 95:
                        g(asfVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        g(asfVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        asfVar.b(97, typedArrayObtainStyledAttributes.getInt(index, ashVar.aq));
                        break;
                    case 98:
                        i3 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            asgVar.a = typedArrayObtainStyledAttributes.getResourceId(index, asgVar.a);
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                        }
                        break;
                    case 99:
                        asfVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, ashVar.i));
                        str2 = str;
                        i3 = indexCount;
                        continue;
                        i = i2 + 1;
                        indexCount = i3;
                        str = str2;
                        break;
                }
                str2 = str;
                i = i2 + 1;
                indexCount = i3;
                str = str2;
            }
        } else {
            String str3 = "unused attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i4 = 0;
            while (i4 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index2 != 1 && index2 != 23 && index2 != 24) {
                    asgVar.c.b = true;
                    asgVar.d.c = true;
                    asgVar.b.a = true;
                    asgVar.e.b = true;
                }
                SparseIntArray sparseIntArray = c;
                String str4 = str3;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        ash ashVar2 = asgVar.d;
                        ashVar2.r = a(typedArrayObtainStyledAttributes, index2, ashVar2.r);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 2:
                        ash ashVar3 = asgVar.d;
                        ashVar3.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar3.K);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 3:
                        ash ashVar4 = asgVar.d;
                        ashVar4.q = a(typedArrayObtainStyledAttributes, index2, ashVar4.q);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 4:
                        ash ashVar5 = asgVar.d;
                        ashVar5.p = a(typedArrayObtainStyledAttributes, index2, ashVar5.p);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 5:
                        asgVar.d.A = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 6:
                        ash ashVar6 = asgVar.d;
                        ashVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ashVar6.E);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 7:
                        ash ashVar7 = asgVar.d;
                        ashVar7.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ashVar7.F);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 8:
                        ash ashVar8 = asgVar.d;
                        ashVar8.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar8.L);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 9:
                        ash ashVar9 = asgVar.d;
                        ashVar9.x = a(typedArrayObtainStyledAttributes, index2, ashVar9.x);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 10:
                        ash ashVar10 = asgVar.d;
                        ashVar10.w = a(typedArrayObtainStyledAttributes, index2, ashVar10.w);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 11:
                        ash ashVar11 = asgVar.d;
                        ashVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar11.R);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 12:
                        ash ashVar12 = asgVar.d;
                        ashVar12.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar12.S);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 13:
                        ash ashVar13 = asgVar.d;
                        ashVar13.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar13.O);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 14:
                        ash ashVar14 = asgVar.d;
                        ashVar14.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar14.Q);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 15:
                        ash ashVar15 = asgVar.d;
                        ashVar15.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar15.T);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 16:
                        ash ashVar16 = asgVar.d;
                        ashVar16.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar16.P);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 17:
                        ash ashVar17 = asgVar.d;
                        ashVar17.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ashVar17.f);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 18:
                        ash ashVar18 = asgVar.d;
                        ashVar18.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ashVar18.g);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 19:
                        ash ashVar19 = asgVar.d;
                        ashVar19.h = typedArrayObtainStyledAttributes.getFloat(index2, ashVar19.h);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 20:
                        ash ashVar20 = asgVar.d;
                        ashVar20.y = typedArrayObtainStyledAttributes.getFloat(index2, ashVar20.y);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 21:
                        ash ashVar21 = asgVar.d;
                        ashVar21.e = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ashVar21.e);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 22:
                        asj asjVar2 = asgVar.b;
                        int i5 = typedArrayObtainStyledAttributes.getInt(index2, asjVar2.b);
                        asjVar2.b = i5;
                        asjVar2.b = a[i5];
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 23:
                        ash ashVar22 = asgVar.d;
                        ashVar22.d = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ashVar22.d);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 24:
                        ash ashVar23 = asgVar.d;
                        ashVar23.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar23.H);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 25:
                        ash ashVar24 = asgVar.d;
                        ashVar24.j = a(typedArrayObtainStyledAttributes, index2, ashVar24.j);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 26:
                        ash ashVar25 = asgVar.d;
                        ashVar25.k = a(typedArrayObtainStyledAttributes, index2, ashVar25.k);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 27:
                        ash ashVar26 = asgVar.d;
                        ashVar26.G = typedArrayObtainStyledAttributes.getInt(index2, ashVar26.G);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 28:
                        ash ashVar27 = asgVar.d;
                        ashVar27.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar27.I);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 29:
                        ash ashVar28 = asgVar.d;
                        ashVar28.l = a(typedArrayObtainStyledAttributes, index2, ashVar28.l);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 30:
                        ash ashVar29 = asgVar.d;
                        ashVar29.m = a(typedArrayObtainStyledAttributes, index2, ashVar29.m);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 31:
                        ash ashVar30 = asgVar.d;
                        ashVar30.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar30.M);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 32:
                        ash ashVar31 = asgVar.d;
                        ashVar31.u = a(typedArrayObtainStyledAttributes, index2, ashVar31.u);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 33:
                        ash ashVar32 = asgVar.d;
                        ashVar32.v = a(typedArrayObtainStyledAttributes, index2, ashVar32.v);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 34:
                        ash ashVar33 = asgVar.d;
                        ashVar33.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar33.J);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 35:
                        ash ashVar34 = asgVar.d;
                        ashVar34.o = a(typedArrayObtainStyledAttributes, index2, ashVar34.o);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 36:
                        ash ashVar35 = asgVar.d;
                        ashVar35.n = a(typedArrayObtainStyledAttributes, index2, ashVar35.n);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 37:
                        ash ashVar36 = asgVar.d;
                        ashVar36.z = typedArrayObtainStyledAttributes.getFloat(index2, ashVar36.z);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 38:
                        asgVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, asgVar.a);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 39:
                        ash ashVar37 = asgVar.d;
                        ashVar37.W = typedArrayObtainStyledAttributes.getFloat(index2, ashVar37.W);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 40:
                        ash ashVar38 = asgVar.d;
                        ashVar38.V = typedArrayObtainStyledAttributes.getFloat(index2, ashVar38.V);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 41:
                        ash ashVar39 = asgVar.d;
                        ashVar39.X = typedArrayObtainStyledAttributes.getInt(index2, ashVar39.X);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 42:
                        ash ashVar40 = asgVar.d;
                        ashVar40.Y = typedArrayObtainStyledAttributes.getInt(index2, ashVar40.Y);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 43:
                        asj asjVar3 = asgVar.b;
                        asjVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, asjVar3.d);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 44:
                        ask askVar2 = asgVar.e;
                        askVar2.n = true;
                        askVar2.o = typedArrayObtainStyledAttributes.getDimension(index2, askVar2.o);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 45:
                        ask askVar3 = asgVar.e;
                        askVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, askVar3.d);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 46:
                        ask askVar4 = asgVar.e;
                        askVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, askVar4.e);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 47:
                        ask askVar5 = asgVar.e;
                        askVar5.f = typedArrayObtainStyledAttributes.getFloat(index2, askVar5.f);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 48:
                        ask askVar6 = asgVar.e;
                        askVar6.g = typedArrayObtainStyledAttributes.getFloat(index2, askVar6.g);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 49:
                        ask askVar7 = asgVar.e;
                        askVar7.h = typedArrayObtainStyledAttributes.getDimension(index2, askVar7.h);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 50:
                        ask askVar8 = asgVar.e;
                        askVar8.i = typedArrayObtainStyledAttributes.getDimension(index2, askVar8.i);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 51:
                        ask askVar9 = asgVar.e;
                        askVar9.k = typedArrayObtainStyledAttributes.getDimension(index2, askVar9.k);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 52:
                        ask askVar10 = asgVar.e;
                        askVar10.l = typedArrayObtainStyledAttributes.getDimension(index2, askVar10.l);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 53:
                        ask askVar11 = asgVar.e;
                        askVar11.m = typedArrayObtainStyledAttributes.getDimension(index2, askVar11.m);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 54:
                        ash ashVar41 = asgVar.d;
                        ashVar41.Z = typedArrayObtainStyledAttributes.getInt(index2, ashVar41.Z);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 55:
                        ash ashVar42 = asgVar.d;
                        ashVar42.aa = typedArrayObtainStyledAttributes.getInt(index2, ashVar42.aa);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 56:
                        ash ashVar43 = asgVar.d;
                        ashVar43.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar43.ab);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 57:
                        ash ashVar44 = asgVar.d;
                        ashVar44.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar44.ac);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 58:
                        ash ashVar45 = asgVar.d;
                        ashVar45.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar45.ad);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 59:
                        ash ashVar46 = asgVar.d;
                        ashVar46.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar46.ae);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 60:
                        ask askVar12 = asgVar.e;
                        askVar12.c = typedArrayObtainStyledAttributes.getFloat(index2, askVar12.c);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 61:
                        ash ashVar47 = asgVar.d;
                        ashVar47.B = a(typedArrayObtainStyledAttributes, index2, ashVar47.B);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 62:
                        ash ashVar48 = asgVar.d;
                        ashVar48.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar48.C);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 63:
                        ash ashVar49 = asgVar.d;
                        ashVar49.D = typedArrayObtainStyledAttributes.getFloat(index2, ashVar49.D);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 64:
                        asi asiVar2 = asgVar.c;
                        asiVar2.c = a(typedArrayObtainStyledAttributes, index2, asiVar2.c);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 65:
                        int i6 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        asi asiVar3 = asgVar.c;
                        if (i6 == 3) {
                            asiVar3.e = typedArrayObtainStyledAttributes.getString(index2);
                            continue;
                        } else {
                            asiVar3.e = aqz.a[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                        }
                        i4++;
                        str3 = str4;
                        break;
                    case 66:
                        asgVar.c.g = typedArrayObtainStyledAttributes.getInt(index2, 0);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 67:
                        asi asiVar4 = asgVar.c;
                        asiVar4.j = typedArrayObtainStyledAttributes.getFloat(index2, asiVar4.j);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 68:
                        asj asjVar4 = asgVar.b;
                        asjVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, asjVar4.e);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 69:
                        asgVar.d.af = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 70:
                        asgVar.d.ag = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 72:
                        ash ashVar50 = asgVar.d;
                        ashVar50.ah = typedArrayObtainStyledAttributes.getInt(index2, ashVar50.ah);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 73:
                        ash ashVar51 = asgVar.d;
                        ashVar51.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar51.ai);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 74:
                        asgVar.d.al = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 75:
                        ash ashVar52 = asgVar.d;
                        ashVar52.ap = typedArrayObtainStyledAttributes.getBoolean(index2, ashVar52.ap);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 76:
                        asi asiVar5 = asgVar.c;
                        asiVar5.f = typedArrayObtainStyledAttributes.getInt(index2, asiVar5.f);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 77:
                        asgVar.d.am = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 78:
                        asj asjVar5 = asgVar.b;
                        asjVar5.c = typedArrayObtainStyledAttributes.getInt(index2, asjVar5.c);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 79:
                        asi asiVar6 = asgVar.c;
                        asiVar6.h = typedArrayObtainStyledAttributes.getFloat(index2, asiVar6.h);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 80:
                        ash ashVar53 = asgVar.d;
                        ashVar53.an = typedArrayObtainStyledAttributes.getBoolean(index2, ashVar53.an);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 81:
                        ash ashVar54 = asgVar.d;
                        ashVar54.ao = typedArrayObtainStyledAttributes.getBoolean(index2, ashVar54.ao);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 82:
                        asi asiVar7 = asgVar.c;
                        asiVar7.d = typedArrayObtainStyledAttributes.getInteger(index2, asiVar7.d);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 83:
                        ask askVar13 = asgVar.e;
                        askVar13.j = a(typedArrayObtainStyledAttributes, index2, askVar13.j);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 84:
                        asi asiVar8 = asgVar.c;
                        asiVar8.l = typedArrayObtainStyledAttributes.getInteger(index2, asiVar8.l);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 85:
                        asi asiVar9 = asgVar.c;
                        asiVar9.k = typedArrayObtainStyledAttributes.getFloat(index2, asiVar9.k);
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 86:
                        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(index2);
                        if (typedValuePeekValue2.type == 1) {
                            asgVar.c.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            continue;
                        } else {
                            int i7 = typedValuePeekValue2.type;
                            asi asiVar10 = asgVar.c;
                            if (i7 == 3) {
                                asiVar10.m = typedArrayObtainStyledAttributes.getString(index2);
                                if (asiVar10.m.indexOf("/") > 0) {
                                    asiVar10.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                }
                            } else {
                                typedArrayObtainStyledAttributes.getInteger(index2, asiVar10.n);
                            }
                        }
                        i4++;
                        str3 = str4;
                        break;
                    case 87:
                        str4 = str3;
                        Log.w("ConstraintSet", str4 + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        continue;
                        i4++;
                        str3 = str4;
                        break;
                    case 91:
                        ash ashVar55 = asgVar.d;
                        ashVar55.s = a(typedArrayObtainStyledAttributes, index2, ashVar55.s);
                        break;
                    case 92:
                        ash ashVar56 = asgVar.d;
                        ashVar56.t = a(typedArrayObtainStyledAttributes, index2, ashVar56.t);
                        break;
                    case 93:
                        ash ashVar57 = asgVar.d;
                        ashVar57.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar57.N);
                        break;
                    case 94:
                        ash ashVar58 = asgVar.d;
                        ashVar58.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ashVar58.U);
                        break;
                    case 95:
                        g(asgVar.d, typedArrayObtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        g(asgVar.d, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        ash ashVar59 = asgVar.d;
                        ashVar59.aq = typedArrayObtainStyledAttributes.getInt(index2, ashVar59.aq);
                        break;
                }
                str4 = str3;
                i4++;
                str3 = str4;
            }
            ash ashVar60 = asgVar.d;
            if (ashVar60.al != null) {
                ashVar60.ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return asgVar;
    }

    public final void b(ConstraintLayout constraintLayout) {
        i(constraintLayout);
        constraintLayout.g = null;
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        asl aslVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = aslVar.b;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            asb asbVar = (asb) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                map3.put(numValueOf, new asg());
            }
            asg asgVar = (asg) map3.get(numValueOf);
            if (asgVar == null) {
                i = childCount;
                map = map3;
            } else {
                HashMap map4 = aslVar.e;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    ary aryVar = (ary) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new ary(aryVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new ary(aryVar, cls.getMethod(a.ce(str, "getMap"), null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        map2 = map3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                asgVar.f = map5;
                asgVar.a = id;
                int i4 = asbVar.e;
                ash ashVar = asgVar.d;
                ashVar.j = i4;
                ashVar.k = asbVar.f;
                ashVar.l = asbVar.g;
                ashVar.m = asbVar.h;
                ashVar.n = asbVar.i;
                ashVar.o = asbVar.j;
                ashVar.p = asbVar.k;
                ashVar.q = asbVar.l;
                ashVar.r = asbVar.m;
                ashVar.s = asbVar.n;
                ashVar.t = asbVar.o;
                ashVar.u = asbVar.s;
                ashVar.v = asbVar.t;
                ashVar.w = asbVar.u;
                ashVar.x = asbVar.v;
                ashVar.y = asbVar.G;
                ashVar.z = asbVar.H;
                ashVar.A = asbVar.I;
                ashVar.B = asbVar.p;
                ashVar.C = asbVar.q;
                ashVar.D = asbVar.r;
                ashVar.E = asbVar.X;
                ashVar.F = asbVar.Y;
                ashVar.G = asbVar.Z;
                ashVar.h = asbVar.c;
                ashVar.f = asbVar.a;
                ashVar.g = asbVar.b;
                ashVar.d = asbVar.width;
                ashVar.e = asbVar.height;
                ashVar.H = asbVar.leftMargin;
                ashVar.I = asbVar.rightMargin;
                ashVar.J = asbVar.topMargin;
                ashVar.K = asbVar.bottomMargin;
                ashVar.N = asbVar.D;
                ashVar.V = asbVar.M;
                ashVar.W = asbVar.L;
                ashVar.Y = asbVar.O;
                ashVar.X = asbVar.N;
                ashVar.an = asbVar.aa;
                ashVar.ao = asbVar.ab;
                ashVar.Z = asbVar.P;
                ashVar.aa = asbVar.Q;
                ashVar.ab = asbVar.T;
                ashVar.ac = asbVar.U;
                ashVar.ad = asbVar.R;
                ashVar.ae = asbVar.S;
                ashVar.af = asbVar.V;
                ashVar.ag = asbVar.W;
                ashVar.am = asbVar.ac;
                ashVar.P = asbVar.x;
                ashVar.R = asbVar.z;
                ashVar.O = asbVar.w;
                ashVar.Q = asbVar.y;
                ashVar.T = asbVar.A;
                ashVar.S = asbVar.B;
                ashVar.U = asbVar.C;
                ashVar.aq = asbVar.ad;
                ashVar.L = asbVar.getMarginEnd();
                ashVar.M = asbVar.getMarginStart();
                asj asjVar = asgVar.b;
                asjVar.b = childAt.getVisibility();
                asjVar.d = childAt.getAlpha();
                ask askVar = asgVar.e;
                askVar.c = childAt.getRotation();
                askVar.d = childAt.getRotationX();
                askVar.e = childAt.getRotationY();
                askVar.f = childAt.getScaleX();
                askVar.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    askVar.h = pivotX;
                    askVar.i = pivotY;
                }
                askVar.k = childAt.getTranslationX();
                askVar.l = childAt.getTranslationY();
                askVar.m = childAt.getTranslationZ();
                if (askVar.n) {
                    askVar.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    ashVar.ap = barrier.b.b;
                    ashVar.ak = Arrays.copyOf(barrier.c, barrier.d);
                    ashVar.ah = barrier.a;
                    ashVar.ai = barrier.b.c;
                }
            }
            i2++;
            aslVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void d(Context context, int i) {
        c((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    asg asgVarL = l(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        asgVarL.d.b = true;
                    }
                    this.b.put(Integer.valueOf(asgVarL.a), asgVarL);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.bR(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.bR(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:272:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7 A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TRY_ENTER, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7 A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010d A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0118 A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x0127 A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0141 A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x015e A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:77:0x016e A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:80:0x0177 A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x017e A[Catch: IOException -> 0x0721, XmlPullParserException -> 0x0726, TryCatch #2 {IOException -> 0x0721, XmlPullParserException -> 0x0726, blocks: (B:3:0x0006, B:10:0x0016, B:25:0x004e, B:262:0x071a, B:26:0x005c, B:32:0x0074, B:44:0x00a7, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:85:0x0188, B:55:0x00f4, B:58:0x00ff, B:60:0x010d, B:62:0x0118, B:65:0x0127, B:69:0x0141, B:72:0x014f, B:74:0x015e, B:77:0x016e, B:80:0x0177, B:82:0x017e, B:83:0x0182, B:89:0x0194, B:90:0x01a0, B:91:0x01a5, B:92:0x01bd, B:39:0x008f, B:95:0x01c6, B:100:0x01e0, B:102:0x01f4, B:103:0x01fe, B:117:0x0270, B:105:0x0203, B:106:0x020c, B:107:0x0217, B:108:0x0220, B:109:0x0229, B:110:0x0232, B:111:0x023b, B:112:0x0244, B:113:0x024d, B:114:0x0256, B:115:0x025f, B:116:0x0268, B:118:0x0273, B:119:0x0278, B:120:0x0290, B:124:0x029b, B:126:0x02b0, B:128:0x02b6, B:137:0x02e7, B:130:0x02c1, B:133:0x02d3, B:136:0x02df, B:138:0x02ea, B:139:0x02ef, B:140:0x0307, B:143:0x0310, B:148:0x0324, B:150:0x0339, B:151:0x0343, B:174:0x03dc, B:153:0x0348, B:155:0x0350, B:156:0x0359, B:158:0x035e, B:160:0x036e, B:161:0x0376, B:162:0x037c, B:163:0x0385, B:164:0x038e, B:165:0x0397, B:166:0x03a0, B:167:0x03a9, B:168:0x03b0, B:170:0x03b9, B:171:0x03c0, B:172:0x03cb, B:173:0x03d4, B:175:0x03e0, B:176:0x03e5, B:177:0x03fd, B:181:0x0408, B:183:0x041d, B:188:0x0434, B:257:0x06f6, B:189:0x0458, B:190:0x047c, B:191:0x0486, B:192:0x048e, B:193:0x0498, B:194:0x04a2, B:195:0x04ac, B:196:0x04b6, B:197:0x04c0, B:198:0x04ca, B:199:0x04d4, B:200:0x04de, B:201:0x04e8, B:202:0x04f2, B:203:0x04fc, B:204:0x0506, B:205:0x0510, B:206:0x051a, B:207:0x0522, B:208:0x052c, B:209:0x0536, B:210:0x053d, B:211:0x0545, B:212:0x054d, B:213:0x0557, B:214:0x0561, B:215:0x056b, B:216:0x0570, B:217:0x0575, B:218:0x057f, B:219:0x0589, B:220:0x0593, B:221:0x059d, B:222:0x05a7, B:223:0x05b1, B:224:0x05bb, B:225:0x05c5, B:226:0x05cf, B:227:0x05d9, B:228:0x05e3, B:229:0x05ed, B:230:0x05f7, B:231:0x0601, B:232:0x060b, B:233:0x0615, B:234:0x061f, B:235:0x0629, B:236:0x0633, B:237:0x063d, B:238:0x0647, B:239:0x0651, B:240:0x065b, B:241:0x0665, B:242:0x066f, B:243:0x0679, B:244:0x0683, B:245:0x068d, B:246:0x0696, B:247:0x069f, B:248:0x06a8, B:249:0x06b1, B:250:0x06ba, B:251:0x06c3, B:252:0x06cc, B:253:0x06d3, B:254:0x06dc, B:255:0x06e5, B:256:0x06ee, B:258:0x06fa, B:259:0x06fe, B:260:0x0716, B:261:0x0717), top: B:269:0x0006 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void f(Context context, XmlPullParser xmlPullParser) {
        HashMap map;
        TypedArray typedArrayObtainStyledAttributes;
        int indexCount;
        int i;
        int i2;
        boolean z;
        String string;
        Object objValueOf;
        Object obj;
        int index;
        int i3;
        int resourceId;
        try {
            int eventType = xmlPullParser.getEventType();
            asg asgVarL = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i4 = 2;
                    int i5 = 3;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (asgVarL == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    ash ashVar = asgVarL.d;
                                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), asp.e);
                                    ashVar.c = true;
                                    int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
                                    for (int i6 = 0; i6 < indexCount2; i6++) {
                                        int index2 = typedArrayObtainStyledAttributes2.getIndex(i6);
                                        SparseIntArray sparseIntArray = ash.a;
                                        int i7 = sparseIntArray.get(index2);
                                        switch (i7) {
                                            case 1:
                                                ashVar.r = a(typedArrayObtainStyledAttributes2, index2, ashVar.r);
                                                break;
                                            case 2:
                                                ashVar.K = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.K);
                                                break;
                                            case 3:
                                                ashVar.q = a(typedArrayObtainStyledAttributes2, index2, ashVar.q);
                                                break;
                                            case 4:
                                                ashVar.p = a(typedArrayObtainStyledAttributes2, index2, ashVar.p);
                                                break;
                                            case 5:
                                                ashVar.A = typedArrayObtainStyledAttributes2.getString(index2);
                                                break;
                                            case 6:
                                                ashVar.E = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(index2, ashVar.E);
                                                break;
                                            case 7:
                                                ashVar.F = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(index2, ashVar.F);
                                                break;
                                            case 8:
                                                ashVar.L = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.L);
                                                break;
                                            case 9:
                                                ashVar.x = a(typedArrayObtainStyledAttributes2, index2, ashVar.x);
                                                break;
                                            case 10:
                                                ashVar.w = a(typedArrayObtainStyledAttributes2, index2, ashVar.w);
                                                break;
                                            case 11:
                                                ashVar.R = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.R);
                                                break;
                                            case 12:
                                                ashVar.S = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.S);
                                                break;
                                            case 13:
                                                ashVar.O = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.O);
                                                break;
                                            case 14:
                                                ashVar.Q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.Q);
                                                break;
                                            case 15:
                                                ashVar.T = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.T);
                                                break;
                                            case 16:
                                                ashVar.P = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.P);
                                                break;
                                            case 17:
                                                ashVar.f = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(index2, ashVar.f);
                                                break;
                                            case 18:
                                                ashVar.g = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(index2, ashVar.g);
                                                break;
                                            case 19:
                                                ashVar.h = typedArrayObtainStyledAttributes2.getFloat(index2, ashVar.h);
                                                break;
                                            case 20:
                                                ashVar.y = typedArrayObtainStyledAttributes2.getFloat(index2, ashVar.y);
                                                break;
                                            case 21:
                                                ashVar.e = typedArrayObtainStyledAttributes2.getLayoutDimension(index2, ashVar.e);
                                                break;
                                            case 22:
                                                ashVar.d = typedArrayObtainStyledAttributes2.getLayoutDimension(index2, ashVar.d);
                                                break;
                                            case 23:
                                                ashVar.H = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.H);
                                                break;
                                            case 24:
                                                ashVar.j = a(typedArrayObtainStyledAttributes2, index2, ashVar.j);
                                                break;
                                            case 25:
                                                ashVar.k = a(typedArrayObtainStyledAttributes2, index2, ashVar.k);
                                                break;
                                            case 26:
                                                ashVar.G = typedArrayObtainStyledAttributes2.getInt(index2, ashVar.G);
                                                break;
                                            case 27:
                                                ashVar.I = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.I);
                                                break;
                                            case 28:
                                                ashVar.l = a(typedArrayObtainStyledAttributes2, index2, ashVar.l);
                                                break;
                                            case 29:
                                                ashVar.m = a(typedArrayObtainStyledAttributes2, index2, ashVar.m);
                                                break;
                                            case 30:
                                                ashVar.M = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.M);
                                                break;
                                            case 31:
                                                ashVar.u = a(typedArrayObtainStyledAttributes2, index2, ashVar.u);
                                                break;
                                            case 32:
                                                ashVar.v = a(typedArrayObtainStyledAttributes2, index2, ashVar.v);
                                                break;
                                            case 33:
                                                ashVar.J = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.J);
                                                break;
                                            case 34:
                                                ashVar.o = a(typedArrayObtainStyledAttributes2, index2, ashVar.o);
                                                break;
                                            case 35:
                                                ashVar.n = a(typedArrayObtainStyledAttributes2, index2, ashVar.n);
                                                break;
                                            case 36:
                                                ashVar.z = typedArrayObtainStyledAttributes2.getFloat(index2, ashVar.z);
                                                break;
                                            case 37:
                                                ashVar.W = typedArrayObtainStyledAttributes2.getFloat(index2, ashVar.W);
                                                break;
                                            case 38:
                                                ashVar.V = typedArrayObtainStyledAttributes2.getFloat(index2, ashVar.V);
                                                break;
                                            case 39:
                                                ashVar.X = typedArrayObtainStyledAttributes2.getInt(index2, ashVar.X);
                                                break;
                                            case 40:
                                                ashVar.Y = typedArrayObtainStyledAttributes2.getInt(index2, ashVar.Y);
                                                break;
                                            case 41:
                                                g(ashVar, typedArrayObtainStyledAttributes2, index2, 0);
                                                break;
                                            case 42:
                                                g(ashVar, typedArrayObtainStyledAttributes2, index2, 1);
                                                break;
                                            default:
                                                switch (i7) {
                                                    case 61:
                                                        ashVar.B = a(typedArrayObtainStyledAttributes2, index2, ashVar.B);
                                                        break;
                                                    case 62:
                                                        ashVar.C = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.C);
                                                        break;
                                                    case 63:
                                                        ashVar.D = typedArrayObtainStyledAttributes2.getFloat(index2, ashVar.D);
                                                        break;
                                                    default:
                                                        switch (i7) {
                                                            case 69:
                                                                ashVar.af = typedArrayObtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                break;
                                                            case 70:
                                                                ashVar.ag = typedArrayObtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                break;
                                                            case 71:
                                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                break;
                                                            case 72:
                                                                ashVar.ah = typedArrayObtainStyledAttributes2.getInt(index2, ashVar.ah);
                                                                break;
                                                            case 73:
                                                                ashVar.ai = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.ai);
                                                                break;
                                                            case 74:
                                                                ashVar.al = typedArrayObtainStyledAttributes2.getString(index2);
                                                                break;
                                                            case 75:
                                                                ashVar.ap = typedArrayObtainStyledAttributes2.getBoolean(index2, ashVar.ap);
                                                                break;
                                                            case 76:
                                                                ashVar.aq = typedArrayObtainStyledAttributes2.getInt(index2, ashVar.aq);
                                                                break;
                                                            case 77:
                                                                ashVar.s = a(typedArrayObtainStyledAttributes2, index2, ashVar.s);
                                                                break;
                                                            case 78:
                                                                ashVar.t = a(typedArrayObtainStyledAttributes2, index2, ashVar.t);
                                                                break;
                                                            case 79:
                                                                ashVar.U = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.U);
                                                                break;
                                                            case 80:
                                                                ashVar.N = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.N);
                                                                break;
                                                            case 81:
                                                                ashVar.Z = typedArrayObtainStyledAttributes2.getInt(index2, ashVar.Z);
                                                                break;
                                                            case 82:
                                                                ashVar.aa = typedArrayObtainStyledAttributes2.getInt(index2, ashVar.aa);
                                                                break;
                                                            case 83:
                                                                ashVar.ac = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.ac);
                                                                break;
                                                            case 84:
                                                                ashVar.ab = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.ab);
                                                                break;
                                                            case 85:
                                                                ashVar.ae = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.ae);
                                                                break;
                                                            case 86:
                                                                ashVar.ad = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, ashVar.ad);
                                                                break;
                                                            case 87:
                                                                ashVar.an = typedArrayObtainStyledAttributes2.getBoolean(index2, ashVar.an);
                                                                break;
                                                            case 88:
                                                                ashVar.ao = typedArrayObtainStyledAttributes2.getBoolean(index2, ashVar.ao);
                                                                break;
                                                            case 89:
                                                                ashVar.am = typedArrayObtainStyledAttributes2.getString(index2);
                                                                break;
                                                            case 90:
                                                                ashVar.i = typedArrayObtainStyledAttributes2.getBoolean(index2, ashVar.i);
                                                                break;
                                                            case 91:
                                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes2.recycle();
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (asgVarL == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    asi asiVar = asgVarL.c;
                                    TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), asp.f);
                                    asiVar.b = true;
                                    int indexCount3 = typedArrayObtainStyledAttributes3.getIndexCount();
                                    for (int i8 = 0; i8 < indexCount3; i8++) {
                                        int index3 = typedArrayObtainStyledAttributes3.getIndex(i8);
                                        switch (asi.a.get(index3)) {
                                            case 1:
                                                asiVar.j = typedArrayObtainStyledAttributes3.getFloat(index3, asiVar.j);
                                                break;
                                            case 2:
                                                asiVar.f = typedArrayObtainStyledAttributes3.getInt(index3, asiVar.f);
                                                break;
                                            case 3:
                                                if (typedArrayObtainStyledAttributes3.peekValue(index3).type == 3) {
                                                    asiVar.e = typedArrayObtainStyledAttributes3.getString(index3);
                                                } else {
                                                    asiVar.e = aqz.a[typedArrayObtainStyledAttributes3.getInteger(index3, 0)];
                                                }
                                                break;
                                            case 4:
                                                asiVar.g = typedArrayObtainStyledAttributes3.getInt(index3, 0);
                                                break;
                                            case 5:
                                                asiVar.c = a(typedArrayObtainStyledAttributes3, index3, asiVar.c);
                                                break;
                                            case 6:
                                                asiVar.d = typedArrayObtainStyledAttributes3.getInteger(index3, asiVar.d);
                                                break;
                                            case 7:
                                                asiVar.h = typedArrayObtainStyledAttributes3.getFloat(index3, asiVar.h);
                                                break;
                                            case 8:
                                                asiVar.l = typedArrayObtainStyledAttributes3.getInteger(index3, asiVar.l);
                                                break;
                                            case 9:
                                                asiVar.k = typedArrayObtainStyledAttributes3.getFloat(index3, asiVar.k);
                                                break;
                                            case 10:
                                                TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes3.peekValue(index3);
                                                if (typedValuePeekValue.type == 1) {
                                                    asiVar.n = typedArrayObtainStyledAttributes3.getResourceId(index3, -1);
                                                } else if (typedValuePeekValue.type == 3) {
                                                    asiVar.m = typedArrayObtainStyledAttributes3.getString(index3);
                                                    if (asiVar.m.indexOf("/") > 0) {
                                                        asiVar.n = typedArrayObtainStyledAttributes3.getResourceId(index3, -1);
                                                    }
                                                } else {
                                                    typedArrayObtainStyledAttributes3.getInteger(index3, asiVar.n);
                                                }
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes3.recycle();
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    asgVarL = l(context, Xml.asAttributeSet(xmlPullParser), true);
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (asgVarL == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    asj asjVar = asgVarL.b;
                                    TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), asp.g);
                                    asjVar.a = true;
                                    int indexCount4 = typedArrayObtainStyledAttributes4.getIndexCount();
                                    for (int i9 = 0; i9 < indexCount4; i9++) {
                                        int index4 = typedArrayObtainStyledAttributes4.getIndex(i9);
                                        if (index4 == 1) {
                                            asjVar.d = typedArrayObtainStyledAttributes4.getFloat(1, asjVar.d);
                                        } else if (index4 == 0) {
                                            int i10 = typedArrayObtainStyledAttributes4.getInt(0, asjVar.b);
                                            asjVar.b = i10;
                                            asjVar.b = a[i10];
                                        } else if (index4 == 4) {
                                            asjVar.c = typedArrayObtainStyledAttributes4.getInt(4, asjVar.c);
                                        } else if (index4 == 3) {
                                            asjVar.e = typedArrayObtainStyledAttributes4.getFloat(3, asjVar.e);
                                        }
                                    }
                                    typedArrayObtainStyledAttributes4.recycle();
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (asgVarL == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    ask askVar = asgVarL.e;
                                    TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), asp.i);
                                    askVar.b = true;
                                    int indexCount5 = typedArrayObtainStyledAttributes5.getIndexCount();
                                    for (int i11 = 0; i11 < indexCount5; i11++) {
                                        int index5 = typedArrayObtainStyledAttributes5.getIndex(i11);
                                        switch (ask.a.get(index5)) {
                                            case 1:
                                                askVar.c = typedArrayObtainStyledAttributes5.getFloat(index5, askVar.c);
                                                break;
                                            case 2:
                                                askVar.d = typedArrayObtainStyledAttributes5.getFloat(index5, askVar.d);
                                                break;
                                            case 3:
                                                askVar.e = typedArrayObtainStyledAttributes5.getFloat(index5, askVar.e);
                                                break;
                                            case 4:
                                                askVar.f = typedArrayObtainStyledAttributes5.getFloat(index5, askVar.f);
                                                break;
                                            case 5:
                                                askVar.g = typedArrayObtainStyledAttributes5.getFloat(index5, askVar.g);
                                                break;
                                            case 6:
                                                askVar.h = typedArrayObtainStyledAttributes5.getDimension(index5, askVar.h);
                                                break;
                                            case 7:
                                                askVar.i = typedArrayObtainStyledAttributes5.getDimension(index5, askVar.i);
                                                break;
                                            case 8:
                                                askVar.k = typedArrayObtainStyledAttributes5.getDimension(index5, askVar.k);
                                                break;
                                            case 9:
                                                askVar.l = typedArrayObtainStyledAttributes5.getDimension(index5, askVar.l);
                                                break;
                                            case 10:
                                                askVar.m = typedArrayObtainStyledAttributes5.getDimension(index5, askVar.m);
                                                break;
                                            case 11:
                                                askVar.n = true;
                                                askVar.o = typedArrayObtainStyledAttributes5.getDimension(index5, askVar.o);
                                                break;
                                            case 12:
                                                askVar.j = a(typedArrayObtainStyledAttributes5, index5, askVar.j);
                                                break;
                                        }
                                    }
                                    typedArrayObtainStyledAttributes5.recycle();
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    asgVarL = l(context, Xml.asAttributeSet(xmlPullParser), false);
                                    ash ashVar2 = asgVarL.d;
                                    ashVar2.b = true;
                                    ashVar2.c = true;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    if (asgVarL != null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    map = asgVarL.f;
                                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), asp.d);
                                    indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                                    i = 0;
                                    i2 = 0;
                                    z = false;
                                    string = null;
                                    objValueOf = null;
                                    while (i < indexCount) {
                                        index = typedArrayObtainStyledAttributes.getIndex(i);
                                        if (index == 0) {
                                            string = typedArrayObtainStyledAttributes.getString(0);
                                            if (string == null && string.length() > 0) {
                                                string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                                            }
                                        } else if (index == 10) {
                                            string = typedArrayObtainStyledAttributes.getString(10);
                                            z = true;
                                        } else if (index == 1) {
                                            objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(1, false));
                                            i2 = 6;
                                        } else {
                                            if (index == i5) {
                                                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i5, 0));
                                            } else if (index == i4) {
                                                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i4, 0));
                                                i2 = 4;
                                            } else {
                                                i5 = 7;
                                                if (index == 7) {
                                                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(7, 0.0f), context.getResources().getDisplayMetrics()));
                                                } else if (index == 4) {
                                                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(4, 0.0f));
                                                    i2 = 7;
                                                } else {
                                                    i3 = 5;
                                                    if (index == 5) {
                                                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(5, Float.NaN));
                                                        i2 = 2;
                                                    } else if (index == 6) {
                                                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(6, -1));
                                                        i2 = 1;
                                                    } else {
                                                        if (index == 9) {
                                                            objValueOf = typedArrayObtainStyledAttributes.getString(9);
                                                        } else {
                                                            i3 = 8;
                                                            if (index != 8) {
                                                                resourceId = typedArrayObtainStyledAttributes.getResourceId(8, -1);
                                                                if (resourceId == -1) {
                                                                    resourceId = typedArrayObtainStyledAttributes.getInt(8, -1);
                                                                }
                                                                objValueOf = Integer.valueOf(resourceId);
                                                            }
                                                        }
                                                        i2 = i3;
                                                    }
                                                }
                                            }
                                            i2 = i5;
                                        }
                                        i++;
                                        i4 = 2;
                                        i5 = 3;
                                    }
                                    if (string != null && (obj = objValueOf) != null) {
                                        map.put(string, new ary(string, i2, obj, z));
                                    }
                                    typedArrayObtainStyledAttributes.recycle();
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    asgVarL = l(context, Xml.asAttributeSet(xmlPullParser), false);
                                    asgVarL.d.aj = 1;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    if (asgVarL != null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    map = asgVarL.f;
                                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), asp.d);
                                    indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                                    i = 0;
                                    i2 = 0;
                                    z = false;
                                    string = null;
                                    objValueOf = null;
                                    while (i < indexCount) {
                                        index = typedArrayObtainStyledAttributes.getIndex(i);
                                        if (index == 0) {
                                            string = typedArrayObtainStyledAttributes.getString(0);
                                            if (string == null) {
                                            }
                                        } else if (index == 10) {
                                            string = typedArrayObtainStyledAttributes.getString(10);
                                            z = true;
                                        } else if (index == 1) {
                                            objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(1, false));
                                            i2 = 6;
                                        } else {
                                            if (index == i5) {
                                                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i5, 0));
                                            } else if (index == i4) {
                                                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i4, 0));
                                                i2 = 4;
                                            } else {
                                                i5 = 7;
                                                if (index == 7) {
                                                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(7, 0.0f), context.getResources().getDisplayMetrics()));
                                                } else if (index == 4) {
                                                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(4, 0.0f));
                                                    i2 = 7;
                                                } else {
                                                    i3 = 5;
                                                    if (index == 5) {
                                                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(5, Float.NaN));
                                                        i2 = 2;
                                                    } else if (index == 6) {
                                                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(6, -1));
                                                        i2 = 1;
                                                    } else {
                                                        if (index == 9) {
                                                            objValueOf = typedArrayObtainStyledAttributes.getString(9);
                                                        } else {
                                                            i3 = 8;
                                                            if (index != 8) {
                                                                resourceId = typedArrayObtainStyledAttributes.getResourceId(8, -1);
                                                                if (resourceId == -1) {
                                                                    resourceId = typedArrayObtainStyledAttributes.getInt(8, -1);
                                                                }
                                                                objValueOf = Integer.valueOf(resourceId);
                                                            }
                                                        }
                                                        i2 = i3;
                                                    }
                                                }
                                            }
                                            i2 = i5;
                                        }
                                        i++;
                                        i4 = 2;
                                        i5 = 3;
                                    }
                                    if (string != null) {
                                        map.put(string, new ary(string, i2, obj, z));
                                    }
                                    typedArrayObtainStyledAttributes.recycle();
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    asgVarL = l(context, Xml.asAttributeSet(xmlPullParser), false);
                                }
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    this.b.put(Integer.valueOf(asgVarL.a), asgVarL);
                                    asgVarL = null;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    this.b.put(Integer.valueOf(asgVarL.a), asgVarL);
                                    asgVarL = null;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    this.b.put(Integer.valueOf(asgVarL.a), asgVarL);
                                    asgVarL = null;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    return;
                                }
                                break;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }

    public final void i(ConstraintLayout constraintLayout) {
        String resourceEntryName;
        int i;
        HashMap map;
        HashSet hashSet;
        char c2;
        int i2;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = this.b;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            if (!map2.containsKey(numValueOf)) {
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(resourceEntryName)));
            } else {
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    HashMap map3 = this.b;
                    if (map3.containsKey(numValueOf)) {
                        hashSet2.remove(numValueOf);
                        asg asgVar = (asg) map3.get(numValueOf);
                        if (asgVar != null) {
                            if (childAt instanceof Barrier) {
                                ash ashVar = asgVar.d;
                                ashVar.aj = 1;
                                c2 = 0;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.a = ashVar.ah;
                                barrier.c(ashVar.ai);
                                barrier.b.b = ashVar.ap;
                                int[] iArr = ashVar.ak;
                                if (iArr != null) {
                                    barrier.g(iArr);
                                } else {
                                    String str = ashVar.al;
                                    if (str != null) {
                                        ashVar.ak = k(barrier, str);
                                        barrier.g(ashVar.ak);
                                    }
                                }
                            } else {
                                c2 = 0;
                            }
                            asb asbVar = (asb) childAt.getLayoutParams();
                            asbVar.a();
                            asgVar.a(asbVar);
                            HashMap map4 = asgVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map4.keySet()) {
                                ary aryVar = (ary) map4.get(str2);
                                hashSet2 = hashSet2;
                                String strConcat = !aryVar.a ? "set".concat(String.valueOf(str2)) : str2;
                                try {
                                    int i4 = aryVar.h;
                                    int i5 = i4 - 1;
                                    if (i4 == 0) {
                                        i2 = i3;
                                        throw null;
                                    }
                                    switch (i5) {
                                        case 0:
                                            i2 = i3;
                                            Class<?>[] clsArr = new Class[1];
                                            clsArr[c2] = Integer.TYPE;
                                            Method method = cls.getMethod(strConcat, clsArr);
                                            Integer numValueOf2 = Integer.valueOf(aryVar.c);
                                            Object[] objArr = new Object[1];
                                            objArr[c2] = numValueOf2;
                                            method.invoke(childAt, objArr);
                                            i3 = i2;
                                            break;
                                        case 1:
                                            i2 = i3;
                                            Class<?>[] clsArr2 = new Class[1];
                                            clsArr2[c2] = Float.TYPE;
                                            Method method2 = cls.getMethod(strConcat, clsArr2);
                                            Float fValueOf = Float.valueOf(aryVar.d);
                                            Object[] objArr2 = new Object[1];
                                            objArr2[c2] = fValueOf;
                                            method2.invoke(childAt, objArr2);
                                            i3 = i2;
                                            break;
                                        case 2:
                                            i2 = i3;
                                            Class<?>[] clsArr3 = new Class[1];
                                            clsArr3[c2] = Integer.TYPE;
                                            Method method3 = cls.getMethod(strConcat, clsArr3);
                                            Integer numValueOf3 = Integer.valueOf(aryVar.g);
                                            Object[] objArr3 = new Object[1];
                                            objArr3[c2] = numValueOf3;
                                            method3.invoke(childAt, objArr3);
                                            i3 = i2;
                                            break;
                                        case 3:
                                            i2 = i3;
                                            Class<?>[] clsArr4 = new Class[1];
                                            clsArr4[c2] = Drawable.class;
                                            Method method4 = cls.getMethod(strConcat, clsArr4);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(aryVar.g);
                                            Object[] objArr4 = new Object[1];
                                            objArr4[c2] = colorDrawable;
                                            method4.invoke(childAt, objArr4);
                                            i3 = i2;
                                            break;
                                        case 4:
                                            i2 = i3;
                                            Class<?>[] clsArr5 = new Class[1];
                                            clsArr5[c2] = CharSequence.class;
                                            Method method5 = cls.getMethod(strConcat, clsArr5);
                                            String str3 = aryVar.e;
                                            Object[] objArr5 = new Object[1];
                                            objArr5[c2] = str3;
                                            method5.invoke(childAt, objArr5);
                                            i3 = i2;
                                            break;
                                        case 5:
                                            i2 = i3;
                                            Class<?>[] clsArr6 = new Class[1];
                                            clsArr6[c2] = Boolean.TYPE;
                                            Method method6 = cls.getMethod(strConcat, clsArr6);
                                            Boolean boolValueOf = Boolean.valueOf(aryVar.f);
                                            Object[] objArr6 = new Object[1];
                                            objArr6[c2] = boolValueOf;
                                            method6.invoke(childAt, objArr6);
                                            i3 = i2;
                                            break;
                                        case 6:
                                            i2 = i3;
                                            Class<?>[] clsArr7 = new Class[1];
                                            clsArr7[c2] = Float.TYPE;
                                            Method method7 = cls.getMethod(strConcat, clsArr7);
                                            Float fValueOf2 = Float.valueOf(aryVar.d);
                                            Object[] objArr7 = new Object[1];
                                            objArr7[c2] = fValueOf2;
                                            method7.invoke(childAt, objArr7);
                                            i3 = i2;
                                            break;
                                        case 7:
                                            i2 = i3;
                                            try {
                                                Class<?>[] clsArr8 = new Class[1];
                                                clsArr8[c2] = Integer.TYPE;
                                                Method method8 = cls.getMethod(strConcat, clsArr8);
                                                Integer numValueOf4 = Integer.valueOf(aryVar.c);
                                                Object[] objArr8 = new Object[1];
                                                objArr8[c2] = numValueOf4;
                                                method8.invoke(childAt, objArr8);
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strConcat, e);
                                            } catch (InvocationTargetException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            }
                                            i3 = i2;
                                            break;
                                    }
                                } catch (IllegalAccessException e4) {
                                    e = e4;
                                    i2 = i3;
                                } catch (NoSuchMethodException e5) {
                                    e = e5;
                                    i2 = i3;
                                } catch (InvocationTargetException e6) {
                                    e = e6;
                                    i2 = i3;
                                }
                            }
                            hashSet = hashSet2;
                            map = map2;
                            i = i3;
                            childAt.setLayoutParams(asbVar);
                            asj asjVar = asgVar.b;
                            if (asjVar.c == 0) {
                                childAt.setVisibility(asjVar.b);
                            }
                            childAt.setAlpha(asjVar.d);
                            ask askVar = asgVar.e;
                            childAt.setRotation(askVar.c);
                            childAt.setRotationX(askVar.d);
                            childAt.setRotationY(askVar.e);
                            childAt.setScaleX(askVar.f);
                            childAt.setScaleY(askVar.g);
                            if (askVar.j != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(askVar.j);
                                if (viewFindViewById != null) {
                                    int top = viewFindViewById.getTop() + viewFindViewById.getBottom();
                                    int left = viewFindViewById.getLeft() + viewFindViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(askVar.h)) {
                                    childAt.setPivotX(askVar.h);
                                }
                                if (!Float.isNaN(askVar.i)) {
                                    childAt.setPivotY(askVar.i);
                                }
                            }
                            childAt.setTranslationX(askVar.k);
                            childAt.setTranslationY(askVar.l);
                            childAt.setTranslationZ(askVar.m);
                            if (askVar.n) {
                                childAt.setElevation(askVar.o);
                            }
                        }
                    }
                }
                i3 = i + 1;
                hashSet2 = hashSet;
                map2 = map;
            }
            hashSet = hashSet2;
            map = map2;
            i = i3;
            i3 = i + 1;
            hashSet2 = hashSet;
            map2 = map;
        }
        for (Integer num : hashSet2) {
            asg asgVar2 = (asg) this.b.get(num);
            if (asgVar2 != null) {
                ash ashVar2 = asgVar2.d;
                if (ashVar2.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = ashVar2.ak;
                    if (iArr2 != null) {
                        barrier2.g(iArr2);
                    } else {
                        String str4 = ashVar2.al;
                        if (str4 != null) {
                            ashVar2.ak = k(barrier2, str4);
                            barrier2.g(ashVar2.ak);
                        }
                    }
                    barrier2.a = ashVar2.ah;
                    barrier2.c(ashVar2.ai);
                    asb asbVar2 = new asb();
                    barrier2.h();
                    asgVar2.a(asbVar2);
                    constraintLayout.addView(barrier2, asbVar2);
                }
                if (ashVar2.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    asb asbVar3 = new asb();
                    asgVar2.a(asbVar3);
                    constraintLayout.addView(guideline, asbVar3);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof arz) {
            }
        }
    }

    public final void j(int i, int i2, int i3) {
        HashMap map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new asg());
        }
        asg asgVar = (asg) map.get(numValueOf);
        if (asgVar != null) {
            ash ashVar = asgVar.d;
            if (i3 == 4) {
                ashVar.q = i2;
                ashVar.p = -1;
            } else {
                ashVar.p = i2;
                ashVar.q = -1;
            }
            ashVar.r = -1;
            ashVar.s = -1;
            ashVar.t = -1;
        }
    }
}
