package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vrl implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vrl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [awqg, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                ((aehd) obj).a();
                vrm vrmVar = (vrm) this.a;
                vrmVar.j = Optional.empty();
                vrmVar.k = false;
                break;
            case 1:
                xpl xplVar = (xpl) obj;
                ((vqs) this.a).i.B((vsv) xplVar.b, (adxd) xplVar.a);
                break;
            case 2:
                ((vsa) this.a).e.f((vrz) obj);
                break;
            case 3:
                ((vsa) this.a).e.l((vrz) obj);
                break;
            case 4:
                this.a.invoke(obj);
                break;
            case 5:
                this.a.invoke(obj);
                break;
            case 6:
                this.a.invoke(obj);
                break;
            case 7:
                ((ojn) this.a).b((agke) obj);
                break;
            case 8:
                aesp aespVar = (aesp) obj;
                alei aleiVar = ((alop) this.a).g;
                if (aleiVar == null) {
                    aleiVar = alei.a;
                }
                aespVar.f(aleiVar);
                break;
            case 9:
                apkf apkfVar = (apkf) obj;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                alrh alrhVar = (alrh) aihfVar.instance;
                alrh alrhVar2 = alrh.a;
                apkfVar.getClass();
                alrhVar.f = apkfVar;
                alrhVar.b |= 16;
                break;
            case 10:
                apkf apkfVar2 = (apkf) obj;
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                alrj alrjVar = (alrj) aihfVar2.instance;
                alrj alrjVar2 = alrj.a;
                apkfVar2.getClass();
                alrjVar.f = apkfVar2;
                alrjVar.b |= 16;
                break;
            case 11:
                apkf apkfVar3 = (apkf) obj;
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                alrl alrlVar = (alrl) aihfVar3.instance;
                alrl alrlVar2 = alrl.a;
                apkfVar3.getClass();
                alrlVar.f = apkfVar3;
                alrlVar.b |= 16;
                break;
            case 12:
                amyf amyfVar = (amyf) obj;
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                alvx alvxVar = (alvx) aihfVar4.instance;
                alvx alvxVar2 = alvx.a;
                amyfVar.getClass();
                alvxVar.g = amyfVar;
                alvxVar.b |= 16;
                break;
            case 13:
                aigj aigjVar = (aigj) obj;
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                alwr alwrVar = (alwr) aihfVar5.instance;
                alwr alwrVar2 = alwr.a;
                aigjVar.getClass();
                alwrVar.b |= 8;
                alwrVar.f = aigjVar;
                break;
            case 14:
                aigj aigjVar2 = (aigj) obj;
                aihf aihfVar6 = (aihf) this.a;
                aihfVar6.copyOnWrite();
                alsr alsrVar = (alsr) aihfVar6.instance;
                alsr alsrVar2 = alsr.a;
                aigjVar2.getClass();
                alsrVar.b |= 8;
                alsrVar.g = aigjVar2;
                break;
            case 15:
                aigj aigjVar3 = (aigj) obj;
                aihf aihfVar7 = (aihf) this.a;
                aihfVar7.copyOnWrite();
                alsr alsrVar3 = (alsr) aihfVar7.instance;
                alsr alsrVar4 = alsr.a;
                aigjVar3.getClass();
                alsrVar3.b |= 16;
                alsrVar3.h = aigjVar3;
                break;
            case 16:
                amyf amyfVar2 = (amyf) obj;
                aihf aihfVar8 = (aihf) this.a;
                aihfVar8.copyOnWrite();
                alsr alsrVar5 = (alsr) aihfVar8.instance;
                alsr alsrVar6 = alsr.a;
                amyfVar2.getClass();
                alsrVar5.j = amyfVar2;
                alsrVar5.b |= SemanticState.Focused;
                break;
            case 17:
                akai akaiVar = (akai) obj;
                aihf aihfVar9 = (aihf) this.a;
                aihfVar9.copyOnWrite();
                aloe aloeVar = (aloe) aihfVar9.instance;
                aloe aloeVar2 = aloe.a;
                akaiVar.getClass();
                aloeVar.g = akaiVar;
                aloeVar.b |= 8;
                break;
            case 18:
                ((xgn) obj).d(new xgj(((akrn) this.a).d, (amud) null));
                break;
            case 19:
                xdb xdbVar = (xdb) this.a;
                xdbVar.c((amej) obj);
                xdbVar.b();
                break;
            default:
                ((xdh) this.a).e((String) obj);
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
