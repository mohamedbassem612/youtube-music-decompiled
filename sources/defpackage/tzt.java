package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tzt {
    public final audb a;
    public final audc b;
    private final Optional c;

    public tzt(audb audbVar, audc audcVar, Optional optional) {
        if (audbVar == null) {
            throw new NullPointerException("Null client");
        }
        this.a = audbVar;
        this.b = audcVar;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tzt) {
            tzt tztVar = (tzt) obj;
            if (this.a.equals(tztVar.a) && this.b.equals(tztVar.b) && this.c.equals(tztVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        audc audcVar = this.b;
        return "LoggingConfiguration{client=" + this.a.toString() + ", clientSurface=" + audcVar.toString() + ", uploadId=" + optional.toString() + '}';
    }

    public tzt() {
        throw null;
    }
}
