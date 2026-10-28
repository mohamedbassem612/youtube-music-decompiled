package defpackage;

import android.accounts.Account;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aegm implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aegm(acga acgaVar, acge acgeVar, Class cls, int i) {
        this.$cid = i;
        this.b = acgaVar;
        this.a = acgeVar;
        this.c = cls;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Set setO;
        boolean z = false;
        if (this.$cid != 0) {
            acfx acfxVar = (acfx) obj;
            long jL = acfxVar.l();
            long jK = acfxVar.k();
            acge acgeVar = (acge) this.a;
            if (acgeVar.o(jL) && jL <= jK && jK <= acgeVar.k()) {
                if (((acga) this.b).f((Class) this.c, acfxVar).booleanValue()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        kyr kyrVar = (kyr) obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.a;
        if (kyrVar == null) {
            return agpr.a;
        }
        try {
            synchronized (((aegn) obj4).b) {
                try {
                    Account account = (Account) obj3;
                    setO = kyrVar.o(account, (String[]) ((agjw) obj2).toArray(new String[0]));
                } catch (Throwable th) {
                    throw th;
                }
            }
            return agkz.n(setO);
        } catch (IOException | jxr | jye e) {
            throw new RuntimeException(e);
        }
    }

    public /* synthetic */ aegm(aegn aegnVar, Account account, agkz agkzVar, int i) {
        this.$cid = i;
        this.a = aegnVar;
        this.b = account;
        this.c = agkzVar;
    }
}
