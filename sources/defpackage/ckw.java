package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ckw extends cav {
    private ckv A;
    private int B;
    private boolean C;
    private final zf D;
    private hhb E;
    private final DecoderInputBuffer k;
    private final ArrayDeque l;
    private boolean m;
    private boolean n;
    private cku o;
    private long p;
    private long q;
    private int r;
    private int s;
    private bse t;
    private ckq u;
    private DecoderInputBuffer v;
    private ImageOutput w;
    private Bitmap x;
    private boolean y;
    private ckv z;

    public ckw(zf zfVar) {
        super(4);
        this.D = zfVar;
        this.w = a(null);
        this.k = DecoderInputBuffer.newNoDataInstance();
        this.o = cku.a;
        this.l = new ArrayDeque();
        this.q = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.r = 0;
        this.s = 1;
    }

    private static ImageOutput a(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.a : imageOutput;
    }

    private final void b() {
        this.v = null;
        this.r = 0;
        this.q = -9223372036854775807L;
        ckq ckqVar = this.u;
        if (ckqVar != null) {
            ckqVar.release();
            this.u = null;
        }
    }

    private final void d() {
        this.s = Math.min(this.s, 1);
    }

    private final void e() throws cbo {
        if (this.C) {
            bse bseVar = this.t;
            bseVar.getClass();
            zf zfVar = this.D;
            int iK = zf.k(bseVar);
            if (iK != 132 && iK != 131) {
                throw q(new ckr(), this.t, false, 4005);
            }
            ckq ckqVar = this.u;
            if (ckqVar != null) {
                ckqVar.release();
            }
            this.u = new ckp((Context) zfVar.a);
            this.C = false;
        }
    }

    @Override // defpackage.cav, defpackage.cdm
    public final void A(int i, Object obj) {
        if (i == 15) {
            this.w = a(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        } else if (i == 23) {
            this.E = (hhb) obj;
        }
    }

    @Override // defpackage.cav
    protected final void D() {
        this.t = null;
        this.o = cku.a;
        this.l.clear();
        b();
        this.w.a();
    }

    @Override // defpackage.cav
    protected final void E(boolean z, boolean z2) {
        this.s = z2 ? 1 : 0;
    }

    @Override // defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        d();
        this.n = false;
        this.m = false;
        this.x = null;
        this.z = null;
        this.A = null;
        this.y = false;
        this.v = null;
        ckq ckqVar = this.u;
        if (ckqVar != null) {
            ckqVar.flush();
        }
        this.l.clear();
    }

    @Override // defpackage.cav
    protected final void H() {
        b();
    }

    @Override // defpackage.cav
    protected final void J() {
        b();
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L13;
     */
    @Override // defpackage.cav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void M(defpackage.bse[] r5, long r6, long r8, defpackage.cnm r10) {
        /*
            r4 = this;
            cku r5 = r4.o
            long r5 = r5.c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L30
            java.util.ArrayDeque r5 = r4.l
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L25
            long r6 = r4.q
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L30
            long r2 = r4.p
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L25
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
        L25:
            cku r6 = new cku
            long r0 = r4.q
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L37
        L30:
            cku r5 = new cku
            r5.<init>(r0, r8)
            r4.o = r5
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckw.M(bse[], long, long, cnm):void");
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:145:0x0272  */
    /* JADX WARN: Code duplicated, block: B:181:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0168 A[ADDED_TO_REGION, EDGE_INSN: B:198:0x0168->B:81:0x0168 BREAK  A[LOOP:2: B:76:0x014b->B:80:0x015f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb A[Catch: ckr -> 0x02cd, TryCatch #0 {ckr -> 0x02cd, blocks: (B:16:0x0040, B:18:0x0046, B:88:0x0192, B:90:0x0196, B:92:0x019a, B:94:0x01a2, B:96:0x01a6, B:98:0x01aa, B:100:0x01ae, B:102:0x01b8, B:104:0x01bc, B:106:0x01d2, B:109:0x01da, B:111:0x01e5, B:118:0x01fb, B:119:0x0211, B:121:0x021c, B:157:0x028b, B:159:0x0294, B:160:0x0299, B:162:0x02a8, B:164:0x02b3, B:163:0x02ab, B:122:0x0222, B:124:0x0235, B:126:0x023e, B:130:0x0247, B:132:0x024b, B:138:0x0258, B:140:0x0263, B:142:0x0267, B:151:0x027c, B:156:0x0285, B:113:0x01eb, B:167:0x02b8, B:20:0x004a, B:22:0x004e, B:25:0x0054, B:27:0x005f, B:29:0x0065, B:31:0x0069, B:32:0x0076, B:34:0x0081, B:35:0x0085, B:36:0x008f, B:38:0x0093, B:40:0x0097, B:42:0x009b, B:44:0x00a4, B:48:0x00ab, B:52:0x00b2, B:59:0x00eb, B:63:0x0100, B:64:0x0105, B:69:0x0110, B:71:0x0114, B:73:0x0128, B:75:0x0138, B:76:0x014b, B:78:0x0153, B:80:0x015f, B:81:0x0168, B:83:0x016c, B:86:0x0186, B:85:0x0184, B:56:0x00bb, B:58:0x00e9), top: B:173:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114 A[Catch: ckr -> 0x02cd, TryCatch #0 {ckr -> 0x02cd, blocks: (B:16:0x0040, B:18:0x0046, B:88:0x0192, B:90:0x0196, B:92:0x019a, B:94:0x01a2, B:96:0x01a6, B:98:0x01aa, B:100:0x01ae, B:102:0x01b8, B:104:0x01bc, B:106:0x01d2, B:109:0x01da, B:111:0x01e5, B:118:0x01fb, B:119:0x0211, B:121:0x021c, B:157:0x028b, B:159:0x0294, B:160:0x0299, B:162:0x02a8, B:164:0x02b3, B:163:0x02ab, B:122:0x0222, B:124:0x0235, B:126:0x023e, B:130:0x0247, B:132:0x024b, B:138:0x0258, B:140:0x0263, B:142:0x0267, B:151:0x027c, B:156:0x0285, B:113:0x01eb, B:167:0x02b8, B:20:0x004a, B:22:0x004e, B:25:0x0054, B:27:0x005f, B:29:0x0065, B:31:0x0069, B:32:0x0076, B:34:0x0081, B:35:0x0085, B:36:0x008f, B:38:0x0093, B:40:0x0097, B:42:0x009b, B:44:0x00a4, B:48:0x00ab, B:52:0x00b2, B:59:0x00eb, B:63:0x0100, B:64:0x0105, B:69:0x0110, B:71:0x0114, B:73:0x0128, B:75:0x0138, B:76:0x014b, B:78:0x0153, B:80:0x015f, B:81:0x0168, B:83:0x016c, B:86:0x0186, B:85:0x0184, B:56:0x00bb, B:58:0x00e9), top: B:173:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0128 A[Catch: ckr -> 0x02cd, TryCatch #0 {ckr -> 0x02cd, blocks: (B:16:0x0040, B:18:0x0046, B:88:0x0192, B:90:0x0196, B:92:0x019a, B:94:0x01a2, B:96:0x01a6, B:98:0x01aa, B:100:0x01ae, B:102:0x01b8, B:104:0x01bc, B:106:0x01d2, B:109:0x01da, B:111:0x01e5, B:118:0x01fb, B:119:0x0211, B:121:0x021c, B:157:0x028b, B:159:0x0294, B:160:0x0299, B:162:0x02a8, B:164:0x02b3, B:163:0x02ab, B:122:0x0222, B:124:0x0235, B:126:0x023e, B:130:0x0247, B:132:0x024b, B:138:0x0258, B:140:0x0263, B:142:0x0267, B:151:0x027c, B:156:0x0285, B:113:0x01eb, B:167:0x02b8, B:20:0x004a, B:22:0x004e, B:25:0x0054, B:27:0x005f, B:29:0x0065, B:31:0x0069, B:32:0x0076, B:34:0x0081, B:35:0x0085, B:36:0x008f, B:38:0x0093, B:40:0x0097, B:42:0x009b, B:44:0x00a4, B:48:0x00ab, B:52:0x00b2, B:59:0x00eb, B:63:0x0100, B:64:0x0105, B:69:0x0110, B:71:0x0114, B:73:0x0128, B:75:0x0138, B:76:0x014b, B:78:0x0153, B:80:0x015f, B:81:0x0168, B:83:0x016c, B:86:0x0186, B:85:0x0184, B:56:0x00bb, B:58:0x00e9), top: B:173:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153 A[Catch: ckr -> 0x02cd, TryCatch #0 {ckr -> 0x02cd, blocks: (B:16:0x0040, B:18:0x0046, B:88:0x0192, B:90:0x0196, B:92:0x019a, B:94:0x01a2, B:96:0x01a6, B:98:0x01aa, B:100:0x01ae, B:102:0x01b8, B:104:0x01bc, B:106:0x01d2, B:109:0x01da, B:111:0x01e5, B:118:0x01fb, B:119:0x0211, B:121:0x021c, B:157:0x028b, B:159:0x0294, B:160:0x0299, B:162:0x02a8, B:164:0x02b3, B:163:0x02ab, B:122:0x0222, B:124:0x0235, B:126:0x023e, B:130:0x0247, B:132:0x024b, B:138:0x0258, B:140:0x0263, B:142:0x0267, B:151:0x027c, B:156:0x0285, B:113:0x01eb, B:167:0x02b8, B:20:0x004a, B:22:0x004e, B:25:0x0054, B:27:0x005f, B:29:0x0065, B:31:0x0069, B:32:0x0076, B:34:0x0081, B:35:0x0085, B:36:0x008f, B:38:0x0093, B:40:0x0097, B:42:0x009b, B:44:0x00a4, B:48:0x00ab, B:52:0x00b2, B:59:0x00eb, B:63:0x0100, B:64:0x0105, B:69:0x0110, B:71:0x0114, B:73:0x0128, B:75:0x0138, B:76:0x014b, B:78:0x0153, B:80:0x015f, B:81:0x0168, B:83:0x016c, B:86:0x0186, B:85:0x0184, B:56:0x00bb, B:58:0x00e9), top: B:173:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x016c A[Catch: ckr -> 0x02cd, TryCatch #0 {ckr -> 0x02cd, blocks: (B:16:0x0040, B:18:0x0046, B:88:0x0192, B:90:0x0196, B:92:0x019a, B:94:0x01a2, B:96:0x01a6, B:98:0x01aa, B:100:0x01ae, B:102:0x01b8, B:104:0x01bc, B:106:0x01d2, B:109:0x01da, B:111:0x01e5, B:118:0x01fb, B:119:0x0211, B:121:0x021c, B:157:0x028b, B:159:0x0294, B:160:0x0299, B:162:0x02a8, B:164:0x02b3, B:163:0x02ab, B:122:0x0222, B:124:0x0235, B:126:0x023e, B:130:0x0247, B:132:0x024b, B:138:0x0258, B:140:0x0263, B:142:0x0267, B:151:0x027c, B:156:0x0285, B:113:0x01eb, B:167:0x02b8, B:20:0x004a, B:22:0x004e, B:25:0x0054, B:27:0x005f, B:29:0x0065, B:31:0x0069, B:32:0x0076, B:34:0x0081, B:35:0x0085, B:36:0x008f, B:38:0x0093, B:40:0x0097, B:42:0x009b, B:44:0x00a4, B:48:0x00ab, B:52:0x00b2, B:59:0x00eb, B:63:0x0100, B:64:0x0105, B:69:0x0110, B:71:0x0114, B:73:0x0128, B:75:0x0138, B:76:0x014b, B:78:0x0153, B:80:0x015f, B:81:0x0168, B:83:0x016c, B:86:0x0186, B:85:0x0184, B:56:0x00bb, B:58:0x00e9), top: B:173:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0184 A[Catch: ckr -> 0x02cd, TryCatch #0 {ckr -> 0x02cd, blocks: (B:16:0x0040, B:18:0x0046, B:88:0x0192, B:90:0x0196, B:92:0x019a, B:94:0x01a2, B:96:0x01a6, B:98:0x01aa, B:100:0x01ae, B:102:0x01b8, B:104:0x01bc, B:106:0x01d2, B:109:0x01da, B:111:0x01e5, B:118:0x01fb, B:119:0x0211, B:121:0x021c, B:157:0x028b, B:159:0x0294, B:160:0x0299, B:162:0x02a8, B:164:0x02b3, B:163:0x02ab, B:122:0x0222, B:124:0x0235, B:126:0x023e, B:130:0x0247, B:132:0x024b, B:138:0x0258, B:140:0x0263, B:142:0x0267, B:151:0x027c, B:156:0x0285, B:113:0x01eb, B:167:0x02b8, B:20:0x004a, B:22:0x004e, B:25:0x0054, B:27:0x005f, B:29:0x0065, B:31:0x0069, B:32:0x0076, B:34:0x0081, B:35:0x0085, B:36:0x008f, B:38:0x0093, B:40:0x0097, B:42:0x009b, B:44:0x00a4, B:48:0x00ab, B:52:0x00b2, B:59:0x00eb, B:63:0x0100, B:64:0x0105, B:69:0x0110, B:71:0x0114, B:73:0x0128, B:75:0x0138, B:76:0x014b, B:78:0x0153, B:80:0x015f, B:81:0x0168, B:83:0x016c, B:86:0x0186, B:85:0x0184, B:56:0x00bb, B:58:0x00e9), top: B:173:0x0040 }] */
    @Override // defpackage.cdp
    public final void af(long j, long j2) throws cbo {
        int i;
        Bitmap bitmapCreateBitmap;
        ckv ckvVar;
        boolean z;
        long j3;
        long j4;
        int i2;
        int i3;
        hhb hhbVar;
        ArrayDeque arrayDeque;
        int i4;
        bse bseVar;
        int i5;
        Object obj;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        if (this.n) {
            return;
        }
        int i8 = -4;
        if (this.t == null) {
            ccu ccuVarR = r();
            DecoderInputBuffer decoderInputBuffer = this.k;
            decoderInputBuffer.clear();
            int iK = k(ccuVarR, decoderInputBuffer, 2);
            if (iK != -5) {
                if (iK == -4) {
                    ahno.O(decoderInputBuffer.isEndOfStream());
                    this.m = true;
                    this.n = true;
                    return;
                }
                return;
            }
            Object obj2 = ccuVarR.b;
            obj2.getClass();
            this.t = (bse) obj2;
            this.C = true;
        }
        if (this.u == null) {
            e();
        }
        while (true) {
            try {
                Bitmap bitmap = this.x;
                i = -1;
                if ((bitmap == null || this.z != null) && (this.s != 0 || this.b == 2)) {
                    if (bitmap == null) {
                        ckq ckqVar = this.u;
                        ckqVar.getClass();
                        ckt cktVarL = ckqVar.l();
                        if (cktVarL != null) {
                            if (!cktVarL.isEndOfStream()) {
                                Bitmap bitmap2 = cktVarL.a;
                                bitmap2.getClass();
                                this.x = bitmap2;
                                cktVarL.release();
                                if (!this.y && (bitmapCreateBitmap = this.x) != null && (ckvVar = this.z) != null) {
                                    bse bseVar2 = this.t;
                                    bseVar2.getClass();
                                    int i9 = bseVar2.Q;
                                    if (i9 == 1) {
                                        if (bseVar2.R != 1) {
                                            if (bseVar2.R != -1) {
                                                z = true;
                                            }
                                        }
                                        if (ckvVar.c != null) {
                                            j3 = 30000;
                                        } else {
                                            if (z) {
                                                int i10 = ckvVar.a;
                                                int width = bitmapCreateBitmap.getWidth();
                                                bse bseVar3 = this.t;
                                                bseVar3.getClass();
                                                int i11 = width / bseVar3.Q;
                                                int height = this.x.getHeight();
                                                j3 = 30000;
                                                bse bseVar4 = this.t;
                                                bseVar4.getClass();
                                                int i12 = height / bseVar4.R;
                                                int i13 = bseVar4.Q;
                                                bitmapCreateBitmap = Bitmap.createBitmap(this.x, (i10 % i13) * i11, (i10 / i13) * i12, i11, i12);
                                            } else {
                                                j3 = 30000;
                                            }
                                            ckvVar.c = bitmapCreateBitmap;
                                        }
                                        ckv ckvVar2 = this.z;
                                        Bitmap bitmap3 = ckvVar2.c;
                                        bitmap3.getClass();
                                        long j5 = ckvVar2.b;
                                        j4 = j5 - j;
                                        i2 = this.b;
                                        i3 = this.s;
                                        if (i3 == 0) {
                                            if (i2 != 2) {
                                                if (j4 >= j3) {
                                                    break;
                                                    break;
                                                }
                                            }
                                        } else if (i3 != 1) {
                                            if (i3 != 3) {
                                                throw new IllegalStateException();
                                            }
                                            if (j4 >= j3) {
                                                break;
                                            }
                                        }
                                        hhbVar = this.E;
                                        if (hhbVar != null) {
                                            long j6 = this.o.c;
                                            this.t.getClass();
                                            obj = hhbVar.a;
                                            if (((ccs) obj).l) {
                                                ((ccs) obj).e.j(37).p();
                                            }
                                        }
                                        this.w.onImageAvailable(j5 - this.o.c, bitmap3);
                                        ckv ckvVar3 = this.z;
                                        ckvVar3.getClass();
                                        long j7 = ckvVar3.b;
                                        this.p = j7;
                                        while (true) {
                                            arrayDeque = this.l;
                                            if (!arrayDeque.isEmpty() || j7 < ((cku) arrayDeque.peek()).b) {
                                                break;
                                            } else {
                                                this.o = (cku) arrayDeque.removeFirst();
                                            }
                                        }
                                        this.s = 3;
                                        if (z) {
                                            ckv ckvVar4 = this.z;
                                            ckvVar4.getClass();
                                            i4 = ckvVar4.a;
                                            bseVar = this.t;
                                            bseVar.getClass();
                                            i5 = bseVar.R;
                                            bseVar.getClass();
                                            if (i4 == (i5 * bseVar.Q) - 1) {
                                                this.x = null;
                                            }
                                        } else {
                                            this.x = null;
                                        }
                                        this.z = this.A;
                                        this.A = null;
                                    } else {
                                        if (i9 != -1) {
                                            if (bseVar2.R != -1) {
                                                z = true;
                                            }
                                        }
                                        if (ckvVar.c != null) {
                                            j3 = 30000;
                                        } else {
                                            if (z) {
                                                int i14 = ckvVar.a;
                                                int width2 = bitmapCreateBitmap.getWidth();
                                                bse bseVar5 = this.t;
                                                bseVar5.getClass();
                                                int i15 = width2 / bseVar5.Q;
                                                int height2 = this.x.getHeight();
                                                j3 = 30000;
                                                bse bseVar6 = this.t;
                                                bseVar6.getClass();
                                                int i16 = height2 / bseVar6.R;
                                                int i17 = bseVar6.Q;
                                                bitmapCreateBitmap = Bitmap.createBitmap(this.x, (i14 % i17) * i15, (i14 / i17) * i16, i15, i16);
                                            } else {
                                                j3 = 30000;
                                            }
                                            ckvVar.c = bitmapCreateBitmap;
                                        }
                                        ckv ckvVar5 = this.z;
                                        Bitmap bitmap4 = ckvVar5.c;
                                        bitmap4.getClass();
                                        long j8 = ckvVar5.b;
                                        j4 = j8 - j;
                                        i2 = this.b;
                                        i3 = this.s;
                                        if (i3 == 0) {
                                            if (i2 != 2) {
                                                if (j4 >= j3) {
                                                    break;
                                                    break;
                                                }
                                            }
                                        } else if (i3 != 1) {
                                            if (i3 != 3) {
                                                throw new IllegalStateException();
                                            }
                                            if (j4 >= j3) {
                                                break;
                                                break;
                                            }
                                        }
                                        hhbVar = this.E;
                                        if (hhbVar != null) {
                                            long j9 = this.o.c;
                                            this.t.getClass();
                                            obj = hhbVar.a;
                                            if (((ccs) obj).l) {
                                                ((ccs) obj).e.j(37).p();
                                            }
                                        }
                                        this.w.onImageAvailable(j8 - this.o.c, bitmap4);
                                        ckv ckvVar6 = this.z;
                                        ckvVar6.getClass();
                                        long j10 = ckvVar6.b;
                                        this.p = j10;
                                        while (true) {
                                            arrayDeque = this.l;
                                            if (arrayDeque.isEmpty()) {
                                                break;
                                            }
                                            break;
                                            break;
                                            this.o = (cku) arrayDeque.removeFirst();
                                        }
                                        this.s = 3;
                                        if (z) {
                                            ckv ckvVar7 = this.z;
                                            ckvVar7.getClass();
                                            i4 = ckvVar7.a;
                                            bseVar = this.t;
                                            bseVar.getClass();
                                            i5 = bseVar.R;
                                            bseVar.getClass();
                                            if (i4 == (i5 * bseVar.Q) - 1) {
                                                this.x = null;
                                            }
                                        } else {
                                            this.x = null;
                                        }
                                        this.z = this.A;
                                        this.A = null;
                                    }
                                    z = false;
                                    if (ckvVar.c != null) {
                                        j3 = 30000;
                                    } else {
                                        if (z) {
                                            int i18 = ckvVar.a;
                                            int width3 = bitmapCreateBitmap.getWidth();
                                            bse bseVar7 = this.t;
                                            bseVar7.getClass();
                                            int i19 = width3 / bseVar7.Q;
                                            int height3 = this.x.getHeight();
                                            j3 = 30000;
                                            bse bseVar8 = this.t;
                                            bseVar8.getClass();
                                            int i110 = height3 / bseVar8.R;
                                            int i111 = bseVar8.Q;
                                            bitmapCreateBitmap = Bitmap.createBitmap(this.x, (i18 % i111) * i19, (i18 / i111) * i110, i19, i110);
                                        } else {
                                            j3 = 30000;
                                        }
                                        ckvVar.c = bitmapCreateBitmap;
                                    }
                                    ckv ckvVar8 = this.z;
                                    Bitmap bitmap5 = ckvVar8.c;
                                    bitmap5.getClass();
                                    long j11 = ckvVar8.b;
                                    j4 = j11 - j;
                                    i2 = this.b;
                                    i3 = this.s;
                                    if (i3 == 0) {
                                        if (i2 != 2) {
                                            if (j4 >= j3) {
                                                break;
                                                break;
                                            }
                                        }
                                    } else if (i3 != 1) {
                                        if (i3 != 3) {
                                            throw new IllegalStateException();
                                        }
                                        if (j4 >= j3) {
                                            break;
                                            break;
                                        }
                                    }
                                    hhbVar = this.E;
                                    if (hhbVar != null) {
                                        long j12 = this.o.c;
                                        this.t.getClass();
                                        obj = hhbVar.a;
                                        if (((ccs) obj).l) {
                                            ((ccs) obj).e.j(37).p();
                                        }
                                    }
                                    this.w.onImageAvailable(j11 - this.o.c, bitmap5);
                                    ckv ckvVar9 = this.z;
                                    ckvVar9.getClass();
                                    long j13 = ckvVar9.b;
                                    this.p = j13;
                                    while (true) {
                                        arrayDeque = this.l;
                                        if (arrayDeque.isEmpty()) {
                                            break;
                                            break;
                                        } else {
                                            break;
                                            break;
                                        }
                                        this.o = (cku) arrayDeque.removeFirst();
                                    }
                                    this.s = 3;
                                    if (z) {
                                        ckv ckvVar10 = this.z;
                                        ckvVar10.getClass();
                                        i4 = ckvVar10.a;
                                        bseVar = this.t;
                                        bseVar.getClass();
                                        i5 = bseVar.R;
                                        bseVar.getClass();
                                        if (i4 == (i5 * bseVar.Q) - 1) {
                                            this.x = null;
                                        }
                                    } else {
                                        this.x = null;
                                    }
                                    this.z = this.A;
                                    this.A = null;
                                }
                            } else if (this.r == 3) {
                                b();
                                this.t.getClass();
                                e();
                            } else {
                                cktVarL.release();
                                if (this.l.isEmpty()) {
                                    this.n = true;
                                }
                            }
                        }
                    } else if (!this.y) {
                    }
                }
                j3 = 30000;
                break;
            } catch (ckr e) {
                throw q(e, null, false, 4003);
            }
        }
        while (true) {
            if (this.y && this.z != null) {
                return;
            }
            ccu ccuVarR2 = r();
            Object obj3 = this.u;
            if (obj3 == null || this.r == 3 || this.m) {
                return;
            }
            DecoderInputBuffer decoderInputBufferDequeueInputBuffer = this.v;
            if (decoderInputBufferDequeueInputBuffer == null) {
                decoderInputBufferDequeueInputBuffer = ((cas) obj3).dequeueInputBuffer();
                this.v = decoderInputBufferDequeueInputBuffer;
                if (decoderInputBufferDequeueInputBuffer == null) {
                    return;
                }
            }
            if (this.r == 2) {
                decoderInputBufferDequeueInputBuffer.getClass();
                decoderInputBufferDequeueInputBuffer.setFlags(4);
                ckq ckqVar2 = this.u;
                ckqVar2.getClass();
                ckqVar2.g(this.v);
                this.v = null;
                this.r = 3;
                return;
            }
            int iK2 = k(ccuVarR2, decoderInputBufferDequeueInputBuffer, 0);
            if (iK2 == -5) {
                i6 = i;
                Object obj4 = ccuVarR2.b;
                obj4.getClass();
                this.t = (bse) obj4;
                this.C = true;
                this.r = 2;
            } else {
                if (iK2 != i8) {
                    return;
                }
                this.v.flip();
                ByteBuffer byteBuffer = this.v.data;
                if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                    DecoderInputBuffer decoderInputBuffer2 = this.v;
                    decoderInputBuffer2.getClass();
                    if (decoderInputBuffer2.isEndOfStream()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = true;
                }
                if (z2) {
                    DecoderInputBuffer decoderInputBuffer3 = this.v;
                    decoderInputBuffer3.getClass();
                    decoderInputBuffer3.format = this.t;
                    ckq ckqVar3 = this.u;
                    ckqVar3.getClass();
                    decoderInputBuffer3.getClass();
                    ckqVar3.g(decoderInputBuffer3);
                    this.B = 0;
                }
                DecoderInputBuffer decoderInputBuffer4 = this.v;
                decoderInputBuffer4.getClass();
                if (decoderInputBuffer4.isEndOfStream()) {
                    this.y = true;
                    i6 = i;
                } else {
                    int i20 = this.B;
                    ckv ckvVar11 = new ckv(i20, decoderInputBuffer4.timeUs);
                    this.A = ckvVar11;
                    this.B = i20 + 1;
                    if (this.y) {
                        i6 = i;
                    } else {
                        long j14 = ckvVar11.b;
                        boolean z4 = (-30000) + j14 <= j && j <= j14 + j3;
                        ckv ckvVar12 = this.z;
                        boolean z5 = ckvVar12 != null && ckvVar12.b <= j && j < j14;
                        bse bseVar9 = this.t;
                        bseVar9.getClass();
                        int i21 = bseVar9.Q;
                        i6 = i;
                        if (i21 == i6 || (i7 = bseVar9.R) == i6) {
                            z3 = true;
                        } else {
                            int i22 = ckvVar11.a;
                            bseVar9.getClass();
                            if (i22 != (i7 * i21) + i6) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        }
                        this.y = z4 || z5 || z3;
                        if (!z5 || z4) {
                        }
                    }
                    this.z = this.A;
                    this.A = null;
                }
                decoderInputBuffer4.getClass();
                if (decoderInputBuffer4.isEndOfStream()) {
                    this.m = true;
                    this.v = null;
                    return;
                }
                long j15 = this.q;
                decoderInputBuffer4.getClass();
                this.q = Math.max(j15, decoderInputBuffer4.timeUs);
                if (z2) {
                    this.v = null;
                } else {
                    DecoderInputBuffer decoderInputBuffer5 = this.v;
                    decoderInputBuffer5.getClass();
                    decoderInputBuffer5.clear();
                }
                if (this.y) {
                    return;
                }
            }
            i = i6;
            i8 = -4;
        }
    }

    @Override // defpackage.cdp
    public final boolean ag() {
        return this.n;
    }

    @Override // defpackage.cdp
    public final boolean ah() {
        int i = this.s;
        if (i != 3) {
            return i == 0 && this.y;
        }
        return true;
    }

    @Override // defpackage.cdq
    public final int c(bse bseVar) {
        return zf.k(bseVar);
    }

    @Override // defpackage.cdp, defpackage.cdq
    public final String f() {
        return "ImageRenderer";
    }
}
