package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import com.google.android.libraries.multiplatform.elements.runtime.RuntimeSharedBuffer;
import com.google.android.libraries.multiplatform.elements.text.experimental.Paragraph;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oxf implements opm {
    private final owu a;
    private final oxn b;

    public oxf(owu owuVar, oxn oxnVar) {
        this.a = owuVar;
        this.b = oxnVar;
    }

    private final PaintUnit m(TextTypeOuterClass$TextType textTypeOuterClass$TextType, ElementsServices elementsServices, Object obj) {
        if (true != (obj instanceof Layout)) {
            obj = null;
        }
        owy owyVar = new owy(this.a, this.b, true, true, elementsServices);
        owyVar.F(textTypeOuterClass$TextType, (Layout) obj);
        return owyVar;
    }

    @Override // defpackage.opm
    public final int a() {
        return 388;
    }

    @Override // defpackage.opm
    public final mep b() {
        return TextTypeOuterClass$TextType.d;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        return new owv(nodeTreeProcessor, new owy(this.a, this.b, false, false, nodeTreeProcessor.k()));
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit d(met metVar, ElementsServices elementsServices) {
        return m((TextTypeOuterClass$TextType) metVar, elementsServices, null);
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ PaintUnit e(met metVar, ElementsServices elementsServices, float f, float f2, Object obj) {
        TextTypeOuterClass$TextType textTypeOuterClass$TextType = (TextTypeOuterClass$TextType) metVar;
        if (!(obj instanceof oxs)) {
            return m(textTypeOuterClass$TextType, elementsServices, null);
        }
        oxs oxsVar = (oxs) obj;
        PaintUnit paintUnitM = m(textTypeOuterClass$TextType, elementsServices, oxs.a(oxsVar, f, f2));
        ((owy) paintUnitM).a = oxsVar.a;
        return paintUnitM;
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit f(ElementsServices elementsServices) {
        ntz.b(elementsServices);
        return null;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean g(met metVar, NodeViewInterface nodeViewInterface) {
        ((owy) ((ouu) ((owv) nodeViewInterface)).a).F((TextTypeOuterClass$TextType) metVar, null);
        return true;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        TextTypeOuterClass$TextType textTypeOuterClass$TextType = (TextTypeOuterClass$TextType) metVar;
        if (!(paintUnit instanceof owy)) {
            return true;
        }
        owy owyVar = (owy) paintUnit;
        if (obj instanceof owy) {
            owyVar.G((owy) obj);
            return true;
        }
        if (!(obj instanceof oxs)) {
            owyVar.F(textTypeOuterClass$TextType, null);
            return true;
        }
        oxs oxsVar = (oxs) obj;
        owyVar.F(textTypeOuterClass$TextType, oxs.a(oxsVar, ((owyVar.u - owyVar.s) - owyVar.b) - owyVar.d, ((owyVar.v - owyVar.t) - owyVar.c) - owyVar.e));
        owyVar.a = oxsVar.a;
        return true;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        owv owvVar = (owv) nodeViewInterface;
        if (!(obj instanceof owy)) {
            return true;
        }
        ((owy) ((ouu) owvVar).a).G((owy) obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:37:0x00c4, B:39:0x00ce, B:53:0x010d, B:55:0x0113, B:57:0x0117, B:61:0x0126, B:64:0x012e, B:40:0x00d4, B:45:0x00ee, B:50:0x0104, B:49:0x0100, B:44:0x00ea, B:36:0x00b0), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:37:0x00c4, B:39:0x00ce, B:53:0x010d, B:55:0x0113, B:57:0x0117, B:61:0x0126, B:64:0x012e, B:40:0x00d4, B:45:0x00ee, B:50:0x0104, B:49:0x0100, B:44:0x00ea, B:36:0x00b0), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:37:0x00c4, B:39:0x00ce, B:53:0x010d, B:55:0x0113, B:57:0x0117, B:61:0x0126, B:64:0x012e, B:40:0x00d4, B:45:0x00ee, B:50:0x0104, B:49:0x0100, B:44:0x00ea, B:36:0x00b0), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0100 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:37:0x00c4, B:39:0x00ce, B:53:0x010d, B:55:0x0113, B:57:0x0117, B:61:0x0126, B:64:0x012e, B:40:0x00d4, B:45:0x00ee, B:50:0x0104, B:49:0x0100, B:44:0x00ea, B:36:0x00b0), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010d A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:37:0x00c4, B:39:0x00ce, B:53:0x010d, B:55:0x0113, B:57:0x0117, B:61:0x0126, B:64:0x012e, B:40:0x00d4, B:45:0x00ee, B:50:0x0104, B:49:0x0100, B:44:0x00ea, B:36:0x00b0), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0113 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:37:0x00c4, B:39:0x00ce, B:53:0x010d, B:55:0x0113, B:57:0x0117, B:61:0x0126, B:64:0x012e, B:40:0x00d4, B:45:0x00ee, B:50:0x0104, B:49:0x0100, B:44:0x00ea, B:36:0x00b0), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #1 {all -> 0x0147, blocks: (B:37:0x00c4, B:39:0x00ce, B:53:0x010d, B:55:0x0113, B:57:0x0117, B:61:0x0126, B:64:0x012e, B:40:0x00d4, B:45:0x00ee, B:50:0x0104, B:49:0x0100, B:44:0x00ea, B:36:0x00b0), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ Size j(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar) throws Throwable {
        Paragraph paragraph;
        Paragraph paragraph2;
        Layout layoutC;
        Throwable th;
        Paragraph paragraph3;
        int width;
        int mode;
        int size;
        int height;
        int mode2;
        int size2;
        Size size3;
        boolean z2;
        owu owuVar;
        TextTypeOuterClass$TextType textTypeOuterClass$TextType = (TextTypeOuterClass$TextType) metVar;
        boolean z3 = false;
        if (Memory.peekByte(FlagServices.b().c + 33) == 0) {
            Layout layoutA = this.a.a(textTypeOuterClass$TextType, this.b.a(), i, i2, elementsServices, z);
            Size size4 = TextUtils.isEmpty(layoutA.getText()) ? new Size(0, 0) : new Size(layoutA.getWidth(), layoutA.getHeight());
            abkVar.a = new oxs(layoutA, size4, false, textTypeOuterClass$TextType.aV());
            return size4;
        }
        Object objIo = elementsServices.L().io();
        Paragraph paragraph4 = null;
        if (objIo instanceof ElementsRuntimeImpl) {
            RuntimeSharedBuffer runtimeSharedBuffer = ((ElementsRuntimeImpl) objIo).j;
            long jC = RuntimeSharedBuffer.c();
            long jPeekLong = Memory.peekLong(RuntimeSharedBuffer.jniGetThreadLocalAddress() + 8, false);
            if (jC != 0) {
                long jJniGetParagraphHandle = Paragraph.jniGetParagraphHandle(jC);
                if (jJniGetParagraphHandle == 0 || jPeekLong == 0) {
                    if (jJniGetParagraphHandle != 0) {
                        Paragraph.jniReleaseParagraph(jJniGetParagraphHandle);
                    }
                    if (jPeekLong != 0 && Memory.peekByte(FlagServices.b().c + 103) == 0) {
                        UpbArena.c(jPeekLong);
                    }
                } else if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
                    UpbArena upbArenaB = UpbArena.b(jPeekLong);
                    if (upbArenaB == null) {
                        Paragraph.jniReleaseParagraph(jJniGetParagraphHandle);
                    } else {
                        paragraph = new Paragraph(jJniGetParagraphHandle, upbArenaB);
                    }
                } else {
                    paragraph = new Paragraph(jJniGetParagraphHandle, UpbArena.a(jPeekLong));
                }
                paragraph = null;
            } else {
                paragraph = null;
            }
        } else {
            paragraph = null;
        }
        if (paragraph == null) {
            paragraph2 = paragraph;
            layoutC = this.a.a(textTypeOuterClass$TextType, this.b.a(), i, i2, elementsServices, z);
            if (TextUtils.isEmpty(layoutC.getText())) {
                size3 = new Size(0, 0);
            } else {
                width = layoutC.getWidth();
                mode = View.MeasureSpec.getMode(i);
                size = View.MeasureSpec.getSize(i);
                if (mode == 1073741824) {
                    width = size;
                } else if (mode == Integer.MIN_VALUE) {
                    width = Math.min(width, size);
                }
                height = layoutC.getHeight();
                mode2 = View.MeasureSpec.getMode(i2);
                size2 = View.MeasureSpec.getSize(i2);
                if (mode2 == 1073741824) {
                    height = size2;
                } else if (mode2 == Integer.MIN_VALUE) {
                    height = Math.min(height, size2);
                }
                size3 = new Size(width, height);
            }
            if (paragraph2 != null) {
                owuVar = this.a;
                if (owuVar instanceof oxj) {
                    if (layoutC == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (textTypeOuterClass$TextType.aV()) {
                paragraph4 = paragraph2;
            } else if (paragraph2 != null) {
                if (paragraph2.m()) {
                }
                paragraph4 = paragraph2;
            }
            abkVar.a = new oxs(layoutC, size3, z2, z3);
            if (paragraph2 != null) {
                return size3;
            }
            paragraph2.k();
            return size3;
        }
        try {
            owu owuVar2 = this.a;
            if (owuVar2 instanceof oxj) {
                layoutC = ((oxj) owuVar2).c(textTypeOuterClass$TextType, paragraph, this.b.a(), i, i2, elementsServices, z);
                paragraph2 = paragraph;
            } else {
                paragraph2 = paragraph;
                try {
                    layoutC = this.a.a(textTypeOuterClass$TextType, this.b.a(), i, i2, elementsServices, z);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    paragraph3 = paragraph2;
                }
            }
            if (TextUtils.isEmpty(layoutC.getText())) {
                size3 = new Size(0, 0);
            } else {
                width = layoutC.getWidth();
                mode = View.MeasureSpec.getMode(i);
                size = View.MeasureSpec.getSize(i);
                if (mode == 1073741824) {
                    width = size;
                } else if (mode == Integer.MIN_VALUE) {
                    width = Math.min(width, size);
                }
                height = layoutC.getHeight();
                mode2 = View.MeasureSpec.getMode(i2);
                size2 = View.MeasureSpec.getSize(i2);
                if (mode2 == 1073741824) {
                    height = size2;
                } else if (mode2 == Integer.MIN_VALUE) {
                    height = Math.min(height, size2);
                }
                size3 = new Size(width, height);
            }
            if (paragraph2 != null) {
                owuVar = this.a;
                if (owuVar instanceof oxj) {
                    if (layoutC == null && oxh.e(paragraph2.d()) == TextUtils.TruncateAt.MARQUEE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (textTypeOuterClass$TextType.aV()) {
                paragraph4 = paragraph2;
            } else if (paragraph2 != null) {
                z3 = paragraph2.m();
                paragraph4 = paragraph2;
            }
            try {
                abkVar.a = new oxs(layoutC, size3, z2, z3);
                if (paragraph2 != null) {
                    return size3;
                }
                paragraph2.k();
                return size3;
            } catch (Throwable th3) {
                th = th3;
                paragraph3 = paragraph4;
            }
        } catch (Throwable th4) {
            th = th4;
            paragraph2 = paragraph;
            th = th;
            paragraph3 = paragraph2;
        }
        if (paragraph3 == null) {
            throw th;
        }
        paragraph3.k();
        throw th;
    }

    @Override // defpackage.opm
    public final /* synthetic */ Size k(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar, oon oonVar, Object obj, oph ophVar) {
        return ntz.d();
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5) {
        float fIntBitsToFloat;
        float f;
        float fIntBitsToFloat2;
        float f2;
        Layout layoutA;
        boolean z2;
        TextTypeOuterClass$TextType textTypeOuterClass$TextType = (TextTypeOuterClass$TextType) metVar;
        if (abkVar.a instanceof owy) {
            return true;
        }
        long j = mewVar.c;
        if ((Memory.peekByte(9 + j) & 16) != 0) {
            fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(j + 76, false));
            f = fIntBitsToFloat2;
            fIntBitsToFloat = f;
            f2 = fIntBitsToFloat;
        } else {
            float fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(j + 60, false));
            float fIntBitsToFloat4 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 64, false));
            fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 68, false));
            f = fIntBitsToFloat3;
            fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 72, false));
            f2 = fIntBitsToFloat4;
        }
        Object obj = abkVar.a;
        float f3 = (i4 - i2) - fIntBitsToFloat2;
        float f4 = ((i3 - i) - f) - fIntBitsToFloat;
        float f5 = f3 - f2;
        if (obj instanceof oxs) {
            oxs oxsVar = (oxs) obj;
            boolean z3 = oxsVar.a;
            layoutA = oxs.a(oxsVar, f4, f5);
            z2 = z3;
        } else {
            layoutA = null;
            z2 = false;
        }
        if (layoutA == null) {
            layoutA = this.a.a(textTypeOuterClass$TextType, this.b.a(), View.MeasureSpec.makeMeasureSpec((int) f4, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f5, 1073741824), elementsServices, z);
        }
        owy owyVar = new owy(this.a, this.b, i5 == 3, true, elementsServices);
        owyVar.F(textTypeOuterClass$TextType, layoutA);
        owyVar.a = z2;
        owyVar.t(i, i2, i3, i4);
        owyVar.B(mewVar);
        owyVar.n();
        abkVar.a = owyVar;
        return true;
    }
}
