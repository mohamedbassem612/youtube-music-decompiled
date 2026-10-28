package defpackage;

import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nta {
    public static int a(NodeViewInterface nodeViewInterface) {
        NodeTreeProcessor nodeTreeProcessorM = nodeViewInterface.m();
        if (nodeTreeProcessorM != null) {
            return nodeTreeProcessorM.a(nodeViewInterface.d());
        }
        return -1;
    }

    public static void b(NodeViewInterface nodeViewInterface, Object obj) {
        NodeTreeProcessor nodeTreeProcessorM = nodeViewInterface.m();
        if (nodeTreeProcessorM != null) {
            nodeTreeProcessorM.w(nodeViewInterface.d(), obj);
        }
    }
}
