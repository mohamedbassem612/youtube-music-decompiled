package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acnq implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ acnq(acoi acoiVar, zwa zwaVar, int i) {
        this.$cid = i;
        this.a = acoiVar;
        this.b = zwaVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            acoi acoiVar = (acoi) this.a;
            if (this.b.equals(acoiVar.bk)) {
                acoiVar.bk = null;
                return;
            }
            return;
        }
        if (i == 1) {
            ((acln) obj).aj();
            return;
        }
        int i2 = 4;
        if (i == 2) {
            Object obj2 = this.b;
            Object obj3 = this.a;
            affd affdVar = (affd) obj;
            acoi acoiVar2 = (acoi) obj3;
            if (obj2.equals(acoiVar2.bk)) {
                Context context = ((cc) obj3).getContext();
                if (context == null || affdVar == null) {
                    acoiVar2.bk = null;
                    return;
                }
                rlc rlcVarT = ((acoe) aguu.aw(context, acoe.class, affdVar)).t();
                acoiVar2.bl = rlcVarT.a();
                acoiVar2.aM.c(rlcVarT.d.O(acoiVar2.am).af(new abqo(obj3, rlcVarT, i2)));
                return;
            }
            return;
        }
        if (i == 3) {
            acra acraVar = (acra) obj;
            if (acraVar != null) {
                this.a.add(((acqz) this.b).g(acraVar));
                return;
            }
            return;
        }
        if (i == 4) {
            affd affdVar2 = (affd) obj;
            if (affdVar2 != null) {
                ((acwq) this.b).c(affdVar2, (acwy) ((aihf) this.a).build(), null, null);
                return;
            }
            return;
        }
        affd affdVar3 = (affd) obj;
        if (affdVar3 != null) {
            Object obj4 = this.a;
            aihf aihfVarCreateBuilder = acwy.a.createBuilder();
            acww acwwVar = (acww) obj4;
            String str = acwwVar.a;
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                acwy acwyVar = (acwy) aihfVarCreateBuilder.instance;
                acwyVar.b |= 1;
                acwyVar.c = str;
            }
            alay alayVar = acwwVar.b;
            if (alayVar != null) {
                aihfVarCreateBuilder.ah(alayVar);
            }
            ajnf ajnfVar = acwwVar.c;
            if (ajnfVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                acwy acwyVar2 = (acwy) aihfVarCreateBuilder.instance;
                acwyVar2.g = ajnfVar;
                acwyVar2.b |= 8;
            }
            ajnf ajnfVar2 = acwwVar.d;
            if (ajnfVar2 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                acwy acwyVar3 = (acwy) aihfVarCreateBuilder.instance;
                acwyVar3.f = ajnfVar2;
                acwyVar3.b |= 4;
            }
            ajwo ajwoVar = acwwVar.f;
            if (ajwoVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                acwy acwyVar4 = (acwy) aihfVarCreateBuilder.instance;
                acwyVar4.h = ajwoVar;
                acwyVar4.b |= 16;
            }
            Object obj5 = this.b;
            boolean z = acwwVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar5 = (acwy) aihfVarCreateBuilder.instance;
            acwyVar5.b |= 2;
            acwyVar5.e = z;
            ((acwq) obj5).c(affdVar3, (acwy) aihfVarCreateBuilder.build(), null, acwwVar.g);
        }
    }

    public /* synthetic */ acnq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
