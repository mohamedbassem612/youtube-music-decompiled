package defpackage;

import android.content.Context;
import android.net.Uri;
import internal.org.jni_zero.JniZero;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mai implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mai(int i, String str, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        Object majVar;
        boolean z;
        int i = this.$cid;
        if (i == 0) {
            ((Integer) obj).getClass();
            int i2 = this.a;
            majVar = new maj((Context) this.b, i2 == -1 ? null : Integer.valueOf(i2));
        } else {
            if (i == 1) {
                ainx ainxVar = (ainx) obj;
                ainxVar.getClass();
                aiie aiieVar = ainxVar.b;
                aiieVar.getClass();
                Iterator it = aiieVar.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (((ainw) it.next()).c == this.a) {
                        break;
                    }
                    i3++;
                }
                if (i3 == -1) {
                    return ainxVar;
                }
                ((awrm) this.b).a = (ainw) ainxVar.b.get(i3);
                aihf builder = ainxVar.toBuilder();
                builder.copyOnWrite();
                ainx ainxVar2 = (ainx) builder.instance;
                ainxVar2.a();
                ainxVar2.b.remove(i3);
                return (ainx) builder.build();
            }
            if (i == 2) {
                dpb dpbVarA = ((dpt) obj).a("SELECT * FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                int i4 = this.a;
                Object obj2 = this.b;
                try {
                    dpbVarA.g(1, i4);
                    dpbVarA.i(2, (String) obj2);
                    int iM = ape.m(dpbVarA, "id");
                    int iM2 = ape.m(dpbVarA, "account_specific_id");
                    int iM3 = ape.m(dpbVarA, "account_type");
                    int iM4 = ape.m(dpbVarA, "obfuscated_gaia_id");
                    int iM5 = ape.m(dpbVarA, "actual_account_name");
                    int iM6 = ape.m(dpbVarA, "actual_account_oid");
                    int iM7 = ape.m(dpbVarA, "registration_status");
                    int iM8 = ape.m(dpbVarA, "registration_id");
                    int iM9 = ape.m(dpbVarA, "sync_sources");
                    int iM10 = ape.m(dpbVarA, "representative_target_id");
                    int iM11 = ape.m(dpbVarA, "sync_version");
                    int iM12 = ape.m(dpbVarA, "last_registration_time_ms");
                    int iM13 = ape.m(dpbVarA, "last_registration_request_hash");
                    int iM14 = ape.m(dpbVarA, "first_registration_version");
                    int iM15 = ape.m(dpbVarA, "internal_target_id");
                    majVar = dpbVarA.l() ? plx.d(dpbVarA.b(iM), dpbVarA.k(iM2) ? null : dpbVarA.d(iM2), qnl.am((int) dpbVarA.b(iM3)), dpbVarA.k(iM4) ? null : dpbVarA.d(iM4), dpbVarA.k(iM5) ? null : dpbVarA.d(iM5), dpbVarA.k(iM6) ? null : dpbVarA.d(iM6), (int) dpbVarA.b(iM7), dpbVarA.k(iM8) ? null : dpbVarA.d(iM8), qnl.aj(dpbVarA.k(iM9) ? null : dpbVarA.d(iM9)), dpbVarA.k(iM10) ? null : dpbVarA.d(iM10), dpbVarA.b(iM11), dpbVarA.b(iM12), (int) dpbVarA.b(iM13), dpbVarA.b(iM14), dpbVarA.k(iM15) ? null : dpbVarA.d(iM15), dpbVarA.b(ape.m(dpbVarA, "fitbit_decoded_id"))) : null;
                } finally {
                    dpbVarA.close();
                }
            } else {
                if (i != 3) {
                    vcr vcrVar = (vcr) obj;
                    vcrVar.getClass();
                    Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(vcrVar.b);
                    int i5 = this.a;
                    vcq vcqVar = (vcq) mapUnmodifiableMap.get(Integer.valueOf(i5));
                    if (vcqVar == null) {
                        return ahng.n(asdn.a);
                    }
                    Object obj3 = this.b;
                    vcp vcpVar = (vcp) obj3;
                    long epochMilli = vcpVar.c.a().toEpochMilli();
                    aijp aijpVar = vcqVar.d;
                    if (aijpVar == null) {
                        aijpVar = aijp.a;
                    }
                    long jA = epochMilli - aikz.a(aijpVar);
                    int i6 = 20;
                    long jD = vcpVar.f.d(20, 45775391L);
                    if (jA > (jD > 0 ? TimeUnit.SECONDS.toMillis(jD) : vcp.a)) {
                        return ahno.ar(vcpVar.g.j(new vcn(i5, 0)), new rwj(new uhd(5), 19), vcpVar.d);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (aneh anehVar : vcqVar.e) {
                        anehVar.getClass();
                        Uri uriA = vcpVar.a(anehVar);
                        if (uriA != null) {
                            try {
                                InputStream inputStreamB = qol.b(((vcp) obj3).b, uriA);
                                z = inputStreamB != null;
                                try {
                                    JniZero.l(inputStreamB, null);
                                } catch (IOException | SecurityException unused) {
                                }
                            } catch (IOException | SecurityException unused2) {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(anehVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return ahno.ar(vcpVar.g.j(new vcn(i5, 2)), new rwj(new uhd(6), i6), vcpVar.d);
                    }
                    aihf aihfVarCreateBuilder = asdn.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    List listUnmodifiableList = DesugarCollections.unmodifiableList(((asdn) aihfVarCreateBuilder.instance).b);
                    listUnmodifiableList.getClass();
                    new aikl(listUnmodifiableList);
                    aihfVarCreateBuilder.copyOnWrite();
                    asdn asdnVar = (asdn) aihfVarCreateBuilder.instance;
                    aiie aiieVar2 = asdnVar.b;
                    if (!aiieVar2.c()) {
                        asdnVar.b = aihn.mutableCopy(aiieVar2);
                    }
                    aifs.addAll(arrayList, asdnVar.b);
                    aihn aihnVarBuild = aihfVarCreateBuilder.build();
                    aihnVarBuild.getClass();
                    return ahng.n((asdn) aihnVarBuild);
                }
                dpb dpbVarA2 = ((dpt) obj).a("SELECT * FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                int i7 = this.a;
                Object obj4 = this.b;
                try {
                    dpbVarA2.g(1, i7);
                    dpbVarA2.i(2, (String) obj4);
                    int iM16 = ape.m(dpbVarA2, "id");
                    int iM17 = ape.m(dpbVarA2, "account_specific_id");
                    int iM18 = ape.m(dpbVarA2, "account_type");
                    int iM19 = ape.m(dpbVarA2, "obfuscated_gaia_id");
                    int iM20 = ape.m(dpbVarA2, "actual_account_name");
                    int iM21 = ape.m(dpbVarA2, "actual_account_oid");
                    int iM22 = ape.m(dpbVarA2, "registration_status");
                    int iM23 = ape.m(dpbVarA2, "registration_id");
                    int iM24 = ape.m(dpbVarA2, "sync_sources");
                    int iM25 = ape.m(dpbVarA2, "representative_target_id");
                    int iM26 = ape.m(dpbVarA2, "sync_version");
                    int iM27 = ape.m(dpbVarA2, "last_registration_time_ms");
                    int iM28 = ape.m(dpbVarA2, "last_registration_request_hash");
                    int iM29 = ape.m(dpbVarA2, "first_registration_version");
                    int iM30 = ape.m(dpbVarA2, "internal_target_id");
                    majVar = dpbVarA2.l() ? plx.d(dpbVarA2.b(iM16), dpbVarA2.k(iM17) ? null : dpbVarA2.d(iM17), qnl.am((int) dpbVarA2.b(iM18)), dpbVarA2.k(iM19) ? null : dpbVarA2.d(iM19), dpbVarA2.k(iM20) ? null : dpbVarA2.d(iM20), dpbVarA2.k(iM21) ? null : dpbVarA2.d(iM21), (int) dpbVarA2.b(iM22), dpbVarA2.k(iM23) ? null : dpbVarA2.d(iM23), qnl.aj(dpbVarA2.k(iM24) ? null : dpbVarA2.d(iM24)), dpbVarA2.k(iM25) ? null : dpbVarA2.d(iM25), dpbVarA2.b(iM26), dpbVarA2.b(iM27), (int) dpbVarA2.b(iM28), dpbVarA2.b(iM29), dpbVarA2.k(iM30) ? null : dpbVarA2.d(iM30), dpbVarA2.b(ape.m(dpbVarA2, "fitbit_decoded_id"))) : null;
                } finally {
                    dpbVarA2.close();
                }
            }
        }
        return majVar;
    }

    public /* synthetic */ mai(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }
}
