package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urp {
    public final auhs a;
    private final String b;
    private final Duration c;
    private final String d;

    public urp(auhs auhsVar, String str, Duration duration, String str2) {
        str2.getClass();
        this.a = auhsVar;
        this.b = str;
        this.c = duration;
        this.d = str2;
    }

    public final auew a() {
        aihf aihfVarCreateBuilder = auew.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        auew auewVar = (auew) aihfVarCreateBuilder.instance;
        auewVar.c = this.a;
        auewVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        auew auewVar2 = (auew) aihfVarCreateBuilder.instance;
        auewVar2.b |= 2;
        auewVar2.d = this.b;
        Duration duration = this.c;
        if (duration != null) {
            aigu aiguVarU = aext.u(duration);
            aihfVarCreateBuilder.copyOnWrite();
            auew auewVar3 = (auew) aihfVarCreateBuilder.instance;
            auewVar3.e = aiguVarU;
            auewVar3.b |= 4;
        }
        String str = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        auew auewVar4 = (auew) aihfVarCreateBuilder.instance;
        auewVar4.b |= 8;
        auewVar4.f = str;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (auew) aihnVarBuild;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof urp) {
            urp urpVar = (urp) obj;
            if (awrc.c(this.a, urpVar.a) && awrc.c(this.b, urpVar.b) && awrc.c(this.c, urpVar.c) && awrc.c(this.d, urpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Duration duration = this.c;
        return (((iHashCode * 31) + (duration == null ? 0 : duration.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Commit(composition=" + this.a + ", description=" + this.b + ", affectedTime=" + this.c + ", id=" + this.d + ')';
    }
}
