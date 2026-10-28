package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import j$.util.Optional;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cmw implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cmw(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [byd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [byd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r0v3, types: [byd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r0v63, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v35, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v58, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [byd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        switch (this.$cid) {
            case 0:
                return cmy.b((Class) this.a, this.b);
            case 1:
                return cmy.b((Class) this.a, this.b);
            case 2:
                return cmy.b((Class) this.a, this.b);
            case 3:
                cmx cmxVar = (cmx) this.a;
                coi coiVar = new coi(this.b, cmxVar.a);
                coiVar.d = cmxVar.g;
                return coiVar;
            case 4:
                Object obj = this.b;
                synchronized (this.a) {
                    String strA = qel.a();
                    String str = strA + ".trace";
                    File file = new File(((Context) obj).getFilesDir(), a.ce(strA, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        return agdf.a;
                    }
                    File file2 = new File(file, str);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        break;
                    } catch (RuntimeException unused) {
                    }
                    return agev.i(file2);
                }
            case 5:
                Object obj2 = this.a;
                try {
                    return Integer.valueOf(((PackageManager) ((yre) this.b).c).getPackageInfo((String) obj2, 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused2) {
                    Log.w("PhenotypeResourceReader", "Failed to find version of package ".concat(String.valueOf(obj2)));
                    return null;
                }
            case 6:
                return ((axfd) this.b).C(this.a, null);
            case 7:
                agkj agkjVar = xom.a;
                if (((vxz) this.b).k(45847179L, false)) {
                    return null;
                }
                return (xoj) this.a.io();
            case 8:
                ?? r0 = ((aczl) this.a).g;
                boolean zIsPresent = ((Optional) r0.io()).isPresent();
                Object obj3 = this.b;
                if (!zIsPresent) {
                    return ((elr) obj3).z(zyo.a);
                }
                akxc akxcVar = ((aplf) ((Optional) r0.io()).get()).f;
                if (akxcVar == null) {
                    akxcVar = akxc.a;
                }
                return ((elr) obj3).z(akxcVar);
            case 9:
                ?? r1 = this.b;
                return Boolean.valueOf(r1.m().c ? ((Optional) ((aczl) this.a).g.io()).isPresent() : aczl.j(r1).c);
            case 10:
                ?? r2 = ((aczl) this.a).g;
                boolean zIsPresent2 = ((Optional) r2.io()).isPresent();
                Object obj4 = this.b;
                if (!zIsPresent2) {
                    return ((elr) obj4).z(zyo.a);
                }
                akxc akxcVar2 = ((aplf) ((Optional) r2.io()).get()).f;
                if (akxcVar2 == null) {
                    akxcVar2 = akxc.a;
                }
                return ((elr) obj4).z(akxcVar2);
            case 11:
                return ((iao) ((aapa) this.b).c.io()).b((abnl) this.a, true);
            case 12:
                ovd ovdVar = (ovd) this.a;
                if (ovdVar.e) {
                    return adeh.a(ovdVar, (ElementsServices) this.b);
                }
                return null;
            case 13:
                ovd ovdVar2 = (ovd) this.a;
                if (ovdVar2.e) {
                    return adeh.a(ovdVar2, (ElementsServices) this.b);
                }
                return null;
            case 14:
                return ((abxu) this.a).p(this.b);
            case 15:
                Object obj5 = this.b;
                String str2 = (String) this.a;
                aenl aenlVar = (aenl) obj5;
                aenr aenrVarC = aenlVar.c(str2);
                if (aenrVarC != null) {
                    return aenrVarC;
                }
                aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                agvp.J(str2, aihfVarCreateBuilder);
                agvp.K(83769, aihfVarCreateBuilder);
                return aenlVar.a(aewo.v(41, null, agvp.I(aihfVarCreateBuilder), null, 3, 10));
            case 16:
                return ((aenq) this.a).a((aeno) this.b);
            case 17:
                Object obj6 = this.a;
                int i = Build.VERSION.SDK_INT;
                Object objCreateAttributionContext = ((abhh) obj6).a;
                if (i >= 30) {
                    aguu aguuVar = afjf.a;
                    afuv afuvVarD = afuv.d(2);
                    for (afvl afvlVarB = afty.b(); afvlVarB != null; afvlVarB = afvlVarB.b()) {
                        afuvVarD = afvlVarB.k(aguuVar);
                        if (afuvVarD.c() - 1 == 0) {
                            if (afuvVarD.b()) {
                                objCreateAttributionContext = ((Context) objCreateAttributionContext).createAttributionContext((String) afuvVarD.a());
                            }
                        }
                    }
                    if (afuvVarD.b()) {
                        objCreateAttributionContext = ((Context) objCreateAttributionContext).createAttributionContext((String) afuvVarD.a());
                    }
                }
                return ((Context) objCreateAttributionContext).getContentResolver().acquireUnstableContentProviderClient((Uri) this.b);
            case 18:
                ?? r3 = this.b;
                long j = afwl.a;
                afvh afvhVarA = afty.a();
                afvl afvlVarE = afty.e(afvhVarA, r3);
                try {
                    Object objIo = this.a.io();
                    afty.e(afvhVarA, afvlVarE);
                    return objIo;
                } catch (Throwable th) {
                    try {
                        aftt.a(th);
                        throw th;
                    } catch (Throwable th2) {
                        afty.e(afvhVarA, afvlVarE);
                        throw th2;
                    }
                }
            default:
                return Boolean.valueOf(((agvs) this.b).e().contains(this.a));
        }
    }

    public /* synthetic */ cmw(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
