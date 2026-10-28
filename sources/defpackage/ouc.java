package defpackage;

import android.content.Context;
import android.util.Size;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import j$.util.Objects;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ouc implements opm {
    private final /* synthetic */ int $cid;
    private final Context a;
    private final Object b;
    private final Object c;

    public ouc(Context context, oui ouiVar, awmd awmdVar, int i) {
        this.$cid = i;
        this.a = context;
        this.c = ouiVar;
        this.b = awmdVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oui] */
    private final opy m(ElementsServices elementsServices, boolean z) {
        return new opy(this.c, z, true, elementsServices, (owu) this.b.io());
    }

    @Override // defpackage.opm
    public final int a() {
        return this.$cid != 0 ? 68 : 4;
    }

    @Override // defpackage.opm
    public final mep b() {
        return this.$cid != 0 ? aswo.d : atjc.d;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oui] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, oui] */
    @Override // defpackage.opm
    public final /* synthetic */ NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        if (this.$cid == 0) {
            return new ouu(nodeTreeProcessor, new otu(this.b, (kjc) this.c, false, false, nodeTreeProcessor.k()));
        }
        return new ouu(nodeTreeProcessor, new opy(this.c, false, false, nodeTreeProcessor.k(), (owu) this.b.io()));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, oui] */
    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit d(met metVar, ElementsServices elementsServices) {
        if (this.$cid != 0) {
            opy opyVarM = m(elementsServices, true);
            opyVarM.d((aswo) metVar, elementsServices.c());
            return opyVarM;
        }
        otu otuVar = new otu(this.b, (kjc) this.c, true, true, elementsServices);
        otuVar.h(this.a, (atjc) metVar, true);
        return otuVar;
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit e(met metVar, ElementsServices elementsServices, float f, float f2, Object obj) {
        return this.$cid != 0 ? d(metVar, elementsServices) : d(metVar, elementsServices);
    }

    @Override // defpackage.opm
    public final /* synthetic */ PaintUnit f(ElementsServices elementsServices) {
        if (this.$cid != 0) {
            ntz.b(elementsServices);
        } else {
            ntz.b(elementsServices);
        }
        return null;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean g(met metVar, NodeViewInterface nodeViewInterface) {
        if (this.$cid != 0) {
            osk.a(aslh.LOG_TYPE_INTERNAL_ERROR, new UnsupportedOperationException("AnimatedVectorType update should never be called"), ((opy) ((ouu) nodeViewInterface).a).a);
            return false;
        }
        ((otu) ((ouu) nodeViewInterface).a).h(this.a, (atjc) metVar, true);
        return true;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        otu otuVar;
        if (this.$cid != 0) {
            aswo aswoVar = (aswo) metVar;
            if (paintUnit instanceof opy) {
                ((opy) paintUnit).d(aswoVar, this.a);
            }
        } else {
            Context context = this.a;
            atjc atjcVar = (atjc) metVar;
            ((otu) paintUnit).h(context, atjcVar, true);
            if (Memory.peekByte(FlagServices.b().c + 103) != 0 && (obj instanceof otu) && (otuVar = (otu) obj) != paintUnit && otuVar.q == null) {
                otuVar.close();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    otuVar.d(applicationContext, atjcVar);
                }
            }
        }
        return true;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        if (this.$cid != 0) {
            ouu ouuVar = (ouu) nodeViewInterface;
            if (obj instanceof opy) {
                opy opyVar = (opy) obj;
                PaintUnit paintUnit = ouuVar.a;
                if (paintUnit == null || !Objects.equals(paintUnit, opyVar)) {
                    ouuVar.D(opyVar);
                }
            }
        } else {
            ouu ouuVar2 = (ouu) nodeViewInterface;
            if (obj instanceof otu) {
                otu otuVar = (otu) obj;
                atjc atjcVar = otuVar.g;
                if (atjcVar == null) {
                    atjcVar = otuVar.e;
                }
                otu otuVar2 = (otu) ouuVar2.a;
                if (otuVar2 == null || otuVar2.n()) {
                    if (Memory.peekByte(FlagServices.b().c + 103) == 0 || !otuVar.n()) {
                        ouuVar2.D(otuVar);
                    } else if (otuVar2 == null) {
                        ouuVar2.D(otuVar);
                        if (atjcVar != null) {
                            otuVar.h(this.a, atjcVar, true);
                        }
                    } else if (atjcVar != null) {
                        otuVar2.h(this.a, atjcVar, true);
                    }
                } else if (atjcVar != null) {
                    otuVar2.h(this.a, atjcVar, true);
                    if (Memory.peekByte(FlagServices.b().c + 103) != 0 && otuVar != otuVar2 && otuVar.q == null) {
                        otuVar.close();
                    }
                } else if (Memory.peekByte(FlagServices.b().c + 103) == 0 || !otuVar.n()) {
                    ouuVar2.D(otuVar);
                }
            }
        }
        return true;
    }

    @Override // defpackage.opm
    public final /* synthetic */ Size j(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar) {
        if (this.$cid == 0) {
            return ntz.c();
        }
        aswo aswoVar = (aswo) metVar;
        aswt aswtVarJ = opy.j(aswoVar);
        float fIntBitsToFloat = 0.0f;
        if ((aswoVar.aR() || aswoVar.aS()) && (Memory.peekByte(aswtVarJ.c + 8) & 1) != 0) {
            fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(aswtVarJ.c + 12, false));
        }
        return nsz.a(i, i2, fIntBitsToFloat);
    }

    @Override // defpackage.opm
    public final /* synthetic */ Size k(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar, oon oonVar, Object obj, oph ophVar) {
        return this.$cid != 0 ? ntz.d() : ntz.d();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, oui] */
    @Override // defpackage.opm
    public final /* synthetic */ boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5) {
        if (this.$cid != 0) {
            Context context = this.a;
            opy opyVarM = m(elementsServices, i5 == 3);
            opyVarM.d((aswo) metVar, context);
            opyVarM.t(i, i2, i3, i4);
            abkVar.a = opyVarM;
        } else {
            atjc atjcVar = (atjc) metVar;
            otu otuVar = new otu(this.b, (kjc) this.c, i5 == 3, true, elementsServices);
            otuVar.t(i, i2, i3, i4);
            byte bPeekByte = Memory.peekByte(FlagServices.b().c + 49);
            Context context2 = this.a;
            if (bPeekByte != 0) {
                otuVar.d(context2, atjcVar);
            } else {
                otuVar.h(context2, atjcVar, true);
            }
            abkVar.a = otuVar;
        }
        return true;
    }

    public ouc(Context context, oui ouiVar, kjc kjcVar, int i) {
        this.$cid = i;
        this.a = context;
        this.b = ouiVar;
        this.c = kjcVar;
    }
}
