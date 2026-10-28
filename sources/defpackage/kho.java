package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kho implements khs {
    private final /* synthetic */ int $cid;
    final /* synthetic */ khs a;
    final /* synthetic */ khq b;

    public kho(khq khqVar, khs khsVar, int i) {
        this.$cid = i;
        this.a = khsVar;
        this.b = khqVar;
    }

    @Override // defpackage.khs
    public final void a(String str, long j, int i, Object obj, long j2, long j3) {
        if (this.$cid != 0) {
            this.b.g = null;
            khs khsVar = this.a;
            if (khsVar != null) {
                khsVar.a(str, j, i, obj, j2, j3);
                return;
            }
            return;
        }
        khs khsVar2 = this.a;
        if (khsVar2 != null) {
            if (i == 2001) {
                khq khqVar = this.b;
                khqVar.c.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(khqVar.h));
                Iterator it = ((kfm) khqVar.B.a).e.iterator();
                while (it.hasNext()) {
                    ((ket) it.next()).i();
                }
                i = 2001;
            }
            khsVar2.a(str, j, i, obj, j2, j3);
        }
    }

    @Override // defpackage.khs
    public final void b(String str, long j, long j2, long j3) {
        int i = this.$cid;
        khs khsVar = this.a;
        if (i != 0) {
            if (khsVar != null) {
                khsVar.b(str, j, j2, j3);
            }
        } else if (khsVar != null) {
            khsVar.b(str, j, j2, j3);
        }
    }
}
