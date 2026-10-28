package defpackage;

import com.google.protobuf.MessageLite;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class onh implements qro {
    private static String b(String str, String str2) {
        return str + '|' + str2;
    }

    @Override // defpackage.qro
    public final /* bridge */ /* synthetic */ MessageLite a(tld tldVar, MessageLite messageLite) {
        oiy oiyVar = (oiy) messageLite;
        if (oiyVar.e) {
            return oiyVar;
        }
        HashSet hashSet = new HashSet();
        aihf builder = oiyVar.toBuilder();
        builder.copyOnWrite();
        oiy oiyVar2 = (oiy) builder.instance;
        oiyVar2.b |= 2;
        int i = 1;
        oiyVar2.e = true;
        agqr it = tldVar.r().entrySet().iterator();
        while (it.hasNext()) {
            List listH = agfm.c("|").h((CharSequence) ((Map.Entry) it.next()).getKey());
            if (listH.size() >= 4) {
                String str = (String) listH.get(0);
                String str2 = (String) listH.get(i);
                int i2 = Integer.parseInt((String) listH.get(2));
                String str3 = str + '|' + str2 + '|' + i2;
                if (!hashSet.contains(str3)) {
                    hashSet.add(str3);
                    String strB = b(str3, "w");
                    String strB2 = b(str3, "c");
                    long jQ = tldVar.q(strB, 0L);
                    long jQ2 = tldVar.q(strB2, 0L);
                    aihf aihfVarCreateBuilder = oit.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = oiw.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    oiw oiwVar = (oiw) aihfVarCreateBuilder2.instance;
                    str2.getClass();
                    int i3 = i;
                    oiwVar.b |= 1;
                    oiwVar.c = str2;
                    aihfVarCreateBuilder2.copyOnWrite();
                    oiw oiwVar2 = (oiw) aihfVarCreateBuilder2.instance;
                    str.getClass();
                    oiwVar2.b |= 2;
                    oiwVar2.d = str;
                    aihfVarCreateBuilder.copyOnWrite();
                    oit oitVar = (oit) aihfVarCreateBuilder.instance;
                    oiw oiwVar3 = (oiw) aihfVarCreateBuilder2.build();
                    oiwVar3.getClass();
                    oitVar.c = oiwVar3;
                    oitVar.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    oit oitVar2 = (oit) aihfVarCreateBuilder.instance;
                    oitVar2.b |= 8;
                    oitVar2.f = i2;
                    aihfVarCreateBuilder.copyOnWrite();
                    oit oitVar3 = (oit) aihfVarCreateBuilder.instance;
                    oitVar3.b |= 16;
                    oitVar3.g = jQ2;
                    aihfVarCreateBuilder.copyOnWrite();
                    oit oitVar4 = (oit) aihfVarCreateBuilder.instance;
                    oitVar4.b |= 32;
                    oitVar4.h = jQ;
                    builder.copyOnWrite();
                    oiy oiyVar3 = (oiy) builder.instance;
                    oit oitVar5 = (oit) aihfVarCreateBuilder.build();
                    oitVar5.getClass();
                    oiyVar3.a();
                    oiyVar3.d.add(oitVar5);
                    i = i3;
                }
            }
        }
        return (oiy) builder.build();
    }
}
