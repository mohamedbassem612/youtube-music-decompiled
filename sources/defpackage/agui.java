package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agui implements agtz {
    public final Level b;
    public final boolean c;
    public final Set d;
    public final agth e;
    private volatile aguj g;
    public final String a = "";
    public final int f = 2;

    public agui(int i, Level level, boolean z, Set set, agth agthVar) {
        this.b = level;
        this.c = z;
        this.d = set;
        this.e = agthVar;
    }

    @Override // defpackage.agtz
    public final agsw a(String str) {
        aguj agujVar;
        if (!this.c || !str.contains(".")) {
            return new aguk(str, 2, this.b, this.d, this.e);
        }
        aguj agujVar2 = this.g;
        if (agujVar2 != null) {
            return agujVar2;
        }
        synchronized (this) {
            agujVar = this.g;
            if (agujVar == null) {
                aguj agujVar3 = new aguj(null, 2, this.b, false, this.d, this.e);
                this.g = agujVar3;
                agujVar = agujVar3;
            }
        }
        return agujVar;
    }
}
