package defpackage;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sga implements zzi {
    public Map a;
    public boolean c;
    public long d;
    public skm e;
    private final String g;
    private final Random h;
    private final sel i;
    private String j;
    private String k;
    private slm l = null;
    private long m = 0;
    public aaxo b = null;

    public sga(String str, Random random, sel selVar) {
        this.h = random;
        this.g = "a.".concat(String.valueOf(str));
        this.i = selVar;
        selVar.a();
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        wgl wglVar;
        sel selVar;
        Integer num = (Integer) sfz.a.get(str);
        if (num == null) {
            return null;
        }
        if (!zzj.f(this.a, str, uri)) {
            return (String) sfz.b.get(str);
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            skm skmVar = this.e;
            return (skmVar == null || skmVar.b() == null) ? "" : this.e.b().toString();
        }
        if (iIntValue == 2) {
            return Integer.toString(this.h.nextInt(89999999) + 10000000);
        }
        if (iIntValue == 3) {
            return "00:00:00.000";
        }
        if (iIntValue == 11) {
            slm slmVar = this.l;
            return slmVar != null ? Integer.toString(slmVar.e) : "0";
        }
        if (iIntValue == 32) {
            return "0";
        }
        if (iIntValue == 59) {
            if (this.e == null) {
                return "0";
            }
            long j = this.d;
            return j > 0 ? Long.toString(j) : "0";
        }
        if (iIntValue == 65) {
            return "";
        }
        if (iIntValue == 73) {
            return "0";
        }
        if (iIntValue == 70) {
            sel selVar2 = this.i;
            return selVar2.b != null ? selVar2.b : "";
        }
        if (iIntValue == 71) {
            return this.i.b != null ? "advertisingid" : "";
        }
        switch (iIntValue) {
            case 5:
                return TextUtils.join(",", (Iterable) null);
            case 6:
                if (this.e != null) {
                    return null;
                }
                return "";
            case 7:
                skm skmVar2 = this.e;
                return skmVar2 != null ? Integer.toString(skmVar2.a.a() * 1000) : "0";
            case 8:
                if (this.e != null) {
                    return null;
                }
                return "";
            case 9:
                skm skmVar3 = this.e;
                return (skmVar3 == null || TextUtils.isEmpty(skmVar3.f())) ? "0" : this.e.f();
            default:
                switch (iIntValue) {
                    case 13:
                        return "0";
                    case 14:
                        String str2 = this.k;
                        return str2 != null ? str2 : "";
                    case 15:
                        String str3 = this.j;
                        return str3 != null ? str3 : "";
                    default:
                        switch (iIntValue) {
                            case 18:
                                return "detailpage";
                            case 19:
                                skm skmVar4 = this.e;
                                return (skmVar4 == null || skmVar4.c() == null) ? "0" : this.e.c().g;
                            case 20:
                                skm skmVar5 = this.e;
                                if (skmVar5 == null) {
                                    return "0";
                                }
                                smc smcVar = skmVar5.a;
                                if ((smcVar instanceof sna ? (sna) smcVar : null) != null) {
                                    wglVar = wgl.SURVEY;
                                } else {
                                    wglVar = smcVar.A() ? wgl.SKIPPABLE : wgl.NONE;
                                }
                                return wglVar.d;
                            case 21:
                                return this.e != null ? "2" : "0";
                            default:
                                switch (iIntValue) {
                                    case 26:
                                        slm slmVar2 = this.l;
                                        if (slmVar2 == null || slmVar2 != slm.MID_ROLL) {
                                            return "0";
                                        }
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        return Long.toString(this.m / 1000);
                                    case 27:
                                        aaxo aaxoVar = this.b;
                                        if (aaxoVar != null) {
                                            return Integer.toString(aaxoVar.d);
                                        }
                                        break;
                                    case 28:
                                        aaxo aaxoVar2 = this.b;
                                        return aaxoVar2 != null ? aaxoVar2.a.a() : "0";
                                    case 29:
                                        aaxo aaxoVar3 = this.b;
                                        if (aaxoVar3 != null) {
                                            return Integer.toString(aaxoVar3.c);
                                        }
                                        break;
                                    case 30:
                                        return "";
                                    default:
                                        switch (iIntValue) {
                                            case 35:
                                                skm skmVar6 = this.e;
                                                return (skmVar6 == null || (skmVar6.a instanceof ski)) ? "0" : "1";
                                            case 36:
                                                if (this.a == null) {
                                                    return "";
                                                }
                                                selVar = this.i;
                                                if (selVar.b == null) {
                                                    return "";
                                                }
                                                break;
                                            case 37:
                                                return "DROID";
                                            case 38:
                                                return Build.VERSION.RELEASE;
                                            case 39:
                                                return "UNWN";
                                            case 40:
                                                return "MBL";
                                            case 41:
                                                return this.g;
                                            case 42:
                                                return "a";
                                            case 43:
                                                return "android";
                                            case 44:
                                                return Build.MODEL;
                                            case 45:
                                                if (this.a == null) {
                                                    return "none";
                                                }
                                                selVar = this.i;
                                                if (selVar.b == null) {
                                                    return "none";
                                                }
                                                break;
                                            default:
                                                switch (iIntValue) {
                                                    case 50:
                                                        return (this.e == null || this.d <= 0) ? "0.0" : String.format(Locale.US, "%.1f", Double.valueOf(this.d / 1000.0d));
                                                    case 51:
                                                        skm skmVar7 = this.e;
                                                        if (skmVar7 == null || TextUtils.isEmpty(skmVar7.e())) {
                                                            return null;
                                                        }
                                                        return this.e.e();
                                                    case 52:
                                                        if (this.e != null) {
                                                            return this.c ? "playing" : "pause";
                                                        }
                                                        return "";
                                                    default:
                                                        return null;
                                                }
                                        }
                                        return selVar.b;
                                }
                                return "-1";
                        }
                }
        }
    }

    @Override // defpackage.zzi
    public final String b() {
        return "sga";
    }

    public final sfy c(ofg ofgVar) {
        return new sfy(ofgVar, this.a);
    }

    public final void d(Long l, slm slmVar) {
        this.m = l.longValue();
        this.l = slmVar;
        agpn agpnVar = (agpn) skl.a;
        int i = agpnVar.d;
        int i2 = zzj.b;
        HashMap map = new HashMap(i);
        agqr it = ((agpk) agpnVar.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            ArrayList arrayList = new ArrayList(((List) entry.getValue()).size());
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                arrayList.add(Pattern.compile((String) it2.next(), 0));
            }
            if (!arrayList.isEmpty()) {
                map.put(str, arrayList);
            }
        }
        this.a = map;
    }

    public final void e(String str, String str2) {
        this.j = str2;
        this.k = str;
    }
}
