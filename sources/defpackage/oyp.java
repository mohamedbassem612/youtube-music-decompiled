package defpackage;

import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oyp implements opo {
    private final List a = new ArrayList();
    private final int b;

    public oyp(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.libraries.multiplatform.elements.NodeViewInterface] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.opo
    public final NodeViewInterface a(opm opmVar, NodeTreeProcessor nodeTreeProcessor) {
        ?? r4;
        int i = opmVar.b().a;
        int i2 = 0;
        while (true) {
            List list = this.a;
            if (i2 >= list.size()) {
                r4 = 0;
                break;
            }
            if (((aami) list.get(i2)).a == i) {
                r4 = ((aami) list.remove(i2)).b;
                break;
            }
            i2++;
        }
        if (r4 != 0) {
            r4.B(nodeTreeProcessor);
            return r4;
        }
        NodeViewInterface nodeViewInterfaceC = opmVar.c(nodeTreeProcessor);
        nodeViewInterfaceC.R(i);
        return nodeViewInterfaceC;
    }

    @Override // defpackage.opo
    public final void b(NodeViewInterface nodeViewInterface) {
        List listC = oyo.c(nodeViewInterface);
        for (int i = 0; i < listC.size() && i < this.b; i++) {
            NodeViewInterface nodeViewInterface2 = (NodeViewInterface) listC.get(i);
            int iC = nodeViewInterface2.c();
            FlagServices.b();
            nodeViewInterface2.y();
            this.a.add(new aami(nodeViewInterface2, iC, null));
        }
        List list = this.a;
        int i2 = this.b;
        if (list.size() > i2) {
            list.subList(0, list.size() - i2).clear();
        }
    }
}
