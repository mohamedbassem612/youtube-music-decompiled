package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.interfaces.ContextSubscriptionInput;
import j$.util.Optional;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlz implements ntv {
    private final SparseArray a = new SparseArray();
    private final nso b;
    private final boolean c;

    public mlz(Optional optional, Set set, nuc nucVar, nsu nsuVar) {
        Optional optional2;
        char c;
        agqr agqrVar;
        qnl qnlVar;
        long j;
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i2;
        char c2 = 6;
        agc agcVar = new agc(6);
        agqr it = ((agqj) set).iterator();
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                break;
            }
            qnl qnlVar2 = (qnl) it.next();
            int i4 = mzx.L.a;
            int i5 = agcVar.d;
            int i6 = agcVar.c;
            int i7 = -862048943;
            int i8 = ((i4 >>> 16) ^ i4) * (-862048943);
            int i9 = i8 ^ (i8 >>> 16);
            int i10 = i9 >>> 7;
            int i11 = i10 & i6;
            int i12 = 0;
            while (true) {
                c = c2;
                long[] jArr2 = agcVar.a;
                int i13 = i11 >> 3;
                int i14 = i7;
                int i15 = (i11 & 7) << 3;
                long j3 = jArr2[i13] >>> i15;
                long j4 = jArr2[i13 + 1] << (64 - i15);
                int i16 = i12;
                long j5 = -i15;
                agqrVar = it;
                long j6 = i9 & 127;
                long j7 = j3 | (j4 & (j5 >> 63));
                int i17 = i3;
                int i18 = i4;
                long j8 = j7 ^ (72340172838076673L * j6);
                long j9 = (j8 - 72340172838076673L) & (~j8);
                long j10 = -9187201950435737472L;
                long j11 = j9 & (-9187201950435737472L);
                while (j11 != 0) {
                    iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i6;
                    long j12 = j10;
                    i4 = i18;
                    if (agcVar.b[iNumberOfTrailingZeros] == i4) {
                        qnlVar = qnlVar2;
                        break;
                    } else {
                        j11 &= j11 - 1;
                        i18 = i4;
                        j10 = j12;
                    }
                }
                long j13 = j10;
                i4 = i18;
                char c3 = '\b';
                if ((j7 & ((~j7) << c) & j13) != 0) {
                    int iA = agcVar.a(i10);
                    if (agcVar.e != 0 || ((agcVar.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                        qnlVar = qnlVar2;
                        j = 255;
                        i = i17;
                        j2 = 128;
                    } else {
                        int i19 = agcVar.c;
                        if (i19 > 8) {
                            j2 = 128;
                            j = 255;
                            if (Long.compare((((long) agcVar.d) << 5) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                                long[] jArr3 = agcVar.a;
                                int i20 = agcVar.c;
                                int[] iArr = agcVar.b;
                                int i21 = i20 + 7;
                                int i22 = 0;
                                while (i22 < (i21 >> 3)) {
                                    long j14 = jArr3[i22] & j13;
                                    jArr3[i22] = ((~j14) + (j14 >>> 7)) & (-72340172838076674L);
                                    i22++;
                                    i17 = i17;
                                    qnlVar2 = qnlVar2;
                                    c3 = c3;
                                }
                                qnlVar = qnlVar2;
                                int i23 = i17;
                                int iAO = atqq.aO(jArr3);
                                int i24 = iAO - 1;
                                jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[iAO] = jArr3[0];
                                int i25 = 0;
                                while (i25 != i20) {
                                    int i26 = i25 >> 3;
                                    int i27 = (i25 & 7) << 3;
                                    long j15 = (jArr3[i26] >> i27) & 255;
                                    if (j15 == 128 || j15 != 254) {
                                        i25++;
                                    } else {
                                        int i28 = iArr[i25];
                                        int i29 = (i28 ^ (i28 >>> 16)) * i14;
                                        int i30 = i29 ^ (i29 >>> 16);
                                        int i31 = i30 & 127;
                                        int i32 = i30 >>> 7;
                                        int iA2 = agcVar.a(i32);
                                        int i33 = i32 & i20;
                                        int i34 = i23;
                                        long[] jArr4 = jArr3;
                                        int i35 = i25;
                                        long j16 = i31;
                                        if (((iA2 - i33) & i20) / 8 == ((i25 - i33) & i20) / 8) {
                                            jArr4[i26] = (jArr4[i26] & (~(255 << i27))) | (j16 << i27);
                                            jArr4[atqq.aO(jArr4)] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i25 = i35 + 1;
                                        } else {
                                            int i36 = iA2 >> 3;
                                            long j17 = jArr4[i36];
                                            int i37 = (iA2 & 7) << 3;
                                            long j18 = j16 << i37;
                                            long j19 = (~(255 << i37)) & j17;
                                            if (((j17 >> i37) & 255) == 128) {
                                                long j20 = ~(255 << i27);
                                                jArr4[i36] = j19 | j18;
                                                jArr4[i26] = (jArr4[i26] & j20) | (128 << i27);
                                                iArr[iA2] = iArr[i35];
                                                iArr[i35] = 0;
                                                i2 = i35;
                                            } else {
                                                jArr4[i36] = j19 | j18;
                                                int i38 = iArr[iA2];
                                                iArr[iA2] = iArr[i35];
                                                iArr[i35] = i38;
                                                i2 = i35 - 1;
                                            }
                                            jArr4[atqq.aO(jArr4)] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i25 = i2 + 1;
                                        }
                                        jArr3 = jArr4;
                                        i23 = i34;
                                    }
                                }
                                i = i23;
                                agcVar.b();
                            }
                            iA = agcVar.a(i10);
                        } else {
                            j = 255;
                            j2 = 128;
                        }
                        qnlVar = qnlVar2;
                        i = i17;
                        int iB = agv.b(agcVar.c);
                        long[] jArr5 = agcVar.a;
                        int[] iArr2 = agcVar.b;
                        int i39 = agcVar.c;
                        agcVar.c(iB);
                        long[] jArr6 = agcVar.a;
                        int[] iArr3 = agcVar.b;
                        int i40 = agcVar.c;
                        int i41 = 0;
                        while (i41 < i39) {
                            if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & j) < j2) {
                                int i42 = iArr2[i41];
                                int i43 = ((i42 >>> 16) ^ i42) * i14;
                                int i44 = i43 ^ (i43 >>> 16);
                                int iA3 = agcVar.a(i44 >>> 7);
                                int i45 = iA3 >> 3;
                                int i46 = (iA3 & 7) << 3;
                                jArr = jArr6;
                                long j21 = (jArr6[i45] & (~(j << i46))) | (((long) (i44 & 127)) << i46);
                                jArr[i45] = j21;
                                jArr[(((iA3 - 7) & i40) + (i40 & 7)) >> 3] = j21;
                                iArr3[iA3] = i42;
                            } else {
                                jArr = jArr6;
                            }
                            i41++;
                            jArr5 = jArr5;
                            jArr6 = jArr;
                        }
                        iA = agcVar.a(i10);
                    }
                    agcVar.d++;
                    int i47 = agcVar.e;
                    long[] jArr7 = agcVar.a;
                    int i48 = iA >> 3;
                    long j22 = jArr7[i48];
                    int i49 = (iA & 7) << 3;
                    agcVar.e = i47 - (((j22 >> i49) & j) != j2 ? 0 : i);
                    int i50 = agcVar.c;
                    long j23 = (j22 & (~(j << i49))) | (j6 << i49);
                    jArr7[i48] = j23;
                    jArr7[(((iA - 7) & i50) + (i50 & 7)) >> 3] = j23;
                    iNumberOfTrailingZeros = iA;
                    break;
                }
                i12 = i16 + 8;
                i11 = (i11 + i12) & i6;
                it = agqrVar;
                c2 = c;
                i3 = i17;
                i7 = i14;
            }
            agcVar.b[iNumberOfTrailingZeros] = i4;
            int i51 = agcVar.d;
            SparseArray sparseArray = this.a;
            if (i51 != i5) {
                sparseArray.put(i4, qnlVar);
            } else {
                sparseArray.remove(i4);
                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_CONFIGURATION_ERROR;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= 2;
                aihfVarCreateBuilder.cC(i4);
                nucVar.b((asnc) aihfVarCreateBuilder.build(), "Multiple reference controller factories found and removed for extension.", new Object[0]);
            }
            it = agqrVar;
            c2 = c;
        }
        nso nsoVar = null;
        if (nsuVar.a()) {
            optional2 = optional;
            nsoVar = (nso) optional2.orElse(null);
        } else {
            optional2 = optional;
        }
        this.b = nsoVar;
        optional2.isPresent();
        optional2.get();
        this.c = true;
    }

    @Override // defpackage.ntv
    public final /* synthetic */ fgy a(fhd fhdVar, nsl nslVar, nay nayVar, List list, nth nthVar, boolean z) {
        qnl qnlVar;
        if (!nayVar.n()) {
            return null;
        }
        nff nffVarJ = nayVar.j();
        mep mepVar = ndv.af;
        if (!nffVarJ.e(mepVar)) {
            return null;
        }
        ndv ndvVar = (ndv) nayVar.j().d(mepVar);
        if (nayVar.m()) {
            nayVar.i();
        } else {
            mew mewVar = nnb.a;
        }
        nayVar.k();
        int iAD = !ndvVar.a() ? -1 : ksy.aD(ndvVar.g());
        if (iAD == -1 || (qnlVar = (qnl) this.a.get(iAD)) == null) {
            return null;
        }
        if (ndvVar.b()) {
            njq njqVarC = ndvVar.c();
            if (njqVarC instanceof njq) {
                nsk nskVar = new nsk(nslVar);
                UpbMessage upbMessage = njqVarC.b;
                nskVar.v = new ContextSubscriptionInput(upbMessage.a, upbMessage.c.a, null);
                nslVar = nskVar.a();
            }
        }
        mlp mlpVar = new mlp(fhdVar, new mlr());
        mlr mlrVar = mlpVar.a;
        mlrVar.b = nslVar;
        BitSet bitSet = mlpVar.d;
        bitSet.set(1);
        mlrVar.c = this.b;
        mlrVar.a = new mly(qnlVar, nslVar, ndvVar, 0);
        bitSet.set(0);
        return mlpVar.a();
    }

    @Override // defpackage.ntv
    public final mep b() {
        return ndv.af;
    }

    @Override // defpackage.ntv
    public final boolean c() {
        return true;
    }
}
