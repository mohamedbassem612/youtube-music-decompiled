package defpackage;

import android.accounts.Account;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.DesugarCollections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aeni implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aeni(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                alay alayVar = ((aoda) obj).c;
                return alayVar == null ? alay.a : alayVar;
            case 1:
                apra apraVar = (apra) obj;
                return apraVar.b == 64166933 ? (apqz) apraVar.c : apqz.a;
            case 2:
                return ackj.k(null, (alay) obj, null, false);
            case 3:
                throw new afig((IllegalArgumentException) obj);
            case 4:
                String str = (String) obj;
                ahno.G(str != null, "AccountId was not a Google account");
                return new Account(str, "com.google");
            case 5:
                return null;
            case 6:
                agkx agkxVar = new agkx();
                for (afiw afiwVar : DesugarCollections.unmodifiableMap(((afiu) obj).d).values()) {
                    int iAS = a.aS(afiwVar.e);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    if (iAS == 2) {
                        agkxVar.c(affd.a(afiwVar.c));
                    }
                }
                return agkxVar.g();
            case 7:
                return DesugarCollections.unmodifiableMap(((afiu) obj).d).keySet();
            case 8:
                ((agrc) ((agrc) ((agrc) afja.a.b()).j((Throwable) obj)).k("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "sync", 'Z', "WipeoutAccountsSynclet.java")).t("Wipeout accounts task failed.");
                return null;
            case 9:
                agrf agrfVar = afja.a;
                return Boolean.TRUE;
            case 10:
                return new ProtoParsers$InternalDontUse(null, (MessageLite) obj);
            case 11:
                syn synVar = afnp.m;
                return null;
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return new dzd();
            case 15:
                return new dzc();
            case 16:
                int i = afsl.g;
                return null;
            case 17:
                return afux.a;
            case 18:
                return (almd) obj;
            case 19:
                return (almd) obj;
            default:
                return (afyp) obj;
        }
    }
}
