package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abmo implements abml {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/internal/queue/LegacyQueueController");
    public final abpj b;
    public final abwj c;
    public acip f;
    public final adet g;
    public final dxu h;
    private final txp i;
    private final abwp j;
    private final Executor k;
    private final aunn l;
    private final abmt m;
    private final avmm n = new avmm();
    private final AtomicReference o = new AtomicReference(null);
    public String e = null;
    public abmj d = null;

    public abmo(txp txpVar, abwp abwpVar, abpj abpjVar, adet adetVar, aunn aunnVar, abwj abwjVar, abmt abmtVar, dxu dxuVar, Executor executor) {
        this.i = txpVar;
        this.j = abwpVar;
        this.b = abpjVar;
        this.g = adetVar;
        this.l = aunnVar;
        this.c = abwjVar;
        this.k = executor;
        this.m = abmtVar;
        this.h = dxuVar;
    }

    private static final ListenableFuture i(abor aborVar, abnt abntVar, abnl abnlVar, abnp abnpVar) {
        ListenableFuture listenableFutureF = (abntVar.a > 0 || abntVar.c == 3) ? aborVar.f(abnlVar, abntVar, abnpVar.b, abnpVar) : null;
        if (listenableFutureF != null) {
            return listenableFutureF;
        }
        return aborVar.g(abnlVar, abntVar.b.a(), abnpVar.b, abnpVar);
    }

    @Override // defpackage.abml
    public final ListenableFuture a(abnt abntVar, abnl abnlVar, abnp abnpVar) {
        return i(((abos) this.l.io()).a(abnlVar), abntVar, abnlVar, abnpVar);
    }

    @Override // defpackage.abml
    public final ListenableFuture b(abnt abntVar, abnl abnlVar, abnp abnpVar, absr absrVar, abmj abmjVar) {
        if (abnlVar == null || abnpVar == null) {
            return ahng.m(new IllegalArgumentException("PlaybackStartDescriptor and PlaybackStartParameters cannot be null"));
        }
        abor aborVarA = ((abos) this.l.io()).a(abnlVar);
        AtomicReference atomicReference = this.o;
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.get();
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        acip acipVar = this.f;
        ListenableFuture listenableFutureI = i(aborVarA, abntVar, abnlVar, abnpVar);
        atomicReference.set(listenableFutureI);
        taf.i(listenableFutureI, this.k, new ztb(15), new xex(this, acipVar, abnlVar, abnpVar, abmjVar, 3), new abmn(0));
        return listenableFutureI;
    }

    @Override // defpackage.abml
    public final void c(agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return;
        }
        e(((abmk) agkeVar.get(0)).a.a, ((abmk) agkeVar.get(0)).a.b, ((abmk) agkeVar.get(0)).a.c, ((abmk) agkeVar.get(0)).b);
    }

    @Override // defpackage.abml
    public final boolean d() {
        return this.e != null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[Catch: all -> 0x0071, DONT_GENERATE, TryCatch #0 {, blocks: (B:16:0x0041, B:18:0x0045, B:20:0x0047, B:22:0x0051, B:24:0x0053, B:26:0x005b, B:28:0x0061, B:30:0x0063, B:31:0x0066), top: B:41:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0047 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:16:0x0041, B:18:0x0045, B:20:0x0047, B:22:0x0051, B:24:0x0053, B:26:0x005b, B:28:0x0061, B:30:0x0063, B:31:0x0066), top: B:41:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x0071, DONT_GENERATE, TryCatch #0 {, blocks: (B:16:0x0041, B:18:0x0045, B:20:0x0047, B:22:0x0051, B:24:0x0053, B:26:0x005b, B:28:0x0061, B:30:0x0063, B:31:0x0066), top: B:41:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:16:0x0041, B:18:0x0045, B:20:0x0047, B:22:0x0051, B:24:0x0053, B:26:0x005b, B:28:0x0061, B:30:0x0063, B:31:0x0066), top: B:41:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:16:0x0041, B:18:0x0045, B:20:0x0047, B:22:0x0051, B:24:0x0053, B:26:0x005b, B:28:0x0061, B:30:0x0063, B:31:0x0066), top: B:41:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [acey, java.lang.Object] */
    @Override // defpackage.abml
    public final boolean e(abnl abnlVar, abnp abnpVar, wjf wjfVar, abmj abmjVar) {
        abwp abwpVar;
        abwk abwkVar;
        ?? r4;
        acip acipVar;
        String strQ = abnlVar.q(this.i);
        boolean z = false;
        if (this.c.b) {
            abmt abmtVar = this.m;
            if ((!rmp.t(wjfVar, abmtVar.ba()) || abmtVar.B()) && ((acipVar = this.f) == null || !rmp.s(acipVar.f()) || abmtVar.A())) {
                abwpVar = this.j;
                wjfVar.getClass();
                abnlVar.getClass();
                abnpVar.getClass();
                abwkVar = abwpVar.a;
                synchronized (abwkVar) {
                    r4 = abwkVar.d;
                    if (r4 == 0) {
                        if (!aaje.q(wjfVar.t())) {
                            if (abwpVar.e.O() || !r4.am()) {
                                r4.M(wjfVar, abnlVar, abnpVar);
                                z = true;
                            }
                        }
                    }
                }
            }
        } else {
            abwpVar = this.j;
            wjfVar.getClass();
            abnlVar.getClass();
            abnpVar.getClass();
            abwkVar = abwpVar.a;
            synchronized (abwkVar) {
                r4 = abwkVar.d;
                if (r4 == 0) {
                    if (!aaje.q(wjfVar.t())) {
                        if (abwpVar.e.O()) {
                            r4.M(wjfVar, abnlVar, abnpVar);
                            z = true;
                        } else {
                            r4.M(wjfVar, abnlVar, abnpVar);
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            this.e = strQ;
            this.d = abmjVar;
        }
        return z;
    }

    public final void f() {
        this.e = null;
        this.d = null;
    }

    public final void g(avlh avlhVar, avlh avlhVar2) {
        this.n.e(avlhVar.ak(new abmm(this, 1)), avlhVar2.ak(new abmm(this, 0)));
    }
}
