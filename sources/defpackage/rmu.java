package defpackage;

import android.accounts.Account;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface rmu extends zwb, zvu, zwe {
    ListenableFuture g();

    ListenableFuture h(rlt rltVar);

    ListenableFuture j(boolean z);

    List l(Account[] accountArr);

    void p(List list);

    void q(String str, String str2);
}
