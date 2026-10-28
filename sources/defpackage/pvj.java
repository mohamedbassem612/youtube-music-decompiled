package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pvj extends dlz {
    @Override // defpackage.dlz
    protected final String a() {
        return "UPDATE OR REPLACE `gnp_accounts` SET `id` = ?,`account_specific_id` = ?,`account_type` = ?,`obfuscated_gaia_id` = ?,`actual_account_name` = ?,`actual_account_oid` = ?,`registration_status` = ?,`registration_id` = ?,`sync_sources` = ?,`representative_target_id` = ?,`sync_version` = ?,`last_registration_time_ms` = ?,`last_registration_request_hash` = ?,`first_registration_version` = ?,`internal_target_id` = ?,`fitbit_decoded_id` = ? WHERE `id` = ?";
    }

    @Override // defpackage.dlz
    protected final /* synthetic */ void b(dpb dpbVar, Object obj) {
        plx plxVar = (plx) obj;
        long j = plxVar.a;
        dpbVar.g(1, j);
        String str = plxVar.b;
        if (str == null) {
            dpbVar.h(2);
        } else {
            dpbVar.i(2, str);
        }
        dpbVar.g(3, qnl.an(plxVar.p));
        String str2 = plxVar.c;
        if (str2 == null) {
            dpbVar.h(4);
        } else {
            dpbVar.i(4, str2);
        }
        String str3 = plxVar.d;
        if (str3 == null) {
            dpbVar.h(5);
        } else {
            dpbVar.i(5, str3);
        }
        String str4 = plxVar.e;
        if (str4 == null) {
            dpbVar.h(6);
        } else {
            dpbVar.i(6, str4);
        }
        dpbVar.g(7, plxVar.f);
        String str5 = plxVar.g;
        if (str5 == null) {
            dpbVar.h(8);
        } else {
            dpbVar.i(8, str5);
        }
        dpbVar.i(9, qnl.ak(plxVar.h));
        String str6 = plxVar.i;
        if (str6 == null) {
            dpbVar.h(10);
        } else {
            dpbVar.i(10, str6);
        }
        dpbVar.g(11, plxVar.j);
        dpbVar.g(12, plxVar.k);
        dpbVar.g(13, plxVar.l);
        dpbVar.g(14, plxVar.m);
        String str7 = plxVar.n;
        if (str7 == null) {
            dpbVar.h(15);
        } else {
            dpbVar.i(15, str7);
        }
        dpbVar.g(16, plxVar.o);
        dpbVar.g(17, j);
    }
}
