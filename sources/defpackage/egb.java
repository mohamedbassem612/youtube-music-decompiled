package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egb implements dyw {
    final eds a;
    final eet b;
    public final axfd c;

    static {
        dzf.a("WMFgUpdater");
    }

    public egb(WorkDatabase workDatabase, eds edsVar, axfd axfdVar) {
        this.a = edsVar;
        this.c = axfdVar;
        this.b = workDatabase.C();
    }
}
