package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijc {
    private static final HashMap b = new HashMap();
    public final Map a = new HashMap();

    private ijc() {
    }

    public static synchronized ijc a(String str) {
        ijc ijcVar;
        HashMap map = b;
        str.getClass();
        ijcVar = (ijc) map.get(str);
        if (ijcVar == null) {
            ijcVar = new ijc();
            map.put(str, ijcVar);
        }
        return ijcVar;
    }

    public static anxw b(anxw anxwVar, String str) {
        int iBh = a.bh(anxwVar.c);
        if (iBh == 0 || iBh != 2 || (anxwVar.b & 4) == 0) {
            return anxwVar;
        }
        aihf builder = anxwVar.toBuilder();
        ajwo ajwoVar = anxwVar.e;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        ajwo ajwoVarC = iix.c(ajwoVar, str);
        builder.copyOnWrite();
        anxw anxwVar2 = (anxw) builder.instance;
        ajwoVarC.getClass();
        anxwVar2.e = ajwoVarC;
        anxwVar2.b |= 4;
        return (anxw) builder.build();
    }
}
