package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adlg extends adkt {
    private final SparseArray c;

    /* JADX WARN: Illegal instructions before constructor call */
    public adlg() {
        agkj agkjVar = agpn.b;
        super(agkjVar, agkjVar);
        this.c = new SparseArray(16);
    }

    private final Queue f(int i) {
        SparseArray sparseArray = this.c;
        Queue queue = (Queue) sparseArray.get(i);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        sparseArray.put(i, linkedList);
        return linkedList;
    }

    @Override // defpackage.admh
    public final void e(View view) {
        aeod.d(view);
        int iA = adul.a(view);
        adma admaVarD = adul.d(view);
        if (iA == -1 || admaVarD == null) {
            return;
        }
        adul.h(admaVarD, this);
        f(iA).offer(admaVarD);
    }

    @Override // defpackage.adkt
    protected final adma g(int i) {
        return (adma) f(i).poll();
    }
}
