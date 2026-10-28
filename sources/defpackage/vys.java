package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vys {
    public static final ajdh a;
    private static final agke b;

    static {
        aihf aihfVarCreateBuilder = ajdh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajdh ajdhVar = (ajdh) aihfVarCreateBuilder.instance;
        ajdhVar.b |= 1;
        ajdhVar.c = true;
        aihfVarCreateBuilder.copyOnWrite();
        ajdh ajdhVar2 = (ajdh) aihfVarCreateBuilder.instance;
        ajdhVar2.b |= 2;
        ajdhVar2.d = true;
        a = (ajdh) aihfVarCreateBuilder.build();
        agke agkeVarA = agke.A(1000L, 1000L, 1000L, 1000L, 15000L, 15000L, 15000L, 15000L, 60000L, 60000L, 60000L, 60000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 300000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L, 900000L);
        b = agkeVarA;
        aihf aihfVarCreateBuilder2 = alzg.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar = (alzg) aihfVarCreateBuilder2.instance;
        alzgVar.b |= 64;
        alzgVar.f = true;
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar2 = (alzg) aihfVarCreateBuilder2.instance;
        alzgVar2.b |= 2;
        alzgVar2.c = "https://upload.youtube.com/upload/youtubei";
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar3 = (alzg) aihfVarCreateBuilder2.instance;
        alzgVar3.b |= 4;
        alzgVar3.d = "https://upload.youtube.com/upload/creationmediaentity";
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar4 = (alzg) aihfVarCreateBuilder2.instance;
        aihy aihyVar = alzgVar4.e;
        if (!aihyVar.c()) {
            alzgVar4.e = aihn.mutableCopy(aihyVar);
        }
        aifs.addAll(agkeVarA, alzgVar4.e);
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar5 = (alzg) aihfVarCreateBuilder2.instance;
        aihy aihyVar2 = alzgVar5.g;
        if (!aihyVar2.c()) {
            alzgVar5.g = aihn.mutableCopy(aihyVar2);
        }
        aifs.addAll(agkeVarA, alzgVar5.g);
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar6 = (alzg) aihfVarCreateBuilder2.instance;
        aihy aihyVar3 = alzgVar6.h;
        if (!aihyVar3.c()) {
            alzgVar6.h = aihn.mutableCopy(aihyVar3);
        }
        aifs.addAll(agkeVarA, alzgVar6.h);
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar7 = (alzg) aihfVarCreateBuilder2.instance;
        aihy aihyVar4 = alzgVar7.i;
        if (!aihyVar4.c()) {
            alzgVar7.i = aihn.mutableCopy(aihyVar4);
        }
        aifs.addAll(agkeVarA, alzgVar7.i);
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar8 = (alzg) aihfVarCreateBuilder2.instance;
        aihy aihyVar5 = alzgVar8.j;
        if (!aihyVar5.c()) {
            alzgVar8.j = aihn.mutableCopy(aihyVar5);
        }
        aifs.addAll(agkeVarA, alzgVar8.j);
        aihfVarCreateBuilder2.copyOnWrite();
        alzg alzgVar9 = (alzg) aihfVarCreateBuilder2.instance;
        aihy aihyVar6 = alzgVar9.k;
        if (!aihyVar6.c()) {
            alzgVar9.k = aihn.mutableCopy(aihyVar6);
        }
        aifs.addAll(agkeVarA, alzgVar9.k);
    }

    public static boolean a(vxu vxuVar) {
        ajdh ajdhVar;
        anhb anhbVar = vxuVar.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        if ((anhbVar.c & 4) != 0) {
            ajdhVar = anhbVar.q;
            if (ajdhVar == null) {
                ajdhVar = ajdh.a;
            }
        } else {
            ajdhVar = a;
        }
        return ajdhVar.c;
    }
}
