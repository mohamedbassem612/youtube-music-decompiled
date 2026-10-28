package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mne extends pt {
    public final List a;
    private final nsl b;
    private final nro c;
    private final nry d;
    private final avmb e;
    private int f;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Illegal instructions before constructor call */
    public mne(nsl nslVar, nro nroVar, myz myzVar, nry nryVar, avmb avmbVar) {
        int i;
        if (myzVar.t()) {
            i = 15;
            if (!myzVar.i().e(nbv.V) && !myzVar.i().e(nbr.U)) {
                if (myzVar.C() == 2) {
                    i = 12;
                } else {
                    i = 3;
                }
            }
        } else if (myzVar.C() == 2) {
            i = 12;
        } else {
            i = 3;
        }
        super(i);
        this.f = -1;
        this.b = nslVar;
        this.c = nroVar;
        this.d = nryVar;
        this.e = avmbVar;
        this.a = new ArrayList();
    }

    @Override // defpackage.pp
    public final void d(RecyclerView recyclerView, oh ohVar) {
        super.d(recyclerView, ohVar);
        int iA = ohVar.a();
        int i = this.f;
        if (i != -1 && i != iA) {
            nro nroVar = this.c;
            nroVar.moveItem(i, iA);
            omj omjVar = nroVar.l;
            CommandOuterClass$Command commandOuterClass$CommandX = omjVar != null ? omjVar.x() : null;
            int i2 = this.f;
            if (commandOuterClass$CommandX != null) {
                nrt nrtVarD = nrv.d();
                aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
                aihl aihlVar = asmq.b;
                aihh aihhVar2 = (aihh) asmq.a.createBuilder();
                aihhVar2.copyOnWrite();
                asmq asmqVar = (asmq) aihhVar2.instance;
                asmqVar.c |= 2;
                asmqVar.e = i2;
                aihhVar2.copyOnWrite();
                asmq asmqVar2 = (asmq) aihhVar2.instance;
                asmqVar2.c |= 4;
                asmqVar2.f = iA;
                aihhVar.e(aihlVar, (asmq) aihhVar2.build());
                nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
                avmn avmnVarD = this.d.a(commandOuterClass$CommandX, nrtVarD.a()).v(this.e).D();
                avnq avnqVar = this.b.i;
                if (avnqVar != null) {
                    avnqVar.c(avmnVarD);
                }
            }
        }
        this.f = -1;
    }

    @Override // defpackage.pp
    public final boolean h(RecyclerView recyclerView, oh ohVar, oh ohVar2) {
        nh nhVar = recyclerView.m;
        if (!(nhVar instanceof fsv)) {
            return false;
        }
        int iA = ohVar.a();
        int iA2 = ohVar2.a();
        if (this.f == -1) {
            this.f = iA;
        }
        ((fsv) nhVar).a.H(iA, iA2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qcb) it.next()).g(iA, iA2);
        }
        return true;
    }

    @Override // defpackage.pp
    public final void l() {
    }

    @Override // defpackage.pp
    public final void o(oh ohVar) {
    }
}
