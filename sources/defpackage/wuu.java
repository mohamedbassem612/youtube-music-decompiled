package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wuu extends wlu {
    public String a;

    public wuu(abxv abxvVar, zwa zwaVar) {
        super("ypc/get_fix_instrument_params", abxvVar, zwaVar, 1, false, null, null);
        this.a = "";
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alpt.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alpt alptVar = (alpt) aihfVarCreateBuilder.instance;
        str.getClass();
        alptVar.b |= 2;
        alptVar.d = str;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!TextUtils.isEmpty(this.a));
    }
}
