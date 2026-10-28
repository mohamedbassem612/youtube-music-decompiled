package defpackage;

import android.system.ErrnoException;
import android.system.Os;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aja {
    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            n(i, size);
        }
    }

    public static final void b(List list, int i, int i2) {
        if (i > i2) {
            q(i, i2);
        }
        if (i < 0) {
            o(i);
        }
        if (i2 > list.size()) {
            p(i2, list.size());
        }
    }

    public static int c(ane aneVar, ana anaVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new amx((amz) list.get(i2), 2, 2));
        }
        return aneVar.mo201measure3p2s80s(new anb(anaVar.f()), arrayList, ape.d(i, Alert.DURATION_SHOW_INDEFINITELY)).a();
    }

    public static int d(ane aneVar, ana anaVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new amx((amz) list.get(i2), 2, 1));
        }
        return aneVar.mo201measure3p2s80s(new anb(anaVar.f()), arrayList, ape.d(Alert.DURATION_SHOW_INDEFINITELY, i)).b();
    }

    public static int e(ane aneVar, ana anaVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new amx((amz) list.get(i2), 1, 2));
        }
        return aneVar.mo201measure3p2s80s(new anb(anaVar.f()), arrayList, ape.d(i, Alert.DURATION_SHOW_INDEFINITELY)).a();
    }

    public static int f(ane aneVar, ana anaVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new amx((amz) list.get(i2), 1, 1));
        }
        return aneVar.mo201measure3p2s80s(new anb(anaVar.f()), arrayList, ape.d(Alert.DURATION_SHOW_INDEFINITELY, i)).b();
    }

    public static void g(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e) {
            Log.e("ExifInterfaceUtils", "Error closing fd.", e);
        }
    }

    public static void h(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[SemanticState.Multiline];
        while (i > 0) {
            int iMin = Math.min(i, SemanticState.Multiline);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    public static boolean i(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] j(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void k(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[SemanticState.Multiline];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    public static boolean l(Editable editable, KeyEvent keyEvent, boolean z) {
        bmf[] bmfVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (r(selectionStart, selectionEnd) || (bmfVarArr = (bmf[]) editable.getSpans(selectionStart, selectionEnd, bmf.class)) == null || (bmfVarArr.length) <= 0) {
            return false;
        }
        for (bmf bmfVar : bmfVarArr) {
            int spanStart = editable.getSpanStart(bmfVar);
            int spanEnd = editable.getSpanEnd(bmfVar);
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

    public static boolean m(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (r(selectionStart, selectionEnd)) {
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
        bmf[] bmfVarArr = (bmf[]) editable.getSpans(iMax, iMin, bmf.class);
        if (bmfVarArr == null || (bmfVarArr.length) <= 0) {
            return false;
        }
        for (bmf bmfVar : bmfVarArr) {
            int spanStart = editable.getSpanStart(bmfVar);
            int spanEnd = editable.getSpanEnd(bmfVar);
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

    private static final void n(int i, int i2) {
        throw new IndexOutOfBoundsException(a.cj(i2, i, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void o(int i) {
        throw new IndexOutOfBoundsException(a.bP(i, "fromIndex (", ") is less than 0."));
    }

    private static final void p(int i, int i2) {
        throw new IndexOutOfBoundsException(a.ck(i2, i, "toIndex (", ") is more than than the list size (", (byte) 41));
    }

    private static final void q(int i, int i2) {
        throw new IllegalArgumentException(a.cj(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    private static boolean r(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }
}
