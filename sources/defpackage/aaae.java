package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaae {
    public final Intent a;
    public final Intent b;
    public final int c;
    public final int d;
    public final int e;
    private final String f;

    public aaae(Intent intent, Intent intent2, int i, int i2, int i3, String str) {
        this.a = intent;
        this.b = intent2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaae) {
            aaae aaaeVar = (aaae) obj;
            Intent intent = this.a;
            if (intent != null ? intent.equals(aaaeVar.a) : aaaeVar.a == null) {
                Intent intent2 = this.b;
                if (intent2 != null ? intent2.equals(aaaeVar.b) : aaaeVar.b == null) {
                    if (this.c == aaaeVar.c && this.d == aaaeVar.d && this.e == aaaeVar.e) {
                        String str = this.f;
                        if (str == null) {
                            if (aaaeVar.f == null) {
                                return true;
                            }
                        } else if (str.equals(aaaeVar.f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        int iHashCode = intent == null ? 0 : intent.hashCode();
        Intent intent2 = this.b;
        int iHashCode2 = intent2 == null ? 0 : intent2.hashCode();
        int i = iHashCode ^ 1000003;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        String str = this.f;
        return (((((((((i * 1000003) ^ iHashCode2) * (-721379959)) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Intent intent = this.b;
        return "NotificationModuleConfig{serviceIntent=" + String.valueOf(this.a) + ", mainActivityIntent=" + String.valueOf(intent) + ", dialogActivityIntent=null, smallIcon=" + this.c + ", largeIcon=" + this.d + ", appLabel=" + this.e + ", apiaryProjectId=" + this.f + '}';
    }

    public aaae() {
        throw null;
    }
}
