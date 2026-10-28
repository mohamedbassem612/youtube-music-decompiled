package defpackage;

import android.graphics.Paint;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ush implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ush(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
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
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 1;
        switch (this.$cid) {
            case 0:
                return Long.valueOf(((augi) obj).c);
            case 1:
                return Long.valueOf(((aufw) obj).c);
            case 2:
                agrf agrfVar = usj.a;
                aigu aiguVar = ((augy) obj).i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                return ahng.aw(aiguVar);
            case 3:
                augy augyVar = (augy) obj;
                agrf agrfVar2 = usj.a;
                aigu aiguVar2 = augyVar.i;
                if (aiguVar2 == null) {
                    aiguVar2 = aigu.a;
                }
                Duration durationAw = ahng.aw(aiguVar2);
                aigu aiguVar3 = augyVar.j;
                if (aiguVar3 == null) {
                    aiguVar3 = aigu.a;
                }
                return durationAw.plus(ahng.aw(aiguVar3));
            case 4:
                return Long.valueOf(((aufw) obj).d);
            case 5:
                return Long.valueOf(((aufa) obj).e);
            case 6:
                return Long.valueOf(((augy) obj).e);
            case 7:
                return (augy) obj;
            case 8:
                augy augyVar2 = (augy) obj;
                return new uut(augyVar2.e, augyVar2.g + 1);
            case 9:
                return ((utv) obj).b();
            case 10:
                return ((ury) obj).a;
            case 11:
                return utc.a((utc) obj, null, Boolean.FALSE, 3);
            case 12:
                augy augyVar3 = (augy) obj;
                augyVar3.getClass();
                aiie aiieVar = augyVar3.t;
                aiieVar.getClass();
                aihl aihlVar = augm.b;
                aihlVar.getClass();
                augm augmVar = (augm) yno.gh(aiieVar, aihlVar);
                int i2 = (augmVar == null || (augmVar.c & 8) == 0) ? 0 : augmVar.e;
                aigu aiguVar4 = augyVar3.j;
                if (aiguVar4 == null) {
                    aiguVar4 = aigu.a;
                }
                aiguVar4.getClass();
                Duration durationV = aext.v(aiguVar4);
                aigu aiguVar5 = augyVar3.i;
                if (aiguVar5 == null) {
                    aiguVar5 = aigu.a;
                }
                aiguVar5.getClass();
                jrr jrrVarS = usj.s(durationV, aext.v(aiguVar5), augyVar3.e);
                augx augxVar = augx.a;
                jrrVarS.copyOnWrite();
                augy augyVar4 = (augy) jrrVarS.instance;
                augxVar.getClass();
                augyVar4.d = augxVar;
                augyVar4.c = 111;
                augy augyVar5 = (augy) jrrVarS.build();
                augyVar5.getClass();
                aihlVar.getClass();
                return yno.ga(yno.gf(augyVar5, aihlVar, new uvr(i2, i)), augf.INVALID_SOURCE, augf.NOT_FOR_UPLOAD);
            case 13:
                return xsc.J((apji) obj);
            case 14:
                return new ArrayList();
            case 15:
                aihf aihfVarCreateBuilder = akpx.a.createBuilder();
                String str = ((auhy) obj).b;
                aihfVarCreateBuilder.copyOnWrite();
                akpx akpxVar = (akpx) aihfVarCreateBuilder.instance;
                str.getClass();
                akpxVar.b |= 1;
                akpxVar.c = str;
                return (akpx) aihfVarCreateBuilder.build();
            case 16:
                auic auicVar = (auic) obj;
                aihf aihfVarCreateBuilder2 = akqe.a.createBuilder();
                String str2 = auicVar.b;
                aihfVarCreateBuilder2.copyOnWrite();
                akqe akqeVar = (akqe) aihfVarCreateBuilder2.instance;
                str2.getClass();
                akqeVar.b |= 1;
                akqeVar.c = str2;
                boolean z = auicVar.c;
                aihfVarCreateBuilder2.copyOnWrite();
                akqe akqeVar2 = (akqe) aihfVarCreateBuilder2.instance;
                akqeVar2.b |= 2;
                akqeVar2.d = z;
                return (akqe) aihfVarCreateBuilder2.build();
            case 17:
                String str3 = vjx.a;
                apji apjiVar = ((apxf) obj).d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                return (ajnf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            case 18:
                auir auirVar = (auir) obj;
                auirVar.getClass();
                String strFc = yno.fc(auirVar);
                if (strFc == null) {
                    return Optional.empty();
                }
                Paint.Join join = vkq.a;
                vkp vkpVar = new vkp(auirVar, 0, 1);
                vkpVar.c(0.25f);
                vkpVar.b("name=".concat(strFc));
                return Optional.of(vkpVar.a());
            case 19:
                return ((Optional) obj).stream();
            default:
                auir auirVar2 = (auir) obj;
                auirVar2.getClass();
                String strFc2 = yno.fc(auirVar2);
                if (strFc2 == null) {
                    return Optional.empty();
                }
                Paint.Join join2 = vkq.a;
                vkp vkpVar2 = new vkp(auirVar2, 0, 1);
                vkpVar2.c(0.25f);
                vkpVar2.b("name=".concat(strFc2));
                vkpVar2.e(0.07f);
                vkpVar2.d(Paint.Join.ROUND);
                vkpVar2.b = Optional.empty();
                return Optional.of(vkpVar2.a());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
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
        return Function$CC.$default$compose(this, function);
    }
}
