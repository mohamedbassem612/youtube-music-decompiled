package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class slk implements snk {
    public final String a;
    public final snh b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final aosr g;
    public final boolean h;
    private final String i;
    private final aixr j;
    private final boolean k;

    public slk(String str, aixr aixrVar, boolean z, String str2, snh snhVar, boolean z2, boolean z3, boolean z4, boolean z5, aosr aosrVar, boolean z6) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.i = str;
        this.j = aixrVar;
        this.k = z;
        if (str2 == null) {
            throw new NullPointerException("Null getActivatingMediaLayoutId");
        }
        this.a = str2;
        if (snhVar == null) {
            throw new NullPointerException("Null getTimeRange");
        }
        this.b = snhVar;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        if (aosrVar == null) {
            throw new NullPointerException("Null getPlayerVisibility");
        }
        this.g = aosrVar;
        this.h = z6;
    }

    public static slk c(String str, String str2, snh snhVar, boolean z) {
        return new slk(str, aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE, false, str2, snhVar, z, false, true, true, aosr.b, false);
    }

    public static slk e(String str, String str2, snh snhVar, boolean z) {
        return new slk(str, aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE, false, str2, snhVar, false, z, true, true, aosr.b, false);
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.j;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.i;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slk) {
            slk slkVar = (slk) obj;
            if (this.i.equals(slkVar.i) && this.j.equals(slkVar.j) && this.k == slkVar.k && this.a.equals(slkVar.a) && this.b.equals(slkVar.b) && this.c == slkVar.c && this.d == slkVar.d && this.e == slkVar.e && this.f == slkVar.f && this.g.equals(slkVar.g) && this.h == slkVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.i.hashCode() ^ 1000003) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        aosr aosrVar = this.g;
        snh snhVar = this.b;
        return "MediaTimeRangeTrigger{getTriggerId=" + this.i + ", getTriggerType=" + this.j.toString() + ", shouldOnlyTriggerOnce=" + this.k + ", getActivatingMediaLayoutId=" + this.a + ", getTimeRange=" + snhVar.toString() + ", shouldPreventActivationOnTriggerRegistration=" + this.c + ", shouldDisableOnSeek=" + this.d + ", canActivateInFullScreenPlayer=" + this.e + ", canActivateInPortraitMode=" + this.f + ", getPlayerVisibility=" + aosrVar.toString() + ", isWatchWhileTrigger=" + this.h + '}';
    }

    public slk() {
        throw null;
    }
}
