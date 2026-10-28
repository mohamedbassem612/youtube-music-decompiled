package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpn extends wlu {
    public String a;
    public String b;
    public Optional c;

    public wpn(abxv abxvVar, zwa zwaVar) {
        super("comment/update_comment_reply", abxvVar, zwaVar, 1, false, null, null);
        this.a = "";
        this.b = "";
        this.c = Optional.empty();
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alny.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alny alnyVar = (alny) aihfVarCreateBuilder.instance;
        str.getClass();
        alnyVar.b |= 2;
        alnyVar.d = str;
        String str2 = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alny alnyVar2 = (alny) aihfVarCreateBuilder.instance;
        str2.getClass();
        alnyVar2.b |= 4;
        alnyVar2.e = str2;
        if (this.c.isPresent()) {
            String str3 = (String) this.c.get();
            aihfVarCreateBuilder.copyOnWrite();
            alny alnyVar3 = (alny) aihfVarCreateBuilder.instance;
            alnyVar3.b |= 8;
            alnyVar3.f = str3;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.a);
        typ.f(this.b);
    }
}
