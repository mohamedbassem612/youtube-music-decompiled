package defpackage;

import android.content.Context;
import android.text.Editable;
import android.util.Size;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class orz implements opm {
    final /* synthetic */ Context a;
    final /* synthetic */ owu b;

    public orz(Context context, owu owuVar) {
        this.a = context;
        this.b = owuVar;
    }

    @Override // defpackage.opm
    public final int a() {
        return 40;
    }

    @Override // defpackage.opm
    public final mep b() {
        return atfx.d;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        osc oscVar = new osc(nodeTreeProcessor, new orw(this.a, nodeTreeProcessor.k(), nodeTreeProcessor.l(), this.b));
        oscVar.addView(oscVar.a);
        return oscVar;
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

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [android.text.Editable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean g(met metVar, NodeViewInterface nodeViewInterface) {
        ?? Bi;
        ?? text;
        atfx atfxVar = (atfx) metVar;
        int i = osc.b;
        orw orwVar = ((osc) nodeViewInterface).a;
        if (!orwVar.h) {
            orwVar.d(atfxVar, false);
            orwVar.h = true;
            return true;
        }
        atfx atfxVar2 = orwVar.c;
        orwVar.c = atfxVar;
        agev agevVarI = atfxVar.aV() ? agev.i(atfxVar.bc()) : agdf.a;
        if (atfxVar2 != null) {
            long j = atfxVar2.c;
            long j2 = true != atfz.a ? 64L : 40L;
            if (Memory.peekInt(j + j2, false) != Memory.peekInt(atfxVar.c + j2, false)) {
                orwVar.m = Memory.peekInt(atfxVar.c + (true == atfz.a ? 40L : 64L), false);
                orwVar.f();
            }
        } else {
            orwVar.m = Memory.peekInt(atfxVar.c + (true == atfz.a ? 40L : 64L), false);
            orwVar.f();
        }
        orwVar.a(atfxVar2, agevVarI, false);
        List<CharSequence> list = orwVar.e;
        if (list.isEmpty()) {
            Bi = "";
            if (atfxVar.aV() && (Memory.peekByte(atfxVar.bc().c + 8) & 1) != 0) {
                Bi = atfxVar.bc().bi();
            }
        } else {
            Bi = (!atfxVar.aV() || (Memory.peekByte(atfxVar.bc().c + 8) & 1) == 0) ? 0 : atfxVar.bc().bi();
            if (Bi == 0) {
                Bi = (CharSequence) list.get(0);
            } else {
                ?? string = ((CharSequence) list.get(0)).toString();
                for (CharSequence charSequence : list) {
                    if (charSequence != null) {
                        ?? string2 = charSequence.toString();
                        if (string2.equalsIgnoreCase(Bi)) {
                            if (!string.startsWith(string2)) {
                                Bi = string;
                                break;
                            }
                            Bi = Bi.concat(String.valueOf(string.substring(string2.length())));
                            break;
                        }
                    }
                }
            }
        }
        Editable text2 = orwVar.getText();
        if ((text2 == null || !text2.toString().contentEquals(Bi)) && (text = orwVar.getText()) != 0) {
            ?? string3 = text.toString();
            if (!string3.contentEquals(Bi)) {
                int selectionStart = orwVar.getSelectionStart();
                int selectionEnd = orwVar.getSelectionEnd();
                orwVar.f = true;
                try {
                    orwVar.beginBatchEdit();
                    text.replace(0, string3.length(), Bi);
                    orwVar.g(selectionStart, selectionEnd);
                    orwVar.endBatchEdit();
                } finally {
                    orwVar.f = false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        return false;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        return false;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ Size j(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar) {
        throw new UnsupportedOperationException("measure is not supported");
    }

    @Override // defpackage.opm
    public final /* synthetic */ Size k(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar, oon oonVar, Object obj, oph ophVar) {
        atfx atfxVar = (atfx) metVar;
        Context contextC = elementsServices.c();
        if (ophVar == null) {
            ophVar = oph.a().a();
        }
        orw orwVar = new orw(contextC, elementsServices, ophVar, this.b);
        orwVar.d(atfxVar, true);
        if (obj instanceof ory) {
            orwVar.setText(((ory) obj).a);
        } else {
            orwVar.e(agev.i(atfxVar.aV() ? atfxVar.bc() : orw.s));
        }
        orwVar.measure(i, i2);
        return new Size(View.MeasureSpec.getMode(i) == 0 ? orwVar.getMeasuredWidth() : Math.min(View.MeasureSpec.getSize(i), orwVar.getMeasuredWidth()), orwVar.getMeasuredHeight());
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5) {
        return true;
    }
}
