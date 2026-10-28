package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Size;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.uibuilder.DimensionUnitConverter;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqn implements opm {
    final /* synthetic */ Context a;
    final /* synthetic */ orb b;
    final /* synthetic */ syn c;

    public oqn(Context context, syn synVar, orb orbVar) {
        this.a = context;
        this.c = synVar;
        this.b = orbVar;
    }

    @Override // defpackage.opm
    public final int a() {
        return 36;
    }

    @Override // defpackage.opm
    public final mep b() {
        return atbv.d;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ NodeViewInterface c(NodeTreeProcessor nodeTreeProcessor) {
        aga agaVar = ElementsServices.a;
        RecyclerView recyclerView = Memory.peekByte(FlagServices.b().c + 42) != 0 ? new RecyclerView(nodeTreeProcessor.k().c()) : new RecyclerView(this.a);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setClipToPadding(false);
        recyclerView.setClipToOutline(true);
        recyclerView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        return new oqu(recyclerView, nodeTreeProcessor, this.c);
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
    public final /* bridge */ /* synthetic */ boolean g(met metVar, NodeViewInterface nodeViewInterface) {
        osk.a(aslh.LOG_TYPE_INTERNAL_ERROR, new UnsupportedOperationException("Update should never be called on CollectionType. A measure output is required."), ((oqu) nodeViewInterface).h().n());
        return false;
    }

    @Override // defpackage.opm
    public final /* synthetic */ boolean h(met metVar, PaintUnit paintUnit, Object obj) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    @Override // defpackage.opm
    public final /* synthetic */ boolean i(NodeViewInterface nodeViewInterface, Object obj) {
        int i;
        int i2;
        oqz oqzVar;
        oqu oquVar = (oqu) nodeViewInterface;
        if (obj instanceof oqr) {
            oqr oqrVar = (oqr) obj;
            atbv atbvVar = oqrVar.c;
            int i3 = oqu.t;
            oquVar.q = atbvVar;
            RecyclerView recyclerView = oquVar.a;
            recyclerView.setNestedScrollingEnabled(!(Memory.peekByte(atbvVar.c + 15) != 0));
            long j = atbvVar.c;
            boolean z = atbx.a;
            int iPeekInt = Memory.peekInt(j + (true != z ? 56L : 36L), false);
            if (iPeekInt == 0) {
                i = 1;
            } else if (iPeekInt == 1) {
                i = 2;
            } else if (iPeekInt != 2) {
                i = iPeekInt != 3 ? 0 : 4;
            } else {
                i = 3;
            }
            if (i == 0) {
                i = 1;
            }
            int i4 = i - 1;
            if (i4 != 1) {
                i2 = i4 != 2 ? 0 : 1;
            } else {
                i2 = 2;
            }
            recyclerView.setOverScrollMode(i2);
            if (atbvVar.j == null && (Memory.peekByte(atbvVar.c + 8) & 4) == 0) {
                recyclerView.setPadding(0, 0, 0, 0);
            } else {
                int[] iArr = new int[4];
                if (atbvVar.j == null && (Memory.peekByte(atbvVar.c + 8) & 4) != 0) {
                    atbvVar.j = new ateu(atbvVar.cp(true != z ? 32 : 56, atet.a));
                }
                DimensionUnitConverter.b(atbvVar.j == null ? ates.a : atbvVar.j, oquVar.h().a(), recyclerView.getLayoutDirection(), iArr);
                recyclerView.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            int i5 = oquVar.r;
            boolean z2 = i5 == 1;
            if (z2) {
                boolean z3 = z2;
                oqz oqzVar2 = oqrVar.b;
                np npVarB = oqzVar2.b(recyclerView.getContext(), recyclerView);
                oon oonVar = oqrVar.a;
                NodeTreeProcessor nodeTreeProcessorAq = oquVar.aq();
                oquVar.i = oqzVar2;
                oquVar.r = 2;
                oquVar.h().z().execute(new upa(nodeTreeProcessorAq, oquVar, oqzVar2, oonVar, npVarB, recyclerView, z3, oqrVar, 1));
            } else {
                oqz oqzVar3 = oqrVar.b;
                if (oquVar.g == null || (oqzVar = oquVar.i) == null || oqzVar.f() != oqzVar3.f()) {
                    boolean z4 = z2;
                    oqz oqzVar4 = oqrVar.b;
                    np npVarB2 = oqzVar4.b(recyclerView.getContext(), recyclerView);
                    oon oonVar2 = oqrVar.a;
                    NodeTreeProcessor nodeTreeProcessorAq2 = oquVar.aq();
                    oquVar.i = oqzVar4;
                    oquVar.r = 2;
                    oquVar.h().z().execute(new upa(nodeTreeProcessorAq2, oquVar, oqzVar4, oonVar2, npVarB2, recyclerView, z4, oqrVar, 1));
                } else if (i5 == 2) {
                    oquVar.i = oqzVar3;
                } else {
                    if (Memory.peekByte(FlagServices.b().c + 95) != 0) {
                        oquVar.i = oqzVar3;
                    }
                    orf orfVar = oquVar.n;
                    if (orfVar != null) {
                        agke agkeVarN = agke.n(orfVar.identifiers());
                        oquVar.g.E(oqzVar3, new oqt(oquVar.n, agkeVarN), agkeVarN);
                    } else {
                        oqj oqjVar = oquVar.g;
                        oon oonVar3 = oqrVar.a;
                        oon oonVar4 = oqjVar.k;
                        oqz oqzVar5 = oqjVar.j;
                        oqjVar.j = oqzVar3;
                        oqjVar.k = oonVar3;
                        if (oonVar4.a() == 0 || !oqzVar5.g(oqzVar3)) {
                            oqjVar.D();
                        } else {
                            hp hpVarA = hs.a(new oqf(oonVar4, oonVar3), true);
                            hpVarA.a(new oqg(oqjVar, oonVar3, hpVarA));
                        }
                    }
                    ovk ovkVar = oquVar.h;
                    if (ovkVar != null && !oquVar.f) {
                        ovkVar.t();
                    }
                    oquVar.K(atbvVar);
                    oquVar.ad(atbvVar);
                    oquVar.ac(atbvVar);
                    oquVar.J(atbvVar);
                }
            }
            oqz oqzVar6 = oqrVar.b;
            aga agaVar = ElementsServices.a;
            if (Memory.peekByte(FlagServices.b().c + 53) == 0 || !oqzVar6.f()) {
                mhe mheVar = oquVar.m;
                if (mheVar != null) {
                    recyclerView.Z(mheVar);
                    oquVar.m = null;
                }
            } else if (oquVar.m == null) {
                oquVar.m = new mhe(true, Memory.peekByte(FlagServices.b().c + 52) != 0);
                recyclerView.w(oquVar.m);
            }
            oquVar.setFocusable(true);
        }
        return true;
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ Size j(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar) {
        throw new UnsupportedOperationException("Not implemented - CollectionNodeView measurement requires a ContentSource.");
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, oov] */
    @Override // defpackage.opm
    public final /* synthetic */ Size k(met metVar, ElementsServices elementsServices, int i, int i2, boolean z, abk abkVar, oon oonVar, Object obj, oph ophVar) {
        int i3;
        Exception e;
        atbv atbvVar = (atbv) metVar;
        int iD = 0;
        if (oonVar == null) {
            return new Size(0, 0);
        }
        boolean z2 = atbvVar.aW() == 2;
        ?? Io = elementsServices.L().io();
        int iBc = atbvVar.bc() - 1;
        if (iBc != 1) {
            if (iBc == 2) {
                try {
                    NodeTreeProcessor nodeTreeProcessorB = ophVar != null ? Io.b(ophVar) : Io.a();
                    i3 = 0;
                    while (iD < oonVar.a()) {
                        try {
                            try {
                                Size sizeAf = oqu.af(nodeTreeProcessorB, oonVar.b(iD));
                                if (sizeAf != null) {
                                    int height = z2 ? sizeAf.getHeight() : sizeAf.getWidth();
                                    if (height > i3) {
                                        i3 = height;
                                    }
                                }
                                iD++;
                            } catch (Throwable th) {
                                try {
                                    nodeTreeProcessorB.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            Io.c().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to close NodeTreeProcessor", e);
                        }
                    }
                    nodeTreeProcessorB.close();
                } catch (Exception e3) {
                    i3 = 0;
                    e = e3;
                }
                iD = i3;
            } else if (iBc == 3) {
                iD = oqu.D(Io, ophVar, oonVar, z2);
            }
        } else if (obj instanceof oqq) {
            iD = ((oqq) obj).a;
        } else if (obj != null) {
            Io.c().a(aslh.LOG_TYPE_INTERNAL_ERROR, "Unexpected measureInput type: ".concat(String.valueOf(obj.getClass().getName())));
        } else if (Memory.peekByte(FlagServices.b().c + 92) != 0) {
            iD = oqu.D(Io, ophVar, oonVar, z2);
        }
        return z2 ? new Size(oqu.f(i), iD) : new Size(iD, oqu.f(i2));
    }

    @Override // defpackage.opm
    public final /* bridge */ /* synthetic */ boolean l(met metVar, ElementsServices elementsServices, oon oonVar, int i, int i2, int i3, int i4, boolean z, mew mewVar, abk abkVar, int i5) {
        atbv atbvVar = (atbv) metVar;
        if (oonVar == null) {
            osk.a(aslh.LOG_TYPE_INTERNAL_ERROR, new IllegalArgumentException("ContentSource should not be null"), elementsServices.n());
            return false;
        }
        abkVar.a = new oqr(oonVar, this.b.a(atbvVar, i3 - i, i4 - i2), atbvVar);
        return true;
    }
}
