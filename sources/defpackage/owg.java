package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Build;
import android.util.Size;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import com.google.android.libraries.multiplatform.elements.runtime.RuntimeSharedBuffer;
import com.google.android.libraries.multiplatform.elements.shape.ShapePathJni;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class owg implements opm {
    private static float m(ElementsServices elementsServices) {
        if (elementsServices.c() == null) {
            return 1.0f;
        }
        return elementsServices.c().getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.opm
    public final int a() {
        return 4;
    }

    @Override // defpackage.opm
    public final mep b() {
        return atmu.d;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        owe oweVar = new owe(false);
        oweVar.a(m(nodeTreeProcessor.k()));
        return new owf(nodeTreeProcessor, oweVar);
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ PaintUnit d(met metVar, ElementsServices elementsServices) {
        owe oweVar = new owe(true);
        oweVar.a(m(elementsServices));
        oweVar.d((atmu) metVar);
        return oweVar;
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit e(met metVar, ElementsServices elementsServices, float f, float f2, Object obj) {
        return d(metVar, elementsServices);
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit f(ElementsServices elementsServices) {
        ntz.b(elementsServices);
        return null;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean g(met metVar, NodeViewInterface nodeViewInterface) {
        ((owe) ((ouu) nodeViewInterface).a).d((atmu) metVar);
        return true;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        atmu atmuVar = (atmu) metVar;
        if (!(paintUnit instanceof owe)) {
            return true;
        }
        owe oweVar = (owe) paintUnit;
        if (obj instanceof owe) {
            oweVar.h((owe) obj);
            return true;
        }
        oweVar.d(atmuVar);
        return true;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        ouu ouuVar = (ouu) nodeViewInterface;
        if (!(obj instanceof owe)) {
            return true;
        }
        ((owe) ouuVar.a).h((owe) obj);
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

    /* JADX WARN: Code duplicated, block: B:78:0x0265  */
    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5) {
        long jC;
        int iJniGetNodePathDataSize;
        long jJniGetNodePathDataPtr;
        boolean z2;
        int iPeekInt;
        char cPeekInt;
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        atmu atmuVar = (atmu) metVar;
        owe oweVar = new owe(i5 == 3);
        oweVar.a(m(elementsServices));
        Object objIo = elementsServices.L().io();
        if (objIo instanceof ElementsRuntimeImpl) {
            RuntimeSharedBuffer runtimeSharedBuffer = ((ElementsRuntimeImpl) objIo).j;
            jC = RuntimeSharedBuffer.c();
        } else {
            jC = 0;
        }
        if (jC != 0) {
            jJniGetNodePathDataPtr = ShapePathJni.jniGetNodePathDataPtr(jC);
            iJniGetNodePathDataSize = ShapePathJni.jniGetNodePathDataSize(jC);
        } else {
            iJniGetNodePathDataSize = 0;
            jJniGetNodePathDataPtr = 0;
        }
        if (jJniGetNodePathDataPtr == 0 || iJniGetNodePathDataSize <= 0) {
            z2 = true;
            oweVar.d(atmuVar);
        } else {
            Path path = oweVar.a;
            path.rewind();
            if (jJniGetNodePathDataPtr == 0 || iJniGetNodePathDataSize < 16 || (cPeekInt = (char) (iPeekInt = Memory.peekInt(jJniGetNodePathDataPtr, false))) <= 0 || cPeekInt > 242) {
                z2 = true;
            } else {
                int i6 = iPeekInt >>> 16;
                int iPeekInt2 = Memory.peekInt(jJniGetNodePathDataPtr + 4, false);
                int iPeekInt3 = Memory.peekInt(jJniGetNodePathDataPtr + 8, false);
                int iPeekInt4 = Memory.peekInt(jJniGetNodePathDataPtr + 12, false);
                if (i6 <= 0 || iPeekInt2 < 0 || iPeekInt3 < 0 || iPeekInt4 < i6 + 16) {
                    z2 = true;
                } else {
                    long j = iPeekInt2;
                    byte b = 3;
                    long j2 = iPeekInt4;
                    if (j2 + (((j << 1) + ((long) iPeekInt3)) << 2) <= iJniGetNodePathDataSize) {
                        long j3 = j2 + jJniGetNodePathDataPtr;
                        long j4 = jJniGetNodePathDataPtr + 16;
                        float fIntBitsToFloat = 0.0f;
                        int i7 = iPeekInt3;
                        float fIntBitsToFloat2 = 0.0f;
                        long j5 = (j << 3) + j3;
                        int i8 = 0;
                        long j6 = j3;
                        float f = 0.0f;
                        float fIntBitsToFloat3 = 0.0f;
                        while (true) {
                            if (i8 < i6) {
                                int i9 = i6;
                                float f2 = fIntBitsToFloat;
                                byte bPeekByte = Memory.peekByte(((long) i8) + j4);
                                if (bPeekByte != 0) {
                                    if (bPeekByte == z4) {
                                        z2 = z4;
                                        z3 = false;
                                        if (iPeekInt2 <= 0) {
                                            path.rewind();
                                            z5 = z3;
                                        } else {
                                            fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(j6, false));
                                            float fIntBitsToFloat4 = Float.intBitsToFloat(Memory.peekInt(j6 + 4, false));
                                            path.lineTo(fIntBitsToFloat3, fIntBitsToFloat4);
                                            iPeekInt2--;
                                            j6 += 8;
                                            fIntBitsToFloat2 = fIntBitsToFloat4;
                                        }
                                    } else if (bPeekByte != 2) {
                                        byte b2 = b;
                                        if (bPeekByte != b2) {
                                            if (bPeekByte != 4) {
                                                if (bPeekByte != 5) {
                                                    path.rewind();
                                                } else {
                                                    path.close();
                                                    z2 = z4;
                                                    i8 = i8;
                                                    fIntBitsToFloat3 = f;
                                                    j4 = j4;
                                                    fIntBitsToFloat = f2;
                                                    fIntBitsToFloat2 = fIntBitsToFloat;
                                                }
                                            } else if (iPeekInt2 < b2) {
                                                path.rewind();
                                            } else {
                                                z2 = z4;
                                                float fIntBitsToFloat5 = Float.intBitsToFloat(Memory.peekInt(j6, false));
                                                float fIntBitsToFloat6 = Float.intBitsToFloat(Memory.peekInt(j6 + 4, false));
                                                float fIntBitsToFloat7 = Float.intBitsToFloat(Memory.peekInt(j6 + 8, false));
                                                float fIntBitsToFloat8 = Float.intBitsToFloat(Memory.peekInt(j6 + 12, false));
                                                float fIntBitsToFloat9 = Float.intBitsToFloat(Memory.peekInt(j6 + 16, false));
                                                float fIntBitsToFloat10 = Float.intBitsToFloat(Memory.peekInt(20 + j6, false));
                                                path.cubicTo(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, fIntBitsToFloat9, fIntBitsToFloat10);
                                                iPeekInt2 -= 3;
                                                j6 = 24 + j6;
                                                fIntBitsToFloat3 = fIntBitsToFloat9;
                                                fIntBitsToFloat2 = fIntBitsToFloat10;
                                            }
                                            z2 = z4;
                                            z5 = false;
                                        } else {
                                            z2 = z4;
                                            i8 = i8;
                                            float f3 = f;
                                            j4 = j4;
                                            if (iPeekInt2 < 2 || i7 <= 0) {
                                                path.rewind();
                                                z5 = false;
                                            } else {
                                                long j7 = j6 + 16;
                                                long j8 = j6 + 12;
                                                long j9 = j6 + 8;
                                                long j10 = j6 + 4;
                                                float fIntBitsToFloat11 = Float.intBitsToFloat(Memory.peekInt(j6, false));
                                                float fIntBitsToFloat12 = Float.intBitsToFloat(Memory.peekInt(j10, false));
                                                float fIntBitsToFloat13 = Float.intBitsToFloat(Memory.peekInt(j9, false));
                                                float fIntBitsToFloat14 = Float.intBitsToFloat(Memory.peekInt(j8, false));
                                                iPeekInt2 -= 2;
                                                float fIntBitsToFloat15 = Float.intBitsToFloat(Memory.peekInt(j5, false));
                                                j5 += 4;
                                                int i10 = i7 - 1;
                                                if (Build.VERSION.SDK_INT >= 34) {
                                                    path.conicTo(fIntBitsToFloat11, fIntBitsToFloat12, fIntBitsToFloat13, fIntBitsToFloat14, fIntBitsToFloat15);
                                                } else {
                                                    nur.a(path, fIntBitsToFloat3, fIntBitsToFloat2, fIntBitsToFloat11, fIntBitsToFloat12, fIntBitsToFloat13, fIntBitsToFloat14, fIntBitsToFloat15, 2);
                                                    fIntBitsToFloat13 = fIntBitsToFloat13;
                                                    fIntBitsToFloat14 = fIntBitsToFloat14;
                                                }
                                                i7 = i10;
                                                fIntBitsToFloat3 = fIntBitsToFloat13;
                                                fIntBitsToFloat2 = fIntBitsToFloat14;
                                                fIntBitsToFloat = f2;
                                                f = f3;
                                                j6 = j7;
                                            }
                                        }
                                        i8++;
                                        i6 = i9;
                                        z4 = z2;
                                        j4 = j4;
                                        b = 3;
                                    } else {
                                        z2 = z4;
                                        if (iPeekInt2 < 2) {
                                            path.rewind();
                                            z5 = false;
                                        } else {
                                            float fIntBitsToFloat16 = Float.intBitsToFloat(Memory.peekInt(j6, false));
                                            float fIntBitsToFloat17 = Float.intBitsToFloat(Memory.peekInt(j6 + 4, false));
                                            float fIntBitsToFloat18 = Float.intBitsToFloat(Memory.peekInt(j6 + 8, false));
                                            fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(j6 + 12, false));
                                            path.quadTo(fIntBitsToFloat16, fIntBitsToFloat17, fIntBitsToFloat18, fIntBitsToFloat2);
                                            iPeekInt2 -= 2;
                                            j6 += 16;
                                            fIntBitsToFloat3 = fIntBitsToFloat18;
                                        }
                                    }
                                    fIntBitsToFloat = f2;
                                    f = f;
                                    i8++;
                                    i6 = i9;
                                    z4 = z2;
                                    j4 = j4;
                                    b = 3;
                                } else {
                                    z2 = z4;
                                    i8 = i8;
                                    j4 = j4;
                                    z3 = false;
                                    if (iPeekInt2 <= 0) {
                                        path.rewind();
                                        z5 = z3;
                                    } else {
                                        fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(j6, false));
                                        fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j6 + 4, false));
                                        path.moveTo(fIntBitsToFloat3, fIntBitsToFloat);
                                        iPeekInt2--;
                                        j6 += 8;
                                        fIntBitsToFloat2 = fIntBitsToFloat;
                                        f = fIntBitsToFloat3;
                                        i8++;
                                        i6 = i9;
                                        z4 = z2;
                                        j4 = j4;
                                        b = 3;
                                    }
                                }
                            } else {
                                z2 = z4;
                                z5 = z2;
                            }
                        }
                    } else {
                        z2 = z4;
                        z5 = false;
                    }
                }
            }
            oweVar.e = z5;
            if (z5) {
                float f4 = oweVar.d;
                if (f4 != 1.0f) {
                    Matrix matrix = oweVar.b;
                    matrix.setScale(f4, f4);
                    path.transform(matrix);
                }
            }
            oweVar.s();
        }
        oweVar.t(i, i2, i3, i4);
        oweVar.e(z);
        oweVar.B(mewVar);
        abkVar.a = oweVar;
        return z2;
    }
}
