package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ark extends ard {
    public ArrayList aI = new ArrayList();

    @Override // defpackage.ard
    public final void S(aeiv aeivVar) {
        super.S(aeivVar);
        int size = this.aI.size();
        for (int i = 0; i < size; i++) {
            ((ard) this.aI.get(i)).S(aeivVar);
        }
    }

    public void T() {
        ArrayList arrayList = this.aI;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ard ardVar = (ard) this.aI.get(i);
                if (ardVar instanceof ark) {
                    ((ark) ardVar).T();
                }
            }
        }
    }

    public final void Y(ard ardVar) {
        this.aI.remove(ardVar);
        ardVar.s();
    }

    @Override // defpackage.ard
    public void s() {
        this.aI.clear();
        super.s();
    }
}
