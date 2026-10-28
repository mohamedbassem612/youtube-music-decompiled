package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gql {
    public final Optional a;
    public final int b;
    private final Optional c;
    private final Optional d;

    public gql(Optional optional, Optional optional2, Optional optional3) {
        this.b = 2;
        this.c = optional;
        this.d = optional2;
        this.a = optional3;
    }

    public static gql a(acjx acjxVar, ajwo ajwoVar) {
        Optional optionalEmpty = Optional.empty();
        Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        Optional optionalOf = Optional.of(acjxVar);
        if (ajwoVar != null) {
            optionalEmpty2 = Optional.of(ajwoVar);
        }
        Set set = (Set) Collection.EL.stream(aguu.s(optionalEmpty, optionalOf)).filter(new gqk(0)).collect(Collectors.toSet());
        if (set.size() == 1 && set.contains(optionalOf)) {
            return new gql(optionalEmpty, optionalOf, optionalEmpty2);
        }
        throw new IllegalArgumentException("Wrong request populated based on request type RELOAD_CONTINUATION");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gql) {
            gql gqlVar = (gql) obj;
            int i = this.b;
            int i2 = gqlVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.c.equals(gqlVar.c) && this.d.equals(gqlVar.d) && this.a.equals(gqlVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bj(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str;
        Optional optional = this.a;
        Optional optional2 = this.d;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(optional2);
        String strValueOf3 = String.valueOf(optional);
        StringBuilder sb = new StringBuilder("RequestInfoWithContext{requestType=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "RELOAD_CONTINUATION";
        } else {
            str = "NON_CONTINUATION_REQUEST";
        }
        sb.append(str);
        sb.append(", nonContinuationRequest=");
        sb.append(strValueOf);
        sb.append(", reloadContinuation=");
        sb.append(strValueOf2);
        sb.append(", parentCommand=");
        sb.append(strValueOf3);
        sb.append('}');
        return sb.toString();
    }

    public gql() {
        throw null;
    }
}
