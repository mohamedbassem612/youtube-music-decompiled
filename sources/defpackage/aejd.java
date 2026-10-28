package defpackage;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aejd {
    public final aeoq a;
    public final zwb b;
    public aprv c = aprv.SETTING_CAT_GENERAL_MAIN_APP;
    public aprw d = aprw.VOICE_LANGUAGE;
    public final vxz e;
    public final lqa f;
    public final xpl g;
    private final vxz h;

    public aejd(aeoq aeoqVar, zwb zwbVar, xpl xplVar, lqa lqaVar, vxz vxzVar, vxz vxzVar2) {
        this.a = aeoqVar;
        this.b = zwbVar;
        this.g = xplVar;
        this.f = lqaVar;
        this.h = vxzVar;
        this.e = vxzVar2;
    }

    public static /* synthetic */ aprb a(byte[] bArr) {
        return (aprb) aihn.parseFrom(aprb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
    }

    public final void b() {
        ahcs.f(ahcs.e(((qrx) this.f.a).c(), new aeiw(5), MoreExecutors.directExecutor()), new aajs(this, 20), MoreExecutors.directExecutor()).addListener(new aeia(3), MoreExecutors.directExecutor());
    }

    public final ListenableFuture c(wtr wtrVar) {
        String strEncodeToString;
        if (this.h.l(29, 45391083L, false)) {
            aihf aihfVarCreateBuilder = alyf.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            alyf alyfVar = (alyf) aihfVarCreateBuilder.instance;
            alyfVar.c = 8;
            alyfVar.b |= 1;
            alyf alyfVar2 = (alyf) aihfVarCreateBuilder.build();
            alyfVar2.getClass();
            strEncodeToString = Base64.encodeToString(alyfVar2.toByteArray(), 8);
        } else {
            strEncodeToString = "";
        }
        return afxd.f(ahcs.f(wtrVar.c(wtrVar.a(strEncodeToString)), new aajs(this, 18), MoreExecutors.directExecutor())).h(new aajs(this, 19), MoreExecutors.directExecutor());
    }
}
