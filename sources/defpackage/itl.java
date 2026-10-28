package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.List;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itl implements BiFunction {
    private final /* synthetic */ int $cid;

    public /* synthetic */ itl(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
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
            default:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                Optional optional = (Optional) obj2;
                agrf agrfVar = itq.a;
                aihf aihfVarCreateBuilder = anwt.a.createBuilder();
                aihfVarCreateBuilder.bO((List) obj);
                imc imcVar = new imc(aihfVarCreateBuilder, 7);
                if (true == optional.isPresent()) {
                    ((aihf) imcVar.a).bQ((apji) optional.get());
                }
                aihf aihfVarCreateBuilder2 = apox.a.createBuilder();
                anwt anwtVar = (anwt) aihfVarCreateBuilder.build();
                aihfVarCreateBuilder2.copyOnWrite();
                apox apoxVar = (apox) aihfVarCreateBuilder2.instance;
                anwtVar.getClass();
                apoxVar.aq = anwtVar;
                apoxVar.c |= 536870912;
                return (apox) aihfVarCreateBuilder2.build();
            case 1:
                return Long.valueOf(Math.max(((Long) obj).longValue(), ((Long) obj2).longValue()));
            case 2:
                Integer num = (Integer) obj2;
                return Integer.valueOf(num != null ? 1 + num.intValue() : 1);
            case 3:
                return new rjg((qup) obj, (qup) obj2, (boolean[]) null);
            case 4:
                return new rnj((qxi) obj, (qxi) obj2);
            case 5:
                return new rjg((qup) obj, (qup) obj2, (boolean[]) null);
            case 6:
                return Boolean.valueOf(Objects.equals(obj, obj2));
            case 7:
                return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
            case 8:
                return new RemoteViews((String) obj, ((Integer) obj2).intValue());
            case 9:
                return aabq.g((Context) obj, (Intent) obj2);
            case 10:
                UUID uuid = (UUID) obj;
                aihf aihfVarCreateBuilder3 = anco.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                anco ancoVar = (anco) aihfVarCreateBuilder3.instance;
                ancoVar.c = ((anck) obj2).h;
                ancoVar.b |= 1;
                aigj aigjVarV = aigj.v(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
                aihfVarCreateBuilder3.copyOnWrite();
                anco ancoVar2 = (anco) aihfVarCreateBuilder3.instance;
                aigjVarV.getClass();
                ancoVar2.b |= 2;
                ancoVar2.d = aigjVarV;
                return (anco) aihfVarCreateBuilder3.build();
            default:
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }
    }
}
