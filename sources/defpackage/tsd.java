package defpackage;

import android.util.Size;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tsd implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tsd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [awqg, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        unh unhVar;
        switch (this.$cid) {
            case 0:
                agrf agrfVar = tsl.a;
                this.a.invoke(obj);
                break;
            case 1:
                agrf agrfVar2 = tsl.a;
                this.a.invoke(obj);
                break;
            case 2:
                agrf agrfVar3 = tsl.a;
                this.a.invoke(obj);
                break;
            case 3:
                agrf agrfVar4 = tsl.a;
                this.a.invoke(obj);
                break;
            case 4:
                agrf agrfVar5 = tsr.a;
                ((mgr) obj).b((String) this.a, -1);
                break;
            case 5:
                agrf agrfVar6 = tsr.a;
                ((mgr) obj).a((String) this.a);
                break;
            case 6:
                rbm rbmVar = ufm.a;
                ((rbi) obj).b((UUID) this.a);
                break;
            case 7:
                ((uhn) obj).a((CreationButtonView) this.a);
                break;
            case 8:
                ((uhn) obj).c((CreationButtonView) this.a);
                break;
            case 9:
                agrf agrfVar7 = uld.a;
                Size size = (Size) this.a;
                ((ulh) obj).d(new btz(size.getWidth(), size.getHeight(), 1.0f));
                break;
            case 10:
                Throwable th = ((quk) this.a).c;
                agrf agrfVar8 = uld.a;
                new Exception("Audio playback error", th);
                ((ulh) obj).e();
                break;
            case 11:
                agrf agrfVar9 = uld.a;
                ((ulh) obj).c((Exception) this.a);
                break;
            case 12:
                agrf agrfVar10 = uld.a;
                ((ulh) obj).b((Duration) this.a);
                break;
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                unj unjVarB = ((uoa) this.a).b();
                if (unjVarB != null && (unhVar = unjVarB.peer().k) != null) {
                    if (!zBooleanValue && unhVar.z) {
                        unhVar.e.c();
                    } else {
                        unhVar.e.b();
                    }
                    break;
                }
                break;
            case 14:
                uom uomVar = (uom) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                uoj uojVar = uomVar.d;
                upd updVar = new upd(atomicBoolean, ahng.n(uojVar));
                upg upgVar = (upg) this.a;
                upgVar.j = updVar;
                uoi uoiVar = uomVar.a;
                upd updVar2 = upgVar.j;
                updVar2.getClass();
                upgVar.o(uoiVar, uojVar, updVar2, Optional.of(uomVar.b), false);
                break;
            case 15:
                new ugo((roq) this.a, (xgz) obj).e();
                break;
            case 16:
                roq roqVar = ((upo) this.a).o;
                roqVar.getClass();
                new ugo(roqVar, (xgz) obj).f();
                break;
            case 17:
                ugo ugoVar = (ugo) obj;
                ugoVar.i(((upo) this.a).d);
                ugoVar.c();
                break;
            case 18:
                roq roqVar2 = ((upo) this.a).o;
                roqVar2.getClass();
                new ugo(roqVar2, (xgz) obj).e();
                break;
            case 19:
                ((urc) obj).l((auan) this.a);
                break;
            default:
                ((urc) obj).k((auaj) this.a);
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
