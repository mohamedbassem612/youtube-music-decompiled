package defpackage;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rmv {
    public static final rmv a = new rmv();
    public final String b;
    public final alay c;
    public final Spanned d;
    public final String e;
    public final boolean f;
    public final abuz g;
    public final abuz h;

    public rmv(String str, String str2, aqmh aqmhVar, String str3, boolean z) {
        this.b = str;
        this.d = new SpannableStringBuilder(str2);
        aihh aihhVar = (aihh) alay.a.createBuilder();
        aihhVar.copyOnWrite();
        alay alayVar = (alay) aihhVar.instance;
        str2.getClass();
        alayVar.b |= 1;
        alayVar.d = str2;
        this.c = (alay) aihhVar.build();
        this.g = new abuz(aqmhVar);
        this.h = null;
        this.e = true == TextUtils.isEmpty(str3) ? null : str3;
        this.f = z;
    }

    private static aqmh a(abuz abuzVar) {
        if (abuzVar != null) {
            return abuzVar.l();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rmv) {
            rmv rmvVar = (rmv) obj;
            if (Objects.equals(this.b, rmvVar.b) && Objects.equals(this.c, rmvVar.c) && Objects.equals(this.d, rmvVar.d) && Objects.equals(a(this.g), a(rmvVar.g)) && Objects.equals(a(this.h), a(rmvVar.h)) && Objects.equals(this.e, rmvVar.e) && this.f == rmvVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, a(this.g), a(this.h), this.e, Boolean.valueOf(this.f));
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("accountEmail", this.b);
        ageuVarAc.b("accountNameProto", this.c);
        ageuVarAc.b("accountName", this.d);
        ageuVarAc.b("accountPhotoThumbnails", a(this.g));
        ageuVarAc.b("mobileBannerThumbnails", a(this.h));
        ageuVarAc.b("channelRoleText", this.e);
        ageuVarAc.g("isChannelHidden", this.f);
        return ageuVarAc.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rmv(String str, wnq wnqVar) {
        alay alayVar = wnqVar.a.d;
        alay alayVar2 = alayVar == null ? alay.a : alayVar;
        abuz abuzVarQ = wnqVar.q();
        if (wnqVar.g == null) {
            airb airbVar = wnqVar.a;
            if ((airbVar.c & 2) != 0) {
                aqmh aqmhVar = airbVar.q;
                wnqVar.g = new abuz(aqmhVar == null ? aqmh.a : aqmhVar);
            }
        }
        this(str, alayVar2, abuzVarQ, wnqVar.g, null, false);
    }

    public rmv(String str, alay alayVar, abuz abuzVar, abuz abuzVar2, String str2, boolean z) {
        int i = typ.a;
        if (!ahno.aa(str)) {
            this.b = str;
            alayVar.getClass();
            this.c = alayVar;
            this.d = ackj.k(null, alayVar, null, false);
            this.g = abuzVar;
            this.h = abuzVar2;
            this.e = true == TextUtils.isEmpty(str2) ? null : str2;
            this.f = z;
            return;
        }
        throw new IllegalArgumentException();
    }

    public rmv(String str, String str2, Uri uri) {
        this.b = str2;
        this.c = null;
        this.d = !TextUtils.isEmpty(str) ? new SpannableStringBuilder(str) : null;
        this.g = uri != null ? new abuz(uri) : null;
        this.h = null;
        this.e = null;
        this.f = false;
    }

    private rmv() {
        this.b = "";
        this.c = null;
        this.d = new SpannableStringBuilder();
        this.g = null;
        this.h = null;
        this.e = null;
        this.f = false;
    }
}
