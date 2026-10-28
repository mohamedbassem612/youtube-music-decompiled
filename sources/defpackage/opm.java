package defpackage;

import android.util.Size;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface opm {
    int a();

    mep b();

    NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor);

    PaintUnit d(met metVar, ElementsServices elementsServices);

    PaintUnit e(met metVar, ElementsServices elementsServices, float f, float f2, Object obj);

    PaintUnit f(ElementsServices elementsServices);

    boolean g(met metVar, NodeViewInterface nodeViewInterface);

    boolean h(met metVar, PaintUnit paintUnit, Object obj);

    boolean i(NodeViewInterface nodeViewInterface, Object obj);

    Size j(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar);

    Size k(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar, oon oonVar, Object obj, oph ophVar);

    boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5);
}
