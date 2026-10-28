package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pdq {
    public final MessageLite a;
    public final MessageLite b;
    public final Throwable c;
    public final boolean d;
    public final boolean e;

    public pdq(MessageLite messageLite, MessageLite messageLite2, Throwable th, boolean z, boolean z2) {
        this.a = messageLite;
        this.b = messageLite2;
        this.c = th;
        this.d = z;
        this.e = z2;
    }

    public static pdq a(MessageLite messageLite, qau qauVar) {
        qat qatVarC = c();
        qatVarC.a = messageLite;
        qatVarC.c = qauVar.b;
        qatVarC.b = qauVar.c;
        qatVarC.f(qauVar.d);
        qatVarC.e(qauVar.e);
        return qatVarC.d();
    }

    public static qat c() {
        qat qatVar = new qat();
        qatVar.f(true);
        qatVar.e(false);
        return qatVar;
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pdq) {
            pdq pdqVar = (pdq) obj;
            MessageLite messageLite = this.a;
            if (messageLite != null ? messageLite.equals(pdqVar.a) : pdqVar.a == null) {
                MessageLite messageLite2 = this.b;
                if (messageLite2 != null ? messageLite2.equals(pdqVar.b) : pdqVar.b == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(pdqVar.c) : pdqVar.c == null) {
                        if (this.d == pdqVar.d && this.e == pdqVar.e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        MessageLite messageLite = this.a;
        int iHashCode = messageLite == null ? 0 : messageLite.hashCode();
        MessageLite messageLite2 = this.b;
        int iHashCode2 = messageLite2 == null ? 0 : messageLite2.hashCode();
        int i = iHashCode ^ 1000003;
        Throwable th = this.c;
        return (((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        Throwable th = this.c;
        MessageLite messageLite = this.b;
        return "ChimeRpc{request=" + String.valueOf(this.a) + ", response=" + String.valueOf(messageLite) + ", error=" + String.valueOf(th) + ", isRetryableError=" + this.d + ", isAuthError=" + this.e + '}';
    }

    public pdq() {
        throw null;
    }
}
