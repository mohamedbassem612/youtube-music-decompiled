package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acww extends ept {
    public final String a;
    public final alay b;
    public final ajnf c;
    public final ajnf d;
    public final boolean e;
    public final ajwo f;
    public final acwm g;

    public acww(String str, alay alayVar, ajnf ajnfVar, ajnf ajnfVar2, boolean z, ajwo ajwoVar, acwm acwmVar) {
        this.a = str;
        this.b = alayVar;
        this.c = ajnfVar;
        this.d = ajnfVar2;
        this.e = z;
        this.f = ajwoVar;
        this.g = acwmVar;
    }

    public static acwf t() {
        acwf acwfVar = new acwf();
        acwfVar.b(true);
        return acwfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acww)) {
            return false;
        }
        acww acwwVar = (acww) obj;
        return this.e == acwwVar.e && Objects.equals(this.a, acwwVar.a) && Objects.equals(this.b, acwwVar.b) && Objects.equals(this.c, acwwVar.c) && Objects.equals(this.d, acwwVar.d) && Objects.equals(this.f, acwwVar.f) && Objects.equals(this.g, acwwVar.g);
    }

    public final int hashCode() {
        return (((((((((((a.aj(this.e) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.g);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, this.g};
        String[] strArrSplit = "title;message;confirmButton;cancelButton;cancelable;triggeringCommand;listener".split(";");
        StringBuilder sb = new StringBuilder("acww[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
