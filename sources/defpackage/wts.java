package defpackage;

import android.net.NetworkInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wts extends wlu {
    private final String a;
    private final tfq b;
    private final tqa c;

    public wts(abxv abxvVar, zwa zwaVar, String str, tfq tfqVar, tqa tqaVar) {
        super("account/get_setting", abxvVar, zwaVar, 1, true, null, null);
        m();
        this.a = str;
        this.b = tfqVar;
        this.c = tqaVar;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        NetworkInfo networkInfo;
        aihf aihfVarCreateBuilder = alxz.a.createBuilder();
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxz alxzVar = (alxz) aihfVarCreateBuilder.instance;
            alxzVar.b |= 2;
            alxzVar.d = str;
        }
        aihf aihfVarCreateBuilder2 = alxy.a.createBuilder();
        tof tofVar = this.b.c;
        if (tofVar.d()) {
            networkInfo = tofVar.a.getNetworkInfo(0);
        } else {
            if (tofVar.c) {
                tofVar.b = tofVar.a.getNetworkInfo(0);
                tofVar.c = false;
            }
            networkInfo = tofVar.b;
        }
        boolean z = networkInfo != null;
        aihfVarCreateBuilder2.copyOnWrite();
        alxy alxyVar = (alxy) aihfVarCreateBuilder2.instance;
        alxyVar.b |= 1;
        alxyVar.c = z;
        boolean zH = this.c.h();
        aihfVarCreateBuilder2.copyOnWrite();
        alxy alxyVar2 = (alxy) aihfVarCreateBuilder2.instance;
        alxyVar2.b |= 2;
        alxyVar2.d = zH;
        aihfVarCreateBuilder.copyOnWrite();
        alxz alxzVar2 = (alxz) aihfVarCreateBuilder.instance;
        alxy alxyVar3 = (alxy) aihfVarCreateBuilder2.build();
        alxyVar3.getClass();
        alxzVar2.e = alxyVar3;
        alxzVar2.b |= 4;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
