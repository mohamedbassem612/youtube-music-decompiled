package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dzu {
    public boolean a;
    public UUID b;
    public ees c;
    public final Set d;
    private final Class e;

    public dzu(Class cls) {
        this.e = cls;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = this.b.toString();
        string.getClass();
        String name = cls.getName();
        name.getClass();
        this.c = new ees(string, (dzr) null, name, (String) null, (dyp) null, (dyp) null, 0L, 0L, 0L, (dyn) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(atqq.u(1));
        atqq.bb(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public abstract ayq a();

    public final void b(String str) {
        str.getClass();
        this.d.add(str);
    }

    public final void c(String str) {
        str.getClass();
        this.c.x = str;
    }

    public final void d(dyn dynVar) {
        dynVar.getClass();
        this.c.l = dynVar;
    }

    public final void e(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.i = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.i) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void f(dyp dypVar) {
        dypVar.getClass();
        this.c.g = dypVar;
    }

    public final ayq g() {
        ayq ayqVarA = a();
        dyn dynVar = this.c.l;
        boolean z = dynVar.b() || dynVar.e || dynVar.c || dynVar.d;
        ees eesVar = this.c;
        if (eesVar.r) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (eesVar.i > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = eesVar.x;
        if (str == null) {
            List listF = awrc.F(eesVar.e, new String[]{"."});
            String strX = listF.size() == 1 ? (String) listF.get(0) : (String) atqq.ab(listF);
            if (strX.length() > 127) {
                strX = awrc.x(strX, 127);
            }
            eesVar.x = strX;
        } else if (str.length() > 127) {
            eesVar.x = awrc.x(str, 127);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        ees eesVar2 = this.c;
        eesVar2.getClass();
        this.c = new ees(string, eesVar2.d, eesVar2.e, eesVar2.f, new dyp(eesVar2.g), new dyp(eesVar2.h), eesVar2.i, eesVar2.j, eesVar2.k, new dyn(eesVar2.l), eesVar2.m, eesVar2.A, eesVar2.n, eesVar2.o, eesVar2.p, eesVar2.q, eesVar2.r, eesVar2.z, eesVar2.s, eesVar2.u, eesVar2.v, eesVar2.w, eesVar2.x, eesVar2.y, 524288);
        return ayqVarA;
    }
}
