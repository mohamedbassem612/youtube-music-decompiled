package defpackage;

import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afra {
    public final String a;
    public final MessageLite b;
    public final afqw c;
    public final agke d;
    public final agev e;
    public final agev f;
    public final Executor g;
    private final agev h;

    public afra(String str, agev agevVar, MessageLite messageLite, afqw afqwVar, agke agkeVar, agev agevVar2, agev agevVar3, Executor executor) {
        this.a = str;
        this.h = agevVar;
        this.b = messageLite;
        this.c = afqwVar;
        this.d = agkeVar;
        this.e = agevVar2;
        this.f = agevVar3;
        this.g = executor;
    }

    public static afqz a() {
        afqz afqzVar = new afqz();
        afqzVar.d = (byte) 1;
        afqzVar.b = new afqw(1);
        return afqzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afra) {
            afra afraVar = (afra) obj;
            if (this.a.equals(afraVar.a) && this.h.equals(afraVar.h) && this.b.equals(afraVar.b) && this.c.equals(afraVar.c) && aguu.v(this.d, afraVar.d) && this.e.equals(afraVar.e) && this.f.equals(afraVar.f)) {
                Executor executor = this.g;
                if (executor == null) {
                    if (afraVar.g == null) {
                        return true;
                    }
                } else if (executor.equals(afraVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 385623362) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Executor executor = this.g;
        return ((((iHashCode * 1000003) ^ 2040732332) * 1000003) ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
    }

    public final String toString() {
        Executor executor = this.g;
        agev agevVar = this.f;
        agev agevVar2 = this.e;
        agke agkeVar = this.d;
        afqw afqwVar = this.c;
        MessageLite messageLite = this.b;
        return "ProtoDataStoreConfig{blockingSafeReads=false, name=" + this.a + ", nameSuffix=" + String.valueOf(this.h) + ", schema=" + String.valueOf(messageLite) + ", storage=" + String.valueOf(afqwVar) + ", migrations=" + String.valueOf(agkeVar) + ", handler=" + String.valueOf(agevVar2) + ", logger=" + String.valueOf(agevVar) + ", ioExecutor=" + String.valueOf(executor) + ", lamsConfig=null}";
    }

    public afra() {
        throw null;
    }
}
