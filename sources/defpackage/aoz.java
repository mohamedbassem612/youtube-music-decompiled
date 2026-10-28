package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aoz implements CharSequence {
    public final List a;
    public final String b;
    private final List c;

    public aoz(List list, String str) {
        this.a = list;
        this.b = str;
        if (list == null || list.size() <= 0) {
            this.c = null;
        } else {
            throw null;
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aoz) {
            aoz aozVar = (aoz) obj;
            if (awrc.c(this.b, aozVar.b) && awrc.c(this.a, aozVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ /* synthetic */ CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            apb.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        String strSubstring = this.b.substring(i, i2);
        strSubstring.getClass();
        List list = this.a;
        int i3 = apa.a;
        if (i > i2) {
            apb.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    aoy aoyVar = (aoy) list.get(i4);
                    int i5 = aoyVar.a;
                    int i6 = aoyVar.b;
                    if (((i != 0 ? 0 : 1) | ((i >>> 31) & (i2 > 0 ? 1 : 0))) != 0) {
                        throw null;
                    }
                    i4++;
                } else if (true != arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
        }
        return new aoz(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }
}
