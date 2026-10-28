package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wke implements wkd {
    private final mbc a;
    private final Map b = new ConcurrentHashMap();

    public wke(mbc mbcVar) {
        this.a = mbcVar;
    }

    @Override // defpackage.wkd
    public final aihf a(aihf aihfVar) {
        if (aihfVar == null) {
            return null;
        }
        aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
        if (alooVar == null) {
            alooVar = aloo.a;
        }
        alyr alyrVar = alooVar.f;
        if (alyrVar == null) {
            alyrVar = alyr.a;
        }
        aihf builder = alyrVar.toBuilder();
        builder.copyOnWrite();
        ((alyr) builder.instance).b = alyr.emptyProtobufList();
        builder.bt(zik.ci(this.a, this.b));
        aloo alooVar2 = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
        if (alooVar2 == null) {
            alooVar2 = aloo.a;
        }
        aihf builder2 = alooVar2.toBuilder();
        builder2.copyOnWrite();
        aloo alooVar3 = (aloo) builder2.instance;
        alyr alyrVar2 = (alyr) builder.build();
        alyrVar2.getClass();
        alooVar3.f = alyrVar2;
        alooVar3.b |= 1048576;
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        aloo alooVar4 = (aloo) builder2.build();
        alooVar4.getClass();
        innertubeContext$InnerTubeContext.f = alooVar4;
        innertubeContext$InnerTubeContext.b |= 16;
        return aihfVar;
    }

    @Override // defpackage.wkd
    public final void b(aihf aihfVar, alop alopVar) {
        List list;
        if (alopVar != null) {
            mbc mbcVar = this.a;
            if (aihfVar != null) {
                aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
                if (alooVar == null) {
                    alooVar = aloo.a;
                }
                alyr alyrVar = alooVar.f;
                if (alyrVar == null) {
                    alyrVar = alyr.a;
                }
                list = alyrVar.b;
            } else {
                list = agpi.a;
            }
            alyr alyrVar2 = alopVar.k;
            if (alyrVar2 == null) {
                alyrVar2 = alyr.a;
            }
            zik.cj(mbcVar, list, alyrVar2.b, this.b);
        }
    }
}
