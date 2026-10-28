package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hs {
    private static final Comparator a = new aqv(1);

    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x015c  */
    public static hp a(ho hoVar, boolean z) {
        int i;
        int i2;
        hr hrVar;
        aamu aamuVar;
        int i3;
        hr hrVar2;
        hr hrVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iB = hoVar.b();
        int iA = hoVar.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new hq(iB, iA));
        int i15 = iB + iA;
        int i16 = 1;
        int i17 = (((i15 + 1) / 2) << 1) + 1;
        int[] iArr = new int[i17];
        int[] iArr2 = new int[i17];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            hq hqVar = (hq) arrayList2.remove(arrayList2.size() - 1);
            if (hqVar.b() > 0 && hqVar.a() > 0) {
                int i18 = i17 >> 1;
                int iB2 = ((hqVar.b() + hqVar.a()) + i16) / 2;
                int i19 = i18 + 1;
                iArr[i19] = hqVar.a;
                iArr2[i19] = hqVar.b;
                int i20 = 0;
                while (true) {
                    if (i20 >= iB2) {
                        i = i17;
                        i2 = i16;
                        iArr = iArr;
                        iArr2 = iArr2;
                        hrVar = null;
                        break;
                    }
                    int i21 = -i20;
                    int iAbs = Math.abs(hqVar.b() - hqVar.a()) % 2;
                    int iB3 = hqVar.b() - hqVar.a();
                    int i22 = i21;
                    while (true) {
                        if (i22 > i20) {
                            i = i17;
                            iArr = iArr;
                            iArr2 = iArr2;
                            i18 = i18;
                            i3 = 0;
                            hrVar2 = null;
                            break;
                        }
                        if (i22 != i21) {
                            int i23 = (i22 - 1) + i18;
                            if (i22 == i20 || iArr[i22 + 1 + i18] <= iArr[i23]) {
                                i9 = iArr[i23];
                                i10 = i9 + 1;
                            } else {
                                i9 = iArr[i22 + 1 + i18];
                                i10 = i9;
                            }
                        } else {
                            i9 = iArr[i22 + 1 + i18];
                            i10 = i9;
                        }
                        i = i17;
                        int i24 = (hqVar.c + (i10 - hqVar.a)) - i22;
                        if (i20 != 0) {
                            if (i10 != i9) {
                                i11 = i20;
                            } else {
                                iArr = iArr;
                                i10 = i10;
                                i12 = i24 - 1;
                                iArr2 = iArr2;
                                i18 = i18;
                                i11 = i20;
                            }
                            while (i10 < hqVar.b && i24 < hqVar.d && hoVar.d(i10, i24)) {
                                i10++;
                                i24++;
                            }
                            iArr[i22 + i18] = i10;
                            if (iAbs == 1) {
                                i14 = iB3 - i22;
                                i13 = i22;
                                if (i14 >= (-i11) + 1 && i14 <= i11 - 1 && iArr2[i14 + i18] <= i10) {
                                    hrVar2 = new hr();
                                    hrVar2.a = i9;
                                    hrVar2.b = i12;
                                    hrVar2.c = i10;
                                    hrVar2.d = i24;
                                    i3 = 0;
                                    hrVar2.e = false;
                                    break;
                                }
                            } else {
                                i13 = i22;
                            }
                            i22 = i13 + 2;
                            i17 = i;
                            iArr = iArr;
                            iArr2 = iArr2;
                            i18 = i18;
                        } else {
                            i11 = 0;
                        }
                        i12 = i24;
                        while (i10 < hqVar.b) {
                            i10++;
                            i24++;
                        }
                        iArr[i22 + i18] = i10;
                        if (iAbs == 1) {
                            i14 = iB3 - i22;
                            i13 = i22;
                            if (i14 >= (-i11) + 1) {
                                continue;
                            }
                        } else {
                            i13 = i22;
                        }
                        i22 = i13 + 2;
                        i17 = i;
                        iArr = iArr;
                        iArr2 = iArr2;
                        i18 = i18;
                    }
                    if (hrVar2 != null) {
                        hrVar = hrVar2;
                        i2 = 1;
                        break;
                    }
                    int iB4 = hqVar.b() - hqVar.a();
                    int iB5 = hqVar.b() - hqVar.a();
                    int i25 = i21;
                    while (true) {
                        if (i25 > i20) {
                            i2 = 1;
                            hrVar3 = null;
                            break;
                        }
                        if (i25 != i21) {
                            int i26 = (i25 - 1) + i18;
                            if (i25 == i20 || iArr2[i25 + 1 + i18] >= iArr2[i26]) {
                                i4 = iArr2[i26];
                                i5 = i4 - 1;
                            } else {
                                i4 = iArr2[i25 + 1 + i18];
                                i5 = i4;
                            }
                        } else {
                            i4 = iArr2[i25 + 1 + i18];
                            i5 = i4;
                        }
                        int i27 = hqVar.d - ((hqVar.b - i5) - i25);
                        if (i20 != 0) {
                            i6 = i5 != i4 ? i27 : i27 + 1;
                            i3 = i20;
                        } else {
                            iB4 = iB4;
                            i6 = i27;
                        }
                        while (true) {
                            if (i5 > hqVar.a && i27 > hqVar.c) {
                                int i28 = i5 - 1;
                                i7 = iB5;
                                int i29 = i27 - 1;
                                if (!hoVar.d(i28, i29)) {
                                    break;
                                }
                                i5 = i28;
                                i27 = i29;
                                iB5 = i7;
                            } else {
                                i7 = iB5;
                                break;
                            }
                        }
                        int i30 = iB4 % 2;
                        iArr2[i25 + i18] = i5;
                        if (i30 == 0 && (i8 = i7 - i25) >= (-i3) && i8 <= i3 && iArr[i8 + i18] >= i5) {
                            hrVar3 = new hr();
                            hrVar3.a = i5;
                            hrVar3.b = i27;
                            hrVar3.c = i4;
                            hrVar3.d = i6;
                            i2 = 1;
                            hrVar3.e = true;
                            break;
                        }
                        i25 += 2;
                        iB4 = iB4;
                        iB5 = i7;
                        i3 = 0;
                    }
                    if (hrVar3 != null) {
                        hrVar = hrVar3;
                        break;
                    }
                    i20++;
                    i16 = i2;
                    i17 = i;
                    iArr = iArr;
                    iArr2 = iArr2;
                    i18 = i18;
                }
            } else {
                i = i17;
                i2 = i16;
                iArr = iArr;
                iArr2 = iArr2;
                hrVar = null;
                break;
            }
            if (hrVar != null) {
                if (hrVar.a() > 0) {
                    int i31 = hrVar.d;
                    int i32 = hrVar.b;
                    int i33 = i31 - i32;
                    int i34 = hrVar.c;
                    int i35 = hrVar.a;
                    int i36 = i34 - i35;
                    if (i33 == i36) {
                        aamuVar = new aamu(i35, i32, i36, null, null, null);
                    } else if (hrVar.e) {
                        aamuVar = new aamu(i35, i32, hrVar.a(), null, null, null);
                    } else {
                        aamuVar = i33 > i36 ? new aamu(i35, i32 + 1, hrVar.a(), null, null, null) : new aamu(i35 + 1, i32, hrVar.a(), null, null, null);
                    }
                    arrayList.add(aamuVar);
                }
                hq hqVar2 = arrayList3.isEmpty() ? new hq() : (hq) arrayList3.remove(arrayList3.size() - 1);
                hqVar2.a = hqVar.a;
                hqVar2.c = hqVar.c;
                hqVar2.b = hrVar.a;
                hqVar2.d = hrVar.b;
                arrayList2.add(hqVar2);
                int i37 = hqVar.b;
                int i38 = hqVar.d;
                hqVar.a = hrVar.c;
                hqVar.c = hrVar.d;
                arrayList2.add(hqVar);
            } else {
                arrayList3.add(hqVar);
            }
            i16 = i2;
            i17 = i;
            iArr = iArr;
            iArr2 = iArr2;
        }
        Collections.sort(arrayList, a);
        return new hp(hoVar, arrayList, iArr, iArr2, z);
    }
}
