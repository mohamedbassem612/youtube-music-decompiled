package defpackage;

import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dbh implements cvi {
    public final List a;
    public long b;
    private final dbn c;
    private final bse d;
    private cwj g;
    private cvk h;
    private cvt i;
    private int j;
    private int k;
    private long[] l;
    private byte[] f = bwp.e;
    private final bwb e = new bwb();

    public dbh(dbn dbnVar, bse bseVar) {
        bse bseVar2;
        this.c = dbnVar;
        if (bseVar != null) {
            bsd bsdVar = new bsd(bseVar);
            bsdVar.e("application/x-media3-cues");
            bsdVar.k = bseVar.q;
            bsdVar.N = dbnVar.a();
            bseVar2 = new bse(bsdVar);
        } else {
            bseVar2 = null;
        }
        this.d = bseVar2;
        this.a = new ArrayList();
        this.k = 0;
        this.l = bwp.f;
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        ahno.O(this.k == 0);
        this.h = cvkVar;
        cwj cwjVarS = cvkVar.s(0, 3);
        this.g = cwjVarS;
        bse bseVar = this.d;
        if (bseVar != null) {
            cwjVarS.b(bseVar);
            cvkVar.t();
            cvt cvtVar = new cvt(new long[]{0}, new long[]{0}, -9223372036854775807L);
            this.i = cvtVar;
            cvkVar.z(cvtVar);
        }
        this.k = 1;
    }

    @Override // defpackage.cvi
    public final void c() {
        if (this.k != 5) {
            this.c.d();
            this.k = 5;
        }
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        int i = this.k;
        boolean z = false;
        if (i != 0 && i != 5) {
            z = true;
        }
        ahno.O(z);
        this.b = j2;
        int i2 = this.k;
        if (i2 == 2) {
            this.k = 1;
        } else if (i2 == 4) {
            this.k = 3;
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: RuntimeException -> 0x00ef, TryCatch #0 {RuntimeException -> 0x00ef, blocks: (B:32:0x0074, B:34:0x007a, B:36:0x0082, B:37:0x00af, B:39:0x00b5, B:40:0x00c4, B:42:0x00cc, B:44:0x00d8, B:45:0x00e8, B:35:0x0080), top: B:71:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0080 A[Catch: RuntimeException -> 0x00ef, TryCatch #0 {RuntimeException -> 0x00ef, blocks: (B:32:0x0074, B:34:0x007a, B:36:0x0082, B:37:0x00af, B:39:0x00b5, B:40:0x00c4, B:42:0x00cc, B:44:0x00d8, B:45:0x00e8, B:35:0x0080), top: B:71:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[Catch: RuntimeException -> 0x00ef, LOOP:1: B:37:0x00af->B:39:0x00b5, LOOP_END, TryCatch #0 {RuntimeException -> 0x00ef, blocks: (B:32:0x0074, B:34:0x007a, B:36:0x0082, B:37:0x00af, B:39:0x00b5, B:40:0x00c4, B:42:0x00cc, B:44:0x00d8, B:45:0x00e8, B:35:0x0080), top: B:71:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[Catch: RuntimeException -> 0x00ef, TryCatch #0 {RuntimeException -> 0x00ef, blocks: (B:32:0x0074, B:34:0x007a, B:36:0x0082, B:37:0x00af, B:39:0x00b5, B:40:0x00c4, B:42:0x00cc, B:44:0x00d8, B:45:0x00e8, B:35:0x0080), top: B:71:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8 A[Catch: RuntimeException -> 0x00ef, TryCatch #0 {RuntimeException -> 0x00ef, blocks: (B:32:0x0074, B:34:0x007a, B:36:0x0082, B:37:0x00af, B:39:0x00b5, B:40:0x00c4, B:42:0x00cc, B:44:0x00d8, B:45:0x00e8, B:35:0x0080), top: B:71:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a A[LOOP:0: B:63:0x0122->B:65:0x012a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0074 A[EXC_TOP_SPLITTER, PHI: r15
      0x0074: PHI (r15v3 long) = (r15v4 long), (r15v5 long) binds: [B:31:0x0072, B:28:0x006e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0136 A[EDGE_INSN: B:73:0x0136->B:66:0x0136 BREAK  A[LOOP:0: B:63:0x0122->B:65:0x012a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        long j;
        long j2;
        int iK;
        long j3;
        int iAn;
        List list;
        long j4;
        dbm dbmVar;
        AtomicLong atomicLong;
        List list2;
        int i;
        cvt cvtVar;
        int i2 = this.k;
        ahno.O((i2 == 0 || i2 == 5) ? false : true);
        int i3 = this.k;
        if (i3 != 1) {
            if (i3 != 2) {
                j = -1;
            }
            if (this.k == 3) {
                j2 = ((cvb) cvjVar).a;
                if (j2 != j) {
                    iK = ahng.K(j2);
                } else {
                    iK = SemanticState.ReadOnly;
                }
                if (cvjVar.c(iK) == -1) {
                    j3 = this.b;
                    if (j3 == -9223372036854775807L) {
                        iAn = 0;
                    } else {
                        iAn = bwp.an(this.l, j3, true);
                    }
                    while (true) {
                        list = this.a;
                        if (iAn >= list.size()) {
                            break;
                        }
                        h((obf) list.get(iAn));
                        iAn++;
                    }
                    this.k = 4;
                }
            }
            if (this.k == 4) {
                return -1;
            }
            return 0;
        }
        long j5 = ((cvb) cvjVar).a;
        int iK2 = j5 != -1 ? ahng.K(j5) : 1024;
        if (iK2 > this.f.length) {
            this.f = new byte[iK2];
        }
        this.j = 0;
        this.k = 2;
        byte[] bArrCopyOf = this.f;
        int length = bArrCopyOf.length;
        if (length == this.j) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + SemanticState.ReadOnly);
            this.f = bArrCopyOf;
        }
        int i4 = this.j;
        int iA = cvjVar.a(bArrCopyOf, i4, bArrCopyOf.length - i4);
        if (iA != -1) {
            this.j += iA;
        }
        long j6 = ((cvb) cvjVar).a;
        if (j6 != -1) {
            j = -1;
            if (this.j == j6) {
                try {
                    j4 = this.b;
                    if (j4 != -9223372036854775807L) {
                        dbmVar = new dbm(j4, true);
                    } else {
                        dbmVar = dbm.a;
                    }
                    dbm dbmVar2 = dbmVar;
                    atomicLong = new AtomicLong(-9223372036854775807L);
                    this.c.c(this.f, 0, this.j, dbmVar2, new dbg(this, atomicLong, 0));
                    list2 = this.a;
                    Collections.sort(list2);
                    this.l = new long[list2.size()];
                    for (i = 0; i < list2.size(); i++) {
                        this.l[i] = ((obf) list2.get(i)).a;
                    }
                    if (atomicLong.get() != -9223372036854775807L) {
                        this.g.getClass();
                        atomicLong.get();
                        cvtVar = this.i;
                        if (cvtVar != null) {
                            cvtVar.a = atomicLong.get();
                            cvk cvkVar = this.h;
                            cvkVar.getClass();
                            cvkVar.z(this.i);
                        }
                    }
                    this.f = bwp.e;
                    this.k = 4;
                } catch (RuntimeException e) {
                    throw new bsz("SubtitleParser failed.", e, true, 1);
                }
            }
            if (this.k == 3) {
                j2 = ((cvb) cvjVar).a;
                if (j2 != j) {
                    iK = ahng.K(j2);
                } else {
                    iK = SemanticState.ReadOnly;
                }
                if (cvjVar.c(iK) == -1) {
                    j3 = this.b;
                    if (j3 == -9223372036854775807L) {
                        iAn = 0;
                    } else {
                        iAn = bwp.an(this.l, j3, true);
                    }
                    while (true) {
                        list = this.a;
                        if (iAn >= list.size()) {
                            break;
                            break;
                        }
                        h((obf) list.get(iAn));
                        iAn++;
                    }
                    this.k = 4;
                }
            }
            if (this.k == 4) {
                return -1;
            }
            return 0;
        }
        j = -1;
        if (iA == -1) {
            j4 = this.b;
            if (j4 != -9223372036854775807L) {
                dbmVar = new dbm(j4, true);
            } else {
                dbmVar = dbm.a;
            }
            dbm dbmVar3 = dbmVar;
            atomicLong = new AtomicLong(-9223372036854775807L);
            this.c.c(this.f, 0, this.j, dbmVar3, new dbg(this, atomicLong, 0));
            list2 = this.a;
            Collections.sort(list2);
            this.l = new long[list2.size()];
            while (i < list2.size()) {
                this.l[i] = ((obf) list2.get(i)).a;
            }
            if (atomicLong.get() != -9223372036854775807L) {
                this.g.getClass();
                atomicLong.get();
                cvtVar = this.i;
                if (cvtVar != null) {
                    cvtVar.a = atomicLong.get();
                    cvk cvkVar2 = this.h;
                    cvkVar2.getClass();
                    cvkVar2.z(this.i);
                }
            }
            this.f = bwp.e;
            this.k = 4;
        }
        if (this.k == 3) {
            j2 = ((cvb) cvjVar).a;
            if (j2 != j) {
                iK = ahng.K(j2);
            } else {
                iK = SemanticState.ReadOnly;
            }
            if (cvjVar.c(iK) == -1) {
                j3 = this.b;
                if (j3 == -9223372036854775807L) {
                    iAn = 0;
                } else {
                    iAn = bwp.an(this.l, j3, true);
                }
                while (true) {
                    list = this.a;
                    if (iAn >= list.size()) {
                        break;
                        break;
                    }
                    h((obf) list.get(iAn));
                    iAn++;
                }
                this.k = 4;
            }
        }
        if (this.k == 4) {
            return -1;
        }
        return 0;
    }

    public final void h(obf obfVar) {
        this.g.getClass();
        byte[] bArr = (byte[]) obfVar.b;
        int length = bArr.length;
        bwb bwbVar = this.e;
        bwbVar.M(bArr);
        this.g.c(bwbVar, length);
        this.g.e(obfVar.a, 1, length, 0, null);
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
