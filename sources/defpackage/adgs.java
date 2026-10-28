package defpackage;

import android.util.Size;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adgs implements opm {
    @Override // defpackage.opm
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.opm
    public final mep b() {
        return astp.d;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        nodeTreeProcessor.getClass();
        return new adgu(nodeTreeProcessor);
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit d(met metVar, ElementsServices elementsServices) {
        ntz.a(elementsServices);
        return null;
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit e(met metVar, ElementsServices elementsServices, float f, float f2, Object obj) {
        ntz.a(elementsServices);
        return null;
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit f(ElementsServices elementsServices) {
        ntz.b(elementsServices);
        return null;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean g(met metVar, NodeViewInterface nodeViewInterface) {
        astp astpVar = (astp) metVar;
        adgu adguVar = (adgu) nodeViewInterface;
        astpVar.getClass();
        adguVar.getClass();
        if (astpVar.f == null && (Memory.peekByte(astpVar.c + 8) & 2) != 0) {
            astpVar.f = new mew(astpVar.cp(true != astr.a ? 16 : 24, atcm.a));
        }
        mew mewVar = astpVar.f == null ? atcl.a : astpVar.f;
        mewVar.getClass();
        adguVar.a = mewVar;
        if (astpVar.e == null && (Memory.peekByte(astpVar.c + 8) & 1) != 0) {
            astpVar.e = new mew(astpVar.cp(true != astr.a ? 12 : 16, atcm.a));
        }
        mew mewVar2 = astpVar.e == null ? atcl.a : astpVar.e;
        mewVar2.getClass();
        adguVar.b = mewVar2;
        if (astpVar.g == null && (Memory.peekByte(astpVar.c + 8) & 4) != 0) {
            astpVar.g = new mew(astpVar.cp(true != astr.a ? 20 : 32, atcm.a));
        }
        mew mewVar3 = astpVar.g == null ? atcl.a : astpVar.g;
        mewVar3.getClass();
        adguVar.c = mewVar3;
        if (astpVar.h == null && (Memory.peekByte(astpVar.c + 8) & 8) != 0) {
            astpVar.h = new mew(astpVar.cp(true == astr.a ? 40 : 24, atcm.a));
        }
        mew mewVar4 = astpVar.h == null ? atcl.a : astpVar.h;
        mewVar4.getClass();
        adguVar.d = mewVar4;
        return true;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        return false;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        ((adgu) nodeViewInterface).getClass();
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
