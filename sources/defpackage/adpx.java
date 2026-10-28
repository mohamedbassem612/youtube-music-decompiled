package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpx {
    public final String a;
    public final int b;
    public final String c;
    public final adox d;

    public adpx(String str, int i, String str2, adox adoxVar) {
        adoxVar.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = adoxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adpx) {
            adpx adpxVar = (adpx) obj;
            if (awrc.c(this.a, adpxVar.a) && this.b == adpxVar.b && awrc.c(this.c, adpxVar.c) && awrc.c(this.d, adpxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RiveListItemProperty(listPath=" + this.a + ", index=" + this.b + ", propertyPath=" + this.c + ", field=" + this.d + ')';
    }
}
