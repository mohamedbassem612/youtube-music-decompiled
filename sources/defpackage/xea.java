package defpackage;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xea implements awql {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xea(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awql
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strR;
        if (this.$cid != 0) {
            tnx tnxVar = (tnx) obj;
            tnxVar.getClass();
            ((List) obj2).getClass();
            ((List) obj3).getClass();
            return tnxVar;
        }
        eol eolVar = (eol) obj;
        atox atoxVar = (atox) obj2;
        aihf builder = atoxVar.toBuilder();
        long jO = eolVar.o("foreground_heartbeat_index", atoxVar.c);
        builder.copyOnWrite();
        atox atoxVar2 = (atox) builder.instance;
        atoxVar2.b |= 1;
        atoxVar2.c = jO;
        long jO2 = eolVar.o("interaction_logging_client_side_ve_counter", atoxVar.g);
        builder.copyOnWrite();
        atox atoxVar3 = (atox) builder.instance;
        atoxVar3.b |= 16;
        atoxVar3.g = jO2;
        if (eolVar.p("LastCrashException") && (strR = eolVar.r("LastCrashException")) != null) {
            aigj aigjVarV = aigj.v(Base64.decode(strR, 0));
            builder.copyOnWrite();
            atox atoxVar4 = (atox) builder.instance;
            aigjVarV.getClass();
            atoxVar4.b |= 2;
            atoxVar4.d = aigjVarV;
        }
        if (eolVar.p("LastCrashTimestamp")) {
            long jO3 = eolVar.o("LastCrashTimestamp", -1L);
            builder.copyOnWrite();
            atox atoxVar5 = (atox) builder.instance;
            atoxVar5.b |= 4;
            atoxVar5.e = jO3;
        }
        return builder.build();
    }
}
