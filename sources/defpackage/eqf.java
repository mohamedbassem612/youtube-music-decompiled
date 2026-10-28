package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eqf {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public eqf(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerO = context == null ? null : ast.o(context);
        if (audioManagerO == null || (bool != null && bool.booleanValue())) {
            this.c = null;
            this.a = false;
            this.b = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = audioManagerO.getSpatializer();
        this.c = spatializer;
        this.a = bby$$ExternalSyntheticApiModelOutline7.m((Object) spatializer).getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.b = handler;
        csn csnVar = new csn(runnable);
        this.d = csnVar;
        bby$$ExternalSyntheticApiModelOutline7.m((Object) spatializer).addOnSpatializerStateChangedListener(new cck(handler, 4), csnVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z) {
        blp[] blpVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (i(selectionStart, selectionEnd) || (blpVarArr = (blp[]) editable.getSpans(selectionStart, selectionEnd, blp.class)) == null || (blpVarArr.length) <= 0) {
            return false;
        }
        for (blp blpVar : blpVarArr) {
            int spanStart = editable.getSpanStart(blpVar);
            int spanEnd = editable.getSpanEnd(blpVar);
            if (z) {
                if (spanStart != selectionStart) {
                    if (selectionStart > spanStart || selectionStart >= spanEnd) {
                    }
                }
            } else if (spanEnd != selectionStart) {
                if (selectionStart > spanStart) {
                }
            }
            editable.delete(spanStart, spanEnd);
            return true;
        }
        return false;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (i(selectionStart, selectionEnd)) {
            return false;
        }
        if (z) {
            iMax = hmy.h(editable, selectionStart, Math.max(i, 0));
            iMin = hmy.i(editable, selectionEnd, Math.max(i2, 0));
            if (iMax == -1 || iMin == -1) {
                return false;
            }
        } else {
            iMax = Math.max(selectionStart - i, 0);
            iMin = Math.min(selectionEnd + i2, editable.length());
        }
        blp[] blpVarArr = (blp[]) editable.getSpans(iMax, iMin, blp.class);
        if (blpVarArr == null || (blpVarArr.length) <= 0) {
            return false;
        }
        for (blp blpVar : blpVarArr) {
            int spanStart = editable.getSpanStart(blpVar);
            int spanEnd = editable.getSpanEnd(blpVar);
            iMax = Math.min(spanStart, iMax);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax2 = Math.max(iMax, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax2, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    public static final void h(Spannable spannable, blm blmVar, int i, int i2) {
        spannable.setSpan(new blp(blmVar), i, i2, 33);
    }

    private static boolean i(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.media.Spatializer$OnSpatializerStateChangedListener, java.lang.Object] */
    public final void a() {
        ?? r1;
        Object obj;
        Object obj2 = this.c;
        if (obj2 == null || (r1 = this.d) == 0 || (obj = this.b) == null) {
            return;
        }
        bby$$ExternalSyntheticApiModelOutline7.m(obj2).removeOnSpatializerStateChangedListener(r1);
        ((Handler) obj).removeCallbacksAndMessages(null);
    }

    public final boolean b() {
        Object obj = this.c;
        return obj != null && bby$$ExternalSyntheticApiModelOutline7.m(obj).isAvailable();
    }

    public final boolean c() {
        Object obj = this.c;
        return obj != null && bby$$ExternalSyntheticApiModelOutline7.m(obj).isEnabled();
    }

    public final boolean d() {
        return this.c != null && this.a && b() && c();
    }

    public final boolean g(CharSequence charSequence, int i, int i2, blm blmVar) {
        if (blmVar.b == 0) {
            Object obj = this.b;
            dqp dqpVarE = blmVar.e();
            int iA = dqpVarE.a(8);
            if (iA != 0) {
                ((ByteBuffer) dqpVarE.c).getShort(iA + dqpVarE.a);
            }
            ThreadLocal threadLocal = bln.a;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            blmVar.b = true != ((bln) obj).b.hasGlyph(sb.toString()) ? 1 : 2;
        }
        return blmVar.b == 2;
    }

    public eqf(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        this.d = charSequence;
        this.c = charSequence2;
        this.b = charSequence3;
        this.a = z;
    }

    public eqf(String str, byte[][] bArr, boolean z, Date date) {
        this.d = str;
        this.c = bArr;
        this.a = z;
        this.b = date;
    }

    public eqf(dep depVar, blk blkVar, boolean z, int[] iArr) {
        this.c = depVar;
        this.b = blkVar;
        this.a = z;
        this.d = iArr;
    }

    public eqf(byte[] bArr, Map map, List list, boolean z) {
        this.b = bArr;
        this.c = map;
        this.d = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.a = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eqf(byte[] bArr, boolean z, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eqc eqcVar = (eqc) it.next();
                treeMap.put(eqcVar.a, eqcVar.b);
            }
        }
        this(bArr, treeMap, list, z);
    }
}
