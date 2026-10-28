package defpackage;

import android.util.Size;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyd implements opm {
    private final /* synthetic */ int $cid;

    public oyd(int i) {
        this.$cid = i;
    }

    @Override // defpackage.opm
    public final int a() {
        return 16;
    }

    @Override // defpackage.opm
    public final mep b() {
        return this.$cid != 0 ? aten.d : atal.d;
    }

    @Override // defpackage.opm
    public final NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        return this.$cid != 0 ? new oyk(nodeTreeProcessor) : new oyk(nodeTreeProcessor);
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit d(met metVar, ElementsServices elementsServices) {
        if (this.$cid != 0) {
            throw new UnsupportedOperationException("createPaintUnitForSkipApplyTypeExtension should be used instead");
        }
        throw new UnsupportedOperationException("createPaintUnitForSkipApplyTypeExtension should be used instead");
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit e(met metVar, ElementsServices elementsServices, float f, float f2, Object obj) {
        return this.$cid != 0 ? d(metVar, elementsServices) : d(metVar, elementsServices);
    }

    @Override // defpackage.opm
    public final PaintUnit f(ElementsServices elementsServices) {
        return this.$cid != 0 ? new oul() : new oul();
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean g(met metVar, NodeViewInterface nodeViewInterface) {
        if (this.$cid != 0) {
        }
        return false;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        if (this.$cid != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.opm
    public final boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        return false;
    }

    @Override // defpackage.opm
    public final /* synthetic */ Size j(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar) {
        return this.$cid != 0 ? ntz.c() : ntz.c();
    }

    @Override // defpackage.opm
    public final /* synthetic */ Size k(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar, oon oonVar, Object obj, oph ophVar) {
        return this.$cid != 0 ? ntz.d() : ntz.d();
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5) {
        return true;
    }
}
