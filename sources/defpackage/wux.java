package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wux extends wlu {
    public String a;
    public aigj b;

    public wux(abxv abxvVar, zwa zwaVar) {
        super("ypc/get_payment_instruments_params", abxvVar, zwaVar, 1, false, null, null);
        this.a = "";
        this.b = aigj.d;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alpx.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            alpx alpxVar = (alpx) aihfVarCreateBuilder.instance;
            str.getClass();
            alpxVar.b |= 2;
            alpxVar.d = str;
        }
        aigj aigjVar = this.b;
        if (aigjVar != null && !aigjVar.E()) {
            aihfVarCreateBuilder.copyOnWrite();
            alpx alpxVar2 = (alpx) aihfVarCreateBuilder.instance;
            alpxVar2.b |= 4;
            alpxVar2.e = aigjVar;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!TextUtils.isEmpty(this.a));
    }
}
