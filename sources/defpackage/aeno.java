package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeno {
    public static final aewo n = new aewo(null);
    public final int a;
    public final aigj b;
    public volatile String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public Integer h;
    public Integer i;
    public final aoar j;
    public final amdd k;
    public final amdd l;
    public final int m;

    public aeno(int i, aigj aigjVar, String str, String str2, String str3, String str4, int i2, Integer num, Integer num2, aoar aoarVar, int i3, amdd amddVar, amdd amddVar2) {
        if (i3 == 0) {
            throw null;
        }
        this.a = i;
        this.b = aigjVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = num;
        this.i = num2;
        this.j = aoarVar;
        this.m = i3;
        this.k = amddVar;
        this.l = amddVar2;
    }

    public static /* synthetic */ aeno b(aeno aenoVar, String str, String str2, Integer num, int i) {
        return new aeno((i & 1) != 0 ? aenoVar.a : 0, (i & 2) != 0 ? aenoVar.b : null, (i & 4) != 0 ? aenoVar.c : str, (i & 8) != 0 ? aenoVar.d : null, (i & 16) != 0 ? aenoVar.e : null, (i & 32) != 0 ? aenoVar.f : str2, (i & 64) != 0 ? aenoVar.g : 0, (i & SemanticState.Focused) != 0 ? aenoVar.h : num, aenoVar.i, aenoVar.j, aenoVar.m, aenoVar.k, aenoVar.l);
    }

    public final aeno a(awqg awqgVar) {
        aoar aoarVarI;
        aenn aennVar = new aenn(this);
        awqgVar.invoke(aennVar);
        aeno aenoVar = aennVar.a;
        if (aenoVar != null) {
            aoarVarI = aenoVar.j;
        } else {
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            String str = aennVar.d;
            if (str != null) {
                agvp.J(str, aihfVarCreateBuilder);
            }
            String str2 = aennVar.e;
            if (str2 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                aoarVar.b |= 64;
                aoarVar.g = str2;
            }
            String str3 = aennVar.f;
            if (str3 != null) {
                agvp.L(str3, aihfVarCreateBuilder);
            }
            String str4 = aennVar.g;
            if (str4 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
                aoarVar2.b |= 32;
                aoarVar2.f = str4;
            }
            agvp.K(aennVar.h, aihfVarCreateBuilder);
            Integer num = aennVar.i;
            if (num != null) {
                agvp.N(num.intValue(), aihfVarCreateBuilder);
            }
            Integer num2 = aennVar.j;
            if (num2 != null) {
                agvp.M(num2.intValue(), aihfVarCreateBuilder);
            }
            aoarVarI = agvp.I(aihfVarCreateBuilder);
        }
        return new aeno(aennVar.b, aennVar.c, aennVar.d, aennVar.e, aennVar.f, aennVar.g, aennVar.h, aennVar.i, aennVar.j, aoarVarI, aennVar.m, aennVar.k, aennVar.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aeno) {
            aeno aenoVar = (aeno) obj;
            if (this.a == aenoVar.a && awrc.c(this.b, aenoVar.b) && awrc.c(this.c, aenoVar.c) && awrc.c(this.d, aenoVar.d) && awrc.c(this.e, aenoVar.e) && awrc.c(this.f, aenoVar.f) && this.g == aenoVar.g && awrc.c(this.h, aenoVar.h) && awrc.c(this.i, aenoVar.i) && awrc.c(this.j, aenoVar.j) && this.m == aenoVar.m && awrc.c(this.k, aenoVar.k) && awrc.c(this.l, aenoVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        aigj aigjVar = this.b;
        int iHashCode = aigjVar == null ? 0 : aigjVar.hashCode();
        int i = this.a;
        int iHashCode2 = this.c == null ? 0 : this.c.hashCode();
        int i2 = (i * 31) + iHashCode;
        String str = this.d;
        int iHashCode3 = ((((i2 * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.g) * 31;
        Integer num = this.h;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode7 = (((((iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.j.hashCode()) * 31) + this.m) * 31;
        amdd amddVar = this.k;
        int iHashCode8 = (iHashCode7 + (amddVar == null ? 0 : amddVar.hashCode())) * 31;
        amdd amddVar2 = this.l;
        return iHashCode8 + (amddVar2 != null ? amddVar2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        int i = this.g;
        Integer num = this.h;
        Integer num2 = this.i;
        StringBuilder sb = new StringBuilder("NavigationInfo(latencyActionType=");
        sb.append(this.a);
        sb.append(", clickTrackingParams=");
        sb.append(this.b);
        sb.append(", pageId=");
        sb.append(str2);
        sb.append(", csn=");
        sb.append(str3);
        sb.append(", parentCsn=");
        sb.append(str4);
        sb.append(", cloneCsn=");
        sb.append(str5);
        sb.append(", pageVeType=");
        sb.append(i);
        sb.append(", parentVeType=");
        sb.append(num);
        sb.append(", parentVeCounter=");
        sb.append(num2);
        sb.append(", baseExtension=");
        sb.append(this.j);
        sb.append(", pageType=");
        switch (this.m) {
            case 1:
                str = "HOME";
                break;
            case 2:
                str = "BROWSE";
                break;
            case 3:
                str = "SHORTS";
                break;
            case 4:
                str = "SEARCH";
                break;
            case 5:
                str = "WATCH";
                break;
            case 6:
                str = "CREATION";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        amdd amddVar = this.l;
        amdd amddVar2 = this.k;
        sb.append((Object) str);
        sb.append(", screenClientData=");
        sb.append(amddVar2);
        sb.append(", screenGestureClientData=");
        sb.append(amddVar);
        sb.append(')');
        return sb.toString();
    }
}
