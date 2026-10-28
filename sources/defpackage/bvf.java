package defpackage;

import android.util.Pair;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bvf {
    public static final byte[] a = {0, 0, 0, 1};
    private static final String[] c = {"", "A", "B", "C"};
    private static final Pattern d = Pattern.compile("^\\D?(\\d+)$");
    private static final byte[] e = {-75, 0, 60, 0, 1, 4};
    private static final byte[] f = {-75, 0, -112, 0, 1};
    public static final int b = 5;

    public static Pair a(bse bseVar) {
        bve bveVarC = c(bseVar);
        if (bveVarC == null || !bveVarC.b) {
            return null;
        }
        return new Pair(Integer.valueOf(bveVarC.b()), Integer.valueOf(bveVarC.a()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static bve b(String str, String[] strArr, bru bruVar) {
        int i;
        Integer numValueOf = null;
        if (strArr.length < 4) {
            bvx.e("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = d.matcher(strArr[1]);
        if (!matcher.matches()) {
            bvx.e("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else {
            if (!"2".equals(strGroup)) {
                bvx.e("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return bve.a;
            }
            i = (bruVar == null || bruVar.d != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    numValueOf = 2;
                }
                break;
            case 70914:
                if (str2.equals("H60")) {
                    numValueOf = 8;
                }
                break;
            case 70917:
                if (str2.equals("H63")) {
                    numValueOf = 32;
                }
                break;
            case 71007:
                if (str2.equals("H90")) {
                    numValueOf = Integer.valueOf(SemanticState.Focused);
                }
                break;
            case 71010:
                if (str2.equals("H93")) {
                    numValueOf = Integer.valueOf(SemanticState.LiveRegion);
                }
                break;
            case 74665:
                if (str2.equals("L30")) {
                    numValueOf = 1;
                }
                break;
            case 74758:
                if (str2.equals("L60")) {
                    numValueOf = 4;
                }
                break;
            case 74761:
                if (str2.equals("L63")) {
                    numValueOf = 16;
                }
                break;
            case 74851:
                if (str2.equals("L90")) {
                    numValueOf = 64;
                }
                break;
            case 74854:
                if (str2.equals("L93")) {
                    numValueOf = Integer.valueOf(SemanticState.Hidden);
                }
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    numValueOf = Integer.valueOf(SemanticState.Modal);
                }
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    numValueOf = Integer.valueOf(SemanticState.Multiline);
                }
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    numValueOf = 32768;
                }
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    numValueOf = 131072;
                }
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    numValueOf = 524288;
                }
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    numValueOf = 2097152;
                }
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    numValueOf = 8388608;
                }
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    numValueOf = 33554432;
                }
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    numValueOf = Integer.valueOf(SemanticState.ReadOnly);
                }
                break;
            case 2312806:
                if (str2.equals("L123")) {
                    numValueOf = Integer.valueOf(SemanticState.Obscured);
                }
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    numValueOf = 16384;
                }
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    numValueOf = 65536;
                }
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    numValueOf = 262144;
                }
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    numValueOf = 1048576;
                }
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    numValueOf = 4194304;
                }
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    numValueOf = 16777216;
                }
                break;
        }
        if (numValueOf != null) {
            return new bve(i, numValueOf.intValue(), true);
        }
        bvx.e("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
        return bve.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x021b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0232  */
    /* JADX WARN: Code duplicated, block: B:116:0x0234  */
    /* JADX WARN: Code duplicated, block: B:118:0x0238  */
    /* JADX WARN: Code duplicated, block: B:119:0x023b  */
    /* JADX WARN: Code duplicated, block: B:121:0x023f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0241  */
    /* JADX WARN: Code duplicated, block: B:123:0x0243  */
    /* JADX WARN: Code duplicated, block: B:125:0x0247  */
    /* JADX WARN: Code duplicated, block: B:129:0x0253  */
    /* JADX WARN: Code duplicated, block: B:131:0x025b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0263  */
    /* JADX WARN: Code duplicated, block: B:134:0x026b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0273  */
    /* JADX WARN: Code duplicated, block: B:137:0x027b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0283  */
    /* JADX WARN: Code duplicated, block: B:140:0x028b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0293  */
    /* JADX WARN: Code duplicated, block: B:143:0x029b  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02da  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:162:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:164:0x0304  */
    /* JADX WARN: Code duplicated, block: B:165:0x030a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0312  */
    /* JADX WARN: Code duplicated, block: B:168:0x0318  */
    /* JADX WARN: Code duplicated, block: B:170:0x0320  */
    /* JADX WARN: Code duplicated, block: B:171:0x0326  */
    /* JADX WARN: Code duplicated, block: B:173:0x032e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0334  */
    /* JADX WARN: Code duplicated, block: B:176:0x033c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0341  */
    /* JADX WARN: Code duplicated, block: B:179:0x0349  */
    /* JADX WARN: Code duplicated, block: B:180:0x034e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0356  */
    /* JADX WARN: Code duplicated, block: B:183:0x035d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0365  */
    /* JADX WARN: Code duplicated, block: B:186:0x036c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0374  */
    /* JADX WARN: Code duplicated, block: B:189:0x0379  */
    /* JADX WARN: Code duplicated, block: B:191:0x0381  */
    /* JADX WARN: Code duplicated, block: B:192:0x0386  */
    /* JADX WARN: Code duplicated, block: B:194:0x038e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0393  */
    /* JADX WARN: Code duplicated, block: B:197:0x039b  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:205:0x03be  */
    /* JADX WARN: Code duplicated, block: B:398:0x067e  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:424:0x06f0 A[Catch: NumberFormatException -> 0x07a6, TryCatch #1 {NumberFormatException -> 0x07a6, blocks: (B:422:0x06e8, B:424:0x06f0, B:426:0x0707, B:478:0x079b), top: B:703:0x06e8 }] */
    /* JADX WARN: Code duplicated, block: B:425:0x0705 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:426:0x0707 A[Catch: NumberFormatException -> 0x07a6, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x07a6, blocks: (B:422:0x06e8, B:424:0x06f0, B:426:0x0707, B:478:0x079b), top: B:703:0x06e8 }] */
    /* JADX WARN: Code duplicated, block: B:429:0x0717  */
    /* JADX WARN: Code duplicated, block: B:431:0x071b  */
    /* JADX WARN: Code duplicated, block: B:433:0x071f  */
    /* JADX WARN: Code duplicated, block: B:435:0x0723  */
    /* JADX WARN: Code duplicated, block: B:437:0x0727  */
    /* JADX WARN: Code duplicated, block: B:439:0x072b  */
    /* JADX WARN: Code duplicated, block: B:441:0x072f  */
    /* JADX WARN: Code duplicated, block: B:442:0x0731  */
    /* JADX WARN: Code duplicated, block: B:443:0x0734  */
    /* JADX WARN: Code duplicated, block: B:444:0x0736  */
    /* JADX WARN: Code duplicated, block: B:445:0x0738  */
    /* JADX WARN: Code duplicated, block: B:446:0x073a  */
    /* JADX WARN: Code duplicated, block: B:447:0x073c  */
    /* JADX WARN: Code duplicated, block: B:449:0x073f  */
    /* JADX WARN: Code duplicated, block: B:451:0x074b  */
    /* JADX WARN: Code duplicated, block: B:452:0x074e  */
    /* JADX WARN: Code duplicated, block: B:453:0x0751  */
    /* JADX WARN: Code duplicated, block: B:454:0x0754  */
    /* JADX WARN: Code duplicated, block: B:455:0x0757  */
    /* JADX WARN: Code duplicated, block: B:456:0x075a  */
    /* JADX WARN: Code duplicated, block: B:457:0x075c  */
    /* JADX WARN: Code duplicated, block: B:458:0x075f  */
    /* JADX WARN: Code duplicated, block: B:459:0x0763  */
    /* JADX WARN: Code duplicated, block: B:460:0x0766  */
    /* JADX WARN: Code duplicated, block: B:461:0x0769  */
    /* JADX WARN: Code duplicated, block: B:462:0x076c  */
    /* JADX WARN: Code duplicated, block: B:463:0x076f  */
    /* JADX WARN: Code duplicated, block: B:464:0x0772  */
    /* JADX WARN: Code duplicated, block: B:465:0x0775  */
    /* JADX WARN: Code duplicated, block: B:466:0x0778  */
    /* JADX WARN: Code duplicated, block: B:467:0x077b  */
    /* JADX WARN: Code duplicated, block: B:468:0x077e  */
    /* JADX WARN: Code duplicated, block: B:469:0x0780  */
    /* JADX WARN: Code duplicated, block: B:470:0x0782  */
    /* JADX WARN: Code duplicated, block: B:471:0x0784  */
    /* JADX WARN: Code duplicated, block: B:472:0x0786  */
    /* JADX WARN: Code duplicated, block: B:474:0x0789  */
    /* JADX WARN: Code duplicated, block: B:476:0x0795  */
    /* JADX WARN: Code duplicated, block: B:478:0x079b A[Catch: NumberFormatException -> 0x07a6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x07a6, blocks: (B:422:0x06e8, B:424:0x06f0, B:426:0x0707, B:478:0x079b), top: B:703:0x06e8 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:703:0x06e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x022a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c8  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        if (r0.equals("09") != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0166, code lost:
    
        if (r0.equals("08") != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        if (r0.equals("07") != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0180, code lost:
    
        if (r0.equals("06") != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018d, code lost:
    
        if (r0.equals("05") != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019a, code lost:
    
        if (r0.equals("04") != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a7, code lost:
    
        if (r0.equals("03") != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b4, code lost:
    
        if (r0.equals("02") != true) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c1, code lost:
    
        if (r0.equals("01") != true) goto L96;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v212 int, still in use, count: 1, list:
      (r1v212 int) from 0x0064: IF  (r1v212 int) != (1567 int)  -> B:14:0x0066 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v212 int, still in use, count: 1, list:
      (r1v212 int) from 0x0064: IF  (r1v212 int) != (1567 int)  -> B:14:0x0066 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bve c(defpackage.bse r25) {
        /*
            Method dump skipped, instruction units count: 3334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvf.c(bse):bve");
    }

    public static agke d(byte b2, byte b3, byte b4, byte b5) {
        return agke.q(new byte[]{1, 1, b2, 2, 1, b3, 3, 1, b4, 4, 1, b5});
    }

    public static String e(byte[] bArr) {
        int length = bArr.length;
        ahno.I(length >= 17, "Invalid APV CSD length: %s", length);
        byte b2 = bArr[0];
        ahno.I(b2 == 1, "Invalid APV CSD version: %s", b2);
        return bwp.K("apv1.apvf%d.apvl%d.apvb%d", Integer.valueOf(bArr[5] & 255), Integer.valueOf(bArr[6] & 255), Integer.valueOf(bArr[7] & 255));
    }

    public static String f(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String g(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(bwp.K("hvc1.%s%d.%X.%c%d", c[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static boolean h(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = f;
        int length = bArr.length;
        if (iRemaining < 5) {
            return false;
        }
        int iPosition = byteBuffer.position();
        int i = 0;
        while (true) {
            int length2 = bArr.length;
            if (i >= 5) {
                return true;
            }
            if (byteBuffer.get(iPosition + i) != bArr[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean i(byte[] bArr, int i) {
        byte[] bArr2 = f;
        int length = bArr2.length;
        if (i < 5) {
            return false;
        }
        int i2 = 0;
        while (true) {
            int length2 = bArr2.length;
            if (i2 >= 5) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static boolean j(ByteBuffer byteBuffer, int i, int i2) {
        byte[] bArr = e;
        int length = bArr.length;
        if (i2 - i < 6) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i3 >= 6) {
                return true;
            }
            if (byteBuffer.get(i + i3) != bArr[i3]) {
                return false;
            }
            i3++;
        }
    }

    public static int[] k(byte[] bArr) {
        bwb bwbVar = new bwb(bArr);
        bwbVar.P(5);
        int iN = bwbVar.n();
        bwbVar.P(9);
        int iN2 = bwbVar.n();
        bwbVar.P(20);
        return new int[]{bwbVar.q(), iN2, iN};
    }

    private static int l(int i, int i2) {
        if (i == 0) {
            return i2 == 0 ? 257 : -1;
        }
        if (i == 1) {
            if (i2 == 0) {
                return 513;
            }
            return i2 == 1 ? 514 : -1;
        }
        if (i != 2) {
            return -1;
        }
        if (i2 == 1) {
            return 1026;
        }
        return i2 == 2 ? 1028 : -1;
    }

    private static int m(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? -1 : 16;
        }
        return 8;
    }
}
