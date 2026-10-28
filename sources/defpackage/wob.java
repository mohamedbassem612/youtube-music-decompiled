package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wob extends wlu {
    public String a;

    public wob(abxv abxvVar, zwa zwaVar) {
        super("player/ad_break", abxvVar, zwaVar, 1, true, null, null);
        this.a = "";
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = allb.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        allb allbVar = (allb) aihfVarCreateBuilder.instance;
        str.getClass();
        allbVar.b |= 4;
        allbVar.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        allb allbVar2 = (allb) aihfVarCreateBuilder.instance;
        allbVar2.r = 2;
        allbVar2.b |= 16777216;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(!Objects.equals(this.a, ""));
    }
}
