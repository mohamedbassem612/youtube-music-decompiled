package defpackage;

import j$.util.Objects;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vaa extends ept {
    public static final vaa a = new vaa("NORMAL", "NORMAL".toLowerCase(Locale.ENGLISH), "", ardj.EFFECT_SUBPACKAGE_ID_UNSPECIFIED, agpn.b);
    public final String b;
    public final String c;
    public final String d;
    public final aufh e;
    private final ardj f;
    private final Map g;

    public vaa(String str, String str2, String str3, ardj ardjVar, Map map, aufh aufhVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = ardjVar;
        this.g = map;
        this.e = aufhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vaa)) {
            return false;
        }
        vaa vaaVar = (vaa) obj;
        return Objects.equals(this.b, vaaVar.b) && Objects.equals(this.c, vaaVar.c) && Objects.equals(this.d, vaaVar.d) && Objects.equals(this.f, vaaVar.f) && Objects.equals(this.g, vaaVar.g) && Objects.equals(this.e, vaaVar.e);
    }

    public final int hashCode() {
        return (((((((((Objects.hashCode(this.b) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.b, this.c, this.d, this.f, this.g, this.e};
        String[] strArrSplit = "effectName;effectBaseName;assetLoggingId;subpackageId;userControlValues;timeRange".split(";");
        StringBuilder sb = new StringBuilder("vaa[");
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

    public vaa(String str, String str2, String str3, ardj ardjVar, Map map) {
        this(str, str2, str3, ardjVar, map, aufh.a);
    }
}
