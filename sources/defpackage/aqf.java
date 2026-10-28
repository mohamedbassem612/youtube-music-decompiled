package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aqf extends apy {
    @Override // defpackage.apy
    public final void a(aqg aqgVar, aqg aqgVar2) {
        aqgVar.next = aqgVar2;
    }

    @Override // defpackage.apy
    public final void b(aqg aqgVar, Thread thread) {
        aqgVar.thread = thread;
    }

    @Override // defpackage.apy
    public final boolean c(aqh aqhVar, aqc aqcVar, aqc aqcVar2) {
        synchronized (aqhVar) {
            if (aqhVar.listeners != aqcVar) {
                return false;
            }
            aqhVar.listeners = aqcVar2;
            return true;
        }
    }

    @Override // defpackage.apy
    public final boolean d(aqh aqhVar, Object obj, Object obj2) {
        synchronized (aqhVar) {
            if (aqhVar.value != obj) {
                return false;
            }
            aqhVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.apy
    public final boolean e(aqh aqhVar, aqg aqgVar, aqg aqgVar2) {
        synchronized (aqhVar) {
            if (aqhVar.waiters != aqgVar) {
                return false;
            }
            aqhVar.waiters = aqgVar2;
            return true;
        }
    }
}
