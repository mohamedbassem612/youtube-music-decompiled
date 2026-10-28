package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.math.BigInteger;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class kdc {
    private static final khn a = new khn("ApplicationAnalyticsUtils", (String) null);
    private static final String b = "23.0.0";
    private final String c;
    private final Map d;
    private final Map e;

    public kdc(Bundle bundle, String str) {
        this.c = str;
        this.d = kro.v(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.e = kro.v(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    public static void d(aihf aihfVar, boolean z) {
        agzo agzoVar = ((agzp) aihfVar.instance).k;
        if (agzoVar == null) {
            agzoVar = agzo.a;
        }
        aihf aihfVarCreateBuilder = agzo.a.createBuilder(agzoVar);
        aihfVarCreateBuilder.copyOnWrite();
        agzo agzoVar2 = (agzo) aihfVarCreateBuilder.instance;
        agzoVar2.b |= 2;
        agzoVar2.d = z;
        aihfVar.copyOnWrite();
        agzp agzpVar = (agzp) aihfVar.instance;
        agzo agzoVar3 = (agzo) aihfVarCreateBuilder.build();
        agzoVar3.getClass();
        agzpVar.k = agzoVar3;
        agzpVar.c |= 4;
    }

    public final agzp a(kdb kdbVar) {
        return (agzp) c(kdbVar).build();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public final agzp b(kdb kdbVar, int i) {
        int iIntValue;
        int iIntValue2;
        aihf aihfVarC = c(kdbVar);
        agzo agzoVar = ((agzp) aihfVarC.instance).k;
        if (agzoVar == null) {
            agzoVar = agzo.a;
        }
        aihf aihfVarCreateBuilder = agzo.a.createBuilder(agzoVar);
        Map map = this.e;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            if (map.containsKey(numValueOf)) {
                Integer num = (Integer) map.get(numValueOf);
                kro.l(num);
                iIntValue = num.intValue();
            } else {
                iIntValue = i + 10000;
            }
        } else {
            iIntValue = i + 10000;
        }
        aihfVarCreateBuilder.copyOnWrite();
        agzo agzoVar2 = (agzo) aihfVarCreateBuilder.instance;
        agzoVar2.b |= 64;
        agzoVar2.f = iIntValue;
        Map map2 = this.d;
        if (map2 != null) {
            Integer numValueOf2 = Integer.valueOf(i);
            if (map2.containsKey(numValueOf2)) {
                Integer num2 = (Integer) map2.get(numValueOf2);
                kro.l(num2);
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = i + 10000;
            }
        } else {
            iIntValue2 = i + 10000;
        }
        aihfVarCreateBuilder.copyOnWrite();
        agzo agzoVar3 = (agzo) aihfVarCreateBuilder.instance;
        agzoVar3.b |= SemanticState.Focused;
        agzoVar3.g = iIntValue2;
        agzo agzoVar4 = (agzo) aihfVarCreateBuilder.build();
        aihfVarC.copyOnWrite();
        agzp agzpVar = (agzp) aihfVarC.instance;
        agzoVar4.getClass();
        agzpVar.k = agzoVar4;
        agzpVar.c |= 4;
        return (agzp) aihfVarC.build();
    }

    public final aihf c(kdb kdbVar) {
        long jLongValue;
        aihf aihfVarCreateBuilder = agzp.a.createBuilder();
        long j = kdbVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        agzp agzpVar = (agzp) aihfVarCreateBuilder.instance;
        agzpVar.b |= 2;
        agzpVar.d = j;
        int i = kdbVar.f;
        kdbVar.f = i + 1;
        aihfVarCreateBuilder.copyOnWrite();
        agzp agzpVar2 = (agzp) aihfVarCreateBuilder.instance;
        agzpVar2.c |= 1;
        agzpVar2.j = i;
        String str = kdbVar.d;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            agzp agzpVar3 = (agzp) aihfVarCreateBuilder.instance;
            agzpVar3.b |= 262144;
            agzpVar3.i = str;
        }
        aihf aihfVarCreateBuilder2 = agzy.a.createBuilder();
        if (!TextUtils.isEmpty(kdbVar.i)) {
            String str2 = kdbVar.i;
            aihfVarCreateBuilder.copyOnWrite();
            agzp agzpVar4 = (agzp) aihfVarCreateBuilder.instance;
            str2.getClass();
            agzpVar4.b |= SemanticState.Modal;
            agzpVar4.e = str2;
            String str3 = kdbVar.i;
            aihfVarCreateBuilder2.copyOnWrite();
            agzy agzyVar = (agzy) aihfVarCreateBuilder2.instance;
            str3.getClass();
            agzyVar.b |= 1;
            agzyVar.c = str3;
        }
        if (!TextUtils.isEmpty(kdbVar.j)) {
            String str4 = kdbVar.j;
            aihfVarCreateBuilder2.copyOnWrite();
            agzy agzyVar2 = (agzy) aihfVarCreateBuilder2.instance;
            str4.getClass();
            agzyVar2.b |= 2;
            agzyVar2.d = str4;
        }
        if (!TextUtils.isEmpty(kdbVar.k)) {
            String str5 = kdbVar.k;
            aihfVarCreateBuilder2.copyOnWrite();
            agzy agzyVar3 = (agzy) aihfVarCreateBuilder2.instance;
            str5.getClass();
            agzyVar3.b |= 4;
            agzyVar3.e = str5;
        }
        if (!TextUtils.isEmpty(kdbVar.l)) {
            String str6 = kdbVar.l;
            aihfVarCreateBuilder2.copyOnWrite();
            agzy agzyVar4 = (agzy) aihfVarCreateBuilder2.instance;
            str6.getClass();
            agzyVar4.b |= 8;
            agzyVar4.f = str6;
        }
        if (!TextUtils.isEmpty(kdbVar.m)) {
            String str7 = kdbVar.m;
            aihfVarCreateBuilder2.copyOnWrite();
            agzy agzyVar5 = (agzy) aihfVarCreateBuilder2.instance;
            str7.getClass();
            agzyVar5.b |= 16;
            agzyVar5.g = str7;
        }
        if (!TextUtils.isEmpty(kdbVar.n)) {
            String str8 = kdbVar.n;
            aihfVarCreateBuilder2.copyOnWrite();
            agzy agzyVar6 = (agzy) aihfVarCreateBuilder2.instance;
            str8.getClass();
            agzyVar6.b |= 32;
            agzyVar6.h = str8;
        }
        int iP = ket.p(kdbVar.o);
        aihfVarCreateBuilder2.copyOnWrite();
        agzy agzyVar7 = (agzy) aihfVarCreateBuilder2.instance;
        agzyVar7.i = iP - 1;
        agzyVar7.b |= SemanticState.Focused;
        agzy agzyVar8 = (agzy) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        agzp agzpVar5 = (agzp) aihfVarCreateBuilder.instance;
        agzyVar8.getClass();
        agzpVar5.p = agzyVar8;
        agzpVar5.c |= 67108864;
        aihf aihfVarCreateBuilder3 = agzn.a.createBuilder();
        String str9 = b;
        aihfVarCreateBuilder3.copyOnWrite();
        agzn agznVar = (agzn) aihfVarCreateBuilder3.instance;
        str9.getClass();
        agznVar.b |= 2;
        agznVar.d = str9;
        String str10 = this.c;
        aihfVarCreateBuilder3.copyOnWrite();
        agzn agznVar2 = (agzn) aihfVarCreateBuilder3.instance;
        str10.getClass();
        agznVar2.b |= 1;
        agznVar2.c = str10;
        aihfVarCreateBuilder.am((agzn) aihfVarCreateBuilder3.build());
        aihf aihfVarCreateBuilder4 = agzo.a.createBuilder();
        if (kdbVar.c != null) {
            aihf aihfVarCreateBuilder5 = agzw.a.createBuilder();
            String str11 = kdbVar.c;
            aihfVarCreateBuilder5.copyOnWrite();
            agzw agzwVar = (agzw) aihfVarCreateBuilder5.instance;
            str11.getClass();
            agzwVar.b |= 1;
            agzwVar.c = str11;
            agzw agzwVar2 = (agzw) aihfVarCreateBuilder5.build();
            aihfVarCreateBuilder4.copyOnWrite();
            agzo agzoVar = (agzo) aihfVarCreateBuilder4.instance;
            agzwVar2.getClass();
            agzoVar.c = agzwVar2;
            agzoVar.b |= 1;
        }
        aihfVarCreateBuilder4.copyOnWrite();
        agzo agzoVar2 = (agzo) aihfVarCreateBuilder4.instance;
        agzoVar2.b |= 2;
        agzoVar2.d = false;
        String str12 = kdbVar.g;
        if (str12 != null) {
            try {
                String strReplace = str12.replace("-", "");
                jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                a.f(e, str12);
                jLongValue = 0;
            }
            aihfVarCreateBuilder4.copyOnWrite();
            agzo agzoVar3 = (agzo) aihfVarCreateBuilder4.instance;
            agzoVar3.b |= 4;
            agzoVar3.e = jLongValue;
        }
        int i2 = kdbVar.h;
        aihfVarCreateBuilder4.copyOnWrite();
        agzo agzoVar4 = (agzo) aihfVarCreateBuilder4.instance;
        agzoVar4.b |= SemanticState.ReadOnly;
        agzoVar4.h = i2;
        boolean zF = kdbVar.b.f();
        aihfVarCreateBuilder4.copyOnWrite();
        agzo agzoVar5 = (agzo) aihfVarCreateBuilder4.instance;
        agzoVar5.b |= SemanticState.Modal;
        agzoVar5.i = zF;
        boolean z = kdbVar.p;
        aihfVarCreateBuilder4.copyOnWrite();
        agzo agzoVar6 = (agzo) aihfVarCreateBuilder4.instance;
        agzoVar6.b |= 16384;
        agzoVar6.l = z;
        aihfVarCreateBuilder.copyOnWrite();
        agzp agzpVar6 = (agzp) aihfVarCreateBuilder.instance;
        agzo agzoVar7 = (agzo) aihfVarCreateBuilder4.build();
        agzoVar7.getClass();
        agzpVar6.k = agzoVar7;
        agzpVar6.c |= 4;
        return aihfVarCreateBuilder;
    }
}
