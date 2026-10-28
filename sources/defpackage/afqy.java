package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afqy {
    public final String a;
    public final agke b;
    public final MessageLite c;
    public final afqw d;
    public final Optional e;
    public final Optional f;

    public afqy(String str, agke agkeVar, MessageLite messageLite, afqw afqwVar, Optional optional, Optional optional2) {
        this.a = str;
        this.b = agkeVar;
        this.c = messageLite;
        this.d = afqwVar;
        this.e = optional;
        this.f = optional2;
    }

    public static afqx a() {
        afqx afqxVar = new afqx();
        afqxVar.b = new afqw(1);
        afqxVar.c = (byte) 1;
        return afqxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afqy) {
            afqy afqyVar = (afqy) obj;
            if (this.a.equals(afqyVar.a) && aguu.v(this.b, afqyVar.b) && this.c.equals(afqyVar.c) && this.d.equals(afqyVar.d) && this.e.equals(afqyVar.e) && this.f.equals(afqyVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        afqw afqwVar = this.d;
        MessageLite messageLite = this.c;
        return "DataStoreConfig{name=" + this.a + ", migrations=" + String.valueOf(this.b) + ", schema=" + String.valueOf(messageLite) + ", storage=" + String.valueOf(afqwVar) + ", corruptionHandler=" + String.valueOf(optional2) + ", nameSuffix=" + String.valueOf(optional) + ", enableTracing=false}";
    }

    public afqy() {
        throw null;
    }
}
