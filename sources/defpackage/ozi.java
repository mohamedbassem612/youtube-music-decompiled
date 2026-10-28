package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozi {
    public final String a;
    public final String b;
    public final String c;
    public final aiff d;
    public final aifv e;
    public final String f;
    public final aial g;
    public final aigu h;
    public final int i;

    public ozi(String str, int i, String str2, String str3, aiff aiffVar, aifv aifvVar, String str4, aial aialVar, aigu aiguVar) {
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
        if (!rpi.a(aicfVar)) {
            return agdf.a;
        }
        pop popVarB = b();
        popVarB.m();
        popVarB.q(aicfVar.g);
        popVarB.s(aicfVar.h);
        int i = 1;
        if (aicfVar.c == 7 && (iAV = a.aV(((Integer) aicfVar.d).intValue())) != 0) {
            i = iAV;
        }
        popVarB.t(i);
        popVarB.l(aicfVar.c == 4 ? (String) aicfVar.d : "");
        aiff aiffVar = aicfVar.i;
        if (aiffVar == null) {
            aiffVar = aiff.a;
        }
        popVarB.r(aiffVar);
        aifv aifvVar = aicfVar.j;
        if (aifvVar == null) {
            aifvVar = aifv.a;
        }
        popVarB.a = aifvVar;
        popVarB.o(aicfVar.e == 8 ? (String) aicfVar.f : "");
        popVarB.n(aicfVar.e == 9 ? (aial) aicfVar.f : aial.a);
        popVarB.p(aicfVar.e == 10 ? (aigu) aicfVar.f : aigu.a);
        return agev.i(popVarB.k());
    }

    public static pop b() {
        pop popVar = new pop();
        popVar.m();
        popVar.s("");
        popVar.l("");
        popVar.t(1);
        popVar.r(aiff.a);
        popVar.a = aifv.a;
        popVar.o("");
        popVar.n(aial.a);
        popVar.p(aikw.a);
        return popVar;
    }

    public final boolean equals(Object obj) {
        aifv aifvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozi) {
            ozi oziVar = (ozi) obj;
            if (this.a.equals(oziVar.a)) {
                int i = this.i;
                int i2 = oziVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(oziVar.b) && this.c.equals(oziVar.c) && this.d.equals(oziVar.d) && ((aifvVar = this.e) != null ? aifvVar.equals(oziVar.e) : oziVar.e == null) && this.f.equals(oziVar.f) && this.g.equals(oziVar.g) && this.h.equals(oziVar.h)) {
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

    public ozi() {
        throw null;
    }
}
