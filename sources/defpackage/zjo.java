package defpackage;

import androidx.media3.decoder.av1.Dav1dLibrary;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjo {
    public static final /* synthetic */ int a = 0;
    private static final wgs b;
    private static final wgs c;

    static {
        aihh aihhVar = (aihh) alaw.b.createBuilder();
        int i = wgq.DASH_FMP4_AAC_51_HIGH.ep;
        aihhVar.copyOnWrite();
        alaw alawVar = (alaw) aihhVar.instance;
        alawVar.c |= 1;
        alawVar.e = i;
        String str = wgq.DASH_FMP4_AAC_51_HIGH.eq;
        aihhVar.copyOnWrite();
        alaw alawVar2 = (alaw) aihhVar.instance;
        str.getClass();
        alawVar2.c |= 4;
        alawVar2.g = str;
        aihhVar.copyOnWrite();
        alaw alawVar3 = (alaw) aihhVar.instance;
        alawVar3.c |= 8;
        alawVar3.h = 393216;
        aihhVar.copyOnWrite();
        alaw alawVar4 = (alaw) aihhVar.instance;
        alawVar4.d |= 1;
        alawVar4.I = 6;
        aihhVar.copyOnWrite();
        alaw alawVar5 = (alaw) aihhVar.instance;
        alawVar5.c |= Integer.MIN_VALUE;
        alawVar5.H = 48000L;
        b = new wgs((alaw) aihhVar.build(), null, false, null);
        aihh aihhVar2 = (aihh) alaw.b.createBuilder();
        int i2 = wgq.DASH_FMP4_EAC3_51_HIGH.ep;
        aihhVar2.copyOnWrite();
        alaw alawVar6 = (alaw) aihhVar2.instance;
        alawVar6.c |= 1;
        alawVar6.e = i2;
        String str2 = wgq.DASH_FMP4_EAC3_51_HIGH.eq;
        aihhVar2.copyOnWrite();
        alaw alawVar7 = (alaw) aihhVar2.instance;
        str2.getClass();
        alawVar7.c |= 4;
        alawVar7.g = str2;
        aihhVar2.copyOnWrite();
        alaw alawVar8 = (alaw) aihhVar2.instance;
        alawVar8.c |= 8;
        alawVar8.h = 393216;
        aihhVar2.copyOnWrite();
        alaw alawVar9 = (alaw) aihhVar2.instance;
        alawVar9.d |= 1;
        alawVar9.I = 6;
        aihhVar2.copyOnWrite();
        alaw alawVar10 = (alaw) aihhVar2.instance;
        alawVar10.c |= Integer.MIN_VALUE;
        alawVar10.H = 48000L;
        c = new wgs((alaw) aihhVar2.build(), null, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0259  */
    /* JADX WARN: Code duplicated, block: B:118:0x0266  */
    /* JADX WARN: Code duplicated, block: B:120:0x026a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x026c  */
    /* JADX WARN: Code duplicated, block: B:127:0x027a  */
    /* JADX WARN: Code duplicated, block: B:129:0x028a  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x02be  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:152:0x0309  */
    /* JADX WARN: Code duplicated, block: B:157:0x0323  */
    /* JADX WARN: Code duplicated, block: B:159:0x0329  */
    /* JADX WARN: Code duplicated, block: B:161:0x032f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0357  */
    /* JADX WARN: Code duplicated, block: B:179:0x0361 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0363  */
    /* JADX WARN: Code duplicated, block: B:181:0x0364 A[PHI: r0
      0x0364: PHI (r0v23 int) = (r0v22 int), (r0v28 int) binds: [B:178:0x035f, B:180:0x0363] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x037e  */
    /* JADX WARN: Code duplicated, block: B:187:0x039d  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:196:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:207:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:213:0x0425  */
    /* JADX WARN: Code duplicated, block: B:215:0x0429  */
    /* JADX WARN: Code duplicated, block: B:234:0x0489  */
    /* JADX WARN: Code duplicated, block: B:237:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:242:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:248:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0183 A[PHI: r2 r3 r4
      0x0183: PHI (r2v23 java.util.Set) = (r2v9 java.util.Set), (r2v6 java.util.Set) binds: [B:65:0x0181, B:63:0x016a] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r3v38 java.util.Set) = (r3v9 java.util.Set), (r3v6 java.util.Set) binds: [B:65:0x0181, B:63:0x016a] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r4v26 agkj) = (r4v12 agkj), (r4v10 agkj) binds: [B:65:0x0181, B:63:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0186  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0204  */
    /* JADX WARN: Code duplicated, block: B:94:0x020a  */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x035b, code lost:
    
        if (r5.cW() != false) goto L177;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities a(defpackage.wiu r20, defpackage.zjr r21, defpackage.zjl r22, boolean r23, defpackage.agfr r24, defpackage.agfr r25, defpackage.agfr r26) {
        /*
            Method dump skipped, instruction units count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjo.a(wiu, zjr, zjl, boolean, agfr, agfr, agfr):com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities");
    }

    public static void b(wja wjaVar, zjr zjrVar, wiu wiuVar, StringBuilder sb) {
        int i = (wjaVar == null || !wjaVar.K) ? 0 : 1;
        sb.append(';');
        sb.append(Dav1dLibrary.isAvailable() ? 1 : 0);
        sb.append(';');
        sb.append(i ^ 1);
        sb.append(';');
        sb.append(zjrVar.al() ? 1 : 0);
        sb.append(';');
        sb.append(zjrVar.o() <= 0 ? 0 : 1);
        sb.append(';');
        sb.append(zjrVar.cC() ? 1 : 0);
        if (wiuVar != null) {
            sb.append(';');
            sb.append(wiuVar.l ? 1 : 0);
            sb.append(';');
            sb.append(wiuVar.ak() ? 1 : 0);
        }
    }

    public static void c(wja wjaVar, zjr zjrVar, wiu wiuVar, StringBuilder sb) {
        int i = 0;
        if (wjaVar != null && wjaVar.K) {
            i = 1;
        }
        sb.append(';');
        sb.append(i ^ 1);
        sb.append(';');
        sb.append(zjrVar.al() ? 1 : 0);
        sb.append(';');
        sb.append(zjrVar.cC() ? 1 : 0);
        sb.append(';');
        sb.append(zjrVar.aN() ? 1 : 0);
        if (wiuVar != null) {
            sb.append(';');
            sb.append(wiuVar.l ? 1 : 0);
            sb.append(";dmcn;");
            sb.append(wiuVar.V());
            sb.append(";nhmcn;");
            sb.append(wiuVar.W());
            sb.append(";asvcn;");
            sb.append(wiuVar.B());
        }
    }
}
