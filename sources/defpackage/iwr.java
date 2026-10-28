package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iwr extends qa {
    public final List a;
    final /* synthetic */ iws b;
    private final nh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwr(iws iwsVar, RecyclerView recyclerView) {
        super((byte[]) null);
        this.b = iwsVar;
        this.a = new ArrayList();
        nh nhVar = recyclerView.m;
        nhVar.getClass();
        this.c = nhVar;
        nhVar.x(this);
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o() {
        List list = this.a;
        list.clear();
        nh nhVar = this.c;
        int iA = nhVar.a();
        int i = 0;
        while (true) {
            iws iwsVar = this.b;
            if (i >= iA) {
                iwsVar.a();
                return;
            }
            if (iwsVar.af.a(((admc) nhVar).getItem(i))) {
                list.add(Integer.valueOf(i));
            }
            i++;
        }
    }

    @Override // defpackage.qa
    public final void A(int i, int i2) {
        o();
    }

    @Override // defpackage.qa
    public final void fQ() {
        o();
    }

    @Override // defpackage.qa
    public final void fR(int i, int i2, Object obj) {
        o();
    }

    @Override // defpackage.qa
    public final void fS(int i, int i2) {
        o();
    }

    @Override // defpackage.qa
    public final void fT(int i, int i2) {
        o();
    }

    @Override // defpackage.qa
    public final void fU(int i, int i2) {
        o();
    }

    public final int m() {
        List list = this.a;
        if (list.isEmpty()) {
            return -1;
        }
        return ((Integer) list.get(0)).intValue();
    }
}
