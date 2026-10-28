package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adun {
    public final agev a;
    public final agev b;
    private final agev c;
    private final agev d;
    private final agev e;
    private final agev f;
    private final agev g;
    private final boolean h;
    private final int i;
    private final int j;

    public adun(agev agevVar, agev agevVar2, agev agevVar3, int i, int i2, agev agevVar4, agev agevVar5, agev agevVar6, agev agevVar7, boolean z) {
        this.a = agevVar;
        this.b = agevVar2;
        this.c = agevVar3;
        this.i = i;
        this.j = i2;
        this.d = agevVar4;
        this.e = agevVar5;
        this.f = agevVar6;
        this.g = agevVar7;
        this.h = z;
    }

    public static adum a() {
        adum adumVar = new adum();
        adumVar.b(false);
        adumVar.d = 1;
        adumVar.e = 1;
        return adumVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adun) {
            adun adunVar = (adun) obj;
            if (this.a.equals(adunVar.a) && this.b.equals(adunVar.b) && this.c.equals(adunVar.c)) {
                int i = this.i;
                int i2 = adunVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.j;
                    int i4 = adunVar.j;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.d.equals(adunVar.d) && this.e.equals(adunVar.e) && this.f.equals(adunVar.f) && this.g.equals(adunVar.g) && this.h == adunVar.h) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = this.i;
        a.bj(i);
        int i2 = this.j;
        a.bj(i2);
        return (((((((((((((iHashCode * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        String str;
        int i = this.i;
        agev agevVar = this.c;
        agev agevVar2 = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(agevVar2);
        String strValueOf3 = String.valueOf(agevVar);
        String str2 = "null";
        switch (i) {
            case 1:
                str = "DEFAULT";
                break;
            case 2:
                str = "COMPACT";
                break;
            case 3:
                str = "DROPDOWN";
                break;
            case 4:
                str = "ROUNDED_CORNERS";
                break;
            case 5:
                str = "WIDE_SCREEN";
                break;
            case 6:
                str = "MONO_OUTLINE";
                break;
            default:
                str = "null";
                break;
        }
        int i2 = this.j;
        if (i2 == 1) {
            str2 = "DEFAULT";
        } else if (i2 == 2) {
            str2 = "GREY";
        } else if (i2 == 3) {
            str2 = "THEMED";
        } else if (i2 == 4) {
            str2 = "COLOR_SAMPLING";
        }
        agev agevVar3 = this.d;
        agev agevVar4 = this.e;
        agev agevVar5 = this.f;
        agev agevVar6 = this.g;
        boolean z = this.h;
        return "ExpandButtonData{expandedButtonLabel=" + strValueOf + ", collapsedButtonLabel=" + strValueOf2 + ", navigationEndpoint=" + strValueOf3 + ", layoutStyle=" + str + ", backgroundColor=" + str2 + ", lightThemeBackgroundColor=" + String.valueOf(agevVar3) + ", darkThemeBackgroundColor=" + String.valueOf(agevVar4) + ", visualElementType=" + String.valueOf(agevVar5) + ", parentTrackingParams=" + String.valueOf(agevVar6) + ", canCollapse=" + z + '}';
    }

    public adun() {
        throw null;
    }
}
