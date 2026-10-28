package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vxq implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vxq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                aihf builder = ((aino) obj).toBuilder();
                builder.copyOnWrite();
                aino ainoVar = (aino) builder.instance;
                ainoVar.b &= -2;
                ainoVar.c = 0;
                return (aino) builder.build();
            case 1:
                aino ainoVar2 = (aino) obj;
                aihf builder2 = ainoVar2.toBuilder();
                int i = ainoVar2.c + 1;
                builder2.copyOnWrite();
                aino ainoVar3 = (aino) builder2.instance;
                ainoVar3.b |= 1;
                ainoVar3.c = i;
                return (aino) builder2.build();
            case 2:
                return ((wff) obj).b;
            case 3:
                return ((wff) obj).c;
            case 4:
                int i2 = wed.a;
                return ((akvh) obj).c;
            case 5:
                InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) obj;
                aihf aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.instance;
                innertubeContext$ClientInfo.getClass();
                innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo;
                innertubeContext$InnerTubeContext.b |= 1;
                return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.build();
            case 6:
                return null;
            case 7:
                dov.X((Throwable) obj);
                return 0;
            case 8:
                return new wno((Throwable) obj);
            case 9:
                return agev.h((ajgu) obj);
            case 10:
                return new Exception((Throwable) obj);
            case 11:
                return new wru((aoll) obj);
            case 12:
                return agev.h((ajgu) obj);
            case 13:
                return new wtt((alya) obj);
            case 14:
                alyb alybVar = (alyb) obj;
                ArrayList arrayList = new ArrayList();
                int i3 = alybVar.b;
                if (i3 == 88478200) {
                    ajul ajulVar = (ajul) alybVar.c;
                    if (ajulVar.f) {
                        arrayList.add(yno.eg(ajulVar));
                    }
                    if (!ajulVar.e) {
                        return arrayList;
                    }
                    arrayList.add(new wtq());
                    return arrayList;
                }
                if (i3 == 66930374) {
                    arrayList.add((apqt) alybVar.c);
                    return arrayList;
                }
                if (i3 != 61520386) {
                    return arrayList;
                }
                arrayList.add((apqv) alybVar.c);
                return arrayList;
            case 15:
                return Optional.ofNullable((ajgu) obj);
            case 16:
                return Optional.ofNullable((ajgu) obj);
            case 17:
                return Boolean.valueOf(((atox) obj).i);
            case 18:
                return Boolean.valueOf(((atox) obj).h);
            case 19:
                return Boolean.valueOf(((atox) obj).f);
            default:
                return ((abvn) obj).H();
        }
    }
}
