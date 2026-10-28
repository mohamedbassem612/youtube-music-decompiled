package defpackage;

import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aav {
    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0163  */
    /* JADX WARN: Code duplicated, block: B:104:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0173  */
    /* JADX WARN: Code duplicated, block: B:110:0x0178  */
    /* JADX WARN: Code duplicated, block: B:111:0x017a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0180  */
    /* JADX WARN: Code duplicated, block: B:114:0x0187  */
    /* JADX WARN: Code duplicated, block: B:118:0x0192  */
    /* JADX WARN: Code duplicated, block: B:121:0x0198  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX WARN: Code duplicated, block: B:77:0x0106  */
    /* JADX WARN: Code duplicated, block: B:78:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x0148  */
    /* JADX WARN: Code duplicated, block: B:98:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    public static final long a(float f, float f2, float f3, float f4, alo aloVar) {
        int i;
        int i2;
        short s;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        short s2;
        int i10;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        short s3;
        int i18;
        float f5;
        float f6;
        if (aloVar.f()) {
            float f7 = f4 < 0.0f ? 0.0f : f4;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            float f8 = (f7 * 255.0f) + 0.5f;
            float f9 = f < 0.0f ? 0.0f : f;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i19 = ((int) ((f9 * 255.0f) + 0.5f)) << 16;
            float f10 = f2 < 0.0f ? 0.0f : f2;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            float f11 = (f10 * 255.0f) + 0.5f;
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            return ((long) ((((((int) f8) << 24) | i19) | (((int) f11) << 8)) | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
        }
        long j = aloVar.b;
        int i20 = aloVar.c;
        if (i20 == -1) {
            alh.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i21 = 0;
        float fB3 = aloVar.b(0);
        float fA3 = aloVar.a(0);
        if (f >= fB3) {
            fB3 = f;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i22 = iFloatToRawIntBits3 >> 13;
        int i23 = iFloatToRawIntBits3 & 8388607;
        int i24 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i25 = (iFloatToRawIntBits3 >>> 31) << 15;
        if (i24 == 255) {
            i2 = i23 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i24 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i26 = i22 & 1023;
                    if ((iFloatToRawIntBits3 & SemanticState.Obscured) != 0) {
                        s = (short) ((((i << 10) | i26) + 1) | i25);
                    } else {
                        i2 = i26;
                    }
                    fB = aloVar.b(1);
                    fA = aloVar.a(1);
                    if (f2 >= fB) {
                        fB = f2;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i3 = (iFloatToRawIntBits >>> 31) << 15;
                    i4 = (iFloatToRawIntBits >>> 23) & 255;
                    i5 = iFloatToRawIntBits >> 13;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i4 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i4 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i5 & 1023;
                                if ((iFloatToRawIntBits & SemanticState.Obscured) != 0) {
                                    s2 = (short) ((((i7 << 10) | i8) + 1) | i3);
                                } else {
                                    i9 = i8;
                                }
                                fB2 = aloVar.b(2);
                                fA2 = aloVar.a(2);
                                if (f3 >= fB2) {
                                    fB2 = f3;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                                i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i13 = iFloatToRawIntBits2 >> 13;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i12 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i21 = 31;
                                } else {
                                    i15 = i12 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i21 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i13 & 1023;
                                            if ((iFloatToRawIntBits2 & SemanticState.Obscured) != 0) {
                                                s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                            } else {
                                                i17 = i16;
                                                i21 = i15;
                                            }
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            if (f5 > 1.0f) {
                                                f6 = 1.0f;
                                            } else {
                                                f6 = f5;
                                            }
                                            return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                                        }
                                        if (i15 >= -10) {
                                            i18 = (i14 | 8388608) >> (1 - i15);
                                            if ((i18 & SemanticState.Obscured) != 0) {
                                                i18 += SemanticState.Multiline;
                                            }
                                            i17 = i18 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                s3 = (short) (i11 | (i21 << 10) | i17);
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                            }
                            if (i7 >= -10) {
                                i10 = (i6 | 8388608) >> (1 - i7);
                                if ((i10 & SemanticState.Obscured) != 0) {
                                    i10 += SemanticState.Multiline;
                                }
                                i9 = i10 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    s2 = (short) (i3 | (i7 << 10) | i9);
                    fB2 = aloVar.b(2);
                    fA2 = aloVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i13 = iFloatToRawIntBits2 >> 13;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i12 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i21 = 31;
                    } else {
                        i15 = i12 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i21 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i13 & 1023;
                                if ((iFloatToRawIntBits2 & SemanticState.Obscured) != 0) {
                                    s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                } else {
                                    i17 = i16;
                                    i21 = i15;
                                }
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                            }
                            if (i15 >= -10) {
                                i18 = (i14 | 8388608) >> (1 - i15);
                                if ((i18 & SemanticState.Obscured) != 0) {
                                    i18 += SemanticState.Multiline;
                                }
                                i17 = i18 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    s3 = (short) (i11 | (i21 << 10) | i17);
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                }
                if (i >= -10) {
                    int i27 = (i23 | 8388608) >> (1 - i);
                    if ((i27 & SemanticState.Obscured) != 0) {
                        i27 += SemanticState.Multiline;
                    }
                    i2 = i27 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        s = (short) (i25 | (i << 10) | i2);
        fB = aloVar.b(1);
        fA = aloVar.a(1);
        if (f2 >= fB) {
            fB = f2;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i3 = (iFloatToRawIntBits >>> 31) << 15;
        i4 = (iFloatToRawIntBits >>> 23) & 255;
        i5 = iFloatToRawIntBits >> 13;
        i6 = iFloatToRawIntBits & 8388607;
        if (i4 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i4 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i5 & 1023;
                    if ((iFloatToRawIntBits & SemanticState.Obscured) != 0) {
                        s2 = (short) ((((i7 << 10) | i8) + 1) | i3);
                    } else {
                        i9 = i8;
                    }
                    fB2 = aloVar.b(2);
                    fA2 = aloVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i13 = iFloatToRawIntBits2 >> 13;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i12 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i21 = 31;
                    } else {
                        i15 = i12 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i21 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i13 & 1023;
                                if ((iFloatToRawIntBits2 & SemanticState.Obscured) != 0) {
                                    s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                } else {
                                    i17 = i16;
                                    i21 = i15;
                                }
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                            }
                            if (i15 >= -10) {
                                i18 = (i14 | 8388608) >> (1 - i15);
                                if ((i18 & SemanticState.Obscured) != 0) {
                                    i18 += SemanticState.Multiline;
                                }
                                i17 = i18 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    s3 = (short) (i11 | (i21 << 10) | i17);
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                }
                if (i7 >= -10) {
                    i10 = (i6 | 8388608) >> (1 - i7);
                    if ((i10 & SemanticState.Obscured) != 0) {
                        i10 += SemanticState.Multiline;
                    }
                    i9 = i10 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        s2 = (short) (i3 | (i7 << 10) | i9);
        fB2 = aloVar.b(2);
        fA2 = aloVar.a(2);
        if (f3 >= fB2) {
            fB2 = f3;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i11 = (iFloatToRawIntBits2 >>> 31) << 15;
        i12 = (iFloatToRawIntBits2 >>> 23) & 255;
        i13 = iFloatToRawIntBits2 >> 13;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i12 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i21 = 31;
        } else {
            i15 = i12 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i21 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i13 & 1023;
                    if ((iFloatToRawIntBits2 & SemanticState.Obscured) != 0) {
                        s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                    } else {
                        i17 = i16;
                        i21 = i15;
                    }
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                }
                if (i15 >= -10) {
                    i18 = (i14 | 8388608) >> (1 - i15);
                    if ((i18 & SemanticState.Obscured) != 0) {
                        i18 += SemanticState.Multiline;
                    }
                    i17 = i18 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        s3 = (short) (i11 | (i21 << 10) | i17);
        if (f4 >= 0.0f) {
        }
        if (f5 > 1.0f) {
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
    }

    public static boolean b(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final awns c(SparseBooleanArray sparseBooleanArray) {
        sparseBooleanArray.getClass();
        return new axu(sparseBooleanArray);
    }
}
