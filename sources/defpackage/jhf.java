package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jhf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Object e;

    private jhf(int i, String str, int i2, int i3, int i4) {
        this.a = i;
        this.e = str;
        this.c = i2;
        this.b = i3;
        this.d = i4;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2 A[Catch: RuntimeException -> 0x0203, TryCatch #0 {RuntimeException -> 0x0203, blocks: (B:3:0x0005, B:5:0x0017, B:7:0x0023, B:13:0x0048, B:16:0x0062, B:18:0x0093, B:19:0x00a0, B:21:0x00aa, B:22:0x00c0, B:24:0x00c6, B:25:0x00d8, B:27:0x00e1, B:29:0x00e9, B:30:0x00fb, B:32:0x0108, B:33:0x011a, B:35:0x0120, B:36:0x0132, B:38:0x0138, B:39:0x014a, B:41:0x0152, B:43:0x015b, B:44:0x015e, B:45:0x0161, B:47:0x0177, B:48:0x017a, B:50:0x0184, B:51:0x0187, B:53:0x018d, B:59:0x019e, B:60:0x01a1, B:63:0x01ac, B:65:0x01b2, B:69:0x01bc, B:71:0x01c2, B:72:0x01ce, B:82:0x01ed, B:86:0x01f8, B:81:0x01e9, B:55:0x0193, B:57:0x0199), top: B:92:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce A[Catch: RuntimeException -> 0x0203, TryCatch #0 {RuntimeException -> 0x0203, blocks: (B:3:0x0005, B:5:0x0017, B:7:0x0023, B:13:0x0048, B:16:0x0062, B:18:0x0093, B:19:0x00a0, B:21:0x00aa, B:22:0x00c0, B:24:0x00c6, B:25:0x00d8, B:27:0x00e1, B:29:0x00e9, B:30:0x00fb, B:32:0x0108, B:33:0x011a, B:35:0x0120, B:36:0x0132, B:38:0x0138, B:39:0x014a, B:41:0x0152, B:43:0x015b, B:44:0x015e, B:45:0x0161, B:47:0x0177, B:48:0x017a, B:50:0x0184, B:51:0x0187, B:53:0x018d, B:59:0x019e, B:60:0x01a1, B:63:0x01ac, B:65:0x01b2, B:69:0x01bc, B:71:0x01c2, B:72:0x01ce, B:82:0x01ed, B:86:0x01f8, B:81:0x01e9, B:55:0x0193, B:57:0x0199), top: B:92:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6  */
    public static jhf a(byte[] bArr) throws bsz {
        boolean z;
        int i;
        int i2;
        int i3;
        jhf jhfVar;
        try {
            dqp dqpVar = new dqp(bArr, (byte[]) null);
            dqpVar.r();
            int i4 = dqpVar.i(7);
            if (i4 != 1) {
                bvx.e("Av1Config", a.bR(i4, "Unsupported av1C version: "));
                return null;
            }
            int i5 = dqpVar.i(3);
            int i6 = dqpVar.i(5);
            boolean zU = dqpVar.u();
            int i7 = dqpVar.u() ? true != dqpVar.u() ? 10 : 12 : 8;
            int i8 = 13;
            dqpVar.s(13);
            String str = "av01." + i5 + '.' + bwp.K("%02d", Integer.valueOf(i6)) + (true != zU ? "M" : "H") + '.' + bwp.K("%02d", Integer.valueOf(i7));
            if (dqpVar.f() <= 0) {
                jhfVar = new jhf(i7, str, -1, -1, -1);
            } else {
                dqpVar.r();
                int i9 = dqpVar.i(4);
                if (i9 != 1) {
                    bvx.h(a.bR(i9, "Unsupported obu_type: "));
                    jhfVar = new jhf(i7, str, -1, -1, -1);
                } else if (dqpVar.u()) {
                    bvx.h("Unsupported obu_extension_flag");
                    jhfVar = new jhf(i7, str, -1, -1, -1);
                } else {
                    boolean zU2 = dqpVar.u();
                    dqpVar.r();
                    if (!zU2 || dqpVar.i(8) <= 127) {
                        int i10 = dqpVar.i(3);
                        dqpVar.r();
                        if (dqpVar.u()) {
                            bvx.h("Unsupported reduced_still_picture_header");
                            jhfVar = new jhf(i7, str, -1, -1, -1);
                        } else if (dqpVar.u()) {
                            bvx.h("Unsupported timing_info_present_flag");
                            jhfVar = new jhf(i7, str, -1, -1, -1);
                        } else if (dqpVar.u()) {
                            bvx.h("Unsupported initial_display_delay_present_flag");
                            jhfVar = new jhf(i7, str, -1, -1, -1);
                        } else {
                            int i11 = dqpVar.i(5);
                            for (int i12 = 0; i12 <= i11; i12++) {
                                dqpVar.s(12);
                                if (dqpVar.i(5) > 7) {
                                    dqpVar.r();
                                }
                            }
                            int i13 = dqpVar.i(4);
                            int i14 = dqpVar.i(4);
                            dqpVar.s(i13 + 1);
                            dqpVar.s(i14 + 1);
                            if (dqpVar.u()) {
                                dqpVar.s(7);
                            }
                            dqpVar.s(7);
                            boolean zU3 = dqpVar.u();
                            if (zU3) {
                                dqpVar.s(2);
                            }
                            if ((dqpVar.u() || dqpVar.i(1) > 0) && !dqpVar.u()) {
                                dqpVar.s(1);
                            }
                            if (zU3) {
                                dqpVar.s(3);
                            }
                            dqpVar.s(3);
                            boolean zU4 = dqpVar.u();
                            if (i10 != 2) {
                                if (i10 == 1) {
                                    z = false;
                                }
                                if (dqpVar.u()) {
                                    int i15 = dqpVar.i(8);
                                    i = dqpVar.i(8);
                                    int i16 = dqpVar.i(8);
                                    if (!z || i15 != 1) {
                                        i8 = i;
                                    } else if (i == 13) {
                                        i15 = 1;
                                        if (i16 == 0) {
                                            i2 = 1;
                                        }
                                        int iA = bru.a(i15);
                                        if (i2 == 1) {
                                            i3 = 1;
                                        } else {
                                            i3 = 2;
                                        }
                                        jhfVar = new jhf(i7, str, iA, i3, bru.b(i8));
                                    } else {
                                        i8 = i;
                                        i15 = 1;
                                    }
                                    i2 = dqpVar.i(1);
                                    int iA2 = bru.a(i15);
                                    if (i2 == 1) {
                                        i3 = 1;
                                    } else {
                                        i3 = 2;
                                    }
                                    jhfVar = new jhf(i7, str, iA2, i3, bru.b(i8));
                                } else {
                                    jhfVar = new jhf(i7, str, -1, -1, -1);
                                }
                            } else if (zU4) {
                                dqpVar.r();
                            }
                            if (dqpVar.u()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (dqpVar.u()) {
                                jhfVar = new jhf(i7, str, -1, -1, -1);
                            } else {
                                int i17 = dqpVar.i(8);
                                i = dqpVar.i(8);
                                int i18 = dqpVar.i(8);
                                if (!z) {
                                    i8 = i;
                                    i2 = dqpVar.i(1);
                                } else {
                                    i8 = i;
                                    i2 = dqpVar.i(1);
                                }
                                int iA3 = bru.a(i17);
                                if (i2 == 1) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                jhfVar = new jhf(i7, str, iA3, i3, bru.b(i8));
                            }
                        }
                    } else {
                        bvx.h("Excessive obu_size");
                        jhfVar = new jhf(i7, str, -1, -1, -1);
                    }
                }
            }
            return jhfVar;
        } catch (RuntimeException e) {
            throw new bsz("Error parsing AV1 config", e, true, 1);
        }
    }

    public jhf(oh ohVar, int i, int i2, int i3, int i4) {
        this.e = ohVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
