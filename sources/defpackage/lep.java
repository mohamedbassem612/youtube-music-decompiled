package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lep implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ leq e;

    public lep(leq leqVar, boolean z, Uri uri, String str, String str2) {
        this.a = z;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = leqVar;
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x022f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:560), block:B:96:0x022f */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleT;
        leq leqVar;
        leq leqVar2 = this.e;
        ler lerVar = leqVar2.a;
        lerVar.o();
        Uri uri = this.b;
        String str = this.d;
        try {
            lga lgaVarL = lerVar.L();
            String str2 = "utm_medium";
            String str3 = "Activity created with data 'referrer' without required params";
            if (TextUtils.isEmpty(str)) {
                bundleT = null;
            } else if (TextUtils.isEmpty(str) || !(str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id"))) {
                lgaVarL.aT().j.a("Activity created with data 'referrer' without required params");
                bundleT = null;
            } else {
                bundleT = lgaVarL.t(lga.ax(str));
                if (bundleT != null) {
                    bundleT.putString("_cis", "referrer");
                }
            }
            String str4 = this.c;
            try {
                if (this.a) {
                    Bundle bundleT2 = lerVar.L().t(uri);
                    if (bundleT2 != null) {
                        bundleT2.putString("_cis", "intent");
                        if (!bundleT2.containsKey("gclid") && bundleT != null && bundleT.containsKey("gclid")) {
                            bundleT2.putString("_cer", String.format("gclid=%s", bundleT.getString("gclid")));
                        }
                        aurt.c();
                        if (lerVar.G().F(null, lcl.aF) && lerVar.L().aj(lerVar.h().v())) {
                            lerVar.L().E(bundleT2, uri, true);
                        }
                        lerVar.N(str4, "_cmp", bundleT2);
                        lerVar.i.b(str4, bundleT2);
                    } else {
                        str2 = "utm_medium";
                        str3 = "Activity created with data 'referrer' without required params";
                        aurt.c();
                        if (lerVar.G().F(null, lcl.aF) && lerVar.L().aj(lerVar.h().v()) && uri.isHierarchical()) {
                            Bundle bundle = new Bundle();
                            lerVar.L().E(bundle, uri, false);
                            bundle.putString("_cis", "intent");
                            lerVar.N(str4, "_cmp", bundle);
                        }
                    }
                } else {
                    str2 = "utm_medium";
                    str3 = "Activity created with data 'referrer' without required params";
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                lerVar.aT().j.b("Activity created with referrer", str);
                if (!lerVar.G().F(null, lcl.aE)) {
                    if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains(str2) && !str.contains("utm_term") && !str.contains("utm_content"))) {
                        lerVar.aT().j.a(str3);
                        return;
                    } else {
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        lerVar.al(str);
                        return;
                    }
                }
                if (bundleT != null) {
                    aurt.c();
                    if (lerVar.G().F(null, lcl.aF) && lerVar.L().aj(lerVar.h().v())) {
                        lerVar.L();
                        Uri uriAx = lga.ax(str);
                        if (uriAx != null) {
                            lerVar.L().E(bundleT, uriAx, true);
                        }
                    }
                    lerVar.N(str4, "_cmp", bundleT);
                    lerVar.i.b(str4, bundleT);
                } else {
                    lerVar.aT().j.b("Referrer does not contain valid parameters", str);
                    aurt.c();
                    if (lerVar.G().F(null, lcl.aF) && lerVar.L().aj(lerVar.h().v())) {
                        lerVar.L();
                        Uri uriAx2 = lga.ax(str);
                        Bundle bundle2 = new Bundle();
                        lerVar.L().E(bundle2, uriAx2, false);
                        bundle2.putString("_cis", "referrer");
                        lerVar.N(str4, "_cmp", bundle2);
                    }
                }
                lerVar.al(null);
            } catch (RuntimeException e) {
                e = e;
                leqVar2 = leqVar;
                leqVar2.a.aT().c.b("Throwable caught in handleReferrerForOnActivityCreated", e);
            }
        } catch (RuntimeException e2) {
            e = e2;
        }
    }
}
