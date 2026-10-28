package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfk {
    public static final String a = wfs.g(295, "YTM_MUSIC_PLAYER_ENTITY");
    public final avlh b;
    public final avlh c;
    public final avmb d;
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();
    public antt h = antt.MUSIC_PLAYBACK_STATE_UNKNOWN;
    public final hcb i;

    public gfk(avlh avlhVar, abvn abvnVar, hcb hcbVar, avmb avmbVar) {
        this.b = avlhVar;
        this.c = (avlh) abvnVar.r().n;
        this.i = hcbVar;
        this.d = avmbVar;
    }

    public static void a(String str, String str2, antt anttVar, Optional optional, wer werVar) {
        antu antuVarE = antw.e(wfs.g(295, str.concat(String.valueOf(str2))));
        antuVarE.am(anttVar);
        gfi gfiVar = new gfi(antuVarE, 1);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = gfiVar.a;
            aihf aihfVarCreateBuilder = anty.a.createBuilder();
            float fFloatValue = ((Float) obj).floatValue();
            aihfVarCreateBuilder.copyOnWrite();
            anty antyVar = (anty) aihfVarCreateBuilder.instance;
            antyVar.b |= 8;
            antyVar.f = fFloatValue;
            ((antu) obj2).an(aihfVarCreateBuilder);
        }
        werVar.m(antuVarE);
    }
}
