package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rma extends rly {
    private static final agrf g = agrf.h("com/google/android/libraries/youtube/account/identity/CachingAuthTokenProvider");
    public final ConcurrentHashMap a;
    public final boolean b;
    public final aerv c;
    public final tqj d;
    public final mbc e;
    public final hxh f;
    private final rre h;
    private final vwt i;

    public rma(omj omjVar, Context context, vwt vwtVar, rre rreVar, tqj tqjVar, aerv aervVar, mbc mbcVar, hxh hxhVar) {
        super(omjVar, context, hxhVar);
        this.a = new ConcurrentHashMap();
        this.i = vwtVar;
        this.h = rreVar;
        int i = tqr.a;
        this.b = tqjVar.k(1073808331);
        this.c = aervVar;
        this.d = tqjVar;
        this.e = mbcVar;
        this.f = hxhVar;
    }

    private final synchronized void j(String str) {
        try {
            Object obj = this.i.a;
            String str2 = jxs.a;
            jxz.c((Context) obj, str);
        } catch (IOException | jxr e) {
            if (this.b) {
                zvp.e(zvn.b, zvm.I, "GMScore OAuth Token clear API Exception", e);
            }
            ((agrc) ((agrc) ((agrc) g.b()).j(e)).k("com/google/android/libraries/youtube/account/identity/CachingAuthTokenProvider", "invalidateGmsToken", (char) 209, "CachingAuthTokenProvider.java")).w("AuthTokenProvider: clearToken %s", e.getClass().getSimpleName());
        }
    }

    private static final String k(String str, String str2) {
        return String.valueOf(str).concat(str2 == null ? "" : "-".concat(str2));
    }

    @Override // defpackage.rly, defpackage.zwm
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final zwk a(rlt rltVar) {
        zwk zwkVarB;
        afvx afvxVarAd = tym.ad(tsa.ATP_GET_TOKEN);
        try {
            String strI = i(rltVar);
            TokenData tokenData = (TokenData) this.a.get(strI);
            if (tokenData == null) {
                synchronized (this) {
                    try {
                        TokenData tokenData2 = (TokenData) this.a.get(strI);
                        if (tokenData2 != null) {
                            zwkVarB = this.f.b(tokenData2.b);
                        } else {
                            Bundle bundleC = c(rltVar);
                            Account account = new Account(rltVar.b, "com.google");
                            boolean z = this.b;
                            aerv aervVar = this.c;
                            tqj tqjVar = this.d;
                            int i = tqr.a;
                            try {
                                zwkVarB = e(account, bundleC, z, aervVar, tqjVar.k(72596), "CACHING");
                            } catch (Throwable th) {
                                th = th;
                                this = this;
                                Throwable th2 = th;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } else {
                zwkVarB = this.f.b(tokenData.b);
            }
            afvxVarAd.close();
            return zwkVarB;
        } catch (Throwable th4) {
            try {
                afvxVarAd.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // defpackage.rly
    public final String f(Account account, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        String strK = k(account.name, bundle.getString("delegatee_user_id"));
        afvx afvxVarAd = tym.ad(tsa.ATP_GET_TOKEN_LIVE_FROM_GMS);
        try {
            vwt vwtVar = this.i;
            String str = this.h.f;
            Object obj = vwtVar.a;
            TokenData tokenDataI = new kjc((Context) obj, (byte[]) null).i((Context) obj, account, str, bundle);
            afvxVarAd.close();
            String str2 = tokenDataI.b;
            this.a.put(strK, tokenDataI);
            return str2;
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rly, defpackage.zwm
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final synchronized void b(rlt rltVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        String strI = i(rltVar);
        TokenData tokenData = (TokenData) concurrentHashMap.get(strI);
        if (tokenData != null) {
            j(tokenData.b);
            concurrentHashMap.remove(strI);
        }
    }

    @Override // defpackage.rly
    public final synchronized void h(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.remove(i((rlt) it.next()));
        }
    }

    public final String i(rlt rltVar) {
        return k(rltVar.b, (rltVar.f || rltVar.l == 3) ? rltVar.a : null);
    }
}
