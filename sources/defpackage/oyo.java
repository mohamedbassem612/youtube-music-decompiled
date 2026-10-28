package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import java.util.ArrayList;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oyo implements opo {
    private final long a;
    private final List b = new ArrayList();

    public oyo(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static List c(NodeViewInterface nodeViewInterface) {
        ArrayList arrayList = new ArrayList();
        d((View) nodeViewInterface, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:51:0x005f A[EDGE_INSN: B:51:0x005f->B:28:0x005f BREAK  A[LOOP:1: B:20:0x0043->B:54:0x0043], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(View view, List list) {
        ViewGroup viewGroup;
        int childCount;
        View childAt;
        if (view instanceof ooy) {
            return;
        }
        view.clearAnimation();
        if (Memory.peekByte(FlagServices.b().c + 51) == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                int childCount2 = viewGroup2.getChildCount();
                while (true) {
                    childCount2--;
                    if (childCount2 < 0) {
                        break;
                    }
                    View childAt2 = viewGroup2.getChildAt(childCount2);
                    d(childAt2, list);
                    if (childAt2 instanceof NodeViewInterface) {
                        viewGroup2.removeViewInLayout(childAt2);
                    }
                }
            }
            if (view instanceof NodeViewInterface) {
                list.add((NodeViewInterface) view);
                return;
            }
            return;
        }
        if (!(view instanceof oyk)) {
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
                childCount = viewGroup.getChildCount();
                while (true) {
                    childCount--;
                    if (childCount >= 0) {
                        break;
                        break;
                    } else {
                        childAt = viewGroup.getChildAt(childCount);
                        d(childAt, list);
                        if (!(childAt instanceof NodeViewInterface)) {
                        }
                    }
                }
            }
        } else {
            oyk oykVar = (oyk) view;
            if (!oykVar.ao()) {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                    childCount = viewGroup.getChildCount();
                    while (true) {
                        childCount--;
                        if (childCount >= 0) {
                            break;
                        }
                        childAt = viewGroup.getChildAt(childCount);
                        d(childAt, list);
                        if (!(childAt instanceof NodeViewInterface) && ((NodeViewInterface) childAt).c() > 0) {
                            viewGroup.removeViewInLayout(childAt);
                        }
                    }
                }
            } else {
                int iId = oykVar.id();
                while (true) {
                    iId--;
                    if (iId < 0) {
                        break;
                    }
                    View viewIe = oykVar.ie(iId);
                    if (viewIe != null) {
                        d(viewIe, list);
                        oykVar.al(iId);
                    }
                }
            }
        }
        if (view instanceof NodeViewInterface) {
            NodeViewInterface nodeViewInterface = (NodeViewInterface) view;
            if (nodeViewInterface.c() > 0) {
                list.add(nodeViewInterface);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.libraries.multiplatform.elements.NodeViewInterface] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.opo
    public final NodeViewInterface a(opm opmVar, NodeTreeProcessor nodeTreeProcessor) {
        ?? r5;
        System.currentTimeMillis();
        int i = opmVar.b().a;
        int i2 = 0;
        while (true) {
            List list = this.b;
            if (i2 >= list.size()) {
                r5 = 0;
                break;
            }
            acao acaoVar = (acao) list.get(i2);
            if (acaoVar.b == i) {
                list.remove(i2);
                r5 = acaoVar.c;
                break;
            }
            i2++;
        }
        if (r5 != 0) {
            r5.B(nodeTreeProcessor);
            return r5;
        }
        NodeViewInterface nodeViewInterfaceC = opmVar.c(nodeTreeProcessor);
        nodeViewInterfaceC.R(i);
        return nodeViewInterfaceC;
    }

    @Override // defpackage.opo
    public final void b(NodeViewInterface nodeViewInterface) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<NodeViewInterface> listC = c(nodeViewInterface);
        for (NodeViewInterface nodeViewInterface2 : listC) {
            int iC = nodeViewInterface2.c();
            FlagServices.b();
            nodeViewInterface2.y();
            this.b.add(new acao(nodeViewInterface2, iC, jCurrentTimeMillis));
        }
        List list = this.b;
        int size = list.size() - listC.size();
        for (int i = 0; i < size; i++) {
            if (((acao) list.get(i)).a + this.a >= jCurrentTimeMillis) {
                size = i;
                break;
            }
        }
        if (size > 0) {
            list.subList(0, size).clear();
        }
    }
}
