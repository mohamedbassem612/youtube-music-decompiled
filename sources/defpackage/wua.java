package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wua extends wlu {
    public int D;
    public String a;
    public String b;
    public apvn c;
    public apww d;
    public List e;

    public wua(abxv abxvVar, zwa zwaVar) {
        super("shorts/get_shorts_source_video", abxvVar, zwaVar, 3, true, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alqu.a.createBuilder();
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqu alquVar = (alqu) aihfVarCreateBuilder.instance;
            alquVar.b |= 2;
            alquVar.d = str;
        }
        apvn apvnVar = this.c;
        if (apvnVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqu alquVar2 = (alqu) aihfVarCreateBuilder.instance;
            alquVar2.f = apvnVar;
            alquVar2.b |= 8;
        }
        String str2 = this.b;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqu alquVar3 = (alqu) aihfVarCreateBuilder.instance;
            alquVar3.b |= 4;
            alquVar3.e = str2;
        }
        if (this.D != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            alqu alquVar4 = (alqu) aihfVarCreateBuilder.instance;
            alquVar4.g = 0;
            alquVar4.b |= 16;
        }
        apww apwwVar = this.d;
        if (apwwVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqu alquVar5 = (alqu) aihfVarCreateBuilder.instance;
            alquVar5.i = apwwVar;
            alquVar5.b |= 32;
        }
        List list = this.e;
        if (list != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqu alquVar6 = (alqu) aihfVarCreateBuilder.instance;
            aiie aiieVar = alquVar6.h;
            if (!aiieVar.c()) {
                alquVar6.h = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, alquVar6.h);
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.a.getClass();
        this.c.getClass();
    }
}
