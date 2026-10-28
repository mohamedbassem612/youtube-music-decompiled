package defpackage;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zrn extends sye {
    private final Executor a;
    private final tqj b;
    private final boolean c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;

    public zrn(Executor executor, tqj tqjVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        this.a = executor;
        this.b = tqjVar;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.d = awmdVar3;
        this.g = awmdVar4;
        int i = tqr.a;
        this.c = tqjVar.k(1073828828);
    }

    @Override // defpackage.sye
    protected final void c() {
        if (!((ztn) this.f.io()).a()) {
            Executor executor = this.a;
            zth zthVar = (zth) this.d.io();
            zthVar.getClass();
            executor.execute(afwl.i(new zdv(zthVar, 20)));
        }
        if (this.c) {
            tqj tqjVar = this.b;
            int i = tqr.a;
            if (tqjVar.a(1073960047) == 1) {
                ((tko) this.g.io()).g(true);
            }
        }
    }

    @Override // defpackage.sye
    protected final void d() {
        if (((ztn) this.f.io()).a()) {
            ((ztf) this.e.io()).n();
        }
        if (this.c) {
            tqj tqjVar = this.b;
            int i = tqr.a;
            if (tqjVar.a(1073960047) == 2) {
                ((tko) this.g.io()).g(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x009f A[Catch: all -> 0x018d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x018d, blocks: (B:8:0x002d, B:10:0x0035, B:16:0x004d, B:18:0x0061, B:20:0x0067, B:21:0x0078, B:23:0x007e, B:29:0x009f, B:47:0x00f3, B:49:0x00f8, B:66:0x0166, B:73:0x0173, B:72:0x0170, B:74:0x0174, B:81:0x0181, B:80:0x017e, B:83:0x0183, B:27:0x008d, B:30:0x00b0, B:32:0x00b5, B:34:0x00c4, B:37:0x00d4, B:39:0x00e0, B:41:0x00e4, B:42:0x00eb, B:43:0x00ec, B:50:0x00fc, B:52:0x0100, B:54:0x010b, B:55:0x010e, B:57:0x0128, B:59:0x012e, B:60:0x0134, B:61:0x013a, B:63:0x0140, B:64:0x014a, B:65:0x0152, B:77:0x0179, B:14:0x003f, B:69:0x016b), top: B:102:0x002d, inners: #0, #1, #2, #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[Catch: all -> 0x0178, TryCatch #1 {all -> 0x0178, blocks: (B:30:0x00b0, B:32:0x00b5, B:34:0x00c4, B:37:0x00d4, B:39:0x00e0, B:41:0x00e4, B:42:0x00eb, B:43:0x00ec), top: B:95:0x00b0, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4 A[Catch: all -> 0x0178, TryCatch #1 {all -> 0x0178, blocks: (B:30:0x00b0, B:32:0x00b5, B:34:0x00c4, B:37:0x00d4, B:39:0x00e0, B:41:0x00e4, B:42:0x00eb, B:43:0x00ec), top: B:95:0x00b0, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4 A[Catch: all -> 0x0178, TryCatch #1 {all -> 0x0178, blocks: (B:30:0x00b0, B:32:0x00b5, B:34:0x00c4, B:37:0x00d4, B:39:0x00e0, B:41:0x00e4, B:42:0x00eb, B:43:0x00ec), top: B:95:0x00b0, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0 A[Catch: all -> 0x0178, TryCatch #1 {all -> 0x0178, blocks: (B:30:0x00b0, B:32:0x00b5, B:34:0x00c4, B:37:0x00d4, B:39:0x00e0, B:41:0x00e4, B:42:0x00eb, B:43:0x00ec), top: B:95:0x00b0, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #5 {all -> 0x018d, blocks: (B:8:0x002d, B:10:0x0035, B:16:0x004d, B:18:0x0061, B:20:0x0067, B:21:0x0078, B:23:0x007e, B:29:0x009f, B:47:0x00f3, B:49:0x00f8, B:66:0x0166, B:73:0x0173, B:72:0x0170, B:74:0x0174, B:81:0x0181, B:80:0x017e, B:83:0x0183, B:27:0x008d, B:30:0x00b0, B:32:0x00b5, B:34:0x00c4, B:37:0x00d4, B:39:0x00e0, B:41:0x00e4, B:42:0x00eb, B:43:0x00ec, B:50:0x00fc, B:52:0x0100, B:54:0x010b, B:55:0x010e, B:57:0x0128, B:59:0x012e, B:60:0x0134, B:61:0x013a, B:63:0x0140, B:64:0x014a, B:65:0x0152, B:77:0x0179, B:14:0x003f, B:69:0x016b), top: B:102:0x002d, inners: #0, #1, #2, #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[Catch: all -> 0x016a, TryCatch #2 {all -> 0x016a, blocks: (B:50:0x00fc, B:52:0x0100, B:54:0x010b, B:55:0x010e, B:57:0x0128, B:59:0x012e, B:60:0x0134, B:61:0x013a, B:63:0x0140, B:64:0x014a, B:65:0x0152), top: B:96:0x00fc, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010b A[Catch: all -> 0x016a, TryCatch #2 {all -> 0x016a, blocks: (B:50:0x00fc, B:52:0x0100, B:54:0x010b, B:55:0x010e, B:57:0x0128, B:59:0x012e, B:60:0x0134, B:61:0x013a, B:63:0x0140, B:64:0x014a, B:65:0x0152), top: B:96:0x00fc, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0128 A[Catch: all -> 0x016a, TryCatch #2 {all -> 0x016a, blocks: (B:50:0x00fc, B:52:0x0100, B:54:0x010b, B:55:0x010e, B:57:0x0128, B:59:0x012e, B:60:0x0134, B:61:0x013a, B:63:0x0140, B:64:0x014a, B:65:0x0152), top: B:96:0x00fc, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012e A[Catch: all -> 0x016a, TryCatch #2 {all -> 0x016a, blocks: (B:50:0x00fc, B:52:0x0100, B:54:0x010b, B:55:0x010e, B:57:0x0128, B:59:0x012e, B:60:0x0134, B:61:0x013a, B:63:0x0140, B:64:0x014a, B:65:0x0152), top: B:96:0x00fc, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0140 A[Catch: all -> 0x016a, LOOP:0: B:61:0x013a->B:63:0x0140, LOOP_END, TryCatch #2 {all -> 0x016a, blocks: (B:50:0x00fc, B:52:0x0100, B:54:0x010b, B:55:0x010e, B:57:0x0128, B:59:0x012e, B:60:0x0134, B:61:0x013a, B:63:0x0140, B:64:0x014a, B:65:0x0152), top: B:96:0x00fc, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0174 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #5 {all -> 0x018d, blocks: (B:8:0x002d, B:10:0x0035, B:16:0x004d, B:18:0x0061, B:20:0x0067, B:21:0x0078, B:23:0x007e, B:29:0x009f, B:47:0x00f3, B:49:0x00f8, B:66:0x0166, B:73:0x0173, B:72:0x0170, B:74:0x0174, B:81:0x0181, B:80:0x017e, B:83:0x0183, B:27:0x008d, B:30:0x00b0, B:32:0x00b5, B:34:0x00c4, B:37:0x00d4, B:39:0x00e0, B:41:0x00e4, B:42:0x00eb, B:43:0x00ec, B:50:0x00fc, B:52:0x0100, B:54:0x010b, B:55:0x010e, B:57:0x0128, B:59:0x012e, B:60:0x0134, B:61:0x013a, B:63:0x0140, B:64:0x014a, B:65:0x0152, B:77:0x0179, B:14:0x003f, B:69:0x016b), top: B:102:0x002d, inners: #0, #1, #2, #3, #4, #6 }] */
    @Override // defpackage.sye
    protected final void e() {
        zsu zsuVar;
        zus zusVar;
        aunz aunzVarG;
        boolean z;
        aunz aunzVarG2;
        zuh zuhVar;
        ztm ztmVar;
        zuo zuoVar;
        Iterator it;
        ztm ztmVar2;
        int size;
        zuo zuoVar2;
        awmd awmdVar = this.f;
        if (((ztn) awmdVar.io()).a()) {
            ((ztf) this.e.io()).m();
        }
        tqj tqjVar = this.b;
        int i = tqr.a;
        if (tqjVar.a(1073880827) != 0) {
            ztn ztnVar = (ztn) awmdVar.io();
            try {
                int iA = ztnVar.e.a(1073880827);
                if (iA != 0) {
                    boolean zA = ztnVar.a();
                    if ((iA & 1) != 0 && zA) {
                        try {
                            if (ztnVar.g.getDatabasePath("com.google.android.libraries.youtube.net.delayedevents.DelayedEventStore").exists()) {
                                zst zstVar = (zst) ztnVar.b.io();
                                if (ztnVar.e.a(1074135289) == 5 || zstVar.o()) {
                                    zstVar.i();
                                } else {
                                    zstVar.e(ztnVar.c);
                                    ((zth) ztnVar.d.io()).a();
                                    if ((iA & 2) != 0) {
                                        if (((zus) ztnVar.f.io()).D().exists()) {
                                            zsuVar = (zsu) ztnVar.a.io();
                                            zsuVar.n();
                                            zusVar = zsuVar.c;
                                            aunzVarG = zusVar.G();
                                            if (zsuVar.j) {
                                                z = true;
                                            } else {
                                                zsuVar.h();
                                                ztmVar2 = (ztm) zsuVar.a.io();
                                                if (ztmVar2.k) {
                                                    z = true;
                                                } else {
                                                    ztmVar2.k();
                                                    ztmVar2.j();
                                                    size = ztmVar2.a.size();
                                                    if (size == 0) {
                                                        z = true;
                                                    } else {
                                                        if (size <= 1) {
                                                            zuoVar2 = ztmVar2.g;
                                                            ztmVar2.i(zuoVar2);
                                                            zuoVar2.M();
                                                            if (!zuoVar2.m) {
                                                            }
                                                            if (zuoVar2.M == 0) {
                                                                z = true;
                                                            }
                                                        }
                                                        z = false;
                                                    }
                                                }
                                            }
                                            aunzVarG.close();
                                            if (z) {
                                                aunzVarG2 = zusVar.G();
                                                if (!zsuVar.j) {
                                                    zsuVar.j = true;
                                                    zsuVar.i.dispose();
                                                    zuhVar = zsuVar.h;
                                                    if (zuhVar != null) {
                                                        zuhVar.b();
                                                    }
                                                    ((ztd) zsuVar.b.io()).q();
                                                    ztmVar = (ztm) zsuVar.a.io();
                                                    ztmVar.j();
                                                    if (!ztmVar.k) {
                                                        ztmVar.k = true;
                                                        zuoVar = ztmVar.g;
                                                        if (zuoVar != null) {
                                                            zuoVar.ah(false);
                                                            ztmVar.g = null;
                                                        }
                                                        Deque deque = ztmVar.a;
                                                        it = deque.iterator();
                                                        while (it.hasNext()) {
                                                            ((zuo) it.next()).q();
                                                        }
                                                        deque.clear();
                                                        ztmVar.b.clear();
                                                    }
                                                    zsuVar.d.h(-1L, 13);
                                                    tym.r(zusVar.D(), zusVar.C());
                                                }
                                                aunzVarG2.close();
                                            } else {
                                                zsuVar.m();
                                            }
                                        }
                                    }
                                }
                            } else if ((iA & 2) != 0) {
                                if (((zus) ztnVar.f.io()).D().exists()) {
                                    zsuVar = (zsu) ztnVar.a.io();
                                    zsuVar.n();
                                    zusVar = zsuVar.c;
                                    aunzVarG = zusVar.G();
                                    if (zsuVar.j) {
                                        zsuVar.h();
                                        ztmVar2 = (ztm) zsuVar.a.io();
                                        if (ztmVar2.k) {
                                            ztmVar2.k();
                                            ztmVar2.j();
                                            size = ztmVar2.a.size();
                                            if (size == 0) {
                                                z = true;
                                            } else {
                                                if (size <= 1) {
                                                    zuoVar2 = ztmVar2.g;
                                                    ztmVar2.i(zuoVar2);
                                                    zuoVar2.M();
                                                    if (!zuoVar2.m) {
                                                    }
                                                    if (zuoVar2.M == 0) {
                                                        z = true;
                                                    }
                                                }
                                                z = false;
                                            }
                                        } else {
                                            z = true;
                                        }
                                    } else {
                                        z = true;
                                    }
                                    aunzVarG.close();
                                    if (z) {
                                        aunzVarG2 = zusVar.G();
                                        if (!zsuVar.j) {
                                            zsuVar.j = true;
                                            zsuVar.i.dispose();
                                            zuhVar = zsuVar.h;
                                            if (zuhVar != null) {
                                                zuhVar.b();
                                            }
                                            ((ztd) zsuVar.b.io()).q();
                                            ztmVar = (ztm) zsuVar.a.io();
                                            ztmVar.j();
                                            if (!ztmVar.k) {
                                                ztmVar.k = true;
                                                zuoVar = ztmVar.g;
                                                if (zuoVar != null) {
                                                    zuoVar.ah(false);
                                                    ztmVar.g = null;
                                                }
                                                Deque deque2 = ztmVar.a;
                                                it = deque2.iterator();
                                                while (it.hasNext()) {
                                                    ((zuo) it.next()).q();
                                                }
                                                deque2.clear();
                                                ztmVar.b.clear();
                                            }
                                            zsuVar.d.h(-1L, 13);
                                            tym.r(zusVar.D(), zusVar.C());
                                        }
                                        aunzVarG2.close();
                                    } else {
                                        zsuVar.m();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            zvp.b(zvn.b, zvm.m, "!v1Exists", th);
                        }
                    } else if ((iA & 2) != 0 && !zA) {
                        try {
                            if (((zus) ztnVar.f.io()).D().exists()) {
                                zsuVar = (zsu) ztnVar.a.io();
                                zsuVar.n();
                                zusVar = zsuVar.c;
                                aunzVarG = zusVar.G();
                                try {
                                    if (zsuVar.j) {
                                        zsuVar.h();
                                        ztmVar2 = (ztm) zsuVar.a.io();
                                        if (ztmVar2.k) {
                                            ztmVar2.k();
                                            ztmVar2.j();
                                            size = ztmVar2.a.size();
                                            if (size == 0) {
                                                z = true;
                                            } else {
                                                if (size <= 1) {
                                                    zuoVar2 = ztmVar2.g;
                                                    ztmVar2.i(zuoVar2);
                                                    zuoVar2.M();
                                                    if (!zuoVar2.m && zuoVar2.h != 2) {
                                                        throw new IllegalStateException("mmcb !loaded");
                                                    }
                                                    if (zuoVar2.M == 0) {
                                                        z = true;
                                                    }
                                                }
                                                z = false;
                                            }
                                        } else {
                                            z = true;
                                        }
                                    } else {
                                        z = true;
                                    }
                                    aunzVarG.close();
                                    if (z) {
                                        aunzVarG2 = zusVar.G();
                                        try {
                                            if (!zsuVar.j) {
                                                zsuVar.j = true;
                                                zsuVar.i.dispose();
                                                zuhVar = zsuVar.h;
                                                if (zuhVar != null) {
                                                    zuhVar.b();
                                                }
                                                ((ztd) zsuVar.b.io()).q();
                                                ztmVar = (ztm) zsuVar.a.io();
                                                ztmVar.j();
                                                if (!ztmVar.k) {
                                                    ztmVar.k = true;
                                                    zuoVar = ztmVar.g;
                                                    if (zuoVar != null) {
                                                        zuoVar.ah(false);
                                                        ztmVar.g = null;
                                                    }
                                                    Deque deque3 = ztmVar.a;
                                                    it = deque3.iterator();
                                                    while (it.hasNext()) {
                                                        ((zuo) it.next()).q();
                                                    }
                                                    deque3.clear();
                                                    ztmVar.b.clear();
                                                }
                                                zsuVar.d.h(-1L, 13);
                                                tym.r(zusVar.D(), zusVar.C());
                                            }
                                            aunzVarG2.close();
                                        } catch (Throwable th2) {
                                            try {
                                                aunzVarG2.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        zsuVar.m();
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        aunzVarG.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                    throw th4;
                                }
                            }
                        } catch (Throwable th6) {
                            zvp.b(zvn.b, zvm.m, "!v2Exists", th6);
                        }
                    }
                }
            } catch (Throwable th7) {
                zvp.b(zvn.b, zvm.m, "!migrateIfNeeded", th7);
            }
        }
        if (this.c && this.b.a(1073960047) == 3) {
            ((tko) this.g.io()).g(false);
        }
    }
}
