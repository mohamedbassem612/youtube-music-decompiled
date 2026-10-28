package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.widget.EditText;
import app.rive.semantics.SemanticState;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.DesugarCollections;
import j$.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zoy {
    public static final /* synthetic */ int a = 0;
    private static final Map b = DesugarCollections.synchronizedMap(new HashMap());

    public static float a(Layout layout, EditText editText) {
        int lineBottom = layout.getLineBottom(layout.getLineForOffset(editText.getSelectionStart()));
        Rect rect = new Rect();
        editText.getLocalVisibleRect(rect);
        Rect rect2 = new Rect();
        editText.getGlobalVisibleRect(rect2);
        return (lineBottom - rect.top) + editText.getPaddingTop() + rect2.top;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0343 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ee  */
    public static askp b(Context context, Editable editable) {
        Object[] objArr;
        ForegroundColorSpan foregroundColorSpan;
        if (editable == null) {
            return null;
        }
        Editable editableNewEditable = Editable.Factory.getInstance().newEditable(editable);
        if (editableNewEditable != null) {
            if (editableNewEditable.length() > 0) {
                for (Object obj : editableNewEditable.getSpans(0, editableNewEditable.length(), Object.class)) {
                    if (editableNewEditable.getSpanStart(obj) == editableNewEditable.getSpanEnd(obj)) {
                        editableNewEditable.removeSpan(obj);
                    }
                }
            }
            adta[] adtaVarArr = (adta[]) editableNewEditable.getSpans(0, editableNewEditable.length(), adta.class);
            for (int length = adtaVarArr.length - 1; length >= 0; length--) {
                adta adtaVar = adtaVarArr[length];
                int spanStart = editableNewEditable.getSpanStart(adtaVar);
                int spanEnd = editableNewEditable.getSpanEnd(adtaVar);
                if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                    int i = spanEnd;
                    while (i > spanStart) {
                        int i2 = i - 1;
                        if (editableNewEditable.charAt(i2) != 160 && editableNewEditable.charAt(i2) != 8297) {
                            break;
                        }
                        i = i2;
                    }
                    editableNewEditable.delete(i, spanEnd);
                    int i3 = spanStart;
                    while (i3 < i && (editableNewEditable.charAt(i3) == 8206 || editableNewEditable.charAt(i3) == 8296)) {
                        i3++;
                    }
                    editableNewEditable.delete(spanStart, i3);
                }
            }
        }
        aihf aihfVarCreateBuilder = askp.a.createBuilder();
        String string = editableNewEditable.toString();
        aihfVarCreateBuilder.copyOnWrite();
        askp askpVar = (askp) aihfVarCreateBuilder.instance;
        string.getClass();
        boolean z = true;
        askpVar.b |= 1;
        askpVar.c = string;
        ArrayList arrayList = new ArrayList();
        adta[] adtaVarArr2 = (adta[]) editableNewEditable.getSpans(0, editableNewEditable.length(), adta.class);
        SparseIntArray sparseIntArray = new SparseIntArray();
        int length2 = adtaVarArr2.length;
        int i4 = 0;
        while (i4 < length2) {
            adta adtaVar2 = adtaVarArr2[i4];
            int spanStart2 = editableNewEditable.getSpanStart(adtaVar2);
            int spanEnd2 = editableNewEditable.getSpanEnd(adtaVar2);
            boolean z2 = z;
            if (Integer.valueOf(spanEnd2).equals(Integer.valueOf(sparseIntArray.get(spanStart2)))) {
                editableNewEditable.removeSpan(adtaVar2);
            } else {
                if (h(spanStart2, spanEnd2, editableNewEditable.length()) && spanStart2 != spanEnd2) {
                    String str = adtaVar2.a;
                    if (!str.isEmpty()) {
                        sparseIntArray.put(spanStart2, spanEnd2);
                        aihf aihfVarCreateBuilder2 = asku.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        asku askuVar = (asku) aihfVarCreateBuilder2.instance;
                        int i5 = 2;
                        askuVar.b |= 1;
                        askuVar.e = spanStart2;
                        aihfVarCreateBuilder2.copyOnWrite();
                        asku askuVar2 = (asku) aihfVarCreateBuilder2.instance;
                        askuVar2.b |= 2;
                        askuVar2.f = spanEnd2 - spanStart2;
                        aihh aihhVar = (aihh) askv.a.createBuilder();
                        aihl aihlVar = aqeb.b;
                        aihf aihfVarCreateBuilder3 = aqeb.a.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        aqeb aqebVar = (aqeb) aihfVarCreateBuilder3.instance;
                        str.getClass();
                        aqebVar.c |= 1;
                        aqebVar.d = str;
                        aihhVar.e(aihlVar, (aqeb) aihfVarCreateBuilder3.build());
                        askv askvVar = (askv) aihhVar.build();
                        aihfVarCreateBuilder2.copyOnWrite();
                        asku askuVar3 = (asku) aihfVarCreateBuilder2.instance;
                        askvVar.getClass();
                        askuVar3.l = askvVar;
                        askuVar3.b |= SemanticState.Modal;
                        StrikethroughSpan[] strikethroughSpanArr = (StrikethroughSpan[]) editableNewEditable.getSpans(0, editableNewEditable.length(), StrikethroughSpan.class);
                        int length3 = strikethroughSpanArr.length;
                        int i6 = 0;
                        while (i6 < length3) {
                            StrikethroughSpan strikethroughSpan = strikethroughSpanArr[i6];
                            int spanStart3 = editableNewEditable.getSpanStart(strikethroughSpan);
                            int spanEnd3 = editableNewEditable.getSpanEnd(strikethroughSpan);
                            if (!h(spanStart3, spanEnd3, editableNewEditable.length())) {
                                editableNewEditable.removeSpan(strikethroughSpan);
                            } else if (spanStart2 >= spanStart3 && spanEnd2 >= spanEnd3) {
                                aihfVarCreateBuilder2.copyOnWrite();
                                asku askuVar4 = (asku) aihfVarCreateBuilder2.instance;
                                askuVar4.n = i5;
                                askuVar4.b |= SemanticState.Multiline;
                                f(strikethroughSpan, editableNewEditable, spanStart3, spanEnd3, spanStart2, spanEnd2);
                            }
                            i6++;
                            i5 = 2;
                        }
                        i(editableNewEditable, spanStart2, spanEnd2, aihfVarCreateBuilder2);
                        arrayList.add((asku) aihfVarCreateBuilder2.build());
                    }
                }
                i4++;
                z = z2;
                adtaVarArr2 = adtaVarArr2;
                sparseIntArray = sparseIntArray;
            }
            i4++;
            z = z2;
            adtaVarArr2 = adtaVarArr2;
            sparseIntArray = sparseIntArray;
        }
        boolean z3 = z;
        ArrayList arrayList2 = new ArrayList();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (StrikethroughSpan strikethroughSpan2 : (StrikethroughSpan[]) editableNewEditable.getSpans(0, editableNewEditable.length(), StrikethroughSpan.class)) {
            int spanStart4 = editableNewEditable.getSpanStart(strikethroughSpan2);
            int spanEnd4 = editableNewEditable.getSpanEnd(strikethroughSpan2);
            if (Integer.valueOf(spanEnd4).equals(Integer.valueOf(sparseIntArray2.get(spanStart4)))) {
                editableNewEditable.removeSpan(strikethroughSpan2);
            } else if (h(spanStart4, spanEnd4, editableNewEditable.length())) {
                sparseIntArray2.put(spanStart4, spanEnd4);
                aihf aihfVarCreateBuilder4 = asku.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                asku askuVar5 = (asku) aihfVarCreateBuilder4.instance;
                askuVar5.b |= 1;
                askuVar5.e = spanStart4;
                aihfVarCreateBuilder4.copyOnWrite();
                asku askuVar6 = (asku) aihfVarCreateBuilder4.instance;
                askuVar6.b |= 2;
                askuVar6.f = spanEnd4 - spanStart4;
                aihfVarCreateBuilder4.copyOnWrite();
                asku askuVar7 = (asku) aihfVarCreateBuilder4.instance;
                askuVar7.n = 2;
                askuVar7.b |= SemanticState.Multiline;
                i(editableNewEditable, spanStart4, spanEnd4, aihfVarCreateBuilder4);
                arrayList2.add((asku) aihfVarCreateBuilder4.build());
            }
        }
        arrayList.addAll(arrayList2);
        Object[] spans = editableNewEditable.getSpans(0, editableNewEditable.length(), Object.class);
        float f = context.getResources().getDisplayMetrics().scaledDensity;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        asku askuVar8 = asku.a;
        aihf aihfVarCreateBuilder5 = askuVar8.createBuilder();
        int length4 = spans.length;
        int i7 = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (i7 < length4) {
            Object obj2 = spans[i7];
            int spanStart5 = editableNewEditable.getSpanStart(obj2);
            int spanEnd5 = editableNewEditable.getSpanEnd(obj2);
            if (h(spanStart5, spanEnd5, editableNewEditable.length())) {
                aihf aihfVarCreateBuilder6 = askuVar8.createBuilder();
                objArr = spans;
                if (obj2 instanceof AbsoluteSizeSpan) {
                    AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj2;
                    if (z4) {
                        z4 = z3;
                    } else if (f != 0.0f) {
                        float size = absoluteSizeSpan.getSize() / f;
                        aihfVarCreateBuilder5.copyOnWrite();
                        asku askuVar9 = (asku) aihfVarCreateBuilder5.instance;
                        askuVar9.b |= 16;
                        askuVar9.h = size;
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    if (obj2 instanceof ForegroundColorSpan) {
                        foregroundColorSpan = (ForegroundColorSpan) obj2;
                        if (!z5) {
                            int foregroundColor = foregroundColorSpan.getForegroundColor();
                            aihfVarCreateBuilder5.copyOnWrite();
                            asku askuVar10 = (asku) aihfVarCreateBuilder5.instance;
                            askuVar10.b |= SemanticState.Focused;
                            askuVar10.i = foregroundColor;
                            z5 = z3;
                        } else if (!(obj2 instanceof zov) && !Integer.valueOf(spanEnd5).equals(Integer.valueOf(sparseIntArray3.get(spanStart5)))) {
                            sparseIntArray3.put(spanStart5, spanEnd5);
                            i(editableNewEditable, spanStart5, spanEnd5, aihfVarCreateBuilder6);
                            asku askuVar11 = (asku) aihfVarCreateBuilder6.instance;
                            if ((askuVar11.b & SemanticState.LiveRegion) != 0 || askuVar11.c == 8) {
                                aihfVarCreateBuilder6.copyOnWrite();
                                asku askuVar12 = (asku) aihfVarCreateBuilder6.instance;
                                askuVar12.b |= 1;
                                askuVar12.e = spanStart5;
                                aihfVarCreateBuilder6.copyOnWrite();
                                asku askuVar13 = (asku) aihfVarCreateBuilder6.instance;
                                askuVar13.b |= 2;
                                askuVar13.f = spanEnd5 - spanStart5;
                                arrayList.add((asku) aihfVarCreateBuilder6.build());
                            }
                        }
                    } else if (!(obj2 instanceof zov)) {
                    }
                } else if (obj2 instanceof ForegroundColorSpan) {
                    foregroundColorSpan = (ForegroundColorSpan) obj2;
                    if (!z5) {
                        int foregroundColor2 = foregroundColorSpan.getForegroundColor();
                        aihfVarCreateBuilder5.copyOnWrite();
                        asku askuVar14 = (asku) aihfVarCreateBuilder5.instance;
                        askuVar14.b |= SemanticState.Focused;
                        askuVar14.i = foregroundColor2;
                        z5 = z3;
                    } else if (!(obj2 instanceof zov)) {
                    }
                } else if (!(obj2 instanceof zov)) {
                }
            } else {
                objArr = spans;
            }
            i7++;
            spans = objArr;
        }
        List.EL.sort(arrayList, Comparator$CC.comparing(new yom(10), new rit(8)));
        if (z4 || z5) {
            arrayList.add(0, (asku) aihfVarCreateBuilder5.build());
        }
        if (!arrayList.isEmpty()) {
            aihfVarCreateBuilder.cA(arrayList);
        }
        return (askp) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[Catch: all -> 0x01bd, TryCatch #1 {, blocks: (B:56:0x0103, B:58:0x010b, B:60:0x012a), top: B:128:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00db. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    public static CharSequence c(nsl nslVar, Context context, askp askpVar, nry nryVar, nxl nxlVar, nuc nucVar) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        Typeface typeface;
        int i3;
        int iIntValue;
        zow zowVar;
        Map map;
        FutureTask futureTask;
        askp askpVar2 = askpVar;
        if (askpVar2 == null) {
            return "";
        }
        String str = askpVar2.c;
        if (askpVar2.h.size() == 0 && askpVar2.g.size() == 0 && askpVar2.j.size() == 0) {
            return str;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(str);
        boolean z3 = false;
        for (int i4 = 0; i4 < askpVar2.g.size(); i4++) {
            askq askqVar = (askq) askpVar2.g.get(i4);
            int i5 = askqVar.b;
            if ((i5 & 4) != 0 || (i5 & 8) != 0) {
                d(spannableStringValueOf, new zou(askqVar, nryVar), askqVar.c, askqVar.d, false);
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ?? arrayList = new ArrayList();
        int i6 = 0;
        while (i6 < askpVar2.h.size()) {
            asku askuVar = (asku) askpVar2.h.get(i6);
            if ((askuVar.b & SemanticState.Focused) != 0) {
                d(spannableStringValueOf, new ForegroundColorSpan(askuVar.i), askuVar.e, askuVar.f, z3);
            }
            if ((askuVar.b & 16) != 0) {
                d(spannableStringValueOf, new AbsoluteSizeSpan(Math.round(askuVar.h * displayMetrics.scaledDensity), z3), askuVar.e, askuVar.f, z3);
            }
            String str2 = askuVar.g;
            int i7 = 2;
            if (str2.length() > 0) {
                String str3 = askuVar.g;
                if (str3.length() > 0) {
                    int i8 = askuVar.c;
                    if (i8 == 7) {
                        iIntValue = ((Integer) askuVar.d).intValue();
                    } else {
                        i3 = 400;
                        if (i8 == 8) {
                            int iBi = a.bi(((Integer) askuVar.d).intValue());
                            if (iBi == 0) {
                                iBi = 1;
                            }
                            switch (iBi - 1) {
                                case 1:
                                    iIntValue = 100;
                                    break;
                                case 2:
                                    iIntValue = 200;
                                    break;
                                case 3:
                                    iIntValue = 300;
                                    break;
                                case 5:
                                    iIntValue = 500;
                                    break;
                                case 6:
                                    iIntValue = 600;
                                    break;
                                case 7:
                                    iIntValue = 700;
                                    break;
                                case 8:
                                    iIntValue = 800;
                                    break;
                                case 9:
                                    iIntValue = 900;
                                    break;
                            }
                        }
                        zowVar = new zow(str3, i3, askuVar.k);
                        map = b;
                        synchronized (map) {
                            futureTask = (FutureTask) map.get(zowVar);
                            if (futureTask == null) {
                                i2 = 4;
                                futureTask = new FutureTask(new vvz(nxlVar, context, str3, i3, askuVar, 2));
                                map.put(zowVar, futureTask);
                            } else {
                                i2 = 4;
                            }
                        }
                        futureTask.run();
                        try {
                            typeface = (Typeface) futureTask.get();
                        } catch (InterruptedException | ExecutionException e) {
                            aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                            aslh aslhVar = aslh.LOG_TYPE_INTERNAL_ERROR;
                            aihfVarCreateBuilder.copyOnWrite();
                            asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                            asncVar.d = aslhVar.I;
                            asncVar.b |= i7;
                            aihf aihfVarCreateBuilder2 = asmy.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            asmy asmyVar = (asmy) aihfVarCreateBuilder2.instance;
                            str3.getClass();
                            asmyVar.b |= i7;
                            asmyVar.d = str3;
                            aihfVarCreateBuilder2.copyOnWrite();
                            asmy asmyVar2 = (asmy) aihfVarCreateBuilder2.instance;
                            asmyVar2.b |= 4;
                            asmyVar2.e = i3;
                            boolean z4 = askuVar.k;
                            aihfVarCreateBuilder2.copyOnWrite();
                            asmy asmyVar3 = (asmy) aihfVarCreateBuilder2.instance;
                            asmyVar3.b |= 8;
                            asmyVar3.f = z4;
                            aihfVarCreateBuilder.copyOnWrite();
                            asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                            asmy asmyVar4 = (asmy) aihfVarCreateBuilder2.build();
                            asmyVar4.getClass();
                            asncVar2.n = asmyVar4;
                            asncVar2.b |= SemanticState.ReadOnly;
                            nucVar.g((asnc) aihfVarCreateBuilder.build(), nslVar, e, "Font fetching future task failed.", new Object[0]);
                            typeface = null;
                        }
                        z = true;
                        d(spannableStringValueOf, new zov(str2, typeface), askuVar.e, askuVar.f, true);
                    }
                    i3 = iIntValue;
                    zowVar = new zow(str3, i3, askuVar.k);
                    map = b;
                    synchronized (map) {
                        futureTask = (FutureTask) map.get(zowVar);
                        if (futureTask == null) {
                            i2 = 4;
                            futureTask = new FutureTask(new vvz(nxlVar, context, str3, i3, askuVar, 2));
                            map.put(zowVar, futureTask);
                        } else {
                            i2 = 4;
                        }
                        futureTask.run();
                        typeface = (Typeface) futureTask.get();
                        z = true;
                        d(spannableStringValueOf, new zov(str2, typeface), askuVar.e, askuVar.f, true);
                    }
                } else {
                    i2 = 4;
                    i7 = 2;
                }
                typeface = null;
                z = true;
                d(spannableStringValueOf, new zov(str2, typeface), askuVar.e, askuVar.f, true);
            } else {
                i2 = 4;
                i7 = 2;
                z = true;
            }
            if (askuVar.f == 0 && (askuVar.b & 8) != 0) {
                arrayList.add(Integer.valueOf(askuVar.e));
            }
            int iBc = a.bc(askuVar.j);
            ?? r9 = iBc;
            if (iBc == 0) {
                r9 = z;
            }
            int i9 = r9 - 1;
            if (i9 == i7 || i9 == 3) {
                d(spannableStringValueOf, new UnderlineSpan(), askuVar.e, askuVar.f, false);
            } else if (i9 == i2) {
                d(spannableStringValueOf, new mrp(displayMetrics, askuVar.i), askuVar.e, askuVar.f, false);
            }
            int iBc2 = a.bc(askuVar.n);
            ?? r10 = iBc2;
            if (iBc2 == 0) {
                r10 = z;
            }
            int i10 = r10 - 1;
            if (i10 == i7 || i10 == 3 || i10 == 4) {
                d(spannableStringValueOf, new StrikethroughSpan(), askuVar.e, askuVar.f, z);
            } else if (askuVar.f == 0) {
                arrayList.add(Integer.valueOf(askuVar.e));
            }
            int iAS = a.aS(askuVar.o);
            ?? r11 = iAS;
            if (iAS == 0) {
                r11 = z;
            }
            int i11 = r11 - 1;
            if (i11 == z) {
                z2 = false;
                d(spannableStringValueOf, new SubscriptSpan(), askuVar.e, askuVar.f, false);
            } else if (i11 != i7) {
                z2 = false;
            } else {
                z2 = false;
                d(spannableStringValueOf, new SuperscriptSpan(), askuVar.e, askuVar.f, false);
            }
            if ((askuVar.b & SemanticState.Obscured) != 0) {
                d(spannableStringValueOf, new zox(askuVar.m), askuVar.e, askuVar.f, z2);
            }
            i6++;
            askpVar2 = askpVar;
            z3 = z2;
        }
        boolean z5 = z3 ? 1 : 0;
        int size = arrayList.size();
        ?? r3 = z3;
        while (r3 < size) {
            Integer num = (Integer) arrayList.get(r3);
            StrikethroughSpan[] strikethroughSpanArr = (StrikethroughSpan[]) spannableStringValueOf.getSpans(num.intValue(), num.intValue(), StrikethroughSpan.class);
            int length = strikethroughSpanArr.length;
            for (int i12 = z5 ? 1 : 0; i12 < length; i12++) {
                g(spannableStringValueOf, strikethroughSpanArr[i12], num.intValue());
            }
            zov[] zovVarArr = (zov[]) spannableStringValueOf.getSpans(num.intValue(), num.intValue(), zov.class);
            int length2 = zovVarArr.length;
            int i13 = z5 ? 1 : 0;
            while (true) {
                i = r3 + 1;
                if (i13 < length2) {
                    g(spannableStringValueOf, zovVarArr[i13], num.intValue());
                    i13++;
                }
            }
            r3 = i;
        }
        return spannableStringValueOf;
    }

    static void d(SpannableString spannableString, Object obj, int i, int i2, boolean z) {
        int iMin = i < 0 ? 0 : Math.min(i, spannableString.length());
        int length = (i2 < 0 || (!z && i2 == 0)) ? spannableString.length() : Math.min(i2 + iMin, spannableString.length());
        if (iMin != length || z) {
            spannableString.setSpan(obj, iMin, length, 18);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, float f, int i, assy assyVar) {
        boolean z;
        int i2;
        if (spannableStringBuilder.length() != 0) {
            ArrayList<asku> arrayList = new ArrayList();
            askp askpVar = assyVar.e;
            if (askpVar == null) {
                askpVar = askp.a;
            }
            for (asku askuVar : askpVar.h) {
                if ((askuVar.b & SemanticState.Modal) != 0) {
                    askv askvVar = askuVar.l;
                    if (askvVar == null) {
                        askvVar = askv.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aqeb.b);
                    askvVar.c(aihlVarCheckIsLite);
                    if (askvVar.j.n(aihlVarCheckIsLite.d)) {
                        arrayList.add(askuVar);
                    }
                }
            }
            Collections.sort(arrayList, Comparator$EL.reversed(Comparator$CC.comparingInt(new ddc(14))));
            if (arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < assyVar.w.size(); i3++) {
                    arrayList2.add((asso) assyVar.w.get(i3));
                }
                Collections.sort(arrayList2, Comparator$EL.reversed(Comparator$CC.comparingInt(new ddc(15))));
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    asso assoVar = (asso) arrayList2.get(i4);
                    int i5 = assoVar.c;
                    int i6 = assoVar.d + i5;
                    if (i6 <= spannableStringBuilder.length() && spannableStringBuilder.charAt(i6 - 1) != ' ') {
                        spannableStringBuilder.insert(i6, " ");
                        i6++;
                    }
                    if (i5 != -1 && i6 != -1 && i5 < i6 && i6 <= spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new adta(assoVar.e, 2.0f, 0.0f, f, i, false), i5, i6, 33);
                    }
                }
                return;
            }
            for (asku askuVar2 : arrayList) {
                int i7 = askuVar2.e;
                int i8 = askuVar2.f + i7;
                if (h(i7, i8, spannableStringBuilder.length())) {
                    askv askvVar2 = askuVar2.l;
                    if (askvVar2 == null) {
                        askvVar2 = askv.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqeb.b);
                    askvVar2.c(aihlVarCheckIsLite2);
                    Object objK = askvVar2.j.k(aihlVarCheckIsLite2.d);
                    String str = ((aqeb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
                    askp askpVar2 = assyVar.e;
                    if (askpVar2 == null) {
                        askpVar2 = askp.a;
                    }
                    int i9 = askuVar2.e;
                    int i10 = askuVar2.f + i9;
                    Iterator it = askpVar2.h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        asku askuVar3 = (asku) it.next();
                        int iBc = a.bc(askuVar3.n);
                        z = true;
                        if (iBc == 0) {
                            iBc = 1;
                        }
                        if (iBc == 3 && i9 >= (i2 = askuVar3.e) && i10 <= i2 + askuVar3.f + 1) {
                            break;
                        }
                    }
                    spannableStringBuilder.setSpan(new adta(str, 2.0f, 0.0f, f, i, z), i7, i8, 33);
                }
            }
        }
    }

    private static void f(Object obj, Editable editable, int i, int i2, int i3, int i4) {
        editable.removeSpan(obj);
        if (i3 - i > 0) {
            editable.setSpan(obj, i, i3, 33);
        }
        if (i2 - i4 > 0) {
            editable.setSpan(obj, i4, i2, 33);
        }
    }

    private static void g(SpannableString spannableString, Object obj, int i) {
        int spanStart = spannableString.getSpanStart(obj);
        int spanEnd = spannableString.getSpanEnd(obj);
        if (spanStart == spanEnd || !h(spanStart, spanEnd, spannableString.length())) {
            return;
        }
        if (spanStart == i) {
            spannableString.removeSpan(obj);
            spannableString.setSpan(obj, spanStart, spanEnd, 34);
        } else if (spanEnd == i) {
            spannableString.removeSpan(obj);
            spannableString.setSpan(obj, spanStart, spanEnd, 17);
        }
    }

    private static boolean h(int i, int i2, int i3) {
        return i >= 0 && i2 >= 0 && i <= i2 && i2 <= i3;
    }

    private static void i(Editable editable, int i, int i2, aihf aihfVar) {
        Typeface typeface;
        Editable editable2 = editable;
        int i3 = i;
        int i4 = i2;
        zov[] zovVarArr = (zov[]) editable2.getSpans(i3, i4, zov.class);
        int length = zovVarArr.length;
        int i5 = 0;
        while (i5 < length) {
            zov zovVar = zovVarArr[i5];
            int spanStart = editable2.getSpanStart(zovVar);
            int spanEnd = editable2.getSpanEnd(zovVar);
            if (!h(spanStart, spanEnd, editable2.length())) {
                editable2.removeSpan(zovVar);
            } else if (i3 >= spanStart && i4 >= spanEnd && (typeface = zovVar.a) != null) {
                String family = zovVar.getFamily();
                boolean z = Build.VERSION.SDK_INT >= 28 && (typeface.getWeight() == 700 || typeface.getWeight() == 500);
                if (z || typeface.isItalic()) {
                    if (family == null) {
                        family = "sans-serif";
                    }
                    aihfVar.copyOnWrite();
                    asku askuVar = (asku) aihfVar.instance;
                    asku askuVar2 = asku.a;
                    askuVar.b |= 8;
                    askuVar.g = family;
                    if (z) {
                        aihfVar.copyOnWrite();
                        asku askuVar3 = (asku) aihfVar.instance;
                        askuVar3.d = 5;
                        askuVar3.c = 8;
                    }
                    if (typeface.isItalic()) {
                        aihfVar.copyOnWrite();
                        asku askuVar4 = (asku) aihfVar.instance;
                        askuVar4.b |= SemanticState.LiveRegion;
                        askuVar4.k = true;
                    }
                    f(zovVar, editable2, spanStart, spanEnd, i3, i4);
                }
            }
            i5++;
            editable2 = editable;
            i3 = i;
            i4 = i2;
        }
    }
}
