package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lji extends kmz implements ljt {
    public static final /* synthetic */ int a = 0;
    private static final khn e;
    private static final kro f;
    private static final kro g;
    private String b;
    private String c;
    private int d;

    static {
        kro kroVar = new kro();
        g = kroVar;
        ljg ljgVar = new ljg();
        f = ljgVar;
        e = new khn("MobileDataPlan.API", ljgVar, kroVar);
    }

    public lji(Context context, ljs ljsVar) {
        super(context, null, e, ljsVar, kmy.a);
        String packageName = context.getApplicationContext().getPackageName();
        this.b = packageName;
        try {
            if (packageName == null) {
                throw new PackageManager.NameNotFoundException();
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.b, 0);
            this.c = packageInfo.versionName;
            this.d = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            this.b = "PACKAGE_NAME_NOT_FOUND";
            this.c = "PACKAGE_VERSION_NOT_FOUND";
            this.d = -1;
        }
    }

    @Override // defpackage.ljt
    public final lpa a(ljj ljjVar) {
        kro.j(ljjVar.a, "getCarrierPlanId needs a valid API key provided by GTAF team.");
        lqa lqaVar = new lqa(ljjVar);
        Bundle bundle = ljjVar.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("client_package_name", this.b);
        bundle.putString("client_version_name", this.c);
        bundle.putLong("client_version_code", this.d);
        ((ljj) lqaVar.a).b = bundle;
        kpj kpjVar = new kpj();
        kpjVar.c = 16201;
        kpjVar.a = new kak(lqaVar, 7);
        return super.A(1, kpjVar.a());
    }
}
