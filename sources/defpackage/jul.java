package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jul implements jva {
    private final cli a;
    private final clu b;
    private final ctp d;
    private cay f;
    private bse g;
    private Surface h;
    private cju i;
    private clk j;
    private clo k;
    private ctd l;
    private boolean m;
    private MediaCrypto n;
    private boolean p;
    private boolean q;
    private long s;
    private int t;
    private int u;
    private bse[] x;
    private final yyg y;
    private int o = -1;
    private String r = "MediaCodec(Hardware)";
    private float v = 1.0f;
    private int w = 1;
    private final MediaCodec.BufferInfo c = new MediaCodec.BufferInfo();
    private final ctn e = new ctn();

    public jul(Context context, yyg yygVar, cli cliVar, clu cluVar) {
        this.y = yygVar;
        this.a = cliVar;
        this.b = cluVar;
        this.d = new ctp(context, new juk(), 0L);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7 A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:11:0x001c, B:13:0x0020, B:14:0x0022, B:16:0x0026, B:17:0x002b, B:19:0x0030, B:21:0x0038, B:22:0x0048, B:24:0x0050, B:26:0x005a, B:28:0x0067, B:29:0x006d, B:33:0x007d, B:37:0x0084, B:39:0x008c, B:40:0x0091, B:42:0x0095, B:43:0x009a, B:47:0x00a7, B:48:0x00ac, B:51:0x00b4, B:53:0x00ba, B:55:0x00c2, B:61:0x00d1, B:63:0x00d7, B:65:0x00df, B:67:0x00e9, B:68:0x00ec, B:71:0x00f2, B:72:0x00f7, B:75:0x0101, B:77:0x0107, B:79:0x011f, B:81:0x0125, B:83:0x012d, B:85:0x0135, B:89:0x013e, B:91:0x0146, B:92:0x014a, B:93:0x014e, B:98:0x015a, B:100:0x0162, B:101:0x0166, B:102:0x016a, B:104:0x0172, B:106:0x017a, B:107:0x017e, B:108:0x0181, B:110:0x0185, B:112:0x018b, B:122:0x01ac, B:113:0x0196, B:115:0x019c, B:117:0x01a2), top: B:141:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00df A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:11:0x001c, B:13:0x0020, B:14:0x0022, B:16:0x0026, B:17:0x002b, B:19:0x0030, B:21:0x0038, B:22:0x0048, B:24:0x0050, B:26:0x005a, B:28:0x0067, B:29:0x006d, B:33:0x007d, B:37:0x0084, B:39:0x008c, B:40:0x0091, B:42:0x0095, B:43:0x009a, B:47:0x00a7, B:48:0x00ac, B:51:0x00b4, B:53:0x00ba, B:55:0x00c2, B:61:0x00d1, B:63:0x00d7, B:65:0x00df, B:67:0x00e9, B:68:0x00ec, B:71:0x00f2, B:72:0x00f7, B:75:0x0101, B:77:0x0107, B:79:0x011f, B:81:0x0125, B:83:0x012d, B:85:0x0135, B:89:0x013e, B:91:0x0146, B:92:0x014a, B:93:0x014e, B:98:0x015a, B:100:0x0162, B:101:0x0166, B:102:0x016a, B:104:0x0172, B:106:0x017a, B:107:0x017e, B:108:0x0181, B:110:0x0185, B:112:0x018b, B:122:0x01ac, B:113:0x0196, B:115:0x019c, B:117:0x01a2), top: B:141:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    private final int t(bse bseVar) {
        int i;
        boolean zN;
        float fB;
        int i2;
        Surface surface;
        ctd ctdVarU;
        float fMin;
        cli cliVar = this.a;
        if (cliVar == null) {
            bvx.c("MediaCodecDecoderEngine", "MediaCodecAdapter.Factory is null; cannot initialize hardware MediaCodec");
            return 1;
        }
        String str = bseVar.q;
        if (str == null) {
            bvx.c("MediaCodecDecoderEngine", "Format sampleMimeType is null");
            return 1;
        }
        try {
            clu cluVar = this.b;
            if (cluVar == null) {
                cluVar = clu.a;
            }
            MediaCrypto mediaCrypto = this.n;
            if (mediaCrypto != null) {
                mediaCrypto.release();
                this.n = null;
            }
            cju cjuVar = this.i;
            if (cjuVar != null) {
                CryptoConfig cryptoConfigB = cjuVar.b();
                if (cryptoConfigB instanceof cke) {
                    this.n = new MediaCrypto(((cke) cryptoConfigB).b, ((cke) cryptoConfigB).c);
                }
                zN = this.i.n(str);
            } else {
                zN = false;
            }
            List listA = cluVar.a(str, zN, false);
            if (listA.isEmpty()) {
                bvx.c("MediaCodecDecoderEngine", a.ce(str, "No decoder infos found for mimeType: "));
                MediaCrypto mediaCrypto2 = this.n;
                if (mediaCrypto2 == null) {
                    return 1;
                }
                mediaCrypto2.release();
                this.n = null;
                return 1;
            }
            clo cloVar = (clo) listA.get(0);
            this.k = cloVar;
            int i3 = bseVar.w;
            int i4 = i3 != -1 ? i3 : 0;
            int i5 = bseVar.x;
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i4, i5 != -1 ? i5 : 0);
            int i6 = this.t;
            if (i6 > 0) {
                mediaFormatCreateVideoFormat.setInteger("max-width", i6);
            }
            int i7 = this.u;
            if (i7 > 0) {
                mediaFormatCreateVideoFormat.setInteger("max-height", i7);
            }
            float fMin2 = bseVar.A;
            if (fMin2 != -1.0f && fMin2 > 0.0f) {
                mediaFormatCreateVideoFormat.setFloat("frame-rate", fMin2);
            }
            yyg yygVar = this.y;
            if (yygVar == null) {
                fB = 30.0f;
                if (fMin2 != -1.0f && fMin2 > 0.0f) {
                    fB = fMin2;
                }
                fMin = this.v * fB;
                if (yygVar != null) {
                    yygVar = null;
                } else if (yygVar.c() > 0.0f) {
                    fMin = Math.min(fMin, yygVar.c());
                }
                mediaFormatCreateVideoFormat.setFloat("operating-rate", fMin);
            } else if (!yygVar.P()) {
                if (yygVar.b() > 0.0f) {
                    fB = yygVar.b();
                } else {
                    fB = 30.0f;
                    if (fMin2 != -1.0f) {
                        fB = fMin2;
                    }
                }
                fMin = this.v * fB;
                if (yygVar != null) {
                    yygVar = null;
                } else if (yygVar.c() > 0.0f) {
                    fMin = Math.min(fMin, yygVar.c());
                }
                mediaFormatCreateVideoFormat.setFloat("operating-rate", fMin);
            }
            int i8 = bseVar.B;
            if (i8 != -1 && i8 != 0) {
                mediaFormatCreateVideoFormat.setInteger("rotation-degrees", i8);
            }
            atv.g(mediaFormatCreateVideoFormat, bseVar.G);
            List list = bseVar.t;
            if (list != null) {
                for (int i9 = 0; i9 < list.size(); i9++) {
                    mediaFormatCreateVideoFormat.setByteBuffer(a.bR(i9, "csd-"), ByteBuffer.wrap((byte[]) list.get(i9)));
                }
            }
            if (yygVar != null && !yygVar.P()) {
                float fA = yygVar.a();
                if (fA > 0.0f) {
                    float fC = yygVar.c();
                    if (fC > 0.0f) {
                        fA = Math.min(fA, fC);
                    }
                    if (i3 != -1 && i5 != -1) {
                        float fA2 = cloVar.a(i3, i5);
                        if (fA2 > 0.0f) {
                            fA = Math.min(fA, fA2);
                        }
                    }
                    mediaFormatCreateVideoFormat.setFloat("operating-rate", fA);
                } else if (!yygVar.x()) {
                    float fB2 = yygVar.b();
                    if (fB2 > 0.0f) {
                        float fC2 = yygVar.c();
                        if (fC2 > 0.0f) {
                            fB2 = Math.min(fB2, fC2);
                        }
                        mediaFormatCreateVideoFormat.setFloat("operating-rate", fB2);
                    }
                } else if (fMin2 != -1.0f && fMin2 > 0.0f) {
                    float fC3 = yygVar.c();
                    if (fC3 > 0.0f) {
                        fMin2 = Math.min(fMin2, fC3);
                    }
                    mediaFormatCreateVideoFormat.setFloat("operating-rate", fMin2);
                }
            }
            Surface surface2 = this.h;
            if (surface2 != null && surface2.isValid()) {
                x();
                this.m = false;
                surface = this.h;
                i2 = 0;
            } else if (!y(cloVar) || (ctdVarU = u(cloVar)) == null) {
                i2 = 0;
                i = 1;
                try {
                    this.m = true;
                    surface = null;
                } catch (Exception e) {
                    e = e;
                    bvx.d("MediaCodecDecoderEngine", "Failed to initialize MediaCodecAdapter via factory", e);
                    MediaCrypto mediaCrypto3 = this.n;
                    if (mediaCrypto3 != null) {
                        mediaCrypto3.release();
                        this.n = null;
                    }
                    x();
                    return i;
                }
            } else {
                i2 = 0;
                this.m = false;
                surface = ctdVarU;
            }
            this.j = cliVar.b(new gmj(cloVar, mediaFormatCreateVideoFormat, bseVar, surface, this.n, (mgk) null));
            this.r = "MediaCodec(" + cloVar.b + ')';
            clk clkVar = this.j;
            if (clkVar != null) {
                int i10 = this.w;
                if (i10 == 1) {
                    return i2;
                }
                clkVar.n(i10);
                return i2;
            }
            bvx.c("MediaCodecDecoderEngine", "MediaCodecAdapter created by factory is null");
            MediaCrypto mediaCrypto4 = this.n;
            if (mediaCrypto4 != null) {
                mediaCrypto4.release();
                this.n = null;
            }
            x();
            return 1;
        } catch (Exception e2) {
            e = e2;
            i = 1;
        }
    }

    private final ctd u(clo cloVar) {
        ctd ctdVar = this.l;
        if (ctdVar != null) {
            if (ctdVar.a != cloVar.h) {
                x();
            }
        }
        if (this.l == null) {
            try {
                this.l = ctd.b(cloVar.h);
            } catch (RuntimeException e) {
                bvx.f("MediaCodecDecoderEngine", "Failed to create PlaceholderSurface", e);
            }
        }
        return this.l;
    }

    private final void v() {
        cay cayVar;
        w();
        bse bseVar = this.g;
        if (bseVar == null || this.a == null || t(bseVar) != 0 || (cayVar = this.f) == null) {
            return;
        }
        cayVar.a++;
    }

    private final void w() {
        this.o = -1;
        clk clkVar = this.j;
        if (clkVar != null) {
            try {
                clkVar.i();
            } catch (MediaCodec.CryptoException | IllegalStateException e) {
                bvx.f("MediaCodecDecoderEngine", "Failed to release MediaCodec", e);
            }
            this.j = null;
            cay cayVar = this.f;
            if (cayVar != null) {
                cayVar.b++;
            }
        }
        MediaCrypto mediaCrypto = this.n;
        if (mediaCrypto != null) {
            mediaCrypto.release();
            this.n = null;
        }
        x();
    }

    private final void x() {
        ctd ctdVar = this.l;
        if (ctdVar != null) {
            ctdVar.release();
            this.l = null;
        }
    }

    private final boolean y(clo cloVar) {
        yyg yygVar = this.y;
        if (yygVar == null || !yygVar.O()) {
            return !cloVar.h || ctd.a();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jva
    public final int a(bse bseVar, Surface surface, cju cjuVar, cay cayVar) {
        yyg yygVar;
        this.g = bseVar;
        this.h = surface;
        this.i = cjuVar;
        this.f = cayVar;
        int iMax = bseVar.w;
        if (iMax == -1) {
            iMax = 0;
        }
        int iMax2 = bseVar.x;
        if (iMax2 == -1) {
            iMax2 = 0;
        }
        bse[] bseVarArr = this.x;
        if (bseVarArr != null && (bseVarArr.length) > 1) {
            for (bse bseVar2 : bseVarArr) {
                if (bseVar2 != null && Objects.equals(bseVar.q, bseVar2.q)) {
                    int i = bseVar2.w;
                    if (i != -1) {
                        iMax = Math.max(iMax, i);
                    }
                    int i2 = bseVar2.x;
                    if (i2 != -1) {
                        iMax2 = Math.max(iMax2, i2);
                    }
                }
            }
        }
        this.t = iMax;
        this.u = iMax2;
        this.p = false;
        this.q = false;
        this.o = -1;
        String str = bseVar.q;
        if (str == null) {
            str = "unknown";
        }
        this.r = "MediaCodec(" + str + ')';
        if (cayVar != null) {
            cayVar.a++;
        }
        if (surface != null && !surface.isValid() && (yygVar = this.y) != null) {
            yyf yyfVar = yygVar.d;
            if (!(yyfVar != null ? yyfVar.o : yygVar.a.d.aw())) {
                if (this.j == null) {
                }
                ctp ctpVar = this.d;
                ctpVar.j(surface);
                ctpVar.b = bvd.a;
                ctpVar.g(0);
                ctpVar.e();
                return 0;
            }
            ?? J = yygVar.j();
            if (J instanceof ywn) {
                yygVar.b.r(surface, zsf.c, false, J);
            }
        } else if (this.j == null || t(bseVar) == 0) {
            ctp ctpVar2 = this.d;
            ctpVar2.j(surface);
            ctpVar2.b = bvd.a;
            ctpVar2.g(0);
            ctpVar2.e();
            return 0;
        }
        return 1;
    }

    @Override // defpackage.jva
    public final bse b() {
        return this.g;
    }

    @Override // defpackage.jva
    public final String c() {
        return this.r;
    }

    @Override // defpackage.jva
    public final void d() {
        this.p = false;
        this.q = false;
        this.o = -1;
        this.d.h();
        clk clkVar = this.j;
        if (clkVar != null) {
            try {
                clkVar.h();
            } catch (MediaCodec.CryptoException | IllegalStateException e) {
                bvx.f("MediaCodecDecoderEngine", "Failed to flush MediaCodec", e);
            }
        }
    }

    @Override // defpackage.jva
    public final void e() {
        this.o = -1;
        this.q = false;
        this.d.h();
        clk clkVar = this.j;
        if (clkVar != null) {
            try {
                clkVar.i();
            } catch (MediaCodec.CryptoException | IllegalStateException e) {
                bvx.f("MediaCodecDecoderEngine", "Failed to release MediaCodec", e);
            }
            this.j = null;
        }
        MediaCrypto mediaCrypto = this.n;
        if (mediaCrypto != null) {
            mediaCrypto.release();
            this.n = null;
        }
        x();
        this.h = null;
        this.k = null;
        this.m = false;
        this.i = null;
        this.g = null;
        cay cayVar = this.f;
        if (cayVar != null) {
            cayVar.b++;
        }
    }

    @Override // defpackage.jva
    public final void f(cju cjuVar) {
        this.i = cjuVar;
    }

    @Override // defpackage.jva
    public final void h(Surface surface) {
        cay cayVar;
        yyg yygVar;
        Surface surface2 = this.h;
        if (!Objects.equals(surface2, surface)) {
            this.p = false;
        }
        this.h = surface;
        this.d.j(surface);
        if (surface == null || !surface.isValid()) {
            if (this.j == null || surface2 == null) {
                return;
            }
            clo cloVar = this.k;
            if (cloVar == null || !y(cloVar)) {
                if (this.a != null) {
                    w();
                    return;
                }
                return;
            }
            ctd ctdVarU = u(this.k);
            if (ctdVarU == null) {
                if (this.a != null) {
                    w();
                    return;
                }
                return;
            }
            try {
                this.j.l(ctdVarU);
                return;
            } catch (IllegalArgumentException | IllegalStateException e) {
                bvx.f("MediaCodecDecoderEngine", "Failed to set placeholder surface on MediaCodec; releasing codec", e);
                if (this.a != null) {
                    w();
                    return;
                }
                return;
            }
        }
        if (this.j == null) {
            bse bseVar = this.g;
            if (bseVar == null || this.a == null || t(bseVar) != 0 || (cayVar = this.f) == null) {
                return;
            }
            cayVar.a++;
            return;
        }
        if (this.a != null && (this.m || ((yygVar = this.y) != null && yygVar.O()))) {
            v();
            return;
        }
        try {
            this.j.l(surface);
            x();
        } catch (IllegalArgumentException | IllegalStateException e2) {
            bvx.f("MediaCodecDecoderEngine", "Failed to set output surface on MediaCodec; re-initializing codec", e2);
            if (this.a != null) {
                v();
            }
        }
    }

    @Override // defpackage.jva
    public final void i(int i) {
        this.w = i;
        clk clkVar = this.j;
        if (clkVar != null) {
            clkVar.n(i);
        }
    }

    @Override // defpackage.jva
    public final void j(bse[] bseVarArr) {
        this.x = bseVarArr;
    }

    @Override // defpackage.jva
    public final void k(long j) {
        this.s = j;
    }

    @Override // defpackage.jva
    public final void l() {
        clk clkVar = this.j;
        if (clkVar == null || this.q) {
            this.q = true;
            return;
        }
        try {
            int iA = clkVar.a();
            if (iA >= 0) {
                this.j.t(iA, 0, 0L, 4);
            }
        } catch (IllegalStateException e) {
            bvx.f("MediaCodecDecoderEngine", "Failed to signal EOS to MediaCodec", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f A[Catch: CryptoException -> 0x00d3, CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, IllegalStateException -> 0x00d7, cbo -> 0x00d9, TryCatch #2 {CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, blocks: (B:13:0x001a, B:15:0x001f, B:19:0x002c, B:20:0x003c, B:22:0x003f, B:24:0x0045, B:26:0x004b, B:28:0x0057, B:32:0x005e, B:37:0x006d, B:44:0x0095, B:50:0x00bb, B:52:0x00bf, B:54:0x00ca, B:56:0x00ce, B:45:0x00a5, B:46:0x00af, B:49:0x00b4), top: B:69:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d A[Catch: CryptoException -> 0x00d3, CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, IllegalStateException -> 0x00d7, cbo -> 0x00d9, TryCatch #2 {CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, blocks: (B:13:0x001a, B:15:0x001f, B:19:0x002c, B:20:0x003c, B:22:0x003f, B:24:0x0045, B:26:0x004b, B:28:0x0057, B:32:0x005e, B:37:0x006d, B:44:0x0095, B:50:0x00bb, B:52:0x00bf, B:54:0x00ca, B:56:0x00ce, B:45:0x00a5, B:46:0x00af, B:49:0x00b4), top: B:69:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5 A[Catch: CryptoException -> 0x00d3, CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, IllegalStateException -> 0x00d7, cbo -> 0x00d9, TryCatch #2 {CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, blocks: (B:13:0x001a, B:15:0x001f, B:19:0x002c, B:20:0x003c, B:22:0x003f, B:24:0x0045, B:26:0x004b, B:28:0x0057, B:32:0x005e, B:37:0x006d, B:44:0x0095, B:50:0x00bb, B:52:0x00bf, B:54:0x00ca, B:56:0x00ce, B:45:0x00a5, B:46:0x00af, B:49:0x00b4), top: B:69:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00af A[Catch: CryptoException -> 0x00d3, CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, IllegalStateException -> 0x00d7, cbo -> 0x00d9, TryCatch #2 {CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, blocks: (B:13:0x001a, B:15:0x001f, B:19:0x002c, B:20:0x003c, B:22:0x003f, B:24:0x0045, B:26:0x004b, B:28:0x0057, B:32:0x005e, B:37:0x006d, B:44:0x0095, B:50:0x00bb, B:52:0x00bf, B:54:0x00ca, B:56:0x00ce, B:45:0x00a5, B:46:0x00af, B:49:0x00b4), top: B:69:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf A[Catch: CryptoException -> 0x00d3, CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, IllegalStateException -> 0x00d7, cbo -> 0x00d9, TryCatch #2 {CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, blocks: (B:13:0x001a, B:15:0x001f, B:19:0x002c, B:20:0x003c, B:22:0x003f, B:24:0x0045, B:26:0x004b, B:28:0x0057, B:32:0x005e, B:37:0x006d, B:44:0x0095, B:50:0x00bb, B:52:0x00bf, B:54:0x00ca, B:56:0x00ce, B:45:0x00a5, B:46:0x00af, B:49:0x00b4), top: B:69:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca A[Catch: CryptoException -> 0x00d3, CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, IllegalStateException -> 0x00d7, cbo -> 0x00d9, TryCatch #2 {CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, blocks: (B:13:0x001a, B:15:0x001f, B:19:0x002c, B:20:0x003c, B:22:0x003f, B:24:0x0045, B:26:0x004b, B:28:0x0057, B:32:0x005e, B:37:0x006d, B:44:0x0095, B:50:0x00bb, B:52:0x00bf, B:54:0x00ca, B:56:0x00ce, B:45:0x00a5, B:46:0x00af, B:49:0x00b4), top: B:69:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce A[Catch: CryptoException -> 0x00d3, CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, IllegalStateException -> 0x00d7, cbo -> 0x00d9, TRY_LEAVE, TryCatch #2 {CryptoException | cbo | IllegalArgumentException | IllegalStateException -> 0x00d5, blocks: (B:13:0x001a, B:15:0x001f, B:19:0x002c, B:20:0x003c, B:22:0x003f, B:24:0x0045, B:26:0x004b, B:28:0x0057, B:32:0x005e, B:37:0x006d, B:44:0x0095, B:50:0x00bb, B:52:0x00bf, B:54:0x00ca, B:56:0x00ce, B:45:0x00a5, B:46:0x00af, B:49:0x00b4), top: B:69:0x001a }] */
    @Override // defpackage.jva
    public final boolean m(long j, long j2) {
        Surface surface;
        clk clkVar;
        MediaCodec.BufferInfo bufferInfo;
        boolean z;
        boolean z2;
        ctn ctnVar;
        int iA;
        if (this.q || (surface = this.h) == null || !surface.isValid() || this.f == null || (clkVar = this.j) == null) {
            return false;
        }
        try {
            if (this.o == -1) {
                int iB = clkVar.b(this.c);
                this.o = iB;
                if (iB >= 0) {
                    bufferInfo = this.c;
                    if (bufferInfo.size != 0 && (bufferInfo.flags & 4) != 0) {
                        this.q = true;
                        this.j.k(this.o, false);
                        this.o = -1;
                        return false;
                    }
                    if (bufferInfo.size != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long j3 = bufferInfo.presentationTimeUs;
                    if ((bufferInfo.flags & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        ctp ctpVar = this.d;
                        long j4 = bufferInfo.presentationTimeUs;
                        long j5 = this.s;
                        ctnVar = this.e;
                        iA = ctpVar.a(j4, j, j2, j5, false, z2, -9223372036854775807L, -1L, false, ctnVar);
                        if (iA != 0 || iA == 1) {
                            this.j.j(this.o, ctnVar.b);
                        } else {
                            if (iA != 2 && iA != 3) {
                                return false;
                            }
                            this.j.k(this.o, false);
                            this.f.g++;
                            z = false;
                        }
                    } else {
                        if (this.p) {
                            z = false;
                        }
                        this.j.k(this.o, false);
                    }
                    this.o = -1;
                    if (z) {
                        this.f.e++;
                        if (!this.p) {
                            this.p = true;
                        }
                    }
                    if (z2) {
                        this.q = true;
                        return false;
                    }
                } else {
                    if (iB != -2) {
                        this.o = -1;
                        return false;
                    }
                    this.j.c();
                    this.j.n(this.w);
                    this.o = -1;
                }
            } else {
                bufferInfo = this.c;
                if (bufferInfo.size != 0) {
                }
                if (bufferInfo.size != 0) {
                    z = true;
                } else {
                    z = false;
                }
                long j6 = bufferInfo.presentationTimeUs;
                if ((bufferInfo.flags & 4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    ctp ctpVar2 = this.d;
                    long j7 = bufferInfo.presentationTimeUs;
                    long j8 = this.s;
                    ctnVar = this.e;
                    iA = ctpVar2.a(j7, j, j2, j8, false, z2, -9223372036854775807L, -1L, false, ctnVar);
                    if (iA != 0) {
                        this.j.j(this.o, ctnVar.b);
                    } else {
                        this.j.j(this.o, ctnVar.b);
                    }
                } else {
                    if (this.p) {
                        z = false;
                    }
                    this.j.k(this.o, false);
                }
                this.o = -1;
                if (z) {
                    this.f.e++;
                    if (!this.p) {
                        this.p = true;
                    }
                }
                if (z2) {
                    this.q = true;
                    return false;
                }
            }
            return true;
        } catch (MediaCodec.CryptoException | cbo | IllegalArgumentException | IllegalStateException e) {
            this.o = -1;
            throw new IllegalStateException("Failed to drain output buffer from MediaCodec", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    @Override // defpackage.jva
    public final boolean n(DecoderInputBuffer decoderInputBuffer) {
        boolean z;
        if (this.g == null || this.f == null || this.j == null) {
            return false;
        }
        yyg yygVar = this.y;
        if (yygVar == null) {
            z = false;
        } else {
            yyf yyfVar = yygVar.d;
            if (yyfVar != null ? yyfVar.c : yygVar.a.d.cu()) {
                z = true;
            } else {
                z = false;
            }
        }
        try {
            int iA = this.j.a();
            if (iA < 0) {
                return false;
            }
            ByteBuffer byteBufferE = this.j.e(iA);
            if (byteBufferE != null && decoderInputBuffer.data != null) {
                if (byteBufferE.remaining() < decoderInputBuffer.data.remaining()) {
                    if (z) {
                        throw new IllegalStateException("Input buffer overflow: " + decoderInputBuffer.data.remaining() + " bytes exceed capacity of " + byteBufferE.remaining());
                    }
                    bvx.c("MediaCodecDecoderEngine", "Input buffer overflow: " + decoderInputBuffer.data.remaining() + " bytes exceed capacity of " + byteBufferE.remaining());
                    return false;
                }
                ByteBuffer byteBuffer = decoderInputBuffer.data;
                int iPosition = byteBuffer.position();
                byteBufferE.put(byteBuffer);
                byteBuffer.position(iPosition);
            }
            int i = true != decoderInputBuffer.isEndOfStream() ? 0 : 4;
            if (decoderInputBuffer.isEncrypted()) {
                this.j.u(iA, decoderInputBuffer.cryptoInfo, decoderInputBuffer.timeUs, i);
            } else {
                ByteBuffer byteBuffer2 = decoderInputBuffer.data;
                this.j.t(iA, byteBuffer2 != null ? byteBuffer2.limit() : 0, decoderInputBuffer.timeUs, i);
            }
            this.f.c++;
            return true;
        } catch (MediaCodec.CryptoException | IllegalArgumentException | IllegalStateException e) {
            if (z && (e instanceof IllegalStateException) && e.getMessage() != null && e.getMessage().startsWith("Input buffer overflow")) {
                throw e;
            }
            throw new IllegalStateException("Failed to feed input buffer to MediaCodec", e);
        }
    }

    @Override // defpackage.jva
    public final boolean o() {
        return this.o != -1;
    }

    @Override // defpackage.jva
    public final boolean p() {
        return this.q;
    }

    @Override // defpackage.jva
    public final boolean q() {
        return this.p;
    }

    @Override // defpackage.jva
    public final boolean r(bse bseVar) {
        bse bseVar2;
        String str;
        if (Objects.equals(this.g, bseVar)) {
            return true;
        }
        yyg yygVar = this.y;
        if ((yygVar == null || yygVar.Q()) && (bseVar2 = this.g) != null && (str = bseVar.q) != null && str.equals(bseVar2.q)) {
            int i = bseVar.w;
            if (i == -1) {
                i = 0;
            }
            int i2 = bseVar.x;
            if (i2 == -1) {
                i2 = 0;
            }
            if (i <= this.t && i2 <= this.u) {
                this.g = bseVar;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jva
    public final void s(float f) {
        this.v = f;
        yyg yygVar = this.y;
        if ((yygVar == null || !yygVar.P()) && this.j != null) {
            bse bseVar = this.g;
            float f2 = 30.0f;
            if (bseVar != null) {
                float f3 = bseVar.A;
                if (f3 > 0.0f) {
                    f2 = f3;
                }
            }
            float fMin = f * f2;
            if (yygVar != null && yygVar.c() > 0.0f) {
                fMin = Math.min(fMin, yygVar.c());
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMin);
            this.j.m(bundle);
        }
    }

    @Override // defpackage.jva
    public final /* synthetic */ void g(long j) {
    }
}
