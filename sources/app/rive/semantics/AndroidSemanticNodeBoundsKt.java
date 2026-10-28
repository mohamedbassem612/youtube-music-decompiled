package app.rive.semantics;

import android.graphics.Rect;
import defpackage.bbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSemanticNodeBoundsKt {
    public static final void applySemanticNodeBounds(bbz bbzVar, AndroidAccessibilityBounds androidAccessibilityBounds) {
        bbzVar.getClass();
        androidAccessibilityBounds.getClass();
        bbzVar.q(new Rect(androidAccessibilityBounds.getLeft(), androidAccessibilityBounds.getTop(), androidAccessibilityBounds.getRight(), androidAccessibilityBounds.getBottom()));
    }

    public static final AndroidAccessibilityBounds toAndroidAccessibilityBounds(SemanticNodeData semanticNodeData, SemanticNodeData semanticNodeData2) {
        int iFloor;
        int iFloor2;
        semanticNodeData.getClass();
        float fMin = Math.min(semanticNodeData.getMinX(), semanticNodeData.getMaxX());
        float fMin2 = Math.min(semanticNodeData.getMinY(), semanticNodeData.getMaxY());
        float fMax = Math.max(semanticNodeData.getMinX(), semanticNodeData.getMaxX());
        float fMax2 = Math.max(semanticNodeData.getMinY(), semanticNodeData.getMaxY());
        if (semanticNodeData2 != null) {
            iFloor = (int) Math.floor(Math.min(semanticNodeData2.getMinX(), semanticNodeData2.getMaxX()));
            iFloor2 = (int) Math.floor(Math.min(semanticNodeData2.getMinY(), semanticNodeData2.getMaxY()));
        } else {
            iFloor = 0;
            iFloor2 = 0;
        }
        return new AndroidAccessibilityBounds(((int) Math.floor(fMin)) - iFloor, ((int) Math.floor(fMin2)) - iFloor2, ((int) Math.ceil(fMax)) - iFloor, ((int) Math.ceil(fMax2)) - iFloor2);
    }
}
