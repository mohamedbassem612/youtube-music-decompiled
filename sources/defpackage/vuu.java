package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vuu {
    static final vus a = vus.a(vun.d, avlh.w());
    public static final /* synthetic */ int h = 0;
    public final awkv b;
    public final awkv c;
    public final awkv d;
    public final avlh e;
    public final avlh f;
    public final vwt g;
    private final awkv i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [axso, java.lang.Object] */
    public vuu(vwt vwtVar, final axfd axfdVar, vtm vtmVar, wjr wjrVar, vwt vwtVar2) {
        this.g = vwtVar2;
        awkv awkvVarAI = new awku().aI();
        this.b = awkvVarAI;
        awkv awkvVarAI2 = new awku().aI();
        this.c = awkvVarAI2;
        awkv awkvVarAI3 = new awku().aI();
        this.d = awkvVarAI3;
        awkv awkvVarAI4 = new awkx().aI();
        this.i = awkvVarAI4;
        avlh avlhVarS = ((avlh) wjrVar.b).W(new vup(1)).af(awkvVarAI, awkvVarAI2, vwtVar.a, awkvVarAI3, new avnl() { // from class: vuo
            /* JADX WARN: Code duplicated, block: B:100:0x0182  */
            /* JADX WARN: Code duplicated, block: B:101:0x0185  */
            /* JADX WARN: Code duplicated, block: B:103:0x0195 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:104:0x0197 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:105:0x0199 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:106:0x019b  */
            /* JADX WARN: Code duplicated, block: B:107:0x019e  */
            /* JADX WARN: Code duplicated, block: B:109:0x01a4 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:110:0x01a6  */
            /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
            /* JADX WARN: Code duplicated, block: B:112:0x01ac  */
            /* JADX WARN: Code duplicated, block: B:131:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:19:0x0062  */
            /* JADX WARN: Code duplicated, block: B:21:0x0068  */
            /* JADX WARN: Code duplicated, block: B:23:0x0070  */
            /* JADX WARN: Code duplicated, block: B:25:0x007c  */
            /* JADX WARN: Code duplicated, block: B:26:0x007e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:27:0x0080  */
            /* JADX WARN: Code duplicated, block: B:29:0x0086 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:30:0x0088  */
            /* JADX WARN: Code duplicated, block: B:31:0x008c  */
            /* JADX WARN: Code duplicated, block: B:33:0x0092  */
            /* JADX WARN: Code duplicated, block: B:35:0x009a  */
            /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
            /* JADX WARN: Code duplicated, block: B:38:0x00ac A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:39:0x00ae A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
            /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
            /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
            /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
            /* JADX WARN: Code duplicated, block: B:51:0x00e2 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:52:0x00e4 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
            /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:61:0x00ff  */
            /* JADX WARN: Code duplicated, block: B:63:0x0113 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:64:0x0115 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:65:0x0117 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:67:0x011a  */
            /* JADX WARN: Code duplicated, block: B:69:0x0120 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:71:0x0123  */
            /* JADX WARN: Code duplicated, block: B:73:0x012c  */
            /* JADX WARN: Code duplicated, block: B:74:0x0130  */
            /* JADX WARN: Code duplicated, block: B:76:0x0133  */
            /* JADX WARN: Code duplicated, block: B:77:0x0137  */
            /* JADX WARN: Code duplicated, block: B:78:0x013b  */
            /* JADX WARN: Code duplicated, block: B:80:0x0141  */
            /* JADX WARN: Code duplicated, block: B:82:0x0155 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:83:0x0157 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:84:0x0159 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:85:0x015b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:87:0x015e  */
            /* JADX WARN: Code duplicated, block: B:89:0x0164 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:90:0x0166 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:92:0x0169  */
            /* JADX WARN: Code duplicated, block: B:94:0x0174  */
            /* JADX WARN: Code duplicated, block: B:95:0x0177 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:96:0x0179  */
            /* JADX WARN: Code duplicated, block: B:97:0x017c  */
            /* JADX WARN: Code duplicated, block: B:99:0x017f  */
            /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, vul] */
            /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, vul] */
            /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, vul] */
            /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, vul] */
            /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, vul] */
            /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, vul] */
            /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, vul] */
            /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, vtm] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, vul] */
            @Override // defpackage.avnl
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                vun vunVar;
                vuv vuvVarH;
                int iA;
                Rect rectC;
                int iOrdinal;
                vun vunVarG;
                int iA2;
                int iB;
                Rect rectC2;
                int iOrdinal2;
                int i;
                int i2;
                int i3;
                int iA3;
                int iB2;
                Rect rectC3;
                int iOrdinal3;
                int i4;
                int i5;
                Object objC;
                int iB3;
                Rect rectC4;
                int iOrdinal4;
                Object objC2;
                int iA4;
                Rect rectC5;
                int iOrdinal5;
                Object objC3;
                int iA5;
                int iOrdinal6;
                vuy vuyVar = (vuy) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                vun vunVar2 = (vun) obj5;
                int i6 = vuu.h;
                int iIntValue = ((Integer) obj4).intValue();
                axfd axfdVar2 = axfdVar;
                if (iIntValue == 1) {
                    int iIntValue2 = num2.intValue();
                    ?? r8 = axfdVar2.e;
                    agkz agkzVarA = r8.a();
                    agev agevVarK = axfd.K(r8.f(), agkzVarA);
                    if (agevVarK.g()) {
                        Object objC4 = agevVarK.c();
                        vunVarG = vun.e;
                        if (objC4 == vunVarG) {
                            ?? r9 = axfdVar2.d;
                            int iK = r9.k();
                            Rect rectC6 = r9.c();
                            int iOrdinal7 = vuyVar.ordinal();
                            if (iOrdinal7 != 0) {
                                if (iOrdinal7 != 1) {
                                    if (iOrdinal7 != 2) {
                                        throw new AssertionError(vuyVar);
                                    }
                                    if (iIntValue2 >= iK) {
                                        vunVarG = vun.d;
                                    }
                                }
                            } else if (iIntValue2 > iK + ((rectC6.bottom - iK) / 2)) {
                                vunVarG = vun.d;
                            }
                        } else if (agevVarK.g()) {
                            objC3 = agevVarK.c();
                            vunVarG = vun.a;
                            if (objC3 == vunVarG) {
                                iA5 = axfdVar2.d.a();
                                iOrdinal6 = vuyVar.ordinal();
                                if (iOrdinal6 != 0) {
                                    if (iOrdinal6 != 1) {
                                        if (iOrdinal6 != 2) {
                                            throw new AssertionError(vuyVar);
                                        }
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 >= iA5) {
                                    vunVarG = vun.d;
                                }
                            } else if (agevVarK.g()) {
                                objC2 = agevVarK.c();
                                vunVarG = vun.c;
                                if (objC2 == vunVarG) {
                                    ?? r10 = axfdVar2.d;
                                    iA4 = r10.a();
                                    rectC5 = r10.c();
                                    iOrdinal5 = vuyVar.ordinal();
                                    if (iOrdinal5 != 0) {
                                        vunVarG = axfd.G(iA4, rectC5.bottom, iIntValue2, vunVarG);
                                    } else if (iOrdinal5 != 1) {
                                        if (iOrdinal5 == 2) {
                                            throw new AssertionError(vuyVar);
                                        }
                                        if (iIntValue2 >= iA4) {
                                            vunVarG = vun.d;
                                        }
                                    }
                                } else if (agevVarK.g()) {
                                    objC = agevVarK.c();
                                    vunVarG = vun.b;
                                    if (objC == vunVarG) {
                                        ?? r11 = axfdVar2.d;
                                        iB3 = r11.b();
                                        rectC4 = r11.c();
                                        iOrdinal4 = vuyVar.ordinal();
                                        if (iOrdinal4 != 0) {
                                            if (iOrdinal4 != 1) {
                                                if (iOrdinal4 == 2) {
                                                    throw new AssertionError(vuyVar);
                                                }
                                                if (iIntValue2 >= iB3) {
                                                    vunVarG = vun.d;
                                                }
                                            }
                                        } else if (iIntValue2 > iB3 + ((rectC4.bottom - iB3) / 2)) {
                                            vunVarG = vun.d;
                                        }
                                    } else if (axfdVar2.J(agkzVarA)) {
                                        ?? r12 = axfdVar2.d;
                                        iA3 = r12.a();
                                        iB2 = r12.b();
                                        rectC3 = r12.c();
                                        iOrdinal3 = vuyVar.ordinal();
                                        if (iOrdinal3 != 0) {
                                            if (iOrdinal3 != 1) {
                                                if (iOrdinal3 == 2) {
                                                    throw new RuntimeException(null, null);
                                                }
                                                if (iIntValue2 < iA3) {
                                                    vunVarG = vun.d;
                                                }
                                            } else if (iIntValue2 < iA3) {
                                                vunVarG = vun.b;
                                            }
                                            vunVarG = vun.c;
                                        } else {
                                            i4 = iB2 + ((iA3 - iB2) / 2);
                                            i5 = rectC3.bottom + iA3;
                                            if (iIntValue2 < i4) {
                                                vunVarG = vun.b;
                                            } else if (iIntValue2 > i5 / 2) {
                                                vunVarG = vun.d;
                                            } else {
                                                vunVarG = vun.c;
                                            }
                                        }
                                    } else if (axfdVar2.I(agkzVarA)) {
                                        ?? r13 = axfdVar2.d;
                                        iA2 = r13.a();
                                        iB = r13.b();
                                        rectC2 = r13.c();
                                        iOrdinal2 = vuyVar.ordinal();
                                        if (iOrdinal2 != 0) {
                                            i = iB / 2;
                                            i2 = iB + ((iA2 - iB) / 2);
                                            i3 = rectC2.bottom + iA2;
                                            if (iIntValue2 < i) {
                                                vunVarG = vun.a;
                                            } else if (iIntValue2 < i2) {
                                                vunVarG = vun.b;
                                            } else if (iIntValue2 > i3 / 2) {
                                                vunVarG = vun.d;
                                            } else {
                                                vunVarG = vun.c;
                                            }
                                        } else if (iOrdinal2 != 1) {
                                            if (iOrdinal2 == 2) {
                                                throw new RuntimeException(null, null);
                                            }
                                            if (iIntValue2 >= iB) {
                                                vunVarG = vun.b;
                                            } else if (iIntValue2 < iA2) {
                                                vunVarG = vun.c;
                                            } else {
                                                vunVarG = vun.d;
                                            }
                                        } else if (iIntValue2 >= iB) {
                                            vunVarG = vun.a;
                                        } else if (iIntValue2 < iA2) {
                                            vunVarG = vun.b;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else {
                                        ?? r14 = axfdVar2.d;
                                        iA = r14.a();
                                        rectC = r14.c();
                                        iOrdinal = vuyVar.ordinal();
                                        if (iOrdinal != 0) {
                                            vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                        } else if (iOrdinal != 1) {
                                            if (iOrdinal == 2) {
                                                throw new RuntimeException(null, null);
                                            }
                                            if (iIntValue2 >= iA) {
                                                vunVarG = vun.d;
                                            } else {
                                                vunVarG = vun.c;
                                            }
                                        } else if (iIntValue2 < iA) {
                                            vunVarG = vun.a;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    }
                                } else if (axfdVar2.J(agkzVarA)) {
                                    ?? r15 = axfdVar2.d;
                                    iA3 = r15.a();
                                    iB2 = r15.b();
                                    rectC3 = r15.c();
                                    iOrdinal3 = vuyVar.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            if (iOrdinal3 == 2) {
                                                throw new RuntimeException(null, null);
                                            }
                                            if (iIntValue2 < iA3) {
                                                vunVarG = vun.d;
                                            }
                                        } else if (iIntValue2 < iA3) {
                                            vunVarG = vun.b;
                                        }
                                        vunVarG = vun.c;
                                    } else {
                                        i4 = iB2 + ((iA3 - iB2) / 2);
                                        i5 = rectC3.bottom + iA3;
                                        if (iIntValue2 < i4) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 > i5 / 2) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    }
                                } else if (axfdVar2.I(agkzVarA)) {
                                    ?? r16 = axfdVar2.d;
                                    iA2 = r16.a();
                                    iB = r16.b();
                                    rectC2 = r16.c();
                                    iOrdinal2 = vuyVar.ordinal();
                                    if (iOrdinal2 != 0) {
                                        i = iB / 2;
                                        i2 = iB + ((iA2 - iB) / 2);
                                        i3 = rectC2.bottom + iA2;
                                        if (iIntValue2 < i) {
                                            vunVarG = vun.a;
                                        } else if (iIntValue2 < i2) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 > i3 / 2) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 >= iB) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 < iA2) {
                                            vunVarG = vun.c;
                                        } else {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 >= iB) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.b;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else {
                                    ?? r17 = axfdVar2.d;
                                    iA = r17.a();
                                    rectC = r17.c();
                                    iOrdinal = vuyVar.ordinal();
                                    if (iOrdinal != 0) {
                                        vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                    } else if (iOrdinal != 1) {
                                        if (iOrdinal == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 >= iA) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else if (iIntValue2 < iA) {
                                        vunVarG = vun.a;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (agevVarK.g()) {
                                objC = agevVarK.c();
                                vunVarG = vun.b;
                                if (objC == vunVarG) {
                                    ?? r18 = axfdVar2.d;
                                    iB3 = r18.b();
                                    rectC4 = r18.c();
                                    iOrdinal4 = vuyVar.ordinal();
                                    if (iOrdinal4 != 0) {
                                        if (iOrdinal4 != 1) {
                                            if (iOrdinal4 == 2) {
                                                throw new AssertionError(vuyVar);
                                            }
                                            if (iIntValue2 >= iB3) {
                                                vunVarG = vun.d;
                                            }
                                        }
                                    } else if (iIntValue2 > iB3 + ((rectC4.bottom - iB3) / 2)) {
                                        vunVarG = vun.d;
                                    }
                                } else if (axfdVar2.J(agkzVarA)) {
                                    ?? r19 = axfdVar2.d;
                                    iA3 = r19.a();
                                    iB2 = r19.b();
                                    rectC3 = r19.c();
                                    iOrdinal3 = vuyVar.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            if (iOrdinal3 == 2) {
                                                throw new RuntimeException(null, null);
                                            }
                                            if (iIntValue2 < iA3) {
                                                vunVarG = vun.d;
                                            }
                                        } else if (iIntValue2 < iA3) {
                                            vunVarG = vun.b;
                                        }
                                        vunVarG = vun.c;
                                    } else {
                                        i4 = iB2 + ((iA3 - iB2) / 2);
                                        i5 = rectC3.bottom + iA3;
                                        if (iIntValue2 < i4) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 > i5 / 2) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    }
                                } else if (axfdVar2.I(agkzVarA)) {
                                    ?? r110 = axfdVar2.d;
                                    iA2 = r110.a();
                                    iB = r110.b();
                                    rectC2 = r110.c();
                                    iOrdinal2 = vuyVar.ordinal();
                                    if (iOrdinal2 != 0) {
                                        i = iB / 2;
                                        i2 = iB + ((iA2 - iB) / 2);
                                        i3 = rectC2.bottom + iA2;
                                        if (iIntValue2 < i) {
                                            vunVarG = vun.a;
                                        } else if (iIntValue2 < i2) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 > i3 / 2) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 >= iB) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 < iA2) {
                                            vunVarG = vun.c;
                                        } else {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 >= iB) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.b;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else {
                                    ?? r111 = axfdVar2.d;
                                    iA = r111.a();
                                    rectC = r111.c();
                                    iOrdinal = vuyVar.ordinal();
                                    if (iOrdinal != 0) {
                                        vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                    } else if (iOrdinal != 1) {
                                        if (iOrdinal == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 >= iA) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else if (iIntValue2 < iA) {
                                        vunVarG = vun.a;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.J(agkzVarA)) {
                                ?? r112 = axfdVar2.d;
                                iA3 = r112.a();
                                iB2 = r112.b();
                                rectC3 = r112.c();
                                iOrdinal3 = vuyVar.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        if (iOrdinal3 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 < iA3) {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 < iA3) {
                                        vunVarG = vun.b;
                                    }
                                    vunVarG = vun.c;
                                } else {
                                    i4 = iB2 + ((iA3 - iB2) / 2);
                                    i5 = rectC3.bottom + iA3;
                                    if (iIntValue2 < i4) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i5 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.I(agkzVarA)) {
                                ?? r113 = axfdVar2.d;
                                iA2 = r113.a();
                                iB = r113.b();
                                rectC2 = r113.c();
                                iOrdinal2 = vuyVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    i = iB / 2;
                                    i2 = iB + ((iA2 - iB) / 2);
                                    i3 = rectC2.bottom + iA2;
                                    if (iIntValue2 < i) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < i2) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i3 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iB) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.c;
                                    } else {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 >= iB) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.b;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else {
                                ?? r114 = axfdVar2.d;
                                iA = r114.a();
                                rectC = r114.c();
                                iOrdinal = vuyVar.ordinal();
                                if (iOrdinal != 0) {
                                    vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iA) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iIntValue2 < iA) {
                                    vunVarG = vun.a;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (agevVarK.g()) {
                            objC2 = agevVarK.c();
                            vunVarG = vun.c;
                            if (objC2 == vunVarG) {
                                ?? r115 = axfdVar2.d;
                                iA4 = r115.a();
                                rectC5 = r115.c();
                                iOrdinal5 = vuyVar.ordinal();
                                if (iOrdinal5 != 0) {
                                    vunVarG = axfd.G(iA4, rectC5.bottom, iIntValue2, vunVarG);
                                } else if (iOrdinal5 != 1) {
                                    if (iOrdinal5 == 2) {
                                        throw new AssertionError(vuyVar);
                                    }
                                    if (iIntValue2 >= iA4) {
                                        vunVarG = vun.d;
                                    }
                                }
                            } else if (agevVarK.g()) {
                                objC = agevVarK.c();
                                vunVarG = vun.b;
                                if (objC == vunVarG) {
                                    ?? r116 = axfdVar2.d;
                                    iB3 = r116.b();
                                    rectC4 = r116.c();
                                    iOrdinal4 = vuyVar.ordinal();
                                    if (iOrdinal4 != 0) {
                                        if (iOrdinal4 != 1) {
                                            if (iOrdinal4 == 2) {
                                                throw new AssertionError(vuyVar);
                                            }
                                            if (iIntValue2 >= iB3) {
                                                vunVarG = vun.d;
                                            }
                                        }
                                    } else if (iIntValue2 > iB3 + ((rectC4.bottom - iB3) / 2)) {
                                        vunVarG = vun.d;
                                    }
                                } else if (axfdVar2.J(agkzVarA)) {
                                    ?? r117 = axfdVar2.d;
                                    iA3 = r117.a();
                                    iB2 = r117.b();
                                    rectC3 = r117.c();
                                    iOrdinal3 = vuyVar.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            if (iOrdinal3 == 2) {
                                                throw new RuntimeException(null, null);
                                            }
                                            if (iIntValue2 < iA3) {
                                                vunVarG = vun.d;
                                            }
                                        } else if (iIntValue2 < iA3) {
                                            vunVarG = vun.b;
                                        }
                                        vunVarG = vun.c;
                                    } else {
                                        i4 = iB2 + ((iA3 - iB2) / 2);
                                        i5 = rectC3.bottom + iA3;
                                        if (iIntValue2 < i4) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 > i5 / 2) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    }
                                } else if (axfdVar2.I(agkzVarA)) {
                                    ?? r118 = axfdVar2.d;
                                    iA2 = r118.a();
                                    iB = r118.b();
                                    rectC2 = r118.c();
                                    iOrdinal2 = vuyVar.ordinal();
                                    if (iOrdinal2 != 0) {
                                        i = iB / 2;
                                        i2 = iB + ((iA2 - iB) / 2);
                                        i3 = rectC2.bottom + iA2;
                                        if (iIntValue2 < i) {
                                            vunVarG = vun.a;
                                        } else if (iIntValue2 < i2) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 > i3 / 2) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 >= iB) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 < iA2) {
                                            vunVarG = vun.c;
                                        } else {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 >= iB) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.b;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else {
                                    ?? r119 = axfdVar2.d;
                                    iA = r119.a();
                                    rectC = r119.c();
                                    iOrdinal = vuyVar.ordinal();
                                    if (iOrdinal != 0) {
                                        vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                    } else if (iOrdinal != 1) {
                                        if (iOrdinal == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 >= iA) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else if (iIntValue2 < iA) {
                                        vunVarG = vun.a;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.J(agkzVarA)) {
                                ?? r1110 = axfdVar2.d;
                                iA3 = r1110.a();
                                iB2 = r1110.b();
                                rectC3 = r1110.c();
                                iOrdinal3 = vuyVar.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        if (iOrdinal3 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 < iA3) {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 < iA3) {
                                        vunVarG = vun.b;
                                    }
                                    vunVarG = vun.c;
                                } else {
                                    i4 = iB2 + ((iA3 - iB2) / 2);
                                    i5 = rectC3.bottom + iA3;
                                    if (iIntValue2 < i4) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i5 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.I(agkzVarA)) {
                                ?? r1111 = axfdVar2.d;
                                iA2 = r1111.a();
                                iB = r1111.b();
                                rectC2 = r1111.c();
                                iOrdinal2 = vuyVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    i = iB / 2;
                                    i2 = iB + ((iA2 - iB) / 2);
                                    i3 = rectC2.bottom + iA2;
                                    if (iIntValue2 < i) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < i2) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i3 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iB) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.c;
                                    } else {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 >= iB) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.b;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else {
                                ?? r1112 = axfdVar2.d;
                                iA = r1112.a();
                                rectC = r1112.c();
                                iOrdinal = vuyVar.ordinal();
                                if (iOrdinal != 0) {
                                    vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iA) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iIntValue2 < iA) {
                                    vunVarG = vun.a;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (agevVarK.g()) {
                            objC = agevVarK.c();
                            vunVarG = vun.b;
                            if (objC == vunVarG) {
                                ?? r1113 = axfdVar2.d;
                                iB3 = r1113.b();
                                rectC4 = r1113.c();
                                iOrdinal4 = vuyVar.ordinal();
                                if (iOrdinal4 != 0) {
                                    if (iOrdinal4 != 1) {
                                        if (iOrdinal4 == 2) {
                                            throw new AssertionError(vuyVar);
                                        }
                                        if (iIntValue2 >= iB3) {
                                            vunVarG = vun.d;
                                        }
                                    }
                                } else if (iIntValue2 > iB3 + ((rectC4.bottom - iB3) / 2)) {
                                    vunVarG = vun.d;
                                }
                            } else if (axfdVar2.J(agkzVarA)) {
                                ?? r1114 = axfdVar2.d;
                                iA3 = r1114.a();
                                iB2 = r1114.b();
                                rectC3 = r1114.c();
                                iOrdinal3 = vuyVar.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        if (iOrdinal3 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 < iA3) {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 < iA3) {
                                        vunVarG = vun.b;
                                    }
                                    vunVarG = vun.c;
                                } else {
                                    i4 = iB2 + ((iA3 - iB2) / 2);
                                    i5 = rectC3.bottom + iA3;
                                    if (iIntValue2 < i4) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i5 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.I(agkzVarA)) {
                                ?? r1115 = axfdVar2.d;
                                iA2 = r1115.a();
                                iB = r1115.b();
                                rectC2 = r1115.c();
                                iOrdinal2 = vuyVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    i = iB / 2;
                                    i2 = iB + ((iA2 - iB) / 2);
                                    i3 = rectC2.bottom + iA2;
                                    if (iIntValue2 < i) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < i2) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i3 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iB) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.c;
                                    } else {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 >= iB) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.b;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else {
                                ?? r1116 = axfdVar2.d;
                                iA = r1116.a();
                                rectC = r1116.c();
                                iOrdinal = vuyVar.ordinal();
                                if (iOrdinal != 0) {
                                    vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iA) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iIntValue2 < iA) {
                                    vunVarG = vun.a;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (axfdVar2.J(agkzVarA)) {
                            ?? r1117 = axfdVar2.d;
                            iA3 = r1117.a();
                            iB2 = r1117.b();
                            rectC3 = r1117.c();
                            iOrdinal3 = vuyVar.ordinal();
                            if (iOrdinal3 != 0) {
                                if (iOrdinal3 != 1) {
                                    if (iOrdinal3 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 < iA3) {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 < iA3) {
                                    vunVarG = vun.b;
                                }
                                vunVarG = vun.c;
                            } else {
                                i4 = iB2 + ((iA3 - iB2) / 2);
                                i5 = rectC3.bottom + iA3;
                                if (iIntValue2 < i4) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 > i5 / 2) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (axfdVar2.I(agkzVarA)) {
                            ?? r1118 = axfdVar2.d;
                            iA2 = r1118.a();
                            iB = r1118.b();
                            rectC2 = r1118.c();
                            iOrdinal2 = vuyVar.ordinal();
                            if (iOrdinal2 != 0) {
                                i = iB / 2;
                                i2 = iB + ((iA2 - iB) / 2);
                                i3 = rectC2.bottom + iA2;
                                if (iIntValue2 < i) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < i2) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 > i3 / 2) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 >= iB) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.c;
                                } else {
                                    vunVarG = vun.d;
                                }
                            } else if (iIntValue2 >= iB) {
                                vunVarG = vun.a;
                            } else if (iIntValue2 < iA2) {
                                vunVarG = vun.b;
                            } else {
                                vunVarG = vun.c;
                            }
                        } else {
                            ?? r1119 = axfdVar2.d;
                            iA = r1119.a();
                            rectC = r1119.c();
                            iOrdinal = vuyVar.ordinal();
                            if (iOrdinal != 0) {
                                vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 >= iA) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else if (iIntValue2 < iA) {
                                vunVarG = vun.a;
                            } else {
                                vunVarG = vun.c;
                            }
                        }
                    } else if (agevVarK.g()) {
                        objC3 = agevVarK.c();
                        vunVarG = vun.a;
                        if (objC3 == vunVarG) {
                            iA5 = axfdVar2.d.a();
                            iOrdinal6 = vuyVar.ordinal();
                            if (iOrdinal6 != 0) {
                                if (iOrdinal6 != 1) {
                                    if (iOrdinal6 != 2) {
                                        throw new AssertionError(vuyVar);
                                    }
                                    vunVarG = vun.d;
                                }
                            } else if (iIntValue2 >= iA5) {
                                vunVarG = vun.d;
                            }
                        } else if (agevVarK.g()) {
                            objC2 = agevVarK.c();
                            vunVarG = vun.c;
                            if (objC2 == vunVarG) {
                                ?? r1120 = axfdVar2.d;
                                iA4 = r1120.a();
                                rectC5 = r1120.c();
                                iOrdinal5 = vuyVar.ordinal();
                                if (iOrdinal5 != 0) {
                                    vunVarG = axfd.G(iA4, rectC5.bottom, iIntValue2, vunVarG);
                                } else if (iOrdinal5 != 1) {
                                    if (iOrdinal5 == 2) {
                                        throw new AssertionError(vuyVar);
                                    }
                                    if (iIntValue2 >= iA4) {
                                        vunVarG = vun.d;
                                    }
                                }
                            } else if (agevVarK.g()) {
                                objC = agevVarK.c();
                                vunVarG = vun.b;
                                if (objC == vunVarG) {
                                    ?? r11110 = axfdVar2.d;
                                    iB3 = r11110.b();
                                    rectC4 = r11110.c();
                                    iOrdinal4 = vuyVar.ordinal();
                                    if (iOrdinal4 != 0) {
                                        if (iOrdinal4 != 1) {
                                            if (iOrdinal4 == 2) {
                                                throw new AssertionError(vuyVar);
                                            }
                                            if (iIntValue2 >= iB3) {
                                                vunVarG = vun.d;
                                            }
                                        }
                                    } else if (iIntValue2 > iB3 + ((rectC4.bottom - iB3) / 2)) {
                                        vunVarG = vun.d;
                                    }
                                } else if (axfdVar2.J(agkzVarA)) {
                                    ?? r11111 = axfdVar2.d;
                                    iA3 = r11111.a();
                                    iB2 = r11111.b();
                                    rectC3 = r11111.c();
                                    iOrdinal3 = vuyVar.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            if (iOrdinal3 == 2) {
                                                throw new RuntimeException(null, null);
                                            }
                                            if (iIntValue2 < iA3) {
                                                vunVarG = vun.d;
                                            }
                                        } else if (iIntValue2 < iA3) {
                                            vunVarG = vun.b;
                                        }
                                        vunVarG = vun.c;
                                    } else {
                                        i4 = iB2 + ((iA3 - iB2) / 2);
                                        i5 = rectC3.bottom + iA3;
                                        if (iIntValue2 < i4) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 > i5 / 2) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    }
                                } else if (axfdVar2.I(agkzVarA)) {
                                    ?? r11112 = axfdVar2.d;
                                    iA2 = r11112.a();
                                    iB = r11112.b();
                                    rectC2 = r11112.c();
                                    iOrdinal2 = vuyVar.ordinal();
                                    if (iOrdinal2 != 0) {
                                        i = iB / 2;
                                        i2 = iB + ((iA2 - iB) / 2);
                                        i3 = rectC2.bottom + iA2;
                                        if (iIntValue2 < i) {
                                            vunVarG = vun.a;
                                        } else if (iIntValue2 < i2) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 > i3 / 2) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 >= iB) {
                                            vunVarG = vun.b;
                                        } else if (iIntValue2 < iA2) {
                                            vunVarG = vun.c;
                                        } else {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 >= iB) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.b;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else {
                                    ?? r11113 = axfdVar2.d;
                                    iA = r11113.a();
                                    rectC = r11113.c();
                                    iOrdinal = vuyVar.ordinal();
                                    if (iOrdinal != 0) {
                                        vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                    } else if (iOrdinal != 1) {
                                        if (iOrdinal == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 >= iA) {
                                            vunVarG = vun.d;
                                        } else {
                                            vunVarG = vun.c;
                                        }
                                    } else if (iIntValue2 < iA) {
                                        vunVarG = vun.a;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.J(agkzVarA)) {
                                ?? r11114 = axfdVar2.d;
                                iA3 = r11114.a();
                                iB2 = r11114.b();
                                rectC3 = r11114.c();
                                iOrdinal3 = vuyVar.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        if (iOrdinal3 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 < iA3) {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 < iA3) {
                                        vunVarG = vun.b;
                                    }
                                    vunVarG = vun.c;
                                } else {
                                    i4 = iB2 + ((iA3 - iB2) / 2);
                                    i5 = rectC3.bottom + iA3;
                                    if (iIntValue2 < i4) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i5 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.I(agkzVarA)) {
                                ?? r11115 = axfdVar2.d;
                                iA2 = r11115.a();
                                iB = r11115.b();
                                rectC2 = r11115.c();
                                iOrdinal2 = vuyVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    i = iB / 2;
                                    i2 = iB + ((iA2 - iB) / 2);
                                    i3 = rectC2.bottom + iA2;
                                    if (iIntValue2 < i) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < i2) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i3 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iB) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.c;
                                    } else {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 >= iB) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.b;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else {
                                ?? r11116 = axfdVar2.d;
                                iA = r11116.a();
                                rectC = r11116.c();
                                iOrdinal = vuyVar.ordinal();
                                if (iOrdinal != 0) {
                                    vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iA) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iIntValue2 < iA) {
                                    vunVarG = vun.a;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (agevVarK.g()) {
                            objC = agevVarK.c();
                            vunVarG = vun.b;
                            if (objC == vunVarG) {
                                ?? r11117 = axfdVar2.d;
                                iB3 = r11117.b();
                                rectC4 = r11117.c();
                                iOrdinal4 = vuyVar.ordinal();
                                if (iOrdinal4 != 0) {
                                    if (iOrdinal4 != 1) {
                                        if (iOrdinal4 == 2) {
                                            throw new AssertionError(vuyVar);
                                        }
                                        if (iIntValue2 >= iB3) {
                                            vunVarG = vun.d;
                                        }
                                    }
                                } else if (iIntValue2 > iB3 + ((rectC4.bottom - iB3) / 2)) {
                                    vunVarG = vun.d;
                                }
                            } else if (axfdVar2.J(agkzVarA)) {
                                ?? r11118 = axfdVar2.d;
                                iA3 = r11118.a();
                                iB2 = r11118.b();
                                rectC3 = r11118.c();
                                iOrdinal3 = vuyVar.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        if (iOrdinal3 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 < iA3) {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 < iA3) {
                                        vunVarG = vun.b;
                                    }
                                    vunVarG = vun.c;
                                } else {
                                    i4 = iB2 + ((iA3 - iB2) / 2);
                                    i5 = rectC3.bottom + iA3;
                                    if (iIntValue2 < i4) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i5 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.I(agkzVarA)) {
                                ?? r11119 = axfdVar2.d;
                                iA2 = r11119.a();
                                iB = r11119.b();
                                rectC2 = r11119.c();
                                iOrdinal2 = vuyVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    i = iB / 2;
                                    i2 = iB + ((iA2 - iB) / 2);
                                    i3 = rectC2.bottom + iA2;
                                    if (iIntValue2 < i) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < i2) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i3 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iB) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.c;
                                    } else {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 >= iB) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.b;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else {
                                ?? r111110 = axfdVar2.d;
                                iA = r111110.a();
                                rectC = r111110.c();
                                iOrdinal = vuyVar.ordinal();
                                if (iOrdinal != 0) {
                                    vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iA) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iIntValue2 < iA) {
                                    vunVarG = vun.a;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (axfdVar2.J(agkzVarA)) {
                            ?? r111111 = axfdVar2.d;
                            iA3 = r111111.a();
                            iB2 = r111111.b();
                            rectC3 = r111111.c();
                            iOrdinal3 = vuyVar.ordinal();
                            if (iOrdinal3 != 0) {
                                if (iOrdinal3 != 1) {
                                    if (iOrdinal3 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 < iA3) {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 < iA3) {
                                    vunVarG = vun.b;
                                }
                                vunVarG = vun.c;
                            } else {
                                i4 = iB2 + ((iA3 - iB2) / 2);
                                i5 = rectC3.bottom + iA3;
                                if (iIntValue2 < i4) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 > i5 / 2) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (axfdVar2.I(agkzVarA)) {
                            ?? r111112 = axfdVar2.d;
                            iA2 = r111112.a();
                            iB = r111112.b();
                            rectC2 = r111112.c();
                            iOrdinal2 = vuyVar.ordinal();
                            if (iOrdinal2 != 0) {
                                i = iB / 2;
                                i2 = iB + ((iA2 - iB) / 2);
                                i3 = rectC2.bottom + iA2;
                                if (iIntValue2 < i) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < i2) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 > i3 / 2) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 >= iB) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.c;
                                } else {
                                    vunVarG = vun.d;
                                }
                            } else if (iIntValue2 >= iB) {
                                vunVarG = vun.a;
                            } else if (iIntValue2 < iA2) {
                                vunVarG = vun.b;
                            } else {
                                vunVarG = vun.c;
                            }
                        } else {
                            ?? r111113 = axfdVar2.d;
                            iA = r111113.a();
                            rectC = r111113.c();
                            iOrdinal = vuyVar.ordinal();
                            if (iOrdinal != 0) {
                                vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 >= iA) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else if (iIntValue2 < iA) {
                                vunVarG = vun.a;
                            } else {
                                vunVarG = vun.c;
                            }
                        }
                    } else if (agevVarK.g()) {
                        objC2 = agevVarK.c();
                        vunVarG = vun.c;
                        if (objC2 == vunVarG) {
                            ?? r1121 = axfdVar2.d;
                            iA4 = r1121.a();
                            rectC5 = r1121.c();
                            iOrdinal5 = vuyVar.ordinal();
                            if (iOrdinal5 != 0) {
                                vunVarG = axfd.G(iA4, rectC5.bottom, iIntValue2, vunVarG);
                            } else if (iOrdinal5 != 1) {
                                if (iOrdinal5 == 2) {
                                    throw new AssertionError(vuyVar);
                                }
                                if (iIntValue2 >= iA4) {
                                    vunVarG = vun.d;
                                }
                            }
                        } else if (agevVarK.g()) {
                            objC = agevVarK.c();
                            vunVarG = vun.b;
                            if (objC == vunVarG) {
                                ?? r111114 = axfdVar2.d;
                                iB3 = r111114.b();
                                rectC4 = r111114.c();
                                iOrdinal4 = vuyVar.ordinal();
                                if (iOrdinal4 != 0) {
                                    if (iOrdinal4 != 1) {
                                        if (iOrdinal4 == 2) {
                                            throw new AssertionError(vuyVar);
                                        }
                                        if (iIntValue2 >= iB3) {
                                            vunVarG = vun.d;
                                        }
                                    }
                                } else if (iIntValue2 > iB3 + ((rectC4.bottom - iB3) / 2)) {
                                    vunVarG = vun.d;
                                }
                            } else if (axfdVar2.J(agkzVarA)) {
                                ?? r111115 = axfdVar2.d;
                                iA3 = r111115.a();
                                iB2 = r111115.b();
                                rectC3 = r111115.c();
                                iOrdinal3 = vuyVar.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        if (iOrdinal3 == 2) {
                                            throw new RuntimeException(null, null);
                                        }
                                        if (iIntValue2 < iA3) {
                                            vunVarG = vun.d;
                                        }
                                    } else if (iIntValue2 < iA3) {
                                        vunVarG = vun.b;
                                    }
                                    vunVarG = vun.c;
                                } else {
                                    i4 = iB2 + ((iA3 - iB2) / 2);
                                    i5 = rectC3.bottom + iA3;
                                    if (iIntValue2 < i4) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i5 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                }
                            } else if (axfdVar2.I(agkzVarA)) {
                                ?? r111116 = axfdVar2.d;
                                iA2 = r111116.a();
                                iB = r111116.b();
                                rectC2 = r111116.c();
                                iOrdinal2 = vuyVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    i = iB / 2;
                                    i2 = iB + ((iA2 - iB) / 2);
                                    i3 = rectC2.bottom + iA2;
                                    if (iIntValue2 < i) {
                                        vunVarG = vun.a;
                                    } else if (iIntValue2 < i2) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 > i3 / 2) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iB) {
                                        vunVarG = vun.b;
                                    } else if (iIntValue2 < iA2) {
                                        vunVarG = vun.c;
                                    } else {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 >= iB) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.b;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else {
                                ?? r111117 = axfdVar2.d;
                                iA = r111117.a();
                                rectC = r111117.c();
                                iOrdinal = vuyVar.ordinal();
                                if (iOrdinal != 0) {
                                    vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 >= iA) {
                                        vunVarG = vun.d;
                                    } else {
                                        vunVarG = vun.c;
                                    }
                                } else if (iIntValue2 < iA) {
                                    vunVarG = vun.a;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (axfdVar2.J(agkzVarA)) {
                            ?? r111118 = axfdVar2.d;
                            iA3 = r111118.a();
                            iB2 = r111118.b();
                            rectC3 = r111118.c();
                            iOrdinal3 = vuyVar.ordinal();
                            if (iOrdinal3 != 0) {
                                if (iOrdinal3 != 1) {
                                    if (iOrdinal3 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 < iA3) {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 < iA3) {
                                    vunVarG = vun.b;
                                }
                                vunVarG = vun.c;
                            } else {
                                i4 = iB2 + ((iA3 - iB2) / 2);
                                i5 = rectC3.bottom + iA3;
                                if (iIntValue2 < i4) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 > i5 / 2) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (axfdVar2.I(agkzVarA)) {
                            ?? r111119 = axfdVar2.d;
                            iA2 = r111119.a();
                            iB = r111119.b();
                            rectC2 = r111119.c();
                            iOrdinal2 = vuyVar.ordinal();
                            if (iOrdinal2 != 0) {
                                i = iB / 2;
                                i2 = iB + ((iA2 - iB) / 2);
                                i3 = rectC2.bottom + iA2;
                                if (iIntValue2 < i) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < i2) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 > i3 / 2) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 >= iB) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.c;
                                } else {
                                    vunVarG = vun.d;
                                }
                            } else if (iIntValue2 >= iB) {
                                vunVarG = vun.a;
                            } else if (iIntValue2 < iA2) {
                                vunVarG = vun.b;
                            } else {
                                vunVarG = vun.c;
                            }
                        } else {
                            ?? r1111110 = axfdVar2.d;
                            iA = r1111110.a();
                            rectC = r1111110.c();
                            iOrdinal = vuyVar.ordinal();
                            if (iOrdinal != 0) {
                                vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 >= iA) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else if (iIntValue2 < iA) {
                                vunVarG = vun.a;
                            } else {
                                vunVarG = vun.c;
                            }
                        }
                    } else if (agevVarK.g()) {
                        objC = agevVarK.c();
                        vunVarG = vun.b;
                        if (objC == vunVarG) {
                            ?? r1111111 = axfdVar2.d;
                            iB3 = r1111111.b();
                            rectC4 = r1111111.c();
                            iOrdinal4 = vuyVar.ordinal();
                            if (iOrdinal4 != 0) {
                                if (iOrdinal4 != 1) {
                                    if (iOrdinal4 == 2) {
                                        throw new AssertionError(vuyVar);
                                    }
                                    if (iIntValue2 >= iB3) {
                                        vunVarG = vun.d;
                                    }
                                }
                            } else if (iIntValue2 > iB3 + ((rectC4.bottom - iB3) / 2)) {
                                vunVarG = vun.d;
                            }
                        } else if (axfdVar2.J(agkzVarA)) {
                            ?? r1111112 = axfdVar2.d;
                            iA3 = r1111112.a();
                            iB2 = r1111112.b();
                            rectC3 = r1111112.c();
                            iOrdinal3 = vuyVar.ordinal();
                            if (iOrdinal3 != 0) {
                                if (iOrdinal3 != 1) {
                                    if (iOrdinal3 == 2) {
                                        throw new RuntimeException(null, null);
                                    }
                                    if (iIntValue2 < iA3) {
                                        vunVarG = vun.d;
                                    }
                                } else if (iIntValue2 < iA3) {
                                    vunVarG = vun.b;
                                }
                                vunVarG = vun.c;
                            } else {
                                i4 = iB2 + ((iA3 - iB2) / 2);
                                i5 = rectC3.bottom + iA3;
                                if (iIntValue2 < i4) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 > i5 / 2) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            }
                        } else if (axfdVar2.I(agkzVarA)) {
                            ?? r1111113 = axfdVar2.d;
                            iA2 = r1111113.a();
                            iB = r1111113.b();
                            rectC2 = r1111113.c();
                            iOrdinal2 = vuyVar.ordinal();
                            if (iOrdinal2 != 0) {
                                i = iB / 2;
                                i2 = iB + ((iA2 - iB) / 2);
                                i3 = rectC2.bottom + iA2;
                                if (iIntValue2 < i) {
                                    vunVarG = vun.a;
                                } else if (iIntValue2 < i2) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 > i3 / 2) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 >= iB) {
                                    vunVarG = vun.b;
                                } else if (iIntValue2 < iA2) {
                                    vunVarG = vun.c;
                                } else {
                                    vunVarG = vun.d;
                                }
                            } else if (iIntValue2 >= iB) {
                                vunVarG = vun.a;
                            } else if (iIntValue2 < iA2) {
                                vunVarG = vun.b;
                            } else {
                                vunVarG = vun.c;
                            }
                        } else {
                            ?? r1111114 = axfdVar2.d;
                            iA = r1111114.a();
                            rectC = r1111114.c();
                            iOrdinal = vuyVar.ordinal();
                            if (iOrdinal != 0) {
                                vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 >= iA) {
                                    vunVarG = vun.d;
                                } else {
                                    vunVarG = vun.c;
                                }
                            } else if (iIntValue2 < iA) {
                                vunVarG = vun.a;
                            } else {
                                vunVarG = vun.c;
                            }
                        }
                    } else if (axfdVar2.J(agkzVarA)) {
                        ?? r1111115 = axfdVar2.d;
                        iA3 = r1111115.a();
                        iB2 = r1111115.b();
                        rectC3 = r1111115.c();
                        iOrdinal3 = vuyVar.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    throw new RuntimeException(null, null);
                                }
                                if (iIntValue2 < iA3) {
                                    vunVarG = vun.d;
                                }
                            } else if (iIntValue2 < iA3) {
                                vunVarG = vun.b;
                            }
                            vunVarG = vun.c;
                        } else {
                            i4 = iB2 + ((iA3 - iB2) / 2);
                            i5 = rectC3.bottom + iA3;
                            if (iIntValue2 < i4) {
                                vunVarG = vun.b;
                            } else if (iIntValue2 > i5 / 2) {
                                vunVarG = vun.d;
                            } else {
                                vunVarG = vun.c;
                            }
                        }
                    } else if (axfdVar2.I(agkzVarA)) {
                        ?? r1111116 = axfdVar2.d;
                        iA2 = r1111116.a();
                        iB = r1111116.b();
                        rectC2 = r1111116.c();
                        iOrdinal2 = vuyVar.ordinal();
                        if (iOrdinal2 != 0) {
                            i = iB / 2;
                            i2 = iB + ((iA2 - iB) / 2);
                            i3 = rectC2.bottom + iA2;
                            if (iIntValue2 < i) {
                                vunVarG = vun.a;
                            } else if (iIntValue2 < i2) {
                                vunVarG = vun.b;
                            } else if (iIntValue2 > i3 / 2) {
                                vunVarG = vun.d;
                            } else {
                                vunVarG = vun.c;
                            }
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                throw new RuntimeException(null, null);
                            }
                            if (iIntValue2 >= iB) {
                                vunVarG = vun.b;
                            } else if (iIntValue2 < iA2) {
                                vunVarG = vun.c;
                            } else {
                                vunVarG = vun.d;
                            }
                        } else if (iIntValue2 >= iB) {
                            vunVarG = vun.a;
                        } else if (iIntValue2 < iA2) {
                            vunVarG = vun.b;
                        } else {
                            vunVarG = vun.c;
                        }
                    } else {
                        ?? r1111117 = axfdVar2.d;
                        iA = r1111117.a();
                        rectC = r1111117.c();
                        iOrdinal = vuyVar.ordinal();
                        if (iOrdinal != 0) {
                            vunVarG = axfd.G(iA, rectC.bottom, iIntValue2, vun.a);
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                throw new RuntimeException(null, null);
                            }
                            if (iIntValue2 >= iA) {
                                vunVarG = vun.d;
                            } else {
                                vunVarG = vun.c;
                            }
                        } else if (iIntValue2 < iA) {
                            vunVarG = vun.a;
                        } else {
                            vunVarG = vun.c;
                        }
                    }
                    vuvVarH = axfdVar2.H(vunVarG, vunVar2);
                } else {
                    int iIntValue3 = num.intValue();
                    boolean zD = vpo.d((Context) axfdVar2.a);
                    int iOrdinal8 = vuyVar.ordinal();
                    if (iOrdinal8 != 0) {
                        if (iOrdinal8 != 1) {
                            if (iOrdinal8 != 2) {
                                throw new RuntimeException(null, null);
                            }
                            if (!zD) {
                                vunVar = vun.d;
                            }
                        } else if (zD) {
                            vunVar = vun.d;
                        }
                        vunVar = vun.c;
                    } else {
                        int iWidth = axfdVar2.d.c().width();
                        if (!zD ? iIntValue3 > iWidth / 2 : iIntValue3 < (-iWidth) / 2) {
                            vunVar = vun.c;
                        } else {
                            vunVar = vun.d;
                        }
                    }
                    vuvVarH = axfdVar2.H(vunVar, vunVar2);
                }
                return new vut(vuyVar, vuvVarH.a, vuvVarH.b);
            }
        }).S();
        this.f = avlhVarS;
        avlh avlhVarH = avlhVarS.H(new vup(0));
        vus vusVar = a;
        vusVar.getClass();
        avuu avuuVar = new avuu(vusVar);
        avnn avnnVar = atqp.j;
        avlh avlhVarI = avlh.J(avuuVar, awkvVarAI4, avlhVarH.H(new vup(2))).i(new vqh(5));
        avlh avlhVarD = vtmVar.d();
        avlh avlhVarB = vtmVar.b();
        axfdVar.getClass();
        this.e = avlh.I(avlh.f(avlhVarD, avlhVarB, new idi(19)).ae(awkvVarAI3, avlhVarB, new avnj() { // from class: vur
            @Override // defpackage.avnj
            public final Object a(Object obj, Object obj2, Object obj3) {
                agev agevVar = (agev) obj;
                vun vunVar = (vun) obj2;
                agkz agkzVar = (agkz) obj3;
                int i = vuu.h;
                if (!agevVar.g() || vunVar == vun.d) {
                    return (vunVar != vun.e || agkzVar.contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_WRAP_CONTENT)) ? agdf.a : agev.i(vus.a(axfdVar.E(agkzVar), null));
                }
                return agev.i(vus.a((vun) agevVar.c(), null));
            }
        }).x(new jna(18)).H(new tfk(20)), avlhVarI);
    }

    public final void a(vun vunVar) {
        this.i.kk(vus.a(vunVar, null));
    }

    public final void b(vun vunVar, avlh avlhVar) {
        this.i.kk(vus.a(vunVar, avlhVar));
    }
}
