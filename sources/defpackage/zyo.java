package defpackage;

import java.security.SecureRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zyo {
    public static final akxc a;
    public final akxc b;
    public final SecureRandom c;

    static {
        aihf aihfVarCreateBuilder = akxc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar = (akxc) aihfVarCreateBuilder.instance;
        akxcVar.b |= 1;
        akxcVar.c = 1000;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar2 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar2.b |= 4;
        akxcVar2.e = 30000;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar3 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar3.b |= 2;
        akxcVar3.d = 2.0f;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar4 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar4.b |= 8;
        akxcVar4.f = 0.1f;
        a = (akxc) aihfVarCreateBuilder.build();
    }

    public zyo(SecureRandom secureRandom, akxc akxcVar) {
        this.c = secureRandom;
        this.b = akxcVar;
        if (!a.L(akxcVar)) {
            throw new IllegalArgumentException("Illegal exponential backoff config");
        }
    }
}
