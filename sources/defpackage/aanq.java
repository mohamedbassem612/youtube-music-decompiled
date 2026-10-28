package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aanq {
    public final String a;
    public final int b;
    public final aofh c;
    public final long d;
    public final AtomicInteger e;
    public final Set f;
    public final String g;
    public String h;
    public boolean i;
    public boolean j;
    private final String k;

    public aanq(aofk aofkVar) {
        this(wfs.h(aofkVar.b()), aofkVar.getActionProto(), wfs.b(aofkVar.getActionProto().d), aofkVar.getEnqueueTimeNs().longValue(), aofkVar.getRootActionId(), (aofkVar.c.b & 8) != 0 ? aofkVar.getParentActionId() : null);
        this.e.set(aofkVar.getRetryScheduleIndex().intValue());
        this.f.addAll(aofkVar.getChildActionIds());
        this.h = (aofkVar.c.b & 16) != 0 ? aofkVar.getPrereqActionId() : null;
        this.j = aofkVar.getHasChildActionFailed().booleanValue();
    }

    public final agev a() {
        return agev.h(this.k);
    }

    public final agev b() {
        return agev.h(this.h);
    }

    final agke c() {
        return agke.n(this.f);
    }

    public final String d() {
        return this.c.d;
    }

    final void e(String str) {
        this.f.remove(str);
    }

    final void f() {
        this.i = true;
    }

    public final boolean g() {
        return !this.f.isEmpty();
    }

    public final String toString() {
        ageu ageuVar = new ageu("OfflineAction");
        ageuVar.e("entityType", this.b);
        aofh aofhVar = this.c;
        ageuVar.b("entityKey", aofhVar.d);
        ageuVar.f("actionEnqueueTimeNs", this.d);
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        ageuVar.b("actionType", agvp.F(iBc));
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        ageuVar.e("actionPriority", aofgVar.d);
        return ageuVar.toString();
    }

    public aanq(String str, aofh aofhVar, int i, long j, String str2, String str3) {
        this.i = false;
        this.j = false;
        this.a = str;
        this.c = aofhVar;
        this.b = i;
        this.e = new AtomicInteger();
        this.d = j;
        this.f = new HashSet();
        this.g = str2;
        this.k = str3;
    }
}
