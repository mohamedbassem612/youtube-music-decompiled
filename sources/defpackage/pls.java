package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pls {
    public final String a;
    public final String b;
    public final plt c;
    public final String d;
    public final long e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final Integer i;
    public final int j;
    public final boolean k;
    public final plq l;
    public final int m;
    public final int n;
    private final String o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final agkj s;

    public pls(String str, String str2, plt pltVar, String str3, long j, String str4, String str5, Integer num, boolean z, boolean z2, Integer num2, int i, boolean z3, boolean z4, boolean z5, agkj agkjVar, plq plqVar) {
        this.a = str;
        this.b = str2;
        this.m = 1;
        this.c = pltVar;
        this.d = str3;
        this.e = j;
        this.o = str4;
        this.f = str5;
        this.g = num;
        this.p = z;
        this.h = z2;
        this.i = num2;
        this.j = i;
        this.q = z3;
        this.k = z4;
        this.r = z5;
        this.s = agkjVar;
        this.n = 1;
        this.l = plqVar;
    }

    public final boolean equals(Object obj) {
        String str;
        plt pltVar;
        String str2;
        String str3;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pls) {
            pls plsVar = (pls) obj;
            if (this.a.equals(plsVar.a) && ((str = this.b) != null ? str.equals(plsVar.b) : plsVar.b == null)) {
                int i = this.m;
                int i2 = plsVar.m;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && ((pltVar = this.c) != null ? pltVar.equals(plsVar.c) : plsVar.c == null) && this.d.equals(plsVar.d) && this.e == plsVar.e && ((str2 = this.o) != null ? str2.equals(plsVar.o) : plsVar.o == null) && ((str3 = this.f) != null ? str3.equals(plsVar.f) : plsVar.f == null) && ((num = this.g) != null ? num.equals(plsVar.g) : plsVar.g == null) && this.p == plsVar.p && this.h == plsVar.h && ((num2 = this.i) != null ? num2.equals(plsVar.i) : plsVar.i == null) && this.j == plsVar.j && this.q == plsVar.q && this.k == plsVar.k && this.r == plsVar.r && aguu.q(this.s, plsVar.s)) {
                    int i3 = this.n;
                    int i4 = plsVar.n;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i4 == 1 && this.l.equals(plsVar.l)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((iHashCode * (-721379959)) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a.bj(this.m);
        int i = (iHashCode2 ^ 1) * 1000003;
        plt pltVar = this.c;
        int iHashCode3 = (((((i ^ (pltVar == null ? 0 : pltVar.hashCode())) * (-721379959)) ^ this.d.hashCode()) * 1000003) ^ ((int) this.e)) * 1000003;
        String str2 = this.o;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num = this.g;
        int iHashCode6 = (((((((iHashCode5 ^ (num == null ? 0 : num.hashCode())) * (-721379959)) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        Integer num2 = this.i;
        int iHashCode7 = (((((((((((((((((iHashCode6 ^ (num2 != null ? num2.hashCode() : 0)) * 1000003) ^ 1237) * 1000003) ^ this.j) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ this.s.hashCode()) * 1000003) ^ 1237) * 1000003;
        a.bj(this.n);
        return ((((((((((iHashCode7 ^ 1) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        String str = this.m != 1 ? "null" : "PRODUCTION";
        plt pltVar = this.c;
        String str2 = this.d;
        long j = this.e;
        String str3 = this.o;
        String str4 = this.f;
        Integer num = this.g;
        boolean z = this.p;
        boolean z2 = this.h;
        Integer num2 = this.i;
        int i = this.j;
        boolean z3 = this.q;
        boolean z4 = this.k;
        boolean z5 = this.r;
        agkj agkjVar = this.s;
        int i2 = this.n;
        String strValueOf = String.valueOf(pltVar);
        String strValueOf2 = String.valueOf(agkjVar);
        String str5 = i2 != 1 ? "null" : "REGISTRATION_API_UNSPECIFIED";
        String str6 = this.b;
        String str7 = str5;
        return "GnpConfig{clientId=" + this.a + ", selectionTokens=null, gcmSenderProjectId=" + str6 + ", defaultEnvironment=" + str + ", systemTrayNotificationConfig=" + strValueOf + ", inAppNotificationConfig=null, deviceName=" + str2 + ", registrationStalenessTimeMs=" + j + ", scheduledTaskService=" + str3 + ", apiKey=" + str4 + ", jobSchedulerAllowedIDsRange=" + num + ", firebaseOptions=null, disableEntrypoints=" + z + ", useDefaultFirebaseApp=" + z2 + ", useFirebaseReceiver=false, timeToLiveDays=" + num2 + ", enableEndToEndEncryption=false, periodRegistrationIntervalDays=" + i + ", enableGrowthKitIfExists=" + z3 + ", enableInAppPushFlow=" + z4 + ", allowedFromEmbargoedCountries=false, disableRestartReceiverManager=" + z5 + ", additionalRestartReceivers=" + strValueOf2 + ", firebaseInitializedByApp=false, registrationApi=" + str7 + ", removeNotVcnManagedCapability=false, expeditedJobs=" + String.valueOf(this.l) + ", dropNonMatchingClientIds=false, logNonMatchingClientIds=false, additionalIsolatedInstance=false}";
    }

    public pls() {
        throw null;
    }
}
