package defpackage;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nuy {
    public static asxe a(asxe asxeVar) {
        long j;
        long j2;
        int[] iArrCopyOf;
        long j3;
        agke agkeVarG;
        int i;
        agke agkeVarG2;
        int i2;
        agke agkeVarG3;
        agke agkeVarG4;
        int i3;
        agke agkeVarG5;
        int i4;
        agke agkeVarG6;
        int i5;
        int i6;
        long j4 = 8;
        if ((Memory.peekByte(asxeVar.c + 8) & 1) == 0) {
            return asxeVar;
        }
        String strBi = asxeVar.bi();
        ArrayList arrayList = new ArrayList();
        long j5 = 16;
        long j6 = 12;
        if (asxeVar.bc() != 0) {
            ArrayList arrayList2 = new ArrayList();
            PriorityQueue priorityQueue = new PriorityQueue(1, Comparator$CC.comparingInt(new ddc(6)));
            int i7 = 0;
            while (i7 < asxeVar.bc()) {
                asxa asxaVarBt = asxeVar.bt(i7);
                long j7 = j4;
                if (Memory.peekInt(asxaVarBt.c + 16, false) == 0) {
                    priorityQueue.add(asxaVarBt);
                } else {
                    arrayList2.add(asxaVarBt);
                }
                i7++;
                j4 = j7;
            }
            j = j4;
            if (priorityQueue.isEmpty()) {
                int size = arrayList2.size();
                int i8 = 0;
                while (i8 < size) {
                    asxa asxaVar = (asxa) arrayList2.get(i8);
                    long j8 = asxaVar.c;
                    long j9 = j5;
                    arrayList.add(new tld(asxaVar, Memory.peekInt(j8 + 12, false), Memory.peekInt(j8 + j9, false)));
                    i8++;
                    j5 = j9;
                }
            } else {
                j2 = 16;
                int size2 = priorityQueue.size();
                iArrCopyOf = new int[size2];
                int i9 = 0;
                while (!priorityQueue.isEmpty()) {
                    asxa asxaVar2 = (asxa) priorityQueue.poll();
                    if (asxaVar2 != null) {
                        long j10 = asxaVar2.c + 12;
                        iArrCopyOf[i9] = Memory.peekInt(j10, false);
                        arrayList.add(new tld(asxaVar2, Memory.peekInt(j10, false) + i9, 1L));
                        i9++;
                    }
                }
                if (i9 < size2) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9);
                }
                int size3 = arrayList2.size();
                int i10 = 0;
                while (i10 < size3) {
                    asxa asxaVar3 = (asxa) arrayList2.get(i10);
                    long j11 = asxaVar3.c;
                    long j12 = j6;
                    tke tkeVarA = nux.a(Memory.peekInt(j11 + j12, false), Memory.peekInt(j11 + 16, false), iArrCopyOf, false);
                    arrayList.add(new tld(asxaVar3, tkeVarA.a, tkeVarA.b));
                    i10++;
                    j6 = j12;
                }
                j3 = j6;
            }
            if (iArrCopyOf == null && iArrCopyOf.length != 0) {
                asxb asxbVar = new asxb();
                asxbVar.aZ(rpi.g(strBi, iArrCopyOf));
                int i11 = 2;
                if ((Memory.peekByte(asxeVar.c + j) & 2) != 0) {
                    float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(asxeVar.c + j3, false));
                    asxbVar.aT();
                    asxbVar.bO(8, 2);
                    asxbVar.bP(12, fIntBitsToFloat);
                }
                if ((Memory.peekByte(asxeVar.c + j) & 4) != 0) {
                    int iBr = asxeVar.br();
                    asxbVar.aT();
                    asxbVar.bO(8, 4);
                    asxbVar.bQ(16, iBr - 1);
                }
                if ((Memory.peekByte(asxeVar.c + j) & 8) != 0) {
                    int iBq = asxeVar.bq();
                    asxbVar.aT();
                    asxbVar.bO(8, 8);
                    asxbVar.bQ(20, iBq - 1);
                }
                if (asxeVar.bd() > 0) {
                    if (asxeVar.bd() == 0) {
                        agkeVarG6 = agpi.a;
                    } else {
                        agjz agjzVarF = agke.f(asxeVar.bd());
                        int i12 = 0;
                        while (i12 < asxeVar.bd()) {
                            asxi asxiVarBu = asxeVar.bu(i12);
                            asxg asxgVar = new asxg(asxiVarBu.b);
                            if (asxiVarBu.f != null) {
                                asxgVar.f = asxiVarBu.f;
                            }
                            if (asxiVarBu.g != null) {
                                asxgVar.g = asxiVarBu.g;
                            }
                            if (asxiVarBu.e != null) {
                                asxgVar.e = asxiVarBu.e;
                            }
                            asxgVar.d = true;
                            int i13 = i11;
                            long j13 = asxiVarBu.c;
                            long j14 = j13 + j3;
                            long j15 = j13 + j2;
                            int iPeekInt = Memory.peekInt(j14, false);
                            int length = iArrCopyOf.length;
                            int iPeekInt2 = Memory.peekInt(j15, false);
                            if (length > 0) {
                                tke tkeVarA2 = nux.a(Memory.peekInt(j14, false), Memory.peekInt(j15, false), iArrCopyOf, true);
                                i5 = tkeVarA2.a;
                                i6 = tkeVarA2.b;
                            } else {
                                i5 = iPeekInt;
                                i6 = iPeekInt2;
                            }
                            asxgVar.aR();
                            asxgVar.bO(8, 1);
                            asxgVar.bQ(12, i5);
                            if ((Memory.peekByte(asxiVarBu.c + j) & 2) != 0) {
                                asxgVar.aR();
                                asxgVar.bO(8, i13);
                                asxgVar.bQ(16, i6);
                            }
                            agjzVarF.h(asxgVar.aS());
                            i12++;
                            i11 = 2;
                        }
                        agkeVarG6 = agjzVarF.g();
                    }
                    for (int i14 = 0; i14 < ((agpi) agkeVarG6).d; i14++) {
                        asxi asxiVar = (asxi) agkeVarG6.get(i14);
                        asxiVar.getClass();
                        if (asxbVar.e) {
                            AtomicReference atomicReference = asxbVar.m;
                            atomicReference.set(new ArrayList((Collection) atomicReference.get()));
                            asxbVar.e = false;
                        } else {
                            asxbVar.bk();
                        }
                        ((ArrayList) asxbVar.m.get()).add(asxiVar);
                        asxbVar.n = true;
                    }
                }
                if (asxeVar.bh() > 0) {
                    if (asxeVar.bh() == 0) {
                        agkeVarG5 = agpi.a;
                    } else {
                        agjz agjzVarF2 = agke.f(asxeVar.bh());
                        for (int i15 = 0; i15 < asxeVar.bh(); i15++) {
                            aszd aszdVarBz = asxeVar.bz(i15);
                            long j16 = aszdVarBz.c;
                            long j17 = j16 + j3;
                            long j18 = j16 + j2;
                            int iPeekInt3 = Memory.peekInt(j17, false);
                            int length2 = iArrCopyOf.length;
                            int iPeekInt4 = Memory.peekInt(j18, false);
                            if (length2 > 0) {
                                tke tkeVarA3 = nux.a(Memory.peekInt(j17, false), Memory.peekInt(j18, false), iArrCopyOf, true);
                                int i16 = tkeVarA3.a;
                                i4 = tkeVarA3.b;
                                iPeekInt3 = i16;
                            } else {
                                i4 = iPeekInt4;
                            }
                            asyz asyzVar = new asyz(aszdVarBz.b);
                            if (aszdVarBz.i != null) {
                                asyzVar.i = aszdVarBz.i;
                            }
                            if (aszdVarBz.k != null) {
                                asyzVar.k = aszdVarBz.k;
                            }
                            if (aszdVarBz.j != null) {
                                asyzVar.j = aszdVarBz.j;
                            }
                            asyzVar.d = true;
                            asyzVar.aT(iPeekInt3);
                            if ((Memory.peekByte(aszdVarBz.c + j) & 2) != 0) {
                                asyzVar.aS(i4);
                            }
                            agjzVarF2.h(asyzVar.aU());
                        }
                        agkeVarG5 = agjzVarF2.g();
                    }
                    for (int i17 = 0; i17 < ((agpi) agkeVarG5).d; i17++) {
                        asxbVar.bb((aszd) agkeVarG5.get(i17));
                    }
                }
                if (asxeVar.bg() > 0) {
                    if (asxeVar.bg() == 0) {
                        agkeVarG4 = agpi.a;
                    } else {
                        agjz agjzVarF3 = agke.f(asxeVar.bg());
                        for (int i18 = 0; i18 < asxeVar.bg(); i18++) {
                            asyy asyyVarBy = asxeVar.by(i18);
                            long j19 = asyyVarBy.c;
                            long j20 = j19 + j3;
                            long j21 = j19 + j2;
                            int iPeekInt5 = Memory.peekInt(j20, false);
                            int length3 = iArrCopyOf.length;
                            int iPeekInt6 = Memory.peekInt(j21, false);
                            if (length3 > 0) {
                                tke tkeVarA4 = nux.a(Memory.peekInt(j20, false), Memory.peekInt(j21, false), iArrCopyOf, true);
                                int i19 = tkeVarA4.a;
                                i3 = tkeVarA4.b;
                                iPeekInt5 = i19;
                            } else {
                                i3 = iPeekInt6;
                            }
                            asyw asywVar = new asyw(asyyVarBy.b);
                            if (asyyVarBy.e != null) {
                                asywVar.e = asyyVarBy.e;
                            }
                            asywVar.d = true;
                            asywVar.aR();
                            asywVar.bO(8, 1);
                            asywVar.bQ(12, iPeekInt5);
                            asywVar.aR();
                            asywVar.bO(8, 2);
                            asywVar.bQ(16, i3);
                            if (asywVar.d) {
                                asywVar.bG();
                            } else {
                                asywVar.d = true;
                            }
                            asyy asyyVar = new asyy(asywVar.b);
                            if (asywVar.e != null) {
                                asyyVar.e = asywVar.e;
                            }
                            agjzVarF3.h(asyyVar);
                        }
                        agkeVarG4 = agjzVarF3.g();
                    }
                    for (int i20 = 0; i20 < ((agpi) agkeVarG4).d; i20++) {
                        asyy asyyVar2 = (asyy) agkeVarG4.get(i20);
                        asyyVar2.getClass();
                        if (asxbVar.i) {
                            AtomicReference atomicReference2 = asxbVar.v;
                            atomicReference2.set(new ArrayList((Collection) atomicReference2.get()));
                            asxbVar.i = false;
                        } else {
                            asxbVar.bn();
                        }
                        ((ArrayList) asxbVar.v.get()).add(asyyVar2);
                        asxbVar.w = true;
                    }
                }
                if (asxeVar.bc() > 0) {
                    rpi.e(arrayList);
                    if (arrayList.isEmpty()) {
                        agkeVarG3 = agpi.a;
                    } else {
                        agjz agjzVarF4 = agke.f(arrayList.size());
                        for (int i21 = 0; i21 < arrayList.size(); i21++) {
                            tld tldVar = (tld) arrayList.get(i21);
                            aswy aswyVar = new aswy();
                            tke tkeVar = (tke) tldVar.a;
                            int i22 = tkeVar.a;
                            aswyVar.aR();
                            aswyVar.bO(8, 1);
                            aswyVar.bQ(12, i22);
                            int i23 = tkeVar.b;
                            aswyVar.aR();
                            aswyVar.bO(8, 2);
                            aswyVar.bQ(16, i23);
                            asxa asxaVar4 = (asxa) tldVar.b;
                            int iAV = a.aV(asxaVar4.aU() - 1);
                            if (iAV != 0) {
                                aswyVar.aR();
                                aswyVar.bO(8, 8);
                                aswyVar.bQ(true != aswy.a ? 24 : 20, iAV - 1);
                            }
                            if (asxaVar4.aT()) {
                                atgg atggVarAV = asxaVar4.aV();
                                atggVarAV.getClass();
                                if (atggVarAV != aswyVar.f) {
                                    aswyVar.f = atggVarAV;
                                    aswyVar.e = true;
                                }
                            }
                            if (aswyVar.d) {
                                aswyVar.bG();
                            } else {
                                aswyVar.d = true;
                            }
                            asxa asxaVar5 = new asxa(aswyVar.b);
                            if (aswyVar.f != null) {
                                asxaVar5.f = aswyVar.f;
                                asxaVar5.e = aswyVar.e;
                            }
                            asxaVar5.aS();
                            agjzVarF4.h(asxaVar5);
                        }
                        agkeVarG3 = agjzVarF4.g();
                    }
                    for (int i24 = 0; i24 < ((agpi) agkeVarG3).d; i24++) {
                        asxa asxaVar6 = (asxa) agkeVarG3.get(i24);
                        asxaVar6.getClass();
                        if (asxbVar.g) {
                            AtomicReference atomicReference3 = asxbVar.q;
                            atomicReference3.set(new ArrayList((Collection) atomicReference3.get()));
                            asxbVar.g = false;
                        } else {
                            asxbVar.bj();
                        }
                        ((ArrayList) asxbVar.q.get()).add(asxaVar6);
                        asxbVar.r = true;
                    }
                }
                long j22 = asxeVar.c + j;
                if ((Memory.peekByte(j22) & 16) != 0) {
                    boolean z = (Memory.peekByte(j22) & 16) == 0 || Memory.peekByte(asxeVar.c + 10) != 0;
                    asxbVar.aT();
                    asxbVar.bO(8, 16);
                    asxbVar.bK(10, z);
                }
                if ((Memory.peekByte(asxeVar.c + j) & 32) != 0) {
                    int iBs = asxeVar.bs();
                    asxbVar.aT();
                    asxbVar.bO(8, 32);
                    asxbVar.bQ(true != asxb.a ? 36 : 24, iBs - 1);
                }
                if (asxeVar.be() > 0) {
                    if (asxeVar.be() == 0) {
                        agkeVarG2 = agpi.a;
                    } else {
                        agjz agjzVarF5 = agke.f(asxeVar.be());
                        for (int i25 = 0; i25 < asxeVar.be(); i25++) {
                            asxl asxlVarBv = asxeVar.bv(i25);
                            asxj asxjVar = new asxj(asxlVarBv.b);
                            if (asxlVarBv.f != null) {
                                asxjVar.f = asxlVarBv.f;
                                asxjVar.e = asxlVarBv.e;
                            }
                            asxjVar.d = true;
                            if (asxlVarBv.aS()) {
                                mew mewVarAT = asxlVarBv.aT();
                                mep mepVar = athq.d;
                                if (mewVarAT.e(mepVar)) {
                                    athq athqVar = (athq) asxlVarBv.aT().d(mepVar);
                                    long j23 = athqVar.c;
                                    long j24 = j23 + j3;
                                    long j25 = j23 + j2;
                                    int iPeekInt7 = Memory.peekInt(j24, false);
                                    int length4 = iArrCopyOf.length;
                                    int iPeekInt8 = Memory.peekInt(j25, false);
                                    if (length4 > 0) {
                                        tke tkeVarA5 = nux.a(Memory.peekInt(j24, false), Memory.peekInt(j25, false), iArrCopyOf, true);
                                        iPeekInt7 = tkeVarA5.a;
                                        i2 = tkeVarA5.b;
                                    } else {
                                        i2 = iPeekInt8;
                                    }
                                    athm athmVar = new athm(athqVar.b);
                                    athmVar.d = true;
                                    athmVar.aR();
                                    athmVar.bO(8, 1);
                                    athmVar.bQ(12, iPeekInt7);
                                    athmVar.aR();
                                    athmVar.bO(8, 2);
                                    athmVar.bQ(16, i2);
                                    if (athmVar.d) {
                                        athmVar.bG();
                                    } else {
                                        athmVar.d = true;
                                    }
                                    athq athqVar2 = new athq(athmVar.b);
                                    atoc atocVar = new atoc((char[]) null);
                                    if (atocVar.d) {
                                        atocVar.d = false;
                                        atocVar.bG();
                                    }
                                    atocVar.bM(mepVar, athqVar2);
                                    if (atocVar.d) {
                                        atocVar.bG();
                                    } else {
                                        atocVar.d = true;
                                    }
                                    mew mewVar = new mew(atocVar.b, (boolean[]) null);
                                    if (mewVar != asxjVar.f) {
                                        asxjVar.f = mewVar;
                                        asxjVar.e = true;
                                    }
                                }
                            }
                            if (asxjVar.d) {
                                asxjVar.bG();
                            } else {
                                asxjVar.d = true;
                            }
                            asxl asxlVar = new asxl(asxjVar.b);
                            if (asxjVar.f != null) {
                                asxlVar.f = asxjVar.f;
                                asxlVar.e = asxjVar.e;
                            }
                            asxlVar.aR();
                            agjzVarF5.h(asxlVar);
                        }
                        agkeVarG2 = agjzVarF5.g();
                    }
                    for (int i26 = 0; i26 < ((agpi) agkeVarG2).d; i26++) {
                        asxl asxlVar2 = (asxl) agkeVarG2.get(i26);
                        asxlVar2.getClass();
                        if (asxbVar.h) {
                            AtomicReference atomicReference4 = asxbVar.s;
                            atomicReference4.set(new ArrayList((Collection) atomicReference4.get()));
                            asxbVar.h = false;
                        } else {
                            asxbVar.bl();
                        }
                        ((ArrayList) asxbVar.s.get()).add(asxlVar2);
                        asxbVar.t = true;
                    }
                }
                if (asxeVar.bf() > 0) {
                    if (asxeVar.bf() == 0) {
                        agkeVarG = agpi.a;
                    } else {
                        agjz agjzVarF6 = agke.f(asxeVar.bf());
                        for (int i27 = 0; i27 < asxeVar.bf(); i27++) {
                            asyu asyuVarBx = asxeVar.bx(i27);
                            asys asysVar = new asys(asyuVarBx.b);
                            mew mewVar2 = asyuVarBx.g;
                            asysVar.d = true;
                            long j26 = asyuVarBx.c;
                            long j27 = j26 + j3;
                            long j28 = j26 + j2;
                            int iPeekInt9 = Memory.peekInt(j27, false);
                            int length5 = iArrCopyOf.length;
                            int iPeekInt10 = Memory.peekInt(j28, false);
                            if (length5 > 0) {
                                tke tkeVarA6 = nux.a(Memory.peekInt(j27, false), Memory.peekInt(j28, false), iArrCopyOf, true);
                                iPeekInt9 = tkeVarA6.a;
                                i = tkeVarA6.b;
                            } else {
                                i = iPeekInt10;
                            }
                            asysVar.aR();
                            asysVar.bO(8, 1);
                            asysVar.bQ(12, iPeekInt9);
                            if ((Memory.peekByte(asyuVarBx.c + j) & 2) != 0) {
                                asysVar.aR();
                                asysVar.bO(8, 2);
                                asysVar.bQ(16, i);
                            }
                            if (asysVar.d) {
                                asysVar.bG();
                            } else {
                                asysVar.d = true;
                            }
                            asyu asyuVar = new asyu(asysVar.b);
                            mew mewVar3 = asysVar.g;
                            agjzVarF6.h(asyuVar);
                        }
                        agkeVarG = agjzVarF6.g();
                    }
                    for (int i28 = 0; i28 < ((agpi) agkeVarG).d; i28++) {
                        asyu asyuVar2 = (asyu) agkeVarG.get(i28);
                        asyuVar2.getClass();
                        if (asxbVar.j) {
                            AtomicReference atomicReference5 = asxbVar.x;
                            atomicReference5.set(new ArrayList((Collection) atomicReference5.get()));
                            asxbVar.j = false;
                        } else {
                            asxbVar.bm();
                        }
                        ((ArrayList) asxbVar.x.get()).add(asyuVar2);
                        asxbVar.y = true;
                    }
                }
                if (asxeVar.bp()) {
                    asyb asybVar = new asyb();
                    int iAS = a.aS(Memory.peekInt(asxeVar.bw().c + j2, false));
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    asybVar.aR();
                    asybVar.bO(8, 2);
                    asybVar.bQ(16, iAS - 1);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(asxeVar.bw().c + j3, false));
                    asybVar.aR();
                    asybVar.bO(8, 1);
                    asybVar.bP(12, fIntBitsToFloat2);
                    if (asybVar.d) {
                        asybVar.bG();
                    } else {
                        asybVar.d = true;
                    }
                    asye asyeVar = new asye(asybVar.b);
                    if (asyeVar != asxbVar.z) {
                        asxbVar.z = asyeVar;
                        asxbVar.u = true;
                    }
                }
                return asxbVar.ba();
            }
        }
        j = 8;
        j2 = j5;
        j3 = 12;
        iArrCopyOf = null;
        return iArrCopyOf == null ? asxeVar : asxeVar;
    }
}
