package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgd {
    public static final lgd a = new lgd((Boolean) null, 100, (Boolean) null, (String) null);
    public final int b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final EnumMap f;

    public lgd(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(lgg.class);
        this.f = enumMap;
        lgg lggVar = lgg.AD_USER_DATA;
        lgh lghVar = lgh.a;
        enumMap.put(lggVar, bool == null ? lge.UNINITIALIZED : bool.booleanValue() ? lge.GRANTED : lge.DENIED);
        this.b = i;
        this.c = e();
        this.d = bool2;
        this.e = str;
    }

    public static lgd a(Bundle bundle, int i) {
        if (bundle == null) {
            return new lgd((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(lgg.class);
        for (lgg lggVar : lgf.DMA.c) {
            enumMap.put(lggVar, lgh.b(bundle.getString(lggVar.e)));
        }
        return new lgd(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static lgd b(String str) {
        if (str == null || str.length() <= 0) {
            return a;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(lgg.class);
        lgg[] lggVarArr = lgf.DMA.c;
        int length = lggVarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(lggVarArr[i3], lgh.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new lgd(enumMap, i, (Boolean) null, (String) null);
    }

    public static Boolean d(Bundle bundle) {
        if (bundle != null) {
            lge lgeVarB = lgh.b(bundle.getString("ad_personalization"));
            lge lgeVar = lge.UNINITIALIZED;
            int iOrdinal = lgeVarB.ordinal();
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal == 3) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    private final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        for (lgg lggVar : lgf.DMA.c) {
            sb.append(':');
            sb.append(lgh.a((lge) this.f.get(lggVar)));
        }
        return sb.toString();
    }

    public final lge c() {
        lge lgeVar = (lge) this.f.get(lgg.AD_USER_DATA);
        return lgeVar == null ? lge.UNINITIALIZED : lgeVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lgd) {
            lgd lgdVar = (lgd) obj;
            if (this.c.equalsIgnoreCase(lgdVar.c) && Objects.equals(this.d, lgdVar.d)) {
                return Objects.equals(this.e, lgdVar.e);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.d;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.e;
        return this.c.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(lgh.i(this.b));
        for (lgg lggVar : lgf.DMA.c) {
            sb.append(',');
            sb.append(lggVar.e);
            sb.append('=');
            lge lgeVar = (lge) this.f.get(lggVar);
            if (lgeVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = lgeVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.d;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.e;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public lgd(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(lgg.class);
        this.f = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
        this.c = e();
        this.d = bool;
        this.e = str;
    }
}
