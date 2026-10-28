package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rjw implements zwm {
    final /* synthetic */ rma a;

    public rjw(rma rmaVar) {
        this.a = rmaVar;
    }

    @Override // defpackage.zwm
    public final /* synthetic */ zwk a(zwa zwaVar) {
        TokenData tokenData;
        rma rmaVar = this.a;
        rlt rltVar = (rlt) zwaVar;
        String strI = rmaVar.i(rltVar);
        synchronized (rmaVar) {
            tokenData = (TokenData) rmaVar.a.get(strI);
        }
        Long l = tokenData != null ? tokenData.c : null;
        if (tokenData != null && l != null && Duration.ofSeconds(l.longValue()).minusMillis(rmaVar.e.f().toEpochMilli()).toMillis() > 0) {
            return rmaVar.f.b(tokenData.b);
        }
        Bundle bundleC = rma.c(rltVar);
        Account account = new Account(rltVar.b, "com.google");
        boolean z = rmaVar.b;
        aerv aervVar = rmaVar.c;
        tqj tqjVar = rmaVar.d;
        int i = tqr.a;
        return rmaVar.e(account, bundleC, z, aervVar, tqjVar.k(72596), "CACHING_WITH_TTL");
    }

    @Override // defpackage.zwm
    public final /* bridge */ /* synthetic */ void b(zwa zwaVar) {
        this.a.b((rlt) zwaVar);
    }
}
