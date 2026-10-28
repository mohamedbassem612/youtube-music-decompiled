package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class orl extends pt {
    public final List a;
    private final orf b;
    private final orq c;
    private int d;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Illegal instructions before constructor call */
    public orl(orf orfVar, atbv atbvVar, orq orqVar) {
        int i;
        if (atbvVar.aS()) {
            i = 15;
            if (!atbvVar.aY().e(athk.d) && !atbvVar.aY().e(atha.d)) {
                if (atbvVar.aW() == 2) {
                    i = 12;
                } else {
                    i = 3;
                }
            }
        } else if (atbvVar.aW() == 2) {
            i = 12;
        } else {
            i = 3;
        }
        super(i);
        this.d = -1;
        this.b = orfVar;
        this.c = orqVar;
        this.a = new ArrayList();
    }

    @Override // defpackage.pp
    public final void d(RecyclerView recyclerView, oh ohVar) {
        super.d(recyclerView, ohVar);
        int iA = ohVar.a();
        int i = this.d;
        if (i != -1 && i != iA) {
            orf orfVar = this.b;
            orfVar.moveItem(i, iA);
            mew mewVar = orfVar.e;
            if (mewVar == null) {
                return;
            }
            orr orrVarB = ors.b();
            orrVarB.e(recyclerView);
            int i2 = this.d;
            atoc atocVar = new atoc((byte[]) null);
            mep mepVar = atfh.d;
            atfd atfdVar = new atfd();
            atfdVar.aR();
            atfdVar.bO(8, 2);
            atfdVar.bQ(12, i2);
            atfdVar.aR();
            atfdVar.bO(8, 4);
            atfdVar.bQ(16, iA);
            if (atfdVar.d) {
                atfdVar.bG();
            } else {
                atfdVar.d = true;
            }
            atocVar.aS(mepVar, new atfh(atfdVar.b));
            orrVarB.g = atocVar.aT();
            this.c.d(mewVar, orrVarB.a());
        }
        this.d = -1;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, oui] */
    @Override // defpackage.pp
    public final boolean h(RecyclerView recyclerView, oh ohVar, oh ohVar2) {
        nh nhVar = recyclerView.m;
        if (!(nhVar instanceof oqj)) {
            return false;
        }
        oqj oqjVar = (oqj) nhVar;
        int iA = ohVar.a();
        int iA2 = ohVar2.a();
        if (this.d == -1) {
            this.d = iA;
        }
        if (iA >= 0) {
            List list = oqjVar.a;
            if (iA < list.size() && iA2 >= 0 && iA2 < list.size()) {
                list.add(iA2, (zj) list.remove(iA));
                agke agkeVar = oqjVar.i;
                if (agkeVar != null) {
                    ArrayList arrayList = new ArrayList(agkeVar);
                    arrayList.add(iA2, (String) arrayList.remove(iA));
                    oqjVar.i = agke.n(arrayList);
                }
                oqjVar.jY(iA, iA2);
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((qcb) it.next()).g(iA, iA2);
                }
                return true;
            }
        }
        oqjVar.e.io().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Invalid position for moveItem", null);
        return false;
    }

    @Override // defpackage.pp
    public final void l() {
    }

    @Override // defpackage.pp
    public final void o(oh ohVar) {
    }
}
