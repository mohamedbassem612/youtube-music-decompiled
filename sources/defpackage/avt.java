package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avt {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new ThreadLocal();
    private static final WeakHashMap c = new WeakHashMap(0);
    private static final Object d = new Object();

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: all -> 0x00ad, TryCatch #1 {, blocks: (B:4:0x0008, B:6:0x0013, B:8:0x0019, B:10:0x0021, B:12:0x002f, B:14:0x0039, B:16:0x003d, B:21:0x004a, B:22:0x004c, B:19:0x0042, B:24:0x004e, B:25:0x0051), top: B:58:0x0008 }] */
    public static ColorStateList a(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        avp avpVar;
        avq avqVar = new avq(resources, theme);
        synchronized (d) {
            SparseArray sparseArray = (SparseArray) c.get(avqVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (avpVar = (avp) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else {
                Configuration configuration = avpVar.b;
                Resources resources2 = avqVar.a;
                if (configuration.equals(resources2.getConfiguration()) && avpVar.d == resources2.getConfiguration().uiMode) {
                    Resources.Theme theme2 = avqVar.b;
                    if (theme2 == null) {
                        if (avpVar.c == 0) {
                            colorStateList = avpVar.a;
                        }
                    } else if (avpVar.c == theme2.hashCode()) {
                        colorStateList = avpVar.a;
                    }
                }
                sparseArray.remove(i);
                colorStateList = null;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        TypedValue typedValueC = c();
        resources.getValue(i, typedValueC, true);
        if (typedValueC.type < 28 || typedValueC.type > 31) {
            try {
                colorStateListA = avn.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (d) {
            WeakHashMap weakHashMap = c;
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(avqVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(avqVar, sparseArray2);
            }
            sparseArray2.append(i, new avp(colorStateListA, avqVar.a.getConfiguration(), theme));
        }
        return colorStateListA;
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i, new TypedValue(), 0, null, false, true);
    }

    public static TypedValue c() {
        ThreadLocal threadLocal = b;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static void d(Context context, int i, avr avrVar) {
        if (context.isRestricted()) {
            avrVar.c(-4);
        } else {
            e(context, i, new TypedValue(), 0, avrVar, false, false);
        }
    }

    public static Typeface e(Context context, int i, TypedValue typedValue, int i2, avr avrVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceF = f(context, resources, typedValue, i, i2, avrVar, z, z2);
        if (typefaceF != null || avrVar != null || z2) {
            return typefaceF;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:160:0x030d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0466  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [agm] */
    /* JADX WARN: Type inference failed for: r0v21, types: [agm] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [android.graphics.Typeface$CustomFallbackBuilder] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.graphics.Typeface$CustomFallbackBuilder] */
    /* JADX WARN: Type inference failed for: r36v0, types: [avr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v18, types: [android.graphics.Typeface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static Typeface f(Context context, Resources resources, TypedValue typedValue, int i, int i2, avr avrVar, boolean z, boolean z2) {
        String str;
        int next;
        Object zsVar;
        ?? Build;
        FontFamily fontFamilyBuild;
        boolean z3;
        Object obj;
        Typeface typefaceC;
        if (typedValue.string == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = typedValue.string.toString();
        Typeface typeface = null;
        if (!string.startsWith("res/")) {
            if (avrVar == 0) {
                return null;
            }
            avrVar.c(-3);
            return null;
        }
        Typeface typeface2 = (Typeface) avy.b.b(avy.e(resources, i, string, typedValue.assetCookie, i2));
        if (typeface2 != null) {
            if (avrVar != 0) {
                avrVar.d(typeface2);
            }
            return typeface2;
        }
        if (z2) {
            return null;
        }
        try {
            try {
                if (!string.toLowerCase().endsWith(".xml")) {
                    str = string;
                    try {
                        Typeface typefaceB = avy.b(context, resources, i, str, typedValue.assetCookie, i2);
                        if (avrVar != 0) {
                            if (typefaceB != null) {
                                avrVar.d(typefaceB);
                            } else {
                                avrVar.c(-3);
                            }
                        }
                        return typefaceB;
                    } catch (IOException e) {
                        e = e;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(String.valueOf(str)), e);
                        if (avrVar != 0) {
                            avrVar.c(-3);
                        }
                        return null;
                    } catch (XmlPullParserException e2) {
                        e = e2;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(String.valueOf(str)), e);
                        if (avrVar != 0) {
                            avrVar.c(-3);
                        }
                        return null;
                    }
                }
                XmlResourceParser xml = resources.getXml(i);
                do {
                    next = xml.next();
                    int i3 = 2;
                    if (next == 2) {
                        xml.require(2, null, "font-family");
                        if (xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), asz.b);
                            String string2 = typedArrayObtainAttributes.getString(0);
                            String string3 = typedArrayObtainAttributes.getString(5);
                            String string4 = typedArrayObtainAttributes.getString(6);
                            String string5 = typedArrayObtainAttributes.getString(2);
                            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                            int integer = typedArrayObtainAttributes.getInteger(3, 1);
                            int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
                            String string6 = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            if (string2 == null || string3 == null) {
                                ArrayList arrayList = new ArrayList();
                                while (xml.next() != 3) {
                                    if (xml.getEventType() == i3) {
                                        if (xml.getName().equals("font")) {
                                            TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xml), asz.c);
                                            int i4 = typedArrayObtainAttributes2.getInt(true != typedArrayObtainAttributes2.hasValue(8) ? 1 : 8, 400);
                                            boolean z4 = typedArrayObtainAttributes2.getInt(true != typedArrayObtainAttributes2.hasValue(6) ? i3 : 6, 0) == 1;
                                            int i5 = true != typedArrayObtainAttributes2.hasValue(9) ? 3 : 9;
                                            String string7 = typedArrayObtainAttributes2.getString(true != typedArrayObtainAttributes2.hasValue(7) ? 4 : 7);
                                            int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                                            int i7 = true != typedArrayObtainAttributes2.hasValue(5) ? 0 : 5;
                                            int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                                            String string8 = typedArrayObtainAttributes2.getString(i7);
                                            typedArrayObtainAttributes2.recycle();
                                            while (xml.next() != 3) {
                                                aub.d(xml);
                                            }
                                            arrayList.add(new axd(string8, i4, z4, string7, i6, resourceId2));
                                        } else {
                                            aub.d(xml);
                                        }
                                        i3 = 2;
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    zsVar = null;
                                } else {
                                    axd[] axdVarArr = (axd[]) arrayList.toArray(new axd[0]);
                                    typeface = null;
                                    zsVar = new zs(axdVarArr, (byte[]) null);
                                }
                            } else {
                                List listC = aub.c(resources, resourceId);
                                ArrayList arrayList2 = new ArrayList();
                                while (xml.next() != 3) {
                                    if (xml.getEventType() == 2) {
                                        if (xml.getName().equals("fallback")) {
                                            TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xml), asz.d);
                                            try {
                                                String string9 = typedArrayObtainAttributes3.getString(0);
                                                String string10 = typedArrayObtainAttributes3.getString(1);
                                                String string11 = typedArrayObtainAttributes3.getString(2);
                                                if (string9 == null) {
                                                    throw new XmlPullParserException("query attribute must be set in fallback element");
                                                }
                                                while (xml.next() != 3) {
                                                    aub.d(xml);
                                                }
                                                awy awyVar = new awy(string2, string3, string9, listC, string10, string11);
                                                typedArrayObtainAttributes3.recycle();
                                                arrayList2.add(awyVar);
                                            } catch (Throwable th) {
                                                typedArrayObtainAttributes3.recycle();
                                                throw th;
                                            }
                                        } else {
                                            aub.d(xml);
                                        }
                                        integer2 = integer2;
                                    }
                                }
                                int i8 = integer2;
                                if (!arrayList2.isEmpty()) {
                                    zsVar = new avo(arrayList2, integer, i8, string6);
                                } else {
                                    if (string4 == null) {
                                        throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
                                    }
                                    arrayList2.add(new awy(string2, string3, string4, listC, null, null));
                                    if (string5 != null) {
                                        arrayList2.add(new awy(string2, string3, string5, listC, null, null));
                                    }
                                    zsVar = new avo(arrayList2, integer, i8, string6);
                                }
                            }
                            typeface = null;
                        } else {
                            aub.d(xml);
                            zsVar = null;
                        }
                        if (zsVar == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (avrVar == 0) {
                                return typeface;
                            }
                            avrVar.c(-3);
                            return typeface;
                        }
                        int i9 = typedValue.assetCookie;
                        if (zsVar instanceof avo) {
                            avo avoVar = (avo) zsVar;
                            String str2 = avoVar.d;
                            if (TextUtils.isEmpty(str2) || (typefaceC = avy.c(str2)) == null) {
                                Build = typefaceC;
                                List list = avoVar.a;
                                if (list.size() != 1) {
                                    if (Build.VERSION.SDK_INT < 31) {
                                        Build = typeface;
                                        break;
                                    }
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= list.size()) {
                                            ?? customFallbackBuilder = typeface;
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 < list.size()) {
                                                    awy awyVar2 = (awy) list.get(i11);
                                                    if (i11 == list.size() - 1 && TextUtils.isEmpty(awyVar2.g)) {
                                                        customFallbackBuilder.setSystemFallback(awyVar2.f);
                                                    } else {
                                                        String str3 = awyVar2.f;
                                                        Font fontD = avy.d(avy.c(str3));
                                                        if (fontD == null) {
                                                            Log.w("TypefaceCompat", "Unable identify the primary font for " + str3 + ". Falling back to provider font.");
                                                        } else {
                                                            String str4 = awyVar2.g;
                                                            if (!TextUtils.isEmpty(str4)) {
                                                                try {
                                                                    fontFamilyBuild = new FontFamily.Builder(new Font.Builder(fontD).setFontVariationSettings(str4).build()).build();
                                                                } catch (IOException unused) {
                                                                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                                    Build = 0;
                                                                    break;
                                                                }
                                                            } else {
                                                                fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                            }
                                                            if (customFallbackBuilder == 0) {
                                                                customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                            } else {
                                                                customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                            }
                                                            i11++;
                                                            typeface = null;
                                                            customFallbackBuilder = customFallbackBuilder;
                                                        }
                                                    }
                                                }
                                                Build = customFallbackBuilder.build();
                                                break;
                                            }
                                        }
                                        if (avy.c(((awy) list.get(i10)).f) != null) {
                                            i10++;
                                        }
                                        Build = typeface;
                                        break;
                                    }
                                }
                                Build = avy.c(((awy) list.get(0)).f);
                            }
                            if (Build != 0) {
                                if (avrVar != 0) {
                                    avrVar.d(Build);
                                }
                                avy.b.c(avy.e(resources, i, string, i9, i2), Build);
                            } else {
                                if (z) {
                                    if (avoVar.c == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                } else if (avrVar == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                int i12 = z ? avoVar.b : -1;
                                Handler handler = new Handler(Looper.getMainLooper());
                                zf zfVar = new zf((Object) avrVar);
                                List list2 = avoVar.a;
                                eol eolVar = new eol(zfVar, new wh(handler, 4));
                                if (!z3) {
                                    String strA = axc.a(list2, i2);
                                    Typeface typeface3 = (Typeface) axc.a.b(strA);
                                    if (typeface3 != null) {
                                        eolVar.E(new aami(typeface3));
                                        obj = typeface3;
                                    } else {
                                        axb axbVar = new axb(eolVar, 1);
                                        synchronized (axc.c) {
                                            try {
                                                aha ahaVar = axc.d;
                                                ArrayList arrayList3 = (ArrayList) ahaVar.get(strA);
                                                if (arrayList3 != null) {
                                                    arrayList3.add(axbVar);
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(axbVar);
                                                    ahaVar.put(strA, arrayList4);
                                                    axc.b.execute(new eqb(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new axa(strA, context, list2, i2), new axb(strA, 0), 1));
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        obj = null;
                                    }
                                } else {
                                    if (list2.size() > 1) {
                                        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                                    }
                                    awy awyVar3 = (awy) list2.get(0);
                                    agm agmVar = axc.a;
                                    String strA2 = axc.a(eol.s(new Object[]{awyVar3}), i2);
                                    Typeface typeface4 = (Typeface) axc.a.b(strA2);
                                    if (typeface4 != null) {
                                        eolVar.E(new aami(typeface4));
                                        obj = typeface4;
                                    } else if (i12 == -1) {
                                        aami aamiVarB = axc.b(strA2, context, eol.s(new Object[]{awyVar3}), i2);
                                        eolVar.E(aamiVarB);
                                        obj = aamiVarB.b;
                                    } else {
                                        try {
                                            aami aamiVar = (aami) aas.d(axc.b, new awz(strA2, context, awyVar3, i2), i12);
                                            eolVar.E(aamiVar);
                                            obj = aamiVar.b;
                                        } catch (InterruptedException unused2) {
                                            eolVar.E(new aami(-3));
                                            obj = null;
                                        }
                                    }
                                }
                                Build = obj;
                            }
                            return (Typeface) Build;
                        }
                        Typeface typefaceB2 = avy.a.b(context, (zs) zsVar, resources, i2);
                        if (avrVar != 0) {
                            if (typefaceB2 != null) {
                                avrVar.d(typefaceB2);
                            } else {
                                avrVar.c(-3);
                            }
                        }
                        Build = typefaceB2;
                        if (Build != 0) {
                            avy.b.c(avy.e(resources, i, string, i9, i2), Build);
                        }
                        return (Typeface) Build;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } catch (IOException e3) {
                e = e3;
                str = string;
            }
        } catch (XmlPullParserException e4) {
            e = e4;
            str = string;
        }
    }
}
