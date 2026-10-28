package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class at extends ap {
    public final ArrayList al = new ArrayList();

    public void D() {
        q();
        ArrayList arrayList = this.al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ap apVar = (ap) arrayList.get(i);
                if (apVar instanceof at) {
                    ((at) apVar).D();
                }
            }
        }
    }

    public final void F(ap apVar) {
        this.al.remove(apVar);
        apVar.r = null;
    }

    @Override // defpackage.ap
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.ap
    public final void n(int i, int i2) {
        super.n(i, i2);
        ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ap) arrayList.get(i3)).n(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.ap
    public final void q() {
        super.q();
        ArrayList arrayList = this.al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ap apVar = (ap) arrayList.get(i);
                apVar.n(b(), c());
                if (!(apVar instanceof aq)) {
                    apVar.q();
                }
            }
        }
    }

    @Override // defpackage.ap
    public final void z(ahto ahtoVar) {
        super.z(ahtoVar);
        ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ap) arrayList.get(i)).z(ahtoVar);
        }
    }
}
