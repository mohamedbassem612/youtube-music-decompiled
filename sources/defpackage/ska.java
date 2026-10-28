package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ska implements sma {
    public final boolean a;
    public final String b;
    public final int c;
    private final String d;
    private final aixr e;
    private final boolean f;
    private final String g;
    private final int h;
    private final int i;

    public ska(String str, aixr aixrVar, boolean z, boolean z2, String str2, String str3, int i, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.d = str;
        this.e = aixrVar;
        this.f = z;
        this.a = z2;
        if (str2 == null) {
            throw new NullPointerException("Null getMediaCpn");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null triggeringLayoutId");
        }
        this.g = str3;
        this.h = i;
        this.i = i2;
        this.c = i3;
    }

    @Override // defpackage.snk
    public final aixr a() {
        return this.e;
    }

    @Override // defpackage.snk
    public final String b() {
        return this.d;
    }

    @Override // defpackage.snk
    public final boolean d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ska) {
            ska skaVar = (ska) obj;
            if (this.d.equals(skaVar.d) && this.e.equals(skaVar.e) && this.f == skaVar.f && this.a == skaVar.a && this.b.equals(skaVar.b) && this.g.equals(skaVar.g) && this.h == skaVar.h && this.i == skaVar.i && this.c == skaVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sma
    public final boolean h() {
        throw null;
    }

    public final int hashCode() {
        return ((((((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.c - 1;
        int i2 = this.i - 1;
        int i3 = this.h - 1;
        return "CloseRequestedTrigger{getTriggerId=" + this.d + ", getTriggerType=" + this.e.toString() + ", shouldOnlyTriggerOnce=" + this.f + ", shouldDisableIfVideoStartMuted=" + this.a + ", getMediaCpn=" + this.b + ", triggeringLayoutId=" + this.g + ", initiatorType=" + Integer.toString(i3) + ", playerContentType=" + Integer.toString(i2) + ", uiTarget=" + Integer.toString(i) + '}';
    }

    public ska() {
        throw null;
    }
}
