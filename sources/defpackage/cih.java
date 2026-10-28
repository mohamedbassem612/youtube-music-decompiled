package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cih implements Handler.Callback {
    public final cra a;
    public cio e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final qcb j;
    public final TreeMap d = new TreeMap();
    public final Handler c = bwp.H(this);
    public final cxu b = new cxu();

    public cih(cio cioVar, qcb qcbVar, cra craVar) {
        this.e = cioVar;
        this.j = qcbVar;
        this.a = craVar;
    }

    public final void a() {
        if (this.g) {
            this.h = true;
            this.g = false;
            chz chzVar = (chz) this.j.a;
            chzVar.m.removeCallbacks(chzVar.d);
            chzVar.o();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        czo czoVar = (czo) message.obj;
        long j = czoVar.a;
        long j2 = czoVar.b;
        TreeMap treeMap = this.d;
        Long lValueOf = Long.valueOf(j2);
        Long l = (Long) treeMap.get(lValueOf);
        if (l == null) {
            treeMap.put(lValueOf, Long.valueOf(j));
            return true;
        }
        if (l.longValue() <= j) {
            return true;
        }
        treeMap.put(lValueOf, Long.valueOf(j));
        return true;
    }
}
