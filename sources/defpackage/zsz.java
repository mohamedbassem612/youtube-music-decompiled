package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zsz {
    public int i = -1;
    public final zui j;
    public final int k;

    protected zsz(int i) {
        this.k = i;
        this.j = new zui(i);
    }

    @Deprecated
    protected zsa a() {
        throw new agfz();
    }

    @Deprecated
    public String c() {
        throw new agfz();
    }

    @Deprecated
    public void d(String str, zsr zsrVar, List list) {
        throw new agfz();
    }

    protected boolean i() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected zsx j(zty ztyVar) {
        akku akkuVarD = ztyVar.d();
        agke agkeVarC = ztyVar.c();
        ArrayList arrayList = new ArrayList(((agpi) agkeVarC).d);
        agqs agqsVarListIterator = agkeVarC.listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            zuq zuqVar = (zuq) agqsVarListIterator.next();
            aihf aihfVarCreateBuilder = jrc.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar = (jrc) aihfVarCreateBuilder.instance;
            jrcVar.l = akkuVarD.f;
            jrcVar.b |= SemanticState.LiveRegion;
            aigj aigjVar = zuqVar.a;
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar2 = (jrc) aihfVarCreateBuilder.instance;
            jrcVar2.b |= 4;
            jrcVar2.e = aigjVar;
            arrayList.add(aihfVarCreateBuilder);
        }
        d(ztyVar.e, new zso(new zvh(ahno.Y(ztyVar.f), ztyVar.g), akkuVarD), arrayList);
        return new zsx(zsw.d, null);
    }

    public int jc() {
        return 3;
    }

    protected aigj jd(zsv zsvVar) {
        return null;
    }

    public int l() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected void je(szi sziVar) {
    }

    @Deprecated
    public void f(String str, List list) {
    }

    protected void k(ztz ztzVar, long j) {
    }
}
