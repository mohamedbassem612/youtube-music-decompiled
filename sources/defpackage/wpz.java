package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wpz extends wlu {
    public String a;
    public int b;

    public wpz(abxv abxvVar, zwa zwaVar) {
        super("flag/flag", abxvVar, zwaVar, 1, true, null, null);
        this.b = 1;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alpg.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            alpg alpgVar = (alpg) aihfVarCreateBuilder.instance;
            str.getClass();
            alpgVar.b |= 2;
            alpgVar.d = str;
        }
        int i = this.b;
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            alpg alpgVar2 = (alpg) aihfVarCreateBuilder.instance;
            alpgVar2.e = i - 1;
            alpgVar2.b |= 4;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alpg alpgVar3 = (alpg) aihfVarCreateBuilder.instance;
        alpgVar3.b |= 16;
        alpgVar3.f = false;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!ahno.aa(this.a));
    }
}
