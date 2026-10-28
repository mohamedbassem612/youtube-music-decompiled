package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wtd extends wlu {
    public String a;

    public wtd(abxv abxvVar, zwa zwaVar) {
        super("flag/get_form", abxvVar, zwaVar, 1, true, null, null);
        this.a = "";
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alwv.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            alwv alwvVar = (alwv) aihfVarCreateBuilder.instance;
            str.getClass();
            alwvVar.b |= 2;
            alwvVar.d = str;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        String str = this.a;
        if (ahno.aa(str)) {
            throw new IllegalArgumentException(a.bT(str, "Exactly one of params (", ") or clientSideParams (null) has to be set."));
        }
    }
}
