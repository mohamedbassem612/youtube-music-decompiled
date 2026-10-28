package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pgv {
    public final String a;
    public final String b;
    public final pgu c;
    public final boolean d;

    public pgv(String str, String str2, pgu pguVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = pguVar;
        this.d = z;
    }

    public final ahyd a() {
        ahyc ahycVar;
        aihf aihfVarCreateBuilder = ahyd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahyd ahydVar = (ahyd) aihfVarCreateBuilder.instance;
        String str = this.a;
        str.getClass();
        ahydVar.b |= 1;
        ahydVar.c = str;
        switch (this.c.ordinal()) {
            case 1:
                ahycVar = ahyc.IMPORTANCE_DEFAULT;
                break;
            case 2:
                ahycVar = ahyc.IMPORTANCE_HIGH;
                break;
            case 3:
                ahycVar = ahyc.IMPORTANCE_LOW;
                break;
            case 4:
                ahycVar = ahyc.IMPORTANCE_MIN;
                break;
            case 5:
                ahycVar = ahyc.IMPORTANCE_MAX;
                break;
            case 6:
                ahycVar = ahyc.IMPORTANCE_NONE;
                break;
            default:
                ahycVar = ahyc.IMPORTANCE_UNSPECIFIED;
                break;
        }
        aihfVarCreateBuilder.copyOnWrite();
        ahyd ahydVar2 = (ahyd) aihfVarCreateBuilder.instance;
        ahydVar2.e = ahycVar.h;
        ahydVar2.b |= 4;
        ahyb ahybVar = this.d ? ahyb.TRUE : ahyb.FALSE;
        aihfVarCreateBuilder.copyOnWrite();
        ahyd ahydVar3 = (ahyd) aihfVarCreateBuilder.instance;
        ahydVar3.f = ahybVar.d;
        ahydVar3.b |= 8;
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            ahyd ahydVar4 = (ahyd) aihfVarCreateBuilder.instance;
            str2.getClass();
            ahydVar4.b |= 2;
            ahydVar4.d = str2;
        }
        return (ahyd) aihfVarCreateBuilder.build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pgv) {
            pgv pgvVar = (pgv) obj;
            if (this.a.equals(pgvVar.a) && this.b.equals(pgvVar.b) && this.c.equals(pgvVar.c) && this.d == pgvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "ChimeNotificationChannel{id=" + this.a + ", group=" + this.b + ", importance=" + String.valueOf(this.c) + ", canShowBadge=" + this.d + '}';
    }

    public pgv() {
        throw null;
    }
}
