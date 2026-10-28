package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afsl implements afsc {
    static final aflk a = new aflk(1, TimeUnit.DAYS);
    public static final /* synthetic */ int g = 0;
    public final afse b;
    public final Executor c;
    public final Boolean d;
    public final afsq e;
    public final ahrn f;
    private final Boolean h = Boolean.FALSE;

    public afsl(ahrn ahrnVar, afse afseVar, Executor executor, afsq afsqVar, Boolean bool) {
        this.f = ahrnVar;
        this.b = afseVar;
        this.c = executor;
        this.e = afsqVar;
        this.d = bool;
    }

    public static dyn a(Set set) {
        foc focVar = new foc();
        focVar.a = set.contains(afrd.a);
        if (set.contains(afrd.b)) {
            focVar.f(3);
        } else if (set.contains(afrd.c)) {
            focVar.f(2);
        }
        return focVar.d();
    }

    static String c(dyn dynVar, agev agevVar) {
        StringBuilder sb = new StringBuilder("SyncPeriodicTask");
        if (dynVar.c) {
            sb.append("_charging");
        }
        int i = dynVar.j;
        if (i == 3) {
            sb.append("_unmetered");
        } else if (i == 2) {
            sb.append("_connected");
        }
        return sb.toString();
    }

    public final agev b() {
        this.h.booleanValue();
        return agdf.a;
    }
}
