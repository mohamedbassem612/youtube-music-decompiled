package defpackage;

import android.net.Uri;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrm {
    public final Uri a;
    public final MessageLite b;
    public final agev c;
    public final agke d;
    public final boolean e;
    public final rmp f;

    public qrm(Uri uri, MessageLite messageLite, agev agevVar, agke agkeVar, rmp rmpVar, boolean z) {
        this.a = uri;
        this.b = messageLite;
        this.c = agevVar;
        this.d = agkeVar;
        this.f = rmpVar;
        this.e = z;
    }

    public static qrl a() {
        qrl qrlVar = new qrl();
        qrlVar.a = qrq.a;
        qrlVar.c();
        qrlVar.g(true);
        return qrlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qrm) {
            qrm qrmVar = (qrm) obj;
            if (this.a.equals(qrmVar.a) && this.b.equals(qrmVar.b) && this.c.equals(qrmVar.c) && aguu.v(this.d, qrmVar.d) && this.f.equals(qrmVar.f) && this.e == qrmVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        rmp rmpVar = this.f;
        agke agkeVar = this.d;
        agev agevVar = this.c;
        MessageLite messageLite = this.b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.a) + ", schema=" + String.valueOf(messageLite) + ", handler=" + String.valueOf(agevVar) + ", migrations=" + String.valueOf(agkeVar) + ", variantConfig=" + String.valueOf(rmpVar) + ", useGeneratedExtensionRegistry=" + this.e + ", enableTracing=false}";
    }

    public qrm() {
        throw null;
    }
}
