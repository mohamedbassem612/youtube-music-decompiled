package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aely implements vxc {
    private final Executor a;
    private final Context b;
    private final cf c;
    private final vyo d;
    private final ttm e;
    private final aerv f;
    private final vxe g;
    private final mbc h;
    private final awmd i;
    private final vxu k;
    private final lqa l;
    private final aend m;

    public aely(aend aendVar, vxe vxeVar, Executor executor, Context context, cf cfVar, vxu vxuVar, vyo vyoVar, ttm ttmVar, aerv aervVar, mbc mbcVar, lqa lqaVar, awmd awmdVar) {
        aendVar.getClass();
        this.m = aendVar;
        vxeVar.getClass();
        this.g = vxeVar;
        executor.getClass();
        this.a = executor;
        context.getClass();
        this.b = context;
        this.c = cfVar;
        vxuVar.getClass();
        this.k = vxuVar;
        vyoVar.getClass();
        this.d = vyoVar;
        ttmVar.getClass();
        this.e = ttmVar;
        aervVar.getClass();
        this.f = aervVar;
        mbcVar.getClass();
        this.h = mbcVar;
        lqaVar.getClass();
        this.l = lqaVar;
        awmdVar.getClass();
        this.i = awmdVar;
    }

    private final ajdl f() {
        vyo vyoVar = this.d;
        if ((vyoVar.b().c & SemanticState.Obscured) != 0) {
            ajdl ajdlVar = vyoVar.b().z;
            return ajdlVar == null ? ajdl.a : ajdlVar;
        }
        anhb anhbVar = this.k.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        ajdl ajdlVar2 = anhbVar.j;
        return ajdlVar2 == null ? ajdl.a : ajdlVar2;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        final aelz aelzVar;
        agke agkeVarN;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqzt.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        final aqzt aqztVar = (aqzt) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aqzu aqzuVar = aqztVar.i;
        if (aqzuVar == null) {
            aqzuVar = aqzu.a;
        }
        if (aqzuVar.b) {
            aelz aelzVar2 = new aelz();
            aelzVar2.h(this.c.getSupportFragmentManager(), "fullscreen_spinner_fragment");
            aelzVar = aelzVar2;
        } else {
            aelzVar = null;
        }
        List<ResolveInfo> listD = tym.d(this.b.getPackageManager());
        List listQ = adul.q(listD, f());
        ajdl ajdlVarF = f();
        if (ajdlVarF == null || ajdlVarF.b.size() == 0) {
            agkeVarN = agpi.a;
        } else {
            HashMap map2 = new HashMap();
            for (ajdm ajdmVar : ajdlVarF.b) {
                ((List) j$.util.Map.EL.computeIfAbsent(map2, ajdmVar.c, new aegf(2))).add(Integer.valueOf(ajdmVar.b));
            }
            HashMap mapO = aguu.o(map2.size());
            for (ResolveInfo resolveInfo : listD) {
                String str = resolveInfo.activityInfo.applicationInfo.packageName;
                String str2 = resolveInfo.activityInfo.name;
                if (str != null && !TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2) && map2.containsKey(str)) {
                    if (!mapO.containsKey(str)) {
                        mapO.put(str, almr.a.createBuilder());
                        aihf aihfVar = (aihf) mapO.get(str);
                        aihfVar.copyOnWrite();
                        almr almrVar = (almr) aihfVar.instance;
                        almrVar.b |= 2;
                        almrVar.d = str;
                    }
                    aihf aihfVar2 = (aihf) mapO.get(str);
                    aihfVar2.copyOnWrite();
                    almr almrVar2 = (almr) aihfVar2.instance;
                    almr almrVar3 = almr.a;
                    aiie aiieVar = almrVar2.e;
                    if (!aiieVar.c()) {
                        almrVar2.e = aihn.mutableCopy(aiieVar);
                    }
                    almrVar2.e.add(str2);
                }
            }
            ArrayList arrayList = new ArrayList(mapO.size());
            for (aihf aihfVar3 : mapO.values()) {
                for (Integer num : (List) map2.get(((almr) aihfVar3.instance).d)) {
                    aihf aihfVar4 = (aihf) mapO.get(((almr) aihfVar3.instance).d);
                    int iIntValue = num.intValue();
                    aihfVar4.copyOnWrite();
                    almr almrVar4 = (almr) aihfVar4.instance;
                    almrVar4.b |= 1;
                    almrVar4.c = iIntValue;
                    arrayList.add((almr) aihfVar3.build());
                }
            }
            agkeVarN = agke.n(arrayList);
        }
        aptc aptcVarA = (aqztVar.c & 16) != 0 ? this.l.A(aqztVar.h) : null;
        aend aendVar = this.m;
        String str3 = aqztVar.d;
        int iBt = a.bt(aqztVar.e);
        int i = iBt != 0 ? iBt : 2;
        String str4 = aqztVar.f;
        abxv abxvVar = aendVar.b;
        ?? r9 = aendVar.c;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        wpc wpcVar = new wpc(abxvVar, r9.e());
        wpcVar.a = str3;
        wpcVar.b = listQ;
        wpcVar.c = agkeVarN;
        wpcVar.D = i;
        wpcVar.d = str4;
        if (aptcVarA != null) {
            wpcVar.e = aptcVarA;
        }
        ListenableFuture listenableFutureB = aendVar.f(almt.a, (wlp) aendVar.d, new wpa(0), new hep(17)).b(wpcVar, executorDirectExecutor, null);
        final long epochMilli = this.h.f().toEpochMilli();
        if (aelzVar != null) {
            taf.l(aelzVar, listenableFutureB, new twi() { // from class: aelu
                @Override // defpackage.twi
                public final void a(Object obj) {
                    this.a.d(aqztVar, (Throwable) obj, epochMilli);
                    aelzVar.iQ(false, false, false);
                }
            }, new twi() { // from class: aelv
                @Override // defpackage.twi
                public final void a(Object obj) {
                    this.a.e((almt) obj, epochMilli);
                    aelzVar.iQ(false, false, false);
                }
            });
        } else {
            taf.i(listenableFutureB, this.a, new tab() { // from class: aelw
                @Override // defpackage.twi
                /* JADX INFO: renamed from: b */
                public final void a(Throwable th) {
                    this.a.d(aqztVar, th, epochMilli);
                }
            }, new tae() { // from class: aelx
                @Override // defpackage.tae, defpackage.twi
                public final void a(Object obj) {
                    this.a.e((almt) obj, epochMilli);
                }
            }, null);
        }
    }

    public final void d(aqzt aqztVar, Throwable th, long j) {
        this.f.f(this.h.f().toEpochMilli() - j, "RPC_ERROR");
        if ((aqztVar.c & 8) == 0) {
            if (th != null) {
                this.e.e(th);
            }
        } else {
            vxe vxeVar = this.g;
            ajwo ajwoVar = aqztVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
    }

    public final void e(almt almtVar, long j) {
        if (almtVar == null || (almtVar.b & 4) == 0) {
            this.f.f(this.h.f().toEpochMilli() - j, "OTHER_ERROR");
            return;
        }
        this.f.f(this.h.f().toEpochMilli() - j, "OK");
        vxe vxeVar = this.g;
        ajwo ajwoVar = almtVar.e;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        vxeVar.a(ajwoVar);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
