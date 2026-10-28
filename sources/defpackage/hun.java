package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hun implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hun(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                apji apjiVar = (apji) obj;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                alfr alfrVar = (alfr) aihfVar.instance;
                alfr alfrVar2 = alfr.a;
                apjiVar.getClass();
                alfrVar.c = apjiVar;
                alfrVar.b |= 1;
                break;
            case 1:
                ankz ankzVar = (ankz) obj;
                agrf agrfVar = hur.a;
                aihf aihfVarCreateBuilder = alfu.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                alfu alfuVar = (alfu) aihfVarCreateBuilder.instance;
                ankzVar.getClass();
                alfuVar.f = ankzVar;
                alfuVar.b |= 262144;
                ((aihf) this.a).bp(aihfVarCreateBuilder);
                break;
            case 2:
                this.a.add((aapt) obj);
                break;
            case 3:
                hxf hxfVar = (hxf) this.a;
                hxfVar.b.b((arat) obj, hxfVar.c, null);
                break;
            case 4:
                this.a.invoke(obj);
                break;
            case 5:
                ajwo ajwoVar = hzl.a;
                ((vxe) obj).a((ajwo) this.a);
                break;
            case 6:
                aorw aorwVar = (aorw) obj;
                aihf aihfVarCreateBuilder2 = alzo.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                alzo alzoVar = (alzo) aihfVarCreateBuilder2.instance;
                aorwVar.getClass();
                alzoVar.c = aorwVar;
                alzoVar.b = 78882851;
                Object obj2 = this.a;
                ((aihf) obj2).copyOnWrite();
                amae amaeVar = (amae) ((aihh) obj2).instance;
                alzo alzoVar2 = (alzo) aihfVarCreateBuilder2.build();
                amae amaeVar2 = amae.a;
                alzoVar2.getClass();
                amaeVar.h = alzoVar2;
                amaeVar.b |= 32;
                break;
            case 7:
                amks amksVar = (amks) obj;
                aihf aihfVarCreateBuilder3 = aorn.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                aorn aornVar = (aorn) aihfVarCreateBuilder3.instance;
                amksVar.getClass();
                aornVar.d = amksVar;
                aornVar.b |= 4;
                ((aihf) this.a).cb(aihfVarCreateBuilder3);
                break;
            case 8:
                ((abnk) this.a).e((apla) obj);
                break;
            case 9:
                ((icj) this.a).t = Optional.of((anvo) obj);
                break;
            case 10:
                apla aplaVar = (apla) obj;
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                aily ailyVar = (aily) aihfVar2.instance;
                aily ailyVar2 = aily.a;
                aplaVar.getClass();
                ailyVar.u = aplaVar;
                ailyVar.b |= 524288;
                break;
            case 11:
                anvo anvoVar = (anvo) obj;
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                aily ailyVar3 = (aily) aihfVar3.instance;
                aily ailyVar4 = aily.a;
                anvoVar.getClass();
                ailyVar3.n = anvoVar;
                ailyVar3.b |= SemanticState.ReadOnly;
                break;
            case 12:
                ajta ajtaVar = (ajta) obj;
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                aily ailyVar5 = (aily) aihfVar4.instance;
                aily ailyVar6 = aily.a;
                ajtaVar.getClass();
                ailyVar5.o = ajtaVar;
                ailyVar5.b |= SemanticState.Modal;
                break;
            case 13:
                ajta ajtaVar2 = (ajta) obj;
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                aily ailyVar7 = (aily) aihfVar5.instance;
                aily ailyVar8 = aily.a;
                ajtaVar2.getClass();
                ailyVar7.p = ajtaVar2;
                ailyVar7.b |= SemanticState.Multiline;
                break;
            case 14:
                aigj aigjVar = (aigj) obj;
                aihf aihfVar6 = (aihf) this.a;
                aihfVar6.copyOnWrite();
                aily ailyVar9 = (aily) aihfVar6.instance;
                aily ailyVar10 = aily.a;
                aigjVar.getClass();
                ailyVar9.b |= 32768;
                ailyVar9.q = aigjVar;
                break;
            case 15:
                ajwo ajwoVar2 = (ajwo) obj;
                aihf aihfVar7 = (aihf) this.a;
                aihfVar7.copyOnWrite();
                aily ailyVar11 = (aily) aihfVar7.instance;
                aily ailyVar12 = aily.a;
                ajwoVar2.getClass();
                ailyVar11.r = ajwoVar2;
                ailyVar11.b |= 65536;
                break;
            case 16:
                ajwo ajwoVar3 = (ajwo) obj;
                aihf aihfVar8 = (aihf) this.a;
                aihfVar8.copyOnWrite();
                aily ailyVar13 = (aily) aihfVar8.instance;
                aily ailyVar14 = aily.a;
                ajwoVar3.getClass();
                ailyVar13.s = ajwoVar3;
                ailyVar13.b |= 131072;
                break;
            case 17:
                ((agrc) ((agrc) ied.a.c().i(agso.a, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "handleOnQueueRestoredCommand", 650, "QueueRestorationController.java")).t("Command and router are present, handling onQueueRestoredCommand.");
                ((vxe) obj).a((ajwo) this.a);
                break;
            case 18:
                ((abnk) this.a).p = ((Integer) obj).intValue();
                break;
            case 19:
                String str = (String) obj;
                aihf aihfVar9 = (aihf) this.a;
                aihfVar9.copyOnWrite();
                aote aoteVar = (aote) aihfVar9.instance;
                aote aoteVar2 = aote.a;
                str.getClass();
                aoteVar.b |= SemanticState.LiveRegion;
                aoteVar.h = str;
                break;
            default:
                agrf agrfVar2 = ijl.ar;
                ((nh) ((jav) obj).m).y((qa) this.a);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
