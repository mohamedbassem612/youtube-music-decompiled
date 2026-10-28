package defpackage;

import android.os.health.HealthStats;
import com.google.protobuf.MessageLite;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qev extends qex {
    public static final qev a = new qev();

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        HealthStats healthStatsM824m = ie$$ExternalSyntheticApiModelOutline0.m824m(obj);
        fxg fxgVar = (fxg) axfz.a.createBuilder();
        fxgVar.b(qey.a.e(qnl.u(healthStatsM824m, 40001)));
        fxgVar.c(qeu.a.e((healthStatsM824m == null || !healthStatsM824m.hasMeasurements(40002)) ? Collections.EMPTY_MAP : healthStatsM824m.getMeasurements(40002)));
        if (str != null) {
            aihf aihfVarCreateBuilder = axfy.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            axfy axfyVar = (axfy) aihfVarCreateBuilder.instance;
            axfyVar.b |= 2;
            axfyVar.d = str;
            axfy axfyVar2 = (axfy) aihfVarCreateBuilder.build();
            fxgVar.copyOnWrite();
            axfz axfzVar = (axfz) fxgVar.instance;
            axfyVar2.getClass();
            axfzVar.e = axfyVar2;
            axfzVar.b |= 1;
        }
        axfz axfzVar2 = (axfz) fxgVar.build();
        if (qnl.z(axfzVar2)) {
            return null;
        }
        return axfzVar2;
    }

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        axfz axfzVar = (axfz) messageLite;
        axfz axfzVar2 = (axfz) messageLite2;
        if (axfzVar == null || axfzVar2 == null) {
            return axfzVar;
        }
        fxg fxgVar = (fxg) axfz.a.createBuilder();
        fxgVar.b(qey.a.f(axfzVar.c, axfzVar2.c));
        fxgVar.c(qeu.a.f(axfzVar.d, axfzVar2.d));
        axfy axfyVar = axfzVar.e;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        fxgVar.copyOnWrite();
        axfz axfzVar3 = (axfz) fxgVar.instance;
        axfyVar.getClass();
        axfzVar3.e = axfyVar;
        axfzVar3.b |= 1;
        axfz axfzVar4 = (axfz) fxgVar.build();
        if (qnl.z(axfzVar4)) {
            return null;
        }
        return axfzVar4;
    }

    @Override // defpackage.qex
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        axfy axfyVar = ((axfz) messageLite).e;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        return axfyVar.d;
    }
}
