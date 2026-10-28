package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.widget.RemoteViews;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jnx implements avnf {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jnx(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnf
    public final Object a(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return Integer.valueOf(avv.f(((iwl) obj).f.b, (int) (((Float) obj2).floatValue() * 255.0f)));
            case 1:
                asfk asfkVar = (asfk) obj2;
                aihf aihfVarCreateBuilder = asfj.a.createBuilder();
                int i = true != hwz.k((ibh) obj) ? 3 : 2;
                aihfVarCreateBuilder.copyOnWrite();
                asfj asfjVar = (asfj) aihfVarCreateBuilder.instance;
                asfjVar.c = i - 1;
                asfjVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                asfj asfjVar2 = (asfj) aihfVarCreateBuilder.instance;
                asfjVar2.d = asfkVar.getNumber();
                asfjVar2.b |= 2;
                return (asfj) aihfVarCreateBuilder.build();
            case 2:
                return new rrs((toi) obj, (aobj) obj2);
            case 3:
                return new rrr(((Integer) obj).intValue(), (aobj) obj2);
            case 4:
                return !((Boolean) obj2).booleanValue() ? agdf.a : (agev) obj;
            case 5:
                agkz agkzVar = vng.a;
                return new vne(((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), vnf.a);
            case 6:
                vne vneVar = (vne) obj;
                vne vneVar2 = (vne) obj2;
                agkz agkzVar2 = vng.a;
                if (vneVar2.c) {
                    return vneVar2.t(vnf.d);
                }
                if (vneVar.c) {
                    return vneVar2.t(vnf.c);
                }
                return vneVar.b > vneVar2.b ? vneVar2.t(vnf.e) : vneVar2.t(vnf.b);
            case 7:
                return new agew((vor) obj, (ajwo) obj2);
            case 8:
                return (vun) obj2;
            case 9:
                return new xpl((vun) obj, (agkz) obj2, (char[]) null);
            case 10:
                vut vutVar = (vut) obj;
                vuy vuyVar = vutVar.a;
                vun vunVar = vutVar.b;
                xgz xgzVar = vum.a;
                return new axiy((Boolean) obj2, vuyVar, vunVar);
            case 11:
                return new agew((vun) obj, (Boolean) obj2);
            case 12:
                Boolean bool = (Boolean) obj;
                xgz xgzVar2 = vum.a;
                return bool;
            case 13:
                return new Pair((Boolean) obj, (agev) obj2);
            case 14:
                Duration duration = xun.b;
                return a.F((Boolean) obj, (Boolean) obj2);
            case 15:
                Duration duration2 = xun.b;
                return a.F((Boolean) obj, (Boolean) obj2);
            case 16:
                return aabq.f((Context) obj, (Intent) obj2);
            case 17:
                return aabq.g((Context) obj, (Intent) obj2);
            case 18:
                return new RemoteViews((String) obj, ((Integer) obj2).intValue());
            case 19:
                return new RemoteViews((String) obj, ((Integer) obj2).intValue());
            default:
                wjf wjfVar = ((aayp) obj).a;
                akkh akkhVar = (akkh) obj2;
                akef akefVar = aawd.a;
                if (wjfVar.I().isEmpty()) {
                    return Optional.empty();
                }
                for (akef akefVar2 : wjfVar.I()) {
                    akkh akkhVarA = akkh.a(akefVar2.c);
                    if (akkhVarA == null) {
                        akkhVarA = akkh.PLAYBACK_CONTEXT_TYPE_UNKNOWN;
                    }
                    if (akkhVarA == akkhVar) {
                        return Optional.of(new aaww(wjfVar, akefVar2));
                    }
                }
                return Optional.of(new aaww(wjfVar, aawd.a));
        }
    }
}
