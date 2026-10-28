package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cmg extends cav implements Handler.Callback {
    private final cmf k;
    private final Handler l;
    private final cxn m;
    private cxm n;
    private boolean o;
    private boolean p;
    private long q;
    private bsx r;
    private long s;
    private final cch t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmg(cch cchVar, Looper looper) {
        Handler handler;
        super(5);
        cmf cmfVar = cmf.a;
        cchVar.getClass();
        this.t = cchVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = bwp.a;
            handler = new Handler(looper, this);
        }
        this.l = handler;
        this.k = cmfVar;
        this.m = new cxn();
        this.s = -9223372036854775807L;
    }

    private final long a(long j) {
        ahno.O(j != -9223372036854775807L);
        ahno.O(this.s != -9223372036854775807L);
        return j - this.s;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    private final void b(bsx bsxVar, List list) {
        for (int i = 0; i < bsxVar.a(); i++) {
            bse bseVarA = bsxVar.b(i).a();
            if (bseVarA != null) {
                cmf cmfVar = this.k;
                if (cmfVar.b(bseVarA)) {
                    cxm cxmVarA = cmfVar.a(bseVarA);
                    byte[] bArrC = bsxVar.b(i).c();
                    bArrC.getClass();
                    cxn cxnVar = this.m;
                    cxnVar.clear();
                    cxnVar.ensureSpaceForWrite(bArrC.length);
                    ByteBuffer byteBuffer = cxnVar.data;
                    int i2 = bwp.a;
                    byteBuffer.put(bArrC);
                    cxnVar.flip();
                    bsx bsxVarA = cxmVarA.a(cxnVar);
                    if (bsxVarA != null) {
                        b(bsxVarA, list);
                    }
                } else {
                    list.add(bsxVar.b(i));
                }
            } else {
                list.add(bsxVar.b(i));
            }
        }
    }

    private final void d(bsx bsxVar) {
        cch cchVar = this.t;
        ccm ccmVar = cchVar.a;
        bsu bsuVar = new bsu(ccmVar.z);
        for (int i = 0; i < bsxVar.a(); i++) {
            bsxVar.b(i).b(bsuVar);
        }
        ccmVar.z = new bsv(bsuVar);
        bsv bsvVarS = ccmVar.S();
        if (!bsvVarS.equals(ccmVar.s)) {
            ccmVar.s = bsvVarS;
            ccmVar.F.e(14, new cbv(cchVar, 14));
        }
        dje djeVar = ccmVar.F;
        djeVar.e(28, new cbv(bsxVar, 15));
        djeVar.d();
    }

    @Override // defpackage.cav
    protected final void D() {
        this.r = null;
        this.n = null;
        this.s = -9223372036854775807L;
    }

    @Override // defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        this.r = null;
        this.o = false;
        this.p = false;
    }

    @Override // defpackage.cav
    protected final void M(bse[] bseVarArr, long j, long j2, cnm cnmVar) {
        this.n = this.k.a(bseVarArr[0]);
        bsx bsxVar = this.r;
        if (bsxVar != null) {
            long j3 = this.s;
            long j4 = bsxVar.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                bsxVar = new bsx(j5, bsxVar.a);
            }
            this.r = bsxVar;
        }
        this.s = j2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    @Override // defpackage.cdp
    public final void af(long j, long j2) {
        boolean z;
        int iK;
        bsx bsxVarA;
        List arrayList;
        long j3;
        do {
            z = false;
            if (!this.o && this.r == null) {
                cxn cxnVar = this.m;
                cxnVar.clear();
                ccu ccuVarR = r();
                int iK2 = k(ccuVarR, cxnVar, 5);
                while (iK2 == -5) {
                    Object obj = ccuVarR.b;
                    obj.getClass();
                    this.q = ((bse) obj).v;
                    iK2 = k(ccuVarR, cxnVar, 5);
                }
                if (iK2 == -3) {
                    if (cxnVar.isEndOfStream()) {
                        j3 = this.j;
                        long j4 = j - this.d;
                        if (j3 != -9223372036854775807L && j4 >= j3 - 1000000) {
                            iK = k(ccuVarR, cxnVar, 0);
                            if (iK == -4) {
                                if (cxnVar.isEndOfStream()) {
                                    this.o = true;
                                } else if (cxnVar.timeUs >= this.e) {
                                    cxnVar.a = this.q;
                                    cxnVar.flip();
                                    cxm cxmVar = this.n;
                                    int i = bwp.a;
                                    bsxVarA = cxmVar.a(cxnVar);
                                    if (bsxVarA != null) {
                                        arrayList = new ArrayList(bsxVarA.a());
                                        b(bsxVarA, arrayList);
                                        if (!arrayList.isEmpty()) {
                                            this.r = new bsx(a(cxnVar.timeUs), (bsw[]) arrayList.toArray(new bsw[0]));
                                        }
                                    }
                                }
                            } else if (iK == -5) {
                                Object obj2 = ccuVarR.b;
                                obj2.getClass();
                                this.q = ((bse) obj2).v;
                            }
                        }
                    }
                } else if (cxnVar.isEndOfStream()) {
                    j3 = this.j;
                    long j5 = j - this.d;
                    if (j3 != -9223372036854775807L) {
                        iK = k(ccuVarR, cxnVar, 0);
                        if (iK == -4) {
                            if (cxnVar.isEndOfStream()) {
                                this.o = true;
                            } else if (cxnVar.timeUs >= this.e) {
                                cxnVar.a = this.q;
                                cxnVar.flip();
                                cxm cxmVar2 = this.n;
                                int i2 = bwp.a;
                                bsxVarA = cxmVar2.a(cxnVar);
                                if (bsxVarA != null) {
                                    arrayList = new ArrayList(bsxVarA.a());
                                    b(bsxVarA, arrayList);
                                    if (!arrayList.isEmpty()) {
                                        this.r = new bsx(a(cxnVar.timeUs), (bsw[]) arrayList.toArray(new bsw[0]));
                                    }
                                }
                            }
                        } else if (iK == -5) {
                            Object obj3 = ccuVarR.b;
                            obj3.getClass();
                            this.q = ((bse) obj3).v;
                        }
                    }
                } else if (j >= cxnVar.timeUs - 1000000) {
                    iK = k(ccuVarR, cxnVar, 0);
                    if (iK == -4) {
                        if (cxnVar.isEndOfStream()) {
                            this.o = true;
                        } else if (cxnVar.timeUs >= this.e) {
                            cxnVar.a = this.q;
                            cxnVar.flip();
                            cxm cxmVar3 = this.n;
                            int i3 = bwp.a;
                            bsxVarA = cxmVar3.a(cxnVar);
                            if (bsxVarA != null) {
                                arrayList = new ArrayList(bsxVarA.a());
                                b(bsxVarA, arrayList);
                                if (!arrayList.isEmpty()) {
                                    this.r = new bsx(a(cxnVar.timeUs), (bsw[]) arrayList.toArray(new bsw[0]));
                                }
                            }
                        }
                    } else if (iK == -5) {
                        Object obj4 = ccuVarR.b;
                        obj4.getClass();
                        this.q = ((bse) obj4).v;
                    }
                }
            }
            bsx bsxVar = this.r;
            if (bsxVar != null) {
                if (bsxVar.b <= a(j)) {
                    bsx bsxVar2 = this.r;
                    Handler handler = this.l;
                    if (handler != null) {
                        handler.obtainMessage(1, bsxVar2).sendToTarget();
                    } else {
                        d(bsxVar2);
                    }
                    this.r = null;
                    z = true;
                }
            }
            if (this.o && this.r == null) {
                this.p = true;
            }
        } while (z);
    }

    @Override // defpackage.cdp
    public final boolean ag() {
        return this.p;
    }

    @Override // defpackage.cdp
    public final boolean ah() {
        return true;
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) {
        if (this.k.b(bseVar)) {
            return 128 | (bseVar.S == 0 ? 4 : 2);
        }
        return SemanticState.Focused;
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        d((bsx) message.obj);
        return true;
    }
}
