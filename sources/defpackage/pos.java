package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pos {
    public final String a;
    public final String b;
    public final String c;
    public final aiff d;
    public final aifv e;
    public final String f;
    public final aial g;
    public final aigu h;
    public final int i;

    public pos(String str, int i, String str2, String str3, aiff aiffVar, aifv aifvVar, String str4, aial aialVar, aigu aiguVar) {
        this.a = str;
        this.i = i;
        this.b = str2;
        this.c = str3;
        this.d = aiffVar;
        this.e = aifvVar;
        this.f = str4;
        this.g = aialVar;
        this.h = aiguVar;
    }

    public static final agev a(aicf aicfVar) {
        int iAV;
        aicfVar.getClass();
        if (!rpi.a(aicfVar)) {
            return agdf.a;
        }
        pop popVarC = c();
        popVarC.c();
        popVarC.g(aicfVar.g);
        popVarC.i(aicfVar.h);
        int i = 1;
        if (aicfVar.c == 7 && (iAV = a.aV(((Integer) aicfVar.d).intValue())) != 0) {
            i = iAV;
        }
        popVarC.j(i);
        popVarC.b(aicfVar.c == 4 ? (String) aicfVar.d : "");
        aiff aiffVar = aicfVar.i;
        if (aiffVar == null) {
            aiffVar = aiff.a;
        }
        popVarC.h(aiffVar);
        aifv aifvVar = aicfVar.j;
        if (aifvVar == null) {
            aifvVar = aifv.a;
        }
        popVarC.a = aifvVar;
        popVarC.e(aicfVar.e == 8 ? (String) aicfVar.f : "");
        popVarC.d(aicfVar.e == 9 ? (aial) aicfVar.f : aial.a);
        popVarC.f(aicfVar.e == 10 ? (aigu) aicfVar.f : aigu.a);
        return agev.i(popVarC.a());
    }

    public static pop c() {
        pop popVar = new pop();
        popVar.c();
        popVar.i("");
        popVar.b("");
        popVar.j(1);
        popVar.h(aiff.a);
        popVar.a = aifv.a;
        popVar.e("");
        popVar.d(aial.a);
        popVar.f(aikw.a);
        return popVar;
    }

    public final aicf b() {
        aihf aihfVarCreateBuilder = aicf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aicf aicfVar = (aicf) aihfVarCreateBuilder.instance;
        String str = this.b;
        str.getClass();
        aicfVar.b |= 2;
        aicfVar.g = str;
        aihfVarCreateBuilder.copyOnWrite();
        aicf aicfVar2 = (aicf) aihfVarCreateBuilder.instance;
        String str2 = this.c;
        str2.getClass();
        aicfVar2.b |= 4;
        aicfVar2.h = str2;
        aihfVarCreateBuilder.copyOnWrite();
        aicf aicfVar3 = (aicf) aihfVarCreateBuilder.instance;
        aiff aiffVar = this.d;
        aiffVar.getClass();
        aicfVar3.i = aiffVar;
        aicfVar3.b |= 8;
        aihfVarCreateBuilder.copyOnWrite();
        aicf aicfVar4 = (aicf) aihfVarCreateBuilder.instance;
        aifv aifvVar = this.e;
        aifvVar.getClass();
        aicfVar4.j = aifvVar;
        aicfVar4.b |= 16;
        String str3 = this.a;
        if (str3.isEmpty()) {
            int i = this.i;
            aihfVarCreateBuilder.copyOnWrite();
            aicf aicfVar5 = (aicf) aihfVarCreateBuilder.instance;
            if (i == 0) {
                throw null;
            }
            aicfVar5.d = Integer.valueOf(i - 1);
            aicfVar5.c = 7;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            aicf aicfVar6 = (aicf) aihfVarCreateBuilder.instance;
            str3.getClass();
            aicfVar6.c = 4;
            aicfVar6.d = str3;
        }
        String str4 = this.f;
        if (!str4.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            aicf aicfVar7 = (aicf) aihfVarCreateBuilder.instance;
            str4.getClass();
            aicfVar7.e = 8;
            aicfVar7.f = str4;
        }
        aial aialVar = this.g;
        if (!aialVar.equals(aial.a)) {
            aihfVarCreateBuilder.copyOnWrite();
            aicf aicfVar8 = (aicf) aihfVarCreateBuilder.instance;
            aialVar.getClass();
            aicfVar8.f = aialVar;
            aicfVar8.e = 9;
        }
        aigu aiguVar = this.h;
        if (!aiguVar.equals(aikw.a)) {
            aihfVarCreateBuilder.copyOnWrite();
            aicf aicfVar9 = (aicf) aihfVarCreateBuilder.instance;
            aiguVar.getClass();
            aicfVar9.f = aiguVar;
            aicfVar9.e = 10;
        }
        return (aicf) aihfVarCreateBuilder.build();
    }

    public final boolean equals(Object obj) {
        aifv aifvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pos) {
            pos posVar = (pos) obj;
            if (this.a.equals(posVar.a)) {
                int i = this.i;
                int i2 = posVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(posVar.b) && this.c.equals(posVar.c) && this.d.equals(posVar.d) && ((aifvVar = this.e) != null ? aifvVar.equals(posVar.e) : posVar.e == null) && this.f.equals(posVar.f) && this.g.equals(posVar.g) && this.h.equals(posVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.i;
        a.by(i);
        int iHashCode2 = (((((((iHashCode * 1000003) ^ i) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        aifv aifvVar = this.e;
        return (((((((iHashCode2 * 1000003) ^ (aifvVar == null ? 0 : aifvVar.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        int i = this.i;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        aiff aiffVar = this.d;
        aifv aifvVar = this.e;
        aial aialVar = this.g;
        aigu aiguVar = this.h;
        return "ChimeNotificationAction{actionId=" + this.a + ", builtInActionType=" + string + ", iconResourceId=0, text=" + this.b + ", url=" + this.c + ", threadStateUpdate=" + String.valueOf(aiffVar) + ", payload=" + String.valueOf(aifvVar) + ", replyHintText=" + this.f + ", preferenceKey=" + String.valueOf(aialVar) + ", snoozeDuration=" + String.valueOf(aiguVar) + '}';
    }

    public pos() {
        throw null;
    }
}
