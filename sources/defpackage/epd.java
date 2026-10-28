package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class epd extends eow {
    @Override // defpackage.eow
    public final void a(epe epeVar, epe epeVar2) {
        epeVar.c = epeVar2;
    }

    @Override // defpackage.eow
    public final void b(epe epeVar, Thread thread) {
        epeVar.b = thread;
    }

    @Override // defpackage.eow
    public final boolean c(epf epfVar, epa epaVar, epa epaVar2) {
        synchronized (epfVar) {
            if (epfVar.d != epaVar) {
                return false;
            }
            epfVar.d = epaVar2;
            return true;
        }
    }

    @Override // defpackage.eow
    public final boolean d(epf epfVar, Object obj, Object obj2) {
        synchronized (epfVar) {
            if (epfVar.c != obj) {
                return false;
            }
            epfVar.c = obj2;
            return true;
        }
    }

    @Override // defpackage.eow
    public final boolean e(epf epfVar, epe epeVar, epe epeVar2) {
        synchronized (epfVar) {
            if (epfVar.e != epeVar) {
                return false;
            }
            epfVar.e = epeVar2;
            return true;
        }
    }
}
