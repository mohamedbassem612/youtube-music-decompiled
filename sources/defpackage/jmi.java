package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jmi implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jmi(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kzp] */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.Object, khv] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, jju] */
    /* JADX WARN: Type inference failed for: r10v52, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r10v55, types: [java.lang.Object, kzm] */
    @Override // java.lang.Runnable
    public final void run() {
        alxl alxlVar;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zIsEmpty;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        boolean z5 = true;
        switch (this.$cid) {
            case 0:
                ((jml) this.a).b((apok) this.b, true);
                return;
            case 1:
                alxg alxgVar = (alxg) this.b;
                xgj xgjVar = new xgj(alxgVar.e, (amud) null);
                ?? r10 = ((hfb) this.a).a;
                jkc jkcVar = (jkc) r10;
                jkcVar.d.d(xgjVar);
                ArrayList arrayList = new ArrayList();
                if (alxgVar.d.size() > 0 && (i = (alxlVar = (alxl) alxgVar.d.get(0)).b) == 87359530) {
                    for (apnz apnzVar : (i == 87359530 ? (apny) alxlVar.c : apny.a).c) {
                        if ((apnzVar.b & SemanticState.LiveRegion) != 0) {
                            aqjv aqjvVar = apnzVar.c;
                            if (aqjvVar == null) {
                                aqjvVar = aqjv.a;
                            }
                            jjv jjvVar = new jjv(aqjvVar);
                            jjvVar.e = r10;
                            arrayList.add(jjvVar);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    jkcVar.b();
                    return;
                }
                jkcVar.f = new jjq();
                adlq adlqVar = jkcVar.e;
                adlqVar.t();
                adlqVar.m(-1, jkcVar.f, true);
                jjq jjqVar = jkcVar.f;
                List list = jjqVar.a;
                list.clear();
                list.addAll(arrayList);
                jjqVar.z(0, arrayList.size());
                return;
            case 2:
                ((jnw) this.a).e((String) this.b);
                return;
            case 3:
                try {
                    ((jth) this.a).a.e((byte[]) this.b);
                    return;
                } catch (RuntimeException unused) {
                    return;
                }
            case 4:
                ((jui) this.a).c((ajvs) this.b);
                return;
            case 5:
                khf khfVar = (khf) this.b;
                jzt jztVar = khfVar.d;
                kan kanVar = ((kam) this.a).a;
                jzt jztVar2 = kanVar.g;
                if (jztVar == null || jztVar2 == null ? !Objects.equals(jztVar2, jztVar) : !(khe.g(jztVar2, jztVar) && Objects.equals(jztVar.h, jztVar2.h) && Objects.equals(jztVar.i, jztVar2.i))) {
                    kanVar.g = jztVar;
                    kanVar.u.O(kanVar.g);
                }
                double d = khfVar.a;
                if (Double.isNaN(d) || Math.abs(d - kanVar.i) <= 1.0E-7d) {
                    z = false;
                } else {
                    kanVar.i = d;
                    z = true;
                }
                boolean z6 = khfVar.b;
                if (z6 != kanVar.j) {
                    kanVar.j = z6;
                    z = true;
                }
                khn.e();
                hna hnaVar = kanVar.u;
                if (hnaVar != null && (z || kanVar.c)) {
                    hnaVar.R();
                }
                Double.isNaN(khfVar.g);
                int i2 = khfVar.c;
                if (i2 != kanVar.k) {
                    kanVar.k = i2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                khn.e();
                if (hnaVar != null && (z2 || kanVar.c)) {
                    hnaVar.M(kanVar.k);
                }
                int i3 = khfVar.e;
                if (i3 != kanVar.l) {
                    kanVar.l = i3;
                } else {
                    z5 = false;
                }
                khn.e();
                if (hnaVar != null && (z5 || kanVar.c)) {
                    hnaVar.Q(kanVar.l);
                }
                if (!khe.g(kanVar.m, khfVar.f)) {
                    kanVar.m = khfVar.f;
                }
                kanVar.c = false;
                return;
            case 6:
                kan kanVar2 = ((kam) this.a).a;
                String str = ((kgq) this.b).a;
                if (khe.g(str, kanVar2.h)) {
                    z5 = false;
                } else {
                    kanVar2.h = str;
                }
                khn.e();
                hna hnaVar2 = kanVar2.u;
                if (hnaVar2 != null && (z5 || kanVar2.d)) {
                    hnaVar2.P();
                }
                kanVar2.d = false;
                return;
            case 7:
                Object obj = this.a;
                khf khfVar2 = (khf) this.b;
                jzt jztVar3 = khfVar2.d;
                khb khbVar = (khb) obj;
                if (!khe.g(jztVar3, khbVar.b)) {
                    khbVar.b = jztVar3;
                    khbVar.o.O(khbVar.b);
                }
                double d2 = khfVar2.a;
                if (Double.isNaN(d2) || Math.abs(d2 - khbVar.i) <= 1.0E-7d) {
                    z3 = false;
                } else {
                    khbVar.i = d2;
                    z3 = true;
                }
                boolean z7 = khfVar2.b;
                if (z7 != khbVar.f) {
                    khbVar.f = z7;
                    z3 = true;
                }
                Double.isNaN(khfVar2.g);
                khn.e();
                hna hnaVar3 = khbVar.o;
                if (hnaVar3 != null && (z3 || khbVar.h)) {
                    hnaVar3.R();
                }
                int i4 = khfVar2.c;
                if (i4 != khbVar.k) {
                    khbVar.k = i4;
                    z4 = true;
                } else {
                    z4 = false;
                }
                khn.e();
                if (hnaVar3 != null && (z4 || khbVar.h)) {
                    hnaVar3.M(khbVar.k);
                }
                int i5 = khfVar2.e;
                if (i5 != khbVar.l) {
                    khbVar.l = i5;
                } else {
                    z5 = false;
                }
                khn.e();
                if (hnaVar3 != null && (z5 || khbVar.h)) {
                    hnaVar3.Q(khbVar.l);
                }
                if (!khe.g(khbVar.j, khfVar2.f)) {
                    khbVar.j = khfVar2.f;
                }
                khbVar.h = false;
                return;
            case 8:
                Object obj2 = this.b;
                String str2 = ((kgq) this.a).a;
                khb khbVar2 = (khb) obj2;
                if (khe.g(str2, khbVar2.e)) {
                    z5 = false;
                } else {
                    khbVar2.e = str2;
                }
                khn.e();
                hna hnaVar4 = khbVar2.o;
                if (hnaVar4 != null && (z5 || khbVar2.g)) {
                    hnaVar4.P();
                }
                khbVar2.g = false;
                return;
            case 9:
                Object obj3 = this.b;
                khy khyVar = (khy) obj3;
                synchronized (khyVar.g) {
                    zIsEmpty = ((khy) obj3).d.isEmpty();
                    break;
                }
                if (!zIsEmpty && !khyVar.h && (connectivityManager = khyVar.b) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    activeNetworkInfo.isConnected();
                }
                this.a.a();
                return;
            case 10:
                ((kol) this.b).h((Bundle) this.a);
                return;
            case 11:
                kow kowVar = ((kox) this.a).b;
                Object obj4 = this.b;
                if (kowVar != null) {
                    ((qcb) obj4).h(kowVar.a);
                    return;
                }
                return;
            case 12:
                lol lolVar = (lol) this.b;
                klo kloVar = lolVar.b;
                boolean zD = kloVar.d();
                Object obj5 = this.a;
                if (zD) {
                    krr krrVar = lolVar.c;
                    kro.l(krrVar);
                    klo kloVar2 = krrVar.c;
                    if (!kloVar2.d()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(kloVar2))), new Exception());
                        kpf kpfVar = (kpf) obj5;
                        kpfVar.f.b(kloVar2);
                        kpfVar.e.l();
                        return;
                    }
                    kpf kpfVar2 = (kpf) obj5;
                    kon konVar = kpfVar2.f;
                    krc krcVarA = krrVar.a();
                    Set set = kpfVar2.c;
                    if (krcVarA == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        konVar.b(new klo(1, 4, null, null, null, null));
                    } else {
                        konVar.f = krcVarA;
                        konVar.c = set;
                        konVar.c();
                    }
                } else {
                    ((kpf) obj5).f.b(kloVar);
                }
                ((kpf) obj5).e.l();
                return;
            case 13:
                Object obj6 = this.a;
                int i6 = kwc.a;
                ((kjc) this.b).x(ahek.e((Context) obj6, "GLAS"));
                return;
            case 14:
                ((Activity) ((kyr) this.b).b).startActivity((Intent) this.a);
                return;
            case 15:
                Status status = kxr.a;
                ((Activity) this.a).startActivityForResult((Intent) this.b, 123);
                return;
            case 16:
                AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc((AppMeasurementDynamiteService) this.b, this.a);
                return;
            case 17:
                lff lffVarK = ((AppMeasurementDynamiteService) this.b).a.k();
                lffVarK.o();
                lffVarK.a();
                lffVarK.B(new lez(lffVarK, lffVarK.s(false), (kzm) this.a, 0));
                return;
            case 18:
                ((AppMeasurementDynamiteService) this.b).a.i().an((lbf) this.a);
                return;
            case 19:
                AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.b;
                appMeasurementDynamiteService.a.l().T(this.a, appMeasurementDynamiteService.a.v());
                return;
            default:
                lfv lfvVar = ((lcn) this.b).a;
                lfvVar.B();
                lfvVar.S((lbg) this.a);
                return;
        }
    }

    public jmi(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ jmi(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public jmi(khb khbVar, kgq kgqVar, int i) {
        this.$cid = i;
        this.b = khbVar;
        this.a = kgqVar;
    }

    public jmi(khb khbVar, khf khfVar, int i) {
        this.$cid = i;
        this.a = khbVar;
        this.b = khfVar;
    }

    public jmi(kpf kpfVar, lol lolVar, int i) {
        this.$cid = i;
        this.b = lolVar;
        this.a = kpfVar;
    }
}
