package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wsb extends wlu {
    public String a;

    public wsb(abxv abxvVar, zwa zwaVar) {
        super("playlist/delete", abxvVar, zwaVar, 1, true, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alwj.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alwj alwjVar = (alwj) aihfVarCreateBuilder.instance;
        str.getClass();
        alwjVar.b |= 2;
        alwjVar.d = str;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(!TextUtils.isEmpty(this.a));
    }
}
