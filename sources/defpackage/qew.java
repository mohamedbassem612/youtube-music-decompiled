package defpackage;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qew extends qex {
    public static final qew a = new qew();

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        HealthStats healthStatsM824m = ie$$ExternalSyntheticApiModelOutline0.m824m(obj);
        aihf aihfVarCreateBuilder = axgb.a.createBuilder();
        long jS = qnl.s(healthStatsM824m, 30001);
        if (jS != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgb axgbVar = (axgb) aihfVarCreateBuilder.instance;
            axgbVar.b |= 1;
            axgbVar.c = jS;
        }
        long jS2 = qnl.s(healthStatsM824m, 30002);
        if (jS2 != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgb axgbVar2 = (axgb) aihfVarCreateBuilder.instance;
            axgbVar2.b |= 2;
            axgbVar2.d = jS2;
        }
        long jS3 = qnl.s(healthStatsM824m, 30003);
        if (jS3 != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgb axgbVar3 = (axgb) aihfVarCreateBuilder.instance;
            axgbVar3.b |= 4;
            axgbVar3.e = jS3;
        }
        long jS4 = qnl.s(healthStatsM824m, 30004);
        if (jS4 != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgb axgbVar4 = (axgb) aihfVarCreateBuilder.instance;
            axgbVar4.b |= 8;
            axgbVar4.f = jS4;
        }
        long jS5 = qnl.s(healthStatsM824m, 30005);
        if (jS5 != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgb axgbVar5 = (axgb) aihfVarCreateBuilder.instance;
            axgbVar5.b |= 16;
            axgbVar5.g = jS5;
        }
        long jS6 = qnl.s(healthStatsM824m, 30006);
        if (jS6 != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgb axgbVar6 = (axgb) aihfVarCreateBuilder.instance;
            axgbVar6.b |= 32;
            axgbVar6.h = jS6;
        }
        if (str != null) {
            axfy axfyVarV = qnl.v(str);
            aihfVarCreateBuilder.copyOnWrite();
            axgb axgbVar7 = (axgb) aihfVarCreateBuilder.instance;
            axfyVarV.getClass();
            axgbVar7.i = axfyVarV;
            axgbVar7.b |= 64;
        }
        axgb axgbVar8 = (axgb) aihfVarCreateBuilder.build();
        if (qnl.A(axgbVar8)) {
            return null;
        }
        return axgbVar8;
    }

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        axgb axgbVar = (axgb) messageLite;
        axgb axgbVar2 = (axgb) messageLite2;
        if (axgbVar == null || axgbVar2 == null) {
            return axgbVar;
        }
        aihf aihfVarCreateBuilder = axgb.a.createBuilder();
        if ((axgbVar.b & 1) != 0) {
            long j = axgbVar.c - axgbVar2.c;
            if (j != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                axgb axgbVar3 = (axgb) aihfVarCreateBuilder.instance;
                axgbVar3.b |= 1;
                axgbVar3.c = j;
            }
        }
        if ((axgbVar.b & 2) != 0) {
            long j2 = axgbVar.d - axgbVar2.d;
            if (j2 != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                axgb axgbVar4 = (axgb) aihfVarCreateBuilder.instance;
                axgbVar4.b |= 2;
                axgbVar4.d = j2;
            }
        }
        if ((axgbVar.b & 4) != 0) {
            long j3 = axgbVar.e - axgbVar2.e;
            if (j3 != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                axgb axgbVar5 = (axgb) aihfVarCreateBuilder.instance;
                axgbVar5.b |= 4;
                axgbVar5.e = j3;
            }
        }
        if ((axgbVar.b & 8) != 0) {
            long j4 = axgbVar.f - axgbVar2.f;
            if (j4 != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                axgb axgbVar6 = (axgb) aihfVarCreateBuilder.instance;
                axgbVar6.b |= 8;
                axgbVar6.f = j4;
            }
        }
        if ((axgbVar.b & 16) != 0) {
            long j5 = axgbVar.g - axgbVar2.g;
            if (j5 != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                axgb axgbVar7 = (axgb) aihfVarCreateBuilder.instance;
                axgbVar7.b |= 16;
                axgbVar7.g = j5;
            }
        }
        if ((axgbVar.b & 32) != 0) {
            long j6 = axgbVar.h - axgbVar2.h;
            if (j6 != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                axgb axgbVar8 = (axgb) aihfVarCreateBuilder.instance;
                axgbVar8.b |= 32;
                axgbVar8.h = j6;
            }
        }
        axfy axfyVar = axgbVar.i;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        axgb axgbVar9 = (axgb) aihfVarCreateBuilder.instance;
        axfyVar.getClass();
        axgbVar9.i = axfyVar;
        axgbVar9.b |= 64;
        axgb axgbVar10 = (axgb) aihfVarCreateBuilder.build();
        if (qnl.A(axgbVar10)) {
            return null;
        }
        return axgbVar10;
    }

    @Override // defpackage.qex
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        axfy axfyVar = ((axgb) messageLite).i;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        return axfyVar.d;
    }
}
