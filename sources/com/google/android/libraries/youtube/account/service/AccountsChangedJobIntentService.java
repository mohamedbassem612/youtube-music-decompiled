package com.google.android.libraries.youtube.account.service;

import android.accounts.Account;
import android.os.RemoteException;
import defpackage.aehs;
import defpackage.afun;
import defpackage.afvq;
import defpackage.aunn;
import defpackage.gpq;
import defpackage.kmj;
import defpackage.kmk;
import defpackage.rlt;
import defpackage.rlx;
import defpackage.rmu;
import defpackage.rpd;
import defpackage.rre;
import defpackage.taf;
import defpackage.taq;
import defpackage.zvm;
import defpackage.zvn;
import defpackage.zvp;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class AccountsChangedJobIntentService extends rpd {
    public static final /* synthetic */ int g = 0;
    public aunn e;
    public afvq f;

    @Override // defpackage.atm
    protected final void a() {
        rlx rlxVarU = ((aehs) this.e.io()).u();
        afun afunVarD = this.f.d("AccountsChangedJobIntentService", 51);
        try {
            taq.c();
            try {
                Account[] accountArrD = rlxVarU.b.d();
                rlxVarU.a(Arrays.asList(accountArrD));
                rmu rmuVar = rlxVarU.a;
                if (rmuVar.u() && (rmuVar.e() instanceof rlt) && rre.a(((rlt) rmuVar.e()).b, accountArrD) == null) {
                    if (((rlt) rmuVar.e()).l == 3) {
                        taf.g(rlxVarU.d.F(), new gpq(11));
                    }
                    rlxVarU.c.j(false, false);
                }
                rlxVarU.b(rmuVar.l(accountArrD), false);
            } catch (RemoteException e) {
                e = e;
                rlxVarU.c.j(false, false);
                zvp.e(zvn.b, zvm.I, "Error retrieving list of accounts after device account change", e);
            } catch (kmj e2) {
                e = e2;
                rlxVarU.c.j(false, false);
                zvp.e(zvn.b, zvm.I, "Error retrieving list of accounts after device account change", e);
            } catch (kmk e3) {
                e = e3;
                rlxVarU.c.j(false, false);
                zvp.e(zvn.b, zvm.I, "Error retrieving list of accounts after device account change", e);
            }
            afunVarD.close();
        } catch (Throwable th) {
            try {
                afunVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
