package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class paf implements pae {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final Map c;
    private final pls d;
    private final pwf e;
    private final ijt f;

    public paf(Context context, Map map, pav pavVar, pls plsVar, pwf pwfVar, ijt ijtVar) {
        context.getClass();
        pavVar.getClass();
        plsVar.getClass();
        pwfVar.getClass();
        ijtVar.getClass();
        this.b = context;
        this.c = map;
        this.d = plsVar;
        this.e = pwfVar;
        this.f = ijtVar;
    }

    @Override // defpackage.pae
    public final pky a(String str, Bundle bundle) {
        String upperCase;
        String strName;
        String strValueOf;
        awmd awmdVar;
        qbh qbhVar = null;
        if (str != null && str.length() != 0 && (awmdVar = (awmd) this.c.get(str)) != null) {
            qbhVar = (qbh) awmdVar.io();
        }
        if (qbhVar == null) {
            ((agsj) a.b()).w("ChimeTask NOT found. key: '%s'", str);
            return new pkv(new Exception("ChimeTask NOT found."), pkx.aR);
        }
        pwf pwfVar = this.e;
        Context context = this.b;
        pls plsVar = this.d;
        ijt ijtVar = this.f;
        String packageName = context.getPackageName();
        int i = Build.VERSION.SDK_INT;
        String strD = qbhVar.d();
        Boolean bool = (Boolean) ijtVar.h().d();
        if (bool == null || (strValueOf = String.valueOf(bool.booleanValue())) == null) {
            upperCase = "CHECK_FAILED";
        } else {
            upperCase = strValueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
        }
        String str2 = upperCase;
        String str3 = plsVar.a;
        pwfVar.d(packageName, str3, i, false, strD, str2);
        pky pkyVarB = qbhVar.b(bundle);
        String packageName2 = context.getPackageName();
        int i2 = Build.VERSION.SDK_INT;
        String strD2 = qbhVar.d();
        String strE = pkyVarB.e();
        pkx pkxVarC = pkyVarB.c();
        if (pkxVarC == null || (strName = pkxVarC.name()) == null) {
            strName = "";
        }
        pwfVar.c(packageName2, str3, i2, false, strD2, false, strE, strName, qnl.ae(context));
        return pkyVarB;
    }
}
