package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oik {
    public final boolean a;
    public final agev b;
    public final boolean c;
    private final agev d;
    private final agev e;
    private final agev f;

    public oik(boolean z, agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, boolean z2) {
        this.a = z;
        this.b = agevVar;
        this.d = agevVar2;
        this.e = agevVar3;
        this.f = agevVar4;
        this.c = z2;
    }

    public static oij a() {
        oij oijVar = new oij();
        oijVar.b(false);
        byte b = oijVar.c;
        oijVar.b = true;
        oijVar.c = (byte) (b | 14);
        return oijVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oik) {
            oik oikVar = (oik) obj;
            if (this.a == oikVar.a && this.b.equals(oikVar.b) && this.d.equals(oikVar.d) && this.e.equals(oikVar.e) && this.f.equals(oikVar.f) && this.c == oikVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        agev agevVar = this.f;
        agev agevVar2 = this.e;
        agev agevVar3 = this.d;
        return "GetFileGroupsByFilterRequest{includeAllGroups=" + this.a + ", groupWithNoAccountOnly=false, groupNameOptional=" + String.valueOf(this.b) + ", groupNamePrefixOptional=" + String.valueOf(agevVar3) + ", accountOptional=" + String.valueOf(agevVar2) + ", sourceOptional=" + String.valueOf(agevVar) + ", preserveZipDirectories=false, verifyIsolatedStructure=" + this.c + '}';
    }

    public oik() {
        throw null;
    }
}
