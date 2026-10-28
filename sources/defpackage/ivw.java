package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.OptionalLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ivw {
    public final aqgt a;
    public final aqgk b;
    public final CharSequence c;
    public final ajwo d;
    public final int e;
    public final qcb f;
    private final int g;
    private final int h;

    public ivw(int i, aqgt aqgtVar, aqgk aqgkVar, qcb qcbVar, CharSequence charSequence, int i2, int i3, ajwo ajwoVar) {
        this.e = i;
        this.a = aqgtVar;
        this.b = aqgkVar;
        this.f = qcbVar;
        this.c = charSequence;
        this.h = i2;
        this.g = i3;
        this.d = ajwoVar;
    }

    public final OptionalLong a() {
        int i = this.e;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            aqgt aqgtVar = this.a;
            aqgtVar.getClass();
            return (aqgtVar.b & SemanticState.Modal) != 0 ? OptionalLong.of(aqgtVar.i) : OptionalLong.empty();
        }
        if (i2 != 2) {
            return OptionalLong.empty();
        }
        aqgk aqgkVar = this.b;
        aqgkVar.getClass();
        return (aqgkVar.b & 64) != 0 ? OptionalLong.of(aqgkVar.g) : OptionalLong.empty();
    }

    public final boolean equals(Object obj) {
        aqgt aqgtVar;
        aqgk aqgkVar;
        qcb qcbVar;
        CharSequence charSequence;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ivw) {
            ivw ivwVar = (ivw) obj;
            int i = this.e;
            int i2 = ivwVar.e;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && ((aqgtVar = this.a) != null ? aqgtVar.equals(ivwVar.a) : ivwVar.a == null) && ((aqgkVar = this.b) != null ? aqgkVar.equals(ivwVar.b) : ivwVar.b == null) && ((qcbVar = this.f) != null ? qcbVar.equals(ivwVar.f) : ivwVar.f == null) && ((charSequence = this.c) != null ? charSequence.equals(ivwVar.c) : ivwVar.c == null)) {
                int i3 = this.h;
                int i4 = ivwVar.h;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4 && this.g == ivwVar.g) {
                    ajwo ajwoVar = this.d;
                    if (ajwoVar == null) {
                        if (ivwVar.d == null) {
                            return true;
                        }
                    } else if (ajwoVar.equals(ivwVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        a.bj(i);
        aqgt aqgtVar = this.a;
        int iHashCode = aqgtVar == null ? 0 : aqgtVar.hashCode();
        int i2 = i ^ 385623362;
        aqgk aqgkVar = this.b;
        int iHashCode2 = aqgkVar == null ? 0 : aqgkVar.hashCode();
        int i3 = (i2 * 1000003) ^ iHashCode;
        qcb qcbVar = this.f;
        int iHashCode3 = ((((i3 * 1000003) ^ iHashCode2) * 1000003) ^ (qcbVar == null ? 0 : qcbVar.hashCode())) * 1000003;
        CharSequence charSequence = this.c;
        int iHashCode4 = (iHashCode3 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        int i4 = this.h;
        a.by(i4);
        int i5 = (((iHashCode4 ^ i4) * 1000003) ^ this.g) * 1000003;
        ajwo ajwoVar = this.d;
        return (i5 ^ (ajwoVar != null ? ajwoVar.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String str;
        int i = this.e;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "CHECKBOX";
        } else {
            str = "SINGLE_OPTION";
        }
        aqgt aqgtVar = this.a;
        aqgk aqgkVar = this.b;
        qcb qcbVar = this.f;
        CharSequence charSequence = this.c;
        int i2 = this.h;
        int i3 = this.g;
        ajwo ajwoVar = this.d;
        return "SurveyModel{counterfactual=false, surveyType=" + str + ", singleOptionSurvey=" + String.valueOf(aqgtVar) + ", checkboxSurvey=" + String.valueOf(aqgkVar) + ", responseListener=" + String.valueOf(qcbVar) + ", question=" + String.valueOf(charSequence) + ", displayTime=" + (i2 != 0 ? Integer.toString(i2 - 1) : "null") + ", displayDelaySec=" + i3 + ", dismissalEndpoint=" + String.valueOf(ajwoVar) + ", cpn=null}";
    }

    public ivw() {
        throw null;
    }
}
