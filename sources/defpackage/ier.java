package defpackage;

import app.rive.semantics.SemanticState;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ier implements sya {
    @Override // defpackage.sya
    public final Object a(Object obj, Object obj2) {
        aihf aihfVar = (aihf) obj2;
        HashMap map = new HashMap();
        agqr it = ((agkj) ((dov) obj).a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (str.endsWith("LastUpdated")) {
                    aihf aihfVarAi = gzj.ai(str, "LastUpdated", map);
                    long jLongValue = ((Long) value).longValue();
                    aihfVarAi.copyOnWrite();
                    aily ailyVar = (aily) aihfVarAi.instance;
                    aily ailyVar2 = aily.a;
                    ailyVar.b |= 1;
                    ailyVar.c = jLongValue;
                } else if (str.endsWith("PlaybackPosition")) {
                    aihf aihfVarAi2 = gzj.ai(str, "PlaybackPosition", map);
                    int iIntValue = ((Integer) value).intValue();
                    aihfVarAi2.copyOnWrite();
                    aily ailyVar3 = (aily) aihfVarAi2.instance;
                    aily ailyVar4 = aily.a;
                    ailyVar3.b |= 2;
                    ailyVar3.d = iIntValue;
                } else if (str.endsWith("AutonavIndex")) {
                    aihf aihfVarAi3 = gzj.ai(str, "AutonavIndex", map);
                    int iIntValue2 = ((Integer) value).intValue();
                    aihfVarAi3.copyOnWrite();
                    aily ailyVar5 = (aily) aihfVarAi3.instance;
                    aily ailyVar6 = aily.a;
                    ailyVar5.b |= 4;
                    ailyVar5.e = iIntValue2;
                } else if (str.endsWith("IsInfinite")) {
                    aihf aihfVarAi4 = gzj.ai(str, "IsInfinite", map);
                    boolean zBooleanValue = ((Boolean) value).booleanValue();
                    aihfVarAi4.copyOnWrite();
                    aily ailyVar7 = (aily) aihfVarAi4.instance;
                    aily ailyVar8 = aily.a;
                    ailyVar7.b |= 8;
                    ailyVar7.f = zBooleanValue;
                } else if (str.endsWith("PlaylistPanelTitle")) {
                    aihf aihfVarAi5 = gzj.ai(str, "PlaylistPanelTitle", map);
                    aihfVarAi5.copyOnWrite();
                    aily ailyVar9 = (aily) aihfVarAi5.instance;
                    aily ailyVar10 = aily.a;
                    ailyVar9.b |= 16;
                    ailyVar9.g = (String) value;
                } else if (str.endsWith("PlaylistPanelByline")) {
                    aihf aihfVarAi6 = gzj.ai(str, "PlaylistPanelByline", map);
                    aihfVarAi6.copyOnWrite();
                    aily ailyVar11 = (aily) aihfVarAi6.instance;
                    aily ailyVar12 = aily.a;
                    ailyVar11.b |= 32;
                    ailyVar11.h = (String) value;
                } else if (str.endsWith("Timestamp")) {
                    aihf aihfVarAi7 = gzj.ai(str, "Timestamp", map);
                    long jLongValue2 = ((Long) value).longValue();
                    aihfVarAi7.copyOnWrite();
                    aily ailyVar13 = (aily) aihfVarAi7.instance;
                    aily ailyVar14 = aily.a;
                    ailyVar13.b |= 64;
                    ailyVar13.i = jLongValue2;
                } else if (str.endsWith("PlaybackContentMode")) {
                    aihf aihfVarAi8 = gzj.ai(str, "PlaybackContentMode", map);
                    int iIntValue3 = ((Integer) value).intValue();
                    aihfVarAi8.copyOnWrite();
                    aily ailyVar15 = (aily) aihfVarAi8.instance;
                    aily ailyVar16 = aily.a;
                    ailyVar15.b |= SemanticState.Focused;
                    ailyVar15.j = iIntValue3;
                } else if (str.endsWith("WatchNextTrackingParamSet")) {
                    gzj.ai(str, "WatchNextTrackingParamSet", map).aw((Set) value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            aihfVar.ax((String) entry2.getKey(), (aily) ((aihf) entry2.getValue()).build());
        }
        return aihfVar;
    }
}
