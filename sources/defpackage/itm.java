package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itm implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ itm(int i) {
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
        aqge aqgeVarA;
        aqge aqgeVarA2;
        switch (this.$cid) {
            case 0:
                agrf agrfVar = itq.a;
                anzi anziVar = ((anwv) obj).d;
                if (anziVar == null) {
                    anziVar = anzi.a;
                }
                alay alayVar = anziVar.g;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                return alayVar.d;
            case 1:
                anzi anziVar2 = (anzi) obj;
                agrf agrfVar2 = itq.a;
                aihf aihfVarCreateBuilder = anwv.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                anwv anwvVar = (anwv) aihfVarCreateBuilder.instance;
                anziVar2.getClass();
                anwvVar.d = anziVar2;
                anwvVar.b |= 262144;
                return (anwv) aihfVarCreateBuilder.build();
            case 2:
                anzn anznVar = (anzn) obj;
                agrf agrfVar3 = itq.a;
                aihf aihfVarCreateBuilder2 = alfu.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                alfu alfuVar = (alfu) aihfVarCreateBuilder2.instance;
                anznVar.getClass();
                alfuVar.c = anznVar;
                alfuVar.b |= SemanticState.Hidden;
                return (alfu) aihfVarCreateBuilder2.build();
            case 3:
                agrf agrfVar4 = itq.a;
                anzn anznVar2 = ((alfu) obj).c;
                if (anznVar2 == null) {
                    anznVar2 = anzn.a;
                }
                alay alayVar2 = anznVar2.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
                return alayVar2.d;
            case 4:
                return ((hci) obj).a;
            case 5:
                return Long.valueOf(iuf.b(Uri.parse(((anyx) obj).getAndroidMediaStoreContentUri())));
            case 6:
                return Long.valueOf(iuf.b((Uri) obj));
            case 7:
                return Long.valueOf(((iuz) obj).c);
            case 8:
                return Long.valueOf(iuf.b(Uri.parse(((anyx) obj).getAndroidMediaStoreContentUri())));
            case 9:
                return String.valueOf(((iuz) obj).a);
            case 10:
                return ixt.p(String.valueOf(((iuz) obj).c));
            case 11:
                return Long.valueOf(iuo.j(Uri.parse(((anyx) obj).getAndroidMediaStoreContentUri())));
            case 12:
                return Long.valueOf(iuo.j((Uri) obj));
            case 13:
                return ((hci) obj).a;
            case 14:
                return Long.valueOf(iuo.j(Uri.parse(((anyx) obj).getAndroidMediaStoreContentUri())));
            case 15:
                return String.valueOf(((iuz) obj).a);
            case 16:
                return Long.valueOf(((iuz) obj).c);
            case 17:
                return ixt.p(String.valueOf(((iuz) obj).c));
            case 18:
                return Long.valueOf(((iuz) obj).b);
            case 19:
                aqga aqgaVar = (aqga) obj;
                return (aqgaVar.b != 1 || (aqgeVarA = aqge.a(((Integer) aqgaVar.c).intValue())) == null) ? aqge.SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED : aqgeVarA;
            default:
                aqgc aqgcVar = (aqgc) obj;
                return (aqgcVar.b != 3 || (aqgeVarA2 = aqge.a(((Integer) aqgcVar.c).intValue())) == null) ? aqge.SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED : aqgeVarA2;
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
