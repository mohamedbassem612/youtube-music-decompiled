package defpackage;

import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class itr {
    private static final agrf d = agrf.h("com/google/android/apps/youtube/music/sideloaded/service/SideloadedDetailPageService");
    public final iup a;
    public final Executor b;
    public final Executor c;
    private final mbc e;
    private final hfn f;

    public itr(iup iupVar, hfn hfnVar, Executor executor, Executor executor2, mbc mbcVar) {
        this.a = iupVar;
        this.f = hfnVar;
        this.c = executor;
        this.b = executor2;
        this.e = mbcVar;
    }

    public final gnq a(Object obj, Class cls, Class cls2, hcg hcgVar, agkj agkjVar) {
        hfn hfnVar = this.f;
        MessageLite messageLiteAp = hfnVar.ap(cls, cls2, obj, agkjVar);
        almj almjVar = (almj) hfnVar.ap(hcg.class, almj.class, hcgVar, agkjVar);
        aihf aihfVarCreateBuilder = allx.a.createBuilder();
        if (messageLiteAp instanceof anne) {
            anne anneVar = (anne) messageLiteAp;
            aihfVarCreateBuilder.copyOnWrite();
            allx allxVar = (allx) aihfVarCreateBuilder.instance;
            anneVar.getClass();
            allxVar.c = anneVar;
            allxVar.b = 173602558;
        } else if (messageLiteAp instanceof anpf) {
            anpf anpfVar = (anpf) messageLiteAp;
            aihfVarCreateBuilder.copyOnWrite();
            allx allxVar2 = (allx) aihfVarCreateBuilder.instance;
            anpfVar.getClass();
            allxVar2.c = anpfVar;
            allxVar2.b = 99965204;
        } else if (messageLiteAp instanceof annx) {
            annx annxVar = (annx) messageLiteAp;
            aihfVarCreateBuilder.copyOnWrite();
            allx allxVar3 = (allx) aihfVarCreateBuilder.instance;
            annxVar.getClass();
            allxVar3.c = annxVar;
            allxVar3.b = 173690432;
        } else {
            ((agrc) ((agrc) d.b()).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedDetailPageService", "createBrowseResponseModel", 212, "SideloadedDetailPageService.java")).w("Unexpected renderer type: %s", messageLiteAp.getClass().getName());
        }
        aihh aihhVar = (aihh) almd.a.createBuilder();
        aihhVar.copyOnWrite();
        almd almdVar = (almd) aihhVar.instance;
        allx allxVar4 = (allx) aihfVarCreateBuilder.build();
        allxVar4.getClass();
        almdVar.d = allxVar4;
        almdVar.b |= 2;
        aihf aihfVarCreateBuilder2 = alme.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        alme almeVar = (alme) aihfVarCreateBuilder2.instance;
        almjVar.getClass();
        almeVar.c = almjVar;
        almeVar.b = 58173949;
        aihhVar.copyOnWrite();
        almd almdVar2 = (almd) aihhVar.instance;
        alme almeVar2 = (alme) aihfVarCreateBuilder2.build();
        almeVar2.getClass();
        almdVar2.f = almeVar2;
        almdVar2.b |= 64;
        wfy wfyVar = new wfy((almd) aihhVar.build());
        mbc mbcVar = this.e;
        gnm gnmVarA = gnn.a();
        gnmVarA.c(mbcVar.f().toEpochMilli());
        return new gnq(wfyVar, gnmVarA.a());
    }
}
