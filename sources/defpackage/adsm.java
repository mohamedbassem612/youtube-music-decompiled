package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adsm implements avni {
    public final /* synthetic */ adsr a;

    public /* synthetic */ adsm(adsr adsrVar) {
        this.a = adsrVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x016d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0180  */
    /* JADX WARN: Code duplicated, block: B:53:0x0184  */
    @Override // defpackage.avni
    public final void a(Object obj) {
        adus adusVar;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        FlowLayoutManager flowLayoutManager;
        adus adusVar2;
        boolean z;
        aecc aeccVarC;
        int iB;
        moi moiVar;
        aeay aeayVar;
        int iA5;
        int iA6;
        adsr adsrVar = this.a;
        vxz vxzVar = adsrVar.aa;
        aeck aeckVar = (aeck) obj;
        boolean z2 = false;
        if (vxzVar != null && vxzVar.l(80, 45806925L, false) && Objects.equals(adsrVar.X, aeckVar)) {
            return;
        }
        adsrVar.X = aeckVar;
        View view = adsrVar.l;
        if (view instanceof RecyclerView) {
            aeck aeckVar2 = adsrVar.X;
            RecyclerView recyclerView = (RecyclerView) view;
            np npVar = recyclerView.n;
            if (npVar instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) npVar;
                if (aeckVar2 != null) {
                    gridLayoutManager.b(Math.max(1, aeckVar2.b()));
                    aecc aeccVarC2 = aeckVar2.c();
                    DisplayMetrics displayMetrics = recyclerView.getContext().getResources().getDisplayMetrics();
                    if (vxzVar == null || !vxzVar.l(53, 45773172L, false)) {
                        iA5 = aeccVarC2.f;
                        iA6 = aeccVarC2.e;
                        iA2 = aeccVarC2.c;
                        iA3 = aeccVarC2.a;
                        iA4 = aeccVarC2.d;
                        iA = aeccVarC2.b;
                    } else {
                        iA5 = (int) twm.a(displayMetrics, aeccVarC2.l);
                        iA6 = (int) twm.a(displayMetrics, aeccVarC2.k);
                        iA2 = (int) twm.a(displayMetrics, aeccVarC2.i);
                        iA3 = (int) twm.a(displayMetrics, aeccVarC2.g);
                        iA4 = (int) twm.a(displayMetrics, aeccVarC2.j);
                        iA = (int) twm.a(displayMetrics, aeccVarC2.h);
                    }
                    adus adusVar3 = adsrVar.O;
                    if (adusVar3 == null) {
                        adsrVar.O = new adus(iA5, iA6);
                        recyclerView.aJ(adsrVar.O);
                    } else {
                        adusVar3.a = iA5;
                        adusVar3.b = iA6;
                        recyclerView.P();
                    }
                } else if (npVar instanceof FlowLayoutManager) {
                    flowLayoutManager = (FlowLayoutManager) npVar;
                    if (aeckVar2 != null) {
                        adusVar2 = adsrVar.O;
                        if (adusVar2 != null) {
                            recyclerView.aH(adusVar2);
                            adsrVar.O = null;
                        }
                        z = adsrVar.D;
                        aeccVarC = aeckVar2.c();
                        if (z) {
                            aeayVar = new aeay(aeckVar2.b(), aeccVarC.k, aeccVarC.l, aeccVarC.i, aeccVarC.j, aeccVarC.g, aeccVarC.h, adsrVar.A.b);
                            if (!adsrVar.A.equals(aeayVar)) {
                                adsrVar.A = aeayVar;
                                taq.d();
                                flowLayoutManager.requestLayout();
                            }
                        } else {
                            DisplayMetrics displayMetrics2 = recyclerView.getContext().getResources().getDisplayMetrics();
                            iB = aeckVar2.b();
                            if (flowLayoutManager.H != iB) {
                                flowLayoutManager.H = iB;
                                moiVar = flowLayoutManager.F;
                                if (moiVar.c != iB) {
                                    moiVar.c = iB;
                                    moiVar.j();
                                }
                                flowLayoutManager.requestLayout();
                            }
                            if (flowLayoutManager.I) {
                                ahno.O(flowLayoutManager.F.d);
                            }
                            if (vxzVar == null && vxzVar.l(53, 45773172L, false)) {
                                flowLayoutManager.m((int) twm.a(displayMetrics2, aeccVarC.l));
                                flowLayoutManager.n((int) twm.a(displayMetrics2, aeccVarC.k));
                                iA2 = (int) twm.a(displayMetrics2, aeccVarC.i);
                                iA3 = (int) twm.a(displayMetrics2, aeccVarC.g);
                                iA4 = (int) twm.a(displayMetrics2, aeccVarC.j);
                                iA = (int) twm.a(displayMetrics2, aeccVarC.h);
                            } else {
                                flowLayoutManager.m(aeccVarC.f);
                                flowLayoutManager.n(aeccVarC.e);
                                iA2 = aeccVarC.c;
                                iA3 = aeccVarC.a;
                                iA4 = aeccVarC.d;
                                iA = aeccVarC.b;
                            }
                        }
                    } else {
                        adusVar = adsrVar.O;
                        if (adusVar != null) {
                            recyclerView.aH(adusVar);
                            adsrVar.O = null;
                        }
                    }
                    iA = 0;
                    iA2 = 0;
                    iA3 = 0;
                    iA4 = 0;
                } else {
                    adusVar = adsrVar.O;
                    if (adusVar != null) {
                        recyclerView.aH(adusVar);
                        adsrVar.O = null;
                    }
                    iA = 0;
                    iA2 = 0;
                    iA3 = 0;
                    iA4 = 0;
                }
            } else if (npVar instanceof FlowLayoutManager) {
                flowLayoutManager = (FlowLayoutManager) npVar;
                if (aeckVar2 != null) {
                    adusVar2 = adsrVar.O;
                    if (adusVar2 != null) {
                        recyclerView.aH(adusVar2);
                        adsrVar.O = null;
                    }
                    z = adsrVar.D;
                    aeccVarC = aeckVar2.c();
                    if (z) {
                        aeayVar = new aeay(aeckVar2.b(), aeccVarC.k, aeccVarC.l, aeccVarC.i, aeccVarC.j, aeccVarC.g, aeccVarC.h, adsrVar.A.b);
                        if (!adsrVar.A.equals(aeayVar)) {
                            adsrVar.A = aeayVar;
                            taq.d();
                            flowLayoutManager.requestLayout();
                        }
                    } else {
                        DisplayMetrics displayMetrics3 = recyclerView.getContext().getResources().getDisplayMetrics();
                        iB = aeckVar2.b();
                        if (flowLayoutManager.H != iB) {
                            flowLayoutManager.H = iB;
                            moiVar = flowLayoutManager.F;
                            if (moiVar.c != iB) {
                                moiVar.c = iB;
                                moiVar.j();
                            }
                            flowLayoutManager.requestLayout();
                        }
                        if (flowLayoutManager.I) {
                            ahno.O(flowLayoutManager.F.d);
                        }
                        if (vxzVar == null) {
                            flowLayoutManager.m(aeccVarC.f);
                            flowLayoutManager.n(aeccVarC.e);
                            iA2 = aeccVarC.c;
                            iA3 = aeccVarC.a;
                            iA4 = aeccVarC.d;
                            iA = aeccVarC.b;
                        } else {
                            flowLayoutManager.m(aeccVarC.f);
                            flowLayoutManager.n(aeccVarC.e);
                            iA2 = aeccVarC.c;
                            iA3 = aeccVarC.a;
                            iA4 = aeccVarC.d;
                            iA = aeccVarC.b;
                        }
                    }
                } else {
                    adusVar = adsrVar.O;
                    if (adusVar != null) {
                        recyclerView.aH(adusVar);
                        adsrVar.O = null;
                    }
                }
                iA = 0;
                iA2 = 0;
                iA3 = 0;
                iA4 = 0;
            } else {
                adusVar = adsrVar.O;
                if (adusVar != null) {
                    recyclerView.aH(adusVar);
                    adsrVar.O = null;
                }
                iA = 0;
                iA2 = 0;
                iA3 = 0;
                iA4 = 0;
            }
            Rect rect = adsrVar.Y;
            int i = iA3 + rect.top;
            int i2 = iA + rect.bottom;
            if (i == 0) {
                if (i2 == 0) {
                    i2 = 0;
                    i = 0;
                    z2 = true;
                } else {
                    i = 0;
                }
            }
            recyclerView.setClipToPadding(z2);
            recyclerView.setPadding(iA2, i, iA4, i2);
        }
        adsrVar.ad();
    }
}
