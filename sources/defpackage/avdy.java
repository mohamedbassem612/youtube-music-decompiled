package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avdy {
    public String a = "unknown-authority";
    public auyo b = auyo.a;
    public String c;
    public auzs d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof avdy)) {
            return false;
        }
        avdy avdyVar = (avdy) obj;
        return this.a.equals(avdyVar.a) && this.b.equals(avdyVar.b) && Objects.equals(this.c, avdyVar.c) && Objects.equals(this.d, avdyVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
