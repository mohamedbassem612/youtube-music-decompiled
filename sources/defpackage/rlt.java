package defpackage;

import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class rlt implements Parcelable, Serializable, zwa {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final int l;

    public rlt(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, boolean z6, int i, String str5) {
        if (str == null) {
            throw new NullPointerException("Null getId");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null getAccountName");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null getPageId");
        }
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        if (str4 == null) {
            throw new NullPointerException("Null getDataSyncId");
        }
        this.g = str4;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        if (i == 0) {
            throw new NullPointerException("Null getGaiaDelegationType");
        }
        this.l = i;
        if (str5 == null) {
            throw new NullPointerException("Null getDelegationContext");
        }
        this.k = str5;
    }

    public static rlt a(ajue ajueVar) {
        if ((ajueVar.c & SemanticState.Focused) != 0) {
            String str = ajueVar.h;
            String str2 = ajueVar.i;
            akkd akkdVar = ajueVar.j;
            if (akkdVar == null) {
                akkdVar = akkd.a;
            }
            String str3 = akkdVar.b;
            int iAV = a.aV(ajueVar.f);
            if (iAV == 0) {
                iAV = 1;
            }
            return o(str, str2, str3, iAV, ajueVar.k);
        }
        aihv aihvVar = ajueVar.g;
        aihw aihwVar = ajue.a;
        if (new aihx(aihvVar, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT)) {
            String str4 = ajueVar.h;
            String str5 = ajueVar.i;
            String str6 = ajueVar.d;
            akkd akkdVar2 = ajueVar.j;
            if (akkdVar2 == null) {
                akkdVar2 = akkd.a;
            }
            return n(str4, str5, str6, false, false, false, false, false, false, 2, akkdVar2.b);
        }
        if (new aihx(ajueVar.g, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA)) {
            String str7 = ajueVar.d;
            String str8 = ajueVar.i;
            akkd akkdVar3 = ajueVar.j;
            if (akkdVar3 == null) {
                akkdVar3 = akkd.a;
            }
            return n(str7, str8, null, false, false, true, false, false, false, 3, akkdVar3.b);
        }
        if (new aihx(ajueVar.g, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
            int iAV2 = a.aV(ajueVar.f);
            if (iAV2 != 0 && iAV2 == 3) {
                String str9 = ajueVar.d;
                String str10 = ajueVar.i;
                akkd akkdVar4 = ajueVar.j;
                if (akkdVar4 == null) {
                    akkdVar4 = akkd.a;
                }
                return n(str9, str10, null, false, false, false, true, false, false, 3, akkdVar4.b);
            }
            String str11 = ajueVar.h;
            String str12 = ajueVar.i;
            akkd akkdVar5 = ajueVar.j;
            if (akkdVar5 == null) {
                akkdVar5 = akkd.a;
            }
            return n(str11, str12, null, false, false, false, true, false, new aihx(ajueVar.g, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU), 2, akkdVar5.b);
        }
        if (!new aihx(ajueVar.g, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
            String str13 = ajueVar.h;
            String str14 = ajueVar.i;
            akkd akkdVar6 = ajueVar.j;
            if (akkdVar6 == null) {
                akkdVar6 = akkd.a;
            }
            return n(str13, str14, null, false, false, false, false, false, false, 2, akkdVar6.b);
        }
        int iAV3 = a.aV(ajueVar.f);
        if (iAV3 != 0 && iAV3 == 3) {
            String str15 = ajueVar.d;
            String str16 = ajueVar.i;
            akkd akkdVar7 = ajueVar.j;
            if (akkdVar7 == null) {
                akkdVar7 = akkd.a;
            }
            return n(str15, str16, null, false, false, false, false, true, false, 3, akkdVar7.b);
        }
        String str17 = ajueVar.h;
        String str18 = ajueVar.i;
        akkd akkdVar8 = ajueVar.j;
        if (akkdVar8 == null) {
            akkdVar8 = akkd.a;
        }
        return n(str17, str18, null, false, false, false, false, true, new aihx(ajueVar.g, aihwVar).contains(aisb.REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU), 2, akkdVar8.b);
    }

    public static rlt b(String str) {
        return n("PRIMORDIAL-".concat(String.valueOf(str)), str, "", false, false, false, false, false, false, 2, "PRIMORDIAL-".concat(String.valueOf(str)));
    }

    public static rlt n(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, String str4) {
        return new rlz(str, str2, str3 == null ? "" : str3, z, z2, z3, str4 == null ? "" : str4, z4, z5, z6, i, "NO_DELEGATION_CONTEXT");
    }

    public static rlt o(String str, String str2, String str3, int i, String str4) {
        if (str3 == null) {
            str3 = "";
        }
        return new rlz(str, str2, "", false, false, false, str3, false, false, false, i, str4);
    }

    @Override // defpackage.zwa
    public final boolean c() {
        return !"NO_DELEGATION_CONTEXT".equals(this.k);
    }

    @Override // defpackage.zwa
    public final boolean d() {
        return !this.c.equals("");
    }

    @Override // defpackage.zwa
    public final boolean e() {
        return d() || c() || this.f || this.l != 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rlt) {
            rlt rltVar = (rlt) obj;
            if (this.a.equals(rltVar.a) && this.b.equals(rltVar.b) && this.c.equals(rltVar.c) && this.d == rltVar.d && this.e == rltVar.e && this.f == rltVar.f && this.g.equals(rltVar.g) && this.h == rltVar.h && this.i == rltVar.i && this.j == rltVar.j && this.l == rltVar.l && this.k.equals(rltVar.k)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zwa
    public final boolean f() {
        if (e()) {
            return this.h || this.i;
        }
        return false;
    }

    @Override // defpackage.zwa
    public final boolean g() {
        return false;
    }

    @Override // defpackage.zwa
    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.zwa
    public final String i() {
        return this.g;
    }

    @Override // defpackage.zwa
    public final String j() {
        return this.k;
    }

    @Override // defpackage.zwa
    public final String k() {
        return this.a;
    }

    @Override // defpackage.zwa
    public final String l() {
        return this.c;
    }

    @Override // defpackage.zwa
    public final boolean m() {
        return this.d;
    }

    public final String toString() {
        return "AccountIdentity{getId=" + this.a + ", getAccountName=" + this.b + ", getPageId=" + this.c + ", isIncognito=" + this.d + ", wasUnicorn=" + this.e + ", isPersona=" + this.f + ", getDataSyncId=" + this.g + ", isUnicorn=" + this.h + ", isGriffin=" + this.i + ", isTeenacorn=" + this.j + ", getGaiaDelegationType=" + Integer.toString(this.l - 1) + ", getDelegationContext=" + this.k + '}';
    }

    public rlt() {
        throw null;
    }
}
