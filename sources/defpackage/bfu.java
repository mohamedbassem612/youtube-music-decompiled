package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bfu implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ bfu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        switch (this.$cid) {
            case 0:
                File file = (File) obj;
                Set set = bfv.a;
                file.getClass();
                file.getCanonicalFile().getAbsolutePath().getClass();
                return new ayq();
            case 1:
                synchronized (aka.a) {
                    List list = aka.d;
                }
                return awmy.a;
            case 2:
                ((bpt) obj).getClass();
                return new boz();
            case 3:
                dpb dpbVar = (dpb) obj;
                dpbVar.getClass();
                return Boolean.valueOf(dpbVar.l());
            case 4:
                dpb dpbVar2 = (dpb) obj;
                int i = dnl.h;
                dpbVar2.getClass();
                awol awolVar = new awol();
                while (dpbVar2.l()) {
                    awolVar.add(Integer.valueOf((int) dpbVar2.b(0)));
                }
                return awolVar.b();
            case 5:
                drd drdVar = drd.d;
                return Boolean.FALSE;
            case 6:
                dxc dxcVar = (dxc) obj;
                int i2 = dxb.b;
                dxcVar.getClass();
                return dxcVar;
            case 7:
                ayq ayqVar = (ayq) obj;
                int i3 = efl.a;
                ayqVar.getClass();
                return ayqVar.k();
            case 8:
                tzk.a((Throwable) obj);
                return awmy.a;
            case 9:
                aboe aboeVar = (aboe) obj;
                aboeVar.getClass();
                return Boolean.valueOf(aawb.C(aboeVar.j, 15));
            case 10:
                ((bdu) obj).getClass();
                aihf aihfVarCreateBuilder = pym.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                return qnl.H(aihfVarCreateBuilder);
            case 11:
                dpb dpbVarA = ((dpt) obj).a("SELECT * FROM gnp_accounts");
                try {
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
                    int iM16 = ape.m(dpbVarA, "fitbit_decoded_id");
                    ArrayList arrayList = new ArrayList();
                    while (dpbVarA.l()) {
                        long jB = dpbVarA.b(iM);
                        String strD = dpbVarA.k(iM2) ? null : dpbVarA.d(iM2);
                        int i4 = iM;
                        ArrayList arrayList2 = arrayList;
                        int iAm = qnl.am((int) dpbVarA.b(iM3));
                        String strD2 = dpbVarA.k(iM4) ? null : dpbVarA.d(iM4);
                        String strD3 = dpbVarA.k(iM5) ? null : dpbVarA.d(iM5);
                        String strD4 = dpbVarA.k(iM6) ? null : dpbVarA.d(iM6);
                        int iB = (int) dpbVarA.b(iM7);
                        String strD5 = dpbVarA.k(iM8) ? null : dpbVarA.d(iM8);
                        agkz agkzVarAj = qnl.aj(dpbVarA.k(iM9) ? null : dpbVarA.d(iM9));
                        String strD6 = dpbVarA.k(iM10) ? null : dpbVarA.d(iM10);
                        long jB2 = dpbVarA.b(iM11);
                        long jB3 = dpbVarA.b(iM12);
                        int iB2 = (int) dpbVarA.b(iM13);
                        long jB4 = dpbVarA.b(iM14);
                        int i5 = iM15;
                        String strD7 = dpbVarA.k(i5) ? null : dpbVarA.d(i5);
                        int i6 = iM16;
                        iM16 = i6;
                        iM15 = i5;
                        arrayList = arrayList2;
                        arrayList.add(plx.d(jB, strD, iAm, strD2, strD3, strD4, iB, strD5, agkzVarAj, strD6, jB2, jB3, iB2, jB4, strD7, dpbVarA.b(i6)));
                        iM = i4;
                        break;
                    }
                    return arrayList;
                } finally {
                    dpbVarA.close();
                }
            case 12:
                return atop.a;
            case 13:
                trd trdVar = (trd) obj;
                trdVar.getClass();
                return trdVar.e(SemanticState.Hidden);
            case 14:
                trd trdVar2 = (trd) obj;
                trdVar2.getClass();
                return trdVar2.e(264);
            case 15:
                ((aesp) obj).h();
                return awmy.a;
            case 16:
                aiqi aiqiVar = (aiqi) obj;
                aiqiVar.getClass();
                aigj aigjVar = aiqiVar.c == 1 ? (aigj) aiqiVar.d : aigj.d;
                aigjVar.getClass();
                return aigjVar;
            case 17:
                aiqi aiqiVar2 = (aiqi) obj;
                aiqiVar2.getClass();
                return aiqiVar2.g;
            case 18:
                aigj aigjVar2 = (aigj) obj;
                aigjVar2.getClass();
                try {
                    return (aiqx) aihn.parseFrom(aiqx.a, aigjVar2, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik e) {
                    twu.c(6, "Failed to parse account static config", e);
                    return null;
                }
            case 19:
                aiqi aiqiVar3 = (aiqi) obj;
                aiqiVar3.getClass();
                aigj aigjVar3 = aiqiVar3.e == 3 ? (aigj) aiqiVar3.f : aigj.d;
                aigjVar3.getClass();
                return aigjVar3;
            default:
                aiqi aiqiVar4 = (aiqi) obj;
                aiqiVar4.getClass();
                return aiqiVar4.h;
        }
    }
}
