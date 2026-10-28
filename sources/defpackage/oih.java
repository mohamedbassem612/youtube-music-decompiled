package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oih {
    public final String a;
    public final agev b;
    public final agev c;
    public final agev d;
    public final agev e;
    public final boolean f;
    private final agev g;
    private final agev h;
    private final agev i;
    private final int j;

    public oih(String str, agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5, agev agevVar6, agev agevVar7, int i, boolean z) {
        this.a = str;
        this.b = agevVar;
        this.c = agevVar2;
        this.g = agevVar3;
        this.h = agevVar4;
        this.i = agevVar5;
        this.d = agevVar6;
        this.e = agevVar7;
        this.j = 2;
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oih) {
            oih oihVar = (oih) obj;
            if (this.a.equals(oihVar.a) && this.b.equals(oihVar.b) && this.c.equals(oihVar.c) && this.g.equals(oihVar.g) && this.h.equals(oihVar.h) && this.i.equals(oihVar.i) && this.d.equals(oihVar.d) && this.e.equals(oihVar.e)) {
                int i = this.j;
                int i2 = oihVar.j;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.f == oihVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        int i = this.j;
        a.bj(i);
        return (((((iHashCode * 583896283) ^ i) * 1000003) ^ 1237) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        String str;
        int i = this.j;
        agev agevVar = this.e;
        agev agevVar2 = this.d;
        agev agevVar3 = this.i;
        agev agevVar4 = this.h;
        agev agevVar5 = this.g;
        agev agevVar6 = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(agevVar6);
        String strValueOf3 = String.valueOf(agevVar5);
        String strValueOf4 = String.valueOf(agevVar4);
        String strValueOf5 = String.valueOf(agevVar3);
        String strValueOf6 = String.valueOf(agevVar2);
        String strValueOf7 = String.valueOf(agevVar);
        if (i != 1) {
            str = i != 2 ? "null" : "ALL";
        } else {
            str = "NONE";
        }
        return "DownloadFileGroupRequest{groupName=" + this.a + ", accountOptional=" + strValueOf + ", variantIdOptional=" + strValueOf2 + ", contentTitleOptional=" + strValueOf3 + ", contentTextOptional=" + strValueOf4 + ", contentIntentOptional=" + strValueOf5 + ", downloadConditionsOptional=" + strValueOf6 + ", listenerOptional=" + strValueOf7 + ", groupSizeBytes=0, groupSizeBytesLong=0, showNotifications=" + str + ", preserveZipDirectories=false, verifyIsolatedStructure=" + this.f + '}';
    }

    public oih() {
        throw null;
    }
}
