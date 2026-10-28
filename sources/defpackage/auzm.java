package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzm {
    public static final auyn a = new auyn("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public static final auyn b = new auyn("io.grpc.EquivalentAddressGroup.LOCALITY");
    static final auyn c = new auyn("io.grpc.EquivalentAddressGroup.BACKEND_SERVICE");
    static final auyn d = new auyn("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT");
    public final List e;
    public final auyo f;
    private final int g;

    public auzm(List list, auyo auyoVar) {
        ahno.G(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.e = listUnmodifiableList;
        auyoVar.getClass();
        this.f = auyoVar;
        this.g = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof auzm) {
            auzm auzmVar = (auzm) obj;
            List list = this.e;
            int size = list.size();
            List list2 = auzmVar.e;
            if (size == list2.size()) {
                for (int i = 0; i < list.size(); i++) {
                    if (((SocketAddress) list.get(i)).equals(list2.get(i))) {
                    }
                }
                if (this.f.equals(auzmVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g;
    }

    public final String toString() {
        auyo auyoVar = this.f;
        return "[" + String.valueOf(this.e) + '/' + auyoVar.toString() + ']';
    }

    public auzm(SocketAddress socketAddress, auyo auyoVar) {
        this(Collections.singletonList(socketAddress), auyoVar);
    }

    public auzm(SocketAddress socketAddress) {
        this(socketAddress, auyo.a);
    }
}
