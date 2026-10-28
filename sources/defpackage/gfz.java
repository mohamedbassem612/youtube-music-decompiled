package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfz implements sah, sai {
    public final awmd a;
    public final awmd b;
    public final agkz c;
    public final vyo d;
    public String e = "";
    public final rtm f;
    private final awmd g;

    public gfz(awmd awmdVar, awmd awmdVar2, rtm rtmVar, awmd awmdVar3, agkz agkzVar, vyo vyoVar) {
        this.g = awmdVar;
        this.a = awmdVar2;
        this.f = rtmVar;
        this.b = awmdVar3;
        this.c = agkzVar;
        this.d = vyoVar;
    }

    @Override // defpackage.sah
    public final void W(smr smrVar, sko skoVar) {
        String str;
        wjf wjfVar;
        if (!skoVar.f(aixg.LAYOUT_TYPE_MEDIA, new Class[0]) || TextUtils.equals(skoVar.a, this.e)) {
            return;
        }
        if (smrVar.e(sic.class)) {
            str = (String) smrVar.d(sic.class);
        } else {
            str = skoVar.e(sic.class) ? (String) skoVar.d(sic.class) : "";
        }
        if (smrVar.e(sid.class)) {
            wjfVar = (wjf) smrVar.d(sid.class);
        } else {
            wjfVar = skoVar.e(sid.class) ? (wjf) skoVar.d(sid.class) : null;
        }
        ((roq) this.g.io()).f(4, skh.a(str, wjfVar), new mly(this, smrVar, skoVar, 1));
    }

    @Override // defpackage.sai
    public final void b(smr smrVar, sko skoVar, int i) {
        if (skoVar.f(aixg.LAYOUT_TYPE_MEDIA, new Class[0]) && TextUtils.equals(skoVar.a, this.e)) {
            this.e = "";
        }
    }
}
