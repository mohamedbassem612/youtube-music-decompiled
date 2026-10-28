package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jto {
    public int c;
    public qcb g;
    private int h;
    private long i;
    final long[] d = new long[1];
    final double[] e = new double[1];
    final String[] f = new String[1];
    private byte[] j = new byte[8];
    public final ArrayDeque a = new ArrayDeque();
    public final jts b = new jts();

    private final boolean b(jtm jtmVar, int i, long[] jArr) {
        if (!jtmVar.j(this.j, 0, i)) {
            return false;
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.j[i2] & 255));
        }
        jArr[0] = j;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:138:0x0285  */
    /* JADX WARN: Code duplicated, block: B:140:0x0289  */
    /* JADX WARN: Code duplicated, block: B:142:0x0295  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02de  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:162:0x0313  */
    /* JADX WARN: Code duplicated, block: B:163:0x0321 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0323  */
    /* JADX WARN: Code duplicated, block: B:167:0x032c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0338  */
    /* JADX WARN: Code duplicated, block: B:173:0x0351 A[LOOP:3: B:168:0x0330->B:173:0x0351, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0361  */
    /* JADX WARN: Code duplicated, block: B:177:0x0365  */
    /* JADX WARN: Code duplicated, block: B:180:0x036f  */
    /* JADX WARN: Code duplicated, block: B:182:0x037b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0381  */
    /* JADX WARN: Code duplicated, block: B:186:0x0385  */
    /* JADX WARN: Code duplicated, block: B:190:0x0399  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a6 A[LOOP:6: B:193:0x03b3->B:192:0x03a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c2 A[LOOP:5: B:185:0x0383->B:196:0x03c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:214:0x0430  */
    /* JADX WARN: Code duplicated, block: B:216:0x0434  */
    /* JADX WARN: Code duplicated, block: B:218:0x043d  */
    /* JADX WARN: Code duplicated, block: B:219:0x043f  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0444  */
    /* JADX WARN: Code duplicated, block: B:222:0x0447  */
    /* JADX WARN: Code duplicated, block: B:224:0x0451  */
    /* JADX WARN: Code duplicated, block: B:229:0x0463 A[LOOP:7: B:229:0x0463->B:233:0x0473, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:231:0x0469  */
    /* JADX WARN: Code duplicated, block: B:233:0x0473 A[LOOP:7: B:229:0x0463->B:233:0x0473, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x049c A[LOOP:8: B:235:0x049c->B:239:0x04ac, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:237:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ac A[LOOP:8: B:235:0x049c->B:239:0x04ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:242:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:244:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:245:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:247:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:250:0x04db A[ADDED_TO_REGION, LOOP:9: B:250:0x04db->B:253:0x04e5, LOOP_START, PHI: r2
      0x04db: PHI (r2v62 int) = (r2v61 int), (r2v63 int) binds: [B:249:0x04d9, B:253:0x04e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:251:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e5 A[LOOP:9: B:250:0x04db->B:253:0x04e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:257:0x0500  */
    /* JADX WARN: Code duplicated, block: B:259:0x050e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0516  */
    /* JADX WARN: Code duplicated, block: B:263:0x051f  */
    /* JADX WARN: Code duplicated, block: B:265:0x052f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0533  */
    /* JADX WARN: Code duplicated, block: B:268:0x0536  */
    /* JADX WARN: Code duplicated, block: B:271:0x053c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0545  */
    /* JADX WARN: Code duplicated, block: B:273:0x054e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0558  */
    /* JADX WARN: Code duplicated, block: B:277:0x055c  */
    /* JADX WARN: Code duplicated, block: B:279:0x055f  */
    /* JADX WARN: Code duplicated, block: B:284:0x0568  */
    /* JADX WARN: Code duplicated, block: B:285:0x056d  */
    /* JADX WARN: Code duplicated, block: B:286:0x0573  */
    /* JADX WARN: Code duplicated, block: B:287:0x0579  */
    /* JADX WARN: Code duplicated, block: B:289:0x057f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0583  */
    /* JADX WARN: Code duplicated, block: B:293:0x0587  */
    /* JADX WARN: Code duplicated, block: B:294:0x0589 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x058d  */
    /* JADX WARN: Code duplicated, block: B:297:0x0595  */
    /* JADX WARN: Code duplicated, block: B:298:0x059d  */
    /* JADX WARN: Code duplicated, block: B:299:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:301:0x05aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:302:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:303:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:304:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:305:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:306:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:308:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:310:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:312:0x05d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:314:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:315:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:318:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:319:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:320:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:321:0x0602  */
    /* JADX WARN: Code duplicated, block: B:322:0x0609  */
    /* JADX WARN: Code duplicated, block: B:323:0x0611  */
    /* JADX WARN: Code duplicated, block: B:326:0x061f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0623  */
    /* JADX WARN: Code duplicated, block: B:329:0x0625  */
    /* JADX WARN: Code duplicated, block: B:331:0x062d  */
    /* JADX WARN: Code duplicated, block: B:332:0x0635  */
    /* JADX WARN: Code duplicated, block: B:333:0x063d  */
    /* JADX WARN: Code duplicated, block: B:334:0x0645  */
    /* JADX WARN: Code duplicated, block: B:336:0x0648  */
    /* JADX WARN: Code duplicated, block: B:338:0x064b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x064d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0652  */
    /* JADX WARN: Code duplicated, block: B:343:0x0659  */
    /* JADX WARN: Code duplicated, block: B:344:0x0660  */
    /* JADX WARN: Code duplicated, block: B:345:0x0668  */
    /* JADX WARN: Code duplicated, block: B:346:0x0670  */
    /* JADX WARN: Code duplicated, block: B:347:0x0678  */
    /* JADX WARN: Code duplicated, block: B:349:0x067c  */
    /* JADX WARN: Code duplicated, block: B:351:0x068b  */
    /* JADX WARN: Code duplicated, block: B:353:0x0694  */
    /* JADX WARN: Code duplicated, block: B:355:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:357:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:359:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:361:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:365:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:368:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:370:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:371:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:373:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:374:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:375:0x0702  */
    /* JADX WARN: Code duplicated, block: B:376:0x070c  */
    /* JADX WARN: Code duplicated, block: B:377:0x0715  */
    /* JADX WARN: Code duplicated, block: B:378:0x071e  */
    /* JADX WARN: Code duplicated, block: B:379:0x072b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:380:0x0734  */
    /* JADX WARN: Code duplicated, block: B:381:0x073d  */
    /* JADX WARN: Code duplicated, block: B:382:0x0747  */
    /* JADX WARN: Code duplicated, block: B:384:0x074b  */
    /* JADX WARN: Code duplicated, block: B:385:0x074d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0756  */
    /* JADX WARN: Code duplicated, block: B:388:0x075f  */
    /* JADX WARN: Code duplicated, block: B:391:0x0765  */
    /* JADX WARN: Code duplicated, block: B:393:0x0774  */
    /* JADX WARN: Code duplicated, block: B:396:0x077e  */
    /* JADX WARN: Code duplicated, block: B:399:0x078c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:401:0x079a  */
    /* JADX WARN: Code duplicated, block: B:403:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:405:0x07c9 A[LOOP:0: B:3:0x0009->B:405:0x07c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:411:0x07cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x045b A[EDGE_INSN: B:412:0x045b->B:226:0x045b BREAK  A[LOOP:0: B:3:0x0009->B:405:0x07c9, LOOP_LABEL: LOOP:0: B:3:0x0009->B:405:0x07c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x045b A[EDGE_INSN: B:413:0x045b->B:226:0x045b BREAK  A[LOOP:0: B:3:0x0009->B:405:0x07c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x045b A[EDGE_INSN: B:422:0x045b->B:226:0x045b BREAK  A[LOOP:0: B:3:0x0009->B:405:0x07c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x03f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x03b6 A[EDGE_INSN: B:434:0x03b6->B:194:0x03b6 BREAK  A[LOOP:6: B:193:0x03b3->B:192:0x03a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x078a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x078a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:440:0x04e7 A[EDGE_INSN: B:440:0x04e7->B:254:0x04e7 BREAK  A[LOOP:9: B:250:0x04db->B:253:0x04e5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[PHI: r16
      0x00c8: PHI (r16v1 long) = (r16v0 long), (r16v5 long) binds: [B:40:0x00b8, B:43:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0130  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0147  */
    /* JADX WARN: Code duplicated, block: B:75:0x0150  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0198  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0281, code lost:
    
        if (r33.k(r6) == false) goto L226;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:269:0x0537. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.jtm r33) {
        /*
            Method dump skipped, instruction units count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jto.a(jtm):boolean");
    }
}
