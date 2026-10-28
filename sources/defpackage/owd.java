package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class owd implements opm {
    private final Context a;
    private final owu b;
    private final oxn c;

    public owd(Context context, owu owuVar, oxn oxnVar) {
        this.a = context;
        this.b = owuVar;
        this.c = oxnVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, oov] */
    private static TextTypeOuterClass$TextType m(oon oonVar, ElementsServices elementsServices) {
        if (oonVar == null || oonVar.a() != 1) {
            elementsServices.L().io().c().c(aslh.LOG_TYPE_INVALID_FIELD, "ScrollableContainer with marquee config doesn't contain exactly one child", null);
            return null;
        }
        atgg atggVarB = oonVar.b(0);
        if (!atggVarB.aZ()) {
            elementsServices.L().io().c().c(aslh.LOG_TYPE_MISSING_FIELD, "ScrollableContainer contains element with no type", null);
        }
        mew mewVarBb = atggVarB.bb();
        mep mepVar = TextTypeOuterClass$TextType.d;
        if (!mewVarBb.e(mepVar)) {
            elementsServices.L().io().c().c(aslh.LOG_TYPE_INVALID_FIELD, "ScrollableContainer with marquee config doesn't contain TextType extension", null);
        }
        return (TextTypeOuterClass$TextType) mewVarBb.d(mepVar);
    }

    private static boolean n(oon oonVar, atlz atlzVar) {
        return atlzVar.aV() && oonVar != null && oonVar.a() == 1 && oonVar.b(0).aZ() && oonVar.b(0).bb().e(TextTypeOuterClass$TextType.d);
    }

    @Override // defpackage.opm
    public final int a() {
        return 32;
    }

    @Override // defpackage.opm
    public final mep b() {
        return atlz.d;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        return new owb(this.a, nodeTreeProcessor);
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
        boolean z;
        boolean z2;
        atlz atlzVar = (atlz) metVar;
        owb owbVar = (owb) nodeViewInterface;
        if (atlzVar.aV()) {
            osk.a(aslh.LOG_TYPE_INTERNAL_ERROR, new UnsupportedOperationException("Update should never be called on ScrollableContainerType with marquee config. A measure output is required."), owbVar.h().n());
            return false;
        }
        int iAS = a.aS(Memory.peekInt(atlzVar.c + 12, false));
        boolean z3 = iAS != 0 && iAS == 3;
        boolean z4 = owbVar.d;
        atlz atlzVar2 = owbVar.l;
        if (atlzVar2 == null) {
            z2 = true;
            z = true;
        } else {
            z = !atlzVar2.bc().equals(atlzVar.bc());
            z2 = (atlzVar2.aZ().equals(atlzVar.aZ()) && atlzVar2.ba().equals(atlzVar.ba()) && atlzVar2.bb().equals(atlzVar.bb())) ? false : true;
        }
        boolean z5 = z4 != z3 || ((owbVar.c != null) ^ true) || z || z2;
        owbVar.d = z3;
        if (z5) {
            owbVar.an(atlzVar);
        } else {
            owbVar.ag(atlzVar);
        }
        owbVar.l = atlzVar;
        owbVar.post(new msh(owbVar, atlzVar, 19));
        return true;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        return false;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        owb owbVar = (owb) nodeViewInterface;
        if (obj instanceof owy) {
            owbVar.l((owy) obj);
            return true;
        }
        osk.a(aslh.LOG_TYPE_INTERNAL_ERROR, new UnsupportedOperationException("updatePrepared does not have a TextPaintUnit as a measureOutput."), owbVar.h().n());
        return false;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ Size j(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar) {
        osk.a(aslh.LOG_TYPE_INTERNAL_ERROR, new UnsupportedOperationException("Not implemented - ScrollableContainerNodeView measurement requires a ContentSource."), elementsServices.n());
        return new Size(0, 0);
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ Size k(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar, oon oonVar, Object obj, oph ophVar) {
        if (!n(oonVar, (atlz) metVar)) {
            return new Size(0, 0);
        }
        TextTypeOuterClass$TextType textTypeOuterClass$TextTypeM = m(oonVar, elementsServices);
        if (textTypeOuterClass$TextTypeM == null) {
            return new Size(0, 0);
        }
        Layout layoutB = this.b.b(textTypeOuterClass$TextTypeM, this.c.a(), i, elementsServices, z);
        if (TextUtils.isEmpty(layoutB.getText())) {
            return new Size(0, 0);
        }
        abkVar.a = layoutB;
        return new Size(View.MeasureSpec.getSize(i), layoutB.getHeight());
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5) {
        TextTypeOuterClass$TextType textTypeOuterClass$TextTypeM;
        atlz atlzVar = (atlz) metVar;
        if (n(oonVar, atlzVar) && !(abkVar.a instanceof owy) && (textTypeOuterClass$TextTypeM = m(oonVar, elementsServices)) != null) {
            Layout layoutB = (Layout) abkVar.a;
            if (layoutB == null) {
                layoutB = this.b.b(textTypeOuterClass$TextTypeM, this.c.a(), View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), elementsServices, z);
            }
            owy owyVar = new owy(this.b, this.c, i5 == 3, true, elementsServices);
            if (atlzVar.k == null && (Memory.peekByte(atlzVar.c + 9) & 2) != 0) {
                atlzVar.k = new atlh(atlzVar.cp(true != atmi.a ? 40 : 64, atlg.a));
            }
            owyVar.o = atlzVar.k == null ? atlf.a : atlzVar.k;
            owyVar.F(textTypeOuterClass$TextTypeM, layoutB);
            owyVar.t(0, 0, i3, i4);
            owyVar.B(mewVar);
            owyVar.n();
            abkVar.a = owyVar;
        }
        return true;
    }
}
