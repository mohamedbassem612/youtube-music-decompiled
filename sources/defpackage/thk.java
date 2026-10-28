package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class thk implements thl {
    private final /* synthetic */ int $cid;
    public final boolean a;
    public final ajcd b;

    public thk(tqj tqjVar, tre treVar, awmd awmdVar, int i) {
        byte[] bArrB;
        this.$cid = i;
        int i2 = tqr.a;
        ajcd ajcdVar = null;
        if (tqjVar.k(1073828557)) {
            trd trdVar = treVar.h;
            try {
                byte[] bArrN = tqjVar.n(1610625728, tqjVar.a(1074614976));
                int length = bArrN.length;
                int i3 = length < 4 ? 0 : ((bArrN[length - 1] & 255) << 24) + ((bArrN[length - 2] & 255) << 16) + ((bArrN[length - 3] & 255) << 8) + (bArrN[length - 4] & 255);
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrN, 0, length), Math.min(Math.max(i3, length) + 10, SemanticState.Multiline));
                    try {
                        if (i3 <= 10000000) {
                            bArrB = new byte[i3];
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    int i5 = gZIPInputStream.read();
                                    if (i5 == -1) {
                                        break;
                                    }
                                    bArrB = afxw.L(bArrB, new byte[]{(byte) i5}, agyi.b(gZIPInputStream));
                                    break;
                                }
                                int i6 = gZIPInputStream.read(bArrB, i4, i3 - i4);
                                if (i6 == -1) {
                                    bArrB = Arrays.copyOf(bArrB, i4);
                                    break;
                                }
                                i4 += i6;
                            }
                        } else {
                            bArrB = agyi.b(gZIPInputStream);
                        }
                        gZIPInputStream.close();
                        vyl.d();
                        ajcd ajcdVar2 = (ajcd) aihn.parseFrom(ajcd.a, bArrB, ExtensionRegistryLite.getGeneratedRegistry());
                        trdVar.p(161);
                        ajcdVar = ajcdVar2;
                    } catch (Throwable th) {
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (aiik | RuntimeException unused) {
                trdVar.p(162);
            }
        }
        if (ajcdVar != null) {
            this.b = ajcdVar;
            this.a = tqjVar.k(1073828558);
        } else {
            thk thkVar = (thk) awmdVar.io();
            this.b = thkVar.b;
            this.a = thkVar.a;
        }
    }

    @Override // defpackage.thl
    public final String a() {
        int i = this.$cid;
        return this.b.b;
    }

    @Override // defpackage.thl
    public final List b() {
        int i = this.$cid;
        return this.b.c;
    }

    @Override // defpackage.thl
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.thl
    public final boolean d() {
        int i = this.$cid;
        return this.b.d;
    }

    @Override // defpackage.thl
    public final boolean e() {
        int i = this.$cid;
        return this.b.f;
    }

    @Override // defpackage.thl
    public final boolean f() {
        int i = this.$cid;
        return this.b.e;
    }

    public thk(tao taoVar, int i) {
        this.$cid = i;
        ajcf ajcfVar = taq.b(taoVar.a()).d;
        ajcd ajcdVar = (ajcfVar == null ? ajcf.a : ajcfVar).c;
        this.b = ajcdVar == null ? ajcd.a : ajcdVar;
        this.a = taoVar.d().h;
    }
}
