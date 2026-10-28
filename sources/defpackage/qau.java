package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qau {
    public final Integer a;
    public final MessageLite b;
    public final Throwable c;
    public final boolean d;
    public final boolean e;

    public qau(Integer num, MessageLite messageLite, Throwable th, boolean z, boolean z2) {
        this.a = num;
        this.b = messageLite;
        this.c = th;
        this.d = z;
        this.e = z2;
    }

    public static qat b() {
        qat qatVar = new qat();
        qatVar.c(true);
        qatVar.b(false);
        return qatVar;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qau) {
            qau qauVar = (qau) obj;
            Integer num = this.a;
            if (num != null ? num.equals(qauVar.a) : qauVar.a == null) {
                MessageLite messageLite = this.b;
                if (messageLite != null ? messageLite.equals(qauVar.b) : qauVar.b == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(qauVar.c) : qauVar.c == null) {
                        if (this.d == qauVar.d && this.e == qauVar.e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        MessageLite messageLite = this.b;
        int iHashCode2 = messageLite == null ? 0 : messageLite.hashCode();
        int i = iHashCode ^ 1000003;
        Throwable th = this.c;
        return (((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        Throwable th = this.c;
        return "ChimeRpcResponse{statusCode=" + this.a + ", response=" + String.valueOf(this.b) + ", error=" + String.valueOf(th) + ", isRetryableError=" + this.d + ", isAuthError=" + this.e + '}';
    }

    public qau() {
        throw null;
    }
}
