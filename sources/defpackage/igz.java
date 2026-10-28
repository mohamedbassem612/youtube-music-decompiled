package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class igz implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ igz(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        switch (this.$cid) {
            case 0:
                wgi wgiVar = ((aayw) obj).d;
                wgiVar.getClass();
                return wgiVar.a;
            case 1:
                return ((amae) obj).v;
            case 2:
                wgi wgiVar2 = ((aayw) obj).d;
                wgiVar2.getClass();
                return wgiVar2;
            case 3:
                return Boolean.valueOf(!jnw.h((hww) obj));
            case 4:
                return Boolean.valueOf(((aazj) obj).a == abob.f);
            case 5:
                return Optional.ofNullable(((aayw) obj).c);
            case 6:
                return (wjf) ((Optional) obj).get();
            case 7:
                return ((wjf) obj).u();
            case 8:
                return Boolean.valueOf(((aazj) obj).a.h());
            case 9:
                abob abobVar = ((aazj) obj).a;
                agsn agsnVar = joz.a;
                return Boolean.valueOf(abobVar.h());
            case 10:
                return Boolean.valueOf(((aazj) obj).a.h());
            case 11:
                return afwl.i((Runnable) obj);
            case 12:
                int i = mrl.p;
                return ((mrk) obj).a;
            case 13:
                return ((aazq) obj).b.am();
            case 14:
                return ((aazq) obj).b.ac();
            case 15:
                return ((aazq) obj).b.H();
            case 16:
                return ((aazq) obj).b.ah();
            case 17:
                return ((aazq) obj).b.V();
            case 18:
                return ((aazq) obj).b.J();
            case 19:
                return ((aazq) obj).b.G();
            default:
                return ((aazq) obj).b.J();
        }
    }
}
