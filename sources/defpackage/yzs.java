package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yzs extends chj {
    private final yye H;
    private yxu I;

    public yzs(Context context, cfx cfxVar, yye yyeVar, Handler handler, yzl yzlVar, cgf cgfVar, cli cliVar) {
        super(context, cliVar, yzlVar, false, handler, cfxVar, cgfVar);
        this.I = yxu.a;
        this.H = yyeVar;
        yyeVar.d.dC();
    }

    @Override // defpackage.chj, defpackage.cls, defpackage.cav, defpackage.cdm
    public final void A(int i, Object obj) {
        if (i != 10001) {
            super.A(i, obj);
            return;
        }
        yxu yxuVar = (yxu) obj;
        if (yxuVar == null) {
            yxuVar = yxu.a;
        }
        this.I = yxuVar;
    }

    @Override // defpackage.chj, defpackage.cls, defpackage.cav
    protected final void E(boolean z, boolean z2) {
        super.E(z, z2);
        this.I.a();
    }

    @Override // defpackage.chj, defpackage.cav
    public final void K() {
        super.K();
        this.I.d();
    }

    @Override // defpackage.cls
    protected final void aG(DecoderInputBuffer decoderInputBuffer) {
        this.I.b();
    }

    @Override // defpackage.cls
    protected final boolean aN(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    @Override // defpackage.chj, defpackage.cls, defpackage.cdp
    public final boolean ah() {
        if (!super.ah() && !aM()) {
            return false;
        }
        this.I.c();
        return true;
    }

    @Override // defpackage.chj, defpackage.cls
    protected final void ax(String str, gmj gmjVar, long j, long j2) {
        super.ax(str, gmjVar, j, j2);
        zcf zcfVar = this.H.m;
        if (zcfVar != null) {
            zhc zhcVarA = zhc.a(this.x);
            ywn ywnVar = zcfVar.Z;
            ywnVar.h(zhcVarA);
            if (zcfVar.H.dw()) {
                ywnVar.w("rbrd", "codec_created.a;name.".concat(str));
            }
        }
    }
}
