package defpackage;

import android.util.Size;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ovu implements opm {
    public static final boolean m(PaintUnit paintUnit) {
        if (!(paintUnit instanceof owc)) {
            return false;
        }
        ((owc) paintUnit).s();
        return true;
    }

    @Override // defpackage.opm
    public final int a() {
        return 0;
    }

    @Override // defpackage.opm
    public final mep b() {
        return atlz.d;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        return new out(nodeTreeProcessor, new owc());
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit d(met metVar, ElementsServices elementsServices) {
        return new owc();
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ PaintUnit e(met metVar, ElementsServices elementsServices, float f, float f2, Object obj) {
        if (!(obj instanceof owc)) {
            return new owc();
        }
        owc owcVar = (owc) obj;
        owcVar.s();
        return owcVar;
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit f(ElementsServices elementsServices) {
        ntz.b(elementsServices);
        return null;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean g(met metVar, NodeViewInterface nodeViewInterface) {
        return m(((out) nodeViewInterface).a);
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        return m(paintUnit);
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        out outVar = (out) nodeViewInterface;
        if (!(obj instanceof owc)) {
            return true;
        }
        owc owcVar = (owc) obj;
        outVar.a.f(null);
        owcVar.t(0, 0, outVar.getWidth(), outVar.getHeight());
        owcVar.f(outVar);
        owcVar.r = outVar.A;
        outVar.a = owcVar;
        return true;
    }

    @Override // defpackage.opm
    public final /* synthetic */ Size j(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar) {
        return ntz.c();
    }

    @Override // defpackage.opm
    public final /* synthetic */ Size k(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar, oon oonVar, Object obj, oph ophVar) {
        return ntz.d();
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5) {
        return true;
    }
}
