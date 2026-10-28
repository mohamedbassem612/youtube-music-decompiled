package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hem extends wlu {
    public String a;

    public hem(abxv abxvVar, zwa zwaVar) {
        super("music/delete_privately_owned_entity", abxvVar, zwaVar, 1, false, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alsp.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alsp alspVar = (alsp) aihfVarCreateBuilder.instance;
        str.getClass();
        alspVar.b |= 2;
        alspVar.d = str;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!TextUtils.isEmpty(this.a));
    }
}
