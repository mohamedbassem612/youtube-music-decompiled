package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aver implements avhm {
    public final avcj b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public avhl f;
    private final Executor j;
    private final avaa i = avaa.a(aver.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile axoz h = new axoz((avar) null, (Status) null);

    public aver(Executor executor, avcj avcjVar) {
        this.j = executor;
        this.b = avcjVar;
    }

    private static String h(avan avanVar) {
        if (avanVar != null) {
            if (avanVar.b != null) {
                return "subchannel returned by LB picker has no connected subchannel";
            }
            Status status = avanVar.c;
            if (!status.e()) {
                return "wait_for_ready RPC failed with status: " + status.getCode().toString() + (status.getDescription() == null ? "" : ": ".concat(String.valueOf(status.getDescription())));
            }
            String str = avanVar.f;
            if (str != null) {
                return str;
            }
        }
        return "client channel: waiting for picker";
    }

    private static String i(avan avanVar) {
        if (avanVar != null) {
            if (avanVar.b != null) {
                return "subchannel_state_mismatch";
            }
            if (!avanVar.c.e()) {
                return "picker_failing_with_wait_for_ready";
            }
            String str = avanVar.e;
            if (str != null) {
                return str;
            }
        }
        return "connecting";
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        r7 = r0;
     */
    @Override // defpackage.avdx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.avdu a(defpackage.avbh r7, defpackage.avbe r8, defpackage.auyq r9, defpackage.auyw[] r10) throws java.lang.Throwable {
        /*
            r6 = this;
            avao r2 = new avao     // Catch: java.lang.Throwable -> La6
            avhx r0 = new avhx     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            r2.<init>(r7, r8, r9, r0)     // Catch: java.lang.Throwable -> La6
            axoz r7 = r6.h     // Catch: java.lang.Throwable -> La6
        Lc:
            java.lang.Object r8 = r7.a     // Catch: java.lang.Throwable -> La6
            if (r8 == 0) goto L18
            avfb r7 = new avfb     // Catch: java.lang.Throwable -> L38
            io.grpc.Status r8 = (io.grpc.Status) r8     // Catch: java.lang.Throwable -> L38
            r7.<init>(r8, r10)     // Catch: java.lang.Throwable -> L38
            goto L36
        L18:
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> La6
            if (r8 == 0) goto L3d
            avar r8 = (defpackage.avar) r8     // Catch: java.lang.Throwable -> L38
            avan r8 = r8.a()     // Catch: java.lang.Throwable -> L38
            auyq r9 = r2.a     // Catch: java.lang.Throwable -> L38
            boolean r0 = r9.e()     // Catch: java.lang.Throwable -> L38
            avdx r0 = defpackage.avfp.c(r8, r0)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3e
            avbh r7 = r2.c     // Catch: java.lang.Throwable -> L38
            avbe r8 = r2.b     // Catch: java.lang.Throwable -> L38
            avdu r7 = r0.a(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L38
        L36:
            r1 = r6
            goto L8a
        L38:
            r0 = move-exception
            r7 = r0
            r1 = r6
            goto La9
        L3d:
            r8 = 0
        L3e:
            java.lang.Object r9 = r6.a     // Catch: java.lang.Throwable -> La6
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La6
            axoz r0 = r6.h     // Catch: java.lang.Throwable -> L9d
            if (r7 != r0) goto L95
            java.lang.String r4 = i(r8)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = h(r8)     // Catch: java.lang.Throwable -> L9d
            aveq r0 = new aveq     // Catch: java.lang.Throwable -> L9d
            r1 = r6
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La4
            auyq r6 = r2.a     // Catch: java.lang.Throwable -> La4
            boolean r6 = r6.e()     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L68
            if (r8 == 0) goto L68
            boolean r6 = r8.c()     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L68
            io.grpc.Status r6 = r8.c     // Catch: java.lang.Throwable -> La4
            r0.d = r6     // Catch: java.lang.Throwable -> La4
        L68:
            java.util.Collection r6 = r1.g     // Catch: java.lang.Throwable -> La4
            r6.add(r0)     // Catch: java.lang.Throwable -> La4
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La4
            java.util.Collection r6 = r1.g     // Catch: java.lang.Throwable -> L92
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L92
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L92
            r7 = 1
            if (r6 != r7) goto L7f
            avcj r6 = r1.b     // Catch: java.lang.Throwable -> La4
            java.lang.Runnable r7 = r1.c     // Catch: java.lang.Throwable -> La4
            r6.b(r7)     // Catch: java.lang.Throwable -> La4
        L7f:
            int r6 = r3.length     // Catch: java.lang.Throwable -> La4
            r7 = 0
        L81:
            if (r7 >= r6) goto L88
            r8 = r3[r7]     // Catch: java.lang.Throwable -> La4
            int r7 = r7 + 1
            goto L81
        L88:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            r7 = r0
        L8a:
            avcj r6 = r1.b
            r6.a()
            return r7
        L90:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L92
            throw r6     // Catch: java.lang.Throwable -> La4
        L92:
            r0 = move-exception
            r6 = r0
            goto L90
        L95:
            r1 = r6
            r3 = r10
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            r7 = r0
            r6 = r1
            r10 = r3
            goto Lc
        L9d:
            r0 = move-exception
            r1 = r6
        L9f:
            r6 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La4
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            goto La8
        La4:
            r0 = move-exception
            goto L9f
        La6:
            r0 = move-exception
            r1 = r6
        La8:
            r7 = r0
        La9:
            avcj r6 = r1.b
            r6.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aver.a(avbh, avbe, auyq, auyw[]):avdu");
    }

    @Override // defpackage.avhm
    public final Runnable b(avhl avhlVar) {
        throw null;
    }

    @Override // defpackage.avae
    public final avaa c() {
        return this.i;
    }

    final void d(avar avarVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new axoz(avarVar, (Status) this.h.a);
            if (avarVar == null || !g()) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.g);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aveq aveqVar = (aveq) arrayList.get(i);
                avao avaoVar = aveqVar.a;
                auyq auyqVar = avaoVar.a;
                avan avanVarA = avarVar.a();
                if (auyqVar.e() && avanVarA.c()) {
                    aveqVar.d = avanVarA.c;
                }
                avdx avdxVarC = avfp.c(avanVarA, auyqVar.e());
                if (avdxVarC != null) {
                    aveqVar.c();
                    Executor executor = this.j;
                    Executor executor2 = auyqVar.c;
                    auzh auzhVar = aveqVar.b;
                    auzh auzhVarA = auzhVar.a();
                    try {
                        avdu avduVarA = avdxVarC.a(avaoVar.c, avaoVar.b, auyqVar, aveqVar.c);
                        auzhVar.c(auzhVarA);
                        Runnable runnableB = aveqVar.b(avduVarA);
                        if (runnableB != null) {
                            if (executor2 != null) {
                                executor = executor2;
                            }
                            executor.execute(runnableB);
                        }
                        arrayList2.add(aveqVar);
                    } catch (Throwable th) {
                        aveqVar.b.c(auzhVarA);
                        throw th;
                    }
                } else {
                    aveqVar.d(i(avanVarA), h(avanVarA));
                }
            }
            synchronized (this.a) {
                if (g()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        this.g.remove((aveq) it.next());
                    }
                    if (this.g.isEmpty()) {
                        this.g = new LinkedHashSet();
                    }
                    if (!g()) {
                        avcj avcjVar = this.b;
                        avcjVar.b(this.d);
                        if (this.h.a != null && (runnable = this.e) != null) {
                            avcjVar.b(runnable);
                            this.e = null;
                        }
                    }
                    this.b.a();
                }
            }
        }
    }

    @Override // defpackage.avhm
    public final void e(Status status) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.a != null) {
                return;
            }
            this.h = new axoz((avar) this.h.b, status);
            avcj avcjVar = this.b;
            avcjVar.b(new avep(this, 4));
            if (!g() && (runnable = this.e) != null) {
                avcjVar.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    @Override // defpackage.avhm
    public final void f(Status status) {
        Collection<aveq> collection;
        Runnable runnable;
        e(status);
        synchronized (this.a) {
            collection = this.g;
            runnable = this.e;
            this.e = null;
            if (!collection.isEmpty()) {
                this.g = Collections.EMPTY_LIST;
            }
        }
        if (runnable != null) {
            for (aveq aveqVar : collection) {
                Runnable runnableB = aveqVar.b(new avfb(status, avdv.b, aveqVar.c));
                if (runnableB != null) {
                    runnableB.run();
                }
            }
            this.b.execute(runnable);
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }
}
