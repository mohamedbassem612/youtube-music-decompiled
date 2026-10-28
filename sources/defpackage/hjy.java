package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjy {
    public static final hjy a = new hjy(zol.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE, zmz.a, "version_not_found");
    public final zot b;
    public final amzo c;
    public final zne d;
    public final String e;

    public hjy(zot zotVar, amzo amzoVar, zne zneVar, String str) {
        zotVar.getClass();
        amzoVar.getClass();
        zneVar.getClass();
        str.getClass();
        this.b = zotVar;
        this.c = amzoVar;
        this.d = zneVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hjy) {
            hjy hjyVar = (hjy) obj;
            if (awrc.c(this.b, hjyVar.b) && this.c == hjyVar.c && awrc.c(this.d, hjyVar.d) && awrc.c(this.e, hjyVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MediaClientInfo(appPackage=" + this.b + ", packageNameSource=" + this.c + ", mediaClientName=" + this.d + ", appPackageVersion=" + this.e + ')';
    }
}
