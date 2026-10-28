package defpackage;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qey extends qex {
    public static final qey a = new qey();

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        HealthStats healthStatsM824m = ie$$ExternalSyntheticApiModelOutline0.m824m(obj);
        aihf aihfVarCreateBuilder = axgc.a.createBuilder();
        int iS = (int) qnl.s(healthStatsM824m, 50001);
        if (iS != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgc axgcVar = (axgc) aihfVarCreateBuilder.instance;
            axgcVar.b |= 1;
            axgcVar.c = iS;
        }
        int iS2 = (int) qnl.s(healthStatsM824m, 50002);
        if (iS2 != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgc axgcVar2 = (axgc) aihfVarCreateBuilder.instance;
            axgcVar2.b |= 2;
            axgcVar2.d = iS2;
        }
        if (str != null) {
            aihf aihfVarCreateBuilder2 = axfy.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            axfy axfyVar = (axfy) aihfVarCreateBuilder2.instance;
            axfyVar.b |= 2;
            axfyVar.d = str;
            axfy axfyVar2 = (axfy) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            axgc axgcVar3 = (axgc) aihfVarCreateBuilder.instance;
            axfyVar2.getClass();
            axgcVar3.e = axfyVar2;
            axgcVar3.b |= 4;
        }
        axgc axgcVar4 = (axgc) aihfVarCreateBuilder.build();
        if (qnl.B(axgcVar4)) {
            return null;
        }
        return axgcVar4;
    }

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        int i;
        int i2;
        axgc axgcVar = (axgc) messageLite;
        axgc axgcVar2 = (axgc) messageLite2;
        if (axgcVar == null || axgcVar2 == null) {
            return axgcVar;
        }
        aihf aihfVarCreateBuilder = axgc.a.createBuilder();
        if ((axgcVar.b & 1) != 0 && (i2 = axgcVar.c - axgcVar2.c) != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgc axgcVar3 = (axgc) aihfVarCreateBuilder.instance;
            axgcVar3.b |= 1;
            axgcVar3.c = i2;
        }
        if ((axgcVar.b & 2) != 0 && (i = axgcVar.d - axgcVar2.d) != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgc axgcVar4 = (axgc) aihfVarCreateBuilder.instance;
            axgcVar4.b |= 2;
            axgcVar4.d = i;
        }
        axfy axfyVar = axgcVar.e;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        axgc axgcVar5 = (axgc) aihfVarCreateBuilder.instance;
        axfyVar.getClass();
        axgcVar5.e = axfyVar;
        axgcVar5.b |= 4;
        axgc axgcVar6 = (axgc) aihfVarCreateBuilder.build();
        if (qnl.B(axgcVar6)) {
            return null;
        }
        return axgcVar6;
    }

    @Override // defpackage.qex
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        axfy axfyVar = ((axgc) messageLite).e;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        return axfyVar.d;
    }
}
