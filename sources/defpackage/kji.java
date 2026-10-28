package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kji implements loo {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kji(axfd axfdVar, ExecutorService executorService, int i) {
        this.$cid = i;
        this.b = axfdVar;
        this.a = executorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v11, types: [ahrw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kks] */
    /* JADX WARN: Type inference failed for: r7v3, types: [agek, java.lang.Object] */
    @Override // defpackage.loo
    public final Object a(lpa lpaVar) {
        kiz kizVar;
        int i = this.$cid;
        if (i == 0) {
            if (lpaVar.j()) {
                kizVar = (kiz) lpaVar.f();
            } else {
                Log.e("ClearcutLoggerApiImpl", "Error sampling log.", lpaVar.e());
                kizVar = kiz.b;
            }
            return ((kjn) this.a).c((kic) this.b, kizVar);
        }
        final int i2 = 1;
        if (i == 1) {
            kkc kkcVar = kjn.a;
            if (lpaVar.j()) {
                return (lpa) this.a.apply(this.b);
            }
            Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", lpaVar.e());
            return lpaVar;
        }
        if (i == 2) {
            if (!lpaVar.j() || !kli.d((Bundle) lpaVar.f())) {
                return lpaVar;
            }
            return ((kli) this.a).a((Bundle) this.b).d(kli.a, new klf());
        }
        if (i == 3) {
            if (!lpaVar.j()) {
                return mda.l(axfd.h(lpaVar));
            }
            ?? r0 = this.a;
            Object obj = this.b;
            final String str = ((ahsa) lpaVar.f()).a;
            return ((axfd) obj).d.a().b(r0, new loo() { // from class: ahtc
                @Override // defpackage.loo
                public final Object a(lpa lpaVar2) throws ExecutionException {
                    if (i2 != 0) {
                        if (!lpaVar2.j()) {
                            return mda.l(axfd.h(lpaVar2));
                        }
                        return mda.m(new Pair((String) lpaVar2.f(), str));
                    }
                    if (!lpaVar2.j()) {
                        throw new ExecutionException(lpaVar2.e());
                    }
                    String str2 = (String) lpaVar2.f();
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = str;
                        if (str2.endsWith(str3)) {
                            return str3;
                        }
                    }
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
            });
        }
        if (!lpaVar.j()) {
            return mda.l(axfd.h(lpaVar));
        }
        ?? r1 = this.a;
        Object obj2 = this.b;
        final String str2 = (String) ((Pair) lpaVar.f()).first;
        String str3 = (String) ((Pair) lpaVar.f()).second;
        axfd axfdVar = (axfd) obj2;
        ahnr ahnrVar = (ahnr) axfdVar.e;
        String str4 = ahnrVar.e().a;
        final int i3 = 0;
        return axfdVar.a.a(new kle(a.g(ahnrVar), ahnrVar.e().b, str4, str2, str3)).a(r1, new loo() { // from class: ahtc
            @Override // defpackage.loo
            public final Object a(lpa lpaVar2) throws ExecutionException {
                if (i3 != 0) {
                    if (!lpaVar2.j()) {
                        return mda.l(axfd.h(lpaVar2));
                    }
                    return mda.m(new Pair((String) lpaVar2.f(), str2));
                }
                if (!lpaVar2.j()) {
                    throw new ExecutionException(lpaVar2.e());
                }
                String str5 = (String) lpaVar2.f();
                if (!TextUtils.isEmpty(str5)) {
                    String str6 = str2;
                    if (str5.endsWith(str6)) {
                        return str6;
                    }
                }
                throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
            }
        });
    }

    public /* synthetic */ kji(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
