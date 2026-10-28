package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hbz implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hbz(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        switch (this.$cid) {
            case 0:
                return (Boolean) obj;
            case 1:
                return (vob) ((agev) obj).c();
            case 2:
                return Boolean.valueOf(((aaxk) obj).a);
            case 3:
                agrf agrfVar = how.a;
                return ((hov) obj).b;
            case 4:
                return wfs.h(((weo) obj).a);
            case 5:
                return a.J((weo) obj);
            case 6:
                agrf agrfVar2 = hqg.a;
                return ((ayq) obj).c;
            case 7:
                agrf agrfVar3 = hqg.a;
                return ((avnc) obj).Y(new hxe(1)).aA(500L, TimeUnit.MILLISECONDS).N();
            case 8:
                agrf agrfVar4 = hqg.a;
                return avlh.G((ayq) obj).N();
            case 9:
                return ((aahb) obj).d();
            case 10:
                return fdl.d((akxs) obj);
            case 11:
                return ((hzc) obj).a();
            case 12:
                return (abke) ((Optional) obj).get();
            case 13:
                return ((hze) obj).b;
            case 14:
                int i = hzi.c;
                return ((aazq) obj).b.d();
            case 15:
                wgi wgiVar = ((aayw) obj).d;
                return wgiVar != null ? avlh.G(wgiVar.f()) : avlh.w();
            case 16:
                wgi wgiVar2 = ((aayw) obj).d;
                wgiVar2.getClass();
                String str = wgiVar2.b;
                str.getClass();
                return str;
            case 17:
                return Boolean.valueOf(((aaxk) obj).a);
            case 18:
                return Boolean.valueOf(((idd) obj).g());
            case 19:
                return Boolean.valueOf(((idd) obj).d());
            default:
                return Boolean.valueOf(((aazn) obj).c());
        }
    }
}
