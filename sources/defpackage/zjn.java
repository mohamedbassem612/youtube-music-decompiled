package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjn extends ept {
    public final aioy a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final Integer f;

    public zjn(aioy aioyVar, boolean z, boolean z2, boolean z3, int i, Integer num) {
        this.a = aioyVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = num;
    }

    static zjm t(aioy aioyVar, Integer num) {
        zjm zjmVar = new zjm();
        zjmVar.a = aioyVar;
        zjmVar.b = num;
        zjmVar.b(false);
        zjmVar.c(false);
        zjmVar.d(false);
        zjmVar.e(0);
        return zjmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zjn)) {
            return false;
        }
        zjn zjnVar = (zjn) obj;
        return this.b == zjnVar.b && this.c == zjnVar.c && this.d == zjnVar.d && this.e == zjnVar.e && Objects.equals(this.a, zjnVar.a) && Objects.equals(this.f, zjnVar.f);
    }

    public final int hashCode() {
        return (((((((((a.aj(this.b) * 31) + a.aj(this.c)) * 31) + a.aj(this.d)) * 31) + this.e) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.f);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(this.e), this.f};
        String[] strArrSplit = "codec;drmSupported;hdrSupported;isHardware;maxSoftwareHeight;maxFramerate".split(";");
        StringBuilder sb = new StringBuilder("zjn[");
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
