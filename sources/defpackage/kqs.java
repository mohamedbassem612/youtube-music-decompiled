package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kqs extends kpz implements kmt {
    public static volatile Executor G;
    public final kqd H;
    private final Set a;
    private final Account b;

    protected kqs(Context context, Looper looper, int i, kqd kqdVar, kof kofVar, kpb kpbVar) {
        super(context, looper, kqy.b(context), klt.a, i, new kqq(kofVar), new kqr(kpbVar), kqdVar.f);
        this.H = kqdVar;
        this.b = kqdVar.a;
        Set set = kqdVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.a = set;
        if (G == null) {
            synchronized (kqs.class) {
                if (G == null && kqw.a(context.getPackageName())) {
                    G = kqu.a(context);
                }
            }
        }
    }

    @Override // defpackage.kpz
    public final Account B() {
        return this.b;
    }

    @Override // defpackage.kpz
    protected final Set F() {
        return this.a;
    }

    @Override // defpackage.kpz
    protected final Executor G() {
        return G;
    }

    @Override // defpackage.kpz
    public final klq[] P() {
        return new klq[0];
    }

    @Override // defpackage.kpz, defpackage.kmt
    public int a() {
        throw null;
    }

    @Override // defpackage.kmt
    public final Set t() {
        return i() ? this.a : Collections.EMPTY_SET;
    }
}
