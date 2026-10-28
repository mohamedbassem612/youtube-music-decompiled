package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpo extends wlu {
    public String a;
    public String b;
    public Optional c;

    public wpo(abxv abxvVar, zwa zwaVar) {
        super("comment/update_comment", abxvVar, zwaVar, 1, false, null, null);
        this.a = "";
        this.b = "";
        this.c = Optional.empty();
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alob.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alob alobVar = (alob) aihfVarCreateBuilder.instance;
        str.getClass();
        alobVar.b |= 2;
        alobVar.d = str;
        String str2 = this.b;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alob alobVar2 = (alob) aihfVarCreateBuilder.instance;
            alobVar2.b |= 4;
            alobVar2.e = str2;
        }
        if (this.c.isPresent()) {
            String str3 = (String) this.c.get();
            aihfVarCreateBuilder.copyOnWrite();
            alob alobVar3 = (alob) aihfVarCreateBuilder.instance;
            alobVar3.b |= 8;
            alobVar3.f = str3;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.a);
    }
}
