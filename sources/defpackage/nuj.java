package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nuj {
    /* JADX WARN: Multi-variable type inference failed */
    public static View a(ViewGroup viewGroup, int i) {
        View viewA;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NodeViewInternalInterface) && ((NodeViewInternalInterface) childAt).W() == i) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewA = a((ViewGroup) childAt, i)) != null) {
                return viewA;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PaintUnit b(View view, int i) {
        if (view instanceof PaintUnitOwner) {
            return ((PaintUnitOwner) view).ih(i);
        }
        Log.e("ElementsAccessibilityHostResolver", "findPaintUnit: attempting to find paint unit on a view that is not a PaintUnitOwner");
        return null;
    }
}
