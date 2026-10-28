package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acyn {
    public final vyo a;
    public final tqj c;
    public final agfr e;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public volatile agkz d = agpr.a;

    public acyn(vyo vyoVar, tqj tqjVar) {
        this.c = tqjVar;
        this.a = vyoVar;
        this.e = aguu.al(new yyp(vyoVar, 15));
    }

    public static asnc a(String str) {
        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
        aslh aslhVar = aslh.LOG_TYPE_RESOURCE_BLOCKLISTED_ERROR;
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
        str.getClass();
        asncVar2.b |= 32;
        asncVar2.i = str;
        return (asnc) aihfVarCreateBuilder.build();
    }
}
