package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wsd extends wlu {
    public String a;

    public wsd(abxv abxvVar, zwa zwaVar) {
        super("playlist/get_settings_editor", abxvVar, zwaVar, 1, true, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alwo.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alwo alwoVar = (alwo) aihfVarCreateBuilder.instance;
        str.getClass();
        alwoVar.b |= 2;
        alwoVar.d = str;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(!TextUtils.isEmpty(this.a));
    }
}
