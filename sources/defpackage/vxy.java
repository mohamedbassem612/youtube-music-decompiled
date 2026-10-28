package defpackage;

import j$.util.DesugarCollections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vxy implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ vxy(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        if (this.$cid == 0) {
            akww akwwVar = ((alik) obj).v;
            if (akwwVar == null) {
                akwwVar = akww.a;
            }
            long j = this.a;
            akwwVar.getClass();
            akwx akwxVar = (akwx) DesugarCollections.unmodifiableMap(akwwVar.c).get(Long.valueOf(j));
            boolean zBooleanValue = false;
            if (akwxVar != null && akwxVar.b == 1) {
                zBooleanValue = ((Boolean) akwxVar.c).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
        agrf agrfVar = hqg.a;
        avmb avmbVarA = awlg.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        avmbVarA.getClass();
        avxm avxmVar = new avxm((avnc) obj, timeUnit, avmbVarA);
        avnn avnnVar = atqp.j;
        avlh avlhVarP = avxmVar.aA(this.a, TimeUnit.MILLISECONDS).P();
        avlh avlhVarW = avlh.w();
        avlhVarW.getClass();
        avvq avvqVar = new avvq(avlhVarP, new avog(avlhVarW));
        avnn avnnVar2 = atqp.j;
        return avvqVar;
    }
}
