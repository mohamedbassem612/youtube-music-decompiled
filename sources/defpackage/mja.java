package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mja {
    static final mma a;

    static {
        int i = nkl.k;
        nkj nkjVar = new nkj();
        atoc atocVar = new atoc(null, null, null);
        mep mepVar = njo.N;
        njo njoVar = njm.a;
        njoVar.getClass();
        if (atocVar.d) {
            atocVar.d = false;
            atocVar.bG();
        }
        atocVar.bM(mepVar, njoVar);
        if (atocVar.d) {
            atocVar.bG();
        } else {
            atocVar.d = true;
        }
        mew mewVar = new mew(atocVar.b, (short[]) null);
        if (mewVar != nkjVar.j) {
            nkjVar.j = mewVar;
            nkjVar.f = true;
        }
        if (nkjVar.d) {
            nkjVar.bG();
        } else {
            nkjVar.d = true;
        }
        nkl nklVar = new nkl(nkjVar.b);
        AtomicReference atomicReference = nkjVar.g;
        if (atomicReference.get() != null) {
            nklVar.g.set((ArrayList) atomicReference.get());
        }
        if (nkjVar.j != null) {
            nklVar.j = nkjVar.j;
            nklVar.f = nkjVar.f;
        }
        if (nkjVar.i != null) {
            nklVar.i = nkjVar.i;
        }
        nklVar.aR();
        a = new mma(nklVar, null, null);
    }
}
