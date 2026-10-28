package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class plt {
    public final int a;
    public final int b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;

    public plt(int i, int i2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = i3;
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof plt) {
            plt pltVar = (plt) obj;
            if (this.a == pltVar.a && this.b == pltVar.b && ((num = this.c) != null ? num.equals(pltVar.c) : pltVar.c == null) && this.d == pltVar.d && this.e == pltVar.e && this.f == pltVar.f && this.g == pltVar.g && ((str = this.h) != null ? str.equals(pltVar.h) : pltVar.h == null) && ((str2 = this.i) != null ? str2.equals(pltVar.i) : pltVar.i == null) && ((str3 = this.j) != null ? str3.equals(pltVar.j) : pltVar.j == null) && this.k == pltVar.k && this.l == pltVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.c;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i = this.a;
        int i2 = (((((((((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ iHashCode) * 1000003) ^ (true != this.d ? 1237 : 1231)) * (-721379959)) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * (-721379959)) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        String str = this.h;
        int iHashCode2 = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.i;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.j;
        return ((((((((iHashCode3 ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SystemTrayNotificationConfig{iconResourceId=" + this.a + ", appNameResourceId=" + this.b + ", colorResourceId=" + this.c + ", soundEnabled=" + this.d + ", ringtone=null, vibrationEnabled=" + this.e + ", lightsEnabled=" + this.f + ", ledColor=null, displayRecipientAccountName=" + this.g + ", notificationClickedActivity=" + this.h + ", notificationRemovedReceiver=" + this.i + ", defaultChannelId=" + this.j + ", defaultGroupThreshold=" + this.k + ", summaryNotificationThreshold=" + this.l + ", shouldFilterOldThreads=false, drawCircularAvatarSeparators=false}";
    }

    public plt() {
        throw null;
    }
}
