package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class det implements dem {
    final /* synthetic */ deu a;
    private final int d;
    private final dqp e = new dqp(new byte[5], (byte[]) null);
    private final SparseArray b = new SparseArray();
    private final SparseIntArray c = new SparseIntArray();

    public det(deu deuVar, int i) {
        this.a = deuVar;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0236  */
    /* JADX WARN: Code duplicated, block: B:103:0x0249  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x019d  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.dem
    public final void a(bwb bwbVar) {
        oys oysVar;
        int i;
        dew deiVar;
        dew deiVar2;
        int i2;
        dqp dqpVar;
        if (bwbVar.n() == 2) {
            deu deuVar = this.a;
            nzd nzdVar = (nzd) deuVar.a.get(0);
            if ((bwbVar.n() & SemanticState.Focused) != 0) {
                bwbVar.Q(1);
                int iS = bwbVar.s();
                int i3 = 3;
                bwbVar.Q(3);
                dqp dqpVar2 = this.e;
                bwbVar.T(dqpVar2, 2);
                dqpVar2.s(3);
                int i4 = 13;
                deuVar.h = dqpVar2.i(13);
                bwbVar.T(dqpVar2, 2);
                int i5 = 4;
                dqpVar2.s(4);
                int i6 = 12;
                bwbVar.Q(dqpVar2.i(12));
                SparseArray sparseArray = this.b;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.c;
                sparseIntArray.clear();
                int iD = bwbVar.d();
                while (iD > 0) {
                    int i7 = 5;
                    bwbVar.T(dqpVar2, 5);
                    int i8 = dqpVar2.i(8);
                    dqpVar2.s(i3);
                    int i9 = dqpVar2.i(i4);
                    dqpVar2.s(i5);
                    int i10 = dqpVar2.i(i6);
                    int i11 = bwbVar.c;
                    int i12 = i11 + i10;
                    int i13 = -1;
                    String strTrim = null;
                    int iN = 0;
                    ArrayList arrayList = null;
                    while (bwbVar.c < i12) {
                        int iN2 = bwbVar.n();
                        int iN3 = bwbVar.c + bwbVar.n();
                        if (iN3 <= i12) {
                            if (iN2 == i7) {
                                long jW = bwbVar.w();
                                if (jW == 1094921523) {
                                    i2 = iN3;
                                    dqpVar = dqpVar2;
                                    i13 = 129;
                                } else if (jW == 1161904947) {
                                    dqpVar = dqpVar2;
                                    i13 = 135;
                                    i2 = iN3;
                                } else if (jW == 1094921524) {
                                    i2 = iN3;
                                    dqpVar = dqpVar2;
                                    i13 = 172;
                                } else if (jW == 1212503619) {
                                    i2 = iN3;
                                    dqpVar = dqpVar2;
                                    i13 = 36;
                                } else {
                                    i2 = iN3;
                                    dqpVar = dqpVar2;
                                }
                            } else if (iN2 == 106) {
                                i2 = iN3;
                                dqpVar = dqpVar2;
                                i13 = 129;
                            } else if (iN2 == 122) {
                                dqpVar = dqpVar2;
                                i13 = 135;
                                i2 = iN3;
                            } else if (iN2 == 127) {
                                int iN4 = bwbVar.n();
                                if (iN4 == 21) {
                                    i2 = iN3;
                                    dqpVar = dqpVar2;
                                    i13 = 172;
                                } else {
                                    if (iN4 == 14) {
                                        i13 = 136;
                                    } else if (iN4 == 33) {
                                        i2 = iN3;
                                        dqpVar = dqpVar2;
                                        i13 = 139;
                                    }
                                    i2 = iN3;
                                    dqpVar = dqpVar2;
                                }
                            } else if (iN2 == 123) {
                                i2 = iN3;
                                dqpVar = dqpVar2;
                                i13 = 138;
                            } else if (iN2 == 10) {
                                strTrim = bwbVar.C(3).trim();
                                iN = bwbVar.n();
                                i2 = iN3;
                                dqpVar = dqpVar2;
                            } else {
                                int i14 = 3;
                                if (iN2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (bwbVar.c < iN3) {
                                        String strTrim2 = bwbVar.C(i14).trim();
                                        bwbVar.n();
                                        int i15 = iN3;
                                        byte[] bArr = new byte[4];
                                        bwbVar.K(bArr, 0, 4);
                                        arrayList2.add(new eol(strTrim2, bArr, (byte[]) null));
                                        iN3 = i15;
                                        dqpVar2 = dqpVar2;
                                        i14 = 3;
                                    }
                                    i2 = iN3;
                                    dqpVar = dqpVar2;
                                    arrayList = arrayList2;
                                    i13 = 89;
                                } else {
                                    i2 = iN3;
                                    dqpVar = dqpVar2;
                                    if (iN2 == 111) {
                                        i13 = 257;
                                    }
                                }
                            }
                            bwbVar.Q(i2 - bwbVar.c);
                            dqpVar2 = dqpVar;
                            i7 = 5;
                        } else {
                            dqp dqpVar3 = dqpVar2;
                            bwbVar.P(i12);
                            oysVar = new oys(i13, strTrim, iN, arrayList, Arrays.copyOfRange(bwbVar.b, i11, i12));
                            if (i8 != 6 || i8 == 5) {
                                i8 = oysVar.c;
                            }
                            iD -= i10 + 5;
                            if (deuVar.c.get(i9)) {
                                i = 4;
                            } else {
                                elq elqVar = deuVar.i;
                                if (i8 != 2) {
                                    i = 4;
                                    if (i8 != 3 || i8 == 4) {
                                        deiVar = new dei(new ded(oysVar.b, oysVar.b(), "video/mp2t"));
                                    } else {
                                        if (i8 == 21) {
                                            deiVar2 = new dei(new deb());
                                        } else if (i8 == 27) {
                                            deiVar = new dei(new ddy(elqVar.g(oysVar)));
                                        } else if (i8 == 36) {
                                            deiVar = new dei(new dea(elqVar.g(oysVar)));
                                        } else if (i8 == 45) {
                                            deiVar2 = new dei(new dee());
                                        } else if (i8 == 89) {
                                            deiVar2 = new dei(new ddq(oysVar.d));
                                        } else if (i8 == 172) {
                                            deiVar = new dei(new ddm(oysVar.b, oysVar.b(), "video/mp2t"));
                                        } else if (i8 == 257) {
                                            deiVar2 = new den(new deh("application/vnd.dvb.ait"));
                                        } else if (i8 != 128) {
                                            if (i8 == 129) {
                                                deiVar = new dei(new ddk(oysVar.b, oysVar.b(), "video/mp2t"));
                                            } else if (i8 == 138) {
                                                deiVar = new dei(new ddp(oysVar.b, oysVar.b(), SemanticState.Obscured));
                                            } else if (i8 != 139) {
                                                switch (i8) {
                                                    case 15:
                                                        deiVar = new dei(new ddo(false, oysVar.b, oysVar.b(), "video/mp2t"));
                                                        break;
                                                    case 16:
                                                        deiVar = new dei(new ddw(elqVar.D(oysVar)));
                                                        break;
                                                    case 17:
                                                        deiVar = new dei(new dec(oysVar.b, oysVar.b()));
                                                        break;
                                                    default:
                                                        switch (i8) {
                                                            case 134:
                                                                deiVar2 = new den(new deh("application/x-scte35"));
                                                                break;
                                                            case 135:
                                                                deiVar = new dei(new ddk(oysVar.b, oysVar.b(), "video/mp2t"));
                                                                break;
                                                            case 136:
                                                                deiVar = new dei(new ddp(oysVar.b, oysVar.b(), SemanticState.Obscured));
                                                                break;
                                                            default:
                                                                deiVar2 = null;
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                deiVar = new dei(new ddp(oysVar.b, oysVar.b(), 5408));
                                            }
                                        }
                                        sparseIntArray.put(i9, i9);
                                        sparseArray.put(i9, deiVar2);
                                    }
                                    deiVar2 = deiVar;
                                    sparseIntArray.put(i9, i9);
                                    sparseArray.put(i9, deiVar2);
                                } else {
                                    i = 4;
                                }
                                deiVar = new dei(new ddt(elqVar.D(oysVar), "video/mp2t"));
                                deiVar2 = deiVar;
                                sparseIntArray.put(i9, i9);
                                sparseArray.put(i9, deiVar2);
                            }
                            i5 = i;
                            dqpVar2 = dqpVar3;
                            i3 = 3;
                            i4 = 13;
                            i6 = 12;
                        }
                    }
                    dqp dqpVar4 = dqpVar2;
                    bwbVar.P(i12);
                    oysVar = new oys(i13, strTrim, iN, arrayList, Arrays.copyOfRange(bwbVar.b, i11, i12));
                    if (i8 != 6) {
                        i8 = oysVar.c;
                    } else {
                        i8 = oysVar.c;
                    }
                    iD -= i10 + 5;
                    if (deuVar.c.get(i9)) {
                        i = 4;
                    } else {
                        elq elqVar2 = deuVar.i;
                        if (i8 != 2) {
                            i = 4;
                            if (i8 != 3) {
                                deiVar = new dei(new ded(oysVar.b, oysVar.b(), "video/mp2t"));
                                deiVar2 = deiVar;
                            } else {
                                deiVar = new dei(new ded(oysVar.b, oysVar.b(), "video/mp2t"));
                                deiVar2 = deiVar;
                            }
                            sparseIntArray.put(i9, i9);
                            sparseArray.put(i9, deiVar2);
                        } else {
                            i = 4;
                        }
                        deiVar = new dei(new ddt(elqVar2.D(oysVar), "video/mp2t"));
                        deiVar2 = deiVar;
                        sparseIntArray.put(i9, i9);
                        sparseArray.put(i9, deiVar2);
                    }
                    i5 = i;
                    dqpVar2 = dqpVar4;
                    i3 = 3;
                    i4 = 13;
                    i6 = 12;
                }
                int size = sparseIntArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    int iKeyAt = sparseIntArray.keyAt(i16);
                    int iValueAt = sparseIntArray.valueAt(i16);
                    deuVar.c.put(iKeyAt, true);
                    deuVar.d.put(iValueAt, true);
                    dew dewVar = (dew) sparseArray.valueAt(i16);
                    if (dewVar != null) {
                        dewVar.c(nzdVar, deuVar.e, new dev(iS, iKeyAt, SemanticState.Multiline));
                        deuVar.b.put(iValueAt, dewVar);
                    }
                }
                deuVar.b.remove(this.d);
                deuVar.f = 0;
                deuVar.e.t();
                deuVar.g = true;
            }
        }
    }

    @Override // defpackage.dem
    public final void b(nzd nzdVar, cvk cvkVar, dev devVar) {
    }
}
