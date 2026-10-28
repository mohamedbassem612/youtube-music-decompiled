package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wos extends wlu {
    public byte[] a;
    public boolean b;
    public int c;

    public wos(abxv abxvVar, zwa zwaVar) {
        super("channel/get_channel_creation_form", abxvVar, zwaVar, 1, false, null, null);
        m();
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O((((almp) a().instance).b & 2) != 0);
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aihf a() {
        aihf aihfVarCreateBuilder = almp.a.createBuilder();
        int i = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        almp almpVar = (almp) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        almpVar.e = i2;
        almpVar.b |= 4;
        byte[] bArr = this.a;
        if (bArr != null) {
            aigj aigjVarV = aigj.v(bArr);
            aihfVarCreateBuilder.copyOnWrite();
            almp almpVar2 = (almp) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            almpVar2.b |= 2;
            almpVar2.d = aigjVarV;
        }
        aihfVarCreateBuilder.copyOnWrite();
        almp almpVar3 = (almp) aihfVarCreateBuilder.instance;
        almpVar3.b |= 32;
        almpVar3.f = true;
        boolean z = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        almp almpVar4 = (almp) aihfVarCreateBuilder.instance;
        almpVar4.b |= 64;
        almpVar4.g = z;
        return aihfVarCreateBuilder;
    }
}
