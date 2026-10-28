package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xdd implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xdd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.a((ajwo) obj);
                break;
            case 1:
                amer amerVar = (amer) obj;
                ((xdh) this.a).c(amerVar, xdh.i(amerVar.e), Optional.empty(), Optional.empty());
                break;
            case 2:
                this.a.add((xdm) obj);
                break;
            case 3:
                int i = xje.b;
                ((xir) obj).h((amiu) this.a);
                break;
            case 4:
                int i2 = xje.b;
                ((xir) obj).n((String) this.a);
                break;
            case 5:
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                amiw amiwVar = (amiw) aihfVar.instance;
                amiw amiwVar2 = amiw.a;
                amiwVar.f = ((amjs) obj).i;
                amiwVar.b |= 16;
                break;
            case 6:
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                amiu amiuVar = (amiu) aihfVar2.instance;
                amiu amiuVar2 = amiu.a;
                amiuVar.R = ((aqvj) obj).e;
                amiuVar.d |= 65536;
                break;
            case 7:
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                amiw amiwVar3 = (amiw) aihfVar3.instance;
                amiw amiwVar4 = amiw.a;
                amiwVar3.o = ((amjt) obj).i;
                amiwVar3.b |= 262144;
                break;
            case 8:
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                amiw amiwVar5 = (amiw) aihfVar4.instance;
                amiw amiwVar6 = amiw.a;
                amiwVar5.h = ((amjq) obj).d;
                amiwVar5.b |= SemanticState.Focused;
                break;
            case 9:
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                amiu amiuVar3 = (amiu) aihfVar5.instance;
                amiu amiuVar4 = amiu.a;
                amiuVar3.z = ((amjo) obj).e;
                amiuVar3.c |= 1;
                break;
            case 10:
                aihf aihfVar6 = (aihf) this.a;
                aihfVar6.copyOnWrite();
                amiw amiwVar7 = (amiw) aihfVar6.instance;
                amiw amiwVar8 = amiw.a;
                amiwVar7.d = ((amjp) obj).d;
                amiwVar7.b |= 4;
                break;
            case 11:
                aihf aihfVarCreateBuilder = amiv.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amiv amivVar = (amiv) aihfVarCreateBuilder.instance;
                amivVar.b |= 1;
                amivVar.c = false;
                aihfVarCreateBuilder.copyOnWrite();
                amiv amivVar2 = (amiv) aihfVarCreateBuilder.instance;
                amivVar2.e = ((ajvs) obj).getNumber();
                amivVar2.b |= 4;
                ((aihf) this.a).by((amiv) aihfVarCreateBuilder.build());
                break;
            case 12:
                aihf aihfVarCreateBuilder2 = amiv.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amiv amivVar3 = (amiv) aihfVarCreateBuilder2.instance;
                amivVar3.b |= 1;
                amivVar3.c = true;
                aihfVarCreateBuilder2.copyOnWrite();
                amiv amivVar4 = (amiv) aihfVarCreateBuilder2.instance;
                amivVar4.d = ((ajvt) obj).getNumber();
                amivVar4.b |= 2;
                ((aihf) this.a).by((amiv) aihfVarCreateBuilder2.build());
                break;
            case 13:
                ((xur) obj).b((xvu) this.a);
                break;
            case 14:
                ((xur) obj).a((xvu) this.a);
                break;
            case 15:
                ((xrs) this.a).a((dii) obj);
                break;
            case 16:
                ((yvr) this.a).i((String) obj);
                break;
            case 17:
                ((yvr) this.a).j((Float) obj);
                break;
            case 18:
                ((yvr) this.a).k((Float) obj);
                break;
            case 19:
                ((yvr) this.a).d((Float) obj);
                break;
            default:
                ((yvr) this.a).f((Float) obj);
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
