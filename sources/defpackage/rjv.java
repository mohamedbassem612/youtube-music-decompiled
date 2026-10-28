package defpackage;

import android.accounts.Account;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rjv implements zwm {
    final /* synthetic */ rly a;
    final /* synthetic */ aerv b;
    final /* synthetic */ tqj c;

    public rjv(rly rlyVar, aerv aervVar, tqj tqjVar) {
        this.a = rlyVar;
        this.b = aervVar;
        this.c = tqjVar;
    }

    @Override // defpackage.zwm
    public final /* synthetic */ zwk a(zwa zwaVar) {
        rlt rltVar = (rlt) zwaVar;
        int i = tqr.a;
        boolean zK = this.c.k(1073814510);
        Bundle bundleC = rly.c(rltVar);
        return this.a.e(new Account(rltVar.b, "com.google"), bundleC, false, this.b, zK, "NON_CACHING");
    }

    @Override // defpackage.zwm
    public final /* bridge */ /* synthetic */ void b(zwa zwaVar) {
        this.a.g((rlt) zwaVar);
    }
}
