package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ulo implements Consumer {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ulo(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        vrx vrxVar;
        Object obj2;
        switch (this.$cid) {
            case 0:
                ((uzl) obj).a();
                break;
            case 1:
                ((ulh) obj).a();
                break;
            case 2:
                ((ugo) obj).e();
                break;
            case 3:
                ((ugo) obj).d();
                break;
            case 4:
                ((ugo) obj).f();
                break;
            case 5:
                ((urc) obj).q();
                break;
            case 6:
                ((uvw) obj).x();
                break;
            case 7:
                aihf aihfVar = (aihf) obj;
                aihfVar.copyOnWrite();
                atos atosVar = (atos) aihfVar.instance;
                atos atosVar2 = atos.a;
                atosVar.b |= 1;
                atosVar.c = 1;
                break;
            case 8:
                ((vaj) obj).x();
                break;
            case 9:
                ((Optional) obj).getClass();
                break;
            case 10:
                break;
            case 11:
                ((aqi) obj).c();
                break;
            case 12:
                aihf aihfVar2 = (aihf) obj;
                aihfVar2.copyOnWrite();
                vlg vlgVar = (vlg) aihfVar2.instance;
                vlg vlgVar2 = vlg.a;
                vlgVar.b = 1;
                break;
            case 13:
                ((vro) obj).o();
                break;
            case 14:
                vro vroVar = (vro) obj;
                if ((vroVar instanceof vrx) && (obj2 = (vrxVar = (vrx) vroVar).b) != null && ((apoq) obj2).g.size() > 0) {
                    aihf builder = ((apoq) vrxVar.b).toBuilder();
                    builder.copyOnWrite();
                    ((apoq) builder.instance).g = apoq.emptyProtobufList();
                    vrxVar.b = builder.build();
                    break;
                }
                break;
            case 15:
                ((vro) obj).hP();
                break;
            case 16:
                ((vro) obj).q();
                break;
            case 17:
                break;
            case 18:
                ((xnu) obj).b();
                break;
            case 19:
                ((xzc) obj).O();
                break;
            default:
                ((xzc) obj).V();
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
