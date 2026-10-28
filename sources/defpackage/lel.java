package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lel implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    public /* synthetic */ lel(Intent intent, plz plzVar, pma pmaVar, long j, pnw pnwVar, int i) {
        this.$cid = i;
        this.e = intent;
        this.a = plzVar;
        this.d = pmaVar;
        this.b = j;
        this.c = pnwVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0073 A[PHI: r1
      0x0073: PHI (r1v12 java.lang.Object) = (r1v11 java.lang.Object), (r1v19 java.lang.Object) binds: [B:41:0x006e, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, pma] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, pnw] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ((ler) this.e).ae((String) this.c, (String) this.d, this.a, this.b);
            return;
        }
        Object objV = null;
        if (i == 1) {
            Object obj = this.a;
            if (obj == null) {
                ((lcn) this.e).a.R((String) this.d, null);
                return;
            } else {
                ((lcn) this.e).a.R((String) this.d, new lhf((String) this.c, (String) obj, this.b, false, 0L, 0L));
                return;
            }
        }
        if (i == 2) {
            Bundle bundle = (Bundle) this.e;
            bundle.remove("screen_name");
            bundle.remove("screen_class");
            Object obj2 = this.c;
            ldz ldzVar = (ldz) obj2;
            lbt lbtVarG = ldzVar.G();
            adam adamVar = lcl.aT;
            Bundle bundleU = ldzVar.L().u(null, "screen_view", bundle, null, false, lbtVarG.F(null, adamVar) ? ((lbb) obj2).i().t() : lgv.a);
            if (ldzVar.G().F(null, adamVar)) {
                ((lbb) obj2).i().t().a();
            }
            ((lhh) obj2).v((lhf) this.d, (lhf) this.a, this.b, true, bundleU);
            return;
        }
        int i2 = 3;
        if (i == 3) {
            zpw zpwVar = (zpw) this.a;
            ahno.ao(new lel(zpwVar, (ahai) this.d, (ListenableFuture) this.c, (qcb) this.e, ((omj) zpwVar.d).g() - this.b, 4), zpwVar.o);
            return;
        }
        if (i != 4) {
            Intent intent = (Intent) this.e;
            intent.getAction();
            ((plz) this.a).d(intent, this.d, plb.c(), this.b, this.c);
            return;
        }
        try {
            objV = ahng.v(this.c);
            if (true != ((Boolean) objV).booleanValue()) {
                i2 = 4;
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            if (th instanceof CancellationException) {
                i2 = 5;
            } else if (th instanceof InterruptedException) {
                i2 = 6;
            } else if (th instanceof IOException) {
                i2 = 7;
            } else if (th instanceof IllegalStateException) {
                i2 = 8;
            } else if (th instanceof IllegalArgumentException) {
                i2 = 9;
            } else if (th instanceof UnsupportedOperationException) {
                i2 = 10;
            } else if (th instanceof oig) {
                i2 = 11;
            } else {
                i2 = 4;
            }
        }
        Object obj3 = this.d;
        if (objV != null) {
            Object obj4 = this.e;
            aihf builder = ((aihn) obj3).toBuilder();
            builder.mergeFrom((aihn) ((qcb) obj4).a);
            obj3 = (ahai) builder.build();
        }
        aihf aihfVarCreateBuilder = ahaq.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahaq ahaqVar = (ahaq) aihfVarCreateBuilder.instance;
        long j = this.b;
        ahaqVar.c = 1;
        ahaqVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ahaq ahaqVar2 = (ahaq) aihfVarCreateBuilder.instance;
        ahaqVar2.d = i2 - 2;
        ahaqVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        ahaq ahaqVar3 = (ahaq) aihfVarCreateBuilder.instance;
        ahaqVar3.b |= 4;
        ahaqVar3.f = j;
        aihfVarCreateBuilder.copyOnWrite();
        ahaq ahaqVar4 = (ahaq) aihfVarCreateBuilder.instance;
        obj3.getClass();
        aiie aiieVar = ahaqVar4.e;
        if (!aiieVar.c()) {
            ahaqVar4.e = aihn.mutableCopy(aiieVar);
        }
        Object obj5 = this.a;
        ahaqVar4.e.add(obj3);
        ((ong) ((zpw) obj5).k).f((ahaq) aihfVarCreateBuilder.build());
    }

    public lel(lcn lcnVar, String str, String str2, String str3, long j, int i) {
        this.$cid = i;
        this.a = str;
        this.d = str2;
        this.c = str3;
        this.b = j;
        this.e = lcnVar;
    }

    public lel(ler lerVar, String str, String str2, Object obj, long j, int i) {
        this.$cid = i;
        this.c = str;
        this.d = str2;
        this.a = obj;
        this.b = j;
        this.e = lerVar;
    }

    public lel(lhh lhhVar, Bundle bundle, lhf lhfVar, lhf lhfVar2, long j, int i) {
        this.$cid = i;
        this.e = bundle;
        this.d = lhfVar;
        this.a = lhfVar2;
        this.b = j;
        this.c = lhhVar;
    }

    public /* synthetic */ lel(zpw zpwVar, long j, ahai ahaiVar, ListenableFuture listenableFuture, qcb qcbVar, int i) {
        this.$cid = i;
        this.a = zpwVar;
        this.b = j;
        this.d = ahaiVar;
        this.c = listenableFuture;
        this.e = qcbVar;
    }

    public /* synthetic */ lel(zpw zpwVar, ahai ahaiVar, ListenableFuture listenableFuture, qcb qcbVar, long j, int i) {
        this.$cid = i;
        this.a = zpwVar;
        this.d = ahaiVar;
        this.c = listenableFuture;
        this.e = qcbVar;
        this.b = j;
    }
}
