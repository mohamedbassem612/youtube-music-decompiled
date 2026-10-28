package defpackage;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvs {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final dep o;

    private cvs(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, dep depVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = depVar;
    }

    /* JADX WARN: Code duplicated, block: B:548:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:549:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:579:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f8 A[Catch: ArrayIndexOutOfBoundsException -> 0x0abb, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x0abb, blocks: (B:8:0x000f, B:18:0x0040, B:20:0x0064, B:22:0x0076, B:25:0x0090, B:30:0x00d1, B:31:0x00dd, B:40:0x0113, B:44:0x011b, B:48:0x0149, B:50:0x014f, B:51:0x0159, B:52:0x015e, B:53:0x0161, B:55:0x0167, B:57:0x0172, B:58:0x0175, B:60:0x017f, B:62:0x0184, B:79:0x01c8, B:81:0x01ce, B:83:0x01d4, B:88:0x01ea, B:92:0x01f8, B:94:0x0200, B:95:0x0206, B:96:0x020c, B:97:0x020f, B:87:0x01e2, B:86:0x01df, B:98:0x0214, B:65:0x0193, B:69:0x01a4, B:71:0x01aa, B:73:0x01b4, B:75:0x01bb, B:76:0x01bf, B:100:0x021e, B:102:0x0224, B:537:0x0a79, B:103:0x0232, B:105:0x024b, B:107:0x0253, B:108:0x0255, B:110:0x025c, B:112:0x0262, B:113:0x026b, B:115:0x026f, B:116:0x0279, B:122:0x0283, B:123:0x0292, B:124:0x0295, B:125:0x0299, B:129:0x02bd, B:134:0x02cc, B:137:0x02fa, B:136:0x02e1, B:130:0x02c5, B:138:0x02fd, B:140:0x0305, B:143:0x0314, B:147:0x031b, B:148:0x0324, B:149:0x0326, B:153:0x0330, B:155:0x033c, B:158:0x0348, B:156:0x0341, B:159:0x034f, B:162:0x035b, B:164:0x0360, B:165:0x0369, B:168:0x0370, B:169:0x037d, B:171:0x0386, B:173:0x0394, B:175:0x0399, B:176:0x03b1, B:178:0x03c4, B:181:0x03cf, B:187:0x03e3, B:188:0x03eb, B:192:0x0417, B:193:0x0426, B:200:0x0434, B:202:0x043a, B:204:0x0440, B:205:0x0445, B:206:0x0448, B:207:0x044d, B:208:0x0450, B:212:0x045c, B:213:0x0465, B:216:0x0470, B:218:0x0476, B:219:0x0478, B:222:0x047e, B:223:0x0486, B:227:0x0495, B:232:0x04b2, B:234:0x04b6, B:235:0x04cb, B:236:0x04d6, B:240:0x04e1, B:242:0x04e6, B:244:0x04ec, B:246:0x04f5, B:248:0x04fc, B:250:0x0510, B:252:0x0516, B:253:0x0524, B:255:0x052f, B:256:0x0537, B:258:0x0557, B:260:0x0562, B:283:0x05ae, B:267:0x0584, B:271:0x058f, B:282:0x05a8, B:284:0x05b7, B:289:0x05dc, B:291:0x05e0, B:293:0x05f4, B:294:0x05fa, B:296:0x05ff, B:298:0x0607, B:301:0x060f, B:303:0x0613, B:305:0x0619, B:308:0x0620, B:311:0x0625, B:315:0x062c, B:317:0x0645, B:319:0x0654, B:321:0x0668, B:324:0x0676, B:328:0x0680, B:329:0x0687, B:331:0x0691, B:322:0x066f, B:332:0x069a, B:334:0x06a5, B:336:0x06ab, B:337:0x06ae, B:340:0x06be, B:341:0x06c6, B:343:0x06d5, B:345:0x06e5, B:347:0x06ef, B:348:0x06f2, B:350:0x0707, B:352:0x070d, B:356:0x072b, B:359:0x0736, B:362:0x074c, B:364:0x0752, B:366:0x075c, B:370:0x0771, B:372:0x0782, B:374:0x0788, B:375:0x078b, B:378:0x0791, B:379:0x0796, B:383:0x079e, B:389:0x07ab, B:391:0x07af, B:393:0x07b5, B:394:0x07b8, B:395:0x07bb, B:396:0x07c1, B:397:0x07c4, B:398:0x07c7, B:400:0x07d5, B:410:0x07ee, B:412:0x07f5, B:413:0x07fd, B:415:0x0803, B:417:0x080c, B:420:0x0815, B:440:0x084d, B:442:0x0853, B:444:0x085e, B:446:0x0867, B:450:0x0876, B:456:0x089e, B:457:0x08a8, B:459:0x08b3, B:426:0x0825, B:429:0x082b, B:432:0x0833, B:435:0x083b, B:437:0x0842, B:438:0x0847, B:439:0x084a, B:419:0x0812, B:405:0x07df, B:407:0x07e5, B:408:0x07e8, B:409:0x07eb, B:369:0x0768, B:228:0x04a1, B:184:0x03dc, B:460:0x08c3, B:461:0x08cc, B:462:0x08d7, B:470:0x090c, B:472:0x0938, B:480:0x0987, B:481:0x098d, B:484:0x0995, B:531:0x0a57, B:487:0x099c, B:488:0x09a5, B:490:0x09ab, B:493:0x09b6, B:494:0x09bd, B:496:0x09c5, B:497:0x09cc, B:499:0x09cf, B:503:0x09d9, B:505:0x09e3, B:507:0x09e9, B:509:0x09f2, B:512:0x0a04, B:514:0x0a14, B:516:0x0a19, B:519:0x0a24, B:521:0x0a34, B:520:0x0a2c, B:522:0x0a37, B:524:0x0a3d, B:525:0x0a42, B:513:0x0a0c, B:526:0x0a45, B:527:0x0a4b, B:538:0x0a98, B:541:0x0aa9, B:543:0x0ab0, B:542:0x0aac, B:7:0x000c), top: B:554:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0200 A[Catch: ArrayIndexOutOfBoundsException -> 0x0abb, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x0abb, blocks: (B:8:0x000f, B:18:0x0040, B:20:0x0064, B:22:0x0076, B:25:0x0090, B:30:0x00d1, B:31:0x00dd, B:40:0x0113, B:44:0x011b, B:48:0x0149, B:50:0x014f, B:51:0x0159, B:52:0x015e, B:53:0x0161, B:55:0x0167, B:57:0x0172, B:58:0x0175, B:60:0x017f, B:62:0x0184, B:79:0x01c8, B:81:0x01ce, B:83:0x01d4, B:88:0x01ea, B:92:0x01f8, B:94:0x0200, B:95:0x0206, B:96:0x020c, B:97:0x020f, B:87:0x01e2, B:86:0x01df, B:98:0x0214, B:65:0x0193, B:69:0x01a4, B:71:0x01aa, B:73:0x01b4, B:75:0x01bb, B:76:0x01bf, B:100:0x021e, B:102:0x0224, B:537:0x0a79, B:103:0x0232, B:105:0x024b, B:107:0x0253, B:108:0x0255, B:110:0x025c, B:112:0x0262, B:113:0x026b, B:115:0x026f, B:116:0x0279, B:122:0x0283, B:123:0x0292, B:124:0x0295, B:125:0x0299, B:129:0x02bd, B:134:0x02cc, B:137:0x02fa, B:136:0x02e1, B:130:0x02c5, B:138:0x02fd, B:140:0x0305, B:143:0x0314, B:147:0x031b, B:148:0x0324, B:149:0x0326, B:153:0x0330, B:155:0x033c, B:158:0x0348, B:156:0x0341, B:159:0x034f, B:162:0x035b, B:164:0x0360, B:165:0x0369, B:168:0x0370, B:169:0x037d, B:171:0x0386, B:173:0x0394, B:175:0x0399, B:176:0x03b1, B:178:0x03c4, B:181:0x03cf, B:187:0x03e3, B:188:0x03eb, B:192:0x0417, B:193:0x0426, B:200:0x0434, B:202:0x043a, B:204:0x0440, B:205:0x0445, B:206:0x0448, B:207:0x044d, B:208:0x0450, B:212:0x045c, B:213:0x0465, B:216:0x0470, B:218:0x0476, B:219:0x0478, B:222:0x047e, B:223:0x0486, B:227:0x0495, B:232:0x04b2, B:234:0x04b6, B:235:0x04cb, B:236:0x04d6, B:240:0x04e1, B:242:0x04e6, B:244:0x04ec, B:246:0x04f5, B:248:0x04fc, B:250:0x0510, B:252:0x0516, B:253:0x0524, B:255:0x052f, B:256:0x0537, B:258:0x0557, B:260:0x0562, B:283:0x05ae, B:267:0x0584, B:271:0x058f, B:282:0x05a8, B:284:0x05b7, B:289:0x05dc, B:291:0x05e0, B:293:0x05f4, B:294:0x05fa, B:296:0x05ff, B:298:0x0607, B:301:0x060f, B:303:0x0613, B:305:0x0619, B:308:0x0620, B:311:0x0625, B:315:0x062c, B:317:0x0645, B:319:0x0654, B:321:0x0668, B:324:0x0676, B:328:0x0680, B:329:0x0687, B:331:0x0691, B:322:0x066f, B:332:0x069a, B:334:0x06a5, B:336:0x06ab, B:337:0x06ae, B:340:0x06be, B:341:0x06c6, B:343:0x06d5, B:345:0x06e5, B:347:0x06ef, B:348:0x06f2, B:350:0x0707, B:352:0x070d, B:356:0x072b, B:359:0x0736, B:362:0x074c, B:364:0x0752, B:366:0x075c, B:370:0x0771, B:372:0x0782, B:374:0x0788, B:375:0x078b, B:378:0x0791, B:379:0x0796, B:383:0x079e, B:389:0x07ab, B:391:0x07af, B:393:0x07b5, B:394:0x07b8, B:395:0x07bb, B:396:0x07c1, B:397:0x07c4, B:398:0x07c7, B:400:0x07d5, B:410:0x07ee, B:412:0x07f5, B:413:0x07fd, B:415:0x0803, B:417:0x080c, B:420:0x0815, B:440:0x084d, B:442:0x0853, B:444:0x085e, B:446:0x0867, B:450:0x0876, B:456:0x089e, B:457:0x08a8, B:459:0x08b3, B:426:0x0825, B:429:0x082b, B:432:0x0833, B:435:0x083b, B:437:0x0842, B:438:0x0847, B:439:0x084a, B:419:0x0812, B:405:0x07df, B:407:0x07e5, B:408:0x07e8, B:409:0x07eb, B:369:0x0768, B:228:0x04a1, B:184:0x03dc, B:460:0x08c3, B:461:0x08cc, B:462:0x08d7, B:470:0x090c, B:472:0x0938, B:480:0x0987, B:481:0x098d, B:484:0x0995, B:531:0x0a57, B:487:0x099c, B:488:0x09a5, B:490:0x09ab, B:493:0x09b6, B:494:0x09bd, B:496:0x09c5, B:497:0x09cc, B:499:0x09cf, B:503:0x09d9, B:505:0x09e3, B:507:0x09e9, B:509:0x09f2, B:512:0x0a04, B:514:0x0a14, B:516:0x0a19, B:519:0x0a24, B:521:0x0a34, B:520:0x0a2c, B:522:0x0a37, B:524:0x0a3d, B:525:0x0a42, B:513:0x0a0c, B:526:0x0a45, B:527:0x0a4b, B:538:0x0a98, B:541:0x0aa9, B:543:0x0ab0, B:542:0x0aac, B:7:0x000c), top: B:554:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v66 */
    public static cvs a(bwb bwbVar, boolean z, dep depVar) {
        ?? r15;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        dep depVar2;
        int i7;
        amp ampVar;
        int i8;
        int i9;
        dep depVar3;
        int[] iArr;
        int i10;
        int i11;
        eol eolVar;
        int iA;
        int iA2;
        int iA3;
        int i12;
        agke agkeVar;
        int i13;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        boolean z2;
        int i14;
        boolean zG;
        int i15;
        int i16;
        int iB;
        int i17;
        int i18;
        int i19;
        bwb bwbVar2 = bwbVar;
        int i20 = 4;
        if (z) {
            try {
                bwbVar2.Q(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                r15 = 1;
                if (r15 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw new bsz("Error parsing".concat(str), e, r15, r15);
            }
        } else {
            try {
                bwbVar2.Q(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                r15 = 1;
                if (r15 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw new bsz("Error parsing".concat(str), e, r15, r15);
            }
        }
        int iN = bwbVar2.n() & 3;
        int iN2 = bwbVar2.n();
        int i21 = bwbVar2.c;
        int i22 = 0;
        int i23 = 0;
        for (int i24 = 0; i24 < iN2; i24++) {
            bwbVar2.Q(1);
            int iS = bwbVar2.s();
            for (int i25 = 0; i25 < iS; i25++) {
                int iS2 = bwbVar2.s();
                i23 += iS2 + 4;
                bwbVar2.Q(iS2);
            }
        }
        bwbVar2.P(i21);
        byte[] bArr = new byte[i23];
        dep depVar4 = depVar;
        int i26 = 0;
        float f = 1.0f;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        int i34 = -1;
        int i35 = -1;
        int i36 = -1;
        String strG = null;
        int i37 = 0;
        while (i37 < iN2) {
            int i38 = -1;
            int iN3 = bwbVar2.n() & 63;
            int iS3 = bwbVar2.s();
            int i39 = i22;
            dep depVar5 = depVar4;
            while (i39 < iS3) {
                int iS4 = bwbVar2.s();
                System.arraycopy(bxf.a, i22, bArr, i26, i20);
                int i40 = i26 + 4;
                boolean z3 = i22;
                System.arraycopy(bwbVar2.b, bwbVar2.c, bArr, i40, iS4);
                int i41 = 32;
                if (iN3 == 32) {
                    if (i39 == 0) {
                        bxi bxiVar = new bxi(bArr, i40, i40 + iS4);
                        bxf.m(bxiVar);
                        bxiVar.e(4);
                        boolean zG2 = bxiVar.g();
                        boolean zG3 = bxiVar.g();
                        int iA4 = bxiVar.a(6);
                        int i42 = iA4 + 1;
                        i2 = iN;
                        int iA5 = bxiVar.a(3);
                        bxiVar.e(17);
                        i3 = iN2;
                        i4 = iS3;
                        bxb bxbVarF = bxf.f(bxiVar, true, iA5, null);
                        for (int i43 = true != bxiVar.g() ? iA5 : z3 ? 1 : 0; i43 <= iA5; i43++) {
                            bxiVar.b();
                            bxiVar.b();
                            bxiVar.b();
                        }
                        int iA6 = bxiVar.a(6);
                        int iB2 = bxiVar.b() + 1;
                        i23 = i23;
                        i6 = i37;
                        i = iN3;
                        int i44 = i27;
                        eol eolVar2 = new eol(agke.q(bxbVarF), new int[1], (char[]) null);
                        boolean z4 = (i42 < 2 || iB2 < 2) ? z3 ? 1 : 0 : true;
                        boolean z5 = (zG2 && zG3) ? true : z3 ? 1 : 0;
                        int i45 = iA6 + 1;
                        if (z4 && z5 && i45 >= i42) {
                            int[] iArr5 = new int[2];
                            iArr5[1] = i45;
                            iArr5[z3 ? 1 : 0] = iB2;
                            int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr5);
                            int[] iArr7 = new int[iB2];
                            int[] iArr8 = new int[iB2];
                            iArr6[z3 ? 1 : 0][z3 ? 1 : 0] = z3 ? 1 : 0;
                            iArr7[z3 ? 1 : 0] = 1;
                            iArr8[z3 ? 1 : 0] = z3 ? 1 : 0;
                            int i46 = 1;
                            while (i46 < iB2) {
                                int i47 = i46;
                                int i48 = z3 ? 1 : 0;
                                int i49 = i48;
                                while (i48 <= iA6) {
                                    if (bxiVar.g()) {
                                        int[] iArr9 = iArr6[i47];
                                        int i50 = (i49 == true ? 1 : 0) + 1;
                                        iArr9[i49 == true ? 1 : 0] = i48;
                                        iArr8[i47] = i48;
                                        i49 = i50;
                                    }
                                    iArr7[i47] = i49 == true ? 1 : 0;
                                    i48++;
                                }
                                i46 = i47 + 1;
                            }
                            if (bxiVar.g()) {
                                bxiVar.e(64);
                                if (bxiVar.g()) {
                                    bxiVar.b();
                                }
                                int iB3 = bxiVar.b();
                                int i51 = z3 ? 1 : 0;
                                while (i51 < iB3) {
                                    bxiVar.b();
                                    if (i51 == 0 || bxiVar.g()) {
                                        boolean zG4 = bxiVar.g();
                                        boolean zG5 = bxiVar.g();
                                        if (zG4 || zG5) {
                                            zG = bxiVar.g();
                                            if (zG) {
                                                bxiVar.e(19);
                                            }
                                            bxiVar.e(8);
                                            if (zG) {
                                                bxiVar.e(4);
                                            }
                                            bxiVar.e(15);
                                            i16 = zG4;
                                            i15 = zG5;
                                        } else {
                                            iB3 = iB3;
                                            zG = z3 ? 1 : 0;
                                            i16 = zG4;
                                            i15 = zG5;
                                        }
                                    } else {
                                        iB3 = iB3;
                                        boolean z6 = z3 ? 1 : 0;
                                        boolean z7 = z6 ? 1 : 0;
                                        zG = z7 ? 1 : 0;
                                        i16 = z6;
                                        i15 = z7;
                                    }
                                    int i52 = z3 ? 1 : 0;
                                    while (i52 <= iA5) {
                                        if (bxiVar.g() || bxiVar.g()) {
                                            bxiVar.b();
                                        } else {
                                            if (bxiVar.g()) {
                                                iB = z3 ? 1 : 0;
                                            }
                                            int i53 = i51;
                                            i17 = i16 + i15;
                                            i18 = z3 ? 1 : 0;
                                            while (i18 < i17) {
                                                int i54 = i18;
                                                for (i19 = z3 ? 1 : 0; i19 <= iB; i19++) {
                                                    bxiVar.b();
                                                    bxiVar.b();
                                                    if (zG) {
                                                        bxiVar.b();
                                                        bxiVar.b();
                                                    }
                                                    bxiVar.d();
                                                }
                                                i18 = (i54 == true ? 1 : 0) + 1;
                                            }
                                            i52++;
                                            i51 = i53 == true ? 1 : 0;
                                        }
                                        iB = bxiVar.b();
                                        int i55 = i51;
                                        i17 = i16 + i15;
                                        i18 = z3 ? 1 : 0;
                                        while (i18 < i17) {
                                            int i56 = i18;
                                            while (i19 <= iB) {
                                                bxiVar.b();
                                                bxiVar.b();
                                                if (zG) {
                                                    bxiVar.b();
                                                    bxiVar.b();
                                                }
                                                bxiVar.d();
                                            }
                                            i18 = (i56 == true ? 1 : 0) + 1;
                                        }
                                        i52++;
                                        i51 = i55 == true ? 1 : 0;
                                    }
                                    i51 = (i51 == true ? 1 : 0) + 1;
                                    iB3 = iB3;
                                }
                            }
                            if (bxiVar.g()) {
                                bxiVar.c();
                                bxb bxbVarF2 = bxf.f(bxiVar, z3, iA5, bxbVarF);
                                boolean zG6 = bxiVar.g();
                                boolean[] zArr = new boolean[16];
                                int i57 = 0;
                                int i58 = 0;
                                for (int i59 = 16; i58 < i59; i59 = 16) {
                                    boolean zG7 = bxiVar.g();
                                    zArr[i58] = zG7;
                                    if (zG7) {
                                        i57++;
                                    }
                                    i58++;
                                }
                                if (i57 == 0 || !zArr[1]) {
                                    i9 = i40;
                                    i5 = iS4;
                                    depVar3 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                                } else {
                                    int i60 = i57 + 1;
                                    int[] iArr10 = new int[i57];
                                    i5 = iS4;
                                    for (int i61 = 0; i61 < i57 - (zG6 ? 1 : 0); i61++) {
                                        iArr10[i61] = bxiVar.a(3);
                                    }
                                    int[] iArr11 = new int[i60];
                                    if (zG6) {
                                        for (int i62 = 1; i62 < i57; i62++) {
                                            for (int i63 = 0; i63 < i62; i63++) {
                                                iArr11[i62] = iArr11[i62] + iArr10[i63] + 1;
                                            }
                                        }
                                        iArr11[i57] = 6;
                                    }
                                    int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i42, i57);
                                    int[] iArr13 = new int[i42];
                                    iArr13[0] = 0;
                                    boolean zG8 = bxiVar.g();
                                    int i64 = 1;
                                    while (i64 < i42) {
                                        int i65 = i64;
                                        if (zG8) {
                                            iArr13[i65] = bxiVar.a(6);
                                        } else {
                                            iArr13[i65] = i65;
                                        }
                                        int i66 = 0;
                                        if (zG6) {
                                            while (i66 < i57) {
                                                int i67 = i66 + 1;
                                                iArr12[i65][i66] = (iArr13[i65] & ((1 << iArr11[i67]) - 1)) >> iArr11[i66];
                                                i66 = i67;
                                            }
                                        } else {
                                            while (i66 < i57) {
                                                int i68 = i66;
                                                iArr12[i65][i68] = bxiVar.a(iArr10[i66] + 1);
                                                i66 = i68 + 1;
                                            }
                                        }
                                        i64 = i65 + 1;
                                    }
                                    int[] iArr14 = new int[i45];
                                    int i69 = 0;
                                    int i70 = 1;
                                    while (i69 < i42) {
                                        iArr14[iArr13[i69]] = i38;
                                        int[][] iArr15 = iArr12;
                                        int[] iArr16 = iArr13;
                                        int i71 = 0;
                                        int i72 = 0;
                                        while (i71 < 16) {
                                            if (zArr[i71]) {
                                                if (i71 == 1) {
                                                    iArr14[iArr16[i69]] = iArr15[i69][i72];
                                                    i71 = 1;
                                                }
                                                i72++;
                                            }
                                            i71++;
                                        }
                                        if (i69 > 0) {
                                            int i73 = 0;
                                            while (true) {
                                                if (i73 >= i69) {
                                                    i14 = i69;
                                                    i70++;
                                                    break;
                                                }
                                                i14 = i69;
                                                if (iArr14[iArr16[i69]] == iArr14[iArr16[i73]]) {
                                                    break;
                                                }
                                                i73++;
                                                i69 = i14;
                                            }
                                        } else {
                                            i14 = i69;
                                        }
                                        i69 = i14 + 1;
                                        iArr12 = iArr15;
                                        iArr13 = iArr16;
                                    }
                                    int[] iArr17 = iArr13;
                                    int iA7 = bxiVar.a(4);
                                    if (i70 < 2 || iA7 == 0) {
                                        i9 = i40;
                                        depVar3 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                                    } else {
                                        int[] iArr18 = new int[i70];
                                        for (int i74 = 0; i74 < i70; i74++) {
                                            iArr18[i74] = bxiVar.a(iA7);
                                        }
                                        int[] iArr19 = new int[i45];
                                        int i75 = 0;
                                        while (true) {
                                            iArr = iArr18;
                                            if (i75 >= i42) {
                                                break;
                                            }
                                            iArr19[Math.min(iArr17[i75], iA6)] = i75;
                                            i75++;
                                            iArr18 = iArr;
                                        }
                                        agjz agjzVar = new agjz(4);
                                        int i76 = 0;
                                        while (i76 <= iA6) {
                                            int i77 = i70;
                                            int[] iArr20 = iArr19;
                                            int iMin = Math.min(iArr14[i76], i77 - 1);
                                            int i78 = i76;
                                            agjzVar.h(new ys(iArr20[i78], iMin >= 0 ? iArr[iMin] : i38, null));
                                            i76 = i78 + 1;
                                            i70 = i77;
                                            iArr19 = iArr20;
                                            i40 = i40;
                                        }
                                        i9 = i40;
                                        agke agkeVarG = agjzVar.g();
                                        if (((ys) agkeVarG.get(0)).a == i38) {
                                            depVar3 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                                        } else {
                                            int i79 = 1;
                                            while (true) {
                                                if (i79 > iA6) {
                                                    i10 = -1;
                                                    i11 = -1;
                                                    break;
                                                }
                                                i11 = -1;
                                                if (((ys) agkeVarG.get(i79)).a != -1) {
                                                    i10 = i79;
                                                    break;
                                                }
                                                i79++;
                                            }
                                            if (i10 == i11) {
                                                depVar3 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                                            } else {
                                                boolean[][] zArr2 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i42, i42);
                                                boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i42, i42);
                                                for (int i80 = 1; i80 < i42; i80++) {
                                                    for (int i81 = 0; i81 < i80; i81++) {
                                                        boolean[] zArr4 = zArr2[i80];
                                                        boolean[] zArr5 = zArr3[i80];
                                                        boolean zG9 = bxiVar.g();
                                                        zArr5[i81] = zG9;
                                                        zArr4[i81] = zG9;
                                                    }
                                                }
                                                for (int i82 = 1; i82 < i42; i82++) {
                                                    int i83 = 0;
                                                    while (i83 < iA4) {
                                                        boolean[][] zArr6 = zArr2;
                                                        for (int i84 = 0; i84 < i82; i84++) {
                                                            boolean[] zArr7 = zArr3[i82];
                                                            if (zArr7[i84] && zArr3[i84][i83]) {
                                                                zArr7[i83] = true;
                                                                break;
                                                            }
                                                        }
                                                        i83++;
                                                        zArr2 = zArr6;
                                                    }
                                                }
                                                boolean[][] zArr8 = zArr2;
                                                int[] iArr21 = new int[i45];
                                                for (int i85 = 0; i85 < i42; i85++) {
                                                    int i86 = 0;
                                                    for (int i87 = 0; i87 < i85; i87++) {
                                                        i86 += zArr8[i85][i87] ? 1 : 0;
                                                    }
                                                    iArr21[iArr17[i85]] = i86;
                                                }
                                                int i88 = 0;
                                                for (int i89 = 0; i89 < i42; i89++) {
                                                    if (iArr21[iArr17[i89]] == 0) {
                                                        i88++;
                                                    }
                                                }
                                                if (i88 > 1) {
                                                    depVar3 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                                                } else {
                                                    int[] iArr22 = new int[i42];
                                                    int[] iArr23 = new int[iB2];
                                                    if (bxiVar.g()) {
                                                        int i90 = 0;
                                                        while (i90 < i42) {
                                                            int i91 = i90;
                                                            iArr22[i91] = bxiVar.a(3);
                                                            i90 = i91 + 1;
                                                        }
                                                    } else {
                                                        Arrays.fill(iArr22, 0, i42, iA5);
                                                    }
                                                    int i92 = 0;
                                                    while (i92 < iB2) {
                                                        int i93 = i92;
                                                        boolean[][] zArr9 = zArr3;
                                                        int[] iArr24 = iArr22;
                                                        int iMax = 0;
                                                        for (int i94 = 0; i94 < iArr7[i93]; i94++) {
                                                            iMax = Math.max(iMax, iArr24[((ys) agkeVarG.get(iArr6[i93][i94])).b]);
                                                        }
                                                        iArr23[i93] = iMax + 1;
                                                        i92 = i93 + 1;
                                                        zArr3 = zArr9;
                                                        iArr22 = iArr24;
                                                    }
                                                    boolean[][] zArr10 = zArr3;
                                                    if (bxiVar.g()) {
                                                        int i95 = 0;
                                                        while (i95 < iA4) {
                                                            int i96 = i95 + 1;
                                                            int i97 = i96;
                                                            while (i97 < i42) {
                                                                if (zArr8[i97][i95]) {
                                                                    bxiVar.e(3);
                                                                }
                                                                i97++;
                                                                i95 = i95;
                                                            }
                                                            i95 = i96;
                                                        }
                                                    }
                                                    bxiVar.d();
                                                    int iB4 = bxiVar.b() + 1;
                                                    agjz agjzVar2 = new agjz(4);
                                                    agjzVar2.h(bxbVarF);
                                                    if (iB4 > 1) {
                                                        agjzVar2.h(bxbVarF2);
                                                        for (int i98 = 2; i98 < iB4; i98++) {
                                                            bxbVarF2 = bxf.f(bxiVar, bxiVar.g(), iA5, bxbVarF2);
                                                            agjzVar2.h(bxbVarF2);
                                                        }
                                                    }
                                                    agke agkeVarG2 = agjzVar2.g();
                                                    int iB5 = bxiVar.b() + iB2;
                                                    if (iB5 > iB2) {
                                                        depVar3 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                                                    } else {
                                                        int iA8 = bxiVar.a(2);
                                                        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iB5, i45);
                                                        int[] iArr25 = new int[iB5];
                                                        int[] iArr26 = new int[iB5];
                                                        int i99 = 0;
                                                        while (i99 < iB2) {
                                                            int i100 = i99;
                                                            iArr25[i100] = 0;
                                                            int i101 = iArr8[i100];
                                                            iArr26[i100] = i101;
                                                            if (iA8 == 0) {
                                                                iArr2 = iArr25;
                                                                iArr3 = iArr26;
                                                                iArr4 = iArr23;
                                                                Arrays.fill(zArr11[i100], 0, iArr7[i100], true);
                                                                iArr2[i100] = iArr7[i100];
                                                            } else {
                                                                iArr2 = iArr25;
                                                                iArr3 = iArr26;
                                                                iArr4 = iArr23;
                                                                if (iA8 == 1) {
                                                                    for (int i102 = 0; i102 < iArr7[i100]; i102++) {
                                                                        try {
                                                                            zArr11[i100][i102] = iArr6[i100][i102] == i101;
                                                                        } catch (ArrayIndexOutOfBoundsException e3) {
                                                                            e = e3;
                                                                            z2 = true;
                                                                        }
                                                                    }
                                                                    z2 = true;
                                                                    try {
                                                                        iArr2[i100] = 1;
                                                                    } catch (ArrayIndexOutOfBoundsException e4) {
                                                                        e = e4;
                                                                        r15 = z2;
                                                                        if (r15 != z) {
                                                                            str = "HEVC config";
                                                                        } else {
                                                                            str = "L-HEVC config";
                                                                        }
                                                                        throw new bsz("Error parsing".concat(str), e, r15, r15);
                                                                    }
                                                                } else {
                                                                    zArr11[0][0] = true;
                                                                    iArr2[0] = 1;
                                                                }
                                                            }
                                                            i99 = i100 + 1;
                                                            iArr25 = iArr2;
                                                            iArr26 = iArr3;
                                                            iArr23 = iArr4;
                                                        }
                                                        int[] iArr27 = iArr25;
                                                        int[] iArr28 = iArr26;
                                                        int[] iArr29 = iArr23;
                                                        int[] iArr30 = new int[i45];
                                                        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iB5, i45);
                                                        int i103 = 1;
                                                        int i104 = 0;
                                                        while (i103 < iB5) {
                                                            int i105 = iA8;
                                                            if (iA8 == 2) {
                                                                for (int i106 = 0; i106 < iArr7[i103]; i106++) {
                                                                    zArr11[i103][i106] = bxiVar.g();
                                                                    int i107 = iArr27[i103];
                                                                    boolean z8 = zArr11[i103][i106];
                                                                    iArr27[i103] = i107 + (z8 ? 1 : 0);
                                                                    if (z8) {
                                                                        iArr28[i103] = iArr6[i103][i106];
                                                                    }
                                                                }
                                                            }
                                                            if (i104 == 0) {
                                                                if (iArr6[i103][0] == 0 && zArr11[i103][0]) {
                                                                    i104 = 0;
                                                                    for (int i108 = 1; i108 < iArr7[i103]; i108++) {
                                                                        if (iArr6[i103][i108] == i10 && zArr11[i103][i10]) {
                                                                            i104 = i103;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i104 = 0;
                                                                }
                                                            }
                                                            int i109 = 0;
                                                            while (i109 < iArr7[i103]) {
                                                                if (iB4 > 1) {
                                                                    zArr12[i103][i109] = zArr11[i103][i109];
                                                                    agkeVar = agkeVarG2;
                                                                    i13 = i10;
                                                                    int iA9 = ahbd.a(iB4, RoundingMode.CEILING);
                                                                    if (zArr12[i103][i109]) {
                                                                        i12 = iB4;
                                                                        break;
                                                                    }
                                                                    int i110 = ((ys) agkeVarG.get(iArr6[i103][i109])).b;
                                                                    int i111 = 0;
                                                                    while (true) {
                                                                        if (i111 >= i109) {
                                                                            i12 = iB4;
                                                                            break;
                                                                        }
                                                                        i12 = iB4;
                                                                        if (zArr10[i110][((ys) agkeVarG.get(iArr6[i103][i111])).b]) {
                                                                            zArr12[i103][i109] = true;
                                                                            break;
                                                                        }
                                                                        i111++;
                                                                        iB4 = i12;
                                                                    }
                                                                    if (zArr12[i103][i109]) {
                                                                        if (i104 <= 0 || i103 != i104) {
                                                                            bxiVar.e(iA9);
                                                                        } else {
                                                                            iArr30[i109] = bxiVar.a(iA9);
                                                                        }
                                                                    }
                                                                } else {
                                                                    i12 = iB4;
                                                                    agkeVar = agkeVarG2;
                                                                    i13 = i10;
                                                                }
                                                                i109++;
                                                                i10 = i13;
                                                                agkeVarG2 = agkeVar;
                                                                iB4 = i12;
                                                            }
                                                            int i112 = iB4;
                                                            agke agkeVar2 = agkeVarG2;
                                                            int i113 = i10;
                                                            if (iArr27[i103] == 1 && iArr21[iArr28[i103]] > 0) {
                                                                bxiVar.d();
                                                            }
                                                            i103++;
                                                            iA8 = i105;
                                                            i10 = i113;
                                                            agkeVarG2 = agkeVar2;
                                                            iB4 = i112;
                                                        }
                                                        agke agkeVar3 = agkeVarG2;
                                                        if (i104 == 0) {
                                                            depVar3 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                                                        } else {
                                                            int iB6 = bxiVar.b();
                                                            int i114 = iB6 + 1;
                                                            agjz agjzVarF = agke.f(i114);
                                                            int[] iArr31 = new int[i42];
                                                            int i115 = 0;
                                                            while (i115 < i114) {
                                                                int iA10 = bxiVar.a(16);
                                                                int iA11 = bxiVar.a(16);
                                                                if (bxiVar.g()) {
                                                                    iA = bxiVar.a(2);
                                                                    if (iA == 3) {
                                                                        bxiVar.d();
                                                                    }
                                                                    iA2 = bxiVar.a(4);
                                                                    iA3 = bxiVar.a(4);
                                                                } else {
                                                                    iA = 0;
                                                                    iA2 = 0;
                                                                    iA3 = 0;
                                                                }
                                                                if (bxiVar.g()) {
                                                                    int iB7 = bxiVar.b();
                                                                    int iB8 = bxiVar.b();
                                                                    int iB9 = bxiVar.b();
                                                                    int iB10 = bxiVar.b();
                                                                    iA10 = bxf.a(iA10, iA, iB7, iB8);
                                                                    iA11 -= (iA == 1 ? 2 : 1) * (iB9 + iB10);
                                                                }
                                                                agjzVarF.h(new bxc(iA, iA2, iA3, iA10, iA11));
                                                                i115++;
                                                                zArr12 = zArr12;
                                                            }
                                                            boolean[][] zArr13 = zArr12;
                                                            if (i114 <= 1 || !bxiVar.g()) {
                                                                for (int i116 = 1; i116 < i42; i116++) {
                                                                    iArr31[i116] = Math.min(i116, iB6);
                                                                }
                                                            } else {
                                                                int iA12 = ahbd.a(i114, RoundingMode.CEILING);
                                                                for (int i117 = 1; i117 < i42; i117++) {
                                                                    iArr31[i117] = bxiVar.a(iA12);
                                                                }
                                                            }
                                                            eol eolVar3 = new eol((List) agjzVarF.g(), iArr31, (byte[]) null);
                                                            bxiVar.e(2);
                                                            for (int i118 = 1; i118 < i42; i118++) {
                                                                if (iArr21[iArr17[i118]] == 0) {
                                                                    bxiVar.d();
                                                                }
                                                            }
                                                            for (int i119 = 1; i119 < iB5; i119++) {
                                                                boolean zG10 = bxiVar.g();
                                                                int i120 = 0;
                                                                while (i120 < iArr29[i119]) {
                                                                    if ((i120 <= 0 || !zG10) ? i120 == 0 : bxiVar.g()) {
                                                                        for (int i121 = 0; i121 < iArr7[i119]; i121++) {
                                                                            if (zArr13[i119][i121]) {
                                                                                bxiVar.b();
                                                                            }
                                                                        }
                                                                        bxiVar.b();
                                                                        bxiVar.b();
                                                                    }
                                                                    i120++;
                                                                }
                                                            }
                                                            int iB11 = bxiVar.b() + 2;
                                                            if (bxiVar.g()) {
                                                                bxiVar.e(iB11);
                                                            } else {
                                                                for (int i122 = 1; i122 < i42; i122++) {
                                                                    for (int i123 = 0; i123 < i122; i123++) {
                                                                        if (zArr8[i122][i123]) {
                                                                            bxiVar.e(iB11);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            int iB12 = bxiVar.b();
                                                            for (int i124 = 1; i124 <= iB12; i124++) {
                                                                bxiVar.e(8);
                                                            }
                                                            if (bxiVar.g()) {
                                                                bxiVar.c();
                                                                if (bxiVar.g() || bxiVar.g()) {
                                                                    bxiVar.d();
                                                                }
                                                                boolean zG11 = bxiVar.g();
                                                                boolean zG12 = bxiVar.g();
                                                                if (zG11 || zG12) {
                                                                    for (int i125 = 0; i125 < iB2; i125++) {
                                                                        for (int i126 = 0; i126 < iArr29[i125]; i126++) {
                                                                            boolean zG13 = zG11 ? bxiVar.g() : false;
                                                                            boolean zG14 = zG12 ? bxiVar.g() : false;
                                                                            if (zG13) {
                                                                                bxiVar.e(32);
                                                                            }
                                                                            if (zG14) {
                                                                                bxiVar.e(18);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                boolean zG15 = bxiVar.g();
                                                                int iA13 = zG15 ? bxiVar.a(4) + 1 : i42;
                                                                agjz agjzVarF2 = agke.f(iA13);
                                                                int[] iArr32 = new int[i42];
                                                                for (int i127 = 0; i127 < iA13; i127++) {
                                                                    bxiVar.e(3);
                                                                    int i128 = true != bxiVar.g() ? 2 : 1;
                                                                    int iA14 = bru.a(bxiVar.a(8));
                                                                    int iB13 = bru.b(bxiVar.a(8));
                                                                    bxiVar.e(8);
                                                                    agjzVarF2.h(new aamu(iA14, i128, iB13));
                                                                }
                                                                if (zG15 && iA13 > 1) {
                                                                    for (int i129 = 0; i129 < i42; i129++) {
                                                                        iArr32[i129] = bxiVar.a(4);
                                                                    }
                                                                }
                                                                eolVar = new eol((List) agjzVarF2.g(), iArr32);
                                                            } else {
                                                                eolVar = null;
                                                            }
                                                            depVar5 = new dep(agkeVarG, new eol(agkeVar3, iArr30, (char[]) null), eolVar3, eolVar);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                depVar5 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                                i9 = i40;
                                i5 = iS4;
                            }
                            i27 = i44;
                            i7 = i9;
                            i39 = 0;
                            i8 = 0;
                            i38 = -1;
                        } else {
                            i9 = i40;
                            i5 = iS4;
                            depVar3 = new dep((List) null, eolVar2, (eol) null, (eol) null);
                        }
                        depVar5 = depVar3;
                        i27 = i44;
                        i7 = i9;
                        i39 = 0;
                        i8 = 0;
                        i38 = -1;
                    } else {
                        i = iN3;
                    }
                    bwbVar.Q(i5);
                    i39++;
                    i26 = i7 + i5;
                    bwbVar2 = bwbVar;
                    i22 = i8;
                    iN = i2;
                    iN2 = i3;
                    iS3 = i4;
                    i23 = i23;
                    i37 = i6;
                    iN3 = i;
                    i20 = 4;
                } else {
                    i = iN3;
                    i41 = i;
                }
                i2 = iN;
                i3 = iN2;
                i4 = iS3;
                i5 = iS4;
                i6 = i37;
                int i130 = i27;
                if (i41 != 33) {
                    depVar2 = depVar5;
                    i7 = i40;
                    if (i41 == 39 && i39 == 0) {
                        i38 = -1;
                        int i131 = (i7 + i5) - 1;
                        while (true) {
                            int i132 = i26 + 6;
                            byte b = bArr[i131];
                            if (b != 0) {
                                if (b == 0 || i131 <= i132) {
                                    break;
                                }
                                bxi bxiVar2 = new bxi(bArr, i132, i131 + 1);
                                while (true) {
                                    if (bxiVar2.f(16)) {
                                        int iA15 = bxiVar2.a(8);
                                        int i133 = 0;
                                        while (iA15 == 255) {
                                            i133 += 255;
                                            iA15 = bxiVar2.a(8);
                                        }
                                        int i134 = i133 + iA15;
                                        int iA16 = bxiVar2.a(8);
                                        int i135 = 0;
                                        while (iA16 == 255) {
                                            i135 += 255;
                                            iA16 = bxiVar2.a(8);
                                        }
                                        int i136 = i135 + iA16;
                                        if (i136 != 0 && bxiVar2.f(i136)) {
                                            if (i134 == 176) {
                                                int iB14 = bxiVar2.b();
                                                boolean zG16 = bxiVar2.g();
                                                int iB15 = zG16 ? bxiVar2.b() : 0;
                                                int iB16 = bxiVar2.b();
                                                int iB17 = -1;
                                                int i137 = 0;
                                                while (true) {
                                                    if (i137 > iB16) {
                                                        ampVar = new amp(iB17);
                                                        break;
                                                    }
                                                    iB17 = bxiVar2.b();
                                                    bxiVar2.b();
                                                    int iA17 = bxiVar2.a(6);
                                                    if (iA17 != 63) {
                                                        bxiVar2.a(iA17 == 0 ? Math.max(0, iB14 - 30) : Math.max(0, (iA17 + iB14) - 31));
                                                        if (zG16) {
                                                            int iA18 = bxiVar2.a(6);
                                                            if (iA18 != 63) {
                                                                bxiVar2.a(iA18 == 0 ? Math.max(0, iB15 - 30) : Math.max(0, (iA18 + iB15) - 31));
                                                            }
                                                        }
                                                        if (bxiVar2.g()) {
                                                            bxiVar2.e(10);
                                                        }
                                                        i137++;
                                                    }
                                                }
                                            } else {
                                                bxiVar2.e(i136 << 3);
                                            }
                                        }
                                    }
                                }
                            } else if (i131 > i132) {
                                i131--;
                            }
                            ampVar = null;
                            break;
                        }
                        if (ampVar == null || depVar2 == null) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                            if (ampVar.a == ((ys) ((agke) depVar2.a).get(0)).a) {
                                depVar5 = depVar2;
                                i27 = i130;
                                i35 = 4;
                            } else {
                                i35 = 5;
                            }
                        }
                    } else {
                        i8 = 0;
                        i38 = -1;
                    }
                    depVar5 = depVar2;
                    i27 = i130;
                } else if (i39 == 0) {
                    dep depVar6 = depVar5;
                    i7 = i40;
                    bxd bxdVarK = bxf.k(bArr, i7, i40 + i5, depVar6);
                    int i138 = bxdVarK.a + 1;
                    int i139 = bxdVarK.g;
                    int i140 = bxdVarK.h;
                    int i141 = bxdVarK.c + 8;
                    int i142 = bxdVarK.d + 8;
                    int i143 = bxdVarK.k;
                    int i144 = bxdVarK.l;
                    int i145 = bxdVarK.m;
                    float f2 = bxdVarK.i;
                    int i146 = bxdVarK.j;
                    bxb bxbVar = bxdVarK.b;
                    if (bxbVar != null) {
                        strG = bvf.g(bxbVar.a, bxbVar.b, bxbVar.c, bxbVar.d, bxbVar.e, bxbVar.f);
                    }
                    depVar5 = depVar6;
                    f = f2;
                    i28 = i139;
                    i29 = i140;
                    i30 = i141;
                    i31 = i142;
                    i32 = i143;
                    i33 = i144;
                    i36 = i146;
                    i27 = i138;
                    i8 = 0;
                    i38 = -1;
                    i34 = i145;
                } else {
                    depVar2 = depVar5;
                    i7 = i40;
                    i8 = 0;
                    i38 = -1;
                    depVar5 = depVar2;
                    i27 = i130;
                }
                bwbVar.Q(i5);
                i39++;
                i26 = i7 + i5;
                bwbVar2 = bwbVar;
                i22 = i8;
                iN = i2;
                iN2 = i3;
                iS3 = i4;
                i23 = i23;
                i37 = i6;
                iN3 = i;
                i20 = 4;
            }
            i37++;
            depVar4 = depVar5;
            i20 = 4;
        }
        return new cvs(i23 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iN + 1, i27, i28, i29, i30, i31, i32, i33, i34, i35, f, i36, strG, depVar4);
    }
}
