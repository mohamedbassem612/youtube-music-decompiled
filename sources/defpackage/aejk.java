package defpackage;

import android.accounts.Account;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aejk implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aejk(aegn aegnVar, aegg aeggVar, Account account, agkz agkzVar, int i) {
        this.$cid = i;
        this.c = aegnVar;
        this.b = aeggVar;
        this.a = account;
        this.d = agkzVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$cid;
        Object obj = this.c;
        if (i == 0) {
            long jLongValue = ((Long) obj).longValue();
            Object obj2 = this.d;
            ((aejo) this.a).h((FileDescriptor) this.b, jLongValue, (byte[]) obj2);
            return null;
        }
        aegn aegnVar = (aegn) obj;
        Object obj3 = ((axlj) aegnVar.f.io()).b;
        Object obj4 = this.b;
        kyr kyrVar = new kyr(obj3, obj4, (byte[]) null);
        Object obj5 = this.a;
        Object obj6 = this.d;
        synchronized (aegnVar.b) {
            Account account = (Account) obj5;
            kyrVar.o(account, (String[]) ((agjw) obj6).toArray(new String[0]));
        }
        return obj4;
    }

    public /* synthetic */ aejk(aejo aejoVar, FileDescriptor fileDescriptor, Long l, byte[] bArr, int i) {
        this.$cid = i;
        this.a = aejoVar;
        this.b = fileDescriptor;
        this.c = l;
        this.d = bArr;
    }
}
