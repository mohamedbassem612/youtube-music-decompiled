package defpackage;

import android.os.Handler;
import androidx.media3.decoder.opus.LibopusAudioRenderer;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yzq extends LibopusAudioRenderer {
    private yxu r;
    private final yye s;

    public yzq() {
        super(new buj[0]);
        this.r = yxu.a;
        this.s = null;
    }

    @Override // defpackage.cgu, defpackage.cav, defpackage.cdm
    public final void A(int i, Object obj) {
        if (i != 10001) {
            super.A(i, obj);
            return;
        }
        yxu yxuVar = (yxu) obj;
        if (yxuVar == null) {
            yxuVar = yxu.a;
        }
        this.r = yxuVar;
    }

    @Override // defpackage.cgu, defpackage.cav
    protected final void E(boolean z, boolean z2) {
        super.E(z, z2);
        this.r.a();
    }

    @Override // defpackage.cgu, defpackage.cav
    public final void K() {
        zcf zcfVar;
        super.K();
        this.r.d();
        yye yyeVar = this.s;
        if (yyeVar == null || (zcfVar = yyeVar.m) == null) {
            return;
        }
        zcfVar.Z.h(zhc.b("audio/opus", true, "LibopusAudioRenderer"));
    }

    @Override // defpackage.cgu, defpackage.cdp
    public final boolean ah() {
        if (!super.ah() && (((cgu) this).l == null || (!Z() && ((cgu) this).m == null))) {
            return false;
        }
        this.r.c();
        return true;
    }

    @Override // defpackage.cgu
    protected final caz ai(String str, bse bseVar, bse bseVar2) {
        yye yyeVar;
        int i = bseVar.I;
        int i2 = bseVar.K;
        int i3 = i != bseVar2.I ? SemanticState.Obscured : 0;
        if (i2 != bseVar2.K) {
            i3 |= SemanticState.Multiline;
        }
        if (i3 == 0 && (yyeVar = this.s) != null && yyeVar.d.j.m(22, 45366616L)) {
            i3 = 4;
        }
        int i4 = i3;
        return new caz(str, bseVar, bseVar2, i4 == 0 ? 3 : 0, i4);
    }

    public yzq(cfx cfxVar, Handler handler, yye yyeVar, cgf cgfVar) {
        super(handler, cfxVar, cgfVar);
        this.r = yxu.a;
        this.s = yyeVar;
    }
}
