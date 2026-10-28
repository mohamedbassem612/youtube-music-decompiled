package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiiz {
    public static final aiiz a = new aiiz();
    private final ConcurrentMap b = new ConcurrentHashMap();

    private aiiz() {
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:193:0x0402  */
    private aijg c(Class cls) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int iCharAt4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        aijg aiiuVar;
        int i14;
        int i15;
        Object[] objArr;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        int i19;
        Field fieldF;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldF2;
        int i25;
        Object obj2;
        Field fieldF3;
        int i26;
        char cCharAt9;
        int i27;
        int i28;
        char cCharAt10;
        int i29;
        int i30;
        char cCharAt11;
        int i31;
        int i32;
        char cCharAt12;
        if (!aihn.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            aiiq aiiqVar = (aiiq) aihn.getDefaultInstance(cls.asSubclass(aihn.class)).buildMessageInfo();
            if (aiiqVar.b()) {
                aiiuVar = new aiiv(aijh.a, aiiqVar.a());
            } else {
                aijs aijsVar = aijh.a;
                ahng ahngVar = aiiqVar.c() + (-1) != 1 ? aigy.a : null;
                Unsafe unsafe = aiiu.b;
                if (unsafe == null) {
                    throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                }
                if (!(aiiqVar instanceof aijb)) {
                    throw null;
                }
                aijb aijbVar = (aijb) aiiqVar;
                String str = aijbVar.b;
                int length = str.length();
                int iCharAt5 = 0;
                if (str.charAt(0) >= 55296) {
                    int i33 = 1;
                    while (true) {
                        i = i33 + 1;
                        if (str.charAt(i33) < 55296) {
                            break;
                        }
                        i33 = i;
                    }
                } else {
                    i = 1;
                }
                int i34 = i + 1;
                int iCharAt6 = str.charAt(i);
                if (iCharAt6 >= 55296) {
                    int i35 = iCharAt6 & 8191;
                    int i36 = 13;
                    while (true) {
                        i32 = i34 + 1;
                        cCharAt12 = str.charAt(i34);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i35 |= (cCharAt12 & 8191) << i36;
                        i36 += 13;
                        i34 = i32;
                    }
                    iCharAt6 = i35 | (cCharAt12 << i36);
                    i34 = i32;
                }
                if (iCharAt6 == 0) {
                    iArr = aiiu.a;
                    i6 = 0;
                    iCharAt4 = 0;
                    iCharAt = 0;
                    iCharAt2 = 0;
                    iCharAt3 = 0;
                    i5 = 0;
                } else {
                    int i37 = i34 + 1;
                    int iCharAt7 = str.charAt(i34);
                    if (iCharAt7 >= 55296) {
                        int i38 = iCharAt7 & 8191;
                        int i39 = 13;
                        while (true) {
                            i13 = i37 + 1;
                            cCharAt7 = str.charAt(i37);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i38 |= (cCharAt7 & 8191) << i39;
                            i39 += 13;
                            i37 = i13;
                        }
                        iCharAt7 = i38 | (cCharAt7 << i39);
                        i37 = i13;
                    }
                    int i40 = i37 + 1;
                    int iCharAt8 = str.charAt(i37);
                    if (iCharAt8 >= 55296) {
                        int i41 = iCharAt8 & 8191;
                        int i42 = 13;
                        while (true) {
                            i12 = i40 + 1;
                            cCharAt6 = str.charAt(i40);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i41 |= (cCharAt6 & 8191) << i42;
                            i42 += 13;
                            i40 = i12;
                        }
                        iCharAt8 = i41 | (cCharAt6 << i42);
                        i40 = i12;
                    }
                    int i43 = i40 + 1;
                    iCharAt = str.charAt(i40);
                    if (iCharAt >= 55296) {
                        int i44 = iCharAt & 8191;
                        int i45 = 13;
                        while (true) {
                            i11 = i43 + 1;
                            cCharAt5 = str.charAt(i43);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i44 |= (cCharAt5 & 8191) << i45;
                            i45 += 13;
                            i43 = i11;
                        }
                        iCharAt = i44 | (cCharAt5 << i45);
                        i43 = i11;
                    }
                    int i46 = i43 + 1;
                    iCharAt2 = str.charAt(i43);
                    if (iCharAt2 >= 55296) {
                        int i47 = iCharAt2 & 8191;
                        int i48 = 13;
                        while (true) {
                            i10 = i46 + 1;
                            cCharAt4 = str.charAt(i46);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i47 |= (cCharAt4 & 8191) << i48;
                            i48 += 13;
                            i46 = i10;
                        }
                        iCharAt2 = i47 | (cCharAt4 << i48);
                        i46 = i10;
                    }
                    int i49 = i46 + 1;
                    iCharAt3 = str.charAt(i46);
                    if (iCharAt3 >= 55296) {
                        int i50 = iCharAt3 & 8191;
                        int i51 = i49;
                        int i52 = 13;
                        while (true) {
                            i9 = i51 + 1;
                            cCharAt3 = str.charAt(i51);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i50 |= (cCharAt3 & 8191) << i52;
                            i52 += 13;
                            i51 = i9;
                        }
                        iCharAt3 = i50 | (cCharAt3 << i52);
                        i2 = i9;
                    } else {
                        i2 = i49;
                    }
                    int i53 = i2 + 1;
                    iCharAt5 = str.charAt(i2);
                    if (iCharAt5 >= 55296) {
                        int i54 = iCharAt5 & 8191;
                        int i55 = i53;
                        int i56 = 13;
                        while (true) {
                            i8 = i55 + 1;
                            cCharAt2 = str.charAt(i55);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i54 |= (cCharAt2 & 8191) << i56;
                            i56 += 13;
                            i55 = i8;
                        }
                        iCharAt5 = i54 | (cCharAt2 << i56);
                        i3 = i8;
                    } else {
                        i3 = i53;
                    }
                    int i57 = i3 + 1;
                    if (str.charAt(i3) >= 55296) {
                        do {
                            i4 = i57;
                            i57 = i4 + 1;
                        } while (str.charAt(i4) >= 55296);
                    }
                    int i58 = i57;
                    int i59 = i58 + 1;
                    iCharAt4 = str.charAt(i58);
                    if (iCharAt4 >= 55296) {
                        int i60 = iCharAt4 & 8191;
                        int i61 = i59;
                        int i62 = 13;
                        while (true) {
                            i7 = i61 + 1;
                            cCharAt = str.charAt(i61);
                            if (cCharAt < 55296) {
                                break;
                            }
                            i60 |= (cCharAt & 8191) << i62;
                            i62 += 13;
                            i61 = i7;
                        }
                        iCharAt4 = i60 | (cCharAt << i62);
                        i59 = i7;
                    }
                    i5 = (iCharAt7 << 1) + iCharAt8;
                    iArr = new int[iCharAt4 + iCharAt5 + iCharAt7];
                    i6 = iCharAt7;
                    i34 = i59;
                }
                Object[] objArr2 = aijbVar.c;
                int i63 = i34;
                MessageLite messageLite = aijbVar.a;
                Class<?> cls2 = messageLite.getClass();
                int i64 = iCharAt5 + iCharAt4;
                int i65 = i6;
                int i66 = iCharAt3 << 1;
                int[] iArr2 = new int[iCharAt3 * 3];
                Object[] objArr3 = new Object[i66];
                int i67 = i64;
                int i68 = iCharAt4;
                int i69 = i63;
                int i70 = 0;
                int i71 = 0;
                while (i69 < length) {
                    int i72 = i69 + 1;
                    int iCharAt9 = str.charAt(i69);
                    int i73 = length;
                    if (iCharAt9 >= 55296) {
                        int i74 = iCharAt9 & 8191;
                        int i75 = i72;
                        int i76 = 13;
                        while (true) {
                            i30 = i75 + 1;
                            cCharAt11 = str.charAt(i75);
                            i31 = i74;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i74 = i31 | ((cCharAt11 & 8191) << i76);
                            i76 += 13;
                            i75 = i30;
                        }
                        iCharAt9 = i31 | (cCharAt11 << i76);
                        i14 = i30;
                    } else {
                        i14 = i72;
                    }
                    int i77 = i14 + 1;
                    int iCharAt10 = str.charAt(i14);
                    int i78 = iCharAt9;
                    if (iCharAt10 >= 55296) {
                        int i79 = iCharAt10 & 8191;
                        int i80 = i77;
                        int i81 = 13;
                        while (true) {
                            i28 = i80 + 1;
                            cCharAt10 = str.charAt(i80);
                            i29 = i79;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i79 = i29 | ((cCharAt10 & 8191) << i81);
                            i81 += 13;
                            i80 = i28;
                        }
                        iCharAt10 = i29 | (cCharAt10 << i81);
                        i15 = i28;
                    } else {
                        i15 = i77;
                    }
                    int i82 = i64;
                    if ((iCharAt10 & SemanticState.ReadOnly) != 0) {
                        iArr[i70] = i71;
                        i70++;
                    }
                    int i83 = iCharAt10 & 255;
                    MessageLite messageLite2 = messageLite;
                    int i84 = iCharAt10 & SemanticState.Modal;
                    if (i83 >= 51) {
                        int i85 = i15 + 1;
                        int iCharAt11 = str.charAt(i15);
                        if (iCharAt11 >= 55296) {
                            int i86 = iCharAt11 & 8191;
                            int i87 = i85;
                            int i88 = 13;
                            while (true) {
                                i26 = i87 + 1;
                                cCharAt9 = str.charAt(i87);
                                i27 = i86;
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i86 = i27 | ((cCharAt9 & 8191) << i88);
                                i88 += 13;
                                i87 = i26;
                            }
                            iCharAt11 = i27 | (cCharAt9 << i88);
                            i22 = i26;
                        } else {
                            i22 = i85;
                        }
                        int i89 = iCharAt11;
                        int i90 = i83 - 51;
                        i17 = i22;
                        if (i90 == 9 || i90 == 17) {
                            i23 = i5 + 1;
                            objArr3[((i71 / 3) << 1) + 1] = objArr2[i5];
                        } else {
                            if (i90 == 12) {
                                if (aijbVar.c() == 1 || i84 != 0) {
                                    i23 = i5 + 1;
                                    objArr3[((i71 / 3) << 1) + 1] = objArr2[i5];
                                } else {
                                    i84 = 0;
                                }
                            }
                            i24 = i89 << 1;
                            obj = objArr2[i24];
                            if (obj instanceof Field) {
                                fieldF2 = (Field) obj;
                            } else {
                                fieldF2 = aiiu.f(cls2, (String) obj);
                                objArr2[i24] = fieldF2;
                                iArr[i67] = i71;
                                i67++;
                            }
                            objArr = objArr2;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                            i25 = i24 + 1;
                            obj2 = objArr[i25];
                            if (obj2 instanceof Field) {
                                fieldF3 = (Field) obj2;
                            } else {
                                fieldF3 = aiiu.f(cls2, (String) obj2);
                                objArr[i25] = fieldF3;
                            }
                            iArr = iArr;
                            i16 = i84;
                            i19 = 0;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                            i18 = iObjectFieldOffset3;
                        }
                        i5 = i23;
                        i24 = i89 << 1;
                        obj = objArr2[i24];
                        if (obj instanceof Field) {
                            fieldF2 = (Field) obj;
                        } else {
                            fieldF2 = aiiu.f(cls2, (String) obj);
                            objArr2[i24] = fieldF2;
                            iArr[i67] = i71;
                            i67++;
                        }
                        objArr = objArr2;
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF2);
                        i25 = i24 + 1;
                        obj2 = objArr[i25];
                        if (obj2 instanceof Field) {
                            fieldF3 = (Field) obj2;
                        } else {
                            fieldF3 = aiiu.f(cls2, (String) obj2);
                            objArr[i25] = fieldF3;
                        }
                        iArr = iArr;
                        i16 = i84;
                        i19 = 0;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                        i18 = iObjectFieldOffset4;
                    } else {
                        objArr = objArr2;
                        int i91 = i5 + 1;
                        Field fieldF4 = aiiu.f(cls2, (String) objArr[i5]);
                        if (i83 == 9 || i83 == 17) {
                            objArr3[((i71 / 3) << 1) + 1] = fieldF4.getType();
                        } else {
                            if (i83 != 27) {
                                if (i83 == 49) {
                                    i5 += 2;
                                    i21 = 1;
                                } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                                    iArr = iArr;
                                    if (aijbVar.c() == 1 || i84 != 0) {
                                        i5 += 2;
                                        objArr3[((i71 / 3) << 1) + 1] = objArr[i91];
                                        i16 = i84;
                                    } else {
                                        i5 = i91;
                                        i16 = 0;
                                    }
                                } else if (i83 == 50) {
                                    int i92 = i5 + 2;
                                    i68++;
                                    iArr[i68] = i71;
                                    int i93 = (i71 / 3) << 1;
                                    objArr3[i93] = objArr[i91];
                                    if (i84 != 0) {
                                        i5 += 3;
                                        objArr3[i93 + 1] = objArr[i92];
                                        i16 = i84;
                                    } else {
                                        i5 = i92;
                                        i16 = 0;
                                    }
                                    iArr = iArr;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt10 & SemanticState.Obscured) != 0 || i83 > 17) {
                                    i17 = i15;
                                    i18 = iObjectFieldOffset;
                                    i19 = 0;
                                } else {
                                    int i94 = i15 + 1;
                                    int iCharAt12 = str.charAt(i15);
                                    if (iCharAt12 >= 55296) {
                                        int i95 = iCharAt12 & 8191;
                                        int i96 = 13;
                                        while (true) {
                                            i20 = i94 + 1;
                                            cCharAt8 = str.charAt(i94);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i95 |= (cCharAt8 & 8191) << i96;
                                            i96 += 13;
                                            i94 = i20;
                                        }
                                        iCharAt12 = i95 | (cCharAt8 << i96);
                                        i94 = i20;
                                    }
                                    int i97 = (i65 << 1) + (iCharAt12 / 32);
                                    Object obj3 = objArr[i97];
                                    if (obj3 instanceof Field) {
                                        fieldF = (Field) obj3;
                                    } else {
                                        fieldF = aiiu.f(cls2, (String) obj3);
                                        objArr[i97] = fieldF;
                                    }
                                    i19 = iCharAt12 % 32;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                                    i18 = iObjectFieldOffset;
                                    i17 = i94;
                                }
                            } else {
                                i21 = 1;
                                i5 += 2;
                            }
                            objArr3[((i71 / 3) << i21) + i21] = objArr[i91];
                            i16 = i84;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & SemanticState.Obscured) != 0) {
                                i17 = i15;
                                i18 = iObjectFieldOffset;
                                i19 = 0;
                            } else {
                                i17 = i15;
                                i18 = iObjectFieldOffset;
                                i19 = 0;
                            }
                        }
                        i16 = i84;
                        i5 = i91;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & SemanticState.Obscured) != 0) {
                            i17 = i15;
                            i18 = iObjectFieldOffset;
                            i19 = 0;
                        } else {
                            i17 = i15;
                            i18 = iObjectFieldOffset;
                            i19 = 0;
                        }
                    }
                    int i98 = i71 + 1;
                    iArr2[i71] = i78;
                    int i99 = i71 + 2;
                    iArr2[i98] = ((iCharAt10 & SemanticState.LiveRegion) != 0 ? 536870912 : 0) | ((iCharAt10 & SemanticState.Hidden) != 0 ? 268435456 : 0) | (i16 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i18;
                    i71 += 3;
                    iArr2[i99] = (i19 << 20) | iObjectFieldOffset2;
                    i64 = i82;
                    length = i73;
                    messageLite = messageLite2;
                    iArr = iArr;
                    str = str;
                    i69 = i17;
                    objArr2 = objArr;
                }
                aiiuVar = new aiiu(iArr2, objArr3, iCharAt, iCharAt2, messageLite, iArr, iCharAt4, i64, aijsVar, ahngVar);
            }
            aijg aijgVar = (aijg) this.b.putIfAbsent(cls, aiiuVar);
            return aijgVar != null ? aijgVar : aiiuVar;
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    final aijg a(aihn aihnVar) {
        return b(aihnVar.getClass());
    }

    public final aijg b(Class cls) {
        Object obj = this.b.get(cls);
        return obj == null ? c(cls) : (aijg) obj;
    }
}
